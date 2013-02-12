package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
EncodingUtilities	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
StreamNormalizingReader	TokenNameIdentifier
extends	TokenNameextends
NormalizingReader	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
CharDecoder	TokenNameIdentifier
charDecoder	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
nextChar	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
line	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
column	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
StreamNormalizingReader	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
is	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
StreamNormalizingReader	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
enc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
enc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
enc	TokenNameIdentifier
=	TokenNameEQUAL
"ISO-8859-1"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
charDecoder	TokenNameIdentifier
=	TokenNameEQUAL
createCharDecoder	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
,	TokenNameCOMMA
enc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
StreamNormalizingReader	TokenNameIdentifier
(	TokenNameLPAREN
Reader	TokenNameIdentifier
r	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
charDecoder	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GenericDecoder	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
StreamNormalizingReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
result	TokenNameIdentifier
=	TokenNameEQUAL
nextChar	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
nextChar	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
13	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
column	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
line	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
column	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
charDecoder	TokenNameIdentifier
.	TokenNameDOT
readChar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
result	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
13	TokenNameIntegerLiteral
:	TokenNameCOLON
column	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
line	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
int	TokenNameint
c	TokenNameIdentifier
=	TokenNameEQUAL
charDecoder	TokenNameIdentifier
.	TokenNameDOT
readChar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
nextChar	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
10	TokenNameIntegerLiteral
:	TokenNameCOLON
column	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
line	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
line	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
column	TokenNameIdentifier
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
charDecoder	TokenNameIdentifier
.	TokenNameDOT
dispose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
charDecoder	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
CharDecoder	TokenNameIdentifier
createCharDecoder	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
enc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
CharDecoderFactory	TokenNameIdentifier
cdf	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CharDecoderFactory	TokenNameIdentifier
)	TokenNameRPAREN
charDecoderFactories	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
enc	TokenNameIdentifier
.	TokenNameDOT
toUpperCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cdf	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
cdf	TokenNameIdentifier
.	TokenNameDOT
createCharDecoder	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
EncodingUtilities	TokenNameIdentifier
.	TokenNameDOT
javaEncoding	TokenNameIdentifier
(	TokenNameLPAREN
enc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
=	TokenNameEQUAL
enc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
GenericDecoder	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
Map	TokenNameIdentifier
charDecoderFactories	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
11	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
CharDecoderFactory	TokenNameIdentifier
cdf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ASCIIDecoderFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
charDecoderFactories	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"ASCII"	TokenNameStringLiteral
,	TokenNameCOMMA
cdf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
charDecoderFactories	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"US-ASCII"	TokenNameStringLiteral
,	TokenNameCOMMA
cdf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
charDecoderFactories	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"ISO-8859-1"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
ISO_8859_1DecoderFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
charDecoderFactories	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
UTF8DecoderFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
charDecoderFactories	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-16"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
UTF16DecoderFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
interface	TokenNameinterface
CharDecoderFactory	TokenNameIdentifier
{	TokenNameLBRACE
CharDecoder	TokenNameIdentifier
createCharDecoder	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
ASCIIDecoderFactory	TokenNameIdentifier
implements	TokenNameimplements
CharDecoderFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
CharDecoder	TokenNameIdentifier
createCharDecoder	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ASCIIDecoder	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
ISO_8859_1DecoderFactory	TokenNameIdentifier
implements	TokenNameimplements
CharDecoderFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
CharDecoder	TokenNameIdentifier
createCharDecoder	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ISO_8859_1Decoder	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
UTF8DecoderFactory	TokenNameIdentifier
implements	TokenNameimplements
CharDecoderFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
CharDecoder	TokenNameIdentifier
createCharDecoder	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
UTF8Decoder	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
UTF16DecoderFactory	TokenNameIdentifier
implements	TokenNameimplements
CharDecoderFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
CharDecoder	TokenNameIdentifier
createCharDecoder	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
UTF16Decoder	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
