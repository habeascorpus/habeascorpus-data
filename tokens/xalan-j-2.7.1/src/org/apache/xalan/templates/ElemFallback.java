package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
transformer	TokenNameIdentifier
.	TokenNameDOT
TransformerImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ElemFallback	TokenNameIdentifier
extends	TokenNameextends
ElemTemplateElement	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
1782962139867340703L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getXSLToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_FALLBACK	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_FALLBACK_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
TransformerImpl	TokenNameIdentifier
transformer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
executeFallback	TokenNameIdentifier
(	TokenNameLPAREN
TransformerImpl	TokenNameIdentifier
transformer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
parentElemType	TokenNameIdentifier
=	TokenNameEQUAL
m_parentNode	TokenNameIdentifier
.	TokenNameDOT
getXSLToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_EXTENSIONCALL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
parentElemType	TokenNameIdentifier
||	TokenNameOR_OR
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_UNDEFINED	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
parentElemType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getDebug	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getTraceManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
fireTraceEvent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformer	TokenNameIdentifier
.	TokenNameDOT
executeChildTemplates	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getDebug	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
getTraceManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
fireTraceEndEvent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Error!  parent of xsl:fallback must be an extension or unknown element!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
