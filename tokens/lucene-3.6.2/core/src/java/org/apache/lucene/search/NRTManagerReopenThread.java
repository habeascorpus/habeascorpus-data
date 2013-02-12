package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ThreadInterruptedException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
NRTManagerReopenThread	TokenNameIdentifier
extends	TokenNameextends
Thread	TokenNameIdentifier
implements	TokenNameimplements
NRTManager	TokenNameIdentifier
.	TokenNameDOT
WaitingListener	TokenNameIdentifier
,	TokenNameCOMMA
Closeable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
NRTManager	TokenNameIdentifier
manager	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
long	TokenNamelong
targetMaxStaleNS	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
long	TokenNamelong
targetMinStaleNS	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
finish	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
waitingGen	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
NRTManagerReopenThread	TokenNameIdentifier
(	TokenNameLPAREN
NRTManager	TokenNameIdentifier
manager	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
targetMaxStaleSec	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
targetMinStaleSec	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
targetMaxStaleSec	TokenNameIdentifier
<	TokenNameLESS
targetMinStaleSec	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"targetMaxScaleSec (= "	TokenNameStringLiteral
+	TokenNamePLUS
targetMaxStaleSec	TokenNameIdentifier
+	TokenNamePLUS
") < targetMinStaleSec (="	TokenNameStringLiteral
+	TokenNamePLUS
targetMinStaleSec	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
manager	TokenNameIdentifier
=	TokenNameEQUAL
manager	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
targetMaxStaleNS	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
long	TokenNamelong
)	TokenNameRPAREN
(	TokenNameLPAREN
1000000000	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
targetMaxStaleSec	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
targetMinStaleNS	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
long	TokenNamelong
)	TokenNameRPAREN
(	TokenNameLPAREN
1000000000	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
targetMinStaleSec	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
manager	TokenNameIdentifier
.	TokenNameDOT
addWaitingListener	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
manager	TokenNameIdentifier
.	TokenNameDOT
removeWaitingListener	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
finish	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
notify	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
join	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
ie	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ThreadInterruptedException	TokenNameIdentifier
(	TokenNameLPAREN
ie	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
waiting	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
targetGen	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
waitingGen	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
waitingGen	TokenNameIdentifier
,	TokenNameCOMMA
targetGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
notify	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
lastReopenStartNS	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
nanoTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
hasWaiting	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
!	TokenNameNOT
finish	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
hasWaiting	TokenNameIdentifier
=	TokenNameEQUAL
waitingGen	TokenNameIdentifier
>	TokenNameGREATER
manager	TokenNameIdentifier
.	TokenNameDOT
getCurrentSearchingGen	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
long	TokenNamelong
nextReopenStartNS	TokenNameIdentifier
=	TokenNameEQUAL
lastReopenStartNS	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
hasWaiting	TokenNameIdentifier
?	TokenNameQUESTION
targetMinStaleNS	TokenNameIdentifier
:	TokenNameCOLON
targetMaxStaleNS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
long	TokenNamelong
sleepNS	TokenNameIdentifier
=	TokenNameEQUAL
nextReopenStartNS	TokenNameIdentifier
-	TokenNameMINUS
System	TokenNameIdentifier
.	TokenNameDOT
nanoTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sleepNS	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
wait	TokenNameIdentifier
(	TokenNameLPAREN
sleepNS	TokenNameIdentifier
/	TokenNameDIVIDE
1000000	TokenNameIntegerLiteral
,	TokenNameCOMMA
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
sleepNS	TokenNameIdentifier
%	TokenNameREMAINDER
1000000	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
ie	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
interrupt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
finish	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
finish	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
lastReopenStartNS	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
nanoTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
manager	TokenNameIdentifier
.	TokenNameDOT
maybeRefresh	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
ioe	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE