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
public	TokenNamepublic
class	TokenNameclass
SelfIteratorNoPredicate	TokenNameIdentifier
extends	TokenNameextends
LocPathIterator	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
4226887905279814201L	TokenNameLongLiteral
;	TokenNameSEMICOLON
SelfIteratorNoPredicate	TokenNameIdentifier
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
}	TokenNameRBRACE
public	TokenNamepublic
SelfIteratorNoPredicate	TokenNameIdentifier
(	TokenNameLPAREN
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
null	TokenNamenull
)	TokenNameRPAREN
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
int	TokenNameint
next	TokenNameIdentifier
;	TokenNameSEMICOLON
m_lastFetched	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
m_lastFetched	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
m_context	TokenNameIdentifier
:	TokenNameCOLON
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
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
return	TokenNamereturn
xctxt	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE