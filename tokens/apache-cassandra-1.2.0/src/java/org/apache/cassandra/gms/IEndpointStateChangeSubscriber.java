package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
gms	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
InetAddress	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
IEndpointStateChangeSubscriber	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
onJoin	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
endpoint	TokenNameIdentifier
,	TokenNameCOMMA
EndpointState	TokenNameIdentifier
epState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
onChange	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
endpoint	TokenNameIdentifier
,	TokenNameCOMMA
ApplicationState	TokenNameIdentifier
state	TokenNameIdentifier
,	TokenNameCOMMA
VersionedValue	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
onAlive	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
endpoint	TokenNameIdentifier
,	TokenNameCOMMA
EndpointState	TokenNameIdentifier
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
onDead	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
endpoint	TokenNameIdentifier
,	TokenNameCOMMA
EndpointState	TokenNameIdentifier
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
onRemove	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
endpoint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
onRestart	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
endpoint	TokenNameIdentifier
,	TokenNameCOMMA
EndpointState	TokenNameIdentifier
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
