package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
ArtifactDescriptorReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
MetadataGeneratorFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
VersionRangeResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
VersionResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DefaultServiceLocator	TokenNameIdentifier
extends	TokenNameextends
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
.	TokenNameDOT
DefaultServiceLocator	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
DefaultServiceLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
addService	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactDescriptorReader	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
DefaultArtifactDescriptorReader	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addService	TokenNameIdentifier
(	TokenNameLPAREN
VersionResolver	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
DefaultVersionResolver	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addService	TokenNameIdentifier
(	TokenNameLPAREN
VersionRangeResolver	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
DefaultVersionRangeResolver	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addService	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGeneratorFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
SnapshotMetadataGeneratorFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addService	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGeneratorFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
VersionsMetadataGeneratorFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
