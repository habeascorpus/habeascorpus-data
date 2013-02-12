package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
BasicStroke	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Color	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Dimension	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Graphics	TokenNameIdentifier
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
event	TokenNameIdentifier
.	TokenNameDOT
InputEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
event	TokenNameIdentifier
.	TokenNameDOT
MouseEvent	TokenNameIdentifier
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
Line2D	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
AbstractZoomInteractor	TokenNameIdentifier
extends	TokenNameextends
InteractorAdapter	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
finished	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
xStart	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
yStart	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
xCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
yCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Line2D	TokenNameIdentifier
markerTop	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Line2D	TokenNameIdentifier
markerLeft	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Line2D	TokenNameIdentifier
markerBottom	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Line2D	TokenNameIdentifier
markerRight	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Overlay	TokenNameIdentifier
overlay	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ZoomOverlay	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
BasicStroke	TokenNameIdentifier
markerStroke	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BasicStroke	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
BasicStroke	TokenNameIdentifier
.	TokenNameDOT
CAP_SQUARE	TokenNameIdentifier
,	TokenNameCOMMA
BasicStroke	TokenNameIdentifier
.	TokenNameDOT
JOIN_MITER	TokenNameIdentifier
,	TokenNameCOMMA
10	TokenNameIntegerLiteral
,	TokenNameCOMMA
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
endInteraction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
finished	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
mousePressed	TokenNameIdentifier
(	TokenNameLPAREN
MouseEvent	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
finished	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
mouseExited	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finished	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
markerTop	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
markerLeft	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
markerBottom	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
markerRight	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
xStart	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
yStart	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
JGVTComponent	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
JGVTComponent	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
.	TokenNameDOT
getOverlays	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
overlay	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
mouseReleased	TokenNameIdentifier
(	TokenNameLPAREN
MouseEvent	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
finished	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
JGVTComponent	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
JGVTComponent	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
.	TokenNameDOT
getOverlays	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
overlay	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
overlay	TokenNameIdentifier
.	TokenNameDOT
paint	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
getGraphics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xCurrent	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
yCurrent	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
xCurrent	TokenNameIdentifier
-	TokenNameMINUS
xStart	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
(	TokenNameLPAREN
yCurrent	TokenNameIdentifier
-	TokenNameMINUS
yStart	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
dx	TokenNameIdentifier
=	TokenNameEQUAL
xCurrent	TokenNameIdentifier
-	TokenNameMINUS
xStart	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
dy	TokenNameIdentifier
=	TokenNameEQUAL
yCurrent	TokenNameIdentifier
-	TokenNameMINUS
yStart	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dx	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
dx	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
dx	TokenNameIdentifier
;	TokenNameSEMICOLON
xStart	TokenNameIdentifier
=	TokenNameEQUAL
xCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
dy	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
dy	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
dy	TokenNameIdentifier
;	TokenNameSEMICOLON
yStart	TokenNameIdentifier
=	TokenNameEQUAL
yCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Dimension	TokenNameIdentifier
size	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
getSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
scaleX	TokenNameIdentifier
=	TokenNameEQUAL
size	TokenNameIdentifier
.	TokenNameDOT
width	TokenNameIdentifier
/	TokenNameDIVIDE
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
dx	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
scaleY	TokenNameIdentifier
=	TokenNameEQUAL
size	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
/	TokenNameDIVIDE
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
dy	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
scale	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
scaleX	TokenNameIdentifier
<	TokenNameLESS
scaleY	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
scaleX	TokenNameIdentifier
:	TokenNameCOLON
scaleY	TokenNameIdentifier
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
at	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
at	TokenNameIdentifier
.	TokenNameDOT
scale	TokenNameIdentifier
(	TokenNameLPAREN
scale	TokenNameIdentifier
,	TokenNameCOMMA
scale	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
at	TokenNameIdentifier
.	TokenNameDOT
translate	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
xStart	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
yStart	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
at	TokenNameIdentifier
.	TokenNameDOT
concatenate	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
getRenderingTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
.	TokenNameDOT
setRenderingTransform	TokenNameIdentifier
(	TokenNameLPAREN
at	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
mouseExited	TokenNameIdentifier
(	TokenNameLPAREN
MouseEvent	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
finished	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
JGVTComponent	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
JGVTComponent	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
.	TokenNameDOT
getOverlays	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
overlay	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
overlay	TokenNameIdentifier
.	TokenNameDOT
paint	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
getGraphics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
mouseDragged	TokenNameIdentifier
(	TokenNameLPAREN
MouseEvent	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
JGVTComponent	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
JGVTComponent	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
overlay	TokenNameIdentifier
.	TokenNameDOT
paint	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
getGraphics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xCurrent	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
yCurrent	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
xMin	TokenNameIdentifier
,	TokenNameCOMMA
yMin	TokenNameIdentifier
,	TokenNameCOMMA
width	TokenNameIdentifier
,	TokenNameCOMMA
height	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
xStart	TokenNameIdentifier
<	TokenNameLESS
xCurrent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
xMin	TokenNameIdentifier
=	TokenNameEQUAL
xStart	TokenNameIdentifier
;	TokenNameSEMICOLON
width	TokenNameIdentifier
=	TokenNameEQUAL
xCurrent	TokenNameIdentifier
-	TokenNameMINUS
xStart	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
xMin	TokenNameIdentifier
=	TokenNameEQUAL
xCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
width	TokenNameIdentifier
=	TokenNameEQUAL
xStart	TokenNameIdentifier
-	TokenNameMINUS
xCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
yStart	TokenNameIdentifier
<	TokenNameLESS
yCurrent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
yMin	TokenNameIdentifier
=	TokenNameEQUAL
yStart	TokenNameIdentifier
;	TokenNameSEMICOLON
height	TokenNameIdentifier
=	TokenNameEQUAL
yCurrent	TokenNameIdentifier
-	TokenNameMINUS
yStart	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
yMin	TokenNameIdentifier
=	TokenNameEQUAL
yCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
height	TokenNameIdentifier
=	TokenNameEQUAL
yStart	TokenNameIdentifier
-	TokenNameMINUS
yCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Dimension	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
getSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
compAR	TokenNameIdentifier
=	TokenNameEQUAL
d	TokenNameIdentifier
.	TokenNameDOT
width	TokenNameIdentifier
/	TokenNameDIVIDE
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
d	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
compAR	TokenNameIdentifier
>	TokenNameGREATER
width	TokenNameIdentifier
/	TokenNameDIVIDE
height	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
width	TokenNameIdentifier
=	TokenNameEQUAL
compAR	TokenNameIdentifier
*	TokenNameMULTIPLY
height	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
height	TokenNameIdentifier
=	TokenNameEQUAL
width	TokenNameIdentifier
/	TokenNameDIVIDE
compAR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
markerTop	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Line2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
xMin	TokenNameIdentifier
,	TokenNameCOMMA
yMin	TokenNameIdentifier
,	TokenNameCOMMA
xMin	TokenNameIdentifier
+	TokenNamePLUS
width	TokenNameIdentifier
,	TokenNameCOMMA
yMin	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
markerLeft	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Line2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
xMin	TokenNameIdentifier
,	TokenNameCOMMA
yMin	TokenNameIdentifier
,	TokenNameCOMMA
xMin	TokenNameIdentifier
,	TokenNameCOMMA
yMin	TokenNameIdentifier
+	TokenNamePLUS
height	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
markerBottom	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Line2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
xMin	TokenNameIdentifier
,	TokenNameCOMMA
yMin	TokenNameIdentifier
+	TokenNamePLUS
height	TokenNameIdentifier
,	TokenNameCOMMA
xMin	TokenNameIdentifier
+	TokenNamePLUS
width	TokenNameIdentifier
,	TokenNameCOMMA
yMin	TokenNameIdentifier
+	TokenNamePLUS
height	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
markerRight	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Line2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
xMin	TokenNameIdentifier
+	TokenNamePLUS
width	TokenNameIdentifier
,	TokenNameCOMMA
yMin	TokenNameIdentifier
,	TokenNameCOMMA
xMin	TokenNameIdentifier
+	TokenNamePLUS
width	TokenNameIdentifier
,	TokenNameCOMMA
yMin	TokenNameIdentifier
+	TokenNamePLUS
height	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
overlay	TokenNameIdentifier
.	TokenNameDOT
paint	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
getGraphics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
class	TokenNameclass
ZoomOverlay	TokenNameIdentifier
implements	TokenNameimplements
Overlay	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
paint	TokenNameIdentifier
(	TokenNameLPAREN
Graphics	TokenNameIdentifier
g	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
markerTop	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Graphics2D	TokenNameIdentifier
g2d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Graphics2D	TokenNameIdentifier
)	TokenNameRPAREN
g	TokenNameIdentifier
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
setXORMode	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
.	TokenNameDOT
white	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
.	TokenNameDOT
black	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
setStroke	TokenNameIdentifier
(	TokenNameLPAREN
markerStroke	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
draw	TokenNameIdentifier
(	TokenNameLPAREN
markerTop	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
draw	TokenNameIdentifier
(	TokenNameLPAREN
markerLeft	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
draw	TokenNameIdentifier
(	TokenNameLPAREN
markerBottom	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
draw	TokenNameIdentifier
(	TokenNameLPAREN
markerRight	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE