package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
svggen	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
Line2D	TokenNameIdentifier
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
SVGLine	TokenNameIdentifier
extends	TokenNameextends
SVGGraphicObjectConverter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
SVGLine	TokenNameIdentifier
(	TokenNameLPAREN
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
Line2D	TokenNameIdentifier
line	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
svgLine	TokenNameIdentifier
=	TokenNameEQUAL
generatorContext	TokenNameIdentifier
.	TokenNameDOT
domFactory	TokenNameIdentifier
.	TokenNameDOT
createElementNS	TokenNameIdentifier
(	TokenNameLPAREN
SVG_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
SVG_LINE_TAG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgLine	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_X1_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
getX1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgLine	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_Y1_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
getY1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgLine	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_X2_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
getX2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgLine	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_Y2_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
getY2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
svgLine	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
