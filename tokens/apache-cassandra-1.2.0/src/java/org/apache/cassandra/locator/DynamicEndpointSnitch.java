package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
locator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
management	TokenNameIdentifier
.	TokenNameDOT
ManagementFactory	TokenNameIdentifier
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
UnknownHostException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
ConcurrentHashMap	TokenNameIdentifier
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
javax	TokenNameIdentifier
.	TokenNameDOT
management	TokenNameIdentifier
.	TokenNameDOT
MBeanServer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
management	TokenNameIdentifier
.	TokenNameDOT
ObjectName	TokenNameIdentifier
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
FBUtilities	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
yammer	TokenNameIdentifier
.	TokenNameDOT
metrics	TokenNameIdentifier
.	TokenNameDOT
stats	TokenNameIdentifier
.	TokenNameDOT
ExponentiallyDecayingSample	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DynamicEndpointSnitch	TokenNameIdentifier
extends	TokenNameextends
AbstractEndpointSnitch	TokenNameIdentifier
implements	TokenNameimplements
ILatencySubscriber	TokenNameIdentifier
,	TokenNameCOMMA
DynamicEndpointSnitchMBean	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
ALPHA	TokenNameIdentifier
=	TokenNameEQUAL
0.75	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
WINDOW_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier
=	TokenNameEQUAL
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getDynamicUpdateInterval	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
RESET_INTERVAL_IN_MS	TokenNameIdentifier
=	TokenNameEQUAL
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getDynamicResetInterval	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
BADNESS_THRESHOLD	TokenNameIdentifier
=	TokenNameEQUAL
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getDynamicBadnessThreshold	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
mbeanName	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
registered	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ConcurrentHashMap	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
>	TokenNameGREATER
scores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ConcurrentHashMap	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ConcurrentHashMap	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
Long	TokenNameIdentifier
>	TokenNameGREATER
lastReceived	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ConcurrentHashMap	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
Long	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ConcurrentHashMap	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
ExponentiallyDecayingSample	TokenNameIdentifier
>	TokenNameGREATER
samples	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ConcurrentHashMap	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
ExponentiallyDecayingSample	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
IEndpointSnitch	TokenNameIdentifier
subsnitch	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DynamicEndpointSnitch	TokenNameIdentifier
(	TokenNameLPAREN
IEndpointSnitch	TokenNameIdentifier
snitch	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
snitch	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DynamicEndpointSnitch	TokenNameIdentifier
(	TokenNameLPAREN
IEndpointSnitch	TokenNameIdentifier
snitch	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
instance	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
mbeanName	TokenNameIdentifier
=	TokenNameEQUAL
"org.apache.cassandra.db:type=DynamicEndpointSnitch"	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
instance	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
mbeanName	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
",instance="	TokenNameStringLiteral
+	TokenNamePLUS
instance	TokenNameIdentifier
;	TokenNameSEMICOLON
subsnitch	TokenNameIdentifier
=	TokenNameEQUAL
snitch	TokenNameIdentifier
;	TokenNameSEMICOLON
Runnable	TokenNameIdentifier
update	TokenNameIdentifier
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
updateScores	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
Runnable	TokenNameIdentifier
reset	TokenNameIdentifier
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
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
StorageService	TokenNameIdentifier
.	TokenNameDOT
scheduledTasks	TokenNameIdentifier
.	TokenNameDOT
scheduleWithFixedDelay	TokenNameIdentifier
(	TokenNameLPAREN
update	TokenNameIdentifier
,	TokenNameCOMMA
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier
,	TokenNameCOMMA
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier
,	TokenNameCOMMA
TimeUnit	TokenNameIdentifier
.	TokenNameDOT
MILLISECONDS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StorageService	TokenNameIdentifier
.	TokenNameDOT
scheduledTasks	TokenNameIdentifier
.	TokenNameDOT
scheduleWithFixedDelay	TokenNameIdentifier
(	TokenNameLPAREN
reset	TokenNameIdentifier
,	TokenNameCOMMA
RESET_INTERVAL_IN_MS	TokenNameIdentifier
,	TokenNameCOMMA
RESET_INTERVAL_IN_MS	TokenNameIdentifier
,	TokenNameCOMMA
TimeUnit	TokenNameIdentifier
.	TokenNameDOT
MILLISECONDS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
registerMBean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
registerMBean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
MBeanServer	TokenNameIdentifier
mbs	TokenNameIdentifier
=	TokenNameEQUAL
ManagementFactory	TokenNameIdentifier
.	TokenNameDOT
getPlatformMBeanServer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
mbs	TokenNameIdentifier
.	TokenNameDOT
registerMBean	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
new	TokenNamenew
ObjectName	TokenNameIdentifier
(	TokenNameLPAREN
mbeanName	TokenNameIdentifier
)	TokenNameRPAREN
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
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
unregisterMBean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
MBeanServer	TokenNameIdentifier
mbs	TokenNameIdentifier
=	TokenNameEQUAL
ManagementFactory	TokenNameIdentifier
.	TokenNameDOT
getPlatformMBeanServer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
mbs	TokenNameIdentifier
.	TokenNameDOT
unregisterMBean	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ObjectName	TokenNameIdentifier
(	TokenNameLPAREN
mbeanName	TokenNameIdentifier
)	TokenNameRPAREN
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
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
gossiperStarting	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
subsnitch	TokenNameIdentifier
.	TokenNameDOT
gossiperStarting	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getRack	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
endpoint	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
subsnitch	TokenNameIdentifier
.	TokenNameDOT
getRack	TokenNameIdentifier
(	TokenNameLPAREN
endpoint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getDatacenter	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
endpoint	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
subsnitch	TokenNameIdentifier
.	TokenNameDOT
getDatacenter	TokenNameIdentifier
(	TokenNameLPAREN
endpoint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
>	TokenNameGREATER
getSortedListByProximity	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
InetAddress	TokenNameIdentifier
address	TokenNameIdentifier
,	TokenNameCOMMA
Collection	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
>	TokenNameGREATER
addresses	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
>	TokenNameGREATER
list	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
addresses	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sortByProximity	TokenNameIdentifier
(	TokenNameLPAREN
address	TokenNameIdentifier
,	TokenNameCOMMA
list	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
list	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
sortByProximity	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
InetAddress	TokenNameIdentifier
address	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
>	TokenNameGREATER
addresses	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
address	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
FBUtilities	TokenNameIdentifier
.	TokenNameDOT
getBroadcastAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
BADNESS_THRESHOLD	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
sortByProximityWithScore	TokenNameIdentifier
(	TokenNameLPAREN
address	TokenNameIdentifier
,	TokenNameCOMMA
addresses	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
sortByProximityWithBadness	TokenNameIdentifier
(	TokenNameLPAREN
address	TokenNameIdentifier
,	TokenNameCOMMA
addresses	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
sortByProximityWithScore	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
InetAddress	TokenNameIdentifier
address	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
>	TokenNameGREATER
addresses	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
sortByProximity	TokenNameIdentifier
(	TokenNameLPAREN
address	TokenNameIdentifier
,	TokenNameCOMMA
addresses	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
sortByProximityWithBadness	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
InetAddress	TokenNameIdentifier
address	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
>	TokenNameGREATER
addresses	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
addresses	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
subsnitch	TokenNameIdentifier
.	TokenNameDOT
sortByProximity	TokenNameIdentifier
(	TokenNameLPAREN
address	TokenNameIdentifier
,	TokenNameCOMMA
addresses	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Double	TokenNameIdentifier
first	TokenNameIdentifier
=	TokenNameEQUAL
scores	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
addresses	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
first	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
addr	TokenNameIdentifier
:	TokenNameCOLON
addresses	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Double	TokenNameIdentifier
next	TokenNameIdentifier
=	TokenNameEQUAL
scores	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
addr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
next	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
first	TokenNameIdentifier
-	TokenNameMINUS
next	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
first	TokenNameIdentifier
>	TokenNameGREATER
BADNESS_THRESHOLD	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sortByProximityWithScore	TokenNameIdentifier
(	TokenNameLPAREN
address	TokenNameIdentifier
,	TokenNameCOMMA
addresses	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareEndpoints	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
InetAddress	TokenNameIdentifier
a1	TokenNameIdentifier
,	TokenNameCOMMA
InetAddress	TokenNameIdentifier
a2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Double	TokenNameIdentifier
scored1	TokenNameIdentifier
=	TokenNameEQUAL
scores	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
a1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Double	TokenNameIdentifier
scored2	TokenNameIdentifier
=	TokenNameEQUAL
scores	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
a2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
scored1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
scored1	TokenNameIdentifier
=	TokenNameEQUAL
0.0	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
receiveTiming	TokenNameIdentifier
(	TokenNameLPAREN
a1	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
scored2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
scored2	TokenNameIdentifier
=	TokenNameEQUAL
0.0	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
receiveTiming	TokenNameIdentifier
(	TokenNameLPAREN
a2	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
scored1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
scored2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
subsnitch	TokenNameIdentifier
.	TokenNameDOT
compareEndpoints	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
a1	TokenNameIdentifier
,	TokenNameCOMMA
a2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
scored1	TokenNameIdentifier
<	TokenNameLESS
scored2	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
receiveTiming	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
host	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
latency	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
lastReceived	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
host	TokenNameIdentifier
,	TokenNameCOMMA
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ExponentiallyDecayingSample	TokenNameIdentifier
sample	TokenNameIdentifier
=	TokenNameEQUAL
samples	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
host	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sample	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
ExponentiallyDecayingSample	TokenNameIdentifier
maybeNewSample	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ExponentiallyDecayingSample	TokenNameIdentifier
(	TokenNameLPAREN
WINDOW_SIZE	TokenNameIdentifier
,	TokenNameCOMMA
ALPHA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sample	TokenNameIdentifier
=	TokenNameEQUAL
samples	TokenNameIdentifier
.	TokenNameDOT
putIfAbsent	TokenNameIdentifier
(	TokenNameLPAREN
host	TokenNameIdentifier
,	TokenNameCOMMA
maybeNewSample	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sample	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
sample	TokenNameIdentifier
=	TokenNameEQUAL
maybeNewSample	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sample	TokenNameIdentifier
.	TokenNameDOT
update	TokenNameIdentifier
(	TokenNameLPAREN
latency	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
updateScores	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
isInitialized	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
registered	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
MessagingService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
register	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
registered	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
double	TokenNamedouble
maxLatency	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
long	TokenNamelong
maxPenalty	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
HashMap	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
Long	TokenNameIdentifier
>	TokenNameGREATER
penalties	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
Long	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
ExponentiallyDecayingSample	TokenNameIdentifier
>	TokenNameGREATER
entry	TokenNameIdentifier
:	TokenNameCOLON
samples	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
mean	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSnapshot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMedian	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
mean	TokenNameIdentifier
>	TokenNameGREATER
maxLatency	TokenNameIdentifier
)	TokenNameRPAREN
maxLatency	TokenNameIdentifier
=	TokenNameEQUAL
mean	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
timePenalty	TokenNameIdentifier
=	TokenNameEQUAL
lastReceived	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
lastReceived	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
timePenalty	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
timePenalty	TokenNameIdentifier
;	TokenNameSEMICOLON
timePenalty	TokenNameIdentifier
=	TokenNameEQUAL
timePenalty	TokenNameIdentifier
>	TokenNameGREATER
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier
?	TokenNameQUESTION
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier
:	TokenNameCOLON
timePenalty	TokenNameIdentifier
;	TokenNameSEMICOLON
penalties	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
timePenalty	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
timePenalty	TokenNameIdentifier
>	TokenNameGREATER
maxPenalty	TokenNameIdentifier
)	TokenNameRPAREN
maxPenalty	TokenNameIdentifier
=	TokenNameEQUAL
timePenalty	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
ExponentiallyDecayingSample	TokenNameIdentifier
>	TokenNameGREATER
entry	TokenNameIdentifier
:	TokenNameCOLON
samples	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
score	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSnapshot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMedian	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
maxLatency	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
penalties	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
score	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
penalties	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
(	TokenNameLPAREN
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
maxPenalty	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
score	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
score	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getSeverity	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
scores	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
score	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
ExponentiallyDecayingSample	TokenNameIdentifier
sample	TokenNameIdentifier
:	TokenNameCOLON
samples	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
sample	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Map	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
>	TokenNameGREATER
getScores	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
scores	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getUpdateInterval	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
UPDATE_INTERVAL_IN_MS	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getResetInterval	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
RESET_INTERVAL_IN_MS	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getBadnessThreshold	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
BADNESS_THRESHOLD	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getSubsnitchClassName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
subsnitch	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Double	TokenNameIdentifier
>	TokenNameGREATER
dumpTimings	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
hostname	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
UnknownHostException	TokenNameIdentifier
{	TokenNameLBRACE
InetAddress	TokenNameIdentifier
host	TokenNameIdentifier
=	TokenNameEQUAL
InetAddress	TokenNameIdentifier
.	TokenNameDOT
getByName	TokenNameIdentifier
(	TokenNameLPAREN
hostname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Double	TokenNameIdentifier
>	TokenNameGREATER
timings	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Double	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ExponentiallyDecayingSample	TokenNameIdentifier
sample	TokenNameIdentifier
=	TokenNameEQUAL
samples	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
host	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sample	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
double	TokenNamedouble
time	TokenNameIdentifier
:	TokenNameCOLON
sample	TokenNameIdentifier
.	TokenNameDOT
getSnapshot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getValues	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
timings	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
time	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
timings	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSeverity	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
severity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
reportSeverity	TokenNameIdentifier
(	TokenNameLPAREN
severity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getSeverity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getSeverity	TokenNameIdentifier
(	TokenNameLPAREN
FBUtilities	TokenNameIdentifier
.	TokenNameDOT
getBroadcastAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
