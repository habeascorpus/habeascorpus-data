package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
junitcompat	TokenNameIdentifier
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
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SystemPropertiesInvariantRule	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SystemPropertiesRestoreRule	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
rules	TokenNameIdentifier
.	TokenNameDOT
TestRule	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
runner	TokenNameIdentifier
.	TokenNameDOT
JUnitCore	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
runner	TokenNameIdentifier
.	TokenNameDOT
Result	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
runner	TokenNameIdentifier
.	TokenNameDOT
notification	TokenNameIdentifier
.	TokenNameDOT
Failure	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestSystemPropertiesInvariantRule	TokenNameIdentifier
extends	TokenNameextends
WithNestedTests	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
PROP_KEY1	TokenNameIdentifier
=	TokenNameEQUAL
"new-property-1"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
VALUE1	TokenNameIdentifier
=	TokenNameEQUAL
"new-value-1"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
TestSystemPropertiesInvariantRule	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
Base	TokenNameIdentifier
extends	TokenNameextends
WithNestedTests	TokenNameIdentifier
.	TokenNameDOT
AbstractNestedTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
InBeforeClass	TokenNameIdentifier
extends	TokenNameextends
Base	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
BeforeClass	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
beforeClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
,	TokenNameCOMMA
VALUE1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
InAfterClass	TokenNameIdentifier
extends	TokenNameextends
Base	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
AfterClass	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
afterClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
,	TokenNameCOMMA
VALUE1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
InTestMethod	TokenNameIdentifier
extends	TokenNameextends
Base	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testMethod1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"Shouldn't be here."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
System	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
,	TokenNameCOMMA
VALUE1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMethod2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
testMethod1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
NonStringProperties	TokenNameIdentifier
extends	TokenNameextends
Base	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testMethod1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"Will pass."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Properties	TokenNameIdentifier
properties	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
properties	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMethod2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
testMethod1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
AfterClass	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
cleanup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
IgnoredProperty	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Rule	TokenNameIdentifier
public	TokenNamepublic
TestRule	TokenNameIdentifier
invariant	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SystemPropertiesInvariantRule	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testMethod1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
,	TokenNameCOMMA
VALUE1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Before	TokenNameIdentifier
@	TokenNameAT
After	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
cleanup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
clearProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRuleInvariantBeforeClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Result	TokenNameIdentifier
runClasses	TokenNameIdentifier
=	TokenNameEQUAL
JUnitCore	TokenNameIdentifier
.	TokenNameDOT
runClasses	TokenNameIdentifier
(	TokenNameLPAREN
InBeforeClass	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
runClasses	TokenNameIdentifier
.	TokenNameDOT
getFailureCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
runClasses	TokenNameIdentifier
.	TokenNameDOT
getFailures	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRuleInvariantAfterClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Result	TokenNameIdentifier
runClasses	TokenNameIdentifier
=	TokenNameEQUAL
JUnitCore	TokenNameIdentifier
.	TokenNameDOT
runClasses	TokenNameIdentifier
(	TokenNameLPAREN
InAfterClass	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
runClasses	TokenNameIdentifier
.	TokenNameDOT
getFailureCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
runClasses	TokenNameIdentifier
.	TokenNameDOT
getFailures	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testRuleInvariantInTestMethod	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Result	TokenNameIdentifier
runClasses	TokenNameIdentifier
=	TokenNameEQUAL
JUnitCore	TokenNameIdentifier
.	TokenNameDOT
runClasses	TokenNameIdentifier
(	TokenNameLPAREN
InTestMethod	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
runClasses	TokenNameIdentifier
.	TokenNameDOT
getFailureCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Failure	TokenNameIdentifier
f	TokenNameIdentifier
:	TokenNameCOLON
runClasses	TokenNameIdentifier
.	TokenNameDOT
getFailures	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Assert	TokenNameIdentifier
.	TokenNameDOT
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Assert	TokenNameIdentifier
.	TokenNameDOT
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testNonStringProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Result	TokenNameIdentifier
runClasses	TokenNameIdentifier
=	TokenNameEQUAL
JUnitCore	TokenNameIdentifier
.	TokenNameDOT
runClasses	TokenNameIdentifier
(	TokenNameLPAREN
NonStringProperties	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
runClasses	TokenNameIdentifier
.	TokenNameDOT
getFailureCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
runClasses	TokenNameIdentifier
.	TokenNameDOT
getFailures	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
"Will pass"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
runClasses	TokenNameIdentifier
.	TokenNameDOT
getRunCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testIgnoredProperty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
clearProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Result	TokenNameIdentifier
runClasses	TokenNameIdentifier
=	TokenNameEQUAL
JUnitCore	TokenNameIdentifier
.	TokenNameDOT
runClasses	TokenNameIdentifier
(	TokenNameLPAREN
IgnoredProperty	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
runClasses	TokenNameIdentifier
.	TokenNameDOT
getFailureCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
VALUE1	TokenNameIdentifier
,	TokenNameCOMMA
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
clearProperty	TokenNameIdentifier
(	TokenNameLPAREN
PROP_KEY1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE