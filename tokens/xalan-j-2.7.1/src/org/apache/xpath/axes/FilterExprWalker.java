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
Axis	TokenNameIdentifier
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
dtm	TokenNameIdentifier
.	TokenNameDOT
DTMIterator	TokenNameIdentifier
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
OpCodes	TokenNameIdentifier
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
FilterExprWalker	TokenNameIdentifier
extends	TokenNameextends
AxesWalker	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
5457182471424488375L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
FilterExprWalker	TokenNameIdentifier
(	TokenNameLPAREN
WalkingIterator	TokenNameIdentifier
locPathIterator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
locPathIterator	TokenNameIdentifier
,	TokenNameCOMMA
Axis	TokenNameIdentifier
.	TokenNameDOT
FILTEREDLIST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
Compiler	TokenNameIdentifier
compiler	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
opPos	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
stepType	TokenNameIdentifier
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
super	TokenNamesuper
.	TokenNameDOT
init	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
,	TokenNameCOMMA
opPos	TokenNameIdentifier
,	TokenNameCOMMA
stepType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
stepType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
OpCodes	TokenNameIdentifier
.	TokenNameDOT
OP_FUNCTION	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
OpCodes	TokenNameIdentifier
.	TokenNameDOT
OP_EXTFUNCTION	TokenNameIdentifier
:	TokenNameCOLON
m_mustHardReset	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
case	TokenNamecase
OpCodes	TokenNameIdentifier
.	TokenNameDOT
OP_GROUP	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
OpCodes	TokenNameIdentifier
.	TokenNameDOT
OP_VARIABLE	TokenNameIdentifier
:	TokenNameCOLON
m_expr	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
compile	TokenNameIdentifier
(	TokenNameLPAREN
opPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_expr	TokenNameIdentifier
.	TokenNameDOT
exprSetParent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m_expr	TokenNameIdentifier
instanceof	TokenNameinstanceof
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
.	TokenNameDOT
Variable	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_canDetachNodeset	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
m_expr	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
compile	TokenNameIdentifier
(	TokenNameLPAREN
opPos	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_expr	TokenNameIdentifier
.	TokenNameDOT
exprSetParent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
if	TokenNameif
(	TokenNameLPAREN
m_canDetachNodeset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_exprObj	TokenNameIdentifier
.	TokenNameDOT
detach	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
m_exprObj	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setRoot	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
root	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setRoot	TokenNameIdentifier
(	TokenNameLPAREN
root	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_exprObj	TokenNameIdentifier
=	TokenNameEQUAL
FilterExprIteratorSimple	TokenNameIdentifier
.	TokenNameDOT
executeFilterExpr	TokenNameIdentifier
(	TokenNameLPAREN
root	TokenNameIdentifier
,	TokenNameCOMMA
m_lpi	TokenNameIdentifier
.	TokenNameDOT
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
m_lpi	TokenNameIdentifier
.	TokenNameDOT
getPrefixResolver	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
m_lpi	TokenNameIdentifier
.	TokenNameDOT
getIsTopLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
m_lpi	TokenNameIdentifier
.	TokenNameDOT
m_stackFrame	TokenNameIdentifier
,	TokenNameCOMMA
m_expr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
CloneNotSupportedException	TokenNameIdentifier
{	TokenNameLBRACE
FilterExprWalker	TokenNameIdentifier
clone	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FilterExprWalker	TokenNameIdentifier
)	TokenNameRPAREN
super	TokenNamesuper
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_exprObj	TokenNameIdentifier
)	TokenNameRPAREN
clone	TokenNameIdentifier
.	TokenNameDOT
m_exprObj	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XNodeSet	TokenNameIdentifier
)	TokenNameRPAREN
m_exprObj	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
clone	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
acceptNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
getPredicateCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
countProximityPosition	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
executePredicates	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
,	TokenNameCOMMA
m_lpi	TokenNameIdentifier
.	TokenNameDOT
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
DTMIterator	TokenNameIdentifier
.	TokenNameDOT
FILTER_SKIP	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
DTMIterator	TokenNameIdentifier
.	TokenNameDOT
FILTER_ACCEPT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
se	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
se	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
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
int	TokenNameint
next	TokenNameIdentifier
=	TokenNameEQUAL
m_exprObj	TokenNameIdentifier
.	TokenNameDOT
nextNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
return	TokenNamereturn
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getLastPos	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_exprObj	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
public	TokenNamepublic
int	TokenNameint
getAxis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_exprObj	TokenNameIdentifier
.	TokenNameDOT
getAxis	TokenNameIdentifier
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
FilterExprWalker	TokenNameIdentifier
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
FilterExprWalker	TokenNameIdentifier
walker	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FilterExprWalker	TokenNameIdentifier
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
walker	TokenNameIdentifier
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