package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
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
PrintStream	TokenNameIdentifier
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
AntClassLoaderTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Project	TokenNameIdentifier
p	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
AntClassLoader	TokenNameIdentifier
loader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
AntClassLoaderTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
p	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Project	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
configureProject	TokenNameIdentifier
(	TokenNameLPAREN
"src/etc/testcases/core/antclassloader.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"setup"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
loader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
loader	TokenNameIdentifier
.	TokenNameDOT
cleanup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"cleanup"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testJarWithManifestInDirWithSpace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
mainjarstring	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"main.jar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
extjarstring	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"ext.jar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Path	TokenNameIdentifier
myPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
myPath	TokenNameIdentifier
.	TokenNameDOT
setLocation	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
mainjarstring	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.sysclasspath"	TokenNameStringLiteral
,	TokenNameCOMMA
"ignore"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loader	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
myPath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
path	TokenNameIdentifier
=	TokenNameEQUAL
loader	TokenNameIdentifier
.	TokenNameDOT
getClasspath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
mainjarstring	TokenNameIdentifier
+	TokenNamePLUS
File	TokenNameIdentifier
.	TokenNameDOT
pathSeparator	TokenNameIdentifier
+	TokenNamePLUS
extjarstring	TokenNameIdentifier
,	TokenNameCOMMA
path	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testJarWithManifestInNonAsciiDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
mainjarstring	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"main.jar.nonascii"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
extjarstring	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"ext.jar.nonascii"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Path	TokenNameIdentifier
myPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
myPath	TokenNameIdentifier
.	TokenNameDOT
setLocation	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
mainjarstring	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.sysclasspath"	TokenNameStringLiteral
,	TokenNameCOMMA
"ignore"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loader	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
myPath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
path	TokenNameIdentifier
=	TokenNameEQUAL
loader	TokenNameIdentifier
.	TokenNameDOT
getClasspath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
mainjarstring	TokenNameIdentifier
+	TokenNamePLUS
File	TokenNameIdentifier
.	TokenNameDOT
pathSeparator	TokenNameIdentifier
+	TokenNamePLUS
extjarstring	TokenNameIdentifier
,	TokenNameCOMMA
path	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCleanup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
Path	TokenNameIdentifier
path	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
,	TokenNameCOMMA
"."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loader	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
createClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
path	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
loader	TokenNameIdentifier
.	TokenNameDOT
findClass	TokenNameIdentifier
(	TokenNameLPAREN
"fubar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Did not expect to find fubar class"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
loader	TokenNameIdentifier
.	TokenNameDOT
cleanup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
loader	TokenNameIdentifier
.	TokenNameDOT
findClass	TokenNameIdentifier
(	TokenNameLPAREN
"fubar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Did not expect to find fubar class"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NullPointerException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fail	TokenNameIdentifier
(	TokenNameLPAREN
"loader should not fail even if cleaned up"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
p	TokenNameIdentifier
.	TokenNameDOT
fireBuildFinished	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
loader	TokenNameIdentifier
.	TokenNameDOT
findClass	TokenNameIdentifier
(	TokenNameLPAREN
"fubar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Did not expect to find fubar class"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NullPointerException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fail	TokenNameIdentifier
(	TokenNameLPAREN
"loader should not fail even if project finished"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testGetPackage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"prepareGetPackageTest"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Path	TokenNameIdentifier
myPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
myPath	TokenNameIdentifier
.	TokenNameDOT
setLocation	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"tmp.dir"	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
"/test.jar"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.sysclasspath"	TokenNameStringLiteral
,	TokenNameCOMMA
"ignore"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loader	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
myPath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"should find class"	TokenNameStringLiteral
,	TokenNameCOMMA
loader	TokenNameIdentifier
.	TokenNameDOT
findClass	TokenNameIdentifier
(	TokenNameLPAREN
"org.example.Foo"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"should find package"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
GetPackageWrapper	TokenNameIdentifier
(	TokenNameLPAREN
loader	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getPackage	TokenNameIdentifier
(	TokenNameLPAREN
"org.example"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCodeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"prepareGetPackageTest"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Path	TokenNameIdentifier
myPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
myPath	TokenNameIdentifier
.	TokenNameDOT
setLocation	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"tmp.dir"	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
"/test.jar"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.sysclasspath"	TokenNameStringLiteral
,	TokenNameCOMMA
"ignore"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loader	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
myPath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
foo	TokenNameIdentifier
=	TokenNameEQUAL
loader	TokenNameIdentifier
.	TokenNameDOT
findClass	TokenNameIdentifier
(	TokenNameLPAREN
"org.example.Foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
codeSourceLocation	TokenNameIdentifier
=	TokenNameEQUAL
foo	TokenNameIdentifier
.	TokenNameDOT
getProtectionDomain	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getCodeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
codeSourceLocation	TokenNameIdentifier
+	TokenNamePLUS
" should point to test.jar"	TokenNameStringLiteral
,	TokenNameCOMMA
codeSourceLocation	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"test.jar"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSignedJar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"signTestJar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
jar	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"tmp.dir"	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
"/test.jar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Path	TokenNameIdentifier
myPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
myPath	TokenNameIdentifier
.	TokenNameDOT
setLocation	TokenNameIdentifier
(	TokenNameLPAREN
jar	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.sysclasspath"	TokenNameStringLiteral
,	TokenNameCOMMA
"ignore"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loader	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
myPath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
foo	TokenNameIdentifier
=	TokenNameEQUAL
loader	TokenNameIdentifier
.	TokenNameDOT
findClass	TokenNameIdentifier
(	TokenNameLPAREN
"org.example.Foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"should find class"	TokenNameStringLiteral
,	TokenNameCOMMA
foo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"should have certificates"	TokenNameStringLiteral
,	TokenNameCOMMA
foo	TokenNameIdentifier
.	TokenNameDOT
getProtectionDomain	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getCodeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getCertificates	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"should be signed"	TokenNameStringLiteral
,	TokenNameCOMMA
foo	TokenNameIdentifier
.	TokenNameDOT
getSigners	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testInvalidZipException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"createNonJar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
jar	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"tmp.dir"	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
"/foo.jar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Path	TokenNameIdentifier
myPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
myPath	TokenNameIdentifier
.	TokenNameDOT
setLocation	TokenNameIdentifier
(	TokenNameLPAREN
jar	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.sysclasspath"	TokenNameStringLiteral
,	TokenNameCOMMA
"ignore"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loader	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
myPath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrintStream	TokenNameIdentifier
sysErr	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
errBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrintStream	TokenNameIdentifier
err	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrintStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
BuildFileTest	TokenNameIdentifier
.	TokenNameDOT
AntOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
errBuffer	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
setErr	TokenNameIdentifier
(	TokenNameLPAREN
err	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loader	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
"foo.txt"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
log	TokenNameIdentifier
=	TokenNameEQUAL
getLog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
startMessage	TokenNameIdentifier
=	TokenNameEQUAL
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"Unable to obtain resource from "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
startMessage	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"foo.jar"	TokenNameStringLiteral
,	TokenNameCOMMA
startMessage	TokenNameIdentifier
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
=	TokenNameEQUAL
errBuffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
startMessage	TokenNameIdentifier
=	TokenNameEQUAL
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"Unable to obtain resource from "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
startMessage	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"foo.jar"	TokenNameStringLiteral
,	TokenNameCOMMA
startMessage	TokenNameIdentifier
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
setErr	TokenNameIdentifier
(	TokenNameLPAREN
sysErr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
GetPackageWrapper	TokenNameIdentifier
extends	TokenNameextends
ClassLoader	TokenNameIdentifier
{	TokenNameLBRACE
GetPackageWrapper	TokenNameIdentifier
(	TokenNameLPAREN
ClassLoader	TokenNameIdentifier
parent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
parent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Package	TokenNameIdentifier
getPackage	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getPackage	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
