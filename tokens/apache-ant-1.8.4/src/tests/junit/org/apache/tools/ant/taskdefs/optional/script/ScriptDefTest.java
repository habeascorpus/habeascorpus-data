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
script	TokenNameIdentifier
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
FileSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ScriptDefTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
ScriptDefTest	TokenNameIdentifier
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
"src/etc/testcases/taskdefs/optional/script/scriptdef.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSimple	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"simple"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Project	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FileSet	TokenNameIdentifier
fileset	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FileSet	TokenNameIdentifier
)	TokenNameRPAREN
p	TokenNameIdentifier
.	TokenNameDOT
getReference	TokenNameIdentifier
(	TokenNameLPAREN
"testfileset"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
baseDir	TokenNameIdentifier
=	TokenNameEQUAL
fileset	TokenNameIdentifier
.	TokenNameDOT
getDir	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
log	TokenNameIdentifier
=	TokenNameEQUAL
getLog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Expecting attribute value printed"	TokenNameStringLiteral
,	TokenNameCOMMA
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"Attribute attr1 = test"	TokenNameStringLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Expecting nested element value printed"	TokenNameStringLiteral
,	TokenNameCOMMA
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"Fileset basedir = "	TokenNameStringLiteral
+	TokenNamePLUS
baseDir	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoLang	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"nolang"	TokenNameStringLiteral
,	TokenNameCOMMA
"Absence of language attribute not detected"	TokenNameStringLiteral
,	TokenNameCOMMA
"requires a language attribute"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"noname"	TokenNameStringLiteral
,	TokenNameCOMMA
"Absence of name attribute not detected"	TokenNameStringLiteral
,	TokenNameCOMMA
"scriptdef requires a name attribute"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNestedByClassName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"nestedbyclassname"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Project	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FileSet	TokenNameIdentifier
fileset	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FileSet	TokenNameIdentifier
)	TokenNameRPAREN
p	TokenNameIdentifier
.	TokenNameDOT
getReference	TokenNameIdentifier
(	TokenNameLPAREN
"testfileset"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
baseDir	TokenNameIdentifier
=	TokenNameEQUAL
fileset	TokenNameIdentifier
.	TokenNameDOT
getDir	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
log	TokenNameIdentifier
=	TokenNameEQUAL
getLog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Expecting attribute value to be printed"	TokenNameStringLiteral
,	TokenNameCOMMA
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"Attribute attr1 = test"	TokenNameStringLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Expecting nested element value to be printed"	TokenNameStringLiteral
,	TokenNameCOMMA
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"Fileset basedir = "	TokenNameStringLiteral
+	TokenNamePLUS
baseDir	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectOutput	TokenNameIdentifier
(	TokenNameLPAREN
"noelement"	TokenNameStringLiteral
,	TokenNameCOMMA
"Attribute attr1 = test"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"exception"	TokenNameStringLiteral
,	TokenNameCOMMA
"Should have thrown an exception in the script"	TokenNameStringLiteral
,	TokenNameCOMMA
"TypeError"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testDoubleDef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"doubledef"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
log	TokenNameIdentifier
=	TokenNameEQUAL
getLog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Task1 did not execute"	TokenNameStringLiteral
,	TokenNameCOMMA
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"Task1"	TokenNameStringLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Task2 did not execute"	TokenNameStringLiteral
,	TokenNameCOMMA
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"Task2"	TokenNameStringLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testDoubleAttribute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"doubleAttributeDef"	TokenNameStringLiteral
,	TokenNameCOMMA
"Should have detected duplicate attribute definition"	TokenNameStringLiteral
,	TokenNameCOMMA
"attr1 attribute more than once"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testProperty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"property"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
log	TokenNameIdentifier
=	TokenNameEQUAL
getLog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Expecting property in attribute value replaced"	TokenNameStringLiteral
,	TokenNameCOMMA
log	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"Attribute value = test"	TokenNameStringLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE