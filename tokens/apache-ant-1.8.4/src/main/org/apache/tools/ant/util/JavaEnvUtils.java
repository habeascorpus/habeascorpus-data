package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
FileWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
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
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
JavaEnvUtils	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
JavaEnvUtils	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
IS_DOS	TokenNameIdentifier
=	TokenNameEQUAL
Os	TokenNameIdentifier
.	TokenNameDOT
isFamily	TokenNameIdentifier
(	TokenNameLPAREN
"dos"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
IS_NETWARE	TokenNameIdentifier
=	TokenNameEQUAL
Os	TokenNameIdentifier
.	TokenNameDOT
isName	TokenNameIdentifier
(	TokenNameLPAREN
"netware"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
IS_AIX	TokenNameIdentifier
=	TokenNameEQUAL
Os	TokenNameIdentifier
.	TokenNameDOT
isName	TokenNameIdentifier
(	TokenNameLPAREN
"aix"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JAVA_HOME	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"java.home"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
FileUtils	TokenNameIdentifier
FILE_UTILS	TokenNameIdentifier
=	TokenNameEQUAL
FileUtils	TokenNameIdentifier
.	TokenNameDOT
getFileUtils	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
javaVersion	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
javaVersionNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JAVA_1_0	TokenNameIdentifier
=	TokenNameEQUAL
"1.0"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
VERSION_1_0	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JAVA_1_1	TokenNameIdentifier
=	TokenNameEQUAL
"1.1"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
VERSION_1_1	TokenNameIdentifier
=	TokenNameEQUAL
11	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JAVA_1_2	TokenNameIdentifier
=	TokenNameEQUAL
"1.2"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
VERSION_1_2	TokenNameIdentifier
=	TokenNameEQUAL
12	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JAVA_1_3	TokenNameIdentifier
=	TokenNameEQUAL
"1.3"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
VERSION_1_3	TokenNameIdentifier
=	TokenNameEQUAL
13	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JAVA_1_4	TokenNameIdentifier
=	TokenNameEQUAL
"1.4"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
VERSION_1_4	TokenNameIdentifier
=	TokenNameEQUAL
14	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JAVA_1_5	TokenNameIdentifier
=	TokenNameEQUAL
"1.5"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
VERSION_1_5	TokenNameIdentifier
=	TokenNameEQUAL
15	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JAVA_1_6	TokenNameIdentifier
=	TokenNameEQUAL
"1.6"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
VERSION_1_6	TokenNameIdentifier
=	TokenNameEQUAL
16	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JAVA_1_7	TokenNameIdentifier
=	TokenNameEQUAL
"1.7"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
VERSION_1_7	TokenNameIdentifier
=	TokenNameEQUAL
17	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JAVA_1_8	TokenNameIdentifier
=	TokenNameEQUAL
"1.8"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
VERSION_1_8	TokenNameIdentifier
=	TokenNameEQUAL
18	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
boolean	TokenNameboolean
kaffeDetected	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
boolean	TokenNameboolean
gijDetected	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
boolean	TokenNameboolean
harmonyDetected	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Vector	TokenNameIdentifier
jrePackages	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
javaVersion	TokenNameIdentifier
=	TokenNameEQUAL
JAVA_1_0	TokenNameIdentifier
;	TokenNameSEMICOLON
javaVersionNumber	TokenNameIdentifier
=	TokenNameEQUAL
VERSION_1_0	TokenNameIdentifier
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"java.lang.Void"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
javaVersion	TokenNameIdentifier
=	TokenNameEQUAL
JAVA_1_1	TokenNameIdentifier
;	TokenNameSEMICOLON
javaVersionNumber	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"java.lang.ThreadLocal"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
javaVersion	TokenNameIdentifier
=	TokenNameEQUAL
JAVA_1_2	TokenNameIdentifier
;	TokenNameSEMICOLON
javaVersionNumber	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"java.lang.StrictMath"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
javaVersion	TokenNameIdentifier
=	TokenNameEQUAL
JAVA_1_3	TokenNameIdentifier
;	TokenNameSEMICOLON
javaVersionNumber	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"java.lang.CharSequence"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
javaVersion	TokenNameIdentifier
=	TokenNameEQUAL
JAVA_1_4	TokenNameIdentifier
;	TokenNameSEMICOLON
javaVersionNumber	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"java.net.Proxy"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
javaVersion	TokenNameIdentifier
=	TokenNameEQUAL
JAVA_1_5	TokenNameIdentifier
;	TokenNameSEMICOLON
javaVersionNumber	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"java.net.CookieStore"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
javaVersion	TokenNameIdentifier
=	TokenNameEQUAL
JAVA_1_6	TokenNameIdentifier
;	TokenNameSEMICOLON
javaVersionNumber	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"java.nio.file.FileSystem"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
javaVersion	TokenNameIdentifier
=	TokenNameEQUAL
JAVA_1_7	TokenNameIdentifier
;	TokenNameSEMICOLON
javaVersionNumber	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"java.lang.reflect.Executable"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
javaVersion	TokenNameIdentifier
=	TokenNameEQUAL
JAVA_1_8	TokenNameIdentifier
;	TokenNameSEMICOLON
javaVersionNumber	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
kaffeDetected	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"kaffe.util.NotImplemented"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
kaffeDetected	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
gijDetected	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"gnu.gcj.Core"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
gijDetected	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
harmonyDetected	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.harmony.luni.util.Base64"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
harmonyDetected	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getJavaVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
javaVersion	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
getJavaVersionNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
javaVersionNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isJavaVersion	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
javaVersion	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isAtLeastJavaVersion	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
javaVersion	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
version	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isKaffe	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
kaffeDetected	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isGij	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
gijDetected	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
boolean	TokenNameboolean
isApacheHarmony	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
harmonyDetected	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getJreExecutable	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
command	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
IS_NETWARE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
command	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
File	TokenNameIdentifier
jExecutable	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
IS_AIX	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
jExecutable	TokenNameIdentifier
=	TokenNameEQUAL
findInDir	TokenNameIdentifier
(	TokenNameLPAREN
JAVA_HOME	TokenNameIdentifier
+	TokenNamePLUS
"/sh"	TokenNameStringLiteral
,	TokenNameCOMMA
command	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
jExecutable	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
jExecutable	TokenNameIdentifier
=	TokenNameEQUAL
findInDir	TokenNameIdentifier
(	TokenNameLPAREN
JAVA_HOME	TokenNameIdentifier
+	TokenNamePLUS
"/bin"	TokenNameStringLiteral
,	TokenNameCOMMA
command	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
jExecutable	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
jExecutable	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
addExtension	TokenNameIdentifier
(	TokenNameLPAREN
command	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getJdkExecutable	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
command	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
IS_NETWARE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
command	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
File	TokenNameIdentifier
jExecutable	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
IS_AIX	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
jExecutable	TokenNameIdentifier
=	TokenNameEQUAL
findInDir	TokenNameIdentifier
(	TokenNameLPAREN
JAVA_HOME	TokenNameIdentifier
+	TokenNamePLUS
"/../sh"	TokenNameStringLiteral
,	TokenNameCOMMA
command	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
jExecutable	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
jExecutable	TokenNameIdentifier
=	TokenNameEQUAL
findInDir	TokenNameIdentifier
(	TokenNameLPAREN
JAVA_HOME	TokenNameIdentifier
+	TokenNamePLUS
"/../bin"	TokenNameStringLiteral
,	TokenNameCOMMA
command	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
jExecutable	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
jExecutable	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
getJreExecutable	TokenNameIdentifier
(	TokenNameLPAREN
command	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
addExtension	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
command	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
command	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
IS_DOS	TokenNameIdentifier
?	TokenNameQUESTION
".exe"	TokenNameStringLiteral
:	TokenNameCOLON
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
File	TokenNameIdentifier
findInDir	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
dirName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
commandName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
normalize	TokenNameIdentifier
(	TokenNameLPAREN
dirName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
executable	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dir	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
addExtension	TokenNameIdentifier
(	TokenNameLPAREN
commandName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
executable	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executable	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
executable	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
buildJrePackages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
jrePackages	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
javaVersionNumber	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
VERSION_1_8	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
VERSION_1_7	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
VERSION_1_6	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
VERSION_1_5	TokenNameIdentifier
:	TokenNameCOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.org.apache"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
VERSION_1_4	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
javaVersionNumber	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
VERSION_1_4	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.crimson"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xalan"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xpath"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.ietf.jgss"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.w3c.dom"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.xml.sax"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
VERSION_1_3	TokenNameIdentifier
:	TokenNameCOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.omg"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.corba"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.jndi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.media"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.naming"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.org.omg"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.rmi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"sunw.io"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"sunw.util"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
VERSION_1_2	TokenNameIdentifier
:	TokenNameCOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.java"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.image"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
VERSION_1_1	TokenNameIdentifier
:	TokenNameCOLON
default	TokenNamedefault
:	TokenNameCOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"sun"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"java"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jrePackages	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"javax"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Vector	TokenNameIdentifier
getJrePackageTestCases	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Vector	TokenNameIdentifier
tests	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"java.lang.Object"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
javaVersionNumber	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
VERSION_1_8	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
VERSION_1_7	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
VERSION_1_6	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
VERSION_1_5	TokenNameIdentifier
:	TokenNameCOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
VERSION_1_4	TokenNameIdentifier
:	TokenNameCOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"sun.audio.AudioPlayer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
javaVersionNumber	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
VERSION_1_4	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.crimson.parser.ContentModel"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xalan.processor.ProcessorImport"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xml.utils.URI"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.xpath.XPathFactory"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.ietf.jgss.Oid"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.w3c.dom.Attr"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.xml.sax.XMLReader"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
VERSION_1_3	TokenNameIdentifier
:	TokenNameCOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"org.omg.CORBA.Any"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.corba.se.internal.corba.AnyImpl"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.jndi.ldap.LdapURL"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.media.sound.Printer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.naming.internal.VersionHelper"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.org.omg.CORBA.Initializer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"sunw.io.Serializable"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"sunw.util.EventListener"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
VERSION_1_2	TokenNameIdentifier
:	TokenNameCOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"javax.accessibility.Accessible"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"sun.misc.BASE64Encoder"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"com.sun.image.codec.jpeg.JPEGCodec"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
VERSION_1_1	TokenNameIdentifier
:	TokenNameCOLON
default	TokenNamedefault
:	TokenNameCOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"sun.reflect.SerializationConstructorAccessorImpl"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"sun.net.www.http.HttpClient"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tests	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
"sun.audio.AudioPlayer"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
tests	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Vector	TokenNameIdentifier
getJrePackages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
jrePackages	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
buildJrePackages	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
jrePackages	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
File	TokenNameIdentifier
createVmsJavaOptionFile	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
cmd	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
script	TokenNameIdentifier
=	TokenNameEQUAL
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
createTempFile	TokenNameIdentifier
(	TokenNameLPAREN
"ANT"	TokenNameStringLiteral
,	TokenNameCOMMA
".JAVA_OPTS"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedWriter	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
out	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedWriter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileWriter	TokenNameIdentifier
(	TokenNameLPAREN
script	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
cmd	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
cmd	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
newLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
script	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getJavaHome	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
JAVA_HOME	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE