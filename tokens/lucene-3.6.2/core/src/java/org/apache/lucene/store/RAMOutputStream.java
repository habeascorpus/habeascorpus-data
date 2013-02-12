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
public	TokenNamepublic
class	TokenNameclass
RAMOutputStream	TokenNameIdentifier
extends	TokenNameextends
IndexOutput	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
BUFFER_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
1024	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
RAMFile	TokenNameIdentifier
file	TokenNameIdentifier
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
public	TokenNamepublic
RAMOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
new	TokenNamenew
RAMFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RAMOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
RAMFile	TokenNameIdentifier
f	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
file	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
;	TokenNameSEMICOLON
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
public	TokenNamepublic
void	TokenNamevoid
writeTo	TokenNameIdentifier
(	TokenNameLPAREN
IndexOutput	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
long	TokenNamelong
end	TokenNameIdentifier
=	TokenNameEQUAL
file	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
pos	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
buffer	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
pos	TokenNameIdentifier
<	TokenNameLESS
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
BUFFER_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
nextPos	TokenNameIdentifier
=	TokenNameEQUAL
pos	TokenNameIdentifier
+	TokenNamePLUS
length	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextPos	TokenNameIdentifier
>	TokenNameGREATER
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
length	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
end	TokenNameIdentifier
-	TokenNameMINUS
pos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
.	TokenNameDOT
getBuffer	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pos	TokenNameIdentifier
=	TokenNameEQUAL
nextPos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
currentBuffer	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
currentBufferIndex	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
bufferPosition	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
bufferStart	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
bufferLength	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
file	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
setFileLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
pos	TokenNameIdentifier
<	TokenNameLESS
bufferStart	TokenNameIdentifier
||	TokenNameOR_OR
pos	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
bufferStart	TokenNameIdentifier
+	TokenNamePLUS
bufferLength	TokenNameIdentifier
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
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
long	TokenNamelong
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
file	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
b	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
bufferPosition	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
bufferLength	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
currentBufferIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
switchCurrentBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
currentBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
bufferPosition	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
b	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
writeBytes	TokenNameIdentifier
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
assert	TokenNameassert
b	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
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
==	TokenNameEQUAL_EQUAL
bufferLength	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
currentBufferIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
switchCurrentBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
remainInBuffer	TokenNameIdentifier
=	TokenNameEQUAL
currentBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
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
b	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
currentBuffer	TokenNameIdentifier
,	TokenNameCOMMA
bufferPosition	TokenNameIdentifier
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
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
currentBufferIndex	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
file	TokenNameIdentifier
.	TokenNameDOT
numBuffers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
currentBuffer	TokenNameIdentifier
=	TokenNameEQUAL
file	TokenNameIdentifier
.	TokenNameDOT
addBuffer	TokenNameIdentifier
(	TokenNameLPAREN
BUFFER_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
}	TokenNameRBRACE
bufferPosition	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
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
bufferLength	TokenNameIdentifier
=	TokenNameEQUAL
currentBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
setFileLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
pointer	TokenNameIdentifier
=	TokenNameEQUAL
bufferStart	TokenNameIdentifier
+	TokenNamePLUS
bufferPosition	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
pointer	TokenNameIdentifier
>	TokenNameGREATER
file	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
file	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
pointer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
file	TokenNameIdentifier
.	TokenNameDOT
setLastModified	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setFileLength	TokenNameIdentifier
(	TokenNameLPAREN
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
public	TokenNamepublic
long	TokenNamelong
sizeInBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
long	TokenNamelong
)	TokenNameRPAREN
file	TokenNameIdentifier
.	TokenNameDOT
numBuffers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
(	TokenNameLPAREN
long	TokenNamelong
)	TokenNameRPAREN
BUFFER_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
copyBytes	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
input	TokenNameIdentifier
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
while	TokenNamewhile
(	TokenNameLPAREN
numBytes	TokenNameIdentifier
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
currentBufferIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
switchCurrentBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
toCopy	TokenNameIdentifier
=	TokenNameEQUAL
currentBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
bufferPosition	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
numBytes	TokenNameIdentifier
<	TokenNameLESS
toCopy	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
toCopy	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
numBytes	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
input	TokenNameIdentifier
.	TokenNameDOT
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
currentBuffer	TokenNameIdentifier
,	TokenNameCOMMA
bufferPosition	TokenNameIdentifier
,	TokenNameCOMMA
toCopy	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
numBytes	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
toCopy	TokenNameIdentifier
;	TokenNameSEMICOLON
bufferPosition	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
toCopy	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE