package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
compilers	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
BuildException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Project	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
Commandline	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
condition	TokenNameIdentifier
.	TokenNameDOT
Os	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
JavaEnvUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
FileUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JavacExternal	TokenNameIdentifier
extends	TokenNameextends
DefaultCompilerAdapter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
boolean	TokenNameboolean
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
attributes	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
"Using external javac compiler"	TokenNameStringLiteral
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Commandline	TokenNameIdentifier
cmd	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Commandline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cmd	TokenNameIdentifier
.	TokenNameDOT
setExecutable	TokenNameIdentifier
(	TokenNameLPAREN
getJavac	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getJavacExecutable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
assumeJava11	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
assumeJava12	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
setupModernJavacCommandlineSwitches	TokenNameIdentifier
(	TokenNameLPAREN
cmd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
setupJavacCommandlineSwitches	TokenNameIdentifier
(	TokenNameLPAREN
cmd	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
firstFileName	TokenNameIdentifier
=	TokenNameEQUAL
assumeJava11	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
cmd	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logAndAddFilesToCompile	TokenNameIdentifier
(	TokenNameLPAREN
cmd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Os	TokenNameIdentifier
.	TokenNameDOT
isFamily	TokenNameIdentifier
(	TokenNameLPAREN
"openvms"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
execOnVMS	TokenNameIdentifier
(	TokenNameLPAREN
cmd	TokenNameIdentifier
,	TokenNameCOMMA
firstFileName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
executeExternalCompile	TokenNameIdentifier
(	TokenNameLPAREN
cmd	TokenNameIdentifier
.	TokenNameDOT
getCommandline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
firstFileName	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
execOnVMS	TokenNameIdentifier
(	TokenNameLPAREN
Commandline	TokenNameIdentifier
cmd	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
firstFileName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
vmsFile	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
vmsFile	TokenNameIdentifier
=	TokenNameEQUAL
JavaEnvUtils	TokenNameIdentifier
.	TokenNameDOT
createVmsJavaOptionFile	TokenNameIdentifier
(	TokenNameLPAREN
cmd	TokenNameIdentifier
.	TokenNameDOT
getArguments	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
commandLine	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
cmd	TokenNameIdentifier
.	TokenNameDOT
getExecutable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"-V"	TokenNameStringLiteral
,	TokenNameCOMMA
vmsFile	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
0	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
executeExternalCompile	TokenNameIdentifier
(	TokenNameLPAREN
commandLine	TokenNameIdentifier
,	TokenNameCOMMA
firstFileName	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Failed to create a temporary file for "-V" switch"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
vmsFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
