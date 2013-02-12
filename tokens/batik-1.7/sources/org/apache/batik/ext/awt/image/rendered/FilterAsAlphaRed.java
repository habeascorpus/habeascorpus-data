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
PixelInterleavedSampleModel	TokenNameIdentifier
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
ColorSpaceHintKey	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FilterAsAlphaRed	TokenNameIdentifier
extends	TokenNameextends
AbstractRed	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
FilterAsAlphaRed	TokenNameIdentifier
(	TokenNameLPAREN
CachableRed	TokenNameIdentifier
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
new	TokenNamenew
Any2LumRed	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
ComponentColorModel	TokenNameIdentifier
(	TokenNameLPAREN
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
ColorSpace	TokenNameIdentifier
.	TokenNameDOT
CS_GRAY	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
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
,	TokenNameCOMMA
new	TokenNamenew
PixelInterleavedSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_BYTE	TokenNameIdentifier
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
}	TokenNameRBRACE
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
props	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ColorSpaceHintKey	TokenNameIdentifier
.	TokenNameDOT
PROPERTY_COLORSPACE	TokenNameIdentifier
,	TokenNameCOMMA
ColorSpaceHintKey	TokenNameIdentifier
.	TokenNameDOT
VALUE_COLORSPACE_ALPHA	TokenNameIdentifier
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
CachableRed	TokenNameIdentifier
srcRed	TokenNameIdentifier
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
SampleModel	TokenNameIdentifier
sm	TokenNameIdentifier
=	TokenNameEQUAL
srcRed	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sm	TokenNameIdentifier
.	TokenNameDOT
getNumBands	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
srcRed	TokenNameIdentifier
.	TokenNameDOT
copyData	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Raster	TokenNameIdentifier
srcRas	TokenNameIdentifier
=	TokenNameEQUAL
srcRed	TokenNameIdentifier
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
PixelInterleavedSampleModel	TokenNameIdentifier
srcSM	TokenNameIdentifier
;	TokenNameSEMICOLON
srcSM	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
PixelInterleavedSampleModel	TokenNameIdentifier
)	TokenNameRPAREN
srcRas	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataBufferByte	TokenNameIdentifier
srcDB	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DataBufferByte	TokenNameIdentifier
)	TokenNameRPAREN
srcRas	TokenNameIdentifier
.	TokenNameDOT
getDataBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
src	TokenNameIdentifier
=	TokenNameEQUAL
srcDB	TokenNameIdentifier
.	TokenNameDOT
getData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PixelInterleavedSampleModel	TokenNameIdentifier
dstSM	TokenNameIdentifier
;	TokenNameSEMICOLON
dstSM	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
PixelInterleavedSampleModel	TokenNameIdentifier
)	TokenNameRPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataBufferByte	TokenNameIdentifier
dstDB	TokenNameIdentifier
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
dst	TokenNameIdentifier
=	TokenNameEQUAL
dstDB	TokenNameIdentifier
.	TokenNameDOT
getData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
srcX0	TokenNameIdentifier
=	TokenNameEQUAL
srcRas	TokenNameIdentifier
.	TokenNameDOT
getMinX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
srcRas	TokenNameIdentifier
.	TokenNameDOT
getSampleModelTranslateX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
srcY0	TokenNameIdentifier
=	TokenNameEQUAL
srcRas	TokenNameIdentifier
.	TokenNameDOT
getMinY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
srcRas	TokenNameIdentifier
.	TokenNameDOT
getSampleModelTranslateY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
dstX0	TokenNameIdentifier
=	TokenNameEQUAL
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
;	TokenNameSEMICOLON
int	TokenNameint
dstX1	TokenNameIdentifier
=	TokenNameEQUAL
dstX0	TokenNameIdentifier
+	TokenNamePLUS
wr	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
dstY0	TokenNameIdentifier
=	TokenNameEQUAL
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
;	TokenNameSEMICOLON
int	TokenNameint
srcStep	TokenNameIdentifier
=	TokenNameEQUAL
srcSM	TokenNameIdentifier
.	TokenNameDOT
getPixelStride	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
offsets	TokenNameIdentifier
=	TokenNameEQUAL
srcSM	TokenNameIdentifier
.	TokenNameDOT
getBandOffsets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
srcLOff	TokenNameIdentifier
=	TokenNameEQUAL
offsets	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
srcAOff	TokenNameIdentifier
=	TokenNameEQUAL
offsets	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
srcRed	TokenNameIdentifier
.	TokenNameDOT
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isAlphaPremultiplied	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
y	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
y	TokenNameIdentifier
<	TokenNameLESS
srcRas	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
y	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
srcI	TokenNameIdentifier
=	TokenNameEQUAL
srcDB	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
srcSM	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
srcX0	TokenNameIdentifier
,	TokenNameCOMMA
srcY0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
dstI	TokenNameIdentifier
=	TokenNameEQUAL
dstDB	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
dstSM	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
dstX0	TokenNameIdentifier
,	TokenNameCOMMA
dstY0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
dstE	TokenNameIdentifier
=	TokenNameEQUAL
dstDB	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
dstSM	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
dstX1	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
dstY0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
srcI	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
srcLOff	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
dstI	TokenNameIdentifier
<	TokenNameLESS
dstE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
dst	TokenNameIdentifier
[	TokenNameLBRACKET
dstI	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
src	TokenNameIdentifier
[	TokenNameLBRACKET
srcI	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
srcI	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
srcStep	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
srcY0	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
dstY0	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
srcAOff	TokenNameIdentifier
=	TokenNameEQUAL
srcAOff	TokenNameIdentifier
-	TokenNameMINUS
srcLOff	TokenNameIdentifier
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
srcRas	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
y	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
srcI	TokenNameIdentifier
=	TokenNameEQUAL
srcDB	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
srcSM	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
srcX0	TokenNameIdentifier
,	TokenNameCOMMA
srcY0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
dstI	TokenNameIdentifier
=	TokenNameEQUAL
dstDB	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
dstSM	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
dstX0	TokenNameIdentifier
,	TokenNameCOMMA
dstY0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
dstE	TokenNameIdentifier
=	TokenNameEQUAL
dstDB	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
dstSM	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
dstX1	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
dstY0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
srcI	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
srcLOff	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
dstI	TokenNameIdentifier
<	TokenNameLESS
dstE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
sl	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
src	TokenNameIdentifier
[	TokenNameLBRACKET
srcI	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
sa	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
src	TokenNameIdentifier
[	TokenNameLBRACKET
srcI	TokenNameIdentifier
+	TokenNamePLUS
srcAOff	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
dst	TokenNameIdentifier
[	TokenNameLBRACKET
dstI	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
sl	TokenNameIdentifier
*	TokenNameMULTIPLY
sa	TokenNameIdentifier
+	TokenNamePLUS
0x80	TokenNameIntegerLiteral
)	TokenNameRPAREN
>>	TokenNameRIGHT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
srcI	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
srcStep	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
srcY0	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
dstY0	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
wr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE