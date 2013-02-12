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
Color	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Paint	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
AffineTransform	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
Point2D	TokenNameIdentifier
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
SVGContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
LinearGradientPaint	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
MultipleGradientPaint	TokenNameIdentifier
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
GraphicsNode	TokenNameIdentifier
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
SVGLinearGradientElementBridge	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGGradientElementBridge	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
SVGLinearGradientElementBridge	TokenNameIdentifier
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
SVG_LINEAR_GRADIENT_TAG	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Paint	TokenNameIdentifier
buildGradient	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
paintedElement	TokenNameIdentifier
,	TokenNameCOMMA
GraphicsNode	TokenNameIdentifier
paintedNode	TokenNameIdentifier
,	TokenNameCOMMA
MultipleGradientPaint	TokenNameIdentifier
.	TokenNameDOT
CycleMethodEnum	TokenNameIdentifier
spreadMethod	TokenNameIdentifier
,	TokenNameCOMMA
MultipleGradientPaint	TokenNameIdentifier
.	TokenNameDOT
ColorSpaceEnum	TokenNameIdentifier
colorSpace	TokenNameIdentifier
,	TokenNameCOMMA
AffineTransform	TokenNameIdentifier
transform	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
colors	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
offsets	TokenNameIdentifier
,	TokenNameCOMMA
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
x1Str	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
getChainableAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
SVG_X1_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
x1Str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
x1Str	TokenNameIdentifier
=	TokenNameEQUAL
SVG_LINEAR_GRADIENT_X1_DEFAULT_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
y1Str	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
getChainableAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
SVG_Y1_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
y1Str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
y1Str	TokenNameIdentifier
=	TokenNameEQUAL
SVG_LINEAR_GRADIENT_Y1_DEFAULT_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
x2Str	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
getChainableAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
SVG_X2_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
x2Str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
x2Str	TokenNameIdentifier
=	TokenNameEQUAL
SVG_LINEAR_GRADIENT_X2_DEFAULT_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
y2Str	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
getChainableAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
SVG_Y2_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
y2Str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
y2Str	TokenNameIdentifier
=	TokenNameEQUAL
SVG_LINEAR_GRADIENT_Y2_DEFAULT_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
short	TokenNameshort
coordSystemType	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
getChainableAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
SVG_GRADIENT_UNITS_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
coordSystemType	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
OBJECT_BOUNDING_BOX	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
coordSystemType	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
parseCoordinateSystem	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
SVG_GRADIENT_UNITS_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
SVGContext	TokenNameIdentifier
bridge	TokenNameIdentifier
=	TokenNameEQUAL
BridgeContext	TokenNameIdentifier
.	TokenNameDOT
getSVGContext	TokenNameIdentifier
(	TokenNameLPAREN
paintedElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
coordSystemType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
OBJECT_BOUNDING_BOX	TokenNameIdentifier
&&	TokenNameAND_AND
bridge	TokenNameIdentifier
instanceof	TokenNameinstanceof
AbstractGraphicsNodeBridge	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
bbox	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
AbstractGraphicsNodeBridge	TokenNameIdentifier
)	TokenNameRPAREN
bridge	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getBBox	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
bbox	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
bbox	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
bbox	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
coordSystemType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
OBJECT_BOUNDING_BOX	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
transform	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
toObjectBBox	TokenNameIdentifier
(	TokenNameLPAREN
transform	TokenNameIdentifier
,	TokenNameCOMMA
paintedNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
UnitProcessor	TokenNameIdentifier
.	TokenNameDOT
Context	TokenNameIdentifier
uctx	TokenNameIdentifier
=	TokenNameEQUAL
UnitProcessor	TokenNameIdentifier
.	TokenNameDOT
createContext	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
paintElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Point2D	TokenNameIdentifier
p1	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
convertPoint	TokenNameIdentifier
(	TokenNameLPAREN
x1Str	TokenNameIdentifier
,	TokenNameCOMMA
SVG_X1_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
y1Str	TokenNameIdentifier
,	TokenNameCOMMA
SVG_Y1_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
coordSystemType	TokenNameIdentifier
,	TokenNameCOMMA
uctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Point2D	TokenNameIdentifier
p2	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
convertPoint	TokenNameIdentifier
(	TokenNameLPAREN
x2Str	TokenNameIdentifier
,	TokenNameCOMMA
SVG_X2_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
y2Str	TokenNameIdentifier
,	TokenNameCOMMA
SVG_Y2_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
coordSystemType	TokenNameIdentifier
,	TokenNameCOMMA
uctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
p1	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
p2	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
p1	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
p2	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
colors	TokenNameIdentifier
[	TokenNameLBRACKET
colors	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
LinearGradientPaint	TokenNameIdentifier
(	TokenNameLPAREN
p1	TokenNameIdentifier
,	TokenNameCOMMA
p2	TokenNameIdentifier
,	TokenNameCOMMA
offsets	TokenNameIdentifier
,	TokenNameCOMMA
colors	TokenNameIdentifier
,	TokenNameCOMMA
spreadMethod	TokenNameIdentifier
,	TokenNameCOMMA
colorSpace	TokenNameIdentifier
,	TokenNameCOMMA
transform	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE