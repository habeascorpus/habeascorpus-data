package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
service	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
InetSocketAddress	TokenNameIdentifier
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
db	TokenNameIdentifier
.	TokenNameDOT
DecoratedKey	TokenNameIdentifier
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
RowMutation	TokenNameIdentifier
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
thrift	TokenNameIdentifier
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
utils	TokenNameIdentifier
.	TokenNameDOT
ByteBufferUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CassandraServerTest	TokenNameIdentifier
extends	TokenNameextends
SchemaLoader	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
test_get_count	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
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
ThriftSessionManager	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
setCurrentSocket	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
InetSocketAddress	TokenNameIdentifier
(	TokenNameLPAREN
9160	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DecoratedKey	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
Util	TokenNameIdentifier
.	TokenNameDOT
dk	TokenNameIdentifier
(	TokenNameLPAREN
"testkey"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
3050	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
RowMutation	TokenNameIdentifier
rm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RowMutation	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace1"	TokenNameStringLiteral
,	TokenNameCOMMA
key	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
EMPTY_BYTE_BUFFER	TokenNameIdentifier
,	TokenNameCOMMA
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
CassandraServer	TokenNameIdentifier
server	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CassandraServer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
server	TokenNameIdentifier
.	TokenNameDOT
set_keyspace	TokenNameIdentifier
(	TokenNameLPAREN
"Keyspace1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
server	TokenNameIdentifier
.	TokenNameDOT
get_count	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
ColumnParent	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
predicateWithCount	TokenNameIdentifier
(	TokenNameLPAREN
1024	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
ONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
count	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1024	TokenNameIntegerLiteral
:	TokenNameCOLON
"expected 1024 but was "	TokenNameStringLiteral
+	TokenNamePLUS
count	TokenNameIdentifier
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
server	TokenNameIdentifier
.	TokenNameDOT
get_count	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
ColumnParent	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
predicateWithCount	TokenNameIdentifier
(	TokenNameLPAREN
1025	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
ONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
count	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1025	TokenNameIntegerLiteral
:	TokenNameCOLON
"expected 1025 but was "	TokenNameStringLiteral
+	TokenNamePLUS
count	TokenNameIdentifier
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
server	TokenNameIdentifier
.	TokenNameDOT
get_count	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
ColumnParent	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
predicateWithCount	TokenNameIdentifier
(	TokenNameLPAREN
4000	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
ONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
count	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
3050	TokenNameIntegerLiteral
:	TokenNameCOLON
"expected 3050 but was "	TokenNameStringLiteral
+	TokenNamePLUS
count	TokenNameIdentifier
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
server	TokenNameIdentifier
.	TokenNameDOT
get_count	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
ColumnParent	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
predicateWithCount	TokenNameIdentifier
(	TokenNameLPAREN
3050	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
ONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
count	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
3050	TokenNameIntegerLiteral
:	TokenNameCOLON
"expected 3050 but was "	TokenNameStringLiteral
+	TokenNamePLUS
count	TokenNameIdentifier
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
server	TokenNameIdentifier
.	TokenNameDOT
get_count	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
ColumnParent	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
predicateWithCount	TokenNameIdentifier
(	TokenNameLPAREN
3051	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
ONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
count	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
3050	TokenNameIntegerLiteral
:	TokenNameCOLON
"expected 3050 but was "	TokenNameStringLiteral
+	TokenNamePLUS
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
SlicePredicate	TokenNameIdentifier
predicateWithCount	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
count	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SliceRange	TokenNameIdentifier
range	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SliceRange	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
range	TokenNameIdentifier
.	TokenNameDOT
setStart	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
range	TokenNameIdentifier
.	TokenNameDOT
setFinish	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
range	TokenNameIdentifier
.	TokenNameDOT
setCount	TokenNameIdentifier
(	TokenNameLPAREN
count	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SlicePredicate	TokenNameIdentifier
predicate	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SlicePredicate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
predicate	TokenNameIdentifier
.	TokenNameDOT
setSlice_range	TokenNameIdentifier
(	TokenNameLPAREN
range	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
predicate	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE