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
.	TokenNameDOT
stub	TokenNameIdentifier
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
LifecycleExecutionException	TokenNameIdentifier
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
DependencyContext	TokenNameIdentifier
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
MojoExecutor	TokenNameIdentifier
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
PhaseRecorder	TokenNameIdentifier
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
ProjectIndex	TokenNameIdentifier
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
plugin	TokenNameIdentifier
.	TokenNameDOT
descriptor	TokenNameIdentifier
.	TokenNameDOT
MojoDescriptor	TokenNameIdentifier
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
descriptor	TokenNameIdentifier
.	TokenNameDOT
PluginDescriptor	TokenNameIdentifier
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
Collections	TokenNameIdentifier
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
MojoExecutorStub	TokenNameIdentifier
extends	TokenNameextends
MojoExecutor	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
MojoExecution	TokenNameIdentifier
>	TokenNameGREATER
executions	TokenNameIdentifier
=	TokenNameEQUAL
Collections	TokenNameIdentifier
.	TokenNameDOT
synchronizedList	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
MojoExecution	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
,	TokenNameCOMMA
MojoExecution	TokenNameIdentifier
mojoExecution	TokenNameIdentifier
,	TokenNameCOMMA
ProjectIndex	TokenNameIdentifier
projectIndex	TokenNameIdentifier
,	TokenNameCOMMA
DependencyContext	TokenNameIdentifier
dependencyContext	TokenNameIdentifier
,	TokenNameCOMMA
PhaseRecorder	TokenNameIdentifier
phaseRecorder	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
LifecycleExecutionException	TokenNameIdentifier
{	TokenNameLBRACE
executions	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
mojoExecution	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
MojoExecution	TokenNameIdentifier
>	TokenNameGREATER
mojoExecutions	TokenNameIdentifier
,	TokenNameCOMMA
ProjectIndex	TokenNameIdentifier
projectIndex	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
LifecycleExecutionException	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
MojoExecution	TokenNameIdentifier
mojoExecution	TokenNameIdentifier
:	TokenNameCOLON
mojoExecutions	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
executions	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
mojoExecution	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
MojoDescriptor	TokenNameIdentifier
createMojoDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
mojoDescription	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
PluginDescriptor	TokenNameIdentifier
descriptor	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PluginDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
descriptor	TokenNameIdentifier
.	TokenNameDOT
setArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
mojoDescription	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
MojoDescriptor	TokenNameIdentifier
mojoDescriptor	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MojoDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mojoDescriptor	TokenNameIdentifier
.	TokenNameDOT
setDescription	TokenNameIdentifier
(	TokenNameLPAREN
mojoDescription	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mojoDescriptor	TokenNameIdentifier
.	TokenNameDOT
setPluginDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
descriptor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
mojoDescriptor	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE