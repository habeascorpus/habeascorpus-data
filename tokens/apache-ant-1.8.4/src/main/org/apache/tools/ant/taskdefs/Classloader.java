package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
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
Project	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
MagicNames	TokenNameIdentifier
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
Reference	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Classloader	TokenNameIdentifier
extends	TokenNameextends
Task	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
SYSTEM_LOADER_REF	TokenNameIdentifier
=	TokenNameEQUAL
MagicNames	TokenNameIdentifier
.	TokenNameDOT
SYSTEM_LOADER_REF	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
Path	TokenNameIdentifier
classpath	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
reset	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
parentFirst	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
parentName	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
Classloader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
void	TokenNamevoid
setReset	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
reset	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setReverse	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
parentFirst	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
b	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setParentFirst	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
parentFirst	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setParentName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
parentName	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setClasspathRef	TokenNameIdentifier
(	TokenNameLPAREN
Reference	TokenNameIdentifier
pathRef	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
classpath	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Path	TokenNameIdentifier
)	TokenNameRPAREN
pathRef	TokenNameIdentifier
.	TokenNameDOT
getReferencedObject	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setClasspath	TokenNameIdentifier
(	TokenNameLPAREN
Path	TokenNameIdentifier
classpath	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
classpath	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
classpath	TokenNameIdentifier
=	TokenNameEQUAL
classpath	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
classpath	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
classpath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Path	TokenNameIdentifier
createClasspath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
classpath	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
classpath	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Path	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
classpath	TokenNameIdentifier
.	TokenNameDOT
createPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
"only"	TokenNameStringLiteral
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"build.sysclasspath"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
name	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
SYSTEM_LOADER_REF	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"Changing the system loader is disabled "	TokenNameStringLiteral
+	TokenNamePLUS
"by build.sysclasspath=only"	TokenNameStringLiteral
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_WARN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
loaderName	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
name	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
SYSTEM_LOADER_REF	TokenNameIdentifier
:	TokenNameCOLON
name	TokenNameIdentifier
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
obj	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getReference	TokenNameIdentifier
(	TokenNameLPAREN
loaderName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
reset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
obj	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
obj	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
(	TokenNameLPAREN
obj	TokenNameIdentifier
instanceof	TokenNameinstanceof
AntClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"Referenced object is not an AntClassLoader"	TokenNameStringLiteral
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_ERR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
AntClassLoader	TokenNameIdentifier
acl	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AntClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
existingLoader	TokenNameIdentifier
=	TokenNameEQUAL
acl	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
acl	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
parent	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
parentName	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
parent	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getReference	TokenNameIdentifier
(	TokenNameLPAREN
parentName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
parent	TokenNameIdentifier
instanceof	TokenNameinstanceof
ClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
parent	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
parent	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
parent	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
"Setting parent loader "	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
parent	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
parentFirst	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
acl	TokenNameIdentifier
=	TokenNameEQUAL
AntClassLoader	TokenNameIdentifier
.	TokenNameDOT
newAntClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
ClassLoader	TokenNameIdentifier
)	TokenNameRPAREN
parent	TokenNameIdentifier
,	TokenNameCOMMA
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
classpath	TokenNameIdentifier
,	TokenNameCOMMA
parentFirst	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
addReference	TokenNameIdentifier
(	TokenNameLPAREN
loaderName	TokenNameIdentifier
,	TokenNameCOMMA
acl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
acl	TokenNameIdentifier
.	TokenNameDOT
addLoaderPackageRoot	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.tools.ant.taskdefs.optional"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setCoreLoader	TokenNameIdentifier
(	TokenNameLPAREN
acl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
existingLoader	TokenNameIdentifier
&&	TokenNameAND_AND
classpath	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
list	TokenNameIdentifier
=	TokenNameEQUAL
classpath	TokenNameIdentifier
.	TokenNameDOT
list	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
list	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
list	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"Adding to class loader "	TokenNameStringLiteral
+	TokenNamePLUS
acl	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
f	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
acl	TokenNameIdentifier
.	TokenNameDOT
addPathElement	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ex	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE