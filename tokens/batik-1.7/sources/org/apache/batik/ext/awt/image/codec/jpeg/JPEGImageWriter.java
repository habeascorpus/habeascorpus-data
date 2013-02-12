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
jpeg	TokenNameIdentifier
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
RenderedImage	TokenNameIdentifier
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
spi	TokenNameIdentifier
.	TokenNameDOT
ImageWriter	TokenNameIdentifier
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
spi	TokenNameIdentifier
.	TokenNameDOT
ImageWriterParams	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
sun	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
.	TokenNameDOT
jpeg	TokenNameIdentifier
.	TokenNameDOT
JPEGCodec	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
sun	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
.	TokenNameDOT
jpeg	TokenNameIdentifier
.	TokenNameDOT
JPEGEncodeParam	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
sun	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
.	TokenNameDOT
jpeg	TokenNameIdentifier
.	TokenNameDOT
JPEGImageEncoder	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JPEGImageWriter	TokenNameIdentifier
implements	TokenNameimplements
ImageWriter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
writeImage	TokenNameIdentifier
(	TokenNameLPAREN
RenderedImage	TokenNameIdentifier
image	TokenNameIdentifier
,	TokenNameCOMMA
OutputStream	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
writeImage	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
writeImage	TokenNameIdentifier
(	TokenNameLPAREN
RenderedImage	TokenNameIdentifier
image	TokenNameIdentifier
,	TokenNameCOMMA
OutputStream	TokenNameIdentifier
out	TokenNameIdentifier
,	TokenNameCOMMA
ImageWriterParams	TokenNameIdentifier
params	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
BufferedImage	TokenNameIdentifier
bi	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
image	TokenNameIdentifier
instanceof	TokenNameinstanceof
BufferedImage	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
bi	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
BufferedImage	TokenNameIdentifier
)	TokenNameRPAREN
image	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
bi	TokenNameIdentifier
=	TokenNameEQUAL
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
makeLinearBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
image	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
JPEGImageEncoder	TokenNameIdentifier
encoder	TokenNameIdentifier
=	TokenNameEQUAL
JPEGCodec	TokenNameIdentifier
.	TokenNameDOT
createJPEGEncoder	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
params	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
JPEGEncodeParam	TokenNameIdentifier
param	TokenNameIdentifier
=	TokenNameEQUAL
encoder	TokenNameIdentifier
.	TokenNameDOT
getDefaultJPEGEncodeParam	TokenNameIdentifier
(	TokenNameLPAREN
bi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
params	TokenNameIdentifier
.	TokenNameDOT
getJPEGQuality	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
param	TokenNameIdentifier
.	TokenNameDOT
setQuality	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
.	TokenNameDOT
getJPEGQuality	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
floatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
params	TokenNameIdentifier
.	TokenNameDOT
getJPEGForceBaseline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
booleanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
encoder	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
bi	TokenNameIdentifier
,	TokenNameCOMMA
param	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
encoder	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
bi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getMIMEType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"image/jpeg"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
