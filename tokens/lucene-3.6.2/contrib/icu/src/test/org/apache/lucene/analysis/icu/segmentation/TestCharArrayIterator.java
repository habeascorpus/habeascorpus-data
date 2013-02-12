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
text	TokenNameIdentifier
.	TokenNameDOT
CharacterIterator	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
TestCharArrayIterator	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testBasicUsage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
"testing"	TokenNameStringLiteral
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
"testing"	TokenNameStringLiteral
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
getBeginIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
getEndIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
't'	TokenNameCharacterLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
'e'	TokenNameCharacterLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
'g'	TokenNameCharacterLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
last	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
'n'	TokenNameCharacterLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
previous	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
't'	TokenNameCharacterLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
CharacterIterator	TokenNameIdentifier
.	TokenNameDOT
DONE	TokenNameIdentifier
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
previous	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFirst	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
"testing"	TokenNameStringLiteral
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
"testing"	TokenNameStringLiteral
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ci	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
't'	TokenNameCharacterLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
ci	TokenNameIdentifier
.	TokenNameDOT
getBeginIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ci	TokenNameIdentifier
.	TokenNameDOT
setText	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
}	TokenNameRBRACE
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
CharacterIterator	TokenNameIdentifier
.	TokenNameDOT
DONE	TokenNameIdentifier
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testLast	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
"testing"	TokenNameStringLiteral
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
"testing"	TokenNameStringLiteral
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
'g'	TokenNameCharacterLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
last	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
ci	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
getEndIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ci	TokenNameIdentifier
.	TokenNameDOT
setText	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
}	TokenNameRBRACE
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
CharacterIterator	TokenNameIdentifier
.	TokenNameDOT
DONE	TokenNameIdentifier
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
last	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
ci	TokenNameIdentifier
.	TokenNameDOT
getEndIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCurrent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
"testing"	TokenNameStringLiteral
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
"testing"	TokenNameStringLiteral
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
't'	TokenNameCharacterLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ci	TokenNameIdentifier
.	TokenNameDOT
last	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ci	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
CharacterIterator	TokenNameIdentifier
.	TokenNameDOT
DONE	TokenNameIdentifier
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
"te"	TokenNameStringLiteral
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
'e'	TokenNameCharacterLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
CharacterIterator	TokenNameIdentifier
.	TokenNameDOT
DONE	TokenNameIdentifier
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
ci	TokenNameIdentifier
.	TokenNameDOT
getEndIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ci	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSetIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
"test"	TokenNameStringLiteral
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
ci	TokenNameIdentifier
.	TokenNameDOT
setIndex	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
instanceof	TokenNameinstanceof
IllegalArgumentException	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testClone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
char	TokenNamechar
text	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
"testing"	TokenNameStringLiteral
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
ci	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CharArrayIterator	TokenNameIdentifier
ci2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CharArrayIterator	TokenNameIdentifier
)	TokenNameRPAREN
ci	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
ci	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ci2	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
ci	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ci2	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
ci	TokenNameIdentifier
.	TokenNameDOT
last	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ci2	TokenNameIdentifier
.	TokenNameDOT
last	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE