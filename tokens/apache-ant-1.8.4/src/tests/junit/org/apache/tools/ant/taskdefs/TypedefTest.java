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
public	TokenNamepublic
class	TokenNameclass
TypedefTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
TypedefTest	TokenNameIdentifier
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
"src/etc/testcases/taskdefs/typedef.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildException	TokenNameIdentifier
(	TokenNameLPAREN
"empty"	TokenNameStringLiteral
,	TokenNameCOMMA
"required argument not specified"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildException	TokenNameIdentifier
(	TokenNameLPAREN
"noName"	TokenNameStringLiteral
,	TokenNameCOMMA
"required argument not specified"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoClassname	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildException	TokenNameIdentifier
(	TokenNameLPAREN
"noClassname"	TokenNameStringLiteral
,	TokenNameCOMMA
"required argument not specified"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testClassNotFound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectBuildException	TokenNameIdentifier
(	TokenNameLPAREN
"classNotFound"	TokenNameStringLiteral
,	TokenNameCOMMA
"classname specified doesn't exist"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testGlobal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectLog	TokenNameIdentifier
(	TokenNameLPAREN
"testGlobal"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
ref	TokenNameIdentifier
=	TokenNameEQUAL
project	TokenNameIdentifier
.	TokenNameDOT
getReferences	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"global"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"ref is not null"	TokenNameStringLiteral
,	TokenNameCOMMA
ref	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"org.example.types.TypedefTestType"	TokenNameStringLiteral
,	TokenNameCOMMA
ref	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testLocal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectLog	TokenNameIdentifier
(	TokenNameLPAREN
"testLocal"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
ref	TokenNameIdentifier
=	TokenNameEQUAL
project	TokenNameIdentifier
.	TokenNameDOT
getReferences	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"local"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"ref is not null"	TokenNameStringLiteral
,	TokenNameCOMMA
ref	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"org.example.types.TypedefTestType"	TokenNameStringLiteral
,	TokenNameCOMMA
ref	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testDoubleNotPresent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectLogContaining	TokenNameIdentifier
(	TokenNameLPAREN
"double-notpresent"	TokenNameStringLiteral
,	TokenNameCOMMA
"hi"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoResourceOnErrorFailAll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
expectBuildExceptionContaining	TokenNameIdentifier
(	TokenNameLPAREN
"noresourcefailall"	TokenNameStringLiteral
,	TokenNameCOMMA
"the requested resource does not exist"	TokenNameStringLiteral
,	TokenNameCOMMA
"Could not load definitions from resource "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoResourceOnErrorFail	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectLogContaining	TokenNameIdentifier
(	TokenNameLPAREN
"noresourcefail"	TokenNameStringLiteral
,	TokenNameCOMMA
"Could not load definitions from resource "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoResourceOnErrorNotFail	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectLogContaining	TokenNameIdentifier
(	TokenNameLPAREN
"noresourcenotfail"	TokenNameStringLiteral
,	TokenNameCOMMA
"Could not load definitions from resource "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE