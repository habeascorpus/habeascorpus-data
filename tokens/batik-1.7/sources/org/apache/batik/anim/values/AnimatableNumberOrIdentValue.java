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
AnimatableNumberOrIdentValue	TokenNameIdentifier
extends	TokenNameextends
AnimatableNumberValue	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
isIdent	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
ident	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
numericIdent	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AnimatableNumberOrIdentValue	TokenNameIdentifier
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
AnimatableNumberOrIdentValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
v	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
numericIdent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
numericIdent	TokenNameIdentifier
=	TokenNameEQUAL
numericIdent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AnimatableNumberOrIdentValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ident	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
ident	TokenNameIdentifier
=	TokenNameEQUAL
ident	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
isIdent	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
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
new	TokenNamenew
AnimatableNumberOrIdentValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
numericIdent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isIdent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ident	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
numericIdent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
AnimatableNumberOrIdentValue	TokenNameIdentifier
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
AnimatableNumberOrIdentValue	TokenNameIdentifier
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
AnimatableNumberOrIdentValue	TokenNameIdentifier
)	TokenNameRPAREN
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
to	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isIdent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
res	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
||	TokenNameOR_OR
!	TokenNameNOT
res	TokenNameIdentifier
.	TokenNameDOT
ident	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ident	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
ident	TokenNameIdentifier
=	TokenNameEQUAL
ident	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
numericIdent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
value	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
numericIdent	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
float	TokenNamefloat
oldValue	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
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
res	TokenNameIdentifier
.	TokenNameDOT
numericIdent	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
oldValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
AnimatableNumberOrIdentValue	TokenNameIdentifier
toValue	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableNumberOrIdentValue	TokenNameIdentifier
)	TokenNameRPAREN
to	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isIdent	TokenNameIdentifier
||	TokenNameOR_OR
toValue	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
||	TokenNameOR_OR
numericIdent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
interpolation	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0.5	TokenNameDoubleLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
&&	TokenNameAND_AND
toValue	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
toValue	TokenNameIdentifier
.	TokenNameDOT
ident	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ident	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
ident	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
ident	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
numericIdent	TokenNameIdentifier
=	TokenNameEQUAL
toValue	TokenNameIdentifier
.	TokenNameDOT
numericIdent	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
isIdent	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
value	TokenNameIdentifier
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
&&	TokenNameAND_AND
isIdent	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
res	TokenNameIdentifier
.	TokenNameDOT
ident	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ident	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
isIdent	TokenNameIdentifier
=	TokenNameEQUAL
isIdent	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
ident	TokenNameIdentifier
=	TokenNameEQUAL
ident	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
numericIdent	TokenNameIdentifier
=	TokenNameEQUAL
numericIdent	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
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
res	TokenNameIdentifier
.	TokenNameDOT
numericIdent	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
