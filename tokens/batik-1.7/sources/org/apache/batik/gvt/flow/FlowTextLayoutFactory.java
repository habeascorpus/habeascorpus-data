package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
flow	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
font	TokenNameIdentifier
.	TokenNameDOT
FontRenderContext	TokenNameIdentifier
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
text	TokenNameIdentifier
.	TokenNameDOT
AttributedCharacterIterator	TokenNameIdentifier
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
text	TokenNameIdentifier
.	TokenNameDOT
TextLayoutFactory	TokenNameIdentifier
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
text	TokenNameIdentifier
.	TokenNameDOT
TextSpanLayout	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FlowTextLayoutFactory	TokenNameIdentifier
implements	TokenNameimplements
TextLayoutFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
TextSpanLayout	TokenNameIdentifier
createTextLayout	TokenNameIdentifier
(	TokenNameLPAREN
AttributedCharacterIterator	TokenNameIdentifier
aci	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
charMap	TokenNameIdentifier
,	TokenNameCOMMA
Point2D	TokenNameIdentifier
offset	TokenNameIdentifier
,	TokenNameCOMMA
FontRenderContext	TokenNameIdentifier
frc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FlowGlyphLayout	TokenNameIdentifier
(	TokenNameLPAREN
aci	TokenNameIdentifier
,	TokenNameCOMMA
charMap	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
frc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE