package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
resolution	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
Repository	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
InvalidRepositoryException	TokenNameIdentifier
extends	TokenNameextends
Exception	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Repository	TokenNameIdentifier
repository	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
InvalidRepositoryException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
Repository	TokenNameIdentifier
repository	TokenNameIdentifier
,	TokenNameCOMMA
Throwable	TokenNameIdentifier
cause	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
cause	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
repository	TokenNameIdentifier
=	TokenNameEQUAL
repository	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InvalidRepositoryException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
Repository	TokenNameIdentifier
repository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
repository	TokenNameIdentifier
=	TokenNameEQUAL
repository	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Repository	TokenNameIdentifier
getRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
repository	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE