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
bcel	TokenNameIdentifier
.	TokenNameDOT
generic	TokenNameIdentifier
.	TokenNameDOT
ConstantPoolGen	TokenNameIdentifier
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
INVOKESTATIC	TokenNameIdentifier
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
InstructionList	TokenNameIdentifier
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
final	TokenNamefinal
class	TokenNameclass
CeilingCall	TokenNameIdentifier
extends	TokenNameextends
FunctionCall	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
CeilingCall	TokenNameIdentifier
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
final	TokenNamefinal
ConstantPoolGen	TokenNameIdentifier
cpg	TokenNameIdentifier
=	TokenNameEQUAL
classGen	TokenNameIdentifier
.	TokenNameDOT
getConstantPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
InstructionList	TokenNameIdentifier
il	TokenNameIdentifier
=	TokenNameEQUAL
methodGen	TokenNameIdentifier
.	TokenNameDOT
getInstructionList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
argument	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
translate	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
INVOKESTATIC	TokenNameIdentifier
(	TokenNameLPAREN
cpg	TokenNameIdentifier
.	TokenNameDOT
addMethodref	TokenNameIdentifier
(	TokenNameLPAREN
MATH_CLASS	TokenNameIdentifier
,	TokenNameCOMMA
"ceil"	TokenNameStringLiteral
,	TokenNameCOMMA
"(D)D"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
