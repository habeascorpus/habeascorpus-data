package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MalformedURLException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
component	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
exception	TokenNameIdentifier
.	TokenNameDOT
ComponentLookupException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
InvalidRepositoryException	TokenNameIdentifier
extends	TokenNameextends
Exception	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
repositoryId	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
InvalidRepositoryException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
repositoryId	TokenNameIdentifier
,	TokenNameCOMMA
MalformedURLException	TokenNameIdentifier
cause	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
cause	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
repositoryId	TokenNameIdentifier
=	TokenNameEQUAL
repositoryId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
InvalidRepositoryException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
repositoryId	TokenNameIdentifier
,	TokenNameCOMMA
ComponentLookupException	TokenNameIdentifier
cause	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
,	TokenNameCOMMA
cause	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
repositoryId	TokenNameIdentifier
=	TokenNameEQUAL
repositoryId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
InvalidRepositoryException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
repositoryId	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InvalidRepositoryException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
repositoryId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
repositoryId	TokenNameIdentifier
=	TokenNameEQUAL
repositoryId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getRepositoryId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
repositoryId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE