package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
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
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
msg	TokenNameIdentifier
.	TokenNameDOT
XMLMessageFormatter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
MessageFormatter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
ASCIIReader	TokenNameIdentifier
extends	TokenNameextends
Reader	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_BUFFER_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
2048	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
InputStream	TokenNameIdentifier
fInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
MessageFormatter	TokenNameIdentifier
fFormatter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Locale	TokenNameIdentifier
fLocale	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ASCIIReader	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
inputStream	TokenNameIdentifier
,	TokenNameCOMMA
MessageFormatter	TokenNameIdentifier
messageFormatter	TokenNameIdentifier
,	TokenNameCOMMA
Locale	TokenNameIdentifier
locale	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
inputStream	TokenNameIdentifier
,	TokenNameCOMMA
DEFAULT_BUFFER_SIZE	TokenNameIdentifier
,	TokenNameCOMMA
messageFormatter	TokenNameIdentifier
,	TokenNameCOMMA
locale	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ASCIIReader	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
inputStream	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
size	TokenNameIdentifier
,	TokenNameCOMMA
MessageFormatter	TokenNameIdentifier
messageFormatter	TokenNameIdentifier
,	TokenNameCOMMA
Locale	TokenNameIdentifier
locale	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
inputStream	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
messageFormatter	TokenNameIdentifier
,	TokenNameCOMMA
locale	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ASCIIReader	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
inputStream	TokenNameIdentifier
,	TokenNameCOMMA
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
MessageFormatter	TokenNameIdentifier
messageFormatter	TokenNameIdentifier
,	TokenNameCOMMA
Locale	TokenNameIdentifier
locale	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fInputStream	TokenNameIdentifier
=	TokenNameEQUAL
inputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
fBuffer	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
;	TokenNameSEMICOLON
fFormatter	TokenNameIdentifier
=	TokenNameEQUAL
messageFormatter	TokenNameIdentifier
;	TokenNameSEMICOLON
fLocale	TokenNameIdentifier
=	TokenNameEQUAL
locale	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
b0	TokenNameIdentifier
=	TokenNameEQUAL
fInputStream	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
b0	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0x80	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MalformedByteSequenceException	TokenNameIdentifier
(	TokenNameLPAREN
fFormatter	TokenNameIdentifier
,	TokenNameCOMMA
fLocale	TokenNameIdentifier
,	TokenNameCOMMA
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XML_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"InvalidASCII"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
b0	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
b0	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
read	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
ch	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
length	TokenNameIdentifier
>	TokenNameGREATER
fBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
length	TokenNameIdentifier
=	TokenNameEQUAL
fBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
fInputStream	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
fBuffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
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
count	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
b0	TokenNameIdentifier
=	TokenNameEQUAL
fBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
b0	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MalformedByteSequenceException	TokenNameIdentifier
(	TokenNameLPAREN
fFormatter	TokenNameIdentifier
,	TokenNameCOMMA
fLocale	TokenNameIdentifier
,	TokenNameCOMMA
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XML_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"InvalidASCII"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
b0	TokenNameIdentifier
&	TokenNameAND
0x0FF	TokenNameIntegerLiteral
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ch	TokenNameIdentifier
[	TokenNameLBRACKET
offset	TokenNameIdentifier
+	TokenNamePLUS
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
b0	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
skip	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
n	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
fInputStream	TokenNameIdentifier
.	TokenNameDOT
skip	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
ready	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
markSupported	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fInputStream	TokenNameIdentifier
.	TokenNameDOT
markSupported	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
mark	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
readAheadLimit	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
fInputStream	TokenNameIdentifier
.	TokenNameDOT
mark	TokenNameIdentifier
(	TokenNameLPAREN
readAheadLimit	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
fInputStream	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
fInputStream	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
