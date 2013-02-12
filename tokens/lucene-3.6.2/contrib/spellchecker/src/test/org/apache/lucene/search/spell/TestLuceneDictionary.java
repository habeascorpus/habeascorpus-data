package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
spell	TokenNameIdentifier
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
MockAnalyzer	TokenNameIdentifier
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
MockTokenizer	TokenNameIdentifier
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
IndexWriter	TokenNameIdentifier
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
BytesRef	TokenNameIdentifier
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
BytesRefIterator	TokenNameIdentifier
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
TestLuceneDictionary	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Directory	TokenNameIdentifier
store	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
IndexReader	TokenNameIdentifier
indexReader	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
LuceneDictionary	TokenNameIdentifier
ld	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
BytesRefIterator	TokenNameIdentifier
it	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
BytesRef	TokenNameIdentifier
spare	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
store	TokenNameIdentifier
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
store	TokenNameIdentifier
,	TokenNameCOMMA
newIndexWriterConfig	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
WHITESPACE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
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
"aaa"	TokenNameStringLiteral
,	TokenNameCOMMA
"foo"	TokenNameStringLiteral
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
"aaa"	TokenNameStringLiteral
,	TokenNameCOMMA
"foo"	TokenNameStringLiteral
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
"contents"	TokenNameStringLiteral
,	TokenNameCOMMA
"Tom"	TokenNameStringLiteral
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
"contents"	TokenNameStringLiteral
,	TokenNameCOMMA
"Jerry"	TokenNameStringLiteral
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
"zzz"	TokenNameStringLiteral
,	TokenNameCOMMA
"bar"	TokenNameStringLiteral
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
forceMerge	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
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
if	TokenNameif
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
indexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
store	TokenNameIdentifier
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
testFieldNonExistent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
indexReader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
store	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ld	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LuceneDictionary	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
"nonexistent_field"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
it	TokenNameIdentifier
=	TokenNameEQUAL
ld	TokenNameIdentifier
.	TokenNameDOT
getWordsIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
"More elements than expected"	TokenNameStringLiteral
,	TokenNameCOMMA
spare	TokenNameIdentifier
=	TokenNameEQUAL
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
indexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFieldAaa	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
indexReader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
store	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ld	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LuceneDictionary	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
"aaa"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
it	TokenNameIdentifier
=	TokenNameEQUAL
ld	TokenNameIdentifier
.	TokenNameDOT
getWordsIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"First element doesn't exist."	TokenNameStringLiteral
,	TokenNameCOMMA
spare	TokenNameIdentifier
=	TokenNameEQUAL
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"First element isn't correct"	TokenNameStringLiteral
,	TokenNameCOMMA
spare	TokenNameIdentifier
.	TokenNameDOT
utf8ToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
"More elements than expected"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
indexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFieldContents_1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
indexReader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
store	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ld	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LuceneDictionary	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
"contents"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
it	TokenNameIdentifier
=	TokenNameEQUAL
ld	TokenNameIdentifier
.	TokenNameDOT
getWordsIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"First element doesn't exist."	TokenNameStringLiteral
,	TokenNameCOMMA
spare	TokenNameIdentifier
=	TokenNameEQUAL
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"First element isn't correct"	TokenNameStringLiteral
,	TokenNameCOMMA
spare	TokenNameIdentifier
.	TokenNameDOT
utf8ToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"Jerry"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"Second element doesn't exist."	TokenNameStringLiteral
,	TokenNameCOMMA
spare	TokenNameIdentifier
=	TokenNameEQUAL
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Second element isn't correct"	TokenNameStringLiteral
,	TokenNameCOMMA
spare	TokenNameIdentifier
.	TokenNameDOT
utf8ToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"Tom"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
"More elements than expected"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ld	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LuceneDictionary	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
"contents"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
it	TokenNameIdentifier
=	TokenNameEQUAL
ld	TokenNameIdentifier
.	TokenNameDOT
getWordsIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
counter	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
counter	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Number of words incorrect"	TokenNameStringLiteral
,	TokenNameCOMMA
counter	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
indexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFieldContents_2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
indexReader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
store	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ld	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LuceneDictionary	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
"contents"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
it	TokenNameIdentifier
=	TokenNameEQUAL
ld	TokenNameIdentifier
.	TokenNameDOT
getWordsIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"First element isn't correct"	TokenNameStringLiteral
,	TokenNameCOMMA
"Jerry"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
utf8ToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Second element isn't correct"	TokenNameStringLiteral
,	TokenNameCOMMA
"Tom"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
utf8ToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
"Nonexistent element is really null"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
indexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFieldZzz	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
indexReader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
store	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ld	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LuceneDictionary	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
"zzz"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
it	TokenNameIdentifier
=	TokenNameEQUAL
ld	TokenNameIdentifier
.	TokenNameDOT
getWordsIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"First element doesn't exist."	TokenNameStringLiteral
,	TokenNameCOMMA
spare	TokenNameIdentifier
=	TokenNameEQUAL
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"First element isn't correct"	TokenNameStringLiteral
,	TokenNameCOMMA
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
spare	TokenNameIdentifier
.	TokenNameDOT
utf8ToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
"More elements than expected"	TokenNameStringLiteral
,	TokenNameCOMMA
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
indexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSpellchecker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SpellChecker	TokenNameIdentifier
sc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SpellChecker	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
indexReader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
store	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sc	TokenNameIdentifier
.	TokenNameDOT
indexDictionary	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
LuceneDictionary	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
"contents"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
newIndexWriterConfig	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
suggestions	TokenNameIdentifier
=	TokenNameEQUAL
sc	TokenNameIdentifier
.	TokenNameDOT
suggestSimilar	TokenNameIdentifier
(	TokenNameLPAREN
"Tam"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
suggestions	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Tom"	TokenNameStringLiteral
,	TokenNameCOMMA
suggestions	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
suggestions	TokenNameIdentifier
=	TokenNameEQUAL
sc	TokenNameIdentifier
.	TokenNameDOT
suggestSimilar	TokenNameIdentifier
(	TokenNameLPAREN
"Jarry"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
suggestions	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Jerry"	TokenNameStringLiteral
,	TokenNameCOMMA
suggestions	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
indexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sc	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dir	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
