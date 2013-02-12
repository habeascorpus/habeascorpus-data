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
util	TokenNameIdentifier
.	TokenNameDOT
_TestUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestTieredMergePolicy	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testForceMergeDeletes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexWriterConfig	TokenNameIdentifier
conf	TokenNameIdentifier
=	TokenNameEQUAL
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
;	TokenNameSEMICOLON
TieredMergePolicy	TokenNameIdentifier
tmp	TokenNameIdentifier
=	TokenNameEQUAL
newTieredMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
conf	TokenNameIdentifier
.	TokenNameDOT
setMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
conf	TokenNameIdentifier
.	TokenNameDOT
setMaxBufferedDocs	TokenNameIdentifier
(	TokenNameLPAREN
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setMaxMergeAtOnce	TokenNameIdentifier
(	TokenNameLPAREN
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setSegmentsPerTier	TokenNameIdentifier
(	TokenNameLPAREN
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setForceMergeDeletesPctAllowed	TokenNameIdentifier
(	TokenNameLPAREN
30.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexWriter	TokenNameIdentifier
w	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
conf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
.	TokenNameDOT
setInfoStream	TokenNameIdentifier
(	TokenNameLPAREN
VERBOSE	TokenNameIdentifier
?	TokenNameQUESTION
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
:	TokenNameCOLON
null	TokenNamenull
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
80	TokenNameIntegerLiteral
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
"content"	TokenNameStringLiteral
,	TokenNameCOMMA
"aaa "	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
i	TokenNameIdentifier
%	TokenNameREMAINDER
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
w	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
80	TokenNameIntegerLiteral
,	TokenNameCOMMA
w	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
80	TokenNameIntegerLiteral
,	TokenNameCOMMA
w	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
" TEST: delete docs"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
w	TokenNameIdentifier
.	TokenNameDOT
deleteDocuments	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"content"	TokenNameStringLiteral
,	TokenNameCOMMA
"0"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
.	TokenNameDOT
forceMergeDeletes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
80	TokenNameIntegerLiteral
,	TokenNameCOMMA
w	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
60	TokenNameIntegerLiteral
,	TokenNameCOMMA
w	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
" TEST: forceMergeDeletes2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
tmp	TokenNameIdentifier
.	TokenNameDOT
setForceMergeDeletesPctAllowed	TokenNameIdentifier
(	TokenNameLPAREN
10.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
.	TokenNameDOT
forceMergeDeletes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
60	TokenNameIntegerLiteral
,	TokenNameCOMMA
w	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
60	TokenNameIntegerLiteral
,	TokenNameCOMMA
w	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
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
testPartialMerge	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
num	TokenNameIdentifier
=	TokenNameEQUAL
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
iter	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
<	TokenNameLESS
num	TokenNameIdentifier
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"TEST: iter="	TokenNameStringLiteral
+	TokenNamePLUS
iter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Directory	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexWriterConfig	TokenNameIdentifier
conf	TokenNameIdentifier
=	TokenNameEQUAL
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
;	TokenNameSEMICOLON
conf	TokenNameIdentifier
.	TokenNameDOT
setMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SerialMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TieredMergePolicy	TokenNameIdentifier
tmp	TokenNameIdentifier
=	TokenNameEQUAL
newTieredMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
conf	TokenNameIdentifier
.	TokenNameDOT
setMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
conf	TokenNameIdentifier
.	TokenNameDOT
setMaxBufferedDocs	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setMaxMergeAtOnce	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setSegmentsPerTier	TokenNameIdentifier
(	TokenNameLPAREN
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexWriter	TokenNameIdentifier
w	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
conf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
.	TokenNameDOT
setInfoStream	TokenNameIdentifier
(	TokenNameLPAREN
VERBOSE	TokenNameIdentifier
?	TokenNameQUESTION
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
:	TokenNameCOLON
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
maxCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
numDocs	TokenNameIdentifier
=	TokenNameEQUAL
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
20	TokenNameIntegerLiteral
,	TokenNameCOMMA
100	TokenNameIntegerLiteral
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
numDocs	TokenNameIdentifier
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
"content"	TokenNameStringLiteral
,	TokenNameCOMMA
"aaa "	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
i	TokenNameIdentifier
%	TokenNameREMAINDER
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
w	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
w	TokenNameIdentifier
.	TokenNameDOT
getSegmentCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
maxCount	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
count	TokenNameIdentifier
,	TokenNameCOMMA
maxCount	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"count="	TokenNameStringLiteral
+	TokenNamePLUS
count	TokenNameIdentifier
+	TokenNamePLUS
" maxCount="	TokenNameStringLiteral
+	TokenNamePLUS
maxCount	TokenNameIdentifier
,	TokenNameCOMMA
count	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
maxCount	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
w	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
segmentCount	TokenNameIdentifier
=	TokenNameEQUAL
w	TokenNameIdentifier
.	TokenNameDOT
getSegmentCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
targetCount	TokenNameIdentifier
=	TokenNameEQUAL
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
segmentCount	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"TEST: merge to "	TokenNameStringLiteral
+	TokenNamePLUS
targetCount	TokenNameIdentifier
+	TokenNamePLUS
" segs (current count="	TokenNameStringLiteral
+	TokenNamePLUS
segmentCount	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
w	TokenNameIdentifier
.	TokenNameDOT
forceMerge	TokenNameIdentifier
(	TokenNameLPAREN
targetCount	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
targetCount	TokenNameIdentifier
,	TokenNameCOMMA
w	TokenNameIdentifier
.	TokenNameDOT
getSegmentCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
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
public	TokenNamepublic
void	TokenNamevoid
testForceMergeDeletesMaxSegSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
Directory	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
IndexWriterConfig	TokenNameIdentifier
conf	TokenNameIdentifier
=	TokenNameEQUAL
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
;	TokenNameSEMICOLON
final	TokenNamefinal
TieredMergePolicy	TokenNameIdentifier
tmp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TieredMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setMaxMergedSegmentMB	TokenNameIdentifier
(	TokenNameLPAREN
0.01	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setForceMergeDeletesPctAllowed	TokenNameIdentifier
(	TokenNameLPAREN
0.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
conf	TokenNameIdentifier
.	TokenNameDOT
setMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
RandomIndexWriter	TokenNameIdentifier
w	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RandomIndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
dir	TokenNameIdentifier
,	TokenNameCOMMA
conf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
.	TokenNameDOT
setDoRandomForceMerge	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
numDocs	TokenNameIdentifier
=	TokenNameEQUAL
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
200	TokenNameIntegerLiteral
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
numDocs	TokenNameIdentifier
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
"id"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
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
doc	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newField	TokenNameIdentifier
(	TokenNameLPAREN
"content"	TokenNameStringLiteral
,	TokenNameCOMMA
"aaa "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
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
w	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
w	TokenNameIdentifier
.	TokenNameDOT
forceMerge	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
w	TokenNameIdentifier
.	TokenNameDOT
getReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
numDocs	TokenNameIdentifier
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
numDocs	TokenNameIdentifier
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
.	TokenNameDOT
deleteDocuments	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"id"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
42	TokenNameIntegerLiteral
+	TokenNamePLUS
17	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
=	TokenNameEQUAL
w	TokenNameIdentifier
.	TokenNameDOT
getReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
numDocs	TokenNameIdentifier
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
numDocs	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
.	TokenNameDOT
forceMergeDeletes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
=	TokenNameEQUAL
w	TokenNameIdentifier
.	TokenNameDOT
getReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
numDocs	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
numDocs	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
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
