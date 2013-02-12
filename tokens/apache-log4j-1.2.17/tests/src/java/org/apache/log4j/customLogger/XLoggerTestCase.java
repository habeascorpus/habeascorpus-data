package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
customLogger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
DOMConfigurator	TokenNameIdentifier
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
*	TokenNameMULTIPLY
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
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XLoggerTestCase	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
String	TokenNameIdentifier
FILTERED	TokenNameIdentifier
=	TokenNameEQUAL
"output/filtered"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
XLogger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XLogger	TokenNameIdentifier
)	TokenNameRPAREN
XLogger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
XLoggerTestCase	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
XLoggerTestCase	TokenNameIdentifier
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
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
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
test1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
common	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
test2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
common	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
common	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
number	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
DOMConfigurator	TokenNameIdentifier
.	TokenNameDOT
configure	TokenNameIdentifier
(	TokenNameLPAREN
"input/xml/customLogger"	TokenNameStringLiteral
+	TokenNamePLUS
number	TokenNameIdentifier
+	TokenNamePLUS
".xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
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
logger	TokenNameIdentifier
.	TokenNameDOT
fatal	TokenNameIdentifier
(	TokenNameLPAREN
"Message "	TokenNameStringLiteral
+	TokenNamePLUS
++	TokenNamePLUS_PLUS
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
Transformer	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
"output/temp"	TokenNameStringLiteral
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
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
Compare	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
FILTERED	TokenNameIdentifier
,	TokenNameCOMMA
"witness/customLogger."	TokenNameStringLiteral
+	TokenNamePLUS
number	TokenNameIdentifier
)	TokenNameRPAREN
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
XLoggerTestCase	TokenNameIdentifier
(	TokenNameLPAREN
"test1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
suite	TokenNameIdentifier
.	TokenNameDOT
addTest	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
XLoggerTestCase	TokenNameIdentifier
(	TokenNameLPAREN
"test2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
suite	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE