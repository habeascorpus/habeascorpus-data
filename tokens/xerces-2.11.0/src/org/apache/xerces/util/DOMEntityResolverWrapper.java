package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
StringReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
XMLResourceIdentifier	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
XNIException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
grammars	TokenNameIdentifier
.	TokenNameDOT
XMLGrammarDescription	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
.	TokenNameDOT
XMLEntityResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
.	TokenNameDOT
XMLInputSource	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
ls	TokenNameIdentifier
.	TokenNameDOT
LSInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
ls	TokenNameIdentifier
.	TokenNameDOT
LSResourceResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DOMEntityResolverWrapper	TokenNameIdentifier
implements	TokenNameimplements
XMLEntityResolver	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
XML_TYPE	TokenNameIdentifier
=	TokenNameEQUAL
"http://www.w3.org/TR/REC-xml"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
XSD_TYPE	TokenNameIdentifier
=	TokenNameEQUAL
"http://www.w3.org/2001/XMLSchema"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
LSResourceResolver	TokenNameIdentifier
fEntityResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DOMEntityResolverWrapper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
DOMEntityResolverWrapper	TokenNameIdentifier
(	TokenNameLPAREN
LSResourceResolver	TokenNameIdentifier
entityResolver	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setEntityResolver	TokenNameIdentifier
(	TokenNameLPAREN
entityResolver	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setEntityResolver	TokenNameIdentifier
(	TokenNameLPAREN
LSResourceResolver	TokenNameIdentifier
entityResolver	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fEntityResolver	TokenNameIdentifier
=	TokenNameEQUAL
entityResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
LSResourceResolver	TokenNameIdentifier
getEntityResolver	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fEntityResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XMLInputSource	TokenNameIdentifier
resolveEntity	TokenNameIdentifier
(	TokenNameLPAREN
XMLResourceIdentifier	TokenNameIdentifier
resourceIdentifier	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XNIException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fEntityResolver	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
LSInput	TokenNameIdentifier
inputSource	TokenNameIdentifier
=	TokenNameEQUAL
resourceIdentifier	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
fEntityResolver	TokenNameIdentifier
.	TokenNameDOT
resolveResource	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
:	TokenNameCOLON
fEntityResolver	TokenNameIdentifier
.	TokenNameDOT
resolveResource	TokenNameIdentifier
(	TokenNameLPAREN
getType	TokenNameIdentifier
(	TokenNameLPAREN
resourceIdentifier	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
resourceIdentifier	TokenNameIdentifier
.	TokenNameDOT
getNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
resourceIdentifier	TokenNameIdentifier
.	TokenNameDOT
getPublicId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
resourceIdentifier	TokenNameIdentifier
.	TokenNameDOT
getLiteralSystemId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
resourceIdentifier	TokenNameIdentifier
.	TokenNameDOT
getBaseSystemId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
inputSource	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
publicId	TokenNameIdentifier
=	TokenNameEQUAL
inputSource	TokenNameIdentifier
.	TokenNameDOT
getPublicId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
systemId	TokenNameIdentifier
=	TokenNameEQUAL
inputSource	TokenNameIdentifier
.	TokenNameDOT
getSystemId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
baseSystemId	TokenNameIdentifier
=	TokenNameEQUAL
inputSource	TokenNameIdentifier
.	TokenNameDOT
getBaseURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InputStream	TokenNameIdentifier
byteStream	TokenNameIdentifier
=	TokenNameEQUAL
inputSource	TokenNameIdentifier
.	TokenNameDOT
getByteStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Reader	TokenNameIdentifier
charStream	TokenNameIdentifier
=	TokenNameEQUAL
inputSource	TokenNameIdentifier
.	TokenNameDOT
getCharacterStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
encoding	TokenNameIdentifier
=	TokenNameEQUAL
inputSource	TokenNameIdentifier
.	TokenNameDOT
getEncoding	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
data	TokenNameIdentifier
=	TokenNameEQUAL
inputSource	TokenNameIdentifier
.	TokenNameDOT
getStringData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XMLInputSource	TokenNameIdentifier
xmlInputSource	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XMLInputSource	TokenNameIdentifier
(	TokenNameLPAREN
publicId	TokenNameIdentifier
,	TokenNameCOMMA
systemId	TokenNameIdentifier
,	TokenNameCOMMA
baseSystemId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
charStream	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
xmlInputSource	TokenNameIdentifier
.	TokenNameDOT
setCharacterStream	TokenNameIdentifier
(	TokenNameLPAREN
charStream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
byteStream	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
xmlInputSource	TokenNameIdentifier
.	TokenNameDOT
setByteStream	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
)	TokenNameRPAREN
byteStream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
data	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
data	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
xmlInputSource	TokenNameIdentifier
.	TokenNameDOT
setCharacterStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
xmlInputSource	TokenNameIdentifier
.	TokenNameDOT
setEncoding	TokenNameIdentifier
(	TokenNameLPAREN
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
xmlInputSource	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
getType	TokenNameIdentifier
(	TokenNameLPAREN
XMLResourceIdentifier	TokenNameIdentifier
resourceIdentifier	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
resourceIdentifier	TokenNameIdentifier
instanceof	TokenNameinstanceof
XMLGrammarDescription	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
)	TokenNameRPAREN
resourceIdentifier	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
.	TokenNameDOT
XML_SCHEMA	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
desc	TokenNameIdentifier
.	TokenNameDOT
getGrammarType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
XSD_TYPE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
XML_TYPE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE