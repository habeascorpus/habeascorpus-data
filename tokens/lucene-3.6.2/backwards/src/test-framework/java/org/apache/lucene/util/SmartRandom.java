package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Random	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SmartRandom	TokenNameIdentifier
extends	TokenNameextends
Random	TokenNameIdentifier
{	TokenNameLBRACE
boolean	TokenNameboolean
initialized	TokenNameIdentifier
;	TokenNameSEMICOLON
SmartRandom	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
seed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
seed	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
int	TokenNameint
next	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
bits	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
initialized	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"!!! WARNING: test is using random from static initializer !!!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
.	TokenNameDOT
dumpStack	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
bits	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
