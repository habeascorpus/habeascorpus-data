package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
compaction	TokenNameIdentifier
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
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
google	TokenNameIdentifier
.	TokenNameDOT
common	TokenNameIdentifier
.	TokenNameDOT
annotations	TokenNameIdentifier
.	TokenNameDOT
VisibleForTesting	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
google	TokenNameIdentifier
.	TokenNameDOT
common	TokenNameIdentifier
.	TokenNameDOT
base	TokenNameIdentifier
.	TokenNameDOT
Joiner	TokenNameIdentifier
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
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
google	TokenNameIdentifier
.	TokenNameDOT
common	TokenNameIdentifier
.	TokenNameDOT
primitives	TokenNameIdentifier
.	TokenNameDOT
Doubles	TokenNameIdentifier
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
columniterator	TokenNameIdentifier
.	TokenNameDOT
OnDiskAtomIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
dht	TokenNameIdentifier
.	TokenNameDOT
Range	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
dht	TokenNameIdentifier
.	TokenNameDOT
Token	TokenNameIdentifier
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
sstable	TokenNameIdentifier
.	TokenNameDOT
SSTable	TokenNameIdentifier
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
sstable	TokenNameIdentifier
.	TokenNameDOT
SSTableReader	TokenNameIdentifier
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
sstable	TokenNameIdentifier
.	TokenNameDOT
SSTableScanner	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
notifications	TokenNameIdentifier
.	TokenNameDOT
INotification	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
notifications	TokenNameIdentifier
.	TokenNameDOT
INotificationConsumer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
notifications	TokenNameIdentifier
.	TokenNameDOT
SSTableAddedNotification	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
notifications	TokenNameIdentifier
.	TokenNameDOT
SSTableListChangedNotification	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LeveledCompactionStrategy	TokenNameIdentifier
extends	TokenNameextends
AbstractCompactionStrategy	TokenNameIdentifier
implements	TokenNameimplements
INotificationConsumer	TokenNameIdentifier
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
LeveledCompactionStrategy	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
SSTABLE_SIZE_OPTION	TokenNameIdentifier
=	TokenNameEQUAL
"sstable_size_in_mb"	TokenNameStringLiteral
;	TokenNameSEMICOLON
@	TokenNameAT
VisibleForTesting	TokenNameIdentifier
final	TokenNamefinal
LeveledManifest	TokenNameIdentifier
manifest	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
maxSSTableSizeInMB	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
LeveledCompactionStrategy	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
options	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
cfs	TokenNameIdentifier
,	TokenNameCOMMA
options	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
configuredMaxSSTableSize	TokenNameIdentifier
=	TokenNameEQUAL
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
options	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
options	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
SSTABLE_SIZE_OPTION	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
options	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
SSTABLE_SIZE_OPTION	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
configuredMaxSSTableSize	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NumberFormatException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"%s is not a parsable int (base10) for %s using default value"	TokenNameStringLiteral
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
SSTABLE_SIZE_OPTION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
maxSSTableSizeInMB	TokenNameIdentifier
=	TokenNameEQUAL
configuredMaxSSTableSize	TokenNameIdentifier
;	TokenNameSEMICOLON
cfs	TokenNameIdentifier
.	TokenNameDOT
getDataTracker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
subscribe	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"{} subscribed to the data tracker."	TokenNameStringLiteral
,	TokenNameCOMMA
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
manifest	TokenNameIdentifier
=	TokenNameEQUAL
LeveledManifest	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
cfs	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
maxSSTableSizeInMB	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Created {}"	TokenNameStringLiteral
,	TokenNameCOMMA
manifest	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
shutdown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
shutdown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cfs	TokenNameIdentifier
.	TokenNameDOT
getDataTracker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
unsubscribe	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getLevelSize	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
manifest	TokenNameIdentifier
.	TokenNameDOT
getLevelSize	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getAllLevelSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
manifest	TokenNameIdentifier
.	TokenNameDOT
getAllLevelSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AbstractCompactionTask	TokenNameIdentifier
getNextBackgroundTask	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
cfs	TokenNameIdentifier
.	TokenNameDOT
isCompactionDisabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
return	TokenNamereturn
getMaximalTask	TokenNameIdentifier
(	TokenNameLPAREN
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
AbstractCompactionTask	TokenNameIdentifier
getMaximalTask	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Collection	TokenNameIdentifier
<	TokenNameLESS
SSTableReader	TokenNameIdentifier
>	TokenNameGREATER
sstables	TokenNameIdentifier
=	TokenNameEQUAL
manifest	TokenNameIdentifier
.	TokenNameDOT
getCompactionCandidates	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
OperationType	TokenNameIdentifier
op	TokenNameIdentifier
=	TokenNameEQUAL
OperationType	TokenNameIdentifier
.	TokenNameDOT
COMPACTION	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sstables	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SSTableReader	TokenNameIdentifier
sstable	TokenNameIdentifier
=	TokenNameEQUAL
findDroppableSSTable	TokenNameIdentifier
(	TokenNameLPAREN
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sstable	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"No compaction necessary for {}"	TokenNameStringLiteral
,	TokenNameCOMMA
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sstables	TokenNameIdentifier
=	TokenNameEQUAL
Collections	TokenNameIdentifier
.	TokenNameDOT
singleton	TokenNameIdentifier
(	TokenNameLPAREN
sstable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
op	TokenNameIdentifier
=	TokenNameEQUAL
OperationType	TokenNameIdentifier
.	TokenNameDOT
TOMBSTONE_COMPACTION	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
cfs	TokenNameIdentifier
.	TokenNameDOT
getDataTracker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
markCompacting	TokenNameIdentifier
(	TokenNameLPAREN
sstables	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Unable to mark {} for compaction; probably a user-defined compaction got in the way"	TokenNameStringLiteral
,	TokenNameCOMMA
sstables	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
LeveledCompactionTask	TokenNameIdentifier
newTask	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LeveledCompactionTask	TokenNameIdentifier
(	TokenNameLPAREN
cfs	TokenNameIdentifier
,	TokenNameCOMMA
sstables	TokenNameIdentifier
,	TokenNameCOMMA
gcBefore	TokenNameIdentifier
,	TokenNameCOMMA
maxSSTableSizeInMB	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
newTask	TokenNameIdentifier
.	TokenNameDOT
setCompactionType	TokenNameIdentifier
(	TokenNameLPAREN
op	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
newTask	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AbstractCompactionTask	TokenNameIdentifier
getUserDefinedTask	TokenNameIdentifier
(	TokenNameLPAREN
Collection	TokenNameIdentifier
<	TokenNameLESS
SSTableReader	TokenNameIdentifier
>	TokenNameGREATER
sstables	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
"LevelDB compaction strategy does not allow user-specified compactions"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getEstimatedRemainingTasks	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
manifest	TokenNameIdentifier
.	TokenNameDOT
getEstimatedTasks	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
handleNotification	TokenNameIdentifier
(	TokenNameLPAREN
INotification	TokenNameIdentifier
notification	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
sender	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
notification	TokenNameIdentifier
instanceof	TokenNameinstanceof
SSTableAddedNotification	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SSTableAddedNotification	TokenNameIdentifier
flushedNotification	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SSTableAddedNotification	TokenNameIdentifier
)	TokenNameRPAREN
notification	TokenNameIdentifier
;	TokenNameSEMICOLON
manifest	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
flushedNotification	TokenNameIdentifier
.	TokenNameDOT
added	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
notification	TokenNameIdentifier
instanceof	TokenNameinstanceof
SSTableListChangedNotification	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SSTableListChangedNotification	TokenNameIdentifier
listChangedNotification	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SSTableListChangedNotification	TokenNameIdentifier
)	TokenNameRPAREN
notification	TokenNameIdentifier
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
listChangedNotification	TokenNameIdentifier
.	TokenNameDOT
compactionType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
CLEANUP	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
SCRUB	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
UPGRADE_SSTABLES	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
TOMBSTONE_COMPACTION	TokenNameIdentifier
:	TokenNameCOLON
manifest	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
listChangedNotification	TokenNameIdentifier
.	TokenNameDOT
removed	TokenNameIdentifier
,	TokenNameCOMMA
listChangedNotification	TokenNameIdentifier
.	TokenNameDOT
added	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
manifest	TokenNameIdentifier
.	TokenNameDOT
promote	TokenNameIdentifier
(	TokenNameLPAREN
listChangedNotification	TokenNameIdentifier
.	TokenNameDOT
removed	TokenNameIdentifier
,	TokenNameCOMMA
listChangedNotification	TokenNameIdentifier
.	TokenNameDOT
added	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getMaxSSTableSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
maxSSTableSizeInMB	TokenNameIdentifier
*	TokenNameMULTIPLY
1024L	TokenNameLongLiteral
*	TokenNameMULTIPLY
1024L	TokenNameLongLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
ICompactionScanner	TokenNameIdentifier
>	TokenNameGREATER
getScanners	TokenNameIdentifier
(	TokenNameLPAREN
Collection	TokenNameIdentifier
<	TokenNameLESS
SSTableReader	TokenNameIdentifier
>	TokenNameGREATER
sstables	TokenNameIdentifier
,	TokenNameCOMMA
Range	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>	TokenNameGREATER
range	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Multimap	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
,	TokenNameCOMMA
SSTableReader	TokenNameIdentifier
>	TokenNameGREATER
byLevel	TokenNameIdentifier
=	TokenNameEQUAL
ArrayListMultimap	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
SSTableReader	TokenNameIdentifier
sstable	TokenNameIdentifier
:	TokenNameCOLON
sstables	TokenNameIdentifier
)	TokenNameRPAREN
byLevel	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
manifest	TokenNameIdentifier
.	TokenNameDOT
levelOf	TokenNameIdentifier
(	TokenNameLPAREN
sstable	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
sstable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
ICompactionScanner	TokenNameIdentifier
>	TokenNameGREATER
scanners	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ICompactionScanner	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
sstables	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Integer	TokenNameIdentifier
level	TokenNameIdentifier
:	TokenNameCOLON
byLevel	TokenNameIdentifier
.	TokenNameDOT
keySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
level	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
SSTableReader	TokenNameIdentifier
sstable	TokenNameIdentifier
:	TokenNameCOLON
byLevel	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
level	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
scanners	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
sstable	TokenNameIdentifier
.	TokenNameDOT
getDirectScanner	TokenNameIdentifier
(	TokenNameLPAREN
range	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
scanners	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
LeveledScanner	TokenNameIdentifier
(	TokenNameLPAREN
byLevel	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
level	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
range	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
scanners	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
LeveledScanner	TokenNameIdentifier
extends	TokenNameextends
AbstractIterator	TokenNameIdentifier
<	TokenNameLESS
OnDiskAtomIterator	TokenNameIdentifier
>	TokenNameGREATER
implements	TokenNameimplements
ICompactionScanner	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Range	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>	TokenNameGREATER
range	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
SSTableReader	TokenNameIdentifier
>	TokenNameGREATER
sstables	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Iterator	TokenNameIdentifier
<	TokenNameLESS
SSTableReader	TokenNameIdentifier
>	TokenNameGREATER
sstableIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
long	TokenNamelong
totalLength	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SSTableScanner	TokenNameIdentifier
currentScanner	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
positionOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
LeveledScanner	TokenNameIdentifier
(	TokenNameLPAREN
Collection	TokenNameIdentifier
<	TokenNameLESS
SSTableReader	TokenNameIdentifier
>	TokenNameGREATER
sstables	TokenNameIdentifier
,	TokenNameCOMMA
Range	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>	TokenNameGREATER
range	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
range	TokenNameIdentifier
=	TokenNameEQUAL
range	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
sstables	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
SSTableReader	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
sstables	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Collections	TokenNameIdentifier
.	TokenNameDOT
sort	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
sstables	TokenNameIdentifier
,	TokenNameCOMMA
SSTable	TokenNameIdentifier
.	TokenNameDOT
sstableComparator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sstableIterator	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
sstables	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
currentScanner	TokenNameIdentifier
=	TokenNameEQUAL
sstableIterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDirectScanner	TokenNameIdentifier
(	TokenNameLPAREN
range	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
length	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
SSTableReader	TokenNameIdentifier
sstable	TokenNameIdentifier
:	TokenNameCOLON
sstables	TokenNameIdentifier
)	TokenNameRPAREN
length	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
sstable	TokenNameIdentifier
.	TokenNameDOT
uncompressedLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
totalLength	TokenNameIdentifier
=	TokenNameEQUAL
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
OnDiskAtomIterator	TokenNameIdentifier
computeNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
currentScanner	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
currentScanner	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
positionOffset	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
currentScanner	TokenNameIdentifier
.	TokenNameDOT
getLengthInBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
currentScanner	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
sstableIterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
currentScanner	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
return	TokenNamereturn
endOfData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
currentScanner	TokenNameIdentifier
=	TokenNameEQUAL
sstableIterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDirectScanner	TokenNameIdentifier
(	TokenNameLPAREN
range	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
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
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
currentScanner	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
currentScanner	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getLengthInBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
totalLength	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getCurrentPosition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
positionOffset	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
currentScanner	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
0L	TokenNameLongLiteral
:	TokenNameCOLON
currentScanner	TokenNameIdentifier
.	TokenNameDOT
getCurrentPosition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getBackingFiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Joiner	TokenNameIdentifier
.	TokenNameDOT
on	TokenNameIdentifier
(	TokenNameLPAREN
", "	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
join	TokenNameIdentifier
(	TokenNameLPAREN
sstables	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"LCS@%d(%s)"	TokenNameStringLiteral
,	TokenNameCOMMA
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
cfs	TokenNameIdentifier
.	TokenNameDOT
columnFamily	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
SSTableReader	TokenNameIdentifier
findDroppableSSTable	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
level	TokenNameIdentifier
:	TokenNameCOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
manifest	TokenNameIdentifier
.	TokenNameDOT
getLevelCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
SortedSet	TokenNameIdentifier
<	TokenNameLESS
SSTableReader	TokenNameIdentifier
>	TokenNameGREATER
sstables	TokenNameIdentifier
=	TokenNameEQUAL
manifest	TokenNameIdentifier
.	TokenNameDOT
getLevelSorted	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Comparator	TokenNameIdentifier
<	TokenNameLESS
SSTableReader	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
SSTableReader	TokenNameIdentifier
o1	TokenNameIdentifier
,	TokenNameCOMMA
SSTableReader	TokenNameIdentifier
o2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
r1	TokenNameIdentifier
=	TokenNameEQUAL
o1	TokenNameIdentifier
.	TokenNameDOT
getEstimatedDroppableTombstoneRatio	TokenNameIdentifier
(	TokenNameLPAREN
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
r2	TokenNameIdentifier
=	TokenNameEQUAL
o2	TokenNameIdentifier
.	TokenNameDOT
getEstimatedDroppableTombstoneRatio	TokenNameIdentifier
(	TokenNameLPAREN
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
Doubles	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
r1	TokenNameIdentifier
,	TokenNameCOMMA
r2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sstables	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
SSTableReader	TokenNameIdentifier
sstable	TokenNameIdentifier
:	TokenNameCOLON
sstables	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
sstable	TokenNameIdentifier
.	TokenNameDOT
getEstimatedDroppableTombstoneRatio	TokenNameIdentifier
(	TokenNameLPAREN
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
tombstoneThreshold	TokenNameIdentifier
)	TokenNameRPAREN
continue	TokenNamecontinue
level	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
sstable	TokenNameIdentifier
.	TokenNameDOT
isMarkedSuspect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
worthDroppingTombstones	TokenNameIdentifier
(	TokenNameLPAREN
sstable	TokenNameIdentifier
,	TokenNameCOMMA
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
sstable	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
