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
patterns	TokenNameIdentifier
.	TokenNameDOT
NodeTest	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
UnionChildIterator	TokenNameIdentifier
extends	TokenNameextends
ChildTestIterator	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
3500298482193003495L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
PredicatedNodeTest	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
m_nodeTests	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
UnionChildIterator	TokenNameIdentifier
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
void	TokenNamevoid
addNodeTest	TokenNameIdentifier
(	TokenNameLPAREN
PredicatedNodeTest	TokenNameIdentifier
test	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_nodeTests	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_nodeTests	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PredicatedNodeTest	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
m_nodeTests	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
test	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
PredicatedNodeTest	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
tests	TokenNameIdentifier
=	TokenNameEQUAL
m_nodeTests	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
m_nodeTests	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
m_nodeTests	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PredicatedNodeTest	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
tests	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
m_nodeTests	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_nodeTests	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
test	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
test	TokenNameIdentifier
.	TokenNameDOT
exprSetParent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
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
super	TokenNamesuper
.	TokenNameDOT
fixupVariables	TokenNameIdentifier
(	TokenNameLPAREN
vars	TokenNameIdentifier
,	TokenNameCOMMA
globalsSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m_nodeTests	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
m_nodeTests	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
m_nodeTests	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
fixupVariables	TokenNameIdentifier
(	TokenNameLPAREN
vars	TokenNameIdentifier
,	TokenNameCOMMA
globalsSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
acceptNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
=	TokenNameEQUAL
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
xctxt	TokenNameIdentifier
.	TokenNameDOT
pushCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
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
m_nodeTests	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
PredicatedNodeTest	TokenNameIdentifier
pnt	TokenNameIdentifier
=	TokenNameEQUAL
m_nodeTests	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
XObject	TokenNameIdentifier
score	TokenNameIdentifier
=	TokenNameEQUAL
pnt	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
,	TokenNameCOMMA
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
score	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
NodeTest	TokenNameIdentifier
.	TokenNameDOT
SCORE_NONE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
pnt	TokenNameIdentifier
.	TokenNameDOT
getPredicateCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
pnt	TokenNameIdentifier
.	TokenNameDOT
executePredicates	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
,	TokenNameCOMMA
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
DTMIterator	TokenNameIdentifier
.	TokenNameDOT
FILTER_ACCEPT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
return	TokenNamereturn
DTMIterator	TokenNameIdentifier
.	TokenNameDOT
FILTER_ACCEPT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
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
finally	TokenNamefinally
{	TokenNameLBRACE
xctxt	TokenNameIdentifier
.	TokenNameDOT
popCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
DTMIterator	TokenNameIdentifier
.	TokenNameDOT
FILTER_SKIP	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
