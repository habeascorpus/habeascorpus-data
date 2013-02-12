package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
AttributeList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
Attributes	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TextSerializer	TokenNameIdentifier
extends	TokenNameextends
BaseMarkupSerializer	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
TextSerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
new	TokenNamenew
OutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
TEXT	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
OutputFormat	TokenNameIdentifier
format	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setOutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
format	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
format	TokenNameIdentifier
:	TokenNameCOLON
new	TokenNamenew
OutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
TEXT	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startElement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
localName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
rawName	TokenNameIdentifier
,	TokenNameCOMMA
Attributes	TokenNameIdentifier
attrs	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
startElement	TokenNameIdentifier
(	TokenNameLPAREN
rawName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
localName	TokenNameIdentifier
:	TokenNameCOLON
rawName	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endElement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
localName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
rawName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
endElement	TokenNameIdentifier
(	TokenNameLPAREN
rawName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
localName	TokenNameIdentifier
:	TokenNameCOLON
rawName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startElement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
tagName	TokenNameIdentifier
,	TokenNameCOMMA
AttributeList	TokenNameIdentifier
attrs	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
boolean	TokenNameboolean
preserveSpace	TokenNameIdentifier
;	TokenNameSEMICOLON
ElementState	TokenNameIdentifier
state	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
state	TokenNameIdentifier
=	TokenNameEQUAL
getElementState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isDocumentState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
_started	TokenNameIdentifier
)	TokenNameRPAREN
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
tagName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
preserveSpace	TokenNameIdentifier
=	TokenNameEQUAL
state	TokenNameIdentifier
.	TokenNameDOT
preserveSpace	TokenNameIdentifier
;	TokenNameSEMICOLON
state	TokenNameIdentifier
=	TokenNameEQUAL
enterElementState	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
tagName	TokenNameIdentifier
,	TokenNameCOMMA
preserveSpace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
except	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
SAXException	TokenNameIdentifier
(	TokenNameLPAREN
except	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endElement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
tagName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
endElementIO	TokenNameIdentifier
(	TokenNameLPAREN
tagName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
except	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
SAXException	TokenNameIdentifier
(	TokenNameLPAREN
except	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endElementIO	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
tagName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
ElementState	TokenNameIdentifier
state	TokenNameIdentifier
;	TokenNameSEMICOLON
state	TokenNameIdentifier
=	TokenNameEQUAL
getElementState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
state	TokenNameIdentifier
=	TokenNameEQUAL
leaveElementState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
state	TokenNameIdentifier
.	TokenNameDOT
afterElement	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
state	TokenNameIdentifier
.	TokenNameDOT
empty	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isDocumentState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
_printer	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
processingInstructionIO	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
code	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
comment	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
text	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
comment	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chars	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
characters	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chars	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
ElementState	TokenNameIdentifier
state	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
state	TokenNameIdentifier
=	TokenNameEQUAL
content	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
state	TokenNameIdentifier
.	TokenNameDOT
doCData	TokenNameIdentifier
=	TokenNameEQUAL
state	TokenNameIdentifier
.	TokenNameDOT
inCData	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
printText	TokenNameIdentifier
(	TokenNameLPAREN
chars	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
except	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
SAXException	TokenNameIdentifier
(	TokenNameLPAREN
except	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
characters	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
text	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
unescaped	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
ElementState	TokenNameIdentifier
state	TokenNameIdentifier
;	TokenNameSEMICOLON
state	TokenNameIdentifier
=	TokenNameEQUAL
content	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
state	TokenNameIdentifier
.	TokenNameDOT
doCData	TokenNameIdentifier
=	TokenNameEQUAL
state	TokenNameIdentifier
.	TokenNameDOT
inCData	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
printText	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
rootTagName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
_printer	TokenNameIdentifier
.	TokenNameDOT
leaveDTD	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_started	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
serializePreRoot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
serializeElement	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
elem	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Node	TokenNameIdentifier
child	TokenNameIdentifier
;	TokenNameSEMICOLON
ElementState	TokenNameIdentifier
state	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
preserveSpace	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
tagName	TokenNameIdentifier
;	TokenNameSEMICOLON
tagName	TokenNameIdentifier
=	TokenNameEQUAL
elem	TokenNameIdentifier
.	TokenNameDOT
getTagName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
state	TokenNameIdentifier
=	TokenNameEQUAL
getElementState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isDocumentState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
_started	TokenNameIdentifier
)	TokenNameRPAREN
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
tagName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
preserveSpace	TokenNameIdentifier
=	TokenNameEQUAL
state	TokenNameIdentifier
.	TokenNameDOT
preserveSpace	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
elem	TokenNameIdentifier
.	TokenNameDOT
hasChildNodes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
state	TokenNameIdentifier
=	TokenNameEQUAL
enterElementState	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
tagName	TokenNameIdentifier
,	TokenNameCOMMA
preserveSpace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
child	TokenNameIdentifier
=	TokenNameEQUAL
elem	TokenNameIdentifier
.	TokenNameDOT
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
child	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
serializeNode	TokenNameIdentifier
(	TokenNameLPAREN
child	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
child	TokenNameIdentifier
=	TokenNameEQUAL
child	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
endElementIO	TokenNameIdentifier
(	TokenNameLPAREN
tagName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isDocumentState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
state	TokenNameIdentifier
.	TokenNameDOT
afterElement	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
state	TokenNameIdentifier
.	TokenNameDOT
empty	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
serializeNode	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
TEXT_NODE	TokenNameIdentifier
:	TokenNameCOLON
{	TokenNameLBRACE
String	TokenNameIdentifier
text	TokenNameIdentifier
;	TokenNameSEMICOLON
text	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
text	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
characters	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
CDATA_SECTION_NODE	TokenNameIdentifier
:	TokenNameCOLON
{	TokenNameLBRACE
String	TokenNameIdentifier
text	TokenNameIdentifier
;	TokenNameSEMICOLON
text	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
text	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
characters	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
COMMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
ENTITY_REFERENCE_NODE	TokenNameIdentifier
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
serializeElement	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
{	TokenNameLBRACE
Node	TokenNameIdentifier
child	TokenNameIdentifier
;	TokenNameSEMICOLON
child	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
child	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
serializeNode	TokenNameIdentifier
(	TokenNameLPAREN
child	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
child	TokenNameIdentifier
=	TokenNameEQUAL
child	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
default	TokenNamedefault
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
ElementState	TokenNameIdentifier
content	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ElementState	TokenNameIdentifier
state	TokenNameIdentifier
;	TokenNameSEMICOLON
state	TokenNameIdentifier
=	TokenNameEQUAL
getElementState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isDocumentState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
state	TokenNameIdentifier
.	TokenNameDOT
empty	TokenNameIdentifier
)	TokenNameRPAREN
state	TokenNameIdentifier
.	TokenNameDOT
empty	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
state	TokenNameIdentifier
.	TokenNameDOT
afterElement	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
state	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
getEntityRef	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ch	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
