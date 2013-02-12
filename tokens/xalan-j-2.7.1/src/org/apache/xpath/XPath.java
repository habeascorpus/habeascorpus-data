package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
ErrorListener	TokenNameIdentifier
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
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
DTM	TokenNameIdentifier
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
PrefixResolver	TokenNameIdentifier
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
SAXSourceLocator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
compiler	TokenNameIdentifier
.	TokenNameDOT
Compiler	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
compiler	TokenNameIdentifier
.	TokenNameDOT
FunctionTable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
compiler	TokenNameIdentifier
.	TokenNameDOT
XPathParser	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
functions	TokenNameIdentifier
.	TokenNameDOT
Function	TokenNameIdentifier
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
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
res	TokenNameIdentifier
.	TokenNameDOT
XPATHErrorResources	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XPath	TokenNameIdentifier
implements	TokenNameimplements
Serializable	TokenNameIdentifier
,	TokenNameCOMMA
ExpressionOwner	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
3976493477939110553L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Expression	TokenNameIdentifier
m_mainExp	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
transient	TokenNametransient
FunctionTable	TokenNameIdentifier
m_funcTable	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
void	TokenNamevoid
initFunctionTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
m_funcTable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FunctionTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Expression	TokenNameIdentifier
getExpression	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_mainExp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
fixupVariables	TokenNameIdentifier
(	TokenNameLPAREN
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
vars	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
globalsSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_mainExp	TokenNameIdentifier
.	TokenNameDOT
fixupVariables	TokenNameIdentifier
(	TokenNameLPAREN
vars	TokenNameIdentifier
,	TokenNameCOMMA
globalsSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setExpression	TokenNameIdentifier
(	TokenNameLPAREN
Expression	TokenNameIdentifier
exp	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_mainExp	TokenNameIdentifier
)	TokenNameRPAREN
exp	TokenNameIdentifier
.	TokenNameDOT
exprSetParent	TokenNameIdentifier
(	TokenNameLPAREN
m_mainExp	TokenNameIdentifier
.	TokenNameDOT
exprGetParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_mainExp	TokenNameIdentifier
=	TokenNameEQUAL
exp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SourceLocator	TokenNameIdentifier
getLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_mainExp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
m_patternString	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getPatternString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_patternString	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
SELECT	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
MATCH	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
XPath	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
exprString	TokenNameIdentifier
,	TokenNameCOMMA
SourceLocator	TokenNameIdentifier
locator	TokenNameIdentifier
,	TokenNameCOMMA
PrefixResolver	TokenNameIdentifier
prefixResolver	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
type	TokenNameIdentifier
,	TokenNameCOMMA
ErrorListener	TokenNameIdentifier
errorListener	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
initFunctionTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
errorListener	TokenNameIdentifier
)	TokenNameRPAREN
errorListener	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
DefaultErrorHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_patternString	TokenNameIdentifier
=	TokenNameEQUAL
exprString	TokenNameIdentifier
;	TokenNameSEMICOLON
XPathParser	TokenNameIdentifier
parser	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XPathParser	TokenNameIdentifier
(	TokenNameLPAREN
errorListener	TokenNameIdentifier
,	TokenNameCOMMA
locator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Compiler	TokenNameIdentifier
compiler	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Compiler	TokenNameIdentifier
(	TokenNameLPAREN
errorListener	TokenNameIdentifier
,	TokenNameCOMMA
locator	TokenNameIdentifier
,	TokenNameCOMMA
m_funcTable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
SELECT	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
type	TokenNameIdentifier
)	TokenNameRPAREN
parser	TokenNameIdentifier
.	TokenNameDOT
initXPath	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
,	TokenNameCOMMA
exprString	TokenNameIdentifier
,	TokenNameCOMMA
prefixResolver	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
MATCH	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
type	TokenNameIdentifier
)	TokenNameRPAREN
parser	TokenNameIdentifier
.	TokenNameDOT
initMatchPattern	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
,	TokenNameCOMMA
exprString	TokenNameIdentifier
,	TokenNameCOMMA
prefixResolver	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
XSLMessages	TokenNameIdentifier
.	TokenNameDOT
createXPATHMessage	TokenNameIdentifier
(	TokenNameLPAREN
XPATHErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_CANNOT_DEAL_XPATH_TYPE	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Expression	TokenNameIdentifier
expr	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
compile	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
setExpression	TokenNameIdentifier
(	TokenNameLPAREN
expr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
locator	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
locator	TokenNameIdentifier
instanceof	TokenNameinstanceof
ExpressionNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
expr	TokenNameIdentifier
.	TokenNameDOT
exprSetParent	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
ExpressionNode	TokenNameIdentifier
)	TokenNameRPAREN
locator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
XPath	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
exprString	TokenNameIdentifier
,	TokenNameCOMMA
SourceLocator	TokenNameIdentifier
locator	TokenNameIdentifier
,	TokenNameCOMMA
PrefixResolver	TokenNameIdentifier
prefixResolver	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
type	TokenNameIdentifier
,	TokenNameCOMMA
ErrorListener	TokenNameIdentifier
errorListener	TokenNameIdentifier
,	TokenNameCOMMA
FunctionTable	TokenNameIdentifier
aTable	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
m_funcTable	TokenNameIdentifier
=	TokenNameEQUAL
aTable	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
errorListener	TokenNameIdentifier
)	TokenNameRPAREN
errorListener	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
DefaultErrorHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_patternString	TokenNameIdentifier
=	TokenNameEQUAL
exprString	TokenNameIdentifier
;	TokenNameSEMICOLON
XPathParser	TokenNameIdentifier
parser	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XPathParser	TokenNameIdentifier
(	TokenNameLPAREN
errorListener	TokenNameIdentifier
,	TokenNameCOMMA
locator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Compiler	TokenNameIdentifier
compiler	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Compiler	TokenNameIdentifier
(	TokenNameLPAREN
errorListener	TokenNameIdentifier
,	TokenNameCOMMA
locator	TokenNameIdentifier
,	TokenNameCOMMA
m_funcTable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
SELECT	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
type	TokenNameIdentifier
)	TokenNameRPAREN
parser	TokenNameIdentifier
.	TokenNameDOT
initXPath	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
,	TokenNameCOMMA
exprString	TokenNameIdentifier
,	TokenNameCOMMA
prefixResolver	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
MATCH	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
type	TokenNameIdentifier
)	TokenNameRPAREN
parser	TokenNameIdentifier
.	TokenNameDOT
initMatchPattern	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
,	TokenNameCOMMA
exprString	TokenNameIdentifier
,	TokenNameCOMMA
prefixResolver	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
XSLMessages	TokenNameIdentifier
.	TokenNameDOT
createXPATHMessage	TokenNameIdentifier
(	TokenNameLPAREN
XPATHErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_CANNOT_DEAL_XPATH_TYPE	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Expression	TokenNameIdentifier
expr	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
compile	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
setExpression	TokenNameIdentifier
(	TokenNameLPAREN
expr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
locator	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
locator	TokenNameIdentifier
instanceof	TokenNameinstanceof
ExpressionNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
expr	TokenNameIdentifier
.	TokenNameDOT
exprSetParent	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
ExpressionNode	TokenNameIdentifier
)	TokenNameRPAREN
locator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
XPath	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
exprString	TokenNameIdentifier
,	TokenNameCOMMA
SourceLocator	TokenNameIdentifier
locator	TokenNameIdentifier
,	TokenNameCOMMA
PrefixResolver	TokenNameIdentifier
prefixResolver	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
type	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
exprString	TokenNameIdentifier
,	TokenNameCOMMA
locator	TokenNameIdentifier
,	TokenNameCOMMA
prefixResolver	TokenNameIdentifier
,	TokenNameCOMMA
type	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XPath	TokenNameIdentifier
(	TokenNameLPAREN
Expression	TokenNameIdentifier
expr	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
setExpression	TokenNameIdentifier
(	TokenNameLPAREN
expr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
initFunctionTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XObject	TokenNameIdentifier
execute	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
,	TokenNameCOMMA
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
contextNode	TokenNameIdentifier
,	TokenNameCOMMA
PrefixResolver	TokenNameIdentifier
namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
execute	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
,	TokenNameCOMMA
xctxt	TokenNameIdentifier
.	TokenNameDOT
getDTMHandleFromNode	TokenNameIdentifier
(	TokenNameLPAREN
contextNode	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XObject	TokenNameIdentifier
execute	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
contextNode	TokenNameIdentifier
,	TokenNameCOMMA
PrefixResolver	TokenNameIdentifier
namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
xctxt	TokenNameIdentifier
.	TokenNameDOT
pushNamespaceContext	TokenNameIdentifier
(	TokenNameLPAREN
namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xctxt	TokenNameIdentifier
.	TokenNameDOT
pushCurrentNodeAndExpression	TokenNameIdentifier
(	TokenNameLPAREN
contextNode	TokenNameIdentifier
,	TokenNameCOMMA
contextNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XObject	TokenNameIdentifier
xobj	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
xobj	TokenNameIdentifier
=	TokenNameEQUAL
m_mainExp	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
TransformerException	TokenNameIdentifier
te	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
te	TokenNameIdentifier
.	TokenNameDOT
setLocator	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
getLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ErrorListener	TokenNameIdentifier
el	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getErrorListener	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
el	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
el	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
te	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
throw	TokenNamethrow
te	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
instanceof	TokenNameinstanceof
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRuntimeException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRuntimeException	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
msg	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
msg	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
msg	TokenNameIdentifier
=	TokenNameEQUAL
XSLMessages	TokenNameIdentifier
.	TokenNameDOT
createXPATHMessage	TokenNameIdentifier
(	TokenNameLPAREN
XPATHErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_XPATH_ERROR	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
TransformerException	TokenNameIdentifier
te	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TransformerException	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
getLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ErrorListener	TokenNameIdentifier
el	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getErrorListener	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
el	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
el	TokenNameIdentifier
.	TokenNameDOT
fatalError	TokenNameIdentifier
(	TokenNameLPAREN
te	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
throw	TokenNamethrow
te	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
xctxt	TokenNameIdentifier
.	TokenNameDOT
popNamespaceContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xctxt	TokenNameIdentifier
.	TokenNameDOT
popCurrentNodeAndExpression	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
xobj	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
bool	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
contextNode	TokenNameIdentifier
,	TokenNameCOMMA
PrefixResolver	TokenNameIdentifier
namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
xctxt	TokenNameIdentifier
.	TokenNameDOT
pushNamespaceContext	TokenNameIdentifier
(	TokenNameLPAREN
namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xctxt	TokenNameIdentifier
.	TokenNameDOT
pushCurrentNodeAndExpression	TokenNameIdentifier
(	TokenNameLPAREN
contextNode	TokenNameIdentifier
,	TokenNameCOMMA
contextNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
m_mainExp	TokenNameIdentifier
.	TokenNameDOT
bool	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
TransformerException	TokenNameIdentifier
te	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
te	TokenNameIdentifier
.	TokenNameDOT
setLocator	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
getLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ErrorListener	TokenNameIdentifier
el	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getErrorListener	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
el	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
el	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
te	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
throw	TokenNamethrow
te	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
instanceof	TokenNameinstanceof
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRuntimeException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRuntimeException	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
msg	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
msg	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
msg	TokenNameIdentifier
=	TokenNameEQUAL
XSLMessages	TokenNameIdentifier
.	TokenNameDOT
createXPATHMessage	TokenNameIdentifier
(	TokenNameLPAREN
XPATHErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_XPATH_ERROR	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
TransformerException	TokenNameIdentifier
te	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TransformerException	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
getLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ErrorListener	TokenNameIdentifier
el	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getErrorListener	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
el	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
el	TokenNameIdentifier
.	TokenNameDOT
fatalError	TokenNameIdentifier
(	TokenNameLPAREN
te	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
throw	TokenNamethrow
te	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
xctxt	TokenNameIdentifier
.	TokenNameDOT
popNamespaceContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xctxt	TokenNameIdentifier
.	TokenNameDOT
popCurrentNodeAndExpression	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
DEBUG_MATCHES	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
double	TokenNamedouble
getMatchScore	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
context	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
xctxt	TokenNameIdentifier
.	TokenNameDOT
pushCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xctxt	TokenNameIdentifier
.	TokenNameDOT
pushCurrentExpressionNode	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
XObject	TokenNameIdentifier
score	TokenNameIdentifier
=	TokenNameEQUAL
m_mainExp	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
DEBUG_MATCHES	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DTM	TokenNameIdentifier
dtm	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getDTM	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"score: "	TokenNameStringLiteral
+	TokenNamePLUS
score	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" for "	TokenNameStringLiteral
+	TokenNamePLUS
dtm	TokenNameIdentifier
.	TokenNameDOT
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" for xpath "	TokenNameStringLiteral
+	TokenNamePLUS
this	TokenNamethis
.	TokenNameDOT
getPatternString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
score	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
xctxt	TokenNameIdentifier
.	TokenNameDOT
popCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xctxt	TokenNameIdentifier
.	TokenNameDOT
popCurrentExpressionNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
warn	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
sourceNode	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
msg	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
fmsg	TokenNameIdentifier
=	TokenNameEQUAL
XSLMessages	TokenNameIdentifier
.	TokenNameDOT
createXPATHWarning	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ErrorListener	TokenNameIdentifier
ehandler	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getErrorListener	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
ehandler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ehandler	TokenNameIdentifier
.	TokenNameDOT
warning	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TransformerException	TokenNameIdentifier
(	TokenNameLPAREN
fmsg	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
SAXSourceLocator	TokenNameIdentifier
)	TokenNameRPAREN
xctxt	TokenNameIdentifier
.	TokenNameDOT
getSAXLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
assertion	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
b	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
msg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
fMsg	TokenNameIdentifier
=	TokenNameEQUAL
XSLMessages	TokenNameIdentifier
.	TokenNameDOT
createXPATHMessage	TokenNameIdentifier
(	TokenNameLPAREN
XPATHErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_INCORRECT_PROGRAMMER_ASSERTION	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
msg	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
fMsg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
error	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
sourceNode	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
msg	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
fmsg	TokenNameIdentifier
=	TokenNameEQUAL
XSLMessages	TokenNameIdentifier
.	TokenNameDOT
createXPATHMessage	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ErrorListener	TokenNameIdentifier
ehandler	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getErrorListener	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
ehandler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ehandler	TokenNameIdentifier
.	TokenNameDOT
fatalError	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TransformerException	TokenNameIdentifier
(	TokenNameLPAREN
fmsg	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
SAXSourceLocator	TokenNameIdentifier
)	TokenNameRPAREN
xctxt	TokenNameIdentifier
.	TokenNameDOT
getSAXLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
SourceLocator	TokenNameIdentifier
slocator	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getSAXLocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
fmsg	TokenNameIdentifier
+	TokenNamePLUS
"; file "	TokenNameStringLiteral
+	TokenNamePLUS
slocator	TokenNameIdentifier
.	TokenNameDOT
getSystemId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"; line "	TokenNameStringLiteral
+	TokenNamePLUS
slocator	TokenNameIdentifier
.	TokenNameDOT
getLineNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"; column "	TokenNameStringLiteral
+	TokenNamePLUS
slocator	TokenNameIdentifier
.	TokenNameDOT
getColumnNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
callVisitors	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
XPathVisitor	TokenNameIdentifier
visitor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_mainExp	TokenNameIdentifier
.	TokenNameDOT
callVisitors	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
visitor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
MATCH_SCORE_NONE	TokenNameIdentifier
=	TokenNameEQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
NEGATIVE_INFINITY	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
MATCH_SCORE_QNAME	TokenNameIdentifier
=	TokenNameEQUAL
0.0	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
MATCH_SCORE_NSWILD	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
0.25	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
MATCH_SCORE_NODETEST	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
0.5	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
double	TokenNamedouble
MATCH_SCORE_OTHER	TokenNameIdentifier
=	TokenNameEQUAL
0.5	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE