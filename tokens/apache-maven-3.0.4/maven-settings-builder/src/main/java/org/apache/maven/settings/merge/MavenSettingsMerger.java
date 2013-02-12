package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
settings	TokenNameIdentifier
.	TokenNameDOT
merge	TokenNameIdentifier
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
HashMap	TokenNameIdentifier
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
settings	TokenNameIdentifier
.	TokenNameDOT
IdentifiableBase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
settings	TokenNameIdentifier
.	TokenNameDOT
Settings	TokenNameIdentifier
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
StringUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
MavenSettingsMerger	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
merge	TokenNameIdentifier
(	TokenNameLPAREN
Settings	TokenNameIdentifier
dominant	TokenNameIdentifier
,	TokenNameCOMMA
Settings	TokenNameIdentifier
recessive	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
recessiveSourceLevel	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
dominant	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
recessive	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
recessive	TokenNameIdentifier
.	TokenNameDOT
setSourceLevel	TokenNameIdentifier
(	TokenNameLPAREN
recessiveSourceLevel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
dominantActiveProfiles	TokenNameIdentifier
=	TokenNameEQUAL
dominant	TokenNameIdentifier
.	TokenNameDOT
getActiveProfiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
recessiveActiveProfiles	TokenNameIdentifier
=	TokenNameEQUAL
recessive	TokenNameIdentifier
.	TokenNameDOT
getActiveProfiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
recessiveActiveProfiles	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
dominantActiveProfiles	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
dominantActiveProfiles	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dominant	TokenNameIdentifier
.	TokenNameDOT
setActiveProfiles	TokenNameIdentifier
(	TokenNameLPAREN
dominantActiveProfiles	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
profileId	TokenNameIdentifier
:	TokenNameCOLON
recessiveActiveProfiles	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
dominantActiveProfiles	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
profileId	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
dominantActiveProfiles	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
profileId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
dominantPluginGroupIds	TokenNameIdentifier
=	TokenNameEQUAL
dominant	TokenNameIdentifier
.	TokenNameDOT
getPluginGroups	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
recessivePluginGroupIds	TokenNameIdentifier
=	TokenNameEQUAL
recessive	TokenNameIdentifier
.	TokenNameDOT
getPluginGroups	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
recessivePluginGroupIds	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
dominantPluginGroupIds	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
dominantPluginGroupIds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dominant	TokenNameIdentifier
.	TokenNameDOT
setPluginGroups	TokenNameIdentifier
(	TokenNameLPAREN
dominantPluginGroupIds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
pluginGroupId	TokenNameIdentifier
:	TokenNameCOLON
recessivePluginGroupIds	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
dominantPluginGroupIds	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
pluginGroupId	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
dominantPluginGroupIds	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
pluginGroupId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
StringUtils	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
dominant	TokenNameIdentifier
.	TokenNameDOT
getLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
dominant	TokenNameIdentifier
.	TokenNameDOT
setLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
recessive	TokenNameIdentifier
.	TokenNameDOT
getLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
shallowMergeById	TokenNameIdentifier
(	TokenNameLPAREN
dominant	TokenNameIdentifier
.	TokenNameDOT
getMirrors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
recessive	TokenNameIdentifier
.	TokenNameDOT
getMirrors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
recessiveSourceLevel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
shallowMergeById	TokenNameIdentifier
(	TokenNameLPAREN
dominant	TokenNameIdentifier
.	TokenNameDOT
getServers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
recessive	TokenNameIdentifier
.	TokenNameDOT
getServers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
recessiveSourceLevel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
shallowMergeById	TokenNameIdentifier
(	TokenNameLPAREN
dominant	TokenNameIdentifier
.	TokenNameDOT
getProxies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
recessive	TokenNameIdentifier
.	TokenNameDOT
getProxies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
recessiveSourceLevel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
shallowMergeById	TokenNameIdentifier
(	TokenNameLPAREN
dominant	TokenNameIdentifier
.	TokenNameDOT
getProfiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
recessive	TokenNameIdentifier
.	TokenNameDOT
getProfiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
recessiveSourceLevel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
<	TokenNameLESS
T	TokenNameIdentifier
extends	TokenNameextends
IdentifiableBase	TokenNameIdentifier
>	TokenNameGREATER
void	TokenNamevoid
shallowMergeById	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
dominant	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
recessive	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
recessiveSourceLevel	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
>	TokenNameGREATER
dominantById	TokenNameIdentifier
=	TokenNameEQUAL
mapById	TokenNameIdentifier
(	TokenNameLPAREN
dominant	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
T	TokenNameIdentifier
identifiable	TokenNameIdentifier
:	TokenNameCOLON
recessive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
dominantById	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
identifiable	TokenNameIdentifier
.	TokenNameDOT
getId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
identifiable	TokenNameIdentifier
.	TokenNameDOT
setSourceLevel	TokenNameIdentifier
(	TokenNameLPAREN
recessiveSourceLevel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dominant	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
identifiable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
<	TokenNameLESS
T	TokenNameIdentifier
extends	TokenNameextends
IdentifiableBase	TokenNameIdentifier
>	TokenNameGREATER
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
>	TokenNameGREATER
mapById	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
identifiables	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
>	TokenNameGREATER
byId	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
T	TokenNameIdentifier
identifiable	TokenNameIdentifier
:	TokenNameCOLON
identifiables	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
byId	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
identifiable	TokenNameIdentifier
.	TokenNameDOT
getId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
identifiable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
byId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE