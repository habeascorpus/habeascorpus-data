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
DTMAxisTraverser	TokenNameIdentifier
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
DTMFilter	TokenNameIdentifier
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
XPathContext	TokenNameIdentifier
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
compiler	TokenNameIdentifier
.	TokenNameDOT
OpMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
patterns	TokenNameIdentifier
.	TokenNameDOT
NodeTest	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DescendantIterator	TokenNameIdentifier
extends	TokenNameextends
LocPathIterator	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1190338607743976938L	TokenNameLongLiteral
;	TokenNameSEMICOLON
DescendantIterator	TokenNameIdentifier
(	TokenNameLPAREN
Compiler	TokenNameIdentifier
compiler	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
opPos	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
analysis	TokenNameIdentifier
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
(	TokenNameLPAREN
compiler	TokenNameIdentifier
,	TokenNameCOMMA
opPos	TokenNameIdentifier
,	TokenNameCOMMA
analysis	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
firstStepPos	TokenNameIdentifier
=	TokenNameEQUAL
OpMap	TokenNameIdentifier
.	TokenNameDOT
getFirstChildPos	TokenNameIdentifier
(	TokenNameLPAREN
opPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
stepType	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
getOp	TokenNameIdentifier
(	TokenNameLPAREN
firstStepPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
orSelf	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
OpCodes	TokenNameIdentifier
.	TokenNameDOT
FROM_DESCENDANTS_OR_SELF	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
stepType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
fromRoot	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
OpCodes	TokenNameIdentifier
.	TokenNameDOT
FROM_SELF	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
stepType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
orSelf	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
OpCodes	TokenNameIdentifier
.	TokenNameDOT
FROM_ROOT	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
stepType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fromRoot	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
int	TokenNameint
nextStepPos	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
getNextStepPos	TokenNameIdentifier
(	TokenNameLPAREN
firstStepPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
compiler	TokenNameIdentifier
.	TokenNameDOT
getOp	TokenNameIdentifier
(	TokenNameLPAREN
nextStepPos	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
OpCodes	TokenNameIdentifier
.	TokenNameDOT
FROM_DESCENDANTS_OR_SELF	TokenNameIdentifier
)	TokenNameRPAREN
orSelf	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
nextStepPos	TokenNameIdentifier
=	TokenNameEQUAL
firstStepPos	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
nextStepPos	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
getNextStepPos	TokenNameIdentifier
(	TokenNameLPAREN
nextStepPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextStepPos	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
stepOp	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
getOp	TokenNameIdentifier
(	TokenNameLPAREN
nextStepPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
OpCodes	TokenNameIdentifier
.	TokenNameDOT
ENDOP	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
stepOp	TokenNameIdentifier
)	TokenNameRPAREN
firstStepPos	TokenNameIdentifier
=	TokenNameEQUAL
nextStepPos	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
analysis	TokenNameIdentifier
&	TokenNameAND
WalkerFactory	TokenNameIdentifier
.	TokenNameDOT
BIT_CHILD	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
orSelf	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fromRoot	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
orSelf	TokenNameIdentifier
)	TokenNameRPAREN
m_axis	TokenNameIdentifier
=	TokenNameEQUAL
Axis	TokenNameIdentifier
.	TokenNameDOT
DESCENDANTSORSELFFROMROOT	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
m_axis	TokenNameIdentifier
=	TokenNameEQUAL
Axis	TokenNameIdentifier
.	TokenNameDOT
DESCENDANTSFROMROOT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
orSelf	TokenNameIdentifier
)	TokenNameRPAREN
m_axis	TokenNameIdentifier
=	TokenNameEQUAL
Axis	TokenNameIdentifier
.	TokenNameDOT
DESCENDANTORSELF	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
m_axis	TokenNameIdentifier
=	TokenNameEQUAL
Axis	TokenNameIdentifier
.	TokenNameDOT
DESCENDANT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
whatToShow	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
getWhatToShow	TokenNameIdentifier
(	TokenNameLPAREN
firstStepPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
(	TokenNameLPAREN
whatToShow	TokenNameIdentifier
&	TokenNameAND
(	TokenNameLPAREN
DTMFilter	TokenNameIdentifier
.	TokenNameDOT
SHOW_ATTRIBUTE	TokenNameIdentifier
|	TokenNameOR
DTMFilter	TokenNameIdentifier
.	TokenNameDOT
SHOW_ELEMENT	TokenNameIdentifier
|	TokenNameOR
DTMFilter	TokenNameIdentifier
.	TokenNameDOT
SHOW_PROCESSING_INSTRUCTION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
whatToShow	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DTMFilter	TokenNameIdentifier
.	TokenNameDOT
SHOW_ALL	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
initNodeTest	TokenNameIdentifier
(	TokenNameLPAREN
whatToShow	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
initNodeTest	TokenNameIdentifier
(	TokenNameLPAREN
whatToShow	TokenNameIdentifier
,	TokenNameCOMMA
compiler	TokenNameIdentifier
.	TokenNameDOT
getStepNS	TokenNameIdentifier
(	TokenNameLPAREN
firstStepPos	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
compiler	TokenNameIdentifier
.	TokenNameDOT
getStepLocalName	TokenNameIdentifier
(	TokenNameLPAREN
firstStepPos	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
initPredicateInfo	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
,	TokenNameCOMMA
firstStepPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DescendantIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_axis	TokenNameIdentifier
=	TokenNameEQUAL
Axis	TokenNameIdentifier
.	TokenNameDOT
DESCENDANTSORSELFFROMROOT	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
whatToShow	TokenNameIdentifier
=	TokenNameEQUAL
DTMFilter	TokenNameIdentifier
.	TokenNameDOT
SHOW_ALL	TokenNameIdentifier
;	TokenNameSEMICOLON
initNodeTest	TokenNameIdentifier
(	TokenNameLPAREN
whatToShow	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DTMIterator	TokenNameIdentifier
cloneWithReset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
CloneNotSupportedException	TokenNameIdentifier
{	TokenNameLBRACE
DescendantIterator	TokenNameIdentifier
clone	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DescendantIterator	TokenNameIdentifier
)	TokenNameRPAREN
super	TokenNamesuper
.	TokenNameDOT
cloneWithReset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
m_traverser	TokenNameIdentifier
=	TokenNameEQUAL
m_traverser	TokenNameIdentifier
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
resetProximityPositions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
clone	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
nextNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_foundLast	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
m_lastFetched	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
resetProximityPositions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
next	TokenNameIdentifier
;	TokenNameSEMICOLON
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
VariableStack	TokenNameIdentifier
vars	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
savedStart	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
!=	TokenNameNOT_EQUAL
m_stackFrame	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
vars	TokenNameIdentifier
=	TokenNameEQUAL
m_execContext	TokenNameIdentifier
.	TokenNameDOT
getVarStack	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
savedStart	TokenNameIdentifier
=	TokenNameEQUAL
vars	TokenNameIdentifier
.	TokenNameDOT
getStackFrame	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vars	TokenNameIdentifier
.	TokenNameDOT
setStackFrame	TokenNameIdentifier
(	TokenNameLPAREN
m_stackFrame	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
vars	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
savedStart	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
do	TokenNamedo
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
m_extendedTypeID	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
next	TokenNameIdentifier
=	TokenNameEQUAL
m_lastFetched	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
m_lastFetched	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
m_traverser	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
(	TokenNameLPAREN
m_context	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
m_traverser	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
m_context	TokenNameIdentifier
,	TokenNameCOMMA
m_lastFetched	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
next	TokenNameIdentifier
=	TokenNameEQUAL
m_lastFetched	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
m_lastFetched	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
m_traverser	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
(	TokenNameLPAREN
m_context	TokenNameIdentifier
,	TokenNameCOMMA
m_extendedTypeID	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
m_traverser	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
m_context	TokenNameIdentifier
,	TokenNameCOMMA
m_lastFetched	TokenNameIdentifier
,	TokenNameCOMMA
m_extendedTypeID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
DTMIterator	TokenNameIdentifier
.	TokenNameDOT
FILTER_ACCEPT	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
acceptNode	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
else	TokenNameelse
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_pos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
return	TokenNamereturn
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
m_foundLast	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
!=	TokenNameNOT_EQUAL
m_stackFrame	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
vars	TokenNameIdentifier
.	TokenNameDOT
setStackFrame	TokenNameIdentifier
(	TokenNameLPAREN
savedStart	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
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
m_traverser	TokenNameIdentifier
=	TokenNameEQUAL
m_cdtm	TokenNameIdentifier
.	TokenNameDOT
getAxisTraverser	TokenNameIdentifier
(	TokenNameLPAREN
m_axis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
localName	TokenNameIdentifier
=	TokenNameEQUAL
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
namespace	TokenNameIdentifier
=	TokenNameEQUAL
getNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
what	TokenNameIdentifier
=	TokenNameEQUAL
m_whatToShow	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
DTMFilter	TokenNameIdentifier
.	TokenNameDOT
SHOW_ALL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
what	TokenNameIdentifier
||	TokenNameOR_OR
NodeTest	TokenNameIdentifier
.	TokenNameDOT
WILD	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
localName	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
NodeTest	TokenNameIdentifier
.	TokenNameDOT
WILD	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
namespace	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
m_extendedTypeID	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
type	TokenNameIdentifier
=	TokenNameEQUAL
getNodeTypeTest	TokenNameIdentifier
(	TokenNameLPAREN
what	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_extendedTypeID	TokenNameIdentifier
=	TokenNameEQUAL
m_cdtm	TokenNameIdentifier
.	TokenNameDOT
getExpandedTypeID	TokenNameIdentifier
(	TokenNameLPAREN
namespace	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
asNode	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
getPredicateCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
asNode	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
current	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DTM	TokenNameIdentifier
dtm	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getDTM	TokenNameIdentifier
(	TokenNameLPAREN
current	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DTMAxisTraverser	TokenNameIdentifier
traverser	TokenNameIdentifier
=	TokenNameEQUAL
dtm	TokenNameIdentifier
.	TokenNameDOT
getAxisTraverser	TokenNameIdentifier
(	TokenNameLPAREN
m_axis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
localName	TokenNameIdentifier
=	TokenNameEQUAL
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
namespace	TokenNameIdentifier
=	TokenNameEQUAL
getNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
what	TokenNameIdentifier
=	TokenNameEQUAL
m_whatToShow	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
DTMFilter	TokenNameIdentifier
.	TokenNameDOT
SHOW_ALL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
what	TokenNameIdentifier
||	TokenNameOR_OR
localName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NodeTest	TokenNameIdentifier
.	TokenNameDOT
WILD	TokenNameIdentifier
||	TokenNameOR_OR
namespace	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NodeTest	TokenNameIdentifier
.	TokenNameDOT
WILD	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
traverser	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
(	TokenNameLPAREN
current	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
type	TokenNameIdentifier
=	TokenNameEQUAL
getNodeTypeTest	TokenNameIdentifier
(	TokenNameLPAREN
what	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
extendedType	TokenNameIdentifier
=	TokenNameEQUAL
dtm	TokenNameIdentifier
.	TokenNameDOT
getExpandedTypeID	TokenNameIdentifier
(	TokenNameLPAREN
namespace	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
traverser	TokenNameIdentifier
.	TokenNameDOT
first	TokenNameIdentifier
(	TokenNameLPAREN
current	TokenNameIdentifier
,	TokenNameCOMMA
extendedType	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
m_allowDetach	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_traverser	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
m_extendedTypeID	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
detach	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getAxis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_axis	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
transient	TokenNametransient
protected	TokenNameprotected
DTMAxisTraverser	TokenNameIdentifier
m_traverser	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
m_axis	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
m_extendedTypeID	TokenNameIdentifier
;	TokenNameSEMICOLON
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
if	TokenNameif
(	TokenNameLPAREN
m_axis	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
DescendantIterator	TokenNameIdentifier
)	TokenNameRPAREN
expr	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
m_axis	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
