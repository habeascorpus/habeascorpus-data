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
slf4j	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
slf4j	TokenNameIdentifier
.	TokenNameDOT
LoggerFactory	TokenNameIdentifier
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
net	TokenNameIdentifier
.	TokenNameDOT
IVerbHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MessageIn	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MessageOut	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MessagingService	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
GossipDigestSynVerbHandler	TokenNameIdentifier
implements	TokenNameimplements
IVerbHandler	TokenNameIdentifier
<	TokenNameLESS
GossipDigestSyn	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
LoggerFactory	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
GossipDigestSynVerbHandler	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
doVerb	TokenNameIdentifier
(	TokenNameLPAREN
MessageIn	TokenNameIdentifier
<	TokenNameLESS
GossipDigestSyn	TokenNameIdentifier
>	TokenNameGREATER
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
id	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
InetAddress	TokenNameIdentifier
from	TokenNameIdentifier
=	TokenNameEQUAL
message	TokenNameIdentifier
.	TokenNameDOT
from	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
isTraceEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Received a GossipDigestSynMessage from {}"	TokenNameStringLiteral
,	TokenNameCOMMA
from	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
Gossiper	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
isEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
isTraceEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Ignoring GossipDigestSynMessage because gossip is disabled"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
GossipDigestSyn	TokenNameIdentifier
gDigestMessage	TokenNameIdentifier
=	TokenNameEQUAL
message	TokenNameIdentifier
.	TokenNameDOT
payload	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
gDigestMessage	TokenNameIdentifier
.	TokenNameDOT
clusterId	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getClusterName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"ClusterName mismatch from "	TokenNameStringLiteral
+	TokenNamePLUS
from	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
gDigestMessage	TokenNameIdentifier
.	TokenNameDOT
clusterId	TokenNameIdentifier
+	TokenNamePLUS
"!="	TokenNameStringLiteral
+	TokenNamePLUS
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getClusterName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
gDigestMessage	TokenNameIdentifier
.	TokenNameDOT
partioner	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
gDigestMessage	TokenNameIdentifier
.	TokenNameDOT
partioner	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getPartitionerName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Partitioner mismatch from "	TokenNameStringLiteral
+	TokenNamePLUS
from	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
gDigestMessage	TokenNameIdentifier
.	TokenNameDOT
partioner	TokenNameIdentifier
+	TokenNamePLUS
"!="	TokenNameStringLiteral
+	TokenNamePLUS
DatabaseDescriptor	TokenNameIdentifier
.	TokenNameDOT
getPartitionerName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
List	TokenNameIdentifier
<	TokenNameLESS
GossipDigest	TokenNameIdentifier
>	TokenNameGREATER
gDigestList	TokenNameIdentifier
=	TokenNameEQUAL
gDigestMessage	TokenNameIdentifier
.	TokenNameDOT
getGossipDigests	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
isTraceEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
GossipDigest	TokenNameIdentifier
gDigest	TokenNameIdentifier
:	TokenNameCOLON
gDigestList	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
gDigest	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Gossip syn digests are : "	TokenNameStringLiteral
+	TokenNamePLUS
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Gossiper	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
notifyFailureDetector	TokenNameIdentifier
(	TokenNameLPAREN
gDigestList	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doSort	TokenNameIdentifier
(	TokenNameLPAREN
gDigestList	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
GossipDigest	TokenNameIdentifier
>	TokenNameGREATER
deltaGossipDigestList	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
GossipDigest	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
EndpointState	TokenNameIdentifier
>	TokenNameGREATER
deltaEpStateMap	TokenNameIdentifier
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
Gossiper	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
examineGossiper	TokenNameIdentifier
(	TokenNameLPAREN
gDigestList	TokenNameIdentifier
,	TokenNameCOMMA
deltaGossipDigestList	TokenNameIdentifier
,	TokenNameCOMMA
deltaEpStateMap	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MessageOut	TokenNameIdentifier
<	TokenNameLESS
GossipDigestAck	TokenNameIdentifier
>	TokenNameGREATER
gDigestAckMessage	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MessageOut	TokenNameIdentifier
<	TokenNameLESS
GossipDigestAck	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
Verb	TokenNameIdentifier
.	TokenNameDOT
GOSSIP_DIGEST_ACK	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
GossipDigestAck	TokenNameIdentifier
(	TokenNameLPAREN
deltaGossipDigestList	TokenNameIdentifier
,	TokenNameCOMMA
deltaEpStateMap	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
GossipDigestAck	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
isTraceEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Sending a GossipDigestAckMessage to {}"	TokenNameStringLiteral
,	TokenNameCOMMA
from	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MessagingService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
sendOneWay	TokenNameIdentifier
(	TokenNameLPAREN
gDigestAckMessage	TokenNameIdentifier
,	TokenNameCOMMA
from	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
doSort	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
GossipDigest	TokenNameIdentifier
>	TokenNameGREATER
gDigestList	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Map	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
GossipDigest	TokenNameIdentifier
>	TokenNameGREATER
epToDigestMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
InetAddress	TokenNameIdentifier
,	TokenNameCOMMA
GossipDigest	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
GossipDigest	TokenNameIdentifier
gDigest	TokenNameIdentifier
:	TokenNameCOLON
gDigestList	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
epToDigestMap	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
gDigest	TokenNameIdentifier
.	TokenNameDOT
getEndpoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
gDigest	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
List	TokenNameIdentifier
<	TokenNameLESS
GossipDigest	TokenNameIdentifier
>	TokenNameGREATER
diffDigests	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
GossipDigest	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
gDigestList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
GossipDigest	TokenNameIdentifier
gDigest	TokenNameIdentifier
:	TokenNameCOLON
gDigestList	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
InetAddress	TokenNameIdentifier
ep	TokenNameIdentifier
=	TokenNameEQUAL
gDigest	TokenNameIdentifier
.	TokenNameDOT
getEndpoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
EndpointState	TokenNameIdentifier
epState	TokenNameIdentifier
=	TokenNameEQUAL
Gossiper	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getEndpointStateForEndpoint	TokenNameIdentifier
(	TokenNameLPAREN
ep	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
version	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
epState	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
Gossiper	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getMaxEndpointStateVersion	TokenNameIdentifier
(	TokenNameLPAREN
epState	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
diffVersion	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
version	TokenNameIdentifier
-	TokenNameMINUS
gDigest	TokenNameIdentifier
.	TokenNameDOT
getMaxVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
diffDigests	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
GossipDigest	TokenNameIdentifier
(	TokenNameLPAREN
ep	TokenNameIdentifier
,	TokenNameCOMMA
gDigest	TokenNameIdentifier
.	TokenNameDOT
getGeneration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
diffVersion	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
gDigestList	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Collections	TokenNameIdentifier
.	TokenNameDOT
sort	TokenNameIdentifier
(	TokenNameLPAREN
diffDigests	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
diffDigests	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
size	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
--	TokenNameMINUS_MINUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
gDigestList	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
epToDigestMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
diffDigests	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getEndpoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE