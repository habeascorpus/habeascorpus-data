package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
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
TimeUnit	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JMXConfigurableThreadPoolExecutor	TokenNameIdentifier
extends	TokenNameextends
JMXEnabledThreadPoolExecutor	TokenNameIdentifier
implements	TokenNameimplements
JMXConfigurableThreadPoolExecutorMBean	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
JMXConfigurableThreadPoolExecutor	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
corePoolSize	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
keepAliveTime	TokenNameIdentifier
,	TokenNameCOMMA
TimeUnit	TokenNameIdentifier
unit	TokenNameIdentifier
,	TokenNameCOMMA
BlockingQueue	TokenNameIdentifier
<	TokenNameLESS
Runnable	TokenNameIdentifier
>	TokenNameGREATER
workQueue	TokenNameIdentifier
,	TokenNameCOMMA
NamedThreadFactory	TokenNameIdentifier
threadFactory	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
jmxPath	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
corePoolSize	TokenNameIdentifier
,	TokenNameCOMMA
keepAliveTime	TokenNameIdentifier
,	TokenNameCOMMA
unit	TokenNameIdentifier
,	TokenNameCOMMA
workQueue	TokenNameIdentifier
,	TokenNameCOMMA
threadFactory	TokenNameIdentifier
,	TokenNameCOMMA
jmxPath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE