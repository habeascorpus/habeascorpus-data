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
class	TokenNameclass
DistantLight	TokenNameIdentifier
extends	TokenNameextends
AbstractLight	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
double	TokenNamedouble
azimuth	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
elevation	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
Lx	TokenNameIdentifier
,	TokenNameCOMMA
Ly	TokenNameIdentifier
,	TokenNameCOMMA
Lz	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
double	TokenNamedouble
getAzimuth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
azimuth	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getElevation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
elevation	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DistantLight	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
azimuth	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
elevation	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
color	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
color	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
azimuth	TokenNameIdentifier
=	TokenNameEQUAL
azimuth	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
elevation	TokenNameIdentifier
=	TokenNameEQUAL
elevation	TokenNameIdentifier
;	TokenNameSEMICOLON
Lx	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
cos	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
toRadians	TokenNameIdentifier
(	TokenNameLPAREN
azimuth	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
Math	TokenNameIdentifier
.	TokenNameDOT
cos	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
toRadians	TokenNameIdentifier
(	TokenNameLPAREN
elevation	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Ly	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
sin	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
toRadians	TokenNameIdentifier
(	TokenNameLPAREN
azimuth	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
Math	TokenNameIdentifier
.	TokenNameDOT
cos	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
toRadians	TokenNameIdentifier
(	TokenNameLPAREN
elevation	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Lz	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
sin	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
toRadians	TokenNameIdentifier
(	TokenNameLPAREN
elevation	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
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
void	TokenNamevoid
getLight	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
double	TokenNamedouble
x	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
double	TokenNamedouble
y	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
double	TokenNamedouble
z	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
L	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
L	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
Lx	TokenNameIdentifier
;	TokenNameSEMICOLON
L	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
Ly	TokenNameIdentifier
;	TokenNameSEMICOLON
L	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
Lz	TokenNameIdentifier
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
{	TokenNameLBRACE
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
width	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
CL	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
CL	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
Lx	TokenNameIdentifier
;	TokenNameSEMICOLON
CL	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
Ly	TokenNameIdentifier
;	TokenNameSEMICOLON
CL	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
Lz	TokenNameIdentifier
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
ret	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
CL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
final	TokenNamefinal
double	TokenNamedouble
lx	TokenNameIdentifier
=	TokenNameEQUAL
Lx	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
double	TokenNamedouble
ly	TokenNameIdentifier
=	TokenNameEQUAL
Ly	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
double	TokenNamedouble
lz	TokenNameIdentifier
=	TokenNameEQUAL
Lz	TokenNameIdentifier
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
ret	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
lx	TokenNameIdentifier
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
ly	TokenNameIdentifier
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
lz	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE