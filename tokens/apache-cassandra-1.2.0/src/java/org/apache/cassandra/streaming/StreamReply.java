package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
streaming	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
UUID	TokenNameIdentifier
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
TypeSizes	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
UUIDSerializer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
StreamReply	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
enum	TokenNameenum
Status	TokenNameIdentifier
{	TokenNameLBRACE
FILE_FINISHED	TokenNameIdentifier
,	TokenNameCOMMA
FILE_RETRY	TokenNameIdentifier
,	TokenNameCOMMA
SESSION_FINISHED	TokenNameIdentifier
,	TokenNameCOMMA
SESSION_FAILURE	TokenNameIdentifier
,	TokenNameCOMMA
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
IVersionedSerializer	TokenNameIdentifier
<	TokenNameLESS
StreamReply	TokenNameIdentifier
>	TokenNameGREATER
serializer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FileStatusSerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
UUID	TokenNameIdentifier
sessionId	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
file	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Status	TokenNameIdentifier
action	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
StreamReply	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
file	TokenNameIdentifier
,	TokenNameCOMMA
UUID	TokenNameIdentifier
sessionId	TokenNameIdentifier
,	TokenNameCOMMA
Status	TokenNameIdentifier
action	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
file	TokenNameIdentifier
=	TokenNameEQUAL
file	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
action	TokenNameIdentifier
=	TokenNameEQUAL
action	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
sessionId	TokenNameIdentifier
=	TokenNameEQUAL
sessionId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MessageOut	TokenNameIdentifier
<	TokenNameLESS
StreamReply	TokenNameIdentifier
>	TokenNameGREATER
createMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
MessageOut	TokenNameIdentifier
<	TokenNameLESS
StreamReply	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
MessagingService	TokenNameIdentifier
.	TokenNameDOT
Verb	TokenNameIdentifier
.	TokenNameDOT
STREAM_REPLY	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
,	TokenNameCOMMA
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"StreamReply("	TokenNameStringLiteral
+	TokenNamePLUS
"sessionId="	TokenNameStringLiteral
+	TokenNamePLUS
sessionId	TokenNameIdentifier
+	TokenNamePLUS
", file='"	TokenNameStringLiteral
+	TokenNamePLUS
file	TokenNameIdentifier
+	TokenNamePLUS
'\''	TokenNameCharacterLiteral
+	TokenNamePLUS
", action="	TokenNameStringLiteral
+	TokenNamePLUS
action	TokenNameIdentifier
+	TokenNamePLUS
')'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
FileStatusSerializer	TokenNameIdentifier
implements	TokenNameimplements
IVersionedSerializer	TokenNameIdentifier
<	TokenNameLESS
StreamReply	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
serialize	TokenNameIdentifier
(	TokenNameLPAREN
StreamReply	TokenNameIdentifier
reply	TokenNameIdentifier
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
UUIDSerializer	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
reply	TokenNameIdentifier
.	TokenNameDOT
sessionId	TokenNameIdentifier
,	TokenNameCOMMA
dos	TokenNameIdentifier
,	TokenNameCOMMA
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dos	TokenNameIdentifier
.	TokenNameDOT
writeUTF	TokenNameIdentifier
(	TokenNameLPAREN
reply	TokenNameIdentifier
.	TokenNameDOT
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dos	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
reply	TokenNameIdentifier
.	TokenNameDOT
action	TokenNameIdentifier
.	TokenNameDOT
ordinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
StreamReply	TokenNameIdentifier
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
UUID	TokenNameIdentifier
sessionId	TokenNameIdentifier
=	TokenNameEQUAL
UUIDSerializer	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
,	TokenNameCOMMA
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
targetFile	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readUTF	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Status	TokenNameIdentifier
action	TokenNameIdentifier
=	TokenNameEQUAL
Status	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
[	TokenNameLBRACKET
dis	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
StreamReply	TokenNameIdentifier
(	TokenNameLPAREN
targetFile	TokenNameIdentifier
,	TokenNameCOMMA
sessionId	TokenNameIdentifier
,	TokenNameCOMMA
action	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
StreamReply	TokenNameIdentifier
reply	TokenNameIdentifier
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
reply	TokenNameIdentifier
.	TokenNameDOT
sessionId	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
reply	TokenNameIdentifier
.	TokenNameDOT
file	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
reply	TokenNameIdentifier
.	TokenNameDOT
action	TokenNameIdentifier
.	TokenNameDOT
ordinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
