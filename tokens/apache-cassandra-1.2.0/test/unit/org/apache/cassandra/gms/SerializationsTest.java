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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
AbstractSerializationsTester	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
dht	TokenNameIdentifier
.	TokenNameDOT
Token	TokenNameIdentifier
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
utils	TokenNameIdentifier
.	TokenNameDOT
FBUtilities	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataOutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
InetAddress	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
UUID	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SerializationsTest	TokenNameIdentifier
extends	TokenNameextends
AbstractSerializationsTester	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
void	TokenNamevoid
testEndpointStateWrite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
DataOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
"gms.EndpointState.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
HeartBeatState	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
Statics	TokenNameIdentifier
.	TokenNameDOT
HeartbeatSt	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
EndpointState	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
Statics	TokenNameIdentifier
.	TokenNameDOT
EndpointSt	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
VersionedValue	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
Statics	TokenNameIdentifier
.	TokenNameDOT
vv0	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
VersionedValue	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
Statics	TokenNameIdentifier
.	TokenNameDOT
vv1	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testSerializedSize	TokenNameIdentifier
(	TokenNameLPAREN
Statics	TokenNameIdentifier
.	TokenNameDOT
HeartbeatSt	TokenNameIdentifier
,	TokenNameCOMMA
HeartBeatState	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testSerializedSize	TokenNameIdentifier
(	TokenNameLPAREN
Statics	TokenNameIdentifier
.	TokenNameDOT
EndpointSt	TokenNameIdentifier
,	TokenNameCOMMA
EndpointState	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testSerializedSize	TokenNameIdentifier
(	TokenNameLPAREN
Statics	TokenNameIdentifier
.	TokenNameDOT
vv0	TokenNameIdentifier
,	TokenNameCOMMA
VersionedValue	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testSerializedSize	TokenNameIdentifier
(	TokenNameLPAREN
Statics	TokenNameIdentifier
.	TokenNameDOT
vv1	TokenNameIdentifier
,	TokenNameCOMMA
VersionedValue	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testEndpointStateRead	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
EXECUTE_WRITES	TokenNameIdentifier
)	TokenNameRPAREN
testEndpointStateWrite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataInputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
getInput	TokenNameIdentifier
(	TokenNameLPAREN
"gms.EndpointState.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
HeartBeatState	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
EndpointState	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
VersionedValue	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
VersionedValue	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
testGossipDigestWrite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Map	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
EndpointState	TokenNameIdentifier
>	TokenNameGREATER
states	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
EndpointState	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
states	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
.	TokenNameDOT
getByName	TokenNameIdentifier
(	TokenNameLPAREN
"127.0.0.1"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
Statics	TokenNameIdentifier
.	TokenNameDOT
EndpointSt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
states	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
.	TokenNameDOT
getByName	TokenNameIdentifier
(	TokenNameLPAREN
"127.0.0.2"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
Statics	TokenNameIdentifier
.	TokenNameDOT
EndpointSt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GossipDigestAck	TokenNameIdentifier
ack	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GossipDigestAck	TokenNameIdentifier
(	TokenNameLPAREN
Statics	TokenNameIdentifier
.	TokenNameDOT
Digests	TokenNameIdentifier
,	TokenNameCOMMA
states	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GossipDigestAck2	TokenNameIdentifier
ack2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GossipDigestAck2	TokenNameIdentifier
(	TokenNameLPAREN
states	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GossipDigestSyn	TokenNameIdentifier
syn	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GossipDigestSyn	TokenNameIdentifier
(	TokenNameLPAREN
"Not a real cluster name"	TokenNameStringLiteral
,	TokenNameCOMMA
StorageService	TokenNameIdentifier
.	TokenNameDOT
getPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getCanonicalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Statics	TokenNameIdentifier
.	TokenNameDOT
Digests	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
"gms.Gossip.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
GossipDigest	TokenNameIdentifier
gd	TokenNameIdentifier
:	TokenNameCOLON
Statics	TokenNameIdentifier
.	TokenNameDOT
Digests	TokenNameIdentifier
)	TokenNameRPAREN
GossipDigest	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
gd	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GossipDigestAck	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
ack	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GossipDigestAck2	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
ack2	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GossipDigestSyn	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
syn	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
GossipDigest	TokenNameIdentifier
gd	TokenNameIdentifier
:	TokenNameCOLON
Statics	TokenNameIdentifier
.	TokenNameDOT
Digests	TokenNameIdentifier
)	TokenNameRPAREN
testSerializedSize	TokenNameIdentifier
(	TokenNameLPAREN
gd	TokenNameIdentifier
,	TokenNameCOMMA
GossipDigest	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testSerializedSize	TokenNameIdentifier
(	TokenNameLPAREN
ack	TokenNameIdentifier
,	TokenNameCOMMA
GossipDigestAck	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testSerializedSize	TokenNameIdentifier
(	TokenNameLPAREN
ack2	TokenNameIdentifier
,	TokenNameCOMMA
GossipDigestAck2	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testSerializedSize	TokenNameIdentifier
(	TokenNameLPAREN
syn	TokenNameIdentifier
,	TokenNameCOMMA
GossipDigestSyn	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testGossipDigestRead	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
EXECUTE_WRITES	TokenNameIdentifier
)	TokenNameRPAREN
testGossipDigestWrite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
DataInputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
getInput	TokenNameIdentifier
(	TokenNameLPAREN
"gms.Gossip.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
count	TokenNameIdentifier
<	TokenNameLESS
Statics	TokenNameIdentifier
.	TokenNameDOT
Digests	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
assert	TokenNameassert
GossipDigestAck2	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
GossipDigestAck	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
GossipDigestAck2	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
GossipDigestSyn	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
Statics	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
HeartBeatState	TokenNameIdentifier
HeartbeatSt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HeartBeatState	TokenNameIdentifier
(	TokenNameLPAREN
101	TokenNameIntegerLiteral
,	TokenNameCOMMA
201	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
EndpointState	TokenNameIdentifier
EndpointSt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
EndpointState	TokenNameIdentifier
(	TokenNameLPAREN
HeartbeatSt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
VersionedValue	TokenNameIdentifier
.	TokenNameDOT
VersionedValueFactory	TokenNameIdentifier
vvFact	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
VersionedValue	TokenNameIdentifier
.	TokenNameDOT
VersionedValueFactory	TokenNameIdentifier
(	TokenNameLPAREN
StorageService	TokenNameIdentifier
.	TokenNameDOT
getPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
VersionedValue	TokenNameIdentifier
vv0	TokenNameIdentifier
=	TokenNameEQUAL
vvFact	TokenNameIdentifier
.	TokenNameDOT
load	TokenNameIdentifier
(	TokenNameLPAREN
23d	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
VersionedValue	TokenNameIdentifier
vv1	TokenNameIdentifier
=	TokenNameEQUAL
vvFact	TokenNameIdentifier
.	TokenNameDOT
bootstrapping	TokenNameIdentifier
(	TokenNameLPAREN
Collections	TokenNameIdentifier
.	TokenNameDOT
<	TokenNameLESS
Token	TokenNameIdentifier
>	TokenNameGREATER
singleton	TokenNameIdentifier
(	TokenNameLPAREN
StorageService	TokenNameIdentifier
.	TokenNameDOT
getPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getRandomToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
List	TokenNameIdentifier
<	TokenNameLESS
GossipDigest	TokenNameIdentifier
>	TokenNameGREATER
Digests	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
GossipDigest	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
{	TokenNameLBRACE
HeartbeatSt	TokenNameIdentifier
.	TokenNameDOT
updateHeartBeat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
EndpointSt	TokenNameIdentifier
.	TokenNameDOT
addApplicationState	TokenNameIdentifier
(	TokenNameLPAREN
ApplicationState	TokenNameIdentifier
.	TokenNameDOT
LOAD	TokenNameIdentifier
,	TokenNameCOMMA
vv0	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
EndpointSt	TokenNameIdentifier
.	TokenNameDOT
addApplicationState	TokenNameIdentifier
(	TokenNameLPAREN
ApplicationState	TokenNameIdentifier
.	TokenNameDOT
STATUS	TokenNameIdentifier
,	TokenNameCOMMA
vv1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
Digests	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
GossipDigest	TokenNameIdentifier
(	TokenNameLPAREN
FBUtilities	TokenNameIdentifier
.	TokenNameDOT
getBroadcastAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
100	TokenNameIntegerLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
