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
extensions	TokenNameIdentifier
.	TokenNameDOT
ExtensionNamespaceSupport	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
NodeList	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ElemExsltFunction	TokenNameIdentifier
extends	TokenNameextends
ElemTemplate	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
272154954793534771L	TokenNameLongLiteral
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
EXSLT_ELEMNAME_FUNCTION	TokenNameIdentifier
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
EXSLT_ELEMNAME_FUNCTION_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
TransformerImpl	TokenNameIdentifier
transformer	TokenNameIdentifier
,	TokenNameCOMMA
XObject	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TransformerException	TokenNameIdentifier
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
thisFrame	TokenNameIdentifier
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
m_frameSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m_inArgsSize	TokenNameIdentifier
<	TokenNameLESS
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
TransformerException	TokenNameIdentifier
(	TokenNameLPAREN
"function called with too many args"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
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
m_inArgsSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
vars	TokenNameIdentifier
.	TokenNameDOT
setStackFrame	TokenNameIdentifier
(	TokenNameLPAREN
thisFrame	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
NodeList	TokenNameIdentifier
children	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
getChildNodes	TokenNameIdentifier
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
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Node	TokenNameIdentifier
child	TokenNameIdentifier
=	TokenNameEQUAL
children	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
children	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
ElemParam	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ElemParam	TokenNameIdentifier
param	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ElemParam	TokenNameIdentifier
)	TokenNameRPAREN
children	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vars	TokenNameIdentifier
.	TokenNameDOT
setLocalVariable	TokenNameIdentifier
(	TokenNameLPAREN
param	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
args	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
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
vars	TokenNameIdentifier
.	TokenNameDOT
setStackFrame	TokenNameIdentifier
(	TokenNameLPAREN
nextFrame	TokenNameIdentifier
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
vars	TokenNameIdentifier
.	TokenNameDOT
unlink	TokenNameIdentifier
(	TokenNameLPAREN
thisFrame	TokenNameIdentifier
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
String	TokenNameIdentifier
namespace	TokenNameIdentifier
=	TokenNameEQUAL
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
handlerClass	TokenNameIdentifier
=	TokenNameEQUAL
sroot	TokenNameIdentifier
.	TokenNameDOT
getExtensionHandlerClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
namespace	TokenNameIdentifier
,	TokenNameCOMMA
sroot	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
ExtensionNamespaceSupport	TokenNameIdentifier
extNsSpt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ExtensionNamespaceSupport	TokenNameIdentifier
(	TokenNameLPAREN
namespace	TokenNameIdentifier
,	TokenNameCOMMA
handlerClass	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sroot	TokenNameIdentifier
.	TokenNameDOT
getExtensionNamespacesManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
registerExtension	TokenNameIdentifier
(	TokenNameLPAREN
extNsSpt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
namespace	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
S_EXSLT_FUNCTIONS_URL	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
namespace	TokenNameIdentifier
=	TokenNameEQUAL
Constants	TokenNameIdentifier
.	TokenNameDOT
S_EXSLT_FUNCTIONS_URL	TokenNameIdentifier
;	TokenNameSEMICOLON
args	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
namespace	TokenNameIdentifier
,	TokenNameCOMMA
sroot	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
extNsSpt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ExtensionNamespaceSupport	TokenNameIdentifier
(	TokenNameLPAREN
namespace	TokenNameIdentifier
,	TokenNameCOMMA
handlerClass	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sroot	TokenNameIdentifier
.	TokenNameDOT
getExtensionNamespacesManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
registerExtension	TokenNameIdentifier
(	TokenNameLPAREN
extNsSpt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE