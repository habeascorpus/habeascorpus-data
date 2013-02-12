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
ByteArrayInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataInputStream	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
sstable	TokenNameIdentifier
.	TokenNameDOT
ColumnStats	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
DataOutputBuffer	TokenNameIdentifier
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
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MessagingService	TokenNameIdentifier
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
assertEquals	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
HeapAllocator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ColumnFamilyTest	TokenNameIdentifier
extends	TokenNameextends
SchemaLoader	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
int	TokenNameint
version	TokenNameIdentifier
=	TokenNameEQUAL
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testSingleColumn	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
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
"C"	TokenNameStringLiteral
,	TokenNameCOMMA
"v"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataOutputBuffer	TokenNameIdentifier
bufOut	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataOutputBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
bufOut	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteArrayInputStream	TokenNameIdentifier
bufIn	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteArrayInputStream	TokenNameIdentifier
(	TokenNameLPAREN
bufOut	TokenNameIdentifier
.	TokenNameDOT
getData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
bufOut	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
=	TokenNameEQUAL
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DataInputStream	TokenNameIdentifier
(	TokenNameLPAREN
bufIn	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
cf	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
cf	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
cfName	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
cf	TokenNameIdentifier
.	TokenNameDOT
getSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testManyColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
;	TokenNameSEMICOLON
TreeMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
map	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
map	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
"Avinash Lakshman is a good man: "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
DataOutputBuffer	TokenNameIdentifier
bufOut	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataOutputBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
cName	TokenNameIdentifier
:	TokenNameCOLON
map	TokenNameIdentifier
.	TokenNameDOT
navigableKeySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
(	TokenNameLPAREN
cName	TokenNameIdentifier
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
cName	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
314	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
,	TokenNameCOMMA
bufOut	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteArrayInputStream	TokenNameIdentifier
bufIn	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteArrayInputStream	TokenNameIdentifier
(	TokenNameLPAREN
bufOut	TokenNameIdentifier
.	TokenNameDOT
getData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
bufOut	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
=	TokenNameEQUAL
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DataInputStream	TokenNameIdentifier
(	TokenNameLPAREN
bufIn	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
cName	TokenNameIdentifier
:	TokenNameCOLON
map	TokenNameIdentifier
.	TokenNameDOT
navigableKeySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ByteBuffer	TokenNameIdentifier
val	TokenNameIdentifier
=	TokenNameEQUAL
cf	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
cName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
.	TokenNameDOT
array	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
val	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
val	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
map	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
cName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
cf	TokenNameIdentifier
.	TokenNameDOT
getColumnNames	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
map	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testGetColumnCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnFamily	TokenNameIdentifier
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
""	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
""	TokenNameStringLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
""	TokenNameStringLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
2	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
cf	TokenNameIdentifier
.	TokenNameDOT
getColumnCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
2	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
cf	TokenNameIdentifier
.	TokenNameDOT
getSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testTimestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnFamily	TokenNameIdentifier
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
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
"val2"	TokenNameStringLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
"val3"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"val2"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testMergeAndAdd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnFamily	TokenNameIdentifier
cf_new	TokenNameIdentifier
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
ColumnFamily	TokenNameIdentifier
cf_old	TokenNameIdentifier
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
ColumnFamily	TokenNameIdentifier
cf_result	TokenNameIdentifier
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
ByteBuffer	TokenNameIdentifier
val	TokenNameIdentifier
=	TokenNameEQUAL
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"sample value"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
val2	TokenNameIdentifier
=	TokenNameEQUAL
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"x value "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf_new	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
QueryPath	TokenNameIdentifier
.	TokenNameDOT
column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
val	TokenNameIdentifier
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf_new	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
QueryPath	TokenNameIdentifier
.	TokenNameDOT
column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
val	TokenNameIdentifier
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf_old	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
QueryPath	TokenNameIdentifier
.	TokenNameDOT
column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
val2	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf_old	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
QueryPath	TokenNameIdentifier
.	TokenNameDOT
column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col3"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
val2	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf_result	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
cf_new	TokenNameIdentifier
,	TokenNameCOMMA
HeapAllocator	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf_result	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
cf_old	TokenNameIdentifier
,	TokenNameCOMMA
HeapAllocator	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
3	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
cf_result	TokenNameIdentifier
.	TokenNameDOT
getColumnCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
"Count is "	TokenNameStringLiteral
+	TokenNamePLUS
cf_new	TokenNameIdentifier
.	TokenNameDOT
getColumnCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
val	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
cf_result	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf_result	TokenNameIdentifier
.	TokenNameDOT
addTombstone	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
cf_result	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf_result	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
QueryPath	TokenNameIdentifier
.	TokenNameDOT
column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
val2	TokenNameIdentifier
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
cf_result	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf_result	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
QueryPath	TokenNameIdentifier
.	TokenNameDOT
column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col3"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
val	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
cf_result	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col3"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
val2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf_result	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
QueryPath	TokenNameIdentifier
.	TokenNameDOT
column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col3"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"z"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
cf_result	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"col3"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"z"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
testSuperColumnResolution	TokenNameIdentifier
(	TokenNameLPAREN
ISortedColumns	TokenNameIdentifier
.	TokenNameDOT
Factory	TokenNameIdentifier
factory	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
=	TokenNameEQUAL
Table	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace1"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
getColumnFamilyStore	TokenNameIdentifier
(	TokenNameLPAREN
"Super1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
=	TokenNameEQUAL
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
cfs	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
,	TokenNameCOMMA
factory	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
superColumnName	TokenNameIdentifier
=	TokenNameEQUAL
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"sc"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
subColumnName	TokenNameIdentifier
=	TokenNameEQUAL
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
1L	TokenNameLongLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Column	TokenNameIdentifier
first	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
subColumnName	TokenNameIdentifier
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"one"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
1L	TokenNameLongLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Column	TokenNameIdentifier
second	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
subColumnName	TokenNameIdentifier
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"two"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
2L	TokenNameLongLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
superColumnName	TokenNameIdentifier
,	TokenNameCOMMA
first	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
superColumnName	TokenNameIdentifier
,	TokenNameCOMMA
second	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
second	TokenNameIdentifier
,	TokenNameCOMMA
cf	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
superColumnName	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getSubColumn	TokenNameIdentifier
(	TokenNameLPAREN
subColumnName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
superColumnName	TokenNameIdentifier
,	TokenNameCOMMA
first	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
second	TokenNameIdentifier
,	TokenNameCOMMA
cf	TokenNameIdentifier
.	TokenNameDOT
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
superColumnName	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getSubColumn	TokenNameIdentifier
(	TokenNameLPAREN
subColumnName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testSuperColumnResolution	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
testSuperColumnResolution	TokenNameIdentifier
(	TokenNameLPAREN
TreeMapBackedSortedColumns	TokenNameIdentifier
.	TokenNameDOT
factory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testSuperColumnResolution	TokenNameIdentifier
(	TokenNameLPAREN
AtomicSortedColumns	TokenNameIdentifier
.	TokenNameDOT
factory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testSuperColumnResolution	TokenNameIdentifier
(	TokenNameLPAREN
ArrayBackedSortedColumns	TokenNameIdentifier
.	TokenNameDOT
factory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testColumnStatsRecordsRowDeletesCorrectly	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
long	TokenNamelong
timestamp	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
localDeletionTime	TokenNameIdentifier
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
ColumnFamily	TokenNameIdentifier
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
delete	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DeletionInfo	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
localDeletionTime	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnStats	TokenNameIdentifier
stats	TokenNameIdentifier
=	TokenNameEQUAL
cf	TokenNameIdentifier
.	TokenNameDOT
getColumnStats	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
stats	TokenNameIdentifier
.	TokenNameDOT
maxTimestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
