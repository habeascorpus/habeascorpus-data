package	TokenNamepackage
ui	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
.	TokenNameDOT
DOMParser	TokenNameIdentifier
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
EncodingMap	TokenNameIdentifier
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
Augmentations	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
DOMParserSaveEncoding	TokenNameIdentifier
extends	TokenNameextends
DOMParser	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
_mimeEncoding	TokenNameIdentifier
=	TokenNameEQUAL
"UTF-8"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
void	TokenNamevoid
setMimeEncoding	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
encoding	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_mimeEncoding	TokenNameIdentifier
=	TokenNameEQUAL
encoding	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
getMimeEncoding	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
_mimeEncoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getJavaEncoding	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
javaEncoding	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
String	TokenNameIdentifier
mimeEncoding	TokenNameIdentifier
=	TokenNameEQUAL
getMimeEncoding	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
mimeEncoding	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
mimeEncoding	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"DEFAULT"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
javaEncoding	TokenNameIdentifier
=	TokenNameEQUAL
"UTF8"	TokenNameStringLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
mimeEncoding	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-16"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
javaEncoding	TokenNameIdentifier
=	TokenNameEQUAL
"Unicode"	TokenNameStringLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
javaEncoding	TokenNameIdentifier
=	TokenNameEQUAL
EncodingMap	TokenNameIdentifier
.	TokenNameDOT
getIANA2JavaMapping	TokenNameIdentifier
(	TokenNameLPAREN
mimeEncoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
javaEncoding	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
javaEncoding	TokenNameIdentifier
=	TokenNameEQUAL
"UTF8"	TokenNameStringLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
javaEncoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startGeneralEntity	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
XMLResourceIdentifier	TokenNameIdentifier
identifier	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
encoding	TokenNameIdentifier
,	TokenNameCOMMA
Augmentations	TokenNameIdentifier
augs	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XNIException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
encoding	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
setMimeEncoding	TokenNameIdentifier
(	TokenNameLPAREN
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
super	TokenNamesuper
.	TokenNameDOT
startGeneralEntity	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
identifier	TokenNameIdentifier
,	TokenNameCOMMA
encoding	TokenNameIdentifier
,	TokenNameCOMMA
augs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE