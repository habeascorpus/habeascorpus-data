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
compilers	TokenNameIdentifier
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
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Constructor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Method	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
JavaEnvUtils	TokenNameIdentifier
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
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
LogOutputStream	TokenNameIdentifier
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
Commandline	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Javac12	TokenNameIdentifier
extends	TokenNameextends
DefaultCompilerAdapter	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
CLASSIC_COMPILER_CLASSNAME	TokenNameIdentifier
=	TokenNameEQUAL
"sun.tools.javac.Main"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
attributes	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
"Using classic compiler"	TokenNameStringLiteral
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Commandline	TokenNameIdentifier
cmd	TokenNameIdentifier
=	TokenNameEQUAL
setupJavacCommand	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
OutputStream	TokenNameIdentifier
logstr	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
attributes	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_WARN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
CLASSIC_COMPILER_CLASSNAME	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Constructor	TokenNameIdentifier
cons	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
getConstructor	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Class	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
OutputStream	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
String	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
compiler	TokenNameIdentifier
=	TokenNameEQUAL
cons	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
logstr	TokenNameIdentifier
,	TokenNameCOMMA
"javac"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Method	TokenNameIdentifier
compile	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
getMethod	TokenNameIdentifier
(	TokenNameLPAREN
"compile"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Class	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
.	TokenNameDOT
class	TokenNameclass
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Boolean	TokenNameIdentifier
ok	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
compile	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
cmd	TokenNameIdentifier
.	TokenNameDOT
getArguments	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ok	TokenNameIdentifier
.	TokenNameDOT
booleanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot use classic compiler , as it is "	TokenNameStringLiteral
+	TokenNamePLUS
"not available.  "	TokenNameStringLiteral
+	TokenNamePLUS
" A common solution is "	TokenNameStringLiteral
+	TokenNamePLUS
"to set the environment variable"	TokenNameStringLiteral
+	TokenNamePLUS
" JAVA_HOME to your jdk directory. "	TokenNameStringLiteral
+	TokenNamePLUS
"It is currently set to ""	TokenNameStringLiteral
+	TokenNamePLUS
JavaEnvUtils	TokenNameIdentifier
.	TokenNameDOT
getJavaHome	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"""	TokenNameStringLiteral
,	TokenNameCOMMA
location	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ex	TokenNameIdentifier
instanceof	TokenNameinstanceof
BuildException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
)	TokenNameRPAREN
ex	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Error starting classic compiler: "	TokenNameStringLiteral
,	TokenNameCOMMA
ex	TokenNameIdentifier
,	TokenNameCOMMA
location	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
logstr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
