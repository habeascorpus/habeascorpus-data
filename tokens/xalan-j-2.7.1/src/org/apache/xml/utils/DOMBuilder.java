package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Stack	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
res	TokenNameIdentifier
.	TokenNameDOT
XMLErrorResources	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
res	TokenNameIdentifier
.	TokenNameDOT
XMLMessages	TokenNameIdentifier
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
DocumentFragment	TokenNameIdentifier
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
Text	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
CDATASection	TokenNameIdentifier
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
ContentHandler	TokenNameIdentifier
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
ext	TokenNameIdentifier
.	TokenNameDOT
LexicalHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DOMBuilder	TokenNameIdentifier
implements	TokenNameimplements
ContentHandler	TokenNameIdentifier
,	TokenNameCOMMA
LexicalHandler	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Document	TokenNameIdentifier
m_doc	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Node	TokenNameIdentifier
m_currentNode	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
Node	TokenNameIdentifier
m_root	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
Node	TokenNameIdentifier
m_nextSibling	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
DocumentFragment	TokenNameIdentifier
m_docFrag	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
Stack	TokenNameIdentifier
m_elemStack	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Stack	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
Vector	TokenNameIdentifier
m_prefixMappings	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
DOMBuilder	TokenNameIdentifier
(	TokenNameLPAREN
Document	TokenNameIdentifier
doc	TokenNameIdentifier
,	TokenNameCOMMA
Node	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_doc	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
m_currentNode	TokenNameIdentifier
=	TokenNameEQUAL
m_root	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
instanceof	TokenNameinstanceof
Element	TokenNameIdentifier
)	TokenNameRPAREN
m_elemStack	TokenNameIdentifier
.	TokenNameDOT
push	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DOMBuilder	TokenNameIdentifier
(	TokenNameLPAREN
Document	TokenNameIdentifier
doc	TokenNameIdentifier
,	TokenNameCOMMA
DocumentFragment	TokenNameIdentifier
docFrag	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_doc	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
m_docFrag	TokenNameIdentifier
=	TokenNameEQUAL
docFrag	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DOMBuilder	TokenNameIdentifier
(	TokenNameLPAREN
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_doc	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getRootDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_docFrag	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
(	TokenNameLPAREN
Node	TokenNameIdentifier
)	TokenNameRPAREN
m_docFrag	TokenNameIdentifier
:	TokenNameCOLON
(	TokenNameLPAREN
Node	TokenNameIdentifier
)	TokenNameRPAREN
m_doc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getRootNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_root	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_currentNode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
nextSibling	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_nextSibling	TokenNameIdentifier
=	TokenNameEQUAL
nextSibling	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_nextSibling	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Writer	TokenNameIdentifier
getWriter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
append	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
newNode	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
Node	TokenNameIdentifier
currentNode	TokenNameIdentifier
=	TokenNameEQUAL
m_currentNode	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
currentNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
currentNode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
m_root	TokenNameIdentifier
&&	TokenNameAND_AND
m_nextSibling	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
currentNode	TokenNameIdentifier
.	TokenNameDOT
insertBefore	TokenNameIdentifier
(	TokenNameLPAREN
newNode	TokenNameIdentifier
,	TokenNameCOMMA
m_nextSibling	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
currentNode	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
newNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_docFrag	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_nextSibling	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
m_docFrag	TokenNameIdentifier
.	TokenNameDOT
insertBefore	TokenNameIdentifier
(	TokenNameLPAREN
newNode	TokenNameIdentifier
,	TokenNameCOMMA
m_nextSibling	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
m_docFrag	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
newNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
boolean	TokenNameboolean
ok	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
short	TokenNameshort
type	TokenNameIdentifier
=	TokenNameEQUAL
newNode	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Node	TokenNameIdentifier
.	TokenNameDOT
TEXT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
data	TokenNameIdentifier
=	TokenNameEQUAL
newNode	TokenNameIdentifier
.	TokenNameDOT
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
data	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
data	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessages	TokenNameIdentifier
.	TokenNameDOT
createXMLMessage	TokenNameIdentifier
(	TokenNameLPAREN
XMLErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_CANT_OUTPUT_TEXT_BEFORE_DOC	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ok	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_doc	TokenNameIdentifier
.	TokenNameDOT
getDocumentElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
ok	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessages	TokenNameIdentifier
.	TokenNameDOT
createXMLMessage	TokenNameIdentifier
(	TokenNameLPAREN
XMLErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_CANT_HAVE_MORE_THAN_ONE_ROOT	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ok	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_nextSibling	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
m_doc	TokenNameIdentifier
.	TokenNameDOT
insertBefore	TokenNameIdentifier
(	TokenNameLPAREN
newNode	TokenNameIdentifier
,	TokenNameCOMMA
m_nextSibling	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
m_doc	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
newNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDocumentLocator	TokenNameIdentifier
(	TokenNameLPAREN
Locator	TokenNameIdentifier
locator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startElement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
ns	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
localName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
Attributes	TokenNameIdentifier
atts	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
Element	TokenNameIdentifier
elem	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
ns	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
ns	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
elem	TokenNameIdentifier
=	TokenNameEQUAL
m_doc	TokenNameIdentifier
.	TokenNameDOT
createElementNS	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
elem	TokenNameIdentifier
=	TokenNameEQUAL
m_doc	TokenNameIdentifier
.	TokenNameDOT
createElementNS	TokenNameIdentifier
(	TokenNameLPAREN
ns	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
append	TokenNameIdentifier
(	TokenNameLPAREN
elem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
nAtts	TokenNameIdentifier
=	TokenNameEQUAL
atts	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
!=	TokenNameNOT_EQUAL
nAtts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
nAtts	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
atts	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
"ID"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
setIDAttribute	TokenNameIdentifier
(	TokenNameLPAREN
atts	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
elem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
attrNS	TokenNameIdentifier
=	TokenNameEQUAL
atts	TokenNameIdentifier
.	TokenNameDOT
getURI	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
""	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
attrNS	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
attrNS	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
String	TokenNameIdentifier
attrQName	TokenNameIdentifier
=	TokenNameEQUAL
atts	TokenNameIdentifier
.	TokenNameDOT
getQName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
attrQName	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"xmlns:"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
attrQName	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"xmlns"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
attrNS	TokenNameIdentifier
=	TokenNameEQUAL
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
elem	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
attrNS	TokenNameIdentifier
,	TokenNameCOMMA
attrQName	TokenNameIdentifier
,	TokenNameCOMMA
atts	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
nDecls	TokenNameIdentifier
=	TokenNameEQUAL
m_prefixMappings	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
declURL	TokenNameIdentifier
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
nDecls	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
prefix	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_prefixMappings	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
declURL	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_prefixMappings	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
elem	TokenNameIdentifier
.	TokenNameDOT
setAttributeNS	TokenNameIdentifier
(	TokenNameLPAREN
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral
,	TokenNameCOMMA
prefix	TokenNameIdentifier
,	TokenNameCOMMA
declURL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
m_prefixMappings	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_elemStack	TokenNameIdentifier
.	TokenNameDOT
push	TokenNameIdentifier
(	TokenNameLPAREN
elem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_currentNode	TokenNameIdentifier
=	TokenNameEQUAL
elem	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
Exception	TokenNameIdentifier
de	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
(	TokenNameLPAREN
de	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endElement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
ns	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
localName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
m_elemStack	TokenNameIdentifier
.	TokenNameDOT
pop	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_currentNode	TokenNameIdentifier
=	TokenNameEQUAL
m_elemStack	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
(	TokenNameLPAREN
Node	TokenNameIdentifier
)	TokenNameRPAREN
m_elemStack	TokenNameIdentifier
.	TokenNameDOT
peek	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setIDAttribute	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
Element	TokenNameIdentifier
elem	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
characters	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
ch	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isOutsideDocElem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
XMLCharacterRecognizer	TokenNameIdentifier
.	TokenNameDOT
isWhiteSpace	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m_inCData	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cdata	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Node	TokenNameIdentifier
childNode	TokenNameIdentifier
;	TokenNameSEMICOLON
childNode	TokenNameIdentifier
=	TokenNameEQUAL
m_currentNode	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
m_currentNode	TokenNameIdentifier
.	TokenNameDOT
getLastChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
childNode	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
childNode	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
Node	TokenNameIdentifier
.	TokenNameDOT
TEXT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
(	TokenNameLPAREN
(	TokenNameLPAREN
Text	TokenNameIdentifier
)	TokenNameRPAREN
childNode	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
appendData	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
Text	TokenNameIdentifier
text	TokenNameIdentifier
=	TokenNameEQUAL
m_doc	TokenNameIdentifier
.	TokenNameDOT
createTextNode	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
append	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
charactersRaw	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
ch	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isOutsideDocElem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
XMLCharacterRecognizer	TokenNameIdentifier
.	TokenNameDOT
isWhiteSpace	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
append	TokenNameIdentifier
(	TokenNameLPAREN
m_doc	TokenNameIdentifier
.	TokenNameDOT
createProcessingInstruction	TokenNameIdentifier
(	TokenNameLPAREN
"xslt-next-is-raw"	TokenNameStringLiteral
,	TokenNameCOMMA
"formatter-to-dom"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
append	TokenNameIdentifier
(	TokenNameLPAREN
m_doc	TokenNameIdentifier
.	TokenNameDOT
createTextNode	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startEntity	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endEntity	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
entityReference	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
append	TokenNameIdentifier
(	TokenNameLPAREN
m_doc	TokenNameIdentifier
.	TokenNameDOT
createEntityReference	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
ignorableWhitespace	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
ch	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isOutsideDocElem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
append	TokenNameIdentifier
(	TokenNameLPAREN
m_doc	TokenNameIdentifier
.	TokenNameDOT
createTextNode	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
isOutsideDocElem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_docFrag	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
m_elemStack	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_currentNode	TokenNameIdentifier
||	TokenNameOR_OR
m_currentNode	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
Node	TokenNameIdentifier
.	TokenNameDOT
DOCUMENT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
processingInstruction	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
data	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
append	TokenNameIdentifier
(	TokenNameLPAREN
m_doc	TokenNameIdentifier
.	TokenNameDOT
createProcessingInstruction	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
data	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
comment	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
ch	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
append	TokenNameIdentifier
(	TokenNameLPAREN
m_doc	TokenNameIdentifier
.	TokenNameDOT
createComment	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
m_inCData	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
startCDATA	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
m_inCData	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
append	TokenNameIdentifier
(	TokenNameLPAREN
m_doc	TokenNameIdentifier
.	TokenNameDOT
createCDATASection	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endCDATA	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
m_inCData	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
cdata	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
ch	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isOutsideDocElem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
XMLCharacterRecognizer	TokenNameIdentifier
.	TokenNameDOT
isWhiteSpace	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CDATASection	TokenNameIdentifier
section	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CDATASection	TokenNameIdentifier
)	TokenNameRPAREN
m_currentNode	TokenNameIdentifier
.	TokenNameDOT
getLastChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
section	TokenNameIdentifier
.	TokenNameDOT
appendData	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startDTD	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
publicId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
systemId	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endDTD	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startPrefixMapping	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
uri	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
prefix	TokenNameIdentifier
||	TokenNameOR_OR
prefix	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
prefix	TokenNameIdentifier
=	TokenNameEQUAL
"xmlns"	TokenNameStringLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
prefix	TokenNameIdentifier
=	TokenNameEQUAL
"xmlns:"	TokenNameStringLiteral
+	TokenNamePLUS
prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
m_prefixMappings	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_prefixMappings	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endPrefixMapping	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
skippedEntity	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
