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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
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
repository	TokenNameIdentifier
.	TokenNameDOT
ArtifactRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ResolutionGroup	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Set	TokenNameIdentifier
<	TokenNameLESS
Artifact	TokenNameIdentifier
>	TokenNameGREATER
artifacts	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
resolutionRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Artifact	TokenNameIdentifier
pomArtifact	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Artifact	TokenNameIdentifier
relocatedArtifact	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Artifact	TokenNameIdentifier
>	TokenNameGREATER
managedVersions	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ResolutionGroup	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
pomArtifact	TokenNameIdentifier
,	TokenNameCOMMA
Set	TokenNameIdentifier
<	TokenNameLESS
Artifact	TokenNameIdentifier
>	TokenNameGREATER
artifacts	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
resolutionRepositories	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
pomArtifact	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
artifacts	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
resolutionRepositories	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ResolutionGroup	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
pomArtifact	TokenNameIdentifier
,	TokenNameCOMMA
Artifact	TokenNameIdentifier
relocatedArtifact	TokenNameIdentifier
,	TokenNameCOMMA
Set	TokenNameIdentifier
<	TokenNameLESS
Artifact	TokenNameIdentifier
>	TokenNameGREATER
artifacts	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Artifact	TokenNameIdentifier
>	TokenNameGREATER
managedVersions	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
resolutionRepositories	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
pomArtifact	TokenNameIdentifier
=	TokenNameEQUAL
pomArtifact	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
relocatedArtifact	TokenNameIdentifier
=	TokenNameEQUAL
relocatedArtifact	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
artifacts	TokenNameIdentifier
=	TokenNameEQUAL
artifacts	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
managedVersions	TokenNameIdentifier
=	TokenNameEQUAL
managedVersions	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
resolutionRepositories	TokenNameIdentifier
=	TokenNameEQUAL
resolutionRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Artifact	TokenNameIdentifier
getPomArtifact	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
pomArtifact	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Artifact	TokenNameIdentifier
getRelocatedArtifact	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
relocatedArtifact	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Set	TokenNameIdentifier
<	TokenNameLESS
Artifact	TokenNameIdentifier
>	TokenNameGREATER
getArtifacts	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
artifacts	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactRepository	TokenNameIdentifier
>	TokenNameGREATER
getResolutionRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
resolutionRepositories	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Artifact	TokenNameIdentifier
>	TokenNameGREATER
getManagedVersions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
managedVersions	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
