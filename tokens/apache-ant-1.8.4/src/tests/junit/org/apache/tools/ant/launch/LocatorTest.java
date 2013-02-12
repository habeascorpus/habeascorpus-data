package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
launch	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
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
taskdefs	TokenNameIdentifier
.	TokenNameDOT
condition	TokenNameIdentifier
.	TokenNameDOT
Os	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LocatorTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
boolean	TokenNameboolean
windows	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
unix	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
LAUNCHER_JAR	TokenNameIdentifier
=	TokenNameEQUAL
"//morzine/slo/Java/Apache/ant/lib/ant-launcher.jar"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
SHARED_JAR_URI	TokenNameIdentifier
=	TokenNameEQUAL
"jar:file:"	TokenNameStringLiteral
+	TokenNamePLUS
LAUNCHER_JAR	TokenNameIdentifier
+	TokenNamePLUS
"!/org/apache/tools/ant/launch/Launcher.class"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
LocatorTest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
LocatorTest	TokenNameIdentifier
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
protected	TokenNameprotected
void	TokenNamevoid
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
windows	TokenNameIdentifier
=	TokenNameEQUAL
Os	TokenNameIdentifier
.	TokenNameDOT
isFamily	TokenNameIdentifier
(	TokenNameLPAREN
Os	TokenNameIdentifier
.	TokenNameDOT
FAMILY_DOS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
unix	TokenNameIdentifier
=	TokenNameEQUAL
Os	TokenNameIdentifier
.	TokenNameDOT
isFamily	TokenNameIdentifier
(	TokenNameLPAREN
Os	TokenNameIdentifier
.	TokenNameDOT
FAMILY_UNIX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
resolveTo	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
uri	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
expectedUnix	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
expectedDos	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
Locator	TokenNameIdentifier
.	TokenNameDOT
fromURI	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResolved	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
,	TokenNameCOMMA
expectedUnix	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
,	TokenNameCOMMA
unix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResolved	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
,	TokenNameCOMMA
expectedDos	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
,	TokenNameCOMMA
windows	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertResolved	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
uri	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
expectedResult	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
result	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
enabled	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
enabled	TokenNameIdentifier
&&	TokenNameAND_AND
expectedResult	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
expectedResult	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Expected "	TokenNameStringLiteral
+	TokenNamePLUS
uri	TokenNameIdentifier
+	TokenNamePLUS
" to resolve to  "	TokenNameStringLiteral
+	TokenNamePLUS
expectedResult	TokenNameIdentifier
+	TokenNamePLUS
"  but got "	TokenNameStringLiteral
+	TokenNamePLUS
result	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
,	TokenNameCOMMA
expectedResult	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
assertResolves	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
path	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
asuri	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
path	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
toURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toASCIIString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
fullpath	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"user.dir"	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
File	TokenNameIdentifier
.	TokenNameDOT
separator	TokenNameIdentifier
+	TokenNamePLUS
path	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
resolveTo	TokenNameIdentifier
(	TokenNameLPAREN
asuri	TokenNameIdentifier
,	TokenNameCOMMA
fullpath	TokenNameIdentifier
,	TokenNameCOMMA
fullpath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
.	TokenNameDOT
separatorChar	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNetworkURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
resolveTo	TokenNameIdentifier
(	TokenNameLPAREN
"file:\\PC03\jclasses\lib\ant-1.7.0.jar"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
+	TokenNamePLUS
"\\PC03\jclasses\lib\ant-1.7.0.jar"	TokenNameStringLiteral
,	TokenNameCOMMA
"\\PC03\jclasses\lib\ant-1.7.0.jar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
NotestTripleForwardSlashNetworkURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
resolveTo	TokenNameIdentifier
(	TokenNameLPAREN
"file:///PC03/jclasses/lib/ant-1.7.0.jar"	TokenNameStringLiteral
,	TokenNameCOMMA
"///PC03/jclasses/lib/ant-1.7.0.jar"	TokenNameStringLiteral
,	TokenNameCOMMA
"\\PC03\jclasses\lib\ant-1.7.0.jar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testUnixNetworkPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
resolveTo	TokenNameIdentifier
(	TokenNameLPAREN
"file://cluster/home/ant/lib"	TokenNameStringLiteral
,	TokenNameCOMMA
"//cluster/home/ant/lib"	TokenNameStringLiteral
,	TokenNameCOMMA
"\\cluster\home\ant\lib"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testUnixPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
resolveTo	TokenNameIdentifier
(	TokenNameLPAREN
"file:/home/ant/lib"	TokenNameStringLiteral
,	TokenNameCOMMA
"/home/ant/lib"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSpacedURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
resolveTo	TokenNameIdentifier
(	TokenNameLPAREN
"file:C:\Program Files\Ant\lib"	TokenNameStringLiteral
,	TokenNameCOMMA
"C:\Program Files\Ant\lib"	TokenNameStringLiteral
,	TokenNameCOMMA
"C:\Program Files\Ant\lib"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testAntOnRemoteShare	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Throwable	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
resolved	TokenNameIdentifier
=	TokenNameEQUAL
Locator	TokenNameIdentifier
.	TokenNameDOT
fromJarURI	TokenNameIdentifier
(	TokenNameLPAREN
SHARED_JAR_URI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResolved	TokenNameIdentifier
(	TokenNameLPAREN
SHARED_JAR_URI	TokenNameIdentifier
,	TokenNameCOMMA
LAUNCHER_JAR	TokenNameIdentifier
,	TokenNameCOMMA
resolved	TokenNameIdentifier
,	TokenNameCOMMA
unix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResolved	TokenNameIdentifier
(	TokenNameLPAREN
SHARED_JAR_URI	TokenNameIdentifier
,	TokenNameCOMMA
LAUNCHER_JAR	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'/'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'\\'	TokenNameCharacterLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
resolved	TokenNameIdentifier
,	TokenNameCOMMA
windows	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFileFromRemoteShare	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Throwable	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
resolved	TokenNameIdentifier
=	TokenNameEQUAL
Locator	TokenNameIdentifier
.	TokenNameDOT
fromJarURI	TokenNameIdentifier
(	TokenNameLPAREN
SHARED_JAR_URI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
resolved	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
path	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
windows	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
path	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"\\"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testHttpURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
url	TokenNameIdentifier
=	TokenNameEQUAL
"http://ant.apache.org"	TokenNameStringLiteral
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Locator	TokenNameIdentifier
.	TokenNameDOT
fromURI	TokenNameIdentifier
(	TokenNameLPAREN
url	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
message	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
message	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
Locator	TokenNameIdentifier
.	TokenNameDOT
ERROR_NOT_FILE_URI	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
message	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
url	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testInternationalURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
assertResolves	TokenNameIdentifier
(	TokenNameLPAREN
"Löwenbrau.aus.München"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
char	TokenNamechar
umlauted	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"expected 0xf6 (ö), but got "	TokenNameStringLiteral
+	TokenNamePLUS
Integer	TokenNameIdentifier
.	TokenNameDOT
toHexString	TokenNameIdentifier
(	TokenNameLPAREN
umlauted	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" '"	TokenNameStringLiteral
+	TokenNamePLUS
umlauted	TokenNameIdentifier
+	TokenNamePLUS
"'"	TokenNameStringLiteral
,	TokenNameCOMMA
0xf6	TokenNameIntegerLiteral
,	TokenNameCOMMA
umlauted	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"file:/tmp/a%C3%A7a%C3%AD%20berry"	TokenNameStringLiteral
,	TokenNameCOMMA
Locator	TokenNameIdentifier
.	TokenNameDOT
encodeURI	TokenNameIdentifier
(	TokenNameLPAREN
"file:/tmp/açaí berry"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"file:/tmp/açaí berry"	TokenNameStringLiteral
,	TokenNameCOMMA
Locator	TokenNameIdentifier
.	TokenNameDOT
decodeUri	TokenNameIdentifier
(	TokenNameLPAREN
"file:/tmp/a%C3%A7a%C3%AD%20berry"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"file:/tmp/açaí berry"	TokenNameStringLiteral
,	TokenNameCOMMA
Locator	TokenNameIdentifier
.	TokenNameDOT
decodeUri	TokenNameIdentifier
(	TokenNameLPAREN
"file:/tmp/açaí%20berry"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"file:/tmp/hezky česky"	TokenNameStringLiteral
,	TokenNameCOMMA
Locator	TokenNameIdentifier
.	TokenNameDOT
decodeUri	TokenNameIdentifier
(	TokenNameLPAREN
"file:/tmp/hezky%20česky"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testOddLowAsciiURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
assertResolves	TokenNameIdentifier
(	TokenNameLPAREN
"hash# and percent%"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE