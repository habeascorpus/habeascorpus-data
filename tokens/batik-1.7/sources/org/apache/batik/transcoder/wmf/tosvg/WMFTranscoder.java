package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
transcoder	TokenNameIdentifier
.	TokenNameDOT
wmf	TokenNameIdentifier
.	TokenNameDOT
tosvg	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Dimension	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileOutputStream	TokenNameIdentifier
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
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MalformedURLException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
svggen	TokenNameIdentifier
.	TokenNameDOT
SVGGraphics2D	TokenNameIdentifier
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
ToSVGAbstractTranscoder	TokenNameIdentifier
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
TranscoderInput	TokenNameIdentifier
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
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Element	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
WMFTranscoder	TokenNameIdentifier
extends	TokenNameextends
ToSVGAbstractTranscoder	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
WMFTranscoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
transcode	TokenNameIdentifier
(	TokenNameLPAREN
TranscoderInput	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
TranscoderOutput	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TranscoderException	TokenNameIdentifier
{	TokenNameLBRACE
DataInputStream	TokenNameIdentifier
is	TokenNameIdentifier
=	TokenNameEQUAL
getCompatibleInput	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
WMFRecordStore	TokenNameIdentifier
currentStore	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
WMFRecordStore	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
currentStore	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
handler	TokenNameIdentifier
.	TokenNameDOT
fatalError	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TranscoderException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
wmfwidth	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
wmfheight	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
conv	TokenNameIdentifier
=	TokenNameEQUAL
1.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
KEY_INPUT_WIDTH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
wmfwidth	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
KEY_INPUT_WIDTH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
wmfheight	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
KEY_INPUT_HEIGHT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
wmfwidth	TokenNameIdentifier
=	TokenNameEQUAL
currentStore	TokenNameIdentifier
.	TokenNameDOT
getWidthPixels	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
wmfheight	TokenNameIdentifier
=	TokenNameEQUAL
currentStore	TokenNameIdentifier
.	TokenNameDOT
getHeightPixels	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
width	TokenNameIdentifier
=	TokenNameEQUAL
wmfwidth	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
height	TokenNameIdentifier
=	TokenNameEQUAL
wmfheight	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
KEY_WIDTH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
width	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Float	TokenNameIdentifier
)	TokenNameRPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
KEY_WIDTH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
floatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
conv	TokenNameIdentifier
=	TokenNameEQUAL
width	TokenNameIdentifier
/	TokenNameDIVIDE
wmfwidth	TokenNameIdentifier
;	TokenNameSEMICOLON
height	TokenNameIdentifier
=	TokenNameEQUAL
height	TokenNameIdentifier
*	TokenNameMULTIPLY
width	TokenNameIdentifier
/	TokenNameDIVIDE
wmfwidth	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
xOffset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
yOffset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
KEY_XOFFSET	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
xOffset	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
KEY_XOFFSET	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
KEY_YOFFSET	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
yOffset	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
KEY_YOFFSET	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
sizeFactor	TokenNameIdentifier
=	TokenNameEQUAL
currentStore	TokenNameIdentifier
.	TokenNameDOT
getUnitsToPixels	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
conv	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
vpX	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
currentStore	TokenNameIdentifier
.	TokenNameDOT
getVpX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
sizeFactor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
vpY	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
currentStore	TokenNameIdentifier
.	TokenNameDOT
getVpY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
sizeFactor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
vpW	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
vpH	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
KEY_INPUT_WIDTH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
vpW	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
KEY_INPUT_WIDTH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
conv	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vpH	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
hints	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
KEY_INPUT_HEIGHT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
conv	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
vpW	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
currentStore	TokenNameIdentifier
.	TokenNameDOT
getWidthUnits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
sizeFactor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vpH	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
currentStore	TokenNameIdentifier
.	TokenNameDOT
getHeightUnits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
sizeFactor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
WMFPainter	TokenNameIdentifier
painter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
WMFPainter	TokenNameIdentifier
(	TokenNameLPAREN
currentStore	TokenNameIdentifier
,	TokenNameCOMMA
xOffset	TokenNameIdentifier
,	TokenNameCOMMA
yOffset	TokenNameIdentifier
,	TokenNameCOMMA
conv	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
createDocument	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgGenerator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGGraphics2D	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgGenerator	TokenNameIdentifier
.	TokenNameDOT
getGeneratorContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setPrecision	TokenNameIdentifier
(	TokenNameLPAREN
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
painter	TokenNameIdentifier
.	TokenNameDOT
paint	TokenNameIdentifier
(	TokenNameLPAREN
svgGenerator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgGenerator	TokenNameIdentifier
.	TokenNameDOT
setSVGCanvasSize	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Dimension	TokenNameIdentifier
(	TokenNameLPAREN
vpW	TokenNameIdentifier
,	TokenNameCOMMA
vpH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Element	TokenNameIdentifier
svgRoot	TokenNameIdentifier
=	TokenNameEQUAL
svgGenerator	TokenNameIdentifier
.	TokenNameDOT
getRoot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
svgRoot	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_VIEW_BOX_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
vpX	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
' '	TokenNameCharacterLiteral
+	TokenNamePLUS
vpY	TokenNameIdentifier
+	TokenNamePLUS
' '	TokenNameCharacterLiteral
+	TokenNamePLUS
vpW	TokenNameIdentifier
+	TokenNamePLUS
' '	TokenNameCharacterLiteral
+	TokenNamePLUS
vpH	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writeSVGToOutput	TokenNameIdentifier
(	TokenNameLPAREN
svgGenerator	TokenNameIdentifier
,	TokenNameCOMMA
svgRoot	TokenNameIdentifier
,	TokenNameCOMMA
output	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
DataInputStream	TokenNameIdentifier
getCompatibleInput	TokenNameIdentifier
(	TokenNameLPAREN
TranscoderInput	TokenNameIdentifier
input	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TranscoderException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
input	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
handler	TokenNameIdentifier
.	TokenNameDOT
fatalError	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TranscoderException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
ERROR_NULL_INPUT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
InputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
getInputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
in	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
DataInputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
BufferedInputStream	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
uri	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
getURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
uri	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
URL	TokenNameIdentifier
url	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
URL	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
in	TokenNameIdentifier
=	TokenNameEQUAL
url	TokenNameIdentifier
.	TokenNameDOT
openStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
DataInputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
BufferedInputStream	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
MalformedURLException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
handler	TokenNameIdentifier
.	TokenNameDOT
fatalError	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TranscoderException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
handler	TokenNameIdentifier
.	TokenNameDOT
fatalError	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TranscoderException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
handler	TokenNameIdentifier
.	TokenNameDOT
fatalError	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TranscoderException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
ERROR_INCOMPATIBLE_INPUT_TYPE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
WMF_EXTENSION	TokenNameIdentifier
=	TokenNameEQUAL
".wmf"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
SVG_EXTENSION	TokenNameIdentifier
=	TokenNameEQUAL
".svg"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TranscoderException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Usage : WMFTranscoder.main <file 1> ... <file n>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
exit	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
WMFTranscoder	TokenNameIdentifier
transcoder	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
WMFTranscoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
nFiles	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
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
nFiles	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
fileName	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
fileName	TokenNameIdentifier
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
WMF_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
args	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
" does not have the "	TokenNameStringLiteral
+	TokenNamePLUS
WMF_EXTENSION	TokenNameIdentifier
+	TokenNamePLUS
" extension. It is ignored"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
"Processing : "	TokenNameStringLiteral
+	TokenNamePLUS
args	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
"..."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
outputFileName	TokenNameIdentifier
=	TokenNameEQUAL
fileName	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
fileName	TokenNameIdentifier
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
WMF_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
SVG_EXTENSION	TokenNameIdentifier
;	TokenNameSEMICOLON
File	TokenNameIdentifier
inputFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
fileName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
outputFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
outputFileName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
TranscoderInput	TokenNameIdentifier
input	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TranscoderInput	TokenNameIdentifier
(	TokenNameLPAREN
inputFile	TokenNameIdentifier
.	TokenNameDOT
toURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TranscoderOutput	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TranscoderOutput	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
outputFile	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transcoder	TokenNameIdentifier
.	TokenNameDOT
transcode	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
,	TokenNameCOMMA
output	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
MalformedURLException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
TranscoderException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
TranscoderException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
".... Done"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
System	TokenNameIdentifier
.	TokenNameDOT
exit	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
