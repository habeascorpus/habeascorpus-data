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
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
MakeUrlTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
MakeUrlTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
s	TokenNameIdentifier
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
"src/etc/testcases/taskdefs/makeurl.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"testEmpty"	TokenNameStringLiteral
,	TokenNameCOMMA
"missing property"	TokenNameStringLiteral
,	TokenNameCOMMA
"property"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoProperty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"testNoProperty"	TokenNameStringLiteral
,	TokenNameCOMMA
"missing property"	TokenNameStringLiteral
,	TokenNameCOMMA
"property"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"testNoFile"	TokenNameStringLiteral
,	TokenNameCOMMA
"missing file"	TokenNameStringLiteral
,	TokenNameCOMMA
"file"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testValidation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"testValidation"	TokenNameStringLiteral
,	TokenNameCOMMA
MakeUrl	TokenNameIdentifier
.	TokenNameDOT
ERROR_MISSING_FILE	TokenNameIdentifier
,	TokenNameCOMMA
"file"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testWorks	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testWorks"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
"testWorks"	TokenNameStringLiteral
,	TokenNameCOMMA
"file:"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
"testWorks"	TokenNameStringLiteral
,	TokenNameCOMMA
"/foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testIllegalChars	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testIllegalChars"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
"testIllegalChars"	TokenNameStringLiteral
,	TokenNameCOMMA
"file:"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
"testIllegalChars"	TokenNameStringLiteral
,	TokenNameCOMMA
"fo%20o%25"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testRoundTrip	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testRoundTrip"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
"testRoundTrip"	TokenNameStringLiteral
,	TokenNameCOMMA
"file:"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
property	TokenNameIdentifier
=	TokenNameEQUAL
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"testRoundTrip"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
URL	TokenNameIdentifier
url	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
URL	TokenNameIdentifier
(	TokenNameLPAREN
property	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InputStream	TokenNameIdentifier
instream	TokenNameIdentifier
=	TokenNameEQUAL
url	TokenNameIdentifier
.	TokenNameDOT
openStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
instream	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testIllegalCombinations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testIllegalCombinations"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
"testIllegalCombinations"	TokenNameStringLiteral
,	TokenNameCOMMA
"/foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
"testIllegalCombinations"	TokenNameStringLiteral
,	TokenNameCOMMA
".xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFileset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testFileset"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
"testFileset"	TokenNameStringLiteral
,	TokenNameCOMMA
".xml "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyEndsWith	TokenNameIdentifier
(	TokenNameLPAREN
"testFileset"	TokenNameStringLiteral
,	TokenNameCOMMA
".xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFilesetSeparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testFilesetSeparator"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
"testFilesetSeparator"	TokenNameStringLiteral
,	TokenNameCOMMA
".xml",""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyEndsWith	TokenNameIdentifier
(	TokenNameLPAREN
"testFilesetSeparator"	TokenNameStringLiteral
,	TokenNameCOMMA
".xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testPath"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
"testPath"	TokenNameStringLiteral
,	TokenNameCOMMA
"makeurl.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertPropertyEndsWith	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
property	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ending	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
property	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
substring	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
ending	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
ending	TokenNameIdentifier
,	TokenNameCOMMA
substring	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
assertPropertyContains	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
property	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
contains	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
property	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expected "	TokenNameStringLiteral
+	TokenNamePLUS
contains	TokenNameIdentifier
+	TokenNamePLUS
" in "	TokenNameStringLiteral
+	TokenNamePLUS
result	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
result	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
contains	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
property	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
project	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
property	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE