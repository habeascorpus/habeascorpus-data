package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
execution	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
public	TokenNamepublic
interface	TokenNameinterface
ProjectDependencyGraph	TokenNameIdentifier
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
getSortedProjects	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
getDownstreamProjects	TokenNameIdentifier
(	TokenNameLPAREN
MavenProject	TokenNameIdentifier
project	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
transitive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
getUpstreamProjects	TokenNameIdentifier
(	TokenNameLPAREN
MavenProject	TokenNameIdentifier
project	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
transitive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE