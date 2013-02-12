package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
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
NoninvertibleTransformException	TokenNameIdentifier
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
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
RadialGradientPaint	TokenNameIdentifier
extends	TokenNameextends
MultipleGradientPaint	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Point2D	TokenNameIdentifier
focus	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Point2D	TokenNameIdentifier
center	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
radius	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
RadialGradientPaint	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
cx	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
cy	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
radius	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fractions	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
colors	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
cx	TokenNameIdentifier
,	TokenNameCOMMA
cy	TokenNameIdentifier
,	TokenNameCOMMA
radius	TokenNameIdentifier
,	TokenNameCOMMA
cx	TokenNameIdentifier
,	TokenNameCOMMA
cy	TokenNameIdentifier
,	TokenNameCOMMA
fractions	TokenNameIdentifier
,	TokenNameCOMMA
colors	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RadialGradientPaint	TokenNameIdentifier
(	TokenNameLPAREN
Point2D	TokenNameIdentifier
center	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
radius	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fractions	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
colors	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
center	TokenNameIdentifier
,	TokenNameCOMMA
radius	TokenNameIdentifier
,	TokenNameCOMMA
center	TokenNameIdentifier
,	TokenNameCOMMA
fractions	TokenNameIdentifier
,	TokenNameCOMMA
colors	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RadialGradientPaint	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
cx	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
cy	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
radius	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
fx	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
fy	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fractions	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
colors	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
new	TokenNamenew
Point2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
cx	TokenNameIdentifier
,	TokenNameCOMMA
cy	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
radius	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Point2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
fx	TokenNameIdentifier
,	TokenNameCOMMA
fy	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
fractions	TokenNameIdentifier
,	TokenNameCOMMA
colors	TokenNameIdentifier
,	TokenNameCOMMA
NO_CYCLE	TokenNameIdentifier
,	TokenNameCOMMA
SRGB	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RadialGradientPaint	TokenNameIdentifier
(	TokenNameLPAREN
Point2D	TokenNameIdentifier
center	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
radius	TokenNameIdentifier
,	TokenNameCOMMA
Point2D	TokenNameIdentifier
focus	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fractions	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
colors	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
center	TokenNameIdentifier
,	TokenNameCOMMA
radius	TokenNameIdentifier
,	TokenNameCOMMA
focus	TokenNameIdentifier
,	TokenNameCOMMA
fractions	TokenNameIdentifier
,	TokenNameCOMMA
colors	TokenNameIdentifier
,	TokenNameCOMMA
NO_CYCLE	TokenNameIdentifier
,	TokenNameCOMMA
SRGB	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RadialGradientPaint	TokenNameIdentifier
(	TokenNameLPAREN
Point2D	TokenNameIdentifier
center	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
radius	TokenNameIdentifier
,	TokenNameCOMMA
Point2D	TokenNameIdentifier
focus	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fractions	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
colors	TokenNameIdentifier
,	TokenNameCOMMA
CycleMethodEnum	TokenNameIdentifier
cycleMethod	TokenNameIdentifier
,	TokenNameCOMMA
ColorSpaceEnum	TokenNameIdentifier
colorSpace	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
center	TokenNameIdentifier
,	TokenNameCOMMA
radius	TokenNameIdentifier
,	TokenNameCOMMA
focus	TokenNameIdentifier
,	TokenNameCOMMA
fractions	TokenNameIdentifier
,	TokenNameCOMMA
colors	TokenNameIdentifier
,	TokenNameCOMMA
cycleMethod	TokenNameIdentifier
,	TokenNameCOMMA
colorSpace	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RadialGradientPaint	TokenNameIdentifier
(	TokenNameLPAREN
Point2D	TokenNameIdentifier
center	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
radius	TokenNameIdentifier
,	TokenNameCOMMA
Point2D	TokenNameIdentifier
focus	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fractions	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
colors	TokenNameIdentifier
,	TokenNameCOMMA
CycleMethodEnum	TokenNameIdentifier
cycleMethod	TokenNameIdentifier
,	TokenNameCOMMA
ColorSpaceEnum	TokenNameIdentifier
colorSpace	TokenNameIdentifier
,	TokenNameCOMMA
AffineTransform	TokenNameIdentifier
gradientTransform	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
fractions	TokenNameIdentifier
,	TokenNameCOMMA
colors	TokenNameIdentifier
,	TokenNameCOMMA
cycleMethod	TokenNameIdentifier
,	TokenNameCOMMA
colorSpace	TokenNameIdentifier
,	TokenNameCOMMA
gradientTransform	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
center	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NullPointerException	TokenNameIdentifier
(	TokenNameLPAREN
"Center point should not be null."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
focus	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NullPointerException	TokenNameIdentifier
(	TokenNameLPAREN
"Focus point should not be null."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
radius	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"radius should be greater than zero"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
center	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Point2D	TokenNameIdentifier
)	TokenNameRPAREN
center	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
focus	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Point2D	TokenNameIdentifier
)	TokenNameRPAREN
focus	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
radius	TokenNameIdentifier
=	TokenNameEQUAL
radius	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RadialGradientPaint	TokenNameIdentifier
(	TokenNameLPAREN
Rectangle2D	TokenNameIdentifier
gradientBounds	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fractions	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
colors	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
gradientBounds	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
gradientBounds	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
gradientBounds	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
gradientBounds	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
gradientBounds	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
fractions	TokenNameIdentifier
,	TokenNameCOMMA
colors	TokenNameIdentifier
)	TokenNameRPAREN
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
transform	TokenNameIdentifier
,	TokenNameCOMMA
RenderingHints	TokenNameIdentifier
hints	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
transform	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
transform	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transform	TokenNameIdentifier
.	TokenNameDOT
concatenate	TokenNameIdentifier
(	TokenNameLPAREN
gradientTransform	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
RadialGradientPaintContext	TokenNameIdentifier
(	TokenNameLPAREN
cm	TokenNameIdentifier
,	TokenNameCOMMA
deviceBounds	TokenNameIdentifier
,	TokenNameCOMMA
userBounds	TokenNameIdentifier
,	TokenNameCOMMA
transform	TokenNameIdentifier
,	TokenNameCOMMA
hints	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
center	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
center	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
radius	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
focus	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
focus	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
fractions	TokenNameIdentifier
,	TokenNameCOMMA
colors	TokenNameIdentifier
,	TokenNameCOMMA
cycleMethod	TokenNameIdentifier
,	TokenNameCOMMA
colorSpace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoninvertibleTransformException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"transform should be "	TokenNameStringLiteral
+	TokenNamePLUS
"invertible"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Point2D	TokenNameIdentifier
getCenterPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Point2D	TokenNameIdentifier
.	TokenNameDOT
Double	TokenNameIdentifier
(	TokenNameLPAREN
center	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
center	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Point2D	TokenNameIdentifier
getFocusPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Point2D	TokenNameIdentifier
.	TokenNameDOT
Double	TokenNameIdentifier
(	TokenNameLPAREN
focus	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
focus	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
getRadius	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
radius	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE