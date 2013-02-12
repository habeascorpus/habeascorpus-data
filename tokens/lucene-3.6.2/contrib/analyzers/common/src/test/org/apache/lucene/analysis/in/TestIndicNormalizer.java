package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
in	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
StringReader	TokenNameIdentifier
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
TokenFilter	TokenNameIdentifier
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
KeywordTokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestIndicNormalizer	TokenNameIdentifier
extends	TokenNameextends
BaseTokenStreamTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testBasics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
check	TokenNameIdentifier
(	TokenNameLPAREN
"अाॅअाॅ"	TokenNameStringLiteral
,	TokenNameCOMMA
"ऑऑ"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
check	TokenNameIdentifier
(	TokenNameLPAREN
"अाॆअाॆ"	TokenNameStringLiteral
,	TokenNameCOMMA
"ऒऒ"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
check	TokenNameIdentifier
(	TokenNameLPAREN
"अाेअाे"	TokenNameStringLiteral
,	TokenNameCOMMA
"ओओ"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
check	TokenNameIdentifier
(	TokenNameLPAREN
"अाैअाै"	TokenNameStringLiteral
,	TokenNameCOMMA
"औऔ"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
check	TokenNameIdentifier
(	TokenNameLPAREN
"अाअा"	TokenNameStringLiteral
,	TokenNameCOMMA
"आआ"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
check	TokenNameIdentifier
(	TokenNameLPAREN
"अाैर"	TokenNameStringLiteral
,	TokenNameCOMMA
"और"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
check	TokenNameIdentifier
(	TokenNameLPAREN
"ত্‍"	TokenNameStringLiteral
,	TokenNameCOMMA
"ৎ"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
check	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Tokenizer	TokenNameIdentifier
tokenizer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
WHITESPACE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
;	TokenNameSEMICOLON
TokenFilter	TokenNameIdentifier
tf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndicNormalizationFilter	TokenNameIdentifier
(	TokenNameLPAREN
tokenizer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTokenStreamContents	TokenNameIdentifier
(	TokenNameLPAREN
tf	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
output	TokenNameIdentifier
}	TokenNameRBRACE
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
IndicNormalizationFilter	TokenNameIdentifier
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
