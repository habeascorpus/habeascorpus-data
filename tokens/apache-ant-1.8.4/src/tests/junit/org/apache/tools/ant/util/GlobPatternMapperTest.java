package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
GlobPatternMapperTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
GlobPatternMapperTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoPatternAtAll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
GlobPatternMapper	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GlobPatternMapper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
setFrom	TokenNameIdentifier
(	TokenNameLPAREN
"foobar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
setTo	TokenNameIdentifier
(	TokenNameLPAREN
"baz"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
"Shouldn't match foobar"	TokenNameStringLiteral
,	TokenNameCOMMA
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"plonk"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
result	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"foobar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"Should match foobar"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"only one result for foobar"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"baz"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testPostfixOnly	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
GlobPatternMapper	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GlobPatternMapper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
setFrom	TokenNameIdentifier
(	TokenNameLPAREN
"*foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
setTo	TokenNameIdentifier
(	TokenNameLPAREN
"*plonk"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
"Shouldn't match *foo"	TokenNameStringLiteral
,	TokenNameCOMMA
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"bar.baz"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
result	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"bar.foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"Should match *.foo"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"only one result for bar.foo"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"bar.plonk"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
setTo	TokenNameIdentifier
(	TokenNameLPAREN
"foo*"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"bar.foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"foobar."	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testPrefixOnly	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
GlobPatternMapper	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GlobPatternMapper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
setFrom	TokenNameIdentifier
(	TokenNameLPAREN
"foo*"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
setTo	TokenNameIdentifier
(	TokenNameLPAREN
"plonk*"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
"Shouldn't match foo*"	TokenNameStringLiteral
,	TokenNameCOMMA
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"bar.baz"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
result	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"foo.bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"Should match foo*"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"only one result for foo.bar"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"plonk.bar"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
setTo	TokenNameIdentifier
(	TokenNameLPAREN
"*foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"foo.bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
".barfoo"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testPreAndPostfix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
GlobPatternMapper	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GlobPatternMapper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
setFrom	TokenNameIdentifier
(	TokenNameLPAREN
"foo*bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
setTo	TokenNameIdentifier
(	TokenNameLPAREN
"plonk*pling"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
"Shouldn't match foo*bar"	TokenNameStringLiteral
,	TokenNameCOMMA
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"bar.baz"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
result	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"foo.bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"Should match foo*bar"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"only one result for foo.bar"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"plonk.pling"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"foo.baz.bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"Should match foo*bar"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"only one result for foo.baz.bar"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"plonk.baz.pling"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
"foobar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"Should match foo*bar"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"only one result for foobar"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"plonkpling"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
