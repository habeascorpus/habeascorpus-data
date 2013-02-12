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
anim	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
.	TokenNameDOT
AnimatableStringValue	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
.	TokenNameDOT
AnimatableValue	TokenNameIdentifier
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
anim	TokenNameIdentifier
.	TokenNameDOT
AnimationTarget	TokenNameIdentifier
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
DOMException	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
SVGOMAnimatedString	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGAnimatedValue	TokenNameIdentifier
implements	TokenNameimplements
SVGAnimatedString	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
animVal	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGOMAnimatedString	TokenNameIdentifier
(	TokenNameLPAREN
AbstractElement	TokenNameIdentifier
elt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ns	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ln	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
elt	TokenNameIdentifier
,	TokenNameCOMMA
ns	TokenNameIdentifier
,	TokenNameCOMMA
ln	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getBaseVal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
element	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setBaseVal	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
baseVal	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
element	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
,	TokenNameCOMMA
baseVal	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getAnimVal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
hasAnimVal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
animVal	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
element	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AnimatableValue	TokenNameIdentifier
getUnderlyingValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
AnimatableStringValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
getBaseVal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
updateAnimatedValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimatableValue	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
hasAnimVal	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
hasAnimVal	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
animVal	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
AnimatableStringValue	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fireAnimatedAttributeListeners	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
attrAdded	TokenNameIdentifier
(	TokenNameLPAREN
Attr	TokenNameIdentifier
node	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
newv	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fireBaseAttributeListeners	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
hasAnimVal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fireAnimatedAttributeListeners	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
attrModified	TokenNameIdentifier
(	TokenNameLPAREN
Attr	TokenNameIdentifier
node	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
oldv	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
newv	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fireBaseAttributeListeners	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
hasAnimVal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fireAnimatedAttributeListeners	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
attrRemoved	TokenNameIdentifier
(	TokenNameLPAREN
Attr	TokenNameIdentifier
node	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
oldv	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fireBaseAttributeListeners	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
hasAnimVal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fireAnimatedAttributeListeners	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE