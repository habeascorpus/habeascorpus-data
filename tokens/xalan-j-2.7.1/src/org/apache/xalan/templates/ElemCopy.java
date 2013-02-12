package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
transformer	TokenNameIdentifier
.	TokenNameDOT
ClonerToResultTree	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
transformer	TokenNameIdentifier
.	TokenNameDOT
TransformerImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
DTM	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
.	TokenNameDOT
SerializerUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
SerializationHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
XPathContext	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ElemCopy	TokenNameIdentifier
extends	TokenNameextends
ElemUse	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
5478580783896941384L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getXSLToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_COPY	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_COPY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
TransformerImpl	TokenNameIdentifier
transformer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
=	TokenNameEQUAL
transformer	TokenNameIdentifier
.	TokenNameDOT
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
sourceNode	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xctxt	TokenNameIdentifier
.	TokenNameDOT
pushCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
sourceNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DTM	TokenNameIdentifier
dtm	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getDTM	TokenNameIdentifier
(	TokenNameLPAREN
sourceNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
short	TokenNameshort
nodeType	TokenNameIdentifier
=	TokenNameEQUAL
dtm	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
sourceNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_NODE	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
nodeType	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
nodeType	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SerializationHandler	TokenNameIdentifier
rthandler	TokenNameIdentifier
=	TokenNameEQUAL
transformer	TokenNameIdentifier
.	TokenNameDOT
getSerializationHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getDebug	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getTraceManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
fireTraceEvent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ClonerToResultTree	TokenNameIdentifier
.	TokenNameDOT
cloneToResultTree	TokenNameIdentifier
(	TokenNameLPAREN
sourceNode	TokenNameIdentifier
,	TokenNameCOMMA
nodeType	TokenNameIdentifier
,	TokenNameCOMMA
dtm	TokenNameIdentifier
,	TokenNameCOMMA
rthandler	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
nodeType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
transformer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SerializerUtils	TokenNameIdentifier
.	TokenNameDOT
processNSDecls	TokenNameIdentifier
(	TokenNameLPAREN
rthandler	TokenNameIdentifier
,	TokenNameCOMMA
sourceNode	TokenNameIdentifier
,	TokenNameCOMMA
nodeType	TokenNameIdentifier
,	TokenNameCOMMA
dtm	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformer	TokenNameIdentifier
.	TokenNameDOT
executeChildTemplates	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
ns	TokenNameIdentifier
=	TokenNameEQUAL
dtm	TokenNameIdentifier
.	TokenNameDOT
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
sourceNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
localName	TokenNameIdentifier
=	TokenNameEQUAL
dtm	TokenNameIdentifier
.	TokenNameDOT
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
sourceNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformer	TokenNameIdentifier
.	TokenNameDOT
getResultTreeHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
endElement	TokenNameIdentifier
(	TokenNameLPAREN
ns	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
,	TokenNameCOMMA
dtm	TokenNameIdentifier
.	TokenNameDOT
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
sourceNode	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getDebug	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getTraceManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
fireTraceEndEvent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getDebug	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getTraceManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
fireTraceEvent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
transformer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformer	TokenNameIdentifier
.	TokenNameDOT
executeChildTemplates	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getDebug	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getTraceManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
fireTraceEndEvent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
se	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
TransformerException	TokenNameIdentifier
(	TokenNameLPAREN
se	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
xctxt	TokenNameIdentifier
.	TokenNameDOT
popCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE