package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
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
LinkedHashSet	TokenNameIdentifier
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
Set	TokenNameIdentifier
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
LifecycleExecutor	TokenNameIdentifier
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
model	TokenNameIdentifier
.	TokenNameDOT
Plugin	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
PluginExecution	TokenNameIdentifier
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
EmptyLifecycleExecutor	TokenNameIdentifier
implements	TokenNameimplements
LifecycleExecutor	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
MavenExecutionPlan	TokenNameIdentifier
calculateExecutionPlan	TokenNameIdentifier
(	TokenNameLPAREN
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
tasks	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
MavenExecutionPlan	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MavenExecutionPlan	TokenNameIdentifier
calculateExecutionPlan	TokenNameIdentifier
(	TokenNameLPAREN
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
setup	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
tasks	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
MavenExecutionPlan	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Set	TokenNameIdentifier
<	TokenNameLESS
Plugin	TokenNameIdentifier
>	TokenNameGREATER
getPluginsBoundByDefaultToAllLifecycles	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
packaging	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Set	TokenNameIdentifier
<	TokenNameLESS
Plugin	TokenNameIdentifier
>	TokenNameGREATER
plugins	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
"JAR"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
packaging	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
plugins	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedHashSet	TokenNameIdentifier
<	TokenNameLESS
Plugin	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
plugins	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newPlugin	TokenNameIdentifier
(	TokenNameLPAREN
"maven-compiler-plugin"	TokenNameStringLiteral
,	TokenNameCOMMA
"compile"	TokenNameStringLiteral
,	TokenNameCOMMA
"testCompile"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
plugins	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newPlugin	TokenNameIdentifier
(	TokenNameLPAREN
"maven-resources-plugin"	TokenNameStringLiteral
,	TokenNameCOMMA
"resources"	TokenNameStringLiteral
,	TokenNameCOMMA
"testResources"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
plugins	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newPlugin	TokenNameIdentifier
(	TokenNameLPAREN
"maven-surefire-plugin"	TokenNameStringLiteral
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
plugins	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newPlugin	TokenNameIdentifier
(	TokenNameLPAREN
"maven-jar-plugin"	TokenNameStringLiteral
,	TokenNameCOMMA
"jar"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
plugins	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newPlugin	TokenNameIdentifier
(	TokenNameLPAREN
"maven-install-plugin"	TokenNameStringLiteral
,	TokenNameCOMMA
"install"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
plugins	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
newPlugin	TokenNameIdentifier
(	TokenNameLPAREN
"maven-deploy-plugin"	TokenNameStringLiteral
,	TokenNameCOMMA
"deploy"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
plugins	TokenNameIdentifier
=	TokenNameEQUAL
Collections	TokenNameIdentifier
.	TokenNameDOT
emptySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
plugins	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Plugin	TokenNameIdentifier
newPlugin	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
goals	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Plugin	TokenNameIdentifier
plugin	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Plugin	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
plugin	TokenNameIdentifier
.	TokenNameDOT
setGroupId	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven.plugins"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
plugin	TokenNameIdentifier
.	TokenNameDOT
setArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
artifactId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
goal	TokenNameIdentifier
:	TokenNameCOLON
goals	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
PluginExecution	TokenNameIdentifier
pluginExecution	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PluginExecution	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pluginExecution	TokenNameIdentifier
.	TokenNameDOT
setId	TokenNameIdentifier
(	TokenNameLPAREN
"default-"	TokenNameStringLiteral
+	TokenNamePLUS
goal	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pluginExecution	TokenNameIdentifier
.	TokenNameDOT
addGoal	TokenNameIdentifier
(	TokenNameLPAREN
goal	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
plugin	TokenNameIdentifier
.	TokenNameDOT
addExecution	TokenNameIdentifier
(	TokenNameLPAREN
pluginExecution	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
plugin	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
calculateForkedExecutions	TokenNameIdentifier
(	TokenNameLPAREN
MojoExecution	TokenNameIdentifier
mojoExecution	TokenNameIdentifier
,	TokenNameCOMMA
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
executeForkedExecutions	TokenNameIdentifier
(	TokenNameLPAREN
MojoExecution	TokenNameIdentifier
mojoExecution	TokenNameIdentifier
,	TokenNameCOMMA
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
