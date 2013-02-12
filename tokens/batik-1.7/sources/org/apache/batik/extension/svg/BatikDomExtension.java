package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
extension	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
AbstractDocument	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DomExtension	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
ExtensibleDOMImplementation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
.	TokenNameDOT
SVGDOMImplementation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
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
BatikDomExtension	TokenNameIdentifier
implements	TokenNameimplements
DomExtension	TokenNameIdentifier
,	TokenNameCOMMA
BatikExtConstants	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
float	TokenNamefloat
getPriority	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
1.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getAuthor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"Thomas DeWeese"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getContactAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"deweese@apache.org"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"http://xml.apache.org/batik"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getDescription	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"Example extension to standard SVG shape tags"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
registerTags	TokenNameIdentifier
(	TokenNameLPAREN
ExtensibleDOMImplementation	TokenNameIdentifier
di	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_EXT_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_REGULAR_POLYGON_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
BatikRegularPolygonElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_EXT_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_STAR_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
BatikStarElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_EXT_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_HISTOGRAM_NORMALIZATION_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
BatikHistogramNormalizationElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_EXT_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_COLOR_SWITCH_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
ColorSwitchElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_12_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_FLOW_TEXT_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
FlowTextElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_12_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_FLOW_DIV_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
FlowDivElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_12_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_FLOW_PARA_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
FlowParaElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_12_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_FLOW_REGION_BREAK_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
FlowRegionBreakElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_12_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_FLOW_REGION_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
FlowRegionElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_12_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_FLOW_LINE_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
FlowLineElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
di	TokenNameIdentifier
.	TokenNameDOT
registerCustomElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
BATIK_12_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
BATIK_EXT_FLOW_SPAN_TAG	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
FlowSpanElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
BatikRegularPolygonElementFactory	TokenNameIdentifier
implements	TokenNameimplements
ExtensibleDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
BatikRegularPolygonElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
BatikRegularPolygonElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
BatikStarElementFactory	TokenNameIdentifier
implements	TokenNameimplements
ExtensibleDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
BatikStarElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
BatikStarElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
BatikHistogramNormalizationElementFactory	TokenNameIdentifier
implements	TokenNameimplements
ExtensibleDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
BatikHistogramNormalizationElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
BatikHistogramNormalizationElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
ColorSwitchElementFactory	TokenNameIdentifier
implements	TokenNameimplements
ExtensibleDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
ColorSwitchElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ColorSwitchElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
FlowTextElementFactory	TokenNameIdentifier
implements	TokenNameimplements
SVGDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
FlowTextElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FlowTextElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
FlowDivElementFactory	TokenNameIdentifier
implements	TokenNameimplements
SVGDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
FlowDivElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FlowDivElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
FlowParaElementFactory	TokenNameIdentifier
implements	TokenNameimplements
SVGDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
FlowParaElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FlowParaElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
FlowRegionBreakElementFactory	TokenNameIdentifier
implements	TokenNameimplements
SVGDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
FlowRegionBreakElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FlowRegionBreakElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
FlowRegionElementFactory	TokenNameIdentifier
implements	TokenNameimplements
SVGDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
FlowRegionElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FlowRegionElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
FlowLineElementFactory	TokenNameIdentifier
implements	TokenNameimplements
SVGDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
FlowLineElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FlowLineElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
FlowSpanElementFactory	TokenNameIdentifier
implements	TokenNameimplements
SVGDOMImplementation	TokenNameIdentifier
.	TokenNameDOT
ElementFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
FlowSpanElementFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FlowSpanElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
AbstractDocument	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
