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
codec	TokenNameIdentifier
.	TokenNameDOT
tiff	TokenNameIdentifier
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
DataBuffer	TokenNameIdentifier
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
RenderedImage	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
OutputStream	TokenNameIdentifier
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
rendered	TokenNameIdentifier
.	TokenNameDOT
FormatRed	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
transcoder	TokenNameIdentifier
.	TokenNameDOT
TranscoderException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
transcoder	TokenNameIdentifier
.	TokenNameDOT
TranscoderOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
transcoder	TokenNameIdentifier
.	TokenNameDOT
TranscodingHints	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
transcoder	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
TIFFTranscoder	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TIFFTranscoderInternalCodecWriteAdapter	TokenNameIdentifier
implements	TokenNameimplements
TIFFTranscoder	TokenNameIdentifier
.	TokenNameDOT
WriteAdapter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
writeImage	TokenNameIdentifier
(	TokenNameLPAREN
TIFFTranscoder	TokenNameIdentifier
transcoder	TokenNameIdentifier
,	TokenNameCOMMA
BufferedImage	TokenNameIdentifier
img	TokenNameIdentifier
,	TokenNameCOMMA
TranscoderOutput	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TranscoderException	TokenNameIdentifier
{	TokenNameLBRACE
TranscodingHints	TokenNameIdentifier
hints	TokenNameIdentifier
=	TokenNameEQUAL
transcoder	TokenNameIdentifier
.	TokenNameDOT
getTranscodingHints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TIFFEncodeParam	TokenNameIdentifier
params	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TIFFEncodeParam	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
PixSzMM	TokenNameIdentifier
=	TokenNameEQUAL
transcoder	TokenNameIdentifier
.	TokenNameDOT
getUserAgent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getPixelUnitToMillimeter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
numPix	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
1000	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
/	TokenNameDIVIDE
PixSzMM	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
0.5	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
denom	TokenNameIdentifier
=	TokenNameEQUAL
100	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
rational	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
numPix	TokenNameIdentifier
,	TokenNameCOMMA
denom	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
TIFFField	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
new	TokenNamenew
TIFFField	TokenNameIdentifier
(	TokenNameLPAREN
TIFFImageDecoder	TokenNameIdentifier
.	TokenNameDOT
TIFF_RESOLUTION_UNIT	TokenNameIdentifier
,	TokenNameCOMMA
TIFFField	TokenNameIdentifier
.	TokenNameDOT
TIFF_SHORT	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
3	TokenNameIntegerLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
TIFFField	TokenNameIdentifier
(	TokenNameLPAREN
TIFFImageDecoder	TokenNameIdentifier
.	TokenNameDOT
TIFF_X_RESOLUTION	TokenNameIdentifier
,	TokenNameCOMMA
TIFFField	TokenNameIdentifier
.	TokenNameDOT
TIFF_RATIONAL	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
new	TokenNamenew
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
rational	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
TIFFField	TokenNameIdentifier
(	TokenNameLPAREN
TIFFImageDecoder	TokenNameIdentifier
.	TokenNameDOT
TIFF_Y_RESOLUTION	TokenNameIdentifier
,	TokenNameCOMMA
TIFFField	TokenNameIdentifier
.	TokenNameDOT
TIFF_RATIONAL	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
new	TokenNamenew
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
rational	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
}	TokenNameRBRACE
;	TokenNameSEMICOLON
params	TokenNameIdentifier
.	TokenNameDOT
setExtraFields	TokenNameIdentifier
(	TokenNameLPAREN
fields	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
TIFFTranscoder	TokenNameIdentifier
.	TokenNameDOT
KEY_COMPRESSION_METHOD	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
method	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
TIFFTranscoder	TokenNameIdentifier
.	TokenNameDOT
KEY_COMPRESSION_METHOD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
"packbits"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
method	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
params	TokenNameIdentifier
.	TokenNameDOT
setCompression	TokenNameIdentifier
(	TokenNameLPAREN
TIFFEncodeParam	TokenNameIdentifier
.	TokenNameDOT
COMPRESSION_PACKBITS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
"deflate"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
method	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
params	TokenNameIdentifier
.	TokenNameDOT
setCompression	TokenNameIdentifier
(	TokenNameLPAREN
TIFFEncodeParam	TokenNameIdentifier
.	TokenNameDOT
COMPRESSION_DEFLATE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
w	TokenNameIdentifier
=	TokenNameEQUAL
img	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
h	TokenNameIdentifier
=	TokenNameEQUAL
img	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SinglePixelPackedSampleModel	TokenNameIdentifier
sppsm	TokenNameIdentifier
;	TokenNameSEMICOLON
sppsm	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SinglePixelPackedSampleModel	TokenNameIdentifier
)	TokenNameRPAREN
img	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
OutputStream	TokenNameIdentifier
ostream	TokenNameIdentifier
=	TokenNameEQUAL
output	TokenNameIdentifier
.	TokenNameDOT
getOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TIFFImageEncoder	TokenNameIdentifier
tiffEncoder	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TIFFImageEncoder	TokenNameIdentifier
(	TokenNameLPAREN
ostream	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
bands	TokenNameIdentifier
=	TokenNameEQUAL
sppsm	TokenNameIdentifier
.	TokenNameDOT
getNumBands	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
off	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
bands	TokenNameIdentifier
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
bands	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
off	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
SampleModel	TokenNameIdentifier
sm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PixelInterleavedSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
DataBuffer	TokenNameIdentifier
.	TokenNameDOT
TYPE_BYTE	TokenNameIdentifier
,	TokenNameCOMMA
w	TokenNameIdentifier
,	TokenNameCOMMA
h	TokenNameIdentifier
,	TokenNameCOMMA
bands	TokenNameIdentifier
,	TokenNameCOMMA
w	TokenNameIdentifier
*	TokenNameMULTIPLY
bands	TokenNameIdentifier
,	TokenNameCOMMA
off	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
RenderedImage	TokenNameIdentifier
rimg	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FormatRed	TokenNameIdentifier
(	TokenNameLPAREN
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
img	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
sm	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tiffEncoder	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
rimg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ostream	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
TranscoderException	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE