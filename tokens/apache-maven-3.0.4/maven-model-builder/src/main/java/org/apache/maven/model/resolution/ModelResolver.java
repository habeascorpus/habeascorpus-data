package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
resolution	TokenNameIdentifier
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
Repository	TokenNameIdentifier
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
building	TokenNameIdentifier
.	TokenNameDOT
ModelSource	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
ModelResolver	TokenNameIdentifier
{	TokenNameLBRACE
ModelSource	TokenNameIdentifier
resolveModel	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
groupId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
UnresolvableModelException	TokenNameIdentifier
;	TokenNameSEMICOLON
void	TokenNamevoid
addRepository	TokenNameIdentifier
(	TokenNameLPAREN
Repository	TokenNameIdentifier
repository	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRepositoryException	TokenNameIdentifier
;	TokenNameSEMICOLON
ModelResolver	TokenNameIdentifier
newCopy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
