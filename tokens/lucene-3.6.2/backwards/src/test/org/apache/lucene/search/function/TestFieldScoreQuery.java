package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
function	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
IndexReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
IndexSearcher	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
Query	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
QueryUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
ScoreDoc	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
TopDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
BeforeClass	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestFieldScoreQuery	TokenNameIdentifier
extends	TokenNameextends
FunctionTestSetup	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
BeforeClass	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
beforeClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
createIndex	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRankByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestRank	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
BYTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRankShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestRank	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
SHORT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRankInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestRank	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
INT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRankFloat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestRank	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
FLOAT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doTestRank	TokenNameIdentifier
(	TokenNameLPAREN
FLOAT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
FLOAT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
doTestRank	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
tp	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
IndexSearcher	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexSearcher	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldScoreQuery	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
tp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
"test: "	TokenNameStringLiteral
+	TokenNamePLUS
q	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
QueryUtils	TokenNameIdentifier
.	TokenNameDOT
check	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
q	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
h	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
scoreDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"All docs should be matched!"	TokenNameStringLiteral
,	TokenNameCOMMA
N_DOCS	TokenNameIdentifier
,	TokenNameCOMMA
h	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
prevID	TokenNameIdentifier
=	TokenNameEQUAL
"ID"	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
N_DOCS	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
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
h	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
resID	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
(	TokenNameLPAREN
h	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
doc	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
ID_FIELD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
".   score="	TokenNameStringLiteral
+	TokenNamePLUS
h	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
score	TokenNameIdentifier
+	TokenNamePLUS
"  -  "	TokenNameStringLiteral
+	TokenNamePLUS
resID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
explain	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
h	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
doc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"res id "	TokenNameStringLiteral
+	TokenNamePLUS
resID	TokenNameIdentifier
+	TokenNamePLUS
" should be < prev res id "	TokenNameStringLiteral
+	TokenNamePLUS
prevID	TokenNameIdentifier
,	TokenNameCOMMA
resID	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
prevID	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
prevID	TokenNameIdentifier
=	TokenNameEQUAL
resID	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
s	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testExactScoreByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestExactScore	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
BYTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testExactScoreShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestExactScore	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
SHORT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testExactScoreInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestExactScore	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
INT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testExactScoreFloat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestExactScore	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
FLOAT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doTestExactScore	TokenNameIdentifier
(	TokenNameLPAREN
FLOAT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
FLOAT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
doTestExactScore	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
tp	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
IndexSearcher	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexSearcher	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldScoreQuery	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
tp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TopDocs	TokenNameIdentifier
td	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"All docs should be matched!"	TokenNameStringLiteral
,	TokenNameCOMMA
N_DOCS	TokenNameIdentifier
,	TokenNameCOMMA
td	TokenNameIdentifier
.	TokenNameDOT
totalHits	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
sd	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
td	TokenNameIdentifier
.	TokenNameDOT
scoreDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
ScoreDoc	TokenNameIdentifier
aSd	TokenNameIdentifier
:	TokenNameCOLON
sd	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
score	TokenNameIdentifier
=	TokenNameEQUAL
aSd	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
explain	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
aSd	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
id	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
document	TokenNameIdentifier
(	TokenNameLPAREN
aSd	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
ID_FIELD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
expectedScore	TokenNameIdentifier
=	TokenNameEQUAL
expectedFieldScore	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"score of "	TokenNameStringLiteral
+	TokenNamePLUS
id	TokenNameIdentifier
+	TokenNamePLUS
" shuould be "	TokenNameStringLiteral
+	TokenNamePLUS
expectedScore	TokenNameIdentifier
+	TokenNamePLUS
" != "	TokenNameStringLiteral
+	TokenNamePLUS
score	TokenNameIdentifier
,	TokenNameCOMMA
expectedScore	TokenNameIdentifier
,	TokenNameCOMMA
score	TokenNameIdentifier
,	TokenNameCOMMA
TEST_SCORE_TOLERANCE_DELTA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
s	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testCachingByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestCaching	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
BYTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testCachingShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestCaching	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
SHORT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testCachingInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestCaching	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
INT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testCachingFloat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
doTestCaching	TokenNameIdentifier
(	TokenNameLPAREN
INT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
FLOAT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doTestCaching	TokenNameIdentifier
(	TokenNameLPAREN
FLOAT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
FLOAT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
doTestCaching	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
tp	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
HashMap	TokenNameIdentifier
<	TokenNameLESS
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
expectedArrayTypes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedArrayTypes	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
BYTE	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedArrayTypes	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
SHORT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
short	TokenNameshort
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedArrayTypes	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
INT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectedArrayTypes	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
FieldScoreQuery	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
FLOAT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexSearcher	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexSearcher	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSequentialSubReaders	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
boolean	TokenNameboolean
warned	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
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
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
FieldScoreQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldScoreQuery	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
tp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
h	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
scoreDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"All docs should be matched!"	TokenNameStringLiteral
,	TokenNameCOMMA
N_DOCS	TokenNameIdentifier
,	TokenNameCOMMA
h	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
readers	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSequentialSubReaders	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
readers	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
readers	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
innerArray	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
q	TokenNameIdentifier
.	TokenNameDOT
valSrc	TokenNameIdentifier
.	TokenNameDOT
getValues	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getInnerArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
".  compare: "	TokenNameStringLiteral
+	TokenNamePLUS
innerArray	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" to "	TokenNameStringLiteral
+	TokenNamePLUS
expectedArrayTypes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
tp	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"field values should be cached in the correct array type!"	TokenNameStringLiteral
,	TokenNameCOMMA
innerArray	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
expectedArrayTypes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
tp	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
".  compare: "	TokenNameStringLiteral
+	TokenNamePLUS
innerArray	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
" to "	TokenNameStringLiteral
+	TokenNamePLUS
q	TokenNameIdentifier
.	TokenNameDOT
valSrc	TokenNameIdentifier
.	TokenNameDOT
getValues	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getInnerArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertSame	TokenNameIdentifier
(	TokenNameLPAREN
"field values should be cached and reused!"	TokenNameStringLiteral
,	TokenNameCOMMA
innerArray	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
q	TokenNameIdentifier
.	TokenNameDOT
valSrc	TokenNameIdentifier
.	TokenNameDOT
getValues	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getInnerArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
UnsupportedOperationException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
warned	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"WARNING: "	TokenNameStringLiteral
+	TokenNamePLUS
testName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" cannot fully test values of "	TokenNameStringLiteral
+	TokenNamePLUS
q	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
warned	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
s	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexSearcher	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FieldScoreQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldScoreQuery	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
tp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
h	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
scoreDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"All docs should be matched!"	TokenNameStringLiteral
,	TokenNameCOMMA
N_DOCS	TokenNameIdentifier
,	TokenNameCOMMA
h	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
readers	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSequentialSubReaders	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
readers	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
readers	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"compare: "	TokenNameStringLiteral
+	TokenNamePLUS
innerArray	TokenNameIdentifier
+	TokenNamePLUS
" to "	TokenNameStringLiteral
+	TokenNamePLUS
q	TokenNameIdentifier
.	TokenNameDOT
valSrc	TokenNameIdentifier
.	TokenNameDOT
getValues	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getInnerArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotSame	TokenNameIdentifier
(	TokenNameLPAREN
"cached field values should not be reused if reader as changed!"	TokenNameStringLiteral
,	TokenNameCOMMA
innerArray	TokenNameIdentifier
,	TokenNameCOMMA
q	TokenNameIdentifier
.	TokenNameDOT
valSrc	TokenNameIdentifier
.	TokenNameDOT
getValues	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getInnerArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
UnsupportedOperationException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
warned	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"WARNING: "	TokenNameStringLiteral
+	TokenNamePLUS
testName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" cannot fully test values of "	TokenNameStringLiteral
+	TokenNamePLUS
q	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
warned	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
s	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
testName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"."	TokenNameStringLiteral
+	TokenNamePLUS
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE