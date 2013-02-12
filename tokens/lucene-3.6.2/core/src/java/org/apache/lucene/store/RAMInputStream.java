package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
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
EOFException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
RAMInputStream	TokenNameIdentifier
extends	TokenNameextends
IndexInput	TokenNameIdentifier
implements	TokenNameimplements
Cloneable	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
BUFFER_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
RAMOutputStream	TokenNameIdentifier
.	TokenNameDOT
BUFFER_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
RAMFile	TokenNameIdentifier
file	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
length	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
currentBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
currentBufferIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
bufferPosition	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
bufferStart	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
bufferLength	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
RAMInputStream	TokenNameIdentifier
(	TokenNameLPAREN
RAMFile	TokenNameIdentifier
f	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
"anonymous"	TokenNameStringLiteral
,	TokenNameCOMMA
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RAMInputStream	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
RAMFile	TokenNameIdentifier
f	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
"RAMInputStream(name="	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
file	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
;	TokenNameSEMICOLON
length	TokenNameIdentifier
=	TokenNameEQUAL
file	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
length	TokenNameIdentifier
/	TokenNameDIVIDE
BUFFER_SIZE	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"RAMInputStream too large length="	TokenNameStringLiteral
+	TokenNamePLUS
length	TokenNameIdentifier
+	TokenNamePLUS
": "	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
currentBufferIndex	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
currentBuffer	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
long	TokenNamelong
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
byte	TokenNamebyte
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
bufferPosition	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
bufferLength	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
currentBufferIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
switchCurrentBuffer	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
currentBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
bufferPosition	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
b	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
bufferPosition	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
bufferLength	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
currentBufferIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
switchCurrentBuffer	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
remainInBuffer	TokenNameIdentifier
=	TokenNameEQUAL
bufferLength	TokenNameIdentifier
-	TokenNameMINUS
bufferPosition	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
bytesToCopy	TokenNameIdentifier
=	TokenNameEQUAL
len	TokenNameIdentifier
<	TokenNameLESS
remainInBuffer	TokenNameIdentifier
?	TokenNameQUESTION
len	TokenNameIdentifier
:	TokenNameCOLON
remainInBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
currentBuffer	TokenNameIdentifier
,	TokenNameCOMMA
bufferPosition	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
bytesToCopy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
bytesToCopy	TokenNameIdentifier
;	TokenNameSEMICOLON
len	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
bytesToCopy	TokenNameIdentifier
;	TokenNameSEMICOLON
bufferPosition	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
bytesToCopy	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
void	TokenNamevoid
switchCurrentBuffer	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
enforceEOF	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
bufferStart	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
long	TokenNamelong
)	TokenNameRPAREN
BUFFER_SIZE	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
long	TokenNamelong
)	TokenNameRPAREN
currentBufferIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
currentBufferIndex	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
file	TokenNameIdentifier
.	TokenNameDOT
numBuffers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
enforceEOF	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
EOFException	TokenNameIdentifier
(	TokenNameLPAREN
"read past EOF: "	TokenNameStringLiteral
+	TokenNamePLUS
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
currentBufferIndex	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
bufferPosition	TokenNameIdentifier
=	TokenNameEQUAL
BUFFER_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
currentBuffer	TokenNameIdentifier
=	TokenNameEQUAL
file	TokenNameIdentifier
.	TokenNameDOT
getBuffer	TokenNameIdentifier
(	TokenNameLPAREN
currentBufferIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bufferPosition	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
long	TokenNamelong
buflen	TokenNameIdentifier
=	TokenNameEQUAL
length	TokenNameIdentifier
-	TokenNameMINUS
bufferStart	TokenNameIdentifier
;	TokenNameSEMICOLON
bufferLength	TokenNameIdentifier
=	TokenNameEQUAL
buflen	TokenNameIdentifier
>	TokenNameGREATER
BUFFER_SIZE	TokenNameIdentifier
?	TokenNameQUESTION
BUFFER_SIZE	TokenNameIdentifier
:	TokenNameCOLON
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
buflen	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
copyBytes	TokenNameIdentifier
(	TokenNameLPAREN
IndexOutput	TokenNameIdentifier
out	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
numBytes	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
assert	TokenNameassert
numBytes	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
:	TokenNameCOLON
"numBytes="	TokenNameStringLiteral
+	TokenNamePLUS
numBytes	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
left	TokenNameIdentifier
=	TokenNameEQUAL
numBytes	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
left	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
bufferPosition	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
bufferLength	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
++	TokenNamePLUS_PLUS
currentBufferIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
switchCurrentBuffer	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
bytesInBuffer	TokenNameIdentifier
=	TokenNameEQUAL
bufferLength	TokenNameIdentifier
-	TokenNameMINUS
bufferPosition	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
toCopy	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
bytesInBuffer	TokenNameIdentifier
<	TokenNameLESS
left	TokenNameIdentifier
?	TokenNameQUESTION
bytesInBuffer	TokenNameIdentifier
:	TokenNameCOLON
left	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
currentBuffer	TokenNameIdentifier
,	TokenNameCOMMA
bufferPosition	TokenNameIdentifier
,	TokenNameCOMMA
toCopy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bufferPosition	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
toCopy	TokenNameIdentifier
;	TokenNameSEMICOLON
left	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
toCopy	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
left	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
:	TokenNameCOLON
"Insufficient bytes to copy: numBytes="	TokenNameStringLiteral
+	TokenNamePLUS
numBytes	TokenNameIdentifier
+	TokenNamePLUS
" copied="	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
numBytes	TokenNameIdentifier
-	TokenNameMINUS
left	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
long	TokenNamelong
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
currentBufferIndex	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
bufferStart	TokenNameIdentifier
+	TokenNamePLUS
bufferPosition	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
seek	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
pos	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
currentBuffer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
pos	TokenNameIdentifier
<	TokenNameLESS
bufferStart	TokenNameIdentifier
||	TokenNameOR_OR
pos	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
bufferStart	TokenNameIdentifier
+	TokenNamePLUS
BUFFER_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
currentBufferIndex	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
pos	TokenNameIdentifier
/	TokenNameDIVIDE
BUFFER_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switchCurrentBuffer	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
bufferPosition	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
pos	TokenNameIdentifier
%	TokenNameREMAINDER
BUFFER_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
