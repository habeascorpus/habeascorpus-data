package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
plugin	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
Xpp3Dom	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
PluginConfigurationExpander	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
DefaultPluginConfigurationExpander	TokenNameIdentifier
implements	TokenNameimplements
PluginConfigurationExpander	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
expandPluginConfiguration	TokenNameIdentifier
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
expand	TokenNameIdentifier
(	TokenNameLPAREN
build	TokenNameIdentifier
.	TokenNameDOT
getPlugins	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
expand	TokenNameIdentifier
(	TokenNameLPAREN
pluginManagement	TokenNameIdentifier
.	TokenNameDOT
getPlugins	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
expand	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Plugin	TokenNameIdentifier
>	TokenNameGREATER
plugins	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Plugin	TokenNameIdentifier
plugin	TokenNameIdentifier
:	TokenNameCOLON
plugins	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Xpp3Dom	TokenNameIdentifier
pluginConfiguration	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Xpp3Dom	TokenNameIdentifier
)	TokenNameRPAREN
plugin	TokenNameIdentifier
.	TokenNameDOT
getConfiguration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
pluginConfiguration	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
PluginExecution	TokenNameIdentifier
execution	TokenNameIdentifier
:	TokenNameCOLON
plugin	TokenNameIdentifier
.	TokenNameDOT
getExecutions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Xpp3Dom	TokenNameIdentifier
executionConfiguration	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Xpp3Dom	TokenNameIdentifier
)	TokenNameRPAREN
execution	TokenNameIdentifier
.	TokenNameDOT
getConfiguration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
executionConfiguration	TokenNameIdentifier
=	TokenNameEQUAL
Xpp3Dom	TokenNameIdentifier
.	TokenNameDOT
mergeXpp3Dom	TokenNameIdentifier
(	TokenNameLPAREN
executionConfiguration	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Xpp3Dom	TokenNameIdentifier
(	TokenNameLPAREN
pluginConfiguration	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
execution	TokenNameIdentifier
.	TokenNameDOT
setConfiguration	TokenNameIdentifier
(	TokenNameLPAREN
executionConfiguration	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE