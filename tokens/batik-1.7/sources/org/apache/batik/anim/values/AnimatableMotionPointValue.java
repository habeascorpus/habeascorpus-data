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
AnimatableMotionPointValue	TokenNameIdentifier
extends	TokenNameextends
AnimatableValue	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
float	TokenNamefloat
x	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
float	TokenNamefloat
y	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
float	TokenNamefloat
angle	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AnimatableMotionPointValue	TokenNameIdentifier
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
AnimatableMotionPointValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
angle	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
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
this	TokenNamethis
.	TokenNameDOT
angle	TokenNameIdentifier
=	TokenNameEQUAL
angle	TokenNameIdentifier
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
AnimatableMotionPointValue	TokenNameIdentifier
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
AnimatableMotionPointValue	TokenNameIdentifier
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
AnimatableMotionPointValue	TokenNameIdentifier
)	TokenNameRPAREN
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
newX	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
,	TokenNameCOMMA
newY	TokenNameIdentifier
=	TokenNameEQUAL
y	TokenNameIdentifier
,	TokenNameCOMMA
newAngle	TokenNameIdentifier
=	TokenNameEQUAL
angle	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
angleCount	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
to	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatableMotionPointValue	TokenNameIdentifier
toValue	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableMotionPointValue	TokenNameIdentifier
)	TokenNameRPAREN
to	TokenNameIdentifier
;	TokenNameSEMICOLON
newX	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
interpolation	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
toValue	TokenNameIdentifier
.	TokenNameDOT
x	TokenNameIdentifier
-	TokenNameMINUS
x	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
newY	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
interpolation	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
toValue	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
-	TokenNameMINUS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
newAngle	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
angle	TokenNameIdentifier
;	TokenNameSEMICOLON
angleCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
accumulation	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
multiplier	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
AnimatableMotionPointValue	TokenNameIdentifier
accValue	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableMotionPointValue	TokenNameIdentifier
)	TokenNameRPAREN
accumulation	TokenNameIdentifier
;	TokenNameSEMICOLON
newX	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
multiplier	TokenNameIdentifier
*	TokenNameMULTIPLY
accValue	TokenNameIdentifier
.	TokenNameDOT
x	TokenNameIdentifier
;	TokenNameSEMICOLON
newY	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
multiplier	TokenNameIdentifier
*	TokenNameMULTIPLY
accValue	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
;	TokenNameSEMICOLON
newAngle	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
accValue	TokenNameIdentifier
.	TokenNameDOT
angle	TokenNameIdentifier
;	TokenNameSEMICOLON
angleCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
newAngle	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
angleCount	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
x	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newX	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newY	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
angle	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newAngle	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
x	TokenNameIdentifier
=	TokenNameEQUAL
newX	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
=	TokenNameEQUAL
newY	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
angle	TokenNameIdentifier
=	TokenNameEQUAL
newAngle	TokenNameIdentifier
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
float	TokenNamefloat
getAngle	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
angle	TokenNameIdentifier
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
AnimatableMotionPointValue	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableMotionPointValue	TokenNameIdentifier
)	TokenNameRPAREN
other	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
dx	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
-	TokenNameMINUS
o	TokenNameIdentifier
.	TokenNameDOT
x	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
dy	TokenNameIdentifier
=	TokenNameEQUAL
y	TokenNameIdentifier
-	TokenNameMINUS
o	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
dx	TokenNameIdentifier
*	TokenNameMULTIPLY
dx	TokenNameIdentifier
+	TokenNamePLUS
dy	TokenNameIdentifier
*	TokenNameMULTIPLY
dy	TokenNameIdentifier
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
AnimatableMotionPointValue	TokenNameIdentifier
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
toStringRep	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
formatNumber	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
','	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
formatNumber	TokenNameIdentifier
(	TokenNameLPAREN
y	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
','	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
formatNumber	TokenNameIdentifier
(	TokenNameLPAREN
angle	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"rad"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
