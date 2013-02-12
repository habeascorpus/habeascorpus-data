package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
InetAddress	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
TimeUnit	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
TimeoutException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
atomic	TokenNameIdentifier
.	TokenNameDOT
AtomicBoolean	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
locks	TokenNameIdentifier
.	TokenNameDOT
Condition	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
locks	TokenNameIdentifier
.	TokenNameDOT
Lock	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
locks	TokenNameIdentifier
.	TokenNameDOT
ReentrantLock	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
AsyncResult	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
implements	TokenNameimplements
IAsyncResult	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
private	TokenNameprivate
T	TokenNameIdentifier
result	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
AtomicBoolean	TokenNameIdentifier
done	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AtomicBoolean	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Lock	TokenNameIdentifier
lock	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ReentrantLock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Condition	TokenNameIdentifier
condition	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
long	TokenNamelong
startTime	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
InetAddress	TokenNameIdentifier
from	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
AsyncResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
condition	TokenNameIdentifier
=	TokenNameEQUAL
lock	TokenNameIdentifier
.	TokenNameDOT
newCondition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
startTime	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
T	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
timeout	TokenNameIdentifier
,	TokenNameCOMMA
TimeUnit	TokenNameIdentifier
tu	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TimeoutException	TokenNameIdentifier
{	TokenNameLBRACE
lock	TokenNameIdentifier
.	TokenNameDOT
lock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
boolean	TokenNameboolean
bVal	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
done	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
timeout	TokenNameIdentifier
=	TokenNameEQUAL
TimeUnit	TokenNameIdentifier
.	TokenNameDOT
MILLISECONDS	TokenNameIdentifier
.	TokenNameDOT
convert	TokenNameIdentifier
(	TokenNameLPAREN
timeout	TokenNameIdentifier
,	TokenNameCOMMA
tu	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
overall_timeout	TokenNameIdentifier
=	TokenNameEQUAL
timeout	TokenNameIdentifier
-	TokenNameMINUS
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
startTime	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bVal	TokenNameIdentifier
=	TokenNameEQUAL
overall_timeout	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
condition	TokenNameIdentifier
.	TokenNameDOT
await	TokenNameIdentifier
(	TokenNameLPAREN
overall_timeout	TokenNameIdentifier
,	TokenNameCOMMA
TimeUnit	TokenNameIdentifier
.	TokenNameDOT
MILLISECONDS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
AssertionError	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
bVal	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
done	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
TimeoutException	TokenNameIdentifier
(	TokenNameLPAREN
"Operation timed out."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
lock	TokenNameIdentifier
.	TokenNameDOT
unlock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
result	TokenNameIdentifier
(	TokenNameLPAREN
MessageIn	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
response	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
lock	TokenNameIdentifier
.	TokenNameDOT
lock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
done	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
from	TokenNameIdentifier
=	TokenNameEQUAL
response	TokenNameIdentifier
.	TokenNameDOT
from	TokenNameIdentifier
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
response	TokenNameIdentifier
.	TokenNameDOT
payload	TokenNameIdentifier
;	TokenNameSEMICOLON
done	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
condition	TokenNameIdentifier
.	TokenNameDOT
signal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
lock	TokenNameIdentifier
.	TokenNameDOT
unlock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isLatencyForSnitch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InetAddress	TokenNameIdentifier
getFrom	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
from	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
