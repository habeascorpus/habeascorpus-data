package	TokenNamepackage
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
CSSContext	TokenNameIdentifier
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
CSSEngine	TokenNameIdentifier
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
CSSStylableElement	TokenNameIdentifier
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
StyleMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
sac	TokenNameIdentifier
.	TokenNameDOT
LexicalUnit	TokenNameIdentifier
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
css	TokenNameIdentifier
.	TokenNameDOT
CSSPrimitiveValue	TokenNameIdentifier
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
CSSValue	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
LengthManager	TokenNameIdentifier
extends	TokenNameextends
AbstractValueManager	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
SQRT2	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
2.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
Value	TokenNameIdentifier
createValue	TokenNameIdentifier
(	TokenNameLPAREN
LexicalUnit	TokenNameIdentifier
lu	TokenNameIdentifier
,	TokenNameCOMMA
CSSEngine	TokenNameIdentifier
engine	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
lu	TokenNameIdentifier
.	TokenNameDOT
getLexicalUnitType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_EM	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_EMS	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_EX	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_EXS	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_PIXEL	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PX	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_CENTIMETER	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_CM	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_MILLIMETER	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_MM	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_INCH	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_IN	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_POINT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PT	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_PICA	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PC	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_INTEGER	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getIntegerValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_REAL	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_PERCENTAGE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PERCENTAGE	TokenNameIdentifier
,	TokenNameCOMMA
lu	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
throw	TokenNamethrow
createInvalidLexicalUnitDOMException	TokenNameIdentifier
(	TokenNameLPAREN
lu	TokenNameIdentifier
.	TokenNameDOT
getLexicalUnitType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Value	TokenNameIdentifier
createFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
type	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
floatValue	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PERCENTAGE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_EMS	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_EXS	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PX	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_CM	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_MM	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_IN	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PT	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PC	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
,	TokenNameCOMMA
floatValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
throw	TokenNamethrow
createInvalidFloatTypeDOMException	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Value	TokenNameIdentifier
computeValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSStylableElement	TokenNameIdentifier
elt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
pseudo	TokenNameIdentifier
,	TokenNameCOMMA
CSSEngine	TokenNameIdentifier
engine	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
idx	TokenNameIdentifier
,	TokenNameCOMMA
StyleMap	TokenNameIdentifier
sm	TokenNameIdentifier
,	TokenNameCOMMA
Value	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
getCssValueType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
CSSValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PRIMITIVE_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
getPrimitiveType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PX	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_MM	TokenNameIdentifier
:	TokenNameCOLON
CSSContext	TokenNameIdentifier
ctx	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
.	TokenNameDOT
getCSSContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
v	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
,	TokenNameCOMMA
v	TokenNameIdentifier
/	TokenNameDIVIDE
ctx	TokenNameIdentifier
.	TokenNameDOT
getPixelUnitToMillimeter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_CM	TokenNameIdentifier
:	TokenNameCOLON
ctx	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
.	TokenNameDOT
getCSSContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
,	TokenNameCOMMA
v	TokenNameIdentifier
*	TokenNameMULTIPLY
10f	TokenNameFloatingPointLiteral
/	TokenNameDIVIDE
ctx	TokenNameIdentifier
.	TokenNameDOT
getPixelUnitToMillimeter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_IN	TokenNameIdentifier
:	TokenNameCOLON
ctx	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
.	TokenNameDOT
getCSSContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
,	TokenNameCOMMA
v	TokenNameIdentifier
*	TokenNameMULTIPLY
25.4f	TokenNameFloatingPointLiteral
/	TokenNameDIVIDE
ctx	TokenNameIdentifier
.	TokenNameDOT
getPixelUnitToMillimeter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PT	TokenNameIdentifier
:	TokenNameCOLON
ctx	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
.	TokenNameDOT
getCSSContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
,	TokenNameCOMMA
v	TokenNameIdentifier
*	TokenNameMULTIPLY
25.4f	TokenNameFloatingPointLiteral
/	TokenNameDIVIDE
(	TokenNameLPAREN
72f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
ctx	TokenNameIdentifier
.	TokenNameDOT
getPixelUnitToMillimeter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PC	TokenNameIdentifier
:	TokenNameCOLON
ctx	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
.	TokenNameDOT
getCSSContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
v	TokenNameIdentifier
*	TokenNameMULTIPLY
25.4f	TokenNameFloatingPointLiteral
/	TokenNameDIVIDE
(	TokenNameLPAREN
6f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
ctx	TokenNameIdentifier
.	TokenNameDOT
getPixelUnitToMillimeter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_EMS	TokenNameIdentifier
:	TokenNameCOLON
sm	TokenNameIdentifier
.	TokenNameDOT
putFontSizeRelative	TokenNameIdentifier
(	TokenNameLPAREN
idx	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
fsidx	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
.	TokenNameDOT
getFontSizeIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
fs	TokenNameIdentifier
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
elt	TokenNameIdentifier
,	TokenNameCOMMA
pseudo	TokenNameIdentifier
,	TokenNameCOMMA
fsidx	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
,	TokenNameCOMMA
v	TokenNameIdentifier
*	TokenNameMULTIPLY
fs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_EXS	TokenNameIdentifier
:	TokenNameCOLON
sm	TokenNameIdentifier
.	TokenNameDOT
putFontSizeRelative	TokenNameIdentifier
(	TokenNameLPAREN
idx	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fsidx	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
.	TokenNameDOT
getFontSizeIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
.	TokenNameDOT
getComputedStyle	TokenNameIdentifier
(	TokenNameLPAREN
elt	TokenNameIdentifier
,	TokenNameCOMMA
pseudo	TokenNameIdentifier
,	TokenNameCOMMA
fsidx	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
,	TokenNameCOMMA
v	TokenNameIdentifier
*	TokenNameMULTIPLY
fs	TokenNameIdentifier
*	TokenNameMULTIPLY
0.5f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_PERCENTAGE	TokenNameIdentifier
:	TokenNameCOLON
ctx	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
.	TokenNameDOT
getCSSContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
getOrientation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
HORIZONTAL_ORIENTATION	TokenNameIdentifier
:	TokenNameCOLON
sm	TokenNameIdentifier
.	TokenNameDOT
putBlockWidthRelative	TokenNameIdentifier
(	TokenNameLPAREN
idx	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
ctx	TokenNameIdentifier
.	TokenNameDOT
getBlockWidth	TokenNameIdentifier
(	TokenNameLPAREN
elt	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
100f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
VERTICAL_ORIENTATION	TokenNameIdentifier
:	TokenNameCOLON
sm	TokenNameIdentifier
.	TokenNameDOT
putBlockHeightRelative	TokenNameIdentifier
(	TokenNameLPAREN
idx	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
ctx	TokenNameIdentifier
.	TokenNameDOT
getBlockHeight	TokenNameIdentifier
(	TokenNameLPAREN
elt	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
100f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
sm	TokenNameIdentifier
.	TokenNameDOT
putBlockWidthRelative	TokenNameIdentifier
(	TokenNameLPAREN
idx	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sm	TokenNameIdentifier
.	TokenNameDOT
putBlockHeightRelative	TokenNameIdentifier
(	TokenNameLPAREN
idx	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
w	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
.	TokenNameDOT
getBlockWidth	TokenNameIdentifier
(	TokenNameLPAREN
elt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
h	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
.	TokenNameDOT
getBlockHeight	TokenNameIdentifier
(	TokenNameLPAREN
elt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
getFloatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
w	TokenNameIdentifier
*	TokenNameMULTIPLY
w	TokenNameIdentifier
+	TokenNamePLUS
h	TokenNameIdentifier
*	TokenNameMULTIPLY
h	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
SQRT2	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
100.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
FloatValue	TokenNameIdentifier
(	TokenNameLPAREN
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_NUMBER	TokenNameIdentifier
,	TokenNameCOMMA
fs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
HORIZONTAL_ORIENTATION	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
VERTICAL_ORIENTATION	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
BOTH_ORIENTATION	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
abstract	TokenNameabstract
int	TokenNameint
getOrientation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
