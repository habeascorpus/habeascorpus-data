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
OpMap	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
OneStepIteratorForward	TokenNameIdentifier
extends	TokenNameextends
ChildTestIterator	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1576936606178190566L	TokenNameLongLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
m_axis	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
OneStepIteratorForward	TokenNameIdentifier
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
m_axis	TokenNameIdentifier
=	TokenNameEQUAL
WalkerFactory	TokenNameIdentifier
.	TokenNameDOT
getAxisFromStep	TokenNameIdentifier
(	TokenNameLPAREN
compiler	TokenNameIdentifier
,	TokenNameCOMMA
firstStepPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
OneStepIteratorForward	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
axis	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_axis	TokenNameIdentifier
=	TokenNameEQUAL
axis	TokenNameIdentifier
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
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
getNextNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
return	TokenNamereturn
m_lastFetched	TokenNameIdentifier
;	TokenNameSEMICOLON
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
OneStepIteratorForward	TokenNameIdentifier
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
