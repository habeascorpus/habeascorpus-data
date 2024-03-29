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
config	TokenNameIdentifier
.	TokenNameDOT
KSMetaData	TokenNameIdentifier
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
Schema	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
KSPropDefs	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
Table	TokenNameIdentifier
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
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
locator	TokenNameIdentifier
.	TokenNameDOT
AbstractReplicationStrategy	TokenNameIdentifier
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
service	TokenNameIdentifier
.	TokenNameDOT
MigrationManager	TokenNameIdentifier
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
StorageService	TokenNameIdentifier
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
AlterKeyspaceStatement	TokenNameIdentifier
extends	TokenNameextends
SchemaAlteringStatement	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
name	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
KSPropDefs	TokenNameIdentifier
attrs	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
AlterKeyspaceStatement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
KSPropDefs	TokenNameIdentifier
attrs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
name	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
attrs	TokenNameIdentifier
=	TokenNameEQUAL
attrs	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
keyspace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
checkAccess	TokenNameIdentifier
(	TokenNameLPAREN
ClientState	TokenNameIdentifier
state	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
UnauthorizedException	TokenNameIdentifier
,	TokenNameCOMMA
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
state	TokenNameIdentifier
.	TokenNameDOT
hasKeyspaceAccess	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
Permission	TokenNameIdentifier
.	TokenNameDOT
ALTER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
validate	TokenNameIdentifier
(	TokenNameLPAREN
ClientState	TokenNameIdentifier
state	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
RequestValidationException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
validate	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
KSMetaData	TokenNameIdentifier
ksm	TokenNameIdentifier
=	TokenNameEQUAL
Schema	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getKSMetaData	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ksm	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Unknown keyspace "	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ksm	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
Table	TokenNameIdentifier
.	TokenNameDOT
SYSTEM_KS	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot alter system keyspace"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
attrs	TokenNameIdentifier
.	TokenNameDOT
validate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
attrs	TokenNameIdentifier
.	TokenNameDOT
getReplicationStrategyClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
attrs	TokenNameIdentifier
.	TokenNameDOT
getReplicationOptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ConfigurationException	TokenNameIdentifier
(	TokenNameLPAREN
"Missing replication strategy class"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
attrs	TokenNameIdentifier
.	TokenNameDOT
getReplicationStrategyClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
AbstractReplicationStrategy	TokenNameIdentifier
.	TokenNameDOT
createReplicationStrategy	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
AbstractReplicationStrategy	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
attrs	TokenNameIdentifier
.	TokenNameDOT
getReplicationStrategyClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getTokenMetadata	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getEndpointSnitch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
attrs	TokenNameIdentifier
.	TokenNameDOT
getReplicationOptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
announceMigration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
RequestValidationException	TokenNameIdentifier
{	TokenNameLBRACE
KSMetaData	TokenNameIdentifier
ksm	TokenNameIdentifier
=	TokenNameEQUAL
Schema	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getKSMetaData	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ksm	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Unknown keyspace "	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MigrationManager	TokenNameIdentifier
.	TokenNameDOT
announceKeyspaceUpdate	TokenNameIdentifier
(	TokenNameLPAREN
attrs	TokenNameIdentifier
.	TokenNameDOT
asKSMetadataUpdate	TokenNameIdentifier
(	TokenNameLPAREN
ksm	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ResultMessage	TokenNameIdentifier
.	TokenNameDOT
SchemaChange	TokenNameIdentifier
.	TokenNameDOT
Change	TokenNameIdentifier
changeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ResultMessage	TokenNameIdentifier
.	TokenNameDOT
SchemaChange	TokenNameIdentifier
.	TokenNameDOT
Change	TokenNameIdentifier
.	TokenNameDOT
UPDATED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
