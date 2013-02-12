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
GETFIELD	TokenNameIdentifier
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
INVOKEINTERFACE	TokenNameIdentifier
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
INVOKEVIRTUAL	TokenNameIdentifier
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
Comment	TokenNameIdentifier
extends	TokenNameextends
Instruction	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
parseContents	TokenNameIdentifier
(	TokenNameLPAREN
Parser	TokenNameIdentifier
parser	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
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
typeCheckContents	TokenNameIdentifier
(	TokenNameLPAREN
stable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
Type	TokenNameIdentifier
.	TokenNameDOT
String	TokenNameIdentifier
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
Text	TokenNameIdentifier
rawText	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
elementCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
content	TokenNameIdentifier
=	TokenNameEQUAL
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
content	TokenNameIdentifier
instanceof	TokenNameinstanceof
Text	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
rawText	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Text	TokenNameIdentifier
)	TokenNameRPAREN
content	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
rawText	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
methodGen	TokenNameIdentifier
.	TokenNameDOT
loadHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
rawText	TokenNameIdentifier
.	TokenNameDOT
canLoadAsArrayOffsetLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
rawText	TokenNameIdentifier
.	TokenNameDOT
loadAsArrayOffsetLength	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
,	TokenNameCOMMA
methodGen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
comment	TokenNameIdentifier
=	TokenNameEQUAL
cpg	TokenNameIdentifier
.	TokenNameDOT
addInterfaceMethodref	TokenNameIdentifier
(	TokenNameLPAREN
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier
,	TokenNameCOMMA
"comment"	TokenNameStringLiteral
,	TokenNameCOMMA
"([CII)V"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
INVOKEINTERFACE	TokenNameIdentifier
(	TokenNameLPAREN
comment	TokenNameIdentifier
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PUSH	TokenNameIdentifier
(	TokenNameLPAREN
cpg	TokenNameIdentifier
,	TokenNameCOMMA
rawText	TokenNameIdentifier
.	TokenNameDOT
getText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
comment	TokenNameIdentifier
=	TokenNameEQUAL
cpg	TokenNameIdentifier
.	TokenNameDOT
addInterfaceMethodref	TokenNameIdentifier
(	TokenNameLPAREN
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier
,	TokenNameCOMMA
"comment"	TokenNameStringLiteral
,	TokenNameCOMMA
"("	TokenNameStringLiteral
+	TokenNamePLUS
STRING_SIG	TokenNameIdentifier
+	TokenNamePLUS
")V"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
INVOKEINTERFACE	TokenNameIdentifier
(	TokenNameLPAREN
comment	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
methodGen	TokenNameIdentifier
.	TokenNameDOT
loadHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
DUP	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
classGen	TokenNameIdentifier
.	TokenNameDOT
loadTranslet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
GETFIELD	TokenNameIdentifier
(	TokenNameLPAREN
cpg	TokenNameIdentifier
.	TokenNameDOT
addFieldref	TokenNameIdentifier
(	TokenNameLPAREN
TRANSLET_CLASS	TokenNameIdentifier
,	TokenNameCOMMA
"stringValueHandler"	TokenNameStringLiteral
,	TokenNameCOMMA
STRING_VALUE_HANDLER_SIG	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
DUP	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
methodGen	TokenNameIdentifier
.	TokenNameDOT
storeHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
translateContents	TokenNameIdentifier
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
INVOKEVIRTUAL	TokenNameIdentifier
(	TokenNameLPAREN
cpg	TokenNameIdentifier
.	TokenNameDOT
addMethodref	TokenNameIdentifier
(	TokenNameLPAREN
STRING_VALUE_HANDLER	TokenNameIdentifier
,	TokenNameCOMMA
"getValue"	TokenNameStringLiteral
,	TokenNameCOMMA
"()"	TokenNameStringLiteral
+	TokenNamePLUS
STRING_SIG	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
comment	TokenNameIdentifier
=	TokenNameEQUAL
cpg	TokenNameIdentifier
.	TokenNameDOT
addInterfaceMethodref	TokenNameIdentifier
(	TokenNameLPAREN
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier
,	TokenNameCOMMA
"comment"	TokenNameStringLiteral
,	TokenNameCOMMA
"("	TokenNameStringLiteral
+	TokenNamePLUS
STRING_SIG	TokenNameIdentifier
+	TokenNamePLUS
")V"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
INVOKEINTERFACE	TokenNameIdentifier
(	TokenNameLPAREN
comment	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
il	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
methodGen	TokenNameIdentifier
.	TokenNameDOT
storeHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
