package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
execution	TokenNameIdentifier
.	TokenNameDOT
MavenSession	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
component	TokenNameIdentifier
.	TokenNameDOT
annotations	TokenNameIdentifier
.	TokenNameDOT
Component	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
component	TokenNameIdentifier
.	TokenNameDOT
annotations	TokenNameIdentifier
.	TokenNameDOT
Requirement	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
logging	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
Callable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
CompletionService	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
ExecutionException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
Future	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
LifecycleThreadedBuilder	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
LifecycleThreadedBuilder	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Requirement	TokenNameIdentifier
private	TokenNameprivate
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Requirement	TokenNameIdentifier
private	TokenNameprivate
LifecycleModuleBuilder	TokenNameIdentifier
lifecycleModuleBuilder	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
{	TokenNameLBRACE
"UnusedDeclaration"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
public	TokenNamepublic
LifecycleThreadedBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
build	TokenNameIdentifier
(	TokenNameLPAREN
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
,	TokenNameCOMMA
ReactorContext	TokenNameIdentifier
reactorContext	TokenNameIdentifier
,	TokenNameCOMMA
ProjectBuildList	TokenNameIdentifier
projectBuilds	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
TaskSegment	TokenNameIdentifier
>	TokenNameGREATER
currentTaskSegment	TokenNameIdentifier
,	TokenNameCOMMA
ConcurrencyDependencyGraph	TokenNameIdentifier
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
CompletionService	TokenNameIdentifier
<	TokenNameLESS
ProjectSegment	TokenNameIdentifier
>	TokenNameGREATER
service	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ThreadOutputMuxer	TokenNameIdentifier
muxer	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
TaskSegment	TokenNameIdentifier
taskSegment	TokenNameIdentifier
:	TokenNameCOLON
currentTaskSegment	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Map	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
,	TokenNameCOMMA
ProjectSegment	TokenNameIdentifier
>	TokenNameGREATER
projectBuildMap	TokenNameIdentifier
=	TokenNameEQUAL
projectBuilds	TokenNameIdentifier
.	TokenNameDOT
selectSegment	TokenNameIdentifier
(	TokenNameLPAREN
taskSegment	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
multiThreadedProjectTaskSegmentBuild	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
reactorContext	TokenNameIdentifier
,	TokenNameCOMMA
session	TokenNameIdentifier
,	TokenNameCOMMA
service	TokenNameIdentifier
,	TokenNameCOMMA
taskSegment	TokenNameIdentifier
,	TokenNameCOMMA
projectBuildMap	TokenNameIdentifier
,	TokenNameCOMMA
muxer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
reactorContext	TokenNameIdentifier
.	TokenNameDOT
getReactorBuildStatus	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isHalted	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
multiThreadedProjectTaskSegmentBuild	TokenNameIdentifier
(	TokenNameLPAREN
ConcurrencyDependencyGraph	TokenNameIdentifier
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
ReactorContext	TokenNameIdentifier
reactorContext	TokenNameIdentifier
,	TokenNameCOMMA
MavenSession	TokenNameIdentifier
rootSession	TokenNameIdentifier
,	TokenNameCOMMA
CompletionService	TokenNameIdentifier
<	TokenNameLESS
ProjectSegment	TokenNameIdentifier
>	TokenNameGREATER
service	TokenNameIdentifier
,	TokenNameCOMMA
TaskSegment	TokenNameIdentifier
taskSegment	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
,	TokenNameCOMMA
ProjectSegment	TokenNameIdentifier
>	TokenNameGREATER
projectBuildList	TokenNameIdentifier
,	TokenNameCOMMA
ThreadOutputMuxer	TokenNameIdentifier
muxer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
MavenProject	TokenNameIdentifier
mavenProject	TokenNameIdentifier
:	TokenNameCOLON
analyzer	TokenNameIdentifier
.	TokenNameDOT
getRootSchedulableBuilds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ProjectSegment	TokenNameIdentifier
projectSegment	TokenNameIdentifier
=	TokenNameEQUAL
projectBuildList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
mavenProject	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Scheduling: "	TokenNameStringLiteral
+	TokenNamePLUS
projectSegment	TokenNameIdentifier
.	TokenNameDOT
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Callable	TokenNameIdentifier
<	TokenNameLESS
ProjectSegment	TokenNameIdentifier
>	TokenNameGREATER
cb	TokenNameIdentifier
=	TokenNameEQUAL
createBuildCallable	TokenNameIdentifier
(	TokenNameLPAREN
rootSession	TokenNameIdentifier
,	TokenNameCOMMA
projectSegment	TokenNameIdentifier
,	TokenNameCOMMA
reactorContext	TokenNameIdentifier
,	TokenNameCOMMA
taskSegment	TokenNameIdentifier
,	TokenNameCOMMA
muxer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
service	TokenNameIdentifier
.	TokenNameDOT
submit	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
analyzer	TokenNameIdentifier
.	TokenNameDOT
getNumberOfBuilds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
ProjectSegment	TokenNameIdentifier
projectBuild	TokenNameIdentifier
=	TokenNameEQUAL
service	TokenNameIdentifier
.	TokenNameDOT
take	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
reactorContext	TokenNameIdentifier
.	TokenNameDOT
getReactorBuildStatus	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isHalted	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
newItemsThatCanBeBuilt	TokenNameIdentifier
=	TokenNameEQUAL
analyzer	TokenNameIdentifier
.	TokenNameDOT
markAsFinished	TokenNameIdentifier
(	TokenNameLPAREN
projectBuild	TokenNameIdentifier
.	TokenNameDOT
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
MavenProject	TokenNameIdentifier
mavenProject	TokenNameIdentifier
:	TokenNameCOLON
newItemsThatCanBeBuilt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ProjectSegment	TokenNameIdentifier
scheduledDependent	TokenNameIdentifier
=	TokenNameEQUAL
projectBuildList	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
mavenProject	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Scheduling: "	TokenNameStringLiteral
+	TokenNamePLUS
scheduledDependent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Callable	TokenNameIdentifier
<	TokenNameLESS
ProjectSegment	TokenNameIdentifier
>	TokenNameGREATER
cb	TokenNameIdentifier
=	TokenNameEQUAL
createBuildCallable	TokenNameIdentifier
(	TokenNameLPAREN
rootSession	TokenNameIdentifier
,	TokenNameCOMMA
scheduledDependent	TokenNameIdentifier
,	TokenNameCOMMA
reactorContext	TokenNameIdentifier
,	TokenNameCOMMA
taskSegment	TokenNameIdentifier
,	TokenNameCOMMA
muxer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
service	TokenNameIdentifier
.	TokenNameDOT
submit	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ExecutionException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
Future	TokenNameIdentifier
<	TokenNameLESS
ProjectSegment	TokenNameIdentifier
>	TokenNameGREATER
unprocessed	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
unprocessed	TokenNameIdentifier
=	TokenNameEQUAL
service	TokenNameIdentifier
.	TokenNameDOT
poll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
unprocessed	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
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
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ExecutionException	TokenNameIdentifier
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
}	TokenNameRBRACE
private	TokenNameprivate
Callable	TokenNameIdentifier
<	TokenNameLESS
ProjectSegment	TokenNameIdentifier
>	TokenNameGREATER
createBuildCallable	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
MavenSession	TokenNameIdentifier
rootSession	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
ProjectSegment	TokenNameIdentifier
projectBuild	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
ReactorContext	TokenNameIdentifier
reactorContext	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
TaskSegment	TokenNameIdentifier
taskSegment	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
ThreadOutputMuxer	TokenNameIdentifier
muxer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Callable	TokenNameIdentifier
<	TokenNameLESS
ProjectSegment	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
ProjectSegment	TokenNameIdentifier
call	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
lifecycleModuleBuilder	TokenNameIdentifier
.	TokenNameDOT
buildProject	TokenNameIdentifier
(	TokenNameLPAREN
projectBuild	TokenNameIdentifier
.	TokenNameDOT
getSession	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rootSession	TokenNameIdentifier
,	TokenNameCOMMA
reactorContext	TokenNameIdentifier
,	TokenNameCOMMA
projectBuild	TokenNameIdentifier
.	TokenNameDOT
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
taskSegment	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
projectBuild	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
