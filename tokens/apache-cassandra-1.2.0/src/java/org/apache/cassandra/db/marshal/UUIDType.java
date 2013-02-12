package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
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
text	TokenNameIdentifier
.	TokenNameDOT
ParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
UUID	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql	TokenNameIdentifier
.	TokenNameDOT
jdbc	TokenNameIdentifier
.	TokenNameDOT
JdbcUUID	TokenNameIdentifier
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
FBUtilities	TokenNameIdentifier
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
UUIDGen	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
time	TokenNameIdentifier
.	TokenNameDOT
DateUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql	TokenNameIdentifier
.	TokenNameDOT
jdbc	TokenNameIdentifier
.	TokenNameDOT
JdbcDate	TokenNameIdentifier
.	TokenNameDOT
iso8601Patterns	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
UUIDType	TokenNameIdentifier
extends	TokenNameextends
AbstractType	TokenNameIdentifier
<	TokenNameLESS
UUID	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
UUIDType	TokenNameIdentifier
instance	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UUIDType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUIDType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
b1	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
b2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
b1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
b1	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
b2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
b2	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
b2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
b2	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
s1	TokenNameIdentifier
=	TokenNameEQUAL
b1	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
s2	TokenNameIdentifier
=	TokenNameEQUAL
b2	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
v1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
b1	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
s1	TokenNameIdentifier
+	TokenNamePLUS
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
>>	TokenNameRIGHT_SHIFT
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0x0f	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
v2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
b2	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
s2	TokenNameIdentifier
+	TokenNamePLUS
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
>>	TokenNameRIGHT_SHIFT
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0x0f	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
v1	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
v2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
v1	TokenNameIdentifier
-	TokenNameMINUS
v2	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
v1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
c	TokenNameIdentifier
=	TokenNameEQUAL
compareTimestampBytes	TokenNameIdentifier
(	TokenNameLPAREN
b1	TokenNameIdentifier
,	TokenNameCOMMA
b2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
c	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
16	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
c	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
b1	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
s1	TokenNameIdentifier
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
(	TokenNameLPAREN
b2	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
s2	TokenNameIdentifier
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
c	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
compareTimestampBytes	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
o1	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
o2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
o1Pos	TokenNameIdentifier
=	TokenNameEQUAL
o1	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
o2Pos	TokenNameIdentifier
=	TokenNameEQUAL
o2	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
o1	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o1Pos	TokenNameIdentifier
+	TokenNamePLUS
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xF	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
o2	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o2Pos	TokenNameIdentifier
+	TokenNamePLUS
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
d	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
o1	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o1Pos	TokenNameIdentifier
+	TokenNamePLUS
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
o2	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o2Pos	TokenNameIdentifier
+	TokenNamePLUS
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
d	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
o1	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o1Pos	TokenNameIdentifier
+	TokenNamePLUS
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
o2	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o2Pos	TokenNameIdentifier
+	TokenNamePLUS
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
d	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
o1	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o1Pos	TokenNameIdentifier
+	TokenNamePLUS
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
o2	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o2Pos	TokenNameIdentifier
+	TokenNamePLUS
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
d	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
o1	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o1Pos	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
o2	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o2Pos	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
d	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
o1	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o1Pos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
o2	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o2Pos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
d	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
o1	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o1Pos	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
o2	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o2Pos	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
d	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
o1	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o1Pos	TokenNameIdentifier
+	TokenNamePLUS
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
o2	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
o2Pos	TokenNameIdentifier
+	TokenNamePLUS
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
UUID	TokenNameIdentifier
compose	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
JdbcUUID	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
compose	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
validate	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
bytes	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
bytes	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MarshalException	TokenNameIdentifier
(	TokenNameLPAREN
"UUIDs must be exactly 16 bytes"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getString	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
JdbcUUID	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getString	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql	TokenNameIdentifier
.	TokenNameDOT
jdbc	TokenNameIdentifier
.	TokenNameDOT
MarshalException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MarshalException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ByteBuffer	TokenNameIdentifier
decompose	TokenNameIdentifier
(	TokenNameLPAREN
UUID	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
JdbcUUID	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
ByteBuffer	TokenNameIdentifier
fromString	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
source	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MarshalException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
source	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
EMPTY_BYTE_BUFFER	TokenNameIdentifier
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
idBytes	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
TimeUUIDType	TokenNameIdentifier
.	TokenNameDOT
regexPattern	TokenNameIdentifier
.	TokenNameDOT
matcher	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
matches	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
UUID	TokenNameIdentifier
uuid	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
uuid	TokenNameIdentifier
=	TokenNameEQUAL
UUID	TokenNameIdentifier
.	TokenNameDOT
fromString	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
idBytes	TokenNameIdentifier
=	TokenNameEQUAL
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
uuid	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MarshalException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"unable to make UUID from '%s'"	TokenNameStringLiteral
,	TokenNameCOMMA
source	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
source	TokenNameIdentifier
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"now"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
idBytes	TokenNameIdentifier
=	TokenNameEQUAL
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUIDBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
source	TokenNameIdentifier
.	TokenNameDOT
matches	TokenNameIdentifier
(	TokenNameLPAREN
"^\d+$"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
idBytes	TokenNameIdentifier
=	TokenNameEQUAL
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUIDBytes	TokenNameIdentifier
(	TokenNameLPAREN
Long	TokenNameIdentifier
.	TokenNameDOT
parseLong	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NumberFormatException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MarshalException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"unable to make version 1 UUID from '%s'"	TokenNameStringLiteral
,	TokenNameCOMMA
source	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
long	TokenNamelong
timestamp	TokenNameIdentifier
=	TokenNameEQUAL
DateUtils	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
,	TokenNameCOMMA
iso8601Patterns	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
idBytes	TokenNameIdentifier
=	TokenNameEQUAL
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUIDBytes	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ParseException	TokenNameIdentifier
e1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MarshalException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"unable to coerce '%s' to version 1 UUID"	TokenNameStringLiteral
,	TokenNameCOMMA
source	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
e1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
idBytes	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
