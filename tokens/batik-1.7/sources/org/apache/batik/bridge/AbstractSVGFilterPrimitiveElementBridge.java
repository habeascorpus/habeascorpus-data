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
FilterAlphaRable	TokenNameIdentifier
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
FilterColorInterpolation	TokenNameIdentifier
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
FloodRable8Bit	TokenNameIdentifier
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
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
.	TokenNameDOT
BackgroundRable8Bit	TokenNameIdentifier
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
abstract	TokenNameabstract
class	TokenNameclass
AbstractSVGFilterPrimitiveElementBridge	TokenNameIdentifier
extends	TokenNameextends
AnimatableGenericSVGBridge	TokenNameIdentifier
implements	TokenNameimplements
FilterPrimitiveBridge	TokenNameIdentifier
,	TokenNameCOMMA
ErrorConstants	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
AbstractSVGFilterPrimitiveElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
Filter	TokenNameIdentifier
getIn	TokenNameIdentifier
(	TokenNameLPAREN
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
Map	TokenNameIdentifier
filterMap	TokenNameIdentifier
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
SVG_IN_ATTRIBUTE	TokenNameIdentifier
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
inputFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
getFilterSource	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
,	TokenNameCOMMA
filteredElement	TokenNameIdentifier
,	TokenNameCOMMA
filteredNode	TokenNameIdentifier
,	TokenNameCOMMA
filterMap	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
Filter	TokenNameIdentifier
getIn2	TokenNameIdentifier
(	TokenNameLPAREN
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
Map	TokenNameIdentifier
filterMap	TokenNameIdentifier
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
SVG_IN2_ATTRIBUTE	TokenNameIdentifier
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
throw	TokenNamethrow
new	TokenNamenew
BridgeException	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
ERR_ATTRIBUTE_MISSING	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
SVG_IN2_ATTRIBUTE	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
getFilterSource	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
,	TokenNameCOMMA
filteredElement	TokenNameIdentifier
,	TokenNameCOMMA
filteredNode	TokenNameIdentifier
,	TokenNameCOMMA
filterMap	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
void	TokenNamevoid
updateFilterMap	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
filterMap	TokenNameIdentifier
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
SVG_RESULT_ATTRIBUTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
filterMap	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
void	TokenNamevoid
handleColorInterpolationFilters	TokenNameIdentifier
(	TokenNameLPAREN
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
filterElement	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
filter	TokenNameIdentifier
instanceof	TokenNameinstanceof
FilterColorInterpolation	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
isLinear	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
convertColorInterpolationFilters	TokenNameIdentifier
(	TokenNameLPAREN
filterElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
FilterColorInterpolation	TokenNameIdentifier
)	TokenNameRPAREN
filter	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setColorSpaceLinear	TokenNameIdentifier
(	TokenNameLPAREN
isLinear	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
Filter	TokenNameIdentifier
getFilterSource	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
s	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
filteredElement	TokenNameIdentifier
,	TokenNameCOMMA
GraphicsNode	TokenNameIdentifier
filteredNode	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
filterMap	TokenNameIdentifier
,	TokenNameCOMMA
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Filter	TokenNameIdentifier
srcG	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Filter	TokenNameIdentifier
)	TokenNameRPAREN
filterMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
SVG_SOURCE_GRAPHIC_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
filterRegion	TokenNameIdentifier
=	TokenNameEQUAL
srcG	TokenNameIdentifier
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Filter	TokenNameIdentifier
source	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
13	TokenNameIntegerLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
SVG_SOURCE_GRAPHIC_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
source	TokenNameIdentifier
=	TokenNameEQUAL
srcG	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
11	TokenNameIntegerLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
SVG_SOURCE_ALPHA_VALUE	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
SVG_SOURCE_ALPHA_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
source	TokenNameIdentifier
=	TokenNameEQUAL
srcG	TokenNameIdentifier
;	TokenNameSEMICOLON
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FilterAlphaRable	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
SVG_STROKE_PAINT_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Paint	TokenNameIdentifier
paint	TokenNameIdentifier
=	TokenNameEQUAL
PaintServer	TokenNameIdentifier
.	TokenNameDOT
convertStrokePaint	TokenNameIdentifier
(	TokenNameLPAREN
filteredElement	TokenNameIdentifier
,	TokenNameCOMMA
filteredNode	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FloodRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
filterRegion	TokenNameIdentifier
,	TokenNameCOMMA
paint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
15	TokenNameIntegerLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
SVG_BACKGROUND_IMAGE_VALUE	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
SVG_BACKGROUND_IMAGE_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BackgroundRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
filteredNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PadRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
,	TokenNameCOMMA
filterRegion	TokenNameIdentifier
,	TokenNameCOMMA
PadMode	TokenNameIdentifier
.	TokenNameDOT
ZERO_PAD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
SVG_BACKGROUND_ALPHA_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BackgroundRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
filteredNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FilterAlphaRable	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PadRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
,	TokenNameCOMMA
filterRegion	TokenNameIdentifier
,	TokenNameCOMMA
PadMode	TokenNameIdentifier
.	TokenNameDOT
ZERO_PAD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
9	TokenNameIntegerLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
SVG_FILL_PAINT_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Paint	TokenNameIdentifier
paint	TokenNameIdentifier
=	TokenNameEQUAL
PaintServer	TokenNameIdentifier
.	TokenNameDOT
convertFillPaint	TokenNameIdentifier
(	TokenNameLPAREN
filteredElement	TokenNameIdentifier
,	TokenNameCOMMA
filteredNode	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
paint	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
paint	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Color	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FloodRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
filterRegion	TokenNameIdentifier
,	TokenNameCOMMA
paint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
source	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
source	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Filter	TokenNameIdentifier
)	TokenNameRPAREN
filterMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
source	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
final	TokenNamefinal
Rectangle2D	TokenNameIdentifier
INFINITE_FILTER_REGION	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Rectangle2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
Float	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
Float	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
int	TokenNameint
convertInteger	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrName	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
defaultValue	TokenNameIdentifier
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
defaultValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
convertSVGInteger	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
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
attrName	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
float	TokenNamefloat
convertNumber	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
filterElement	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrName	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
defaultValue	TokenNameIdentifier
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
defaultValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
convertSVGNumber	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
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
attrName	TokenNameIdentifier
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
