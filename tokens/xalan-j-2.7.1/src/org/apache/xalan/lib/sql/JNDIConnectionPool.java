package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
lib	TokenNameIdentifier
.	TokenNameDOT
sql	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
sql	TokenNameIdentifier
.	TokenNameDOT
Connection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
sql	TokenNameIdentifier
.	TokenNameDOT
SQLException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
naming	TokenNameIdentifier
.	TokenNameDOT
InitialContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
naming	TokenNameIdentifier
.	TokenNameDOT
NamingException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JNDIConnectionPool	TokenNameIdentifier
implements	TokenNameimplements
ConnectionPool	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
Object	TokenNameIdentifier
jdbcSource	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
Method	TokenNameIdentifier
getConnectionWithArgs	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
Method	TokenNameIdentifier
getConnection	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
jndiPath	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
user	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
pwd	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
JNDIConnectionPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
JNDIConnectionPool	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
jndiDatasourcePath	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
jndiPath	TokenNameIdentifier
=	TokenNameEQUAL
jndiDatasourcePath	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setJndiPath	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
jndiPath	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
jndiPath	TokenNameIdentifier
=	TokenNameEQUAL
jndiPath	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getJndiPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
jndiPath	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDriver	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
d	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
Error	TokenNameIdentifier
(	TokenNameLPAREN
"This method is not supported. "	TokenNameStringLiteral
+	TokenNamePLUS
"All connection information is handled by the JDBC datasource provider"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setURL	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
url	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
Error	TokenNameIdentifier
(	TokenNameLPAREN
"This method is not supported. "	TokenNameStringLiteral
+	TokenNamePLUS
"All connection information is handled by the JDBC datasource provider"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
freeUnused	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasActiveConnections	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPassword	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
p	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
p	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
p	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
p	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
p	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
p	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
pwd	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setUser	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
u	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
u	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
u	TokenNameIdentifier
=	TokenNameEQUAL
u	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
u	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
u	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
u	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
user	TokenNameIdentifier
=	TokenNameEQUAL
u	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Connection	TokenNameIdentifier
getConnection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
SQLException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
jdbcSource	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
findDatasource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NamingException	TokenNameIdentifier
ne	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
SQLException	TokenNameIdentifier
(	TokenNameLPAREN
"Could not create jndi context for "	TokenNameStringLiteral
+	TokenNamePLUS
jndiPath	TokenNameIdentifier
+	TokenNamePLUS
" - "	TokenNameStringLiteral
+	TokenNamePLUS
ne	TokenNameIdentifier
.	TokenNameDOT
getLocalizedMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
user	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
pwd	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
arglist	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
{	TokenNameLBRACE
user	TokenNameIdentifier
,	TokenNameCOMMA
pwd	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
Connection	TokenNameIdentifier
)	TokenNameRPAREN
getConnectionWithArgs	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
jdbcSource	TokenNameIdentifier
,	TokenNameCOMMA
arglist	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
Object	TokenNameIdentifier
arglist	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
{	TokenNameLBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
Connection	TokenNameIdentifier
)	TokenNameRPAREN
getConnection	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
jdbcSource	TokenNameIdentifier
,	TokenNameCOMMA
arglist	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
SQLException	TokenNameIdentifier
(	TokenNameLPAREN
"Could not create jndi connection for "	TokenNameStringLiteral
+	TokenNamePLUS
jndiPath	TokenNameIdentifier
+	TokenNamePLUS
" - "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
.	TokenNameDOT
getLocalizedMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
findDatasource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
NamingException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
InitialContext	TokenNameIdentifier
context	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
InitialContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
jdbcSource	TokenNameIdentifier
=	TokenNameEQUAL
context	TokenNameIdentifier
.	TokenNameDOT
lookup	TokenNameIdentifier
(	TokenNameLPAREN
jndiPath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
withArgs	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
{	TokenNameLBRACE
String	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
String	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
}	TokenNameRBRACE
;	TokenNameSEMICOLON
getConnectionWithArgs	TokenNameIdentifier
=	TokenNameEQUAL
jdbcSource	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDeclaredMethod	TokenNameIdentifier
(	TokenNameLPAREN
"getConnection"	TokenNameStringLiteral
,	TokenNameCOMMA
withArgs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Class	TokenNameIdentifier
noArgs	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
{	TokenNameLBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
getConnection	TokenNameIdentifier
=	TokenNameEQUAL
jdbcSource	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDeclaredMethod	TokenNameIdentifier
(	TokenNameLPAREN
"getConnection"	TokenNameStringLiteral
,	TokenNameCOMMA
noArgs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NamingException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoSuchMethodException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NamingException	TokenNameIdentifier
(	TokenNameLPAREN
"Unable to resolve JNDI DataSource - "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
releaseConnection	TokenNameIdentifier
(	TokenNameLPAREN
Connection	TokenNameIdentifier
con	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SQLException	TokenNameIdentifier
{	TokenNameLBRACE
con	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
releaseConnectionOnError	TokenNameIdentifier
(	TokenNameLPAREN
Connection	TokenNameIdentifier
con	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SQLException	TokenNameIdentifier
{	TokenNameLBRACE
con	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPoolEnabled	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
flag	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
flag	TokenNameIdentifier
)	TokenNameRPAREN
jdbcSource	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setProtocol	TokenNameIdentifier
(	TokenNameLPAREN
Properties	TokenNameIdentifier
p	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setMinConnections	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
testConnection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
jdbcSource	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
findDatasource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NamingException	TokenNameIdentifier
ne	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE