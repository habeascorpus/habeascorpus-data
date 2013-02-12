package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
svggen	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Stack	TokenNameIdentifier
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
g2d	TokenNameIdentifier
.	TokenNameDOT
GraphicContext	TokenNameIdentifier
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
g2d	TokenNameIdentifier
.	TokenNameDOT
TransformStackElement	TokenNameIdentifier
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
g2d	TokenNameIdentifier
.	TokenNameDOT
TransformType	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SVGTransform	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
double	TokenNamedouble
radiansToDegrees	TokenNameIdentifier
=	TokenNameEQUAL
180.0	TokenNameDoubleLiteral
/	TokenNameDIVIDE
Math	TokenNameIdentifier
.	TokenNameDOT
PI	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGTransform	TokenNameIdentifier
(	TokenNameLPAREN
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGDescriptor	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
GraphicContext	TokenNameIdentifier
gc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
SVGTransformDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
toSVGTransform	TokenNameIdentifier
(	TokenNameLPAREN
gc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
toSVGTransform	TokenNameIdentifier
(	TokenNameLPAREN
GraphicContext	TokenNameIdentifier
gc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
toSVGTransform	TokenNameIdentifier
(	TokenNameLPAREN
gc	TokenNameIdentifier
.	TokenNameDOT
getTransformStack	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
toSVGTransform	TokenNameIdentifier
(	TokenNameLPAREN
TransformStackElement	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
transformStack	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
nTransforms	TokenNameIdentifier
=	TokenNameEQUAL
transformStack	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
Stack	TokenNameIdentifier
presentation	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Stack	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
push	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
element	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
TransformStackElement	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
isIdentity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
element	TokenNameIdentifier
=	TokenNameEQUAL
pop	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
push	TokenNameIdentifier
(	TokenNameLPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
element	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
element	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
pop	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
element	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
super	TokenNamesuper
.	TokenNameDOT
empty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
element	TokenNameIdentifier
=	TokenNameEQUAL
super	TokenNamesuper
.	TokenNameDOT
pop	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
element	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
boolean	TokenNameboolean
canConcatenate	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
next	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
TransformStackElement	TokenNameIdentifier
element	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
nTransforms	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
next	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
element	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
element	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TransformStackElement	TokenNameIdentifier
)	TokenNameRPAREN
transformStack	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
next	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
canConcatenate	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
j	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
nTransforms	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
canConcatenate	TokenNameIdentifier
=	TokenNameEQUAL
element	TokenNameIdentifier
.	TokenNameDOT
concatenate	TokenNameIdentifier
(	TokenNameLPAREN
transformStack	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
canConcatenate	TokenNameIdentifier
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
i	TokenNameIdentifier
=	TokenNameEQUAL
j	TokenNameIdentifier
;	TokenNameSEMICOLON
element	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TransformStackElement	TokenNameIdentifier
)	TokenNameRPAREN
presentation	TokenNameIdentifier
.	TokenNameDOT
push	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
element	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
presentation	TokenNameIdentifier
.	TokenNameDOT
push	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
nPresentations	TokenNameIdentifier
=	TokenNameEQUAL
presentation	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
transformStackBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
nPresentations	TokenNameIdentifier
*	TokenNameMULTIPLY
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
nPresentations	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
transformStackBuffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
convertTransform	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
TransformStackElement	TokenNameIdentifier
)	TokenNameRPAREN
presentation	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformStackBuffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
transformValue	TokenNameIdentifier
=	TokenNameEQUAL
transformStackBuffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
transformValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
String	TokenNameIdentifier
convertTransform	TokenNameIdentifier
(	TokenNameLPAREN
TransformStackElement	TokenNameIdentifier
transformElement	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
transformString	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
transformParameters	TokenNameIdentifier
=	TokenNameEQUAL
transformElement	TokenNameIdentifier
.	TokenNameDOT
getTransformParameters	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
transformElement	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
TransformType	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_TRANSLATE	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
transformElement	TokenNameIdentifier
.	TokenNameDOT
isIdentity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
TRANSFORM_TRANSLATE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
OPEN_PARENTHESIS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
CLOSE_PARENTHESIS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
TransformType	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_ROTATE	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
transformElement	TokenNameIdentifier
.	TokenNameDOT
isIdentity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
TRANSFORM_ROTATE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
OPEN_PARENTHESIS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
radiansToDegrees	TokenNameIdentifier
*	TokenNameMULTIPLY
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
CLOSE_PARENTHESIS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
TransformType	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_SCALE	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
transformElement	TokenNameIdentifier
.	TokenNameDOT
isIdentity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
TRANSFORM_SCALE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
OPEN_PARENTHESIS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
CLOSE_PARENTHESIS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
TransformType	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_SHEAR	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
transformElement	TokenNameIdentifier
.	TokenNameDOT
isIdentity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
TRANSFORM_MATRIX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
OPEN_PARENTHESIS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
CLOSE_PARENTHESIS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
TransformType	TokenNameIdentifier
.	TokenNameDOT
TRANSFORM_GENERAL	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
transformElement	TokenNameIdentifier
.	TokenNameDOT
isIdentity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
TRANSFORM_MATRIX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
OPEN_PARENTHESIS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
transformParameters	TokenNameIdentifier
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformString	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
CLOSE_PARENTHESIS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
Error	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
transformString	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
