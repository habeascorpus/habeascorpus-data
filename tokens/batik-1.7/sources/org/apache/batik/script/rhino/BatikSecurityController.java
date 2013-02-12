package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
script	TokenNameIdentifier
.	TokenNameDOT
rhino	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
security	TokenNameIdentifier
.	TokenNameDOT
AccessControlContext	TokenNameIdentifier
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
PrivilegedExceptionAction	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
mozilla	TokenNameIdentifier
.	TokenNameDOT
javascript	TokenNameIdentifier
.	TokenNameDOT
Callable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
mozilla	TokenNameIdentifier
.	TokenNameDOT
javascript	TokenNameIdentifier
.	TokenNameDOT
Context	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
mozilla	TokenNameIdentifier
.	TokenNameDOT
javascript	TokenNameIdentifier
.	TokenNameDOT
GeneratedClassLoader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
mozilla	TokenNameIdentifier
.	TokenNameDOT
javascript	TokenNameIdentifier
.	TokenNameDOT
Scriptable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
mozilla	TokenNameIdentifier
.	TokenNameDOT
javascript	TokenNameIdentifier
.	TokenNameDOT
SecurityController	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
mozilla	TokenNameIdentifier
.	TokenNameDOT
javascript	TokenNameIdentifier
.	TokenNameDOT
WrappedException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
BatikSecurityController	TokenNameIdentifier
extends	TokenNameextends
SecurityController	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
GeneratedClassLoader	TokenNameIdentifier
createClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
ClassLoader	TokenNameIdentifier
parentLoader	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
securityDomain	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
securityDomain	TokenNameIdentifier
instanceof	TokenNameinstanceof
RhinoClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
RhinoClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
securityDomain	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
throw	TokenNamethrow
new	TokenNamenew
SecurityException	TokenNameIdentifier
(	TokenNameLPAREN
"Script() objects are not supported"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getDynamicSecurityDomain	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
securityDomain	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
loader	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
RhinoClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
securityDomain	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
loader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
loader	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
AccessController	TokenNameIdentifier
.	TokenNameDOT
getContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
callWithDomain	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
securityDomain	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Context	TokenNameIdentifier
cx	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Callable	TokenNameIdentifier
callable	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Scriptable	TokenNameIdentifier
scope	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Scriptable	TokenNameIdentifier
thisObj	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AccessControlContext	TokenNameIdentifier
acc	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
securityDomain	TokenNameIdentifier
instanceof	TokenNameinstanceof
AccessControlContext	TokenNameIdentifier
)	TokenNameRPAREN
acc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AccessControlContext	TokenNameIdentifier
)	TokenNameRPAREN
securityDomain	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
RhinoClassLoader	TokenNameIdentifier
loader	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
RhinoClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
securityDomain	TokenNameIdentifier
;	TokenNameSEMICOLON
acc	TokenNameIdentifier
=	TokenNameEQUAL
loader	TokenNameIdentifier
.	TokenNameDOT
rhinoAccessControlContext	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
PrivilegedExceptionAction	TokenNameIdentifier
execAction	TokenNameIdentifier
=	TokenNameEQUAL
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
{	TokenNameLBRACE
return	TokenNamereturn
callable	TokenNameIdentifier
.	TokenNameDOT
call	TokenNameIdentifier
(	TokenNameLPAREN
cx	TokenNameIdentifier
,	TokenNameCOMMA
scope	TokenNameIdentifier
,	TokenNameCOMMA
thisObj	TokenNameIdentifier
,	TokenNameCOMMA
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
execAction	TokenNameIdentifier
,	TokenNameCOMMA
acc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
WrappedException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE