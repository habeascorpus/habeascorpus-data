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
ILOAD	TokenNameIdentifier
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
ISTORE	TokenNameIdentifier
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
Type	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
MatchGenerator	TokenNameIdentifier
extends	TokenNameextends
MethodGenerator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
CURRENT_INDEX	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_iteratorIndex	TokenNameIdentifier
=	TokenNameEQUAL
INVALID_INDEX	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Instruction	TokenNameIdentifier
_iloadCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Instruction	TokenNameIdentifier
_istoreCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Instruction	TokenNameIdentifier
_aloadDom	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
MatchGenerator	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
access_flags	TokenNameIdentifier
,	TokenNameCOMMA
Type	TokenNameIdentifier
return_type	TokenNameIdentifier
,	TokenNameCOMMA
Type	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
arg_types	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
arg_names	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
method_name	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
class_name	TokenNameIdentifier
,	TokenNameCOMMA
InstructionList	TokenNameIdentifier
il	TokenNameIdentifier
,	TokenNameCOMMA
ConstantPoolGen	TokenNameIdentifier
cp	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
access_flags	TokenNameIdentifier
,	TokenNameCOMMA
return_type	TokenNameIdentifier
,	TokenNameCOMMA
arg_types	TokenNameIdentifier
,	TokenNameCOMMA
arg_names	TokenNameIdentifier
,	TokenNameCOMMA
method_name	TokenNameIdentifier
,	TokenNameCOMMA
class_name	TokenNameIdentifier
,	TokenNameCOMMA
il	TokenNameIdentifier
,	TokenNameCOMMA
cp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_iloadCurrent	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ILOAD	TokenNameIdentifier
(	TokenNameLPAREN
CURRENT_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_istoreCurrent	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ISTORE	TokenNameIdentifier
(	TokenNameLPAREN
CURRENT_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Instruction	TokenNameIdentifier
loadCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_iloadCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Instruction	TokenNameIdentifier
storeCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_istoreCurrent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getHandlerIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
INVALID_INDEX	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Instruction	TokenNameIdentifier
loadDOM	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_aloadDom	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDomIndex	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
domIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_aloadDom	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ALOAD	TokenNameIdentifier
(	TokenNameLPAREN
domIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getIteratorIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_iteratorIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setIteratorIndex	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
iteratorIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_iteratorIndex	TokenNameIdentifier
=	TokenNameEQUAL
iteratorIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getLocalIndex	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"current"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
CURRENT_INDEX	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getLocalIndex	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE