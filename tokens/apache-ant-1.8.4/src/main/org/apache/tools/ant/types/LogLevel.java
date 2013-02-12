package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Project	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LogLevel	TokenNameIdentifier
extends	TokenNameextends
EnumeratedAttribute	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
LogLevel	TokenNameIdentifier
ERR	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogLevel	TokenNameIdentifier
(	TokenNameLPAREN
"error"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
LogLevel	TokenNameIdentifier
WARN	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogLevel	TokenNameIdentifier
(	TokenNameLPAREN
"warn"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
LogLevel	TokenNameIdentifier
INFO	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogLevel	TokenNameIdentifier
(	TokenNameLPAREN
"info"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
LogLevel	TokenNameIdentifier
VERBOSE	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogLevel	TokenNameIdentifier
(	TokenNameLPAREN
"verbose"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
LogLevel	TokenNameIdentifier
DEBUG	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogLevel	TokenNameIdentifier
(	TokenNameLPAREN
"debug"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
LogLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
private	TokenNameprivate
LogLevel	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setValue	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getValues	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"error"	TokenNameStringLiteral
,	TokenNameCOMMA
"warn"	TokenNameStringLiteral
,	TokenNameCOMMA
"warning"	TokenNameStringLiteral
,	TokenNameCOMMA
"info"	TokenNameStringLiteral
,	TokenNameCOMMA
"verbose"	TokenNameStringLiteral
,	TokenNameCOMMA
"debug"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
levels	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_ERR	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_WARN	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_WARN	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_INFO	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_DEBUG	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
levels	TokenNameIdentifier
[	TokenNameLBRACKET
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
