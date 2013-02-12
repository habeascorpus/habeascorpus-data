package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Priority	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
LogLog	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
beans	TokenNameIdentifier
.	TokenNameDOT
BeanInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
beans	TokenNameIdentifier
.	TokenNameDOT
IntrospectionException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
beans	TokenNameIdentifier
.	TokenNameDOT
Introspector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
beans	TokenNameIdentifier
.	TokenNameDOT
PropertyDescriptor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InterruptedIOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
InvocationTargetException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Method	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
PropertyGetter	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
NULL_ARG	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
protected	TokenNameprotected
Object	TokenNameIdentifier
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
PropertyDescriptor	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
props	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
PropertyCallback	TokenNameIdentifier
{	TokenNameLBRACE
void	TokenNamevoid
foundProperty	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PropertyGetter	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IntrospectionException	TokenNameIdentifier
{	TokenNameLBRACE
BeanInfo	TokenNameIdentifier
bi	TokenNameIdentifier
=	TokenNameEQUAL
Introspector	TokenNameIdentifier
.	TokenNameDOT
getBeanInfo	TokenNameIdentifier
(	TokenNameLPAREN
obj	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
=	TokenNameEQUAL
bi	TokenNameIdentifier
.	TokenNameDOT
getPropertyDescriptors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
obj	TokenNameIdentifier
=	TokenNameEQUAL
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
,	TokenNameCOMMA
PropertyCallback	TokenNameIdentifier
callback	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
prefix	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
new	TokenNamenew
PropertyGetter	TokenNameIdentifier
(	TokenNameLPAREN
obj	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
callback	TokenNameIdentifier
,	TokenNameCOMMA
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IntrospectionException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Failed to introspect object "	TokenNameStringLiteral
+	TokenNamePLUS
obj	TokenNameIdentifier
,	TokenNameCOMMA
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
PropertyCallback	TokenNameIdentifier
callback	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
prefix	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
props	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Method	TokenNameIdentifier
getter	TokenNameIdentifier
=	TokenNameEQUAL
props	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getReadMethod	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
getter	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isHandledType	TokenNameIdentifier
(	TokenNameLPAREN
getter	TokenNameIdentifier
.	TokenNameDOT
getReturnType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
props	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Object	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
getter	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
obj	TokenNameIdentifier
,	TokenNameCOMMA
NULL_ARG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
callback	TokenNameIdentifier
.	TokenNameDOT
foundProperty	TokenNameIdentifier
(	TokenNameLPAREN
obj	TokenNameIdentifier
,	TokenNameCOMMA
prefix	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalAccessException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Failed to get value of property "	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InvocationTargetException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ex	TokenNameIdentifier
.	TokenNameDOT
getTargetException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
InterruptedException	TokenNameIdentifier
||	TokenNameOR_OR
ex	TokenNameIdentifier
.	TokenNameDOT
getTargetException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
InterruptedIOException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Thread	TokenNameIdentifier
.	TokenNameDOT
currentThread	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
interrupt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Failed to get value of property "	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
RuntimeException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Failed to get value of property "	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
isHandledType	TokenNameIdentifier
(	TokenNameLPAREN
Class	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
String	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
isAssignableFrom	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
Integer	TokenNameIdentifier
.	TokenNameDOT
TYPE	TokenNameIdentifier
.	TokenNameDOT
isAssignableFrom	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
Long	TokenNameIdentifier
.	TokenNameDOT
TYPE	TokenNameIdentifier
.	TokenNameDOT
isAssignableFrom	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
Boolean	TokenNameIdentifier
.	TokenNameDOT
TYPE	TokenNameIdentifier
.	TokenNameDOT
isAssignableFrom	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
Priority	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
isAssignableFrom	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
