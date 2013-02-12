package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedOutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataOutputStream	TokenNameIdentifier
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
net	TokenNameIdentifier
.	TokenNameDOT
Socket	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
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
atomic	TokenNameIdentifier
.	TokenNameDOT
AtomicLong	TokenNameIdentifier
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
tracing	TokenNameIdentifier
.	TokenNameDOT
TraceState	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
tracing	TokenNameIdentifier
.	TokenNameDOT
Tracing	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
UUIDGen	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xerial	TokenNameIdentifier
.	TokenNameDOT
snappy	TokenNameIdentifier
.	TokenNameDOT
SnappyOutputStream	TokenNameIdentifier
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
Config	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
OutboundTcpConnection	TokenNameIdentifier
extends	TokenNameextends
Thread	TokenNameIdentifier
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
OutboundTcpConnection	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
MessageOut	TokenNameIdentifier
CLOSE_SENTINEL	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MessageOut	TokenNameIdentifier
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
Verb	TokenNameIdentifier
.	TokenNameDOT
INTERNAL_RESPONSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
OPEN_RETRY_DELAY	TokenNameIdentifier
=	TokenNameEQUAL
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
BlockingQueue	TokenNameIdentifier
<	TokenNameLESS
QueuedMessage	TokenNameIdentifier
>	TokenNameGREATER
backlog	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedBlockingQueue	TokenNameIdentifier
<	TokenNameLESS
QueuedMessage	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
BlockingQueue	TokenNameIdentifier
<	TokenNameLESS
QueuedMessage	TokenNameIdentifier
>	TokenNameGREATER
active	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedBlockingQueue	TokenNameIdentifier
<	TokenNameLESS
QueuedMessage	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
OutboundTcpConnectionPool	TokenNameIdentifier
poolReference	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
DataOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Socket	TokenNameIdentifier
socket	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
long	TokenNamelong
completed	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
AtomicLong	TokenNameIdentifier
dropped	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AtomicLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
targetVersion	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
OutboundTcpConnection	TokenNameIdentifier
(	TokenNameLPAREN
OutboundTcpConnectionPool	TokenNameIdentifier
pool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
"WRITE-"	TokenNameStringLiteral
+	TokenNamePLUS
pool	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
poolReference	TokenNameIdentifier
=	TokenNameEQUAL
pool	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
boolean	TokenNameboolean
isLocalDC	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
targetHost	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
remoteDC	TokenNameIdentifier
=	TokenNameEQUAL
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getEndpointSnitch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDatacenter	TokenNameIdentifier
(	TokenNameLPAREN
targetHost	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
localDC	TokenNameIdentifier
=	TokenNameEQUAL
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getEndpointSnitch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDatacenter	TokenNameIdentifier
(	TokenNameLPAREN
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getRpcAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
remoteDC	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
localDC	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
enqueue	TokenNameIdentifier
(	TokenNameLPAREN
MessageOut	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
id	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
expireMessages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
backlog	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueuedMessage	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
id	TokenNameIdentifier
,	TokenNameCOMMA
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
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
}	TokenNameRBRACE
void	TokenNamevoid
closeSocket	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
active	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
backlog	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
enqueue	TokenNameIdentifier
(	TokenNameLPAREN
CLOSE_SENTINEL	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
softCloseSocket	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
enqueue	TokenNameIdentifier
(	TokenNameLPAREN
CLOSE_SENTINEL	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getTargetVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
targetVersion	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
QueuedMessage	TokenNameIdentifier
qm	TokenNameIdentifier
=	TokenNameEQUAL
active	TokenNameIdentifier
.	TokenNameDOT
poll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
qm	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
qm	TokenNameIdentifier
=	TokenNameEQUAL
backlog	TokenNameIdentifier
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
BlockingQueue	TokenNameIdentifier
<	TokenNameLESS
QueuedMessage	TokenNameIdentifier
>	TokenNameGREATER
tmp	TokenNameIdentifier
=	TokenNameEQUAL
backlog	TokenNameIdentifier
;	TokenNameSEMICOLON
backlog	TokenNameIdentifier
=	TokenNameEQUAL
active	TokenNameIdentifier
;	TokenNameSEMICOLON
active	TokenNameIdentifier
=	TokenNameEQUAL
tmp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
MessageOut	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
m	TokenNameIdentifier
=	TokenNameEQUAL
qm	TokenNameIdentifier
.	TokenNameDOT
message	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
CLOSE_SENTINEL	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
disconnect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
qm	TokenNameIdentifier
.	TokenNameDOT
timestamp	TokenNameIdentifier
<	TokenNameLESS
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
m	TokenNameIdentifier
.	TokenNameDOT
getTimeout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
dropped	TokenNameIdentifier
.	TokenNameDOT
incrementAndGet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
socket	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
connect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
writeConnected	TokenNameIdentifier
(	TokenNameLPAREN
qm	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
active	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getPendingMessages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
active	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
backlog	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getCompletedMesssages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
completed	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getDroppedMessages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
dropped	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
shouldCompressConnection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
internodeCompression	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
Config	TokenNameIdentifier
.	TokenNameDOT
InternodeCompression	TokenNameIdentifier
.	TokenNameDOT
all	TokenNameIdentifier
||	TokenNameOR_OR
(	TokenNameLPAREN
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
internodeCompression	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
Config	TokenNameIdentifier
.	TokenNameDOT
InternodeCompression	TokenNameIdentifier
.	TokenNameDOT
dc	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
isLocalDC	TokenNameIdentifier
(	TokenNameLPAREN
poolReference	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
writeConnected	TokenNameIdentifier
(	TokenNameLPAREN
QueuedMessage	TokenNameIdentifier
qm	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
sessionBytes	TokenNameIdentifier
=	TokenNameEQUAL
qm	TokenNameIdentifier
.	TokenNameDOT
message	TokenNameIdentifier
.	TokenNameDOT
parameters	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
Tracing	TokenNameIdentifier
.	TokenNameDOT
TRACE_HEADER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sessionBytes	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
UUID	TokenNameIdentifier
sessionId	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getUUID	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
sessionBytes	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TraceState	TokenNameIdentifier
state	TokenNameIdentifier
=	TokenNameEQUAL
Tracing	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
sessionId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
state	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Sending message to {}"	TokenNameStringLiteral
,	TokenNameCOMMA
poolReference	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Tracing	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
stopIfNonLocal	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
write	TokenNameIdentifier
(	TokenNameLPAREN
qm	TokenNameIdentifier
.	TokenNameDOT
message	TokenNameIdentifier
,	TokenNameCOMMA
qm	TokenNameIdentifier
.	TokenNameDOT
id	TokenNameIdentifier
,	TokenNameCOMMA
qm	TokenNameIdentifier
.	TokenNameDOT
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
targetVersion	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
completed	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
active	TokenNameIdentifier
.	TokenNameDOT
peek	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
e	TokenNameIdentifier
instanceof	TokenNameinstanceof
IOException	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"error writing to "	TokenNameStringLiteral
+	TokenNamePLUS
poolReference	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
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
"error writing to "	TokenNameStringLiteral
+	TokenNamePLUS
poolReference	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
disconnect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
write	TokenNameIdentifier
(	TokenNameLPAREN
MessageOut	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
DataOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
PROTOCOL_MAGIC	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
version	TokenNameIdentifier
<	TokenNameLESS
MessagingService	TokenNameIdentifier
.	TokenNameDOT
VERSION_12	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
writeHeader	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeUTF	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
version	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
MessagingService	TokenNameIdentifier
.	TokenNameDOT
VERSION_12	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
message	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
writeHeader	TokenNameIdentifier
(	TokenNameLPAREN
DataOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
compressionEnabled	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
header	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
compressionEnabled	TokenNameIdentifier
)	TokenNameRPAREN
header	TokenNameIdentifier
|=	TokenNameOR_EQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
header	TokenNameIdentifier
|=	TokenNameOR_EQUAL
(	TokenNameLPAREN
version	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
header	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
disconnect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
socket	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
socket	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
isTraceEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"exception closing connection to "	TokenNameStringLiteral
+	TokenNamePLUS
poolReference	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
out	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
socket	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
connect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
"attempting to connect to "	TokenNameStringLiteral
+	TokenNamePLUS
poolReference	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
targetVersion	TokenNameIdentifier
=	TokenNameEQUAL
MessagingService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
poolReference	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
start	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
start	TokenNameIdentifier
+	TokenNamePLUS
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getRpcTimeout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
socket	TokenNameIdentifier
=	TokenNameEQUAL
poolReference	TokenNameIdentifier
.	TokenNameDOT
newSocket	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
socket	TokenNameIdentifier
.	TokenNameDOT
setKeepAlive	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
socket	TokenNameIdentifier
.	TokenNameDOT
setTcpNoDelay	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
BufferedOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
socket	TokenNameIdentifier
.	TokenNameDOT
getOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
4096	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
targetVersion	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
MessagingService	TokenNameIdentifier
.	TokenNameDOT
VERSION_12	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
PROTOCOL_MAGIC	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writeHeader	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
targetVersion	TokenNameIdentifier
,	TokenNameCOMMA
shouldCompressConnection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataInputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataInputStream	TokenNameIdentifier
(	TokenNameLPAREN
socket	TokenNameIdentifier
.	TokenNameDOT
getInputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
maxTargetVersion	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
targetVersion	TokenNameIdentifier
>	TokenNameGREATER
maxTargetVersion	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Target max version is {}; will reconnect with that version"	TokenNameStringLiteral
,	TokenNameCOMMA
maxTargetVersion	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MessagingService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setVersion	TokenNameIdentifier
(	TokenNameLPAREN
poolReference	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
maxTargetVersion	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
disconnect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
targetVersion	TokenNameIdentifier
<	TokenNameLESS
maxTargetVersion	TokenNameIdentifier
&&	TokenNameAND_AND
targetVersion	TokenNameIdentifier
<	TokenNameLESS
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Detected higher max version {} (using {}); will reconnect when queued messages are done"	TokenNameStringLiteral
,	TokenNameCOMMA
maxTargetVersion	TokenNameIdentifier
,	TokenNameCOMMA
targetVersion	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MessagingService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setVersion	TokenNameIdentifier
(	TokenNameLPAREN
poolReference	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
,	TokenNameCOMMA
maxTargetVersion	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
softCloseSocket	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CompactEndpointSerializationHelper	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
FBUtilities	TokenNameIdentifier
.	TokenNameDOT
getBroadcastAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
shouldCompressConnection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Upgrading OutputStream to be compressed"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SnappyOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
BufferedOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
socket	TokenNameIdentifier
.	TokenNameDOT
getOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
socket	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
isTraceEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"unable to connect to "	TokenNameStringLiteral
+	TokenNamePLUS
poolReference	TokenNameIdentifier
.	TokenNameDOT
endPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
OPEN_RETRY_DELAY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
e1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
AssertionError	TokenNameIdentifier
(	TokenNameLPAREN
e1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
expireMessages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
QueuedMessage	TokenNameIdentifier
qm	TokenNameIdentifier
=	TokenNameEQUAL
backlog	TokenNameIdentifier
.	TokenNameDOT
peek	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
qm	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
qm	TokenNameIdentifier
.	TokenNameDOT
timestamp	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
qm	TokenNameIdentifier
.	TokenNameDOT
message	TokenNameIdentifier
.	TokenNameDOT
getTimeout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
QueuedMessage	TokenNameIdentifier
qm2	TokenNameIdentifier
=	TokenNameEQUAL
backlog	TokenNameIdentifier
.	TokenNameDOT
poll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
qm2	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
qm	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
qm2	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
active	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
qm2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
dropped	TokenNameIdentifier
.	TokenNameDOT
incrementAndGet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
QueuedMessage	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
MessageOut	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
message	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
id	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
long	TokenNamelong
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
QueuedMessage	TokenNameIdentifier
(	TokenNameLPAREN
MessageOut	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
message	TokenNameIdentifier
=	TokenNameEQUAL
message	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
id	TokenNameIdentifier
=	TokenNameEQUAL
id	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
timestamp	TokenNameIdentifier
=	TokenNameEQUAL
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
