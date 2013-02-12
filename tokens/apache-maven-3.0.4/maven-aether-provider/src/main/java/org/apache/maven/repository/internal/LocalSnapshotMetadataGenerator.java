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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collection	TokenNameIdentifier
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
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
ConfigurationProperties	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
Artifact	TokenNameIdentifier
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
MetadataGenerator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
installation	TokenNameIdentifier
.	TokenNameDOT
InstallRequest	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
.	TokenNameDOT
Metadata	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
LocalSnapshotMetadataGenerator	TokenNameIdentifier
implements	TokenNameimplements
MetadataGenerator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
,	TokenNameCOMMA
LocalSnapshotMetadata	TokenNameIdentifier
>	TokenNameGREATER
snapshots	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
legacyFormat	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
LocalSnapshotMetadataGenerator	TokenNameIdentifier
(	TokenNameLPAREN
RepositorySystemSession	TokenNameIdentifier
session	TokenNameIdentifier
,	TokenNameCOMMA
InstallRequest	TokenNameIdentifier
request	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
legacyFormat	TokenNameIdentifier
=	TokenNameEQUAL
ConfigurationProperties	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
session	TokenNameIdentifier
.	TokenNameDOT
getConfigProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"maven.metadata.legacy"	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
snapshots	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedHashMap	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
,	TokenNameCOMMA
LocalSnapshotMetadata	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Collection	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
Metadata	TokenNameIdentifier
>	TokenNameGREATER
prepare	TokenNameIdentifier
(	TokenNameLPAREN
Collection	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
Artifact	TokenNameIdentifier
>	TokenNameGREATER
artifacts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
:	TokenNameCOLON
artifacts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
artifact	TokenNameIdentifier
.	TokenNameDOT
isSnapshot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
LocalSnapshotMetadata	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
LocalSnapshotMetadata	TokenNameIdentifier
snapshotMetadata	TokenNameIdentifier
=	TokenNameEQUAL
snapshots	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
snapshotMetadata	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
snapshotMetadata	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LocalSnapshotMetadata	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
,	TokenNameCOMMA
legacyFormat	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
snapshots	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
snapshotMetadata	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
snapshotMetadata	TokenNameIdentifier
.	TokenNameDOT
bind	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Artifact	TokenNameIdentifier
transformArtifact	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
artifact	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Collection	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
Metadata	TokenNameIdentifier
>	TokenNameGREATER
finish	TokenNameIdentifier
(	TokenNameLPAREN
Collection	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
Artifact	TokenNameIdentifier
>	TokenNameGREATER
artifacts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
snapshots	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE