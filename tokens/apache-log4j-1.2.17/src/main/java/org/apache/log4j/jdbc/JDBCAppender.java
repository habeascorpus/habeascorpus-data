package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
jdbc	TokenNameIdentifier
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
DriverManager	TokenNameIdentifier
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
sql	TokenNameIdentifier
.	TokenNameDOT
Statement	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
PatternLayout	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
.	TokenNameDOT
ErrorCode	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
.	TokenNameDOT
LoggingEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JDBCAppender	TokenNameIdentifier
extends	TokenNameextends
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
AppenderSkeleton	TokenNameIdentifier
implements	TokenNameimplements
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Appender	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
databaseURL	TokenNameIdentifier
=	TokenNameEQUAL
"jdbc:odbc:myDB"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
databaseUser	TokenNameIdentifier
=	TokenNameEQUAL
"me"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
databasePassword	TokenNameIdentifier
=	TokenNameEQUAL
"mypassword"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
Connection	TokenNameIdentifier
connection	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
sqlStatement	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
bufferSize	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
ArrayList	TokenNameIdentifier
buffer	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
ArrayList	TokenNameIdentifier
removes	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
locationInfo	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
JDBCAppender	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
bufferSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
removes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
bufferSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getLocationInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
locationInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLocationInfo	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
boolean	TokenNameboolean
flag	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
locationInfo	TokenNameIdentifier
=	TokenNameEQUAL
flag	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
append	TokenNameIdentifier
(	TokenNameLPAREN
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
event	TokenNameIdentifier
.	TokenNameDOT
getNDC	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
event	TokenNameIdentifier
.	TokenNameDOT
getThreadName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
event	TokenNameIdentifier
.	TokenNameDOT
getMDCCopy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
locationInfo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
event	TokenNameIdentifier
.	TokenNameDOT
getLocationInformation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
event	TokenNameIdentifier
.	TokenNameDOT
getRenderedMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
event	TokenNameIdentifier
.	TokenNameDOT
getThrowableStrRep	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
bufferSize	TokenNameIdentifier
)	TokenNameRPAREN
flushBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
getLogStatement	TokenNameIdentifier
(	TokenNameLPAREN
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
sql	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SQLException	TokenNameIdentifier
{	TokenNameLBRACE
Connection	TokenNameIdentifier
con	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
Statement	TokenNameIdentifier
stmt	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
con	TokenNameIdentifier
=	TokenNameEQUAL
getConnection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stmt	TokenNameIdentifier
=	TokenNameEQUAL
con	TokenNameIdentifier
.	TokenNameDOT
createStatement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stmt	TokenNameIdentifier
.	TokenNameDOT
executeUpdate	TokenNameIdentifier
(	TokenNameLPAREN
sql	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
stmt	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
stmt	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
closeConnection	TokenNameIdentifier
(	TokenNameLPAREN
con	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
closeConnection	TokenNameIdentifier
(	TokenNameLPAREN
Connection	TokenNameIdentifier
con	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
Connection	TokenNameIdentifier
getConnection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
SQLException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
DriverManager	TokenNameIdentifier
.	TokenNameDOT
getDrivers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
setDriver	TokenNameIdentifier
(	TokenNameLPAREN
"sun.jdbc.odbc.JdbcOdbcDriver"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
connection	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
connection	TokenNameIdentifier
=	TokenNameEQUAL
DriverManager	TokenNameIdentifier
.	TokenNameDOT
getConnection	TokenNameIdentifier
(	TokenNameLPAREN
databaseURL	TokenNameIdentifier
,	TokenNameCOMMA
databaseUser	TokenNameIdentifier
,	TokenNameCOMMA
databasePassword	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
connection	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
flushBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
connection	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
connection	TokenNameIdentifier
.	TokenNameDOT
isClosed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
connection	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SQLException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
errorHandler	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Error closing connection"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
,	TokenNameCOMMA
ErrorCode	TokenNameIdentifier
.	TokenNameDOT
GENERIC_FAILURE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
closed	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
flushBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
removes	TokenNameIdentifier
.	TokenNameDOT
ensureCapacity	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
i	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
LoggingEvent	TokenNameIdentifier
logEvent	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
LoggingEvent	TokenNameIdentifier
)	TokenNameRPAREN
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
String	TokenNameIdentifier
sql	TokenNameIdentifier
=	TokenNameEQUAL
getLogStatement	TokenNameIdentifier
(	TokenNameLPAREN
logEvent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
execute	TokenNameIdentifier
(	TokenNameLPAREN
sql	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SQLException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
errorHandler	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Failed to excute sql"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
,	TokenNameCOMMA
ErrorCode	TokenNameIdentifier
.	TokenNameDOT
FLUSH_FAILURE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
removes	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
logEvent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
removeAll	TokenNameIdentifier
(	TokenNameLPAREN
removes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
removes	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
finalize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
requiresLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSql	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sqlStatement	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
getLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
setLayout	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PatternLayout	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
(	TokenNameLPAREN
(	TokenNameLPAREN
PatternLayout	TokenNameIdentifier
)	TokenNameRPAREN
getLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setConversionPattern	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getSql	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
sqlStatement	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setUser	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
user	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
databaseUser	TokenNameIdentifier
=	TokenNameEQUAL
user	TokenNameIdentifier
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
databaseURL	TokenNameIdentifier
=	TokenNameEQUAL
url	TokenNameIdentifier
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
databasePassword	TokenNameIdentifier
=	TokenNameEQUAL
password	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setBufferSize	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
newBufferSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
bufferSize	TokenNameIdentifier
=	TokenNameEQUAL
newBufferSize	TokenNameIdentifier
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
ensureCapacity	TokenNameIdentifier
(	TokenNameLPAREN
bufferSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
removes	TokenNameIdentifier
.	TokenNameDOT
ensureCapacity	TokenNameIdentifier
(	TokenNameLPAREN
bufferSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getUser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
databaseUser	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
databaseURL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getPassword	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
databasePassword	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getBufferSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
bufferSize	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDriver	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
driverClass	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
driverClass	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
errorHandler	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Failed to load driver"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
,	TokenNameCOMMA
ErrorCode	TokenNameIdentifier
.	TokenNameDOT
GENERIC_FAILURE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE