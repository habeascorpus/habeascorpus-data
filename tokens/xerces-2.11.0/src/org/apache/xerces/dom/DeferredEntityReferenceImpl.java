package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DeferredEntityReferenceImpl	TokenNameIdentifier
extends	TokenNameextends
EntityReferenceImpl	TokenNameIdentifier
implements	TokenNameimplements
DeferredNode	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
390319091370032223L	TokenNameLongLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
transient	TokenNametransient
int	TokenNameint
fNodeIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
DeferredEntityReferenceImpl	TokenNameIdentifier
(	TokenNameLPAREN
DeferredDocumentImpl	TokenNameIdentifier
ownerDocument	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
nodeIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
ownerDocument	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fNodeIndex	TokenNameIdentifier
=	TokenNameEQUAL
nodeIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
needsSyncData	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
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
name	TokenNameIdentifier
=	TokenNameEQUAL
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
fNodeIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
baseURI	TokenNameIdentifier
=	TokenNameEQUAL
ownerDocument	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
fNodeIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
synchronizeChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
needsSyncChildren	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
isReadOnly	TokenNameIdentifier
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
setReadOnly	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
