package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
Expression	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
ExpressionOwner	TokenNameIdentifier
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
XPathVisitor	TokenNameIdentifier
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
abstract	TokenNameabstract
class	TokenNameclass
UnaryOperation	TokenNameIdentifier
extends	TokenNameextends
Expression	TokenNameIdentifier
implements	TokenNameimplements
ExpressionOwner	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
6536083808424286166L	TokenNameLongLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
Expression	TokenNameIdentifier
m_right	TokenNameIdentifier
;	TokenNameSEMICOLON
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
m_right	TokenNameIdentifier
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
boolean	TokenNameboolean
canTraverseOutsideSubtree	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_right	TokenNameIdentifier
&&	TokenNameAND_AND
m_right	TokenNameIdentifier
.	TokenNameDOT
canTraverseOutsideSubtree	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setRight	TokenNameIdentifier
(	TokenNameLPAREN
Expression	TokenNameIdentifier
r	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_right	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
exprSetParent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XObject	TokenNameIdentifier
execute	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
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
operate	TokenNameIdentifier
(	TokenNameLPAREN
m_right	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
XObject	TokenNameIdentifier
operate	TokenNameIdentifier
(	TokenNameLPAREN
XObject	TokenNameIdentifier
right	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Expression	TokenNameIdentifier
getOperand	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_right	TokenNameIdentifier
;	TokenNameSEMICOLON
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
if	TokenNameif
(	TokenNameLPAREN
visitor	TokenNameIdentifier
.	TokenNameDOT
visitUnaryOperation	TokenNameIdentifier
(	TokenNameLPAREN
owner	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
m_right	TokenNameIdentifier
.	TokenNameDOT
callVisitors	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
visitor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Expression	TokenNameIdentifier
getExpression	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_right	TokenNameIdentifier
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
exp	TokenNameIdentifier
.	TokenNameDOT
exprSetParent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_right	TokenNameIdentifier
=	TokenNameEQUAL
exp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
deepEquals	TokenNameIdentifier
(	TokenNameLPAREN
Expression	TokenNameIdentifier
expr	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isSameClass	TokenNameIdentifier
(	TokenNameLPAREN
expr	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
m_right	TokenNameIdentifier
.	TokenNameDOT
deepEquals	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
UnaryOperation	TokenNameIdentifier
)	TokenNameRPAREN
expr	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
m_right	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE