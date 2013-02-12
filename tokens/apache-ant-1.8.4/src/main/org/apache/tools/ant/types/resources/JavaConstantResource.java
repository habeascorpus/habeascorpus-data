package	TokenNamepackage
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
resources	TokenNameIdentifier
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
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ByteArrayInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Field	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JavaConstantResource	TokenNameIdentifier
extends	TokenNameextends
AbstractClasspathResource	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
InputStream	TokenNameIdentifier
openInputStream	TokenNameIdentifier
(	TokenNameLPAREN
ClassLoader	TokenNameIdentifier
cl	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Class	TokenNameIdentifier
clazz	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
constant	TokenNameIdentifier
=	TokenNameEQUAL
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
index1	TokenNameIdentifier
=	TokenNameEQUAL
constant	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index1	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"No class name in "	TokenNameStringLiteral
+	TokenNamePLUS
constant	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
index1	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
classname	TokenNameIdentifier
=	TokenNameEQUAL
constant	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
fieldname	TokenNameIdentifier
=	TokenNameEQUAL
constant	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
constant	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
clazz	TokenNameIdentifier
=	TokenNameEQUAL
cl	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
classname	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
cl	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
classname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
field	TokenNameIdentifier
=	TokenNameEQUAL
clazz	TokenNameIdentifier
.	TokenNameDOT
getField	TokenNameIdentifier
(	TokenNameLPAREN
fieldname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
ByteArrayInputStream	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"Class not found:"	TokenNameStringLiteral
+	TokenNamePLUS
classname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoSuchFieldException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"Field not found:"	TokenNameStringLiteral
+	TokenNamePLUS
fieldname	TokenNameIdentifier
+	TokenNamePLUS
" in "	TokenNameStringLiteral
+	TokenNamePLUS
classname	TokenNameIdentifier
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
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"Illegal access to :"	TokenNameStringLiteral
+	TokenNamePLUS
fieldname	TokenNameIdentifier
+	TokenNamePLUS
" in "	TokenNameStringLiteral
+	TokenNamePLUS
classname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NullPointerException	TokenNameIdentifier
npe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"Not a static field: "	TokenNameStringLiteral
+	TokenNamePLUS
fieldname	TokenNameIdentifier
+	TokenNamePLUS
" in "	TokenNameStringLiteral
+	TokenNamePLUS
classname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE