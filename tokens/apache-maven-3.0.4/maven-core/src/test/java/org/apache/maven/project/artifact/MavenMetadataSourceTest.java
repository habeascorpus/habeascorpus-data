package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
RepositorySystem	TokenNameIdentifier
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
MavenMetadataSourceTest	TokenNameIdentifier
extends	TokenNameextends
PlexusTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
RepositorySystem	TokenNameIdentifier
repositorySystem	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
void	TokenNamevoid
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
repositorySystem	TokenNameIdentifier
=	TokenNameEQUAL
lookup	TokenNameIdentifier
(	TokenNameLPAREN
RepositorySystem	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
void	TokenNamevoid
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
repositorySystem	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testShouldNotCarryExclusionsOverFromDependencyToDependency	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE