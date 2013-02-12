package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
.	TokenNameDOT
BuilderCommon	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
.	TokenNameDOT
ExecutionPlanItem	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
plugin	TokenNameIdentifier
.	TokenNameDOT
MojoExecution	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
.	TokenNameDOT
MavenProject	TokenNameIdentifier
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
List	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DefaultSchedules	TokenNameIdentifier
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Scheduling	TokenNameIdentifier
>	TokenNameGREATER
schedules	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DefaultSchedules	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
DefaultSchedules	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Scheduling	TokenNameIdentifier
>	TokenNameGREATER
schedules	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
schedules	TokenNameIdentifier
=	TokenNameEQUAL
schedules	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
ExecutionPlanItem	TokenNameIdentifier
>	TokenNameGREATER
createExecutionPlanItem	TokenNameIdentifier
(	TokenNameLPAREN
MavenProject	TokenNameIdentifier
mavenProject	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
MojoExecution	TokenNameIdentifier
>	TokenNameGREATER
executions	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
BuilderCommon	TokenNameIdentifier
.	TokenNameDOT
attachToThread	TokenNameIdentifier
(	TokenNameLPAREN
mavenProject	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
ExecutionPlanItem	TokenNameIdentifier
>	TokenNameGREATER
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ExecutionPlanItem	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
MojoExecution	TokenNameIdentifier
mojoExecution	TokenNameIdentifier
:	TokenNameCOLON
executions	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
lifeCyclePhase	TokenNameIdentifier
=	TokenNameEQUAL
mojoExecution	TokenNameIdentifier
.	TokenNameDOT
getLifecyclePhase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Scheduling	TokenNameIdentifier
scheduling	TokenNameIdentifier
=	TokenNameEQUAL
getScheduling	TokenNameIdentifier
(	TokenNameLPAREN
"default"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Schedule	TokenNameIdentifier
schedule	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
scheduling	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
schedule	TokenNameIdentifier
=	TokenNameEQUAL
scheduling	TokenNameIdentifier
.	TokenNameDOT
getSchedule	TokenNameIdentifier
(	TokenNameLPAREN
mojoExecution	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
schedule	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
schedule	TokenNameIdentifier
=	TokenNameEQUAL
scheduling	TokenNameIdentifier
.	TokenNameDOT
getSchedule	TokenNameIdentifier
(	TokenNameLPAREN
lifeCyclePhase	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
result	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ExecutionPlanItem	TokenNameIdentifier
(	TokenNameLPAREN
mojoExecution	TokenNameIdentifier
,	TokenNameCOMMA
schedule	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Scheduling	TokenNameIdentifier
getScheduling	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
lifecyclePhaseName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Scheduling	TokenNameIdentifier
schedule	TokenNameIdentifier
:	TokenNameCOLON
schedules	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
lifecyclePhaseName	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
schedule	TokenNameIdentifier
.	TokenNameDOT
getLifecycle	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
schedule	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Scheduling	TokenNameIdentifier
>	TokenNameGREATER
getSchedules	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
schedules	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE