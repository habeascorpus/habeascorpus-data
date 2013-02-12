package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
ro	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
CharArraySet	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestRomanianAnalyzer	TokenNameIdentifier
extends	TokenNameextends
BaseTokenStreamTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testResourcesAvailable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
new	TokenNamenew
RomanianAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBasics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RomanianAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTermReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"absenţa"	TokenNameStringLiteral
,	TokenNameCOMMA
"absenţ"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTermReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"absenţi"	TokenNameStringLiteral
,	TokenNameCOMMA
"absenţ"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"îl"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testExclude	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
CharArraySet	TokenNameIdentifier
exclusionSet	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CharArraySet	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
asSet	TokenNameIdentifier
(	TokenNameLPAREN
"absenţa"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Analyzer	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RomanianAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
RomanianAnalyzer	TokenNameIdentifier
.	TokenNameDOT
getDefaultStopSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
exclusionSet	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTermReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"absenţa"	TokenNameStringLiteral
,	TokenNameCOMMA
"absenţa"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkOneTermReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"absenţi"	TokenNameStringLiteral
,	TokenNameCOMMA
"absenţ"	TokenNameStringLiteral
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
new	TokenNamenew
RomanianAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
10000	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RANDOM_MULTIPLIER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
