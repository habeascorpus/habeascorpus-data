package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
profile	TokenNameIdentifier
.	TokenNameDOT
activation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
Activation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
Profile	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JdkVersionProfileActivatorTest	TokenNameIdentifier
extends	TokenNameextends
AbstractProfileActivatorTest	TokenNameIdentifier
<	TokenNameLESS
JdkVersionProfileActivator	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
JdkVersionProfileActivatorTest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
JdkVersionProfileActivator	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Profile	TokenNameIdentifier
newProfile	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
jdkVersion	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Activation	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Activation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
a	TokenNameIdentifier
.	TokenNameDOT
setJdk	TokenNameIdentifier
(	TokenNameLPAREN
jdkVersion	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Profile	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Profile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
setActivation	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
p	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Properties	TokenNameIdentifier
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
javaVersion	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Properties	TokenNameIdentifier
props	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"java.version"	TokenNameStringLiteral
,	TokenNameCOMMA
javaVersion	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
props	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNullSafe	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Profile	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Profile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
p	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
setActivation	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Activation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
p	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testPrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Profile	TokenNameIdentifier
profile	TokenNameIdentifier
=	TokenNameEQUAL
newProfile	TokenNameIdentifier
(	TokenNameLPAREN
"1.4"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.3"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testPrefixNegated	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Profile	TokenNameIdentifier
profile	TokenNameIdentifier
=	TokenNameEQUAL
newProfile	TokenNameIdentifier
(	TokenNameLPAREN
"!1.4"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.3"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testVersionRangeInclusiveBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Profile	TokenNameIdentifier
profile	TokenNameIdentifier
=	TokenNameEQUAL
newProfile	TokenNameIdentifier
(	TokenNameLPAREN
"[1.5,1.6]"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6.0"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6.0_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6.0_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testVersionRangeExclusiveBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Profile	TokenNameIdentifier
profile	TokenNameIdentifier
=	TokenNameEQUAL
newProfile	TokenNameIdentifier
(	TokenNameLPAREN
"(1.3,1.6)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.3"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.3.0"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.3.0_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.3.0_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.3.1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.3.1_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.3.1_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testVersionRangeInclusiveLowerBound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Profile	TokenNameIdentifier
profile	TokenNameIdentifier
=	TokenNameEQUAL
newProfile	TokenNameIdentifier
(	TokenNameLPAREN
"[1.5,)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.4.2_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6.0"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6.0_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6.0_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testVersionRangeExclusiveUpperBound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Profile	TokenNameIdentifier
profile	TokenNameIdentifier
=	TokenNameEQUAL
newProfile	TokenNameIdentifier
(	TokenNameLPAREN
"(,1.6)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.0_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.5.1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6.0"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6.0_09"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertActivation	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
profile	TokenNameIdentifier
,	TokenNameCOMMA
newContext	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
newProperties	TokenNameIdentifier
(	TokenNameLPAREN
"1.6.0_09-b03"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE