package	TokenNamepackage
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
optional	TokenNameIdentifier
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
Path	TokenNameIdentifier
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
Reference	TokenNameIdentifier
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
selectors	TokenNameIdentifier
.	TokenNameDOT
BaseSelector	TokenNameIdentifier
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
ScriptRunnerBase	TokenNameIdentifier
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
ScriptRunnerHelper	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ScriptSelector	TokenNameIdentifier
extends	TokenNameextends
BaseSelector	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
ScriptRunnerHelper	TokenNameIdentifier
helper	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ScriptRunnerHelper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
ScriptRunnerBase	TokenNameIdentifier
runner	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
File	TokenNameIdentifier
basedir	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
filename	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
File	TokenNameIdentifier
file	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
selected	TokenNameIdentifier
;	TokenNameSEMICOLON
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
helper	TokenNameIdentifier
.	TokenNameDOT
setProjectComponent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setManager	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
manager	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
helper	TokenNameIdentifier
.	TokenNameDOT
setManager	TokenNameIdentifier
(	TokenNameLPAREN
manager	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLanguage	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
language	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
helper	TokenNameIdentifier
.	TokenNameDOT
setLanguage	TokenNameIdentifier
(	TokenNameLPAREN
language	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
runner	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
runner	TokenNameIdentifier
=	TokenNameEQUAL
helper	TokenNameIdentifier
.	TokenNameDOT
getScriptRunner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
file	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
helper	TokenNameIdentifier
.	TokenNameDOT
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addText	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
text	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
helper	TokenNameIdentifier
.	TokenNameDOT
addText	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setClasspath	TokenNameIdentifier
(	TokenNameLPAREN
Path	TokenNameIdentifier
classpath	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
helper	TokenNameIdentifier
.	TokenNameDOT
setClasspath	TokenNameIdentifier
(	TokenNameLPAREN
classpath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Path	TokenNameIdentifier
createClasspath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
helper	TokenNameIdentifier
.	TokenNameDOT
createClasspath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setClasspathRef	TokenNameIdentifier
(	TokenNameLPAREN
Reference	TokenNameIdentifier
r	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
helper	TokenNameIdentifier
.	TokenNameDOT
setClasspathRef	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSetBeans	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
setBeans	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
helper	TokenNameIdentifier
.	TokenNameDOT
setSetBeans	TokenNameIdentifier
(	TokenNameLPAREN
setBeans	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
basedir	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
filename	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
file	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setSelected	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
file	TokenNameIdentifier
=	TokenNameEQUAL
file	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
basedir	TokenNameIdentifier
=	TokenNameEQUAL
basedir	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
filename	TokenNameIdentifier
=	TokenNameEQUAL
filename	TokenNameIdentifier
;	TokenNameSEMICOLON
runner	TokenNameIdentifier
.	TokenNameDOT
addBean	TokenNameIdentifier
(	TokenNameLPAREN
"basedir"	TokenNameStringLiteral
,	TokenNameCOMMA
basedir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
runner	TokenNameIdentifier
.	TokenNameDOT
addBean	TokenNameIdentifier
(	TokenNameLPAREN
"filename"	TokenNameStringLiteral
,	TokenNameCOMMA
filename	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
runner	TokenNameIdentifier
.	TokenNameDOT
addBean	TokenNameIdentifier
(	TokenNameLPAREN
"file"	TokenNameStringLiteral
,	TokenNameCOMMA
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
runner	TokenNameIdentifier
.	TokenNameDOT
executeScript	TokenNameIdentifier
(	TokenNameLPAREN
"ant_selector"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
File	TokenNameIdentifier
getBasedir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
basedir	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getFilename	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
filename	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
File	TokenNameIdentifier
getFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
file	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
selected	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSelected	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
selected	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
selected	TokenNameIdentifier
=	TokenNameEQUAL
selected	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
