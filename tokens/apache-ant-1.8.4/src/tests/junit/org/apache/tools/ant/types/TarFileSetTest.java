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
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
TarFileSetTest	TokenNameIdentifier
extends	TokenNameextends
AbstractFileSetTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
TarFileSetTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
AbstractFileSet	TokenNameIdentifier
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
TarFileSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
testAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
TarFileSet	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TarFileSet	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"example.tar"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
f	TokenNameIdentifier
.	TokenNameDOT
setDir	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"examples"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"can add dir to "	TokenNameStringLiteral
+	TokenNamePLUS
f	TokenNameIdentifier
.	TokenNameDOT
getDataTypeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" when a src is already present"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot set both dir and src attributes"	TokenNameStringLiteral
,	TokenNameCOMMA
be	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
f	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TarFileSet	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setDir	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"examples"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
f	TokenNameIdentifier
.	TokenNameDOT
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"example.tar"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"can add src to "	TokenNameStringLiteral
+	TokenNamePLUS
f	TokenNameIdentifier
.	TokenNameDOT
getDataTypeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" when a dir is already present"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot set both dir and src attributes"	TokenNameStringLiteral
,	TokenNameCOMMA
be	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
f	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TarFileSet	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"example.tar"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setPrefix	TokenNameIdentifier
(	TokenNameLPAREN
"/examples"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
f	TokenNameIdentifier
.	TokenNameDOT
setFullpath	TokenNameIdentifier
(	TokenNameLPAREN
"/doc/manual/index.html"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Can add fullpath to "	TokenNameStringLiteral
+	TokenNamePLUS
f	TokenNameIdentifier
.	TokenNameDOT
getDataTypeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" when a prefix is already present"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot set both fullpath and prefix attributes"	TokenNameStringLiteral
,	TokenNameCOMMA
be	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
f	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TarFileSet	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"example.tar"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setFullpath	TokenNameIdentifier
(	TokenNameLPAREN
"/doc/manual/index.html"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
f	TokenNameIdentifier
.	TokenNameDOT
setPrefix	TokenNameIdentifier
(	TokenNameLPAREN
"/examples"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Can add prefix to "	TokenNameStringLiteral
+	TokenNamePLUS
f	TokenNameIdentifier
.	TokenNameDOT
getDataTypeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" when a fullpath is already present"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot set both fullpath and prefix attributes"	TokenNameStringLiteral
,	TokenNameCOMMA
be	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
f	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TarFileSet	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setRefid	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Reference	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
f	TokenNameIdentifier
.	TokenNameDOT
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"example.tar"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Can add src to "	TokenNameStringLiteral
+	TokenNamePLUS
f	TokenNameIdentifier
.	TokenNameDOT
getDataTypeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" when a refid is already present"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"You must not specify more than one "	TokenNameStringLiteral
+	TokenNamePLUS
"attribute when using refid"	TokenNameStringLiteral
,	TokenNameCOMMA
be	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
f	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TarFileSet	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"example.tar"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setPrefix	TokenNameIdentifier
(	TokenNameLPAREN
"/examples"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setFileMode	TokenNameIdentifier
(	TokenNameLPAREN
"600"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setDirMode	TokenNameIdentifier
(	TokenNameLPAREN
"530"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
addReference	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TarFileSet	TokenNameIdentifier
zid	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TarFileSet	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zid	TokenNameIdentifier
.	TokenNameDOT
setRefid	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Reference	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"src attribute copied by copy constructor"	TokenNameStringLiteral
,	TokenNameCOMMA
zid	TokenNameIdentifier
.	TokenNameDOT
getSrc	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
getSrc	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"prefix attribute copied by copy constructor"	TokenNameStringLiteral
,	TokenNameCOMMA
f	TokenNameIdentifier
.	TokenNameDOT
getPrefix	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
zid	TokenNameIdentifier
.	TokenNameDOT
getPrefix	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"file mode attribute copied by copy constructor"	TokenNameStringLiteral
,	TokenNameCOMMA
f	TokenNameIdentifier
.	TokenNameDOT
getFileMode	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
zid	TokenNameIdentifier
.	TokenNameDOT
getFileMode	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"dir mode attribute copied by copy constructor"	TokenNameStringLiteral
,	TokenNameCOMMA
f	TokenNameIdentifier
.	TokenNameDOT
getDirMode	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
zid	TokenNameIdentifier
.	TokenNameDOT
getDirMode	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
