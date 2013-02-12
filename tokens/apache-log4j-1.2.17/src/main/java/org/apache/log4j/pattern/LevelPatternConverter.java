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
Level	TokenNameIdentifier
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
final	TokenNamefinal
class	TokenNameclass
LevelPatternConverter	TokenNameIdentifier
extends	TokenNameextends
LoggingEventPatternConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TRACE_INT	TokenNameIdentifier
=	TokenNameEQUAL
5000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
LevelPatternConverter	TokenNameIdentifier
INSTANCE	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LevelPatternConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
LevelPatternConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
"Level"	TokenNameStringLiteral
,	TokenNameCOMMA
"level"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
LevelPatternConverter	TokenNameIdentifier
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
INSTANCE	TokenNameIdentifier
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
output	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
output	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
.	TokenNameDOT
getLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getStyleClass	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
instanceof	TokenNameinstanceof
LoggingEvent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
lint	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
LoggingEvent	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
lint	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
TRACE_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"level trace"	TokenNameStringLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
Level	TokenNameIdentifier
.	TokenNameDOT
DEBUG_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"level debug"	TokenNameStringLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
Level	TokenNameIdentifier
.	TokenNameDOT
INFO_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"level info"	TokenNameStringLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
Level	TokenNameIdentifier
.	TokenNameDOT
WARN_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"level warn"	TokenNameStringLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
Level	TokenNameIdentifier
.	TokenNameDOT
ERROR_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"level error"	TokenNameStringLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
Level	TokenNameIdentifier
.	TokenNameDOT
FATAL_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
"level fatal"	TokenNameStringLiteral
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
return	TokenNamereturn
"level "	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
(	TokenNameLPAREN
LoggingEvent	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
"level"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE