package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
dtd	TokenNameIdentifier
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
impl	TokenNameIdentifier
.	TokenNameDOT
XML11DTDScannerImpl	TokenNameIdentifier
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
XMLDTDScannerImpl	TokenNameIdentifier
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
XMLEntityManager	TokenNameIdentifier
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
XMLErrorReporter	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
XML11Char	TokenNameIdentifier
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
XMLEntityResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XML11DTDProcessor	TokenNameIdentifier
extends	TokenNameextends
XMLDTDLoader	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
XML11DTDProcessor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XML11DTDProcessor	TokenNameIdentifier
(	TokenNameLPAREN
SymbolTable	TokenNameIdentifier
symbolTable	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
symbolTable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XML11DTDProcessor	TokenNameIdentifier
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
symbolTable	TokenNameIdentifier
,	TokenNameCOMMA
grammarPool	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
XML11DTDProcessor	TokenNameIdentifier
(	TokenNameLPAREN
SymbolTable	TokenNameIdentifier
symbolTable	TokenNameIdentifier
,	TokenNameCOMMA
XMLGrammarPool	TokenNameIdentifier
grammarPool	TokenNameIdentifier
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
errorReporter	TokenNameIdentifier
,	TokenNameCOMMA
XMLEntityResolver	TokenNameIdentifier
entityResolver	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
symbolTable	TokenNameIdentifier
,	TokenNameCOMMA
grammarPool	TokenNameIdentifier
,	TokenNameCOMMA
errorReporter	TokenNameIdentifier
,	TokenNameCOMMA
entityResolver	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
isValidNmtoken	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
nmtoken	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
XML11Char	TokenNameIdentifier
.	TokenNameDOT
isXML11ValidNmtoken	TokenNameIdentifier
(	TokenNameLPAREN
nmtoken	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
isValidName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
XML11Char	TokenNameIdentifier
.	TokenNameDOT
isXML11ValidName	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
XMLDTDScannerImpl	TokenNameIdentifier
createDTDScanner	TokenNameIdentifier
(	TokenNameLPAREN
SymbolTable	TokenNameIdentifier
symbolTable	TokenNameIdentifier
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
errorReporter	TokenNameIdentifier
,	TokenNameCOMMA
XMLEntityManager	TokenNameIdentifier
entityManager	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
XML11DTDScannerImpl	TokenNameIdentifier
(	TokenNameLPAREN
symbolTable	TokenNameIdentifier
,	TokenNameCOMMA
errorReporter	TokenNameIdentifier
,	TokenNameCOMMA
entityManager	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
short	TokenNameshort
getScannerVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Constants	TokenNameIdentifier
.	TokenNameDOT
XML_VERSION_1_1	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE