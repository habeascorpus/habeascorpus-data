package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
dht	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataOutput	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
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
TypeSizes	TokenNameIdentifier
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
RowPosition	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
IVersionedSerializer	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
Pair	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
extends	TokenNameextends
RingPosition	TokenNameIdentifier
>	TokenNameGREATER
implements	TokenNameimplements
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
1L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
AbstractBoundsSerializer	TokenNameIdentifier
serializer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AbstractBoundsSerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
enum	TokenNameenum
Type	TokenNameIdentifier
{	TokenNameLBRACE
RANGE	TokenNameIdentifier
,	TokenNameCOMMA
BOUNDS	TokenNameIdentifier
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
T	TokenNameIdentifier
left	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
T	TokenNameIdentifier
right	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
transient	TokenNametransient
final	TokenNamefinal
IPartitioner	TokenNameIdentifier
partitioner	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
AbstractBounds	TokenNameIdentifier
(	TokenNameLPAREN
T	TokenNameIdentifier
left	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
right	TokenNameIdentifier
,	TokenNameCOMMA
IPartitioner	TokenNameIdentifier
partitioner	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
left	TokenNameIdentifier
=	TokenNameEQUAL
left	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
right	TokenNameIdentifier
=	TokenNameEQUAL
right	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
partitioner	TokenNameIdentifier
=	TokenNameEQUAL
partitioner	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
Pair	TokenNameIdentifier
<	TokenNameLESS
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
,	TokenNameCOMMA
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
split	TokenNameIdentifier
(	TokenNameLPAREN
T	TokenNameIdentifier
position	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
31	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
left	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
right	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
intersects	TokenNameIdentifier
(	TokenNameLPAREN
Iterable	TokenNameIdentifier
<	TokenNameLESS
Range	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
ranges	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Range	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
range2	TokenNameIdentifier
:	TokenNameCOLON
ranges	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
range2	TokenNameIdentifier
.	TokenNameDOT
intersects	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
boolean	TokenNameboolean
contains	TokenNameIdentifier
(	TokenNameLPAREN
T	TokenNameIdentifier
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
List	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
unwrap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getString	TokenNameIdentifier
(	TokenNameLPAREN
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
keyValidator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getOpeningString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
left	TokenNameIdentifier
,	TokenNameCOMMA
keyValidator	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
", "	TokenNameStringLiteral
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
right	TokenNameIdentifier
,	TokenNameCOMMA
keyValidator	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
getClosingString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
format	TokenNameIdentifier
(	TokenNameLPAREN
T	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
keyValidator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
instanceof	TokenNameinstanceof
DecoratedKey	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
keyValidator	TokenNameIdentifier
.	TokenNameDOT
getString	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
DecoratedKey	TokenNameIdentifier
)	TokenNameRPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
value	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
abstract	TokenNameabstract
String	TokenNameIdentifier
getOpeningString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
abstract	TokenNameabstract
String	TokenNameIdentifier
getClosingString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
RowPosition	TokenNameIdentifier
>	TokenNameGREATER
toRowBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>	TokenNameGREATER
toTokenBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
AbstractBoundsSerializer	TokenNameIdentifier
implements	TokenNameimplements
IVersionedSerializer	TokenNameIdentifier
<	TokenNameLESS
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>>	TokenNameRIGHT_SHIFT
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
serialize	TokenNameIdentifier
(	TokenNameLPAREN
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
range	TokenNameIdentifier
,	TokenNameCOMMA
DataOutput	TokenNameIdentifier
out	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
version	TokenNameIdentifier
<	TokenNameLESS
MessagingService	TokenNameIdentifier
.	TokenNameDOT
VERSION_11	TokenNameIdentifier
)	TokenNameRPAREN
range	TokenNameIdentifier
=	TokenNameEQUAL
range	TokenNameIdentifier
.	TokenNameDOT
toTokenBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
kindInt	TokenNameIdentifier
(	TokenNameLPAREN
range	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
range	TokenNameIdentifier
.	TokenNameDOT
left	TokenNameIdentifier
instanceof	TokenNameinstanceof
Token	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Token	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Token	TokenNameIdentifier
)	TokenNameRPAREN
range	TokenNameIdentifier
.	TokenNameDOT
left	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Token	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Token	TokenNameIdentifier
)	TokenNameRPAREN
range	TokenNameIdentifier
.	TokenNameDOT
right	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
RowPosition	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
RowPosition	TokenNameIdentifier
)	TokenNameRPAREN
range	TokenNameIdentifier
.	TokenNameDOT
left	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
RowPosition	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
RowPosition	TokenNameIdentifier
)	TokenNameRPAREN
range	TokenNameIdentifier
.	TokenNameDOT
right	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
kindInt	TokenNameIdentifier
(	TokenNameLPAREN
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
ab	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
kind	TokenNameIdentifier
=	TokenNameEQUAL
ab	TokenNameIdentifier
instanceof	TokenNameinstanceof
Range	TokenNameIdentifier
?	TokenNameQUESTION
Type	TokenNameIdentifier
.	TokenNameDOT
RANGE	TokenNameIdentifier
.	TokenNameDOT
ordinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
Type	TokenNameIdentifier
.	TokenNameDOT
BOUNDS	TokenNameIdentifier
.	TokenNameDOT
ordinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
ab	TokenNameIdentifier
.	TokenNameDOT
left	TokenNameIdentifier
instanceof	TokenNameinstanceof
Token	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
kind	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
(	TokenNameLPAREN
kind	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
kind	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
in	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
kind	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isToken	TokenNameIdentifier
=	TokenNameEQUAL
kind	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isToken	TokenNameIdentifier
)	TokenNameRPAREN
kind	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
(	TokenNameLPAREN
kind	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
RingPosition	TokenNameIdentifier
left	TokenNameIdentifier
,	TokenNameCOMMA
right	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isToken	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
left	TokenNameIdentifier
=	TokenNameEQUAL
Token	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
right	TokenNameIdentifier
=	TokenNameEQUAL
Token	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
left	TokenNameIdentifier
=	TokenNameEQUAL
RowPosition	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
right	TokenNameIdentifier
=	TokenNameEQUAL
RowPosition	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
kind	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Type	TokenNameIdentifier
.	TokenNameDOT
RANGE	TokenNameIdentifier
.	TokenNameDOT
ordinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
Range	TokenNameIdentifier
(	TokenNameLPAREN
left	TokenNameIdentifier
,	TokenNameCOMMA
right	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
Bounds	TokenNameIdentifier
(	TokenNameLPAREN
left	TokenNameIdentifier
,	TokenNameCOMMA
right	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
AbstractBounds	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
ab	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
kindInt	TokenNameIdentifier
(	TokenNameLPAREN
ab	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ab	TokenNameIdentifier
.	TokenNameDOT
left	TokenNameIdentifier
instanceof	TokenNameinstanceof
Token	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
Token	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Token	TokenNameIdentifier
)	TokenNameRPAREN
ab	TokenNameIdentifier
.	TokenNameDOT
left	TokenNameIdentifier
,	TokenNameCOMMA
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
Token	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Token	TokenNameIdentifier
)	TokenNameRPAREN
ab	TokenNameIdentifier
.	TokenNameDOT
right	TokenNameIdentifier
,	TokenNameCOMMA
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
RowPosition	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
RowPosition	TokenNameIdentifier
)	TokenNameRPAREN
ab	TokenNameIdentifier
.	TokenNameDOT
left	TokenNameIdentifier
,	TokenNameCOMMA
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
RowPosition	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
RowPosition	TokenNameIdentifier
)	TokenNameRPAREN
ab	TokenNameIdentifier
.	TokenNameDOT
right	TokenNameIdentifier
,	TokenNameCOMMA
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
