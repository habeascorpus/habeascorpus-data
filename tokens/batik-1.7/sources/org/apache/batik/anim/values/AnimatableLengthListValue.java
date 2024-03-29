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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
.	TokenNameDOT
SVGLength	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
AnimatableLengthListValue	TokenNameIdentifier
extends	TokenNameextends
AnimatableValue	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lengthTypes	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lengthValues	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
short	TokenNameshort
percentageInterpretation	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AnimatableLengthListValue	TokenNameIdentifier
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
AnimatableLengthListValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
types	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
values	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
pcInterp	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
=	TokenNameEQUAL
types	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
lengthValues	TokenNameIdentifier
=	TokenNameEQUAL
values	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
percentageInterpretation	TokenNameIdentifier
=	TokenNameEQUAL
pcInterp	TokenNameIdentifier
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
AnimatableLengthListValue	TokenNameIdentifier
toLengthList	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableLengthListValue	TokenNameIdentifier
)	TokenNameRPAREN
to	TokenNameIdentifier
;	TokenNameSEMICOLON
AnimatableLengthListValue	TokenNameIdentifier
accLengthList	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableLengthListValue	TokenNameIdentifier
)	TokenNameRPAREN
accumulation	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
hasTo	TokenNameIdentifier
=	TokenNameEQUAL
to	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
boolean	TokenNameboolean
hasAcc	TokenNameIdentifier
=	TokenNameEQUAL
accumulation	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
boolean	TokenNameboolean
canInterpolate	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
(	TokenNameLPAREN
hasTo	TokenNameIdentifier
&&	TokenNameAND_AND
toLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
lengthTypes	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
(	TokenNameLPAREN
hasAcc	TokenNameIdentifier
&&	TokenNameAND_AND
accLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
lengthTypes	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
baseLengthTypes	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
baseLengthValues	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
canInterpolate	TokenNameIdentifier
&&	TokenNameAND_AND
hasTo	TokenNameIdentifier
&&	TokenNameAND_AND
interpolation	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0.5	TokenNameDoubleLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
baseLengthTypes	TokenNameIdentifier
=	TokenNameEQUAL
toLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
;	TokenNameSEMICOLON
baseLengthValues	TokenNameIdentifier
=	TokenNameEQUAL
toLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthValues	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
baseLengthTypes	TokenNameIdentifier
=	TokenNameEQUAL
lengthTypes	TokenNameIdentifier
;	TokenNameSEMICOLON
baseLengthValues	TokenNameIdentifier
=	TokenNameEQUAL
lengthValues	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
baseLengthTypes	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
AnimatableLengthListValue	TokenNameIdentifier
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
AnimatableLengthListValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
short	TokenNameshort
[	TokenNameLBRACKET
len	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
lengthValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
len	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
res	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AnimatableLengthListValue	TokenNameIdentifier
)	TokenNameRPAREN
result	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
res	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
short	TokenNameshort
[	TokenNameLBRACKET
len	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
lengthValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
len	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
res	TokenNameIdentifier
.	TokenNameDOT
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
percentageInterpretation	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
res	TokenNameIdentifier
.	TokenNameDOT
percentageInterpretation	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
percentageInterpretation	TokenNameIdentifier
=	TokenNameEQUAL
percentageInterpretation	TokenNameIdentifier
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
len	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
toV	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
accV	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
short	TokenNameshort
newLengthType	TokenNameIdentifier
=	TokenNameEQUAL
baseLengthTypes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
float	TokenNamefloat
newLengthValue	TokenNameIdentifier
=	TokenNameEQUAL
baseLengthValues	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
canInterpolate	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
hasTo	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
AnimatableLengthValue	TokenNameIdentifier
.	TokenNameDOT
compatibleTypes	TokenNameIdentifier
(	TokenNameLPAREN
newLengthType	TokenNameIdentifier
,	TokenNameCOMMA
percentageInterpretation	TokenNameIdentifier
,	TokenNameCOMMA
toLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
toLengthList	TokenNameIdentifier
.	TokenNameDOT
percentageInterpretation	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
hasAcc	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
AnimatableLengthValue	TokenNameIdentifier
.	TokenNameDOT
compatibleTypes	TokenNameIdentifier
(	TokenNameLPAREN
newLengthType	TokenNameIdentifier
,	TokenNameCOMMA
percentageInterpretation	TokenNameIdentifier
,	TokenNameCOMMA
accLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
accLengthList	TokenNameIdentifier
.	TokenNameDOT
percentageInterpretation	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
newLengthValue	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
.	TokenNameDOT
svgToUserSpace	TokenNameIdentifier
(	TokenNameLPAREN
newLengthValue	TokenNameIdentifier
,	TokenNameCOMMA
newLengthType	TokenNameIdentifier
,	TokenNameCOMMA
percentageInterpretation	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
newLengthType	TokenNameIdentifier
=	TokenNameEQUAL
SVGLength	TokenNameIdentifier
.	TokenNameDOT
SVG_LENGTHTYPE_NUMBER	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hasTo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
toV	TokenNameIdentifier
=	TokenNameEQUAL
to	TokenNameIdentifier
.	TokenNameDOT
target	TokenNameIdentifier
.	TokenNameDOT
svgToUserSpace	TokenNameIdentifier
(	TokenNameLPAREN
toLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthValues	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
toLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
toLengthList	TokenNameIdentifier
.	TokenNameDOT
percentageInterpretation	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
hasAcc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
accV	TokenNameIdentifier
=	TokenNameEQUAL
accumulation	TokenNameIdentifier
.	TokenNameDOT
target	TokenNameIdentifier
.	TokenNameDOT
svgToUserSpace	TokenNameIdentifier
(	TokenNameLPAREN
accLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthValues	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
accLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
accLengthList	TokenNameIdentifier
.	TokenNameDOT
percentageInterpretation	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
hasTo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
toV	TokenNameIdentifier
=	TokenNameEQUAL
toLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthValues	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
hasAcc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
accV	TokenNameIdentifier
=	TokenNameEQUAL
accLengthList	TokenNameIdentifier
.	TokenNameDOT
lengthValues	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
newLengthValue	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
interpolation	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
toV	TokenNameIdentifier
-	TokenNameMINUS
newLengthValue	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
multiplier	TokenNameIdentifier
*	TokenNameMULTIPLY
accV	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
res	TokenNameIdentifier
.	TokenNameDOT
hasChanged	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
newLengthType	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
res	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
||	TokenNameOR_OR
newLengthValue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
res	TokenNameIdentifier
.	TokenNameDOT
lengthValues	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
res	TokenNameIdentifier
.	TokenNameDOT
lengthTypes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
newLengthType	TokenNameIdentifier
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
lengthValues	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
newLengthValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getLengthTypes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
lengthTypes	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getLengthValues	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
lengthValues	TokenNameIdentifier
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
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
vs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
lengthValues	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
AnimatableLengthListValue	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
lengthTypes	TokenNameIdentifier
,	TokenNameCOMMA
vs	TokenNameIdentifier
,	TokenNameCOMMA
percentageInterpretation	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
lengthValues	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
formatNumber	TokenNameIdentifier
(	TokenNameLPAREN
lengthValues	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
AnimatableLengthValue	TokenNameIdentifier
.	TokenNameDOT
UNITS	TokenNameIdentifier
[	TokenNameLBRACKET
lengthTypes	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
lengthValues	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
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
lengthValues	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
AnimatableLengthValue	TokenNameIdentifier
.	TokenNameDOT
UNITS	TokenNameIdentifier
[	TokenNameLBRACKET
lengthTypes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
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
