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
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
junit	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
.	TokenNameDOT
fail	TokenNameIdentifier
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
context	TokenNameIdentifier
.	TokenNameDOT
CounterContext	TokenNameIdentifier
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
*	TokenNameMULTIPLY
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
*	TokenNameMULTIPLY
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
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
context	TokenNameIdentifier
.	TokenNameDOT
CounterContext	TokenNameIdentifier
.	TokenNameDOT
ContextState	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CounterMutationTest	TokenNameIdentifier
extends	TokenNameextends
SchemaLoader	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testMergeOldShards	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
RowMutation	TokenNameIdentifier
rm	TokenNameIdentifier
;	TokenNameSEMICOLON
CounterMutation	TokenNameIdentifier
cm	TokenNameIdentifier
;	TokenNameSEMICOLON
CounterId	TokenNameIdentifier
id1	TokenNameIdentifier
=	TokenNameEQUAL
CounterId	TokenNameIdentifier
.	TokenNameDOT
getLocalId	TokenNameIdentifier
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
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"key1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
addCounter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"Counter1"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CounterMutation	TokenNameIdentifier
(	TokenNameLPAREN
rm	TokenNameIdentifier
,	TokenNameCOMMA
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
ONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CounterId	TokenNameIdentifier
.	TokenNameDOT
renewLocalId	TokenNameIdentifier
(	TokenNameLPAREN
2L	TokenNameLongLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CounterId	TokenNameIdentifier
id2	TokenNameIdentifier
=	TokenNameEQUAL
CounterId	TokenNameIdentifier
.	TokenNameDOT
getLocalId	TokenNameIdentifier
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
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"key1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
addCounter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"Counter1"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CounterMutation	TokenNameIdentifier
(	TokenNameLPAREN
rm	TokenNameIdentifier
,	TokenNameCOMMA
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
ONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CounterId	TokenNameIdentifier
.	TokenNameDOT
renewLocalId	TokenNameIdentifier
(	TokenNameLPAREN
4L	TokenNameLongLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CounterId	TokenNameIdentifier
id3	TokenNameIdentifier
=	TokenNameEQUAL
CounterId	TokenNameIdentifier
.	TokenNameDOT
getLocalId	TokenNameIdentifier
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
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"key1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
addCounter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"Counter1"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
addCounter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"Counter1"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CounterMutation	TokenNameIdentifier
(	TokenNameLPAREN
rm	TokenNameIdentifier
,	TokenNameCOMMA
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
ONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
=	TokenNameEQUAL
Util	TokenNameIdentifier
.	TokenNameDOT
getColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
Table	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
dk	TokenNameIdentifier
,	TokenNameCOMMA
"Counter1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CounterColumn	TokenNameIdentifier
.	TokenNameDOT
mergeAndRemoveOldShards	TokenNameIdentifier
(	TokenNameLPAREN
dk	TokenNameIdentifier
,	TokenNameCOMMA
cf	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
now	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IColumn	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
cf	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
c	TokenNameIdentifier
instanceof	TokenNameinstanceof
CounterColumn	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
(	TokenNameLPAREN
(	TokenNameLPAREN
CounterColumn	TokenNameIdentifier
)	TokenNameRPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
total	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
12L	TokenNameLongLiteral
;	TokenNameSEMICOLON
ContextState	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ContextState	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
s	TokenNameIdentifier
.	TokenNameDOT
getCounterId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
id1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
s	TokenNameIdentifier
.	TokenNameDOT
getCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0L	TokenNameLongLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
-	TokenNameMINUS
s	TokenNameIdentifier
.	TokenNameDOT
getClock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
now	TokenNameIdentifier
-	TokenNameMINUS
1000	TokenNameIntegerLiteral
:	TokenNameCOLON
" >"	TokenNameStringLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
-	TokenNameMINUS
s	TokenNameIdentifier
.	TokenNameDOT
getClock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
now	TokenNameIdentifier
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
moveToNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
s	TokenNameIdentifier
.	TokenNameDOT
getCounterId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
id2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
s	TokenNameIdentifier
.	TokenNameDOT
getCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0L	TokenNameLongLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
-	TokenNameMINUS
s	TokenNameIdentifier
.	TokenNameDOT
getClock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
now	TokenNameIdentifier
-	TokenNameMINUS
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
-	TokenNameMINUS
s	TokenNameIdentifier
.	TokenNameDOT
getClock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
now	TokenNameIdentifier
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
moveToNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
s	TokenNameIdentifier
.	TokenNameDOT
getCounterId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
id3	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
s	TokenNameIdentifier
.	TokenNameDOT
getCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
12L	TokenNameLongLiteral
;	TokenNameSEMICOLON
CounterColumn	TokenNameIdentifier
.	TokenNameDOT
mergeAndRemoveOldShards	TokenNameIdentifier
(	TokenNameLPAREN
dk	TokenNameIdentifier
,	TokenNameCOMMA
cf	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
=	TokenNameEQUAL
cf	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
c	TokenNameIdentifier
instanceof	TokenNameinstanceof
CounterColumn	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
(	TokenNameLPAREN
(	TokenNameLPAREN
CounterColumn	TokenNameIdentifier
)	TokenNameRPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
total	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
12L	TokenNameLongLiteral
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ContextState	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
s	TokenNameIdentifier
.	TokenNameDOT
getCounterId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
id3	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
s	TokenNameIdentifier
.	TokenNameDOT
getCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
12L	TokenNameLongLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testMutateSuperColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
RowMutation	TokenNameIdentifier
rm	TokenNameIdentifier
;	TokenNameSEMICOLON
CounterMutation	TokenNameIdentifier
cm	TokenNameIdentifier
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RowMutation	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace1"	TokenNameStringLiteral
,	TokenNameCOMMA
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"key1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
addCounter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"SuperCounter1"	TokenNameStringLiteral
,	TokenNameCOMMA
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"sc1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
addCounter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"SuperCounter1"	TokenNameStringLiteral
,	TokenNameCOMMA
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"sc2"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CounterMutation	TokenNameIdentifier
(	TokenNameLPAREN
rm	TokenNameIdentifier
,	TokenNameCOMMA
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
ONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cm	TokenNameIdentifier
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
"Keyspace1"	TokenNameStringLiteral
,	TokenNameCOMMA
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"key1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
addCounter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"SuperCounter1"	TokenNameStringLiteral
,	TokenNameCOMMA
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"sc1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
addCounter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"SuperCounter1"	TokenNameStringLiteral
,	TokenNameCOMMA
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"sc2"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CounterMutation	TokenNameIdentifier
(	TokenNameLPAREN
rm	TokenNameIdentifier
,	TokenNameCOMMA
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
ONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
RowMutation	TokenNameIdentifier
reprm	TokenNameIdentifier
=	TokenNameEQUAL
cm	TokenNameIdentifier
.	TokenNameDOT
makeReplicationMutation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
=	TokenNameEQUAL
reprm	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
cf	TokenNameIdentifier
.	TokenNameDOT
getColumnCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
IColumn	TokenNameIdentifier
sc1	TokenNameIdentifier
=	TokenNameEQUAL
cf	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"sc1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
sc1	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
sc1	TokenNameIdentifier
instanceof	TokenNameinstanceof
SuperColumn	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
sc1	TokenNameIdentifier
.	TokenNameDOT
getSubColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
sc1	TokenNameIdentifier
.	TokenNameDOT
getSubColumn	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
IColumn	TokenNameIdentifier
sc2	TokenNameIdentifier
=	TokenNameEQUAL
cf	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"sc2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
sc2	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
sc2	TokenNameIdentifier
instanceof	TokenNameinstanceof
SuperColumn	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
sc2	TokenNameIdentifier
.	TokenNameDOT
getSubColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
sc2	TokenNameIdentifier
.	TokenNameDOT
getSubColumn	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"Column2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testGetOldShardFromSystemTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
CounterId	TokenNameIdentifier
.	TokenNameDOT
renewLocalId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CounterId	TokenNameIdentifier
.	TokenNameDOT
renewLocalId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CounterId	TokenNameIdentifier
.	TokenNameDOT
renewLocalId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
CounterId	TokenNameIdentifier
.	TokenNameDOT
CounterIdRecord	TokenNameIdentifier
>	TokenNameGREATER
inMem	TokenNameIdentifier
=	TokenNameEQUAL
CounterId	TokenNameIdentifier
.	TokenNameDOT
getOldLocalCounterIds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
CounterId	TokenNameIdentifier
.	TokenNameDOT
CounterIdRecord	TokenNameIdentifier
>	TokenNameGREATER
onDisk	TokenNameIdentifier
=	TokenNameEQUAL
SystemTable	TokenNameIdentifier
.	TokenNameDOT
getOldLocalCounterIds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
inMem	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
onDisk	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRemoveOldShardFixCorrupted	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
CounterContext	TokenNameIdentifier
ctx	TokenNameIdentifier
=	TokenNameEQUAL
CounterContext	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
now	TokenNameIdentifier
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
CounterId	TokenNameIdentifier
id1	TokenNameIdentifier
=	TokenNameEQUAL
CounterId	TokenNameIdentifier
.	TokenNameDOT
getLocalId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CounterId	TokenNameIdentifier
.	TokenNameDOT
renewLocalId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CounterId	TokenNameIdentifier
id2	TokenNameIdentifier
=	TokenNameEQUAL
CounterId	TokenNameIdentifier
.	TokenNameDOT
getLocalId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ContextState	TokenNameIdentifier
state	TokenNameIdentifier
=	TokenNameEQUAL
ContextState	TokenNameIdentifier
.	TokenNameDOT
allocate	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
state	TokenNameIdentifier
.	TokenNameDOT
writeElement	TokenNameIdentifier
(	TokenNameLPAREN
CounterId	TokenNameIdentifier
.	TokenNameDOT
fromInt	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
state	TokenNameIdentifier
.	TokenNameDOT
writeElement	TokenNameIdentifier
(	TokenNameLPAREN
id1	TokenNameIdentifier
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
state	TokenNameIdentifier
.	TokenNameDOT
writeElement	TokenNameIdentifier
(	TokenNameLPAREN
id2	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
100	TokenNameIntegerLiteral
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
ctx	TokenNameIdentifier
.	TokenNameDOT
total	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
.	TokenNameDOT
context	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
11	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
ByteBuffer	TokenNameIdentifier
merger	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
.	TokenNameDOT
computeOldShardMerger	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
.	TokenNameDOT
context	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
<	TokenNameLESS
CounterId	TokenNameIdentifier
.	TokenNameDOT
CounterIdRecord	TokenNameIdentifier
>	TokenNameGREATER
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
removeOldShards	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
.	TokenNameDOT
merge	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
.	TokenNameDOT
context	TokenNameIdentifier
,	TokenNameCOMMA
merger	TokenNameIdentifier
,	TokenNameCOMMA
HeapAllocator	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
now	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"RemoveOldShards should throw an exception if the current id is non-sensical"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
RuntimeException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
CounterId	TokenNameIdentifier
.	TokenNameDOT
renewLocalId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
merger	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
.	TokenNameDOT
computeOldShardMerger	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
.	TokenNameDOT
context	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
<	TokenNameLESS
CounterId	TokenNameIdentifier
.	TokenNameDOT
CounterIdRecord	TokenNameIdentifier
>	TokenNameGREATER
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
cleaned	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
.	TokenNameDOT
removeOldShards	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
.	TokenNameDOT
merge	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
.	TokenNameDOT
context	TokenNameIdentifier
,	TokenNameCOMMA
merger	TokenNameIdentifier
,	TokenNameCOMMA
HeapAllocator	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
now	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
ctx	TokenNameIdentifier
.	TokenNameDOT
total	TokenNameIdentifier
(	TokenNameLPAREN
cleaned	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
11	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
ContextState	TokenNameIdentifier
state2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ContextState	TokenNameIdentifier
(	TokenNameLPAREN
cleaned	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
state2	TokenNameIdentifier
.	TokenNameDOT
hasRemaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
state2	TokenNameIdentifier
.	TokenNameDOT
getClock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
state2	TokenNameIdentifier
.	TokenNameDOT
getCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
state2	TokenNameIdentifier
.	TokenNameDOT
moveToNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ByteBuffer	TokenNameIdentifier
onRemote	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
.	TokenNameDOT
merge	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
.	TokenNameDOT
clearAllDelta	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
.	TokenNameDOT
context	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
ctx	TokenNameIdentifier
.	TokenNameDOT
clearAllDelta	TokenNameIdentifier
(	TokenNameLPAREN
cleaned	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
HeapAllocator	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
ctx	TokenNameIdentifier
.	TokenNameDOT
total	TokenNameIdentifier
(	TokenNameLPAREN
onRemote	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
11	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
