package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
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
MissingModuleException	TokenNameIdentifier
extends	TokenNameextends
MavenExecutionException	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
File	TokenNameIdentifier
moduleFile	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
moduleName	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
MissingModuleException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
moduleName	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
moduleFile	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
pomFile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
"The module: "	TokenNameStringLiteral
+	TokenNamePLUS
moduleName	TokenNameIdentifier
+	TokenNamePLUS
" cannot be found in file: "	TokenNameStringLiteral
+	TokenNamePLUS
moduleFile	TokenNameIdentifier
,	TokenNameCOMMA
pomFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
moduleName	TokenNameIdentifier
=	TokenNameEQUAL
moduleName	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
moduleFile	TokenNameIdentifier
=	TokenNameEQUAL
moduleFile	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
File	TokenNameIdentifier
getModuleFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
moduleFile	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getModuleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
moduleName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE