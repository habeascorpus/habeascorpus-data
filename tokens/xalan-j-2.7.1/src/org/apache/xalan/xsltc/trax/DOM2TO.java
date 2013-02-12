package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
trax	TokenNameIdentifier
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
NamedNodeMap	TokenNameIdentifier
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
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
ContentHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
DTDHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
EntityResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
ErrorHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
InputSource	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
Locator	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXNotRecognizedException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXNotSupportedException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
XMLReader	TokenNameIdentifier
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
NamespaceMappings	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DOM2TO	TokenNameIdentifier
implements	TokenNameimplements
XMLReader	TokenNameIdentifier
,	TokenNameCOMMA
Locator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
EMPTYSTRING	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
XMLNS_PREFIX	TokenNameIdentifier
=	TokenNameEQUAL
"xmlns"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Node	TokenNameIdentifier
_dom	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SerializationHandler	TokenNameIdentifier
_handler	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DOM2TO	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
root	TokenNameIdentifier
,	TokenNameCOMMA
SerializationHandler	TokenNameIdentifier
handler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_dom	TokenNameIdentifier
=	TokenNameEQUAL
root	TokenNameIdentifier
;	TokenNameSEMICOLON
_handler	TokenNameIdentifier
=	TokenNameEQUAL
handler	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ContentHandler	TokenNameIdentifier
getContentHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setContentHandler	TokenNameIdentifier
(	TokenNameLPAREN
ContentHandler	TokenNameIdentifier
handler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
parse	TokenNameIdentifier
(	TokenNameLPAREN
InputSource	TokenNameIdentifier
unused	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
parse	TokenNameIdentifier
(	TokenNameLPAREN
_dom	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
parse	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_dom	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
isIncomplete	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
_dom	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isIncomplete	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_handler	TokenNameIdentifier
.	TokenNameDOT
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
parse	TokenNameIdentifier
(	TokenNameLPAREN
_dom	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
endDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
parse	TokenNameIdentifier
(	TokenNameLPAREN
_dom	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
parse	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
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
ATTRIBUTE_NODE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_TYPE_NODE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
ENTITY_NODE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
ENTITY_REFERENCE_NODE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
NOTATION_NODE	TokenNameIdentifier
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
CDATA_SECTION_NODE	TokenNameIdentifier
:	TokenNameCOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
startCDATA	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
characters	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
endCDATA	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
COMMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
comment	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Node	TokenNameIdentifier
next	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
parse	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
next	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_handler	TokenNameIdentifier
.	TokenNameDOT
endDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
next	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
parse	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
next	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
final	TokenNamefinal
String	TokenNameIdentifier
qname	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
startElement	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
qname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
colon	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
NamedNodeMap	TokenNameIdentifier
map	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
map	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
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
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
Node	TokenNameIdentifier
attr	TokenNameIdentifier
=	TokenNameEQUAL
map	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
qnameAttr	TokenNameIdentifier
=	TokenNameEQUAL
attr	TokenNameIdentifier
.	TokenNameDOT
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
qnameAttr	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
XMLNS_PREFIX	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
uriAttr	TokenNameIdentifier
=	TokenNameEQUAL
attr	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
colon	TokenNameIdentifier
=	TokenNameEQUAL
qnameAttr	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
':'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
prefix	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
colon	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
qnameAttr	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
colon	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
:	TokenNameCOLON
EMPTYSTRING	TokenNameIdentifier
;	TokenNameSEMICOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
namespaceAfterStartElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
uriAttr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
NamespaceMappings	TokenNameIdentifier
nm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NamespaceMappings	TokenNameIdentifier
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
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
Node	TokenNameIdentifier
attr	TokenNameIdentifier
=	TokenNameEQUAL
map	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
qnameAttr	TokenNameIdentifier
=	TokenNameEQUAL
attr	TokenNameIdentifier
.	TokenNameDOT
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
qnameAttr	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
XMLNS_PREFIX	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
uriAttr	TokenNameIdentifier
=	TokenNameEQUAL
attr	TokenNameIdentifier
.	TokenNameDOT
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
uriAttr	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
uriAttr	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
EMPTYSTRING	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
colon	TokenNameIdentifier
=	TokenNameEQUAL
qnameAttr	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
':'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
newPrefix	TokenNameIdentifier
=	TokenNameEQUAL
nm	TokenNameIdentifier
.	TokenNameDOT
lookupPrefix	TokenNameIdentifier
(	TokenNameLPAREN
uriAttr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
newPrefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
newPrefix	TokenNameIdentifier
=	TokenNameEQUAL
nm	TokenNameIdentifier
.	TokenNameDOT
generateNextPrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
prefix	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
colon	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
qnameAttr	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
colon	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
newPrefix	TokenNameIdentifier
;	TokenNameSEMICOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
namespaceAfterStartElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
uriAttr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
qnameAttr	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
attr	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
_handler	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
qnameAttr	TokenNameIdentifier
,	TokenNameCOMMA
attr	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
final	TokenNamefinal
String	TokenNameIdentifier
uri	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
localName	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
uri	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
colon	TokenNameIdentifier
=	TokenNameEQUAL
qname	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
':'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
prefix	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
colon	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
qname	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
colon	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
EMPTYSTRING	TokenNameIdentifier
;	TokenNameSEMICOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
namespaceAfterStartElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
uri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
localName	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
prefix	TokenNameIdentifier
=	TokenNameEQUAL
EMPTYSTRING	TokenNameIdentifier
;	TokenNameSEMICOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
namespaceAfterStartElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
EMPTYSTRING	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
next	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
parse	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
next	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_handler	TokenNameIdentifier
.	TokenNameDOT
endElement	TokenNameIdentifier
(	TokenNameLPAREN
qname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier
:	TokenNameCOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
processingInstruction	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
node	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
TEXT_NODE	TokenNameIdentifier
:	TokenNameCOLON
_handler	TokenNameIdentifier
.	TokenNameDOT
characters	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
DTDHandler	TokenNameIdentifier
getDTDHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ErrorHandler	TokenNameIdentifier
getErrorHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getFeature	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXNotRecognizedException	TokenNameIdentifier
,	TokenNameCOMMA
SAXNotSupportedException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setFeature	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
value	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXNotRecognizedException	TokenNameIdentifier
,	TokenNameCOMMA
SAXNotSupportedException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
parse	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
sysId	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"This method is not yet implemented."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDTDHandler	TokenNameIdentifier
(	TokenNameLPAREN
DTDHandler	TokenNameIdentifier
handler	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
NullPointerException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setEntityResolver	TokenNameIdentifier
(	TokenNameLPAREN
EntityResolver	TokenNameIdentifier
resolver	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
NullPointerException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
EntityResolver	TokenNameIdentifier
getEntityResolver	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setErrorHandler	TokenNameIdentifier
(	TokenNameLPAREN
ErrorHandler	TokenNameIdentifier
handler	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
NullPointerException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXNotRecognizedException	TokenNameIdentifier
,	TokenNameCOMMA
SAXNotSupportedException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXNotRecognizedException	TokenNameIdentifier
,	TokenNameCOMMA
SAXNotSupportedException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getColumnNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getLineNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getPublicId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getSystemId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
getNodeTypeFromCode	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
code	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
retval	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
code	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
ATTRIBUTE_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"ATTRIBUTE_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
CDATA_SECTION_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"CDATA_SECTION_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
COMMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"COMMENT_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"DOCUMENT_FRAGMENT_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"DOCUMENT_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_TYPE_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"DOCUMENT_TYPE_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"ELEMENT_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
ENTITY_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"ENTITY_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
ENTITY_REFERENCE_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"ENTITY_REFERENCE_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
NOTATION_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"NOTATION_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"PROCESSING_INSTRUCTION_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Node	TokenNameIdentifier
.	TokenNameDOT
TEXT_NODE	TokenNameIdentifier
:	TokenNameCOLON
retval	TokenNameIdentifier
=	TokenNameEQUAL
"TEXT_NODE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
retval	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
