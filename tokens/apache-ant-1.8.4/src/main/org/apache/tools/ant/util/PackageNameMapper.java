package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
PackageNameMapper	TokenNameIdentifier
extends	TokenNameextends
GlobPatternMapper	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
extractVariablePart	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
var	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
prefixLength	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
postfixLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
getHandleDirSep	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
var	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'/'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
var	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
.	TokenNameDOT
separatorChar	TokenNameIdentifier
,	TokenNameCOMMA
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
