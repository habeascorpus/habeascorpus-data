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
ssh	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
jcraft	TokenNameIdentifier
.	TokenNameDOT
jsch	TokenNameIdentifier
.	TokenNameDOT
JSchException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
jcraft	TokenNameIdentifier
.	TokenNameDOT
jsch	TokenNameIdentifier
.	TokenNameDOT
Session	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
jcraft	TokenNameIdentifier
.	TokenNameDOT
jsch	TokenNameIdentifier
.	TokenNameDOT
JSch	TokenNameIdentifier
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
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
SSHBase	TokenNameIdentifier
extends	TokenNameextends
Task	TokenNameIdentifier
implements	TokenNameimplements
LogListener	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
SSH_PORT	TokenNameIdentifier
=	TokenNameEQUAL
22	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
host	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
knownHosts	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
port	TokenNameIdentifier
=	TokenNameEQUAL
SSH_PORT	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
failOnError	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
verbose	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SSHUserInfo	TokenNameIdentifier
userInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SSHBase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
userInfo	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SSHUserInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setHost	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
host	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
host	TokenNameIdentifier
=	TokenNameEQUAL
host	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getHost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
host	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setFailonerror	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
failure	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
failOnError	TokenNameIdentifier
=	TokenNameEQUAL
failure	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getFailonerror	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
failOnError	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setVerbose	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
verbose	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
verbose	TokenNameIdentifier
=	TokenNameEQUAL
verbose	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getVerbose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
verbose	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setUsername	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
username	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
userInfo	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
username	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPassword	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
password	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
userInfo	TokenNameIdentifier
.	TokenNameDOT
setPassword	TokenNameIdentifier
(	TokenNameLPAREN
password	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setKeyfile	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
keyfile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
userInfo	TokenNameIdentifier
.	TokenNameDOT
setKeyfile	TokenNameIdentifier
(	TokenNameLPAREN
keyfile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPassphrase	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
passphrase	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
userInfo	TokenNameIdentifier
.	TokenNameDOT
setPassphrase	TokenNameIdentifier
(	TokenNameLPAREN
passphrase	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setKnownhosts	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
knownHosts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
knownHosts	TokenNameIdentifier
=	TokenNameEQUAL
knownHosts	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setTrust	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
yesOrNo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
userInfo	TokenNameIdentifier
.	TokenNameDOT
setTrust	TokenNameIdentifier
(	TokenNameLPAREN
yesOrNo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPort	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
port	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
port	TokenNameIdentifier
=	TokenNameEQUAL
port	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getPort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
port	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
knownHosts	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"user.home"	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
"/.ssh/known_hosts"	TokenNameStringLiteral
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
port	TokenNameIdentifier
=	TokenNameEQUAL
SSH_PORT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Session	TokenNameIdentifier
openSession	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
JSchException	TokenNameIdentifier
{	TokenNameLBRACE
JSch	TokenNameIdentifier
jsch	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JSch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
SSHBase	TokenNameIdentifier
base	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
verbose	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
JSch	TokenNameIdentifier
.	TokenNameDOT
setLogger	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
com	TokenNameIdentifier
.	TokenNameDOT
jcraft	TokenNameIdentifier
.	TokenNameDOT
jsch	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isEnabled	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
level	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
log	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
level	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
message	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
base	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_INFO	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
userInfo	TokenNameIdentifier
.	TokenNameDOT
getKeyfile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
jsch	TokenNameIdentifier
.	TokenNameDOT
addIdentity	TokenNameIdentifier
(	TokenNameLPAREN
userInfo	TokenNameIdentifier
.	TokenNameDOT
getKeyfile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
userInfo	TokenNameIdentifier
.	TokenNameDOT
getTrust	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
knownHosts	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"Using known hosts: "	TokenNameStringLiteral
+	TokenNamePLUS
knownHosts	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jsch	TokenNameIdentifier
.	TokenNameDOT
setKnownHosts	TokenNameIdentifier
(	TokenNameLPAREN
knownHosts	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Session	TokenNameIdentifier
session	TokenNameIdentifier
=	TokenNameEQUAL
jsch	TokenNameIdentifier
.	TokenNameDOT
getSession	TokenNameIdentifier
(	TokenNameLPAREN
userInfo	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
host	TokenNameIdentifier
,	TokenNameCOMMA
port	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
session	TokenNameIdentifier
.	TokenNameDOT
setUserInfo	TokenNameIdentifier
(	TokenNameLPAREN
userInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
"Connecting to "	TokenNameStringLiteral
+	TokenNamePLUS
host	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
port	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
session	TokenNameIdentifier
.	TokenNameDOT
connect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
session	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
SSHUserInfo	TokenNameIdentifier
getUserInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
userInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
