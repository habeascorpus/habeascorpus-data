package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
SchemaLoader	TokenNameIdentifier
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
ConfigurationException	TokenNameIdentifier
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
Schema	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
service	TokenNameIdentifier
.	TokenNameDOT
EmbeddedCassandraService	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
TException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ByteArrayOutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PrintStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
regex	TokenNameIdentifier
.	TokenNameDOT
Pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
.	TokenNameDOT
assertTrue	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CliTest	TokenNameIdentifier
extends	TokenNameextends
SchemaLoader	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
statements	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"use TestKeySpace;"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family SecondaryIndicesWithoutIdxName"	TokenNameStringLiteral
+	TokenNamePLUS
" with comparator = UTF8Type"	TokenNameStringLiteral
+	TokenNamePLUS
" and default_validation_class = UTF8Type"	TokenNameStringLiteral
+	TokenNamePLUS
" and column_metadata = [{column_name: profileId, validation_class: UTF8Type, index_type: KEYS}];"	TokenNameStringLiteral
,	TokenNameCOMMA
"update column family SecondaryIndicesWithoutIdxName"	TokenNameStringLiteral
+	TokenNamePLUS
" with column_metadata = "	TokenNameStringLiteral
+	TokenNamePLUS
"[{column_name: profileId, validation_class: UTF8Type, index_type: KEYS},"	TokenNameStringLiteral
+	TokenNamePLUS
"{column_name: postedDate, validation_class: LongType}];"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family 123 with comparator=UTF8Type and column_metadata=[{ column_name:world, validation_class:IntegerType, index_type:0, index_name:IdxName }, "	TokenNameStringLiteral
+	TokenNamePLUS
"{ column_name:world2, validation_class:LongType, index_type:KEYS, index_name:LongIdxName}, "	TokenNameStringLiteral
+	TokenNamePLUS
"{ column_name:617070, validation_class:UTF8Type, index_type:KEYS }, "	TokenNameStringLiteral
+	TokenNamePLUS
"{ column_name:28292, validation_class:UTF8Type, index_type:CUSTOM, index_options:{class_name:'org.apache.cassandra.db.index.keys.KeysIndex', foo:bar}},"	TokenNameStringLiteral
+	TokenNamePLUS
"{ column_name:'-617071', validation_class:UTF8Type, index_type:KEYS },"	TokenNameStringLiteral
+	TokenNamePLUS
"{ column_name:time_spent_uuid, validation_class:TimeUUIDType}] and default_validation_class=UTF8Type;"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume 123 keys as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set 123[hello][world] = 123848374878933948398384;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set 123[hello][test_quote] = 'value\'';"	TokenNameStringLiteral
,	TokenNameCOMMA
"set 123['k\'ey'][VALUE] = 'VAL';"	TokenNameStringLiteral
,	TokenNameCOMMA
"set 123['k\'ey'][VALUE] = 'VAL\'';"	TokenNameStringLiteral
,	TokenNameCOMMA
"set 123[hello][-31337] = 'some string value';"	TokenNameStringLiteral
,	TokenNameCOMMA
"list 123;"	TokenNameStringLiteral
,	TokenNameCOMMA
"list 123[:];"	TokenNameStringLiteral
,	TokenNameCOMMA
"list 123[456:];"	TokenNameStringLiteral
,	TokenNameCOMMA
"list 123 limit 5;"	TokenNameStringLiteral
,	TokenNameCOMMA
"list 123[12:15] limit 20;"	TokenNameStringLiteral
,	TokenNameCOMMA
"list 123[12:15] columns 2;"	TokenNameStringLiteral
,	TokenNameCOMMA
"list 123 columns 2 reversed;"	TokenNameStringLiteral
,	TokenNameCOMMA
"list 123 limit 10 columns 2 reversed;"	TokenNameStringLiteral
,	TokenNameCOMMA
"get 123[hello][-31337];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get 123[hello][world];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get 123[hello][test_quote];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get 123['k\'ey'][VALUE]"	TokenNameStringLiteral
,	TokenNameCOMMA
"set 123[hello][-31337] = -23876;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set 123[hello][world2] = 15;"	TokenNameStringLiteral
,	TokenNameCOMMA
"get 123 where world2 = long(15);"	TokenNameStringLiteral
,	TokenNameCOMMA
"get 123 where world2 = long(15);"	TokenNameStringLiteral
,	TokenNameCOMMA
"get 123 where world2 = long(15);"	TokenNameStringLiteral
,	TokenNameCOMMA
"del 123[utf8('hello')][utf8('world')];"	TokenNameStringLiteral
,	TokenNameCOMMA
"del 123[hello][world2];"	TokenNameStringLiteral
,	TokenNameCOMMA
"set 123['hello'][time_spent_uuid] = timeuuid(a8098c1a-f86e-11da-bd1a-00112444be1e);"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family CF2 with comparator=IntegerType and default_validation_class=AsciiType;"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume CF2 keys as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set CF2['key'][98349387493847748398334] = 'some text';"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF2['key'][98349387493847748398334];"	TokenNameStringLiteral
,	TokenNameCOMMA
"set CF2['key'][98349387493] = 'some text other';"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF2['key'][98349387493];"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family CF3 with comparator=UTF8Type and column_metadata=[{column_name:'big world', validation_class:LongType, index_type:KEYS, index_name:WorldIdx}];"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume CF3 keys as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set CF3['hello']['big world'] = 3748;"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF3['hello']['big world'];"	TokenNameStringLiteral
,	TokenNameCOMMA
"list CF3;"	TokenNameStringLiteral
,	TokenNameCOMMA
"list CF3[:];"	TokenNameStringLiteral
,	TokenNameCOMMA
"list CF3[h:];"	TokenNameStringLiteral
,	TokenNameCOMMA
"list CF3 limit 10;"	TokenNameStringLiteral
,	TokenNameCOMMA
"list CF3[h:] limit 10;"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family CF4 with comparator=IntegerType and column_metadata=[{column_name:9999, validation_class:LongType}];"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume CF4 keys as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set CF4['hello'][9999] = 1234;"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF4['hello'][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF4['hello'][9999] as Long;"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF4['hello'][9999] as Bytes;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set CF4['hello'][9999] = Long(1234);"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF4['hello'][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF4['hello'][9999] as Long;"	TokenNameStringLiteral
,	TokenNameCOMMA
"del CF4['hello'][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF4['hello'][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family sCf1 with column_type=Super and comparator=IntegerType and subcomparator=LongType and column_metadata=[{column_name:9999, validation_class:LongType}];"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume sCf1 keys as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set sCf1['hello'][1][9999] = 1234;"	TokenNameStringLiteral
,	TokenNameCOMMA
"get sCf1['hello'][1][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get sCf1['hello'][1][9999] as Long;"	TokenNameStringLiteral
,	TokenNameCOMMA
"get sCf1['hello'][1][9999] as Bytes;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set sCf1['hello'][1][9999] = Long(1234);"	TokenNameStringLiteral
,	TokenNameCOMMA
"set sCf1['hello'][-1][-12] = Long(5678);"	TokenNameStringLiteral
,	TokenNameCOMMA
"get sCf1['hello'][-1][-12];"	TokenNameStringLiteral
,	TokenNameCOMMA
"set sCf1['hello'][-1][-12] = -340897;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set sCf1['hello'][-1][-12] = integer(-340897);"	TokenNameStringLiteral
,	TokenNameCOMMA
"get sCf1['hello'][1][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get sCf1['hello'][1][9999] as Long;"	TokenNameStringLiteral
,	TokenNameCOMMA
"del sCf1['hello'][1][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get sCf1['hello'][1][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"set sCf1['hello'][1][9999] = Long(1234);"	TokenNameStringLiteral
,	TokenNameCOMMA
"del sCf1['hello'][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get sCf1['hello'][1][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family 'Counter1' with comparator=UTF8Type and default_validation_class=CounterColumnType;"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume Counter1 keys as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"incr Counter1['hello']['cassandra'];"	TokenNameStringLiteral
,	TokenNameCOMMA
"incr Counter1['hello']['cassandra'] by 3;"	TokenNameStringLiteral
,	TokenNameCOMMA
"incr Counter1['hello']['cassandra'] by -2;"	TokenNameStringLiteral
,	TokenNameCOMMA
"decr Counter1['hello']['cassandra'];"	TokenNameStringLiteral
,	TokenNameCOMMA
"decr Counter1['hello']['cassandra'] by 3;"	TokenNameStringLiteral
,	TokenNameCOMMA
"decr Counter1['hello']['cassandra'] by -2;"	TokenNameStringLiteral
,	TokenNameCOMMA
"get Counter1['hello']['cassandra'];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get Counter1['hello'];"	TokenNameStringLiteral
,	TokenNameCOMMA
"truncate 123;"	TokenNameStringLiteral
,	TokenNameCOMMA
"drop index on '123'.world2;"	TokenNameStringLiteral
,	TokenNameCOMMA
"drop index on '123'.617070;"	TokenNameStringLiteral
,	TokenNameCOMMA
"drop index on '123'.'-617071';"	TokenNameStringLiteral
,	TokenNameCOMMA
"drop index on CF3.'big world';"	TokenNameStringLiteral
,	TokenNameCOMMA
"update keyspace TestKeySpace with durable_writes = false;"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume 123 comparator as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume 123 sub_comparator as integer;"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume 123 validator as lexicaluuid;"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume 123 keys as timeuuid;"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family CF7;"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume CF7 keys as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set CF7[1][timeuuid()] = utf8(test1);"	TokenNameStringLiteral
,	TokenNameCOMMA
"set CF7[2][lexicaluuid()] = utf8('hello world!');"	TokenNameStringLiteral
,	TokenNameCOMMA
"set CF7[3][lexicaluuid(550e8400-e29b-41d4-a716-446655440000)] = utf8(test2);"	TokenNameStringLiteral
,	TokenNameCOMMA
"set CF7[key2][timeuuid()] = utf8(test3);"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume CF7 comparator as lexicaluuid;"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume CF7 keys as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"list CF7;"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF7[3];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get CF7[3][lexicaluuid(550e8400-e29b-41d4-a716-446655440000)];"	TokenNameStringLiteral
,	TokenNameCOMMA
"get sCf1['hello'][1][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"set sCf1['hello'][1][9999] = 938;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set sCf1['hello'][1][9999] = 938 with ttl = 30;"	TokenNameStringLiteral
,	TokenNameCOMMA
"set sCf1['hello'][1][9999] = 938 with ttl = 560;"	TokenNameStringLiteral
,	TokenNameCOMMA
"count sCf1[hello];"	TokenNameStringLiteral
,	TokenNameCOMMA
"count sCf1[utf8('hello')];"	TokenNameStringLiteral
,	TokenNameCOMMA
"count sCf1[utf8('hello')][integer(1)];"	TokenNameStringLiteral
,	TokenNameCOMMA
"count sCf1[hello][1];"	TokenNameStringLiteral
,	TokenNameCOMMA
"list sCf1;"	TokenNameStringLiteral
,	TokenNameCOMMA
"del sCf1['hello'][1][9999];"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume sCf1 comparator as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family CF8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"drop column family cF8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"create keyspace TESTIN;"	TokenNameStringLiteral
,	TokenNameCOMMA
"drop keyspace tesTIN;"	TokenNameStringLiteral
,	TokenNameCOMMA
"update column family 123 with comparator=UTF8Type and column_metadata=[];"	TokenNameStringLiteral
,	TokenNameCOMMA
"drop column family 123;"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family myCF with column_type='Super' and comparator='UTF8Type' AND subcomparator='UTF8Type' AND default_validation_class=AsciiType;"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume myCF keys as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family Countries with comparator=UTF8Type and column_metadata=[ {column_name: name, validation_class: UTF8Type} ];"	TokenNameStringLiteral
,	TokenNameCOMMA
"set Countries[11][name] = USA;"	TokenNameStringLiteral
,	TokenNameCOMMA
"get Countries[11][name];"	TokenNameStringLiteral
,	TokenNameCOMMA
"update column family Countries with compaction_strategy = 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy';"	TokenNameStringLiteral
,	TokenNameCOMMA
"create column family Cities with compaction_strategy = 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy' and compaction_strategy_options = {min_sstable_size:1024};"	TokenNameStringLiteral
,	TokenNameCOMMA
"set myCF['key']['scName']['firstname'] = 'John';"	TokenNameStringLiteral
,	TokenNameCOMMA
"get myCF['key']['scName']"	TokenNameStringLiteral
,	TokenNameCOMMA
"assume CF3 keys as utf8;"	TokenNameStringLiteral
,	TokenNameCOMMA
"use TestKEYSpace;"	TokenNameStringLiteral
,	TokenNameCOMMA
"update keyspace TestKeySpace with placement_strategy='org.apache.cassandra.locator.NetworkTopologyStrategy';"	TokenNameStringLiteral
,	TokenNameCOMMA
"update keyspace TestKeySpace with strategy_options=[{DC1:3, DC2:4, DC5:1}];"	TokenNameStringLiteral
,	TokenNameCOMMA
"describe cluster;"	TokenNameStringLiteral
,	TokenNameCOMMA
"help describe cluster;"	TokenNameStringLiteral
,	TokenNameCOMMA
"show cluster name"	TokenNameStringLiteral
,	TokenNameCOMMA
"show api version"	TokenNameStringLiteral
,	TokenNameCOMMA
"help help"	TokenNameStringLiteral
,	TokenNameCOMMA
"help connect"	TokenNameStringLiteral
,	TokenNameCOMMA
"help use"	TokenNameStringLiteral
,	TokenNameCOMMA
"help describe"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP exit"	TokenNameStringLiteral
,	TokenNameCOMMA
"help QUIT"	TokenNameStringLiteral
,	TokenNameCOMMA
"help show cluster name"	TokenNameStringLiteral
,	TokenNameCOMMA
"help show keyspaces"	TokenNameStringLiteral
,	TokenNameCOMMA
"help show schema"	TokenNameStringLiteral
,	TokenNameCOMMA
"help show api version"	TokenNameStringLiteral
,	TokenNameCOMMA
"help create keyspace"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP update KEYSPACE"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP CREATE column FAMILY"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP UPDATE COLUMN family"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP drop keyspace"	TokenNameStringLiteral
,	TokenNameCOMMA
"help drop column family"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP GET"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP set"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP DEL"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP count"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP list"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP TRUNCATE"	TokenNameStringLiteral
,	TokenNameCOMMA
"help assume"	TokenNameStringLiteral
,	TokenNameCOMMA
"HELP"	TokenNameStringLiteral
,	TokenNameCOMMA
"?"	TokenNameStringLiteral
,	TokenNameCOMMA
"show schema"	TokenNameStringLiteral
,	TokenNameCOMMA
"show schema TestKeySpace"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testCli	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
TException	TokenNameIdentifier
,	TokenNameCOMMA
ConfigurationException	TokenNameIdentifier
,	TokenNameCOMMA
ClassNotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
TimedOutException	TokenNameIdentifier
,	TokenNameCOMMA
NotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
SchemaDisagreementException	TokenNameIdentifier
,	TokenNameCOMMA
NoSuchFieldException	TokenNameIdentifier
,	TokenNameCOMMA
InvalidRequestException	TokenNameIdentifier
,	TokenNameCOMMA
UnavailableException	TokenNameIdentifier
,	TokenNameCOMMA
InstantiationException	TokenNameIdentifier
,	TokenNameCOMMA
IllegalAccessException	TokenNameIdentifier
{	TokenNameLBRACE
Schema	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
EmbeddedCassandraService	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteArrayOutputStream	TokenNameIdentifier
errStream	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteArrayOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteArrayOutputStream	TokenNameIdentifier
outStream	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteArrayOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CliMain	TokenNameIdentifier
.	TokenNameDOT
connect	TokenNameIdentifier
(	TokenNameLPAREN
"127.0.0.1"	TokenNameStringLiteral
,	TokenNameCOMMA
9170	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CliMain	TokenNameIdentifier
.	TokenNameDOT
sessionState	TokenNameIdentifier
.	TokenNameDOT
setOut	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrintStream	TokenNameIdentifier
(	TokenNameLPAREN
outStream	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CliMain	TokenNameIdentifier
.	TokenNameDOT
sessionState	TokenNameIdentifier
.	TokenNameDOT
setErr	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrintStream	TokenNameIdentifier
(	TokenNameLPAREN
errStream	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
CliMain	TokenNameIdentifier
.	TokenNameDOT
processStatement	TokenNameIdentifier
(	TokenNameLPAREN
"drop keyspace TestKeySpace;"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
CliMain	TokenNameIdentifier
.	TokenNameDOT
processStatement	TokenNameIdentifier
(	TokenNameLPAREN
"create keyspace TestKeySpace;"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
statement	TokenNameIdentifier
:	TokenNameCOLON
statements	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
errStream	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CliMain	TokenNameIdentifier
.	TokenNameDOT
processStatement	TokenNameIdentifier
(	TokenNameLPAREN
statement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
outStream	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
errStream	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" processing "	TokenNameStringLiteral
+	TokenNamePLUS
statement	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
,	TokenNameCOMMA
errStream	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
statement	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"drop "	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
statement	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"create "	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
statement	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"update "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
Pattern	TokenNameIdentifier
.	TokenNameDOT
compile	TokenNameIdentifier
(	TokenNameLPAREN
"(.{8})-(.{4})-(.{4})-(.{4})-(.{12}).*"	TokenNameStringLiteral
,	TokenNameCOMMA
Pattern	TokenNameIdentifier
.	TokenNameDOT
DOTALL	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
matcher	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
matches	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
""%s" failed: %s"	TokenNameStringLiteral
,	TokenNameCOMMA
statement	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
statement	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"set "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
"Value inserted."	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
"Elapsed time:"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
statement	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"incr "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
"Value incremented."	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
statement	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"decr "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
"Value decremented."	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
statement	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"get "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
statement	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
"where"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"-------------------"	TokenNameStringLiteral
+	TokenNamePLUS
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"line.separator"	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
"RowKey:"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
statement	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
"Counter"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"=> (counter="	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
result	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"Value was not found"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"=> (column="	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
result	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"Value was not found"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
"Elapsed time:"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
statement	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"truncate "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
" truncated."	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
statement	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"assume "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
"successfully."	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
outStream	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
errStream	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testEscape	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
escaped	TokenNameIdentifier
=	TokenNameEQUAL
"backspace \b tab \t linefeed \n form feed \f carriage return \r duble quote \" "	TokenNameStringLiteral
+	TokenNamePLUS
"single quote \' backslash \\"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
unescaped	TokenNameIdentifier
=	TokenNameEQUAL
"backspace  tab   linefeed   form feed  carriage return  duble quote " "	TokenNameStringLiteral
+	TokenNamePLUS
"single quote ' backslash \"	TokenNameStringLiteral
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
unescaped	TokenNameIdentifier
,	TokenNameCOMMA
CliUtils	TokenNameIdentifier
.	TokenNameDOT
unescapeSQLString	TokenNameIdentifier
(	TokenNameLPAREN
"'"	TokenNameStringLiteral
+	TokenNamePLUS
escaped	TokenNameIdentifier
+	TokenNamePLUS
"'"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
escaped	TokenNameIdentifier
,	TokenNameCOMMA
CliUtils	TokenNameIdentifier
.	TokenNameDOT
escapeSQLString	TokenNameIdentifier
(	TokenNameLPAREN
unescaped	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
