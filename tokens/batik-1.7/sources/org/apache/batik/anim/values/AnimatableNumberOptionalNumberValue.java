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
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
extends	TokenNameextends
AnimatableValue	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
float	TokenNamefloat
number	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
hasOptionalNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
float	TokenNamefloat
optionalNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
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
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
number	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
n	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
on	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
number	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
;	TokenNameSEMICOLON
optionalNumber	TokenNameIdentifier
=	TokenNameEQUAL
on	TokenNameIdentifier
;	TokenNameSEMICOLON
hasOptionalNumber	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
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
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
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
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
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
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
)	TokenNameRPAREN
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
newNumber	TokenNameIdentifier
,	TokenNameCOMMA
newOptionalNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
newHasOptionalNumber	TokenNameIdentifier
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
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
toValue	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
)	TokenNameRPAREN
to	TokenNameIdentifier
;	TokenNameSEMICOLON
newNumber	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
number	TokenNameIdentifier
;	TokenNameSEMICOLON
newOptionalNumber	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
optionalNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
newHasOptionalNumber	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
hasOptionalNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
newNumber	TokenNameIdentifier
=	TokenNameEQUAL
number	TokenNameIdentifier
;	TokenNameSEMICOLON
newOptionalNumber	TokenNameIdentifier
=	TokenNameEQUAL
optionalNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
newHasOptionalNumber	TokenNameIdentifier
=	TokenNameEQUAL
hasOptionalNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
number	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newNumber	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
hasOptionalNumber	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newHasOptionalNumber	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
optionalNumber	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newOptionalNumber	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
number	TokenNameIdentifier
=	TokenNameEQUAL
number	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
optionalNumber	TokenNameIdentifier
=	TokenNameEQUAL
optionalNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
hasOptionalNumber	TokenNameIdentifier
=	TokenNameEQUAL
hasOptionalNumber	TokenNameIdentifier
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
getNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
number	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasOptionalNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
hasOptionalNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
getOptionalNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
optionalNumber	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
hasOptionalNumber	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
AnimatableNumberOptionalNumberValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
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
number	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hasOptionalNumber	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
' '	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
formatNumber	TokenNameIdentifier
(	TokenNameLPAREN
optionalNumber	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE