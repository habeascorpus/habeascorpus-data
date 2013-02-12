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
color	TokenNameIdentifier
.	TokenNameDOT
ColorSpace	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
BandCombineOp	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
BufferedImage	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
ColorConvertOp	TokenNameIdentifier
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
DataBuffer	TokenNameIdentifier
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
Raster	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
Any2sRGBRed	TokenNameIdentifier
extends	TokenNameextends
AbstractRed	TokenNameIdentifier
{	TokenNameLBRACE
boolean	TokenNameboolean
srcIsLsRGB	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
Any2sRGBRed	TokenNameIdentifier
(	TokenNameLPAREN
CachableRed	TokenNameIdentifier
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
src	TokenNameIdentifier
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
fixColorModel	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
fixSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
getTileGridXOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
getTileGridYOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColorModel	TokenNameIdentifier
srcCM	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
srcCM	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
ColorSpace	TokenNameIdentifier
srcCS	TokenNameIdentifier
=	TokenNameEQUAL
srcCM	TokenNameIdentifier
.	TokenNameDOT
getColorSpace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
srcCS	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
CS_LINEAR_RGB	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
srcIsLsRGB	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
is_INT_PACK_COMP	TokenNameIdentifier
(	TokenNameLPAREN
SampleModel	TokenNameIdentifier
sm	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
sm	TokenNameIdentifier
instanceof	TokenNameinstanceof
SinglePixelPackedSampleModel	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sm	TokenNameIdentifier
.	TokenNameDOT
getDataType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_INT	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
SinglePixelPackedSampleModel	TokenNameIdentifier
sppsm	TokenNameIdentifier
;	TokenNameSEMICOLON
sppsm	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SinglePixelPackedSampleModel	TokenNameIdentifier
)	TokenNameRPAREN
sm	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
masks	TokenNameIdentifier
=	TokenNameEQUAL
sppsm	TokenNameIdentifier
.	TokenNameDOT
getBitMasks	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
masks	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
masks	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
masks	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
0x00ff0000	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
masks	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
0x0000ff00	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
masks	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
0x000000ff	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
masks	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
masks	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
0xff000000	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
GAMMA	TokenNameIdentifier
=	TokenNameEQUAL
2.4	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
linearToSRGBLut	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
256	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
final	TokenNamefinal
double	TokenNamedouble
scale	TokenNameIdentifier
=	TokenNameEQUAL
1.0	TokenNameDoubleLiteral
/	TokenNameDIVIDE
255	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
double	TokenNamedouble
exp	TokenNameIdentifier
=	TokenNameEQUAL
1.0	TokenNameDoubleLiteral
/	TokenNameDIVIDE
GAMMA	TokenNameIdentifier
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
256	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
value	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
*	TokenNameMULTIPLY
scale	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0.0031308	TokenNameDoubleLiteral
)	TokenNameRPAREN
value	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
12.92	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
value	TokenNameIdentifier
=	TokenNameEQUAL
1.055	TokenNameDoubleLiteral
*	TokenNameMULTIPLY
Math	TokenNameIdentifier
.	TokenNameDOT
pow	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
,	TokenNameCOMMA
exp	TokenNameIdentifier
)	TokenNameRPAREN
-	TokenNameMINUS
0.055	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
linearToSRGBLut	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
round	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
*	TokenNameMULTIPLY
255.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
WritableRaster	TokenNameIdentifier
applyLut_INT	TokenNameIdentifier
(	TokenNameLPAREN
WritableRaster	TokenNameIdentifier
wr	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lut	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SinglePixelPackedSampleModel	TokenNameIdentifier
sm	TokenNameIdentifier
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
srcBase	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
db	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
sm	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getMinX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
wr	TokenNameIdentifier
.	TokenNameDOT
getSampleModelTranslateX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
wr	TokenNameIdentifier
.	TokenNameDOT
getMinY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
int	TokenNameint
width	TokenNameIdentifier
=	TokenNameEQUAL
wr	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
height	TokenNameIdentifier
=	TokenNameEQUAL
wr	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
scanStride	TokenNameIdentifier
=	TokenNameEQUAL
sm	TokenNameIdentifier
.	TokenNameDOT
getScanlineStride	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
end	TokenNameIdentifier
,	TokenNameCOMMA
pix	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
y	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
y	TokenNameIdentifier
<	TokenNameLESS
height	TokenNameIdentifier
;	TokenNameSEMICOLON
y	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
sp	TokenNameIdentifier
=	TokenNameEQUAL
srcBase	TokenNameIdentifier
+	TokenNamePLUS
y	TokenNameIdentifier
*	TokenNameMULTIPLY
scanStride	TokenNameIdentifier
;	TokenNameSEMICOLON
end	TokenNameIdentifier
=	TokenNameEQUAL
sp	TokenNameIdentifier
+	TokenNamePLUS
width	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
sp	TokenNameIdentifier
<	TokenNameLESS
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pix	TokenNameIdentifier
=	TokenNameEQUAL
pixels	TokenNameIdentifier
[	TokenNameLBRACKET
sp	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
pixels	TokenNameIdentifier
[	TokenNameLBRACKET
sp	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
pix	TokenNameIdentifier
&	TokenNameAND
0xFF000000	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
(	TokenNameLPAREN
lut	TokenNameIdentifier
[	TokenNameLBRACKET
(	TokenNameLPAREN
pix	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
]	TokenNameRBRACKET
<<	TokenNameLEFT_SHIFT
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
(	TokenNameLPAREN
lut	TokenNameIdentifier
[	TokenNameLBRACKET
(	TokenNameLPAREN
pix	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
]	TokenNameRBRACKET
<<	TokenNameLEFT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
(	TokenNameLPAREN
lut	TokenNameIdentifier
[	TokenNameLBRACKET
(	TokenNameLPAREN
pix	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sp	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
wr	TokenNameIdentifier
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
CachableRed	TokenNameIdentifier
src	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CachableRed	TokenNameIdentifier
)	TokenNameRPAREN
getSources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColorModel	TokenNameIdentifier
srcCM	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SampleModel	TokenNameIdentifier
srcSM	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
srcIsLsRGB	TokenNameIdentifier
&&	TokenNameAND_AND
is_INT_PACK_COMP	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
src	TokenNameIdentifier
.	TokenNameDOT
copyData	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
srcCM	TokenNameIdentifier
.	TokenNameDOT
hasAlpha	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
coerceData	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
,	TokenNameCOMMA
srcCM	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
applyLut_INT	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
,	TokenNameCOMMA
linearToSRGBLut	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
wr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
srcCM	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
matrix	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
srcSM	TokenNameIdentifier
.	TokenNameDOT
getNumBands	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
1	TokenNameIntegerLiteral
:	TokenNameCOLON
matrix	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
2	TokenNameIntegerLiteral
:	TokenNameCOLON
matrix	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
3	TokenNameIntegerLiteral
:	TokenNameCOLON
matrix	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
matrix	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
srcSM	TokenNameIdentifier
.	TokenNameDOT
getNumBands	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Raster	TokenNameIdentifier
srcRas	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getData	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BandCombineOp	TokenNameIdentifier
op	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BandCombineOp	TokenNameIdentifier
(	TokenNameLPAREN
matrix	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
op	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
(	TokenNameLPAREN
srcRas	TokenNameIdentifier
,	TokenNameCOMMA
wr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
wr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
srcCM	TokenNameIdentifier
.	TokenNameDOT
getColorSpace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
CS_GRAY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
matrix	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
srcSM	TokenNameIdentifier
.	TokenNameDOT
getNumBands	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
1	TokenNameIntegerLiteral
:	TokenNameCOLON
matrix	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
2	TokenNameIntegerLiteral
:	TokenNameCOLON
default	TokenNamedefault
:	TokenNameCOLON
matrix	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
matrix	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Raster	TokenNameIdentifier
srcRas	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getData	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BandCombineOp	TokenNameIdentifier
op	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BandCombineOp	TokenNameIdentifier
(	TokenNameLPAREN
matrix	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
op	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
(	TokenNameLPAREN
srcRas	TokenNameIdentifier
,	TokenNameCOMMA
wr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
t	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
wr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ColorModel	TokenNameIdentifier
dstCM	TokenNameIdentifier
=	TokenNameEQUAL
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
srcCM	TokenNameIdentifier
.	TokenNameDOT
getColorSpace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
dstCM	TokenNameIdentifier
.	TokenNameDOT
getColorSpace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
is_INT_PACK_COMP	TokenNameIdentifier
(	TokenNameLPAREN
srcSM	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
src	TokenNameIdentifier
.	TokenNameDOT
copyData	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
copyData	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
.	TokenNameDOT
getData	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
wr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
wr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Raster	TokenNameIdentifier
srcRas	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getData	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
WritableRaster	TokenNameIdentifier
srcWr	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
WritableRaster	TokenNameIdentifier
)	TokenNameRPAREN
srcRas	TokenNameIdentifier
;	TokenNameSEMICOLON
ColorModel	TokenNameIdentifier
srcBICM	TokenNameIdentifier
=	TokenNameEQUAL
srcCM	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
srcCM	TokenNameIdentifier
.	TokenNameDOT
hasAlpha	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
srcBICM	TokenNameIdentifier
=	TokenNameEQUAL
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
coerceData	TokenNameIdentifier
(	TokenNameLPAREN
srcWr	TokenNameIdentifier
,	TokenNameCOMMA
srcCM	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedImage	TokenNameIdentifier
srcBI	TokenNameIdentifier
,	TokenNameCOMMA
dstBI	TokenNameIdentifier
;	TokenNameSEMICOLON
srcBI	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
srcBICM	TokenNameIdentifier
,	TokenNameCOMMA
srcWr	TokenNameIdentifier
.	TokenNameDOT
createWritableTranslatedChild	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColorConvertOp	TokenNameIdentifier
op	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColorConvertOp	TokenNameIdentifier
(	TokenNameLPAREN
dstCM	TokenNameIdentifier
.	TokenNameDOT
getColorSpace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dstBI	TokenNameIdentifier
=	TokenNameEQUAL
op	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
(	TokenNameLPAREN
srcBI	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
WritableRaster	TokenNameIdentifier
wr00	TokenNameIdentifier
=	TokenNameEQUAL
wr	TokenNameIdentifier
.	TokenNameDOT
createWritableTranslatedChild	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
dstCM	TokenNameIdentifier
.	TokenNameDOT
getColorSpace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getNumComponents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
copyBand	TokenNameIdentifier
(	TokenNameLPAREN
dstBI	TokenNameIdentifier
.	TokenNameDOT
getRaster	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
i	TokenNameIdentifier
,	TokenNameCOMMA
wr00	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dstCM	TokenNameIdentifier
.	TokenNameDOT
hasAlpha	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
copyBand	TokenNameIdentifier
(	TokenNameLPAREN
srcWr	TokenNameIdentifier
,	TokenNameCOMMA
srcSM	TokenNameIdentifier
.	TokenNameDOT
getNumBands	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
wr	TokenNameIdentifier
,	TokenNameCOMMA
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getNumBands	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
wr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
ColorModel	TokenNameIdentifier
fixColorModel	TokenNameIdentifier
(	TokenNameLPAREN
CachableRed	TokenNameIdentifier
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColorModel	TokenNameIdentifier
cm	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cm	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
cm	TokenNameIdentifier
.	TokenNameDOT
hasAlpha	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
sRGB_Unpre	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
sRGB	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
SampleModel	TokenNameIdentifier
sm	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
sm	TokenNameIdentifier
.	TokenNameDOT
getNumBands	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
1	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
sRGB	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
2	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
sRGB_Unpre	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
3	TokenNameIntegerLiteral
:	TokenNameCOLON
return	TokenNamereturn
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
sRGB	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
sRGB_Unpre	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
SampleModel	TokenNameIdentifier
fixSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
CachableRed	TokenNameIdentifier
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SampleModel	TokenNameIdentifier
sm	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColorModel	TokenNameIdentifier
cm	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
.	TokenNameDOT
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
alpha	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cm	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
alpha	TokenNameIdentifier
=	TokenNameEQUAL
cm	TokenNameIdentifier
.	TokenNameDOT
hasAlpha	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
sm	TokenNameIdentifier
.	TokenNameDOT
getNumBands	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
1	TokenNameIntegerLiteral
:	TokenNameCOLON
case	TokenNamecase
3	TokenNameIntegerLiteral
:	TokenNameCOLON
alpha	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
alpha	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
alpha	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
SinglePixelPackedSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_INT	TokenNameIdentifier
,	TokenNameCOMMA
sm	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
sm	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0xFF0000	TokenNameIntegerLiteral
,	TokenNameCOMMA
0xFF00	TokenNameIntegerLiteral
,	TokenNameCOMMA
0xFF	TokenNameIntegerLiteral
,	TokenNameCOMMA
0xFF000000	TokenNameIntegerLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
new	TokenNamenew
SinglePixelPackedSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_INT	TokenNameIdentifier
,	TokenNameCOMMA
sm	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
sm	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0xFF0000	TokenNameIntegerLiteral
,	TokenNameCOMMA
0xFF00	TokenNameIntegerLiteral
,	TokenNameCOMMA
0xFF	TokenNameIntegerLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
