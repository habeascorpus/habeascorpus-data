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
util	TokenNameIdentifier
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
*	TokenNameMULTIPLY
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
TestStressIndexing	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
abstract	TokenNameabstract
class	TokenNameclass
TimedThread	TokenNameIdentifier
extends	TokenNameextends
Thread	TokenNameIdentifier
{	TokenNameLBRACE
volatile	TokenNamevolatile
boolean	TokenNameboolean
failed	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
count	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
RUN_TIME_MSEC	TokenNameIdentifier
=	TokenNameEQUAL
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
TimedThread	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
allThreads	TokenNameIdentifier
;	TokenNameSEMICOLON
abstract	TokenNameabstract
public	TokenNamepublic
void	TokenNamevoid
doWork	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Throwable	TokenNameIdentifier
;	TokenNameSEMICOLON
TimedThread	TokenNameIdentifier
(	TokenNameLPAREN
TimedThread	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
threads	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
allThreads	TokenNameIdentifier
=	TokenNameEQUAL
threads	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
long	TokenNamelong
stopTime	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
RUN_TIME_MSEC	TokenNameIdentifier
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
do	TokenNamedo
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
anyErrors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
doWork	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
count	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
stopTime	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
": exc"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
failed	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
anyErrors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
allThreads	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
if	TokenNameif
(	TokenNameLPAREN
allThreads	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
allThreads	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
failed	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
class	TokenNameclass
IndexerThread	TokenNameIdentifier
extends	TokenNameextends
TimedThread	TokenNameIdentifier
{	TokenNameLBRACE
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
nextID	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
IndexerThread	TokenNameIdentifier
(	TokenNameLPAREN
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
,	TokenNameCOMMA
TimedThread	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
threads	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
threads	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
writer	TokenNameIdentifier
=	TokenNameEQUAL
writer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
doWork	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Document	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Document	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newField	TokenNameIdentifier
(	TokenNameLPAREN
"id"	TokenNameStringLiteral
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
nextID	TokenNameIdentifier
++	TokenNamePLUS_PLUS
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
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newField	TokenNameIdentifier
(	TokenNameLPAREN
"contents"	TokenNameStringLiteral
,	TokenNameCOMMA
English	TokenNameIdentifier
.	TokenNameDOT
intToEnglish	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
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
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
deleteID	TokenNameIdentifier
=	TokenNameEQUAL
nextID	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
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
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
writer	TokenNameIdentifier
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
deleteID	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
deleteID	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
SearcherThread	TokenNameIdentifier
extends	TokenNameextends
TimedThread	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Directory	TokenNameIdentifier
directory	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SearcherThread	TokenNameIdentifier
(	TokenNameLPAREN
Directory	TokenNameIdentifier
directory	TokenNameIdentifier
,	TokenNameCOMMA
TimedThread	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
threads	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
threads	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
directory	TokenNameIdentifier
=	TokenNameEQUAL
directory	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
doWork	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Throwable	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
IndexReader	TokenNameIdentifier
ir	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
directory	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexSearcher	TokenNameIdentifier
is	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexSearcher	TokenNameIdentifier
(	TokenNameLPAREN
ir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
is	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ir	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
count	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
runStressTest	TokenNameIdentifier
(	TokenNameLPAREN
Directory	TokenNameIdentifier
directory	TokenNameIdentifier
,	TokenNameCOMMA
MergeScheduler	TokenNameIdentifier
mergeScheduler	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
IndexWriter	TokenNameIdentifier
modifier	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
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
setOpenMode	TokenNameIdentifier
(	TokenNameLPAREN
OpenMode	TokenNameIdentifier
.	TokenNameDOT
CREATE	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setMaxBufferedDocs	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
setMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
mergeScheduler	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
modifier	TokenNameIdentifier
.	TokenNameDOT
commit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TimedThread	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
threads	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TimedThread	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
numThread	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
IndexerThread	TokenNameIdentifier
indexerThread	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexerThread	TokenNameIdentifier
(	TokenNameLPAREN
modifier	TokenNameIdentifier
,	TokenNameCOMMA
threads	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
threads	TokenNameIdentifier
[	TokenNameLBRACKET
numThread	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
indexerThread	TokenNameIdentifier
;	TokenNameSEMICOLON
indexerThread	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexerThread	TokenNameIdentifier
indexerThread2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexerThread	TokenNameIdentifier
(	TokenNameLPAREN
modifier	TokenNameIdentifier
,	TokenNameCOMMA
threads	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
threads	TokenNameIdentifier
[	TokenNameLBRACKET
numThread	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
indexerThread2	TokenNameIdentifier
;	TokenNameSEMICOLON
indexerThread2	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SearcherThread	TokenNameIdentifier
searcherThread1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SearcherThread	TokenNameIdentifier
(	TokenNameLPAREN
directory	TokenNameIdentifier
,	TokenNameCOMMA
threads	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
threads	TokenNameIdentifier
[	TokenNameLBRACKET
numThread	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
searcherThread1	TokenNameIdentifier
;	TokenNameSEMICOLON
searcherThread1	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SearcherThread	TokenNameIdentifier
searcherThread2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SearcherThread	TokenNameIdentifier
(	TokenNameLPAREN
directory	TokenNameIdentifier
,	TokenNameCOMMA
threads	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
threads	TokenNameIdentifier
[	TokenNameLBRACKET
numThread	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
searcherThread2	TokenNameIdentifier
;	TokenNameSEMICOLON
searcherThread2	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
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
numThread	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
threads	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
join	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
modifier	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
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
numThread	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
!	TokenNameNOT
threads	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
failed	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testStressIndexAndSearching	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
directory	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
runStressTest	TokenNameIdentifier
(	TokenNameLPAREN
directory	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
ConcurrentMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
directory	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
