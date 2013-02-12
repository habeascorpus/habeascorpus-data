package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
script	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MalformedURLException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
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
Iterator	TokenNameIdentifier
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
dom	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
.	TokenNameDOT
SVGOMDocument	TokenNameIdentifier
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
Service	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
InterpreterPool	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
BIND_NAME_DOCUMENT	TokenNameIdentifier
=	TokenNameEQUAL
"document"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
Map	TokenNameIdentifier
defaultFactories	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
Map	TokenNameIdentifier
factories	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
Service	TokenNameIdentifier
.	TokenNameDOT
providers	TokenNameIdentifier
(	TokenNameLPAREN
InterpreterFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
InterpreterFactory	TokenNameIdentifier
factory	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
factory	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
InterpreterFactory	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
mimeTypes	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
getMimeTypes	TokenNameIdentifier
(	TokenNameLPAREN
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
mimeTypes	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
defaultFactories	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
mimeTypes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
factory	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
InterpreterPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
factories	TokenNameIdentifier
.	TokenNameDOT
putAll	TokenNameIdentifier
(	TokenNameLPAREN
defaultFactories	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Interpreter	TokenNameIdentifier
createInterpreter	TokenNameIdentifier
(	TokenNameLPAREN
Document	TokenNameIdentifier
document	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
language	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
InterpreterFactory	TokenNameIdentifier
factory	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
InterpreterFactory	TokenNameIdentifier
)	TokenNameRPAREN
factories	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
language	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
factory	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
Interpreter	TokenNameIdentifier
interpreter	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
SVGOMDocument	TokenNameIdentifier
svgDoc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SVGOMDocument	TokenNameIdentifier
)	TokenNameRPAREN
document	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
URL	TokenNameIdentifier
url	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
URL	TokenNameIdentifier
(	TokenNameLPAREN
svgDoc	TokenNameIdentifier
.	TokenNameDOT
getDocumentURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
interpreter	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
createInterpreter	TokenNameIdentifier
(	TokenNameLPAREN
url	TokenNameIdentifier
,	TokenNameCOMMA
svgDoc	TokenNameIdentifier
.	TokenNameDOT
isSVG12	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
MalformedURLException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
interpreter	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
document	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
interpreter	TokenNameIdentifier
.	TokenNameDOT
bindObject	TokenNameIdentifier
(	TokenNameLPAREN
BIND_NAME_DOCUMENT	TokenNameIdentifier
,	TokenNameCOMMA
document	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
interpreter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
putInterpreterFactory	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
language	TokenNameIdentifier
,	TokenNameCOMMA
InterpreterFactory	TokenNameIdentifier
factory	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
factories	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
language	TokenNameIdentifier
,	TokenNameCOMMA
factory	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
removeInterpreterFactory	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
language	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
factories	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
language	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE