package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ParsedURL	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
EmbededScriptSecurity	TokenNameIdentifier
implements	TokenNameimplements
ScriptSecurity	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DATA_PROTOCOL	TokenNameIdentifier
=	TokenNameEQUAL
"data"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ERROR_CANNOT_ACCESS_DOCUMENT_URL	TokenNameIdentifier
=	TokenNameEQUAL
"DefaultScriptSecurity.error.cannot.access.document.url"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ERROR_SCRIPT_NOT_EMBEDED	TokenNameIdentifier
=	TokenNameEQUAL
"EmbededScriptSecurity.error.script.not.embeded"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
SecurityException	TokenNameIdentifier
se	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
checkLoadScript	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
se	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
se	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
EmbededScriptSecurity	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
scriptType	TokenNameIdentifier
,	TokenNameCOMMA
ParsedURL	TokenNameIdentifier
scriptURL	TokenNameIdentifier
,	TokenNameCOMMA
ParsedURL	TokenNameIdentifier
docURL	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
docURL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
se	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SecurityException	TokenNameIdentifier
(	TokenNameLPAREN
Messages	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
ERROR_CANNOT_ACCESS_DOCUMENT_URL	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
scriptURL	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
docURL	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
scriptURL	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
scriptURL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
!	TokenNameNOT
DATA_PROTOCOL	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
scriptURL	TokenNameIdentifier
.	TokenNameDOT
getProtocol	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
se	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SecurityException	TokenNameIdentifier
(	TokenNameLPAREN
Messages	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
ERROR_SCRIPT_NOT_EMBEDED	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
scriptURL	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE