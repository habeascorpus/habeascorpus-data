package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
processor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
OutputKeys	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
.	TokenNameDOT
ElemTemplateElement	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
.	TokenNameDOT
OutputProperties	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
OutputPropertiesFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
QName	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
SystemIDResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
Attributes	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
ProcessorOutputElem	TokenNameIdentifier
extends	TokenNameextends
XSLTElementProcessor	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
3513742319582547590L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
OutputProperties	TokenNameIdentifier
m_outputProperties	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setCdataSectionElements	TokenNameIdentifier
(	TokenNameLPAREN
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setQNameProperties	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
CDATA_SECTION_ELEMENTS	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDoctypePublic	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
DOCTYPE_PUBLIC	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDoctypeSystem	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
DOCTYPE_SYSTEM	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setEncoding	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setIndent	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setBooleanProperty	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
INDENT	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setMediaType	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
MEDIA_TYPE	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setMethod	TokenNameIdentifier
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
QName	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setQNameProperty	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
METHOD	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOmitXmlDeclaration	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setBooleanProperty	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
OMIT_XML_DECLARATION	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setStandalone	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setBooleanProperty	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
STANDALONE	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setVersion	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
VERSION	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setForeignAttr	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
attrUri	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrLocalName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrRawName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
QName	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QName	TokenNameIdentifier
(	TokenNameLPAREN
attrUri	TokenNameIdentifier
,	TokenNameCOMMA
attrLocalName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
attrValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addLiteralResultAttribute	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
attrUri	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrLocalName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrRawName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
QName	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QName	TokenNameIdentifier
(	TokenNameLPAREN
attrUri	TokenNameIdentifier
,	TokenNameCOMMA
attrLocalName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
attrValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startElement	TokenNameIdentifier
(	TokenNameLPAREN
StylesheetHandler	TokenNameIdentifier
handler	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
uri	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
localName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
rawName	TokenNameIdentifier
,	TokenNameCOMMA
Attributes	TokenNameIdentifier
attributes	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
m_outputProperties	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OutputProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setDOMBackPointer	TokenNameIdentifier
(	TokenNameLPAREN
handler	TokenNameIdentifier
.	TokenNameDOT
getOriginatingNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setLocaterInfo	TokenNameIdentifier
(	TokenNameLPAREN
handler	TokenNameIdentifier
.	TokenNameDOT
getLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
setUid	TokenNameIdentifier
(	TokenNameLPAREN
handler	TokenNameIdentifier
.	TokenNameDOT
nextUid	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setPropertiesFromAttributes	TokenNameIdentifier
(	TokenNameLPAREN
handler	TokenNameIdentifier
,	TokenNameCOMMA
rawName	TokenNameIdentifier
,	TokenNameCOMMA
attributes	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
entitiesFileName	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
OutputPropertiesFactory	TokenNameIdentifier
.	TokenNameDOT
S_KEY_ENTITIES	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
entitiesFileName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
String	TokenNameIdentifier
absURL	TokenNameIdentifier
=	TokenNameEQUAL
SystemIDResolver	TokenNameIdentifier
.	TokenNameDOT
getAbsoluteURI	TokenNameIdentifier
(	TokenNameLPAREN
entitiesFileName	TokenNameIdentifier
,	TokenNameCOMMA
handler	TokenNameIdentifier
.	TokenNameDOT
getBaseIdentifier	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_outputProperties	TokenNameIdentifier
.	TokenNameDOT
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
OutputPropertiesFactory	TokenNameIdentifier
.	TokenNameDOT
S_KEY_ENTITIES	TokenNameIdentifier
,	TokenNameCOMMA
absURL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
TransformerException	TokenNameIdentifier
te	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
handler	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
te	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
te	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
handler	TokenNameIdentifier
.	TokenNameDOT
getStylesheet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setOutput	TokenNameIdentifier
(	TokenNameLPAREN
m_outputProperties	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ElemTemplateElement	TokenNameIdentifier
parent	TokenNameIdentifier
=	TokenNameEQUAL
handler	TokenNameIdentifier
.	TokenNameDOT
getElemTemplateElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
parent	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
m_outputProperties	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_outputProperties	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
