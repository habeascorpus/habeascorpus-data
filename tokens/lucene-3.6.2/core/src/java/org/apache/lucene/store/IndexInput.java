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
Closeable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
IndexInput	TokenNameIdentifier
extends	TokenNameextends
DataInput	TokenNameIdentifier
implements	TokenNameimplements
Cloneable	TokenNameIdentifier
,	TokenNameCOMMA
Closeable	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
skipChars	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
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
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
byte	TokenNamebyte
b	TokenNameIdentifier
=	TokenNameEQUAL
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
b	TokenNameIdentifier
&	TokenNameAND
0x80	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
b	TokenNameIdentifier
&	TokenNameAND
0xE0	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0xE0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
resourceDescription	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
protected	TokenNameprotected
IndexInput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
"anonymous IndexInput"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
IndexInput	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
resourceDescription	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
resourceDescription	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"resourceDescription must not be null"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
resourceDescription	TokenNameIdentifier
=	TokenNameEQUAL
resourceDescription	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
long	TokenNamelong
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
void	TokenNamevoid
seek	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
pos	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
long	TokenNamelong
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
byte	TokenNamebyte
copyBuf	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
BufferedIndexInput	TokenNameIdentifier
.	TokenNameDOT
BUFFER_SIZE	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
numBytes	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
toCopy	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
numBytes	TokenNameIdentifier
>	TokenNameGREATER
copyBuf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
?	TokenNameQUESTION
copyBuf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
:	TokenNameCOLON
numBytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
copyBuf	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
toCopy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
copyBuf	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
toCopy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
numBytes	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
toCopy	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
resourceDescription	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE