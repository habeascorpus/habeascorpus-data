package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
axes	TokenNameIdentifier
.	TokenNameDOT
LocPathIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
axes	TokenNameIdentifier
.	TokenNameDOT
UnionPathIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
functions	TokenNameIdentifier
.	TokenNameDOT
Function	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
.	TokenNameDOT
XNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
.	TokenNameDOT
XString	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
.	TokenNameDOT
Operation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
.	TokenNameDOT
UnaryOperation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
.	TokenNameDOT
Variable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
patterns	TokenNameIdentifier
.	TokenNameDOT
NodeTest	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
patterns	TokenNameIdentifier
.	TokenNameDOT
StepPattern	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
patterns	TokenNameIdentifier
.	TokenNameDOT
UnionPattern	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XPathVisitor	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitLocationPath	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
LocPathIterator	TokenNameIdentifier
path	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitUnionPath	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
UnionPathIterator	TokenNameIdentifier
path	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitStep	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
NodeTest	TokenNameIdentifier
step	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitPredicate	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
Expression	TokenNameIdentifier
pred	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitBinaryOperation	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
Operation	TokenNameIdentifier
op	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitUnaryOperation	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
UnaryOperation	TokenNameIdentifier
op	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitVariableRef	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
Variable	TokenNameIdentifier
var	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitFunction	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
Function	TokenNameIdentifier
func	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitMatchPattern	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
StepPattern	TokenNameIdentifier
pattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitUnionPattern	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
UnionPattern	TokenNameIdentifier
pattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitStringLiteral	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
XString	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
visitNumberLiteral	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionOwner	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
XNumber	TokenNameIdentifier
num	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
