package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
migration	TokenNameIdentifier
.	TokenNameDOT
avro	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"all"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
AddColumnFamily	TokenNameIdentifier
extends	TokenNameextends
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
avro	TokenNameIdentifier
.	TokenNameDOT
specific	TokenNameIdentifier
.	TokenNameDOT
SpecificRecordBase	TokenNameIdentifier
implements	TokenNameimplements
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
avro	TokenNameIdentifier
.	TokenNameDOT
specific	TokenNameIdentifier
.	TokenNameDOT
SpecificRecord	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
avro	TokenNameIdentifier
.	TokenNameDOT
Schema	TokenNameIdentifier
SCHEMA$	TokenNameIdentifier
=	TokenNameEQUAL
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
avro	TokenNameIdentifier
.	TokenNameDOT
Schema	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
"{"type":"record","name":"AddColumnFamily","namespace":"org.apache.cassandra.db.migration.avro","fields":[{"name":"cf","type":{"type":"record","name":"CfDef","fields":[{"name":"keyspace","type":"string"},{"name":"name","type":"string"},{"name":"column_type","type":["string","null"]},{"name":"comparator_type","type":["string","null"]},{"name":"subcomparator_type","type":["string","null"]},{"name":"comment","type":["string","null"]},{"name":"read_repair_chance","type":["double","null"]},{"name":"replicate_on_write","type":"boolean","default":false},{"name":"gc_grace_seconds","type":["int","null"]},{"name":"default_validation_class","type":["null","string"],"default":null},{"name":"key_validation_class","type":["null","string"],"default":null},{"name":"min_compaction_threshold","type":["null","int"],"default":null},{"name":"max_compaction_threshold","type":["null","int"],"default":null},{"name":"merge_shards_chance","type":["null","double"],"default":null},{"name":"id","type":["int","null"]},{"name":"column_metadata","type":[{"type":"array","items":{"type":"record","name":"ColumnDef","fields":[{"name":"name","type":"bytes"},{"name":"validation_class","type":"string"},{"name":"index_type","type":[{"type":"enum","name":"IndexType","symbols":["KEYS","CUSTOM"],"aliases":["org.apache.cassandra.config.avro.IndexType"]},"null"]},{"name":"index_name","type":["string","null"]},{"name":"index_options","type":["null",{"type":"map","values":"string"}],"default":null}],"aliases":["org.apache.cassandra.config.avro.ColumnDef"]}},"null"]},{"name":"key_alias","type":["null","bytes"],"default":null},{"name":"compaction_strategy","type":["null","string"],"default":null},{"name":"compaction_strategy_options","type":["null",{"type":"map","values":"string"}],"default":null},{"name":"compression_options","type":["null",{"type":"map","values":"string"}],"default":null},{"name":"bloom_filter_fp_chance","type":["null","double"],"default":null},{"name":"caching","type":["null","string"],"default":null},{"name":"column_aliases","type":["null",{"type":"array","items":"bytes"}],"default":null},{"name":"value_alias","type":["null","bytes"],"default":null},{"name":"dclocal_read_repair_chance","type":["double","null"],"default":0.0},{"name":"row_cache_size","type":["double","null"]},{"name":"key_cache_size","type":["double","null"]}],"aliases":["org.apache.cassandra.config.avro.CfDef"]}}]}"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
migration	TokenNameIdentifier
.	TokenNameDOT
avro	TokenNameIdentifier
.	TokenNameDOT
CfDef	TokenNameIdentifier
cf	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
avro	TokenNameIdentifier
.	TokenNameDOT
Schema	TokenNameIdentifier
getSchema	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
SCHEMA$	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
Object	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
field$	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
field$	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
0	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
cf	TokenNameIdentifier
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
avro	TokenNameIdentifier
.	TokenNameDOT
AvroRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"Bad index"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
=	TokenNameEQUAL
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
void	TokenNamevoid
put	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
field$	TokenNameIdentifier
,	TokenNameCOMMA
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
Object	TokenNameIdentifier
value$	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
field$	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
0	TokenNameIntegerLiteral
:	TokenNameCOLON
cf	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
migration	TokenNameIdentifier
.	TokenNameDOT
avro	TokenNameIdentifier
.	TokenNameDOT
CfDef	TokenNameIdentifier
)	TokenNameRPAREN
value$	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
avro	TokenNameIdentifier
.	TokenNameDOT
AvroRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"Bad index"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
