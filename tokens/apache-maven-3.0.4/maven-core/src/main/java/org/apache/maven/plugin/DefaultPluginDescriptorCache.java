package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
plugin	TokenNameIdentifier
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
HashMap	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
ArtifactUtils	TokenNameIdentifier
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
descriptor	TokenNameIdentifier
.	TokenNameDOT
MojoDescriptor	TokenNameIdentifier
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
descriptor	TokenNameIdentifier
.	TokenNameDOT
PluginDescriptor	TokenNameIdentifier
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
repository	TokenNameIdentifier
.	TokenNameDOT
ComponentDescriptor	TokenNameIdentifier
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
repository	TokenNameIdentifier
.	TokenNameDOT
LocalRepository	TokenNameIdentifier
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
RemoteRepository	TokenNameIdentifier
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
WorkspaceRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
PluginDescriptorCache	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
DefaultPluginDescriptorCache	TokenNameIdentifier
implements	TokenNameimplements
PluginDescriptorCache	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
Key	TokenNameIdentifier
,	TokenNameCOMMA
PluginDescriptor	TokenNameIdentifier
>	TokenNameGREATER
descriptors	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
Key	TokenNameIdentifier
,	TokenNameCOMMA
PluginDescriptor	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
128	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
descriptors	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Key	TokenNameIdentifier
createKey	TokenNameIdentifier
(	TokenNameLPAREN
Plugin	TokenNameIdentifier
plugin	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
RemoteRepository	TokenNameIdentifier
>	TokenNameGREATER
repositories	TokenNameIdentifier
,	TokenNameCOMMA
RepositorySystemSession	TokenNameIdentifier
session	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
CacheKey	TokenNameIdentifier
(	TokenNameLPAREN
plugin	TokenNameIdentifier
,	TokenNameCOMMA
repositories	TokenNameIdentifier
,	TokenNameCOMMA
session	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PluginDescriptor	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
Key	TokenNameIdentifier
cacheKey	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
clone	TokenNameIdentifier
(	TokenNameLPAREN
descriptors	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
cacheKey	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
put	TokenNameIdentifier
(	TokenNameLPAREN
Key	TokenNameIdentifier
cacheKey	TokenNameIdentifier
,	TokenNameCOMMA
PluginDescriptor	TokenNameIdentifier
pluginDescriptor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
descriptors	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
cacheKey	TokenNameIdentifier
,	TokenNameCOMMA
clone	TokenNameIdentifier
(	TokenNameLPAREN
pluginDescriptor	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
PluginDescriptor	TokenNameIdentifier
clone	TokenNameIdentifier
(	TokenNameLPAREN
PluginDescriptor	TokenNameIdentifier
original	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
PluginDescriptor	TokenNameIdentifier
clone	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
original	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
clone	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PluginDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setGroupId	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getGroupId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setVersion	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setGoalPrefix	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getGoalPrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setInheritedByDefault	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
isInheritedByDefault	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setDescription	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getDescription	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setRequiredMavenVersion	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getRequiredMavenVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setPluginArtifact	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactUtils	TokenNameIdentifier
.	TokenNameDOT
copyArtifactSafe	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getPluginArtifact	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setComponents	TokenNameIdentifier
(	TokenNameLPAREN
clone	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getMojos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
clone	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setId	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setIsolatedRealm	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
isIsolatedRealm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setSource	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
clone	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
List	TokenNameIdentifier
<	TokenNameLESS
ComponentDescriptor	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>>	TokenNameRIGHT_SHIFT
clone	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
MojoDescriptor	TokenNameIdentifier
>	TokenNameGREATER
mojos	TokenNameIdentifier
,	TokenNameCOMMA
PluginDescriptor	TokenNameIdentifier
pluginDescriptor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
ComponentDescriptor	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>>	TokenNameRIGHT_SHIFT
clones	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
mojos	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
clones	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ComponentDescriptor	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
mojos	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
MojoDescriptor	TokenNameIdentifier
mojo	TokenNameIdentifier
:	TokenNameCOLON
mojos	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
MojoDescriptor	TokenNameIdentifier
clone	TokenNameIdentifier
=	TokenNameEQUAL
mojo	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
setPluginDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
pluginDescriptor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clones	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
clone	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
clones	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
CacheKey	TokenNameIdentifier
implements	TokenNameimplements
Key	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
groupId	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
version	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
WorkspaceRepository	TokenNameIdentifier
workspace	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
LocalRepository	TokenNameIdentifier
localRepo	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
RemoteRepository	TokenNameIdentifier
>	TokenNameGREATER
repositories	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
hashCode	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
CacheKey	TokenNameIdentifier
(	TokenNameLPAREN
Plugin	TokenNameIdentifier
plugin	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
RemoteRepository	TokenNameIdentifier
>	TokenNameGREATER
repositories	TokenNameIdentifier
,	TokenNameCOMMA
RepositorySystemSession	TokenNameIdentifier
session	TokenNameIdentifier
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
version	TokenNameIdentifier
=	TokenNameEQUAL
plugin	TokenNameIdentifier
.	TokenNameDOT
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
workspace	TokenNameIdentifier
=	TokenNameEQUAL
CacheUtils	TokenNameIdentifier
.	TokenNameDOT
getWorkspace	TokenNameIdentifier
(	TokenNameLPAREN
session	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
localRepo	TokenNameIdentifier
=	TokenNameEQUAL
session	TokenNameIdentifier
.	TokenNameDOT
getLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
repositories	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
RemoteRepository	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
repositories	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
RemoteRepository	TokenNameIdentifier
repository	TokenNameIdentifier
:	TokenNameCOLON
repositories	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
repository	TokenNameIdentifier
.	TokenNameDOT
isRepositoryManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
repositories	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
repository	TokenNameIdentifier
.	TokenNameDOT
getMirroredRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
repositories	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
repository	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
17	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
*	TokenNameMULTIPLY
31	TokenNameIntegerLiteral
+	TokenNamePLUS
groupId	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
*	TokenNameMULTIPLY
31	TokenNameIntegerLiteral
+	TokenNamePLUS
artifactId	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
*	TokenNameMULTIPLY
31	TokenNameIntegerLiteral
+	TokenNamePLUS
version	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
*	TokenNameMULTIPLY
31	TokenNameIntegerLiteral
+	TokenNamePLUS
hash	TokenNameIdentifier
(	TokenNameLPAREN
workspace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
*	TokenNameMULTIPLY
31	TokenNameIntegerLiteral
+	TokenNamePLUS
localRepo	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
*	TokenNameMULTIPLY
31	TokenNameIntegerLiteral
+	TokenNamePLUS
CacheUtils	TokenNameIdentifier
.	TokenNameDOT
repositoriesHashCode	TokenNameIdentifier
(	TokenNameLPAREN
repositories	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
hashCode	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
hashCode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
==	TokenNameEQUAL_EQUAL
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
obj	TokenNameIdentifier
instanceof	TokenNameinstanceof
CacheKey	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
CacheKey	TokenNameIdentifier
that	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CacheKey	TokenNameIdentifier
)	TokenNameRPAREN
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
eq	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
artifactId	TokenNameIdentifier
,	TokenNameCOMMA
that	TokenNameIdentifier
.	TokenNameDOT
artifactId	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
eq	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
groupId	TokenNameIdentifier
,	TokenNameCOMMA
that	TokenNameIdentifier
.	TokenNameDOT
groupId	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
eq	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
version	TokenNameIdentifier
,	TokenNameCOMMA
that	TokenNameIdentifier
.	TokenNameDOT
version	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
eq	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
localRepo	TokenNameIdentifier
,	TokenNameCOMMA
that	TokenNameIdentifier
.	TokenNameDOT
localRepo	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
eq	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
workspace	TokenNameIdentifier
,	TokenNameCOMMA
that	TokenNameIdentifier
.	TokenNameDOT
workspace	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
CacheUtils	TokenNameIdentifier
.	TokenNameDOT
repositoriesEquals	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
repositories	TokenNameIdentifier
,	TokenNameCOMMA
that	TokenNameIdentifier
.	TokenNameDOT
repositories	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
groupId	TokenNameIdentifier
+	TokenNamePLUS
':'	TokenNameCharacterLiteral
+	TokenNamePLUS
artifactId	TokenNameIdentifier
+	TokenNamePLUS
':'	TokenNameCharacterLiteral
+	TokenNamePLUS
version	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
hash	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
obj	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
obj	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
boolean	TokenNameboolean
eq	TokenNameIdentifier
(	TokenNameLPAREN
T	TokenNameIdentifier
s1	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
s2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
s1	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
s1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
s2	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
s2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
