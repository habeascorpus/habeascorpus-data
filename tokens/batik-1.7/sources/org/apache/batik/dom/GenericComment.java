package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
GenericComment	TokenNameIdentifier
extends	TokenNameextends
AbstractComment	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
readonly	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
GenericComment	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
GenericComment	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
AbstractDocument	TokenNameIdentifier
owner	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ownerDocument	TokenNameIdentifier
=	TokenNameEQUAL
owner	TokenNameIdentifier
;	TokenNameSEMICOLON
setNodeValue	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isReadonly	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
readonly	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setReadonly	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
v	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
readonly	TokenNameIdentifier
=	TokenNameEQUAL
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Node	TokenNameIdentifier
newNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
GenericComment	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
