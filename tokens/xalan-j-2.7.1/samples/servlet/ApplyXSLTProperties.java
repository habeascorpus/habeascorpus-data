package	TokenNamepackage
servlet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MalformedURLException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
servlet	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
servlet	TokenNameIdentifier
.	TokenNameDOT
http	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ApplyXSLTProperties	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_URL	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_xslURL	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
DEFAULT_debug	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
DEFAULT_noCW	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ApplyXSLTProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
DEFAULT_URL	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
DEFAULT_xslURL	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
DEFAULT_debug	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
DEFAULT_noCW	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ApplyXSLTProperties	TokenNameIdentifier
(	TokenNameLPAREN
ServletConfig	TokenNameIdentifier
config	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
xm	TokenNameIdentifier
=	TokenNameEQUAL
config	TokenNameIdentifier
.	TokenNameDOT
getInitParameter	TokenNameIdentifier
(	TokenNameLPAREN
"URL"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
xu	TokenNameIdentifier
=	TokenNameEQUAL
config	TokenNameIdentifier
.	TokenNameDOT
getInitParameter	TokenNameIdentifier
(	TokenNameLPAREN
"xslURL"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
db	TokenNameIdentifier
=	TokenNameEQUAL
config	TokenNameIdentifier
.	TokenNameDOT
getInitParameter	TokenNameIdentifier
(	TokenNameLPAREN
"debug"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
cw	TokenNameIdentifier
=	TokenNameEQUAL
config	TokenNameIdentifier
.	TokenNameDOT
getInitParameter	TokenNameIdentifier
(	TokenNameLPAREN
"noConflictWarnings"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
xm	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
DEFAULT_URL	TokenNameIdentifier
=	TokenNameEQUAL
xm	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
DEFAULT_URL	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
xu	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
DEFAULT_xslURL	TokenNameIdentifier
=	TokenNameEQUAL
xu	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
DEFAULT_xslURL	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
db	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
DEFAULT_debug	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Boolean	TokenNameIdentifier
(	TokenNameLPAREN
db	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
booleanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
DEFAULT_debug	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cw	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
DEFAULT_noCW	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Boolean	TokenNameIdentifier
(	TokenNameLPAREN
cw	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
booleanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
DEFAULT_noCW	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getRequestParmString	TokenNameIdentifier
(	TokenNameLPAREN
HttpServletRequest	TokenNameIdentifier
request	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
param	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
request	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
paramVals	TokenNameIdentifier
=	TokenNameEQUAL
request	TokenNameIdentifier
.	TokenNameDOT
getParameterValues	TokenNameIdentifier
(	TokenNameLPAREN
param	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
paramVals	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
paramVals	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getXMLurl	TokenNameIdentifier
(	TokenNameLPAREN
HttpServletRequest	TokenNameIdentifier
request	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MalformedURLException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
temp	TokenNameIdentifier
=	TokenNameEQUAL
getRequestParmString	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
,	TokenNameCOMMA
"URL"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
temp	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
temp	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
DEFAULT_URL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getXSLurl	TokenNameIdentifier
(	TokenNameLPAREN
HttpServletRequest	TokenNameIdentifier
request	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MalformedURLException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
temp	TokenNameIdentifier
=	TokenNameEQUAL
getRequestParmString	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
,	TokenNameCOMMA
"xslURL"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
temp	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
temp	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
DEFAULT_xslURL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isDebug	TokenNameIdentifier
(	TokenNameLPAREN
HttpServletRequest	TokenNameIdentifier
request	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
temp	TokenNameIdentifier
=	TokenNameEQUAL
getRequestParmString	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
,	TokenNameCOMMA
"debug"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
temp	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
Boolean	TokenNameIdentifier
(	TokenNameLPAREN
temp	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
booleanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
DEFAULT_debug	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
boolean	TokenNameboolean
isNoCW	TokenNameIdentifier
(	TokenNameLPAREN
HttpServletRequest	TokenNameIdentifier
request	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
temp	TokenNameIdentifier
=	TokenNameEQUAL
getRequestParmString	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
,	TokenNameCOMMA
"noConflictWarnings"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
temp	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
Boolean	TokenNameIdentifier
(	TokenNameLPAREN
temp	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
booleanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
DEFAULT_noCW	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE