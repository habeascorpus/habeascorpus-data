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
Rectangle	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
BufferedImageOp	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
ConvolveOp	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
LookupOp	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
RescaleOp	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
LinkedList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SVGBufferedImageOp	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGFilterConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
SVGLookupOp	TokenNameIdentifier
svgLookupOp	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGRescaleOp	TokenNameIdentifier
svgRescaleOp	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGConvolveOp	TokenNameIdentifier
svgConvolveOp	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGCustomBufferedImageOp	TokenNameIdentifier
svgCustomBufferedImageOp	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGBufferedImageOp	TokenNameIdentifier
(	TokenNameLPAREN
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
svgLookupOp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGLookupOp	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
svgRescaleOp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGRescaleOp	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
svgConvolveOp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGConvolveOp	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
svgCustomBufferedImageOp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGCustomBufferedImageOp	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
getDefinitionSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
filterSet	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedList	TokenNameIdentifier
(	TokenNameLPAREN
svgLookupOp	TokenNameIdentifier
.	TokenNameDOT
getDefinitionSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filterSet	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
svgRescaleOp	TokenNameIdentifier
.	TokenNameDOT
getDefinitionSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filterSet	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
svgConvolveOp	TokenNameIdentifier
.	TokenNameDOT
getDefinitionSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filterSet	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
svgCustomBufferedImageOp	TokenNameIdentifier
.	TokenNameDOT
getDefinitionSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
filterSet	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGLookupOp	TokenNameIdentifier
getLookupOpConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
svgLookupOp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGRescaleOp	TokenNameIdentifier
getRescaleOpConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
svgRescaleOp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGConvolveOp	TokenNameIdentifier
getConvolveOpConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
svgConvolveOp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGCustomBufferedImageOp	TokenNameIdentifier
getCustomBufferedImageOpConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
svgCustomBufferedImageOp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGFilterDescriptor	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
BufferedImageOp	TokenNameIdentifier
op	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle	TokenNameIdentifier
filterRect	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SVGFilterDescriptor	TokenNameIdentifier
filterDesc	TokenNameIdentifier
=	TokenNameEQUAL
svgCustomBufferedImageOp	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
op	TokenNameIdentifier
,	TokenNameCOMMA
filterRect	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
filterDesc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
op	TokenNameIdentifier
instanceof	TokenNameinstanceof
LookupOp	TokenNameIdentifier
)	TokenNameRPAREN
filterDesc	TokenNameIdentifier
=	TokenNameEQUAL
svgLookupOp	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
op	TokenNameIdentifier
,	TokenNameCOMMA
filterRect	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
op	TokenNameIdentifier
instanceof	TokenNameinstanceof
RescaleOp	TokenNameIdentifier
)	TokenNameRPAREN
filterDesc	TokenNameIdentifier
=	TokenNameEQUAL
svgRescaleOp	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
op	TokenNameIdentifier
,	TokenNameCOMMA
filterRect	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
op	TokenNameIdentifier
instanceof	TokenNameinstanceof
ConvolveOp	TokenNameIdentifier
)	TokenNameRPAREN
filterDesc	TokenNameIdentifier
=	TokenNameEQUAL
svgConvolveOp	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
op	TokenNameIdentifier
,	TokenNameCOMMA
filterRect	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
filterDesc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
