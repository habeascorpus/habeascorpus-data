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
GenericEntity	TokenNameIdentifier
extends	TokenNameextends
AbstractEntity	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
readonly	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
GenericEntity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
GenericEntity	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
pubId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
sysId	TokenNameIdentifier
,	TokenNameCOMMA
AbstractDocument	TokenNameIdentifier
owner	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ownerDocument	TokenNameIdentifier
=	TokenNameEQUAL
owner	TokenNameIdentifier
;	TokenNameSEMICOLON
setNodeName	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setPublicId	TokenNameIdentifier
(	TokenNameLPAREN
pubId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setSystemId	TokenNameIdentifier
(	TokenNameLPAREN
sysId	TokenNameIdentifier
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
GenericEntity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE