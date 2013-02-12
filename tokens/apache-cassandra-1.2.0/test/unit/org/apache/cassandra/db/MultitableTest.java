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
Util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
TableTest	TokenNameIdentifier
.	TokenNameDOT
assertColumns	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
MultitableTest	TokenNameIdentifier
extends	TokenNameextends
SchemaLoader	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testSameCFs	TokenNameIdentifier
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
table1	TokenNameIdentifier
=	TokenNameEQUAL
Table	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Table	TokenNameIdentifier
table2	TokenNameIdentifier
=	TokenNameEQUAL
Table	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
RowMutation	TokenNameIdentifier
rm	TokenNameIdentifier
;	TokenNameSEMICOLON
DecoratedKey	TokenNameIdentifier
dk	TokenNameIdentifier
=	TokenNameEQUAL
Util	TokenNameIdentifier
.	TokenNameDOT
dk	TokenNameIdentifier
(	TokenNameLPAREN
"keymulti"	TokenNameStringLiteral
)	TokenNameRPAREN
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
dk	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
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
rm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RowMutation	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace2"	TokenNameStringLiteral
,	TokenNameCOMMA
dk	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
=	TokenNameEQUAL
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace2"	TokenNameStringLiteral
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
"col2"	TokenNameStringLiteral
,	TokenNameCOMMA
"val2"	TokenNameStringLiteral
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
table1	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilyStore	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
forceBlockingFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
table2	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilyStore	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
forceBlockingFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertColumns	TokenNameIdentifier
(	TokenNameLPAREN
Util	TokenNameIdentifier
.	TokenNameDOT
getColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
table1	TokenNameIdentifier
,	TokenNameCOMMA
dk	TokenNameIdentifier
,	TokenNameCOMMA
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"col1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertColumns	TokenNameIdentifier
(	TokenNameLPAREN
Util	TokenNameIdentifier
.	TokenNameDOT
getColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
table2	TokenNameIdentifier
,	TokenNameCOMMA
dk	TokenNameIdentifier
,	TokenNameCOMMA
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"col2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
