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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
.	TokenNameDOT
FocusManager	TokenNameIdentifier
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
AbstractNode	TokenNameIdentifier
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
events	TokenNameIdentifier
.	TokenNameDOT
AbstractEvent	TokenNameIdentifier
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
events	TokenNameIdentifier
.	TokenNameDOT
DOMUIEvent	TokenNameIdentifier
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
events	TokenNameIdentifier
.	TokenNameDOT
EventSupport	TokenNameIdentifier
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
svg12	TokenNameIdentifier
.	TokenNameDOT
XBLEventSupport	TokenNameIdentifier
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
DocumentEvent	TokenNameIdentifier
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
Event	TokenNameIdentifier
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
EventTarget	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SVG12FocusManager	TokenNameIdentifier
extends	TokenNameextends
FocusManager	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
SVG12FocusManager	TokenNameIdentifier
(	TokenNameLPAREN
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
addEventListeners	TokenNameIdentifier
(	TokenNameLPAREN
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AbstractNode	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AbstractNode	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
XBLEventSupport	TokenNameIdentifier
es	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XBLEventSupport	TokenNameIdentifier
)	TokenNameRPAREN
n	TokenNameIdentifier
.	TokenNameDOT
initializeEventSupport	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mouseclickListener	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MouseClickTracker	TokenNameIdentifier
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
"click"	TokenNameStringLiteral
,	TokenNameCOMMA
mouseclickListener	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mouseoverListener	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MouseOverTracker	TokenNameIdentifier
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
"mouseover"	TokenNameStringLiteral
,	TokenNameCOMMA
mouseoverListener	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mouseoutListener	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MouseOutTracker	TokenNameIdentifier
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
"mouseout"	TokenNameStringLiteral
,	TokenNameCOMMA
mouseoutListener	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
domFocusInListener	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DOMFocusInTracker	TokenNameIdentifier
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
"DOMFocusIn"	TokenNameStringLiteral
,	TokenNameCOMMA
domFocusInListener	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
domFocusOutListener	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DOMFocusOutTracker	TokenNameIdentifier
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
"DOMFocusOut"	TokenNameStringLiteral
,	TokenNameCOMMA
domFocusOutListener	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
removeEventListeners	TokenNameIdentifier
(	TokenNameLPAREN
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AbstractNode	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AbstractNode	TokenNameIdentifier
)	TokenNameRPAREN
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
XBLEventSupport	TokenNameIdentifier
es	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XBLEventSupport	TokenNameIdentifier
)	TokenNameRPAREN
n	TokenNameIdentifier
.	TokenNameDOT
getEventSupport	TokenNameIdentifier
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
"click"	TokenNameStringLiteral
,	TokenNameCOMMA
mouseclickListener	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
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
"mouseover"	TokenNameStringLiteral
,	TokenNameCOMMA
mouseoverListener	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
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
"mouseout"	TokenNameStringLiteral
,	TokenNameCOMMA
mouseoutListener	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
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
"DOMFocusIn"	TokenNameStringLiteral
,	TokenNameCOMMA
domFocusInListener	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
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
"DOMFocusOut"	TokenNameStringLiteral
,	TokenNameCOMMA
domFocusOutListener	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
class	TokenNameclass
MouseClickTracker	TokenNameIdentifier
extends	TokenNameextends
FocusManager	TokenNameIdentifier
.	TokenNameDOT
MouseClickTracker	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
handleEvent	TokenNameIdentifier
(	TokenNameLPAREN
Event	TokenNameIdentifier
evt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
handleEvent	TokenNameIdentifier
(	TokenNameLPAREN
EventSupport	TokenNameIdentifier
.	TokenNameDOT
getUltimateOriginalEvent	TokenNameIdentifier
(	TokenNameLPAREN
evt	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
class	TokenNameclass
DOMFocusInTracker	TokenNameIdentifier
extends	TokenNameextends
FocusManager	TokenNameIdentifier
.	TokenNameDOT
DOMFocusInTracker	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
handleEvent	TokenNameIdentifier
(	TokenNameLPAREN
Event	TokenNameIdentifier
evt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
handleEvent	TokenNameIdentifier
(	TokenNameLPAREN
EventSupport	TokenNameIdentifier
.	TokenNameDOT
getUltimateOriginalEvent	TokenNameIdentifier
(	TokenNameLPAREN
evt	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
class	TokenNameclass
MouseOverTracker	TokenNameIdentifier
extends	TokenNameextends
FocusManager	TokenNameIdentifier
.	TokenNameDOT
MouseOverTracker	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
handleEvent	TokenNameIdentifier
(	TokenNameLPAREN
Event	TokenNameIdentifier
evt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
handleEvent	TokenNameIdentifier
(	TokenNameLPAREN
EventSupport	TokenNameIdentifier
.	TokenNameDOT
getUltimateOriginalEvent	TokenNameIdentifier
(	TokenNameLPAREN
evt	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
class	TokenNameclass
MouseOutTracker	TokenNameIdentifier
extends	TokenNameextends
FocusManager	TokenNameIdentifier
.	TokenNameDOT
MouseOutTracker	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
handleEvent	TokenNameIdentifier
(	TokenNameLPAREN
Event	TokenNameIdentifier
evt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
handleEvent	TokenNameIdentifier
(	TokenNameLPAREN
EventSupport	TokenNameIdentifier
.	TokenNameDOT
getUltimateOriginalEvent	TokenNameIdentifier
(	TokenNameLPAREN
evt	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
fireDOMFocusInEvent	TokenNameIdentifier
(	TokenNameLPAREN
EventTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
EventTarget	TokenNameIdentifier
relatedTarget	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DocumentEvent	TokenNameIdentifier
docEvt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DocumentEvent	TokenNameIdentifier
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getOwnerDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DOMUIEvent	TokenNameIdentifier
uiEvt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DOMUIEvent	TokenNameIdentifier
)	TokenNameRPAREN
docEvt	TokenNameIdentifier
.	TokenNameDOT
createEvent	TokenNameIdentifier
(	TokenNameLPAREN
"UIEvents"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
uiEvt	TokenNameIdentifier
.	TokenNameDOT
initUIEventNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMFocusIn"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
limit	TokenNameIdentifier
=	TokenNameEQUAL
DefaultXBLManager	TokenNameIdentifier
.	TokenNameDOT
computeBubbleLimit	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Node	TokenNameIdentifier
)	TokenNameRPAREN
relatedTarget	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Node	TokenNameIdentifier
)	TokenNameRPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
AbstractEvent	TokenNameIdentifier
)	TokenNameRPAREN
uiEvt	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setBubbleLimit	TokenNameIdentifier
(	TokenNameLPAREN
limit	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
target	TokenNameIdentifier
.	TokenNameDOT
dispatchEvent	TokenNameIdentifier
(	TokenNameLPAREN
uiEvt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
fireDOMFocusOutEvent	TokenNameIdentifier
(	TokenNameLPAREN
EventTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
EventTarget	TokenNameIdentifier
relatedTarget	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DocumentEvent	TokenNameIdentifier
docEvt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DocumentEvent	TokenNameIdentifier
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getOwnerDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DOMUIEvent	TokenNameIdentifier
uiEvt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DOMUIEvent	TokenNameIdentifier
)	TokenNameRPAREN
docEvt	TokenNameIdentifier
.	TokenNameDOT
createEvent	TokenNameIdentifier
(	TokenNameLPAREN
"UIEvents"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
uiEvt	TokenNameIdentifier
.	TokenNameDOT
initUIEventNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
"DOMFocusOut"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
limit	TokenNameIdentifier
=	TokenNameEQUAL
DefaultXBLManager	TokenNameIdentifier
.	TokenNameDOT
computeBubbleLimit	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Node	TokenNameIdentifier
)	TokenNameRPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Node	TokenNameIdentifier
)	TokenNameRPAREN
relatedTarget	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
AbstractEvent	TokenNameIdentifier
)	TokenNameRPAREN
uiEvt	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setBubbleLimit	TokenNameIdentifier
(	TokenNameLPAREN
limit	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
target	TokenNameIdentifier
.	TokenNameDOT
dispatchEvent	TokenNameIdentifier
(	TokenNameLPAREN
uiEvt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE