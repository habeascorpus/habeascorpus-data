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
taskdefs	TokenNameIdentifier
.	TokenNameDOT
optional	TokenNameIdentifier
.	TokenNameDOT
jsp	TokenNameIdentifier
.	TokenNameDOT
Jasper41Mangler	TokenNameIdentifier
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
optional	TokenNameIdentifier
.	TokenNameDOT
jsp	TokenNameIdentifier
.	TokenNameDOT
JspMangler	TokenNameIdentifier
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
optional	TokenNameIdentifier
.	TokenNameDOT
jsp	TokenNameIdentifier
.	TokenNameDOT
JspNameMangler	TokenNameIdentifier
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
optional	TokenNameIdentifier
.	TokenNameDOT
jsp	TokenNameIdentifier
.	TokenNameDOT
compilers	TokenNameIdentifier
.	TokenNameDOT
JspCompilerAdapter	TokenNameIdentifier
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
optional	TokenNameIdentifier
.	TokenNameDOT
jsp	TokenNameIdentifier
.	TokenNameDOT
compilers	TokenNameIdentifier
.	TokenNameDOT
JspCompilerAdapterFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JspcTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
File	TokenNameIdentifier
baseDir	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
File	TokenNameIdentifier
outDir	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
TASKDEFS_DIR	TokenNameIdentifier
=	TokenNameEQUAL
"src/etc/testcases/taskdefs/optional/"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
JspcTest	TokenNameIdentifier
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
TASKDEFS_DIR	TokenNameIdentifier
+	TokenNamePLUS
"jspc.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
baseDir	TokenNameIdentifier
=	TokenNameEQUAL
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
TASKDEFS_DIR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outDir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
baseDir	TokenNameIdentifier
,	TokenNameCOMMA
"jsp/java"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"cleanup"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSimple	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeJspCompile	TokenNameIdentifier
(	TokenNameLPAREN
"testSimple"	TokenNameStringLiteral
,	TokenNameCOMMA
"simple_jsp.java"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testUriroot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeJspCompile	TokenNameIdentifier
(	TokenNameLPAREN
"testUriroot"	TokenNameStringLiteral
,	TokenNameCOMMA
"uriroot_jsp.java"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testXml	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeJspCompile	TokenNameIdentifier
(	TokenNameLPAREN
"testXml"	TokenNameStringLiteral
,	TokenNameCOMMA
"xml_jsp.java"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testKeyword	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeJspCompile	TokenNameIdentifier
(	TokenNameLPAREN
"testKeyword"	TokenNameStringLiteral
,	TokenNameCOMMA
"default_jsp.java"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testInvalidClassname	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeJspCompile	TokenNameIdentifier
(	TokenNameLPAREN
"testInvalidClassname"	TokenNameStringLiteral
,	TokenNameCOMMA
"_1nvalid_0002dclassname_jsp.java"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoTld	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"testNoTld"	TokenNameStringLiteral
,	TokenNameCOMMA
"not found"	TokenNameStringLiteral
,	TokenNameCOMMA
"Java returned: 9"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNotAJspFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testNotAJspFile"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
executeJspCompile	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
javafile	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertJavaFileCreated	TokenNameIdentifier
(	TokenNameLPAREN
javafile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
assertJavaFileCreated	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
filename	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
file	TokenNameIdentifier
=	TokenNameEQUAL
getOutputFile	TokenNameIdentifier
(	TokenNameLPAREN
filename	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"file "	TokenNameStringLiteral
+	TokenNamePLUS
filename	TokenNameIdentifier
+	TokenNamePLUS
" not found"	TokenNameStringLiteral
,	TokenNameCOMMA
file	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"file "	TokenNameStringLiteral
+	TokenNamePLUS
filename	TokenNameIdentifier
+	TokenNamePLUS
" is empty"	TokenNameStringLiteral
,	TokenNameCOMMA
file	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
File	TokenNameIdentifier
getOutputFile	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
subpath	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
outDir	TokenNameIdentifier
,	TokenNameCOMMA
subpath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testJasperNameManglerSelection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
JspCompilerAdapter	TokenNameIdentifier
adapter	TokenNameIdentifier
=	TokenNameEQUAL
JspCompilerAdapterFactory	TokenNameIdentifier
.	TokenNameDOT
getCompiler	TokenNameIdentifier
(	TokenNameLPAREN
"jasper"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
JspMangler	TokenNameIdentifier
mangler	TokenNameIdentifier
=	TokenNameEQUAL
adapter	TokenNameIdentifier
.	TokenNameDOT
createMangler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
mangler	TokenNameIdentifier
instanceof	TokenNameinstanceof
JspNameMangler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
adapter	TokenNameIdentifier
=	TokenNameEQUAL
JspCompilerAdapterFactory	TokenNameIdentifier
.	TokenNameDOT
getCompiler	TokenNameIdentifier
(	TokenNameLPAREN
"jasper41"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mangler	TokenNameIdentifier
=	TokenNameEQUAL
adapter	TokenNameIdentifier
.	TokenNameDOT
createMangler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
mangler	TokenNameIdentifier
instanceof	TokenNameinstanceof
Jasper41Mangler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testJasper41	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
JspMangler	TokenNameIdentifier
mangler	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Jasper41Mangler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertMapped	TokenNameIdentifier
(	TokenNameLPAREN
mangler	TokenNameIdentifier
,	TokenNameCOMMA
"for.jsp"	TokenNameStringLiteral
,	TokenNameCOMMA
"for_jsp"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertMapped	TokenNameIdentifier
(	TokenNameLPAREN
mangler	TokenNameIdentifier
,	TokenNameCOMMA
"0.jsp"	TokenNameStringLiteral
,	TokenNameCOMMA
"_0_jsp"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertMapped	TokenNameIdentifier
(	TokenNameLPAREN
mangler	TokenNameIdentifier
,	TokenNameCOMMA
"_.jsp"	TokenNameStringLiteral
,	TokenNameCOMMA
"___jsp"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertMapped	TokenNameIdentifier
(	TokenNameLPAREN
mangler	TokenNameIdentifier
,	TokenNameCOMMA
"-.jsp"	TokenNameStringLiteral
,	TokenNameCOMMA
"__0002d_jsp"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
char	TokenNamechar
s	TokenNameIdentifier
=	TokenNameEQUAL
File	TokenNameIdentifier
.	TokenNameDOT
separatorChar	TokenNameIdentifier
;	TokenNameSEMICOLON
assertMapped	TokenNameIdentifier
(	TokenNameLPAREN
mangler	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
+	TokenNamePLUS
s	TokenNameIdentifier
+	TokenNamePLUS
s	TokenNameIdentifier
+	TokenNamePLUS
"somewhere"	TokenNameStringLiteral
+	TokenNamePLUS
s	TokenNameIdentifier
+	TokenNamePLUS
"file"	TokenNameStringLiteral
+	TokenNamePLUS
s	TokenNameIdentifier
+	TokenNamePLUS
"index.jsp"	TokenNameStringLiteral
,	TokenNameCOMMA
"index_jsp"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
assertMapped	TokenNameIdentifier
(	TokenNameLPAREN
JspMangler	TokenNameIdentifier
mangler	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
filename	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
classname	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
mappedname	TokenNameIdentifier
=	TokenNameEQUAL
mangler	TokenNameIdentifier
.	TokenNameDOT
mapJspToJavaName	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
filename	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
filename	TokenNameIdentifier
+	TokenNamePLUS
" should have mapped to "	TokenNameStringLiteral
+	TokenNamePLUS
classname	TokenNameIdentifier
+	TokenNamePLUS
" but instead mapped to "	TokenNameStringLiteral
+	TokenNamePLUS
mappedname	TokenNameIdentifier
,	TokenNameCOMMA
classname	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
mappedname	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
