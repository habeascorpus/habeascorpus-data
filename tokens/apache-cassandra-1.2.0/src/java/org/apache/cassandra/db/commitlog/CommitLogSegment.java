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
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
RandomAccessFile	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
MappedByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
channels	TokenNameIdentifier
.	TokenNameDOT
FileChannel	TokenNameIdentifier
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
Comparator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
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
atomic	TokenNameIdentifier
.	TokenNameDOT
AtomicInteger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
zip	TokenNameIdentifier
.	TokenNameDOT
Checksum	TokenNameIdentifier
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
CFMetaData	TokenNameIdentifier
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
ColumnFamily	TokenNameIdentifier
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
RowMutation	TokenNameIdentifier
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
FSWriteError	TokenNameIdentifier
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
utils	TokenNameIdentifier
.	TokenNameDOT
PureJavaCrc32	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CommitLogSegment	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
LoggerFactory	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
CommitLogSegment	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
long	TokenNamelong
idBase	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
AtomicInteger	TokenNameIdentifier
nextId	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AtomicInteger	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
ENTRY_OVERHEAD_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
+	TokenNamePLUS
8	TokenNameIntegerLiteral
+	TokenNamePLUS
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
HashMap	TokenNameIdentifier
<	TokenNameLESS
UUID	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
cfLastWrite	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
UUID	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
long	TokenNamelong
id	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
File	TokenNameIdentifier
logFile	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
RandomAccessFile	TokenNameIdentifier
logFileAccessor	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
needsSync	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
MappedByteBuffer	TokenNameIdentifier
buffer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
closed	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
CommitLogDescriptor	TokenNameIdentifier
descriptor	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
CommitLogSegment	TokenNameIdentifier
freshSegment	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
CommitLogSegment	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
long	TokenNamelong
getNextId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
idBase	TokenNameIdentifier
+	TokenNamePLUS
nextId	TokenNameIdentifier
.	TokenNameDOT
getAndIncrement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
CommitLogSegment	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
filePath	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
id	TokenNameIdentifier
=	TokenNameEQUAL
getNextId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
descriptor	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CommitLogDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getCommitLogLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
descriptor	TokenNameIdentifier
.	TokenNameDOT
fileName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isCreating	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
filePath	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
oldFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
filePath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
oldFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Re-using discarded CommitLog segment for {} from {}"	TokenNameStringLiteral
,	TokenNameCOMMA
id	TokenNameIdentifier
,	TokenNameCOMMA
filePath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
oldFile	TokenNameIdentifier
.	TokenNameDOT
renameTo	TokenNameIdentifier
(	TokenNameLPAREN
logFile	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"Rename from "	TokenNameStringLiteral
+	TokenNamePLUS
filePath	TokenNameIdentifier
+	TokenNamePLUS
" to "	TokenNameStringLiteral
+	TokenNamePLUS
id	TokenNameIdentifier
+	TokenNamePLUS
" failed"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
isCreating	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
logFileAccessor	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RandomAccessFile	TokenNameIdentifier
(	TokenNameLPAREN
logFile	TokenNameIdentifier
,	TokenNameCOMMA
"rw"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isCreating	TokenNameIdentifier
)	TokenNameRPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Creating new commit log segment {}"	TokenNameStringLiteral
,	TokenNameCOMMA
logFile	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logFileAccessor	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getCommitLogSegmentSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
=	TokenNameEQUAL
logFileAccessor	TokenNameIdentifier
.	TokenNameDOT
getChannel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
map	TokenNameIdentifier
(	TokenNameLPAREN
FileChannel	TokenNameIdentifier
.	TokenNameDOT
MapMode	TokenNameIdentifier
.	TokenNameDOT
READ_WRITE	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getCommitLogSegmentSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
putInt	TokenNameIdentifier
(	TokenNameLPAREN
CommitLog	TokenNameIdentifier
.	TokenNameDOT
END_OF_SEGMENT_MARKER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
needsSync	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
FSWriteError	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
logFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
discard	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
deleteFile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
deleteFile	TokenNameIdentifier
)	TokenNameRPAREN
FileUtils	TokenNameIdentifier
.	TokenNameDOT
deleteWithConfirm	TokenNameIdentifier
(	TokenNameLPAREN
logFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CommitLogSegment	TokenNameIdentifier
recycle	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
putInt	TokenNameIdentifier
(	TokenNameLPAREN
CommitLog	TokenNameIdentifier
.	TokenNameDOT
END_OF_SEGMENT_MARKER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
sync	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
FSWriteError	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"I/O error flushing "	TokenNameStringLiteral
+	TokenNamePLUS
this	TokenNamethis
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
CommitLogSegment	TokenNameIdentifier
(	TokenNameLPAREN
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasCapacityFor	TokenNameIdentifier
(	TokenNameLPAREN
RowMutation	TokenNameIdentifier
mutation	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
totalSize	TokenNameIdentifier
=	TokenNameEQUAL
RowMutation	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
mutation	TokenNameIdentifier
,	TokenNameCOMMA
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
ENTRY_OVERHEAD_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
totalSize	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
markDirty	TokenNameIdentifier
(	TokenNameLPAREN
RowMutation	TokenNameIdentifier
rowMutation	TokenNameIdentifier
,	TokenNameCOMMA
ReplayPosition	TokenNameIdentifier
repPos	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
columnFamily	TokenNameIdentifier
:	TokenNameCOLON
rowMutation	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
CFMetaData	TokenNameIdentifier
cfm	TokenNameIdentifier
=	TokenNameEQUAL
Schema	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getCFMetaData	TokenNameIdentifier
(	TokenNameLPAREN
columnFamily	TokenNameIdentifier
.	TokenNameDOT
id	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cfm	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Attempted to write commit log entry for unrecognized column family: "	TokenNameStringLiteral
+	TokenNamePLUS
columnFamily	TokenNameIdentifier
.	TokenNameDOT
id	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
markCFDirty	TokenNameIdentifier
(	TokenNameLPAREN
cfm	TokenNameIdentifier
.	TokenNameDOT
cfId	TokenNameIdentifier
,	TokenNameCOMMA
repPos	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ReplayPosition	TokenNameIdentifier
write	TokenNameIdentifier
(	TokenNameLPAREN
RowMutation	TokenNameIdentifier
rowMutation	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
assert	TokenNameassert
!	TokenNameNOT
closed	TokenNameIdentifier
;	TokenNameSEMICOLON
ReplayPosition	TokenNameIdentifier
repPos	TokenNameIdentifier
=	TokenNameEQUAL
getContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
markDirty	TokenNameIdentifier
(	TokenNameLPAREN
rowMutation	TokenNameIdentifier
,	TokenNameCOMMA
repPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Checksum	TokenNameIdentifier
checksum	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PureJavaCrc32	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
serializedRow	TokenNameIdentifier
=	TokenNameEQUAL
rowMutation	TokenNameIdentifier
.	TokenNameDOT
getSerializedBuffer	TokenNameIdentifier
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checksum	TokenNameIdentifier
.	TokenNameDOT
update	TokenNameIdentifier
(	TokenNameLPAREN
serializedRow	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
putInt	TokenNameIdentifier
(	TokenNameLPAREN
serializedRow	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
putLong	TokenNameIdentifier
(	TokenNameLPAREN
checksum	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
serializedRow	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checksum	TokenNameIdentifier
.	TokenNameDOT
update	TokenNameIdentifier
(	TokenNameLPAREN
serializedRow	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
serializedRow	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
putLong	TokenNameIdentifier
(	TokenNameLPAREN
checksum	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
putInt	TokenNameIdentifier
(	TokenNameLPAREN
CommitLog	TokenNameIdentifier
.	TokenNameDOT
END_OF_SEGMENT_MARKER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
CommitLog	TokenNameIdentifier
.	TokenNameDOT
END_OF_SEGMENT_MARKER_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
needsSync	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
repPos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
sync	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
needsSync	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
force	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
FSWriteError	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
needsSync	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ReplayPosition	TokenNameIdentifier
getContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ReplayPosition	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
,	TokenNameCOMMA
buffer	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
logFile	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
logFile	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
closed	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
clean	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logFileAccessor	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
closed	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
FSWriteError	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
markCFDirty	TokenNameIdentifier
(	TokenNameLPAREN
UUID	TokenNameIdentifier
cfId	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
position	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cfLastWrite	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
cfId	TokenNameIdentifier
,	TokenNameCOMMA
position	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
markClean	TokenNameIdentifier
(	TokenNameLPAREN
UUID	TokenNameIdentifier
cfId	TokenNameIdentifier
,	TokenNameCOMMA
ReplayPosition	TokenNameIdentifier
context	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Integer	TokenNameIdentifier
lastWritten	TokenNameIdentifier
=	TokenNameEQUAL
cfLastWrite	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
cfId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lastWritten	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
(	TokenNameLPAREN
!	TokenNameNOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
lastWritten	TokenNameIdentifier
<	TokenNameLESS
context	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cfLastWrite	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
cfId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Collection	TokenNameIdentifier
<	TokenNameLESS
UUID	TokenNameIdentifier
>	TokenNameGREATER
getDirtyCFIDs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
cfLastWrite	TokenNameIdentifier
.	TokenNameDOT
keySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isUnused	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
cfLastWrite	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
contains	TokenNameIdentifier
(	TokenNameLPAREN
ReplayPosition	TokenNameIdentifier
context	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
context	TokenNameIdentifier
.	TokenNameDOT
segment	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
id	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
dirtyString	TokenNameIdentifier
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
for	TokenNamefor
(	TokenNameLPAREN
UUID	TokenNameIdentifier
cfId	TokenNameIdentifier
:	TokenNameCOLON
cfLastWrite	TokenNameIdentifier
.	TokenNameDOT
keySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
CFMetaData	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
Schema	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getCFMetaData	TokenNameIdentifier
(	TokenNameLPAREN
cfId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
"<deleted>"	TokenNameStringLiteral
:	TokenNameCOLON
m	TokenNameIdentifier
.	TokenNameDOT
cfName	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" ("	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
cfId	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"), "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
return	TokenNamereturn
"CommitLogSegment("	TokenNameStringLiteral
+	TokenNamePLUS
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
')'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
buffer	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
CommitLogSegmentFileComparator	TokenNameIdentifier
implements	TokenNameimplements
Comparator	TokenNameIdentifier
<	TokenNameLESS
File	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
f	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
f2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CommitLogDescriptor	TokenNameIdentifier
desc	TokenNameIdentifier
=	TokenNameEQUAL
CommitLogDescriptor	TokenNameIdentifier
.	TokenNameDOT
fromFileName	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CommitLogDescriptor	TokenNameIdentifier
desc2	TokenNameIdentifier
=	TokenNameEQUAL
CommitLogDescriptor	TokenNameIdentifier
.	TokenNameDOT
fromFileName	TokenNameIdentifier
(	TokenNameLPAREN
f2	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
desc	TokenNameIdentifier
.	TokenNameDOT
id	TokenNameIdentifier
-	TokenNameMINUS
desc2	TokenNameIdentifier
.	TokenNameDOT
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE