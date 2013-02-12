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
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
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
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
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
g2d	TokenNameIdentifier
.	TokenNameDOT
GraphicContext	TokenNameIdentifier
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
g2d	TokenNameIdentifier
.	TokenNameDOT
TransformStackElement	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SVGGraphicContextConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
GRAPHIC_CONTEXT_CONVERTER_COUNT	TokenNameIdentifier
=	TokenNameEQUAL
6	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGTransform	TokenNameIdentifier
transformConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGPaint	TokenNameIdentifier
paintConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGBasicStroke	TokenNameIdentifier
strokeConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGComposite	TokenNameIdentifier
compositeConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGClip	TokenNameIdentifier
clipConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGRenderingHints	TokenNameIdentifier
hintsConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGFont	TokenNameIdentifier
fontConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGConverter	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
converters	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGConverter	TokenNameIdentifier
[	TokenNameLBRACKET
GRAPHIC_CONTEXT_CONVERTER_COUNT	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGTransform	TokenNameIdentifier
getTransformConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
transformConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGPaint	TokenNameIdentifier
getPaintConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
paintConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGBasicStroke	TokenNameIdentifier
getStrokeConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
strokeConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGComposite	TokenNameIdentifier
getCompositeConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
compositeConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGClip	TokenNameIdentifier
getClipConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
clipConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGRenderingHints	TokenNameIdentifier
getHintsConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
hintsConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGFont	TokenNameIdentifier
getFontConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fontConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGGraphicContextConverter	TokenNameIdentifier
(	TokenNameLPAREN
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
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
ErrorConstants	TokenNameIdentifier
.	TokenNameDOT
ERR_CONTEXT_NULL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformConverter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGTransform	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
paintConverter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGPaint	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
strokeConverter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGBasicStroke	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
compositeConverter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGComposite	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clipConverter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGClip	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hintsConverter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGRenderingHints	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fontConverter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGFont	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
converters	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
paintConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
converters	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
strokeConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
converters	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
compositeConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
converters	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
clipConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
converters	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
hintsConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
converters	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
fontConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
TransformStackElement	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
transformStack	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
transformConverter	TokenNameIdentifier
.	TokenNameDOT
toSVGTransform	TokenNameIdentifier
(	TokenNameLPAREN
transformStack	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGGraphicContext	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
GraphicContext	TokenNameIdentifier
gc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Map	TokenNameIdentifier
groupAttrMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
converters	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
SVGDescriptor	TokenNameIdentifier
desc	TokenNameIdentifier
=	TokenNameEQUAL
converters	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
gc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
desc	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
desc	TokenNameIdentifier
.	TokenNameDOT
getAttributeMap	TokenNameIdentifier
(	TokenNameLPAREN
groupAttrMap	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
SVGGraphicContext	TokenNameIdentifier
(	TokenNameLPAREN
groupAttrMap	TokenNameIdentifier
,	TokenNameCOMMA
gc	TokenNameIdentifier
.	TokenNameDOT
getTransformStack	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
defSet	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
converters	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
defSet	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
converters	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getDefinitionSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
defSet	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
