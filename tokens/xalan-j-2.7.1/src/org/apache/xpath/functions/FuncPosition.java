package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
functions	TokenNameIdentifier
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
XPathContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
axes	TokenNameIdentifier
.	TokenNameDOT
SubContextList	TokenNameIdentifier
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
objects	TokenNameIdentifier
.	TokenNameDOT
XNumber	TokenNameIdentifier
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
FuncPosition	TokenNameIdentifier
extends	TokenNameextends
Function	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
9092846348197271582L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
m_isTopLevel	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
postCompileStep	TokenNameIdentifier
(	TokenNameLPAREN
Compiler	TokenNameIdentifier
compiler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_isTopLevel	TokenNameIdentifier
=	TokenNameEQUAL
compiler	TokenNameIdentifier
.	TokenNameDOT
getLocationPathDepth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getPositionInContextNodeList	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SubContextList	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
m_isTopLevel	TokenNameIdentifier
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
xctxt	TokenNameIdentifier
.	TokenNameDOT
getSubContextList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
iter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
prox	TokenNameIdentifier
=	TokenNameEQUAL
iter	TokenNameIdentifier
.	TokenNameDOT
getProximityPosition	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
prox	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
DTMIterator	TokenNameIdentifier
cnl	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getContextNodeList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
cnl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
cnl	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
cnl	TokenNameIdentifier
.	TokenNameDOT
getCurrentPos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
cnl	TokenNameIdentifier
=	TokenNameEQUAL
cnl	TokenNameIdentifier
.	TokenNameDOT
cloneWithReset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
CloneNotSupportedException	TokenNameIdentifier
cnse	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
cnse	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
currentNode	TokenNameIdentifier
=	TokenNameEQUAL
xctxt	TokenNameIdentifier
.	TokenNameDOT
getContextNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
(	TokenNameLPAREN
n	TokenNameIdentifier
=	TokenNameEQUAL
cnl	TokenNameIdentifier
.	TokenNameDOT
nextNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
currentNode	TokenNameIdentifier
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
cnl	TokenNameIdentifier
.	TokenNameDOT
getCurrentPos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
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
double	TokenNamedouble
pos	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
getPositionInContextNodeList	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
XNumber	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
)	TokenNameRPAREN
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
}	TokenNameRBRACE
}	TokenNameRBRACE
