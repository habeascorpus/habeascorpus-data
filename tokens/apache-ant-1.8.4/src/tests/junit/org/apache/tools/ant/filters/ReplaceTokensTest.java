package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
filters	TokenNameIdentifier
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
IOException	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
FileUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ReplaceTokensTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
FileUtils	TokenNameIdentifier
FILE_UTILS	TokenNameIdentifier
=	TokenNameEQUAL
FileUtils	TokenNameIdentifier
.	TokenNameDOT
getFileUtils	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ReplaceTokensTest	TokenNameIdentifier
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
"src/etc/testcases/filters/build.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
tearDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"cleanup"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testReplaceTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testReplaceTokens"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
expected	TokenNameIdentifier
=	TokenNameEQUAL
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getBaseDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"expected/replacetokens.test"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getBaseDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"result/replacetokens.test"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
contentEquals	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testReplaceTokensPropertyFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
executeTarget	TokenNameIdentifier
(	TokenNameLPAREN
"testReplaceTokensPropertyFile"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
expected	TokenNameIdentifier
=	TokenNameEQUAL
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
getProjectDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"expected/replacetokens.test"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
getProjectDir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"result/replacetokensPropertyFile.test"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
contentEquals	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE