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
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileOutputStream	TokenNameIdentifier
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
DirSetTest	TokenNameIdentifier
extends	TokenNameextends
AbstractFileSetTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
DirSetTest	TokenNameIdentifier
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
DirSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFileSetIsNoDirSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
DirSet	TokenNameIdentifier
ds	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DirSet	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ds	TokenNameIdentifier
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FileSet	TokenNameIdentifier
fs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FileSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
addReference	TokenNameIdentifier
(	TokenNameLPAREN
"dummy"	TokenNameStringLiteral
,	TokenNameCOMMA
fs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ds	TokenNameIdentifier
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
"dummy"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
ds	TokenNameIdentifier
.	TokenNameDOT
getDir	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"DirSet created from FileSet reference"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"dummy doesn't denote a DirSet"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ds	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DirSet	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ds	TokenNameIdentifier
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
addReference	TokenNameIdentifier
(	TokenNameLPAREN
"dummy2"	TokenNameStringLiteral
,	TokenNameCOMMA
ds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
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
"dummy2"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
fs	TokenNameIdentifier
.	TokenNameDOT
getDir	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"FileSet created from DirSet reference"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"dummy2 doesn't denote a FileSet"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
tmp	TokenNameIdentifier
=	TokenNameEQUAL
File	TokenNameIdentifier
.	TokenNameDOT
createTempFile	TokenNameIdentifier
(	TokenNameLPAREN
"DirSetTest"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
tmp	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
a	TokenNameIdentifier
.	TokenNameDOT
mkdirs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
,	TokenNameCOMMA
"b"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
bc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
,	TokenNameCOMMA
"c"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bc	TokenNameIdentifier
.	TokenNameDOT
mkdirs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
FileOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
"x"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
FileOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
,	TokenNameCOMMA
"x"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
FileOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
bc	TokenNameIdentifier
,	TokenNameCOMMA
"x"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DirSet	TokenNameIdentifier
ds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DirSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ds	TokenNameIdentifier
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ds	TokenNameIdentifier
.	TokenNameDOT
setDir	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ds	TokenNameIdentifier
.	TokenNameDOT
setIncludes	TokenNameIdentifier
(	TokenNameLPAREN
"b/"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"b;b"	TokenNameStringLiteral
+	TokenNamePLUS
File	TokenNameIdentifier
.	TokenNameDOT
separator	TokenNameIdentifier
+	TokenNamePLUS
"c"	TokenNameStringLiteral
,	TokenNameCOMMA
ds	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
,	TokenNameCOMMA
"a/x"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
,	TokenNameCOMMA
"b/c/x"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
,	TokenNameCOMMA
"b/c"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
,	TokenNameCOMMA
"b/x"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
,	TokenNameCOMMA
"b"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE