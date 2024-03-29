package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
cvslib	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Date	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PrintWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
OutputStreamWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ByteArrayOutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ByteArrayInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
JAXPUtils	TokenNameIdentifier
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
ContentHandler	TokenNameIdentifier
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
Locator	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
ChangeLogWriterTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
ChangeLogWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ChangeLogWriter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
testNonUTF8Characters	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
CVSEntry	TokenNameIdentifier
entry	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CVSEntry	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Date	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"Señorita"	TokenNameStringLiteral
,	TokenNameCOMMA
"2003 < 2004 && 3 > 5"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
.	TokenNameDOT
addFile	TokenNameIdentifier
(	TokenNameLPAREN
"Medicare & review.doc"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
.	TokenNameDOT
addFile	TokenNameIdentifier
(	TokenNameLPAREN
"Elèments de style"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CVSEntry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
entries	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
entry	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
ByteArrayOutputStream	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteArrayOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrintWriter	TokenNameIdentifier
pwriter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrintWriter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
OutputStreamWriter	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
,	TokenNameCOMMA
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
printChangeLog	TokenNameIdentifier
(	TokenNameLPAREN
pwriter	TokenNameIdentifier
,	TokenNameCOMMA
entries	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XMLReader	TokenNameIdentifier
xmlReader	TokenNameIdentifier
=	TokenNameEQUAL
JAXPUtils	TokenNameIdentifier
.	TokenNameDOT
getXMLReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InputStream	TokenNameIdentifier
input	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteArrayInputStream	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
.	TokenNameDOT
toByteArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlReader	TokenNameIdentifier
.	TokenNameDOT
setContentHandler	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
NullContentHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlReader	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
InputSource	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
NullContentHandler	TokenNameIdentifier
implements	TokenNameimplements
ContentHandler	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
endDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
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
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
debug	TokenNameIdentifier
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
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endPrefixMapping	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
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
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
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
processingInstruction	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
data	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
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
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
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
qName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
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
qName	TokenNameIdentifier
,	TokenNameCOMMA
Attributes	TokenNameIdentifier
atts	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
