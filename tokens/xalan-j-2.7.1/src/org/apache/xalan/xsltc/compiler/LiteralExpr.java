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
InstructionList	TokenNameIdentifier
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
PUSH	TokenNameIdentifier
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
LiteralExpr	TokenNameIdentifier
extends	TokenNameextends
Expression	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
_value	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
_namespace	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
LiteralExpr	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
_namespace	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
LiteralExpr	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
namespace	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
_namespace	TokenNameIdentifier
=	TokenNameEQUAL
namespace	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
EMPTYSTRING	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
namespace	TokenNameIdentifier
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
return	TokenNamereturn
_type	TokenNameIdentifier
=	TokenNameEQUAL
Type	TokenNameIdentifier
.	TokenNameDOT
String	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"literal-expr("	TokenNameStringLiteral
+	TokenNamePLUS
_value	TokenNameIdentifier
+	TokenNamePLUS
')'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
contextDependent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
getNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_namespace	TokenNameIdentifier
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
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PUSH	TokenNameIdentifier
(	TokenNameLPAREN
cpg	TokenNameIdentifier
,	TokenNameCOMMA
_value	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
