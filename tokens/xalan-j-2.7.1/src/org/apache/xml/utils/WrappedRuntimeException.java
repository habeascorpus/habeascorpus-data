package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
WrappedRuntimeException	TokenNameIdentifier
extends	TokenNameextends
RuntimeException	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
7140414456714658073L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Exception	TokenNameIdentifier
m_exception	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
WrappedRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_exception	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
WrappedRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msg	TokenNameIdentifier
,	TokenNameCOMMA
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_exception	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Exception	TokenNameIdentifier
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_exception	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
