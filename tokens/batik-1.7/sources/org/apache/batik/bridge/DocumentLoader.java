package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
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
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
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
SAXSVGDocumentFactory	TokenNameIdentifier
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
SVGDocumentFactory	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
DocumentDescriptor	TokenNameIdentifier
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
CleanerThread	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Element	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
.	TokenNameDOT
SVGDocument	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DocumentLoader	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
SVGDocumentFactory	TokenNameIdentifier
documentFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
HashMap	TokenNameIdentifier
cacheMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
UserAgent	TokenNameIdentifier
userAgent	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
DocumentLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
DocumentLoader	TokenNameIdentifier
(	TokenNameLPAREN
UserAgent	TokenNameIdentifier
userAgent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
userAgent	TokenNameIdentifier
=	TokenNameEQUAL
userAgent	TokenNameIdentifier
;	TokenNameSEMICOLON
documentFactory	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SAXSVGDocumentFactory	TokenNameIdentifier
(	TokenNameLPAREN
userAgent	TokenNameIdentifier
.	TokenNameDOT
getXMLParserClassName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
documentFactory	TokenNameIdentifier
.	TokenNameDOT
setValidating	TokenNameIdentifier
(	TokenNameLPAREN
userAgent	TokenNameIdentifier
.	TokenNameDOT
isXMLParserValidating	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Document	TokenNameIdentifier
checkCache	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
uri	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
uri	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
'/'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
n	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
n	TokenNameIdentifier
=	TokenNameEQUAL
uri	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
'#'	TokenNameCharacterLiteral
,	TokenNameCOMMA
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
uri	TokenNameIdentifier
=	TokenNameEQUAL
uri	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
DocumentState	TokenNameIdentifier
state	TokenNameIdentifier
;	TokenNameSEMICOLON
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
cacheMap	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
state	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DocumentState	TokenNameIdentifier
)	TokenNameRPAREN
cacheMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
state	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
state	TokenNameIdentifier
.	TokenNameDOT
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Document	TokenNameIdentifier
loadDocument	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
uri	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Document	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
checkCache	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
SVGDocument	TokenNameIdentifier
document	TokenNameIdentifier
=	TokenNameEQUAL
documentFactory	TokenNameIdentifier
.	TokenNameDOT
createSVGDocument	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocumentDescriptor	TokenNameIdentifier
desc	TokenNameIdentifier
=	TokenNameEQUAL
documentFactory	TokenNameIdentifier
.	TokenNameDOT
getDocumentDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocumentState	TokenNameIdentifier
state	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocumentState	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
,	TokenNameCOMMA
document	TokenNameIdentifier
,	TokenNameCOMMA
desc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
cacheMap	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cacheMap	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
,	TokenNameCOMMA
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
state	TokenNameIdentifier
.	TokenNameDOT
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Document	TokenNameIdentifier
loadDocument	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
uri	TokenNameIdentifier
,	TokenNameCOMMA
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Document	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
checkCache	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
SVGDocument	TokenNameIdentifier
document	TokenNameIdentifier
=	TokenNameEQUAL
documentFactory	TokenNameIdentifier
.	TokenNameDOT
createSVGDocument	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
,	TokenNameCOMMA
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocumentDescriptor	TokenNameIdentifier
desc	TokenNameIdentifier
=	TokenNameEQUAL
documentFactory	TokenNameIdentifier
.	TokenNameDOT
getDocumentDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocumentState	TokenNameIdentifier
state	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocumentState	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
,	TokenNameCOMMA
document	TokenNameIdentifier
,	TokenNameCOMMA
desc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
cacheMap	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cacheMap	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
,	TokenNameCOMMA
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
state	TokenNameIdentifier
.	TokenNameDOT
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
UserAgent	TokenNameIdentifier
getUserAgent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
userAgent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
dispose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
cacheMap	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cacheMap	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getLineNumber	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
uri	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
SVGDocument	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getOwnerDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocumentState	TokenNameIdentifier
state	TokenNameIdentifier
;	TokenNameSEMICOLON
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
cacheMap	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
state	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DocumentState	TokenNameIdentifier
)	TokenNameRPAREN
cacheMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
state	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
state	TokenNameIdentifier
.	TokenNameDOT
desc	TokenNameIdentifier
.	TokenNameDOT
getLocationLine	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
class	TokenNameclass
DocumentState	TokenNameIdentifier
extends	TokenNameextends
CleanerThread	TokenNameIdentifier
.	TokenNameDOT
SoftReferenceCleared	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
DocumentDescriptor	TokenNameIdentifier
desc	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DocumentState	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
uri	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
document	TokenNameIdentifier
,	TokenNameCOMMA
DocumentDescriptor	TokenNameIdentifier
desc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
document	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
uri	TokenNameIdentifier
=	TokenNameEQUAL
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
desc	TokenNameIdentifier
=	TokenNameEQUAL
desc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
cleared	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
cacheMap	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cacheMap	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
DocumentDescriptor	TokenNameIdentifier
getDocumentDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
desc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Document	TokenNameIdentifier
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Document	TokenNameIdentifier
)	TokenNameRPAREN
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
