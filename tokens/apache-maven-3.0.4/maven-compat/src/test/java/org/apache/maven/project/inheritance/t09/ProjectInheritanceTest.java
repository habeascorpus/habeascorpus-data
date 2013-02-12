package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
.	TokenNameDOT
inheritance	TokenNameIdentifier
.	TokenNameDOT
t09	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
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
project	TokenNameIdentifier
.	TokenNameDOT
MavenProject	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
.	TokenNameDOT
inheritance	TokenNameIdentifier
.	TokenNameDOT
AbstractProjectInheritanceTestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ProjectInheritanceTest	TokenNameIdentifier
extends	TokenNameextends
AbstractProjectInheritanceTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testDependencyManagementExclusionsExcludeTransitively	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
localRepo	TokenNameIdentifier
=	TokenNameEQUAL
getLocalRepositoryPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
pom0	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
localRepo	TokenNameIdentifier
,	TokenNameCOMMA
"p0/pom.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
pom0Basedir	TokenNameIdentifier
=	TokenNameEQUAL
pom0	TokenNameIdentifier
.	TokenNameDOT
getParentFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
pom1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
pom0Basedir	TokenNameIdentifier
,	TokenNameCOMMA
"p1/pom.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MavenProject	TokenNameIdentifier
project0	TokenNameIdentifier
=	TokenNameEQUAL
getProjectWithDependencies	TokenNameIdentifier
(	TokenNameLPAREN
pom0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MavenProject	TokenNameIdentifier
project1	TokenNameIdentifier
=	TokenNameEQUAL
getProjectWithDependencies	TokenNameIdentifier
(	TokenNameLPAREN
pom1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"Parent is null"	TokenNameStringLiteral
,	TokenNameCOMMA
project1	TokenNameIdentifier
.	TokenNameDOT
getParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
pom0Basedir	TokenNameIdentifier
,	TokenNameCOMMA
project1	TokenNameIdentifier
.	TokenNameDOT
getParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getBasedir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
map	TokenNameIdentifier
=	TokenNameEQUAL
project1	TokenNameIdentifier
.	TokenNameDOT
getArtifactMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"No artifacts"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"No Artifacts"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Set size should be 2, is "	TokenNameStringLiteral
+	TokenNamePLUS
map	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-a is not in the project"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-a"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-b is not in the project"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-b"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-c is in the project"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-c"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testDependencyManagementExclusionDoesNotOverrideGloballyForTransitives	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
localRepo	TokenNameIdentifier
=	TokenNameEQUAL
getLocalRepositoryPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
pom0	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
localRepo	TokenNameIdentifier
,	TokenNameCOMMA
"p0/pom.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
pom0Basedir	TokenNameIdentifier
=	TokenNameEQUAL
pom0	TokenNameIdentifier
.	TokenNameDOT
getParentFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
pom2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
pom0Basedir	TokenNameIdentifier
,	TokenNameCOMMA
"p2/pom.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MavenProject	TokenNameIdentifier
project0	TokenNameIdentifier
=	TokenNameEQUAL
getProjectWithDependencies	TokenNameIdentifier
(	TokenNameLPAREN
pom0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MavenProject	TokenNameIdentifier
project2	TokenNameIdentifier
=	TokenNameEQUAL
getProjectWithDependencies	TokenNameIdentifier
(	TokenNameLPAREN
pom2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
pom0Basedir	TokenNameIdentifier
,	TokenNameCOMMA
project2	TokenNameIdentifier
.	TokenNameDOT
getParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getBasedir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
map	TokenNameIdentifier
=	TokenNameEQUAL
project2	TokenNameIdentifier
.	TokenNameDOT
getArtifactMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"No artifacts"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"No Artifacts"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Set size should be 4, is "	TokenNameStringLiteral
+	TokenNamePLUS
map	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-a is not in the project"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-a"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-b is not in the project"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-b"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-c is not in the project"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-c"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-d is not in the project"	TokenNameStringLiteral
,	TokenNameCOMMA
map	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
"maven-test:t09-d"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE