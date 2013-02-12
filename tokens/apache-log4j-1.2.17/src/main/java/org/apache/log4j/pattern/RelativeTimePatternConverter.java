package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
pattern	TokenNameIdentifier
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
RelativeTimePatternConverter	TokenNameIdentifier
extends	TokenNameextends
LoggingEventPatternConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
CachedTimestamp	TokenNameIdentifier
lastTimestamp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CachedTimestamp	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
RelativeTimePatternConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
"Time"	TokenNameStringLiteral
,	TokenNameCOMMA
"time"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
RelativeTimePatternConverter	TokenNameIdentifier
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
options	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
RelativeTimePatternConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
format	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
StringBuffer	TokenNameIdentifier
toAppendTo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
timestamp	TokenNameIdentifier
=	TokenNameEQUAL
event	TokenNameIdentifier
.	TokenNameDOT
timeStamp	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
lastTimestamp	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
toAppendTo	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
formatted	TokenNameIdentifier
=	TokenNameEQUAL
Long	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
-	TokenNameMINUS
LoggingEvent	TokenNameIdentifier
.	TokenNameDOT
getStartTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
toAppendTo	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
formatted	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastTimestamp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CachedTimestamp	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
formatted	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
CachedTimestamp	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
long	TokenNamelong
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
formatted	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
CachedTimestamp	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
formatted	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
timestamp	TokenNameIdentifier
=	TokenNameEQUAL
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
formatted	TokenNameIdentifier
=	TokenNameEQUAL
formatted	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
format	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
newTimestamp	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
StringBuffer	TokenNameIdentifier
toAppendTo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
newTimestamp	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
toAppendTo	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
formatted	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
