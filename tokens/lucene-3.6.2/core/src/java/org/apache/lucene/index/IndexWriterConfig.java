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
Analyzer	TokenNameIdentifier
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
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
IndexingChain	TokenNameIdentifier
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
.	TokenNameDOT
IndexReaderWarmer	TokenNameIdentifier
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
Similarity	TokenNameIdentifier
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
Version	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
IndexWriterConfig	TokenNameIdentifier
implements	TokenNameimplements
Cloneable	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
enum	TokenNameenum
OpenMode	TokenNameIdentifier
{	TokenNameLBRACE
CREATE	TokenNameIdentifier
,	TokenNameCOMMA
APPEND	TokenNameIdentifier
,	TokenNameCOMMA
CREATE_OR_APPEND	TokenNameIdentifier
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_TERM_INDEX_INTERVAL	TokenNameIdentifier
=	TokenNameEQUAL
128	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
DISABLE_AUTO_FLUSH	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
DEFAULT_MAX_BUFFERED_DELETE_TERMS	TokenNameIdentifier
=	TokenNameEQUAL
DISABLE_AUTO_FLUSH	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
DEFAULT_MAX_BUFFERED_DOCS	TokenNameIdentifier
=	TokenNameEQUAL
DISABLE_AUTO_FLUSH	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
double	TokenNamedouble
DEFAULT_RAM_BUFFER_SIZE_MB	TokenNameIdentifier
=	TokenNameEQUAL
16.0	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
long	TokenNamelong
WRITE_LOCK_TIMEOUT	TokenNameIdentifier
=	TokenNameEQUAL
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
DEFAULT_MAX_THREAD_STATES	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
boolean	TokenNameboolean
DEFAULT_READER_POOLING	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_READER_TERMS_INDEX_DIVISOR	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
setDefaultWriteLockTimeout	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
writeLockTimeout	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
WRITE_LOCK_TIMEOUT	TokenNameIdentifier
=	TokenNameEQUAL
writeLockTimeout	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
long	TokenNamelong
getDefaultWriteLockTimeout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
WRITE_LOCK_TIMEOUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
IndexDeletionPolicy	TokenNameIdentifier
delPolicy	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
IndexCommit	TokenNameIdentifier
commit	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
OpenMode	TokenNameIdentifier
openMode	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
Similarity	TokenNameIdentifier
similarity	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
int	TokenNameint
termIndexInterval	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
MergeScheduler	TokenNameIdentifier
mergeScheduler	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
long	TokenNamelong
writeLockTimeout	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
int	TokenNameint
maxBufferedDeleteTerms	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
double	TokenNamedouble
ramBufferSizeMB	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
int	TokenNameint
maxBufferedDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
IndexingChain	TokenNameIdentifier
indexingChain	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
IndexReaderWarmer	TokenNameIdentifier
mergedSegmentWarmer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
MergePolicy	TokenNameIdentifier
mergePolicy	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
int	TokenNameint
maxThreadStates	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
boolean	TokenNameboolean
readerPooling	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
int	TokenNameint
readerTermsIndexDivisor	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
matchVersion	TokenNameIdentifier
=	TokenNameEQUAL
matchVersion	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
analyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
delPolicy	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commit	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
openMode	TokenNameIdentifier
=	TokenNameEQUAL
OpenMode	TokenNameIdentifier
.	TokenNameDOT
CREATE_OR_APPEND	TokenNameIdentifier
;	TokenNameSEMICOLON
similarity	TokenNameIdentifier
=	TokenNameEQUAL
Similarity	TokenNameIdentifier
.	TokenNameDOT
getDefault	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termIndexInterval	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_TERM_INDEX_INTERVAL	TokenNameIdentifier
;	TokenNameSEMICOLON
mergeScheduler	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ConcurrentMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writeLockTimeout	TokenNameIdentifier
=	TokenNameEQUAL
WRITE_LOCK_TIMEOUT	TokenNameIdentifier
;	TokenNameSEMICOLON
maxBufferedDeleteTerms	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_MAX_BUFFERED_DELETE_TERMS	TokenNameIdentifier
;	TokenNameSEMICOLON
ramBufferSizeMB	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_RAM_BUFFER_SIZE_MB	TokenNameIdentifier
;	TokenNameSEMICOLON
maxBufferedDocs	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_MAX_BUFFERED_DOCS	TokenNameIdentifier
;	TokenNameSEMICOLON
indexingChain	TokenNameIdentifier
=	TokenNameEQUAL
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
defaultIndexingChain	TokenNameIdentifier
;	TokenNameSEMICOLON
mergedSegmentWarmer	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
matchVersion	TokenNameIdentifier
.	TokenNameDOT
onOrAfter	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
.	TokenNameDOT
LUCENE_32	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
mergePolicy	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TieredMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
mergePolicy	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogByteSizeMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
maxThreadStates	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_MAX_THREAD_STATES	TokenNameIdentifier
;	TokenNameSEMICOLON
readerPooling	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_READER_POOLING	TokenNameIdentifier
;	TokenNameSEMICOLON
readerTermsIndexDivisor	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_READER_TERMS_INDEX_DIVISOR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Object	TokenNameIdentifier
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
CloneNotSupportedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Analyzer	TokenNameIdentifier
getAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
analyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setOpenMode	TokenNameIdentifier
(	TokenNameLPAREN
OpenMode	TokenNameIdentifier
openMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
openMode	TokenNameIdentifier
=	TokenNameEQUAL
openMode	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
OpenMode	TokenNameIdentifier
getOpenMode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
openMode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setIndexDeletionPolicy	TokenNameIdentifier
(	TokenNameLPAREN
IndexDeletionPolicy	TokenNameIdentifier
delPolicy	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
delPolicy	TokenNameIdentifier
=	TokenNameEQUAL
delPolicy	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
new	TokenNamenew
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
delPolicy	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexDeletionPolicy	TokenNameIdentifier
getIndexDeletionPolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
delPolicy	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setIndexCommit	TokenNameIdentifier
(	TokenNameLPAREN
IndexCommit	TokenNameIdentifier
commit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
commit	TokenNameIdentifier
=	TokenNameEQUAL
commit	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexCommit	TokenNameIdentifier
getIndexCommit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
commit	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setSimilarity	TokenNameIdentifier
(	TokenNameLPAREN
Similarity	TokenNameIdentifier
similarity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
similarity	TokenNameIdentifier
=	TokenNameEQUAL
similarity	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
Similarity	TokenNameIdentifier
.	TokenNameDOT
getDefault	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
similarity	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Similarity	TokenNameIdentifier
getSimilarity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
similarity	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setTermIndexInterval	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
interval	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
termIndexInterval	TokenNameIdentifier
=	TokenNameEQUAL
interval	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getTermIndexInterval	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termIndexInterval	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
MergeScheduler	TokenNameIdentifier
mergeScheduler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
mergeScheduler	TokenNameIdentifier
=	TokenNameEQUAL
mergeScheduler	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
new	TokenNamenew
ConcurrentMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
mergeScheduler	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MergeScheduler	TokenNameIdentifier
getMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
mergeScheduler	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setWriteLockTimeout	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
writeLockTimeout	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
writeLockTimeout	TokenNameIdentifier
=	TokenNameEQUAL
writeLockTimeout	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getWriteLockTimeout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
writeLockTimeout	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setMaxBufferedDeleteTerms	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
maxBufferedDeleteTerms	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
maxBufferedDeleteTerms	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
DISABLE_AUTO_FLUSH	TokenNameIdentifier
&&	TokenNameAND_AND
maxBufferedDeleteTerms	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"maxBufferedDeleteTerms must at least be 1 when enabled"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
maxBufferedDeleteTerms	TokenNameIdentifier
=	TokenNameEQUAL
maxBufferedDeleteTerms	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getMaxBufferedDeleteTerms	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
maxBufferedDeleteTerms	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setRAMBufferSizeMB	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
ramBufferSizeMB	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ramBufferSizeMB	TokenNameIdentifier
>	TokenNameGREATER
2048.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"ramBufferSize "	TokenNameStringLiteral
+	TokenNamePLUS
ramBufferSizeMB	TokenNameIdentifier
+	TokenNamePLUS
" is too large; should be comfortably less than 2048"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ramBufferSizeMB	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
DISABLE_AUTO_FLUSH	TokenNameIdentifier
&&	TokenNameAND_AND
ramBufferSizeMB	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"ramBufferSize should be > 0.0 MB when enabled"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ramBufferSizeMB	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DISABLE_AUTO_FLUSH	TokenNameIdentifier
&&	TokenNameAND_AND
maxBufferedDocs	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DISABLE_AUTO_FLUSH	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"at least one of ramBufferSize and maxBufferedDocs must be enabled"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
ramBufferSizeMB	TokenNameIdentifier
=	TokenNameEQUAL
ramBufferSizeMB	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getRAMBufferSizeMB	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ramBufferSizeMB	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setMaxBufferedDocs	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
maxBufferedDocs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
maxBufferedDocs	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
DISABLE_AUTO_FLUSH	TokenNameIdentifier
&&	TokenNameAND_AND
maxBufferedDocs	TokenNameIdentifier
<	TokenNameLESS
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"maxBufferedDocs must at least be 2 when enabled"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
maxBufferedDocs	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DISABLE_AUTO_FLUSH	TokenNameIdentifier
&&	TokenNameAND_AND
ramBufferSizeMB	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DISABLE_AUTO_FLUSH	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"at least one of ramBufferSize and maxBufferedDocs must be enabled"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
maxBufferedDocs	TokenNameIdentifier
=	TokenNameEQUAL
maxBufferedDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getMaxBufferedDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
maxBufferedDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setMergedSegmentWarmer	TokenNameIdentifier
(	TokenNameLPAREN
IndexReaderWarmer	TokenNameIdentifier
mergeSegmentWarmer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
mergedSegmentWarmer	TokenNameIdentifier
=	TokenNameEQUAL
mergeSegmentWarmer	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexReaderWarmer	TokenNameIdentifier
getMergedSegmentWarmer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
mergedSegmentWarmer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
MergePolicy	TokenNameIdentifier
mergePolicy	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
mergePolicy	TokenNameIdentifier
=	TokenNameEQUAL
mergePolicy	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
new	TokenNamenew
LogByteSizeMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
mergePolicy	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MergePolicy	TokenNameIdentifier
getMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
mergePolicy	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setMaxThreadStates	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
maxThreadStates	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
maxThreadStates	TokenNameIdentifier
=	TokenNameEQUAL
maxThreadStates	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
?	TokenNameQUESTION
DEFAULT_MAX_THREAD_STATES	TokenNameIdentifier
:	TokenNameCOLON
maxThreadStates	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getMaxThreadStates	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
maxThreadStates	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setReaderPooling	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
readerPooling	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
readerPooling	TokenNameIdentifier
=	TokenNameEQUAL
readerPooling	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getReaderPooling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
readerPooling	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
IndexWriterConfig	TokenNameIdentifier
setIndexingChain	TokenNameIdentifier
(	TokenNameLPAREN
IndexingChain	TokenNameIdentifier
indexingChain	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
indexingChain	TokenNameIdentifier
=	TokenNameEQUAL
indexingChain	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
defaultIndexingChain	TokenNameIdentifier
:	TokenNameCOLON
indexingChain	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
IndexingChain	TokenNameIdentifier
getIndexingChain	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
indexingChain	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IndexWriterConfig	TokenNameIdentifier
setReaderTermsIndexDivisor	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
divisor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
divisor	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
divisor	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"divisor must be >= 1, or -1 (got "	TokenNameStringLiteral
+	TokenNamePLUS
divisor	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
readerTermsIndexDivisor	TokenNameIdentifier
=	TokenNameEQUAL
divisor	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getReaderTermsIndexDivisor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
readerTermsIndexDivisor	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"matchVersion="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
matchVersion	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"analyzer="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
"null"	TokenNameStringLiteral
:	TokenNameCOLON
analyzer	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"delPolicy="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
delPolicy	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"commit="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
commit	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
"null"	TokenNameStringLiteral
:	TokenNameCOLON
commit	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"openMode="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
openMode	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"similarity="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
similarity	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"termIndexInterval="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
termIndexInterval	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"mergeScheduler="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
mergeScheduler	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"default WRITE_LOCK_TIMEOUT="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
WRITE_LOCK_TIMEOUT	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"writeLockTimeout="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
writeLockTimeout	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"maxBufferedDeleteTerms="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
maxBufferedDeleteTerms	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"ramBufferSizeMB="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
ramBufferSizeMB	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"maxBufferedDocs="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
maxBufferedDocs	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"mergedSegmentWarmer="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
mergedSegmentWarmer	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"mergePolicy="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
mergePolicy	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"maxThreadStates="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
maxThreadStates	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"readerPooling="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
readerPooling	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"readerTermsIndexDivisor="	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
readerTermsIndexDivisor	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
