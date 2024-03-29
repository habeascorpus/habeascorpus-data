package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
metrics	TokenNameIdentifier
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
concurrent	TokenNameIdentifier
.	TokenNameDOT
TimeUnit	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
yammer	TokenNameIdentifier
.	TokenNameDOT
metrics	TokenNameIdentifier
.	TokenNameDOT
Metrics	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
yammer	TokenNameIdentifier
.	TokenNameDOT
metrics	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
Gauge	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
yammer	TokenNameIdentifier
.	TokenNameDOT
metrics	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
Meter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
yammer	TokenNameIdentifier
.	TokenNameDOT
metrics	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
MetricName	TokenNameIdentifier
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
OutboundTcpConnectionPool	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ConnectionMetrics	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
GROUP_NAME	TokenNameIdentifier
=	TokenNameEQUAL
"org.apache.cassandra.metrics"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
TYPE_NAME	TokenNameIdentifier
=	TokenNameEQUAL
"Connection"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Meter	TokenNameIdentifier
totalTimeouts	TokenNameIdentifier
=	TokenNameEQUAL
Metrics	TokenNameIdentifier
.	TokenNameDOT
newMeter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"TotalTimeouts"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"total timeouts"	TokenNameStringLiteral
,	TokenNameCOMMA
TimeUnit	TokenNameIdentifier
.	TokenNameDOT
SECONDS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
long	TokenNamelong
recentTimeouts	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
address	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Gauge	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
commandPendingTasks	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Gauge	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
commandCompletedTasks	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Gauge	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
commandDroppedTasks	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Gauge	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
responsePendingTasks	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Gauge	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
responseCompletedTasks	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Meter	TokenNameIdentifier
timeouts	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
recentTimeoutCount	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ConnectionMetrics	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
ip	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
OutboundTcpConnectionPool	TokenNameIdentifier
connectionPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
address	TokenNameIdentifier
=	TokenNameEQUAL
ip	TokenNameIdentifier
.	TokenNameDOT
getHostAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandPendingTasks	TokenNameIdentifier
=	TokenNameEQUAL
Metrics	TokenNameIdentifier
.	TokenNameDOT
newGauge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"CommandPendingTasks"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Gauge	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Integer	TokenNameIdentifier
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
connectionPool	TokenNameIdentifier
.	TokenNameDOT
cmdCon	TokenNameIdentifier
.	TokenNameDOT
getPendingMessages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandCompletedTasks	TokenNameIdentifier
=	TokenNameEQUAL
Metrics	TokenNameIdentifier
.	TokenNameDOT
newGauge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"CommandCompletedTasks"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Gauge	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Long	TokenNameIdentifier
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
connectionPool	TokenNameIdentifier
.	TokenNameDOT
cmdCon	TokenNameIdentifier
.	TokenNameDOT
getCompletedMesssages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandDroppedTasks	TokenNameIdentifier
=	TokenNameEQUAL
Metrics	TokenNameIdentifier
.	TokenNameDOT
newGauge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"CommandDroppedTasks"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Gauge	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Long	TokenNameIdentifier
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
connectionPool	TokenNameIdentifier
.	TokenNameDOT
cmdCon	TokenNameIdentifier
.	TokenNameDOT
getDroppedMessages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
responsePendingTasks	TokenNameIdentifier
=	TokenNameEQUAL
Metrics	TokenNameIdentifier
.	TokenNameDOT
newGauge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"ResponsePendingTasks"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Gauge	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Integer	TokenNameIdentifier
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
connectionPool	TokenNameIdentifier
.	TokenNameDOT
ackCon	TokenNameIdentifier
.	TokenNameDOT
getPendingMessages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
responseCompletedTasks	TokenNameIdentifier
=	TokenNameEQUAL
Metrics	TokenNameIdentifier
.	TokenNameDOT
newGauge	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"ResponseCompletedTasks"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Gauge	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Long	TokenNameIdentifier
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
connectionPool	TokenNameIdentifier
.	TokenNameDOT
ackCon	TokenNameIdentifier
.	TokenNameDOT
getCompletedMesssages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
timeouts	TokenNameIdentifier
=	TokenNameEQUAL
Metrics	TokenNameIdentifier
.	TokenNameDOT
newMeter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Timeouts"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
"timeouts"	TokenNameStringLiteral
,	TokenNameCOMMA
TimeUnit	TokenNameIdentifier
.	TokenNameDOT
SECONDS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
release	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Metrics	TokenNameIdentifier
.	TokenNameDOT
defaultRegistry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
removeMetric	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"CommandPendingTasks"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Metrics	TokenNameIdentifier
.	TokenNameDOT
defaultRegistry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
removeMetric	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"CommandCompletedTasks"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Metrics	TokenNameIdentifier
.	TokenNameDOT
defaultRegistry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
removeMetric	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"CommandDroppedTasks"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Metrics	TokenNameIdentifier
.	TokenNameDOT
defaultRegistry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
removeMetric	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"ResponsePendingTasks"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Metrics	TokenNameIdentifier
.	TokenNameDOT
defaultRegistry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
removeMetric	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"ResponseCompletedTasks"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Metrics	TokenNameIdentifier
.	TokenNameDOT
defaultRegistry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
removeMetric	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
GROUP_NAME	TokenNameIdentifier
,	TokenNameCOMMA
TYPE_NAME	TokenNameIdentifier
,	TokenNameCOMMA
"Timeouts"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
long	TokenNamelong
getRecentTotalTimeout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
total	TokenNameIdentifier
=	TokenNameEQUAL
totalTimeouts	TokenNameIdentifier
.	TokenNameDOT
count	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
recent	TokenNameIdentifier
=	TokenNameEQUAL
total	TokenNameIdentifier
-	TokenNameMINUS
recentTimeouts	TokenNameIdentifier
;	TokenNameSEMICOLON
recentTimeouts	TokenNameIdentifier
=	TokenNameEQUAL
total	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
recent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
long	TokenNamelong
getRecentTimeout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
timeoutCount	TokenNameIdentifier
=	TokenNameEQUAL
timeouts	TokenNameIdentifier
.	TokenNameDOT
count	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
recent	TokenNameIdentifier
=	TokenNameEQUAL
timeoutCount	TokenNameIdentifier
-	TokenNameMINUS
recentTimeoutCount	TokenNameIdentifier
;	TokenNameSEMICOLON
recentTimeoutCount	TokenNameIdentifier
=	TokenNameEQUAL
timeoutCount	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
recent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
