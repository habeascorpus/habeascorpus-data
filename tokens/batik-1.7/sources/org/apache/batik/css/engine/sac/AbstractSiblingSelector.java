package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
engine	TokenNameIdentifier
.	TokenNameDOT
sac	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
sac	TokenNameIdentifier
.	TokenNameDOT
Selector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
sac	TokenNameIdentifier
.	TokenNameDOT
SiblingSelector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
sac	TokenNameIdentifier
.	TokenNameDOT
SimpleSelector	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AbstractSiblingSelector	TokenNameIdentifier
implements	TokenNameimplements
SiblingSelector	TokenNameIdentifier
,	TokenNameCOMMA
ExtendedSelector	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
short	TokenNameshort
nodeType	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Selector	TokenNameIdentifier
selector	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
SimpleSelector	TokenNameIdentifier
simpleSelector	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AbstractSiblingSelector	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
type	TokenNameIdentifier
,	TokenNameCOMMA
Selector	TokenNameIdentifier
sel	TokenNameIdentifier
,	TokenNameCOMMA
SimpleSelector	TokenNameIdentifier
simple	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nodeType	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
selector	TokenNameIdentifier
=	TokenNameEQUAL
sel	TokenNameIdentifier
;	TokenNameSEMICOLON
simpleSelector	TokenNameIdentifier
=	TokenNameEQUAL
simple	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
nodeType	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
obj	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
(	TokenNameLPAREN
obj	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
AbstractSiblingSelector	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AbstractSiblingSelector	TokenNameIdentifier
)	TokenNameRPAREN
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
s	TokenNameIdentifier
.	TokenNameDOT
simpleSelector	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
simpleSelector	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getSpecificity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
ExtendedSelector	TokenNameIdentifier
)	TokenNameRPAREN
selector	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getSpecificity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
(	TokenNameLPAREN
ExtendedSelector	TokenNameIdentifier
)	TokenNameRPAREN
simpleSelector	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getSpecificity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Selector	TokenNameIdentifier
getSelector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
selector	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SimpleSelector	TokenNameIdentifier
getSiblingSelector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
simpleSelector	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
