package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
dom3	TokenNameIdentifier
.	TokenNameDOT
as	TokenNameIdentifier
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
interface	TokenNameinterface
ASModel	TokenNameIdentifier
extends	TokenNameextends
ASObject	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getIsNamespaceAware	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
short	TokenNameshort
getUsageLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getAsLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setAsLocation	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
asLocation	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getAsHint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setAsHint	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
asHint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ASNamedObjectMap	TokenNameIdentifier
getElementDeclarations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ASNamedObjectMap	TokenNameIdentifier
getAttributeDeclarations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ASNamedObjectMap	TokenNameIdentifier
getNotationDeclarations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ASNamedObjectMap	TokenNameIdentifier
getEntityDeclarations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ASNamedObjectMap	TokenNameIdentifier
getContentModelDeclarations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
addASModel	TokenNameIdentifier
(	TokenNameLPAREN
ASModel	TokenNameIdentifier
abstractSchema	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ASObjectList	TokenNameIdentifier
getASModels	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
removeAS	TokenNameIdentifier
(	TokenNameLPAREN
ASModel	TokenNameIdentifier
as	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
validate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ASElementDeclaration	TokenNameIdentifier
createASElementDeclaration	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ASAttributeDeclaration	TokenNameIdentifier
createASAttributeDeclaration	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ASNotationDeclaration	TokenNameIdentifier
createASNotationDeclaration	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
systemId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
publicId	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ASEntityDeclaration	TokenNameIdentifier
createASEntityDeclaration	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ASContentModel	TokenNameIdentifier
createASContentModel	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
minOccurs	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxOccurs	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
operator	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMASException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE