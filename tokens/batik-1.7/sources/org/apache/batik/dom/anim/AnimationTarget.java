package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
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
svg	TokenNameIdentifier
.	TokenNameDOT
SVGLength	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
AnimationTarget	TokenNameIdentifier
{	TokenNameLBRACE
short	TokenNameshort
PERCENTAGE_FONT_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
short	TokenNameshort
PERCENTAGE_VIEWPORT_WIDTH	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
short	TokenNameshort
PERCENTAGE_VIEWPORT_HEIGHT	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
short	TokenNameshort
PERCENTAGE_VIEWPORT_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Element	TokenNameIdentifier
getElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
updatePropertyValue	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
pn	TokenNameIdentifier
,	TokenNameCOMMA
AnimatableValue	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
updateAttributeValue	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
ns	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ln	TokenNameIdentifier
,	TokenNameCOMMA
AnimatableValue	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
updateOtherValue	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
type	TokenNameIdentifier
,	TokenNameCOMMA
AnimatableValue	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AnimatableValue	TokenNameIdentifier
getUnderlyingValue	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
ns	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ln	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
short	TokenNameshort
getPercentageInterpretation	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
ns	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
an	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isCSS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
useLinearRGBColorInterpolation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
svgToUserSpace	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
v	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
type	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
pcInterp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
addTargetListener	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
ns	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
an	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isCSS	TokenNameIdentifier
,	TokenNameCOMMA
AnimationTargetListener	TokenNameIdentifier
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
removeTargetListener	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
ns	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
an	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isCSS	TokenNameIdentifier
,	TokenNameCOMMA
AnimationTargetListener	TokenNameIdentifier
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
