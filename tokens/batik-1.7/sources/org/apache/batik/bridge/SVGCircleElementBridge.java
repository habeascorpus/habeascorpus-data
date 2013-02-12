package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
Ellipse2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
Rectangle2D	TokenNameIdentifier
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
svg	TokenNameIdentifier
.	TokenNameDOT
AbstractSVGAnimatedLength	TokenNameIdentifier
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
svg	TokenNameIdentifier
.	TokenNameDOT
AnimatedLiveAttributeValue	TokenNameIdentifier
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
svg	TokenNameIdentifier
.	TokenNameDOT
LiveAttributeException	TokenNameIdentifier
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
svg	TokenNameIdentifier
.	TokenNameDOT
SVGOMCircleElement	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
ShapeNode	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
ShapePainter	TokenNameIdentifier
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
SVGCircleElementBridge	TokenNameIdentifier
extends	TokenNameextends
SVGShapeElementBridge	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
SVGCircleElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
SVG_CIRCLE_TAG	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Bridge	TokenNameIdentifier
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
SVGCircleElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
buildShape	TokenNameIdentifier
(	TokenNameLPAREN
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
e	TokenNameIdentifier
,	TokenNameCOMMA
ShapeNode	TokenNameIdentifier
shapeNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
SVGOMCircleElement	TokenNameIdentifier
ce	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SVGOMCircleElement	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
;	TokenNameSEMICOLON
AbstractSVGAnimatedLength	TokenNameIdentifier
_cx	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AbstractSVGAnimatedLength	TokenNameIdentifier
)	TokenNameRPAREN
ce	TokenNameIdentifier
.	TokenNameDOT
getCx	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
cx	TokenNameIdentifier
=	TokenNameEQUAL
_cx	TokenNameIdentifier
.	TokenNameDOT
getCheckedValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AbstractSVGAnimatedLength	TokenNameIdentifier
_cy	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AbstractSVGAnimatedLength	TokenNameIdentifier
)	TokenNameRPAREN
ce	TokenNameIdentifier
.	TokenNameDOT
getCy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
cy	TokenNameIdentifier
=	TokenNameEQUAL
_cy	TokenNameIdentifier
.	TokenNameDOT
getCheckedValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AbstractSVGAnimatedLength	TokenNameIdentifier
_r	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AbstractSVGAnimatedLength	TokenNameIdentifier
)	TokenNameRPAREN
ce	TokenNameIdentifier
.	TokenNameDOT
getR	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
r	TokenNameIdentifier
=	TokenNameEQUAL
_r	TokenNameIdentifier
.	TokenNameDOT
getCheckedValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
x	TokenNameIdentifier
=	TokenNameEQUAL
cx	TokenNameIdentifier
-	TokenNameMINUS
r	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
y	TokenNameIdentifier
=	TokenNameEQUAL
cy	TokenNameIdentifier
-	TokenNameMINUS
r	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
w	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
shapeNode	TokenNameIdentifier
.	TokenNameDOT
setShape	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Ellipse2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
,	TokenNameCOMMA
w	TokenNameIdentifier
,	TokenNameCOMMA
w	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
LiveAttributeException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BridgeException	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
handleAnimatedAttributeChanged	TokenNameIdentifier
(	TokenNameLPAREN
AnimatedLiveAttributeValue	TokenNameIdentifier
alav	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
alav	TokenNameIdentifier
.	TokenNameDOT
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
ln	TokenNameIdentifier
=	TokenNameEQUAL
alav	TokenNameIdentifier
.	TokenNameDOT
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ln	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
SVG_CX_ATTRIBUTE	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
ln	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
SVG_CY_ATTRIBUTE	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
ln	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
SVG_R_ATTRIBUTE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
buildShape	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
ShapeNode	TokenNameIdentifier
)	TokenNameRPAREN
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
handleGeometryChanged	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
super	TokenNamesuper
.	TokenNameDOT
handleAnimatedAttributeChanged	TokenNameIdentifier
(	TokenNameLPAREN
alav	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
ShapePainter	TokenNameIdentifier
createShapePainter	TokenNameIdentifier
(	TokenNameLPAREN
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
e	TokenNameIdentifier
,	TokenNameCOMMA
ShapeNode	TokenNameIdentifier
shapeNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
r2d	TokenNameIdentifier
=	TokenNameEQUAL
shapeNode	TokenNameIdentifier
.	TokenNameDOT
getShape	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
r2d	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
r2d	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
createShapePainter	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
,	TokenNameCOMMA
shapeNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE