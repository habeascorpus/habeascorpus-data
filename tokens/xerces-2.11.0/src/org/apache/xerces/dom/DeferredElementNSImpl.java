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
xni	TokenNameIdentifier
.	TokenNameDOT
NamespaceContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSTypeDefinition	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
NamedNodeMap	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DeferredElementNSImpl	TokenNameIdentifier
extends	TokenNameextends
ElementNSImpl	TokenNameIdentifier
implements	TokenNameimplements
DeferredNode	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
5001885145370927385L	TokenNameLongLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
transient	TokenNametransient
int	TokenNameint
fNodeIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
DeferredElementNSImpl	TokenNameIdentifier
(	TokenNameLPAREN
DeferredDocumentImpl	TokenNameIdentifier
ownerDoc	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
nodeIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
ownerDoc	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fNodeIndex	TokenNameIdentifier
=	TokenNameEQUAL
nodeIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
needsSyncChildren	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
getNodeIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fNodeIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
final	TokenNamefinal
void	TokenNamevoid
synchronizeData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
needsSyncData	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DeferredDocumentImpl	TokenNameIdentifier
ownerDocument	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DeferredDocumentImpl	TokenNameIdentifier
)	TokenNameRPAREN
this	TokenNamethis
.	TokenNameDOT
ownerDocument	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
orig	TokenNameIdentifier
=	TokenNameEQUAL
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
mutationEvents	TokenNameIdentifier
;	TokenNameSEMICOLON
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
mutationEvents	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
name	TokenNameIdentifier
=	TokenNameEQUAL
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
fNodeIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
localName	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
localName	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
namespaceURI	TokenNameIdentifier
=	TokenNameEQUAL
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
getNodeURI	TokenNameIdentifier
(	TokenNameLPAREN
fNodeIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
type	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XSTypeDefinition	TokenNameIdentifier
)	TokenNameRPAREN
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
getTypeInfo	TokenNameIdentifier
(	TokenNameLPAREN
fNodeIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setupDefaultAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
attrIndex	TokenNameIdentifier
=	TokenNameEQUAL
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
getNodeExtra	TokenNameIdentifier
(	TokenNameLPAREN
fNodeIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
attrIndex	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
NamedNodeMap	TokenNameIdentifier
attrs	TokenNameIdentifier
=	TokenNameEQUAL
getAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
seenSchemaDefault	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
do	TokenNamedo
{	TokenNameLBRACE
AttrImpl	TokenNameIdentifier
attr	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AttrImpl	TokenNameIdentifier
)	TokenNameRPAREN
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
getNodeObject	TokenNameIdentifier
(	TokenNameLPAREN
attrIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
attr	TokenNameIdentifier
.	TokenNameDOT
getSpecified	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
seenSchemaDefault	TokenNameIdentifier
||	TokenNameOR_OR
(	TokenNameLPAREN
attr	TokenNameIdentifier
.	TokenNameDOT
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
attr	TokenNameIdentifier
.	TokenNameDOT
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
NamespaceContext	TokenNameIdentifier
.	TokenNameDOT
XMLNS_URI	TokenNameIdentifier
&&	TokenNameAND_AND
attr	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
':'	TokenNameCharacterLiteral
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
seenSchemaDefault	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
attrs	TokenNameIdentifier
.	TokenNameDOT
setNamedItemNS	TokenNameIdentifier
(	TokenNameLPAREN
attr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
attrs	TokenNameIdentifier
.	TokenNameDOT
setNamedItem	TokenNameIdentifier
(	TokenNameLPAREN
attr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
attrIndex	TokenNameIdentifier
=	TokenNameEQUAL
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
getPrevSibling	TokenNameIdentifier
(	TokenNameLPAREN
attrIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
attrIndex	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
mutationEvents	TokenNameIdentifier
=	TokenNameEQUAL
orig	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
final	TokenNamefinal
void	TokenNamevoid
synchronizeChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
DeferredDocumentImpl	TokenNameIdentifier
ownerDocument	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DeferredDocumentImpl	TokenNameIdentifier
)	TokenNameRPAREN
ownerDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
synchronizeChildren	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
fNodeIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE