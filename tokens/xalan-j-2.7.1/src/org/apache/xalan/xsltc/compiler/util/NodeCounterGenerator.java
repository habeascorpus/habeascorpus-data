package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
compiler	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
bcel	TokenNameIdentifier
.	TokenNameDOT
generic	TokenNameIdentifier
.	TokenNameDOT
ALOAD	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
bcel	TokenNameIdentifier
.	TokenNameDOT
generic	TokenNameIdentifier
.	TokenNameDOT
Instruction	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
compiler	TokenNameIdentifier
.	TokenNameDOT
Stylesheet	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
NodeCounterGenerator	TokenNameIdentifier
extends	TokenNameextends
ClassGenerator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Instruction	TokenNameIdentifier
_aloadTranslet	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
NodeCounterGenerator	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
className	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
superClassName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
fileName	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
accessFlags	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
interfaces	TokenNameIdentifier
,	TokenNameCOMMA
Stylesheet	TokenNameIdentifier
stylesheet	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
className	TokenNameIdentifier
,	TokenNameCOMMA
superClassName	TokenNameIdentifier
,	TokenNameCOMMA
fileName	TokenNameIdentifier
,	TokenNameCOMMA
accessFlags	TokenNameIdentifier
,	TokenNameCOMMA
interfaces	TokenNameIdentifier
,	TokenNameCOMMA
stylesheet	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setTransletIndex	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_aloadTranslet	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ALOAD	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Instruction	TokenNameIdentifier
loadTranslet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_aloadTranslet	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isExternal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
