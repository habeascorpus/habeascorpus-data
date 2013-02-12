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
font	TokenNameIdentifier
.	TokenNameDOT
TextAttribute	TokenNameIdentifier
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
StringTokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
engine	TokenNameIdentifier
.	TokenNameDOT
SVGCSSEngine	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
engine	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
.	TokenNameDOT
Value	TokenNameIdentifier
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
TextNode	TokenNameIdentifier
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
CSSConstants	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
CSSPrimitiveValue	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
TextUtilities	TokenNameIdentifier
implements	TokenNameimplements
CSSConstants	TokenNameIdentifier
,	TokenNameCOMMA
ErrorConstants	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getElementContent	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
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
switch	TokenNameswitch
(	TokenNameLPAREN
n	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
result	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getElementContent	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
n	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
CDATA_SECTION_NODE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
TEXT_NODE	TokenNameIdentifier
:	TokenNameCOLON
result	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ArrayList	TokenNameIdentifier
svgHorizontalCoordinateArrayToUserSpace	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
valueStr	TokenNameIdentifier
,	TokenNameCOMMA
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
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
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ArrayList	TokenNameIdentifier
values	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringTokenizer	TokenNameIdentifier
st	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
valueStr	TokenNameIdentifier
,	TokenNameCOMMA
", "	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
values	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Float	TokenNameIdentifier
(	TokenNameLPAREN
UnitProcessor	TokenNameIdentifier
.	TokenNameDOT
svgHorizontalCoordinateToUserSpace	TokenNameIdentifier
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
attrName	TokenNameIdentifier
,	TokenNameCOMMA
uctx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
values	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ArrayList	TokenNameIdentifier
svgVerticalCoordinateArrayToUserSpace	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
valueStr	TokenNameIdentifier
,	TokenNameCOMMA
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
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
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ArrayList	TokenNameIdentifier
values	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringTokenizer	TokenNameIdentifier
st	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
valueStr	TokenNameIdentifier
,	TokenNameCOMMA
", "	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
values	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Float	TokenNameIdentifier
(	TokenNameLPAREN
UnitProcessor	TokenNameIdentifier
.	TokenNameDOT
svgVerticalCoordinateToUserSpace	TokenNameIdentifier
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
attrName	TokenNameIdentifier
,	TokenNameCOMMA
uctx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
values	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ArrayList	TokenNameIdentifier
svgRotateArrayToFloats	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attrName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
valueStr	TokenNameIdentifier
,	TokenNameCOMMA
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringTokenizer	TokenNameIdentifier
st	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
valueStr	TokenNameIdentifier
,	TokenNameCOMMA
", "	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ArrayList	TokenNameIdentifier
values	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
values	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Float	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
toRadians	TokenNameIdentifier
(	TokenNameLPAREN
SVGUtilities	TokenNameIdentifier
.	TokenNameDOT
convertSVGNumber	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
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
element	TokenNameIdentifier
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
valueStr	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
values	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Float	TokenNameIdentifier
convertFontSize	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Value	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
SVGCSSEngine	TokenNameIdentifier
.	TokenNameDOT
FONT_SIZE_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
Float	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Float	TokenNameIdentifier
convertFontStyle	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Value	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
SVGCSSEngine	TokenNameIdentifier
.	TokenNameDOT
FONT_STYLE_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getStringValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
'n'	TokenNameCharacterLiteral
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
POSTURE_REGULAR	TokenNameIdentifier
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
POSTURE_OBLIQUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Float	TokenNameIdentifier
convertFontStretch	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Value	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
SVGCSSEngine	TokenNameIdentifier
.	TokenNameDOT
FONT_STRETCH_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
v	TokenNameIdentifier
.	TokenNameDOT
getStringValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
'u'	TokenNameCharacterLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'c'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WIDTH_CONDENSED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WIDTH_EXTENDED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
case	TokenNamecase
'e'	TokenNameCharacterLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'c'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WIDTH_CONDENSED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WIDTH_SEMI_EXTENDED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WIDTH_EXTENDED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
case	TokenNamecase
's'	TokenNameCharacterLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'c'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WIDTH_SEMI_CONDENSED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WIDTH_SEMI_EXTENDED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
default	TokenNamedefault
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WIDTH_REGULAR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Float	TokenNameIdentifier
convertFontWeight	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Value	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
SVGCSSEngine	TokenNameIdentifier
.	TokenNameDOT
FONT_WEIGHT_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
f	TokenNameIdentifier
=	TokenNameEQUAL
v	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
100	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WEIGHT_EXTRA_LIGHT	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
200	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WEIGHT_LIGHT	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
300	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WEIGHT_DEMILIGHT	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
400	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WEIGHT_REGULAR	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
500	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WEIGHT_SEMIBOLD	TokenNameIdentifier
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
WEIGHT_BOLD	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
TextNode	TokenNameIdentifier
.	TokenNameDOT
Anchor	TokenNameIdentifier
convertTextAnchor	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Value	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
SVGCSSEngine	TokenNameIdentifier
.	TokenNameDOT
TEXT_ANCHOR_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getStringValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
's'	TokenNameCharacterLiteral
:	TokenNameCOLON
return	TokenNamereturn
TextNode	TokenNameIdentifier
.	TokenNameDOT
Anchor	TokenNameIdentifier
.	TokenNameDOT
START	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
'm'	TokenNameCharacterLiteral
:	TokenNameCOLON
return	TokenNamereturn
TextNode	TokenNameIdentifier
.	TokenNameDOT
Anchor	TokenNameIdentifier
.	TokenNameDOT
MIDDLE	TokenNameIdentifier
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
return	TokenNamereturn
TextNode	TokenNameIdentifier
.	TokenNameDOT
Anchor	TokenNameIdentifier
.	TokenNameDOT
END	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Object	TokenNameIdentifier
convertBaselineShift	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Value	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
SVGCSSEngine	TokenNameIdentifier
.	TokenNameDOT
BASELINE_SHIFT_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getPrimitiveType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_IDENT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
v	TokenNameIdentifier
.	TokenNameDOT
getStringValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
'p'	TokenNameCharacterLiteral
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
SUPERSCRIPT_SUPER	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
'b'	TokenNameCharacterLiteral
:	TokenNameCOLON
return	TokenNamereturn
TextAttribute	TokenNameIdentifier
.	TokenNameDOT
SUPERSCRIPT_SUB	TokenNameIdentifier
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Float	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Float	TokenNameIdentifier
convertKerning	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Value	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
SVGCSSEngine	TokenNameIdentifier
.	TokenNameDOT
KERNING_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getPrimitiveType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_IDENT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
Float	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Float	TokenNameIdentifier
convertLetterSpacing	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Value	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
SVGCSSEngine	TokenNameIdentifier
.	TokenNameDOT
LETTER_SPACING_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getPrimitiveType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_IDENT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
Float	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Float	TokenNameIdentifier
convertWordSpacing	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Value	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
CSSUtilities	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
SVGCSSEngine	TokenNameIdentifier
.	TokenNameDOT
WORD_SPACING_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getPrimitiveType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_IDENT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
Float	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE