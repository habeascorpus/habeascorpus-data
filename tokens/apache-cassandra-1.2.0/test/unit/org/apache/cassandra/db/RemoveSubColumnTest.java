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
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
.	TokenNameDOT
assertNull	TokenNameIdentifier
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
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
Util	TokenNameIdentifier
.	TokenNameDOT
getBytes	TokenNameIdentifier
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
SchemaLoader	TokenNameIdentifier
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
RemoveSubColumnTest	TokenNameIdentifier
extends	TokenNameextends
SchemaLoader	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRemoveSubColumn	TokenNameIdentifier
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
store	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilyStore	TokenNameIdentifier
(	TokenNameLPAREN
"Super1"	TokenNameStringLiteral
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
"key1"	TokenNameStringLiteral
)	TokenNameRPAREN
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
Util	TokenNameIdentifier
.	TokenNameDOT
addMutation	TokenNameIdentifier
(	TokenNameLPAREN
rm	TokenNameIdentifier
,	TokenNameCOMMA
"Super1"	TokenNameStringLiteral
,	TokenNameCOMMA
"SC1"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
"asdf"	TokenNameStringLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
store	TokenNameIdentifier
.	TokenNameDOT
forceBlockingFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
rm	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"Super1"	TokenNameStringLiteral
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"SC1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
1L	TokenNameLongLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnFamily	TokenNameIdentifier
retrieved	TokenNameIdentifier
=	TokenNameEQUAL
store	TokenNameIdentifier
.	TokenNameDOT
getColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
QueryFilter	TokenNameIdentifier
.	TokenNameDOT
getIdentityFilter	TokenNameIdentifier
(	TokenNameLPAREN
dk	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"Super1"	TokenNameStringLiteral
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"SC1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
retrieved	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"SC1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSubColumn	TokenNameIdentifier
(	TokenNameLPAREN
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
1L	TokenNameLongLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
Util	TokenNameIdentifier
.	TokenNameDOT
cloneAndRemoveDeleted	TokenNameIdentifier
(	TokenNameLPAREN
retrieved	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRemoveSubColumnAndContainer	TokenNameIdentifier
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
store	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilyStore	TokenNameIdentifier
(	TokenNameLPAREN
"Super1"	TokenNameStringLiteral
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
"key2"	TokenNameStringLiteral
)	TokenNameRPAREN
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
Util	TokenNameIdentifier
.	TokenNameDOT
addMutation	TokenNameIdentifier
(	TokenNameLPAREN
rm	TokenNameIdentifier
,	TokenNameCOMMA
"Super1"	TokenNameStringLiteral
,	TokenNameCOMMA
"SC1"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
"asdf"	TokenNameStringLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
store	TokenNameIdentifier
.	TokenNameDOT
forceBlockingFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
rm	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"Super1"	TokenNameStringLiteral
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"SC1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
gcbefore	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
rm	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"Super1"	TokenNameStringLiteral
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"SC1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnFamily	TokenNameIdentifier
retrieved	TokenNameIdentifier
=	TokenNameEQUAL
store	TokenNameIdentifier
.	TokenNameDOT
getColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
QueryFilter	TokenNameIdentifier
.	TokenNameDOT
getIdentityFilter	TokenNameIdentifier
(	TokenNameLPAREN
dk	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"Super1"	TokenNameStringLiteral
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"SC1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
gcbefore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
retrieved	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"SC1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSubColumn	TokenNameIdentifier
(	TokenNameLPAREN
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
Util	TokenNameIdentifier
.	TokenNameDOT
cloneAndRemoveDeleted	TokenNameIdentifier
(	TokenNameLPAREN
retrieved	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE