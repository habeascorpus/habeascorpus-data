package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
db	TokenNameIdentifier
.	TokenNameDOT
ColumnFamilyType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
AbstractType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
BytesType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
TypeParser	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
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
exceptions	TokenNameIdentifier
.	TokenNameDOT
RequestValidationException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
compress	TokenNameIdentifier
.	TokenNameDOT
CompressionParameters	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
locator	TokenNameIdentifier
.	TokenNameDOT
AbstractReplicationStrategy	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
locator	TokenNameIdentifier
.	TokenNameDOT
NetworkTopologyStrategy	TokenNameIdentifier
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
IndexType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
ByteBufferUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
CFMetaData	TokenNameIdentifier
.	TokenNameDOT
Caching	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Avro	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
KSMetaData	TokenNameIdentifier
ksFromAvro	TokenNameIdentifier
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
KsDef	TokenNameIdentifier
ks	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Class	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
AbstractReplicationStrategy	TokenNameIdentifier
>	TokenNameGREATER
repStratClass	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
String	TokenNameIdentifier
strategyClassName	TokenNameIdentifier
=	TokenNameEQUAL
KSMetaData	TokenNameIdentifier
.	TokenNameDOT
convertOldStrategyName	TokenNameIdentifier
(	TokenNameLPAREN
ks	TokenNameIdentifier
.	TokenNameDOT
strategy_class	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
repStratClass	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Class	TokenNameIdentifier
<	TokenNameLESS
AbstractReplicationStrategy	TokenNameIdentifier
>	TokenNameGREATER
)	TokenNameRPAREN
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
strategyClassName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"Could not create ReplicationStrategy of type "	TokenNameStringLiteral
+	TokenNamePLUS
ks	TokenNameIdentifier
.	TokenNameDOT
strategy_class	TokenNameIdentifier
,	TokenNameCOMMA
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
strategyOptions	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ks	TokenNameIdentifier
.	TokenNameDOT
strategy_options	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
CharSequence	TokenNameIdentifier
,	TokenNameCOMMA
CharSequence	TokenNameIdentifier
>	TokenNameGREATER
e	TokenNameIdentifier
:	TokenNameCOLON
ks	TokenNameIdentifier
.	TokenNameDOT
strategy_options	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
repStratClass	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NetworkTopologyStrategy	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
&&	TokenNameAND_AND
name	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"replication_factor"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
strategyOptions	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
maybeAddReplicationFactor	TokenNameIdentifier
(	TokenNameLPAREN
strategyOptions	TokenNameIdentifier
,	TokenNameCOMMA
ks	TokenNameIdentifier
.	TokenNameDOT
strategy_class	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ks	TokenNameIdentifier
.	TokenNameDOT
replication_factor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
cfsz	TokenNameIdentifier
=	TokenNameEQUAL
ks	TokenNameIdentifier
.	TokenNameDOT
cf_defs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
CFMetaData	TokenNameIdentifier
>	TokenNameGREATER
cfMetaData	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
CFMetaData	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
cfsz	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
CfDef	TokenNameIdentifier
cf_def	TokenNameIdentifier
:	TokenNameCOLON
ks	TokenNameIdentifier
.	TokenNameDOT
cf_defs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
keysCached	TokenNameIdentifier
=	TokenNameEQUAL
cf_def	TokenNameIdentifier
.	TokenNameDOT
key_cache_size	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
cf_def	TokenNameIdentifier
.	TokenNameDOT
key_cache_size	TokenNameIdentifier
;	TokenNameSEMICOLON
double	TokenNamedouble
rowsCached	TokenNameIdentifier
=	TokenNameEQUAL
cf_def	TokenNameIdentifier
.	TokenNameDOT
row_cache_size	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
cf_def	TokenNameIdentifier
.	TokenNameDOT
row_cache_size	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
keysCached	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
rowsCached	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
cf_def	TokenNameIdentifier
.	TokenNameDOT
caching	TokenNameIdentifier
=	TokenNameEQUAL
Caching	TokenNameIdentifier
.	TokenNameDOT
ALL	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
keysCached	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
rowsCached	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
cf_def	TokenNameIdentifier
.	TokenNameDOT
caching	TokenNameIdentifier
=	TokenNameEQUAL
Caching	TokenNameIdentifier
.	TokenNameDOT
NONE	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
keysCached	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
rowsCached	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
cf_def	TokenNameIdentifier
.	TokenNameDOT
caching	TokenNameIdentifier
=	TokenNameEQUAL
Caching	TokenNameIdentifier
.	TokenNameDOT
KEYS_ONLY	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
cf_def	TokenNameIdentifier
.	TokenNameDOT
caching	TokenNameIdentifier
=	TokenNameEQUAL
Caching	TokenNameIdentifier
.	TokenNameDOT
ROWS_ONLY	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cfMetaData	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
cfFromAvro	TokenNameIdentifier
(	TokenNameLPAREN
cf_def	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
KSMetaData	TokenNameIdentifier
(	TokenNameLPAREN
ks	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
repStratClass	TokenNameIdentifier
,	TokenNameCOMMA
strategyOptions	TokenNameIdentifier
,	TokenNameCOMMA
ks	TokenNameIdentifier
.	TokenNameDOT
durable_writes	TokenNameIdentifier
,	TokenNameCOMMA
cfMetaData	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
maybeAddReplicationFactor	TokenNameIdentifier
(	TokenNameLPAREN
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
options	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
cls	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
rf	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
rf	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
(	TokenNameLPAREN
cls	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"SimpleStrategy"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
cls	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"OldNetworkTopologyStrategy"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
options	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"replication_factor"	TokenNameStringLiteral
,	TokenNameCOMMA
rf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
CFMetaData	TokenNameIdentifier
cfFromAvro	TokenNameIdentifier
(	TokenNameLPAREN
CfDef	TokenNameIdentifier
cf	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
comparator	TokenNameIdentifier
;	TokenNameSEMICOLON
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
subcolumnComparator	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
validator	TokenNameIdentifier
;	TokenNameSEMICOLON
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
keyValidator	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
comparator	TokenNameIdentifier
=	TokenNameEQUAL
TypeParser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
comparator_type	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
subcomparator_type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
subcolumnComparator	TokenNameIdentifier
=	TokenNameEQUAL
TypeParser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
subcomparator_type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
validator	TokenNameIdentifier
=	TokenNameEQUAL
TypeParser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
default_validation_class	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
keyValidator	TokenNameIdentifier
=	TokenNameEQUAL
TypeParser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
key_validation_class	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"Could not inflate CFMetaData for "	TokenNameStringLiteral
+	TokenNamePLUS
cf	TokenNameIdentifier
,	TokenNameCOMMA
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Map	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
ColumnDefinition	TokenNameIdentifier
>	TokenNameGREATER
column_metadata	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeMap	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
ColumnDefinition	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
BytesType	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
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
ColumnDef	TokenNameIdentifier
aColumn_metadata	TokenNameIdentifier
:	TokenNameCOLON
cf	TokenNameIdentifier
.	TokenNameDOT
column_metadata	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnDefinition	TokenNameIdentifier
cd	TokenNameIdentifier
=	TokenNameEQUAL
columnFromAvro	TokenNameIdentifier
(	TokenNameLPAREN
aColumn_metadata	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cd	TokenNameIdentifier
.	TokenNameDOT
getIndexType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
cd	TokenNameIdentifier
.	TokenNameDOT
getIndexName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
cd	TokenNameIdentifier
.	TokenNameDOT
setIndexName	TokenNameIdentifier
(	TokenNameLPAREN
CFMetaData	TokenNameIdentifier
.	TokenNameDOT
getDefaultIndexName	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
comparator	TokenNameIdentifier
,	TokenNameCOMMA
cd	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
column_metadata	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
cd	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
,	TokenNameCOMMA
cd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
CFMetaData	TokenNameIdentifier
newCFMD	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CFMetaData	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
keyspace	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
cf	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ColumnFamilyType	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
column_type	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
comparator	TokenNameIdentifier
,	TokenNameCOMMA
subcolumnComparator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
min_compaction_threshold	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
newCFMD	TokenNameIdentifier
.	TokenNameDOT
minCompactionThreshold	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
min_compaction_threshold	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
max_compaction_threshold	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
newCFMD	TokenNameIdentifier
.	TokenNameDOT
maxCompactionThreshold	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
max_compaction_threshold	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
key_alias	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
newCFMD	TokenNameIdentifier
.	TokenNameDOT
keyAliases	TokenNameIdentifier
(	TokenNameLPAREN
Collections	TokenNameIdentifier
.	TokenNameDOT
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
>	TokenNameGREATER
singletonList	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
key_alias	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
column_aliases	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
newCFMD	TokenNameIdentifier
.	TokenNameDOT
columnAliases	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
column_aliases	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
value_alias	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
newCFMD	TokenNameIdentifier
.	TokenNameDOT
valueAlias	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
value_alias	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
compaction_strategy	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
newCFMD	TokenNameIdentifier
.	TokenNameDOT
compactionStrategyClass	TokenNameIdentifier
=	TokenNameEQUAL
CFMetaData	TokenNameIdentifier
.	TokenNameDOT
createCompactionStrategy	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
compaction_strategy	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ConfigurationException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
compaction_strategy_options	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
CharSequence	TokenNameIdentifier
,	TokenNameCOMMA
CharSequence	TokenNameIdentifier
>	TokenNameGREATER
e	TokenNameIdentifier
:	TokenNameCOLON
cf	TokenNameIdentifier
.	TokenNameDOT
compaction_strategy_options	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
newCFMD	TokenNameIdentifier
.	TokenNameDOT
compactionStrategyOptions	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
CompressionParameters	TokenNameIdentifier
cp	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
cp	TokenNameIdentifier
=	TokenNameEQUAL
CompressionParameters	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
compression_options	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ConfigurationException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
CFMetaData	TokenNameIdentifier
.	TokenNameDOT
Caching	TokenNameIdentifier
caching	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
caching	TokenNameIdentifier
=	TokenNameEQUAL
cf	TokenNameIdentifier
.	TokenNameDOT
caching	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
CFMetaData	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_CACHING_STRATEGY	TokenNameIdentifier
:	TokenNameCOLON
CFMetaData	TokenNameIdentifier
.	TokenNameDOT
Caching	TokenNameIdentifier
.	TokenNameDOT
fromString	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
caching	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ConfigurationException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Schema	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
addOldCfIdMapping	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
id	TokenNameIdentifier
,	TokenNameCOMMA
newCFMD	TokenNameIdentifier
.	TokenNameDOT
cfId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
newCFMD	TokenNameIdentifier
.	TokenNameDOT
comment	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
comment	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
readRepairChance	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
read_repair_chance	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
dcLocalReadRepairChance	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
dclocal_read_repair_chance	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
replicateOnWrite	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
replicate_on_write	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
gcGraceSeconds	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
gc_grace_seconds	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
defaultValidator	TokenNameIdentifier
(	TokenNameLPAREN
validator	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
keyValidator	TokenNameIdentifier
(	TokenNameLPAREN
keyValidator	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
columnMetadata	TokenNameIdentifier
(	TokenNameLPAREN
column_metadata	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
compressionParameters	TokenNameIdentifier
(	TokenNameLPAREN
cp	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
bloomFilterFpChance	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
bloom_filter_fp_chance	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
caching	TokenNameIdentifier
(	TokenNameLPAREN
caching	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
ColumnDefinition	TokenNameIdentifier
columnFromAvro	TokenNameIdentifier
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
ColumnDef	TokenNameIdentifier
cd	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
IndexType	TokenNameIdentifier
index_type	TokenNameIdentifier
=	TokenNameEQUAL
cd	TokenNameIdentifier
.	TokenNameDOT
index_type	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
Enum	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
IndexType	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
cd	TokenNameIdentifier
.	TokenNameDOT
index_type	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
index_name	TokenNameIdentifier
=	TokenNameEQUAL
cd	TokenNameIdentifier
.	TokenNameDOT
index_name	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
cd	TokenNameIdentifier
.	TokenNameDOT
index_name	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
validatorType	TokenNameIdentifier
=	TokenNameEQUAL
TypeParser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
cd	TokenNameIdentifier
.	TokenNameDOT
validation_class	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
ColumnDefinition	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
cd	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
validatorType	TokenNameIdentifier
,	TokenNameCOMMA
index_type	TokenNameIdentifier
,	TokenNameCOMMA
ColumnDefinition	TokenNameIdentifier
.	TokenNameDOT
getStringMap	TokenNameIdentifier
(	TokenNameLPAREN
cd	TokenNameIdentifier
.	TokenNameDOT
index_options	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
index_name	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
RequestValidationException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
