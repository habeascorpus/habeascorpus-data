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
HashMap	TokenNameIdentifier
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
CounterAdder	TokenNameIdentifier
extends	TokenNameextends
Operation	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
CounterAdder	TokenNameIdentifier
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
List	TokenNameIdentifier
<	TokenNameLESS
CounterColumn	TokenNameIdentifier
>	TokenNameGREATER
columns	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
CounterColumn	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
CounterSuperColumn	TokenNameIdentifier
>	TokenNameGREATER
superColumns	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
CounterSuperColumn	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
format	TokenNameIdentifier
=	TokenNameEQUAL
"%0"	TokenNameStringLiteral
+	TokenNamePLUS
session	TokenNameIdentifier
.	TokenNameDOT
getTotalKeysLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"d"	TokenNameStringLiteral
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
session	TokenNameIdentifier
.	TokenNameDOT
getColumnsPerKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
columnName	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
"C"	TokenNameStringLiteral
+	TokenNamePLUS
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
columns	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
CounterColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
columnName	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
1L	TokenNameLongLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
session	TokenNameIdentifier
.	TokenNameDOT
getSuperColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
superColumnName	TokenNameIdentifier
=	TokenNameEQUAL
"S"	TokenNameStringLiteral
+	TokenNamePLUS
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
superColumns	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
CounterSuperColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
superColumnName	TokenNameIdentifier
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
columns	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
String	TokenNameIdentifier
rawKey	TokenNameIdentifier
=	TokenNameEQUAL
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
format	TokenNameIdentifier
,	TokenNameCOMMA
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
record	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
record	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
rawKey	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
session	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilyType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
ColumnFamilyType	TokenNameIdentifier
.	TokenNameDOT
Super	TokenNameIdentifier
?	TokenNameQUESTION
getSuperColumnsMutationMap	TokenNameIdentifier
(	TokenNameLPAREN
superColumns	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
getColumnsMutationMap	TokenNameIdentifier
(	TokenNameLPAREN
columns	TokenNameIdentifier
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
client	TokenNameIdentifier
.	TokenNameDOT
batch_mutate	TokenNameIdentifier
(	TokenNameLPAREN
record	TokenNameIdentifier
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
true	TokenNametrue
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
"Operation [%d] retried %d times - error incrementing key %s %s%n"	TokenNameStringLiteral
,	TokenNameCOMMA
index	TokenNameIdentifier
,	TokenNameCOMMA
session	TokenNameIdentifier
.	TokenNameDOT
getRetryTimes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rawKey	TokenNameIdentifier
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
getAndIncrement	TokenNameIdentifier
(	TokenNameLPAREN
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
}	TokenNameRBRACE
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
getSuperColumnsMutationMap	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
CounterSuperColumn	TokenNameIdentifier
>	TokenNameGREATER
superColumns	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>	TokenNameGREATER
mutations	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
mutationMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
CounterSuperColumn	TokenNameIdentifier
s	TokenNameIdentifier
:	TokenNameCOLON
superColumns	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnOrSuperColumn	TokenNameIdentifier
cosc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColumnOrSuperColumn	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setCounter_super_column	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mutations	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Mutation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setColumn_or_supercolumn	TokenNameIdentifier
(	TokenNameLPAREN
cosc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
mutationMap	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"SuperCounter1"	TokenNameStringLiteral
,	TokenNameCOMMA
mutations	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
mutationMap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
getColumnsMutationMap	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
CounterColumn	TokenNameIdentifier
>	TokenNameGREATER
columns	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>	TokenNameGREATER
mutations	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
mutationMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Mutation	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
CounterColumn	TokenNameIdentifier
c	TokenNameIdentifier
:	TokenNameCOLON
columns	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnOrSuperColumn	TokenNameIdentifier
cosc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColumnOrSuperColumn	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setCounter_column	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mutations	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Mutation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setColumn_or_supercolumn	TokenNameIdentifier
(	TokenNameLPAREN
cosc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
mutationMap	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"Counter1"	TokenNameStringLiteral
,	TokenNameCOMMA
mutations	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
mutationMap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE