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
DataInputStream	TokenNameIdentifier
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
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
StringUtils	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
FastByteArrayInputStream	TokenNameIdentifier
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
RangeSliceReply	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
RangeSliceReplySerializer	TokenNameIdentifier
serializer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RangeSliceReplySerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
rows	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
RangeSliceReply	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
rows	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
rows	TokenNameIdentifier
=	TokenNameEQUAL
rows	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MessageOut	TokenNameIdentifier
<	TokenNameLESS
RangeSliceReply	TokenNameIdentifier
>	TokenNameGREATER
createMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
MessageOut	TokenNameIdentifier
<	TokenNameLESS
RangeSliceReply	TokenNameIdentifier
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
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"RangeSliceReply{"	TokenNameStringLiteral
+	TokenNamePLUS
"rows="	TokenNameStringLiteral
+	TokenNamePLUS
StringUtils	TokenNameIdentifier
.	TokenNameDOT
join	TokenNameIdentifier
(	TokenNameLPAREN
rows	TokenNameIdentifier
,	TokenNameCOMMA
","	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
'}'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
RangeSliceReply	TokenNameIdentifier
read	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
body	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DataInputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FastByteArrayInputStream	TokenNameIdentifier
(	TokenNameLPAREN
body	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
RangeSliceReplySerializer	TokenNameIdentifier
implements	TokenNameimplements
IVersionedSerializer	TokenNameIdentifier
<	TokenNameLESS
RangeSliceReply	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
serialize	TokenNameIdentifier
(	TokenNameLPAREN
RangeSliceReply	TokenNameIdentifier
rsr	TokenNameIdentifier
,	TokenNameCOMMA
DataOutput	TokenNameIdentifier
out	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
rsr	TokenNameIdentifier
.	TokenNameDOT
rows	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Row	TokenNameIdentifier
row	TokenNameIdentifier
:	TokenNameCOLON
rsr	TokenNameIdentifier
.	TokenNameDOT
rows	TokenNameIdentifier
)	TokenNameRPAREN
Row	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
row	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RangeSliceReply	TokenNameIdentifier
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
in	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
rowCount	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
rows	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
rowCount	TokenNameIdentifier
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
rowCount	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
rows	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
Row	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
RangeSliceReply	TokenNameIdentifier
(	TokenNameLPAREN
rows	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
RangeSliceReply	TokenNameIdentifier
rsr	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
rsr	TokenNameIdentifier
.	TokenNameDOT
rows	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Row	TokenNameIdentifier
row	TokenNameIdentifier
:	TokenNameCOLON
rsr	TokenNameIdentifier
.	TokenNameDOT
rows	TokenNameIdentifier
)	TokenNameRPAREN
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
Row	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
row	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
