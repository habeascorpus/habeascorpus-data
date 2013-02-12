package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
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
Comparator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
class	TokenNameclass
MeteredFlusher	TokenNameIdentifier
implements	TokenNameimplements
Runnable	TokenNameIdentifier
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
MeteredFlusher	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Memtable	TokenNameIdentifier
activelyMeasuring	TokenNameIdentifier
=	TokenNameEQUAL
Memtable	TokenNameIdentifier
.	TokenNameDOT
activelyMeasuring	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
flushingBytes	TokenNameIdentifier
=	TokenNameEQUAL
activelyMeasuring	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
activelyMeasuring	TokenNameIdentifier
.	TokenNameDOT
getLiveSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
flushingBytes	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
countFlushingBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
liveBytes	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
:	TokenNameCOLON
ColumnFamilyStore	TokenNameIdentifier
.	TokenNameDOT
all	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
size	TokenNameIdentifier
=	TokenNameEQUAL
cfs	TokenNameIdentifier
.	TokenNameDOT
getTotalMemtableLiveSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
maxInFlight	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
ceil	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
+	TokenNamePLUS
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getFlushWriters	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getFlushQueueSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
+	TokenNamePLUS
cfs	TokenNameIdentifier
.	TokenNameDOT
indexManager	TokenNameIdentifier
.	TokenNameDOT
getIndexesBackedByCfs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
size	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getTotalMemtableSpaceInMB	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
1048576L	TokenNameLongLiteral
-	TokenNameMINUS
flushingBytes	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
maxInFlight	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"flushing high-traffic column family {} (estimated {} bytes)"	TokenNameStringLiteral
,	TokenNameCOMMA
cfs	TokenNameIdentifier
,	TokenNameCOMMA
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cfs	TokenNameIdentifier
.	TokenNameDOT
forceFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
liveBytes	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
flushingBytes	TokenNameIdentifier
+	TokenNamePLUS
liveBytes	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getTotalMemtableSpaceInMB	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
1048576L	TokenNameLongLiteral
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"estimated {} bytes used by all memtables pre-flush"	TokenNameStringLiteral
,	TokenNameCOMMA
liveBytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
ColumnFamilyStore	TokenNameIdentifier
>	TokenNameGREATER
sorted	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ColumnFamilyStore	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterables	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
sorted	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamilyStore	TokenNameIdentifier
.	TokenNameDOT
all	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Collections	TokenNameIdentifier
.	TokenNameDOT
sort	TokenNameIdentifier
(	TokenNameLPAREN
sorted	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Comparator	TokenNameIdentifier
<	TokenNameLESS
ColumnFamilyStore	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamilyStore	TokenNameIdentifier
o1	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamilyStore	TokenNameIdentifier
o2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
size1	TokenNameIdentifier
=	TokenNameEQUAL
o1	TokenNameIdentifier
.	TokenNameDOT
getTotalMemtableLiveSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
size2	TokenNameIdentifier
=	TokenNameEQUAL
o2	TokenNameIdentifier
.	TokenNameDOT
getTotalMemtableLiveSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
size1	TokenNameIdentifier
<	TokenNameLESS
size2	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
size1	TokenNameIdentifier
>	TokenNameGREATER
size2	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
flushingBytes	TokenNameIdentifier
=	TokenNameEQUAL
countFlushingBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
liveBytes	TokenNameIdentifier
+	TokenNamePLUS
flushingBytes	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getTotalMemtableSpaceInMB	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
1048576L	TokenNameLongLiteral
||	TokenNameOR_OR
sorted	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
=	TokenNameEQUAL
sorted	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
sorted	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
size	TokenNameIdentifier
=	TokenNameEQUAL
cfs	TokenNameIdentifier
.	TokenNameDOT
getTotalMemtableLiveSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"flushing {} to free up {} bytes"	TokenNameStringLiteral
,	TokenNameCOMMA
cfs	TokenNameIdentifier
,	TokenNameCOMMA
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
liveBytes	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
size	TokenNameIdentifier
;	TokenNameSEMICOLON
cfs	TokenNameIdentifier
.	TokenNameDOT
forceFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"memtable memory usage is {} bytes with {} live"	TokenNameStringLiteral
,	TokenNameCOMMA
liveBytes	TokenNameIdentifier
+	TokenNamePLUS
flushingBytes	TokenNameIdentifier
,	TokenNameCOMMA
liveBytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
long	TokenNamelong
countFlushingBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
flushingBytes	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
:	TokenNameCOLON
ColumnFamilyStore	TokenNameIdentifier
.	TokenNameDOT
all	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Memtable	TokenNameIdentifier
memtable	TokenNameIdentifier
:	TokenNameCOLON
cfs	TokenNameIdentifier
.	TokenNameDOT
getMemtablesPendingFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
flushingBytes	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
memtable	TokenNameIdentifier
.	TokenNameDOT
getLiveSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
flushingBytes	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE