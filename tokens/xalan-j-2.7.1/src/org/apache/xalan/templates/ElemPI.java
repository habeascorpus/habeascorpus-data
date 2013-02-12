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
res	TokenNameIdentifier
.	TokenNameDOT
XSLTErrorResources	TokenNameIdentifier
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
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
XML11Char	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
ElemPI	TokenNameIdentifier
extends	TokenNameextends
ElemTemplateElement	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
5621976448020889825L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
AVT	TokenNameIdentifier
m_name_atv	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setName	TokenNameIdentifier
(	TokenNameLPAREN
AVT	TokenNameIdentifier
v	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_name_atv	TokenNameIdentifier
=	TokenNameEQUAL
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AVT	TokenNameIdentifier
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_name_atv	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
compose	TokenNameIdentifier
(	TokenNameLPAREN
StylesheetRoot	TokenNameIdentifier
sroot	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
compose	TokenNameIdentifier
(	TokenNameLPAREN
sroot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
vnames	TokenNameIdentifier
=	TokenNameEQUAL
sroot	TokenNameIdentifier
.	TokenNameDOT
getComposeState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getVariableNames	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_name_atv	TokenNameIdentifier
)	TokenNameRPAREN
m_name_atv	TokenNameIdentifier
.	TokenNameDOT
fixupVariables	TokenNameIdentifier
(	TokenNameLPAREN
vnames	TokenNameIdentifier
,	TokenNameCOMMA
sroot	TokenNameIdentifier
.	TokenNameDOT
getComposeState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getGlobalsSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
ELEMNAME_PI	TokenNameIdentifier
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
ELEMNAME_PI_STRING	TokenNameIdentifier
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
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
=	TokenNameEQUAL
transformer	TokenNameIdentifier
.	TokenNameDOT
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
sourceNode	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
piName	TokenNameIdentifier
=	TokenNameEQUAL
m_name_atv	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
m_name_atv	TokenNameIdentifier
.	TokenNameDOT
evaluate	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
,	TokenNameCOMMA
sourceNode	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
piName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
piName	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
"xml"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
transformer	TokenNameIdentifier
.	TokenNameDOT
getMsgMgr	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
XSLTErrorResources	TokenNameIdentifier
.	TokenNameDOT
WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
Constants	TokenNameIdentifier
.	TokenNameDOT
ATTRNAME_NAME	TokenNameIdentifier
,	TokenNameCOMMA
piName	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
!	TokenNameNOT
m_name_atv	TokenNameIdentifier
.	TokenNameDOT
isSimple	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
!	TokenNameNOT
XML11Char	TokenNameIdentifier
.	TokenNameDOT
isXML11ValidNCName	TokenNameIdentifier
(	TokenNameLPAREN
piName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
transformer	TokenNameIdentifier
.	TokenNameDOT
getMsgMgr	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
XSLTErrorResources	TokenNameIdentifier
.	TokenNameDOT
WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
Constants	TokenNameIdentifier
.	TokenNameDOT
ATTRNAME_NAME	TokenNameIdentifier
,	TokenNameCOMMA
piName	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
data	TokenNameIdentifier
=	TokenNameEQUAL
transformer	TokenNameIdentifier
.	TokenNameDOT
transformToString	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
transformer	TokenNameIdentifier
.	TokenNameDOT
getResultTreeHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
processingInstruction	TokenNameIdentifier
(	TokenNameLPAREN
piName	TokenNameIdentifier
,	TokenNameCOMMA
data	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
se	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
TransformerException	TokenNameIdentifier
(	TokenNameLPAREN
se	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
ElemTemplateElement	TokenNameIdentifier
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
ElemTemplateElement	TokenNameIdentifier
newChild	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
type	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
ElemTemplateElement	TokenNameIdentifier
)	TokenNameRPAREN
newChild	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getXSLToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_TEXTLITERALRESULT	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_APPLY_TEMPLATES	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_APPLY_IMPORTS	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_CALLTEMPLATE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_FOREACH	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_VALUEOF	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_COPY_OF	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_NUMBER	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_CHOOSE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_IF	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_TEXT	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_COPY	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_VARIABLE	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_MESSAGE	TokenNameIdentifier
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
error	TokenNameIdentifier
(	TokenNameLPAREN
XSLTErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_CANNOT_ADD	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
newChild	TokenNameIdentifier
.	TokenNameDOT
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
newChild	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE