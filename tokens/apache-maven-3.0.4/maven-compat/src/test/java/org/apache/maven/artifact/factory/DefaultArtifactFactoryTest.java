package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
factory	TokenNameIdentifier
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
versioning	TokenNameIdentifier
.	TokenNameDOT
VersionRange	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
PlexusTestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DefaultArtifactFactoryTest	TokenNameIdentifier
extends	TokenNameextends
PlexusTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testPropagationOfSystemScopeRegardlessOfInheritedScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
ArtifactFactory	TokenNameIdentifier
factory	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ArtifactFactory	TokenNameIdentifier
)	TokenNameRPAREN
lookup	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactFactory	TokenNameIdentifier
.	TokenNameDOT
ROLE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
createDependencyArtifact	TokenNameIdentifier
(	TokenNameLPAREN
"test-grp"	TokenNameStringLiteral
,	TokenNameCOMMA
"test-artifact"	TokenNameStringLiteral
,	TokenNameCOMMA
VersionRange	TokenNameIdentifier
.	TokenNameDOT
createFromVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.0"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"type"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
"system"	TokenNameStringLiteral
,	TokenNameCOMMA
"provided"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Artifact	TokenNameIdentifier
artifact2	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
createDependencyArtifact	TokenNameIdentifier
(	TokenNameLPAREN
"test-grp"	TokenNameStringLiteral
,	TokenNameCOMMA
"test-artifact-2"	TokenNameStringLiteral
,	TokenNameCOMMA
VersionRange	TokenNameIdentifier
.	TokenNameDOT
createFromVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.0"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"type"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
"system"	TokenNameStringLiteral
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Artifact	TokenNameIdentifier
artifact3	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
createDependencyArtifact	TokenNameIdentifier
(	TokenNameLPAREN
"test-grp"	TokenNameStringLiteral
,	TokenNameCOMMA
"test-artifact-3"	TokenNameStringLiteral
,	TokenNameCOMMA
VersionRange	TokenNameIdentifier
.	TokenNameDOT
createFromVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.0"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"type"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
"system"	TokenNameStringLiteral
,	TokenNameCOMMA
"runtime"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Artifact	TokenNameIdentifier
artifact4	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
createDependencyArtifact	TokenNameIdentifier
(	TokenNameLPAREN
"test-grp"	TokenNameStringLiteral
,	TokenNameCOMMA
"test-artifact-4"	TokenNameStringLiteral
,	TokenNameCOMMA
VersionRange	TokenNameIdentifier
.	TokenNameDOT
createFromVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.0"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"type"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
"system"	TokenNameStringLiteral
,	TokenNameCOMMA
"compile"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Artifact	TokenNameIdentifier
artifact5	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
createDependencyArtifact	TokenNameIdentifier
(	TokenNameLPAREN
"test-grp"	TokenNameStringLiteral
,	TokenNameCOMMA
"test-artifact-5"	TokenNameStringLiteral
,	TokenNameCOMMA
VersionRange	TokenNameIdentifier
.	TokenNameDOT
createFromVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1.0"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"type"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
"system"	TokenNameStringLiteral
,	TokenNameCOMMA
"system"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"system"	TokenNameStringLiteral
,	TokenNameCOMMA
artifact	TokenNameIdentifier
.	TokenNameDOT
getScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"system"	TokenNameStringLiteral
,	TokenNameCOMMA
artifact2	TokenNameIdentifier
.	TokenNameDOT
getScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"system"	TokenNameStringLiteral
,	TokenNameCOMMA
artifact3	TokenNameIdentifier
.	TokenNameDOT
getScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"system"	TokenNameStringLiteral
,	TokenNameCOMMA
artifact4	TokenNameIdentifier
.	TokenNameDOT
getScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"system"	TokenNameStringLiteral
,	TokenNameCOMMA
artifact5	TokenNameIdentifier
.	TokenNameDOT
getScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE