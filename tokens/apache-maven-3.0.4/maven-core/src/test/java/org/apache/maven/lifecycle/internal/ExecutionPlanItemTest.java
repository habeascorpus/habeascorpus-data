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
Schedule	TokenNameIdentifier
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
MojoExecutorStub	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
ExecutionPlanItemTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testSetComplete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
ExecutionPlanItem	TokenNameIdentifier
item	TokenNameIdentifier
=	TokenNameEQUAL
createExecutionPlanItem	TokenNameIdentifier
(	TokenNameLPAREN
"testMojo"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
item	TokenNameIdentifier
.	TokenNameDOT
setComplete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
item	TokenNameIdentifier
.	TokenNameDOT
isDone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testWaitUntilDone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
ExecutionPlanItem	TokenNameIdentifier
item	TokenNameIdentifier
=	TokenNameEQUAL
createExecutionPlanItem	TokenNameIdentifier
(	TokenNameLPAREN
"testMojo"	TokenNameStringLiteral
,	TokenNameCOMMA
createExecutionPlanItem	TokenNameIdentifier
(	TokenNameLPAREN
"testMojo2"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
Thread	TokenNameIdentifier
(	TokenNameLPAREN
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
item	TokenNameIdentifier
.	TokenNameDOT
setComplete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
item	TokenNameIdentifier
.	TokenNameDOT
waitUntilDone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ExecutionPlanItem	TokenNameIdentifier
createExecutionPlanItem	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
mojoDescription	TokenNameIdentifier
,	TokenNameCOMMA
ExecutionPlanItem	TokenNameIdentifier
downStream	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
createExecutionPlanItem	TokenNameIdentifier
(	TokenNameLPAREN
mojoDescription	TokenNameIdentifier
,	TokenNameCOMMA
downStream	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ExecutionPlanItem	TokenNameIdentifier
createExecutionPlanItem	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
mojoDescription	TokenNameIdentifier
,	TokenNameCOMMA
ExecutionPlanItem	TokenNameIdentifier
downStream	TokenNameIdentifier
,	TokenNameCOMMA
Schedule	TokenNameIdentifier
schedule	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ExecutionPlanItem	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MojoExecution	TokenNameIdentifier
(	TokenNameLPAREN
MojoExecutorStub	TokenNameIdentifier
.	TokenNameDOT
createMojoDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
mojoDescription	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
schedule	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE