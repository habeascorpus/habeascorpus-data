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
BufferedReader	TokenNameIdentifier
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
FileWriter	TokenNameIdentifier
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
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStreamReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PrintWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
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
MagicNames	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
Exec	TokenNameIdentifier
extends	TokenNameextends
Task	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
os	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
out	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
File	TokenNameIdentifier
dir	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
command	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
PrintWriter	TokenNameIdentifier
fos	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
failOnError	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
Exec	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"As of Ant 1.2 released in October 2000, "	TokenNameStringLiteral
+	TokenNamePLUS
"the Exec class"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"is considered to be dead code by the Ant "	TokenNameStringLiteral
+	TokenNamePLUS
"developers and is unmaintained."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Don't use it!"	TokenNameStringLiteral
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
run	TokenNameIdentifier
(	TokenNameLPAREN
command	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
run	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
command	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
err	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
myos	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"os.name"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
"Myos = "	TokenNameStringLiteral
+	TokenNamePLUS
myos	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
os	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
os	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
myos	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"Not found in "	TokenNameStringLiteral
+	TokenNamePLUS
os	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
dir	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
dir	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getBaseDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
myos	TokenNameIdentifier
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
.	TokenNameDOT
ENGLISH	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"windows"	TokenNameStringLiteral
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
dir	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
myos	TokenNameIdentifier
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
.	TokenNameDOT
ENGLISH	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"nt"	TokenNameStringLiteral
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
command	TokenNameIdentifier
=	TokenNameEQUAL
"cmd /c cd "	TokenNameStringLiteral
+	TokenNamePLUS
dir	TokenNameIdentifier
+	TokenNamePLUS
" && "	TokenNameStringLiteral
+	TokenNamePLUS
command	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
String	TokenNameIdentifier
ant	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
MagicNames	TokenNameIdentifier
.	TokenNameDOT
ANT_HOME	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ant	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Property '"	TokenNameStringLiteral
+	TokenNamePLUS
MagicNames	TokenNameIdentifier
.	TokenNameDOT
ANT_HOME	TokenNameIdentifier
+	TokenNamePLUS
"' not "	TokenNameStringLiteral
+	TokenNamePLUS
"found"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
antRun	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
ant	TokenNameIdentifier
+	TokenNamePLUS
"/bin/antRun.bat"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
command	TokenNameIdentifier
=	TokenNameEQUAL
antRun	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
dir	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
command	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
String	TokenNameIdentifier
ant	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
MagicNames	TokenNameIdentifier
.	TokenNameDOT
ANT_HOME	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ant	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Property '"	TokenNameStringLiteral
+	TokenNamePLUS
MagicNames	TokenNameIdentifier
.	TokenNameDOT
ANT_HOME	TokenNameIdentifier
+	TokenNamePLUS
"' not found"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
antRun	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
ant	TokenNameIdentifier
+	TokenNamePLUS
"/bin/antRun"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
command	TokenNameIdentifier
=	TokenNameEQUAL
antRun	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
dir	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
command	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
command	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Process	TokenNameIdentifier
proc	TokenNameIdentifier
=	TokenNameEQUAL
Runtime	TokenNameIdentifier
.	TokenNameDOT
getRuntime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
exec	TokenNameIdentifier
(	TokenNameLPAREN
command	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
out	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
fos	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrintWriter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileWriter	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
"Output redirected to "	TokenNameStringLiteral
+	TokenNamePLUS
out	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
StreamPumper	TokenNameIdentifier
inputPumper	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StreamPumper	TokenNameIdentifier
(	TokenNameLPAREN
proc	TokenNameIdentifier
.	TokenNameDOT
getInputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_INFO	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StreamPumper	TokenNameIdentifier
errorPumper	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StreamPumper	TokenNameIdentifier
(	TokenNameLPAREN
proc	TokenNameIdentifier
.	TokenNameDOT
getErrorStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_WARN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
inputPumper	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
errorPumper	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
proc	TokenNameIdentifier
.	TokenNameDOT
waitFor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
inputPumper	TokenNameIdentifier
.	TokenNameDOT
join	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
errorPumper	TokenNameIdentifier
.	TokenNameDOT
join	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
proc	TokenNameIdentifier
.	TokenNameDOT
destroy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
err	TokenNameIdentifier
=	TokenNameEQUAL
proc	TokenNameIdentifier
.	TokenNameDOT
exitValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
err	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
failOnError	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Exec returned: "	TokenNameStringLiteral
+	TokenNamePLUS
err	TokenNameIdentifier
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"Result: "	TokenNameStringLiteral
+	TokenNamePLUS
err	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_ERR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Error exec: "	TokenNameStringLiteral
+	TokenNamePLUS
command	TokenNameIdentifier
,	TokenNameCOMMA
ioe	TokenNameIdentifier
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
return	TokenNamereturn
err	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDir	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
d	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
dir	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOs	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
os	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
os	TokenNameIdentifier
=	TokenNameEQUAL
os	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setCommand	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
command	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
command	TokenNameIdentifier
=	TokenNameEQUAL
command	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOutput	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
out	TokenNameIdentifier
=	TokenNameEQUAL
out	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setFailonerror	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
fail	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
failOnError	TokenNameIdentifier
=	TokenNameEQUAL
fail	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
outputLog	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
line	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
messageLevel	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fos	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
,	TokenNameCOMMA
messageLevel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
fos	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
logFlush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fos	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
fos	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
class	TokenNameclass
StreamPumper	TokenNameIdentifier
extends	TokenNameextends
Thread	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
BufferedReader	TokenNameIdentifier
din	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
messageLevel	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
endOfStream	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
SLEEP_TIME	TokenNameIdentifier
=	TokenNameEQUAL
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
StreamPumper	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
messageLevel	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
din	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedReader	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
messageLevel	TokenNameIdentifier
=	TokenNameEQUAL
messageLevel	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
pumpStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
endOfStream	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
line	TokenNameIdentifier
=	TokenNameEQUAL
din	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
line	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
outputLog	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
,	TokenNameCOMMA
messageLevel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
endOfStream	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
!	TokenNameNOT
endOfStream	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pumpStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sleep	TokenNameIdentifier
(	TokenNameLPAREN
SLEEP_TIME	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
ie	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
din	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE