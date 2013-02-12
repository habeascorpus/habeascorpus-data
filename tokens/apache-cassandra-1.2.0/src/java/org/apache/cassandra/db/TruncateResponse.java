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
DataInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataOutput	TokenNameIdentifier
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
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IVersionedSerializer	TokenNameIdentifier
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
TruncateResponse	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
TruncateResponseSerializer	TokenNameIdentifier
serializer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TruncateResponseSerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
keyspace	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
columnFamily	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
boolean	TokenNameboolean
success	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
TruncateResponse	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
keyspace	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
columnFamily	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
success	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
keyspace	TokenNameIdentifier
=	TokenNameEQUAL
keyspace	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
columnFamily	TokenNameIdentifier
=	TokenNameEQUAL
columnFamily	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
success	TokenNameIdentifier
=	TokenNameEQUAL
success	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MessageOut	TokenNameIdentifier
<	TokenNameLESS
TruncateResponse	TokenNameIdentifier
>	TokenNameGREATER
createMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
MessageOut	TokenNameIdentifier
<	TokenNameLESS
TruncateResponse	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
Verb	TokenNameIdentifier
.	TokenNameDOT
REQUEST_RESPONSE	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
,	TokenNameCOMMA
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
TruncateResponseSerializer	TokenNameIdentifier
implements	TokenNameimplements
IVersionedSerializer	TokenNameIdentifier
<	TokenNameLESS
TruncateResponse	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
serialize	TokenNameIdentifier
(	TokenNameLPAREN
TruncateResponse	TokenNameIdentifier
tr	TokenNameIdentifier
,	TokenNameCOMMA
DataOutput	TokenNameIdentifier
dos	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
dos	TokenNameIdentifier
.	TokenNameDOT
writeUTF	TokenNameIdentifier
(	TokenNameLPAREN
tr	TokenNameIdentifier
.	TokenNameDOT
keyspace	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dos	TokenNameIdentifier
.	TokenNameDOT
writeUTF	TokenNameIdentifier
(	TokenNameLPAREN
tr	TokenNameIdentifier
.	TokenNameDOT
columnFamily	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dos	TokenNameIdentifier
.	TokenNameDOT
writeBoolean	TokenNameIdentifier
(	TokenNameLPAREN
tr	TokenNameIdentifier
.	TokenNameDOT
success	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TruncateResponse	TokenNameIdentifier
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
dis	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
keyspace	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readUTF	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
columnFamily	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readUTF	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
success	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readBoolean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
TruncateResponse	TokenNameIdentifier
(	TokenNameLPAREN
keyspace	TokenNameIdentifier
,	TokenNameCOMMA
columnFamily	TokenNameIdentifier
,	TokenNameCOMMA
success	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
TruncateResponse	TokenNameIdentifier
tr	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
tr	TokenNameIdentifier
.	TokenNameDOT
keyspace	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
tr	TokenNameIdentifier
.	TokenNameDOT
columnFamily	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
tr	TokenNameIdentifier
.	TokenNameDOT
success	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
