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
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
RectangularShape	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
RoundRectangle2D	TokenNameIdentifier
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
SVGRectangle	TokenNameIdentifier
extends	TokenNameextends
SVGGraphicObjectConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
SVGLine	TokenNameIdentifier
svgLine	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGRectangle	TokenNameIdentifier
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
svgLine	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGLine	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
Rectangle2D	TokenNameIdentifier
rect	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
RectangularShape	TokenNameIdentifier
)	TokenNameRPAREN
rect	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
RoundRectangle2D	TokenNameIdentifier
rect	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
svgRect	TokenNameIdentifier
=	TokenNameEQUAL
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
RectangularShape	TokenNameIdentifier
)	TokenNameRPAREN
rect	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
svgRect	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
svgRect	TokenNameIdentifier
.	TokenNameDOT
getTagName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
SVG_RECT_TAG	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
svgRect	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_RX_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getArcWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgRect	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_RY_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getArcHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
svgRect	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Element	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
RectangularShape	TokenNameIdentifier
rect	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
rect	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
svgRect	TokenNameIdentifier
=	TokenNameEQUAL
generatorContext	TokenNameIdentifier
.	TokenNameDOT
domFactory	TokenNameIdentifier
.	TokenNameDOT
createElementNS	TokenNameIdentifier
(	TokenNameLPAREN
SVG_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
SVG_RECT_TAG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgRect	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_X_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgRect	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_Y_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgRect	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgRect	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
svgRect	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
rect	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
Line2D	TokenNameIdentifier
line	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Line2D	TokenNameIdentifier
.	TokenNameDOT
Double	TokenNameIdentifier
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rect	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rect	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rect	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
rect	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
svgLine	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
rect	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
Line2D	TokenNameIdentifier
line	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Line2D	TokenNameIdentifier
.	TokenNameDOT
Double	TokenNameIdentifier
(	TokenNameLPAREN
rect	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rect	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rect	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
rect	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rect	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
svgLine	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
