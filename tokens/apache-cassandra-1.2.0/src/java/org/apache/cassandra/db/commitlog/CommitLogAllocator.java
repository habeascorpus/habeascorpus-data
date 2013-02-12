package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
commitlog	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collection	TokenNameIdentifier
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
UUID	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
BlockingQueue	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
LinkedBlockingQueue	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
TimeUnit	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
ConcurrentLinkedQueue	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
atomic	TokenNameIdentifier
.	TokenNameDOT
AtomicLong	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
google	TokenNameIdentifier
.	TokenNameDOT
common	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
.	TokenNameDOT
Iterables	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
slf4j	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
slf4j	TokenNameIdentifier
.	TokenNameDOT
LoggerFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
DatabaseDescriptor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
Schema	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
ColumnFamilyStore	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
Table	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
FileUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MessagingService	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
service	TokenNameIdentifier
.	TokenNameDOT
StorageService	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRunnable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CommitLogAllocator	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
LoggerFactory	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
CommitLogAllocator	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
TICK_CYCLE_TIME	TokenNameIdentifier
=	TokenNameEQUAL
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
BlockingQueue	TokenNameIdentifier
<	TokenNameLESS
CommitLogSegment	TokenNameIdentifier
>	TokenNameGREATER
availableSegments	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedBlockingQueue	TokenNameIdentifier
<	TokenNameLESS
CommitLogSegment	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
BlockingQueue	TokenNameIdentifier
<	TokenNameLESS
Runnable	TokenNameIdentifier
>	TokenNameGREATER
queue	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedBlockingQueue	TokenNameIdentifier
<	TokenNameLESS
Runnable	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ConcurrentLinkedQueue	TokenNameIdentifier
<	TokenNameLESS
CommitLogSegment	TokenNameIdentifier
>	TokenNameGREATER
activeSegments	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ConcurrentLinkedQueue	TokenNameIdentifier
<	TokenNameLESS
CommitLogSegment	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
AtomicLong	TokenNameIdentifier
size	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AtomicLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
boolean	TokenNameboolean
createReserveSegments	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Thread	TokenNameIdentifier
allocationThread	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
boolean	TokenNameboolean
run	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
public	TokenNamepublic
CommitLogAllocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Runnable	TokenNameIdentifier
runnable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
WrappedRunnable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
runMayThrow	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
run	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Runnable	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
queue	TokenNameIdentifier
.	TokenNameDOT
poll	TokenNameIdentifier
(	TokenNameLPAREN
TICK_CYCLE_TIME	TokenNameIdentifier
,	TokenNameCOMMA
TimeUnit	TokenNameIdentifier
.	TokenNameDOT
MILLISECONDS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
r	TokenNameIdentifier
.	TokenNameDOT
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
availableSegments	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
activeSegments	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
createReserveSegments	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"No segments in reserve; creating a fresh one"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
createFreshSegment	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
allocationThread	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Thread	TokenNameIdentifier
(	TokenNameLPAREN
runnable	TokenNameIdentifier
,	TokenNameCOMMA
"COMMIT-LOG-ALLOCATOR"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
allocationThread	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CommitLogSegment	TokenNameIdentifier
fetchSegment	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
CommitLogSegment	TokenNameIdentifier
next	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
next	TokenNameIdentifier
=	TokenNameEQUAL
availableSegments	TokenNameIdentifier
.	TokenNameDOT
take	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
AssertionError	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
!	TokenNameNOT
activeSegments	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
activeSegments	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isCapExceeded	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
flushOldestTables	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
recycleSegment	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
CommitLogSegment	TokenNameIdentifier
segment	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
activeSegments	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
CommitLog	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
archiver	TokenNameIdentifier
.	TokenNameDOT
maybeWaitForArchiving	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
discardSegment	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
isCapExceeded	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
discardSegment	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Recycling {}"	TokenNameStringLiteral
,	TokenNameCOMMA
segment	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
queue	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Runnable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
CommitLogSegment	TokenNameIdentifier
recycled	TokenNameIdentifier
=	TokenNameEQUAL
segment	TokenNameIdentifier
.	TokenNameDOT
recycle	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
internalAddReadySegment	TokenNameIdentifier
(	TokenNameLPAREN
recycled	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
recycleSegment	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
File	TokenNameIdentifier
file	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isCapExceeded	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
file	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getCommitLogSegmentSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
CommitLogDescriptor	TokenNameIdentifier
.	TokenNameDOT
fromFileName	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMessagingVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"(Unopened) segment {} is no longer needed and will be deleted now"	TokenNameStringLiteral
,	TokenNameCOMMA
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FileUtils	TokenNameIdentifier
.	TokenNameDOT
deleteWithConfirm	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Recycling {}"	TokenNameStringLiteral
,	TokenNameCOMMA
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
.	TokenNameDOT
addAndGet	TokenNameIdentifier
(	TokenNameLPAREN
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getCommitLogSegmentSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
queue	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Runnable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
CommitLogSegment	TokenNameIdentifier
segment	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CommitLogSegment	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
internalAddReadySegment	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
discardSegment	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
CommitLogSegment	TokenNameIdentifier
segment	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
deleteFile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Segment {} is no longer active and will be deleted {}"	TokenNameStringLiteral
,	TokenNameCOMMA
segment	TokenNameIdentifier
,	TokenNameCOMMA
deleteFile	TokenNameIdentifier
?	TokenNameQUESTION
"now"	TokenNameStringLiteral
:	TokenNameCOLON
"by the archive script"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
.	TokenNameDOT
addAndGet	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getCommitLogSegmentSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
queue	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Runnable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
segment	TokenNameIdentifier
.	TokenNameDOT
discard	TokenNameIdentifier
(	TokenNameLPAREN
deleteFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
bytesUsed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
size	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
manages	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
CommitLogSegment	TokenNameIdentifier
segment	TokenNameIdentifier
:	TokenNameCOLON
Iterables	TokenNameIdentifier
.	TokenNameDOT
concat	TokenNameIdentifier
(	TokenNameLPAREN
activeSegments	TokenNameIdentifier
,	TokenNameCOMMA
availableSegments	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
if	TokenNameif
(	TokenNameLPAREN
segment	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
CommitLogSegment	TokenNameIdentifier
createFreshSegment	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
size	TokenNameIdentifier
.	TokenNameDOT
addAndGet	TokenNameIdentifier
(	TokenNameLPAREN
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getCommitLogSegmentSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
internalAddReadySegment	TokenNameIdentifier
(	TokenNameLPAREN
CommitLogSegment	TokenNameIdentifier
.	TokenNameDOT
freshSegment	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
CommitLogSegment	TokenNameIdentifier
internalAddReadySegment	TokenNameIdentifier
(	TokenNameLPAREN
CommitLogSegment	TokenNameIdentifier
segment	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
!	TokenNameNOT
activeSegments	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
!	TokenNameNOT
availableSegments	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
availableSegments	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
segment	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
isCapExceeded	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
currentSize	TokenNameIdentifier
=	TokenNameEQUAL
size	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Total active commitlog segment space used is {}"	TokenNameStringLiteral
,	TokenNameCOMMA
currentSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
currentSize	TokenNameIdentifier
>	TokenNameGREATER
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getTotalCommitlogSpaceInMB	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
1024	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
1024	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
enableReserveSegmentCreation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
createReserveSegments	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
flushOldestTables	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
CommitLogSegment	TokenNameIdentifier
oldestSegment	TokenNameIdentifier
=	TokenNameEQUAL
activeSegments	TokenNameIdentifier
.	TokenNameDOT
peek	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
oldestSegment	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
UUID	TokenNameIdentifier
dirtyCFId	TokenNameIdentifier
:	TokenNameCOLON
oldestSegment	TokenNameIdentifier
.	TokenNameDOT
getDirtyCFIDs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
keypace	TokenNameIdentifier
=	TokenNameEQUAL
Schema	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getCF	TokenNameIdentifier
(	TokenNameLPAREN
dirtyCFId	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
left	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
=	TokenNameEQUAL
Table	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
keypace	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getColumnFamilyStore	TokenNameIdentifier
(	TokenNameLPAREN
dirtyCFId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Runnable	TokenNameIdentifier
runnable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Runnable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cfs	TokenNameIdentifier
.	TokenNameDOT
forceFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
StorageService	TokenNameIdentifier
.	TokenNameDOT
optionalTasks	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
runnable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
resetUnsafe	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Closing and clearing existing commit log segments..."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
!	TokenNameNOT
queue	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
Thread	TokenNameIdentifier
.	TokenNameDOT
yield	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
CommitLogSegment	TokenNameIdentifier
segment	TokenNameIdentifier
:	TokenNameCOLON
Iterables	TokenNameIdentifier
.	TokenNameDOT
concat	TokenNameIdentifier
(	TokenNameLPAREN
activeSegments	TokenNameIdentifier
,	TokenNameCOMMA
availableSegments	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
segment	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
activeSegments	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
availableSegments	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
shutdown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
run	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
awaitTermination	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
InterruptedException	TokenNameIdentifier
{	TokenNameLBRACE
allocationThread	TokenNameIdentifier
.	TokenNameDOT
join	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Collection	TokenNameIdentifier
<	TokenNameLESS
CommitLogSegment	TokenNameIdentifier
>	TokenNameGREATER
getActiveSegments	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
unmodifiableCollection	TokenNameIdentifier
(	TokenNameLPAREN
activeSegments	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
