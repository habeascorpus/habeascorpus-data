package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
Transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
.	TokenNameDOT
ElemTemplate	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
.	TokenNameDOT
ElemTemplateElement	TokenNameIdentifier
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
traversal	TokenNameIdentifier
.	TokenNameDOT
NodeIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XalanTransformState	TokenNameIdentifier
implements	TokenNameimplements
TransformState	TokenNameIdentifier
{	TokenNameLBRACE
Node	TokenNameIdentifier
m_node	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
ElemTemplateElement	TokenNameIdentifier
m_currentElement	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
ElemTemplate	TokenNameIdentifier
m_currentTemplate	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
ElemTemplate	TokenNameIdentifier
m_matchedTemplate	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
m_currentNodeHandle	TokenNameIdentifier
=	TokenNameEQUAL
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
;	TokenNameSEMICOLON
Node	TokenNameIdentifier
m_currentNode	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
m_matchedNode	TokenNameIdentifier
=	TokenNameEQUAL
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
;	TokenNameSEMICOLON
DTMIterator	TokenNameIdentifier
m_contextNodeList	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
boolean	TokenNameboolean
m_elemPending	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
TransformerImpl	TokenNameIdentifier
m_transformer	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_node	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
resetState	TokenNameIdentifier
(	TokenNameLPAREN
Transformer	TokenNameIdentifier
transformer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
transformer	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
transformer	TokenNameIdentifier
instanceof	TokenNameinstanceof
TransformerImpl	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
m_transformer	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TransformerImpl	TokenNameIdentifier
)	TokenNameRPAREN
transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
m_currentElement	TokenNameIdentifier
=	TokenNameEQUAL
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getCurrentElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_currentTemplate	TokenNameIdentifier
=	TokenNameEQUAL
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getCurrentTemplate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_matchedTemplate	TokenNameIdentifier
=	TokenNameEQUAL
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getMatchedTemplate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
currentNodeHandle	TokenNameIdentifier
=	TokenNameEQUAL
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DTM	TokenNameIdentifier
dtm	TokenNameIdentifier
=	TokenNameEQUAL
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDTM	TokenNameIdentifier
(	TokenNameLPAREN
currentNodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_currentNode	TokenNameIdentifier
=	TokenNameEQUAL
dtm	TokenNameIdentifier
.	TokenNameDOT
getNode	TokenNameIdentifier
(	TokenNameLPAREN
currentNodeHandle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_matchedNode	TokenNameIdentifier
=	TokenNameEQUAL
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getMatchedNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_contextNodeList	TokenNameIdentifier
=	TokenNameEQUAL
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getContextNodeList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ElemTemplateElement	TokenNameIdentifier
getCurrentElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_elemPending	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
m_currentElement	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getCurrentElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_currentNode	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_currentNode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
DTM	TokenNameIdentifier
dtm	TokenNameIdentifier
=	TokenNameEQUAL
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDTM	TokenNameIdentifier
(	TokenNameLPAREN
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
dtm	TokenNameIdentifier
.	TokenNameDOT
getNode	TokenNameIdentifier
(	TokenNameLPAREN
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ElemTemplate	TokenNameIdentifier
getCurrentTemplate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_elemPending	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
m_currentTemplate	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getCurrentTemplate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ElemTemplate	TokenNameIdentifier
getMatchedTemplate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_elemPending	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
m_matchedTemplate	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getMatchedTemplate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getMatchedNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_elemPending	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DTM	TokenNameIdentifier
dtm	TokenNameIdentifier
=	TokenNameEQUAL
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDTM	TokenNameIdentifier
(	TokenNameLPAREN
m_matchedNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
dtm	TokenNameIdentifier
.	TokenNameDOT
getNode	TokenNameIdentifier
(	TokenNameLPAREN
m_matchedNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
DTM	TokenNameIdentifier
dtm	TokenNameIdentifier
=	TokenNameEQUAL
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getXPathContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDTM	TokenNameIdentifier
(	TokenNameLPAREN
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getMatchedNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
dtm	TokenNameIdentifier
.	TokenNameDOT
getNode	TokenNameIdentifier
(	TokenNameLPAREN
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getMatchedNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
NodeIterator	TokenNameIdentifier
getContextNodeList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_elemPending	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
.	TokenNameDOT
DTMNodeIterator	TokenNameIdentifier
(	TokenNameLPAREN
m_contextNodeList	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
.	TokenNameDOT
DTMNodeIterator	TokenNameIdentifier
(	TokenNameLPAREN
m_transformer	TokenNameIdentifier
.	TokenNameDOT
getContextNodeList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Transformer	TokenNameIdentifier
getTransformer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE