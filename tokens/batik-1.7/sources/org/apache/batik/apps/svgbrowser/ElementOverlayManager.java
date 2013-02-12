package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
apps	TokenNameIdentifier
.	TokenNameDOT
svgbrowser	TokenNameIdentifier
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
Rectangle	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
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
GraphicsNode	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
JSVGCanvas	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
Overlay	TokenNameIdentifier
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
ElementOverlayManager	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
Color	TokenNameIdentifier
elementOverlayStrokeColor	TokenNameIdentifier
=	TokenNameEQUAL
Color	TokenNameIdentifier
.	TokenNameDOT
black	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Color	TokenNameIdentifier
elementOverlayColor	TokenNameIdentifier
=	TokenNameEQUAL
Color	TokenNameIdentifier
.	TokenNameDOT
white	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
xorMode	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
protected	TokenNameprotected
JSVGCanvas	TokenNameIdentifier
canvas	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Overlay	TokenNameIdentifier
elementOverlay	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ElementOverlay	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
ArrayList	TokenNameIdentifier
elements	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
ElementOverlayController	TokenNameIdentifier
controller	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
isOverlayEnabled	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
public	TokenNamepublic
ElementOverlayManager	TokenNameIdentifier
(	TokenNameLPAREN
JSVGCanvas	TokenNameIdentifier
canvas	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
canvas	TokenNameIdentifier
=	TokenNameEQUAL
canvas	TokenNameIdentifier
;	TokenNameSEMICOLON
elements	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
canvas	TokenNameIdentifier
.	TokenNameDOT
getOverlays	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
elementOverlay	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addElement	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elem	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
elements	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
elem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
removeElement	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elem	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
elements	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
elem	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
removeElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
elements	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
repaint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Rectangle	TokenNameIdentifier
getAllElementsBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle	TokenNameIdentifier
resultBound	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
elements	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
n	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
currentElement	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
elements	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle	TokenNameIdentifier
currentBound	TokenNameIdentifier
=	TokenNameEQUAL
getElementBounds	TokenNameIdentifier
(	TokenNameLPAREN
currentElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
resultBound	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
resultBound	TokenNameIdentifier
=	TokenNameEQUAL
currentBound	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
resultBound	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
currentBound	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
resultBound	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Rectangle	TokenNameIdentifier
getElementBounds	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elem	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getElementBounds	TokenNameIdentifier
(	TokenNameLPAREN
canvas	TokenNameIdentifier
.	TokenNameDOT
getUpdateManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getBridgeContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getGraphicsNode	TokenNameIdentifier
(	TokenNameLPAREN
elem	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Rectangle	TokenNameIdentifier
getElementBounds	TokenNameIdentifier
(	TokenNameLPAREN
GraphicsNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
AffineTransform	TokenNameIdentifier
at	TokenNameIdentifier
=	TokenNameEQUAL
canvas	TokenNameIdentifier
.	TokenNameDOT
getRenderingTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Shape	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
.	TokenNameDOT
createTransformedShape	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
getOutline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
outset	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Rectangle	TokenNameIdentifier
outset	TokenNameIdentifier
(	TokenNameLPAREN
Rectangle	TokenNameIdentifier
r	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
amount	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
r	TokenNameIdentifier
.	TokenNameDOT
x	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
amount	TokenNameIdentifier
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
amount	TokenNameIdentifier
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
width	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
amount	TokenNameIdentifier
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
amount	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
repaint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
canvas	TokenNameIdentifier
.	TokenNameDOT
repaint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
class	TokenNameclass
ElementOverlay	TokenNameIdentifier
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
controller	TokenNameIdentifier
.	TokenNameDOT
isOverlayEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
isOverlayEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
elements	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
n	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
currentElement	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
elements	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GraphicsNode	TokenNameIdentifier
nodeToPaint	TokenNameIdentifier
=	TokenNameEQUAL
canvas	TokenNameIdentifier
.	TokenNameDOT
getUpdateManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getBridgeContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getGraphicsNode	TokenNameIdentifier
(	TokenNameLPAREN
currentElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nodeToPaint	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
AffineTransform	TokenNameIdentifier
elementsAt	TokenNameIdentifier
=	TokenNameEQUAL
nodeToPaint	TokenNameIdentifier
.	TokenNameDOT
getGlobalTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Shape	TokenNameIdentifier
selectionHighlight	TokenNameIdentifier
=	TokenNameEQUAL
nodeToPaint	TokenNameIdentifier
.	TokenNameDOT
getOutline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
at	TokenNameIdentifier
=	TokenNameEQUAL
canvas	TokenNameIdentifier
.	TokenNameDOT
getRenderingTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
at	TokenNameIdentifier
.	TokenNameDOT
concatenate	TokenNameIdentifier
(	TokenNameLPAREN
elementsAt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Shape	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
.	TokenNameDOT
createTransformedShape	TokenNameIdentifier
(	TokenNameLPAREN
selectionHighlight	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Graphics2D	TokenNameIdentifier
g2d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Graphics2D	TokenNameIdentifier
)	TokenNameRPAREN
g	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
xorMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
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
setXORMode	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
.	TokenNameDOT
yellow	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
fill	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
draw	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
g2d	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
elementOverlayColor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
setStroke	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
BasicStroke	TokenNameIdentifier
(	TokenNameLPAREN
1.8f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
elementOverlayStrokeColor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
draw	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Color	TokenNameIdentifier
getElementOverlayColor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elementOverlayColor	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setElementOverlayColor	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
selectionOverlayColor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
elementOverlayColor	TokenNameIdentifier
=	TokenNameEQUAL
selectionOverlayColor	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Color	TokenNameIdentifier
getElementOverlayStrokeColor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elementOverlayStrokeColor	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setElementOverlayStrokeColor	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
selectionOverlayStrokeColor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
elementOverlayStrokeColor	TokenNameIdentifier
=	TokenNameEQUAL
selectionOverlayStrokeColor	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isXorMode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
xorMode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setXorMode	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
xorMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
xorMode	TokenNameIdentifier
=	TokenNameEQUAL
xorMode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Overlay	TokenNameIdentifier
getElementOverlay	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elementOverlay	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
removeOverlay	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
canvas	TokenNameIdentifier
.	TokenNameDOT
getOverlays	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
elementOverlay	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setController	TokenNameIdentifier
(	TokenNameLPAREN
ElementOverlayController	TokenNameIdentifier
controller	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
controller	TokenNameIdentifier
=	TokenNameEQUAL
controller	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isOverlayEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
isOverlayEnabled	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOverlayEnabled	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
isOverlayEnabled	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
isOverlayEnabled	TokenNameIdentifier
=	TokenNameEQUAL
isOverlayEnabled	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
