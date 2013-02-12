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
TestFrenchLightStemFilter	TokenNameIdentifier
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
FrenchLightStemFilter	TokenNameIdentifier
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
"cheval"	TokenNameStringLiteral
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
"hibou"	TokenNameStringLiteral
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
"chant"	TokenNameStringLiteral
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
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"peaux"	TokenNameStringLiteral
,	TokenNameCOMMA
"peau"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"peau"	TokenNameStringLiteral
,	TokenNameCOMMA
"peau"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"anneaux"	TokenNameStringLiteral
,	TokenNameCOMMA
"aneau"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"anneau"	TokenNameStringLiteral
,	TokenNameCOMMA
"aneau"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"neveux"	TokenNameStringLiteral
,	TokenNameCOMMA
"neveu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"neveu"	TokenNameStringLiteral
,	TokenNameCOMMA
"neveu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"affreux"	TokenNameStringLiteral
,	TokenNameCOMMA
"afreu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"affreuse"	TokenNameStringLiteral
,	TokenNameCOMMA
"afreu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"investissement"	TokenNameStringLiteral
,	TokenNameCOMMA
"investi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"investir"	TokenNameStringLiteral
,	TokenNameCOMMA
"investi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"assourdissant"	TokenNameStringLiteral
,	TokenNameCOMMA
"asourdi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"assourdir"	TokenNameStringLiteral
,	TokenNameCOMMA
"asourdi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"pratiquement"	TokenNameStringLiteral
,	TokenNameCOMMA
"pratiqu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"pratique"	TokenNameStringLiteral
,	TokenNameCOMMA
"pratiqu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"administrativement"	TokenNameStringLiteral
,	TokenNameCOMMA
"administratif"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"administratif"	TokenNameStringLiteral
,	TokenNameCOMMA
"administratif"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"justificatrice"	TokenNameStringLiteral
,	TokenNameCOMMA
"justifi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"justificateur"	TokenNameStringLiteral
,	TokenNameCOMMA
"justifi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"justifier"	TokenNameStringLiteral
,	TokenNameCOMMA
"justifi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"educatrice"	TokenNameStringLiteral
,	TokenNameCOMMA
"eduqu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"eduquer"	TokenNameStringLiteral
,	TokenNameCOMMA
"eduqu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"communicateur"	TokenNameStringLiteral
,	TokenNameCOMMA
"comuniqu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"communiquer"	TokenNameStringLiteral
,	TokenNameCOMMA
"comuniqu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"accompagnatrice"	TokenNameStringLiteral
,	TokenNameCOMMA
"acompagn"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"accompagnateur"	TokenNameStringLiteral
,	TokenNameCOMMA
"acompagn"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"administrateur"	TokenNameStringLiteral
,	TokenNameCOMMA
"administr"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"administrer"	TokenNameStringLiteral
,	TokenNameCOMMA
"administr"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"productrice"	TokenNameStringLiteral
,	TokenNameCOMMA
"product"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"producteur"	TokenNameStringLiteral
,	TokenNameCOMMA
"product"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"acheteuse"	TokenNameStringLiteral
,	TokenNameCOMMA
"achet"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"acheteur"	TokenNameStringLiteral
,	TokenNameCOMMA
"achet"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"planteur"	TokenNameStringLiteral
,	TokenNameCOMMA
"plant"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"plante"	TokenNameStringLiteral
,	TokenNameCOMMA
"plant"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"poreuse"	TokenNameStringLiteral
,	TokenNameCOMMA
"poreu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"poreux"	TokenNameStringLiteral
,	TokenNameCOMMA
"poreu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"plieuse"	TokenNameStringLiteral
,	TokenNameCOMMA
"plieu"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"bijoutière"	TokenNameStringLiteral
,	TokenNameCOMMA
"bijouti"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"bijoutier"	TokenNameStringLiteral
,	TokenNameCOMMA
"bijouti"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"caissière"	TokenNameStringLiteral
,	TokenNameCOMMA
"caisi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"caissier"	TokenNameStringLiteral
,	TokenNameCOMMA
"caisi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"abrasive"	TokenNameStringLiteral
,	TokenNameCOMMA
"abrasif"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"abrasif"	TokenNameStringLiteral
,	TokenNameCOMMA
"abrasif"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"folle"	TokenNameStringLiteral
,	TokenNameCOMMA
"fou"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"fou"	TokenNameStringLiteral
,	TokenNameCOMMA
"fou"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"personnelle"	TokenNameStringLiteral
,	TokenNameCOMMA
"person"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"personne"	TokenNameStringLiteral
,	TokenNameCOMMA
"person"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"complète"	TokenNameStringLiteral
,	TokenNameCOMMA
"complet"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"complet"	TokenNameStringLiteral
,	TokenNameCOMMA
"complet"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"aromatique"	TokenNameStringLiteral
,	TokenNameCOMMA
"aromat"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"faiblesse"	TokenNameStringLiteral
,	TokenNameCOMMA
"faibl"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"faible"	TokenNameStringLiteral
,	TokenNameCOMMA
"faibl"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"patinage"	TokenNameStringLiteral
,	TokenNameCOMMA
"patin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"patin"	TokenNameStringLiteral
,	TokenNameCOMMA
"patin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"sonorisation"	TokenNameStringLiteral
,	TokenNameCOMMA
"sono"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"ritualisation"	TokenNameStringLiteral
,	TokenNameCOMMA
"rituel"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"rituel"	TokenNameStringLiteral
,	TokenNameCOMMA
"rituel"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"nomination"	TokenNameStringLiteral
,	TokenNameCOMMA
"nomin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"disposition"	TokenNameStringLiteral
,	TokenNameCOMMA
"dispos"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTerm	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"dispose"	TokenNameStringLiteral
,	TokenNameCOMMA
"dispos"	TokenNameStringLiteral
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
"frlighttestdata.zip"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"frlight.txt"	TokenNameStringLiteral
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
FrenchLightStemFilter	TokenNameIdentifier
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