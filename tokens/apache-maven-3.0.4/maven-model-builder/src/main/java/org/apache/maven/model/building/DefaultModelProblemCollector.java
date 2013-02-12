package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
building	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
EnumSet	TokenNameIdentifier
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
ModelProblem	TokenNameIdentifier
.	TokenNameDOT
Severity	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
ModelParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
DefaultModelProblemCollector	TokenNameIdentifier
implements	TokenNameimplements
ModelProblemCollector	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
ModelBuildingResult	TokenNameIdentifier
result	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
ModelProblem	TokenNameIdentifier
>	TokenNameGREATER
problems	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
source	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Model	TokenNameIdentifier
sourceModel	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Model	TokenNameIdentifier
rootModel	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Set	TokenNameIdentifier
<	TokenNameLESS
ModelProblem	TokenNameIdentifier
.	TokenNameDOT
Severity	TokenNameIdentifier
>	TokenNameGREATER
severities	TokenNameIdentifier
=	TokenNameEQUAL
EnumSet	TokenNameIdentifier
.	TokenNameDOT
noneOf	TokenNameIdentifier
(	TokenNameLPAREN
ModelProblem	TokenNameIdentifier
.	TokenNameDOT
Severity	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
DefaultModelProblemCollector	TokenNameIdentifier
(	TokenNameLPAREN
ModelBuildingResult	TokenNameIdentifier
result	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
result	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
problems	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
.	TokenNameDOT
getProblems	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
ModelProblem	TokenNameIdentifier
problem	TokenNameIdentifier
:	TokenNameCOLON
this	TokenNamethis
.	TokenNameDOT
problems	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
severities	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
problem	TokenNameIdentifier
.	TokenNameDOT
getSeverity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasFatalErrors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
severities	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
ModelProblem	TokenNameIdentifier
.	TokenNameDOT
Severity	TokenNameIdentifier
.	TokenNameDOT
FATAL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasErrors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
severities	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
ModelProblem	TokenNameIdentifier
.	TokenNameDOT
Severity	TokenNameIdentifier
.	TokenNameDOT
ERROR	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
severities	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
ModelProblem	TokenNameIdentifier
.	TokenNameDOT
Severity	TokenNameIdentifier
.	TokenNameDOT
FATAL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
ModelProblem	TokenNameIdentifier
>	TokenNameGREATER
getProblems	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
problems	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSource	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
source	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
source	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
sourceModel	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSource	TokenNameIdentifier
(	TokenNameLPAREN
Model	TokenNameIdentifier
source	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
sourceModel	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
source	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
rootModel	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
rootModel	TokenNameIdentifier
=	TokenNameEQUAL
source	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
source	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
sourceModel	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
source	TokenNameIdentifier
=	TokenNameEQUAL
ModelProblemUtils	TokenNameIdentifier
.	TokenNameDOT
toPath	TokenNameIdentifier
(	TokenNameLPAREN
sourceModel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
source	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
getModelId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ModelProblemUtils	TokenNameIdentifier
.	TokenNameDOT
toId	TokenNameIdentifier
(	TokenNameLPAREN
sourceModel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setRootModel	TokenNameIdentifier
(	TokenNameLPAREN
Model	TokenNameIdentifier
rootModel	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
rootModel	TokenNameIdentifier
=	TokenNameEQUAL
rootModel	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Model	TokenNameIdentifier
getRootModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
rootModel	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getRootModelId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ModelProblemUtils	TokenNameIdentifier
.	TokenNameDOT
toId	TokenNameIdentifier
(	TokenNameLPAREN
rootModel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
ModelProblem	TokenNameIdentifier
problem	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
problems	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
problem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
severities	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
problem	TokenNameIdentifier
.	TokenNameDOT
getSeverity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addAll	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
ModelProblem	TokenNameIdentifier
>	TokenNameGREATER
problems	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
problems	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
problems	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
ModelProblem	TokenNameIdentifier
problem	TokenNameIdentifier
:	TokenNameCOLON
problems	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
severities	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
problem	TokenNameIdentifier
.	TokenNameDOT
getSeverity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
int	TokenNameint
line	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
column	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
source	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
String	TokenNameIdentifier
modelId	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
location	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
line	TokenNameIdentifier
=	TokenNameEQUAL
location	TokenNameIdentifier
.	TokenNameDOT
getLineNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
column	TokenNameIdentifier
=	TokenNameEQUAL
location	TokenNameIdentifier
.	TokenNameDOT
getColumnNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
location	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
modelId	TokenNameIdentifier
=	TokenNameEQUAL
location	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getModelId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
=	TokenNameEQUAL
location	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
modelId	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
modelId	TokenNameIdentifier
=	TokenNameEQUAL
getModelId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
source	TokenNameIdentifier
=	TokenNameEQUAL
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
line	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
column	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
cause	TokenNameIdentifier
instanceof	TokenNameinstanceof
ModelParseException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ModelParseException	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ModelParseException	TokenNameIdentifier
)	TokenNameRPAREN
cause	TokenNameIdentifier
;	TokenNameSEMICOLON
line	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getLineNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
column	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getColumnNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ModelProblem	TokenNameIdentifier
problem	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultModelProblem	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
severity	TokenNameIdentifier
,	TokenNameCOMMA
source	TokenNameIdentifier
,	TokenNameCOMMA
line	TokenNameIdentifier
,	TokenNameCOMMA
column	TokenNameIdentifier
,	TokenNameCOMMA
modelId	TokenNameIdentifier
,	TokenNameCOMMA
cause	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
add	TokenNameIdentifier
(	TokenNameLPAREN
problem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ModelBuildingException	TokenNameIdentifier
newModelBuildingException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ModelBuildingResult	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
result	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
getModelIds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
DefaultModelBuildingResult	TokenNameIdentifier
tmp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultModelBuildingResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setEffectiveModel	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
getEffectiveModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setProblems	TokenNameIdentifier
(	TokenNameLPAREN
getProblems	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setActiveExternalProfiles	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
getActiveExternalProfiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
id	TokenNameIdentifier
=	TokenNameEQUAL
getRootModelId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
addModelId	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
setRawModel	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
,	TokenNameCOMMA
getRootModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
tmp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
ModelBuildingException	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE