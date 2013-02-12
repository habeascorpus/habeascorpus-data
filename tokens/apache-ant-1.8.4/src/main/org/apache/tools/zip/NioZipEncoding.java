package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
zip	TokenNameIdentifier
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
nio	TokenNameIdentifier
.	TokenNameDOT
CharBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
charset	TokenNameIdentifier
.	TokenNameDOT
Charset	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
charset	TokenNameIdentifier
.	TokenNameDOT
CharsetEncoder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
charset	TokenNameIdentifier
.	TokenNameDOT
CoderResult	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
charset	TokenNameIdentifier
.	TokenNameDOT
CodingErrorAction	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
NioZipEncoding	TokenNameIdentifier
implements	TokenNameimplements
ZipEncoding	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Charset	TokenNameIdentifier
charset	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
NioZipEncoding	TokenNameIdentifier
(	TokenNameLPAREN
Charset	TokenNameIdentifier
charset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
charset	TokenNameIdentifier
=	TokenNameEQUAL
charset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
canEncode	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CharsetEncoder	TokenNameIdentifier
enc	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
charset	TokenNameIdentifier
.	TokenNameDOT
newEncoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
enc	TokenNameIdentifier
.	TokenNameDOT
onMalformedInput	TokenNameIdentifier
(	TokenNameLPAREN
CodingErrorAction	TokenNameIdentifier
.	TokenNameDOT
REPORT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
enc	TokenNameIdentifier
.	TokenNameDOT
onUnmappableCharacter	TokenNameIdentifier
(	TokenNameLPAREN
CodingErrorAction	TokenNameIdentifier
.	TokenNameDOT
REPORT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
enc	TokenNameIdentifier
.	TokenNameDOT
canEncode	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ByteBuffer	TokenNameIdentifier
encode	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CharsetEncoder	TokenNameIdentifier
enc	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
charset	TokenNameIdentifier
.	TokenNameDOT
newEncoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
enc	TokenNameIdentifier
.	TokenNameDOT
onMalformedInput	TokenNameIdentifier
(	TokenNameLPAREN
CodingErrorAction	TokenNameIdentifier
.	TokenNameDOT
REPORT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
enc	TokenNameIdentifier
.	TokenNameDOT
onUnmappableCharacter	TokenNameIdentifier
(	TokenNameLPAREN
CodingErrorAction	TokenNameIdentifier
.	TokenNameDOT
REPORT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CharBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
=	TokenNameEQUAL
CharBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
allocate	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
cb	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
CoderResult	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
enc	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
isUnmappable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
isMalformed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
6	TokenNameIntegerLiteral
>	TokenNameGREATER
out	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
=	TokenNameEQUAL
ZipEncodingHelper	TokenNameIdentifier
.	TokenNameDOT
growBuffer	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
res	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
res	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ZipEncodingHelper	TokenNameIdentifier
.	TokenNameDOT
appendSurrogate	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
cb	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
isOverflow	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
=	TokenNameEQUAL
ZipEncodingHelper	TokenNameIdentifier
.	TokenNameDOT
growBuffer	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
isUnderflow	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
enc	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
out	TokenNameIdentifier
.	TokenNameDOT
limit	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
rewind	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
out	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
decode	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
data	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
charset	TokenNameIdentifier
.	TokenNameDOT
newDecoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
onMalformedInput	TokenNameIdentifier
(	TokenNameLPAREN
CodingErrorAction	TokenNameIdentifier
.	TokenNameDOT
REPORT	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
onUnmappableCharacter	TokenNameIdentifier
(	TokenNameLPAREN
CodingErrorAction	TokenNameIdentifier
.	TokenNameDOT
REPORT	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
decode	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
