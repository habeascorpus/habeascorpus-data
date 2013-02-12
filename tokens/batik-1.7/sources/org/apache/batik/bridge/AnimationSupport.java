package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Calendar	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
.	TokenNameDOT
timing	TokenNameIdentifier
.	TokenNameDOT
TimedElement	TokenNameIdentifier
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
DOMTimeEvent	TokenNameIdentifier
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
IdContainer	TokenNameIdentifier
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
SVGOMAnimationElement	TokenNameIdentifier
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
SVGOMUseShadowRoot	TokenNameIdentifier
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
EventTarget	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
smil	TokenNameIdentifier
.	TokenNameDOT
TimeEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AnimationSupport	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
fireTimeEvent	TokenNameIdentifier
(	TokenNameLPAREN
EventTarget	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
eventType	TokenNameIdentifier
,	TokenNameCOMMA
Calendar	TokenNameIdentifier
time	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
detail	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DocumentEvent	TokenNameIdentifier
de	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DocumentEvent	TokenNameIdentifier
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Node	TokenNameIdentifier
)	TokenNameRPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getOwnerDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DOMTimeEvent	TokenNameIdentifier
evt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DOMTimeEvent	TokenNameIdentifier
)	TokenNameRPAREN
de	TokenNameIdentifier
.	TokenNameDOT
createEvent	TokenNameIdentifier
(	TokenNameLPAREN
"TimeEvent"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
evt	TokenNameIdentifier
.	TokenNameDOT
initTimeEventNS	TokenNameIdentifier
(	TokenNameLPAREN
XMLConstants	TokenNameIdentifier
.	TokenNameDOT
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier
,	TokenNameCOMMA
eventType	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
detail	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
evt	TokenNameIdentifier
.	TokenNameDOT
setTimestamp	TokenNameIdentifier
(	TokenNameLPAREN
time	TokenNameIdentifier
.	TokenNameDOT
getTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
target	TokenNameIdentifier
.	TokenNameDOT
dispatchEvent	TokenNameIdentifier
(	TokenNameLPAREN
evt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
TimedElement	TokenNameIdentifier
getTimedElementById	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
getElementById	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
,	TokenNameCOMMA
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
instanceof	TokenNameinstanceof
SVGOMAnimationElement	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SVGAnimationElementBridge	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SVGAnimationElementBridge	TokenNameIdentifier
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
SVGOMAnimationElement	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getSVGContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
b	TokenNameIdentifier
.	TokenNameDOT
getTimedElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
EventTarget	TokenNameIdentifier
getEventTargetById	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
EventTarget	TokenNameIdentifier
)	TokenNameRPAREN
getElementById	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
,	TokenNameCOMMA
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
Element	TokenNameIdentifier
getElementById	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Node	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
.	TokenNameDOT
getParentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
p	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
n	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
instanceof	TokenNameinstanceof
SVGOMUseShadowRoot	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
p	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
SVGOMUseShadowRoot	TokenNameIdentifier
)	TokenNameRPAREN
n	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getCSSParentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
p	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
.	TokenNameDOT
getParentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
instanceof	TokenNameinstanceof
IdContainer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
IdContainer	TokenNameIdentifier
)	TokenNameRPAREN
n	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getElementById	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE