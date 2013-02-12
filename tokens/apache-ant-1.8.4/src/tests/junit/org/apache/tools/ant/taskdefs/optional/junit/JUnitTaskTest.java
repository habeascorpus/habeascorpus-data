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
junit	TokenNameIdentifier
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
FileReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
JavaEnvUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JUnitTaskTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
JUnitTaskTest	TokenNameIdentifier
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
"src/etc/testcases/taskdefs/optional/junit.xml"	TokenNameStringLiteral
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
testCrash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectPropertySet	TokenNameIdentifier
(	TokenNameLPAREN
"crash"	TokenNameStringLiteral
,	TokenNameCOMMA
"crashed"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoCrash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectPropertyUnset	TokenNameIdentifier
(	TokenNameLPAREN
"nocrash"	TokenNameStringLiteral
,	TokenNameCOMMA
"crashed"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testTimeout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectPropertySet	TokenNameIdentifier
(	TokenNameLPAREN
"timeout"	TokenNameStringLiteral
,	TokenNameCOMMA
"timeout"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoTimeout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectPropertyUnset	TokenNameIdentifier
(	TokenNameLPAREN
"notimeout"	TokenNameStringLiteral
,	TokenNameCOMMA
"timeout"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNonForkedCapture	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"capture"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNoPrint	TokenNameIdentifier
(	TokenNameLPAREN
getLog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"log"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNoPrint	TokenNameIdentifier
(	TokenNameLPAREN
getFullLog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"debug log"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testForkedCapture	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"fork"	TokenNameStringLiteral
,	TokenNameCOMMA
"true"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testNonForkedCapture	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNoPrint	TokenNameIdentifier
(	TokenNameLPAREN
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"output"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNoPrint	TokenNameIdentifier
(	TokenNameLPAREN
getError	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"error output"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBatchTestForkOnceToDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertResultFilesExist	TokenNameIdentifier
(	TokenNameLPAREN
"testBatchTestForkOnceToDir"	TokenNameStringLiteral
,	TokenNameCOMMA
".xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBatchTestForkOnceExtension	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertResultFilesExist	TokenNameIdentifier
(	TokenNameLPAREN
"testBatchTestForkOnceExtension"	TokenNameStringLiteral
,	TokenNameCOMMA
".foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFailureRecorder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
JavaEnvUtils	TokenNameIdentifier
.	TokenNameDOT
isAtLeastJavaVersion	TokenNameIdentifier
(	TokenNameLPAREN
JavaEnvUtils	TokenNameIdentifier
.	TokenNameDOT
JAVA_1_5	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"junit.framework.JUnit4TestAdapter"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"skipping tests since it fails when"	TokenNameStringLiteral
+	TokenNamePLUS
" using JUnit 4"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
File	TokenNameIdentifier
testDir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
getProjectDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"out"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
collectorFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
getProjectDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"out/FailedTests.java"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
"Test directory '"	TokenNameStringLiteral
+	TokenNamePLUS
testDir	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"' must not exist before the test preparation."	TokenNameStringLiteral
,	TokenNameCOMMA
testDir	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
"The collector file '"	TokenNameStringLiteral
+	TokenNamePLUS
collectorFile	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"'must not exist before the test preparation."	TokenNameStringLiteral
,	TokenNameCOMMA
collectorFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"failureRecorder.prepare"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Test directory '"	TokenNameStringLiteral
+	TokenNamePLUS
testDir	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"' was not created."	TokenNameStringLiteral
,	TokenNameCOMMA
testDir	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"There should be one class."	TokenNameStringLiteral
,	TokenNameCOMMA
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
testDir	TokenNameIdentifier
,	TokenNameCOMMA
"A.class"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
"The collector file '"	TokenNameStringLiteral
+	TokenNamePLUS
collectorFile	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"' should not exist before the 1st run."	TokenNameStringLiteral
,	TokenNameCOMMA
collectorFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"failureRecorder.runtest"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"The collector file '"	TokenNameStringLiteral
+	TokenNamePLUS
collectorFile	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"' should exist after the 1st run."	TokenNameStringLiteral
,	TokenNameCOMMA
collectorFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"1st run: should run A.test01"	TokenNameStringLiteral
,	TokenNameCOMMA
"A.test01"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"1st run: should run B.test05"	TokenNameStringLiteral
,	TokenNameCOMMA
"B.test05"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"1st run: should run B.test06"	TokenNameStringLiteral
,	TokenNameCOMMA
"B.test06"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"1st run: should run C.test07"	TokenNameStringLiteral
,	TokenNameCOMMA
"C.test07"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"1st run: should run C.test08"	TokenNameStringLiteral
,	TokenNameCOMMA
"C.test08"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"1st run: should run C.test09"	TokenNameStringLiteral
,	TokenNameCOMMA
"C.test09"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"1st run: should run A.test02"	TokenNameStringLiteral
,	TokenNameCOMMA
"A.test02"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"1st run: should run A.test03"	TokenNameStringLiteral
,	TokenNameCOMMA
"A.test03"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"1st run: should run B.test04"	TokenNameStringLiteral
,	TokenNameCOMMA
"B.test04"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"1st run: should run D.test10"	TokenNameStringLiteral
,	TokenNameCOMMA
"D.test10"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"failureRecorder.runtest"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"The collector file '"	TokenNameStringLiteral
+	TokenNamePLUS
collectorFile	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"' should exist after the 2nd run."	TokenNameStringLiteral
,	TokenNameCOMMA
collectorFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputNotContaining	TokenNameIdentifier
(	TokenNameLPAREN
"2nd run: should not run A.test01"	TokenNameStringLiteral
,	TokenNameCOMMA
"A.test01"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputNotContaining	TokenNameIdentifier
(	TokenNameLPAREN
"2nd run: should not run A.test05"	TokenNameStringLiteral
,	TokenNameCOMMA
"B.test05"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputNotContaining	TokenNameIdentifier
(	TokenNameLPAREN
"2nd run: should not run B.test06"	TokenNameStringLiteral
,	TokenNameCOMMA
"B.test06"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputNotContaining	TokenNameIdentifier
(	TokenNameLPAREN
"2nd run: should not run C.test07"	TokenNameStringLiteral
,	TokenNameCOMMA
"C.test07"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputNotContaining	TokenNameIdentifier
(	TokenNameLPAREN
"2nd run: should not run C.test08"	TokenNameStringLiteral
,	TokenNameCOMMA
"C.test08"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputNotContaining	TokenNameIdentifier
(	TokenNameLPAREN
"2nd run: should not run C.test09"	TokenNameStringLiteral
,	TokenNameCOMMA
"C.test09"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"2nd run: should run A.test02"	TokenNameStringLiteral
,	TokenNameCOMMA
"A.test02"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"2nd run: should run A.test03"	TokenNameStringLiteral
,	TokenNameCOMMA
"A.test03"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"2nd run: should run B.test04"	TokenNameStringLiteral
,	TokenNameCOMMA
"B.test04"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"2nd run: should run D.test10"	TokenNameStringLiteral
,	TokenNameCOMMA
"D.test10"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"failureRecorder.fixing"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"failureRecorder.runtest"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"The collector file '"	TokenNameStringLiteral
+	TokenNamePLUS
collectorFile	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"' should exist after the 3rd run."	TokenNameStringLiteral
,	TokenNameCOMMA
collectorFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"3rd run: should run A.test02"	TokenNameStringLiteral
,	TokenNameCOMMA
"A.test02"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"3rd run: should run A.test03"	TokenNameStringLiteral
,	TokenNameCOMMA
"A.test03"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"3rd run: should run B.test04"	TokenNameStringLiteral
,	TokenNameCOMMA
"B.test04"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"3rd run: should run D.test10"	TokenNameStringLiteral
,	TokenNameCOMMA
"D.test10"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"failureRecorder.runtest"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"The collector file '"	TokenNameStringLiteral
+	TokenNamePLUS
collectorFile	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"' should exist after the 4th run."	TokenNameStringLiteral
,	TokenNameCOMMA
collectorFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"4th run: should run B.test04"	TokenNameStringLiteral
,	TokenNameCOMMA
"B.test04"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertOutputContaining	TokenNameIdentifier
(	TokenNameLPAREN
"4th run: should run D.test10"	TokenNameStringLiteral
,	TokenNameCOMMA
"D.test10"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
be	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"nested build's log: "	TokenNameStringLiteral
+	TokenNamePLUS
getLog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"nested build's System.out: "	TokenNameStringLiteral
+	TokenNamePLUS
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"nested build's System.err: "	TokenNameStringLiteral
+	TokenNamePLUS
getError	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Ant execution failed: "	TokenNameStringLiteral
+	TokenNamePLUS
be	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBatchTestForkOnceCustomFormatter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertResultFilesExist	TokenNameIdentifier
(	TokenNameLPAREN
"testBatchTestForkOnceCustomFormatter"	TokenNameStringLiteral
,	TokenNameCOMMA
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMultilineAssertsNoFork	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectLogNotContaining	TokenNameIdentifier
(	TokenNameLPAREN
"testMultilineAssertsNoFork"	TokenNameStringLiteral
,	TokenNameCOMMA
"messed up)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertLogNotContaining	TokenNameIdentifier
(	TokenNameLPAREN
"crashed)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMultilineAssertsFork	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectLogNotContaining	TokenNameIdentifier
(	TokenNameLPAREN
"testMultilineAssertsFork"	TokenNameStringLiteral
,	TokenNameCOMMA
"messed up)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertLogNotContaining	TokenNameIdentifier
(	TokenNameLPAREN
"crashed)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertResultFilesExist	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
target	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
extension	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResultFileExists	TokenNameIdentifier
(	TokenNameLPAREN
"JUnitClassLoader"	TokenNameStringLiteral
,	TokenNameCOMMA
extension	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResultFileExists	TokenNameIdentifier
(	TokenNameLPAREN
"JUnitTestRunner"	TokenNameStringLiteral
,	TokenNameCOMMA
extension	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResultFileExists	TokenNameIdentifier
(	TokenNameLPAREN
"JUnitVersionHelper"	TokenNameStringLiteral
,	TokenNameCOMMA
extension	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertResultFileExists	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
classNameFragment	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
ext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"result for "	TokenNameStringLiteral
+	TokenNamePLUS
classNameFragment	TokenNameIdentifier
+	TokenNamePLUS
"Test"	TokenNameStringLiteral
+	TokenNamePLUS
ext	TokenNameIdentifier
+	TokenNamePLUS
" exists"	TokenNameStringLiteral
,	TokenNameCOMMA
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
"out/TEST-org.apache.tools.ant."	TokenNameStringLiteral
+	TokenNamePLUS
"taskdefs.optional.junit."	TokenNameStringLiteral
+	TokenNamePLUS
classNameFragment	TokenNameIdentifier
+	TokenNamePLUS
"Test"	TokenNameStringLiteral
+	TokenNamePLUS
ext	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertNoPrint	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
result	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
where	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
where	TokenNameIdentifier
+	TokenNamePLUS
" '"	TokenNameStringLiteral
+	TokenNamePLUS
result	TokenNameIdentifier
+	TokenNamePLUS
"' must not contain print statement"	TokenNameStringLiteral
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"print to System."	TokenNameStringLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
FileReader	TokenNameIdentifier
inner	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FileReader	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
"testlog.txt"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedReader	TokenNameIdentifier
(	TokenNameLPAREN
inner	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
String	TokenNameIdentifier
line	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Testsuite: org.apache.tools.ant.taskdefs.optional.junit.Printer"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
line	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"Tests run: 1, Failures: 0, Errors: 0, Time elapsed:"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
line	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"------------- Standard Output ---------------"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPrint	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"static"	TokenNameStringLiteral
,	TokenNameCOMMA
"out"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPrint	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"constructor"	TokenNameStringLiteral
,	TokenNameCOMMA
"out"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPrint	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"method"	TokenNameStringLiteral
,	TokenNameCOMMA
"out"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
line	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"------------- ---------------- ---------------"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
line	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"------------- Standard Error -----------------"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPrint	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"static"	TokenNameStringLiteral
,	TokenNameCOMMA
"err"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPrint	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"constructor"	TokenNameStringLiteral
,	TokenNameCOMMA
"err"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPrint	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"method"	TokenNameStringLiteral
,	TokenNameCOMMA
"err"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
line	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"------------- ---------------- ---------------"	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
line	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
line	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"Testcase: testNoCrash took "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
inner	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertPrint	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
line	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
from	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
to	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
search	TokenNameIdentifier
=	TokenNameEQUAL
from	TokenNameIdentifier
+	TokenNamePLUS
" print to System."	TokenNameStringLiteral
+	TokenNamePLUS
to	TokenNameIdentifier
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
search	TokenNameIdentifier
,	TokenNameCOMMA
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE