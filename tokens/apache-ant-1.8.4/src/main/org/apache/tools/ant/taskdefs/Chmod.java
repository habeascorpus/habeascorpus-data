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
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
types	TokenNameIdentifier
.	TokenNameDOT
FileSet	TokenNameIdentifier
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
PatternSet	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Chmod	TokenNameIdentifier
extends	TokenNameextends
ExecuteOn	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
FileSet	TokenNameIdentifier
defaultSet	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FileSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
defaultSetDefined	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
havePerm	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
Chmod	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setExecutable	TokenNameIdentifier
(	TokenNameLPAREN
"chmod"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
setParallel	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
setSkipEmptyFilesets	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setProject	TokenNameIdentifier
(	TokenNameLPAREN
Project	TokenNameIdentifier
project	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
defaultSet	TokenNameIdentifier
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setFile	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FileSet	TokenNameIdentifier
fs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FileSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
.	TokenNameDOT
setFile	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addFileset	TokenNameIdentifier
(	TokenNameLPAREN
fs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDir	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
defaultSet	TokenNameIdentifier
.	TokenNameDOT
setDir	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPerm	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
perm	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
createArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
perm	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
havePerm	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PatternSet	TokenNameIdentifier
.	TokenNameDOT
NameEntry	TokenNameIdentifier
createInclude	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
defaultSetDefined	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
defaultSet	TokenNameIdentifier
.	TokenNameDOT
createInclude	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PatternSet	TokenNameIdentifier
.	TokenNameDOT
NameEntry	TokenNameIdentifier
createExclude	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
defaultSetDefined	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
defaultSet	TokenNameIdentifier
.	TokenNameDOT
createExclude	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PatternSet	TokenNameIdentifier
createPatternSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
defaultSetDefined	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
defaultSet	TokenNameIdentifier
.	TokenNameDOT
createPatternSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setIncludes	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
includes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
defaultSetDefined	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
defaultSet	TokenNameIdentifier
.	TokenNameDOT
setIncludes	TokenNameIdentifier
(	TokenNameLPAREN
includes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setExcludes	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
excludes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
defaultSetDefined	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
defaultSet	TokenNameIdentifier
.	TokenNameDOT
setExcludes	TokenNameIdentifier
(	TokenNameLPAREN
excludes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDefaultexcludes	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
useDefaultExcludes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
defaultSetDefined	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
defaultSet	TokenNameIdentifier
.	TokenNameDOT
setDefaultexcludes	TokenNameIdentifier
(	TokenNameLPAREN
useDefaultExcludes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
checkConfiguration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
havePerm	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Required attribute perm not set in chmod"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
defaultSetDefined	TokenNameIdentifier
&&	TokenNameAND_AND
defaultSet	TokenNameIdentifier
.	TokenNameDOT
getDir	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
addFileset	TokenNameIdentifier
(	TokenNameLPAREN
defaultSet	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
super	TokenNamesuper
.	TokenNameDOT
checkConfiguration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
defaultSetDefined	TokenNameIdentifier
||	TokenNameOR_OR
defaultSet	TokenNameIdentifier
.	TokenNameDOT
getDir	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
defaultSetDefined	TokenNameIdentifier
&&	TokenNameAND_AND
defaultSet	TokenNameIdentifier
.	TokenNameDOT
getDir	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
filesets	TokenNameIdentifier
.	TokenNameDOT
removeElement	TokenNameIdentifier
(	TokenNameLPAREN
defaultSet	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
isValidOs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Execute	TokenNameIdentifier
execute	TokenNameIdentifier
=	TokenNameEQUAL
prepareExec	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Commandline	TokenNameIdentifier
cloned	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Commandline	TokenNameIdentifier
)	TokenNameRPAREN
cmdl	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cloned	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
defaultSet	TokenNameIdentifier
.	TokenNameDOT
getDir	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
execute	TokenNameIdentifier
.	TokenNameDOT
setCommandline	TokenNameIdentifier
(	TokenNameLPAREN
cloned	TokenNameIdentifier
.	TokenNameDOT
getCommandline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
runExecute	TokenNameIdentifier
(	TokenNameLPAREN
execute	TokenNameIdentifier
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
"Execute failed: "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
logFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setExecutable	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
getTaskType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" doesn't support the executable attribute"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setCommand	TokenNameIdentifier
(	TokenNameLPAREN
Commandline	TokenNameIdentifier
cmdl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
getTaskType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" doesn't support the command attribute"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSkipEmptyFilesets	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
skip	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
getTaskType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" doesn't support the skipemptyfileset attribute"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setAddsourcefile	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
getTaskType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" doesn't support the addsourcefile attribute"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
isValidOs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getOs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
getOsFamily	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
Os	TokenNameIdentifier
.	TokenNameDOT
isFamily	TokenNameIdentifier
(	TokenNameLPAREN
Os	TokenNameIdentifier
.	TokenNameDOT
FAMILY_UNIX	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
super	TokenNamesuper
.	TokenNameDOT
isValidOs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE