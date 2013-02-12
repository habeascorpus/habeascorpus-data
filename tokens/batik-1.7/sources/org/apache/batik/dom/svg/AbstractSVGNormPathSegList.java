package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
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
AffineTransform	TokenNameIdentifier
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
PathIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
ExtendedGeneralPath	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
.	TokenNameDOT
DefaultPathHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
.	TokenNameDOT
ParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
.	TokenNameDOT
PathParser	TokenNameIdentifier
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
SVGPathSeg	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AbstractSVGNormPathSegList	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGPathSegList	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
AbstractSVGNormPathSegList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
doParse	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
ListHandler	TokenNameIdentifier
handler	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
PathParser	TokenNameIdentifier
pathParser	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PathParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
NormalizedPathSegListBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NormalizedPathSegListBuilder	TokenNameIdentifier
(	TokenNameLPAREN
handler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pathParser	TokenNameIdentifier
.	TokenNameDOT
setPathHandler	TokenNameIdentifier
(	TokenNameLPAREN
builder	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pathParser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
class	TokenNameclass
NormalizedPathSegListBuilder	TokenNameIdentifier
extends	TokenNameextends
DefaultPathHandler	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
ListHandler	TokenNameIdentifier
listHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
SVGPathSegGenericItem	TokenNameIdentifier
lastAbs	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
NormalizedPathSegListBuilder	TokenNameIdentifier
(	TokenNameLPAREN
ListHandler	TokenNameIdentifier
listHandler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
listHandler	TokenNameIdentifier
=	TokenNameEQUAL
listHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
listHandler	TokenNameIdentifier
.	TokenNameDOT
startList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGPathSegGenericItem	TokenNameIdentifier
(	TokenNameLPAREN
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_MOVETO_ABS	TokenNameIdentifier
,	TokenNameCOMMA
PATHSEG_MOVETO_ABS_LETTER	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
listHandler	TokenNameIdentifier
.	TokenNameDOT
endList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
movetoRel	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
movetoAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
movetoAbs	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
listHandler	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SVGPathSegMovetoLinetoItem	TokenNameIdentifier
(	TokenNameLPAREN
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_MOVETO_ABS	TokenNameIdentifier
,	TokenNameCOMMA
PATHSEG_MOVETO_ABS_LETTER	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setX	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setY	TokenNameIdentifier
(	TokenNameLPAREN
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setPathSegType	TokenNameIdentifier
(	TokenNameLPAREN
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_MOVETO_ABS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
closePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
listHandler	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SVGPathSegItem	TokenNameIdentifier
(	TokenNameLPAREN
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_CLOSEPATH	TokenNameIdentifier
,	TokenNameCOMMA
PATHSEG_CLOSEPATH_LETTER	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
linetoRel	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
linetoAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
linetoAbs	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
listHandler	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SVGPathSegMovetoLinetoItem	TokenNameIdentifier
(	TokenNameLPAREN
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_LINETO_ABS	TokenNameIdentifier
,	TokenNameCOMMA
PATHSEG_LINETO_ABS_LETTER	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setX	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setY	TokenNameIdentifier
(	TokenNameLPAREN
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setPathSegType	TokenNameIdentifier
(	TokenNameLPAREN
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_LINETO_ABS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
linetoHorizontalRel	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
linetoAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
linetoHorizontalAbs	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
linetoAbs	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
linetoVerticalRel	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
linetoAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
linetoVerticalAbs	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
linetoAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
curvetoCubicRel	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
curvetoCubicAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x1	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y1	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x2	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y2	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
curvetoCubicAbs	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
listHandler	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SVGPathSegCurvetoCubicItem	TokenNameIdentifier
(	TokenNameLPAREN
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_CURVETO_CUBIC_ABS	TokenNameIdentifier
,	TokenNameCOMMA
PATHSEG_CURVETO_CUBIC_ABS_LETTER	TokenNameIdentifier
,	TokenNameCOMMA
x1	TokenNameIdentifier
,	TokenNameCOMMA
y1	TokenNameIdentifier
,	TokenNameCOMMA
x2	TokenNameIdentifier
,	TokenNameCOMMA
y2	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
x1	TokenNameIdentifier
,	TokenNameCOMMA
y1	TokenNameIdentifier
,	TokenNameCOMMA
x2	TokenNameIdentifier
,	TokenNameCOMMA
y2	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setPathSegType	TokenNameIdentifier
(	TokenNameLPAREN
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_CURVETO_CUBIC_ABS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
curvetoCubicSmoothRel	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
curvetoCubicSmoothAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x2	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y2	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
curvetoCubicSmoothAbs	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getPathSegType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_CURVETO_CUBIC_ABS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
curvetoCubicAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
x2	TokenNameIdentifier
,	TokenNameCOMMA
y2	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
curvetoCubicAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
x2	TokenNameIdentifier
,	TokenNameCOMMA
y2	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
curvetoQuadraticRel	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
curvetoQuadraticAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x1	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y1	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
curvetoQuadraticAbs	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
curvetoCubicAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
(	TokenNameLPAREN
x1	TokenNameIdentifier
-	TokenNameMINUS
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
(	TokenNameLPAREN
y1	TokenNameIdentifier
-	TokenNameMINUS
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
x	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
(	TokenNameLPAREN
x1	TokenNameIdentifier
-	TokenNameMINUS
x	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
y	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
(	TokenNameLPAREN
y1	TokenNameIdentifier
-	TokenNameMINUS
y	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setX1	TokenNameIdentifier
(	TokenNameLPAREN
x1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setY1	TokenNameIdentifier
(	TokenNameLPAREN
y1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setPathSegType	TokenNameIdentifier
(	TokenNameLPAREN
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_CURVETO_QUADRATIC_ABS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
curvetoQuadraticSmoothRel	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
curvetoQuadraticSmoothAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
curvetoQuadraticSmoothAbs	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getPathSegType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_CURVETO_QUADRATIC_ABS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
curvetoQuadraticAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
curvetoQuadraticAbs	TokenNameIdentifier
(	TokenNameLPAREN
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
arcRel	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
rx	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
ry	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
xAxisRotation	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
largeArcFlag	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
sweepFlag	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
arcAbs	TokenNameIdentifier
(	TokenNameLPAREN
rx	TokenNameIdentifier
,	TokenNameCOMMA
ry	TokenNameIdentifier
,	TokenNameCOMMA
xAxisRotation	TokenNameIdentifier
,	TokenNameCOMMA
largeArcFlag	TokenNameIdentifier
,	TokenNameCOMMA
sweepFlag	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
arcAbs	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
rx	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
ry	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
xAxisRotation	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
largeArcFlag	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
sweepFlag	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
rx	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
ry	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
linetoAbs	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
double	TokenNamedouble
x0	TokenNameIdentifier
=	TokenNameEQUAL
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
y0	TokenNameIdentifier
=	TokenNameEQUAL
lastAbs	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
x0	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
x	TokenNameIdentifier
&&	TokenNameAND_AND
y0	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Arc2D	TokenNameIdentifier
arc	TokenNameIdentifier
=	TokenNameEQUAL
ExtendedGeneralPath	TokenNameIdentifier
.	TokenNameDOT
computeArc	TokenNameIdentifier
(	TokenNameLPAREN
x0	TokenNameIdentifier
,	TokenNameCOMMA
y0	TokenNameIdentifier
,	TokenNameCOMMA
rx	TokenNameIdentifier
,	TokenNameCOMMA
ry	TokenNameIdentifier
,	TokenNameCOMMA
xAxisRotation	TokenNameIdentifier
,	TokenNameCOMMA
largeArcFlag	TokenNameIdentifier
,	TokenNameCOMMA
sweepFlag	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
arc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
AffineTransform	TokenNameIdentifier
.	TokenNameDOT
getRotateInstance	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
toRadians	TokenNameIdentifier
(	TokenNameLPAREN
xAxisRotation	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
arc	TokenNameIdentifier
.	TokenNameDOT
getCenterX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
arc	TokenNameIdentifier
.	TokenNameDOT
getCenterY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Shape	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
.	TokenNameDOT
createTransformedShape	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PathIterator	TokenNameIdentifier
pi	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
getPathIterator	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
d	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
!	TokenNameNOT
pi	TokenNameIdentifier
.	TokenNameDOT
isDone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
i	TokenNameIdentifier
=	TokenNameEQUAL
pi	TokenNameIdentifier
.	TokenNameDOT
currentSegment	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
PathIterator	TokenNameIdentifier
.	TokenNameDOT
SEG_CUBICTO	TokenNameIdentifier
:	TokenNameCOLON
curvetoCubicAbs	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
d	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
d	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
d	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
d	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
d	TokenNameIdentifier
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
pi	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
lastAbs	TokenNameIdentifier
.	TokenNameDOT
setPathSegType	TokenNameIdentifier
(	TokenNameLPAREN
SVGPathSeg	TokenNameIdentifier
.	TokenNameDOT
PATHSEG_ARC_ABS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
class	TokenNameclass
SVGPathSegGenericItem	TokenNameIdentifier
extends	TokenNameextends
SVGPathSegItem	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
SVGPathSegGenericItem	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
type	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
letter	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
type	TokenNameIdentifier
,	TokenNameCOMMA
letter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
x1	TokenNameIdentifier
=	TokenNameEQUAL
x2	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
y1	TokenNameIdentifier
=	TokenNameEQUAL
y2	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
x2	TokenNameIdentifier
=	TokenNameEQUAL
x2	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
y2	TokenNameIdentifier
=	TokenNameEQUAL
y2	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
x	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
y	TokenNameIdentifier
=	TokenNameEQUAL
y	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setValue	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y1	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y2	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
x1	TokenNameIdentifier
=	TokenNameEQUAL
x2	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
y1	TokenNameIdentifier
=	TokenNameEQUAL
y2	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
x2	TokenNameIdentifier
=	TokenNameEQUAL
x2	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
y2	TokenNameIdentifier
=	TokenNameEQUAL
y2	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
x	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
y	TokenNameIdentifier
=	TokenNameEQUAL
y	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setValue	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
x	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
y	TokenNameIdentifier
=	TokenNameEQUAL
y	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPathSegType	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
type	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
x	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
y	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setX	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
x	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setY	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
y	TokenNameIdentifier
=	TokenNameEQUAL
y	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
getX1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
x1	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
getY1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
y1	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setX1	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
x1	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setY1	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
y1	TokenNameIdentifier
=	TokenNameEQUAL
y	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
getX2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
x2	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
getY2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
y2	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setX2	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
x2	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setY2	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
y2	TokenNameIdentifier
=	TokenNameEQUAL
y	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE