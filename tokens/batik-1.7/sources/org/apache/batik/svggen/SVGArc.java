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
Point2D	TokenNameIdentifier
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
SVGArc	TokenNameIdentifier
extends	TokenNameextends
SVGGraphicObjectConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
SVGLine	TokenNameIdentifier
svgLine	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGEllipse	TokenNameIdentifier
svgEllipse	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGArc	TokenNameIdentifier
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
Arc2D	TokenNameIdentifier
arc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
ext	TokenNameIdentifier
=	TokenNameEQUAL
arc	TokenNameIdentifier
.	TokenNameDOT
getAngleExtent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
width	TokenNameIdentifier
=	TokenNameEQUAL
arc	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
height	TokenNameIdentifier
=	TokenNameEQUAL
arc	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
width	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
height	TokenNameIdentifier
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
arc	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
arc	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
arc	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
width	TokenNameIdentifier
,	TokenNameCOMMA
arc	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
height	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
svgLine	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
svgLine	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGLine	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
svgLine	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ext	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
360	TokenNameIntegerLiteral
||	TokenNameOR_OR
ext	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
-	TokenNameMINUS
360	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
Ellipse2D	TokenNameIdentifier
ellipse	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Ellipse2D	TokenNameIdentifier
.	TokenNameDOT
Double	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
arc	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
width	TokenNameIdentifier
,	TokenNameCOMMA
height	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
svgEllipse	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
svgEllipse	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGEllipse	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
svgEllipse	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
ellipse	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Element	TokenNameIdentifier
svgPath	TokenNameIdentifier
=	TokenNameEQUAL
generatorContext	TokenNameIdentifier
.	TokenNameDOT
domFactory	TokenNameIdentifier
.	TokenNameDOT
createElementNS	TokenNameIdentifier
(	TokenNameLPAREN
SVG_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
SVG_PATH_TAG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
64	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Point2D	TokenNameIdentifier
startPt	TokenNameIdentifier
=	TokenNameEQUAL
arc	TokenNameIdentifier
.	TokenNameDOT
getStartPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Point2D	TokenNameIdentifier
endPt	TokenNameIdentifier
=	TokenNameEQUAL
arc	TokenNameIdentifier
.	TokenNameDOT
getEndPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
type	TokenNameIdentifier
=	TokenNameEQUAL
arc	TokenNameIdentifier
.	TokenNameDOT
getArcType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
PATH_MOVE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
startPt	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
startPt	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
PATH_ARC	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
width	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
height	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ext	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ext	TokenNameIdentifier
>	TokenNameGREATER
180	TokenNameIntegerLiteral
)	TokenNameRPAREN
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'1'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ext	TokenNameIdentifier
<	TokenNameLESS
-	TokenNameMINUS
180	TokenNameIntegerLiteral
)	TokenNameRPAREN
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'1'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'1'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
endPt	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
endPt	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Arc2D	TokenNameIdentifier
.	TokenNameDOT
CHORD	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
PATH_CLOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Arc2D	TokenNameIdentifier
.	TokenNameDOT
PIE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
cx	TokenNameIdentifier
=	TokenNameEQUAL
arc	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
width	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
double	TokenNamedouble
cy	TokenNameIdentifier
=	TokenNameEQUAL
arc	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
height	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
PATH_LINE_TO	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
cx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
cy	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
PATH_CLOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
svgPath	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_D_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
d	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
svgPath	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
