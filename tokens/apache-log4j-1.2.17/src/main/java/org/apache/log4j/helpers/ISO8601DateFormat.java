package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Calendar	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
TimeZone	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Date	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
FieldPosition	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
ParsePosition	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ISO8601DateFormat	TokenNameIdentifier
extends	TokenNameextends
AbsoluteTimeDateFormat	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
759840745298755296L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
ISO8601DateFormat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ISO8601DateFormat	TokenNameIdentifier
(	TokenNameLPAREN
TimeZone	TokenNameIdentifier
timeZone	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
timeZone	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
private	TokenNameprivate
long	TokenNamelong
lastTime	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
private	TokenNameprivate
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lastTimeString	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
20	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
public	TokenNamepublic
StringBuffer	TokenNameIdentifier
format	TokenNameIdentifier
(	TokenNameLPAREN
Date	TokenNameIdentifier
date	TokenNameIdentifier
,	TokenNameCOMMA
StringBuffer	TokenNameIdentifier
sbuf	TokenNameIdentifier
,	TokenNameCOMMA
FieldPosition	TokenNameIdentifier
fieldPosition	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
now	TokenNameIdentifier
=	TokenNameEQUAL
date	TokenNameIdentifier
.	TokenNameDOT
getTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
millis	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
now	TokenNameIdentifier
%	TokenNameREMAINDER
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
now	TokenNameIdentifier
-	TokenNameMINUS
millis	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
lastTime	TokenNameIdentifier
||	TokenNameOR_OR
lastTimeString	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
calendar	TokenNameIdentifier
.	TokenNameDOT
setTime	TokenNameIdentifier
(	TokenNameLPAREN
date	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
start	TokenNameIdentifier
=	TokenNameEQUAL
sbuf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
year	TokenNameIdentifier
=	TokenNameEQUAL
calendar	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
YEAR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
year	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
month	TokenNameIdentifier
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
calendar	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
MONTH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
JANUARY	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-01-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
FEBRUARY	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-02-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
MARCH	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-03-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
APRIL	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-04-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
MAY	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-05-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
JUNE	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-06-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
JULY	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-07-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
AUGUST	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-08-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
SEPTEMBER	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-09-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
OCTOBER	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-10-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
NOVEMBER	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-11-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Calendar	TokenNameIdentifier
.	TokenNameDOT
DECEMBER	TokenNameIdentifier
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-12-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
month	TokenNameIdentifier
=	TokenNameEQUAL
"-NA-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
month	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
day	TokenNameIdentifier
=	TokenNameEQUAL
calendar	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
DAY_OF_MONTH	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
day	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
day	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
' '	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
hour	TokenNameIdentifier
=	TokenNameEQUAL
calendar	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
HOUR_OF_DAY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hour	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
hour	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
':'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
mins	TokenNameIdentifier
=	TokenNameEQUAL
calendar	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
MINUTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
mins	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
mins	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
':'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
secs	TokenNameIdentifier
=	TokenNameEQUAL
calendar	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
SECOND	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
secs	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
secs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
','	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
getChars	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
,	TokenNameCOMMA
sbuf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
lastTimeString	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastTime	TokenNameIdentifier
=	TokenNameEQUAL
now	TokenNameIdentifier
-	TokenNameMINUS
millis	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
lastTimeString	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
millis	TokenNameIdentifier
<	TokenNameLESS
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
millis	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
millis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sbuf	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Date	TokenNameIdentifier
parse	TokenNameIdentifier
(	TokenNameLPAREN
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
String	TokenNameIdentifier
s	TokenNameIdentifier
,	TokenNameCOMMA
ParsePosition	TokenNameIdentifier
pos	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
