package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
ja	TokenNameIdentifier
.	TokenNameDOT
tokenattributes	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
ja	TokenNameIdentifier
.	TokenNameDOT
Token	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
AttributeImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
AttributeReflector	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
BaseFormAttributeImpl	TokenNameIdentifier
extends	TokenNameextends
AttributeImpl	TokenNameIdentifier
implements	TokenNameimplements
BaseFormAttribute	TokenNameIdentifier
,	TokenNameCOMMA
Cloneable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Token	TokenNameIdentifier
token	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getBaseForm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
token	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
token	TokenNameIdentifier
.	TokenNameDOT
getBaseForm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setToken	TokenNameIdentifier
(	TokenNameLPAREN
Token	TokenNameIdentifier
token	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
token	TokenNameIdentifier
=	TokenNameEQUAL
token	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
token	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
copyTo	TokenNameIdentifier
(	TokenNameLPAREN
AttributeImpl	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
BaseFormAttribute	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
BaseFormAttribute	TokenNameIdentifier
)	TokenNameRPAREN
target	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
setToken	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
reflectWith	TokenNameIdentifier
(	TokenNameLPAREN
AttributeReflector	TokenNameIdentifier
reflector	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reflector	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
(	TokenNameLPAREN
BaseFormAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
"baseForm"	TokenNameStringLiteral
,	TokenNameCOMMA
getBaseForm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
