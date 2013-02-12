package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
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
DuplicateProjectException	TokenNameIdentifier
extends	TokenNameextends
Exception	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
projectId	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
File	TokenNameIdentifier
existingProjectFile	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
File	TokenNameIdentifier
conflictingProjectFile	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DuplicateProjectException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DuplicateProjectException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
projectId	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
existingProjectFile	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
conflictingProjectFile	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DuplicateProjectException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
projectId	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
existingProjectFile	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
conflictingProjectFile	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
message	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
projectId	TokenNameIdentifier
=	TokenNameEQUAL
projectId	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
existingProjectFile	TokenNameIdentifier
=	TokenNameEQUAL
existingProjectFile	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
conflictingProjectFile	TokenNameIdentifier
=	TokenNameEQUAL
conflictingProjectFile	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getProjectId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
projectId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
File	TokenNameIdentifier
getExistingProjectFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
existingProjectFile	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
File	TokenNameIdentifier
getConflictingProjectFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
conflictingProjectFile	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE