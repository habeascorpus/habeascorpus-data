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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
bcel	TokenNameIdentifier
.	TokenNameDOT
generic	TokenNameIdentifier
.	TokenNameDOT
InstructionHandle	TokenNameIdentifier
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
BooleanType	TokenNameIdentifier
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
ErrorMsg	TokenNameIdentifier
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
Util	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
If	TokenNameIdentifier
extends	TokenNameextends
Instruction	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Expression	TokenNameIdentifier
_test	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
_ignore	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
display	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
indent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
indent	TokenNameIdentifier
(	TokenNameLPAREN
indent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Util	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"If"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
indent	TokenNameIdentifier
(	TokenNameLPAREN
indent	TokenNameIdentifier
+	TokenNamePLUS
IndentIncrement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
"test "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Util	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
_test	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
displayContents	TokenNameIdentifier
(	TokenNameLPAREN
indent	TokenNameIdentifier
+	TokenNamePLUS
IndentIncrement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
parseContents	TokenNameIdentifier
(	TokenNameLPAREN
Parser	TokenNameIdentifier
parser	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_test	TokenNameIdentifier
=	TokenNameEQUAL
parser	TokenNameIdentifier
.	TokenNameDOT
parseExpression	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
_test	TokenNameIdentifier
.	TokenNameDOT
isDummy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
reportError	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
parser	TokenNameIdentifier
,	TokenNameCOMMA
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
REQUIRED_ATTR_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Object	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
_test	TokenNameIdentifier
.	TokenNameDOT
evaluateAtCompileTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
result	TokenNameIdentifier
instanceof	TokenNameinstanceof
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_ignore	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
(	TokenNameLPAREN
(	TokenNameLPAREN
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
result	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
booleanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
parseChildren	TokenNameIdentifier
(	TokenNameLPAREN
parser	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
_test	TokenNameIdentifier
.	TokenNameDOT
typeCheck	TokenNameIdentifier
(	TokenNameLPAREN
stable	TokenNameIdentifier
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
BooleanType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
false	TokenNamefalse
)	TokenNameRPAREN
{	TokenNameLBRACE
_test	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CastExpr	TokenNameIdentifier
(	TokenNameLPAREN
_test	TokenNameIdentifier
,	TokenNameCOMMA
Type	TokenNameIdentifier
.	TokenNameDOT
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
_ignore	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
typeCheckContents	TokenNameIdentifier
(	TokenNameLPAREN
stable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
Type	TokenNameIdentifier
.	TokenNameDOT
Void	TokenNameIdentifier
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
InstructionList	TokenNameIdentifier
il	TokenNameIdentifier
=	TokenNameEQUAL
methodGen	TokenNameIdentifier
.	TokenNameDOT
getInstructionList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_test	TokenNameIdentifier
.	TokenNameDOT
translateDesynthesized	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
InstructionHandle	TokenNameIdentifier
truec	TokenNameIdentifier
=	TokenNameEQUAL
il	TokenNameIdentifier
.	TokenNameDOT
getEnd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
_ignore	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
translateContents	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_test	TokenNameIdentifier
.	TokenNameDOT
backPatchFalseList	TokenNameIdentifier
(	TokenNameLPAREN
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
NOP	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_test	TokenNameIdentifier
.	TokenNameDOT
backPatchTrueList	TokenNameIdentifier
(	TokenNameLPAREN
truec	TokenNameIdentifier
.	TokenNameDOT
getNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE