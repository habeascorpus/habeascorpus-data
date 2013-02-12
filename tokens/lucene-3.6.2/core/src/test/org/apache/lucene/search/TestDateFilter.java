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
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
DateTools	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestDateFilter	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testBefore	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
indexStore	TokenNameIdentifier
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
indexStore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
now	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
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
"datefield"	TokenNameStringLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
timeToString	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
-	TokenNameMINUS
1000	TokenNameIntegerLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
Resolution	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
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
doc	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newField	TokenNameIdentifier
(	TokenNameLPAREN
"body"	TokenNameStringLiteral
,	TokenNameCOMMA
"Today is a very sunny day in New York City"	TokenNameStringLiteral
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
IndexReader	TokenNameIdentifier
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
IndexSearcher	TokenNameIdentifier
searcher	TokenNameIdentifier
=	TokenNameEQUAL
newSearcher	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TermRangeFilter	TokenNameIdentifier
df1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermRangeFilter	TokenNameIdentifier
(	TokenNameLPAREN
"datefield"	TokenNameStringLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
timeToString	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
-	TokenNameMINUS
2000	TokenNameIntegerLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
Resolution	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
timeToString	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
Resolution	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TermRangeFilter	TokenNameIdentifier
df2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermRangeFilter	TokenNameIdentifier
(	TokenNameLPAREN
"datefield"	TokenNameStringLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
timeToString	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
Resolution	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
timeToString	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
-	TokenNameMINUS
2000	TokenNameIntegerLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
Resolution	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
query1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"body"	TokenNameStringLiteral
,	TokenNameCOMMA
"NoMatchForThis"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
query2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"body"	TokenNameStringLiteral
,	TokenNameCOMMA
"sunny"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
result	TokenNameIdentifier
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query1	TokenNameIdentifier
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
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query2	TokenNameIdentifier
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
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query1	TokenNameIdentifier
,	TokenNameCOMMA
df1	TokenNameIdentifier
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
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query1	TokenNameIdentifier
,	TokenNameCOMMA
df2	TokenNameIdentifier
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
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query2	TokenNameIdentifier
,	TokenNameCOMMA
df1	TokenNameIdentifier
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
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query2	TokenNameIdentifier
,	TokenNameCOMMA
df2	TokenNameIdentifier
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
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
indexStore	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testAfter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
indexStore	TokenNameIdentifier
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
indexStore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
now	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
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
"datefield"	TokenNameStringLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
timeToString	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
+	TokenNamePLUS
888888	TokenNameIntegerLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
Resolution	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
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
doc	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newField	TokenNameIdentifier
(	TokenNameLPAREN
"body"	TokenNameStringLiteral
,	TokenNameCOMMA
"Today is a very sunny day in New York City"	TokenNameStringLiteral
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
IndexReader	TokenNameIdentifier
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
IndexSearcher	TokenNameIdentifier
searcher	TokenNameIdentifier
=	TokenNameEQUAL
newSearcher	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TermRangeFilter	TokenNameIdentifier
df1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermRangeFilter	TokenNameIdentifier
(	TokenNameLPAREN
"datefield"	TokenNameStringLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
timeToString	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
Resolution	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
timeToString	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
+	TokenNamePLUS
999999	TokenNameIntegerLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
Resolution	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TermRangeFilter	TokenNameIdentifier
df2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermRangeFilter	TokenNameIdentifier
(	TokenNameLPAREN
"datefield"	TokenNameStringLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
timeToString	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
+	TokenNamePLUS
999999	TokenNameIntegerLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
Resolution	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
timeToString	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
+	TokenNamePLUS
999999999	TokenNameIntegerLiteral
,	TokenNameCOMMA
DateTools	TokenNameIdentifier
.	TokenNameDOT
Resolution	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
query1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"body"	TokenNameStringLiteral
,	TokenNameCOMMA
"NoMatchForThis"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
query2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"body"	TokenNameStringLiteral
,	TokenNameCOMMA
"sunny"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
result	TokenNameIdentifier
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query1	TokenNameIdentifier
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
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query2	TokenNameIdentifier
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
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query1	TokenNameIdentifier
,	TokenNameCOMMA
df1	TokenNameIdentifier
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
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query1	TokenNameIdentifier
,	TokenNameCOMMA
df2	TokenNameIdentifier
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
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query2	TokenNameIdentifier
,	TokenNameCOMMA
df1	TokenNameIdentifier
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
result	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
query2	TokenNameIdentifier
,	TokenNameCOMMA
df2	TokenNameIdentifier
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
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
indexStore	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
