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
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
LinkedList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
AbstractNode	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
XLinkSupport	TokenNameIdentifier
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
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ParsedURL	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AbstractSVGGradientElementBridge	TokenNameIdentifier
extends	TokenNameextends
AnimatableGenericSVGBridge	TokenNameIdentifier
implements	TokenNameimplements
PaintBridge	TokenNameIdentifier
,	TokenNameCOMMA
ErrorConstants	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
AbstractSVGGradientElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Paint	TokenNameIdentifier
createPaint	TokenNameIdentifier
(	TokenNameLPAREN
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
paintedElement	TokenNameIdentifier
,	TokenNameCOMMA
GraphicsNode	TokenNameIdentifier
paintedNode	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
opacity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
;	TokenNameSEMICOLON
List	TokenNameIdentifier
stops	TokenNameIdentifier
=	TokenNameEQUAL
extractStop	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
opacity	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
stops	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
stopLength	TokenNameIdentifier
=	TokenNameEQUAL
stops	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
stopLength	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
Stop	TokenNameIdentifier
)	TokenNameRPAREN
stops	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
color	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
offsets	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
stopLength	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Color	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
colors	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Color	TokenNameIdentifier
[	TokenNameLBRACKET
stopLength	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
stops	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Stop	TokenNameIdentifier
stop	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Stop	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsets	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
stop	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
colors	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
stop	TokenNameIdentifier
.	TokenNameDOT
color	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
MultipleGradientPaint	TokenNameIdentifier
.	TokenNameDOT
CycleMethodEnum	TokenNameIdentifier
spreadMethod	TokenNameIdentifier
=	TokenNameEQUAL
MultipleGradientPaint	TokenNameIdentifier
.	TokenNameDOT
NO_CYCLE	TokenNameIdentifier
;	TokenNameSEMICOLON
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
SVG_SPREAD_METHOD_ATTRIBUTE	TokenNameIdentifier
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
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
spreadMethod	TokenNameIdentifier
=	TokenNameEQUAL
convertSpreadMethod	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
MultipleGradientPaint	TokenNameIdentifier
.	TokenNameDOT
ColorSpaceEnum	TokenNameIdentifier
colorSpace	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
convertColorInterpolation	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
transform	TokenNameIdentifier
;	TokenNameSEMICOLON
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
SVG_GRADIENT_TRANSFORM_ATTRIBUTE	TokenNameIdentifier
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
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
transform	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
convertTransform	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
SVG_GRADIENT_TRANSFORM_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
transform	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Paint	TokenNameIdentifier
paint	TokenNameIdentifier
=	TokenNameEQUAL
buildGradient	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
paintedElement	TokenNameIdentifier
,	TokenNameCOMMA
paintedNode	TokenNameIdentifier
,	TokenNameCOMMA
spreadMethod	TokenNameIdentifier
,	TokenNameCOMMA
colorSpace	TokenNameIdentifier
,	TokenNameCOMMA
transform	TokenNameIdentifier
,	TokenNameCOMMA
colors	TokenNameIdentifier
,	TokenNameCOMMA
offsets	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
paint	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
abstract	TokenNameabstract
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
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
MultipleGradientPaint	TokenNameIdentifier
.	TokenNameDOT
CycleMethodEnum	TokenNameIdentifier
convertSpreadMethod	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
s	TokenNameIdentifier
,	TokenNameCOMMA
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
SVG_REPEAT_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
MultipleGradientPaint	TokenNameIdentifier
.	TokenNameDOT
REPEAT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
SVG_REFLECT_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
MultipleGradientPaint	TokenNameIdentifier
.	TokenNameDOT
REFLECT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
SVG_PAD_VALUE	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
MultipleGradientPaint	TokenNameIdentifier
.	TokenNameDOT
NO_CYCLE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
throw	TokenNamethrow
new	TokenNamenew
BridgeException	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
SVG_SPREAD_METHOD_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
List	TokenNameIdentifier
extractStop	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
opacity	TokenNameIdentifier
,	TokenNameCOMMA
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
refs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
stops	TokenNameIdentifier
=	TokenNameEQUAL
extractLocalStop	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
opacity	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
stops	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
stops	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
uri	TokenNameIdentifier
=	TokenNameEQUAL
XLinkSupport	TokenNameIdentifier
.	TokenNameDOT
getXLinkHref	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
uri	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
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
String	TokenNameIdentifier
baseURI	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
AbstractNode	TokenNameIdentifier
)	TokenNameRPAREN
paintElement	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getBaseURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ParsedURL	TokenNameIdentifier
purl	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ParsedURL	TokenNameIdentifier
(	TokenNameLPAREN
baseURI	TokenNameIdentifier
,	TokenNameCOMMA
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
contains	TokenNameIdentifier
(	TokenNameLPAREN
refs	TokenNameIdentifier
,	TokenNameCOMMA
purl	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BridgeException	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
ERR_XLINK_HREF_CIRCULAR_DEPENDENCIES	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
uri	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
refs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
purl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
paintElement	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
.	TokenNameDOT
getReferencedElement	TokenNameIdentifier
(	TokenNameLPAREN
paintElement	TokenNameIdentifier
,	TokenNameCOMMA
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
List	TokenNameIdentifier
extractLocalStop	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
gradientElement	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
opacity	TokenNameIdentifier
,	TokenNameCOMMA
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LinkedList	TokenNameIdentifier
stops	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
Stop	TokenNameIdentifier
previous	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
gradientElement	TokenNameIdentifier
.	TokenNameDOT
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
n	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
n	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
n	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Element	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
n	TokenNameIdentifier
;	TokenNameSEMICOLON
Bridge	TokenNameIdentifier
bridge	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
.	TokenNameDOT
getBridge	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
bridge	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
!	TokenNameNOT
(	TokenNameLPAREN
bridge	TokenNameIdentifier
instanceof	TokenNameinstanceof
SVGStopElementBridge	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Stop	TokenNameIdentifier
stop	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
SVGStopElementBridge	TokenNameIdentifier
)	TokenNameRPAREN
bridge	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
createStop	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
gradientElement	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
,	TokenNameCOMMA
opacity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
stops	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
stops	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
previous	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
stop	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
<	TokenNameLESS
previous	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
stop	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
=	TokenNameEQUAL
previous	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
stops	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
stop	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
previous	TokenNameIdentifier
=	TokenNameEQUAL
stop	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
stops	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
boolean	TokenNameboolean
contains	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
urls	TokenNameIdentifier
,	TokenNameCOMMA
ParsedURL	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
urls	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
key	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
Stop	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Color	TokenNameIdentifier
color	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
float	TokenNamefloat
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Stop	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
color	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
offset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
color	TokenNameIdentifier
=	TokenNameEQUAL
color	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
offset	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
SVGStopElementBridge	TokenNameIdentifier
extends	TokenNameextends
AnimatableGenericSVGBridge	TokenNameIdentifier
implements	TokenNameimplements
Bridge	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
SVG_STOP_TAG	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Stop	TokenNameIdentifier
createStop	TokenNameIdentifier
(	TokenNameLPAREN
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
gradientElement	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
stopElement	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
opacity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
stopElement	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_OFFSET_ATTRIBUTE	TokenNameIdentifier
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
stopElement	TokenNameIdentifier
,	TokenNameCOMMA
ERR_ATTRIBUTE_MISSING	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
SVG_OFFSET_ATTRIBUTE	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
offset	TokenNameIdentifier
=	TokenNameEQUAL
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
convertRatio	TokenNameIdentifier
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
stopElement	TokenNameIdentifier
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
SVG_OFFSET_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
,	TokenNameCOMMA
nfEx	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Color	TokenNameIdentifier
color	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
convertStopColor	TokenNameIdentifier
(	TokenNameLPAREN
stopElement	TokenNameIdentifier
,	TokenNameCOMMA
opacity	TokenNameIdentifier
,	TokenNameCOMMA
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
Stop	TokenNameIdentifier
(	TokenNameLPAREN
color	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE