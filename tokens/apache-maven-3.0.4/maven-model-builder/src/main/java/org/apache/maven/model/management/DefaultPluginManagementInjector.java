package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
management	TokenNameIdentifier
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
LinkedHashMap	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
Build	TokenNameIdentifier
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
Model	TokenNameIdentifier
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
PluginContainer	TokenNameIdentifier
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
model	TokenNameIdentifier
.	TokenNameDOT
PluginManagement	TokenNameIdentifier
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
building	TokenNameIdentifier
.	TokenNameDOT
ModelBuildingRequest	TokenNameIdentifier
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
building	TokenNameIdentifier
.	TokenNameDOT
ModelProblemCollector	TokenNameIdentifier
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
merge	TokenNameIdentifier
.	TokenNameDOT
MavenModelMerger	TokenNameIdentifier
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
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
PluginManagementInjector	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
DefaultPluginManagementInjector	TokenNameIdentifier
implements	TokenNameimplements
PluginManagementInjector	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
ManagementModelMerger	TokenNameIdentifier
merger	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ManagementModelMerger	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
injectManagement	TokenNameIdentifier
(	TokenNameLPAREN
Model	TokenNameIdentifier
model	TokenNameIdentifier
,	TokenNameCOMMA
ModelBuildingRequest	TokenNameIdentifier
request	TokenNameIdentifier
,	TokenNameCOMMA
ModelProblemCollector	TokenNameIdentifier
problems	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
merger	TokenNameIdentifier
.	TokenNameDOT
mergeManagedBuildPlugins	TokenNameIdentifier
(	TokenNameLPAREN
model	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
ManagementModelMerger	TokenNameIdentifier
extends	TokenNameextends
MavenModelMerger	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
mergeManagedBuildPlugins	TokenNameIdentifier
(	TokenNameLPAREN
Model	TokenNameIdentifier
model	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Build	TokenNameIdentifier
build	TokenNameIdentifier
=	TokenNameEQUAL
model	TokenNameIdentifier
.	TokenNameDOT
getBuild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
build	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
PluginManagement	TokenNameIdentifier
pluginManagement	TokenNameIdentifier
=	TokenNameEQUAL
build	TokenNameIdentifier
.	TokenNameDOT
getPluginManagement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
pluginManagement	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
mergePluginContainer_Plugins	TokenNameIdentifier
(	TokenNameLPAREN
build	TokenNameIdentifier
,	TokenNameCOMMA
pluginManagement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
mergePluginContainer_Plugins	TokenNameIdentifier
(	TokenNameLPAREN
PluginContainer	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
PluginContainer	TokenNameIdentifier
source	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Plugin	TokenNameIdentifier
>	TokenNameGREATER
src	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
getPlugins	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
src	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Plugin	TokenNameIdentifier
>	TokenNameGREATER
tgt	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
.	TokenNameDOT
getPlugins	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
,	TokenNameCOMMA
Plugin	TokenNameIdentifier
>	TokenNameGREATER
managedPlugins	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedHashMap	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
,	TokenNameCOMMA
Plugin	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
src	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
context	TokenNameIdentifier
=	TokenNameEQUAL
Collections	TokenNameIdentifier
.	TokenNameDOT
emptyMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Plugin	TokenNameIdentifier
element	TokenNameIdentifier
:	TokenNameCOLON
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
getPluginKey	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
managedPlugins	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
Plugin	TokenNameIdentifier
element	TokenNameIdentifier
:	TokenNameCOLON
tgt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
getPluginKey	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Plugin	TokenNameIdentifier
managedPlugin	TokenNameIdentifier
=	TokenNameEQUAL
managedPlugins	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
managedPlugin	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
mergePlugin	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
managedPlugin	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
context	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
void	TokenNamevoid
mergePlugin_Executions	TokenNameIdentifier
(	TokenNameLPAREN
Plugin	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
Plugin	TokenNameIdentifier
source	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
sourceDominant	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
context	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
PluginExecution	TokenNameIdentifier
>	TokenNameGREATER
src	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
.	TokenNameDOT
getExecutions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
src	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
PluginExecution	TokenNameIdentifier
>	TokenNameGREATER
tgt	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
.	TokenNameDOT
getExecutions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
,	TokenNameCOMMA
PluginExecution	TokenNameIdentifier
>	TokenNameGREATER
merged	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedHashMap	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
,	TokenNameCOMMA
PluginExecution	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
(	TokenNameLPAREN
src	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
tgt	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
PluginExecution	TokenNameIdentifier
element	TokenNameIdentifier
:	TokenNameCOLON
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
getPluginExecutionKey	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
merged	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
element	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
PluginExecution	TokenNameIdentifier
element	TokenNameIdentifier
:	TokenNameCOLON
tgt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
getPluginExecutionKey	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PluginExecution	TokenNameIdentifier
existing	TokenNameIdentifier
=	TokenNameEQUAL
merged	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
existing	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
mergePluginExecution	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
existing	TokenNameIdentifier
,	TokenNameCOMMA
sourceDominant	TokenNameIdentifier
,	TokenNameCOMMA
context	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
merged	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
target	TokenNameIdentifier
.	TokenNameDOT
setExecutions	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
PluginExecution	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
merged	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
