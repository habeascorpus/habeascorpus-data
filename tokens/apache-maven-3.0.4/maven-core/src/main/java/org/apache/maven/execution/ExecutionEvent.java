package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
execution	TokenNameIdentifier
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
public	TokenNamepublic
interface	TokenNameinterface
ExecutionEvent	TokenNameIdentifier
{	TokenNameLBRACE
enum	TokenNameenum
Type	TokenNameIdentifier
{	TokenNameLBRACE
ProjectDiscoveryStarted	TokenNameIdentifier
,	TokenNameCOMMA
SessionStarted	TokenNameIdentifier
,	TokenNameCOMMA
SessionEnded	TokenNameIdentifier
,	TokenNameCOMMA
ProjectSkipped	TokenNameIdentifier
,	TokenNameCOMMA
ProjectStarted	TokenNameIdentifier
,	TokenNameCOMMA
ProjectSucceeded	TokenNameIdentifier
,	TokenNameCOMMA
ProjectFailed	TokenNameIdentifier
,	TokenNameCOMMA
MojoSkipped	TokenNameIdentifier
,	TokenNameCOMMA
MojoStarted	TokenNameIdentifier
,	TokenNameCOMMA
MojoSucceeded	TokenNameIdentifier
,	TokenNameCOMMA
MojoFailed	TokenNameIdentifier
,	TokenNameCOMMA
ForkStarted	TokenNameIdentifier
,	TokenNameCOMMA
ForkSucceeded	TokenNameIdentifier
,	TokenNameCOMMA
ForkFailed	TokenNameIdentifier
,	TokenNameCOMMA
ForkedProjectStarted	TokenNameIdentifier
,	TokenNameCOMMA
ForkedProjectSucceeded	TokenNameIdentifier
,	TokenNameCOMMA
ForkedProjectFailed	TokenNameIdentifier
,	TokenNameCOMMA
}	TokenNameRBRACE
Type	TokenNameIdentifier
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MavenSession	TokenNameIdentifier
getSession	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MavenProject	TokenNameIdentifier
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MojoExecution	TokenNameIdentifier
getMojoExecution	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Exception	TokenNameIdentifier
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE