package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Random	TokenNameIdentifier
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
store	TokenNameIdentifier
.	TokenNameDOT
MockDirectoryWrapper	TokenNameIdentifier
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
NoLockFactory	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
TestCrash	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
IndexWriter	TokenNameIdentifier
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
Random	TokenNameIdentifier
random	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
initialCommit	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
initialCommit	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
IndexWriter	TokenNameIdentifier
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
Random	TokenNameIdentifier
random	TokenNameIdentifier
,	TokenNameCOMMA
MockDirectoryWrapper	TokenNameIdentifier
dir	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
initialCommit	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
dir	TokenNameIdentifier
.	TokenNameDOT
setLockFactory	TokenNameIdentifier
(	TokenNameLPAREN
NoLockFactory	TokenNameIdentifier
.	TokenNameDOT
getNoLockFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
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
setMaxBufferedDocs	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
setMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ConcurrentMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
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
(	TokenNameLPAREN
(	TokenNameLPAREN
ConcurrentMergeScheduler	TokenNameIdentifier
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
getConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setSuppressExceptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
initialCommit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
writer	TokenNameIdentifier
.	TokenNameDOT
commit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
"content"	TokenNameStringLiteral
,	TokenNameCOMMA
"aaa"	TokenNameStringLiteral
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
"id"	TokenNameStringLiteral
,	TokenNameCOMMA
"0"	TokenNameStringLiteral
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
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
157	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
writer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
crash	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
MockDirectoryWrapper	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MockDirectoryWrapper	TokenNameIdentifier
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
getDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ConcurrentMergeScheduler	TokenNameIdentifier
cms	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ConcurrentMergeScheduler	TokenNameIdentifier
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
getConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cms	TokenNameIdentifier
.	TokenNameDOT
sync	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dir	TokenNameIdentifier
.	TokenNameDOT
crash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cms	TokenNameIdentifier
.	TokenNameDOT
sync	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dir	TokenNameIdentifier
.	TokenNameDOT
clearCrash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCrashWhileIndexing	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Directory	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
writer	TokenNameIdentifier
.	TokenNameDOT
getDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
crash	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
157	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
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
public	TokenNamepublic
void	TokenNamevoid
testWriterAfterCrash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MockDirectoryWrapper	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MockDirectoryWrapper	TokenNameIdentifier
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
getDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dir	TokenNameIdentifier
.	TokenNameDOT
setPreventDoubleWrite	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
crash	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
=	TokenNameEQUAL
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
314	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
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
public	TokenNamepublic
void	TokenNamevoid
testCrashAfterReopen	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MockDirectoryWrapper	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MockDirectoryWrapper	TokenNameIdentifier
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
getDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
=	TokenNameEQUAL
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
314	TokenNameIntegerLiteral
,	TokenNameCOMMA
writer	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
crash	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
157	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
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
public	TokenNamepublic
void	TokenNamevoid
testCrashAfterClose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MockDirectoryWrapper	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MockDirectoryWrapper	TokenNameIdentifier
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
getDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dir	TokenNameIdentifier
.	TokenNameDOT
crash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
157	TokenNameIntegerLiteral
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
dir	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCrashAfterCloseNoWait	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MockDirectoryWrapper	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MockDirectoryWrapper	TokenNameIdentifier
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
getDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dir	TokenNameIdentifier
.	TokenNameDOT
crash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
157	TokenNameIntegerLiteral
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
dir	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCrashReaderDeletes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MockDirectoryWrapper	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MockDirectoryWrapper	TokenNameIdentifier
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
getDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
deleteDocument	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dir	TokenNameIdentifier
.	TokenNameDOT
crash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
157	TokenNameIntegerLiteral
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
dir	TokenNameIdentifier
.	TokenNameDOT
clearCrash	TokenNameIdentifier
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
public	TokenNamepublic
void	TokenNamevoid
testCrashReaderDeletesAfterClose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MockDirectoryWrapper	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MockDirectoryWrapper	TokenNameIdentifier
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
getDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
deleteDocument	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dir	TokenNameIdentifier
.	TokenNameDOT
crash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
156	TokenNameIntegerLiteral
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
dir	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE