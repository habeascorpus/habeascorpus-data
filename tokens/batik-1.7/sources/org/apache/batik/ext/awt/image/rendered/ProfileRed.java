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
Graphics2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Point	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
RenderingHints	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Transparency	TokenNameIdentifier
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
BandedSampleModel	TokenNameIdentifier
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
ComponentColorModel	TokenNameIdentifier
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
DataBufferByte	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
DirectColorModel	TokenNameIdentifier
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
RenderedImage	TokenNameIdentifier
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
color	TokenNameIdentifier
.	TokenNameDOT
ICCColorSpaceExt	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ProfileRed	TokenNameIdentifier
extends	TokenNameextends
AbstractRed	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
ColorSpace	TokenNameIdentifier
sRGBCS	TokenNameIdentifier
=	TokenNameEQUAL
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
CS_sRGB	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
ColorModel	TokenNameIdentifier
sRGBCM	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DirectColorModel	TokenNameIdentifier
(	TokenNameLPAREN
sRGBCS	TokenNameIdentifier
,	TokenNameCOMMA
32	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x00ff0000	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x0000ff00	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x000000ff	TokenNameIntegerLiteral
,	TokenNameCOMMA
0xff000000	TokenNameIntegerLiteral
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_INT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
ICCColorSpaceExt	TokenNameIdentifier
colorSpace	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ProfileRed	TokenNameIdentifier
(	TokenNameLPAREN
CachableRed	TokenNameIdentifier
src	TokenNameIdentifier
,	TokenNameCOMMA
ICCColorSpaceExt	TokenNameIdentifier
colorSpace	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
colorSpace	TokenNameIdentifier
=	TokenNameEQUAL
colorSpace	TokenNameIdentifier
;	TokenNameSEMICOLON
init	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
sRGBCM	TokenNameIdentifier
,	TokenNameCOMMA
sRGBCM	TokenNameIdentifier
.	TokenNameDOT
createCompatibleSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
}	TokenNameRBRACE
public	TokenNamepublic
CachableRed	TokenNameIdentifier
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
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
}	TokenNameRBRACE
public	TokenNamepublic
WritableRaster	TokenNameIdentifier
copyData	TokenNameIdentifier
(	TokenNameLPAREN
WritableRaster	TokenNameIdentifier
argbWR	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
RenderedImage	TokenNameIdentifier
img	TokenNameIdentifier
=	TokenNameEQUAL
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColorModel	TokenNameIdentifier
imgCM	TokenNameIdentifier
=	TokenNameEQUAL
img	TokenNameIdentifier
.	TokenNameDOT
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColorSpace	TokenNameIdentifier
imgCS	TokenNameIdentifier
=	TokenNameEQUAL
imgCM	TokenNameIdentifier
.	TokenNameDOT
getColorSpace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
nImageComponents	TokenNameIdentifier
=	TokenNameEQUAL
imgCS	TokenNameIdentifier
.	TokenNameDOT
getNumComponents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
nProfileComponents	TokenNameIdentifier
=	TokenNameEQUAL
colorSpace	TokenNameIdentifier
.	TokenNameDOT
getNumComponents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nImageComponents	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
nProfileComponents	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Input image and associated color profile have"	TokenNameStringLiteral
+	TokenNamePLUS
" mismatching number of color components: conversion is not possible"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
argbWR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
w	TokenNameIdentifier
=	TokenNameEQUAL
argbWR	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
h	TokenNameIdentifier
=	TokenNameEQUAL
argbWR	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
minX	TokenNameIdentifier
=	TokenNameEQUAL
argbWR	TokenNameIdentifier
.	TokenNameDOT
getMinX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
minY	TokenNameIdentifier
=	TokenNameEQUAL
argbWR	TokenNameIdentifier
.	TokenNameDOT
getMinY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
WritableRaster	TokenNameIdentifier
srcWR	TokenNameIdentifier
=	TokenNameEQUAL
imgCM	TokenNameIdentifier
.	TokenNameDOT
createCompatibleWritableRaster	TokenNameIdentifier
(	TokenNameLPAREN
w	TokenNameIdentifier
,	TokenNameCOMMA
h	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
srcWR	TokenNameIdentifier
=	TokenNameEQUAL
srcWR	TokenNameIdentifier
.	TokenNameDOT
createWritableTranslatedChild	TokenNameIdentifier
(	TokenNameLPAREN
minX	TokenNameIdentifier
,	TokenNameCOMMA
minY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
img	TokenNameIdentifier
.	TokenNameDOT
copyData	TokenNameIdentifier
(	TokenNameLPAREN
srcWR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
imgCM	TokenNameIdentifier
instanceof	TokenNameinstanceof
ComponentColorModel	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
!	TokenNameNOT
(	TokenNameLPAREN
img	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
BandedSampleModel	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
imgCM	TokenNameIdentifier
.	TokenNameDOT
hasAlpha	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
imgCM	TokenNameIdentifier
.	TokenNameDOT
isAlphaPremultiplied	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ComponentColorModel	TokenNameIdentifier
imgCompCM	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ComponentColorModel	TokenNameIdentifier
(	TokenNameLPAREN
imgCS	TokenNameIdentifier
,	TokenNameCOMMA
imgCM	TokenNameIdentifier
.	TokenNameDOT
getComponentSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
imgCM	TokenNameIdentifier
.	TokenNameDOT
hasAlpha	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
imgCM	TokenNameIdentifier
.	TokenNameDOT
getTransparency	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_BYTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
WritableRaster	TokenNameIdentifier
wr	TokenNameIdentifier
=	TokenNameEQUAL
Raster	TokenNameIdentifier
.	TokenNameDOT
createBandedRaster	TokenNameIdentifier
(	TokenNameLPAREN
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_BYTE	TokenNameIdentifier
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
imgCompCM	TokenNameIdentifier
.	TokenNameDOT
getNumComponents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Point	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedImage	TokenNameIdentifier
imgComp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
imgCompCM	TokenNameIdentifier
,	TokenNameCOMMA
wr	TokenNameIdentifier
,	TokenNameCOMMA
imgCompCM	TokenNameIdentifier
.	TokenNameDOT
isAlphaPremultiplied	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedImage	TokenNameIdentifier
srcImg	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
imgCM	TokenNameIdentifier
,	TokenNameCOMMA
srcWR	TokenNameIdentifier
.	TokenNameDOT
createWritableTranslatedChild	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
imgCM	TokenNameIdentifier
.	TokenNameDOT
isAlphaPremultiplied	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Graphics2D	TokenNameIdentifier
g	TokenNameIdentifier
=	TokenNameEQUAL
imgComp	TokenNameIdentifier
.	TokenNameDOT
createGraphics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
setRenderingHint	TokenNameIdentifier
(	TokenNameLPAREN
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
KEY_COLOR_RENDERING	TokenNameIdentifier
,	TokenNameCOMMA
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
VALUE_COLOR_RENDER_QUALITY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
drawImage	TokenNameIdentifier
(	TokenNameLPAREN
srcImg	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
img	TokenNameIdentifier
=	TokenNameEQUAL
imgComp	TokenNameIdentifier
;	TokenNameSEMICOLON
imgCM	TokenNameIdentifier
=	TokenNameEQUAL
imgCompCM	TokenNameIdentifier
;	TokenNameSEMICOLON
srcWR	TokenNameIdentifier
=	TokenNameEQUAL
wr	TokenNameIdentifier
.	TokenNameDOT
createWritableTranslatedChild	TokenNameIdentifier
(	TokenNameLPAREN
minX	TokenNameIdentifier
,	TokenNameCOMMA
minY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ComponentColorModel	TokenNameIdentifier
newCM	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ComponentColorModel	TokenNameIdentifier
(	TokenNameLPAREN
colorSpace	TokenNameIdentifier
,	TokenNameCOMMA
imgCM	TokenNameIdentifier
.	TokenNameDOT
getComponentSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
Transparency	TokenNameIdentifier
.	TokenNameDOT
OPAQUE	TokenNameIdentifier
,	TokenNameCOMMA
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_BYTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataBufferByte	TokenNameIdentifier
data	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DataBufferByte	TokenNameIdentifier
)	TokenNameRPAREN
srcWR	TokenNameIdentifier
.	TokenNameDOT
getDataBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
srcWR	TokenNameIdentifier
=	TokenNameEQUAL
Raster	TokenNameIdentifier
.	TokenNameDOT
createBandedRaster	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
new	TokenNamenew
Point	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedImage	TokenNameIdentifier
newImg	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
newCM	TokenNameIdentifier
,	TokenNameCOMMA
srcWR	TokenNameIdentifier
,	TokenNameCOMMA
newCM	TokenNameIdentifier
.	TokenNameDOT
isAlphaPremultiplied	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ComponentColorModel	TokenNameIdentifier
sRGBCompCM	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ComponentColorModel	TokenNameIdentifier
(	TokenNameLPAREN
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
CS_sRGB	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
8	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
Transparency	TokenNameIdentifier
.	TokenNameDOT
OPAQUE	TokenNameIdentifier
,	TokenNameCOMMA
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_BYTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
WritableRaster	TokenNameIdentifier
wr	TokenNameIdentifier
=	TokenNameEQUAL
Raster	TokenNameIdentifier
.	TokenNameDOT
createBandedRaster	TokenNameIdentifier
(	TokenNameLPAREN
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_BYTE	TokenNameIdentifier
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
sRGBCompCM	TokenNameIdentifier
.	TokenNameDOT
getNumComponents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Point	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedImage	TokenNameIdentifier
sRGBImage	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
sRGBCompCM	TokenNameIdentifier
,	TokenNameCOMMA
wr	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColorConvertOp	TokenNameIdentifier
colorConvertOp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColorConvertOp	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
colorConvertOp	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
(	TokenNameLPAREN
newImg	TokenNameIdentifier
,	TokenNameCOMMA
sRGBImage	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
imgCM	TokenNameIdentifier
.	TokenNameDOT
hasAlpha	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
DataBufferByte	TokenNameIdentifier
rgbData	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DataBufferByte	TokenNameIdentifier
)	TokenNameRPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getDataBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
imgBanks	TokenNameIdentifier
=	TokenNameEQUAL
data	TokenNameIdentifier
.	TokenNameDOT
getBankData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
rgbBanks	TokenNameIdentifier
=	TokenNameEQUAL
rgbData	TokenNameIdentifier
.	TokenNameDOT
getBankData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
argbBanks	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
rgbBanks	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
rgbBanks	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
rgbBanks	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
imgBanks	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
}	TokenNameRBRACE
;	TokenNameSEMICOLON
DataBufferByte	TokenNameIdentifier
argbData	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataBufferByte	TokenNameIdentifier
(	TokenNameLPAREN
argbBanks	TokenNameIdentifier
,	TokenNameCOMMA
imgBanks	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
srcWR	TokenNameIdentifier
=	TokenNameEQUAL
Raster	TokenNameIdentifier
.	TokenNameDOT
createBandedRaster	TokenNameIdentifier
(	TokenNameLPAREN
argbData	TokenNameIdentifier
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
new	TokenNamenew
Point	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sRGBCompCM	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ComponentColorModel	TokenNameIdentifier
(	TokenNameLPAREN
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
CS_sRGB	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
8	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
Transparency	TokenNameIdentifier
.	TokenNameDOT
TRANSLUCENT	TokenNameIdentifier
,	TokenNameCOMMA
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_BYTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sRGBImage	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
sRGBCompCM	TokenNameIdentifier
,	TokenNameCOMMA
srcWR	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
BufferedImage	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
sRGBCM	TokenNameIdentifier
,	TokenNameCOMMA
argbWR	TokenNameIdentifier
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
Graphics2D	TokenNameIdentifier
g	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
.	TokenNameDOT
createGraphics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
setRenderingHint	TokenNameIdentifier
(	TokenNameLPAREN
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
KEY_COLOR_RENDERING	TokenNameIdentifier
,	TokenNameCOMMA
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
VALUE_COLOR_RENDER_QUALITY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
drawImage	TokenNameIdentifier
(	TokenNameLPAREN
sRGBImage	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
dispose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
argbWR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
Error	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
