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
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
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
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
FileUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
AntClassLoaderDelegationTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
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
Project	TokenNameIdentifier
p	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
AntClassLoaderDelegationTest	TokenNameIdentifier
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
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
TEST_RESOURCE	TokenNameIdentifier
=	TokenNameEQUAL
"apache/tools/ant/IncludeTest.class"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
testFindResources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
buildTestcases	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.tests"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"defined ${build.tests}"	TokenNameStringLiteral
,	TokenNameCOMMA
buildTestcases	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"have a dir "	TokenNameStringLiteral
+	TokenNamePLUS
buildTestcases	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
buildTestcases	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
isDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Path	TokenNameIdentifier
path	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
,	TokenNameCOMMA
buildTestcases	TokenNameIdentifier
+	TokenNamePLUS
"/org"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ClassLoader	TokenNameIdentifier
parent	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ParentLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ClassLoader	TokenNameIdentifier
acl	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AntClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
parent	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
,	TokenNameCOMMA
path	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
URL	TokenNameIdentifier
urlFromPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
URL	TokenNameIdentifier
(	TokenNameLPAREN
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
toURI	TokenNameIdentifier
(	TokenNameLPAREN
buildTestcases	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
"org/"	TokenNameStringLiteral
+	TokenNamePLUS
TEST_RESOURCE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
URL	TokenNameIdentifier
urlFromParent	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
URL	TokenNameIdentifier
(	TokenNameLPAREN
"http://ant.apache.org/"	TokenNameStringLiteral
+	TokenNamePLUS
TEST_RESOURCE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"correct resources (regular delegation order)"	TokenNameStringLiteral
,	TokenNameCOMMA
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
URL	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
urlFromParent	TokenNameIdentifier
,	TokenNameCOMMA
urlFromPath	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
,	TokenNameCOMMA
enum2List	TokenNameIdentifier
(	TokenNameLPAREN
acl	TokenNameIdentifier
.	TokenNameDOT
getResources	TokenNameIdentifier
(	TokenNameLPAREN
TEST_RESOURCE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
acl	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AntClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
parent	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
,	TokenNameCOMMA
path	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"correct resources (reverse delegation order)"	TokenNameStringLiteral
,	TokenNameCOMMA
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
URL	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
urlFromPath	TokenNameIdentifier
,	TokenNameCOMMA
urlFromParent	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
,	TokenNameCOMMA
enum2List	TokenNameIdentifier
(	TokenNameLPAREN
acl	TokenNameIdentifier
.	TokenNameDOT
getResources	TokenNameIdentifier
(	TokenNameLPAREN
TEST_RESOURCE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFindIsolateResources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
buildTestcases	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.tests"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"defined ${build.tests}"	TokenNameStringLiteral
,	TokenNameCOMMA
buildTestcases	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"have a dir "	TokenNameStringLiteral
+	TokenNamePLUS
buildTestcases	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
buildTestcases	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
isDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Path	TokenNameIdentifier
path	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
,	TokenNameCOMMA
buildTestcases	TokenNameIdentifier
+	TokenNamePLUS
"/org"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ClassLoader	TokenNameIdentifier
parent	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ParentLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
URL	TokenNameIdentifier
urlFromPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
URL	TokenNameIdentifier
(	TokenNameLPAREN
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
toURI	TokenNameIdentifier
(	TokenNameLPAREN
buildTestcases	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
"org/"	TokenNameStringLiteral
+	TokenNamePLUS
TEST_RESOURCE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AntClassLoader	TokenNameIdentifier
acl	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AntClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
parent	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
,	TokenNameCOMMA
path	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
acl	TokenNameIdentifier
.	TokenNameDOT
setIsolated	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"correct resources (reverse delegation order)"	TokenNameStringLiteral
,	TokenNameCOMMA
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
URL	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
urlFromPath	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
,	TokenNameCOMMA
enum2List	TokenNameIdentifier
(	TokenNameLPAREN
acl	TokenNameIdentifier
.	TokenNameDOT
getResources	TokenNameIdentifier
(	TokenNameLPAREN
TEST_RESOURCE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
List	TokenNameIdentifier
enum2List	TokenNameIdentifier
(	TokenNameLPAREN
Enumeration	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
list	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
ParentLoader	TokenNameIdentifier
extends	TokenNameextends
ClassLoader	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
ParentLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
Enumeration	TokenNameIdentifier
findResources	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
TEST_RESOURCE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
enumeration	TokenNameIdentifier
(	TokenNameLPAREN
Collections	TokenNameIdentifier
.	TokenNameDOT
singleton	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
URL	TokenNameIdentifier
(	TokenNameLPAREN
"http://ant.apache.org/"	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
enumeration	TokenNameIdentifier
(	TokenNameLPAREN
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_SET	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
