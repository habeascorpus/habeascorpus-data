package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
bridge	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
NoLoadExternalResourceSecurity	TokenNameIdentifier
implements	TokenNameimplements
ExternalResourceSecurity	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ERROR_NO_EXTERNAL_RESOURCE_ALLOWED	TokenNameIdentifier
=	TokenNameEQUAL
"NoLoadExternalResourceSecurity.error.no.external.resource.allowed"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
SecurityException	TokenNameIdentifier
se	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
checkLoadExternalResource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
se	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
se	TokenNameIdentifier
.	TokenNameDOT
fillInStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
se	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
NoLoadExternalResourceSecurity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
se	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SecurityException	TokenNameIdentifier
(	TokenNameLPAREN
Messages	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
ERROR_NO_EXTERNAL_RESOURCE_ALLOWED	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
