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
renderable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Shape	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
Rectangle2D	TokenNameIdentifier
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
public	TokenNamepublic
interface	TokenNameinterface
Filter	TokenNameIdentifier
extends	TokenNameextends
RenderableImage	TokenNameIdentifier
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
getTimeStamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Shape	TokenNameIdentifier
getDependencyRegion	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
srcIndex	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle2D	TokenNameIdentifier
outputRgn	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Shape	TokenNameIdentifier
getDirtyRegion	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
srcIndex	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle2D	TokenNameIdentifier
inputRgn	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
