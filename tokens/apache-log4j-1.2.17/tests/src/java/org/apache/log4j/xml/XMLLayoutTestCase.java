package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestSuite	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
FileAppender	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Level	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
MDC	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Compare	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Filter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
JunitTestRunnerFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
LineNumberFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SunReflectFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
XMLLineAttributeFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
XMLTimestampFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XMLLayoutTestCase	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
String	TokenNameIdentifier
TEMP	TokenNameIdentifier
=	TokenNameEQUAL
"output/temp"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
String	TokenNameIdentifier
FILTERED	TokenNameIdentifier
=	TokenNameEQUAL
"output/filtered"	TokenNameStringLiteral
;	TokenNameSEMICOLON
Logger	TokenNameIdentifier
root	TokenNameIdentifier
;	TokenNameSEMICOLON
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
XMLLayoutTestCase	TokenNameIdentifier
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
root	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getRootLogger	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
setLevel	TokenNameIdentifier
(	TokenNameLPAREN
Level	TokenNameIdentifier
.	TokenNameDOT
TRACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
XMLLayoutTestCase	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
setLevel	TokenNameIdentifier
(	TokenNameLPAREN
Level	TokenNameIdentifier
.	TokenNameDOT
TRACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
root	TokenNameIdentifier
.	TokenNameDOT
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
resetConfiguration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
basic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
XMLLayout	TokenNameIdentifier
xmlLayout	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XMLLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
addAppender	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileAppender	TokenNameIdentifier
(	TokenNameLPAREN
xmlLayout	TokenNameIdentifier
,	TokenNameCOMMA
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
common	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Transformer	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Filter	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
LineNumberFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLTimestampFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
JunitTestRunnerFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
SunReflectFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
Compare	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
"witness/xmlLayout.1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
locationInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
XMLLayout	TokenNameIdentifier
xmlLayout	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XMLLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlLayout	TokenNameIdentifier
.	TokenNameDOT
setLocationInfo	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
addAppender	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileAppender	TokenNameIdentifier
(	TokenNameLPAREN
xmlLayout	TokenNameIdentifier
,	TokenNameCOMMA
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
common	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Transformer	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Filter	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
LineNumberFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLTimestampFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLLineAttributeFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
JunitTestRunnerFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
SunReflectFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
Compare	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
"witness/xmlLayout.2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCDATA	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
XMLLayout	TokenNameIdentifier
xmlLayout	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XMLLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlLayout	TokenNameIdentifier
.	TokenNameDOT
setLocationInfo	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
addAppender	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileAppender	TokenNameIdentifier
(	TokenNameLPAREN
xmlLayout	TokenNameIdentifier
,	TokenNameCOMMA
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
oldThreadName	TokenNameIdentifier
=	TokenNameEQUAL
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"main"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Message with embedded <![CDATA[<hello>hi</hello>]]>."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Message with embedded <![CDATA[<hello>hi</hello>]]>."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
oldThreadName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Transformer	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Filter	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
LineNumberFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLTimestampFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLLineAttributeFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
SunReflectFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
JunitTestRunnerFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Transformer	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Filter	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
LineNumberFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLTimestampFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLLineAttributeFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
Compare	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
"witness/xmlLayout.3"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
XMLLayout	TokenNameIdentifier
xmlLayout	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XMLLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
addAppender	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileAppender	TokenNameIdentifier
(	TokenNameLPAREN
xmlLayout	TokenNameIdentifier
,	TokenNameCOMMA
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
oldThreadName	TokenNameIdentifier
=	TokenNameEQUAL
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"main"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"hi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Exception	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Exception	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"hi"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
oldThreadName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Transformer	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Filter	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
LineNumberFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLTimestampFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
JunitTestRunnerFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
SunReflectFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
Compare	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
"witness/xmlLayout.null"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMDC	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
XMLLayout	TokenNameIdentifier
xmlLayout	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XMLLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlLayout	TokenNameIdentifier
.	TokenNameDOT
setProperties	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
addAppender	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileAppender	TokenNameIdentifier
(	TokenNameLPAREN
xmlLayout	TokenNameIdentifier
,	TokenNameCOMMA
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Hashtable	TokenNameIdentifier
context	TokenNameIdentifier
=	TokenNameEQUAL
MDC	TokenNameIdentifier
.	TokenNameDOT
getContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
context	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
context	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
MDC	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"key1"	TokenNameStringLiteral
,	TokenNameCOMMA
"val1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MDC	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"key2"	TokenNameStringLiteral
,	TokenNameCOMMA
"val2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Hello"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Transformer	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Filter	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
LineNumberFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
JunitTestRunnerFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLTimestampFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
Compare	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
"witness/xmlLayout.mdc.1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMDCEscaped	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
XMLLayout	TokenNameIdentifier
xmlLayout	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XMLLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlLayout	TokenNameIdentifier
.	TokenNameDOT
setProperties	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
addAppender	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileAppender	TokenNameIdentifier
(	TokenNameLPAREN
xmlLayout	TokenNameIdentifier
,	TokenNameCOMMA
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Hashtable	TokenNameIdentifier
context	TokenNameIdentifier
=	TokenNameEQUAL
MDC	TokenNameIdentifier
.	TokenNameDOT
getContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
context	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
context	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
MDC	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"blahAttribute"	TokenNameStringLiteral
,	TokenNameCOMMA
"<blah value='blah'>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MDC	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"<blahKey value='blah'/>"	TokenNameStringLiteral
,	TokenNameCOMMA
"blahValue"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Hello"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Transformer	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
TEMP	TokenNameIdentifier
,	TokenNameCOMMA
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Filter	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
LineNumberFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
JunitTestRunnerFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
XMLTimestampFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
Compare	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
"witness/xmlLayout.mdc.2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
common	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
oldThreadName	TokenNameIdentifier
=	TokenNameEQUAL
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"main"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
new	TokenNamenew
X	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
Level	TokenNameIdentifier
.	TokenNameDOT
FATAL	TokenNameIdentifier
,	TokenNameCOMMA
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
Level	TokenNameIdentifier
.	TokenNameDOT
FATAL	TokenNameIdentifier
,	TokenNameCOMMA
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Exception	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Exception	TokenNameIdentifier
(	TokenNameLPAREN
"Just testing"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
root	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
oldThreadName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Test	TokenNameIdentifier
suite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
TestSuite	TokenNameIdentifier
suite	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TestSuite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
suite	TokenNameIdentifier
.	TokenNameDOT
addTest	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
XMLLayoutTestCase	TokenNameIdentifier
(	TokenNameLPAREN
"basic"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
suite	TokenNameIdentifier
.	TokenNameDOT
addTest	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
XMLLayoutTestCase	TokenNameIdentifier
(	TokenNameLPAREN
"locationInfo"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
suite	TokenNameIdentifier
.	TokenNameDOT
addTest	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
XMLLayoutTestCase	TokenNameIdentifier
(	TokenNameLPAREN
"testCDATA"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
suite	TokenNameIdentifier
.	TokenNameDOT
addTest	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
XMLLayoutTestCase	TokenNameIdentifier
(	TokenNameLPAREN
"testNull"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
suite	TokenNameIdentifier
.	TokenNameDOT
addTest	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
XMLLayoutTestCase	TokenNameIdentifier
(	TokenNameLPAREN
"testMDC"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
suite	TokenNameIdentifier
.	TokenNameDOT
addTest	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
XMLLayoutTestCase	TokenNameIdentifier
(	TokenNameLPAREN
"testMDCEscaped"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
suite	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
class	TokenNameclass
X	TokenNameIdentifier
{	TokenNameLBRACE
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
X	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
X	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"in X() constructor"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
