package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
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
dv	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSSimpleTypeDecl	TokenNameIdentifier
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
NamespaceContext	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
AttrNSImpl	TokenNameIdentifier
extends	TokenNameextends
AttrImpl	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
781906615369795414L	TokenNameLongLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
xmlnsURI	TokenNameIdentifier
=	TokenNameEQUAL
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
xmlURI	TokenNameIdentifier
=	TokenNameEQUAL
"http://www.w3.org/XML/1998/namespace"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
localName	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
AttrNSImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
AttrNSImpl	TokenNameIdentifier
(	TokenNameLPAREN
CoreDocumentImpl	TokenNameIdentifier
ownerDocument	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
qualifiedName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
ownerDocument	TokenNameIdentifier
,	TokenNameCOMMA
qualifiedName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setName	TokenNameIdentifier
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
qualifiedName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
setName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
qname	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CoreDocumentImpl	TokenNameIdentifier
ownerDocument	TokenNameIdentifier
=	TokenNameEQUAL
ownerDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
namespaceURI	TokenNameIdentifier
=	TokenNameEQUAL
namespaceURI	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
namespaceURI	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
namespaceURI	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
colon1	TokenNameIdentifier
=	TokenNameEQUAL
qname	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
':'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
colon2	TokenNameIdentifier
=	TokenNameEQUAL
qname	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
':'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
checkNamespaceWF	TokenNameIdentifier
(	TokenNameLPAREN
qname	TokenNameIdentifier
,	TokenNameCOMMA
colon1	TokenNameIdentifier
,	TokenNameCOMMA
colon2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
colon1	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
localName	TokenNameIdentifier
=	TokenNameEQUAL
qname	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
errorChecking	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
checkQName	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
localName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
qname	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"xmlns"	TokenNameStringLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
!	TokenNameNOT
namespaceURI	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
NamespaceContext	TokenNameIdentifier
.	TokenNameDOT
XMLNS_URI	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
namespaceURI	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
NamespaceContext	TokenNameIdentifier
.	TokenNameDOT
XMLNS_URI	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
qname	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"xmlns"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
DOM_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"NAMESPACE_ERR"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
DOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
prefix	TokenNameIdentifier
=	TokenNameEQUAL
qname	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
colon1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
localName	TokenNameIdentifier
=	TokenNameEQUAL
qname	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
colon2	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
checkQName	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
checkDOMNSErr	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
namespaceURI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
AttrNSImpl	TokenNameIdentifier
(	TokenNameLPAREN
CoreDocumentImpl	TokenNameIdentifier
ownerDocument	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
qualifiedName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
localName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
ownerDocument	TokenNameIdentifier
,	TokenNameCOMMA
qualifiedName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
localName	TokenNameIdentifier
=	TokenNameEQUAL
localName	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
namespaceURI	TokenNameIdentifier
=	TokenNameEQUAL
namespaceURI	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
AttrNSImpl	TokenNameIdentifier
(	TokenNameLPAREN
CoreDocumentImpl	TokenNameIdentifier
ownerDocument	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
ownerDocument	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
rename	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
qualifiedName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
needsSyncData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronizeData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
name	TokenNameIdentifier
=	TokenNameEQUAL
qualifiedName	TokenNameIdentifier
;	TokenNameSEMICOLON
setName	TokenNameIdentifier
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
qualifiedName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
needsSyncData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronizeData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
namespaceURI	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getPrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
needsSyncData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronizeData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
':'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
index	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
name	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPrefix	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
needsSyncData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronizeData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ownerDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
errorChecking	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isReadOnly	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
DOM_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
DOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
prefix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
CoreDocumentImpl	TokenNameIdentifier
.	TokenNameDOT
isXMLName	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
ownerDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isXML11Version	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
DOM_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"INVALID_CHARACTER_ERR"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
DOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
INVALID_CHARACTER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
prefix	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
':'	TokenNameCharacterLiteral
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
DOM_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"NAMESPACE_ERR"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
DOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"xmlns"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
namespaceURI	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
xmlnsURI	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
DOM_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"NAMESPACE_ERR"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
DOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"xml"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
namespaceURI	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
xmlURI	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
DOM_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"NAMESPACE_ERR"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
DOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"xmlns"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
DOMMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
DOM_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"NAMESPACE_ERR"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
DOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NAMESPACE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
prefix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
name	TokenNameIdentifier
=	TokenNameEQUAL
prefix	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
localName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
name	TokenNameIdentifier
=	TokenNameEQUAL
localName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
needsSyncData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronizeData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
localName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getTypeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
instanceof	TokenNameinstanceof
XSSimpleTypeDecl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
XSSimpleTypeDecl	TokenNameIdentifier
)	TokenNameRPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
type	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isDerivedFrom	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
typeNamespaceArg	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
typeNameArg	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
derivationMethod	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
instanceof	TokenNameinstanceof
XSSimpleTypeDecl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
XSSimpleTypeDecl	TokenNameIdentifier
)	TokenNameRPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
isDOMDerivedFrom	TokenNameIdentifier
(	TokenNameLPAREN
typeNamespaceArg	TokenNameIdentifier
,	TokenNameCOMMA
typeNameArg	TokenNameIdentifier
,	TokenNameCOMMA
derivationMethod	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getTypeNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
instanceof	TokenNameinstanceof
XSSimpleTypeDecl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
XSSimpleTypeDecl	TokenNameIdentifier
)	TokenNameRPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
DTD_URI	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE