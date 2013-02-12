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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
MockAnalyzer	TokenNameIdentifier
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
queryParser	TokenNameIdentifier
.	TokenNameDOT
QueryParser	TokenNameIdentifier
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
CheckHits	TokenNameIdentifier
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
Explanation	TokenNameIdentifier
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
Weight	TokenNameIdentifier
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
Scorer	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
TestNearSpansOrdered	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
IndexSearcher	TokenNameIdentifier
searcher	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Directory	TokenNameIdentifier
directory	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
FIELD	TokenNameIdentifier
=	TokenNameEQUAL
"field"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
QueryParser	TokenNameIdentifier
qp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QueryParser	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
FIELD	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
directory	TokenNameIdentifier
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
,	TokenNameCOMMA
newIndexWriterConfig	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
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
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
docFields	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
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
FIELD	TokenNameIdentifier
,	TokenNameCOMMA
docFields	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
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
}	TokenNameRBRACE
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
protected	TokenNameprotected
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
docFields	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"w1 w2 w3 w4 w5"	TokenNameStringLiteral
,	TokenNameCOMMA
"w1 w3 w2 w3 zz"	TokenNameStringLiteral
,	TokenNameCOMMA
"w1 xx w2 yy w3"	TokenNameStringLiteral
,	TokenNameCOMMA
"w1 w3 xx w2 yy w3 zz"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
protected	TokenNameprotected
SpanNearQuery	TokenNameIdentifier
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s1	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
s2	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
s3	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
slop	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
inOrder	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
SpanNearQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SpanQuery	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
FIELD	TokenNameIdentifier
,	TokenNameCOMMA
s1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
FIELD	TokenNameIdentifier
,	TokenNameCOMMA
s2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
FIELD	TokenNameIdentifier
,	TokenNameCOMMA
s3	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
slop	TokenNameIdentifier
,	TokenNameCOMMA
inOrder	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
SpanNearQuery	TokenNameIdentifier
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
"w1"	TokenNameStringLiteral
,	TokenNameCOMMA
"w2"	TokenNameStringLiteral
,	TokenNameCOMMA
"w3"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSpanNearQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SpanNearQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CheckHits	TokenNameIdentifier
.	TokenNameDOT
checkHits	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
q	TokenNameIdentifier
,	TokenNameCOMMA
FIELD	TokenNameIdentifier
,	TokenNameCOMMA
searcher	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
s	TokenNameIdentifier
(	TokenNameLPAREN
Spans	TokenNameIdentifier
span	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
s	TokenNameIdentifier
(	TokenNameLPAREN
span	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
end	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
s	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
doc	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"s("	TokenNameStringLiteral
+	TokenNamePLUS
doc	TokenNameIdentifier
+	TokenNamePLUS
","	TokenNameStringLiteral
+	TokenNamePLUS
start	TokenNameIdentifier
+	TokenNamePLUS
","	TokenNameStringLiteral
+	TokenNamePLUS
end	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNearSpansNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SpanNearQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Spans	TokenNameIdentifier
span	TokenNameIdentifier
=	TokenNameEQUAL
q	TokenNameIdentifier
.	TokenNameDOT
getSpans	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
(	TokenNameLPAREN
span	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
(	TokenNameLPAREN
span	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNearSpansSkipToLikeNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SpanNearQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Spans	TokenNameIdentifier
span	TokenNameIdentifier
=	TokenNameEQUAL
q	TokenNameIdentifier
.	TokenNameDOT
getSpans	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
(	TokenNameLPAREN
span	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
(	TokenNameLPAREN
span	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNearSpansNextThenSkipTo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SpanNearQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Spans	TokenNameIdentifier
span	TokenNameIdentifier
=	TokenNameEQUAL
q	TokenNameIdentifier
.	TokenNameDOT
getSpans	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
(	TokenNameLPAREN
span	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
(	TokenNameLPAREN
span	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNearSpansNextThenSkipPast	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SpanNearQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Spans	TokenNameIdentifier
span	TokenNameIdentifier
=	TokenNameEQUAL
q	TokenNameIdentifier
.	TokenNameDOT
getSpans	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
(	TokenNameLPAREN
span	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNearSpansSkipPast	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SpanNearQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Spans	TokenNameIdentifier
span	TokenNameIdentifier
=	TokenNameEQUAL
q	TokenNameIdentifier
.	TokenNameDOT
getSpans	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNearSpansSkipTo0	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SpanNearQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Spans	TokenNameIdentifier
span	TokenNameIdentifier
=	TokenNameEQUAL
q	TokenNameIdentifier
.	TokenNameDOT
getSpans	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
(	TokenNameLPAREN
span	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNearSpansSkipTo1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SpanNearQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Spans	TokenNameIdentifier
span	TokenNameIdentifier
=	TokenNameEQUAL
q	TokenNameIdentifier
.	TokenNameDOT
getSpans	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
span	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
(	TokenNameLPAREN
span	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSpanNearScorerSkipTo1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SpanNearQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Weight	TokenNameIdentifier
w	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
createNormalizedWeight	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Scorer	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
w	TokenNameIdentifier
.	TokenNameDOT
scorer	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
.	TokenNameDOT
getIndexReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
advance	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSpanNearScorerExplain	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SpanNearQuery	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
makeQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Explanation	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
explain	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Scorer explanation value for doc#1 isn't positive: "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
<	TokenNameLESS
e	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
