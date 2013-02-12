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
Paint	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
PaintContext	TokenNameIdentifier
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
RenderingHints	TokenNameIdentifier
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
Rectangle2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
ColorModel	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
Raster	TokenNameIdentifier
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
image	TokenNameIdentifier
.	TokenNameDOT
PadMode	TokenNameIdentifier
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
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
Filter	TokenNameIdentifier
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
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
PadRable8Bit	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
PatternPaint	TokenNameIdentifier
implements	TokenNameimplements
Paint	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
GraphicsNode	TokenNameIdentifier
node	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Rectangle2D	TokenNameIdentifier
patternRegion	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
AffineTransform	TokenNameIdentifier
patternTransform	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Filter	TokenNameIdentifier
tile	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
overflow	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
PatternPaintContext	TokenNameIdentifier
lastContext	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
PatternPaint	TokenNameIdentifier
(	TokenNameLPAREN
GraphicsNode	TokenNameIdentifier
node	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle2D	TokenNameIdentifier
patternRegion	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
overflow	TokenNameIdentifier
,	TokenNameCOMMA
AffineTransform	TokenNameIdentifier
patternTransform	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
patternRegion	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
node	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
patternRegion	TokenNameIdentifier
=	TokenNameEQUAL
patternRegion	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
overflow	TokenNameIdentifier
=	TokenNameEQUAL
overflow	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
patternTransform	TokenNameIdentifier
=	TokenNameEQUAL
patternTransform	TokenNameIdentifier
;	TokenNameSEMICOLON
CompositeGraphicsNode	TokenNameIdentifier
comp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CompositeGraphicsNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
comp	TokenNameIdentifier
.	TokenNameDOT
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Filter	TokenNameIdentifier
gnr	TokenNameIdentifier
=	TokenNameEQUAL
comp	TokenNameIdentifier
.	TokenNameDOT
getGraphicsNodeRable	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
padBounds	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Rectangle2D	TokenNameIdentifier
)	TokenNameRPAREN
patternRegion	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
overflow	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
nodeBounds	TokenNameIdentifier
=	TokenNameEQUAL
comp	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
padBounds	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
nodeBounds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
tile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PadRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
gnr	TokenNameIdentifier
,	TokenNameCOMMA
padBounds	TokenNameIdentifier
,	TokenNameCOMMA
PadMode	TokenNameIdentifier
.	TokenNameDOT
ZERO_PAD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
GraphicsNode	TokenNameIdentifier
getGraphicsNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
node	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Rectangle2D	TokenNameIdentifier
getPatternRect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Rectangle2D	TokenNameIdentifier
)	TokenNameRPAREN
patternRegion	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AffineTransform	TokenNameIdentifier
getPatternTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
patternTransform	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getOverflow	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
overflow	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PaintContext	TokenNameIdentifier
createContext	TokenNameIdentifier
(	TokenNameLPAREN
ColorModel	TokenNameIdentifier
cm	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle	TokenNameIdentifier
deviceBounds	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle2D	TokenNameIdentifier
userBounds	TokenNameIdentifier
,	TokenNameCOMMA
AffineTransform	TokenNameIdentifier
xform	TokenNameIdentifier
,	TokenNameCOMMA
RenderingHints	TokenNameIdentifier
hints	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
patternTransform	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
xform	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
xform	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xform	TokenNameIdentifier
.	TokenNameDOT
concatenate	TokenNameIdentifier
(	TokenNameLPAREN
patternTransform	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
lastContext	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
lastContext	TokenNameIdentifier
.	TokenNameDOT
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
cm	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
p	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
6	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
q	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
6	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
xform	TokenNameIdentifier
.	TokenNameDOT
getMatrix	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastContext	TokenNameIdentifier
.	TokenNameDOT
getUsr2Dev	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMatrix	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
p	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
q	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
p	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
q	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
p	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
q	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
p	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
q	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
p	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
q	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
p	TokenNameIdentifier
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
q	TokenNameIdentifier
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
lastContext	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
new	TokenNamenew
PatternPaintContextWrapper	TokenNameIdentifier
(	TokenNameLPAREN
lastContext	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
q	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
-	TokenNameMINUS
p	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
0.5	TokenNameDoubleLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
q	TokenNameIdentifier
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
-	TokenNameMINUS
p	TokenNameIdentifier
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
0.5	TokenNameDoubleLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
lastContext	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PatternPaintContext	TokenNameIdentifier
(	TokenNameLPAREN
cm	TokenNameIdentifier
,	TokenNameCOMMA
xform	TokenNameIdentifier
,	TokenNameCOMMA
hints	TokenNameIdentifier
,	TokenNameCOMMA
tile	TokenNameIdentifier
,	TokenNameCOMMA
patternRegion	TokenNameIdentifier
,	TokenNameCOMMA
overflow	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
lastContext	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getTransparency	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
TRANSLUCENT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
PatternPaintContextWrapper	TokenNameIdentifier
implements	TokenNameimplements
PaintContext	TokenNameIdentifier
{	TokenNameLBRACE
PatternPaintContext	TokenNameIdentifier
ppc	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
xShift	TokenNameIdentifier
,	TokenNameCOMMA
yShift	TokenNameIdentifier
;	TokenNameSEMICOLON
PatternPaintContextWrapper	TokenNameIdentifier
(	TokenNameLPAREN
PatternPaintContext	TokenNameIdentifier
ppc	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
xShift	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
yShift	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
ppc	TokenNameIdentifier
=	TokenNameEQUAL
ppc	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
xShift	TokenNameIdentifier
=	TokenNameEQUAL
xShift	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
yShift	TokenNameIdentifier
=	TokenNameEQUAL
yShift	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
dispose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ColorModel	TokenNameIdentifier
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ppc	TokenNameIdentifier
.	TokenNameDOT
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Raster	TokenNameIdentifier
getRaster	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
y	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
width	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
height	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ppc	TokenNameIdentifier
.	TokenNameDOT
getRaster	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
+	TokenNamePLUS
xShift	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
+	TokenNamePLUS
yShift	TokenNameIdentifier
,	TokenNameCOMMA
width	TokenNameIdentifier
,	TokenNameCOMMA
height	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
