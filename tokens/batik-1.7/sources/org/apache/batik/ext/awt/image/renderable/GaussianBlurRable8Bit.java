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
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
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
NoninvertibleTransformException	TokenNameIdentifier
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
RenderedImage	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
RenderContext	TokenNameIdentifier
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
rendered	TokenNameIdentifier
.	TokenNameDOT
AffineRed	TokenNameIdentifier
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
rendered	TokenNameIdentifier
.	TokenNameDOT
CachableRed	TokenNameIdentifier
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
rendered	TokenNameIdentifier
.	TokenNameDOT
GaussianBlurRed8Bit	TokenNameIdentifier
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
rendered	TokenNameIdentifier
.	TokenNameDOT
PadRed	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
GaussianBlurRable8Bit	TokenNameIdentifier
extends	TokenNameextends
AbstractColorInterpolationRable	TokenNameIdentifier
implements	TokenNameimplements
GaussianBlurRable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
double	TokenNamedouble
stdDeviationX	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
stdDeviationY	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
GaussianBlurRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
Filter	TokenNameIdentifier
src	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
stdevX	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
stdevY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
src	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setStdDeviationX	TokenNameIdentifier
(	TokenNameLPAREN
stdevX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setStdDeviationY	TokenNameIdentifier
(	TokenNameLPAREN
stdevY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setStdDeviationX	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
stdDeviationX	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
stdDeviationX	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
touch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
stdDeviationX	TokenNameIdentifier
=	TokenNameEQUAL
stdDeviationX	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setStdDeviationY	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
stdDeviationY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
stdDeviationY	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
touch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
stdDeviationY	TokenNameIdentifier
=	TokenNameEQUAL
stdDeviationY	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getStdDeviationX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
stdDeviationX	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getStdDeviationY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
stdDeviationY	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSource	TokenNameIdentifier
(	TokenNameLPAREN
Filter	TokenNameIdentifier
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
init	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
DSQRT2PI	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
Math	TokenNameIdentifier
.	TokenNameDOT
PI	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
3.0	TokenNameDoubleLiteral
/	TokenNameDIVIDE
4.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
Rectangle2D	TokenNameIdentifier
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
src	TokenNameIdentifier
=	TokenNameEQUAL
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
dX	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
stdDeviationX	TokenNameIdentifier
*	TokenNameMULTIPLY
DSQRT2PI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
dY	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
stdDeviationY	TokenNameIdentifier
*	TokenNameMULTIPLY
DSQRT2PI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
radX	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
dX	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
radY	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
dY	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
Rectangle2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
src	TokenNameIdentifier
.	TokenNameDOT
getMinX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
radX	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
src	TokenNameIdentifier
.	TokenNameDOT
getMinY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
radY	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
src	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
radX	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
src	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
radY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Filter	TokenNameIdentifier
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Filter	TokenNameIdentifier
)	TokenNameRPAREN
getSources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
eps	TokenNameIdentifier
=	TokenNameEQUAL
0.0001	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
eps_eq	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
f1	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
f2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
f1	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
f2	TokenNameIdentifier
-	TokenNameMINUS
eps	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
f1	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
f2	TokenNameIdentifier
+	TokenNamePLUS
eps	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
eps_abs_eq	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
f1	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
f2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
f1	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
f1	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
f1	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
f2	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
f2	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
f2	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
eps_eq	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
,	TokenNameCOMMA
f2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RenderedImage	TokenNameIdentifier
createRendering	TokenNameIdentifier
(	TokenNameLPAREN
RenderContext	TokenNameIdentifier
rc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
RenderingHints	TokenNameIdentifier
rh	TokenNameIdentifier
=	TokenNameEQUAL
rc	TokenNameIdentifier
.	TokenNameDOT
getRenderingHints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
rh	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
rh	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RenderingHints	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
at	TokenNameIdentifier
=	TokenNameEQUAL
rc	TokenNameIdentifier
.	TokenNameDOT
getTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
sx	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
.	TokenNameDOT
getScaleX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
sy	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
.	TokenNameDOT
getScaleY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
shx	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
.	TokenNameDOT
getShearX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
shy	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
.	TokenNameDOT
getShearY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
tx	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
.	TokenNameDOT
getTranslateX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
ty	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
.	TokenNameDOT
getTranslateY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
scaleX	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
sx	TokenNameIdentifier
*	TokenNameMULTIPLY
sx	TokenNameIdentifier
+	TokenNamePLUS
shy	TokenNameIdentifier
*	TokenNameMULTIPLY
shy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
scaleY	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
sy	TokenNameIdentifier
*	TokenNameMULTIPLY
sy	TokenNameIdentifier
+	TokenNamePLUS
shx	TokenNameIdentifier
*	TokenNameMULTIPLY
shx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
sdx	TokenNameIdentifier
=	TokenNameEQUAL
stdDeviationX	TokenNameIdentifier
*	TokenNameMULTIPLY
scaleX	TokenNameIdentifier
;	TokenNameSEMICOLON
double	TokenNamedouble
sdy	TokenNameIdentifier
=	TokenNameEQUAL
stdDeviationY	TokenNameIdentifier
*	TokenNameMULTIPLY
scaleY	TokenNameIdentifier
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
srcAt	TokenNameIdentifier
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
resAt	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
outsetX	TokenNameIdentifier
,	TokenNameCOMMA
outsetY	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
sdx	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
sdy	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
eps_eq	TokenNameIdentifier
(	TokenNameLPAREN
sdx	TokenNameIdentifier
,	TokenNameCOMMA
sdy	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
eps_abs_eq	TokenNameIdentifier
(	TokenNameLPAREN
sx	TokenNameIdentifier
/	TokenNameDIVIDE
scaleX	TokenNameIdentifier
,	TokenNameCOMMA
sy	TokenNameIdentifier
/	TokenNameDIVIDE
scaleY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
srcAt	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
;	TokenNameSEMICOLON
resAt	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
outsetX	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
outsetY	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
sdx	TokenNameIdentifier
>	TokenNameGREATER
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
scaleX	TokenNameIdentifier
=	TokenNameEQUAL
scaleX	TokenNameIdentifier
*	TokenNameMULTIPLY
10	TokenNameIntegerLiteral
/	TokenNameDIVIDE
sdx	TokenNameIdentifier
;	TokenNameSEMICOLON
sdx	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sdy	TokenNameIdentifier
>	TokenNameGREATER
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
scaleY	TokenNameIdentifier
=	TokenNameEQUAL
scaleY	TokenNameIdentifier
*	TokenNameMULTIPLY
10	TokenNameIntegerLiteral
/	TokenNameDIVIDE
sdy	TokenNameIdentifier
;	TokenNameSEMICOLON
sdy	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
srcAt	TokenNameIdentifier
=	TokenNameEQUAL
AffineTransform	TokenNameIdentifier
.	TokenNameDOT
getScaleInstance	TokenNameIdentifier
(	TokenNameLPAREN
scaleX	TokenNameIdentifier
,	TokenNameCOMMA
scaleY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
resAt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
sx	TokenNameIdentifier
/	TokenNameDIVIDE
scaleX	TokenNameIdentifier
,	TokenNameCOMMA
shy	TokenNameIdentifier
/	TokenNameDIVIDE
scaleX	TokenNameIdentifier
,	TokenNameCOMMA
shx	TokenNameIdentifier
/	TokenNameDIVIDE
scaleY	TokenNameIdentifier
,	TokenNameCOMMA
sy	TokenNameIdentifier
/	TokenNameDIVIDE
scaleY	TokenNameIdentifier
,	TokenNameCOMMA
tx	TokenNameIdentifier
,	TokenNameCOMMA
ty	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outsetX	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
outsetY	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Shape	TokenNameIdentifier
aoi	TokenNameIdentifier
=	TokenNameEQUAL
rc	TokenNameIdentifier
.	TokenNameDOT
getAreaOfInterest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
aoi	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
aoi	TokenNameIdentifier
=	TokenNameEQUAL
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Shape	TokenNameIdentifier
devShape	TokenNameIdentifier
=	TokenNameEQUAL
srcAt	TokenNameIdentifier
.	TokenNameDOT
createTransformedShape	TokenNameIdentifier
(	TokenNameLPAREN
aoi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle	TokenNameIdentifier
devRect	TokenNameIdentifier
=	TokenNameEQUAL
devShape	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outsetX	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
GaussianBlurRed8Bit	TokenNameIdentifier
.	TokenNameDOT
surroundPixels	TokenNameIdentifier
(	TokenNameLPAREN
sdx	TokenNameIdentifier
,	TokenNameCOMMA
rh	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outsetY	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
GaussianBlurRed8Bit	TokenNameIdentifier
.	TokenNameDOT
surroundPixels	TokenNameIdentifier
(	TokenNameLPAREN
sdy	TokenNameIdentifier
,	TokenNameCOMMA
rh	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
devRect	TokenNameIdentifier
.	TokenNameDOT
x	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
outsetX	TokenNameIdentifier
;	TokenNameSEMICOLON
devRect	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
outsetY	TokenNameIdentifier
;	TokenNameSEMICOLON
devRect	TokenNameIdentifier
.	TokenNameDOT
width	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
outsetX	TokenNameIdentifier
;	TokenNameSEMICOLON
devRect	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
outsetY	TokenNameIdentifier
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
r	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
AffineTransform	TokenNameIdentifier
invSrcAt	TokenNameIdentifier
=	TokenNameEQUAL
srcAt	TokenNameIdentifier
.	TokenNameDOT
createInverse	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
=	TokenNameEQUAL
invSrcAt	TokenNameIdentifier
.	TokenNameDOT
createTransformedShape	TokenNameIdentifier
(	TokenNameLPAREN
devRect	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoninvertibleTransformException	TokenNameIdentifier
nte	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
r	TokenNameIdentifier
=	TokenNameEQUAL
aoi	TokenNameIdentifier
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Rectangle2D	TokenNameIdentifier
.	TokenNameDOT
Double	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
outsetX	TokenNameIdentifier
/	TokenNameDIVIDE
scaleX	TokenNameIdentifier
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
outsetY	TokenNameIdentifier
/	TokenNameDIVIDE
scaleY	TokenNameIdentifier
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
outsetX	TokenNameIdentifier
/	TokenNameDIVIDE
scaleX	TokenNameIdentifier
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
outsetY	TokenNameIdentifier
/	TokenNameDIVIDE
scaleY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
RenderedImage	TokenNameIdentifier
ri	TokenNameIdentifier
;	TokenNameSEMICOLON
ri	TokenNameIdentifier
=	TokenNameEQUAL
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createRendering	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
RenderContext	TokenNameIdentifier
(	TokenNameLPAREN
srcAt	TokenNameIdentifier
,	TokenNameCOMMA
r	TokenNameIdentifier
,	TokenNameCOMMA
rh	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
CachableRed	TokenNameIdentifier
cr	TokenNameIdentifier
=	TokenNameEQUAL
convertSourceCS	TokenNameIdentifier
(	TokenNameLPAREN
ri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
devRect	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
cr	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cr	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PadRed	TokenNameIdentifier
(	TokenNameLPAREN
cr	TokenNameIdentifier
,	TokenNameCOMMA
devRect	TokenNameIdentifier
,	TokenNameCOMMA
PadMode	TokenNameIdentifier
.	TokenNameDOT
ZERO_PAD	TokenNameIdentifier
,	TokenNameCOMMA
rh	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
cr	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GaussianBlurRed8Bit	TokenNameIdentifier
(	TokenNameLPAREN
cr	TokenNameIdentifier
,	TokenNameCOMMA
sdx	TokenNameIdentifier
,	TokenNameCOMMA
sdy	TokenNameIdentifier
,	TokenNameCOMMA
rh	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
resAt	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
!	TokenNameNOT
resAt	TokenNameIdentifier
.	TokenNameDOT
isIdentity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
cr	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineRed	TokenNameIdentifier
(	TokenNameLPAREN
cr	TokenNameIdentifier
,	TokenNameCOMMA
resAt	TokenNameIdentifier
,	TokenNameCOMMA
rh	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
cr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Shape	TokenNameIdentifier
getDependencyRegion	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
srcIndex	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle2D	TokenNameIdentifier
outputRgn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
srcIndex	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
outputRgn	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
float	TokenNamefloat
dX	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
stdDeviationX	TokenNameIdentifier
*	TokenNameMULTIPLY
DSQRT2PI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
dY	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
stdDeviationY	TokenNameIdentifier
*	TokenNameMULTIPLY
DSQRT2PI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
radX	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
dX	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
radY	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
dY	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
outputRgn	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Rectangle2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
outputRgn	TokenNameIdentifier
.	TokenNameDOT
getMinX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
radX	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
outputRgn	TokenNameIdentifier
.	TokenNameDOT
getMinY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
radY	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
outputRgn	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
radX	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
outputRgn	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
radY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
bounds	TokenNameIdentifier
=	TokenNameEQUAL
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
outputRgn	TokenNameIdentifier
.	TokenNameDOT
intersects	TokenNameIdentifier
(	TokenNameLPAREN
bounds	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
Rectangle2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outputRgn	TokenNameIdentifier
=	TokenNameEQUAL
outputRgn	TokenNameIdentifier
.	TokenNameDOT
createIntersection	TokenNameIdentifier
(	TokenNameLPAREN
bounds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
outputRgn	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Shape	TokenNameIdentifier
getDirtyRegion	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
srcIndex	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle2D	TokenNameIdentifier
inputRgn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
dirtyRegion	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
srcIndex	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
dX	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
stdDeviationX	TokenNameIdentifier
*	TokenNameMULTIPLY
DSQRT2PI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
dY	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
stdDeviationY	TokenNameIdentifier
*	TokenNameMULTIPLY
DSQRT2PI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
radX	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
dX	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
radY	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
dY	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
inputRgn	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Rectangle2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
inputRgn	TokenNameIdentifier
.	TokenNameDOT
getMinX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
radX	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
inputRgn	TokenNameIdentifier
.	TokenNameDOT
getMinY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
radY	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
inputRgn	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
radX	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
inputRgn	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
radY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
bounds	TokenNameIdentifier
=	TokenNameEQUAL
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
inputRgn	TokenNameIdentifier
.	TokenNameDOT
intersects	TokenNameIdentifier
(	TokenNameLPAREN
bounds	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
Rectangle2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dirtyRegion	TokenNameIdentifier
=	TokenNameEQUAL
inputRgn	TokenNameIdentifier
.	TokenNameDOT
createIntersection	TokenNameIdentifier
(	TokenNameLPAREN
bounds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
dirtyRegion	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE