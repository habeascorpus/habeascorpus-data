package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
html	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DeepNodeListImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
ElementImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
NodeImpl	TokenNameIdentifier
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
NameNodeListImpl	TokenNameIdentifier
extends	TokenNameextends
DeepNodeListImpl	TokenNameIdentifier
implements	TokenNameimplements
NodeList	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
NameNodeListImpl	TokenNameIdentifier
(	TokenNameLPAREN
NodeImpl	TokenNameIdentifier
rootNode	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
tagName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
rootNode	TokenNameIdentifier
,	TokenNameCOMMA
tagName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Node	TokenNameIdentifier
nextMatchingElementAfter	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
current	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Node	TokenNameIdentifier
next	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
current	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
current	TokenNameIdentifier
.	TokenNameDOT
hasChildNodes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
current	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
current	TokenNameIdentifier
.	TokenNameDOT
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
current	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
rootNode	TokenNameIdentifier
&&	TokenNameAND_AND
null	TokenNamenull
!=	TokenNameNOT_EQUAL
(	TokenNameLPAREN
next	TokenNameIdentifier
=	TokenNameEQUAL
current	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
current	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
next	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
current	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
rootNode	TokenNameIdentifier
;	TokenNameSEMICOLON
current	TokenNameIdentifier
=	TokenNameEQUAL
current	TokenNameIdentifier
.	TokenNameDOT
getParentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
next	TokenNameIdentifier
=	TokenNameEQUAL
current	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
current	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
current	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
rootNode	TokenNameIdentifier
&&	TokenNameAND_AND
current	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
current	TokenNameIdentifier
.	TokenNameDOT
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
Node	TokenNameIdentifier
.	TokenNameDOT
ELEMENT_NODE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
ElementImpl	TokenNameIdentifier
)	TokenNameRPAREN
current	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"name"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"*"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
name	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
tagName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
current	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE