/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.cassandra.thrift;

import java.nio.ByteBuffer;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.cassandra.config.*;
import org.apache.cassandra.db.*;
import org.apache.cassandra.db.filter.IDiskAtomFilter;
import org.apache.cassandra.db.filter.NamesQueryFilter;
import org.apache.cassandra.db.filter.SliceQueryFilter;
import org.apache.cassandra.db.index.SecondaryIndexManager;
import org.apache.cassandra.db.marshal.AbstractType;
import org.apache.cassandra.db.marshal.MarshalException;
import org.apache.cassandra.dht.IPartitioner;
import org.apache.cassandra.dht.RandomPartitioner;
import org.apache.cassandra.dht.Token;
import org.apache.cassandra.service.StorageService;
import org.apache.cassandra.utils.ByteBufferUtil;
import org.apache.cassandra.utils.FBUtilities;

/**
 * This has a lot of building blocks for CassandraServer to call to make sure it has valid input
 * -- ensuring column names conform to the declared comparator, for instance.
 *
 * The methods here mostly try to do just one part of the validation so they can be combined
 * for different needs -- supercolumns vs regular, range slices vs named, batch vs single-column.
 * (ValidateColumnPath is the main exception in that it includes table and CF validation.)
 */
public class ThriftValidation
{
    private static final Logger logger = LoggerFactory.getLogger(ThriftValidation.class);

    public static void validateKey(CFMetaData metadata, ByteBuffer key) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (key == null || key.remaining() == 0)
        {
            throw new org.apache.cassandra.exceptions.InvalidRequestException("Key may not be empty");
        }

        // check that key can be handled by FBUtilities.writeShortByteArray
        if (key.remaining() > FBUtilities.MAX_UNSIGNED_SHORT)
        {
            throw new org.apache.cassandra.exceptions.InvalidRequestException("Key length of " + key.remaining() +
                                                                              " is longer than maximum of " +
                                                                              FBUtilities.MAX_UNSIGNED_SHORT);
        }

