package	TokenNamepackage
examples	TokenNameIdentifier
.	TokenNameDOT
lf5	TokenNameIdentifier
.	TokenNameDOT
UsingSocketAppenders	TokenNameIdentifier
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
PropertyConfigurator	TokenNameIdentifier
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
UsingSocketAppenders	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
Logger	TokenNameIdentifier
logger1	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
UsingSocketAppenders	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Logger	TokenNameIdentifier
logger2	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
"TestClass.Subclass"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Logger	TokenNameIdentifier
logger3	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
"TestClass.Subclass.Subclass"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
argv	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
resource	TokenNameIdentifier
=	TokenNameEQUAL
"/examples/lf5/UsingSocketAppenders/socketclient.properties"	TokenNameStringLiteral
;	TokenNameSEMICOLON
URL	TokenNameIdentifier
configFileResource	TokenNameIdentifier
=	TokenNameEQUAL
UsingSocketAppenders	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
resource	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PropertyConfigurator	TokenNameIdentifier
.	TokenNameDOT
configure	TokenNameIdentifier
(	TokenNameLPAREN
configFileResource	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger1	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Hello, my name is Homer Simpson."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger1	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Hello, my name is Lisa Simpson."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger2	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Hello, my name is Marge Simpson."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger2	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Hello, my name is Bart Simpson."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger3	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Hello, my name is Maggie Simpson."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger2	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"We are the Simpsons!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger2	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"Mmmmmm .... Chocolate."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger3	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"Homer likes chocolate"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger3	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"Doh!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger3	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"We are the Simpsons!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger1	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Bart: I am through with working! Working is for chumps!"	TokenNameStringLiteral
+	TokenNamePLUS
"Homer: Son, I'm proud of you. I was twice your age before "	TokenNameStringLiteral
+	TokenNamePLUS
"I figured that out."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger1	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Mmm...forbidden donut."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger1	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"D'oh! A deer! A female deer!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger1	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Truly, yours is a butt that won't quit."	TokenNameStringLiteral
+	TokenNamePLUS
"- Bart, writing as Woodrow to Ms. Krabappel."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger2	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Dear Baby, Welcome to Dumpsville. Population: you."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger2	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Dear Baby, Welcome to Dumpsville. Population: you."	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"Dumpsville, USA"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger3	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Mr. Hutz, are you aware you're not wearing pants?"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger3	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Mr. Hutz, are you aware you're not wearing pants?"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"Error !!"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger3	TokenNameIdentifier
.	TokenNameDOT
fatal	TokenNameIdentifier
(	TokenNameLPAREN
"Eep."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger3	TokenNameIdentifier
.	TokenNameDOT
fatal	TokenNameIdentifier
(	TokenNameLPAREN
"Mmm...forbidden donut."	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
SecurityException	TokenNameIdentifier
(	TokenNameLPAREN
"Fatal Exception ... "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger3	TokenNameIdentifier
.	TokenNameDOT
fatal	TokenNameIdentifier
(	TokenNameLPAREN
"D'oh! A deer! A female deer!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger2	TokenNameIdentifier
.	TokenNameDOT
fatal	TokenNameIdentifier
(	TokenNameLPAREN
"Mmmmmm .... Chocolate."	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
SecurityException	TokenNameIdentifier
(	TokenNameLPAREN
"Fatal Exception"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
5000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
ie	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE