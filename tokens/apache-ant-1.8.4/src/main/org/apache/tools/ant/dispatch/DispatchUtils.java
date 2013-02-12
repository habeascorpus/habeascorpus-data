package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
dispatch	TokenNameIdentifier
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
BuildException	TokenNameIdentifier
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
UnknownElement	TokenNameIdentifier
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
Task	TokenNameIdentifier
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
DispatchUtils	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
task	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
methodName	TokenNameIdentifier
=	TokenNameEQUAL
"execute"	TokenNameStringLiteral
;	TokenNameSEMICOLON
Dispatchable	TokenNameIdentifier
dispatchable	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
task	TokenNameIdentifier
instanceof	TokenNameinstanceof
Dispatchable	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
dispatchable	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Dispatchable	TokenNameIdentifier
)	TokenNameRPAREN
task	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
task	TokenNameIdentifier
instanceof	TokenNameinstanceof
UnknownElement	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
UnknownElement	TokenNameIdentifier
ue	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
UnknownElement	TokenNameIdentifier
)	TokenNameRPAREN
task	TokenNameIdentifier
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
realThing	TokenNameIdentifier
=	TokenNameEQUAL
ue	TokenNameIdentifier
.	TokenNameDOT
getRealThing	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
realThing	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
realThing	TokenNameIdentifier
instanceof	TokenNameinstanceof
Dispatchable	TokenNameIdentifier
&&	TokenNameAND_AND
realThing	TokenNameIdentifier
instanceof	TokenNameinstanceof
Task	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
dispatchable	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Dispatchable	TokenNameIdentifier
)	TokenNameRPAREN
realThing	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
dispatchable	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
mName	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
dispatchable	TokenNameIdentifier
.	TokenNameDOT
getActionParameterName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
name	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
mName	TokenNameIdentifier
=	TokenNameEQUAL
"get"	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
toUpperCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
mName	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
name	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
Class	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
dispatchable	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Method	TokenNameIdentifier
actionM	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
getMethod	TokenNameIdentifier
(	TokenNameLPAREN
mName	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Class	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
actionM	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
actionM	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
dispatchable	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
o	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
s	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
methodName	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Method	TokenNameIdentifier
executeM	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
executeM	TokenNameIdentifier
=	TokenNameEQUAL
dispatchable	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMethod	TokenNameIdentifier
(	TokenNameLPAREN
methodName	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Class	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
executeM	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"No public "	TokenNameStringLiteral
+	TokenNamePLUS
methodName	TokenNameIdentifier
+	TokenNamePLUS
"() in "	TokenNameStringLiteral
+	TokenNamePLUS
dispatchable	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
executeM	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
dispatchable	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
task	TokenNameIdentifier
instanceof	TokenNameinstanceof
UnknownElement	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
(	TokenNameLPAREN
(	TokenNameLPAREN
UnknownElement	TokenNameIdentifier
)	TokenNameRPAREN
task	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setRealThing	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Dispatchable Task attribute '"	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"' not set or value is empty."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Dispatchable Task attribute '"	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"' not set or value is empty."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Action Parameter Name must not be empty for Dispatchable Task."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoSuchMethodException	TokenNameIdentifier
nsme	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"No public "	TokenNameStringLiteral
+	TokenNamePLUS
mName	TokenNameIdentifier
+	TokenNamePLUS
"() in "	TokenNameStringLiteral
+	TokenNamePLUS
task	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
Method	TokenNameIdentifier
executeM	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
executeM	TokenNameIdentifier
=	TokenNameEQUAL
task	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMethod	TokenNameIdentifier
(	TokenNameLPAREN
methodName	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Class	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
executeM	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"No public "	TokenNameStringLiteral
+	TokenNamePLUS
methodName	TokenNameIdentifier
+	TokenNamePLUS
"() in "	TokenNameStringLiteral
+	TokenNamePLUS
task	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
executeM	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
task	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
task	TokenNameIdentifier
instanceof	TokenNameinstanceof
UnknownElement	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
(	TokenNameLPAREN
(	TokenNameLPAREN
UnknownElement	TokenNameIdentifier
)	TokenNameRPAREN
task	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setRealThing	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InvocationTargetException	TokenNameIdentifier
ie	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
ie	TokenNameIdentifier
.	TokenNameDOT
getTargetException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
t	TokenNameIdentifier
instanceof	TokenNameinstanceof
BuildException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
(	TokenNameLPAREN
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
)	TokenNameRPAREN
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoSuchMethodException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalAccessException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE