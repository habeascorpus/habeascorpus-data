package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
.	TokenNameDOT
validation	TokenNameIdentifier
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
InputLocation	TokenNameIdentifier
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
Model	TokenNameIdentifier
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
DefaultModelBuildingRequest	TokenNameIdentifier
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
ModelBuildingRequest	TokenNameIdentifier
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
ModelProblem	TokenNameIdentifier
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
ModelProblemCollector	TokenNameIdentifier
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
ModelProblem	TokenNameIdentifier
.	TokenNameDOT
Severity	TokenNameIdentifier
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
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
ModelValidator	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
class	TokenNameclass
DefaultModelValidator	TokenNameIdentifier
implements	TokenNameimplements
ModelValidator	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Requirement	TokenNameIdentifier
private	TokenNameprivate
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
validation	TokenNameIdentifier
.	TokenNameDOT
ModelValidator	TokenNameIdentifier
modelValidator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ModelValidationResult	TokenNameIdentifier
validate	TokenNameIdentifier
(	TokenNameLPAREN
Model	TokenNameIdentifier
model	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ModelValidationResult	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ModelValidationResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ModelBuildingRequest	TokenNameIdentifier
request	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultModelBuildingRequest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValidationLevel	TokenNameIdentifier
(	TokenNameLPAREN
ModelBuildingRequest	TokenNameIdentifier
.	TokenNameDOT
VALIDATION_LEVEL_MAVEN_2_0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SimpleModelProblemCollector	TokenNameIdentifier
problems	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleModelProblemCollector	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
modelValidator	TokenNameIdentifier
.	TokenNameDOT
validateEffectiveModel	TokenNameIdentifier
(	TokenNameLPAREN
model	TokenNameIdentifier
,	TokenNameCOMMA
request	TokenNameIdentifier
,	TokenNameCOMMA
problems	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
SimpleModelProblemCollector	TokenNameIdentifier
implements	TokenNameimplements
ModelProblemCollector	TokenNameIdentifier
{	TokenNameLBRACE
ModelValidationResult	TokenNameIdentifier
result	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SimpleModelProblemCollector	TokenNameIdentifier
(	TokenNameLPAREN
ModelValidationResult	TokenNameIdentifier
result	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
result	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
Severity	TokenNameIdentifier
severity	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
InputLocation	TokenNameIdentifier
location	TokenNameIdentifier
,	TokenNameCOMMA
Exception	TokenNameIdentifier
cause	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
ModelProblem	TokenNameIdentifier
.	TokenNameDOT
Severity	TokenNameIdentifier
.	TokenNameDOT
WARNING	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
severity	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
.	TokenNameDOT
addMessage	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE