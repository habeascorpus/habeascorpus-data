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
AlphaComposite	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Composite	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
SVGComposite	TokenNameIdentifier
implements	TokenNameimplements
SVGConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
SVGAlphaComposite	TokenNameIdentifier
svgAlphaComposite	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SVGCustomComposite	TokenNameIdentifier
svgCustomComposite	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGComposite	TokenNameIdentifier
(	TokenNameLPAREN
SVGGeneratorContext	TokenNameIdentifier
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
svgAlphaComposite	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGAlphaComposite	TokenNameIdentifier
(	TokenNameLPAREN
generatorContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
svgCustomComposite	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SVGCustomComposite	TokenNameIdentifier
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
compositeDefs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedList	TokenNameIdentifier
(	TokenNameLPAREN
svgAlphaComposite	TokenNameIdentifier
.	TokenNameDOT
getDefinitionSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
compositeDefs	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
svgCustomComposite	TokenNameIdentifier
.	TokenNameDOT
getDefinitionSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
compositeDefs	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGAlphaComposite	TokenNameIdentifier
getAlphaCompositeConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
svgAlphaComposite	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGCustomComposite	TokenNameIdentifier
getCustomCompositeConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
svgCustomComposite	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGDescriptor	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
GraphicContext	TokenNameIdentifier
gc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
gc	TokenNameIdentifier
.	TokenNameDOT
getComposite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SVGCompositeDescriptor	TokenNameIdentifier
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
Composite	TokenNameIdentifier
composite	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
composite	TokenNameIdentifier
instanceof	TokenNameinstanceof
AlphaComposite	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
svgAlphaComposite	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
AlphaComposite	TokenNameIdentifier
)	TokenNameRPAREN
composite	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
svgCustomComposite	TokenNameIdentifier
.	TokenNameDOT
toSVG	TokenNameIdentifier
(	TokenNameLPAREN
composite	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE