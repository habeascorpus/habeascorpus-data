package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
Constants	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
grammars	TokenNameIdentifier
.	TokenNameDOT
XMLGrammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
.	TokenNameDOT
XMLParserConfiguration	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XMLDocumentParser	TokenNameIdentifier
extends	TokenNameextends
AbstractXMLDocumentParser	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
XMLDocumentParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
(	TokenNameLPAREN
XMLParserConfiguration	TokenNameIdentifier
)	TokenNameRPAREN
ObjectFactory	TokenNameIdentifier
.	TokenNameDOT
createObject	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xerces.xni.parser.XMLParserConfiguration"	TokenNameStringLiteral
,	TokenNameCOMMA
"org.apache.xerces.parsers.XIncludeAwareParserConfiguration"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XMLDocumentParser	TokenNameIdentifier
(	TokenNameLPAREN
XMLParserConfiguration	TokenNameIdentifier
config	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
config	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XMLDocumentParser	TokenNameIdentifier
(	TokenNameLPAREN
SymbolTable	TokenNameIdentifier
symbolTable	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
(	TokenNameLPAREN
XMLParserConfiguration	TokenNameIdentifier
)	TokenNameRPAREN
ObjectFactory	TokenNameIdentifier
.	TokenNameDOT
createObject	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xerces.xni.parser.XMLParserConfiguration"	TokenNameStringLiteral
,	TokenNameCOMMA
"org.apache.xerces.parsers.XIncludeAwareParserConfiguration"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fConfiguration	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
XERCES_PROPERTY_PREFIX	TokenNameIdentifier
+	TokenNamePLUS
Constants	TokenNameIdentifier
.	TokenNameDOT
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier
,	TokenNameCOMMA
symbolTable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XMLDocumentParser	TokenNameIdentifier
(	TokenNameLPAREN
SymbolTable	TokenNameIdentifier
symbolTable	TokenNameIdentifier
,	TokenNameCOMMA
XMLGrammarPool	TokenNameIdentifier
grammarPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
(	TokenNameLPAREN
XMLParserConfiguration	TokenNameIdentifier
)	TokenNameRPAREN
ObjectFactory	TokenNameIdentifier
.	TokenNameDOT
createObject	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xerces.xni.parser.XMLParserConfiguration"	TokenNameStringLiteral
,	TokenNameCOMMA
"org.apache.xerces.parsers.XIncludeAwareParserConfiguration"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fConfiguration	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
XERCES_PROPERTY_PREFIX	TokenNameIdentifier
+	TokenNamePLUS
Constants	TokenNameIdentifier
.	TokenNameDOT
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier
,	TokenNameCOMMA
symbolTable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fConfiguration	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
XERCES_PROPERTY_PREFIX	TokenNameIdentifier
+	TokenNamePLUS
Constants	TokenNameIdentifier
.	TokenNameDOT
XMLGRAMMAR_POOL_PROPERTY	TokenNameIdentifier
,	TokenNameCOMMA
grammarPool	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE