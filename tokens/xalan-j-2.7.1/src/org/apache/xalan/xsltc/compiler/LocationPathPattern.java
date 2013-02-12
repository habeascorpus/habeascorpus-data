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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
Axis	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
LocationPathPattern	TokenNameIdentifier
extends	TokenNameextends
Pattern	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Template	TokenNameIdentifier
_template	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_importPrecedence	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
_priority	TokenNameIdentifier
=	TokenNameEQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
NaN	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_position	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
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
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setTemplate	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Template	TokenNameIdentifier
template	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_template	TokenNameIdentifier
=	TokenNameEQUAL
template	TokenNameIdentifier
;	TokenNameSEMICOLON
_priority	TokenNameIdentifier
=	TokenNameEQUAL
template	TokenNameIdentifier
.	TokenNameDOT
getPriority	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_importPrecedence	TokenNameIdentifier
=	TokenNameEQUAL
template	TokenNameIdentifier
.	TokenNameDOT
getImportPrecedence	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_position	TokenNameIdentifier
=	TokenNameEQUAL
template	TokenNameIdentifier
.	TokenNameDOT
getPosition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Template	TokenNameIdentifier
getTemplate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_template	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
double	TokenNamedouble
getPriority	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Double	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
_priority	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
getDefaultPriority	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
_priority	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getDefaultPriority	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0.5	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
noSmallerThan	TokenNameIdentifier
(	TokenNameLPAREN
LocationPathPattern	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_importPrecedence	TokenNameIdentifier
>	TokenNameGREATER
other	TokenNameIdentifier
.	TokenNameDOT
_importPrecedence	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
_importPrecedence	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
_importPrecedence	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_priority	TokenNameIdentifier
>	TokenNameGREATER
other	TokenNameIdentifier
.	TokenNameDOT
_priority	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
_priority	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
_priority	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_position	TokenNameIdentifier
>	TokenNameGREATER
other	TokenNameIdentifier
.	TokenNameDOT
_position	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
StepPattern	TokenNameIdentifier
getKernelPattern	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
void	TokenNamevoid
reduceKernelPattern	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
boolean	TokenNameboolean
isWildcard	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getAxis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
StepPattern	TokenNameIdentifier
sp	TokenNameIdentifier
=	TokenNameEQUAL
getKernelPattern	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
sp	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
sp	TokenNameIdentifier
.	TokenNameDOT
getAxis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
Axis	TokenNameIdentifier
.	TokenNameDOT
CHILD	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"root()"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE