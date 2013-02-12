package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
sstable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
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
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Comparator	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
FileDataInput	TokenNameIdentifier
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
FileMark	TokenNameIdentifier
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
FileUtils	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
IndexHelper	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
skipBloomFilter	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
in	TokenNameIdentifier
instanceof	TokenNameinstanceof
FileDataInput	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
skipBytesFully	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
skip	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
readFully	TokenNameIdentifier
(	TokenNameLPAREN
skip	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
skipIndex	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
columnIndexSize	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
in	TokenNameIdentifier
instanceof	TokenNameinstanceof
FileDataInput	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
skipBytesFully	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
columnIndexSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
skip	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
columnIndexSize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
readFully	TokenNameIdentifier
(	TokenNameLPAREN
skip	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
List	TokenNameIdentifier
<	TokenNameLESS
IndexInfo	TokenNameIdentifier
>	TokenNameGREATER
deserializeIndex	TokenNameIdentifier
(	TokenNameLPAREN
FileDataInput	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
columnIndexSize	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
columnIndexSize	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
<	TokenNameLESS
IndexInfo	TokenNameIdentifier
>	TokenNameGREATER
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ArrayList	TokenNameIdentifier
<	TokenNameLESS
IndexInfo	TokenNameIdentifier
>	TokenNameGREATER
indexList	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
IndexInfo	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FileMark	TokenNameIdentifier
mark	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
mark	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
in	TokenNameIdentifier
.	TokenNameDOT
bytesPastMark	TokenNameIdentifier
(	TokenNameLPAREN
mark	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
columnIndexSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
indexList	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
IndexInfo	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
in	TokenNameIdentifier
.	TokenNameDOT
bytesPastMark	TokenNameIdentifier
(	TokenNameLPAREN
mark	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
columnIndexSize	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
indexList	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
IFilter	TokenNameIdentifier
defreezeBloomFilter	TokenNameIdentifier
(	TokenNameLPAREN
FileDataInput	TokenNameIdentifier
file	TokenNameIdentifier
,	TokenNameCOMMA
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
defreezeBloomFilter	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
IFilter	TokenNameIdentifier
defreezeBloomFilter	TokenNameIdentifier
(	TokenNameLPAREN
FileDataInput	TokenNameIdentifier
file	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
maxSize	TokenNameIdentifier
,	TokenNameCOMMA
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
file	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
size	TokenNameIdentifier
>	TokenNameGREATER
maxSize	TokenNameIdentifier
||	TokenNameOR_OR
size	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
EOFException	TokenNameIdentifier
(	TokenNameLPAREN
"bloom filter claims to be "	TokenNameStringLiteral
+	TokenNamePLUS
size	TokenNameIdentifier
+	TokenNamePLUS
" bytes, longer than entire row size "	TokenNameStringLiteral
+	TokenNamePLUS
maxSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
=	TokenNameEQUAL
file	TokenNameIdentifier
.	TokenNameDOT
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataInputStream	TokenNameIdentifier
stream	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataInputStream	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
inputStream	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
stream	TokenNameIdentifier
,	TokenNameCOMMA
type	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
indexFor	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
IndexInfo	TokenNameIdentifier
>	TokenNameGREATER
indexList	TokenNameIdentifier
,	TokenNameCOMMA
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
comparator	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
reversed	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
lastIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
reversed	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
indexList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lastIndex	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
indexList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
IndexInfo	TokenNameIdentifier
target	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexInfo	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
startIdx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
IndexInfo	TokenNameIdentifier
>	TokenNameGREATER
toSearch	TokenNameIdentifier
=	TokenNameEQUAL
indexList	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lastIndex	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
reversed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
startIdx	TokenNameIdentifier
=	TokenNameEQUAL
lastIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
toSearch	TokenNameIdentifier
=	TokenNameEQUAL
indexList	TokenNameIdentifier
.	TokenNameDOT
subList	TokenNameIdentifier
(	TokenNameLPAREN
lastIndex	TokenNameIdentifier
,	TokenNameCOMMA
indexList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
toSearch	TokenNameIdentifier
=	TokenNameEQUAL
indexList	TokenNameIdentifier
.	TokenNameDOT
subList	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
lastIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
Collections	TokenNameIdentifier
.	TokenNameDOT
binarySearch	TokenNameIdentifier
(	TokenNameLPAREN
toSearch	TokenNameIdentifier
,	TokenNameCOMMA
target	TokenNameIdentifier
,	TokenNameCOMMA
getComparator	TokenNameIdentifier
(	TokenNameLPAREN
comparator	TokenNameIdentifier
,	TokenNameCOMMA
reversed	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
startIdx	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
index	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
-	TokenNameMINUS
index	TokenNameIdentifier
-	TokenNameMINUS
(	TokenNameLPAREN
reversed	TokenNameIdentifier
?	TokenNameQUESTION
2	TokenNameIntegerLiteral
:	TokenNameCOLON
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
:	TokenNameCOLON
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Comparator	TokenNameIdentifier
<	TokenNameLESS
IndexInfo	TokenNameIdentifier
>	TokenNameGREATER
getComparator	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
nameComparator	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
reversed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
reversed	TokenNameIdentifier
?	TokenNameQUESTION
nameComparator	TokenNameIdentifier
.	TokenNameDOT
indexReverseComparator	TokenNameIdentifier
:	TokenNameCOLON
nameComparator	TokenNameIdentifier
.	TokenNameDOT
indexComparator	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
IndexInfo	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
long	TokenNamelong
width	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
ByteBuffer	TokenNameIdentifier
lastName	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
ByteBuffer	TokenNameIdentifier
firstName	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
long	TokenNamelong
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
IndexInfo	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
firstName	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
lastName	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
offset	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
width	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
firstName	TokenNameIdentifier
=	TokenNameEQUAL
firstName	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
lastName	TokenNameIdentifier
=	TokenNameEQUAL
lastName	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
offset	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
width	TokenNameIdentifier
=	TokenNameEQUAL
width	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
serialize	TokenNameIdentifier
(	TokenNameLPAREN
DataOutput	TokenNameIdentifier
dos	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
writeWithShortLength	TokenNameIdentifier
(	TokenNameLPAREN
firstName	TokenNameIdentifier
,	TokenNameCOMMA
dos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
writeWithShortLength	TokenNameIdentifier
(	TokenNameLPAREN
lastName	TokenNameIdentifier
,	TokenNameCOMMA
dos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dos	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dos	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
width	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
TypeSizes	TokenNameIdentifier
typeSizes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
firstNameSize	TokenNameIdentifier
=	TokenNameEQUAL
firstName	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
lastNameSize	TokenNameIdentifier
=	TokenNameEQUAL
lastName	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
typeSizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
short	TokenNameshort
)	TokenNameRPAREN
firstNameSize	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
firstNameSize	TokenNameIdentifier
+	TokenNamePLUS
typeSizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
short	TokenNameshort
)	TokenNameRPAREN
lastNameSize	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
lastNameSize	TokenNameIdentifier
+	TokenNamePLUS
typeSizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
typeSizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
width	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
IndexInfo	TokenNameIdentifier
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
dis	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
IndexInfo	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
readWithShortLength	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
readWithShortLength	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
dis	TokenNameIdentifier
.	TokenNameDOT
readLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
dis	TokenNameIdentifier
.	TokenNameDOT
readLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE