package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Constructor	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
Directory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
FSDirectory	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
CommandLineUtil	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
CommandLineUtil	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
FSDirectory	TokenNameIdentifier
newFSDirectory	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
clazzName	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
file	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
final	TokenNamefinal
Class	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
FSDirectory	TokenNameIdentifier
>	TokenNameGREATER
clazz	TokenNameIdentifier
=	TokenNameEQUAL
loadFSDirectoryClass	TokenNameIdentifier
(	TokenNameLPAREN
clazzName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
newFSDirectory	TokenNameIdentifier
(	TokenNameLPAREN
clazz	TokenNameIdentifier
,	TokenNameCOMMA
file	TokenNameIdentifier
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
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
FSDirectory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" implementation not found: "	TokenNameStringLiteral
+	TokenNamePLUS
clazzName	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassCastException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
clazzName	TokenNameIdentifier
+	TokenNamePLUS
" is not a "	TokenNameStringLiteral
+	TokenNamePLUS
FSDirectory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" implementation"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoSuchMethodException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
clazzName	TokenNameIdentifier
+	TokenNamePLUS
" constructor with "	TokenNameStringLiteral
+	TokenNamePLUS
File	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" as parameter not found"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
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
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Error creating "	TokenNameStringLiteral
+	TokenNamePLUS
clazzName	TokenNameIdentifier
+	TokenNamePLUS
" instance"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Class	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
Directory	TokenNameIdentifier
>	TokenNameGREATER
loadDirectoryClass	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
clazzName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ClassNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
adjustDirectoryClassName	TokenNameIdentifier
(	TokenNameLPAREN
clazzName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
asSubclass	TokenNameIdentifier
(	TokenNameLPAREN
Directory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Class	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
FSDirectory	TokenNameIdentifier
>	TokenNameGREATER
loadFSDirectoryClass	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
clazzName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ClassNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
adjustDirectoryClassName	TokenNameIdentifier
(	TokenNameLPAREN
clazzName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
asSubclass	TokenNameIdentifier
(	TokenNameLPAREN
FSDirectory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
adjustDirectoryClassName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
clazzName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
clazzName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
clazzName	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"The "	TokenNameStringLiteral
+	TokenNamePLUS
FSDirectory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" implementation cannot be null or empty"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
clazzName	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
clazzName	TokenNameIdentifier
=	TokenNameEQUAL
Directory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getPackage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"."	TokenNameStringLiteral
+	TokenNamePLUS
clazzName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
clazzName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
FSDirectory	TokenNameIdentifier
newFSDirectory	TokenNameIdentifier
(	TokenNameLPAREN
Class	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
FSDirectory	TokenNameIdentifier
>	TokenNameGREATER
clazz	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
file	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
NoSuchMethodException	TokenNameIdentifier
,	TokenNameCOMMA
InstantiationException	TokenNameIdentifier
,	TokenNameCOMMA
IllegalAccessException	TokenNameIdentifier
,	TokenNameCOMMA
InvocationTargetException	TokenNameIdentifier
{	TokenNameLBRACE
Constructor	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
FSDirectory	TokenNameIdentifier
>	TokenNameGREATER
ctor	TokenNameIdentifier
=	TokenNameEQUAL
clazz	TokenNameIdentifier
.	TokenNameDOT
getConstructor	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ctor	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
