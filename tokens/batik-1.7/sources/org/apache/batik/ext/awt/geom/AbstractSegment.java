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
geom	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
Point2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AbstractSegment	TokenNameIdentifier
implements	TokenNameimplements
Segment	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
abstract	TokenNameabstract
int	TokenNameint
findRoots	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
y	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
roots	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
Segment	TokenNameIdentifier
.	TokenNameDOT
SplitResults	TokenNameIdentifier
split	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
roots	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
int	TokenNameint
numSol	TokenNameIdentifier
=	TokenNameEQUAL
findRoots	TokenNameIdentifier
(	TokenNameLPAREN
y	TokenNameIdentifier
,	TokenNameCOMMA
roots	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
numSol	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
Arrays	TokenNameIdentifier
.	TokenNameDOT
sort	TokenNameIdentifier
(	TokenNameLPAREN
roots	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
numSol	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
segs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
numSol	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
numSegments	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
segs	TokenNameIdentifier
[	TokenNameLBRACKET
numSegments	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
numSol	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
r	TokenNameIdentifier
=	TokenNameEQUAL
roots	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
1.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
segs	TokenNameIdentifier
[	TokenNameLBRACKET
numSegments	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
r	TokenNameIdentifier
)	TokenNameRPAREN
segs	TokenNameIdentifier
[	TokenNameLBRACKET
numSegments	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
segs	TokenNameIdentifier
[	TokenNameLBRACKET
numSegments	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
1.0	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
numSegments	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
Segment	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
parts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Segment	TokenNameIdentifier
[	TokenNameLBRACKET
numSegments	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
double	TokenNamedouble
pT	TokenNameIdentifier
=	TokenNameEQUAL
0.0	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
int	TokenNameint
pIdx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
boolean	TokenNameboolean
firstAbove	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
,	TokenNameCOMMA
prevAbove	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
numSegments	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
parts	TokenNameIdentifier
[	TokenNameLBRACKET
pIdx	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
getSegment	TokenNameIdentifier
(	TokenNameLPAREN
segs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
segs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Point2D	TokenNameIdentifier
.	TokenNameDOT
Double	TokenNameIdentifier
pt	TokenNameIdentifier
=	TokenNameEQUAL
parts	TokenNameIdentifier
[	TokenNameLBRACKET
pIdx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
eval	TokenNameIdentifier
(	TokenNameLPAREN
0.5	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
pIdx	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
pIdx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
firstAbove	TokenNameIdentifier
=	TokenNameEQUAL
prevAbove	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
pt	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
<	TokenNameLESS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
boolean	TokenNameboolean
above	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
pt	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
<	TokenNameLESS
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prevAbove	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
above	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
parts	TokenNameIdentifier
[	TokenNameLBRACKET
pIdx	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
getSegment	TokenNameIdentifier
(	TokenNameLPAREN
pT	TokenNameIdentifier
,	TokenNameCOMMA
segs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
pIdx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
pT	TokenNameIdentifier
=	TokenNameEQUAL
segs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
prevAbove	TokenNameIdentifier
=	TokenNameEQUAL
above	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
pIdx	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
Segment	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
below	TokenNameIdentifier
,	TokenNameCOMMA
above	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
firstAbove	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
above	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Segment	TokenNameIdentifier
[	TokenNameLBRACKET
(	TokenNameLPAREN
pIdx	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
below	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Segment	TokenNameIdentifier
[	TokenNameLBRACKET
pIdx	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
above	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Segment	TokenNameIdentifier
[	TokenNameLBRACKET
pIdx	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
below	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Segment	TokenNameIdentifier
[	TokenNameLBRACKET
(	TokenNameLPAREN
pIdx	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
ai	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
bi	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
pIdx	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
firstAbove	TokenNameIdentifier
)	TokenNameRPAREN
above	TokenNameIdentifier
[	TokenNameLBRACKET
ai	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
parts	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
else	TokenNameelse
below	TokenNameIdentifier
[	TokenNameLBRACKET
bi	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
parts	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
firstAbove	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
firstAbove	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
SplitResults	TokenNameIdentifier
(	TokenNameLPAREN
below	TokenNameIdentifier
,	TokenNameCOMMA
above	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Segment	TokenNameIdentifier
splitBefore	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getSegment	TokenNameIdentifier
(	TokenNameLPAREN
0.0	TokenNameDoubleLiteral
,	TokenNameCOMMA
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Segment	TokenNameIdentifier
splitAfter	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getSegment	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
,	TokenNameCOMMA
1.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
eps	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
/	TokenNameDIVIDE
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
(	TokenNameLPAREN
1L	TokenNameLongLiteral
<<	TokenNameLEFT_SHIFT
48	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
tol	TokenNameIdentifier
=	TokenNameEQUAL
4.0	TokenNameDoubleLiteral
*	TokenNameMULTIPLY
eps	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
solveLine	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
a	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
b	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
roots	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
a	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
b	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
roots	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
roots	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
-	TokenNameMINUS
b	TokenNameIdentifier
/	TokenNameDIVIDE
a	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
solveQuad	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
a	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
b	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
c	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
roots	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
a	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
solveLine	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
,	TokenNameCOMMA
c	TokenNameIdentifier
,	TokenNameCOMMA
roots	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
double	TokenNamedouble
det	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
*	TokenNameMULTIPLY
b	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
a	TokenNameIdentifier
*	TokenNameMULTIPLY
c	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
det	TokenNameIdentifier
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
tol	TokenNameIdentifier
*	TokenNameMULTIPLY
b	TokenNameIdentifier
*	TokenNameMULTIPLY
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
roots	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
-	TokenNameMINUS
b	TokenNameIdentifier
/	TokenNameDIVIDE
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
a	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
det	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
det	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
det	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
w	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
(	TokenNameLPAREN
b	TokenNameIdentifier
+	TokenNamePLUS
matchSign	TokenNameIdentifier
(	TokenNameLPAREN
det	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
roots	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
c	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
w	TokenNameIdentifier
;	TokenNameSEMICOLON
roots	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
w	TokenNameIdentifier
/	TokenNameDIVIDE
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
a	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
double	TokenNamedouble
matchSign	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
a	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
b	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
(	TokenNameLPAREN
a	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
a	TokenNameIdentifier
:	TokenNameCOLON
-	TokenNameMINUS
a	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
a	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
a	TokenNameIdentifier
:	TokenNameCOLON
-	TokenNameMINUS
a	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
solveCubic	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
a3	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
a2	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
a1	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
a0	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
roots	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
dRoots	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
int	TokenNameint
dCnt	TokenNameIdentifier
=	TokenNameEQUAL
solveQuad	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
a3	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
a2	TokenNameIdentifier
,	TokenNameCOMMA
a1	TokenNameIdentifier
,	TokenNameCOMMA
dRoots	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
yVals	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
tVals	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
int	TokenNameint
yCnt	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
yVals	TokenNameIdentifier
[	TokenNameLBRACKET
yCnt	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
a0	TokenNameIdentifier
;	TokenNameSEMICOLON
tVals	TokenNameIdentifier
[	TokenNameLBRACKET
yCnt	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
double	TokenNamedouble
r	TokenNameIdentifier
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
dCnt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
1	TokenNameIntegerLiteral
:	TokenNameCOLON
r	TokenNameIdentifier
=	TokenNameEQUAL
dRoots	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
r	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
r	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
yVals	TokenNameIdentifier
[	TokenNameLBRACKET
yCnt	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
a3	TokenNameIdentifier
*	TokenNameMULTIPLY
r	TokenNameIdentifier
+	TokenNamePLUS
a2	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
r	TokenNameIdentifier
+	TokenNamePLUS
a1	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
r	TokenNameIdentifier
+	TokenNamePLUS
a0	TokenNameIdentifier
;	TokenNameSEMICOLON
tVals	TokenNameIdentifier
[	TokenNameLBRACKET
yCnt	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
2	TokenNameIntegerLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
dRoots	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
>	TokenNameGREATER
dRoots	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
t	TokenNameIdentifier
=	TokenNameEQUAL
dRoots	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
dRoots	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
dRoots	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
dRoots	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
t	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
r	TokenNameIdentifier
=	TokenNameEQUAL
dRoots	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
r	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
r	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
yVals	TokenNameIdentifier
[	TokenNameLBRACKET
yCnt	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
a3	TokenNameIdentifier
*	TokenNameMULTIPLY
r	TokenNameIdentifier
+	TokenNamePLUS
a2	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
r	TokenNameIdentifier
+	TokenNamePLUS
a1	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
r	TokenNameIdentifier
+	TokenNamePLUS
a0	TokenNameIdentifier
;	TokenNameSEMICOLON
tVals	TokenNameIdentifier
[	TokenNameLBRACKET
yCnt	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
r	TokenNameIdentifier
=	TokenNameEQUAL
dRoots	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
r	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
r	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
yVals	TokenNameIdentifier
[	TokenNameLBRACKET
yCnt	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
a3	TokenNameIdentifier
*	TokenNameMULTIPLY
r	TokenNameIdentifier
+	TokenNamePLUS
a2	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
r	TokenNameIdentifier
+	TokenNamePLUS
a1	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
r	TokenNameIdentifier
+	TokenNamePLUS
a0	TokenNameIdentifier
;	TokenNameSEMICOLON
tVals	TokenNameIdentifier
[	TokenNameLBRACKET
yCnt	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
yVals	TokenNameIdentifier
[	TokenNameLBRACKET
yCnt	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
a3	TokenNameIdentifier
+	TokenNamePLUS
a2	TokenNameIdentifier
+	TokenNamePLUS
a1	TokenNameIdentifier
+	TokenNamePLUS
a0	TokenNameIdentifier
;	TokenNameSEMICOLON
tVals	TokenNameIdentifier
[	TokenNameLBRACKET
yCnt	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
1.0	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
int	TokenNameint
ret	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
yCnt	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
y0	TokenNameIdentifier
=	TokenNameEQUAL
yVals	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
t0	TokenNameIdentifier
=	TokenNameEQUAL
tVals	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
double	TokenNamedouble
y1	TokenNameIdentifier
=	TokenNameEQUAL
yVals	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
t1	TokenNameIdentifier
=	TokenNameEQUAL
tVals	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
y0	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
y1	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
y0	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
y1	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
y0	TokenNameIdentifier
>	TokenNameGREATER
y1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
t	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
=	TokenNameEQUAL
y0	TokenNameIdentifier
;	TokenNameSEMICOLON
y0	TokenNameIdentifier
=	TokenNameEQUAL
y1	TokenNameIdentifier
;	TokenNameSEMICOLON
y1	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
=	TokenNameEQUAL
t0	TokenNameIdentifier
;	TokenNameSEMICOLON
t0	TokenNameIdentifier
=	TokenNameEQUAL
t1	TokenNameIdentifier
;	TokenNameSEMICOLON
t1	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
-	TokenNameMINUS
y0	TokenNameIdentifier
<	TokenNameLESS
tol	TokenNameIdentifier
*	TokenNameMULTIPLY
y1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
roots	TokenNameIdentifier
[	TokenNameLBRACKET
ret	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
t0	TokenNameIdentifier
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
y1	TokenNameIdentifier
<	TokenNameLESS
-	TokenNameMINUS
tol	TokenNameIdentifier
*	TokenNameMULTIPLY
y0	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
roots	TokenNameIdentifier
[	TokenNameLBRACKET
ret	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
t1	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
double	TokenNamedouble
epsZero	TokenNameIdentifier
=	TokenNameEQUAL
tol	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
y1	TokenNameIdentifier
-	TokenNameMINUS
y0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
cnt	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
cnt	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
cnt	TokenNameIdentifier
<	TokenNameLESS
20	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
cnt	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
dt	TokenNameIdentifier
=	TokenNameEQUAL
t1	TokenNameIdentifier
-	TokenNameMINUS
t0	TokenNameIdentifier
;	TokenNameSEMICOLON
double	TokenNamedouble
dy	TokenNameIdentifier
=	TokenNameEQUAL
y1	TokenNameIdentifier
-	TokenNameMINUS
y0	TokenNameIdentifier
;	TokenNameSEMICOLON
double	TokenNamedouble
t	TokenNameIdentifier
=	TokenNameEQUAL
t0	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
y0	TokenNameIdentifier
/	TokenNameDIVIDE
dy	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
99	TokenNameIntegerLiteral
+	TokenNamePLUS
.5	TokenNameDoubleLiteral
)	TokenNameRPAREN
*	TokenNameMULTIPLY
dt	TokenNameIdentifier
/	TokenNameDIVIDE
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
double	TokenNamedouble
v	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
a3	TokenNameIdentifier
*	TokenNameMULTIPLY
t	TokenNameIdentifier
+	TokenNamePLUS
a2	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
t	TokenNameIdentifier
+	TokenNamePLUS
a1	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
t	TokenNameIdentifier
+	TokenNamePLUS
a0	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
epsZero	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
roots	TokenNameIdentifier
[	TokenNameLBRACKET
ret	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
t	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
t0	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
;	TokenNameSEMICOLON
y0	TokenNameIdentifier
=	TokenNameEQUAL
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
t1	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
;	TokenNameSEMICOLON
y1	TokenNameIdentifier
=	TokenNameEQUAL
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
cnt	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
20	TokenNameIntegerLiteral
)	TokenNameRPAREN
roots	TokenNameIdentifier
[	TokenNameLBRACKET
ret	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
t0	TokenNameIdentifier
+	TokenNamePLUS
t1	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
