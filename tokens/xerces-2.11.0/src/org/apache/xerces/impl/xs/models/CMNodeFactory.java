package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
models	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
Constants	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
XMLErrorReporter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
dtd	TokenNameIdentifier
.	TokenNameDOT
models	TokenNameIdentifier
.	TokenNameDOT
CMNode	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSMessageFormatter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SecurityManager	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
.	TokenNameDOT
XMLComponentManager	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
.	TokenNameDOT
XMLConfigurationException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CMNodeFactory	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ERROR_REPORTER	TokenNameIdentifier
=	TokenNameEQUAL
Constants	TokenNameIdentifier
.	TokenNameDOT
XERCES_PROPERTY_PREFIX	TokenNameIdentifier
+	TokenNamePLUS
Constants	TokenNameIdentifier
.	TokenNameDOT
ERROR_REPORTER_PROPERTY	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
SECURITY_MANAGER	TokenNameIdentifier
=	TokenNameEQUAL
Constants	TokenNameIdentifier
.	TokenNameDOT
XERCES_PROPERTY_PREFIX	TokenNameIdentifier
+	TokenNamePLUS
Constants	TokenNameIdentifier
.	TokenNameDOT
SECURITY_MANAGER_PROPERTY	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
DEBUG	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
MULTIPLICITY	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
nodeCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
maxNodeLimit	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
XMLErrorReporter	TokenNameIdentifier
fErrorReporter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SecurityManager	TokenNameIdentifier
fSecurityManager	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
CMNodeFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
XMLComponentManager	TokenNameIdentifier
componentManager	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XMLErrorReporter	TokenNameIdentifier
)	TokenNameRPAREN
componentManager	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
ERROR_REPORTER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
fSecurityManager	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SecurityManager	TokenNameIdentifier
)	TokenNameRPAREN
componentManager	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
SECURITY_MANAGER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
XMLConfigurationException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fSecurityManager	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fSecurityManager	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
maxNodeLimit	TokenNameIdentifier
=	TokenNameEQUAL
fSecurityManager	TokenNameIdentifier
.	TokenNameDOT
getMaxOccurNodeLimit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
MULTIPLICITY	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
CMNode	TokenNameIdentifier
getCMLeafNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
type	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
leaf	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
id	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
position	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nodeCountCheck	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
XSCMLeaf	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
,	TokenNameCOMMA
leaf	TokenNameIdentifier
,	TokenNameCOMMA
id	TokenNameIdentifier
,	TokenNameCOMMA
position	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CMNode	TokenNameIdentifier
getCMRepeatingLeafNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
type	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
leaf	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
minOccurs	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxOccurs	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
id	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
position	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nodeCountCheck	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
XSCMRepeatingLeaf	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
,	TokenNameCOMMA
leaf	TokenNameIdentifier
,	TokenNameCOMMA
minOccurs	TokenNameIdentifier
,	TokenNameCOMMA
maxOccurs	TokenNameIdentifier
,	TokenNameCOMMA
id	TokenNameIdentifier
,	TokenNameCOMMA
position	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CMNode	TokenNameIdentifier
getCMUniOpNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
type	TokenNameIdentifier
,	TokenNameCOMMA
CMNode	TokenNameIdentifier
childNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nodeCountCheck	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
XSCMUniOp	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
,	TokenNameCOMMA
childNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CMNode	TokenNameIdentifier
getCMBinOpNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
type	TokenNameIdentifier
,	TokenNameCOMMA
CMNode	TokenNameIdentifier
leftNode	TokenNameIdentifier
,	TokenNameCOMMA
CMNode	TokenNameIdentifier
rightNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nodeCountCheck	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
XSCMBinOp	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
,	TokenNameCOMMA
leftNode	TokenNameIdentifier
,	TokenNameCOMMA
rightNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
nodeCountCheck	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fSecurityManager	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
nodeCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
>	TokenNameGREATER
maxNodeLimit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"nodeCount = "	TokenNameStringLiteral
+	TokenNamePLUS
nodeCount	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"nodeLimit = "	TokenNameStringLiteral
+	TokenNamePLUS
maxNodeLimit	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fErrorReporter	TokenNameIdentifier
.	TokenNameDOT
reportError	TokenNameIdentifier
(	TokenNameLPAREN
XSMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
SCHEMA_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"maxOccurLimit"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
maxNodeLimit	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_FATAL_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nodeCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
resetNodeCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
nodeCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
propertyId	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XMLConfigurationException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
propertyId	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
XERCES_PROPERTY_PREFIX	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
suffixLength	TokenNameIdentifier
=	TokenNameEQUAL
propertyId	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
Constants	TokenNameIdentifier
.	TokenNameDOT
XERCES_PROPERTY_PREFIX	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
suffixLength	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Constants	TokenNameIdentifier
.	TokenNameDOT
SECURITY_MANAGER_PROPERTY	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
propertyId	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
SECURITY_MANAGER_PROPERTY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fSecurityManager	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SecurityManager	TokenNameIdentifier
)	TokenNameRPAREN
value	TokenNameIdentifier
;	TokenNameSEMICOLON
maxNodeLimit	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
fSecurityManager	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
fSecurityManager	TokenNameIdentifier
.	TokenNameDOT
getMaxOccurNodeLimit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
MULTIPLICITY	TokenNameIdentifier
:	TokenNameCOLON
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
suffixLength	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Constants	TokenNameIdentifier
.	TokenNameDOT
ERROR_REPORTER_PROPERTY	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
propertyId	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
ERROR_REPORTER_PROPERTY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XMLErrorReporter	TokenNameIdentifier
)	TokenNameRPAREN
value	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE