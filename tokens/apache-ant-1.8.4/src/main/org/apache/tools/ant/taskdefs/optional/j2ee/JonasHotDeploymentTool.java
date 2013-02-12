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
j2ee	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
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
taskdefs	TokenNameIdentifier
.	TokenNameDOT
Java	TokenNameIdentifier
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
Path	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JonasHotDeploymentTool	TokenNameIdentifier
extends	TokenNameextends
GenericHotDeploymentTool	TokenNameIdentifier
implements	TokenNameimplements
HotDeploymentTool	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_ORB	TokenNameIdentifier
=	TokenNameEQUAL
"RMI"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
JONAS_DEPLOY_CLASS_NAME	TokenNameIdentifier
=	TokenNameEQUAL
"org.objectweb.jonas.adm.JonasAdmin"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
VALID_ACTIONS	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
ACTION_DELETE	TokenNameIdentifier
,	TokenNameCOMMA
ACTION_DEPLOY	TokenNameIdentifier
,	TokenNameCOMMA
ACTION_LIST	TokenNameIdentifier
,	TokenNameCOMMA
ACTION_UNDEPLOY	TokenNameIdentifier
,	TokenNameCOMMA
ACTION_UPDATE	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
File	TokenNameIdentifier
jonasroot	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
orb	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
davidHost	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
davidPort	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setDavidhost	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
inValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
davidHost	TokenNameIdentifier
=	TokenNameEQUAL
inValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDavidport	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
inValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
davidPort	TokenNameIdentifier
=	TokenNameEQUAL
inValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setJonasroot	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
File	TokenNameIdentifier
inValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
jonasroot	TokenNameIdentifier
=	TokenNameEQUAL
inValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOrb	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
inValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
orb	TokenNameIdentifier
=	TokenNameEQUAL
inValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Path	TokenNameIdentifier
getClasspath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Path	TokenNameIdentifier
aClassPath	TokenNameIdentifier
=	TokenNameEQUAL
super	TokenNamesuper
.	TokenNameDOT
getClasspath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
aClassPath	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
aClassPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
getTask	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
orb	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
aOrbJar	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
jonasroot	TokenNameIdentifier
,	TokenNameCOMMA
"lib/"	TokenNameStringLiteral
+	TokenNamePLUS
orb	TokenNameIdentifier
+	TokenNamePLUS
"_jonas.jar"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
aConfigDir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
jonasroot	TokenNameIdentifier
,	TokenNameCOMMA
"config/"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Path	TokenNameIdentifier
aJOnASOrbPath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
aClassPath	TokenNameIdentifier
.	TokenNameDOT
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
aOrbJar	TokenNameIdentifier
+	TokenNamePLUS
File	TokenNameIdentifier
.	TokenNameDOT
pathSeparator	TokenNameIdentifier
+	TokenNamePLUS
aConfigDir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
aClassPath	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
aJOnASOrbPath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
aClassPath	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
validateAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
Java	TokenNameIdentifier
java	TokenNameIdentifier
=	TokenNameEQUAL
getJava	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
action	TokenNameIdentifier
=	TokenNameEQUAL
getTask	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
action	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"The "action" attribute must be set"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isActionValid	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid action ""	TokenNameStringLiteral
+	TokenNamePLUS
action	TokenNameIdentifier
+	TokenNamePLUS
"" passed"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
getClassName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
setClassName	TokenNameIdentifier
(	TokenNameLPAREN
JONAS_DEPLOY_CLASS_NAME	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
jonasroot	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
jonasroot	TokenNameIdentifier
.	TokenNameDOT
isDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Dinstall.root="	TokenNameStringLiteral
+	TokenNamePLUS
jonasroot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Djava.security.policy="	TokenNameStringLiteral
+	TokenNamePLUS
jonasroot	TokenNameIdentifier
+	TokenNamePLUS
"/config/java.policy"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
"DAVID"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
orb	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Dorg.omg.CORBA.ORBClass"	TokenNameStringLiteral
+	TokenNamePLUS
"=org.objectweb.david.libs.binding.orbs.iiop.IIOPORB"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Dorg.omg.CORBA.ORBSingletonClass="	TokenNameStringLiteral
+	TokenNamePLUS
"org.objectweb.david.libs.binding.orbs.ORBSingletonClass"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Djavax.rmi.CORBA.StubClass="	TokenNameStringLiteral
+	TokenNamePLUS
"org.objectweb.david.libs.stub_factories.rmi.StubDelegate"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Djavax.rmi.CORBA.PortableRemoteObjectClass="	TokenNameStringLiteral
+	TokenNamePLUS
"org.objectweb.david.libs.binding.rmi.ORBPortableRemoteObjectDelegate"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Djavax.rmi.CORBA.UtilClass="	TokenNameStringLiteral
+	TokenNamePLUS
"org.objectweb.david.libs.helpers.RMIUtilDelegate"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Ddavid.CosNaming.default_method=0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Ddavid.rmi.ValueHandlerClass="	TokenNameStringLiteral
+	TokenNamePLUS
"com.sun.corba.se.internal.io.ValueHandlerImpl"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
davidHost	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Ddavid.CosNaming.default_host="	TokenNameStringLiteral
+	TokenNamePLUS
davidHost	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
davidPort	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
java	TokenNameIdentifier
.	TokenNameDOT
createJvmarg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-Ddavid.CosNaming.default_port="	TokenNameStringLiteral
+	TokenNamePLUS
davidPort	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
getServer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
java	TokenNameIdentifier
.	TokenNameDOT
createArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setLine	TokenNameIdentifier
(	TokenNameLPAREN
"-n "	TokenNameStringLiteral
+	TokenNamePLUS
getServer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
action	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ACTION_DEPLOY	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
action	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ACTION_UPDATE	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
action	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"redeploy"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
java	TokenNameIdentifier
.	TokenNameDOT
createArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setLine	TokenNameIdentifier
(	TokenNameLPAREN
"-a "	TokenNameStringLiteral
+	TokenNamePLUS
getTask	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
action	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ACTION_DELETE	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
action	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ACTION_UNDEPLOY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
java	TokenNameIdentifier
.	TokenNameDOT
createArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setLine	TokenNameIdentifier
(	TokenNameLPAREN
"-r "	TokenNameStringLiteral
+	TokenNamePLUS
getTask	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
action	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ACTION_LIST	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
java	TokenNameIdentifier
.	TokenNameDOT
createArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"-l"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
isActionValid	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
valid	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
String	TokenNameIdentifier
action	TokenNameIdentifier
=	TokenNameEQUAL
getTask	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
VALID_ACTIONS	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
action	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
VALID_ACTIONS	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
valid	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
valid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE