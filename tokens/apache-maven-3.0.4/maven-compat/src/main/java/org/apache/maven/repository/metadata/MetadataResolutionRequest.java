package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
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
artifact	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
ArtifactRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
MetadataResolutionRequest	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
ArtifactMetadata	TokenNameIdentifier
query	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
ArtifactRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
remoteRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
MetadataResolutionRequest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
MetadataResolutionRequest	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactMetadata	TokenNameIdentifier
query	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
remoteRepositories	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
query	TokenNameIdentifier
=	TokenNameEQUAL
query	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
localRepository	TokenNameIdentifier
=	TokenNameEQUAL
localRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
remoteRepositories	TokenNameIdentifier
=	TokenNameEQUAL
remoteRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ArtifactMetadata	TokenNameIdentifier
getQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
query	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setQuery	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactMetadata	TokenNameIdentifier
query	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
query	TokenNameIdentifier
=	TokenNameEQUAL
query	TokenNameIdentifier
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
void	TokenNamevoid
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
void	TokenNamevoid
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
}	TokenNameRBRACE
}	TokenNameRBRACE