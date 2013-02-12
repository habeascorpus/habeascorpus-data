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
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Color	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AbstractLight	TokenNameIdentifier
implements	TokenNameimplements
Light	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
sRGBToLsRGB	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0.003928	TokenNameDoubleLiteral
)	TokenNameRPAREN
return	TokenNamereturn
value	TokenNameIdentifier
/	TokenNameDIVIDE
12.92	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
Math	TokenNameIdentifier
.	TokenNameDOT
pow	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
value	TokenNameIdentifier
+	TokenNamePLUS
0.055	TokenNameDoubleLiteral
)	TokenNameRPAREN
/	TokenNameDIVIDE
1.055	TokenNameDoubleLiteral
,	TokenNameCOMMA
2.4	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
color	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getColor	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
linear	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
linear	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ret	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
sRGBToLsRGB	TokenNameIdentifier
(	TokenNameLPAREN
color	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
sRGBToLsRGB	TokenNameIdentifier
(	TokenNameLPAREN
color	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
sRGBToLsRGB	TokenNameIdentifier
(	TokenNameLPAREN
color	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
ret	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
color	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
color	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
color	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AbstractLight	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
color	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setColor	TokenNameIdentifier
(	TokenNameLPAREN
color	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setColor	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
newColor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
color	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
color	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
newColor	TokenNameIdentifier
.	TokenNameDOT
getRed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
255.	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
color	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
newColor	TokenNameIdentifier
.	TokenNameDOT
getGreen	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
255.	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
color	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
newColor	TokenNameIdentifier
.	TokenNameDOT
getBlue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
255.	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isConstant	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getLightMap	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
x	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
y	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
double	TokenNamedouble
dx	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
double	TokenNamedouble
dy	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
width	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
height	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
z	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
L	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
height	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
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
height	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
L	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
getLightRow	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
,	TokenNameCOMMA
dx	TokenNameIdentifier
,	TokenNameCOMMA
width	TokenNameIdentifier
,	TokenNameCOMMA
z	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
y	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
dy	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
L	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getLightRow	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
x	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
y	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
double	TokenNamedouble
dx	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
width	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
z	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lightRow	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ret	TokenNameIdentifier
=	TokenNameEQUAL
lightRow	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
width	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
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
width	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
getLight	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
,	TokenNameCOMMA
z	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
ret	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
x	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
dx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE