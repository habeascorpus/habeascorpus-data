package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
fr	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
Analyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
BaseTokenStreamTestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
MockTokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
Tokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
ReusableAnalyzerBase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
KeywordTokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
VocabularyAssert	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestFrenchMinimalStemFilter	TokenNameIdentifier
extends	TokenNameextends
BaseTokenStreamTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ReusableAnalyzerBase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
TokenStreamComponents	TokenNameIdentifier
createComponents	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Tokenizer	TokenNameIdentifier
source	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
WHITESPACE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
TokenStreamComponents	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
FrenchMinimalStemFilter	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
testExamples	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"chevaux"	TokenNameStringLiteral
,	TokenNameCOMMA
"cheval"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"hiboux"	TokenNameStringLiteral
,	TokenNameCOMMA
"hibou"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"chantés"	TokenNameStringLiteral
,	TokenNameCOMMA
"chant"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"chanter"	TokenNameStringLiteral
,	TokenNameCOMMA
"chant"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"chante"	TokenNameStringLiteral
,	TokenNameCOMMA
"chant"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"baronnes"	TokenNameStringLiteral
,	TokenNameCOMMA
"baron"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"barons"	TokenNameStringLiteral
,	TokenNameCOMMA
"baron"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"baron"	TokenNameStringLiteral
,	TokenNameCOMMA
"baron"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testVocabulary	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
assertVocabulary	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
getDataFile	TokenNameIdentifier
(	TokenNameLPAREN
"frminimaltestdata.zip"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"frminimal.txt"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testRandomStrings	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
checkRandomData	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
10000	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RANDOM_MULTIPLIER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testEmptyTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ReusableAnalyzerBase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
TokenStreamComponents	TokenNameIdentifier
createComponents	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Tokenizer	TokenNameIdentifier
tokenizer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
KeywordTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
TokenStreamComponents	TokenNameIdentifier
(	TokenNameLPAREN
tokenizer	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
FrenchMinimalStemFilter	TokenNameIdentifier
(	TokenNameLPAREN
tokenizer	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
checkOneTermReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE