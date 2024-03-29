package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
legacy	TokenNameIdentifier
.	TokenNameDOT
resolver	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
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
Artifact	TokenNameIdentifier
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
deployer	TokenNameIdentifier
.	TokenNameDOT
ArtifactDeploymentException	TokenNameIdentifier
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
installer	TokenNameIdentifier
.	TokenNameDOT
ArtifactInstallationException	TokenNameIdentifier
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
artifact	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
RepositoryRequest	TokenNameIdentifier
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
resolver	TokenNameIdentifier
.	TokenNameDOT
ArtifactNotFoundException	TokenNameIdentifier
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
resolver	TokenNameIdentifier
.	TokenNameDOT
ArtifactResolutionException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
ArtifactTransformationManager	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
ROLE	TokenNameIdentifier
=	TokenNameEQUAL
ArtifactTransformationManager	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
transformForResolve	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
,	TokenNameCOMMA
RepositoryRequest	TokenNameIdentifier
request	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ArtifactResolutionException	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactNotFoundException	TokenNameIdentifier
;	TokenNameSEMICOLON
void	TokenNamevoid
transformForResolve	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
remoteRepositories	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ArtifactResolutionException	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactNotFoundException	TokenNameIdentifier
;	TokenNameSEMICOLON
void	TokenNamevoid
transformForInstall	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ArtifactInstallationException	TokenNameIdentifier
;	TokenNameSEMICOLON
void	TokenNamevoid
transformForDeployment	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepository	TokenNameIdentifier
remoteRepository	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ArtifactDeploymentException	TokenNameIdentifier
;	TokenNameSEMICOLON
List	TokenNameIdentifier
getArtifactTransformations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
