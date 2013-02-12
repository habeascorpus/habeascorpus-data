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
Light	TokenNameIdentifier
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
SpecularLightingRable8Bit	TokenNameIdentifier
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
SVGFeSpecularLightingElementBridge	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGLightingElementBridge	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
SVGFeSpecularLightingElementBridge	TokenNameIdentifier
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
SVG_FE_SPECULAR_LIGHTING_TAG	TokenNameIdentifier
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
surfaceScale	TokenNameIdentifier
=	TokenNameEQUAL
convertNumber	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
SVG_SURFACE_SCALE_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
specularConstant	TokenNameIdentifier
=	TokenNameEQUAL
convertNumber	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
SVG_SPECULAR_CONSTANT_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
specularExponent	TokenNameIdentifier
=	TokenNameEQUAL
convertSpecularExponent	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Light	TokenNameIdentifier
light	TokenNameIdentifier
=	TokenNameEQUAL
extractLight	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
kernelUnitLength	TokenNameIdentifier
=	TokenNameEQUAL
convertKernelUnitLength	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
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
Rectangle2D	TokenNameIdentifier
defaultRegion	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
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
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SpecularLightingRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
primitiveRegion	TokenNameIdentifier
,	TokenNameCOMMA
light	TokenNameIdentifier
,	TokenNameCOMMA
specularConstant	TokenNameIdentifier
,	TokenNameCOMMA
specularExponent	TokenNameIdentifier
,	TokenNameCOMMA
surfaceScale	TokenNameIdentifier
,	TokenNameCOMMA
kernelUnitLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
handleColorInterpolationFilters	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
,	TokenNameCOMMA
filterElement	TokenNameIdentifier
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
float	TokenNamefloat
convertSpecularExponent	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
filterElement	TokenNameIdentifier
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
SVG_SPECULAR_EXPONENT_ATTRIBUTE	TokenNameIdentifier
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
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
float	TokenNamefloat
v	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
convertSVGNumber	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
||	TokenNameOR_OR
v	TokenNameIdentifier
>	TokenNameGREATER
128	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
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
SVG_SPECULAR_CONSTANT_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NumberFormatException	TokenNameIdentifier
nfEx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BridgeException	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
nfEx	TokenNameIdentifier
,	TokenNameCOMMA
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
SVG_SPECULAR_CONSTANT_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
,	TokenNameCOMMA
nfEx	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE