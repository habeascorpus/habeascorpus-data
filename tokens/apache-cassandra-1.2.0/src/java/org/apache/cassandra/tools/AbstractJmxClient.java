package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Closeable	TokenNameIdentifier
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
PrintStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
management	TokenNameIdentifier
.	TokenNameDOT
MBeanServerConnection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
management	TokenNameIdentifier
.	TokenNameDOT
remote	TokenNameIdentifier
.	TokenNameDOT
JMXConnector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
management	TokenNameIdentifier
.	TokenNameDOT
remote	TokenNameIdentifier
.	TokenNameDOT
JMXConnectorFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
management	TokenNameIdentifier
.	TokenNameDOT
remote	TokenNameIdentifier
.	TokenNameDOT
JMXServiceURL	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
CommandLine	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
CommandLineParser	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
Option	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
Options	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
ParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
PosixParser	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AbstractJmxClient	TokenNameIdentifier
implements	TokenNameimplements
Closeable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Options	TokenNameIdentifier
options	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Options	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_JMX_PORT	TokenNameIdentifier
=	TokenNameEQUAL
7199	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_HOST	TokenNameIdentifier
=	TokenNameEQUAL
"localhost"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
String	TokenNameIdentifier
host	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
int	TokenNameint
port	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
JMXConnection	TokenNameIdentifier
jmxConn	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
PrintStream	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
"h"	TokenNameStringLiteral
,	TokenNameCOMMA
"host"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
"JMX hostname or IP address (Default: localhost)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
"p"	TokenNameStringLiteral
,	TokenNameCOMMA
"port"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
"JMX port number (Default: 7199)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
"H"	TokenNameStringLiteral
,	TokenNameCOMMA
"help"	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
"Print help information"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AbstractJmxClient	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
host	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
port	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
username	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
password	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
host	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
host	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
host	TokenNameIdentifier
:	TokenNameCOLON
DEFAULT_HOST	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
port	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
port	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
port	TokenNameIdentifier
:	TokenNameCOLON
DEFAULT_JMX_PORT	TokenNameIdentifier
;	TokenNameSEMICOLON
jmxConn	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JMXConnection	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
host	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
port	TokenNameIdentifier
,	TokenNameCOMMA
username	TokenNameIdentifier
,	TokenNameCOMMA
password	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
jmxConn	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
writeln	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
err	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
writeln	TokenNameIdentifier
(	TokenNameLPAREN
err	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
writeln	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
write	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
writeln	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
format	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
...	TokenNameELLIPSIS
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
write	TokenNameIdentifier
(	TokenNameLPAREN
format	TokenNameIdentifier
+	TokenNamePLUS
"%n"	TokenNameStringLiteral
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
write	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
format	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
...	TokenNameELLIPSIS
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
printf	TokenNameIdentifier
(	TokenNameLPAREN
format	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOutput	TokenNameIdentifier
(	TokenNameLPAREN
PrintStream	TokenNameIdentifier
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
static	TokenNamestatic
CommandLine	TokenNameIdentifier
processArguments	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
CommandLineParser	TokenNameIdentifier
parser	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PosixParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
parser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
addCmdOption	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
shortOpt	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
longOpt	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
hasArg	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
description	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
shortOpt	TokenNameIdentifier
,	TokenNameCOMMA
longOpt	TokenNameIdentifier
,	TokenNameCOMMA
hasArg	TokenNameIdentifier
,	TokenNameCOMMA
description	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
printHelp	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
synopsis	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
header	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
printf	TokenNameIdentifier
(	TokenNameLPAREN
"Usage: %s%n%n"	TokenNameStringLiteral
,	TokenNameCOMMA
synopsis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
header	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Options:"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Object	TokenNameIdentifier
opt	TokenNameIdentifier
:	TokenNameCOLON
options	TokenNameIdentifier
.	TokenNameDOT
getOptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
shortOpt	TokenNameIdentifier
=	TokenNameEQUAL
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"%s,"	TokenNameStringLiteral
,	TokenNameCOMMA
(	TokenNameLPAREN
(	TokenNameLPAREN
Option	TokenNameIdentifier
)	TokenNameRPAREN
opt	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getOpt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
longOpt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Option	TokenNameIdentifier
)	TokenNameRPAREN
opt	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
description	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Option	TokenNameIdentifier
)	TokenNameRPAREN
opt	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getDescription	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
printf	TokenNameIdentifier
(	TokenNameLPAREN
" -%-4s --%-17s %s%n"	TokenNameStringLiteral
,	TokenNameCOMMA
shortOpt	TokenNameIdentifier
,	TokenNameCOMMA
longOpt	TokenNameIdentifier
,	TokenNameCOMMA
description	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
class	TokenNameclass
JMXConnection	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
FMT_URL	TokenNameIdentifier
=	TokenNameEQUAL
"service:jmx:rmi:///jndi/rmi://%s:%d/jmxrmi"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
host	TokenNameIdentifier
,	TokenNameCOMMA
username	TokenNameIdentifier
,	TokenNameCOMMA
password	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
port	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
JMXConnector	TokenNameIdentifier
jmxc	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
MBeanServerConnection	TokenNameIdentifier
mbeanServerConn	TokenNameIdentifier
;	TokenNameSEMICOLON
JMXConnection	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
host	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
port	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
host	TokenNameIdentifier
,	TokenNameCOMMA
port	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
JMXConnection	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
host	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
port	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
username	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
password	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
host	TokenNameIdentifier
=	TokenNameEQUAL
host	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
port	TokenNameIdentifier
=	TokenNameEQUAL
port	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
username	TokenNameIdentifier
=	TokenNameEQUAL
username	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
password	TokenNameIdentifier
=	TokenNameEQUAL
password	TokenNameIdentifier
;	TokenNameSEMICOLON
connect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
connect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
JMXServiceURL	TokenNameIdentifier
jmxUrl	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JMXServiceURL	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
FMT_URL	TokenNameIdentifier
,	TokenNameCOMMA
host	TokenNameIdentifier
,	TokenNameCOMMA
port	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
env	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
username	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
env	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
JMXConnector	TokenNameIdentifier
.	TokenNameDOT
CREDENTIALS	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
username	TokenNameIdentifier
,	TokenNameCOMMA
password	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jmxc	TokenNameIdentifier
=	TokenNameEQUAL
JMXConnectorFactory	TokenNameIdentifier
.	TokenNameDOT
connect	TokenNameIdentifier
(	TokenNameLPAREN
jmxUrl	TokenNameIdentifier
,	TokenNameCOMMA
env	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mbeanServerConn	TokenNameIdentifier
=	TokenNameEQUAL
jmxc	TokenNameIdentifier
.	TokenNameDOT
getMBeanServerConnection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
jmxc	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MBeanServerConnection	TokenNameIdentifier
getMbeanServerConn	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
mbeanServerConn	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
