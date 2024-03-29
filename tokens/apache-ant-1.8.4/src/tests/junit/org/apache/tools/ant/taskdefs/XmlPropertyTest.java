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
FileFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileInputStream	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
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
BuildFileTest	TokenNameIdentifier
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
XmlPropertyTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
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
public	TokenNamepublic
XmlPropertyTest	TokenNameIdentifier
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
configureProject	TokenNameIdentifier
(	TokenNameLPAREN
"src/etc/testcases/taskdefs/xmlproperty.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
testProperties	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testResource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
testProperties	TokenNameIdentifier
(	TokenNameLPAREN
"testResource"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
testProperties	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"true"	TokenNameStringLiteral
,	TokenNameCOMMA
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"root-tag(myattr)"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Text"	TokenNameStringLiteral
,	TokenNameCOMMA
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"root-tag.inner-tag"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"val"	TokenNameStringLiteral
,	TokenNameCOMMA
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"root-tag.inner-tag(someattr)"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"false"	TokenNameStringLiteral
,	TokenNameCOMMA
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"root-tag.a2.a3.a4"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"CDATA failed"	TokenNameStringLiteral
,	TokenNameCOMMA
"<test>"	TokenNameStringLiteral
,	TokenNameCOMMA
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"root-tag.cdatatag"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testDTD	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testdtd"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Text"	TokenNameStringLiteral
,	TokenNameCOMMA
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"root-tag.inner-tag"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testNone"	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testKeeproot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testKeeproot"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCollapse	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testCollapse"	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSemantic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testSemantic"	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testKeeprootCollapse	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testKeeprootCollapse"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testKeeprootSemantic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testKeeprootSemantic"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCollapseSemantic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testCollapseSemantic"	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testKeeprootCollapseSemantic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testKeeprootCollapseSemantic"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testInclude	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testInclude"	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSemanticInclude	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testSemanticInclude"	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSemanticLocal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
doTest	TokenNameIdentifier
(	TokenNameLPAREN
"testSemanticInclude"	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNeedsCatalog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testneedscat"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"true"	TokenNameStringLiteral
,	TokenNameCOMMA
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"skinconfig.foo"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
doTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msg	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
keepRoot	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
collapse	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
semantic	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
include	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
localRoot	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Enumeration	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
getFiles	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"root"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"src/etc/testcases/taskdefs/xmlproperty/inputs"	TokenNameStringLiteral
)	TokenNameRPAREN
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
File	TokenNameIdentifier
inputFile	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
File	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
workingDir	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
localRoot	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
workingDir	TokenNameIdentifier
=	TokenNameEQUAL
inputFile	TokenNameIdentifier
.	TokenNameDOT
getParentFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
workingDir	TokenNameIdentifier
=	TokenNameEQUAL
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
File	TokenNameIdentifier
propertyFile	TokenNameIdentifier
=	TokenNameEQUAL
getGoldfile	TokenNameIdentifier
(	TokenNameLPAREN
inputFile	TokenNameIdentifier
,	TokenNameCOMMA
keepRoot	TokenNameIdentifier
,	TokenNameCOMMA
collapse	TokenNameIdentifier
,	TokenNameCOMMA
semantic	TokenNameIdentifier
,	TokenNameCOMMA
include	TokenNameIdentifier
,	TokenNameCOMMA
localRoot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
propertyFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Project	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Project	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XmlProperty	TokenNameIdentifier
xmlproperty	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XmlProperty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlproperty	TokenNameIdentifier
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlproperty	TokenNameIdentifier
.	TokenNameDOT
setFile	TokenNameIdentifier
(	TokenNameLPAREN
inputFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlproperty	TokenNameIdentifier
.	TokenNameDOT
setKeeproot	TokenNameIdentifier
(	TokenNameLPAREN
keepRoot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlproperty	TokenNameIdentifier
.	TokenNameDOT
setCollapseAttributes	TokenNameIdentifier
(	TokenNameLPAREN
collapse	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlproperty	TokenNameIdentifier
.	TokenNameDOT
setSemanticAttributes	TokenNameIdentifier
(	TokenNameLPAREN
semantic	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlproperty	TokenNameIdentifier
.	TokenNameDOT
setIncludeSemanticAttribute	TokenNameIdentifier
(	TokenNameLPAREN
include	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlproperty	TokenNameIdentifier
.	TokenNameDOT
setRootDirectory	TokenNameIdentifier
(	TokenNameLPAREN
workingDir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
setNewProperty	TokenNameIdentifier
(	TokenNameLPAREN
"override.property.test"	TokenNameStringLiteral
,	TokenNameCOMMA
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlproperty	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Properties	TokenNameIdentifier
props	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
load	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileInputStream	TokenNameIdentifier
(	TokenNameLPAREN
propertyFile	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ensureProperties	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
inputFile	TokenNameIdentifier
,	TokenNameCOMMA
workingDir	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
,	TokenNameCOMMA
props	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ensureReferences	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
inputFile	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
.	TokenNameDOT
getReferences	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fail	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
ensureProperties	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msg	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
inputFile	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
workingDir	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
p	TokenNameIdentifier
,	TokenNameCOMMA
Properties	TokenNameIdentifier
properties	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Hashtable	TokenNameIdentifier
xmlproperties	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Enumeration	TokenNameIdentifier
propertyKeyEnum	TokenNameIdentifier
=	TokenNameEQUAL
properties	TokenNameIdentifier
.	TokenNameDOT
propertyNames	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
propertyKeyEnum	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
currentKey	TokenNameIdentifier
=	TokenNameEQUAL
propertyKeyEnum	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
assertMsg	TokenNameIdentifier
=	TokenNameEQUAL
msg	TokenNameIdentifier
+	TokenNamePLUS
"-"	TokenNameStringLiteral
+	TokenNamePLUS
inputFile	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" Key="	TokenNameStringLiteral
+	TokenNamePLUS
currentKey	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
propertyValue	TokenNameIdentifier
=	TokenNameEQUAL
properties	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
currentKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
xmlValue	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
xmlproperties	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
currentKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
propertyValue	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"ID."	TokenNameStringLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
id	TokenNameIdentifier
=	TokenNameEQUAL
currentKey	TokenNameIdentifier
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
obj	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
getReferences	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
obj	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
fail	TokenNameIdentifier
(	TokenNameLPAREN
assertMsg	TokenNameIdentifier
+	TokenNamePLUS
" Object ID does not exist."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
propertyValue	TokenNameIdentifier
=	TokenNameEQUAL
propertyValue	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
propertyValue	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
propertyValue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"path"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
obj	TokenNameIdentifier
instanceof	TokenNameinstanceof
Path	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fail	TokenNameIdentifier
(	TokenNameLPAREN
assertMsg	TokenNameIdentifier
+	TokenNamePLUS
" Path ID is a "	TokenNameStringLiteral
+	TokenNamePLUS
obj	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
assertMsg	TokenNameIdentifier
,	TokenNameCOMMA
propertyValue	TokenNameIdentifier
,	TokenNameCOMMA
obj	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
propertyValue	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"FILE."	TokenNameStringLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
fileName	TokenNameIdentifier
=	TokenNameEQUAL
propertyValue	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
propertyValue	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
workingDir	TokenNameIdentifier
,	TokenNameCOMMA
fileName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
propertyValue	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
assertMsg	TokenNameIdentifier
,	TokenNameCOMMA
propertyValue	TokenNameIdentifier
,	TokenNameCOMMA
xmlValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
printProperties	TokenNameIdentifier
(	TokenNameLPAREN
Hashtable	TokenNameIdentifier
xmlproperties	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Enumeration	TokenNameIdentifier
keyEnum	TokenNameIdentifier
=	TokenNameEQUAL
xmlproperties	TokenNameIdentifier
.	TokenNameDOT
keys	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
keyEnum	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
currentKey	TokenNameIdentifier
=	TokenNameEQUAL
keyEnum	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
currentKey	TokenNameIdentifier
+	TokenNamePLUS
" = "	TokenNameStringLiteral
+	TokenNamePLUS
xmlproperties	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
currentKey	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
ensureReferences	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msg	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
inputFile	TokenNameIdentifier
,	TokenNameCOMMA
Hashtable	TokenNameIdentifier
references	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Enumeration	TokenNameIdentifier
referenceKeyEnum	TokenNameIdentifier
=	TokenNameEQUAL
references	TokenNameIdentifier
.	TokenNameDOT
keys	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
referenceKeyEnum	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
currentKey	TokenNameIdentifier
=	TokenNameEQUAL
referenceKeyEnum	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
currentValue	TokenNameIdentifier
=	TokenNameEQUAL
references	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
currentKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
currentValue	TokenNameIdentifier
instanceof	TokenNameinstanceof
Path	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
currentValue	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
currentKey	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"ant."	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fail	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
+	TokenNamePLUS
"-"	TokenNameStringLiteral
+	TokenNamePLUS
inputFile	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" Key="	TokenNameStringLiteral
+	TokenNamePLUS
currentKey	TokenNameIdentifier
+	TokenNamePLUS
" is not a recognized type."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
File	TokenNameIdentifier
getGoldfile	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
keepRoot	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
collapse	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
semantic	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
include	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
localRoot	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
baseName	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
baseName	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
".xml"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
baseName	TokenNameIdentifier
=	TokenNameEQUAL
baseName	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
baseName	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
".properties"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
File	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
getParentFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getParentFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
goldFileFolder	TokenNameIdentifier
=	TokenNameEQUAL
"goldfiles/"	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
keepRoot	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
goldFileFolder	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"keeproot-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
goldFileFolder	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"nokeeproot-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
semantic	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
goldFileFolder	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"semantic-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
include	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
goldFileFolder	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"include-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
collapse	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
goldFileFolder	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"collapse-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
goldFileFolder	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"nocollapse-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
dir	TokenNameIdentifier
,	TokenNameCOMMA
goldFileFolder	TokenNameIdentifier
+	TokenNamePLUS
baseName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
Enumeration	TokenNameIdentifier
getFiles	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
File	TokenNameIdentifier
startingDir	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Vector	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getFiles	TokenNameIdentifier
(	TokenNameLPAREN
startingDir	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
.	TokenNameDOT
elements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
getFiles	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
File	TokenNameIdentifier
startingDir	TokenNameIdentifier
,	TokenNameCOMMA
Vector	TokenNameIdentifier
collect	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FileFilter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FileFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
boolean	TokenNameboolean
accept	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
file	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
file	TokenNameIdentifier
.	TokenNameDOT
isDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
file	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"taskdefs"	TokenNameStringLiteral
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
file	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
".xml"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
File	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
files	TokenNameIdentifier
=	TokenNameEQUAL
startingDir	TokenNameIdentifier
.	TokenNameDOT
listFiles	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
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
files	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
files	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
f	TokenNameIdentifier
.	TokenNameDOT
isDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
collect	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
getFiles	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
,	TokenNameCOMMA
collect	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
