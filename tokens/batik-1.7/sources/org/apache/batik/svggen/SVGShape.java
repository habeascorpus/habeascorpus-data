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
Polygon	TokenNameIdentifier
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
Arc2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
Ellipse2D	TokenNameIdentifier
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
SVGShape	TokenNameIdentifier
extends	TokenNameextends
SVGGraphicObjectConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
SVGArc	TokenNameIdentifier
svgArc	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGEllipse	TokenNameIdentifier
svgEllipse	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGLine	TokenNameIdentifier
svgLine	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGPath	TokenNameIdentifier
svgPath	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGPolygon	TokenNameIdentifier
svgPolygon	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGRectangle	TokenNameIdentifier
svgRectangle	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGShape	TokenNameIdentifier
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
svgArc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGArc	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgEllipse	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGEllipse	TokenNameIdentifier
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
svgPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGPath	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgPolygon	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGPolygon	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgRectangle	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGRectangle	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
Shape	TokenNameIdentifier
shape	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
shape	TokenNameIdentifier
instanceof	TokenNameinstanceof
Polygon	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
svgPolygon	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Polygon	TokenNameIdentifier
)	TokenNameRPAREN
shape	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
shape	TokenNameIdentifier
instanceof	TokenNameinstanceof
Rectangle2D	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
svgRectangle	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Rectangle2D	TokenNameIdentifier
)	TokenNameRPAREN
shape	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
shape	TokenNameIdentifier
instanceof	TokenNameinstanceof
RoundRectangle2D	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
svgRectangle	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
RoundRectangle2D	TokenNameIdentifier
)	TokenNameRPAREN
shape	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
shape	TokenNameIdentifier
instanceof	TokenNameinstanceof
Ellipse2D	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
svgEllipse	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Ellipse2D	TokenNameIdentifier
)	TokenNameRPAREN
shape	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
shape	TokenNameIdentifier
instanceof	TokenNameinstanceof
Line2D	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
svgLine	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Line2D	TokenNameIdentifier
)	TokenNameRPAREN
shape	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
shape	TokenNameIdentifier
instanceof	TokenNameinstanceof
Arc2D	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
svgArc	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Arc2D	TokenNameIdentifier
)	TokenNameRPAREN
shape	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
svgPath	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
shape	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE