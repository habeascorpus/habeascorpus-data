package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
lib	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStreamReader	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
ObjectFactory	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_PROPERTIES_FILENAME	TokenNameIdentifier
=	TokenNameEQUAL
"xalan.properties"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
SERVICES_PATH	TokenNameIdentifier
=	TokenNameEQUAL
"META-INF/services/"	TokenNameStringLiteral
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
Properties	TokenNameIdentifier
fXalanProperties	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
long	TokenNamelong
fLastModified	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
Object	TokenNameIdentifier
createObject	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
factoryId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
fallbackClassName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ConfigurationError	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
createObject	TokenNameIdentifier
(	TokenNameLPAREN
factoryId	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
fallbackClassName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
Object	TokenNameIdentifier
createObject	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
factoryId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
propertiesFilename	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
fallbackClassName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ConfigurationError	TokenNameIdentifier
{	TokenNameLBRACE
Class	TokenNameIdentifier
factoryClass	TokenNameIdentifier
=	TokenNameEQUAL
lookUpFactoryClass	TokenNameIdentifier
(	TokenNameLPAREN
factoryId	TokenNameIdentifier
,	TokenNameCOMMA
propertiesFilename	TokenNameIdentifier
,	TokenNameCOMMA
fallbackClassName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
factoryClass	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ConfigurationError	TokenNameIdentifier
(	TokenNameLPAREN
"Provider for "	TokenNameStringLiteral
+	TokenNamePLUS
factoryId	TokenNameIdentifier
+	TokenNamePLUS
" cannot be found"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
Object	TokenNameIdentifier
instance	TokenNameIdentifier
=	TokenNameEQUAL
factoryClass	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
debugPrintln	TokenNameIdentifier
(	TokenNameLPAREN
"created new instance of factory "	TokenNameStringLiteral
+	TokenNamePLUS
factoryId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
instance	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ConfigurationError	TokenNameIdentifier
(	TokenNameLPAREN
"Provider for factory "	TokenNameStringLiteral
+	TokenNamePLUS
factoryId	TokenNameIdentifier
+	TokenNamePLUS
" could not be instantiated: "	TokenNameStringLiteral
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
Class	TokenNameIdentifier
lookUpFactoryClass	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
factoryId	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ConfigurationError	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
lookUpFactoryClass	TokenNameIdentifier
(	TokenNameLPAREN
factoryId	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
Class	TokenNameIdentifier
lookUpFactoryClass	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
factoryId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
propertiesFilename	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
fallbackClassName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ConfigurationError	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
factoryClassName	TokenNameIdentifier
=	TokenNameEQUAL
lookUpFactoryClassName	TokenNameIdentifier
(	TokenNameLPAREN
factoryId	TokenNameIdentifier
,	TokenNameCOMMA
propertiesFilename	TokenNameIdentifier
,	TokenNameCOMMA
fallbackClassName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ClassLoader	TokenNameIdentifier
cl	TokenNameIdentifier
=	TokenNameEQUAL
findClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
factoryClassName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
factoryClassName	TokenNameIdentifier
=	TokenNameEQUAL
fallbackClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
providerClass	TokenNameIdentifier
=	TokenNameEQUAL
findProviderClass	TokenNameIdentifier
(	TokenNameLPAREN
factoryClassName	TokenNameIdentifier
,	TokenNameCOMMA
cl	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
debugPrintln	TokenNameIdentifier
(	TokenNameLPAREN
"created new instance of "	TokenNameStringLiteral
+	TokenNamePLUS
providerClass	TokenNameIdentifier
+	TokenNamePLUS
" using ClassLoader: "	TokenNameStringLiteral
+	TokenNamePLUS
cl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
providerClass	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ConfigurationError	TokenNameIdentifier
(	TokenNameLPAREN
"Provider "	TokenNameStringLiteral
+	TokenNamePLUS
factoryClassName	TokenNameIdentifier
+	TokenNamePLUS
" not found"	TokenNameStringLiteral
,	TokenNameCOMMA
x	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ConfigurationError	TokenNameIdentifier
(	TokenNameLPAREN
"Provider "	TokenNameStringLiteral
+	TokenNamePLUS
factoryClassName	TokenNameIdentifier
+	TokenNamePLUS
" could not be instantiated: "	TokenNameStringLiteral
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
String	TokenNameIdentifier
lookUpFactoryClassName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
factoryId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
propertiesFilename	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
fallbackClassName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SecuritySupport	TokenNameIdentifier
ss	TokenNameIdentifier
=	TokenNameEQUAL
SecuritySupport	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
String	TokenNameIdentifier
systemProp	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getSystemProperty	TokenNameIdentifier
(	TokenNameLPAREN
factoryId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
systemProp	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
debugPrintln	TokenNameIdentifier
(	TokenNameLPAREN
"found system property, value="	TokenNameStringLiteral
+	TokenNamePLUS
systemProp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
systemProp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SecurityException	TokenNameIdentifier
se	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
String	TokenNameIdentifier
factoryClassName	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
propertiesFilename	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
propertiesFile	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
boolean	TokenNameboolean
propertiesFileExists	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
String	TokenNameIdentifier
javah	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getSystemProperty	TokenNameIdentifier
(	TokenNameLPAREN
"java.home"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
propertiesFilename	TokenNameIdentifier
=	TokenNameEQUAL
javah	TokenNameIdentifier
+	TokenNamePLUS
File	TokenNameIdentifier
.	TokenNameDOT
separator	TokenNameIdentifier
+	TokenNamePLUS
"lib"	TokenNameStringLiteral
+	TokenNamePLUS
File	TokenNameIdentifier
.	TokenNameDOT
separator	TokenNameIdentifier
+	TokenNamePLUS
DEFAULT_PROPERTIES_FILENAME	TokenNameIdentifier
;	TokenNameSEMICOLON
propertiesFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
propertiesFilename	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
propertiesFileExists	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getFileExists	TokenNameIdentifier
(	TokenNameLPAREN
propertiesFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SecurityException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fLastModified	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
fXalanProperties	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
ObjectFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
loadProperties	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
FileInputStream	TokenNameIdentifier
fis	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fLastModified	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
propertiesFileExists	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
fLastModified	TokenNameIdentifier
<	TokenNameLESS
(	TokenNameLPAREN
fLastModified	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getLastModified	TokenNameIdentifier
(	TokenNameLPAREN
propertiesFile	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
loadProperties	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
propertiesFileExists	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fLastModified	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
fXalanProperties	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
propertiesFileExists	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
loadProperties	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
fLastModified	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getLastModified	TokenNameIdentifier
(	TokenNameLPAREN
propertiesFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
loadProperties	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fXalanProperties	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fis	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getFileInputStream	TokenNameIdentifier
(	TokenNameLPAREN
propertiesFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fXalanProperties	TokenNameIdentifier
.	TokenNameDOT
load	TokenNameIdentifier
(	TokenNameLPAREN
fis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fXalanProperties	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
fLastModified	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fis	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
fis	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
exc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
fXalanProperties	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
factoryClassName	TokenNameIdentifier
=	TokenNameEQUAL
fXalanProperties	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
factoryId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
FileInputStream	TokenNameIdentifier
fis	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
fis	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getFileInputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
propertiesFilename	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
load	TokenNameIdentifier
(	TokenNameLPAREN
fis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
factoryClassName	TokenNameIdentifier
=	TokenNameEQUAL
props	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
factoryId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fis	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
fis	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
exc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
factoryClassName	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
debugPrintln	TokenNameIdentifier
(	TokenNameLPAREN
"found in "	TokenNameStringLiteral
+	TokenNamePLUS
propertiesFilename	TokenNameIdentifier
+	TokenNamePLUS
", value="	TokenNameStringLiteral
+	TokenNamePLUS
factoryClassName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
factoryClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
findJarServiceProviderName	TokenNameIdentifier
(	TokenNameLPAREN
factoryId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
debugPrintln	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"JAXP: "	TokenNameStringLiteral
+	TokenNamePLUS
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
ClassLoader	TokenNameIdentifier
findClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ConfigurationError	TokenNameIdentifier
{	TokenNameLBRACE
SecuritySupport	TokenNameIdentifier
ss	TokenNameIdentifier
=	TokenNameEQUAL
SecuritySupport	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ClassLoader	TokenNameIdentifier
context	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getContextClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ClassLoader	TokenNameIdentifier
system	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getSystemClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ClassLoader	TokenNameIdentifier
chain	TokenNameIdentifier
=	TokenNameEQUAL
system	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
context	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
chain	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
current	TokenNameIdentifier
=	TokenNameEQUAL
ObjectFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
chain	TokenNameIdentifier
=	TokenNameEQUAL
system	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
current	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
chain	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
system	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
chain	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
chain	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getParentClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
chain	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
current	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
chain	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
chain	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getParentClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
chain	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
context	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
Object	TokenNameIdentifier
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
className	TokenNameIdentifier
,	TokenNameCOMMA
ClassLoader	TokenNameIdentifier
cl	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
doFallback	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ConfigurationError	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
providerClass	TokenNameIdentifier
=	TokenNameEQUAL
findProviderClass	TokenNameIdentifier
(	TokenNameLPAREN
className	TokenNameIdentifier
,	TokenNameCOMMA
cl	TokenNameIdentifier
,	TokenNameCOMMA
doFallback	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
instance	TokenNameIdentifier
=	TokenNameEQUAL
providerClass	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
debugPrintln	TokenNameIdentifier
(	TokenNameLPAREN
"created new instance of "	TokenNameStringLiteral
+	TokenNamePLUS
providerClass	TokenNameIdentifier
+	TokenNamePLUS
" using ClassLoader: "	TokenNameStringLiteral
+	TokenNamePLUS
cl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
instance	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ConfigurationError	TokenNameIdentifier
(	TokenNameLPAREN
"Provider "	TokenNameStringLiteral
+	TokenNamePLUS
className	TokenNameIdentifier
+	TokenNamePLUS
" not found"	TokenNameStringLiteral
,	TokenNameCOMMA
x	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ConfigurationError	TokenNameIdentifier
(	TokenNameLPAREN
"Provider "	TokenNameStringLiteral
+	TokenNamePLUS
className	TokenNameIdentifier
+	TokenNamePLUS
" could not be instantiated: "	TokenNameStringLiteral
+	TokenNamePLUS
x	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
Class	TokenNameIdentifier
findProviderClass	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
className	TokenNameIdentifier
,	TokenNameCOMMA
ClassLoader	TokenNameIdentifier
cl	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
doFallback	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ClassNotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
ConfigurationError	TokenNameIdentifier
{	TokenNameLBRACE
SecurityManager	TokenNameIdentifier
security	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getSecurityManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
security	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
lastDot	TokenNameIdentifier
=	TokenNameEQUAL
className	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
packageName	TokenNameIdentifier
=	TokenNameEQUAL
className	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lastDot	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
packageName	TokenNameIdentifier
=	TokenNameEQUAL
className	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
lastDot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
security	TokenNameIdentifier
.	TokenNameDOT
checkPackageAccess	TokenNameIdentifier
(	TokenNameLPAREN
packageName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SecurityException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Class	TokenNameIdentifier
providerClass	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cl	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
providerClass	TokenNameIdentifier
=	TokenNameEQUAL
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
className	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
providerClass	TokenNameIdentifier
=	TokenNameEQUAL
cl	TokenNameIdentifier
.	TokenNameDOT
loadClass	TokenNameIdentifier
(	TokenNameLPAREN
className	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
doFallback	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
current	TokenNameIdentifier
=	TokenNameEQUAL
ObjectFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
current	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
providerClass	TokenNameIdentifier
=	TokenNameEQUAL
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
className	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
cl	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
current	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cl	TokenNameIdentifier
=	TokenNameEQUAL
current	TokenNameIdentifier
;	TokenNameSEMICOLON
providerClass	TokenNameIdentifier
=	TokenNameEQUAL
cl	TokenNameIdentifier
.	TokenNameDOT
loadClass	TokenNameIdentifier
(	TokenNameLPAREN
className	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
x	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
x	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
providerClass	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
findJarServiceProviderName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
factoryId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SecuritySupport	TokenNameIdentifier
ss	TokenNameIdentifier
=	TokenNameEQUAL
SecuritySupport	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
serviceId	TokenNameIdentifier
=	TokenNameEQUAL
SERVICES_PATH	TokenNameIdentifier
+	TokenNamePLUS
factoryId	TokenNameIdentifier
;	TokenNameSEMICOLON
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
ClassLoader	TokenNameIdentifier
cl	TokenNameIdentifier
=	TokenNameEQUAL
findClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
is	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
cl	TokenNameIdentifier
,	TokenNameCOMMA
serviceId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
is	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
current	TokenNameIdentifier
=	TokenNameEQUAL
ObjectFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cl	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
current	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cl	TokenNameIdentifier
=	TokenNameEQUAL
current	TokenNameIdentifier
;	TokenNameSEMICOLON
is	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
cl	TokenNameIdentifier
,	TokenNameCOMMA
serviceId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
is	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
debugPrintln	TokenNameIdentifier
(	TokenNameLPAREN
"found jar resource="	TokenNameStringLiteral
+	TokenNamePLUS
serviceId	TokenNameIdentifier
+	TokenNamePLUS
" using ClassLoader: "	TokenNameStringLiteral
+	TokenNamePLUS
cl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedReader	TokenNameIdentifier
rd	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
rd	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedReader	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
,	TokenNameCOMMA
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
UnsupportedEncodingException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
rd	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedReader	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
factoryClassName	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
factoryClassName	TokenNameIdentifier
=	TokenNameEQUAL
rd	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
rd	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
exc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
factoryClassName	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
""	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
factoryClassName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
debugPrintln	TokenNameIdentifier
(	TokenNameLPAREN
"found in resource, value="	TokenNameStringLiteral
+	TokenNamePLUS
factoryClassName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
factoryClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
ConfigurationError	TokenNameIdentifier
extends	TokenNameextends
Error	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
7640369932165775029L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Exception	TokenNameIdentifier
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
ConfigurationError	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msg	TokenNameIdentifier
,	TokenNameCOMMA
Exception	TokenNameIdentifier
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
exception	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Exception	TokenNameIdentifier
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
