package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
svg12	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
engine	TokenNameIdentifier
.	TokenNameDOT
CSSNavigableDocumentListener	TokenNameIdentifier
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
SVGOMDocument	TokenNameIdentifier
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
XMLConstants	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DOMImplementation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DocumentType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
events	TokenNameIdentifier
.	TokenNameDOT
EventListener	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
.	TokenNameDOT
SVGDocument	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SVG12OMDocument	TokenNameIdentifier
extends	TokenNameextends
SVGOMDocument	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
SVG12OMDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
SVG12OMDocument	TokenNameIdentifier
(	TokenNameLPAREN
DocumentType	TokenNameIdentifier
dt	TokenNameIdentifier
,	TokenNameCOMMA
DOMImplementation	TokenNameIdentifier
impl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
dt	TokenNameIdentifier
,	TokenNameCOMMA
impl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Node	TokenNameIdentifier
newNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
SVG12OMDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addCSSNavigableDocumentListener	TokenNameIdentifier
(	TokenNameLPAREN
CSSNavigableDocumentListener	TokenNameIdentifier
l	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
cssNavigableDocumentListeners	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
DOMNodeInsertedListenerWrapper	TokenNameIdentifier
nodeInserted	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DOMNodeInsertedListenerWrapper	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DOMNodeRemovedListenerWrapper	TokenNameIdentifier
nodeRemoved	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DOMNodeRemovedListenerWrapper	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DOMSubtreeModifiedListenerWrapper	TokenNameIdentifier
subtreeModified	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DOMSubtreeModifiedListenerWrapper	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DOMCharacterDataModifiedListenerWrapper	TokenNameIdentifier
cdataModified	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DOMCharacterDataModifiedListenerWrapper	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DOMAttrModifiedListenerWrapper	TokenNameIdentifier
attrModified	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DOMAttrModifiedListenerWrapper	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cssNavigableDocumentListeners	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
EventListener	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
nodeInserted	TokenNameIdentifier
,	TokenNameCOMMA
nodeRemoved	TokenNameIdentifier
,	TokenNameCOMMA
subtreeModified	TokenNameIdentifier
,	TokenNameCOMMA
cdataModified	TokenNameIdentifier
,	TokenNameCOMMA
attrModified	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XBLEventSupport	TokenNameIdentifier
es	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XBLEventSupport	TokenNameIdentifier
)	TokenNameRPAREN
initializeEventSupport	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
es	TokenNameIdentifier
.	TokenNameDOT
addImplementationEventListenerNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMNodeInserted"	TokenNameStringLiteral
,	TokenNameCOMMA
nodeInserted	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
es	TokenNameIdentifier
.	TokenNameDOT
addImplementationEventListenerNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMNodeRemoved"	TokenNameStringLiteral
,	TokenNameCOMMA
nodeRemoved	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
es	TokenNameIdentifier
.	TokenNameDOT
addImplementationEventListenerNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMSubtreeModified"	TokenNameStringLiteral
,	TokenNameCOMMA
subtreeModified	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
es	TokenNameIdentifier
.	TokenNameDOT
addImplementationEventListenerNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMCharacterDataModified"	TokenNameStringLiteral
,	TokenNameCOMMA
cdataModified	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
es	TokenNameIdentifier
.	TokenNameDOT
addImplementationEventListenerNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMAttrModified"	TokenNameStringLiteral
,	TokenNameCOMMA
attrModified	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
removeCSSNavigableDocumentListener	TokenNameIdentifier
(	TokenNameLPAREN
CSSNavigableDocumentListener	TokenNameIdentifier
l	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
EventListener	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
listeners	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
EventListener	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
cssNavigableDocumentListeners	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
listeners	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
XBLEventSupport	TokenNameIdentifier
es	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XBLEventSupport	TokenNameIdentifier
)	TokenNameRPAREN
initializeEventSupport	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
es	TokenNameIdentifier
.	TokenNameDOT
removeImplementationEventListenerNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMNodeInserted"	TokenNameStringLiteral
,	TokenNameCOMMA
listeners	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
es	TokenNameIdentifier
.	TokenNameDOT
removeImplementationEventListenerNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMNodeRemoved"	TokenNameStringLiteral
,	TokenNameCOMMA
listeners	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
es	TokenNameIdentifier
.	TokenNameDOT
removeImplementationEventListenerNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMSubtreeModified"	TokenNameStringLiteral
,	TokenNameCOMMA
listeners	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
es	TokenNameIdentifier
.	TokenNameDOT
removeImplementationEventListenerNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMCharacterDataModified"	TokenNameStringLiteral
,	TokenNameCOMMA
listeners	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
es	TokenNameIdentifier
.	TokenNameDOT
removeImplementationEventListenerNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMAttrModified"	TokenNameStringLiteral
,	TokenNameCOMMA
listeners	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cssNavigableDocumentListeners	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE