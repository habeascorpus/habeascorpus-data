package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
auth	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
AuthenticationException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
ConfigurationException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
InvalidRequestException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
LegacyAuthenticator	TokenNameIdentifier
implements	TokenNameimplements
IAuthenticator	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
abstract	TokenNameabstract
AuthenticatedUser	TokenNameIdentifier
defaultUser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
AuthenticatedUser	TokenNameIdentifier
authenticate	TokenNameIdentifier
(	TokenNameLPAREN
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
credentials	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
AuthenticationException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
void	TokenNamevoid
validateConfiguration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ConfigurationException	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
requireAuthentication	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
defaultUser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Set	TokenNameIdentifier
<	TokenNameLESS
Option	TokenNameIdentifier
>	TokenNameGREATER
supportedOptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
emptySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Set	TokenNameIdentifier
<	TokenNameLESS
Option	TokenNameIdentifier
>	TokenNameGREATER
alterableOptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
emptySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
username	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
Option	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
options	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
alter	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
username	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
Option	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
>	TokenNameGREATER
options	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"ALTER USER operation is not supported by LegacyAuthenticator"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
drop	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
username	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Set	TokenNameIdentifier
<	TokenNameLESS
IResource	TokenNameIdentifier
>	TokenNameGREATER
protectedResources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
emptySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
