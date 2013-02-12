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
util	TokenNameIdentifier
.	TokenNameDOT
LuceneTestCase	TokenNameIdentifier
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
document	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Field	TokenNameIdentifier
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
search	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
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
public	TokenNamepublic
class	TokenNameclass
TestSpansAdvanced	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
Directory	TokenNameIdentifier
mDirectory	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
IndexSearcher	TokenNameIdentifier
searcher	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
FIELD_ID	TokenNameIdentifier
=	TokenNameEQUAL
"ID"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
FIELD_TEXT	TokenNameIdentifier
=	TokenNameEQUAL
"TEXT"	TokenNameStringLiteral
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
mDirectory	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
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
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"I think it should work."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
,	TokenNameCOMMA
"2"	TokenNameStringLiteral
,	TokenNameCOMMA
"I think it should work."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
,	TokenNameCOMMA
"3"	TokenNameStringLiteral
,	TokenNameCOMMA
"I think it should work."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
,	TokenNameCOMMA
"4"	TokenNameStringLiteral
,	TokenNameCOMMA
"I think it should work."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
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
searcher	TokenNameIdentifier
=	TokenNameEQUAL
newSearcher	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
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
searcher	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mDirectory	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mDirectory	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
RandomIndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
text	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
Document	TokenNameIdentifier
document	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Document	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
document	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newField	TokenNameIdentifier
(	TokenNameLPAREN
FIELD_ID	TokenNameIdentifier
,	TokenNameCOMMA
id	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
YES	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
NOT_ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
document	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newField	TokenNameIdentifier
(	TokenNameLPAREN
FIELD_TEXT	TokenNameIdentifier
,	TokenNameCOMMA
text	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
YES	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
document	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
searcher	TokenNameIdentifier
,	TokenNameCOMMA
0.3884282f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
doTestBooleanQueryWithSpanQueries	TokenNameIdentifier
(	TokenNameLPAREN
IndexSearcher	TokenNameIdentifier
s	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
float	TokenNamefloat
expectedScore	TokenNameIdentifier
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
"work"	TokenNameStringLiteral
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
spanQuery	TokenNameIdentifier
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
spanQuery	TokenNameIdentifier
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
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2"	TokenNameStringLiteral
,	TokenNameCOMMA
"3"	TokenNameStringLiteral
,	TokenNameCOMMA
"4"	TokenNameStringLiteral
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
expectedScore	TokenNameIdentifier
,	TokenNameCOMMA
expectedScore	TokenNameIdentifier
,	TokenNameCOMMA
expectedScore	TokenNameIdentifier
,	TokenNameCOMMA
expectedScore	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
assertHits	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
query	TokenNameIdentifier
,	TokenNameCOMMA
"two span queries"	TokenNameStringLiteral
,	TokenNameCOMMA
expectedIds	TokenNameIdentifier
,	TokenNameCOMMA
expectedScores	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
void	TokenNamevoid
assertHits	TokenNameIdentifier
(	TokenNameLPAREN
Searcher	TokenNameIdentifier
s	TokenNameIdentifier
,	TokenNameCOMMA
Query	TokenNameIdentifier
query	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
description	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectedIds	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectedScores	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
QueryUtils	TokenNameIdentifier
.	TokenNameDOT
check	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
query	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
tolerance	TokenNameIdentifier
=	TokenNameEQUAL
1e-5f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
TopDocs	TokenNameIdentifier
topdocs	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
10000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expectedIds	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
topdocs	TokenNameIdentifier
.	TokenNameDOT
totalHits	TokenNameIdentifier
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
topdocs	TokenNameIdentifier
.	TokenNameDOT
totalHits	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
id	TokenNameIdentifier
=	TokenNameEQUAL
topdocs	TokenNameIdentifier
.	TokenNameDOT
scoreDocs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
score	TokenNameIdentifier
=	TokenNameEQUAL
topdocs	TokenNameIdentifier
.	TokenNameDOT
scoreDocs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
score	TokenNameIdentifier
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expectedIds	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
doc	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
FIELD_ID	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
scoreEq	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
expectedScores	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
-	TokenNameMINUS
score	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
tolerance	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
scoreEq	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
" warning, expected score: "	TokenNameStringLiteral
+	TokenNamePLUS
expectedScores	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
", actual "	TokenNameStringLiteral
+	TokenNamePLUS
score	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
explain	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
,	TokenNameCOMMA
id	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expectedScores	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
score	TokenNameIdentifier
,	TokenNameCOMMA
tolerance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
explain	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
,	TokenNameCOMMA
id	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
score	TokenNameIdentifier
,	TokenNameCOMMA
tolerance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
