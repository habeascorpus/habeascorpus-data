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
javacc	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Enumeration	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
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
Task	TokenNameIdentifier
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
Execute	TokenNameIdentifier
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
LogStreamHandler	TokenNameIdentifier
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
CommandlineJava	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
JavaEnvUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JJDoc	TokenNameIdentifier
extends	TokenNameextends
Task	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
OUTPUT_FILE	TokenNameIdentifier
=	TokenNameEQUAL
"OUTPUT_FILE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
TEXT	TokenNameIdentifier
=	TokenNameEQUAL
"TEXT"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ONE_TABLE	TokenNameIdentifier
=	TokenNameEQUAL
"ONE_TABLE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Hashtable	TokenNameIdentifier
optionalAttrs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
outputFile	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
plainText	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_SUFFIX_HTML	TokenNameIdentifier
=	TokenNameEQUAL
".html"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_SUFFIX_TEXT	TokenNameIdentifier
=	TokenNameEQUAL
".txt"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
File	TokenNameIdentifier
targetFile	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
File	TokenNameIdentifier
javaccHome	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
CommandlineJava	TokenNameIdentifier
cmdl	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CommandlineJava	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
maxMemory	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setText	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
plainText	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
optionalAttrs	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
TEXT	TokenNameIdentifier
,	TokenNameCOMMA
plainText	TokenNameIdentifier
?	TokenNameQUESTION
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
:	TokenNameCOLON
Boolean	TokenNameIdentifier
.	TokenNameDOT
FALSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
plainText	TokenNameIdentifier
=	TokenNameEQUAL
plainText	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOnetable	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
oneTable	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
optionalAttrs	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ONE_TABLE	TokenNameIdentifier
,	TokenNameCOMMA
oneTable	TokenNameIdentifier
?	TokenNameQUESTION
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
:	TokenNameCOLON
Boolean	TokenNameIdentifier
.	TokenNameDOT
FALSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOutputfile	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
outputFile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
outputFile	TokenNameIdentifier
=	TokenNameEQUAL
outputFile	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setTarget	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
targetFile	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setJavacchome	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
javaccHome	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
javaccHome	TokenNameIdentifier
=	TokenNameEQUAL
javaccHome	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setMaxmemory	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
max	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
maxMemory	TokenNameIdentifier
=	TokenNameEQUAL
max	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
JJDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cmdl	TokenNameIdentifier
.	TokenNameDOT
setVm	TokenNameIdentifier
(	TokenNameLPAREN
JavaEnvUtils	TokenNameIdentifier
.	TokenNameDOT
getJreExecutable	TokenNameIdentifier
(	TokenNameLPAREN
"java"	TokenNameStringLiteral
)	TokenNameRPAREN
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
Enumeration	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
optionalAttrs	TokenNameIdentifier
.	TokenNameDOT
keys	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
optionalAttrs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cmdl	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-"	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
value	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
targetFile	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
!	TokenNameNOT
targetFile	TokenNameIdentifier
.	TokenNameDOT
isFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid target: "	TokenNameStringLiteral
+	TokenNamePLUS
targetFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
outputFile	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
cmdl	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-"	TokenNameStringLiteral
+	TokenNamePLUS
OUTPUT_FILE	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
outputFile	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'/'	TokenNameCharacterLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
File	TokenNameIdentifier
javaFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
createOutputFileName	TokenNameIdentifier
(	TokenNameLPAREN
targetFile	TokenNameIdentifier
,	TokenNameCOMMA
outputFile	TokenNameIdentifier
,	TokenNameCOMMA
plainText	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
javaFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
targetFile	TokenNameIdentifier
.	TokenNameDOT
lastModified	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
javaFile	TokenNameIdentifier
.	TokenNameDOT
lastModified	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"Target is already built - skipping ("	TokenNameStringLiteral
+	TokenNamePLUS
targetFile	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
cmdl	TokenNameIdentifier
.	TokenNameDOT
createArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
targetFile	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Path	TokenNameIdentifier
classpath	TokenNameIdentifier
=	TokenNameEQUAL
cmdl	TokenNameIdentifier
.	TokenNameDOT
createClasspath	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
File	TokenNameIdentifier
javaccJar	TokenNameIdentifier
=	TokenNameEQUAL
JavaCC	TokenNameIdentifier
.	TokenNameDOT
getArchiveFile	TokenNameIdentifier
(	TokenNameLPAREN
javaccHome	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
classpath	TokenNameIdentifier
.	TokenNameDOT
createPathElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setPath	TokenNameIdentifier
(	TokenNameLPAREN
javaccJar	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
classpath	TokenNameIdentifier
.	TokenNameDOT
addJavaRuntime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cmdl	TokenNameIdentifier
.	TokenNameDOT
setClassname	TokenNameIdentifier
(	TokenNameLPAREN
JavaCC	TokenNameIdentifier
.	TokenNameDOT
getMainClass	TokenNameIdentifier
(	TokenNameLPAREN
classpath	TokenNameIdentifier
,	TokenNameCOMMA
JavaCC	TokenNameIdentifier
.	TokenNameDOT
TASKDEF_TYPE_JJDOC	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cmdl	TokenNameIdentifier
.	TokenNameDOT
setMaxmemory	TokenNameIdentifier
(	TokenNameLPAREN
maxMemory	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Commandline	TokenNameIdentifier
.	TokenNameDOT
Argument	TokenNameIdentifier
arg	TokenNameIdentifier
=	TokenNameEQUAL
cmdl	TokenNameIdentifier
.	TokenNameDOT
createVmArgument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
arg	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Dinstall.root="	TokenNameStringLiteral
+	TokenNamePLUS
javaccHome	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Execute	TokenNameIdentifier
process	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Execute	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
LogStreamHandler	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_INFO	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_INFO	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
cmdl	TokenNameIdentifier
.	TokenNameDOT
describeCommand	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
process	TokenNameIdentifier
.	TokenNameDOT
setCommandline	TokenNameIdentifier
(	TokenNameLPAREN
cmdl	TokenNameIdentifier
.	TokenNameDOT
getCommandline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
process	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"JJDoc failed."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
"Failed to launch JJDoc"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
createOutputFileName	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
destFile	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
optionalOutputFile	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
plain	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
suffix	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_SUFFIX_HTML	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
javaccFile	TokenNameIdentifier
=	TokenNameEQUAL
destFile	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'/'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
plain	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
suffix	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_SUFFIX_TEXT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
optionalOutputFile	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
optionalOutputFile	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
filePos	TokenNameIdentifier
=	TokenNameEQUAL
javaccFile	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
"/"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
filePos	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
javaccFile	TokenNameIdentifier
=	TokenNameEQUAL
javaccFile	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
filePos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
suffixPos	TokenNameIdentifier
=	TokenNameEQUAL
javaccFile	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
suffixPos	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
optionalOutputFile	TokenNameIdentifier
=	TokenNameEQUAL
javaccFile	TokenNameIdentifier
+	TokenNamePLUS
suffix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
String	TokenNameIdentifier
currentSuffix	TokenNameIdentifier
=	TokenNameEQUAL
javaccFile	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
suffixPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
currentSuffix	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
suffix	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
optionalOutputFile	TokenNameIdentifier
=	TokenNameEQUAL
javaccFile	TokenNameIdentifier
+	TokenNamePLUS
suffix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
optionalOutputFile	TokenNameIdentifier
=	TokenNameEQUAL
javaccFile	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
suffixPos	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
suffix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
optionalOutputFile	TokenNameIdentifier
=	TokenNameEQUAL
optionalOutputFile	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'/'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getBaseDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"/"	TokenNameStringLiteral
+	TokenNamePLUS
optionalOutputFile	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'/'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
