package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
tasks	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
LinkedHashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
PerfRunData	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
stats	TokenNameIdentifier
.	TokenNameDOT
Report	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
stats	TokenNameIdentifier
.	TokenNameDOT
TaskStats	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
Format	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
ReportTask	TokenNameIdentifier
extends	TokenNameextends
PerfTask	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
ReportTask	TokenNameIdentifier
(	TokenNameLPAREN
PerfRunData	TokenNameIdentifier
runData	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
runData	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
boolean	TokenNameboolean
shouldNeverLogAtStart	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
boolean	TokenNameboolean
shouldNotRecordStats	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
newline	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"line.separator"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
OP	TokenNameIdentifier
=	TokenNameEQUAL
"Operation  "	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ROUND	TokenNameIdentifier
=	TokenNameEQUAL
" round"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
RUNCNT	TokenNameIdentifier
=	TokenNameEQUAL
"   runCnt"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
RECCNT	TokenNameIdentifier
=	TokenNameEQUAL
"   recsPerRun"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
RECSEC	TokenNameIdentifier
=	TokenNameEQUAL
"        rec/s"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ELAPSED	TokenNameIdentifier
=	TokenNameEQUAL
"  elapsedSec"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
USEDMEM	TokenNameIdentifier
=	TokenNameEQUAL
"    avgUsedMem"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
TOTMEM	TokenNameIdentifier
=	TokenNameEQUAL
"    avgTotalMem"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
COLS	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
{	TokenNameLBRACE
RUNCNT	TokenNameIdentifier
,	TokenNameCOMMA
RECCNT	TokenNameIdentifier
,	TokenNameCOMMA
RECSEC	TokenNameIdentifier
,	TokenNameCOMMA
ELAPSED	TokenNameIdentifier
,	TokenNameCOMMA
USEDMEM	TokenNameIdentifier
,	TokenNameCOMMA
TOTMEM	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
tableTitle	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
longestOp	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
Format	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
OP	TokenNameIdentifier
,	TokenNameCOMMA
longestOp	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
ROUND	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getRunData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getColsNamesForValsByRound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
COLS	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
COLS	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
longestOp	TokenNameIdentifier
(	TokenNameLPAREN
Iterable	TokenNameIdentifier
<	TokenNameLESS
TaskStats	TokenNameIdentifier
>	TokenNameGREATER
taskStats	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
longest	TokenNameIdentifier
=	TokenNameEQUAL
OP	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
final	TokenNamefinal
TaskStats	TokenNameIdentifier
stat	TokenNameIdentifier
:	TokenNameCOLON
taskStats	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
stat	TokenNameIdentifier
.	TokenNameDOT
getElapsed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
stat	TokenNameIdentifier
.	TokenNameDOT
getTask	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
longest	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
longest	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
longest	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
taskReportLine	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
longestOp	TokenNameIdentifier
,	TokenNameCOMMA
TaskStats	TokenNameIdentifier
stat	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
PerfTask	TokenNameIdentifier
task	TokenNameIdentifier
=	TokenNameEQUAL
stat	TokenNameIdentifier
.	TokenNameDOT
getTask	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
Format	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
task	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
longestOp	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
round	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
stat	TokenNameIdentifier
.	TokenNameDOT
getRound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
""	TokenNameStringLiteral
+	TokenNamePLUS
stat	TokenNameIdentifier
.	TokenNameDOT
getRound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
"-"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
Format	TokenNameIdentifier
.	TokenNameDOT
formatPaddLeft	TokenNameIdentifier
(	TokenNameLPAREN
round	TokenNameIdentifier
,	TokenNameCOMMA
ROUND	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getRunData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getColsValuesForValsByRound	TokenNameIdentifier
(	TokenNameLPAREN
stat	TokenNameIdentifier
.	TokenNameDOT
getRound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
Format	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
stat	TokenNameIdentifier
.	TokenNameDOT
getNumRuns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
RUNCNT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
Format	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
stat	TokenNameIdentifier
.	TokenNameDOT
getCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
stat	TokenNameIdentifier
.	TokenNameDOT
getNumRuns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
RECCNT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
elapsed	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
stat	TokenNameIdentifier
.	TokenNameDOT
getElapsed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
stat	TokenNameIdentifier
.	TokenNameDOT
getElapsed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
Format	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
stat	TokenNameIdentifier
.	TokenNameDOT
getCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
1000.0	TokenNameDoubleLiteral
/	TokenNameDIVIDE
elapsed	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
RECSEC	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
Format	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
stat	TokenNameIdentifier
.	TokenNameDOT
getElapsed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
1000	TokenNameIntegerLiteral
,	TokenNameCOMMA
ELAPSED	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
Format	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
stat	TokenNameIdentifier
.	TokenNameDOT
getMaxUsedMem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
stat	TokenNameIdentifier
.	TokenNameDOT
getNumRuns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
USEDMEM	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
Format	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
stat	TokenNameIdentifier
.	TokenNameDOT
getMaxTotMem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
stat	TokenNameIdentifier
.	TokenNameDOT
getNumRuns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
TOTMEM	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Report	TokenNameIdentifier
genPartialReport	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
reported	TokenNameIdentifier
,	TokenNameCOMMA
LinkedHashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
TaskStats	TokenNameIdentifier
>	TokenNameGREATER
partOfTasks	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
totalSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
longetOp	TokenNameIdentifier
=	TokenNameEQUAL
longestOp	TokenNameIdentifier
(	TokenNameLPAREN
partOfTasks	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
first	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
tableTitle	TokenNameIdentifier
(	TokenNameLPAREN
longetOp	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
newline	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
lineNum	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
final	TokenNamefinal
TaskStats	TokenNameIdentifier
stat	TokenNameIdentifier
:	TokenNameCOLON
partOfTasks	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
first	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
newline	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
first	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
String	TokenNameIdentifier
line	TokenNameIdentifier
=	TokenNameEQUAL
taskReportLine	TokenNameIdentifier
(	TokenNameLPAREN
longetOp	TokenNameIdentifier
,	TokenNameCOMMA
stat	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lineNum	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
partOfTasks	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
2	TokenNameIntegerLiteral
&&	TokenNameAND_AND
lineNum	TokenNameIdentifier
%	TokenNameREMAINDER
2	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
line	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
replaceAll	TokenNameIdentifier
(	TokenNameLPAREN
"   "	TokenNameStringLiteral
,	TokenNameCOMMA
" - "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
byTime	TokenNameIdentifier
=	TokenNameEQUAL
stat	TokenNameIdentifier
.	TokenNameDOT
getCountsByTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
byTime	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
newline	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
end	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
byTime	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
byTime	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
end	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
end	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"  by time:"	TokenNameStringLiteral
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
end	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
' '	TokenNameCharacterLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
byTime	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
String	TokenNameIdentifier
reptxt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
reported	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
"No Matching Entries Were Found!"	TokenNameStringLiteral
:	TokenNameCOLON
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
Report	TokenNameIdentifier
(	TokenNameLPAREN
reptxt	TokenNameIdentifier
,	TokenNameCOMMA
partOfTasks	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
reported	TokenNameIdentifier
,	TokenNameCOMMA
totalSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE