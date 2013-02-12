package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
XMLConstants	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DOMException	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
XLinkSupport	TokenNameIdentifier
implements	TokenNameimplements
XMLConstants	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getXLinkType	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elt	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"type"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
setXLinkType	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
"simple"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
"extended"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
"locator"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
"arc"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
DOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
SYNTAX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"xlink:type='"	TokenNameStringLiteral
+	TokenNamePLUS
str	TokenNameIdentifier
+	TokenNamePLUS
"'"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
elt	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"type"	TokenNameStringLiteral
,	TokenNameCOMMA
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getXLinkRole	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elt	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"role"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
setXLinkRole	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
elt	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"role"	TokenNameStringLiteral
,	TokenNameCOMMA
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getXLinkArcRole	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elt	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"arcrole"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
setXLinkArcRole	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
elt	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"arcrole"	TokenNameStringLiteral
,	TokenNameCOMMA
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getXLinkTitle	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elt	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"title"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
setXLinkTitle	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
elt	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"title"	TokenNameStringLiteral
,	TokenNameCOMMA
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getXLinkShow	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elt	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"show"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
setXLinkShow	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
"new"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
"replace"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
"embed"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
DOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
SYNTAX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"xlink:show='"	TokenNameStringLiteral
+	TokenNamePLUS
str	TokenNameIdentifier
+	TokenNamePLUS
"'"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
elt	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"show"	TokenNameStringLiteral
,	TokenNameCOMMA
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getXLinkActuate	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elt	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"actuate"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
setXLinkActuate	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
"onReplace"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
"onLoad"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
DOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
SYNTAX_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"xlink:actuate='"	TokenNameStringLiteral
+	TokenNamePLUS
str	TokenNameIdentifier
+	TokenNamePLUS
"'"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
elt	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"actuate"	TokenNameStringLiteral
,	TokenNameCOMMA
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getXLinkHref	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elt	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
XLINK_HREF_ATTRIBUTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
setXLinkHref	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
elt	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
XLINK_HREF_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
