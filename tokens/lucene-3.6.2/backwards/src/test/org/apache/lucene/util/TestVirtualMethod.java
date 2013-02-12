package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestVirtualMethod	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
VirtualMethod	TokenNameIdentifier
<	TokenNameLESS
TestVirtualMethod	TokenNameIdentifier
>	TokenNameGREATER
publicTestMethod	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
VirtualMethod	TokenNameIdentifier
<	TokenNameLESS
TestVirtualMethod	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
TestVirtualMethod	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
"publicTest"	TokenNameStringLiteral
,	TokenNameCOMMA
String	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
VirtualMethod	TokenNameIdentifier
<	TokenNameLESS
TestVirtualMethod	TokenNameIdentifier
>	TokenNameGREATER
protectedTestMethod	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
VirtualMethod	TokenNameIdentifier
<	TokenNameLESS
TestVirtualMethod	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
TestVirtualMethod	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
"protectedTest"	TokenNameStringLiteral
,	TokenNameCOMMA
int	TokenNameint
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
publicTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
test	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
protectedTest	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
test	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
TestClass1	TokenNameIdentifier
extends	TokenNameextends
TestVirtualMethod	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
publicTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
test	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
void	TokenNamevoid
protectedTest	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
test	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
TestClass2	TokenNameIdentifier
extends	TokenNameextends
TestClass1	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
protectedTest	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
test	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
TestClass3	TokenNameIdentifier
extends	TokenNameextends
TestClass2	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
publicTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
test	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
TestClass4	TokenNameIdentifier
extends	TokenNameextends
TestVirtualMethod	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
TestClass5	TokenNameIdentifier
extends	TokenNameextends
TestClass4	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testGeneral	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
publicTestMethod	TokenNameIdentifier
.	TokenNameDOT
getImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
publicTestMethod	TokenNameIdentifier
.	TokenNameDOT
getImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
TestClass1	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
publicTestMethod	TokenNameIdentifier
.	TokenNameDOT
getImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
TestClass2	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
publicTestMethod	TokenNameIdentifier
.	TokenNameDOT
getImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
TestClass3	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
publicTestMethod	TokenNameIdentifier
.	TokenNameDOT
isOverriddenAsOf	TokenNameIdentifier
(	TokenNameLPAREN
TestClass4	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
publicTestMethod	TokenNameIdentifier
.	TokenNameDOT
isOverriddenAsOf	TokenNameIdentifier
(	TokenNameLPAREN
TestClass5	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
protectedTestMethod	TokenNameIdentifier
.	TokenNameDOT
getImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
protectedTestMethod	TokenNameIdentifier
.	TokenNameDOT
getImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
TestClass1	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
protectedTestMethod	TokenNameIdentifier
.	TokenNameDOT
getImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
TestClass2	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
protectedTestMethod	TokenNameIdentifier
.	TokenNameDOT
getImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
TestClass3	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
protectedTestMethod	TokenNameIdentifier
.	TokenNameDOT
isOverriddenAsOf	TokenNameIdentifier
(	TokenNameLPAREN
TestClass4	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
protectedTestMethod	TokenNameIdentifier
.	TokenNameDOT
isOverriddenAsOf	TokenNameIdentifier
(	TokenNameLPAREN
TestClass5	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
VirtualMethod	TokenNameIdentifier
.	TokenNameDOT
compareImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
TestClass3	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
publicTestMethod	TokenNameIdentifier
,	TokenNameCOMMA
protectedTestMethod	TokenNameIdentifier
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
VirtualMethod	TokenNameIdentifier
.	TokenNameDOT
compareImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
TestClass5	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
publicTestMethod	TokenNameIdentifier
,	TokenNameCOMMA
protectedTestMethod	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
void	TokenNamevoid
testExceptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
publicTestMethod	TokenNameIdentifier
.	TokenNameDOT
getImplementationDistance	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Class	TokenNameIdentifier
)	TokenNameRPAREN
LuceneTestCase	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"LuceneTestCase is not a subclass and can never override publicTest(String)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
arg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
new	TokenNamenew
VirtualMethod	TokenNameIdentifier
<	TokenNameLESS
TestVirtualMethod	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
TestVirtualMethod	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
"bogus"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Method bogus() does not exist, so IAE should be thrown"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
arg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
new	TokenNamenew
VirtualMethod	TokenNameIdentifier
<	TokenNameLESS
TestClass2	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
TestClass2	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
"publicTest"	TokenNameStringLiteral
,	TokenNameCOMMA
String	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Method publicTest(String) is not declared in TestClass2, so IAE should be thrown"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
arg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
new	TokenNamenew
VirtualMethod	TokenNameIdentifier
<	TokenNameLESS
TestVirtualMethod	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
TestVirtualMethod	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
"publicTest"	TokenNameStringLiteral
,	TokenNameCOMMA
String	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Violating singleton status succeeded"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
UnsupportedOperationException	TokenNameIdentifier
arg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
