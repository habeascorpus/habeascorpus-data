package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
loader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Enumeration	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
AntClassLoader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
Path	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
CollectionUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
AntClassLoader5Test	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testGetResources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
AntClassLoader	TokenNameIdentifier
acl	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AntClassLoader5	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
EmptyLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
acl	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
"META-INF/MANIFEST.MF"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
acl	TokenNameIdentifier
.	TokenNameDOT
getResources	TokenNameIdentifier
(	TokenNameLPAREN
"META-INF/MANIFEST.MF"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
acl	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AntClassLoader5	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
acl	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
"META-INF/MANIFEST.MF"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
acl	TokenNameIdentifier
.	TokenNameDOT
getResources	TokenNameIdentifier
(	TokenNameLPAREN
"META-INF/MANIFEST.MF"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testGetResourcesUsingFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
AntClassLoader	TokenNameIdentifier
acl	TokenNameIdentifier
=	TokenNameEQUAL
AntClassLoader	TokenNameIdentifier
.	TokenNameDOT
newAntClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
EmptyLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNull	TokenNameIdentifier
(	TokenNameLPAREN
acl	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
"META-INF/MANIFEST.MF"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
acl	TokenNameIdentifier
.	TokenNameDOT
getResources	TokenNameIdentifier
(	TokenNameLPAREN
"META-INF/MANIFEST.MF"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
EmptyLoader	TokenNameIdentifier
extends	TokenNameextends
ClassLoader	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
URL	TokenNameIdentifier
getResource	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Enumeration	TokenNameIdentifier
getResources	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
CollectionUtils	TokenNameIdentifier
.	TokenNameDOT
EmptyEnumeration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
