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
Image	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Element	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
ImageHandler	TokenNameIdentifier
extends	TokenNameextends
SVGSyntax	TokenNameIdentifier
{	TokenNameLBRACE
void	TokenNamevoid
handleImage	TokenNameIdentifier
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
;	TokenNameSEMICOLON
void	TokenNamevoid
handleImage	TokenNameIdentifier
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
;	TokenNameSEMICOLON
void	TokenNamevoid
handleImage	TokenNameIdentifier
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
;	TokenNameSEMICOLON
}	TokenNameRBRACE