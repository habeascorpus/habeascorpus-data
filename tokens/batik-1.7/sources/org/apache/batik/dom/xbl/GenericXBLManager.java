package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
xbl	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
AbstractNode	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Element	TokenNameIdentifier
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
NodeList	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
GenericXBLManager	TokenNameIdentifier
implements	TokenNameimplements
XBLManager	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
isProcessing	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
startProcessing	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
isProcessing	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
stopProcessing	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
isProcessing	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isProcessing	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
isProcessing	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getXblParentNode	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
n	TokenNameIdentifier
.	TokenNameDOT
getParentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
NodeList	TokenNameIdentifier
getXblChildNodes	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
n	TokenNameIdentifier
.	TokenNameDOT
getChildNodes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
NodeList	TokenNameIdentifier
getXblScopedChildNodes	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
n	TokenNameIdentifier
.	TokenNameDOT
getChildNodes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getXblFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
n	TokenNameIdentifier
.	TokenNameDOT
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getXblLastChild	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
n	TokenNameIdentifier
.	TokenNameDOT
getLastChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getXblPreviousSibling	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
n	TokenNameIdentifier
.	TokenNameDOT
getPreviousSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
getXblNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
n	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
getXblFirstElementChild	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Node	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
.	TokenNameDOT
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
m	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
m	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
m	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
getXblLastElementChild	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Node	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
.	TokenNameDOT
getLastChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
m	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
m	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
getPreviousSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
m	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
getXblPreviousElementSibling	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Node	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
;	TokenNameSEMICOLON
do	TokenNamedo
{	TokenNameLBRACE
m	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
getPreviousSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
m	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
m	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
m	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
getXblNextElementSibling	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Node	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
;	TokenNameSEMICOLON
do	TokenNamedo
{	TokenNameLBRACE
m	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
m	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
m	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
Element	TokenNameIdentifier
)	TokenNameRPAREN
m	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
getXblBoundElement	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Element	TokenNameIdentifier
getXblShadowTree	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
NodeList	TokenNameIdentifier
getXblDefinitions	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
AbstractNode	TokenNameIdentifier
.	TokenNameDOT
EMPTY_NODE_LIST	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
