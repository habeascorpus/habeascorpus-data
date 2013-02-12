package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
.	TokenNameDOT
svg12	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
.	TokenNameDOT
BridgeContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
.	TokenNameDOT
SVGBridgeExtension	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SVGConstants	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SVG12Constants	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
XBLConstants	TokenNameIdentifier
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
SVG12BridgeExtension	TokenNameIdentifier
extends	TokenNameextends
SVGBridgeExtension	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
float	TokenNamefloat
getPriority	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Iterator	TokenNameIdentifier
getImplementedExtensions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getAuthor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"The Apache Batik Team."	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getContactAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"batik-dev@xmlgraphics.apache.org"	TokenNameStringLiteral
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
"The required SVG 1.2 tags"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
registerTags	TokenNameIdentifier
(	TokenNameLPAREN
BridgeContext	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
registerTags	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
putBridge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SVGFlowRootElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
putBridge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SVGMultiImageElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
putBridge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SVGSolidColorElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
putBridge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SVG12TextElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
putBridge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
XBLShadowTreeElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
putBridge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
XBLContentElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
setDefaultBridge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
BindableElementBridge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
putReservedNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
putReservedNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
SVGConstants	TokenNameIdentifier
.	TokenNameDOT
SVG_NAMESPACE_URI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
putReservedNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
XBLConstants	TokenNameIdentifier
.	TokenNameDOT
XBL_NAMESPACE_URI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isDynamicElement	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
ns	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
XBLConstants	TokenNameIdentifier
.	TokenNameDOT
XBL_NAMESPACE_URI	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ns	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
SVGConstants	TokenNameIdentifier
.	TokenNameDOT
SVG_NAMESPACE_URI	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ns	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
ln	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ln	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
SVGConstants	TokenNameIdentifier
.	TokenNameDOT
SVG_SCRIPT_TAG	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
ln	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
SVG12Constants	TokenNameIdentifier
.	TokenNameDOT
SVG_HANDLER_TAG	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
ln	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"animate"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
ln	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"set"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
