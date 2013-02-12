package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
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
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
LinkedHashSet	TokenNameIdentifier
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
resolver	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
.	TokenNameDOT
ArtifactFilter	TokenNameIdentifier
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
filter	TokenNameIdentifier
.	TokenNameDOT
ExclusionSetFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
PlexusContainer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
component	TokenNameIdentifier
.	TokenNameDOT
annotations	TokenNameIdentifier
.	TokenNameDOT
Component	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
component	TokenNameIdentifier
.	TokenNameDOT
annotations	TokenNameIdentifier
.	TokenNameDOT
Requirement	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
component	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
exception	TokenNameIdentifier
.	TokenNameDOT
ComponentLookupException	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
ArtifactFilterManager	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
DefaultArtifactFilterManager	TokenNameIdentifier
implements	TokenNameimplements
ArtifactFilterManager	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
DEFAULT_EXCLUSIONS	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Requirement	TokenNameIdentifier
private	TokenNameprivate
PlexusContainer	TokenNameIdentifier
plexus	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
artifacts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashSet	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"classworlds:classworlds"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.codehaus.plexus:plexus-classworlds"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.codehaus.plexus:plexus-component-api"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.codehaus.plexus:plexus-container-default"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"plexus:plexus-container-default"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.sonatype.spice:spice-inject-plexus"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.sonatype.sisu:sisu-inject-plexus"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-artifact"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-aether-provider"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-artifact-manager"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-compat"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-core"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-error-diagnostics"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-lifecycle"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-model"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-model-builder"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-monitor"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-plugin-api"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-plugin-descriptor"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-plugin-parameter-documenter"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-plugin-registry"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-profile"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-project"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-repository-metadata"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-settings"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-settings-builder"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven:maven-toolchain"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.maven.wagon:wagon-provider-api"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.sonatype.aether:aether-api"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.sonatype.aether:aether-spi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
artifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
"org.sonatype.aether:aether-impl"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DEFAULT_EXCLUSIONS	TokenNameIdentifier
=	TokenNameEQUAL
Collections	TokenNameIdentifier
.	TokenNameDOT
unmodifiableSet	TokenNameIdentifier
(	TokenNameLPAREN
artifacts	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
excludedArtifacts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashSet	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
DEFAULT_EXCLUSIONS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
ArtifactFilter	TokenNameIdentifier
createStandardFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ExclusionSetFilter	TokenNameIdentifier
(	TokenNameLPAREN
DEFAULT_EXCLUSIONS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ArtifactFilter	TokenNameIdentifier
getArtifactFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
excludes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedHashSet	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
excludedArtifacts	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
ArtifactFilterManagerDelegate	TokenNameIdentifier
delegate	TokenNameIdentifier
:	TokenNameCOLON
getDelegates	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
delegate	TokenNameIdentifier
.	TokenNameDOT
addExcludes	TokenNameIdentifier
(	TokenNameLPAREN
excludes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
ExclusionSetFilter	TokenNameIdentifier
(	TokenNameLPAREN
excludes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ArtifactFilter	TokenNameIdentifier
getCoreArtifactFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ExclusionSetFilter	TokenNameIdentifier
(	TokenNameLPAREN
getCoreArtifactExcludes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
ArtifactFilterManagerDelegate	TokenNameIdentifier
>	TokenNameGREATER
getDelegates	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
plexus	TokenNameIdentifier
.	TokenNameDOT
lookupList	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactFilterManagerDelegate	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ComponentLookupException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ArtifactFilterManagerDelegate	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
excludeArtifact	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
excludedArtifacts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
artifactId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
getCoreArtifactExcludes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
excludes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedHashSet	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
DEFAULT_EXCLUSIONS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
ArtifactFilterManagerDelegate	TokenNameIdentifier
delegate	TokenNameIdentifier
:	TokenNameCOLON
getDelegates	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
delegate	TokenNameIdentifier
.	TokenNameDOT
addCoreExcludes	TokenNameIdentifier
(	TokenNameLPAREN
excludes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
excludes	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
