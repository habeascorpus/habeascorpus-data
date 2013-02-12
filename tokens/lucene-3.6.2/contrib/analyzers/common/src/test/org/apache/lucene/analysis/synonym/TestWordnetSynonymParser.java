package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
synonym	TokenNameIdentifier
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
MockAnalyzer	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
TestWordnetSynonymParser	TokenNameIdentifier
extends	TokenNameextends
BaseTokenStreamTestCase	TokenNameIdentifier
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
synonymsFile	TokenNameIdentifier
=	TokenNameEQUAL
"s(100000001,1,'woods',n,1,0). "	TokenNameStringLiteral
+	TokenNamePLUS
"s(100000001,2,'wood',n,1,0). "	TokenNameStringLiteral
+	TokenNamePLUS
"s(100000001,3,'forest',n,1,0). "	TokenNameStringLiteral
+	TokenNamePLUS
"s(100000002,1,'wolfish',n,1,0). "	TokenNameStringLiteral
+	TokenNamePLUS
"s(100000002,2,'ravenous',n,1,0). "	TokenNameStringLiteral
+	TokenNamePLUS
"s(100000003,1,'king',n,1,1). "	TokenNameStringLiteral
+	TokenNamePLUS
"s(100000003,2,'baron',n,1,1). "	TokenNameStringLiteral
+	TokenNamePLUS
"s(100000004,1,'king''s evil',n,1,1). "	TokenNameStringLiteral
+	TokenNamePLUS
"s(100000004,2,'king''s meany',n,1,1). "	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
testSynonyms	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
WordnetSynonymParser	TokenNameIdentifier
parser	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
WordnetSynonymParser	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
parser	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
synonymsFile	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
SynonymMap	TokenNameIdentifier
map	TokenNameIdentifier
=	TokenNameEQUAL
parser	TokenNameIdentifier
.	TokenNameDOT
build	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
tokenizer	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
SynonymFilter	TokenNameIdentifier
(	TokenNameLPAREN
tokenizer	TokenNameIdentifier
,	TokenNameCOMMA
map	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"Lost in the woods"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"Lost"	TokenNameStringLiteral
,	TokenNameCOMMA
"in"	TokenNameStringLiteral
,	TokenNameCOMMA
"the"	TokenNameStringLiteral
,	TokenNameCOMMA
"woods"	TokenNameStringLiteral
,	TokenNameCOMMA
"wood"	TokenNameStringLiteral
,	TokenNameCOMMA
"forest"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
12	TokenNameIntegerLiteral
,	TokenNameCOMMA
12	TokenNameIntegerLiteral
,	TokenNameCOMMA
12	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
7	TokenNameIntegerLiteral
,	TokenNameCOMMA
11	TokenNameIntegerLiteral
,	TokenNameCOMMA
17	TokenNameIntegerLiteral
,	TokenNameCOMMA
17	TokenNameIntegerLiteral
,	TokenNameCOMMA
17	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"king"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"king"	TokenNameStringLiteral
,	TokenNameCOMMA
"baron"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
"king's evil"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"king's"	TokenNameStringLiteral
,	TokenNameCOMMA
"king's"	TokenNameStringLiteral
,	TokenNameCOMMA
"evil"	TokenNameStringLiteral
,	TokenNameCOMMA
"meany"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
