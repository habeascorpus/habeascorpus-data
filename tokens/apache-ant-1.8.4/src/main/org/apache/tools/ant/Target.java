package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Enumeration	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
StringTokenizer	TokenNameIdentifier
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
property	TokenNameIdentifier
.	TokenNameDOT
LocalProperties	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Target	TokenNameIdentifier
implements	TokenNameimplements
TaskContainer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
name	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
ifCondition	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
unlessCondition	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
dependencies	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
children	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Location	TokenNameIdentifier
location	TokenNameIdentifier
=	TokenNameEQUAL
Location	TokenNameIdentifier
.	TokenNameDOT
UNKNOWN_LOCATION	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Project	TokenNameIdentifier
project	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
description	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
Target	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Target	TokenNameIdentifier
(	TokenNameLPAREN
Target	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
name	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
ifCondition	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
ifCondition	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
unlessCondition	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
unlessCondition	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
dependencies	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
dependencies	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
location	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
location	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
project	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
description	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
description	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
children	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
children	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setProject	TokenNameIdentifier
(	TokenNameLPAREN
Project	TokenNameIdentifier
project	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
project	TokenNameIdentifier
=	TokenNameEQUAL
project	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Project	TokenNameIdentifier
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
project	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLocation	TokenNameIdentifier
(	TokenNameLPAREN
Location	TokenNameIdentifier
location	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
location	TokenNameIdentifier
=	TokenNameEQUAL
location	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Location	TokenNameIdentifier
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
location	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDepends	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
depS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
parseDepends	TokenNameIdentifier
(	TokenNameLPAREN
depS	TokenNameIdentifier
,	TokenNameCOMMA
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"depends"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
addDependency	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
List	TokenNameIdentifier
parseDepends	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
depends	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
targetName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
attributeName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ArrayList	TokenNameIdentifier
list	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
depends	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
StringTokenizer	TokenNameIdentifier
tok	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
depends	TokenNameIdentifier
,	TokenNameCOMMA
","	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
tok	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
token	TokenNameIdentifier
=	TokenNameEQUAL
tok	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
""	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
","	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Syntax Error: "	TokenNameStringLiteral
+	TokenNamePLUS
attributeName	TokenNameIdentifier
+	TokenNamePLUS
" attribute of target ""	TokenNameStringLiteral
+	TokenNamePLUS
targetName	TokenNameIdentifier
+	TokenNamePLUS
"" contains an empty string."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tok	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
token	TokenNameIdentifier
=	TokenNameEQUAL
tok	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
tok	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
!	TokenNameNOT
","	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Syntax Error: "	TokenNameStringLiteral
+	TokenNamePLUS
attributeName	TokenNameIdentifier
+	TokenNamePLUS
" attribute for target ""	TokenNameStringLiteral
+	TokenNamePLUS
targetName	TokenNameIdentifier
+	TokenNamePLUS
"" ends with a "," "	TokenNameStringLiteral
+	TokenNamePLUS
"character"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
list	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
name	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addTask	TokenNameIdentifier
(	TokenNameLPAREN
Task	TokenNameIdentifier
task	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
children	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
task	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addDataType	TokenNameIdentifier
(	TokenNameLPAREN
RuntimeConfigurable	TokenNameIdentifier
r	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
children	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Task	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getTasks	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
tasks	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
children	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
it	TokenNameIdentifier
=	TokenNameEQUAL
children	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
instanceof	TokenNameinstanceof
Task	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
tasks	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Task	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
tasks	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Task	TokenNameIdentifier
[	TokenNameLBRACKET
tasks	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addDependency	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
dependency	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
dependencies	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
dependencies	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
dependencies	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
dependency	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Enumeration	TokenNameIdentifier
getDependencies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
enumeration	TokenNameIdentifier
(	TokenNameLPAREN
dependencies	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
:	TokenNameCOLON
dependencies	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
dependsOn	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Project	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Hashtable	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
p	TokenNameIdentifier
.	TokenNameDOT
getTargets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
p	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
p	TokenNameIdentifier
.	TokenNameDOT
topoSort	TokenNameIdentifier
(	TokenNameLPAREN
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
t	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setIf	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
property	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ifCondition	TokenNameIdentifier
=	TokenNameEQUAL
property	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
property	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getIf	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
""	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ifCondition	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
ifCondition	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setUnless	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
property	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
unlessCondition	TokenNameIdentifier
=	TokenNameEQUAL
property	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
property	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getUnless	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
""	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
unlessCondition	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
unlessCondition	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDescription	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
description	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
description	TokenNameIdentifier
=	TokenNameEQUAL
description	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getDescription	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
description	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
testIfAllows	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
project	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
"Skipped because property '"	TokenNameStringLiteral
+	TokenNamePLUS
project	TokenNameIdentifier
.	TokenNameDOT
replaceProperties	TokenNameIdentifier
(	TokenNameLPAREN
ifCondition	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
"' not set."	TokenNameStringLiteral
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
testUnlessAllows	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
project	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
"Skipped because property '"	TokenNameStringLiteral
+	TokenNamePLUS
project	TokenNameIdentifier
.	TokenNameDOT
replaceProperties	TokenNameIdentifier
(	TokenNameLPAREN
unlessCondition	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
"' set."	TokenNameStringLiteral
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
LocalProperties	TokenNameIdentifier
localProperties	TokenNameIdentifier
=	TokenNameEQUAL
LocalProperties	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
localProperties	TokenNameIdentifier
.	TokenNameDOT
enterScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
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
children	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
children	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
instanceof	TokenNameinstanceof
Task	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Task	TokenNameIdentifier
task	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Task	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
;	TokenNameSEMICOLON
task	TokenNameIdentifier
.	TokenNameDOT
perform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
(	TokenNameLPAREN
(	TokenNameLPAREN
RuntimeConfigurable	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
maybeConfigure	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
localProperties	TokenNameIdentifier
.	TokenNameDOT
exitScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
performTasks	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
RuntimeException	TokenNameIdentifier
thrown	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
fireTargetStarted	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
RuntimeException	TokenNameIdentifier
exc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
thrown	TokenNameIdentifier
=	TokenNameEQUAL
exc	TokenNameIdentifier
;	TokenNameSEMICOLON
throw	TokenNamethrow
exc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
project	TokenNameIdentifier
.	TokenNameDOT
fireTargetFinished	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
thrown	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
replaceChild	TokenNameIdentifier
(	TokenNameLPAREN
Task	TokenNameIdentifier
el	TokenNameIdentifier
,	TokenNameCOMMA
RuntimeConfigurable	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
index	TokenNameIdentifier
=	TokenNameEQUAL
children	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
el	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
children	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
,	TokenNameCOMMA
o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
replaceChild	TokenNameIdentifier
(	TokenNameLPAREN
Task	TokenNameIdentifier
el	TokenNameIdentifier
,	TokenNameCOMMA
Task	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
index	TokenNameIdentifier
=	TokenNameEQUAL
children	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
el	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
children	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
,	TokenNameCOMMA
o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
testIfAllows	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
PropertyHelper	TokenNameIdentifier
propertyHelper	TokenNameIdentifier
=	TokenNameEQUAL
PropertyHelper	TokenNameIdentifier
.	TokenNameDOT
getPropertyHelper	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
propertyHelper	TokenNameIdentifier
.	TokenNameDOT
parseProperties	TokenNameIdentifier
(	TokenNameLPAREN
ifCondition	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
propertyHelper	TokenNameIdentifier
.	TokenNameDOT
testIfCondition	TokenNameIdentifier
(	TokenNameLPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
testUnlessAllows	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
PropertyHelper	TokenNameIdentifier
propertyHelper	TokenNameIdentifier
=	TokenNameEQUAL
PropertyHelper	TokenNameIdentifier
.	TokenNameDOT
getPropertyHelper	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
propertyHelper	TokenNameIdentifier
.	TokenNameDOT
parseProperties	TokenNameIdentifier
(	TokenNameLPAREN
unlessCondition	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
propertyHelper	TokenNameIdentifier
.	TokenNameDOT
testUnlessCondition	TokenNameIdentifier
(	TokenNameLPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
