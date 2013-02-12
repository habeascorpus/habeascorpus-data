import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
sql	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Log4JTest	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
Category	TokenNameIdentifier
cat	TokenNameIdentifier
=	TokenNameEQUAL
Category	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
Log4JTest	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
MyIDHandler	TokenNameIdentifier
idhandler	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MyIDHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Driver	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Driver	TokenNameIdentifier
)	TokenNameRPAREN
(	TokenNameLPAREN
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"oracle.jdbc.driver.OracleDriver"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DriverManager	TokenNameIdentifier
.	TokenNameDOT
registerDriver	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
cat	TokenNameIdentifier
.	TokenNameDOT
setPriority	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
.	TokenNameDOT
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
JDBCAppender	TokenNameIdentifier
ja	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JDBCAppender	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ja	TokenNameIdentifier
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
JDBCAppender	TokenNameIdentifier
.	TokenNameDOT
CONNECTOR_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
"MyConnectionHandler"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ja	TokenNameIdentifier
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
JDBCAppender	TokenNameIdentifier
.	TokenNameDOT
URL_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1521))(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1526)))(CONNECT_DATA=(SID=LENZI)))"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ja	TokenNameIdentifier
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
JDBCAppender	TokenNameIdentifier
.	TokenNameDOT
USERNAME_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
"mex_pr_dev60"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ja	TokenNameIdentifier
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
JDBCAppender	TokenNameIdentifier
.	TokenNameDOT
PASSWORD_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
"mex_pr_dev60"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ja	TokenNameIdentifier
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
JDBCAppender	TokenNameIdentifier
.	TokenNameDOT
TABLE_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
"logtest"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ja	TokenNameIdentifier
.	TokenNameDOT
setLogType	TokenNameIdentifier
(	TokenNameLPAREN
"id_seq"	TokenNameStringLiteral
,	TokenNameCOMMA
LogType	TokenNameIdentifier
.	TokenNameDOT
EMPTY	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ja	TokenNameIdentifier
.	TokenNameDOT
setLogType	TokenNameIdentifier
(	TokenNameLPAREN
"id"	TokenNameStringLiteral
,	TokenNameCOMMA
LogType	TokenNameIdentifier
.	TokenNameDOT
ID	TokenNameIdentifier
,	TokenNameCOMMA
idhandler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ja	TokenNameIdentifier
.	TokenNameDOT
setLogType	TokenNameIdentifier
(	TokenNameLPAREN
"msg"	TokenNameStringLiteral
,	TokenNameCOMMA
LogType	TokenNameIdentifier
.	TokenNameDOT
MSG	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ja	TokenNameIdentifier
.	TokenNameDOT
setLogType	TokenNameIdentifier
(	TokenNameLPAREN
"created_on"	TokenNameStringLiteral
,	TokenNameCOMMA
LogType	TokenNameIdentifier
.	TokenNameDOT
TIMESTAMP	TokenNameIdentifier
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ja	TokenNameIdentifier
.	TokenNameDOT
setLogType	TokenNameIdentifier
(	TokenNameLPAREN
"created_by"	TokenNameStringLiteral
,	TokenNameCOMMA
LogType	TokenNameIdentifier
.	TokenNameDOT
STATIC	TokenNameIdentifier
,	TokenNameCOMMA
"FEN"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cat	TokenNameIdentifier
.	TokenNameDOT
addAppender	TokenNameIdentifier
(	TokenNameLPAREN
ja	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cat	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"debug"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cat	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"info"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cat	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"error"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cat	TokenNameIdentifier
.	TokenNameDOT
fatal	TokenNameIdentifier
(	TokenNameLPAREN
"fatal"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
class	TokenNameclass
MyConnectionHandler	TokenNameIdentifier
implements	TokenNameimplements
JDBCConnectionHandler	TokenNameIdentifier
{	TokenNameLBRACE
Connection	TokenNameIdentifier
con	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
String	TokenNameIdentifier
url	TokenNameIdentifier
=	TokenNameEQUAL
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1521))(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1526)))(CONNECT_DATA=(SID=LENZI)))"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
username	TokenNameIdentifier
=	TokenNameEQUAL
"mex_pr_dev60"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
password	TokenNameIdentifier
=	TokenNameEQUAL
"mex_pr_dev60"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
Connection	TokenNameIdentifier
getConnection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getConnection	TokenNameIdentifier
(	TokenNameLPAREN
url	TokenNameIdentifier
,	TokenNameCOMMA
username	TokenNameIdentifier
,	TokenNameCOMMA
password	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Connection	TokenNameIdentifier
getConnection	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
_url	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
_username	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
_password	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
con	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
con	TokenNameIdentifier
.	TokenNameDOT
isClosed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
con	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
con	TokenNameIdentifier
=	TokenNameEQUAL
DriverManager	TokenNameIdentifier
.	TokenNameDOT
getConnection	TokenNameIdentifier
(	TokenNameLPAREN
_url	TokenNameIdentifier
,	TokenNameCOMMA
_username	TokenNameIdentifier
,	TokenNameCOMMA
_password	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
con	TokenNameIdentifier
.	TokenNameDOT
setAutoCommit	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
return	TokenNamereturn
con	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
class	TokenNameclass
MyIDHandler	TokenNameIdentifier
implements	TokenNameimplements
JDBCIDHandler	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
long	TokenNamelong
id	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
synchronized	TokenNamesynchronized
Object	TokenNameIdentifier
getID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Long	TokenNameIdentifier
(	TokenNameLPAREN
++	TokenNamePLUS_PLUS
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
