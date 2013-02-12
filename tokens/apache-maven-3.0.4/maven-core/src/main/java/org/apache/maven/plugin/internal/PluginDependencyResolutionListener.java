package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
plugin	TokenNameIdentifier
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
IdentityHashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
LinkedList	TokenNameIdentifier
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
resolver	TokenNameIdentifier
.	TokenNameDOT
ResolutionListener	TokenNameIdentifier
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
versioning	TokenNameIdentifier
.	TokenNameDOT
VersionRange	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
PluginDependencyResolutionListener	TokenNameIdentifier
implements	TokenNameimplements
ResolutionListener	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
ArtifactFilter	TokenNameIdentifier
coreFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
LinkedList	TokenNameIdentifier
<	TokenNameLESS
Artifact	TokenNameIdentifier
>	TokenNameGREATER
coreArtifacts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedList	TokenNameIdentifier
<	TokenNameLESS
Artifact	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Artifact	TokenNameIdentifier
wagonProvider	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
Artifact	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
bannedArtifacts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IdentityHashMap	TokenNameIdentifier
<	TokenNameLESS
Artifact	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
PluginDependencyResolutionListener	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactFilter	TokenNameIdentifier
coreFilter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
coreFilter	TokenNameIdentifier
=	TokenNameEQUAL
coreFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
removeBannedDependencies	TokenNameIdentifier
(	TokenNameLPAREN
Collection	TokenNameIdentifier
<	TokenNameLESS
Artifact	TokenNameIdentifier
>	TokenNameGREATER
artifacts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
bannedArtifacts	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
artifacts	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
<	TokenNameLESS
Artifact	TokenNameIdentifier
>	TokenNameGREATER
it	TokenNameIdentifier
=	TokenNameEQUAL
artifacts	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
=	TokenNameEQUAL
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
bannedArtifacts	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
it	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startProcessChildren	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
wagonProvider	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isLegacyCoreArtifact	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
coreArtifacts	TokenNameIdentifier
.	TokenNameDOT
addFirst	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
coreArtifacts	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
isWagonProvider	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
wagonProvider	TokenNameIdentifier
=	TokenNameEQUAL
artifact	TokenNameIdentifier
;	TokenNameSEMICOLON
bannedArtifacts	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
isLegacyCoreArtifact	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
version	TokenNameIdentifier
=	TokenNameEQUAL
artifact	TokenNameIdentifier
.	TokenNameDOT
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
version	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
version	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"2."	TokenNameStringLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
coreFilter	TokenNameIdentifier
.	TokenNameDOT
include	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endProcessChildren	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
wagonProvider	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
wagonProvider	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
coreArtifacts	TokenNameIdentifier
.	TokenNameDOT
peek	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
coreArtifacts	TokenNameIdentifier
.	TokenNameDOT
removeFirst	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
includeArtifact	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
wagonProvider	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
bannedArtifacts	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
isWagonProvider	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
"org.apache.maven.wagon"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
.	TokenNameDOT
getGroupId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
artifact	TokenNameIdentifier
.	TokenNameDOT
getArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"wagon-"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
manageArtifact	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
,	TokenNameCOMMA
Artifact	TokenNameIdentifier
replacement	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
omitForCycle	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
omitForNearer	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
omitted	TokenNameIdentifier
,	TokenNameCOMMA
Artifact	TokenNameIdentifier
kept	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
restrictRange	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
,	TokenNameCOMMA
Artifact	TokenNameIdentifier
replacement	TokenNameIdentifier
,	TokenNameCOMMA
VersionRange	TokenNameIdentifier
newRange	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
selectVersionFromRange	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testArtifact	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
updateScope	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
scope	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
updateScopeCurrentPom	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ignoredScope	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE