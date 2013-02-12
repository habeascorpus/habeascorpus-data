package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
axes	TokenNameIdentifier
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
XNodeSet	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FilterExprIterator	TokenNameIdentifier
extends	TokenNameextends
BasicTestIterator	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
2552176105165737614L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Expression	TokenNameIdentifier
m_expr	TokenNameIdentifier
;	TokenNameSEMICOLON
transient	TokenNametransient
private	TokenNameprivate
XNodeSet	TokenNameIdentifier
m_exprObj	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
m_mustHardReset	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
m_canDetachNodeset	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
public	TokenNamepublic
FilterExprIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FilterExprIterator	TokenNameIdentifier
(	TokenNameLPAREN
Expression	TokenNameIdentifier
expr	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_expr	TokenNameIdentifier
=	TokenNameEQUAL
expr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setRoot	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
context	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
environment	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setRoot	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
,	TokenNameCOMMA
environment	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_exprObj	TokenNameIdentifier
=	TokenNameEQUAL
FilterExprIteratorSimple	TokenNameIdentifier
.	TokenNameDOT
executeFilterExpr	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
,	TokenNameCOMMA
m_execContext	TokenNameIdentifier
,	TokenNameCOMMA
getPrefixResolver	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
getIsTopLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
m_stackFrame	TokenNameIdentifier
,	TokenNameCOMMA
m_expr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
getNextNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_exprObj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_lastFetched	TokenNameIdentifier
=	TokenNameEQUAL
m_exprObj	TokenNameIdentifier
.	TokenNameDOT
nextNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
m_lastFetched	TokenNameIdentifier
=	TokenNameEQUAL
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
m_lastFetched	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
detach	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
detach	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_exprObj	TokenNameIdentifier
.	TokenNameDOT
detach	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_exprObj	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
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
super	TokenNamesuper
.	TokenNameDOT
fixupVariables	TokenNameIdentifier
(	TokenNameLPAREN
vars	TokenNameIdentifier
,	TokenNameCOMMA
globalsSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_expr	TokenNameIdentifier
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
Expression	TokenNameIdentifier
getInnerExpression	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_expr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setInnerExpression	TokenNameIdentifier
(	TokenNameLPAREN
Expression	TokenNameIdentifier
expr	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
expr	TokenNameIdentifier
.	TokenNameDOT
exprSetParent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_expr	TokenNameIdentifier
=	TokenNameEQUAL
expr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getAnalysisBits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_expr	TokenNameIdentifier
&&	TokenNameAND_AND
m_expr	TokenNameIdentifier
instanceof	TokenNameinstanceof
PathComponent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
PathComponent	TokenNameIdentifier
)	TokenNameRPAREN
m_expr	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getAnalysisBits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
WalkerFactory	TokenNameIdentifier
.	TokenNameDOT
BIT_FILTER	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isDocOrdered	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_exprObj	TokenNameIdentifier
.	TokenNameDOT
isDocOrdered	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
class	TokenNameclass
filterExprOwner	TokenNameIdentifier
implements	TokenNameimplements
ExpressionOwner	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Expression	TokenNameIdentifier
getExpression	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_expr	TokenNameIdentifier
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
FilterExprIterator	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_expr	TokenNameIdentifier
=	TokenNameEQUAL
exp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
callPredicateVisitors	TokenNameIdentifier
(	TokenNameLPAREN
XPathVisitor	TokenNameIdentifier
visitor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_expr	TokenNameIdentifier
.	TokenNameDOT
callVisitors	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
filterExprOwner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
visitor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
callPredicateVisitors	TokenNameIdentifier
(	TokenNameLPAREN
visitor	TokenNameIdentifier
)	TokenNameRPAREN
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
super	TokenNamesuper
.	TokenNameDOT
deepEquals	TokenNameIdentifier
(	TokenNameLPAREN
expr	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
FilterExprIterator	TokenNameIdentifier
fet	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FilterExprIterator	TokenNameIdentifier
)	TokenNameRPAREN
expr	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
m_expr	TokenNameIdentifier
.	TokenNameDOT
deepEquals	TokenNameIdentifier
(	TokenNameLPAREN
fet	TokenNameIdentifier
.	TokenNameDOT
m_expr	TokenNameIdentifier
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
