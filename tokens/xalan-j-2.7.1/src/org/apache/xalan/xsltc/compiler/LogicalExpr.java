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
GOTO	TokenNameIdentifier
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
MethodType	TokenNameIdentifier
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
LogicalExpr	TokenNameIdentifier
extends	TokenNameextends
Expression	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
OR	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
AND	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
_op	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Expression	TokenNameIdentifier
_left	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Expression	TokenNameIdentifier
_right	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
Ops	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"or"	TokenNameStringLiteral
,	TokenNameCOMMA
"and"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
LogicalExpr	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
op	TokenNameIdentifier
,	TokenNameCOMMA
Expression	TokenNameIdentifier
left	TokenNameIdentifier
,	TokenNameCOMMA
Expression	TokenNameIdentifier
right	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_op	TokenNameIdentifier
=	TokenNameEQUAL
op	TokenNameIdentifier
;	TokenNameSEMICOLON
(	TokenNameLPAREN
_left	TokenNameIdentifier
=	TokenNameEQUAL
left	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setParent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
(	TokenNameLPAREN
_right	TokenNameIdentifier
=	TokenNameEQUAL
right	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setParent	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasPositionCall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
_left	TokenNameIdentifier
.	TokenNameDOT
hasPositionCall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
_right	TokenNameIdentifier
.	TokenNameDOT
hasPositionCall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasLastCall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
_left	TokenNameIdentifier
.	TokenNameDOT
hasLastCall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
_right	TokenNameIdentifier
.	TokenNameDOT
hasLastCall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
evaluateAtCompileTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
Object	TokenNameIdentifier
leftb	TokenNameIdentifier
=	TokenNameEQUAL
_left	TokenNameIdentifier
.	TokenNameDOT
evaluateAtCompileTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Object	TokenNameIdentifier
rightb	TokenNameIdentifier
=	TokenNameEQUAL
_right	TokenNameIdentifier
.	TokenNameDOT
evaluateAtCompileTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
leftb	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
rightb	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
_op	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
AND	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
leftb	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
&&	TokenNameAND_AND
rightb	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
:	TokenNameCOLON
Boolean	TokenNameIdentifier
.	TokenNameDOT
FALSE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
leftb	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
||	TokenNameOR_OR
rightb	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
:	TokenNameCOLON
Boolean	TokenNameIdentifier
.	TokenNameDOT
FALSE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getOp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
_op	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setParser	TokenNameIdentifier
(	TokenNameLPAREN
Parser	TokenNameIdentifier
parser	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setParser	TokenNameIdentifier
(	TokenNameLPAREN
parser	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_left	TokenNameIdentifier
.	TokenNameDOT
setParser	TokenNameIdentifier
(	TokenNameLPAREN
parser	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_right	TokenNameIdentifier
.	TokenNameDOT
setParser	TokenNameIdentifier
(	TokenNameLPAREN
parser	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Ops	TokenNameIdentifier
[	TokenNameLBRACKET
_op	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
'('	TokenNameCharacterLiteral
+	TokenNamePLUS
_left	TokenNameIdentifier
+	TokenNamePLUS
", "	TokenNameStringLiteral
+	TokenNamePLUS
_right	TokenNameIdentifier
+	TokenNamePLUS
')'	TokenNameCharacterLiteral
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
Type	TokenNameIdentifier
tleft	TokenNameIdentifier
=	TokenNameEQUAL
_left	TokenNameIdentifier
.	TokenNameDOT
typeCheck	TokenNameIdentifier
(	TokenNameLPAREN
stable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Type	TokenNameIdentifier
tright	TokenNameIdentifier
=	TokenNameEQUAL
_right	TokenNameIdentifier
.	TokenNameDOT
typeCheck	TokenNameIdentifier
(	TokenNameLPAREN
stable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MethodType	TokenNameIdentifier
wantType	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MethodType	TokenNameIdentifier
(	TokenNameLPAREN
Type	TokenNameIdentifier
.	TokenNameDOT
Void	TokenNameIdentifier
,	TokenNameCOMMA
tleft	TokenNameIdentifier
,	TokenNameCOMMA
tright	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MethodType	TokenNameIdentifier
haveType	TokenNameIdentifier
=	TokenNameEQUAL
lookupPrimop	TokenNameIdentifier
(	TokenNameLPAREN
stable	TokenNameIdentifier
,	TokenNameCOMMA
Ops	TokenNameIdentifier
[	TokenNameLBRACKET
_op	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
wantType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
haveType	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Type	TokenNameIdentifier
arg1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Type	TokenNameIdentifier
)	TokenNameRPAREN
haveType	TokenNameIdentifier
.	TokenNameDOT
argsType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
arg1	TokenNameIdentifier
.	TokenNameDOT
identicalTo	TokenNameIdentifier
(	TokenNameLPAREN
tleft	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
_left	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CastExpr	TokenNameIdentifier
(	TokenNameLPAREN
_left	TokenNameIdentifier
,	TokenNameCOMMA
arg1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Type	TokenNameIdentifier
arg2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Type	TokenNameIdentifier
)	TokenNameRPAREN
haveType	TokenNameIdentifier
.	TokenNameDOT
argsType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
arg2	TokenNameIdentifier
.	TokenNameDOT
identicalTo	TokenNameIdentifier
(	TokenNameLPAREN
tright	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
_right	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CastExpr	TokenNameIdentifier
(	TokenNameLPAREN
_right	TokenNameIdentifier
,	TokenNameCOMMA
arg1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
_type	TokenNameIdentifier
=	TokenNameEQUAL
haveType	TokenNameIdentifier
.	TokenNameDOT
resultType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
throw	TokenNamethrow
new	TokenNamenew
TypeCheckError	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
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
translateDesynthesized	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
synthesize	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
translateDesynthesized	TokenNameIdentifier
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
final	TokenNamefinal
SyntaxTreeNode	TokenNameIdentifier
parent	TokenNameIdentifier
=	TokenNameEQUAL
getParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
_op	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
AND	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_left	TokenNameIdentifier
.	TokenNameDOT
translateDesynthesized	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InstructionHandle	TokenNameIdentifier
middle	TokenNameIdentifier
=	TokenNameEQUAL
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
NOP	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_right	TokenNameIdentifier
.	TokenNameDOT
translateDesynthesized	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InstructionHandle	TokenNameIdentifier
after	TokenNameIdentifier
=	TokenNameEQUAL
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
NOP	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_falseList	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
_right	TokenNameIdentifier
.	TokenNameDOT
_falseList	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
_left	TokenNameIdentifier
.	TokenNameDOT
_falseList	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
_left	TokenNameIdentifier
instanceof	TokenNameinstanceof
LogicalExpr	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
LogicalExpr	TokenNameIdentifier
)	TokenNameRPAREN
_left	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getOp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
OR	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
_left	TokenNameIdentifier
.	TokenNameDOT
backPatchTrueList	TokenNameIdentifier
(	TokenNameLPAREN
middle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
_left	TokenNameIdentifier
instanceof	TokenNameinstanceof
NotCall	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_left	TokenNameIdentifier
.	TokenNameDOT
backPatchTrueList	TokenNameIdentifier
(	TokenNameLPAREN
middle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
_trueList	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
_left	TokenNameIdentifier
.	TokenNameDOT
_trueList	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
_right	TokenNameIdentifier
instanceof	TokenNameinstanceof
LogicalExpr	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
LogicalExpr	TokenNameIdentifier
)	TokenNameRPAREN
_right	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getOp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
OR	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
_right	TokenNameIdentifier
.	TokenNameDOT
backPatchTrueList	TokenNameIdentifier
(	TokenNameLPAREN
after	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
_right	TokenNameIdentifier
instanceof	TokenNameinstanceof
NotCall	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_right	TokenNameIdentifier
.	TokenNameDOT
backPatchTrueList	TokenNameIdentifier
(	TokenNameLPAREN
after	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
_trueList	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
_right	TokenNameIdentifier
.	TokenNameDOT
_trueList	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
_left	TokenNameIdentifier
.	TokenNameDOT
translateDesynthesized	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InstructionHandle	TokenNameIdentifier
ih	TokenNameIdentifier
=	TokenNameEQUAL
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
GOTO	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_right	TokenNameIdentifier
.	TokenNameDOT
translateDesynthesized	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_left	TokenNameIdentifier
.	TokenNameDOT
_trueList	TokenNameIdentifier
.	TokenNameDOT
backPatch	TokenNameIdentifier
(	TokenNameLPAREN
ih	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_left	TokenNameIdentifier
.	TokenNameDOT
_falseList	TokenNameIdentifier
.	TokenNameDOT
backPatch	TokenNameIdentifier
(	TokenNameLPAREN
ih	TokenNameIdentifier
.	TokenNameDOT
getNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_falseList	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
_right	TokenNameIdentifier
.	TokenNameDOT
_falseList	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_trueList	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
ih	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
_right	TokenNameIdentifier
.	TokenNameDOT
_trueList	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
