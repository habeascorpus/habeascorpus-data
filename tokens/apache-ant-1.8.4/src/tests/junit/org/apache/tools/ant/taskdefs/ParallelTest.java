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
PrintStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
AssertionFailedError	TokenNameIdentifier
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
DemuxOutputStream	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
ParallelTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
DIRECT_MESSAGE	TokenNameIdentifier
=	TokenNameEQUAL
"direct"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
DELAYED_MESSAGE	TokenNameIdentifier
=	TokenNameEQUAL
"delayed"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
FAILURE_MESSAGE	TokenNameIdentifier
=	TokenNameEQUAL
"failure"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
TEST_BUILD_FILE	TokenNameIdentifier
=	TokenNameEQUAL
"src/etc/testcases/taskdefs/parallel.xml"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
ParallelTest	TokenNameIdentifier
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
TEST_BUILD_FILE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBasic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Project	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"test.direct"	TokenNameStringLiteral
,	TokenNameCOMMA
DIRECT_MESSAGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"test.delayed"	TokenNameStringLiteral
,	TokenNameCOMMA
DELAYED_MESSAGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectOutputAndError	TokenNameIdentifier
(	TokenNameLPAREN
"testBasic"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
log	TokenNameIdentifier
=	TokenNameEQUAL
getLog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"parallel tasks didn't output correct data"	TokenNameStringLiteral
,	TokenNameCOMMA
log	TokenNameIdentifier
,	TokenNameCOMMA
DIRECT_MESSAGE	TokenNameIdentifier
+	TokenNamePLUS
DELAYED_MESSAGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testThreadCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Project	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"test.direct"	TokenNameStringLiteral
,	TokenNameCOMMA
DIRECT_MESSAGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"test.delayed"	TokenNameStringLiteral
,	TokenNameCOMMA
DELAYED_MESSAGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectOutputAndError	TokenNameIdentifier
(	TokenNameLPAREN
"testThreadCount"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
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
pos	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
pos	TokenNameIdentifier
>	TokenNameGREATER
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
pos	TokenNameIdentifier
=	TokenNameEQUAL
countThreads	TokenNameIdentifier
(	TokenNameLPAREN
log	TokenNameIdentifier
,	TokenNameCOMMA
pos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
int	TokenNameint
countThreads	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
firstPipe	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
'|'	TokenNameCharacterLiteral
,	TokenNameCOMMA
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
beginSlash	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
'/'	TokenNameCharacterLiteral
,	TokenNameCOMMA
firstPipe	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
lastPipe	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
'|'	TokenNameCharacterLiteral
,	TokenNameCOMMA
beginSlash	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
firstPipe	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
beginSlash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
lastPipe	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
max	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
firstPipe	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
beginSlash	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
current	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
beginSlash	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
pos	TokenNameIdentifier
<	TokenNameLESS
lastPipe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
'+'	TokenNameCharacterLiteral
:	TokenNameCOLON
current	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
'-'	TokenNameCharacterLiteral
:	TokenNameCOLON
current	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
AssertionFailedError	TokenNameIdentifier
(	TokenNameLPAREN
"Only expect '+-' in result count, found "	TokenNameStringLiteral
+	TokenNamePLUS
s	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
--	TokenNameMINUS_MINUS
pos	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" at position "	TokenNameStringLiteral
+	TokenNamePLUS
pos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
current	TokenNameIdentifier
>	TokenNameGREATER
max	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
AssertionFailedError	TokenNameIdentifier
(	TokenNameLPAREN
"Number of executing threads exceeded number allowed: "	TokenNameStringLiteral
+	TokenNamePLUS
current	TokenNameIdentifier
+	TokenNamePLUS
" > "	TokenNameStringLiteral
+	TokenNamePLUS
max	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
lastPipe	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFail	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Project	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"test.failure"	TokenNameStringLiteral
,	TokenNameCOMMA
FAILURE_MESSAGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"test.delayed"	TokenNameStringLiteral
,	TokenNameCOMMA
DELAYED_MESSAGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"testFail"	TokenNameStringLiteral
,	TokenNameCOMMA
"fail task in one parallel branch"	TokenNameStringLiteral
,	TokenNameCOMMA
FAILURE_MESSAGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testDemux	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Project	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
addTaskDefinition	TokenNameIdentifier
(	TokenNameLPAREN
"demuxtest"	TokenNameStringLiteral
,	TokenNameCOMMA
DemuxOutputTask	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrintStream	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
;	TokenNameSEMICOLON
PrintStream	TokenNameIdentifier
err	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
setOut	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrintStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DemuxOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
setErr	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrintStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DemuxOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
p	TokenNameIdentifier
.	TokenNameDOT
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testDemux"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
setOut	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
setErr	TokenNameIdentifier
(	TokenNameLPAREN
err	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
