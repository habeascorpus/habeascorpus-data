package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
varia	TokenNameIdentifier
.	TokenNameDOT
test	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
varia	TokenNameIdentifier
.	TokenNameDOT
JDBCAppender	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JDBCTest	TokenNameIdentifier
{	TokenNameLBRACE
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
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"sun.jdbc.odbc.JdbcOdbcDriver"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Category	TokenNameIdentifier
rootLog	TokenNameIdentifier
=	TokenNameEQUAL
Category	TokenNameIdentifier
.	TokenNameDOT
getRoot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Layout	TokenNameIdentifier
layout	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PatternLayout	TokenNameIdentifier
(	TokenNameLPAREN
"%p [%t] %c - %m%n"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
JDBCAppender	TokenNameIdentifier
appender	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JDBCAppender	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
appender	TokenNameIdentifier
.	TokenNameDOT
setLayout	TokenNameIdentifier
(	TokenNameLPAREN
layout	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
appender	TokenNameIdentifier
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
JDBCAppender	TokenNameIdentifier
.	TokenNameDOT
URL_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
"jdbc:odbc:someDB"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
appender	TokenNameIdentifier
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
JDBCAppender	TokenNameIdentifier
.	TokenNameDOT
USER_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
"auser"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
appender	TokenNameIdentifier
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
JDBCAppender	TokenNameIdentifier
.	TokenNameDOT
PASSWORD_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
"thepassword"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rootLog	TokenNameIdentifier
.	TokenNameDOT
addAppender	TokenNameIdentifier
(	TokenNameLPAREN
appender	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Category	TokenNameIdentifier
log	TokenNameIdentifier
=	TokenNameEQUAL
Category	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
"main"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Debug 1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"info 1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"warn 1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"error 1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
fatal	TokenNameIdentifier
(	TokenNameLPAREN
"fatal 1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
appender	TokenNameIdentifier
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
JDBCAppender	TokenNameIdentifier
.	TokenNameDOT
BUFFER_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
"5"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Debug 2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"info 2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"warn 2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"error 2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
fatal	TokenNameIdentifier
(	TokenNameLPAREN
"fatal 2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
appender	TokenNameIdentifier
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
JDBCAppender	TokenNameIdentifier
.	TokenNameDOT
BUFFER_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
"2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
appender	TokenNameIdentifier
.	TokenNameDOT
setThreshold	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
.	TokenNameDOT
WARN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Debug 3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"info 3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"warn 3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"error 3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
sleep	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
.	TokenNameDOT
fatal	TokenNameIdentifier
(	TokenNameLPAREN
"fatal 3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Interrupted"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
