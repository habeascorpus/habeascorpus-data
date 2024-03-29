package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
spans	TokenNameIdentifier
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
standard	TokenNameIdentifier
.	TokenNameDOT
StandardAnalyzer	TokenNameIdentifier
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
index	TokenNameIdentifier
.	TokenNameDOT
IndexWriterConfig	TokenNameIdentifier
.	TokenNameDOT
OpenMode	TokenNameIdentifier
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
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestSpansAdvanced2	TokenNameIdentifier
extends	TokenNameextends
TestSpansAdvanced	TokenNameIdentifier
{	TokenNameLBRACE
IndexSearcher	TokenNameIdentifier
searcher2	TokenNameIdentifier
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
reader2	TokenNameIdentifier
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
final	TokenNamefinal
RandomIndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RandomIndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
mDirectory	TokenNameIdentifier
,	TokenNameCOMMA
newIndexWriterConfig	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
StandardAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setOpenMode	TokenNameIdentifier
(	TokenNameLPAREN
OpenMode	TokenNameIdentifier
.	TokenNameDOT
APPEND	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
newLogMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
,	TokenNameCOMMA
"A"	TokenNameStringLiteral
,	TokenNameCOMMA
"Should we, could we, would we?"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
,	TokenNameCOMMA
"B"	TokenNameStringLiteral
,	TokenNameCOMMA
"It should.  Should it?"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
,	TokenNameCOMMA
"C"	TokenNameStringLiteral
,	TokenNameCOMMA
"It shouldn't."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
,	TokenNameCOMMA
"D"	TokenNameStringLiteral
,	TokenNameCOMMA
"Should we, should we, should we."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader2	TokenNameIdentifier
=	TokenNameEQUAL
writer	TokenNameIdentifier
.	TokenNameDOT
getReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
searcher2	TokenNameIdentifier
=	TokenNameEQUAL
newSearcher	TokenNameIdentifier
(	TokenNameLPAREN
reader2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
searcher2	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader2	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testVerifyIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
mDirectory	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
reader	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSingleSpanQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
Query	TokenNameIdentifier
spanQuery	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
FIELD_TEXT	TokenNameIdentifier
,	TokenNameCOMMA
"should"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectedIds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"B"	TokenNameStringLiteral
,	TokenNameCOMMA
"D"	TokenNameStringLiteral
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2"	TokenNameStringLiteral
,	TokenNameCOMMA
"3"	TokenNameStringLiteral
,	TokenNameCOMMA
"4"	TokenNameStringLiteral
,	TokenNameCOMMA
"A"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectedScores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0.625f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.45927936f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.35355338f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.35355338f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.35355338f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.35355338f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.26516503f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
}	TokenNameRBRACE
;	TokenNameSEMICOLON
assertHits	TokenNameIdentifier
(	TokenNameLPAREN
searcher2	TokenNameIdentifier
,	TokenNameCOMMA
spanQuery	TokenNameIdentifier
,	TokenNameCOMMA
"single span query"	TokenNameStringLiteral
,	TokenNameCOMMA
expectedIds	TokenNameIdentifier
,	TokenNameCOMMA
expectedScores	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMultipleDifferentSpanQueries	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
Query	TokenNameIdentifier
spanQuery1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
FIELD_TEXT	TokenNameIdentifier
,	TokenNameCOMMA
"should"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Query	TokenNameIdentifier
spanQuery2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
FIELD_TEXT	TokenNameIdentifier
,	TokenNameCOMMA
"we"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
BooleanQuery	TokenNameIdentifier
query	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BooleanQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
query	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
spanQuery1	TokenNameIdentifier
,	TokenNameCOMMA
BooleanClause	TokenNameIdentifier
.	TokenNameDOT
Occur	TokenNameIdentifier
.	TokenNameDOT
MUST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
query	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
spanQuery2	TokenNameIdentifier
,	TokenNameCOMMA
BooleanClause	TokenNameIdentifier
.	TokenNameDOT
Occur	TokenNameIdentifier
.	TokenNameDOT
MUST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectedIds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"D"	TokenNameStringLiteral
,	TokenNameCOMMA
"A"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectedScores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
1.0191123f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.93163157f	TokenNameFloatingPointLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
assertHits	TokenNameIdentifier
(	TokenNameLPAREN
searcher2	TokenNameIdentifier
,	TokenNameCOMMA
query	TokenNameIdentifier
,	TokenNameCOMMA
"multiple different span queries"	TokenNameStringLiteral
,	TokenNameCOMMA
expectedIds	TokenNameIdentifier
,	TokenNameCOMMA
expectedScores	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testBooleanQueryWithSpanQueries	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
doTestBooleanQueryWithSpanQueries	TokenNameIdentifier
(	TokenNameLPAREN
searcher2	TokenNameIdentifier
,	TokenNameCOMMA
0.73500174f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
