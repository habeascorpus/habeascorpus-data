package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
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
AbstractDocument	TokenNameIdentifier
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
DoublyIndexedTable	TokenNameIdentifier
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
SVGTypes	TokenNameIdentifier
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
SVGAnimatedString	TokenNameIdentifier
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
SVGURIReference	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
SVGURIReferenceTextPositioningElement	TokenNameIdentifier
extends	TokenNameextends
SVGOMTextPositioningElement	TokenNameIdentifier
implements	TokenNameimplements
SVGURIReference	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
static	TokenNamestatic
DoublyIndexedTable	TokenNameIdentifier
xmlTraitInformation	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
DoublyIndexedTable	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DoublyIndexedTable	TokenNameIdentifier
(	TokenNameLPAREN
SVGOMTextPositioningElement	TokenNameIdentifier
.	TokenNameDOT
xmlTraitInformation	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
XLINK_HREF_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
TraitInformation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
SVGTypes	TokenNameIdentifier
.	TokenNameDOT
TYPE_URI	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlTraitInformation	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
SVGOMAnimatedString	TokenNameIdentifier
href	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
SVGURIReferenceTextPositioningElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
SVGURIReferenceTextPositioningElement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
AbstractDocument	TokenNameIdentifier
owner	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
owner	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
initializeLiveAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
initializeAllLiveAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
initializeAllLiveAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
initializeLiveAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
initializeLiveAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
href	TokenNameIdentifier
=	TokenNameEQUAL
createLiveAnimatedString	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
XLINK_HREF_ATTRIBUTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGAnimatedString	TokenNameIdentifier
getHref	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
href	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
DoublyIndexedTable	TokenNameIdentifier
getTraitInformationTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
xmlTraitInformation	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
