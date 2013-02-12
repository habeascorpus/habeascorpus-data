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
util	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
SingleTileRenderedImage	TokenNameIdentifier
extends	TokenNameextends
SimpleRenderedImage	TokenNameIdentifier
{	TokenNameLBRACE
Raster	TokenNameIdentifier
ras	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SingleTileRenderedImage	TokenNameIdentifier
(	TokenNameLPAREN
Raster	TokenNameIdentifier
ras	TokenNameIdentifier
,	TokenNameCOMMA
ColorModel	TokenNameIdentifier
colorModel	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
ras	TokenNameIdentifier
=	TokenNameEQUAL
ras	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
tileGridXOffset	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
minX	TokenNameIdentifier
=	TokenNameEQUAL
ras	TokenNameIdentifier
.	TokenNameDOT
getMinX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
tileGridYOffset	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
minY	TokenNameIdentifier
=	TokenNameEQUAL
ras	TokenNameIdentifier
.	TokenNameDOT
getMinY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
tileWidth	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
width	TokenNameIdentifier
=	TokenNameEQUAL
ras	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
tileHeight	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
height	TokenNameIdentifier
=	TokenNameEQUAL
ras	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
sampleModel	TokenNameIdentifier
=	TokenNameEQUAL
ras	TokenNameIdentifier
.	TokenNameDOT
getSampleModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
colorModel	TokenNameIdentifier
=	TokenNameEQUAL
colorModel	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Raster	TokenNameIdentifier
getTile	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
tileX	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
tileY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tileX	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
tileY	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
PropertyUtil	TokenNameIdentifier
.	TokenNameDOT
getString	TokenNameIdentifier
(	TokenNameLPAREN
"SingleTileRenderedImage0"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ras	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
