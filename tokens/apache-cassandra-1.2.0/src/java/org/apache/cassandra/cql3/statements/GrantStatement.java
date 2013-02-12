package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
statements	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
auth	TokenNameIdentifier
.	TokenNameDOT
IResource	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
auth	TokenNameIdentifier
.	TokenNameDOT
Permission	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
DatabaseDescriptor	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
UnauthorizedException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
service	TokenNameIdentifier
.	TokenNameDOT
ClientState	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
transport	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
ResultMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
GrantStatement	TokenNameIdentifier
extends	TokenNameextends
PermissionAlteringStatement	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
GrantStatement	TokenNameIdentifier
(	TokenNameLPAREN
Set	TokenNameIdentifier
<	TokenNameLESS
Permission	TokenNameIdentifier
>	TokenNameGREATER
permissions	TokenNameIdentifier
,	TokenNameCOMMA
IResource	TokenNameIdentifier
resource	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
username	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
permissions	TokenNameIdentifier
,	TokenNameCOMMA
resource	TokenNameIdentifier
,	TokenNameCOMMA
username	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ResultMessage	TokenNameIdentifier
execute	TokenNameIdentifier
(	TokenNameLPAREN
ClientState	TokenNameIdentifier
state	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
UnauthorizedException	TokenNameIdentifier
,	TokenNameCOMMA
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getAuthorizer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
grant	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
.	TokenNameDOT
getUser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
permissions	TokenNameIdentifier
,	TokenNameCOMMA
resource	TokenNameIdentifier
,	TokenNameCOMMA
username	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
