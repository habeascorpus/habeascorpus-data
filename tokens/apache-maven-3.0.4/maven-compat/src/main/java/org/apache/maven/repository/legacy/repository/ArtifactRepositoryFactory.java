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
repository	TokenNameIdentifier
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
UnknownRepositoryLayoutException	TokenNameIdentifier
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
ArtifactRepositoryPolicy	TokenNameIdentifier
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
layout	TokenNameIdentifier
.	TokenNameDOT
ArtifactRepositoryLayout	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
ArtifactRepositoryFactory	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
DEFAULT_LAYOUT_ID	TokenNameIdentifier
=	TokenNameEQUAL
"default"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
LOCAL_REPOSITORY_ID	TokenNameIdentifier
=	TokenNameEQUAL
"local"	TokenNameStringLiteral
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
ArtifactRepositoryLayout	TokenNameIdentifier
getLayout	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
layoutId	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
UnknownRepositoryLayoutException	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
ArtifactRepository	TokenNameIdentifier
createDeploymentArtifactRepository	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
url	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
layoutId	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
uniqueVersion	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
UnknownRepositoryLayoutException	TokenNameIdentifier
;	TokenNameSEMICOLON
ArtifactRepository	TokenNameIdentifier
createDeploymentArtifactRepository	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
url	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepositoryLayout	TokenNameIdentifier
layout	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
uniqueVersion	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ArtifactRepository	TokenNameIdentifier
createArtifactRepository	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
url	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
layoutId	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepositoryPolicy	TokenNameIdentifier
snapshots	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepositoryPolicy	TokenNameIdentifier
releases	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
UnknownRepositoryLayoutException	TokenNameIdentifier
;	TokenNameSEMICOLON
ArtifactRepository	TokenNameIdentifier
createArtifactRepository	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
url	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepositoryLayout	TokenNameIdentifier
repositoryLayout	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepositoryPolicy	TokenNameIdentifier
snapshots	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepositoryPolicy	TokenNameIdentifier
releases	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
setGlobalUpdatePolicy	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
snapshotPolicy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
setGlobalChecksumPolicy	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
checksumPolicy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