        try
        {
            metadata.getKeyValidator().validate(key);
        }
        catch (MarshalException e)
        {
            throw new org.apache.cassandra.exceptions.InvalidRequestException(e.getMessage());
        }
    }

    public static void validateTable(String tablename) throws KeyspaceNotDefinedException
    {
        if (!Schema.instance.getTables().contains(tablename))
        {
            throw new KeyspaceNotDefinedException("Keyspace " + tablename + " does not exist");
        }
    }

    public static CFMetaData validateColumnFamily(String tablename, String cfName, boolean isCommutativeOp) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        CFMetaData metadata = validateColumnFamily(tablename, cfName);

        if (isCommutativeOp)
        {
            if (!metadata.getDefaultValidator().isCommutative())
                throw new org.apache.cassandra.exceptions.InvalidRequestException("invalid operation for non commutative columnfamily " + cfName);
        }
        else
        {
            if (metadata.getDefaultValidator().isCommutative())
                throw new org.apache.cassandra.exceptions.InvalidRequestException("invalid operation for commutative columnfamily " + cfName);
        }
        return metadata;
    }

    // To be used when the operation should be authorized whether this is a counter CF or not
    public static CFMetaData validateColumnFamily(String tablename, String cfName) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        validateTable(tablename);
        if (cfName.isEmpty())
            throw new org.apache.cassandra.exceptions.InvalidRequestException("non-empty columnfamily is required");

        CFMetaData metadata = Schema.instance.getCFMetaData(tablename, cfName);
        if (metadata == null)
            throw new org.apache.cassandra.exceptions.InvalidRequestException("unconfigured columnfamily " + cfName);

        return metadata;
    }

    /**
     * validates all parts of the path to the column, including the column name
     */
    public static void validateColumnPath(CFMetaData metadata, ColumnPath column_path) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (metadata.cfType == ColumnFamilyType.Standard)
        {
            if (column_path.super_column != null)
            {
                throw new org.apache.cassandra.exceptions.InvalidRequestException("supercolumn parameter is invalid for standard CF " + metadata.cfName);
            }
            if (column_path.column == null)
            {
                throw new org.apache.cassandra.exceptions.InvalidRequestException("column parameter is not optional for standard CF " + metadata.cfName);
            }
        }
        else
        {
            if (column_path.super_column == null)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("supercolumn parameter is not optional for super CF " + metadata.cfName);
        }
        if (column_path.column != null)
        {
            validateColumnNames(metadata, column_path.super_column, Arrays.asList(column_path.column));
        }
        if (column_path.super_column != null)
        {
            validateColumnNames(metadata, (ByteBuffer)null, Arrays.asList(column_path.super_column));
        }
    }

    public static void validateColumnParent(CFMetaData metadata, ColumnParent column_parent) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (metadata.cfType == ColumnFamilyType.Standard)
        {
            if (column_parent.super_column != null)
            {
                throw new org.apache.cassandra.exceptions.InvalidRequestException("columnfamily alone is required for standard CF " + metadata.cfName);
            }
        }

        if (column_parent.super_column != null)
        {
            validateColumnNames(metadata, (ByteBuffer)null, Arrays.asList(column_parent.super_column));
        }
    }

    // column_path_or_parent is a ColumnPath for remove, where the "column" is optional even for a standard CF
    static void validateColumnPathOrParent(CFMetaData metadata, ColumnPath column_path_or_parent) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (metadata.cfType == ColumnFamilyType.Standard)
        {
            if (column_path_or_parent.super_column != null)
            {
                throw new org.apache.cassandra.exceptions.InvalidRequestException("supercolumn may not be specified for standard CF " + metadata.cfName);
            }
        }
        if (metadata.cfType == ColumnFamilyType.Super)
        {
            if (column_path_or_parent.super_column == null && column_path_or_parent.column != null)
            {
                throw new org.apache.cassandra.exceptions.InvalidRequestException("A column cannot be specified without specifying a super column for removal on super CF "
                                                                          + metadata.cfName);
            }
        }
        if (column_path_or_parent.column != null)
        {
            validateColumnNames(metadata, column_path_or_parent.super_column, Arrays.asList(column_path_or_parent.column));
        }
        if (column_path_or_parent.super_column != null)
        {
            validateColumnNames(metadata, (ByteBuffer)null, Arrays.asList(column_path_or_parent.super_column));
        }
    }

    /**
     * Validates the column names but not the parent path or data
     */
    private static void validateColumnNames(CFMetaData metadata, ByteBuffer superColumnName, Iterable<ByteBuffer> column_names)
    throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (superColumnName != null)
        {
            if (superColumnName.remaining() > IColumn.MAX_NAME_LENGTH)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("supercolumn name length must not be greater than " + IColumn.MAX_NAME_LENGTH);
            if (superColumnName.remaining() == 0)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("supercolumn name must not be empty");
            if (metadata.cfType == ColumnFamilyType.Standard)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("supercolumn specified to ColumnFamily " + metadata.cfName + " containing normal columns");
        }
        AbstractType<?> comparator = metadata.getComparatorFor(superColumnName);
        for (ByteBuffer name : column_names)
        {
            if (name.remaining() > IColumn.MAX_NAME_LENGTH)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("column name length must not be greater than " + IColumn.MAX_NAME_LENGTH);
            if (name.remaining() == 0)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("column name must not be empty");
            try
            {
                comparator.validate(name);
            }
            catch (MarshalException e)
            {
                throw new org.apache.cassandra.exceptions.InvalidRequestException(e.getMessage());
            }
        }
    }

    public static void validateColumnNames(CFMetaData metadata, ColumnParent column_parent, Iterable<ByteBuffer> column_names) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        validateColumnNames(metadata, column_parent.super_column, column_names);
    }

    public static void validateRange(CFMetaData metadata, ColumnParent column_parent, SliceRange range) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        AbstractType<?> comparator = metadata.getComparatorFor(column_parent.super_column);
        try
        {
            comparator.validate(range.start);
            comparator.validate(range.finish);
        }
        catch (MarshalException e)
        {
            throw new org.apache.cassandra.exceptions.InvalidRequestException(e.getMessage());
        }

        if (range.count < 0)
            throw new org.apache.cassandra.exceptions.InvalidRequestException("get_slice requires non-negative count");

        Comparator<ByteBuffer> orderedComparator = range.isReversed() ? comparator.reverseComparator : comparator;
        if (range.start.remaining() > 0
            && range.finish.remaining() > 0
            && orderedComparator.compare(range.start, range.finish) > 0)
        {
            throw new org.apache.cassandra.exceptions.InvalidRequestException("range finish must come after start in the order of traversal");
        }
    }

    public static void validateColumnOrSuperColumn(CFMetaData metadata, ColumnOrSuperColumn cosc)
            throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        boolean isCommutative = metadata.getDefaultValidator().isCommutative();

        int nulls = 0;
        if (cosc.column == null) nulls++;
        if (cosc.super_column == null) nulls++;
        if (cosc.counter_column == null) nulls++;
        if (cosc.counter_super_column == null) nulls++;

        if (nulls != 3)
            throw new org.apache.cassandra.exceptions.InvalidRequestException("ColumnOrSuperColumn must have one (and only one) of column, super_column, counter and counter_super_column");

        if (cosc.column != null)
        {
            if (isCommutative)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("invalid operation for commutative columnfamily " + metadata.cfName);

            validateTtl(cosc.column);
            validateColumnPath(metadata, new ColumnPath(metadata.cfName).setSuper_column((ByteBuffer)null).setColumn(cosc.column.name));
            validateColumnData(metadata, cosc.column, false);
        }

        if (cosc.super_column != null)
        {
            if (isCommutative)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("invalid operation for commutative columnfamily " + metadata.cfName);

            for (Column c : cosc.super_column.columns)
            {
                validateColumnPath(metadata, new ColumnPath(metadata.cfName).setSuper_column(cosc.super_column.name).setColumn(c.name));
                validateColumnData(metadata, c, true);
            }
        }

        if (cosc.counter_column != null)
        {
            if (!isCommutative)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("invalid operation for non commutative columnfamily " + metadata.cfName);

            validateColumnPath(metadata, new ColumnPath(metadata.cfName).setSuper_column((ByteBuffer)null).setColumn(cosc.counter_column.name));
        }

        if (cosc.counter_super_column != null)
        {
            if (!isCommutative)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("invalid operation for non commutative columnfamily " + metadata.cfName);

            for (CounterColumn c : cosc.counter_super_column.columns)
                validateColumnPath(metadata, new ColumnPath(metadata.cfName).setSuper_column(cosc.counter_super_column.name).setColumn(c.name));
        }
    }

    private static void validateTtl(Column column) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (column.isSetTtl())
        {
            if (column.ttl <= 0)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("ttl must be positive");

            if (column.ttl > ExpiringColumn.MAX_TTL)
                throw new org.apache.cassandra.exceptions.InvalidRequestException(String.format("ttl is too large. requested (%d) maximum (%d)", column.ttl, ExpiringColumn.MAX_TTL));
        }
        else
        {
            // if it's not set, then it should be zero -- here we are just checking to make sure Thrift doesn't change that contract with us.
            assert column.ttl == 0;
        }
    }

    public static void validateMutation(CFMetaData metadata, Mutation mut)
            throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        ColumnOrSuperColumn cosc = mut.column_or_supercolumn;
        Deletion del = mut.deletion;

        int nulls = 0;
        if (cosc == null) nulls++;
        if (del == null) nulls++;

        if (nulls != 1)
        {
            throw new org.apache.cassandra.exceptions.InvalidRequestException("mutation must have one and only one of column_or_supercolumn or deletion");
        }

        if (cosc != null)
        {
            validateColumnOrSuperColumn(metadata, cosc);
        }
        else
        {
            validateDeletion(metadata, del);
        }
    }

    public static void validateDeletion(CFMetaData metadata, Deletion del) throws org.apache.cassandra.exceptions.InvalidRequestException
    {

        if (del.super_column != null)
            validateColumnNames(metadata, (ByteBuffer)null, Arrays.asList(del.super_column));

        if (del.predicate != null)
        {
            validateSlicePredicate(metadata, del.super_column, del.predicate);
            if (del.predicate.slice_range != null)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("Deletion does not yet support SliceRange predicates.");
        }

        if (metadata.cfType == ColumnFamilyType.Standard && del.super_column != null)
        {
            String msg = String.format("Deletion of super columns is not possible on a standard ColumnFamily (KeySpace=%s ColumnFamily=%s Deletion=%s)", metadata.ksName, metadata.cfName, del);
            throw new org.apache.cassandra.exceptions.InvalidRequestException(msg);
        }

        if (metadata.getDefaultValidator().isCommutative())
        {
            // forcing server timestamp even if a timestamp was set for coherence with other counter operation
            del.timestamp = System.currentTimeMillis();
        }
        else if (!del.isSetTimestamp())
        {
            throw new org.apache.cassandra.exceptions.InvalidRequestException("Deletion timestamp is not optional for non commutative column family " + metadata.cfName);
        }
    }

    public static void validateSlicePredicate(CFMetaData metadata, ByteBuffer scName, SlicePredicate predicate) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (predicate.column_names == null && predicate.slice_range == null)
            throw new org.apache.cassandra.exceptions.InvalidRequestException("A SlicePredicate must be given a list of Columns, a SliceRange, or both");

        if (predicate.slice_range != null)
            validateRange(metadata, new ColumnParent(metadata.cfName).setSuper_column(scName), predicate.slice_range);

        if (predicate.column_names != null)
            validateColumnNames(metadata, scName, predicate.column_names);
    }

    /**
     * Validates the data part of the column (everything in the Column object but the name, which is assumed to be valid)
     */
    public static void validateColumnData(CFMetaData metadata, Column column, boolean isSubColumn) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        validateTtl(column);
        if (!column.isSetValue())
            throw new org.apache.cassandra.exceptions.InvalidRequestException("Column value is required");
        if (!column.isSetTimestamp())
            throw new org.apache.cassandra.exceptions.InvalidRequestException("Column timestamp is required");

        ColumnDefinition columnDef = metadata.getColumnDefinitionFromColumnName(column.name);
        try
        {
            AbstractType<?> validator = metadata.getValueValidator(columnDef);
            if (validator != null)
                validator.validate(column.value);
        }
        catch (MarshalException me)
        {
            if (logger.isDebugEnabled())
                logger.debug("rejecting invalid value " + ByteBufferUtil.bytesToHex(summarize(column.value)));
            throw new org.apache.cassandra.exceptions.InvalidRequestException(String.format("(%s) [%s][%s][%s] failed validation",
                                                                      me.getMessage(),
                                                                      metadata.ksName,
                                                                      metadata.cfName,
                                                                      (isSubColumn ? metadata.subcolumnComparator : metadata.comparator).getString(column.name)));
        }

        // Indexed column values cannot be larger than 64K.  See CASSANDRA-3057/4240 for more details
        if (!Table.open(metadata.ksName).getColumnFamilyStore(metadata.cfName).indexManager.validate(column))
                    throw new org.apache.cassandra.exceptions.InvalidRequestException(String.format("Can't index column value of size %d for index %s in CF %s of KS %s",
                                                                              column.value.remaining(),
                                                                              columnDef.getIndexName(),
                                                                              metadata.cfName,
                                                                              metadata.ksName));
    }

    /**
     * Return, at most, the first 64K of the buffer. This avoids very large column values being
     * logged in their entirety.
     */
    private static ByteBuffer summarize(ByteBuffer buffer)
    {
        int MAX = Short.MAX_VALUE;
        if (buffer.remaining() <= MAX)
            return buffer;
        return (ByteBuffer) buffer.slice().limit(buffer.position() + MAX);
    }


    public static void validatePredicate(CFMetaData metadata, ColumnParent column_parent, SlicePredicate predicate)
            throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (predicate.column_names == null && predicate.slice_range == null)
            throw new org.apache.cassandra.exceptions.InvalidRequestException("predicate column_names and slice_range may not both be null");
        if (predicate.column_names != null && predicate.slice_range != null)
            throw new org.apache.cassandra.exceptions.InvalidRequestException("predicate column_names and slice_range may not both be present");

        if (predicate.getSlice_range() != null)
            validateRange(metadata, column_parent, predicate.slice_range);
        else
            validateColumnNames(metadata, column_parent, predicate.column_names);
    }

    public static void validateKeyRange(CFMetaData metadata, ByteBuffer superColumn, KeyRange range) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if ((range.start_key == null) == (range.start_token == null)
            || (range.end_key == null) == (range.end_token == null))
        {
            throw new org.apache.cassandra.exceptions.InvalidRequestException("exactly one of {start key, end key} or {start token, end token} must be specified");
        }

        // (key, token) is supported (for wide-row CFRR) but not (token, key)
        if (range.start_token != null && range.end_key != null)
            throw new org.apache.cassandra.exceptions.InvalidRequestException("start token + end key is not a supported key range");

        IPartitioner p = StorageService.getPartitioner();

        if (range.start_key != null && range.end_key != null)
        {
            Token startToken = p.getToken(range.start_key);
            Token endToken = p.getToken(range.end_key);
            if (startToken.compareTo(endToken) > 0 && !endToken.isMinimum(p))
            {
                if (p instanceof RandomPartitioner)
                    throw new org.apache.cassandra.exceptions.InvalidRequestException("start key's md5 sorts after end key's md5.  this is not allowed; you probably should not specify end key at all, under RandomPartitioner");
                else
                    throw new org.apache.cassandra.exceptions.InvalidRequestException("start key must sort before (or equal to) finish key in your partitioner!");
            }
        }
        else if (range.end_token != null)
        {
            RowPosition stop = p.getTokenFactory().fromString(range.end_token).maxKeyBound(p);
            if (range.start_key != null && RowPosition.forKey(range.start_key, p).compareTo(stop) > 0)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("Start key's token sorts after end token");
            if (range.start_token != null && p.getTokenFactory().fromString(range.start_token).maxKeyBound(p).compareTo(stop) > 0)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("Start token sorts after end token");
        }

        validateFilterClauses(metadata, range.row_filter);

        if (!isEmpty(range.row_filter) && superColumn != null)
        {
            throw new org.apache.cassandra.exceptions.InvalidRequestException("super columns are not supported for indexing");
        }

        if (range.count <= 0)
        {
            throw new org.apache.cassandra.exceptions.InvalidRequestException("maxRows must be positive");
        }
    }

    private static boolean isEmpty(List<IndexExpression> clause)
    {
        return clause == null || clause.isEmpty();
    }

    public static void validateIndexClauses(CFMetaData metadata, IndexClause index_clause)
    throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (index_clause.expressions.isEmpty())
            throw new org.apache.cassandra.exceptions.InvalidRequestException("index clause list may not be empty");

        if (!validateFilterClauses(metadata, index_clause.expressions))
            throw new org.apache.cassandra.exceptions.InvalidRequestException("No indexed columns present in index clause with operator EQ");
    }

    // return true if index_clause contains an indexed columns with operator EQ
    public static boolean validateFilterClauses(CFMetaData metadata, List<IndexExpression> index_clause)
    throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (isEmpty(index_clause))
            // no filter to apply
            return false;

        SecondaryIndexManager idxManager = Table.open(metadata.ksName).getColumnFamilyStore(metadata.cfName).indexManager;
        AbstractType<?> nameValidator =  ColumnFamily.getComparatorFor(metadata.ksName, metadata.cfName, null);

        boolean isIndexed = false;
        for (IndexExpression expression : index_clause)
        {
            try
            {
                nameValidator.validate(expression.column_name);
            }
            catch (MarshalException me)
            {
                throw new org.apache.cassandra.exceptions.InvalidRequestException(String.format("[%s]=[%s] failed name validation (%s)",
                                                                                  ByteBufferUtil.bytesToHex(expression.column_name),
                                                                                  ByteBufferUtil.bytesToHex(expression.value),
                                                                                  me.getMessage()));
            }

            if (expression.value.remaining() > 0xFFFF)
                throw new org.apache.cassandra.exceptions.InvalidRequestException("Index expression values may not be larger than 64K");

            AbstractType<?> valueValidator = Schema.instance.getValueValidator(metadata.ksName, metadata.cfName, expression.column_name);
            try
            {
                valueValidator.validate(expression.value);
            }
            catch (MarshalException me)
            {
                throw new org.apache.cassandra.exceptions.InvalidRequestException(String.format("[%s]=[%s] failed value validation (%s)",
                                                                                  ByteBufferUtil.bytesToHex(expression.column_name),
                                                                                  ByteBufferUtil.bytesToHex(expression.value),
                                                                                  me.getMessage()));
            }

            isIndexed |= (expression.op == IndexOperator.EQ) && idxManager.indexes(expression.column_name);
        }

        return isIndexed;
    }

    public static void validateKeyspaceNotYetExisting(String newKsName) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        // keyspace names must be unique case-insensitively because the keyspace name becomes the directory
        // where we store CF sstables.  Names that differ only in case would thus cause problems on
        // case-insensitive filesystems (NTFS, most installations of HFS+).
        for (String ksName : Schema.instance.getTables())
        {
            if (ksName.equalsIgnoreCase(newKsName))
                throw new org.apache.cassandra.exceptions.InvalidRequestException(String.format("Keyspace names must be case-insensitively unique (\"%s\" conflicts with \"%s\")",
                                                                                  newKsName,
                                                                                  ksName));
        }
    }

    public static void validateKeyspaceNotSystem(String modifiedKeyspace) throws org.apache.cassandra.exceptions.InvalidRequestException
    {
        if (modifiedKeyspace.equalsIgnoreCase(Table.SYSTEM_KS))
            throw new org.apache.cassandra.exceptions.InvalidRequestException("system keyspace is not user-modifiable");
    }

    public static IDiskAtomFilter asIFilter(SlicePredicate sp, AbstractType<?> comparator)
    {
        SliceRange sr = sp.slice_range;
        if (sr == null)
        {
            SortedSet<ByteBuffer> ss = new TreeSet<ByteBuffer>(comparator);
            ss.addAll(sp.column_names);
            return new NamesQueryFilter(ss);
        }
        else
        {
            return new SliceQueryFilter(sr.start, sr.finish, sr.reversed, sr.count);
        }
    }
}
