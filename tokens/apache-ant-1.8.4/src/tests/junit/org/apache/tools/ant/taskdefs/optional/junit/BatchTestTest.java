package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
optional	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
ComparisonFailure	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
BatchTestTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
BatchTestTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
testName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
testName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testParseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"IllegalArgumentException expected when the param is <null>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"  "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
","	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
" ,"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
", "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
" , "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
",a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
" ,a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"  ,a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"  , a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"  ,a  "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"  ,a  ,"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"ab,,cd"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"ab, ,cd"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"ab,  ,cd"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"ab,  ,cd,"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
",ab,  ,cd,"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc  "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc,"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc, "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc ,"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc , "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc  ,"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"a"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"a1"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"a1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"a$"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"a$"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"a$1"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"a$1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"_bc"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"_bc"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"___"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"___"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"1a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"1ab"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"1abc"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"1abc d"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"1abc de"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"1abc def"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
"1abc def,"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
",1abc def"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc,def"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc,def,"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc,def "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc, def"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc, def "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc ,def"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc ,def "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc , def"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
"abc , def "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc,def"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc,def "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc, def"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc, def "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc ,def"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc ,def "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc , def"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc , def "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"def"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
" abc , def ,"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
checkParseCausesIAE	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
param	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
JUnitTest	TokenNameIdentifier
.	TokenNameDOT
parseTestMethodNamesList	TokenNameIdentifier
(	TokenNameLPAREN
param	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"IllegalArgumentException expected when the param is ""	TokenNameStringLiteral
+	TokenNamePLUS
param	TokenNameIdentifier
+	TokenNamePLUS
'"'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expected	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
actual	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
expected	TokenNameIdentifier
,	TokenNameCOMMA
actual	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expected	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
actual	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
expected	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
actual	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
expected	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
actual	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ComparisonFailure	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
expected	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
actual	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
expected	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
actual	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE