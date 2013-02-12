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
Project	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
RmicTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Project	TokenNameIdentifier
project	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Rmic	TokenNameIdentifier
rmic	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
RmicTest	TokenNameIdentifier
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
project	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Project	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rmic	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Rmic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rmic	TokenNameIdentifier
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCompilerArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
=	TokenNameEQUAL
rmic	TokenNameIdentifier
.	TokenNameDOT
getCurrentCompilerArgs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"no args"	TokenNameStringLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rmic	TokenNameIdentifier
.	TokenNameDOT
ImplementationSpecificArgument	TokenNameIdentifier
arg	TokenNameIdentifier
=	TokenNameEQUAL
rmic	TokenNameIdentifier
.	TokenNameDOT
createCompilerArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
ford	TokenNameIdentifier
=	TokenNameEQUAL
"Ford"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
prefect	TokenNameIdentifier
=	TokenNameEQUAL
"Prefect"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
testArg	TokenNameIdentifier
=	TokenNameEQUAL
ford	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
prefect	TokenNameIdentifier
;	TokenNameSEMICOLON
arg	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
testArg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
args	TokenNameIdentifier
=	TokenNameEQUAL
rmic	TokenNameIdentifier
.	TokenNameDOT
getCurrentCompilerArgs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"unconditional single arg"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
testArg	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
arg	TokenNameIdentifier
.	TokenNameDOT
setCompiler	TokenNameIdentifier
(	TokenNameLPAREN
"weblogic"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
args	TokenNameIdentifier
=	TokenNameEQUAL
rmic	TokenNameIdentifier
.	TokenNameDOT
getCurrentCompilerArgs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"implementation is weblogic but build.rmic is null"	TokenNameStringLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.rmic"	TokenNameStringLiteral
,	TokenNameCOMMA
"sun"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
args	TokenNameIdentifier
=	TokenNameEQUAL
rmic	TokenNameIdentifier
.	TokenNameDOT
getCurrentCompilerArgs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"implementation is weblogic but build.rmic is sun"	TokenNameStringLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.rmic"	TokenNameStringLiteral
,	TokenNameCOMMA
"weblogic"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
args	TokenNameIdentifier
=	TokenNameEQUAL
rmic	TokenNameIdentifier
.	TokenNameDOT
getCurrentCompilerArgs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"both are weblogic"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
testArg	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCompilerAttribute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
compiler	TokenNameIdentifier
=	TokenNameEQUAL
rmic	TokenNameIdentifier
.	TokenNameDOT
getCompiler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"expected sun or kaffe, but found "	TokenNameStringLiteral
+	TokenNamePLUS
compiler	TokenNameIdentifier
,	TokenNameCOMMA
compiler	TokenNameIdentifier
,	TokenNameCOMMA
"default"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
setNewProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.rmic"	TokenNameStringLiteral
,	TokenNameCOMMA
"weblogic"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
compiler	TokenNameIdentifier
=	TokenNameEQUAL
rmic	TokenNameIdentifier
.	TokenNameDOT
getCompiler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"weblogic"	TokenNameStringLiteral
,	TokenNameCOMMA
compiler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rmic	TokenNameIdentifier
.	TokenNameDOT
setCompiler	TokenNameIdentifier
(	TokenNameLPAREN
"kaffe"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
compiler	TokenNameIdentifier
=	TokenNameEQUAL
rmic	TokenNameIdentifier
.	TokenNameDOT
getCompiler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"kaffe"	TokenNameStringLiteral
,	TokenNameCOMMA
compiler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE