package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
Util	TokenNameIdentifier
.	TokenNameDOT
column	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
.	TokenNameDOT
assertNotNull	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
.	TokenNameDOT
assertNull	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
ExecutionException	TokenNameIdentifier
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
Util	TokenNameIdentifier
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
commitlog	TokenNameIdentifier
.	TokenNameDOT
CommitLog	TokenNameIdentifier
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
filter	TokenNameIdentifier
.	TokenNameDOT
QueryFilter	TokenNameIdentifier
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
filter	TokenNameIdentifier
.	TokenNameDOT
QueryPath	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
RecoveryManagerTruncateTest	TokenNameIdentifier
extends	TokenNameextends
SchemaLoader	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testTruncate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ExecutionException	TokenNameIdentifier
,	TokenNameCOMMA
InterruptedException	TokenNameIdentifier
{	TokenNameLBRACE
Table	TokenNameIdentifier
table	TokenNameIdentifier
=	TokenNameEQUAL
Table	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilyStore	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
RowMutation	TokenNameIdentifier
rm	TokenNameIdentifier
;	TokenNameSEMICOLON
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RowMutation	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace1"	TokenNameStringLiteral
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"keymulti"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
=	TokenNameEQUAL
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace1"	TokenNameStringLiteral
,	TokenNameCOMMA
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
(	TokenNameLPAREN
"col1"	TokenNameStringLiteral
,	TokenNameCOMMA
"val1"	TokenNameStringLiteral
,	TokenNameCOMMA
1L	TokenNameLongLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
getFromTable	TokenNameIdentifier
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
"Standard1"	TokenNameStringLiteral
,	TokenNameCOMMA
"keymulti"	TokenNameStringLiteral
,	TokenNameCOMMA
"col1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cfs	TokenNameIdentifier
.	TokenNameDOT
truncate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CommitLog	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
resetUnsafe	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CommitLog	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
recover	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
getFromTable	TokenNameIdentifier
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
"Standard1"	TokenNameStringLiteral
,	TokenNameCOMMA
"keymulti"	TokenNameStringLiteral
,	TokenNameCOMMA
"col1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
IColumn	TokenNameIdentifier
getFromTable	TokenNameIdentifier
(	TokenNameLPAREN
Table	TokenNameIdentifier
table	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
cfName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
keyName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
columnName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
;	TokenNameSEMICOLON
ColumnFamilyStore	TokenNameIdentifier
cfStore	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilyStore	TokenNameIdentifier
(	TokenNameLPAREN
cfName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cfStore	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
cf	TokenNameIdentifier
=	TokenNameEQUAL
cfStore	TokenNameIdentifier
.	TokenNameDOT
getColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
QueryFilter	TokenNameIdentifier
.	TokenNameDOT
getNamesFilter	TokenNameIdentifier
(	TokenNameLPAREN
Util	TokenNameIdentifier
.	TokenNameDOT
dk	TokenNameIdentifier
(	TokenNameLPAREN
keyName	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
cfName	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
columnName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cf	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
cf	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
columnName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE