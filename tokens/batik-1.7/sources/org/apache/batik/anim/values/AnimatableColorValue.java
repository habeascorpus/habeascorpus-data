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
AnimatableColorValue	TokenNameIdentifier
extends	TokenNameextends
AnimatableValue	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
float	TokenNamefloat
red	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
float	TokenNamefloat
green	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
float	TokenNamefloat
blue	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AnimatableColorValue	TokenNameIdentifier
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
public	TokenNamepublic
AnimatableColorValue	TokenNameIdentifier
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
)	TokenNameRPAREN
;	TokenNameSEMICOLON
red	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
green	TokenNameIdentifier
=	TokenNameEQUAL
g	TokenNameIdentifier
;	TokenNameSEMICOLON
blue	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
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
AnimatableColorValue	TokenNameIdentifier
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
AnimatableColorValue	TokenNameIdentifier
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
AnimatableColorValue	TokenNameIdentifier
)	TokenNameRPAREN
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
oldRed	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
oldGreen	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
oldBlue	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
=	TokenNameEQUAL
red	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
=	TokenNameEQUAL
green	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
=	TokenNameEQUAL
blue	TokenNameIdentifier
;	TokenNameSEMICOLON
AnimatableColorValue	TokenNameIdentifier
toColor	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableColorValue	TokenNameIdentifier
)	TokenNameRPAREN
to	TokenNameIdentifier
;	TokenNameSEMICOLON
AnimatableColorValue	TokenNameIdentifier
accColor	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableColorValue	TokenNameIdentifier
)	TokenNameRPAREN
accumulation	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
to	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
interpolation	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
toColor	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
-	TokenNameMINUS
res	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
interpolation	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
toColor	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
-	TokenNameMINUS
res	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
interpolation	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
toColor	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
-	TokenNameMINUS
res	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
accumulation	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
multiplier	TokenNameIdentifier
*	TokenNameMULTIPLY
accColor	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
multiplier	TokenNameIdentifier
*	TokenNameMULTIPLY
accColor	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
multiplier	TokenNameIdentifier
*	TokenNameMULTIPLY
accColor	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
oldRed	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
oldGreen	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
oldBlue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
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
boolean	TokenNameboolean
canPace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
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
AnimatableColorValue	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableColorValue	TokenNameIdentifier
)	TokenNameRPAREN
other	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
dr	TokenNameIdentifier
=	TokenNameEQUAL
red	TokenNameIdentifier
-	TokenNameMINUS
o	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
dg	TokenNameIdentifier
=	TokenNameEQUAL
green	TokenNameIdentifier
-	TokenNameMINUS
o	TokenNameIdentifier
.	TokenNameDOT
green	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
db	TokenNameIdentifier
=	TokenNameEQUAL
blue	TokenNameIdentifier
-	TokenNameMINUS
o	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
dr	TokenNameIdentifier
*	TokenNameMULTIPLY
dr	TokenNameIdentifier
+	TokenNamePLUS
dg	TokenNameIdentifier
*	TokenNameMULTIPLY
dg	TokenNameIdentifier
+	TokenNamePLUS
db	TokenNameIdentifier
*	TokenNameMULTIPLY
db	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AnimatableValue	TokenNameIdentifier
getZeroValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
AnimatableColorValue	TokenNameIdentifier
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
return	TokenNamereturn
"rgb("	TokenNameStringLiteral
+	TokenNamePLUS
Math	TokenNameIdentifier
.	TokenNameDOT
round	TokenNameIdentifier
(	TokenNameLPAREN
red	TokenNameIdentifier
*	TokenNameMULTIPLY
255	TokenNameIntegerLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
','	TokenNameCharacterLiteral
+	TokenNamePLUS
Math	TokenNameIdentifier
.	TokenNameDOT
round	TokenNameIdentifier
(	TokenNameLPAREN
green	TokenNameIdentifier
*	TokenNameMULTIPLY
255	TokenNameIntegerLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
','	TokenNameCharacterLiteral
+	TokenNamePLUS
Math	TokenNameIdentifier
.	TokenNameDOT
round	TokenNameIdentifier
(	TokenNameLPAREN
blue	TokenNameIdentifier
*	TokenNameMULTIPLY
255	TokenNameIntegerLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
')'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
