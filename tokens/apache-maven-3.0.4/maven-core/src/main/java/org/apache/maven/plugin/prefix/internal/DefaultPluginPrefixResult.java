package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
plugin	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
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
plugin	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
.	TokenNameDOT
PluginPrefixResult	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
ArtifactRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
DefaultPluginPrefixResult	TokenNameIdentifier
implements	TokenNameimplements
PluginPrefixResult	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
groupId	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
ArtifactRepository	TokenNameIdentifier
repository	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DefaultPluginPrefixResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
DefaultPluginPrefixResult	TokenNameIdentifier
(	TokenNameLPAREN
Plugin	TokenNameIdentifier
plugin	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
groupId	TokenNameIdentifier
=	TokenNameEQUAL
plugin	TokenNameIdentifier
.	TokenNameDOT
getGroupId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifactId	TokenNameIdentifier
=	TokenNameEQUAL
plugin	TokenNameIdentifier
.	TokenNameDOT
getArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DefaultPluginPrefixResult	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
groupId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepository	TokenNameIdentifier
repository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
groupId	TokenNameIdentifier
=	TokenNameEQUAL
groupId	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
artifactId	TokenNameIdentifier
=	TokenNameEQUAL
artifactId	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
repository	TokenNameIdentifier
=	TokenNameEQUAL
repository	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getGroupId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
groupId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setGroupId	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
groupId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
groupId	TokenNameIdentifier
=	TokenNameEQUAL
groupId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
artifactId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
artifactId	TokenNameIdentifier
=	TokenNameEQUAL
artifactId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ArtifactRepository	TokenNameIdentifier
getRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
repository	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setRepository	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactRepository	TokenNameIdentifier
repository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
repository	TokenNameIdentifier
=	TokenNameEQUAL
repository	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE