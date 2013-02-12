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
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
dht	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
ISerializer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
service	TokenNameIdentifier
.	TokenNameDOT
StorageService	TokenNameIdentifier
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
abstract	TokenNameabstract
class	TokenNameclass
RowPosition	TokenNameIdentifier
implements	TokenNameimplements
RingPosition	TokenNameIdentifier
<	TokenNameLESS
RowPosition	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
enum	TokenNameenum
Kind	TokenNameIdentifier
{	TokenNameLBRACE
ROW_KEY	TokenNameIdentifier
,	TokenNameCOMMA
MIN_BOUND	TokenNameIdentifier
,	TokenNameCOMMA
MAX_BOUND	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Kind	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
allKinds	TokenNameIdentifier
=	TokenNameEQUAL
Kind	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
Kind	TokenNameIdentifier
fromOrdinal	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ordinal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
allKinds	TokenNameIdentifier
[	TokenNameLBRACKET
ordinal	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
RowPositionSerializer	TokenNameIdentifier
serializer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RowPositionSerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
RowPosition	TokenNameIdentifier
forKey	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
IPartitioner	TokenNameIdentifier
p	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
key	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
p	TokenNameIdentifier
.	TokenNameDOT
getMinimumToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
minKeyBound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
p	TokenNameIdentifier
.	TokenNameDOT
decorateKey	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
Token	TokenNameIdentifier
getToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
Kind	TokenNameIdentifier
kind	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
isMinimum	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
isMinimum	TokenNameIdentifier
(	TokenNameLPAREN
StorageService	TokenNameIdentifier
.	TokenNameDOT
getPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
RowPositionSerializer	TokenNameIdentifier
implements	TokenNameimplements
ISerializer	TokenNameIdentifier
<	TokenNameLESS
RowPosition	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
serialize	TokenNameIdentifier
(	TokenNameLPAREN
RowPosition	TokenNameIdentifier
pos	TokenNameIdentifier
,	TokenNameCOMMA
DataOutput	TokenNameIdentifier
dos	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Kind	TokenNameIdentifier
kind	TokenNameIdentifier
=	TokenNameEQUAL
pos	TokenNameIdentifier
.	TokenNameDOT
kind	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dos	TokenNameIdentifier
.	TokenNameDOT
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
kind	TokenNameIdentifier
.	TokenNameDOT
ordinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
kind	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Kind	TokenNameIdentifier
.	TokenNameDOT
ROW_KEY	TokenNameIdentifier
)	TokenNameRPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
writeWithShortLength	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
DecoratedKey	TokenNameIdentifier
)	TokenNameRPAREN
pos	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
key	TokenNameIdentifier
,	TokenNameCOMMA
dos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
Token	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
.	TokenNameDOT
getToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
dos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RowPosition	TokenNameIdentifier
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
dis	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Kind	TokenNameIdentifier
kind	TokenNameIdentifier
=	TokenNameEQUAL
Kind	TokenNameIdentifier
.	TokenNameDOT
fromOrdinal	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
.	TokenNameDOT
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
kind	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Kind	TokenNameIdentifier
.	TokenNameDOT
ROW_KEY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ByteBuffer	TokenNameIdentifier
k	TokenNameIdentifier
=	TokenNameEQUAL
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
readWithShortLength	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
StorageService	TokenNameIdentifier
.	TokenNameDOT
getPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
decorateKey	TokenNameIdentifier
(	TokenNameLPAREN
k	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
Token	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
Token	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
kind	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Kind	TokenNameIdentifier
.	TokenNameDOT
MIN_BOUND	TokenNameIdentifier
?	TokenNameQUESTION
t	TokenNameIdentifier
.	TokenNameDOT
minKeyBound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
t	TokenNameIdentifier
.	TokenNameDOT
maxKeyBound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
RowPosition	TokenNameIdentifier
pos	TokenNameIdentifier
,	TokenNameCOMMA
TypeSizes	TokenNameIdentifier
typeSizes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Kind	TokenNameIdentifier
kind	TokenNameIdentifier
=	TokenNameEQUAL
pos	TokenNameIdentifier
.	TokenNameDOT
kind	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
kind	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Kind	TokenNameIdentifier
.	TokenNameDOT
ROW_KEY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
keySize	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
DecoratedKey	TokenNameIdentifier
)	TokenNameRPAREN
pos	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
key	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
typeSizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
short	TokenNameshort
)	TokenNameRPAREN
keySize	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
keySize	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
Token	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
.	TokenNameDOT
getToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
typeSizes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE