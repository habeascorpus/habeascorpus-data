package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
extension	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
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
bridge	TokenNameIdentifier
.	TokenNameDOT
AbstractSVGFilterPrimitiveElementBridge	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
.	TokenNameDOT
Bridge	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
.	TokenNameDOT
BridgeContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
.	TokenNameDOT
BridgeException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
.	TokenNameDOT
SVGUtilities	TokenNameIdentifier
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
BatikHistogramNormalizationElementBridge	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGFilterPrimitiveElementBridge	TokenNameIdentifier
implements	TokenNameimplements
BatikExtConstants	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
BatikHistogramNormalizationElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
BATIK_EXT_NAMESPACE_URI	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
BATIK_EXT_HISTOGRAM_NORMALIZATION_TAG	TokenNameIdentifier
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
BatikHistogramNormalizationElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
sourceGraphics	TokenNameIdentifier
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
defaultRegion	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
in	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
sourceGraphics	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
defaultRegion	TokenNameIdentifier
=	TokenNameEQUAL
filterRegion	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
defaultRegion	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
float	TokenNamefloat
trim	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
filterElement	TokenNameIdentifier
.	TokenNameDOT
getAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
BATIK_EXT_TRIM_ATTRIBUTE	TokenNameIdentifier
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
try	TokenNametry
{	TokenNameLBRACE
trim	TokenNameIdentifier
=	TokenNameEQUAL
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
BATIK_EXT_TRIM_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
trim	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
trim	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
trim	TokenNameIdentifier
>	TokenNameGREATER
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
trim	TokenNameIdentifier
=	TokenNameEQUAL
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BatikHistogramNormalizationFilter8Bit	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
,	TokenNameCOMMA
trim	TokenNameIdentifier
/	TokenNameDIVIDE
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PadRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
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
handleColorInterpolationFilters	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
,	TokenNameCOMMA
filterElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
int	TokenNameint
convertSides	TokenNameIdentifier
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
int	TokenNameint
ret	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
ret	TokenNameIdentifier
=	TokenNameEQUAL
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
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
<	TokenNameLESS
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
