package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
transport	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
CliMain	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
CliSessionState	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
transport	TokenNameIdentifier
.	TokenNameDOT
TSSLTransportFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
transport	TokenNameIdentifier
.	TokenNameDOT
TSSLTransportFactory	TokenNameIdentifier
.	TokenNameDOT
TSSLTransportParameters	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
transport	TokenNameIdentifier
.	TokenNameDOT
TTransport	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
transport	TokenNameIdentifier
.	TokenNameDOT
TTransportException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
transport	TokenNameIdentifier
.	TokenNameDOT
TTransportFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SSLTransportFactory	TokenNameIdentifier
extends	TokenNameextends
TTransportFactory	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
SOCKET_TIMEOUT	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
TTransport	TokenNameIdentifier
getTransport	TokenNameIdentifier
(	TokenNameLPAREN
TTransport	TokenNameIdentifier
trans	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
CliSessionState	TokenNameIdentifier
sessionState	TokenNameIdentifier
=	TokenNameEQUAL
CliMain	TokenNameIdentifier
.	TokenNameDOT
sessionState	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
TSSLTransportParameters	TokenNameIdentifier
params	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TSSLTransportParameters	TokenNameIdentifier
(	TokenNameLPAREN
sessionState	TokenNameIdentifier
.	TokenNameDOT
encOptions	TokenNameIdentifier
.	TokenNameDOT
protocol	TokenNameIdentifier
,	TokenNameCOMMA
sessionState	TokenNameIdentifier
.	TokenNameDOT
encOptions	TokenNameIdentifier
.	TokenNameDOT
cipher_suites	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
params	TokenNameIdentifier
.	TokenNameDOT
setTrustStore	TokenNameIdentifier
(	TokenNameLPAREN
sessionState	TokenNameIdentifier
.	TokenNameDOT
encOptions	TokenNameIdentifier
.	TokenNameDOT
truststore	TokenNameIdentifier
,	TokenNameCOMMA
sessionState	TokenNameIdentifier
.	TokenNameDOT
encOptions	TokenNameIdentifier
.	TokenNameDOT
truststore_password	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
trans	TokenNameIdentifier
=	TokenNameEQUAL
TSSLTransportFactory	TokenNameIdentifier
.	TokenNameDOT
getClientSocket	TokenNameIdentifier
(	TokenNameLPAREN
sessionState	TokenNameIdentifier
.	TokenNameDOT
hostName	TokenNameIdentifier
,	TokenNameCOMMA
sessionState	TokenNameIdentifier
.	TokenNameDOT
thriftPort	TokenNameIdentifier
,	TokenNameCOMMA
SOCKET_TIMEOUT	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FramedTransportFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getTransport	TokenNameIdentifier
(	TokenNameLPAREN
trans	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
TTransportException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"Failed to create a client SSL connection."	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
