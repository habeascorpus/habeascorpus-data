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
Color	TokenNameIdentifier
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
Paint	TokenNameIdentifier
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
Rectangle	TokenNameIdentifier
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
ColorModel	TokenNameIdentifier
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
image	TokenNameIdentifier
.	TokenNameDOT
GraphicsUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FloodRed	TokenNameIdentifier
extends	TokenNameextends
AbstractRed	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
WritableRaster	TokenNameIdentifier
raster	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FloodRed	TokenNameIdentifier
(	TokenNameLPAREN
Rectangle	TokenNameIdentifier
bounds	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
bounds	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Color	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FloodRed	TokenNameIdentifier
(	TokenNameLPAREN
Rectangle	TokenNameIdentifier
bounds	TokenNameIdentifier
,	TokenNameCOMMA
Paint	TokenNameIdentifier
paint	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColorModel	TokenNameIdentifier
cm	TokenNameIdentifier
=	TokenNameEQUAL
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
sRGB_Unpre	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
defSz	TokenNameIdentifier
=	TokenNameEQUAL
AbstractTiledRed	TokenNameIdentifier
.	TokenNameDOT
getDefaultTileSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
tw	TokenNameIdentifier
=	TokenNameEQUAL
bounds	TokenNameIdentifier
.	TokenNameDOT
width	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tw	TokenNameIdentifier
>	TokenNameGREATER
defSz	TokenNameIdentifier
)	TokenNameRPAREN
tw	TokenNameIdentifier
=	TokenNameEQUAL
defSz	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
th	TokenNameIdentifier
=	TokenNameEQUAL
bounds	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
th	TokenNameIdentifier
>	TokenNameGREATER
defSz	TokenNameIdentifier
)	TokenNameRPAREN
th	TokenNameIdentifier
=	TokenNameEQUAL
defSz	TokenNameIdentifier
;	TokenNameSEMICOLON
SampleModel	TokenNameIdentifier
sm	TokenNameIdentifier
=	TokenNameEQUAL
cm	TokenNameIdentifier
.	TokenNameDOT
createCompatibleSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
tw	TokenNameIdentifier
,	TokenNameCOMMA
th	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
init	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
CachableRed	TokenNameIdentifier
)	TokenNameRPAREN
null	TokenNamenull
,	TokenNameCOMMA
bounds	TokenNameIdentifier
,	TokenNameCOMMA
cm	TokenNameIdentifier
,	TokenNameCOMMA
sm	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
raster	TokenNameIdentifier
=	TokenNameEQUAL
Raster	TokenNameIdentifier
.	TokenNameDOT
createWritableRaster	TokenNameIdentifier
(	TokenNameLPAREN
sm	TokenNameIdentifier
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
offScreen	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
cm	TokenNameIdentifier
,	TokenNameCOMMA
raster	TokenNameIdentifier
,	TokenNameCOMMA
cm	TokenNameIdentifier
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
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
createGraphics	TokenNameIdentifier
(	TokenNameLPAREN
offScreen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
setPaint	TokenNameIdentifier
(	TokenNameLPAREN
paint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
fillRect	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
bounds	TokenNameIdentifier
.	TokenNameDOT
width	TokenNameIdentifier
,	TokenNameCOMMA
bounds	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
dispose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Raster	TokenNameIdentifier
getTile	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
tx	TokenNameIdentifier
=	TokenNameEQUAL
tileGridXOff	TokenNameIdentifier
+	TokenNamePLUS
x	TokenNameIdentifier
*	TokenNameMULTIPLY
tileWidth	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
ty	TokenNameIdentifier
=	TokenNameEQUAL
tileGridYOff	TokenNameIdentifier
+	TokenNamePLUS
y	TokenNameIdentifier
*	TokenNameMULTIPLY
tileHeight	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
raster	TokenNameIdentifier
.	TokenNameDOT
createTranslatedChild	TokenNameIdentifier
(	TokenNameLPAREN
tx	TokenNameIdentifier
,	TokenNameCOMMA
ty	TokenNameIdentifier
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
int	TokenNameint
tx0	TokenNameIdentifier
=	TokenNameEQUAL
getXTile	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getMinX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
ty0	TokenNameIdentifier
=	TokenNameEQUAL
getYTile	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getMinY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
tx1	TokenNameIdentifier
=	TokenNameEQUAL
getXTile	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getMinX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
wr	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
ty1	TokenNameIdentifier
=	TokenNameEQUAL
getYTile	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
.	TokenNameDOT
getMinY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
wr	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
boolean	TokenNameboolean
is_INT_PACK	TokenNameIdentifier
=	TokenNameEQUAL
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
is_INT_PACK_Data	TokenNameIdentifier
(	TokenNameLPAREN
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
y	TokenNameIdentifier
=	TokenNameEQUAL
ty0	TokenNameIdentifier
;	TokenNameSEMICOLON
y	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
ty1	TokenNameIdentifier
;	TokenNameSEMICOLON
y	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
=	TokenNameEQUAL
tx0	TokenNameIdentifier
;	TokenNameSEMICOLON
x	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
tx1	TokenNameIdentifier
;	TokenNameSEMICOLON
x	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Raster	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
getTile	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
is_INT_PACK	TokenNameIdentifier
)	TokenNameRPAREN
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
copyData_INT_PACK	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
,	TokenNameCOMMA
wr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
copyData_FALLBACK	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
,	TokenNameCOMMA
wr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
wr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
