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
optional	TokenNameIdentifier
.	TokenNameDOT
vss	TokenNameIdentifier
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
Path	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
MSVSSCHECKOUT	TokenNameIdentifier
extends	TokenNameextends
MSVSS	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
Commandline	TokenNameIdentifier
buildCmdLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Commandline	TokenNameIdentifier
commandLine	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Commandline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
getVsspath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
"vsspath attribute must be set!"	TokenNameStringLiteral
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
commandLine	TokenNameIdentifier
.	TokenNameDOT
setExecutable	TokenNameIdentifier
(	TokenNameLPAREN
getSSCommand	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandLine	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
COMMAND_CHECKOUT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandLine	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
getVsspath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandLine	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
getLocalpath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandLine	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
getAutoresponse	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandLine	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
getRecursive	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandLine	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
getVersionDateLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandLine	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
getLogin	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandLine	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
getFileTimeStamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandLine	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
getWritableFiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
commandLine	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
getGetLocalCopy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
commandLine	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLocalpath	TokenNameIdentifier
(	TokenNameLPAREN
Path	TokenNameIdentifier
localPath	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setInternalLocalPath	TokenNameIdentifier
(	TokenNameLPAREN
localPath	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setRecursive	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
recursive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setInternalRecursive	TokenNameIdentifier
(	TokenNameLPAREN
recursive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setVersion	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setInternalVersion	TokenNameIdentifier
(	TokenNameLPAREN
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDate	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
date	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setInternalDate	TokenNameIdentifier
(	TokenNameLPAREN
date	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLabel	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
label	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setInternalLabel	TokenNameIdentifier
(	TokenNameLPAREN
label	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setAutoresponse	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
response	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setInternalAutoResponse	TokenNameIdentifier
(	TokenNameLPAREN
response	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setFileTimeStamp	TokenNameIdentifier
(	TokenNameLPAREN
CurrentModUpdated	TokenNameIdentifier
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setInternalFileTimeStamp	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setWritableFiles	TokenNameIdentifier
(	TokenNameLPAREN
WritableFiles	TokenNameIdentifier
files	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setInternalWritableFiles	TokenNameIdentifier
(	TokenNameLPAREN
files	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setGetLocalCopy	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
get	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setInternalGetLocalCopy	TokenNameIdentifier
(	TokenNameLPAREN
get	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE