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
AlternativePattern	TokenNameIdentifier
extends	TokenNameextends
Pattern	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Pattern	TokenNameIdentifier
_left	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Pattern	TokenNameIdentifier
_right	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
AlternativePattern	TokenNameIdentifier
(	TokenNameLPAREN
Pattern	TokenNameIdentifier
left	TokenNameIdentifier
,	TokenNameCOMMA
Pattern	TokenNameIdentifier
right	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_left	TokenNameIdentifier
=	TokenNameEQUAL
left	TokenNameIdentifier
;	TokenNameSEMICOLON
_right	TokenNameIdentifier
=	TokenNameEQUAL
right	TokenNameIdentifier
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
Pattern	TokenNameIdentifier
getLeft	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_left	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Pattern	TokenNameIdentifier
getRight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_right	TokenNameIdentifier
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
_left	TokenNameIdentifier
.	TokenNameDOT
typeCheck	TokenNameIdentifier
(	TokenNameLPAREN
stable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_right	TokenNameIdentifier
.	TokenNameDOT
typeCheck	TokenNameIdentifier
(	TokenNameLPAREN
stable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getPriority	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
left	TokenNameIdentifier
=	TokenNameEQUAL
_left	TokenNameIdentifier
.	TokenNameDOT
getPriority	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
right	TokenNameIdentifier
=	TokenNameEQUAL
_right	TokenNameIdentifier
.	TokenNameDOT
getPriority	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
left	TokenNameIdentifier
<	TokenNameLESS
right	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
(	TokenNameLPAREN
left	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
(	TokenNameLPAREN
right	TokenNameIdentifier
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
"alternative("	TokenNameStringLiteral
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
_left	TokenNameIdentifier
.	TokenNameDOT
translate	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
InstructionHandle	TokenNameIdentifier
gotot	TokenNameIdentifier
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
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
methodGen	TokenNameIdentifier
.	TokenNameDOT
loadContextNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_right	TokenNameIdentifier
.	TokenNameDOT
translate	TokenNameIdentifier
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
gotot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_left	TokenNameIdentifier
.	TokenNameDOT
_falseList	TokenNameIdentifier
.	TokenNameDOT
backPatch	TokenNameIdentifier
(	TokenNameLPAREN
gotot	TokenNameIdentifier
.	TokenNameDOT
getNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_trueList	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
_right	TokenNameIdentifier
.	TokenNameDOT
_trueList	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
gotot	TokenNameIdentifier
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
}	TokenNameRBRACE
}	TokenNameRBRACE