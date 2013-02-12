package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
tracing	TokenNameIdentifier
.	TokenNameDOT
Tracing	TokenNameIdentifier
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
ByteBufferUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ReadVerbHandler	TokenNameIdentifier
implements	TokenNameimplements
IVerbHandler	TokenNameIdentifier
<	TokenNameLESS
ReadCommand	TokenNameIdentifier
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
ReadVerbHandler	TokenNameIdentifier
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
ReadCommand	TokenNameIdentifier
>	TokenNameGREATER
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
id	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
StorageService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
isBootstrapMode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot service reads while bootstrapping!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
ReadCommand	TokenNameIdentifier
command	TokenNameIdentifier
=	TokenNameEQUAL
message	TokenNameIdentifier
.	TokenNameDOT
payload	TokenNameIdentifier
;	TokenNameSEMICOLON
Table	TokenNameIdentifier
table	TokenNameIdentifier
=	TokenNameEQUAL
Table	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
command	TokenNameIdentifier
.	TokenNameDOT
table	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Row	TokenNameIdentifier
row	TokenNameIdentifier
=	TokenNameEQUAL
command	TokenNameIdentifier
.	TokenNameDOT
getRow	TokenNameIdentifier
(	TokenNameLPAREN
table	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MessageOut	TokenNameIdentifier
<	TokenNameLESS
ReadResponse	TokenNameIdentifier
>	TokenNameGREATER
reply	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MessageOut	TokenNameIdentifier
<	TokenNameLESS
ReadResponse	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
Verb	TokenNameIdentifier
.	TokenNameDOT
REQUEST_RESPONSE	TokenNameIdentifier
,	TokenNameCOMMA
getResponse	TokenNameIdentifier
(	TokenNameLPAREN
command	TokenNameIdentifier
,	TokenNameCOMMA
row	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
ReadResponse	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Tracing	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
(	TokenNameLPAREN
"Enqueuing response to {}"	TokenNameStringLiteral
,	TokenNameCOMMA
message	TokenNameIdentifier
.	TokenNameDOT
from	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MessagingService	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
sendReply	TokenNameIdentifier
(	TokenNameLPAREN
reply	TokenNameIdentifier
,	TokenNameCOMMA
id	TokenNameIdentifier
,	TokenNameCOMMA
message	TokenNameIdentifier
.	TokenNameDOT
from	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ReadResponse	TokenNameIdentifier
getResponse	TokenNameIdentifier
(	TokenNameLPAREN
ReadCommand	TokenNameIdentifier
command	TokenNameIdentifier
,	TokenNameCOMMA
Row	TokenNameIdentifier
row	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
command	TokenNameIdentifier
.	TokenNameDOT
isDigestQuery	TokenNameIdentifier
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
"digest is "	TokenNameStringLiteral
+	TokenNamePLUS
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytesToHex	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
digest	TokenNameIdentifier
(	TokenNameLPAREN
row	TokenNameIdentifier
.	TokenNameDOT
cf	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
ReadResponse	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
digest	TokenNameIdentifier
(	TokenNameLPAREN
row	TokenNameIdentifier
.	TokenNameDOT
cf	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ReadResponse	TokenNameIdentifier
(	TokenNameLPAREN
row	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE