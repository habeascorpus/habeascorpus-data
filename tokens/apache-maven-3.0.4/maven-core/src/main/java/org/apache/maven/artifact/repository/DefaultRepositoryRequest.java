package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
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
List	TokenNameIdentifier
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
project	TokenNameIdentifier
.	TokenNameDOT
MavenProject	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DefaultRepositoryRequest	TokenNameIdentifier
implements	TokenNameimplements
RepositoryRequest	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
boolean	TokenNameboolean
offline	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
forceUpdate	TokenNameIdentifier
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
public	TokenNamepublic
DefaultRepositoryRequest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
DefaultRepositoryRequest	TokenNameIdentifier
(	TokenNameLPAREN
RepositoryRequest	TokenNameIdentifier
repositoryRequest	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
repositoryRequest	TokenNameIdentifier
.	TokenNameDOT
getLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
repositoryRequest	TokenNameIdentifier
.	TokenNameDOT
getRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setOffline	TokenNameIdentifier
(	TokenNameLPAREN
repositoryRequest	TokenNameIdentifier
.	TokenNameDOT
isOffline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setForceUpdate	TokenNameIdentifier
(	TokenNameLPAREN
repositoryRequest	TokenNameIdentifier
.	TokenNameDOT
isForceUpdate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
RepositoryRequest	TokenNameIdentifier
getRepositoryRequest	TokenNameIdentifier
(	TokenNameLPAREN
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
,	TokenNameCOMMA
MavenProject	TokenNameIdentifier
project	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
RepositoryRequest	TokenNameIdentifier
request	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultRepositoryRequest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
request	TokenNameIdentifier
.	TokenNameDOT
setLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
session	TokenNameIdentifier
.	TokenNameDOT
getLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
project	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
request	TokenNameIdentifier
.	TokenNameDOT
setRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
.	TokenNameDOT
getPluginArtifactRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
request	TokenNameIdentifier
.	TokenNameDOT
setOffline	TokenNameIdentifier
(	TokenNameLPAREN
session	TokenNameIdentifier
.	TokenNameDOT
isOffline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
request	TokenNameIdentifier
.	TokenNameDOT
setForceUpdate	TokenNameIdentifier
(	TokenNameLPAREN
session	TokenNameIdentifier
.	TokenNameDOT
getRequest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isUpdateSnapshots	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
request	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isOffline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
offline	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DefaultRepositoryRequest	TokenNameIdentifier
setOffline	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
offline	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
offline	TokenNameIdentifier
=	TokenNameEQUAL
offline	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isForceUpdate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
forceUpdate	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DefaultRepositoryRequest	TokenNameIdentifier
setForceUpdate	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
forceUpdate	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
forceUpdate	TokenNameIdentifier
=	TokenNameEQUAL
forceUpdate	TokenNameIdentifier
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
DefaultRepositoryRequest	TokenNameIdentifier
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
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
getRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
remoteRepositories	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
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
}	TokenNameRBRACE
return	TokenNamereturn
remoteRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DefaultRepositoryRequest	TokenNameIdentifier
setRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
remoteRepositories	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
remoteRepositories	TokenNameIdentifier
=	TokenNameEQUAL
remoteRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE