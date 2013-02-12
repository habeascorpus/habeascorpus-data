package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
icu	TokenNameIdentifier
.	TokenNameDOT
segmentation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
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
LuceneTestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
ibm	TokenNameIdentifier
.	TokenNameDOT
icu	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
UCharacter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
ibm	TokenNameIdentifier
.	TokenNameDOT
icu	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
BreakIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
ibm	TokenNameIdentifier
.	TokenNameDOT
icu	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
RuleBasedBreakIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
ibm	TokenNameIdentifier
.	TokenNameDOT
icu	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
UTF16	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestLaoBreakIterator	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
BreakIterator	TokenNameIdentifier
wordIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
=	TokenNameEQUAL
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
"Lao.brk"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
wordIterator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LaoBreakIterator	TokenNameIdentifier
(	TokenNameLPAREN
RuleBasedBreakIterator	TokenNameIdentifier
.	TokenNameDOT
getInstanceFromCompiledRules	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
is	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertBreaksTo	TokenNameIdentifier
(	TokenNameLPAREN
BreakIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
sourceText	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
tokens	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
char	TokenNamechar
text	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
sourceText	TokenNameIdentifier
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CharArrayIterator	TokenNameIdentifier
ci	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CharArrayIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ci	TokenNameIdentifier
.	TokenNameDOT
setText	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
text	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iterator	TokenNameIdentifier
.	TokenNameDOT
setText	TokenNameIdentifier
(	TokenNameLPAREN
ci	TokenNameIdentifier
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
tokens	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
;	TokenNameSEMICOLON
do	TokenNamedo
{	TokenNameLBRACE
start	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
.	TokenNameDOT
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
end	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
end	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
BreakIterator	TokenNameIdentifier
.	TokenNameDOT
DONE	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
isWord	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
BreakIterator	TokenNameIdentifier
.	TokenNameDOT
DONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
end	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
BreakIterator	TokenNameIdentifier
.	TokenNameDOT
DONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
tokens	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
BreakIterator	TokenNameIdentifier
.	TokenNameDOT
DONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
isWord	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
text	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
codepoint	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
start	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
end	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
UTF16	TokenNameIdentifier
.	TokenNameDOT
getCharCount	TokenNameIdentifier
(	TokenNameLPAREN
codepoint	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
codepoint	TokenNameIdentifier
=	TokenNameEQUAL
UTF16	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
end	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
UCharacter	TokenNameIdentifier
.	TokenNameDOT
isLetterOrDigit	TokenNameIdentifier
(	TokenNameLPAREN
codepoint	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBasicUsage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
assertBreaksTo	TokenNameIdentifier
(	TokenNameLPAREN
wordIterator	TokenNameIdentifier
,	TokenNameCOMMA
"ກວ່າດອກ"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"ກວ່າ"	TokenNameStringLiteral
,	TokenNameCOMMA
"ດອກ"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertBreaksTo	TokenNameIdentifier
(	TokenNameLPAREN
wordIterator	TokenNameIdentifier
,	TokenNameCOMMA
"ຜູ້​ເຂົ້າ"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"ຜູ້"	TokenNameStringLiteral
,	TokenNameCOMMA
"ເຂົ້າ"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertBreaksTo	TokenNameIdentifier
(	TokenNameLPAREN
wordIterator	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertBreaksTo	TokenNameIdentifier
(	TokenNameLPAREN
wordIterator	TokenNameIdentifier
,	TokenNameCOMMA
"ສະບາຍດີ"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"ສະ"	TokenNameStringLiteral
,	TokenNameCOMMA
"ບາຍ"	TokenNameStringLiteral
,	TokenNameCOMMA
"ດີ"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNumerics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
assertBreaksTo	TokenNameIdentifier
(	TokenNameLPAREN
wordIterator	TokenNameIdentifier
,	TokenNameCOMMA
"໐໑໒໓"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"໐໑໒໓"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertBreaksTo	TokenNameIdentifier
(	TokenNameLPAREN
wordIterator	TokenNameIdentifier
,	TokenNameCOMMA
"໐໑໒໓.໕໖"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"໐໑໒໓.໕໖"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testTextAndNumerics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
assertBreaksTo	TokenNameIdentifier
(	TokenNameLPAREN
wordIterator	TokenNameIdentifier
,	TokenNameCOMMA
"ກວ່າດອກ໐໑໒໓"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"ກວ່າ"	TokenNameStringLiteral
,	TokenNameCOMMA
"ດອກ"	TokenNameStringLiteral
,	TokenNameCOMMA
"໐໑໒໓"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE