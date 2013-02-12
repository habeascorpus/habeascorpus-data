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
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
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
helper	TokenNameIdentifier
.	TokenNameDOT
ProjectHelper2	TokenNameIdentifier
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
Resource	TokenNameIdentifier
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
resources	TokenNameIdentifier
.	TokenNameDOT
FileResource	TokenNameIdentifier
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
resources	TokenNameIdentifier
.	TokenNameDOT
StringResource	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ProjectHelperRepositoryTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
SomeHelper	TokenNameIdentifier
extends	TokenNameextends
ProjectHelper	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
boolean	TokenNameboolean
canParseBuildFile	TokenNameIdentifier
(	TokenNameLPAREN
Resource	TokenNameIdentifier
buildFile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
buildFile	TokenNameIdentifier
instanceof	TokenNameinstanceof
FileResource	TokenNameIdentifier
&&	TokenNameAND_AND
buildFile	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
".myext"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
canParseAntlibDescriptor	TokenNameIdentifier
(	TokenNameLPAREN
Resource	TokenNameIdentifier
r	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
r	TokenNameIdentifier
instanceof	TokenNameinstanceof
FileResource	TokenNameIdentifier
&&	TokenNameAND_AND
r	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
".myext"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFind	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
ProjectHelperRepository	TokenNameIdentifier
repo	TokenNameIdentifier
=	TokenNameEQUAL
ProjectHelperRepository	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
repo	TokenNameIdentifier
.	TokenNameDOT
registerProjectHelper	TokenNameIdentifier
(	TokenNameLPAREN
SomeHelper	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Resource	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FileResource	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"test.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ProjectHelper	TokenNameIdentifier
helper	TokenNameIdentifier
=	TokenNameEQUAL
repo	TokenNameIdentifier
.	TokenNameDOT
getProjectHelperForBuildFile	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
helper	TokenNameIdentifier
instanceof	TokenNameinstanceof
ProjectHelper2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
helper	TokenNameIdentifier
=	TokenNameEQUAL
repo	TokenNameIdentifier
.	TokenNameDOT
getProjectHelperForAntlib	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
helper	TokenNameIdentifier
instanceof	TokenNameinstanceof
ProjectHelper2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FileResource	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
"test.myext"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
helper	TokenNameIdentifier
=	TokenNameEQUAL
repo	TokenNameIdentifier
.	TokenNameDOT
getProjectHelperForBuildFile	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
helper	TokenNameIdentifier
instanceof	TokenNameinstanceof
SomeHelper	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
helper	TokenNameIdentifier
=	TokenNameEQUAL
repo	TokenNameIdentifier
.	TokenNameDOT
getProjectHelperForAntlib	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
helper	TokenNameIdentifier
instanceof	TokenNameinstanceof
SomeHelper	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringResource	TokenNameIdentifier
(	TokenNameLPAREN
"test.myext"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
helper	TokenNameIdentifier
=	TokenNameEQUAL
repo	TokenNameIdentifier
.	TokenNameDOT
getProjectHelperForBuildFile	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
helper	TokenNameIdentifier
instanceof	TokenNameinstanceof
ProjectHelper2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
helper	TokenNameIdentifier
=	TokenNameEQUAL
repo	TokenNameIdentifier
.	TokenNameDOT
getProjectHelperForAntlib	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
helper	TokenNameIdentifier
instanceof	TokenNameinstanceof
ProjectHelper2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringResource	TokenNameIdentifier
(	TokenNameLPAREN
"test.other"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
helper	TokenNameIdentifier
=	TokenNameEQUAL
repo	TokenNameIdentifier
.	TokenNameDOT
getProjectHelperForBuildFile	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
helper	TokenNameIdentifier
instanceof	TokenNameinstanceof
ProjectHelper2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
helper	TokenNameIdentifier
=	TokenNameEQUAL
repo	TokenNameIdentifier
.	TokenNameDOT
getProjectHelperForAntlib	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
helper	TokenNameIdentifier
instanceof	TokenNameinstanceof
ProjectHelper2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoDefaultContructor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
class	TokenNameclass
IncrrectHelper	TokenNameIdentifier
extends	TokenNameextends
ProjectHelper	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
ProjectHelperRepository	TokenNameIdentifier
repo	TokenNameIdentifier
=	TokenNameEQUAL
ProjectHelperRepository	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
repo	TokenNameIdentifier
.	TokenNameDOT
registerProjectHelper	TokenNameIdentifier
(	TokenNameLPAREN
IncrrectHelper	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Registring an helper with no default constructor should fail"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testUnkwnowHelper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
ProjectHelperRepository	TokenNameIdentifier
repo	TokenNameIdentifier
=	TokenNameEQUAL
ProjectHelperRepository	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
repo	TokenNameIdentifier
.	TokenNameDOT
registerProjectHelper	TokenNameIdentifier
(	TokenNameLPAREN
"xxx.yyy.zzz.UnknownHelper"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"Registring an unknwon helper should fail"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE