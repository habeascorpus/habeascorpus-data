package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
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
index	TokenNameIdentifier
.	TokenNameDOT
RandomIndexWriter	TokenNameIdentifier
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
Term	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
Directory	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
AfterClass	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
BeforeClass	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestNGramPhraseQuery	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Directory	TokenNameIdentifier
directory	TokenNameIdentifier
;	TokenNameSEMICOLON
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
directory	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
RandomIndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RandomIndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
directory	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
directory	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
AfterClass	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
afterClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
reader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
directory	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
directory	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testRewrite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
PhraseQuery	TokenNameIdentifier
pq1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NGramPhraseQuery	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq1	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"AB"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq1	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"BC"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
pq1	TokenNameIdentifier
.	TokenNameDOT
rewrite	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
instanceof	TokenNameinstanceof
NGramPhraseQuery	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertSame	TokenNameIdentifier
(	TokenNameLPAREN
pq1	TokenNameIdentifier
,	TokenNameCOMMA
q	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
NGramPhraseQuery	TokenNameIdentifier
)	TokenNameRPAREN
q	TokenNameIdentifier
;	TokenNameSEMICOLON
assertArrayEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"AB"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"BC"	TokenNameStringLiteral
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
pq1	TokenNameIdentifier
.	TokenNameDOT
getTerms	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertArrayEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
pq1	TokenNameIdentifier
.	TokenNameDOT
getPositions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PhraseQuery	TokenNameIdentifier
pq2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NGramPhraseQuery	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq2	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"AB"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq2	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"BC"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq2	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"CD"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
q	TokenNameIdentifier
=	TokenNameEQUAL
pq2	TokenNameIdentifier
.	TokenNameDOT
rewrite	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
instanceof	TokenNameinstanceof
PhraseQuery	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotSame	TokenNameIdentifier
(	TokenNameLPAREN
pq2	TokenNameIdentifier
,	TokenNameCOMMA
q	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
PhraseQuery	TokenNameIdentifier
)	TokenNameRPAREN
q	TokenNameIdentifier
;	TokenNameSEMICOLON
assertArrayEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"AB"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"CD"	TokenNameStringLiteral
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
pq2	TokenNameIdentifier
.	TokenNameDOT
getTerms	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertArrayEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
pq2	TokenNameIdentifier
.	TokenNameDOT
getPositions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PhraseQuery	TokenNameIdentifier
pq3	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NGramPhraseQuery	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq3	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"ABC"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq3	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"BCD"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq3	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"CDE"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq3	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"DEF"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq3	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"EFG"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq3	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"FGH"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
q	TokenNameIdentifier
=	TokenNameEQUAL
pq3	TokenNameIdentifier
.	TokenNameDOT
rewrite	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
instanceof	TokenNameinstanceof
PhraseQuery	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotSame	TokenNameIdentifier
(	TokenNameLPAREN
pq3	TokenNameIdentifier
,	TokenNameCOMMA
q	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pq3	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
PhraseQuery	TokenNameIdentifier
)	TokenNameRPAREN
q	TokenNameIdentifier
;	TokenNameSEMICOLON
assertArrayEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"ABC"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"DEF"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"f"	TokenNameStringLiteral
,	TokenNameCOMMA
"FGH"	TokenNameStringLiteral
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
pq3	TokenNameIdentifier
.	TokenNameDOT
getTerms	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertArrayEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
}	TokenNameRBRACE
,	TokenNameCOMMA
pq3	TokenNameIdentifier
.	TokenNameDOT
getPositions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE