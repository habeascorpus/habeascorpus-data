package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
_TestUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestMockAnalyzer	TokenNameIdentifier
extends	TokenNameextends
BaseTokenStreamTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testWhitespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"A bc defg hiJklmn opqrstuv wxy z "	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"bc"	TokenNameStringLiteral
,	TokenNameCOMMA
"defg"	TokenNameStringLiteral
,	TokenNameCOMMA
"hijklmn"	TokenNameStringLiteral
,	TokenNameCOMMA
"opqrstuv"	TokenNameStringLiteral
,	TokenNameCOMMA
"wxy"	TokenNameStringLiteral
,	TokenNameCOMMA
"z"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesToReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"aba cadaba shazam"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"aba"	TokenNameStringLiteral
,	TokenNameCOMMA
"cadaba"	TokenNameStringLiteral
,	TokenNameCOMMA
"shazam"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesToReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"break on whitespace"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"break"	TokenNameStringLiteral
,	TokenNameCOMMA
"on"	TokenNameStringLiteral
,	TokenNameCOMMA
"whitespace"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSimple	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
SIMPLE	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"a-bc123 defg+hijklmn567opqrstuv78wxy_z "	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"bc"	TokenNameStringLiteral
,	TokenNameCOMMA
"defg"	TokenNameStringLiteral
,	TokenNameCOMMA
"hijklmn"	TokenNameStringLiteral
,	TokenNameCOMMA
"opqrstuv"	TokenNameStringLiteral
,	TokenNameCOMMA
"wxy"	TokenNameStringLiteral
,	TokenNameCOMMA
"z"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesToReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"aba4cadaba-Shazam"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"aba"	TokenNameStringLiteral
,	TokenNameCOMMA
"cadaba"	TokenNameStringLiteral
,	TokenNameCOMMA
"shazam"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesToReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"break+on/Letters"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"break"	TokenNameStringLiteral
,	TokenNameCOMMA
"on"	TokenNameStringLiteral
,	TokenNameCOMMA
"letters"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testKeyword	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
KEYWORD	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"a-bc123 defg+hijklmn567opqrstuv78wxy_z "	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"a-bc123 defg+hijklmn567opqrstuv78wxy_z "	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesToReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"aba4cadaba-Shazam"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"aba4cadaba-Shazam"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesToReuse	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"break+on/Nothing"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"break+on/Nothing"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testStop	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
SIMPLE	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
(	TokenNameLPAREN
CharArraySet	TokenNameIdentifier
)	TokenNameRPAREN
StopAnalyzer	TokenNameIdentifier
.	TokenNameDOT
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"the quick brown a fox"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"quick"	TokenNameStringLiteral
,	TokenNameCOMMA
"brown"	TokenNameStringLiteral
,	TokenNameCOMMA
"fox"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
SIMPLE	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
(	TokenNameLPAREN
CharArraySet	TokenNameIdentifier
)	TokenNameRPAREN
StopAnalyzer	TokenNameIdentifier
.	TokenNameDOT
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesTo	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"the quick brown a fox"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"quick"	TokenNameStringLiteral
,	TokenNameCOMMA
"brown"	TokenNameStringLiteral
,	TokenNameCOMMA
"fox"	TokenNameStringLiteral
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
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testLUCENE_3042	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
testString	TokenNameIdentifier
=	TokenNameEQUAL
"t"	TokenNameStringLiteral
;	TokenNameSEMICOLON
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TokenStream	TokenNameIdentifier
stream	TokenNameIdentifier
=	TokenNameEQUAL
analyzer	TokenNameIdentifier
.	TokenNameDOT
reusableTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
"dummy"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
testString	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stream	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
stream	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
stream	TokenNameIdentifier
.	TokenNameDOT
end	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stream	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertAnalyzesToReuse	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
testString	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"t"	TokenNameStringLiteral
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
Exception	TokenNameIdentifier
{	TokenNameLBRACE
checkRandomData	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testForwardOffsets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
num	TokenNameIdentifier
=	TokenNameEQUAL
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
10000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
num	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
randomHtmlishString	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
20	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MockCharFilter	TokenNameIdentifier
charfilter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockCharFilter	TokenNameIdentifier
(	TokenNameLPAREN
CharReader	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MockAnalyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TokenStream	TokenNameIdentifier
ts	TokenNameIdentifier
=	TokenNameEQUAL
analyzer	TokenNameIdentifier
.	TokenNameDOT
tokenStream	TokenNameIdentifier
(	TokenNameLPAREN
"bogus"	TokenNameStringLiteral
,	TokenNameCOMMA
charfilter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ts	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
ts	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ts	TokenNameIdentifier
.	TokenNameDOT
end	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ts	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
