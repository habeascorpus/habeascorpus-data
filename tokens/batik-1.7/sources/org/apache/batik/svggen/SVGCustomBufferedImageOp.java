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
SVGCustomBufferedImageOp	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGFilterConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ERROR_EXTENSION	TokenNameIdentifier
=	TokenNameEQUAL
"SVGCustomBufferedImageOp:: ExtensionHandler could not convert filter"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGCustomBufferedImageOp	TokenNameIdentifier
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
}	TokenNameRBRACE
public	TokenNamepublic
SVGFilterDescriptor	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
BufferedImageOp	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
Rectangle	TokenNameIdentifier
filterRect	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SVGFilterDescriptor	TokenNameIdentifier
filterDesc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SVGFilterDescriptor	TokenNameIdentifier
)	TokenNameRPAREN
descMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
filterDesc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
filterDesc	TokenNameIdentifier
=	TokenNameEQUAL
generatorContext	TokenNameIdentifier
.	TokenNameDOT
extensionHandler	TokenNameIdentifier
.	TokenNameDOT
handleFilter	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
,	TokenNameCOMMA
filterRect	TokenNameIdentifier
,	TokenNameCOMMA
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
filterDesc	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
def	TokenNameIdentifier
=	TokenNameEQUAL
filterDesc	TokenNameIdentifier
.	TokenNameDOT
getDef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
def	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
defSet	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
def	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
descMap	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
,	TokenNameCOMMA
filterDesc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
ERROR_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
filterDesc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
