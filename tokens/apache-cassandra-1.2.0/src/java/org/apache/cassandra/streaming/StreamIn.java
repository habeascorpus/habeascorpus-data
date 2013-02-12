package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
streaming	TokenNameIdentifier
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
net	TokenNameIdentifier
.	TokenNameDOT
InetAddress	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
StringUtils	TokenNameIdentifier
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
Directories	TokenNameIdentifier
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
Descriptor	TokenNameIdentifier
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
FBUtilities	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
StreamIn	TokenNameIdentifier
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
StreamIn	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
requestRanges	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
source	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
tableName	TokenNameIdentifier
,	TokenNameCOMMA
Collection	TokenNameIdentifier
<	TokenNameLESS
Range	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
ranges	TokenNameIdentifier
,	TokenNameCOMMA
IStreamCallback	TokenNameIdentifier
callback	TokenNameIdentifier
,	TokenNameCOMMA
OperationType	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
requestRanges	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
,	TokenNameCOMMA
tableName	TokenNameIdentifier
,	TokenNameCOMMA
Table	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
tableName	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getColumnFamilyStores	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ranges	TokenNameIdentifier
,	TokenNameCOMMA
callback	TokenNameIdentifier
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
requestRanges	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
source	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
tableName	TokenNameIdentifier
,	TokenNameCOMMA
Collection	TokenNameIdentifier
<	TokenNameLESS
ColumnFamilyStore	TokenNameIdentifier
>	TokenNameGREATER
columnFamilies	TokenNameIdentifier
,	TokenNameCOMMA
Collection	TokenNameIdentifier
<	TokenNameLESS
Range	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
ranges	TokenNameIdentifier
,	TokenNameCOMMA
IStreamCallback	TokenNameIdentifier
callback	TokenNameIdentifier
,	TokenNameCOMMA
OperationType	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
ranges	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
isDebugEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Requesting from {} ranges {}"	TokenNameStringLiteral
,	TokenNameCOMMA
source	TokenNameIdentifier
,	TokenNameCOMMA
StringUtils	TokenNameIdentifier
.	TokenNameDOT
join	TokenNameIdentifier
(	TokenNameLPAREN
ranges	TokenNameIdentifier
,	TokenNameCOMMA
", "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StreamInSession	TokenNameIdentifier
session	TokenNameIdentifier
=	TokenNameEQUAL
StreamInSession	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
source	TokenNameIdentifier
,	TokenNameCOMMA
callback	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StreamRequest	TokenNameIdentifier
srm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StreamRequest	TokenNameIdentifier
(	TokenNameLPAREN
FBUtilities	TokenNameIdentifier
.	TokenNameDOT
getBroadcastAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ranges	TokenNameIdentifier
,	TokenNameCOMMA
tableName	TokenNameIdentifier
,	TokenNameCOMMA
columnFamilies	TokenNameIdentifier
,	TokenNameCOMMA
session	TokenNameIdentifier
.	TokenNameDOT
getSessionId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MessagingService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
sendOneWay	TokenNameIdentifier
(	TokenNameLPAREN
srm	TokenNameIdentifier
.	TokenNameDOT
createMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
source	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
PendingFile	TokenNameIdentifier
getContextMapping	TokenNameIdentifier
(	TokenNameLPAREN
PendingFile	TokenNameIdentifier
remote	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Descriptor	TokenNameIdentifier
remotedesc	TokenNameIdentifier
=	TokenNameEQUAL
remote	TokenNameIdentifier
.	TokenNameDOT
desc	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
remotedesc	TokenNameIdentifier
.	TokenNameDOT
isStreamCompatible	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"SSTable %s is not compatible with current version %s"	TokenNameStringLiteral
,	TokenNameCOMMA
remote	TokenNameIdentifier
.	TokenNameDOT
getFilename	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Descriptor	TokenNameIdentifier
.	TokenNameDOT
Version	TokenNameIdentifier
.	TokenNameDOT
CURRENT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Table	TokenNameIdentifier
table	TokenNameIdentifier
=	TokenNameEQUAL
Table	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
remotedesc	TokenNameIdentifier
.	TokenNameDOT
ksname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnFamilyStore	TokenNameIdentifier
cfStore	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilyStore	TokenNameIdentifier
(	TokenNameLPAREN
remotedesc	TokenNameIdentifier
.	TokenNameDOT
cfname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Directories	TokenNameIdentifier
.	TokenNameDOT
DataDirectory	TokenNameIdentifier
localDir	TokenNameIdentifier
=	TokenNameEQUAL
Directories	TokenNameIdentifier
.	TokenNameDOT
getLocationCapableOfSize	TokenNameIdentifier
(	TokenNameLPAREN
remote	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
localDir	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"Insufficient disk space to store "	TokenNameStringLiteral
+	TokenNamePLUS
remote	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
+	TokenNamePLUS
" bytes"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Descriptor	TokenNameIdentifier
localdesc	TokenNameIdentifier
=	TokenNameEQUAL
Descriptor	TokenNameIdentifier
.	TokenNameDOT
fromFilename	TokenNameIdentifier
(	TokenNameLPAREN
cfStore	TokenNameIdentifier
.	TokenNameDOT
getTempSSTablePath	TokenNameIdentifier
(	TokenNameLPAREN
cfStore	TokenNameIdentifier
.	TokenNameDOT
directories	TokenNameIdentifier
.	TokenNameDOT
getLocationForDisk	TokenNameIdentifier
(	TokenNameLPAREN
localDir	TokenNameIdentifier
.	TokenNameDOT
location	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
PendingFile	TokenNameIdentifier
(	TokenNameLPAREN
localdesc	TokenNameIdentifier
,	TokenNameCOMMA
remote	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
