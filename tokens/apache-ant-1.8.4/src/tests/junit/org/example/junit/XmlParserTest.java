package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
example	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
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
XMLReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
XMLReaderFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XmlParserTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
XmlParserTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testXercesIsPresent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
XMLReader	TokenNameIdentifier
xerces	TokenNameIdentifier
;	TokenNameSEMICOLON
xerces	TokenNameIdentifier
=	TokenNameEQUAL
XMLReaderFactory	TokenNameIdentifier
.	TokenNameDOT
createXMLReader	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xerces.parsers.SAXParser"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
xerces	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testXercesHandlesSchema	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
XMLReader	TokenNameIdentifier
xerces	TokenNameIdentifier
;	TokenNameSEMICOLON
xerces	TokenNameIdentifier
=	TokenNameEQUAL
XMLReaderFactory	TokenNameIdentifier
.	TokenNameDOT
createXMLReader	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xerces.parsers.SAXParser"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xerces	TokenNameIdentifier
.	TokenNameDOT
setFeature	TokenNameIdentifier
(	TokenNameLPAREN
"http://apache.org/xml/features/validation/schema"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testParserHandlesSchema	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
XMLReader	TokenNameIdentifier
xerces	TokenNameIdentifier
;	TokenNameSEMICOLON
xerces	TokenNameIdentifier
=	TokenNameEQUAL
XMLReaderFactory	TokenNameIdentifier
.	TokenNameDOT
createXMLReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xerces	TokenNameIdentifier
.	TokenNameDOT
setFeature	TokenNameIdentifier
(	TokenNameLPAREN
"http://apache.org/xml/features/validation/schema"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE