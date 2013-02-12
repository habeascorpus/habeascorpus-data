package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
ja	TokenNameIdentifier
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
KeywordTokenizer	TokenNameIdentifier
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
Tokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestJapaneseBaseFormFilter	TokenNameIdentifier
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
tokenizer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JapaneseTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
JapaneseTokenizer	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_MODE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
TokenStreamComponents	TokenNameIdentifier
(	TokenNameLPAREN
tokenizer	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
JapaneseBaseFormFilter	TokenNameIdentifier
(	TokenNameLPAREN
tokenizer	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
testBasics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"それはまだ実験段階にあります"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"それ"	TokenNameStringLiteral
,	TokenNameCOMMA
"は"	TokenNameStringLiteral
,	TokenNameCOMMA
"まだ"	TokenNameStringLiteral
,	TokenNameCOMMA
"実験"	TokenNameStringLiteral
,	TokenNameCOMMA
"段階"	TokenNameStringLiteral
,	TokenNameCOMMA
"に"	TokenNameStringLiteral
,	TokenNameCOMMA
"ある"	TokenNameStringLiteral
,	TokenNameCOMMA
"ます"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testEnglish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"this atest"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"this"	TokenNameStringLiteral
,	TokenNameCOMMA
"atest"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testRandomStrings	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
checkRandomData	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
10000	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
JapaneseBaseFormFilter	TokenNameIdentifier
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