package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Graphics2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Shape	TokenNameIdentifier
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
Mark	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
TextPainter	TokenNameIdentifier
{	TokenNameLBRACE
void	TokenNamevoid
paint	TokenNameIdentifier
(	TokenNameLPAREN
TextNode	TokenNameIdentifier
node	TokenNameIdentifier
,	TokenNameCOMMA
Graphics2D	TokenNameIdentifier
g2d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Mark	TokenNameIdentifier
selectAt	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
x	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
y	TokenNameIdentifier
,	TokenNameCOMMA
TextNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Mark	TokenNameIdentifier
selectTo	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
x	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
y	TokenNameIdentifier
,	TokenNameCOMMA
Mark	TokenNameIdentifier
beginMark	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Mark	TokenNameIdentifier
selectFirst	TokenNameIdentifier
(	TokenNameLPAREN
TextNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Mark	TokenNameIdentifier
selectLast	TokenNameIdentifier
(	TokenNameLPAREN
TextNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Mark	TokenNameIdentifier
getMark	TokenNameIdentifier
(	TokenNameLPAREN
TextNode	TokenNameIdentifier
node	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
index	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
beforeGlyph	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getSelected	TokenNameIdentifier
(	TokenNameLPAREN
Mark	TokenNameIdentifier
start	TokenNameIdentifier
,	TokenNameCOMMA
Mark	TokenNameIdentifier
finish	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Shape	TokenNameIdentifier
getHighlightShape	TokenNameIdentifier
(	TokenNameLPAREN
Mark	TokenNameIdentifier
beginMark	TokenNameIdentifier
,	TokenNameCOMMA
Mark	TokenNameIdentifier
endMark	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Shape	TokenNameIdentifier
getOutline	TokenNameIdentifier
(	TokenNameLPAREN
TextNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
TextNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
getGeometryBounds	TokenNameIdentifier
(	TokenNameLPAREN
TextNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
