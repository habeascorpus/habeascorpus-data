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
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
ClassGenerator	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
MethodGenerator	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
TypeCheckError	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
BooleanCall	TokenNameIdentifier
extends	TokenNameextends
FunctionCall	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Expression	TokenNameIdentifier
_arg	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
BooleanCall	TokenNameIdentifier
(	TokenNameLPAREN
QName	TokenNameIdentifier
fname	TokenNameIdentifier
,	TokenNameCOMMA
Vector	TokenNameIdentifier
arguments	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
fname	TokenNameIdentifier
,	TokenNameCOMMA
arguments	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_arg	TokenNameIdentifier
=	TokenNameEQUAL
argument	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Type	TokenNameIdentifier
typeCheck	TokenNameIdentifier
(	TokenNameLPAREN
SymbolTable	TokenNameIdentifier
stable	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TypeCheckError	TokenNameIdentifier
{	TokenNameLBRACE
_arg	TokenNameIdentifier
.	TokenNameDOT
typeCheck	TokenNameIdentifier
(	TokenNameLPAREN
stable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
_type	TokenNameIdentifier
=	TokenNameEQUAL
Type	TokenNameIdentifier
.	TokenNameDOT
Boolean	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
translate	TokenNameIdentifier
(	TokenNameLPAREN
ClassGenerator	TokenNameIdentifier
classGen	TokenNameIdentifier
,	TokenNameCOMMA
MethodGenerator	TokenNameIdentifier
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_arg	TokenNameIdentifier
.	TokenNameDOT
translate	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Type	TokenNameIdentifier
targ	TokenNameIdentifier
=	TokenNameEQUAL
_arg	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
targ	TokenNameIdentifier
.	TokenNameDOT
identicalTo	TokenNameIdentifier
(	TokenNameLPAREN
Type	TokenNameIdentifier
.	TokenNameDOT
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
_arg	TokenNameIdentifier
.	TokenNameDOT
startIterator	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
targ	TokenNameIdentifier
.	TokenNameDOT
translateTo	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
,	TokenNameCOMMA
Type	TokenNameIdentifier
.	TokenNameDOT
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE