package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
SourceLocator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
XMLString	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
DTM	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
NULL	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
ROOT_NODE	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
ELEMENT_NODE	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
ATTRIBUTE_NODE	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
TEXT_NODE	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
CDATA_SECTION_NODE	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
ENTITY_REFERENCE_NODE	TokenNameIdentifier
=	TokenNameEQUAL
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
ENTITY_NODE	TokenNameIdentifier
=	TokenNameEQUAL
6	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier
=	TokenNameEQUAL
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
COMMENT_NODE	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
DOCUMENT_NODE	TokenNameIdentifier
=	TokenNameEQUAL
9	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
DOCUMENT_TYPE_NODE	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier
=	TokenNameEQUAL
11	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
NOTATION_NODE	TokenNameIdentifier
=	TokenNameEQUAL
12	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
NAMESPACE_NODE	TokenNameIdentifier
=	TokenNameEQUAL
13	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
NTYPES	TokenNameIdentifier
=	TokenNameEQUAL
14	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setFeature	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
featureId	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
property	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
DTMAxisTraverser	TokenNameIdentifier
getAxisTraverser	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
axis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
DTMAxisIterator	TokenNameIdentifier
getAxisIterator	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
axis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
DTMAxisIterator	TokenNameIdentifier
getTypedAxisIterator	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
axis	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
hasChildNodes	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getLastChild	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getAttributeNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
elementHandle	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getFirstAttribute	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getFirstNamespaceNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
inScope	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getPreviousSibling	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getNextAttribute	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getNextNamespaceNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
baseHandle	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
namespaceHandle	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
inScope	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getParent	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getOwnerDocument	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getDocumentRoot	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
XMLString	TokenNameIdentifier
getStringValue	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getStringValueChunkCount	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getStringValueChunk	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
chunkIndex	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
startAndLen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getExpandedTypeID	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getExpandedTypeID	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespace	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
localName	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getLocalNameFromExpandedNameID	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ExpandedNameID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getNamespaceFromExpandedNameID	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ExpandedNameID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getNodeNameX	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getPrefix	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
short	TokenNameshort
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
short	TokenNameshort
getLevel	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
isSupported	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
feature	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getDocumentBaseURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setDocumentBaseURI	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
baseURI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getDocumentSystemIdentifier	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getDocumentEncoding	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getDocumentStandalone	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getDocumentVersion	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
documentHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
getDocumentAllDeclarationsProcessed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getDocumentTypeDeclarationSystemIdentifier	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getDocumentTypeDeclarationPublicIdentifier	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getElementById	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
elementId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getUnparsedEntityURI	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
supportsPreStripping	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
isNodeAfter	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
firstNodeHandle	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
secondNodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
isCharacterElementContentWhitespace	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
isDocumentAllDeclarationsProcessed	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
documentHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
isAttributeSpecified	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
attributeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
dispatchCharactersEvents	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
,	TokenNameCOMMA
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
ContentHandler	TokenNameIdentifier
ch	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
normalize	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
dispatchToEvents	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
,	TokenNameCOMMA
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
ContentHandler	TokenNameIdentifier
ch	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
getNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
needsTwoThreads	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
ContentHandler	TokenNameIdentifier
getContentHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
LexicalHandler	TokenNameIdentifier
getLexicalHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
EntityResolver	TokenNameIdentifier
getEntityResolver	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
DTDHandler	TokenNameIdentifier
getDTDHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
ErrorHandler	TokenNameIdentifier
getErrorHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
DeclHandler	TokenNameIdentifier
getDeclHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
newChild	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
clone	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
cloneDepth	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
appendTextChild	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
SourceLocator	TokenNameIdentifier
getSourceLocatorFor	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
documentRegistration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
documentRelease	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
migrateTo	TokenNameIdentifier
(	TokenNameLPAREN
DTMManager	TokenNameIdentifier
manager	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
