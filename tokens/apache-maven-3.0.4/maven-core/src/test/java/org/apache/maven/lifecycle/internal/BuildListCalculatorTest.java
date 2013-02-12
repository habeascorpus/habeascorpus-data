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
lifecycle	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
.	TokenNameDOT
stub	TokenNameIdentifier
.	TokenNameDOT
LifecycleTaskSegmentCalculatorStub	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
BuildListCalculatorTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testCalculateProjectBuilds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
LifecycleTaskSegmentCalculator	TokenNameIdentifier
lifecycleTaskSegmentCalculator	TokenNameIdentifier
=	TokenNameEQUAL
getTaskSegmentCalculator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BuildListCalculator	TokenNameIdentifier
buildListCalculator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BuildListCalculator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
=	TokenNameEQUAL
ProjectDependencyGraphStub	TokenNameIdentifier
.	TokenNameDOT
getMavenSession	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
TaskSegment	TokenNameIdentifier
>	TokenNameGREATER
taskSegments	TokenNameIdentifier
=	TokenNameEQUAL
lifecycleTaskSegmentCalculator	TokenNameIdentifier
.	TokenNameDOT
calculateTaskSegments	TokenNameIdentifier
(	TokenNameLPAREN
session	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
ProjectBuildList	TokenNameIdentifier
buildList	TokenNameIdentifier
=	TokenNameEQUAL
buildListCalculator	TokenNameIdentifier
.	TokenNameDOT
calculateProjectBuilds	TokenNameIdentifier
(	TokenNameLPAREN
session	TokenNameIdentifier
,	TokenNameCOMMA
taskSegments	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
ProjectBuildList	TokenNameIdentifier
segments	TokenNameIdentifier
=	TokenNameEQUAL
buildList	TokenNameIdentifier
.	TokenNameDOT
getByTaskSegment	TokenNameIdentifier
(	TokenNameLPAREN
taskSegments	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Stub data contains 3 segments"	TokenNameStringLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
taskSegments	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Stub data contains 6 items"	TokenNameStringLiteral
,	TokenNameCOMMA
6	TokenNameIntegerLiteral
,	TokenNameCOMMA
segments	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
ProjectSegment	TokenNameIdentifier
build	TokenNameIdentifier
=	TokenNameEQUAL
segments	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
build	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
LifecycleTaskSegmentCalculator	TokenNameIdentifier
getTaskSegmentCalculator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
LifecycleTaskSegmentCalculatorStub	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
