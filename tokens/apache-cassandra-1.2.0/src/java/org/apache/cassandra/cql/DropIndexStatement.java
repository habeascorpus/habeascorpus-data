package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
InvalidRequestException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DropIndexStatement	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
indexName	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
keyspace	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DropIndexStatement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
indexName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
indexName	TokenNameIdentifier
=	TokenNameEQUAL
indexName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setKeyspace	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
keyspace	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
keyspace	TokenNameIdentifier
=	TokenNameEQUAL
keyspace	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
findIndexedCF	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
cfName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CFMetaData	TokenNameIdentifier
generateCFMetadataUpdate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
updateCFMetadata	TokenNameIdentifier
(	TokenNameLPAREN
findIndexedCF	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
CFMetaData	TokenNameIdentifier
updateCFMetadata	TokenNameIdentifier
(	TokenNameLPAREN
CFMetaData	TokenNameIdentifier
cfm	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
ColumnDefinition	TokenNameIdentifier
column	TokenNameIdentifier
=	TokenNameEQUAL
findIndexedColumn	TokenNameIdentifier
(	TokenNameLPAREN
cfm	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
column	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
CFMetaData	TokenNameIdentifier
cloned	TokenNameIdentifier
=	TokenNameEQUAL
cfm	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnDefinition	TokenNameIdentifier
toChange	TokenNameIdentifier
=	TokenNameEQUAL
cloned	TokenNameIdentifier
.	TokenNameDOT
getColumn_metadata	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
toChange	TokenNameIdentifier
.	TokenNameDOT
getIndexName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
toChange	TokenNameIdentifier
.	TokenNameDOT
getIndexName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
indexName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
toChange	TokenNameIdentifier
.	TokenNameDOT
setIndexName	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
toChange	TokenNameIdentifier
.	TokenNameDOT
setIndexType	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
cloned	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
CFMetaData	TokenNameIdentifier
findIndexedCF	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
KSMetaData	TokenNameIdentifier
ksm	TokenNameIdentifier
=	TokenNameEQUAL
Schema	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getTableDefinition	TokenNameIdentifier
(	TokenNameLPAREN
keyspace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
CFMetaData	TokenNameIdentifier
cfm	TokenNameIdentifier
:	TokenNameCOLON
ksm	TokenNameIdentifier
.	TokenNameDOT
cfMetaData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
findIndexedColumn	TokenNameIdentifier
(	TokenNameLPAREN
cfm	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
cfm	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Index '"	TokenNameStringLiteral
+	TokenNamePLUS
indexName	TokenNameIdentifier
+	TokenNamePLUS
"' could not be found in any of the column families of keyspace '"	TokenNameStringLiteral
+	TokenNamePLUS
keyspace	TokenNameIdentifier
+	TokenNamePLUS
"'"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ColumnDefinition	TokenNameIdentifier
findIndexedColumn	TokenNameIdentifier
(	TokenNameLPAREN
CFMetaData	TokenNameIdentifier
cfm	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
ColumnDefinition	TokenNameIdentifier
column	TokenNameIdentifier
:	TokenNameCOLON
cfm	TokenNameIdentifier
.	TokenNameDOT
getColumn_metadata	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
getIndexType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
column	TokenNameIdentifier
.	TokenNameDOT
getIndexName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
column	TokenNameIdentifier
.	TokenNameDOT
getIndexName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
indexName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
column	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
