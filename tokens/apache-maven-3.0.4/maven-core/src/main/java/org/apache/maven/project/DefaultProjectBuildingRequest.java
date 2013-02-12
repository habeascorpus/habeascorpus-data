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
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Date	TokenNameIdentifier
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
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
ArtifactRepository	TokenNameIdentifier
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
Profile	TokenNameIdentifier
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
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
RepositorySystemSession	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DefaultProjectBuildingRequest	TokenNameIdentifier
implements	TokenNameimplements
ProjectBuildingRequest	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
RepositorySystemSession	TokenNameIdentifier
repositorySession	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
ArtifactRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
remoteRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
pluginArtifactRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
MavenProject	TokenNameIdentifier
project	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
validationLevel	TokenNameIdentifier
=	TokenNameEQUAL
ModelBuildingRequest	TokenNameIdentifier
.	TokenNameDOT
VALIDATION_LEVEL_STRICT	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
processPlugins	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
Profile	TokenNameIdentifier
>	TokenNameGREATER
profiles	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
activeProfileIds	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
inactiveProfileIds	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Properties	TokenNameIdentifier
systemProperties	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Properties	TokenNameIdentifier
userProperties	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Date	TokenNameIdentifier
buildStartTime	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
resolveDependencies	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
RepositoryMerging	TokenNameIdentifier
repositoryMerging	TokenNameIdentifier
=	TokenNameEQUAL
RepositoryMerging	TokenNameIdentifier
.	TokenNameDOT
POM_DOMINANT	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DefaultProjectBuildingRequest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
processPlugins	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
profiles	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Profile	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
activeProfileIds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
inactiveProfileIds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
systemProperties	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
userProperties	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
remoteRepositories	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pluginArtifactRepositories	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DefaultProjectBuildingRequest	TokenNameIdentifier
(	TokenNameLPAREN
ProjectBuildingRequest	TokenNameIdentifier
request	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setProcessPlugins	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
isProcessPlugins	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setProfiles	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getProfiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setActiveProfileIds	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getActiveProfileIds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setInactiveProfileIds	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getInactiveProfileIds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setSystemProperties	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getSystemProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setUserProperties	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getUserProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setPluginArtifactRepositories	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getPluginArtifactRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setRepositorySession	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getRepositorySession	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setBuildStartTime	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getBuildStartTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setProject	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setResolveDependencies	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
isResolveDependencies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setValidationLevel	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getValidationLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MavenProject	TokenNameIdentifier
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
project	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setProject	TokenNameIdentifier
(	TokenNameLPAREN
MavenProject	TokenNameIdentifier
mavenProject	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
project	TokenNameIdentifier
=	TokenNameEQUAL
mavenProject	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ProjectBuildingRequest	TokenNameIdentifier
setLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
localRepository	TokenNameIdentifier
=	TokenNameEQUAL
localRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ArtifactRepository	TokenNameIdentifier
getLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
localRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
getRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
remoteRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ProjectBuildingRequest	TokenNameIdentifier
setRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
remoteRepositories	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
remoteRepositories	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
remoteRepositories	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
remoteRepositories	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
remoteRepositories	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
getPluginArtifactRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
pluginArtifactRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ProjectBuildingRequest	TokenNameIdentifier
setPluginArtifactRepositories	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
pluginArtifactRepositories	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
pluginArtifactRepositories	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
pluginArtifactRepositories	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
pluginArtifactRepositories	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
pluginArtifactRepositories	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Properties	TokenNameIdentifier
getSystemProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
systemProperties	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ProjectBuildingRequest	TokenNameIdentifier
setSystemProperties	TokenNameIdentifier
(	TokenNameLPAREN
Properties	TokenNameIdentifier
systemProperties	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
systemProperties	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
systemProperties	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
systemProperties	TokenNameIdentifier
.	TokenNameDOT
putAll	TokenNameIdentifier
(	TokenNameLPAREN
systemProperties	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
systemProperties	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Properties	TokenNameIdentifier
getUserProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
userProperties	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ProjectBuildingRequest	TokenNameIdentifier
setUserProperties	TokenNameIdentifier
(	TokenNameLPAREN
Properties	TokenNameIdentifier
userProperties	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
userProperties	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
userProperties	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
userProperties	TokenNameIdentifier
.	TokenNameDOT
putAll	TokenNameIdentifier
(	TokenNameLPAREN
userProperties	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
userProperties	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isProcessPlugins	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
processPlugins	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ProjectBuildingRequest	TokenNameIdentifier
setProcessPlugins	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
processPlugins	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
processPlugins	TokenNameIdentifier
=	TokenNameEQUAL
processPlugins	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ProjectBuildingRequest	TokenNameIdentifier
setResolveDependencies	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
resolveDependencies	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
resolveDependencies	TokenNameIdentifier
=	TokenNameEQUAL
resolveDependencies	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isResolveDependencies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
resolveDependencies	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ProjectBuildingRequest	TokenNameIdentifier
setValidationLevel	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
validationLevel	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
validationLevel	TokenNameIdentifier
=	TokenNameEQUAL
validationLevel	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getValidationLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
validationLevel	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
getActiveProfileIds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
activeProfileIds	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setActiveProfileIds	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
activeProfileIds	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
activeProfileIds	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
activeProfileIds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
activeProfileIds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
activeProfileIds	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
getInactiveProfileIds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
inactiveProfileIds	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setInactiveProfileIds	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
inactiveProfileIds	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
inactiveProfileIds	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
inactiveProfileIds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
inactiveProfileIds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
inactiveProfileIds	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setProfiles	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Profile	TokenNameIdentifier
>	TokenNameGREATER
profiles	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
profiles	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
profiles	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Profile	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
profiles	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
profiles	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addProfile	TokenNameIdentifier
(	TokenNameLPAREN
Profile	TokenNameIdentifier
profile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
profiles	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
profile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Profile	TokenNameIdentifier
>	TokenNameGREATER
getProfiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
profiles	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Date	TokenNameIdentifier
getBuildStartTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
buildStartTime	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setBuildStartTime	TokenNameIdentifier
(	TokenNameLPAREN
Date	TokenNameIdentifier
buildStartTime	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
buildStartTime	TokenNameIdentifier
=	TokenNameEQUAL
buildStartTime	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RepositorySystemSession	TokenNameIdentifier
getRepositorySession	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
repositorySession	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DefaultProjectBuildingRequest	TokenNameIdentifier
setRepositorySession	TokenNameIdentifier
(	TokenNameLPAREN
RepositorySystemSession	TokenNameIdentifier
repositorySession	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
repositorySession	TokenNameIdentifier
=	TokenNameEQUAL
repositorySession	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DefaultProjectBuildingRequest	TokenNameIdentifier
setRepositoryMerging	TokenNameIdentifier
(	TokenNameLPAREN
RepositoryMerging	TokenNameIdentifier
repositoryMerging	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
repositoryMerging	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"repository merge mode not specified"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
repositoryMerging	TokenNameIdentifier
=	TokenNameEQUAL
repositoryMerging	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RepositoryMerging	TokenNameIdentifier
getRepositoryMerging	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
repositoryMerging	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
