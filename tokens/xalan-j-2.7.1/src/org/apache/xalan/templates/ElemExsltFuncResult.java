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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
XPathContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
.	TokenNameDOT
XObject	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ElemExsltFuncResult	TokenNameIdentifier
extends	TokenNameextends
ElemVariable	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
3478311949388304563L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
m_isResultSet	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
XObject	TokenNameIdentifier
m_result	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
m_callerFrameSize	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
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
XPathContext	TokenNameIdentifier
context	TokenNameIdentifier
=	TokenNameEQUAL
transformer	TokenNameIdentifier
.	TokenNameDOT
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
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
fireTraceEvent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
transformer	TokenNameIdentifier
.	TokenNameDOT
currentFuncResultSeen	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
TransformerException	TokenNameIdentifier
(	TokenNameLPAREN
"An EXSLT function cannot set more than one result!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
sourceNode	TokenNameIdentifier
=	TokenNameEQUAL
context	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XObject	TokenNameIdentifier
var	TokenNameIdentifier
=	TokenNameEQUAL
getValue	TokenNameIdentifier
(	TokenNameLPAREN
transformer	TokenNameIdentifier
,	TokenNameCOMMA
sourceNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformer	TokenNameIdentifier
.	TokenNameDOT
popCurrentFuncResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformer	TokenNameIdentifier
.	TokenNameDOT
pushCurrentFuncResult	TokenNameIdentifier
(	TokenNameLPAREN
var	TokenNameIdentifier
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
public	TokenNamepublic
int	TokenNameint
getXSLToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Constants	TokenNameIdentifier
.	TokenNameDOT
EXSLT_ELEMNAME_FUNCRESULT	TokenNameIdentifier
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
EXSLT_ELEMNAME_FUNCRESULT_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
