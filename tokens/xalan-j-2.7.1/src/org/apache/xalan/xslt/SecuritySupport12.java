package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xslt	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
FileNotFoundException	TokenNameIdentifier
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
security	TokenNameIdentifier
.	TokenNameDOT
AccessController	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
security	TokenNameIdentifier
.	TokenNameDOT
PrivilegedAction	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
security	TokenNameIdentifier
.	TokenNameDOT
PrivilegedActionException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
security	TokenNameIdentifier
.	TokenNameDOT
PrivilegedExceptionAction	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
SecuritySupport12	TokenNameIdentifier
extends	TokenNameextends
SecuritySupport	TokenNameIdentifier
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
getContextClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
ClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrivilegedAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
cl	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
cl	TokenNameIdentifier
=	TokenNameEQUAL
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getContextClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SecurityException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
return	TokenNamereturn
cl	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ClassLoader	TokenNameIdentifier
getSystemClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
ClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrivilegedAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
cl	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
cl	TokenNameIdentifier
=	TokenNameEQUAL
ClassLoader	TokenNameIdentifier
.	TokenNameDOT
getSystemClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SecurityException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
return	TokenNamereturn
cl	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ClassLoader	TokenNameIdentifier
getParentClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
ClassLoader	TokenNameIdentifier
cl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
ClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrivilegedAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
parent	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
parent	TokenNameIdentifier
=	TokenNameEQUAL
cl	TokenNameIdentifier
.	TokenNameDOT
getParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SecurityException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
parent	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
cl	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
parent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
getSystemProperty	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
propName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrivilegedAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
propName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
FileInputStream	TokenNameIdentifier
getFileInputStream	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
File	TokenNameIdentifier
file	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
FileNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
FileInputStream	TokenNameIdentifier
)	TokenNameRPAREN
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrivilegedExceptionAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
FileNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FileInputStream	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
PrivilegedActionException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
(	TokenNameLPAREN
FileNotFoundException	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
InputStream	TokenNameIdentifier
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
ClassLoader	TokenNameIdentifier
cl	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
)	TokenNameRPAREN
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrivilegedAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
InputStream	TokenNameIdentifier
ris	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cl	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
ris	TokenNameIdentifier
=	TokenNameEQUAL
ClassLoader	TokenNameIdentifier
.	TokenNameDOT
getSystemResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
ris	TokenNameIdentifier
=	TokenNameEQUAL
cl	TokenNameIdentifier
.	TokenNameDOT
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ris	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
boolean	TokenNameboolean
getFileExists	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
File	TokenNameIdentifier
f	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrivilegedAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Boolean	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
booleanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
long	TokenNamelong
getLastModified	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
File	TokenNameIdentifier
f	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrivilegedAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Long	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
lastModified	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
longValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
