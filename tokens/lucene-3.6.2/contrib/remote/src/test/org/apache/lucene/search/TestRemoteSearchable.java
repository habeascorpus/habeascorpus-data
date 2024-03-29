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
analysis	TokenNameIdentifier
.	TokenNameDOT
SimpleAnalyzer	TokenNameIdentifier
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
*	TokenNameMULTIPLY
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
IndexWriter	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashSet	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestRemoteSearchable	TokenNameIdentifier
extends	TokenNameextends
RemoteTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
Directory	TokenNameIdentifier
indexStore	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Searchable	TokenNameIdentifier
local	TokenNameIdentifier
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
indexStore	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
indexStore	TokenNameIdentifier
,	TokenNameCOMMA
newIndexWriterConfig	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
SimpleAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Document	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newField	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"test text"	TokenNameStringLiteral
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
doc	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newField	TokenNameIdentifier
(	TokenNameLPAREN
"other"	TokenNameStringLiteral
,	TokenNameCOMMA
"other test text"	TokenNameStringLiteral
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
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
optimize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
local	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexSearcher	TokenNameIdentifier
(	TokenNameLPAREN
indexStore	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
startServer	TokenNameIdentifier
(	TokenNameLPAREN
local	TokenNameIdentifier
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
local	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
indexStore	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
indexStore	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
search	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
query	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Searchable	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
searchables	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
lookupRemote	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
;	TokenNameSEMICOLON
Searcher	TokenNameIdentifier
searcher	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MultiSearcher	TokenNameIdentifier
(	TokenNameLPAREN
searchables	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
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
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
document	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"document is null and it shouldn't be"	TokenNameStringLiteral
,	TokenNameCOMMA
document	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"test text"	TokenNameStringLiteral
,	TokenNameCOMMA
document	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"document.getFields() Size: "	TokenNameStringLiteral
+	TokenNamePLUS
document	TokenNameIdentifier
.	TokenNameDOT
getFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" is not: "	TokenNameStringLiteral
+	TokenNamePLUS
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
document	TokenNameIdentifier
.	TokenNameDOT
getFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
ftl	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashSet	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ftl	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"other"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FieldSelector	TokenNameIdentifier
fs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SetBasedFieldSelector	TokenNameIdentifier
(	TokenNameLPAREN
ftl	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
emptySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
document	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
fs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"document is null and it shouldn't be"	TokenNameStringLiteral
,	TokenNameCOMMA
document	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"document.getFields() Size: "	TokenNameStringLiteral
+	TokenNamePLUS
document	TokenNameIdentifier
.	TokenNameDOT
getFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" is not: "	TokenNameStringLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
document	TokenNameIdentifier
.	TokenNameDOT
getFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MapFieldSelector	TokenNameIdentifier
(	TokenNameLPAREN
"other"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
document	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
fs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"document is null and it shouldn't be"	TokenNameStringLiteral
,	TokenNameCOMMA
document	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"document.getFields() Size: "	TokenNameStringLiteral
+	TokenNamePLUS
document	TokenNameIdentifier
.	TokenNameDOT
getFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" is not: "	TokenNameStringLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
document	TokenNameIdentifier
.	TokenNameDOT
getFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
search	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testBooleanQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
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
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
BooleanClause	TokenNameIdentifier
.	TokenNameDOT
Occur	TokenNameIdentifier
.	TokenNameDOT
MUST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
search	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testPhraseQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
PhraseQuery	TokenNameIdentifier
query	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PhraseQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
query	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
query	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"text"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
search	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testQueryFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Searchable	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
searchables	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
lookupRemote	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
;	TokenNameSEMICOLON
Searcher	TokenNameIdentifier
searcher	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MultiSearcher	TokenNameIdentifier
(	TokenNameLPAREN
searchables	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
hits	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"text"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
QueryWrapperFilter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
scoreDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
hits	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
nohits	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"text"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
QueryWrapperFilter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"non-existent-term"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
scoreDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
nohits	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testConstantScoreQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Searchable	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
searchables	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
lookupRemote	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
;	TokenNameSEMICOLON
Searcher	TokenNameIdentifier
searcher	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MultiSearcher	TokenNameIdentifier
(	TokenNameLPAREN
searchables	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
hits	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ConstantScoreQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
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
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
hits	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
