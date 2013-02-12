package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
svggen	TokenNameIdentifier
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
awt	TokenNameIdentifier
.	TokenNameDOT
Graphics2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Image	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
AffineTransform	TokenNameIdentifier
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
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
RenderableImage	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ByteArrayOutputStream	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Method	TokenNameIdentifier
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
abstract	TokenNameabstract
class	TokenNameclass
DefaultCachedImageHandler	TokenNameIdentifier
implements	TokenNameimplements
CachedImageHandler	TokenNameIdentifier
,	TokenNameCOMMA
SVGSyntax	TokenNameIdentifier
,	TokenNameCOMMA
ErrorConstants	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
XLINK_NAMESPACE_URI	TokenNameIdentifier
=	TokenNameEQUAL
"http://www.w3.org/1999/xlink"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
AffineTransform	TokenNameIdentifier
IDENTITY	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Method	TokenNameIdentifier
createGraphics	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
boolean	TokenNameboolean
initDone	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Class	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
paramc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Class	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
BufferedImage	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
paramo	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
ImageCacher	TokenNameIdentifier
imageCacher	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ImageCacher	TokenNameIdentifier
getImageCacher	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
imageCacher	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setImageCacher	TokenNameIdentifier
(	TokenNameLPAREN
ImageCacher	TokenNameIdentifier
imageCacher	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
imageCacher	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
DOMTreeManager	TokenNameIdentifier
dtm	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
imageCacher	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
dtm	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
imageCacher	TokenNameIdentifier
.	TokenNameDOT
getDOMTreeManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
imageCacher	TokenNameIdentifier
=	TokenNameEQUAL
imageCacher	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dtm	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
imageCacher	TokenNameIdentifier
.	TokenNameDOT
setDOMTreeManager	TokenNameIdentifier
(	TokenNameLPAREN
dtm	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDOMTreeManager	TokenNameIdentifier
(	TokenNameLPAREN
DOMTreeManager	TokenNameIdentifier
domTreeManager	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
imageCacher	TokenNameIdentifier
.	TokenNameDOT
setDOMTreeManager	TokenNameIdentifier
(	TokenNameLPAREN
domTreeManager	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
Graphics2D	TokenNameIdentifier
createGraphics	TokenNameIdentifier
(	TokenNameLPAREN
BufferedImage	TokenNameIdentifier
buf	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
initDone	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
clazz	TokenNameIdentifier
=	TokenNameEQUAL
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.batik.ext.awt.image.GraphicsUtil"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
createGraphics	TokenNameIdentifier
=	TokenNameEQUAL
clazz	TokenNameIdentifier
.	TokenNameDOT
getMethod	TokenNameIdentifier
(	TokenNameLPAREN
"createGraphics"	TokenNameStringLiteral
,	TokenNameCOMMA
paramc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
paramo	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
initDone	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
createGraphics	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
buf	TokenNameIdentifier
.	TokenNameDOT
createGraphics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
paramo	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
buf	TokenNameIdentifier
;	TokenNameSEMICOLON
Graphics2D	TokenNameIdentifier
g2d	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
g2d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Graphics2D	TokenNameIdentifier
)	TokenNameRPAREN
createGraphics	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
paramo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
return	TokenNamereturn
g2d	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
createElement	TokenNameIdentifier
(	TokenNameLPAREN
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
imageElement	TokenNameIdentifier
=	TokenNameEQUAL
generatorContext	TokenNameIdentifier
.	TokenNameDOT
getDOMFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createElementNS	TokenNameIdentifier
(	TokenNameLPAREN
SVG_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
SVG_IMAGE_TAG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
imageElement	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AffineTransform	TokenNameIdentifier
handleImage	TokenNameIdentifier
(	TokenNameLPAREN
Image	TokenNameIdentifier
image	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
x	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
y	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
width	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
height	TokenNameIdentifier
,	TokenNameCOMMA
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
imageWidth	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
imageHeight	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
af	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
imageWidth	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
imageHeight	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
width	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
height	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
handleEmptyImage	TokenNameIdentifier
(	TokenNameLPAREN
imageElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
handleHREF	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
,	TokenNameCOMMA
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SVGGraphics2DIOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
generatorContext	TokenNameIdentifier
.	TokenNameDOT
errorHandler	TokenNameIdentifier
.	TokenNameDOT
handleError	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SVGGraphics2DIOException	TokenNameIdentifier
io	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
SVGGraphics2DRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
io	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
af	TokenNameIdentifier
=	TokenNameEQUAL
handleTransform	TokenNameIdentifier
(	TokenNameLPAREN
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
,	TokenNameCOMMA
imageWidth	TokenNameIdentifier
,	TokenNameCOMMA
imageHeight	TokenNameIdentifier
,	TokenNameCOMMA
width	TokenNameIdentifier
,	TokenNameCOMMA
height	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
af	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AffineTransform	TokenNameIdentifier
handleImage	TokenNameIdentifier
(	TokenNameLPAREN
RenderedImage	TokenNameIdentifier
image	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
x	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
y	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
width	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
height	TokenNameIdentifier
,	TokenNameCOMMA
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
imageWidth	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
imageHeight	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
af	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
imageWidth	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
imageHeight	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
width	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
height	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
handleEmptyImage	TokenNameIdentifier
(	TokenNameLPAREN
imageElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
handleHREF	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
,	TokenNameCOMMA
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SVGGraphics2DIOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
generatorContext	TokenNameIdentifier
.	TokenNameDOT
errorHandler	TokenNameIdentifier
.	TokenNameDOT
handleError	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SVGGraphics2DIOException	TokenNameIdentifier
io	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
SVGGraphics2DRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
io	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
af	TokenNameIdentifier
=	TokenNameEQUAL
handleTransform	TokenNameIdentifier
(	TokenNameLPAREN
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
,	TokenNameCOMMA
imageWidth	TokenNameIdentifier
,	TokenNameCOMMA
imageHeight	TokenNameIdentifier
,	TokenNameCOMMA
width	TokenNameIdentifier
,	TokenNameCOMMA
height	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
af	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AffineTransform	TokenNameIdentifier
handleImage	TokenNameIdentifier
(	TokenNameLPAREN
RenderableImage	TokenNameIdentifier
image	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
x	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
y	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
width	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
height	TokenNameIdentifier
,	TokenNameCOMMA
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
imageWidth	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
imageHeight	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
af	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
imageWidth	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
imageHeight	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
width	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
height	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
handleEmptyImage	TokenNameIdentifier
(	TokenNameLPAREN
imageElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
handleHREF	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
,	TokenNameCOMMA
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SVGGraphics2DIOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
generatorContext	TokenNameIdentifier
.	TokenNameDOT
errorHandler	TokenNameIdentifier
.	TokenNameDOT
handleError	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SVGGraphics2DIOException	TokenNameIdentifier
io	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
SVGGraphics2DRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
io	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
af	TokenNameIdentifier
=	TokenNameEQUAL
handleTransform	TokenNameIdentifier
(	TokenNameLPAREN
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
,	TokenNameCOMMA
imageWidth	TokenNameIdentifier
,	TokenNameCOMMA
imageHeight	TokenNameIdentifier
,	TokenNameCOMMA
width	TokenNameIdentifier
,	TokenNameCOMMA
height	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
af	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
AffineTransform	TokenNameIdentifier
handleTransform	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
x	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
y	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
srcWidth	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
srcHeight	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
dstWidth	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
dstHeight	TokenNameIdentifier
,	TokenNameCOMMA
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
imageElement	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_X_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
.	TokenNameDOT
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
imageElement	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_Y_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
.	TokenNameDOT
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
y	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
imageElement	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
.	TokenNameDOT
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
dstWidth	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
imageElement	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
.	TokenNameDOT
doubleString	TokenNameIdentifier
(	TokenNameLPAREN
dstHeight	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
handleEmptyImage	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
imageElement	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
imageElement	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
XLINK_HREF_QNAME	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
imageElement	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
"0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
imageElement	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier
,	TokenNameCOMMA
"0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
handleHREF	TokenNameIdentifier
(	TokenNameLPAREN
Image	TokenNameIdentifier
image	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SVGGraphics2DIOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
image	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
SVGGraphics2DRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
ERR_IMAGE_NULL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
width	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
height	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
width	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
height	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
handleEmptyImage	TokenNameIdentifier
(	TokenNameLPAREN
imageElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
image	TokenNameIdentifier
instanceof	TokenNameinstanceof
RenderedImage	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
handleHREF	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
RenderedImage	TokenNameIdentifier
)	TokenNameRPAREN
image	TokenNameIdentifier
,	TokenNameCOMMA
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
BufferedImage	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
buildBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Dimension	TokenNameIdentifier
(	TokenNameLPAREN
width	TokenNameIdentifier
,	TokenNameCOMMA
height	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Graphics2D	TokenNameIdentifier
g	TokenNameIdentifier
=	TokenNameEQUAL
createGraphics	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
drawImage	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
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
handleHREF	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
RenderedImage	TokenNameIdentifier
)	TokenNameRPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
BufferedImage	TokenNameIdentifier
buildBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
Dimension	TokenNameIdentifier
size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
.	TokenNameDOT
width	TokenNameIdentifier
,	TokenNameCOMMA
size	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
,	TokenNameCOMMA
getBufferedImageType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
handleHREF	TokenNameIdentifier
(	TokenNameLPAREN
RenderedImage	TokenNameIdentifier
image	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SVGGraphics2DIOException	TokenNameIdentifier
{	TokenNameLBRACE
BufferedImage	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
image	TokenNameIdentifier
instanceof	TokenNameinstanceof
BufferedImage	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
(	TokenNameLPAREN
BufferedImage	TokenNameIdentifier
)	TokenNameRPAREN
image	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
getBufferedImageType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
buf	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
BufferedImage	TokenNameIdentifier
)	TokenNameRPAREN
image	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
Dimension	TokenNameIdentifier
size	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Dimension	TokenNameIdentifier
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
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
=	TokenNameEQUAL
buildBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Graphics2D	TokenNameIdentifier
g	TokenNameIdentifier
=	TokenNameEQUAL
createGraphics	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
drawRenderedImage	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
,	TokenNameCOMMA
IDENTITY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
dispose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
cacheBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
buf	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
handleHREF	TokenNameIdentifier
(	TokenNameLPAREN
RenderableImage	TokenNameIdentifier
image	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SVGGraphics2DIOException	TokenNameIdentifier
{	TokenNameLBRACE
Dimension	TokenNameIdentifier
size	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Dimension	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
ceil	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
ceil	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedImage	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
buildBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Graphics2D	TokenNameIdentifier
g	TokenNameIdentifier
=	TokenNameEQUAL
createGraphics	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
drawRenderableImage	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
,	TokenNameCOMMA
IDENTITY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
dispose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
handleHREF	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
RenderedImage	TokenNameIdentifier
)	TokenNameRPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
cacheBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
imageElement	TokenNameIdentifier
,	TokenNameCOMMA
BufferedImage	TokenNameIdentifier
buf	TokenNameIdentifier
,	TokenNameCOMMA
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SVGGraphics2DIOException	TokenNameIdentifier
{	TokenNameLBRACE
ByteArrayOutputStream	TokenNameIdentifier
os	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
SVGGraphics2DRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
ERR_CONTEXT_NULL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
os	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteArrayOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
encodeImage	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
os	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
os	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
os	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
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
SVGGraphics2DIOException	TokenNameIdentifier
(	TokenNameLPAREN
ERR_UNEXPECTED	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
ref	TokenNameIdentifier
=	TokenNameEQUAL
imageCacher	TokenNameIdentifier
.	TokenNameDOT
lookup	TokenNameIdentifier
(	TokenNameLPAREN
os	TokenNameIdentifier
,	TokenNameCOMMA
buf	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
buf	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
imageElement	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
XLINK_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
XLINK_HREF_QNAME	TokenNameIdentifier
,	TokenNameCOMMA
getRefPrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
ref	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
String	TokenNameIdentifier
getRefPrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
void	TokenNamevoid
encodeImage	TokenNameIdentifier
(	TokenNameLPAREN
BufferedImage	TokenNameIdentifier
buf	TokenNameIdentifier
,	TokenNameCOMMA
OutputStream	TokenNameIdentifier
os	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
int	TokenNameint
getBufferedImageType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE