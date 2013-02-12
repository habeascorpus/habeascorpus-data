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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
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
AnimatablePointListValue	TokenNameIdentifier
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
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
.	TokenNameDOT
ParseException	TokenNameIdentifier
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
SVGAnimatedPoints	TokenNameIdentifier
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
SVGException	TokenNameIdentifier
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
SVGPoint	TokenNameIdentifier
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
SVGPointList	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SVGOMAnimatedPoints	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGAnimatedValue	TokenNameIdentifier
implements	TokenNameimplements
SVGAnimatedPoints	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
BaseSVGPointList	TokenNameIdentifier
baseVal	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AnimSVGPointList	TokenNameIdentifier
animVal	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
changing	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
defaultValue	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGOMAnimatedPoints	TokenNameIdentifier
(	TokenNameLPAREN
AbstractElement	TokenNameIdentifier
elt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ns	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ln	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
defaultValue	TokenNameIdentifier
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
this	TokenNamethis
.	TokenNameDOT
defaultValue	TokenNameIdentifier
=	TokenNameEQUAL
defaultValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGPointList	TokenNameIdentifier
getPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
baseVal	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
baseVal	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BaseSVGPointList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
baseVal	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGPointList	TokenNameIdentifier
getAnimatedPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
animVal	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
animVal	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimSVGPointList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
animVal	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
check	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
hasAnimVal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
baseVal	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
baseVal	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BaseSVGPointList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
baseVal	TokenNameIdentifier
.	TokenNameDOT
revalidate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
baseVal	TokenNameIdentifier
.	TokenNameDOT
missing	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
LiveAttributeException	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
,	TokenNameCOMMA
LiveAttributeException	TokenNameIdentifier
.	TokenNameDOT
ERR_ATTRIBUTE_MISSING	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
baseVal	TokenNameIdentifier
.	TokenNameDOT
malformed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
LiveAttributeException	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
,	TokenNameCOMMA
LiveAttributeException	TokenNameIdentifier
.	TokenNameDOT
ERR_ATTRIBUTE_MALFORMED	TokenNameIdentifier
,	TokenNameCOMMA
baseVal	TokenNameIdentifier
.	TokenNameDOT
getValueAsString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
AnimatableValue	TokenNameIdentifier
getUnderlyingValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SVGPointList	TokenNameIdentifier
pl	TokenNameIdentifier
=	TokenNameEQUAL
getPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
pl	TokenNameIdentifier
.	TokenNameDOT
getNumberOfItems	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
points	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
n	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
n	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
SVGPoint	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
pl	TokenNameIdentifier
.	TokenNameDOT
getItem	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
points	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
points	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
AnimatablePointListValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
points	TokenNameIdentifier
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
AnimatablePointListValue	TokenNameIdentifier
animPointList	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatablePointListValue	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
animVal	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
animVal	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimSVGPointList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
animVal	TokenNameIdentifier
.	TokenNameDOT
setAnimatedValue	TokenNameIdentifier
(	TokenNameLPAREN
animPointList	TokenNameIdentifier
.	TokenNameDOT
getNumbers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
changing	TokenNameIdentifier
&&	TokenNameAND_AND
baseVal	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
baseVal	TokenNameIdentifier
.	TokenNameDOT
invalidate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
changing	TokenNameIdentifier
&&	TokenNameAND_AND
baseVal	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
baseVal	TokenNameIdentifier
.	TokenNameDOT
invalidate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
changing	TokenNameIdentifier
&&	TokenNameAND_AND
baseVal	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
baseVal	TokenNameIdentifier
.	TokenNameDOT
invalidate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
protected	TokenNameprotected
class	TokenNameclass
BaseSVGPointList	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGPointList	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
missing	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
malformed	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
DOMException	TokenNameIdentifier
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
type	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
element	TokenNameIdentifier
.	TokenNameDOT
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
SVGException	TokenNameIdentifier
createSVGException	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
type	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
SVGOMElement	TokenNameIdentifier
)	TokenNameRPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
createSVGException	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
getValueAsString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Attr	TokenNameIdentifier
attr	TokenNameIdentifier
=	TokenNameEQUAL
element	TokenNameIdentifier
.	TokenNameDOT
getAttributeNodeNS	TokenNameIdentifier
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
attr	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
defaultValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
attr	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
setAttributeValue	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
changing	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
element	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
changing	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
resetAttribute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
resetAttribute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
missing	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
malformed	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
resetAttribute	TokenNameIdentifier
(	TokenNameLPAREN
SVGItem	TokenNameIdentifier
item	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
resetAttribute	TokenNameIdentifier
(	TokenNameLPAREN
item	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
missing	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
malformed	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
revalidate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
valid	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
valid	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
missing	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
malformed	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
getValueAsString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
missing	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
ListBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ListBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doParse	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
builder	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
builder	TokenNameIdentifier
.	TokenNameDOT
getList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
clear	TokenNameIdentifier
(	TokenNameLPAREN
itemList	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
itemList	TokenNameIdentifier
=	TokenNameEQUAL
builder	TokenNameIdentifier
.	TokenNameDOT
getList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ParseException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
itemList	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
malformed	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
class	TokenNameclass
AnimSVGPointList	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGPointList	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
AnimSVGPointList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
itemList	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
DOMException	TokenNameIdentifier
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
type	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
element	TokenNameIdentifier
.	TokenNameDOT
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
SVGException	TokenNameIdentifier
createSVGException	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
type	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
SVGOMElement	TokenNameIdentifier
)	TokenNameRPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
createSVGException	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getNumberOfItems	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
hasAnimVal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getNumberOfItems	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
getPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getNumberOfItems	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGPoint	TokenNameIdentifier
getItem	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
hasAnimVal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getItem	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
getPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getItem	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
getValueAsString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
itemList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
StringBuffer	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
itemList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
i	TokenNameIdentifier
=	TokenNameEQUAL
itemList	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
SVGItem	TokenNameIdentifier
)	TokenNameRPAREN
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getValueAsString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
i	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getItemSeparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
SVGItem	TokenNameIdentifier
)	TokenNameRPAREN
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getValueAsString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
setAttributeValue	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
element	TokenNameIdentifier
.	TokenNameDOT
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"readonly.point.list"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGPoint	TokenNameIdentifier
initialize	TokenNameIdentifier
(	TokenNameLPAREN
SVGPoint	TokenNameIdentifier
newItem	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
,	TokenNameCOMMA
SVGException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
element	TokenNameIdentifier
.	TokenNameDOT
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"readonly.point.list"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGPoint	TokenNameIdentifier
insertItemBefore	TokenNameIdentifier
(	TokenNameLPAREN
SVGPoint	TokenNameIdentifier
newItem	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
,	TokenNameCOMMA
SVGException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
element	TokenNameIdentifier
.	TokenNameDOT
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"readonly.point.list"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGPoint	TokenNameIdentifier
replaceItem	TokenNameIdentifier
(	TokenNameLPAREN
SVGPoint	TokenNameIdentifier
newItem	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
,	TokenNameCOMMA
SVGException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
element	TokenNameIdentifier
.	TokenNameDOT
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"readonly.point.list"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGPoint	TokenNameIdentifier
removeItem	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
element	TokenNameIdentifier
.	TokenNameDOT
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"readonly.point.list"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGPoint	TokenNameIdentifier
appendItem	TokenNameIdentifier
(	TokenNameLPAREN
SVGPoint	TokenNameIdentifier
newItem	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
element	TokenNameIdentifier
.	TokenNameDOT
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"readonly.point.list"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
setAnimatedValue	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
pts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
itemList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
size	TokenNameIdentifier
&&	TokenNameAND_AND
i	TokenNameIdentifier
<	TokenNameLESS
pts	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
SVGPointItem	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SVGPointItem	TokenNameIdentifier
)	TokenNameRPAREN
itemList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
x	TokenNameIdentifier
=	TokenNameEQUAL
pts	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
=	TokenNameEQUAL
pts	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
pts	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
appendItemImpl	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SVGPointItem	TokenNameIdentifier
(	TokenNameLPAREN
pts	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
pts	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
size	TokenNameIdentifier
>	TokenNameGREATER
pts	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
removeItemImpl	TokenNameIdentifier
(	TokenNameLPAREN
--	TokenNameMINUS_MINUS
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
resetAttribute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
resetAttribute	TokenNameIdentifier
(	TokenNameLPAREN
SVGItem	TokenNameIdentifier
item	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
revalidate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
valid	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
