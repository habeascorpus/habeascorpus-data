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
.	TokenNameDOT
svg	TokenNameIdentifier
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
value	TokenNameIdentifier
.	TokenNameDOT
LengthManager	TokenNameIdentifier
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
css	TokenNameIdentifier
.	TokenNameDOT
engine	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
.	TokenNameDOT
ValueManager	TokenNameIdentifier
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
css	TokenNameIdentifier
.	TokenNameDOT
sac	TokenNameIdentifier
.	TokenNameDOT
LexicalUnit	TokenNameIdentifier
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
SVGTypes	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
StrokeDashoffsetManager	TokenNameIdentifier
extends	TokenNameextends
LengthManager	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isInheritedProperty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isAnimatableProperty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isAdditiveProperty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getPropertyType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
SVGTypes	TokenNameIdentifier
.	TokenNameDOT
TYPE_LENGTH_OR_INHERIT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getPropertyName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
CSSConstants	TokenNameIdentifier
.	TokenNameDOT
CSS_STROKE_DASHOFFSET_PROPERTY	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Value	TokenNameIdentifier
getDefaultValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
SVGValueConstants	TokenNameIdentifier
.	TokenNameDOT
NUMBER_0	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
if	TokenNameif
(	TokenNameLPAREN
lu	TokenNameIdentifier
.	TokenNameDOT
getLexicalUnitType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_INHERIT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
SVGValueConstants	TokenNameIdentifier
.	TokenNameDOT
INHERIT_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
createValue	TokenNameIdentifier
(	TokenNameLPAREN
lu	TokenNameIdentifier
,	TokenNameCOMMA
engine	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
getOrientation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
BOTH_ORIENTATION	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE