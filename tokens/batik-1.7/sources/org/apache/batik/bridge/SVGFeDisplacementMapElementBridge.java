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
Rectangle2D	TokenNameIdentifier
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
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
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
image	TokenNameIdentifier
.	TokenNameDOT
ARGBChannel	TokenNameIdentifier
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
image	TokenNameIdentifier
.	TokenNameDOT
PadMode	TokenNameIdentifier
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
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
DisplacementMapRable8Bit	TokenNameIdentifier
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
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
Filter	TokenNameIdentifier
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
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
PadRable	TokenNameIdentifier
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
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
PadRable8Bit	TokenNameIdentifier
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
SVGFeDisplacementMapElementBridge	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGFilterPrimitiveElementBridge	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
SVGFeDisplacementMapElementBridge	TokenNameIdentifier
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
SVG_FE_DISPLACEMENT_MAP_TAG	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Filter	TokenNameIdentifier
createFilter	TokenNameIdentifier
(	TokenNameLPAREN
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
filteredElement	TokenNameIdentifier
,	TokenNameCOMMA
GraphicsNode	TokenNameIdentifier
filteredNode	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
inputFilter	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle2D	TokenNameIdentifier
filterRegion	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
filterMap	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
scale	TokenNameIdentifier
=	TokenNameEQUAL
convertNumber	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
SVG_SCALE_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ARGBChannel	TokenNameIdentifier
xChannelSelector	TokenNameIdentifier
=	TokenNameEQUAL
convertChannelSelector	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
SVG_X_CHANNEL_SELECTOR_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
ARGBChannel	TokenNameIdentifier
.	TokenNameDOT
A	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ARGBChannel	TokenNameIdentifier
yChannelSelector	TokenNameIdentifier
=	TokenNameEQUAL
convertChannelSelector	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
SVG_Y_CHANNEL_SELECTOR_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
ARGBChannel	TokenNameIdentifier
.	TokenNameDOT
A	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Filter	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
getIn	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
filteredElement	TokenNameIdentifier
,	TokenNameCOMMA
filteredNode	TokenNameIdentifier
,	TokenNameCOMMA
inputFilter	TokenNameIdentifier
,	TokenNameCOMMA
filterMap	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
in	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Filter	TokenNameIdentifier
in2	TokenNameIdentifier
=	TokenNameEQUAL
getIn2	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
filteredElement	TokenNameIdentifier
,	TokenNameCOMMA
filteredNode	TokenNameIdentifier
,	TokenNameCOMMA
inputFilter	TokenNameIdentifier
,	TokenNameCOMMA
filterMap	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
in2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Rectangle2D	TokenNameIdentifier
defaultRegion	TokenNameIdentifier
;	TokenNameSEMICOLON
defaultRegion	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Rectangle2D	TokenNameIdentifier
)	TokenNameRPAREN
in	TokenNameIdentifier
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
defaultRegion	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
in2	TokenNameIdentifier
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
primitiveRegion	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
convertFilterPrimitiveRegion	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
filteredElement	TokenNameIdentifier
,	TokenNameCOMMA
filteredNode	TokenNameIdentifier
,	TokenNameCOMMA
defaultRegion	TokenNameIdentifier
,	TokenNameCOMMA
filterRegion	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PadRable	TokenNameIdentifier
pad	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PadRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
primitiveRegion	TokenNameIdentifier
,	TokenNameCOMMA
PadMode	TokenNameIdentifier
.	TokenNameDOT
ZERO_PAD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
srcs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
srcs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
pad	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
srcs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
in2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Filter	TokenNameIdentifier
displacementMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DisplacementMapRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
srcs	TokenNameIdentifier
,	TokenNameCOMMA
scale	TokenNameIdentifier
,	TokenNameCOMMA
xChannelSelector	TokenNameIdentifier
,	TokenNameCOMMA
yChannelSelector	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
handleColorInterpolationFilters	TokenNameIdentifier
(	TokenNameLPAREN
displacementMap	TokenNameIdentifier
,	TokenNameCOMMA
filterElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PadRable	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PadRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
displacementMap	TokenNameIdentifier
,	TokenNameCOMMA
primitiveRegion	TokenNameIdentifier
,	TokenNameCOMMA
PadMode	TokenNameIdentifier
.	TokenNameDOT
ZERO_PAD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
updateFilterMap	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
filterMap	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
ARGBChannel	TokenNameIdentifier
convertChannelSelector	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrName	TokenNameIdentifier
,	TokenNameCOMMA
ARGBChannel	TokenNameIdentifier
defaultChannel	TokenNameIdentifier
,	TokenNameCOMMA
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
filterElement	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
attrName	TokenNameIdentifier
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
return	TokenNamereturn
defaultChannel	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
SVG_A_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ARGBChannel	TokenNameIdentifier
.	TokenNameDOT
A	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
SVG_R_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ARGBChannel	TokenNameIdentifier
.	TokenNameDOT
R	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
SVG_G_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ARGBChannel	TokenNameIdentifier
.	TokenNameDOT
G	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
SVG_B_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ARGBChannel	TokenNameIdentifier
.	TokenNameDOT
B	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
throw	TokenNamethrow
new	TokenNamenew
BridgeException	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
attrName	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
