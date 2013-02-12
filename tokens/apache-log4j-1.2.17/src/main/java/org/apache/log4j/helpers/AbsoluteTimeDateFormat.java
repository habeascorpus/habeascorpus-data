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
Date	TokenNameIdentifier
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
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
DateFormat	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
AbsoluteTimeDateFormat	TokenNameIdentifier
extends	TokenNameextends
DateFormat	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
388856345976723342L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
ABS_TIME_DATE_FORMAT	TokenNameIdentifier
=	TokenNameEQUAL
"ABSOLUTE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
DATE_AND_TIME_DATE_FORMAT	TokenNameIdentifier
=	TokenNameEQUAL
"DATE"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
ISO8601_DATE_FORMAT	TokenNameIdentifier
=	TokenNameEQUAL
"ISO8601"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
AbsoluteTimeDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
setCalendar	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AbsoluteTimeDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
TimeZone	TokenNameIdentifier
timeZone	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setCalendar	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
timeZone	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
long	TokenNamelong
previousTime	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
previousTimeWithoutMillis	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
9	TokenNameIntegerLiteral
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
previousTime	TokenNameIdentifier
||	TokenNameOR_OR
previousTimeWithoutMillis	TokenNameIdentifier
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
previousTimeWithoutMillis	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
previousTime	TokenNameIdentifier
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
previousTimeWithoutMillis	TokenNameIdentifier
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