package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
.	TokenNameDOT
AnimationTarget	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
AnimatablePaintValue	TokenNameIdentifier
extends	TokenNameextends
AnimatableColorValue	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PAINT_NONE	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PAINT_CURRENT_COLOR	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PAINT_COLOR	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PAINT_URI	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PAINT_URI_NONE	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PAINT_URI_CURRENT_COLOR	TokenNameIdentifier
=	TokenNameEQUAL
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PAINT_URI_COLOR	TokenNameIdentifier
=	TokenNameEQUAL
6	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PAINT_INHERIT	TokenNameIdentifier
=	TokenNameEQUAL
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
paintType	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
r	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
g	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
r	TokenNameIdentifier
,	TokenNameCOMMA
g	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
AnimatablePaintValue	TokenNameIdentifier
createNonePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
=	TokenNameEQUAL
PAINT_NONE	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
AnimatablePaintValue	TokenNameIdentifier
createCurrentColorPaintValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
=	TokenNameEQUAL
PAINT_CURRENT_COLOR	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
AnimatablePaintValue	TokenNameIdentifier
createColorPaintValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
r	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
g	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
r	TokenNameIdentifier
,	TokenNameCOMMA
g	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
=	TokenNameEQUAL
PAINT_COLOR	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
AnimatablePaintValue	TokenNameIdentifier
createURIPaintValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
uri	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
=	TokenNameEQUAL
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
=	TokenNameEQUAL
PAINT_URI	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
AnimatablePaintValue	TokenNameIdentifier
createURINonePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
uri	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
=	TokenNameEQUAL
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
=	TokenNameEQUAL
PAINT_URI_NONE	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
AnimatablePaintValue	TokenNameIdentifier
createURICurrentColorPaintValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
uri	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
=	TokenNameEQUAL
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
=	TokenNameEQUAL
PAINT_URI_CURRENT_COLOR	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
AnimatablePaintValue	TokenNameIdentifier
createURIColorPaintValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
uri	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
r	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
g	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
r	TokenNameIdentifier
,	TokenNameCOMMA
g	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
=	TokenNameEQUAL
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
=	TokenNameEQUAL
PAINT_URI_COLOR	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
AnimatablePaintValue	TokenNameIdentifier
createInheritPaintValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
=	TokenNameEQUAL
PAINT_INHERIT	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AnimatableValue	TokenNameIdentifier
interpolate	TokenNameIdentifier
(	TokenNameLPAREN
AnimatableValue	TokenNameIdentifier
result	TokenNameIdentifier
,	TokenNameCOMMA
AnimatableValue	TokenNameIdentifier
to	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
interpolation	TokenNameIdentifier
,	TokenNameCOMMA
AnimatableValue	TokenNameIdentifier
accumulation	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
multiplier	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
res	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AnimatablePaintValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
res	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatablePaintValue	TokenNameIdentifier
)	TokenNameRPAREN
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
paintType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
PAINT_COLOR	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
canInterpolate	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
to	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
toPaint	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatablePaintValue	TokenNameIdentifier
)	TokenNameRPAREN
to	TokenNameIdentifier
;	TokenNameSEMICOLON
canInterpolate	TokenNameIdentifier
=	TokenNameEQUAL
toPaint	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
PAINT_COLOR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
accumulation	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
accPaint	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatablePaintValue	TokenNameIdentifier
)	TokenNameRPAREN
accumulation	TokenNameIdentifier
;	TokenNameSEMICOLON
canInterpolate	TokenNameIdentifier
=	TokenNameEQUAL
canInterpolate	TokenNameIdentifier
&&	TokenNameAND_AND
accPaint	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
PAINT_COLOR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
canInterpolate	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
=	TokenNameEQUAL
PAINT_COLOR	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
interpolate	TokenNameIdentifier
(	TokenNameLPAREN
res	TokenNameIdentifier
,	TokenNameCOMMA
to	TokenNameIdentifier
,	TokenNameCOMMA
interpolation	TokenNameIdentifier
,	TokenNameCOMMA
accumulation	TokenNameIdentifier
,	TokenNameCOMMA
multiplier	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
newPaintType	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
newURI	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
newRed	TokenNameIdentifier
,	TokenNameCOMMA
newGreen	TokenNameIdentifier
,	TokenNameCOMMA
newBlue	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
to	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
interpolation	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0.5	TokenNameDoubleLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatablePaintValue	TokenNameIdentifier
toValue	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatablePaintValue	TokenNameIdentifier
)	TokenNameRPAREN
to	TokenNameIdentifier
;	TokenNameSEMICOLON
newPaintType	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
;	TokenNameSEMICOLON
newURI	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
newRed	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
;	TokenNameSEMICOLON
newGreen	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
;	TokenNameSEMICOLON
newBlue	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
newPaintType	TokenNameIdentifier
=	TokenNameEQUAL
paintType	TokenNameIdentifier
;	TokenNameSEMICOLON
newURI	TokenNameIdentifier
=	TokenNameEQUAL
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
newRed	TokenNameIdentifier
=	TokenNameEQUAL
red	TokenNameIdentifier
;	TokenNameSEMICOLON
newGreen	TokenNameIdentifier
=	TokenNameEQUAL
green	TokenNameIdentifier
;	TokenNameSEMICOLON
newBlue	TokenNameIdentifier
=	TokenNameEQUAL
blue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newPaintType	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
!	TokenNameNOT
res	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
newURI	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newRed	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newGreen	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newBlue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
paintType	TokenNameIdentifier
=	TokenNameEQUAL
newPaintType	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
=	TokenNameEQUAL
newURI	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
=	TokenNameEQUAL
newRed	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
=	TokenNameEQUAL
newGreen	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
=	TokenNameEQUAL
newBlue	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getPaintType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
paintType	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
uri	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
canPace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
distanceTo	TokenNameIdentifier
(	TokenNameLPAREN
AnimatableValue	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AnimatableValue	TokenNameIdentifier
getZeroValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
AnimatablePaintValue	TokenNameIdentifier
.	TokenNameDOT
createColorPaintValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
paintType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
PAINT_NONE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"none"	TokenNameStringLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
PAINT_CURRENT_COLOR	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"currentColor"	TokenNameStringLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
PAINT_COLOR	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
PAINT_URI	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"url("	TokenNameStringLiteral
+	TokenNamePLUS
uri	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
PAINT_URI_NONE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"url("	TokenNameStringLiteral
+	TokenNamePLUS
uri	TokenNameIdentifier
+	TokenNamePLUS
") none"	TokenNameStringLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
PAINT_URI_CURRENT_COLOR	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"url("	TokenNameStringLiteral
+	TokenNamePLUS
uri	TokenNameIdentifier
+	TokenNamePLUS
") currentColor"	TokenNameStringLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
PAINT_URI_COLOR	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"url("	TokenNameStringLiteral
+	TokenNamePLUS
uri	TokenNameIdentifier
+	TokenNamePLUS
") "	TokenNameStringLiteral
+	TokenNamePLUS
super	TokenNamesuper
.	TokenNameDOT
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
return	TokenNamereturn
"inherit"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE