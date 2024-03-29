package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
locator	TokenNameIdentifier
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
FilterInputStream	TokenNameIdentifier
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
HttpURLConnection	TokenNameIdentifier
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
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
google	TokenNameIdentifier
.	TokenNameDOT
common	TokenNameIdentifier
.	TokenNameDOT
base	TokenNameIdentifier
.	TokenNameDOT
Charsets	TokenNameIdentifier
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
gms	TokenNameIdentifier
.	TokenNameDOT
ApplicationState	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
gms	TokenNameIdentifier
.	TokenNameDOT
EndpointState	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
gms	TokenNameIdentifier
.	TokenNameDOT
Gossiper	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
Ec2Snitch	TokenNameIdentifier
extends	TokenNameextends
AbstractNetworkTopologySnitch	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
LoggerFactory	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
Ec2Snitch	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ZONE_NAME_QUERY_URL	TokenNameIdentifier
=	TokenNameEQUAL
"http://169.254.169.254/latest/meta-data/placement/availability-zone"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_DC	TokenNameIdentifier
=	TokenNameEQUAL
"UNKNOWN-DC"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_RACK	TokenNameIdentifier
=	TokenNameEQUAL
"UNKNOWN-RACK"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
ec2zone	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
ec2region	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Ec2Snitch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ConfigurationException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
az	TokenNameIdentifier
=	TokenNameEQUAL
awsApiCall	TokenNameIdentifier
(	TokenNameLPAREN
ZONE_NAME_QUERY_URL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
splits	TokenNameIdentifier
=	TokenNameEQUAL
az	TokenNameIdentifier
.	TokenNameDOT
split	TokenNameIdentifier
(	TokenNameLPAREN
"-"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ec2zone	TokenNameIdentifier
=	TokenNameEQUAL
splits	TokenNameIdentifier
[	TokenNameLBRACKET
splits	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
ec2region	TokenNameIdentifier
=	TokenNameEQUAL
az	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
az	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ec2region	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
ec2region	TokenNameIdentifier
=	TokenNameEQUAL
az	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
az	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"EC2Snitch using region: "	TokenNameStringLiteral
+	TokenNamePLUS
ec2region	TokenNameIdentifier
+	TokenNamePLUS
", zone: "	TokenNameStringLiteral
+	TokenNamePLUS
ec2zone	TokenNameIdentifier
+	TokenNamePLUS
"."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
awsApiCall	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
url	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ConfigurationException	TokenNameIdentifier
{	TokenNameLBRACE
HttpURLConnection	TokenNameIdentifier
conn	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
HttpURLConnection	TokenNameIdentifier
)	TokenNameRPAREN
new	TokenNamenew
URL	TokenNameIdentifier
(	TokenNameLPAREN
url	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
openConnection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
conn	TokenNameIdentifier
.	TokenNameDOT
setRequestMethod	TokenNameIdentifier
(	TokenNameLPAREN
"GET"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
conn	TokenNameIdentifier
.	TokenNameDOT
getResponseCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
200	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ConfigurationException	TokenNameIdentifier
(	TokenNameLPAREN
"Ec2Snitch was unable to execute the API call. Not an ec2 node?"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
cl	TokenNameIdentifier
=	TokenNameEQUAL
conn	TokenNameIdentifier
.	TokenNameDOT
getContentLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
b	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
cl	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
DataInputStream	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataInputStream	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
FilterInputStream	TokenNameIdentifier
)	TokenNameRPAREN
conn	TokenNameIdentifier
.	TokenNameDOT
getContent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
readFully	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
,	TokenNameCOMMA
Charsets	TokenNameIdentifier
.	TokenNameDOT
UTF_8	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
conn	TokenNameIdentifier
.	TokenNameDOT
disconnect	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getRack	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
endpoint	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
endpoint	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
FBUtilities	TokenNameIdentifier
.	TokenNameDOT
getBroadcastAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
ec2zone	TokenNameIdentifier
;	TokenNameSEMICOLON
EndpointState	TokenNameIdentifier
state	TokenNameIdentifier
=	TokenNameEQUAL
Gossiper	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getEndpointStateForEndpoint	TokenNameIdentifier
(	TokenNameLPAREN
endpoint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
state	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
state	TokenNameIdentifier
.	TokenNameDOT
getApplicationState	TokenNameIdentifier
(	TokenNameLPAREN
ApplicationState	TokenNameIdentifier
.	TokenNameDOT
RACK	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
DEFAULT_RACK	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
state	TokenNameIdentifier
.	TokenNameDOT
getApplicationState	TokenNameIdentifier
(	TokenNameLPAREN
ApplicationState	TokenNameIdentifier
.	TokenNameDOT
RACK	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getDatacenter	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
endpoint	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
endpoint	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
FBUtilities	TokenNameIdentifier
.	TokenNameDOT
getBroadcastAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
ec2region	TokenNameIdentifier
;	TokenNameSEMICOLON
EndpointState	TokenNameIdentifier
state	TokenNameIdentifier
=	TokenNameEQUAL
Gossiper	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
getEndpointStateForEndpoint	TokenNameIdentifier
(	TokenNameLPAREN
endpoint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
state	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
state	TokenNameIdentifier
.	TokenNameDOT
getApplicationState	TokenNameIdentifier
(	TokenNameLPAREN
ApplicationState	TokenNameIdentifier
.	TokenNameDOT
DC	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
DEFAULT_DC	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
state	TokenNameIdentifier
.	TokenNameDOT
getApplicationState	TokenNameIdentifier
(	TokenNameLPAREN
ApplicationState	TokenNameIdentifier
.	TokenNameDOT
DC	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
