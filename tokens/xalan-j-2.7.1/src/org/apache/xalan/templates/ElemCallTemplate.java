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
SourceLocator	TokenNameIdentifier
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
XSLMessages	TokenNameIdentifier
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
QName	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
VariableStack	TokenNameIdentifier
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
ElemCallTemplate	TokenNameIdentifier
extends	TokenNameextends
ElemForEach	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
5009634612916030591L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
QName	TokenNameIdentifier
m_templateName	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setName	TokenNameIdentifier
(	TokenNameLPAREN
QName	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_templateName	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
QName	TokenNameIdentifier
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_templateName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ElemTemplate	TokenNameIdentifier
m_template	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
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
ELEMNAME_CALLTEMPLATE	TokenNameIdentifier
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
ELEMNAME_CALLTEMPLATE_STRING	TokenNameIdentifier
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
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
getParamElemCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
ElemWithParam	TokenNameIdentifier
ewp	TokenNameIdentifier
=	TokenNameEQUAL
getParamElem	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ewp	TokenNameIdentifier
.	TokenNameDOT
compose	TokenNameIdentifier
(	TokenNameLPAREN
sroot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_templateName	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_template	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
m_template	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
getStylesheetRoot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getTemplateComposed	TokenNameIdentifier
(	TokenNameLPAREN
m_templateName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_template	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
themsg	TokenNameIdentifier
=	TokenNameEQUAL
XSLMessages	TokenNameIdentifier
.	TokenNameDOT
createMessage	TokenNameIdentifier
(	TokenNameLPAREN
XSLTErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_ELEMTEMPLATEELEM_ERR	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
m_templateName	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
TransformerException	TokenNameIdentifier
(	TokenNameLPAREN
themsg	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
length	TokenNameIdentifier
=	TokenNameEQUAL
getParamElemCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
ElemWithParam	TokenNameIdentifier
ewp	TokenNameIdentifier
=	TokenNameEQUAL
getParamElem	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ewp	TokenNameIdentifier
.	TokenNameDOT
m_index	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
etePos	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
ElemTemplateElement	TokenNameIdentifier
ete	TokenNameIdentifier
=	TokenNameEQUAL
m_template	TokenNameIdentifier
.	TokenNameDOT
getFirstChildElem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
null	TokenNamenull
!=	TokenNameNOT_EQUAL
ete	TokenNameIdentifier
;	TokenNameSEMICOLON
ete	TokenNameIdentifier
=	TokenNameEQUAL
ete	TokenNameIdentifier
.	TokenNameDOT
getNextSiblingElem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ete	TokenNameIdentifier
.	TokenNameDOT
getXSLToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_PARAMVARIABLE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ElemParam	TokenNameIdentifier
ep	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ElemParam	TokenNameIdentifier
)	TokenNameRPAREN
ete	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ep	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ewp	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ewp	TokenNameIdentifier
.	TokenNameDOT
m_index	TokenNameIdentifier
=	TokenNameEQUAL
etePos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
break	TokenNamebreak
;	TokenNameSEMICOLON
etePos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endCompose	TokenNameIdentifier
(	TokenNameLPAREN
StylesheetRoot	TokenNameIdentifier
sroot	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
getParamElemCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
ElemWithParam	TokenNameIdentifier
ewp	TokenNameIdentifier
=	TokenNameEQUAL
getParamElem	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ewp	TokenNameIdentifier
.	TokenNameDOT
endCompose	TokenNameIdentifier
(	TokenNameLPAREN
sroot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
super	TokenNamesuper
.	TokenNameDOT
endCompose	TokenNameIdentifier
(	TokenNameLPAREN
sroot	TokenNameIdentifier
)	TokenNameRPAREN
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
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_template	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
=	TokenNameEQUAL
transformer	TokenNameIdentifier
.	TokenNameDOT
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
VariableStack	TokenNameIdentifier
vars	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getVarStack	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
thisframe	TokenNameIdentifier
=	TokenNameEQUAL
vars	TokenNameIdentifier
.	TokenNameDOT
getStackFrame	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
nextFrame	TokenNameIdentifier
=	TokenNameEQUAL
vars	TokenNameIdentifier
.	TokenNameDOT
link	TokenNameIdentifier
(	TokenNameLPAREN
m_template	TokenNameIdentifier
.	TokenNameDOT
m_frameSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m_template	TokenNameIdentifier
.	TokenNameDOT
m_inArgsSize	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
vars	TokenNameIdentifier
.	TokenNameDOT
clearLocalSlots	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
m_template	TokenNameIdentifier
.	TokenNameDOT
m_inArgsSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_paramElems	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
currentNode	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vars	TokenNameIdentifier
.	TokenNameDOT
setStackFrame	TokenNameIdentifier
(	TokenNameLPAREN
thisframe	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
m_paramElems	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
ElemWithParam	TokenNameIdentifier
ewp	TokenNameIdentifier
=	TokenNameEQUAL
m_paramElems	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ewp	TokenNameIdentifier
.	TokenNameDOT
m_index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
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
ewp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XObject	TokenNameIdentifier
obj	TokenNameIdentifier
=	TokenNameEQUAL
ewp	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
transformer	TokenNameIdentifier
,	TokenNameCOMMA
currentNode	TokenNameIdentifier
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
ewp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vars	TokenNameIdentifier
.	TokenNameDOT
setLocalVariable	TokenNameIdentifier
(	TokenNameLPAREN
ewp	TokenNameIdentifier
.	TokenNameDOT
m_index	TokenNameIdentifier
,	TokenNameCOMMA
obj	TokenNameIdentifier
,	TokenNameCOMMA
nextFrame	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
vars	TokenNameIdentifier
.	TokenNameDOT
setStackFrame	TokenNameIdentifier
(	TokenNameLPAREN
nextFrame	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
SourceLocator	TokenNameIdentifier
savedLocator	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getSAXLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
xctxt	TokenNameIdentifier
.	TokenNameDOT
setSAXLocator	TokenNameIdentifier
(	TokenNameLPAREN
m_template	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformer	TokenNameIdentifier
.	TokenNameDOT
pushElemTemplateElement	TokenNameIdentifier
(	TokenNameLPAREN
m_template	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_template	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
transformer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
transformer	TokenNameIdentifier
.	TokenNameDOT
popElemTemplateElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xctxt	TokenNameIdentifier
.	TokenNameDOT
setSAXLocator	TokenNameIdentifier
(	TokenNameLPAREN
savedLocator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vars	TokenNameIdentifier
.	TokenNameDOT
unlink	TokenNameIdentifier
(	TokenNameLPAREN
thisframe	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
transformer	TokenNameIdentifier
.	TokenNameDOT
getMsgMgr	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
XSLTErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_TEMPLATE_NOT_FOUND	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
m_templateName	TokenNameIdentifier
}	TokenNameRBRACE
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
protected	TokenNameprotected
ElemWithParam	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
m_paramElems	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getParamElemCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
m_paramElems	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
m_paramElems	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ElemWithParam	TokenNameIdentifier
getParamElem	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_paramElems	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setParamElem	TokenNameIdentifier
(	TokenNameLPAREN
ElemWithParam	TokenNameIdentifier
ParamElem	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_paramElems	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_paramElems	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ElemWithParam	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
m_paramElems	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
ParamElem	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
m_paramElems	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
ElemWithParam	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ewp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ElemWithParam	TokenNameIdentifier
[	TokenNameLBRACKET
length	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
m_paramElems	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
ewp	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_paramElems	TokenNameIdentifier
=	TokenNameEQUAL
ewp	TokenNameIdentifier
;	TokenNameSEMICOLON
ewp	TokenNameIdentifier
[	TokenNameLBRACKET
length	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
ParamElem	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
if	TokenNameif
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
ELEMNAME_WITHPARAM	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setParamElem	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
ElemWithParam	TokenNameIdentifier
)	TokenNameRPAREN
newChild	TokenNameIdentifier
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
public	TokenNamepublic
void	TokenNamevoid
callChildVisitors	TokenNameIdentifier
(	TokenNameLPAREN
XSLTVisitor	TokenNameIdentifier
visitor	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
callAttrs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
callChildVisitors	TokenNameIdentifier
(	TokenNameLPAREN
visitor	TokenNameIdentifier
,	TokenNameCOMMA
callAttrs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
