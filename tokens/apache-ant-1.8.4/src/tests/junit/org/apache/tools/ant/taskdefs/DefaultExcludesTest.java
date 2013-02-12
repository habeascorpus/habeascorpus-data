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
BuildFileTest	TokenNameIdentifier
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
DirectoryScanner	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DefaultExcludesTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
DefaultExcludesTest	TokenNameIdentifier
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
public	TokenNamepublic
void	TokenNamevoid
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
configureProject	TokenNameIdentifier
(	TokenNameLPAREN
"src/etc/testcases/taskdefs/defaultexcludes.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
project	TokenNameIdentifier
.	TokenNameDOT
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"cleanup"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
test1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expected	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"**/*~"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/#*#"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.#*"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/%*%"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/._*"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/CVS"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/CVS/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.cvsignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/SCCS"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/SCCS/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/vssver.scc"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.svn"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.svn/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.git"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.git/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.gitattributes"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.gitignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.gitmodules"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hg"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hg/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgsub"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgsubstate"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgtags"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.bzr"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.bzr/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.bzrignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.DS_Store"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"test1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"current default excludes"	TokenNameStringLiteral
,	TokenNameCOMMA
expected	TokenNameIdentifier
,	TokenNameCOMMA
DirectoryScanner	TokenNameIdentifier
.	TokenNameDOT
getDefaultExcludes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
test2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expected	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"**/*~"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/#*#"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.#*"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/%*%"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/._*"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/CVS"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/CVS/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.cvsignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/SCCS"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/SCCS/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/vssver.scc"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.svn"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.svn/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.git"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.git/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.gitattributes"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.gitignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.gitmodules"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hg"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hg/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgsub"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgsubstate"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgtags"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.bzr"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.bzr/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.bzrignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.DS_Store"	TokenNameStringLiteral
,	TokenNameCOMMA
"foo"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"test2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"current default excludes"	TokenNameStringLiteral
,	TokenNameCOMMA
expected	TokenNameIdentifier
,	TokenNameCOMMA
DirectoryScanner	TokenNameIdentifier
.	TokenNameDOT
getDefaultExcludes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
test3	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expected	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"**/*~"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/#*#"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.#*"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/%*%"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/._*"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/CVS/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.cvsignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/SCCS"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/SCCS/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/vssver.scc"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.svn"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.svn/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.git"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.git/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.gitattributes"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.gitignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.gitmodules"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hg"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hg/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgsub"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgsubstate"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.hgtags"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.bzr"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.bzr/**"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.bzrignore"	TokenNameStringLiteral
,	TokenNameCOMMA
"**/.DS_Store"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"test3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"current default excludes"	TokenNameStringLiteral
,	TokenNameCOMMA
expected	TokenNameIdentifier
,	TokenNameCOMMA
DirectoryScanner	TokenNameIdentifier
.	TokenNameDOT
getDefaultExcludes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expected	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
actual	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
+	TokenNamePLUS
" : string array length match"	TokenNameStringLiteral
,	TokenNameCOMMA
expected	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
actual	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
counter	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
counter	TokenNameIdentifier
<	TokenNameLESS
expected	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
counter	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
found	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
!	TokenNameNOT
found	TokenNameIdentifier
&&	TokenNameAND_AND
i	TokenNameIdentifier
<	TokenNameLESS
actual	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
found	TokenNameIdentifier
|=	TokenNameOR_EQUAL
expected	TokenNameIdentifier
[	TokenNameLBRACKET
counter	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
actual	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
+	TokenNamePLUS
" : didn't find element "	TokenNameStringLiteral
+	TokenNamePLUS
expected	TokenNameIdentifier
[	TokenNameLBRACKET
counter	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
" in array match"	TokenNameStringLiteral
,	TokenNameCOMMA
found	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
