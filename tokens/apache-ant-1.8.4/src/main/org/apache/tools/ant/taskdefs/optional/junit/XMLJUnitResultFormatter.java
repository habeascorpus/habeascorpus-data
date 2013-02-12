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
BufferedWriter	TokenNameIdentifier
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
OutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
OutputStreamWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Writer	TokenNameIdentifier
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
Date	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
InetAddress	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
UnknownHostException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
.	TokenNameDOT
DocumentBuilder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
.	TokenNameDOT
DocumentBuilderFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
AssertionFailedError	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
DOMElementWriter	TokenNameIdentifier
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
DateUtils	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Element	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Text	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XMLJUnitResultFormatter	TokenNameIdentifier
implements	TokenNameimplements
JUnitResultFormatter	TokenNameIdentifier
,	TokenNameCOMMA
XMLConstants	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
ONE_SECOND	TokenNameIdentifier
=	TokenNameEQUAL
1000.0	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
UNKNOWN	TokenNameIdentifier
=	TokenNameEQUAL
"unknown"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
DocumentBuilder	TokenNameIdentifier
getDocumentBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
DocumentBuilderFactory	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
newDocumentBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
exc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ExceptionInInitializerError	TokenNameIdentifier
(	TokenNameLPAREN
exc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
Document	TokenNameIdentifier
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Element	TokenNameIdentifier
rootElement	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Hashtable	TokenNameIdentifier
testElements	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Hashtable	TokenNameIdentifier
failedTests	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Hashtable	TokenNameIdentifier
testStarts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
OutputStream	TokenNameIdentifier
out	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
XMLJUnitResultFormatter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOutput	TokenNameIdentifier
(	TokenNameLPAREN
OutputStream	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
out	TokenNameIdentifier
=	TokenNameEQUAL
out	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSystemOutput	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
formatOutput	TokenNameIdentifier
(	TokenNameLPAREN
SYSTEM_OUT	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSystemError	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
formatOutput	TokenNameIdentifier
(	TokenNameLPAREN
SYSTEM_ERR	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startTestSuite	TokenNameIdentifier
(	TokenNameLPAREN
JUnitTest	TokenNameIdentifier
suite	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
doc	TokenNameIdentifier
=	TokenNameEQUAL
getDocumentBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
newDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootElement	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
TESTSUITE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
suite	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootElement	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_NAME	TokenNameIdentifier
,	TokenNameCOMMA
n	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
UNKNOWN	TokenNameIdentifier
:	TokenNameCOLON
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
timestamp	TokenNameIdentifier
=	TokenNameEQUAL
DateUtils	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Date	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
DateUtils	TokenNameIdentifier
.	TokenNameDOT
ISO8601_DATETIME_PATTERN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootElement	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
TIMESTAMP	TokenNameIdentifier
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootElement	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
HOSTNAME	TokenNameIdentifier
,	TokenNameCOMMA
getHostname	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Element	TokenNameIdentifier
propsElement	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
PROPERTIES	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootElement	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
propsElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Properties	TokenNameIdentifier
props	TokenNameIdentifier
=	TokenNameEQUAL
suite	TokenNameIdentifier
.	TokenNameDOT
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
props	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Enumeration	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
props	TokenNameIdentifier
.	TokenNameDOT
propertyNames	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Element	TokenNameIdentifier
propElement	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
PROPERTY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
propElement	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_NAME	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
propElement	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
props	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
propsElement	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
propElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
getHostname	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
InetAddress	TokenNameIdentifier
.	TokenNameDOT
getLocalHost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getHostName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
UnknownHostException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"localhost"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endTestSuite	TokenNameIdentifier
(	TokenNameLPAREN
JUnitTest	TokenNameIdentifier
suite	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
rootElement	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_TESTS	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
+	TokenNamePLUS
suite	TokenNameIdentifier
.	TokenNameDOT
runCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootElement	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_FAILURES	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
+	TokenNamePLUS
suite	TokenNameIdentifier
.	TokenNameDOT
failureCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootElement	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_ERRORS	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
+	TokenNamePLUS
suite	TokenNameIdentifier
.	TokenNameDOT
errorCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootElement	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_TIME	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
suite	TokenNameIdentifier
.	TokenNameDOT
getRunTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
ONE_SECOND	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
out	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Writer	TokenNameIdentifier
wri	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
wri	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedWriter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
OutputStreamWriter	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
"UTF8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
wri	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
"<?xml version="1.0" encoding="UTF-8" ?> "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
(	TokenNameLPAREN
new	TokenNamenew
DOMElementWriter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
rootElement	TokenNameIdentifier
,	TokenNameCOMMA
wri	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
"  "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
exc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Unable to write log file"	TokenNameStringLiteral
,	TokenNameCOMMA
exc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
wri	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
wri	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
out	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
&&	TokenNameAND_AND
out	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
wri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startTest	TokenNameIdentifier
(	TokenNameLPAREN
Test	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
testStarts	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Long	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endTest	TokenNameIdentifier
(	TokenNameLPAREN
Test	TokenNameIdentifier
test	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
testStarts	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
startTest	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Element	TokenNameIdentifier
currentTest	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
failedTests	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
currentTest	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
TESTCASE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
JUnitVersionHelper	TokenNameIdentifier
.	TokenNameDOT
getTestCaseName	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
currentTest	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_NAME	TokenNameIdentifier
,	TokenNameCOMMA
n	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
UNKNOWN	TokenNameIdentifier
:	TokenNameCOLON
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
currentTest	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_CLASSNAME	TokenNameIdentifier
,	TokenNameCOMMA
JUnitVersionHelper	TokenNameIdentifier
.	TokenNameDOT
getTestCaseClassName	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootElement	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
currentTest	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testElements	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
,	TokenNameCOMMA
currentTest	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
currentTest	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
testElements	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Long	TokenNameIdentifier
l	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
testStarts	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
currentTest	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_TIME	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
l	TokenNameIdentifier
.	TokenNameDOT
longValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
ONE_SECOND	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addFailure	TokenNameIdentifier
(	TokenNameLPAREN
Test	TokenNameIdentifier
test	TokenNameIdentifier
,	TokenNameCOMMA
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
formatError	TokenNameIdentifier
(	TokenNameLPAREN
FAILURE	TokenNameIdentifier
,	TokenNameCOMMA
test	TokenNameIdentifier
,	TokenNameCOMMA
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addFailure	TokenNameIdentifier
(	TokenNameLPAREN
Test	TokenNameIdentifier
test	TokenNameIdentifier
,	TokenNameCOMMA
AssertionFailedError	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
addFailure	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
)	TokenNameRPAREN
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addError	TokenNameIdentifier
(	TokenNameLPAREN
Test	TokenNameIdentifier
test	TokenNameIdentifier
,	TokenNameCOMMA
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
formatError	TokenNameIdentifier
(	TokenNameLPAREN
ERROR	TokenNameIdentifier
,	TokenNameCOMMA
test	TokenNameIdentifier
,	TokenNameCOMMA
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
formatError	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
type	TokenNameIdentifier
,	TokenNameCOMMA
Test	TokenNameIdentifier
test	TokenNameIdentifier
,	TokenNameCOMMA
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
test	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
endTest	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
failedTests	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
,	TokenNameCOMMA
test	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Element	TokenNameIdentifier
nested	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Element	TokenNameIdentifier
currentTest	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
test	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
currentTest	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
testElements	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
currentTest	TokenNameIdentifier
=	TokenNameEQUAL
rootElement	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
currentTest	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
nested	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
message	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
message	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
message	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
nested	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_MESSAGE	TokenNameIdentifier
,	TokenNameCOMMA
t	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
nested	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
ATTR_TYPE	TokenNameIdentifier
,	TokenNameCOMMA
t	TokenNameIdentifier
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
String	TokenNameIdentifier
strace	TokenNameIdentifier
=	TokenNameEQUAL
JUnitTestRunner	TokenNameIdentifier
.	TokenNameDOT
getFilteredTrace	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Text	TokenNameIdentifier
trace	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createTextNode	TokenNameIdentifier
(	TokenNameLPAREN
strace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nested	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
trace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
formatOutput	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
type	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Element	TokenNameIdentifier
nested	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
createElement	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootElement	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
nested	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nested	TokenNameIdentifier
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
.	TokenNameDOT
createCDATASection	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE