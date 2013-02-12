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
rendered	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Rectangle	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
ColorModel	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
DataBufferInt	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
SampleModel	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
SinglePixelPackedSampleModel	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
WritableRaster	TokenNameIdentifier
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
GraphicsUtil	TokenNameIdentifier
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
Light	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DiffuseLightingRed	TokenNameIdentifier
extends	TokenNameextends
AbstractRed	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
double	TokenNamedouble
kd	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Light	TokenNameIdentifier
light	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
BumpMap	TokenNameIdentifier
bumpMap	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
scaleX	TokenNameIdentifier
,	TokenNameCOMMA
scaleY	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Rectangle	TokenNameIdentifier
litRegion	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
linear	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DiffuseLightingRed	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
kd	TokenNameIdentifier
,	TokenNameCOMMA
Light	TokenNameIdentifier
light	TokenNameIdentifier
,	TokenNameCOMMA
BumpMap	TokenNameIdentifier
bumpMap	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle	TokenNameIdentifier
litRegion	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
scaleX	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
scaleY	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
linear	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
kd	TokenNameIdentifier
=	TokenNameEQUAL
kd	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
light	TokenNameIdentifier
=	TokenNameEQUAL
light	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
bumpMap	TokenNameIdentifier
=	TokenNameEQUAL
bumpMap	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
litRegion	TokenNameIdentifier
=	TokenNameEQUAL
litRegion	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scaleX	TokenNameIdentifier
=	TokenNameEQUAL
scaleX	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scaleY	TokenNameIdentifier
=	TokenNameEQUAL
scaleY	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
linear	TokenNameIdentifier
=	TokenNameEQUAL
linear	TokenNameIdentifier
;	TokenNameSEMICOLON
ColorModel	TokenNameIdentifier
cm	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
linear	TokenNameIdentifier
)	TokenNameRPAREN
cm	TokenNameIdentifier
=	TokenNameEQUAL
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
Linear_sRGB_Pre	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
cm	TokenNameIdentifier
=	TokenNameEQUAL
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
sRGB_Pre	TokenNameIdentifier
;	TokenNameSEMICOLON
SampleModel	TokenNameIdentifier
sm	TokenNameIdentifier
=	TokenNameEQUAL
cm	TokenNameIdentifier
.	TokenNameDOT
createCompatibleSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
litRegion	TokenNameIdentifier
.	TokenNameDOT
width	TokenNameIdentifier
,	TokenNameCOMMA
litRegion	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
init	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
CachableRed	TokenNameIdentifier
)	TokenNameRPAREN
null	TokenNamenull
,	TokenNameCOMMA
litRegion	TokenNameIdentifier
,	TokenNameCOMMA
cm	TokenNameIdentifier
,	TokenNameCOMMA
sm	TokenNameIdentifier
,	TokenNameCOMMA
litRegion	TokenNameIdentifier
.	TokenNameDOT
x	TokenNameIdentifier
,	TokenNameCOMMA
litRegion	TokenNameIdentifier
.	TokenNameDOT
y	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
WritableRaster	TokenNameIdentifier
copyData	TokenNameIdentifier
(	TokenNameLPAREN
WritableRaster	TokenNameIdentifier
wr	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lightColor	TokenNameIdentifier
=	TokenNameEQUAL
light	TokenNameIdentifier
.	TokenNameDOT
getColor	TokenNameIdentifier
(	TokenNameLPAREN
linear	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
w	TokenNameIdentifier
=	TokenNameEQUAL
wr	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
h	TokenNameIdentifier
=	TokenNameEQUAL
wr	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
minX	TokenNameIdentifier
=	TokenNameEQUAL
wr	TokenNameIdentifier
.	TokenNameDOT
getMinX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
minY	TokenNameIdentifier
=	TokenNameEQUAL
wr	TokenNameIdentifier
.	TokenNameDOT
getMinY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
DataBufferInt	TokenNameIdentifier
db	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DataBufferInt	TokenNameIdentifier
)	TokenNameRPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getDataBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
pixels	TokenNameIdentifier
=	TokenNameEQUAL
db	TokenNameIdentifier
.	TokenNameDOT
getBankData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
final	TokenNamefinal
SinglePixelPackedSampleModel	TokenNameIdentifier
sppsm	TokenNameIdentifier
;	TokenNameSEMICOLON
sppsm	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SinglePixelPackedSampleModel	TokenNameIdentifier
)	TokenNameRPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
db	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
sppsm	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
minX	TokenNameIdentifier
-	TokenNameMINUS
wr	TokenNameIdentifier
.	TokenNameDOT
getSampleModelTranslateX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
minY	TokenNameIdentifier
-	TokenNameMINUS
wr	TokenNameIdentifier
.	TokenNameDOT
getSampleModelTranslateY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
scanStride	TokenNameIdentifier
=	TokenNameEQUAL
sppsm	TokenNameIdentifier
.	TokenNameDOT
getScanlineStride	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
adjust	TokenNameIdentifier
=	TokenNameEQUAL
scanStride	TokenNameIdentifier
-	TokenNameMINUS
w	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
p	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
r	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
g	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
b	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
double	TokenNamedouble
x	TokenNameIdentifier
=	TokenNameEQUAL
scaleX	TokenNameIdentifier
*	TokenNameMULTIPLY
minX	TokenNameIdentifier
;	TokenNameSEMICOLON
double	TokenNamedouble
y	TokenNameIdentifier
=	TokenNameEQUAL
scaleY	TokenNameIdentifier
*	TokenNameMULTIPLY
minY	TokenNameIdentifier
;	TokenNameSEMICOLON
double	TokenNamedouble
NL	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
NA	TokenNameIdentifier
=	TokenNameEQUAL
bumpMap	TokenNameIdentifier
.	TokenNameDOT
getNormalArray	TokenNameIdentifier
(	TokenNameLPAREN
minX	TokenNameIdentifier
,	TokenNameCOMMA
minY	TokenNameIdentifier
,	TokenNameCOMMA
w	TokenNameIdentifier
,	TokenNameCOMMA
h	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
light	TokenNameIdentifier
.	TokenNameDOT
isConstant	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
LA	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
w	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
h	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
NR	TokenNameIdentifier
=	TokenNameEQUAL
NA	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
light	TokenNameIdentifier
.	TokenNameDOT
getLightRow	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
+	TokenNamePLUS
i	TokenNameIdentifier
*	TokenNameMULTIPLY
scaleY	TokenNameIdentifier
,	TokenNameCOMMA
scaleX	TokenNameIdentifier
,	TokenNameCOMMA
w	TokenNameIdentifier
,	TokenNameCOMMA
NR	TokenNameIdentifier
,	TokenNameCOMMA
LA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
w	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
N	TokenNameIdentifier
=	TokenNameEQUAL
NR	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
L	TokenNameIdentifier
=	TokenNameEQUAL
LA	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
NL	TokenNameIdentifier
=	TokenNameEQUAL
255.	TokenNameDoubleLiteral
*	TokenNameMULTIPLY
kd	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
N	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
*	TokenNameMULTIPLY
L	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
N	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
*	TokenNameMULTIPLY
L	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
N	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
*	TokenNameMULTIPLY
L	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
NL	TokenNameIdentifier
*	TokenNameMULTIPLY
lightColor	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
NL	TokenNameIdentifier
*	TokenNameMULTIPLY
lightColor	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
b	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
NL	TokenNameIdentifier
*	TokenNameMULTIPLY
lightColor	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
r	TokenNameIdentifier
&	TokenNameAND
0xFFFFFF00	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
r	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
r	TokenNameIdentifier
&	TokenNameAND
0x80000000	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
255	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
g	TokenNameIdentifier
&	TokenNameAND
0xFFFFFF00	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
g	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
g	TokenNameIdentifier
&	TokenNameAND
0x80000000	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
255	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
b	TokenNameIdentifier
&	TokenNameAND
0xFFFFFF00	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
b	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
b	TokenNameIdentifier
&	TokenNameAND
0x80000000	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
255	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
pixels	TokenNameIdentifier
[	TokenNameLBRACKET
p	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
0xff000000	TokenNameIntegerLiteral
|	TokenNameOR
r	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
16	TokenNameIntegerLiteral
|	TokenNameOR
g	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
8	TokenNameIntegerLiteral
|	TokenNameOR
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
p	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
adjust	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
L	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
light	TokenNameIdentifier
.	TokenNameDOT
getLight	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
L	TokenNameIdentifier
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
h	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
NR	TokenNameIdentifier
=	TokenNameEQUAL
NA	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
w	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
N	TokenNameIdentifier
=	TokenNameEQUAL
NR	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
NL	TokenNameIdentifier
=	TokenNameEQUAL
255.	TokenNameDoubleLiteral
*	TokenNameMULTIPLY
kd	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
N	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
*	TokenNameMULTIPLY
L	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
N	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
*	TokenNameMULTIPLY
L	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
N	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
*	TokenNameMULTIPLY
L	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
NL	TokenNameIdentifier
*	TokenNameMULTIPLY
lightColor	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
NL	TokenNameIdentifier
*	TokenNameMULTIPLY
lightColor	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
b	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
NL	TokenNameIdentifier
*	TokenNameMULTIPLY
lightColor	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
r	TokenNameIdentifier
&	TokenNameAND
0xFFFFFF00	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
r	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
r	TokenNameIdentifier
&	TokenNameAND
0x80000000	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
255	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
g	TokenNameIdentifier
&	TokenNameAND
0xFFFFFF00	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
g	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
g	TokenNameIdentifier
&	TokenNameAND
0x80000000	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
255	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
b	TokenNameIdentifier
&	TokenNameAND
0xFFFFFF00	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
b	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
b	TokenNameIdentifier
&	TokenNameAND
0x80000000	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
255	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
pixels	TokenNameIdentifier
[	TokenNameLBRACKET
p	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
0xff000000	TokenNameIntegerLiteral
|	TokenNameOR
r	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
16	TokenNameIntegerLiteral
|	TokenNameOR
g	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
8	TokenNameIntegerLiteral
|	TokenNameOR
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
p	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
adjust	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
wr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
