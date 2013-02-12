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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
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
CSSStylableElement	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
CSSPseudoClassCondition	TokenNameIdentifier
extends	TokenNameextends
AbstractAttributeCondition	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
CSSPseudoClassCondition	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespaceURI	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
namespaceURI	TokenNameIdentifier
=	TokenNameEQUAL
namespaceURI	TokenNameIdentifier
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
!	TokenNameNOT
super	TokenNamesuper
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
obj	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
CSSPseudoClassCondition	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CSSPseudoClassCondition	TokenNameIdentifier
)	TokenNameRPAREN
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
c	TokenNameIdentifier
.	TokenNameDOT
namespaceURI	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
namespaceURI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
namespaceURI	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getConditionType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
SAC_PSEUDO_CLASS_CONDITION	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getNamespaceURI	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
namespaceURI	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getSpecified	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
match	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
pseudoE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
e	TokenNameIdentifier
instanceof	TokenNameinstanceof
CSSStylableElement	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
(	TokenNameLPAREN
(	TokenNameLPAREN
CSSStylableElement	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
isPseudoInstanceOf	TokenNameIdentifier
(	TokenNameLPAREN
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
fillAttributeSet	TokenNameIdentifier
(	TokenNameLPAREN
Set	TokenNameIdentifier
attrSet	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
":"	TokenNameStringLiteral
+	TokenNamePLUS
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
