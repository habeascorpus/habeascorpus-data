package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
stress	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
stress	TokenNameIdentifier
.	TokenNameDOT
Session	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
stress	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
CassandraClient	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
stress	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Operation	TokenNameIdentifier
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
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
MultiGetter	TokenNameIdentifier
extends	TokenNameextends
Operation	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
MultiGetter	TokenNameIdentifier
(	TokenNameLPAREN
Session	TokenNameIdentifier
client	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
client	TokenNameIdentifier
,	TokenNameCOMMA
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
CassandraClient	TokenNameIdentifier
client	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
SlicePredicate	TokenNameIdentifier
predicate	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SlicePredicate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setSlice_range	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SliceRange	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
EMPTY_BYTE_BUFFER	TokenNameIdentifier
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
EMPTY_BYTE_BUFFER	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
session	TokenNameIdentifier
.	TokenNameDOT
getColumnsPerKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
*	TokenNameMULTIPLY
session	TokenNameIdentifier
.	TokenNameDOT
getKeysPerThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
ColumnOrSuperColumn	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
results	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
session	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilyType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
ColumnFamilyType	TokenNameIdentifier
.	TokenNameDOT
Super	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
>	TokenNameGREATER
keys	TokenNameIdentifier
=	TokenNameEQUAL
generateKeys	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
+	TokenNamePLUS
session	TokenNameIdentifier
.	TokenNameDOT
getKeysPerCall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
session	TokenNameIdentifier
.	TokenNameDOT
getSuperColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnParent	TokenNameIdentifier
parent	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColumnParent	TokenNameIdentifier
(	TokenNameLPAREN
"Super1"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
setSuper_column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
"S"	TokenNameStringLiteral
+	TokenNamePLUS
j	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
start	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
success	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
String	TokenNameIdentifier
exceptionMessage	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
t	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
t	TokenNameIdentifier
<	TokenNameLESS
session	TokenNameIdentifier
.	TokenNameDOT
getRetryTimes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
t	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
success	TokenNameIdentifier
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
results	TokenNameIdentifier
=	TokenNameEQUAL
client	TokenNameIdentifier
.	TokenNameDOT
multiget_slice	TokenNameIdentifier
(	TokenNameLPAREN
keys	TokenNameIdentifier
,	TokenNameCOMMA
parent	TokenNameIdentifier
,	TokenNameCOMMA
predicate	TokenNameIdentifier
,	TokenNameCOMMA
session	TokenNameIdentifier
.	TokenNameDOT
getConsistencyLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
success	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
results	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
exceptionMessage	TokenNameIdentifier
=	TokenNameEQUAL
getExceptionMessage	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
success	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
error	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Operation [%d] retried %d times - error on calling multiget_slice for keys %s %s%n"	TokenNameStringLiteral
,	TokenNameCOMMA
index	TokenNameIdentifier
,	TokenNameCOMMA
session	TokenNameIdentifier
.	TokenNameDOT
getRetryTimes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
keys	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
exceptionMessage	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
"("	TokenNameStringLiteral
+	TokenNamePLUS
exceptionMessage	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
session	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
.	TokenNameDOT
getAndIncrement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
session	TokenNameIdentifier
.	TokenNameDOT
keys	TokenNameIdentifier
.	TokenNameDOT
getAndAdd	TokenNameIdentifier
(	TokenNameLPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
session	TokenNameIdentifier
.	TokenNameDOT
latency	TokenNameIdentifier
.	TokenNameDOT
getAndAdd	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
session	TokenNameIdentifier
.	TokenNameDOT
getKeysPerCall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
ColumnParent	TokenNameIdentifier
parent	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColumnParent	TokenNameIdentifier
(	TokenNameLPAREN
"Standard1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
>	TokenNameGREATER
keys	TokenNameIdentifier
=	TokenNameEQUAL
generateKeys	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
+	TokenNamePLUS
session	TokenNameIdentifier
.	TokenNameDOT
getKeysPerCall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
start	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
success	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
String	TokenNameIdentifier
exceptionMessage	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
t	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
t	TokenNameIdentifier
<	TokenNameLESS
session	TokenNameIdentifier
.	TokenNameDOT
getRetryTimes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
t	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
success	TokenNameIdentifier
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
results	TokenNameIdentifier
=	TokenNameEQUAL
client	TokenNameIdentifier
.	TokenNameDOT
multiget_slice	TokenNameIdentifier
(	TokenNameLPAREN
keys	TokenNameIdentifier
,	TokenNameCOMMA
parent	TokenNameIdentifier
,	TokenNameCOMMA
predicate	TokenNameIdentifier
,	TokenNameCOMMA
session	TokenNameIdentifier
.	TokenNameDOT
getConsistencyLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
success	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
results	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
exceptionMessage	TokenNameIdentifier
=	TokenNameEQUAL
getExceptionMessage	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
success	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
success	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
error	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Operation [%d] retried %d times - error on calling multiget_slice for keys %s %s%n"	TokenNameStringLiteral
,	TokenNameCOMMA
index	TokenNameIdentifier
,	TokenNameCOMMA
session	TokenNameIdentifier
.	TokenNameDOT
getRetryTimes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
keys	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
exceptionMessage	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
"("	TokenNameStringLiteral
+	TokenNamePLUS
exceptionMessage	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
session	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
.	TokenNameDOT
getAndIncrement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
session	TokenNameIdentifier
.	TokenNameDOT
keys	TokenNameIdentifier
.	TokenNameDOT
getAndAdd	TokenNameIdentifier
(	TokenNameLPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
session	TokenNameIdentifier
.	TokenNameDOT
latency	TokenNameIdentifier
.	TokenNameDOT
getAndAdd	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
session	TokenNameIdentifier
.	TokenNameDOT
getKeysPerCall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
>	TokenNameGREATER
generateKeys	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
limit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
>	TokenNameGREATER
keys	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
start	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
limit	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
keys	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
generateKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
keys	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
