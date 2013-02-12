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
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
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
MavenExecutionPlan	TokenNameIdentifier
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
stub	TokenNameIdentifier
.	TokenNameDOT
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier
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
stub	TokenNameIdentifier
.	TokenNameDOT
ProjectDependencyGraphStub	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
PhaseRecorderTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testObserveExecution	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
PhaseRecorder	TokenNameIdentifier
phaseRecorder	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PhaseRecorder	TokenNameIdentifier
(	TokenNameLPAREN
ProjectDependencyGraphStub	TokenNameIdentifier
.	TokenNameDOT
A	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MavenExecutionPlan	TokenNameIdentifier
plan	TokenNameIdentifier
=	TokenNameEQUAL
LifecycleExecutionPlanCalculatorStub	TokenNameIdentifier
.	TokenNameDOT
getProjectAExceutionPlan	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
MojoExecution	TokenNameIdentifier
>	TokenNameGREATER
executions	TokenNameIdentifier
=	TokenNameEQUAL
plan	TokenNameIdentifier
.	TokenNameDOT
getMojoExecutions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
MojoExecution	TokenNameIdentifier
mojoExecution1	TokenNameIdentifier
=	TokenNameEQUAL
executions	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
MojoExecution	TokenNameIdentifier
mojoExecution2	TokenNameIdentifier
=	TokenNameEQUAL
executions	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
phaseRecorder	TokenNameIdentifier
.	TokenNameDOT
observeExecution	TokenNameIdentifier
(	TokenNameLPAREN
mojoExecution1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
ProjectDependencyGraphStub	TokenNameIdentifier
.	TokenNameDOT
A	TokenNameIdentifier
.	TokenNameDOT
hasLifecyclePhase	TokenNameIdentifier
(	TokenNameLPAREN
mojoExecution1	TokenNameIdentifier
.	TokenNameDOT
getLifecyclePhase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
ProjectDependencyGraphStub	TokenNameIdentifier
.	TokenNameDOT
A	TokenNameIdentifier
.	TokenNameDOT
hasLifecyclePhase	TokenNameIdentifier
(	TokenNameLPAREN
mojoExecution2	TokenNameIdentifier
.	TokenNameDOT
getLifecyclePhase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
phaseRecorder	TokenNameIdentifier
.	TokenNameDOT
isDifferentPhase	TokenNameIdentifier
(	TokenNameLPAREN
mojoExecution1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
phaseRecorder	TokenNameIdentifier
.	TokenNameDOT
isDifferentPhase	TokenNameIdentifier
(	TokenNameLPAREN
mojoExecution2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE