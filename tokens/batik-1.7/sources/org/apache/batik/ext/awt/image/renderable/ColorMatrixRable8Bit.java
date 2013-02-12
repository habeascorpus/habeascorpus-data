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
rendered	TokenNameIdentifier
.	TokenNameDOT
ColorMatrixRed	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ColorMatrixRable8Bit	TokenNameIdentifier
extends	TokenNameextends
AbstractColorInterpolationRable	TokenNameIdentifier
implements	TokenNameimplements
ColorMatrixRable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
MATRIX_LUMINANCE_TO_ALPHA	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
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
}	TokenNameRBRACE
,	TokenNameCOMMA
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
}	TokenNameRBRACE
,	TokenNameCOMMA
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
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
0.2125f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.7154f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.0721f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
type	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
matrix	TokenNameIdentifier
;	TokenNameSEMICOLON
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
int	TokenNameint
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getMatrix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
matrix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ColorMatrixRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ColorMatrixRable	TokenNameIdentifier
buildMatrix	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
matrix	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
matrix	TokenNameIdentifier
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
matrix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newMatrix	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
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
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
m	TokenNameIdentifier
=	TokenNameEQUAL
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m	TokenNameIdentifier
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
m	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
newMatrix	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
newMatrix	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
m	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
ColorMatrixRable8Bit	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColorMatrixRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
=	TokenNameEQUAL
TYPE_MATRIX	TokenNameIdentifier
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
.	TokenNameDOT
matrix	TokenNameIdentifier
=	TokenNameEQUAL
newMatrix	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ColorMatrixRable	TokenNameIdentifier
buildSaturate	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColorMatrixRable8Bit	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColorMatrixRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
=	TokenNameEQUAL
TYPE_SATURATE	TokenNameIdentifier
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
.	TokenNameDOT
matrix	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
{	TokenNameLBRACE
0.213f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
0.787f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
s	TokenNameIdentifier
,	TokenNameCOMMA
0.715f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
0.715f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
s	TokenNameIdentifier
,	TokenNameCOMMA
0.072f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
0.072f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
s	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
0.213f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
0.213f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
s	TokenNameIdentifier
,	TokenNameCOMMA
0.715f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
0.285f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
s	TokenNameIdentifier
,	TokenNameCOMMA
0.072f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
0.072f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
s	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
0.213f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
0.213f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
s	TokenNameIdentifier
,	TokenNameCOMMA
0.715f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
0.715f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
s	TokenNameIdentifier
,	TokenNameCOMMA
0.072f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
0.928f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
s	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ColorMatrixRable	TokenNameIdentifier
buildHueRotate	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
a	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColorMatrixRable8Bit	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColorMatrixRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
=	TokenNameEQUAL
TYPE_HUE_ROTATE	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
cos	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
cos	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
sin	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
sin	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
a00	TokenNameIdentifier
=	TokenNameEQUAL
0.213f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
cos	TokenNameIdentifier
*	TokenNameMULTIPLY
0.787f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
sin	TokenNameIdentifier
*	TokenNameMULTIPLY
0.213f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
a10	TokenNameIdentifier
=	TokenNameEQUAL
0.213f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
cos	TokenNameIdentifier
*	TokenNameMULTIPLY
0.212f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
sin	TokenNameIdentifier
*	TokenNameMULTIPLY
0.143f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
a20	TokenNameIdentifier
=	TokenNameEQUAL
0.213f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
cos	TokenNameIdentifier
*	TokenNameMULTIPLY
0.213f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
sin	TokenNameIdentifier
*	TokenNameMULTIPLY
0.787f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
a01	TokenNameIdentifier
=	TokenNameEQUAL
0.715f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
cos	TokenNameIdentifier
*	TokenNameMULTIPLY
0.715f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
sin	TokenNameIdentifier
*	TokenNameMULTIPLY
0.715f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
a11	TokenNameIdentifier
=	TokenNameEQUAL
0.715f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
cos	TokenNameIdentifier
*	TokenNameMULTIPLY
0.285f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
sin	TokenNameIdentifier
*	TokenNameMULTIPLY
0.140f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
a21	TokenNameIdentifier
=	TokenNameEQUAL
0.715f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
cos	TokenNameIdentifier
*	TokenNameMULTIPLY
0.715f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
sin	TokenNameIdentifier
*	TokenNameMULTIPLY
0.715f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
a02	TokenNameIdentifier
=	TokenNameEQUAL
0.072f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
cos	TokenNameIdentifier
*	TokenNameMULTIPLY
0.072f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
sin	TokenNameIdentifier
*	TokenNameMULTIPLY
0.928f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
a12	TokenNameIdentifier
=	TokenNameEQUAL
0.072f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
cos	TokenNameIdentifier
*	TokenNameMULTIPLY
0.072f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
sin	TokenNameIdentifier
*	TokenNameMULTIPLY
0.283f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
a22	TokenNameIdentifier
=	TokenNameEQUAL
0.072f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
cos	TokenNameIdentifier
*	TokenNameMULTIPLY
0.928f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
sin	TokenNameIdentifier
*	TokenNameMULTIPLY
0.072f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
.	TokenNameDOT
matrix	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
{	TokenNameLBRACE
a00	TokenNameIdentifier
,	TokenNameCOMMA
a01	TokenNameIdentifier
,	TokenNameCOMMA
a02	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
a10	TokenNameIdentifier
,	TokenNameCOMMA
a11	TokenNameIdentifier
,	TokenNameCOMMA
a12	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
a20	TokenNameIdentifier
,	TokenNameCOMMA
a21	TokenNameIdentifier
,	TokenNameCOMMA
a22	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ColorMatrixRable	TokenNameIdentifier
buildLuminanceToAlpha	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ColorMatrixRable8Bit	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColorMatrixRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
=	TokenNameEQUAL
TYPE_LUMINANCE_TO_ALPHA	TokenNameIdentifier
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
.	TokenNameDOT
matrix	TokenNameIdentifier
=	TokenNameEQUAL
MATRIX_LUMINANCE_TO_ALPHA	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
filter	TokenNameIdentifier
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
RenderedImage	TokenNameIdentifier
srcRI	TokenNameIdentifier
=	TokenNameEQUAL
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createRendering	TokenNameIdentifier
(	TokenNameLPAREN
rc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
srcRI	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
ColorMatrixRed	TokenNameIdentifier
(	TokenNameLPAREN
convertSourceCS	TokenNameIdentifier
(	TokenNameLPAREN
srcRI	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
matrix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE