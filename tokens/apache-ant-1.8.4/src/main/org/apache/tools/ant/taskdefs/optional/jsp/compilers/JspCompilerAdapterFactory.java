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
jsp	TokenNameIdentifier
.	TokenNameDOT
compilers	TokenNameIdentifier
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
AntClassLoader	TokenNameIdentifier
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
Task	TokenNameIdentifier
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
optional	TokenNameIdentifier
.	TokenNameDOT
jsp	TokenNameIdentifier
.	TokenNameDOT
JspNameMangler	TokenNameIdentifier
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
optional	TokenNameIdentifier
.	TokenNameDOT
jsp	TokenNameIdentifier
.	TokenNameDOT
Jasper41Mangler	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
JspCompilerAdapterFactory	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
JspCompilerAdapterFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
JspCompilerAdapter	TokenNameIdentifier
getCompiler	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
compilerType	TokenNameIdentifier
,	TokenNameCOMMA
Task	TokenNameIdentifier
task	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
getCompiler	TokenNameIdentifier
(	TokenNameLPAREN
compilerType	TokenNameIdentifier
,	TokenNameCOMMA
task	TokenNameIdentifier
,	TokenNameCOMMA
task	TokenNameIdentifier
.	TokenNameDOT
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
JspCompilerAdapter	TokenNameIdentifier
getCompiler	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
compilerType	TokenNameIdentifier
,	TokenNameCOMMA
Task	TokenNameIdentifier
task	TokenNameIdentifier
,	TokenNameCOMMA
AntClassLoader	TokenNameIdentifier
loader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
compilerType	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
"jasper"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
JasperC	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
JspNameMangler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
compilerType	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
"jasper41"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
JasperC	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Jasper41Mangler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
resolveClassName	TokenNameIdentifier
(	TokenNameLPAREN
compilerType	TokenNameIdentifier
,	TokenNameCOMMA
loader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
JspCompilerAdapter	TokenNameIdentifier
resolveClassName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
className	TokenNameIdentifier
,	TokenNameCOMMA
AntClassLoader	TokenNameIdentifier
classloader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
classloader	TokenNameIdentifier
.	TokenNameDOT
findClass	TokenNameIdentifier
(	TokenNameLPAREN
className	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
JspCompilerAdapter	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
cnfe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
className	TokenNameIdentifier
+	TokenNamePLUS
" can't be found."	TokenNameStringLiteral
,	TokenNameCOMMA
cnfe	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassCastException	TokenNameIdentifier
cce	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
className	TokenNameIdentifier
+	TokenNamePLUS
" isn't the classname of "	TokenNameStringLiteral
+	TokenNamePLUS
"a compiler adapter."	TokenNameStringLiteral
,	TokenNameCOMMA
cce	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
className	TokenNameIdentifier
+	TokenNamePLUS
" caused an interesting "	TokenNameStringLiteral
+	TokenNamePLUS
"exception."	TokenNameStringLiteral
,	TokenNameCOMMA
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
