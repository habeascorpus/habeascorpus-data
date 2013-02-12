package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
UnknownHostException	TokenNameIdentifier
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
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
LifecycleExecutionException	TokenNameIdentifier
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
ModelProblemUtils	TokenNameIdentifier
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
AbstractMojoExecutionException	TokenNameIdentifier
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
MojoExecutionException	TokenNameIdentifier
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
MojoFailureException	TokenNameIdentifier
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
PluginExecutionException	TokenNameIdentifier
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
ProjectBuildingException	TokenNameIdentifier
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
ProjectBuildingResult	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
StringUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
ExceptionHandler	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
DefaultExceptionHandler	TokenNameIdentifier
implements	TokenNameimplements
ExceptionHandler	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
ExceptionSummary	TokenNameIdentifier
handleException	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
handle	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
,	TokenNameCOMMA
exception	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ExceptionSummary	TokenNameIdentifier
handle	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
reference	TokenNameIdentifier
=	TokenNameEQUAL
getReference	TokenNameIdentifier
(	TokenNameLPAREN
exception	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
ExceptionSummary	TokenNameIdentifier
>	TokenNameGREATER
children	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
ProjectBuildingException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
ProjectBuildingResult	TokenNameIdentifier
>	TokenNameGREATER
results	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
ProjectBuildingException	TokenNameIdentifier
)	TokenNameRPAREN
exception	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
children	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ExceptionSummary	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
ProjectBuildingResult	TokenNameIdentifier
result	TokenNameIdentifier
:	TokenNameCOLON
results	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ExceptionSummary	TokenNameIdentifier
child	TokenNameIdentifier
=	TokenNameEQUAL
handle	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
child	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
children	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
child	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
message	TokenNameIdentifier
=	TokenNameEQUAL
"The build could not read "	TokenNameStringLiteral
+	TokenNamePLUS
children	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" project"	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
children	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
"s"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
message	TokenNameIdentifier
=	TokenNameEQUAL
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
exception	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
ExceptionSummary	TokenNameIdentifier
(	TokenNameLPAREN
exception	TokenNameIdentifier
,	TokenNameCOMMA
message	TokenNameIdentifier
,	TokenNameCOMMA
reference	TokenNameIdentifier
,	TokenNameCOMMA
children	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ExceptionSummary	TokenNameIdentifier
handle	TokenNameIdentifier
(	TokenNameLPAREN
ProjectBuildingResult	TokenNameIdentifier
result	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
ExceptionSummary	TokenNameIdentifier
>	TokenNameGREATER
children	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
ExceptionSummary	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
ModelProblem	TokenNameIdentifier
problem	TokenNameIdentifier
:	TokenNameCOLON
result	TokenNameIdentifier
.	TokenNameDOT
getProblems	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ExceptionSummary	TokenNameIdentifier
child	TokenNameIdentifier
=	TokenNameEQUAL
handle	TokenNameIdentifier
(	TokenNameLPAREN
problem	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
getProjectId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
child	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
children	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
child	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
children	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
message	TokenNameIdentifier
=	TokenNameEQUAL
" The project "	TokenNameStringLiteral
+	TokenNamePLUS
result	TokenNameIdentifier
.	TokenNameDOT
getProjectId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" ("	TokenNameStringLiteral
+	TokenNamePLUS
result	TokenNameIdentifier
.	TokenNameDOT
getPomFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
") has "	TokenNameStringLiteral
+	TokenNamePLUS
children	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" error"	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
children	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
"s"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
ExceptionSummary	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
message	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
children	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ExceptionSummary	TokenNameIdentifier
handle	TokenNameIdentifier
(	TokenNameLPAREN
ModelProblem	TokenNameIdentifier
problem	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
projectId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ModelProblem	TokenNameIdentifier
.	TokenNameDOT
Severity	TokenNameIdentifier
.	TokenNameDOT
ERROR	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
problem	TokenNameIdentifier
.	TokenNameDOT
getSeverity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
message	TokenNameIdentifier
=	TokenNameEQUAL
problem	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
location	TokenNameIdentifier
=	TokenNameEQUAL
ModelProblemUtils	TokenNameIdentifier
.	TokenNameDOT
formatLocation	TokenNameIdentifier
(	TokenNameLPAREN
problem	TokenNameIdentifier
,	TokenNameCOMMA
projectId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
StringUtils	TokenNameIdentifier
.	TokenNameDOT
isNotEmpty	TokenNameIdentifier
(	TokenNameLPAREN
location	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
message	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" @ "	TokenNameStringLiteral
+	TokenNamePLUS
location	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
handle	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
problem	TokenNameIdentifier
.	TokenNameDOT
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
getReference	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
reference	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
MojoExecutionException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reference	TokenNameIdentifier
=	TokenNameEQUAL
MojoExecutionException	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
MojoFailureException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reference	TokenNameIdentifier
=	TokenNameEQUAL
MojoFailureException	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
LinkageError	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reference	TokenNameIdentifier
=	TokenNameEQUAL
LinkageError	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
PluginExecutionException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reference	TokenNameIdentifier
=	TokenNameEQUAL
getReference	TokenNameIdentifier
(	TokenNameLPAREN
exception	TokenNameIdentifier
.	TokenNameDOT
getCause	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
StringUtils	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
reference	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
reference	TokenNameIdentifier
=	TokenNameEQUAL
exception	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
LifecycleExecutionException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reference	TokenNameIdentifier
=	TokenNameEQUAL
getReference	TokenNameIdentifier
(	TokenNameLPAREN
exception	TokenNameIdentifier
.	TokenNameDOT
getCause	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
isNoteworthyException	TokenNameIdentifier
(	TokenNameLPAREN
exception	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
reference	TokenNameIdentifier
=	TokenNameEQUAL
exception	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
StringUtils	TokenNameIdentifier
.	TokenNameDOT
isNotEmpty	TokenNameIdentifier
(	TokenNameLPAREN
reference	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
reference	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"http:"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
reference	TokenNameIdentifier
=	TokenNameEQUAL
"http://cwiki.apache.org/confluence/display/MAVEN/"	TokenNameStringLiteral
+	TokenNamePLUS
reference	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
reference	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
isNoteworthyException	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
Error	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
RuntimeException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"java"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
fullMessage	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
message	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
message	TokenNameIdentifier
:	TokenNameCOLON
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
t	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
.	TokenNameDOT
getCause	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
exceptionMessage	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
t	TokenNameIdentifier
instanceof	TokenNameinstanceof
AbstractMojoExecutionException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
longMessage	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
AbstractMojoExecutionException	TokenNameIdentifier
)	TokenNameRPAREN
t	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getLongMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
StringUtils	TokenNameIdentifier
.	TokenNameDOT
isNotEmpty	TokenNameIdentifier
(	TokenNameLPAREN
longMessage	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
StringUtils	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
exceptionMessage	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
longMessage	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
exceptionMessage	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
exceptionMessage	TokenNameIdentifier
=	TokenNameEQUAL
longMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
exceptionMessage	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
longMessage	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
exceptionMessage	TokenNameIdentifier
=	TokenNameEQUAL
join	TokenNameIdentifier
(	TokenNameLPAREN
exceptionMessage	TokenNameIdentifier
,	TokenNameCOMMA
'\n'	TokenNameCharacterLiteral
+	TokenNamePLUS
longMessage	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
StringUtils	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
exceptionMessage	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
exceptionMessage	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
t	TokenNameIdentifier
instanceof	TokenNameinstanceof
UnknownHostException	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
fullMessage	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
"host"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fullMessage	TokenNameIdentifier
=	TokenNameEQUAL
join	TokenNameIdentifier
(	TokenNameLPAREN
fullMessage	TokenNameIdentifier
,	TokenNameCOMMA
"Unknown host "	TokenNameStringLiteral
+	TokenNamePLUS
exceptionMessage	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
fullMessage	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
exceptionMessage	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fullMessage	TokenNameIdentifier
=	TokenNameEQUAL
join	TokenNameIdentifier
(	TokenNameLPAREN
fullMessage	TokenNameIdentifier
,	TokenNameCOMMA
exceptionMessage	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
fullMessage	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
join	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message1	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
message2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
message	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
StringUtils	TokenNameIdentifier
.	TokenNameDOT
isNotEmpty	TokenNameIdentifier
(	TokenNameLPAREN
message1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
message	TokenNameIdentifier
=	TokenNameEQUAL
message1	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
StringUtils	TokenNameIdentifier
.	TokenNameDOT
isNotEmpty	TokenNameIdentifier
(	TokenNameLPAREN
message2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
StringUtils	TokenNameIdentifier
.	TokenNameDOT
isNotEmpty	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
message	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
message	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"!"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
message	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
":"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
message	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" "	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
message	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
": "	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
message	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
message2	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
message	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE