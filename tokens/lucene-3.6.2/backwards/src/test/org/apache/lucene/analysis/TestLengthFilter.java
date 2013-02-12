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
public	TokenNamepublic
class	TokenNameclass
TestLengthFilter	TokenNameIdentifier
extends	TokenNameextends
BaseTokenStreamTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testFilterNoPosIncr	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
TokenStream	TokenNameIdentifier
stream	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
"short toolong evenmuchlongertext a ab toolong foo"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
WHITESPACE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
LengthFilter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LengthFilter	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
stream	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTokenStreamContents	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"short"	TokenNameStringLiteral
,	TokenNameCOMMA
"ab"	TokenNameStringLiteral
,	TokenNameCOMMA
"foo"	TokenNameStringLiteral
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
testFilterWithPosIncr	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
TokenStream	TokenNameIdentifier
stream	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
"short toolong evenmuchlongertext a ab toolong foo"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
WHITESPACE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
LengthFilter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LengthFilter	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
stream	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTokenStreamContents	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"short"	TokenNameStringLiteral
,	TokenNameCOMMA
"ab"	TokenNameStringLiteral
,	TokenNameCOMMA
"foo"	TokenNameStringLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE