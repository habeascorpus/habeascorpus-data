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
NotSerializableException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ObjectInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ObjectOutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Attr	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DOMConfiguration	TokenNameIdentifier
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
DOMImplementation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DocumentType	TokenNameIdentifier
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
Node	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
UserDataHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
PSVIDocumentImpl	TokenNameIdentifier
extends	TokenNameextends
DocumentImpl	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
8822220250676434522L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
PSVIDocumentImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PSVIDocumentImpl	TokenNameIdentifier
(	TokenNameLPAREN
DocumentType	TokenNameIdentifier
doctype	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
doctype	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
cloneNode	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
deep	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
PSVIDocumentImpl	TokenNameIdentifier
newdoc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PSVIDocumentImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
callUserDataHandlers	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
newdoc	TokenNameIdentifier
,	TokenNameCOMMA
UserDataHandler	TokenNameIdentifier
.	TokenNameDOT
NODE_CLONED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cloneNode	TokenNameIdentifier
(	TokenNameLPAREN
newdoc	TokenNameIdentifier
,	TokenNameCOMMA
deep	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
newdoc	TokenNameIdentifier
.	TokenNameDOT
mutationEvents	TokenNameIdentifier
=	TokenNameEQUAL
mutationEvents	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
newdoc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DOMImplementation	TokenNameIdentifier
getImplementation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
PSVIDOMImplementationImpl	TokenNameIdentifier
.	TokenNameDOT
getDOMImplementation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
createElementNS	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
qualifiedName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
PSVIElementNSImpl	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
qualifiedName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
createElementNS	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
qualifiedName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
localpart	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
PSVIElementNSImpl	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
qualifiedName	TokenNameIdentifier
,	TokenNameCOMMA
localpart	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Attr	TokenNameIdentifier
createAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
qualifiedName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
PSVIAttrNSImpl	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
qualifiedName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Attr	TokenNameIdentifier
createAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
qualifiedName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
localName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
PSVIAttrNSImpl	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
qualifiedName	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DOMConfiguration	TokenNameIdentifier
getDomConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
getDomConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
fConfiguration	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
writeObject	TokenNameIdentifier
(	TokenNameLPAREN
ObjectOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NotSerializableException	TokenNameIdentifier
(	TokenNameLPAREN
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
readObject	TokenNameIdentifier
(	TokenNameLPAREN
ObjectInputStream	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ClassNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NotSerializableException	TokenNameIdentifier
(	TokenNameLPAREN
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE