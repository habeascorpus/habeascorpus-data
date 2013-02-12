package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
transport	TokenNameIdentifier
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
InetSocketAddress	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
UnknownHostException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
charset	TokenNameIdentifier
.	TokenNameDOT
CharacterCodingException	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
jboss	TokenNameIdentifier
.	TokenNameDOT
netty	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
.	TokenNameDOT
ChannelBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
jboss	TokenNameIdentifier
.	TokenNameDOT
netty	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
.	TokenNameDOT
ChannelBuffers	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
jboss	TokenNameIdentifier
.	TokenNameDOT
netty	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
CharsetUtil	TokenNameIdentifier
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
ConsistencyLevel	TokenNameIdentifier
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
UUIDGen	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
CBUtil	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
CBUtil	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
readString	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
cb	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
readString	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IndexOutOfBoundsException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
"Not enough bytes to read an UTF8 serialized string preceded by it's 2 bytes length"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
readLongString	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
cb	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
readString	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IndexOutOfBoundsException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
"Not enough bytes to read an UTF8 serialized string preceded by it's 4 bytes length"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
readString	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
String	TokenNameIdentifier
str	TokenNameIdentifier
=	TokenNameEQUAL
cb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
.	TokenNameDOT
readerIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
length	TokenNameIdentifier
,	TokenNameCOMMA
CharsetUtil	TokenNameIdentifier
.	TokenNameDOT
UTF_8	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cb	TokenNameIdentifier
.	TokenNameDOT
readerIndex	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
.	TokenNameDOT
readerIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
str	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalStateException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getCause	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
CharacterCodingException	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot decode string as UTF8"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
throw	TokenNamethrow
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
ChannelBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
wrappedBuffer	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
CharsetUtil	TokenNameIdentifier
.	TokenNameDOT
UTF_8	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ChannelBuffer	TokenNameIdentifier
shortToCB	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
=	TokenNameEQUAL
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cb	TokenNameIdentifier
.	TokenNameDOT
writeShort	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
cb	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ChannelBuffer	TokenNameIdentifier
intToCB	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
=	TokenNameEQUAL
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cb	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
cb	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ChannelBuffer	TokenNameIdentifier
stringToCB	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ChannelBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
=	TokenNameEQUAL
bytes	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
wrappedBuffer	TokenNameIdentifier
(	TokenNameLPAREN
shortToCB	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
.	TokenNameDOT
readableBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ChannelBuffer	TokenNameIdentifier
bytesToCB	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bytes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
wrappedBuffer	TokenNameIdentifier
(	TokenNameLPAREN
shortToCB	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
wrappedBuffer	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
cb	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bytes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
length	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cb	TokenNameIdentifier
.	TokenNameDOT
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
bytes	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IndexOutOfBoundsException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
"Not enough bytes to read a byte array preceded by it's 2 bytes length"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ChannelBuffer	TokenNameIdentifier
consistencyLevelToCB	TokenNameIdentifier
(	TokenNameLPAREN
ConsistencyLevel	TokenNameIdentifier
consistency	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
shortToCB	TokenNameIdentifier
(	TokenNameLPAREN
consistency	TokenNameIdentifier
.	TokenNameDOT
code	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ConsistencyLevel	TokenNameIdentifier
readConsistencyLevel	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ConsistencyLevel	TokenNameIdentifier
.	TokenNameDOT
fromCode	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
<	TokenNameLESS
T	TokenNameIdentifier
extends	TokenNameextends
Enum	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
T	TokenNameIdentifier
readEnumValue	TokenNameIdentifier
(	TokenNameLPAREN
Class	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
enumType	TokenNameIdentifier
,	TokenNameCOMMA
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
CBUtil	TokenNameIdentifier
.	TokenNameDOT
readString	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
Enum	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
enumType	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
.	TokenNameDOT
toUpperCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid value '%s' for %s"	TokenNameStringLiteral
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
enumType	TokenNameIdentifier
.	TokenNameDOT
getSimpleName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
<	TokenNameLESS
T	TokenNameIdentifier
extends	TokenNameextends
Enum	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
ChannelBuffer	TokenNameIdentifier
enumValueToCB	TokenNameIdentifier
(	TokenNameLPAREN
T	TokenNameIdentifier
enumValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
stringToCB	TokenNameIdentifier
(	TokenNameLPAREN
enumValue	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ChannelBuffer	TokenNameIdentifier
uuidToCB	TokenNameIdentifier
(	TokenNameLPAREN
UUID	TokenNameIdentifier
uuid	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
wrappedBuffer	TokenNameIdentifier
(	TokenNameLPAREN
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
uuid	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
UUID	TokenNameIdentifier
readUuid	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bytes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
16	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cb	TokenNameIdentifier
.	TokenNameDOT
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getUUID	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ChannelBuffer	TokenNameIdentifier
longStringToCB	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ChannelBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
=	TokenNameEQUAL
bytes	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
wrappedBuffer	TokenNameIdentifier
(	TokenNameLPAREN
intToCB	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
.	TokenNameDOT
readableBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
readStringList	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
cb	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
l	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
length	TokenNameIdentifier
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
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
l	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
readString	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
l	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
writeStringList	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
l	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cb	TokenNameIdentifier
.	TokenNameDOT
writeShort	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
:	TokenNameCOLON
l	TokenNameIdentifier
)	TokenNameRPAREN
cb	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
stringToCB	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
readStringMap	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
cb	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
m	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
length	TokenNameIdentifier
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
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
k	TokenNameIdentifier
=	TokenNameEQUAL
readString	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
toUpperCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
readString	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
k	TokenNameIdentifier
,	TokenNameCOMMA
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
m	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
writeStringMap	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
m	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cb	TokenNameIdentifier
.	TokenNameDOT
writeShort	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
entry	TokenNameIdentifier
:	TokenNameCOLON
m	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cb	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
stringToCB	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cb	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
stringToCB	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
readStringToStringListMap	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
cb	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
m	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
length	TokenNameIdentifier
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
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
k	TokenNameIdentifier
=	TokenNameEQUAL
readString	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
toUpperCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
v	TokenNameIdentifier
=	TokenNameEQUAL
readStringList	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
k	TokenNameIdentifier
,	TokenNameCOMMA
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
m	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
writeStringToStringListMap	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
m	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cb	TokenNameIdentifier
.	TokenNameDOT
writeShort	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
entry	TokenNameIdentifier
:	TokenNameCOLON
m	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cb	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
stringToCB	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writeStringList	TokenNameIdentifier
(	TokenNameLPAREN
cb	TokenNameIdentifier
,	TokenNameCOMMA
entry	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ByteBuffer	TokenNameIdentifier
readValue	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
cb	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
length	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
cb	TokenNameIdentifier
.	TokenNameDOT
readSlice	TokenNameIdentifier
(	TokenNameLPAREN
length	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
toByteBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
InetSocketAddress	TokenNameIdentifier
readInet	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
addrSize	TokenNameIdentifier
=	TokenNameEQUAL
cb	TokenNameIdentifier
.	TokenNameDOT
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
address	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
addrSize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
cb	TokenNameIdentifier
.	TokenNameDOT
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
address	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
port	TokenNameIdentifier
=	TokenNameEQUAL
cb	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
InetSocketAddress	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
.	TokenNameDOT
getByAddress	TokenNameIdentifier
(	TokenNameLPAREN
address	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
port	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
UnknownHostException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid IP address (%d.%d.%d.%d) while deserializing inet address"	TokenNameStringLiteral
,	TokenNameCOMMA
address	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
address	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
address	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
address	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ChannelBuffer	TokenNameIdentifier
inetToCB	TokenNameIdentifier
(	TokenNameLPAREN
InetSocketAddress	TokenNameIdentifier
inet	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
address	TokenNameIdentifier
=	TokenNameEQUAL
inet	TokenNameIdentifier
.	TokenNameDOT
getAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getAddress	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
=	TokenNameEQUAL
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
+	TokenNamePLUS
address	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
+	TokenNamePLUS
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cb	TokenNameIdentifier
.	TokenNameDOT
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
address	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cb	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
address	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cb	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
inet	TokenNameIdentifier
.	TokenNameDOT
getPort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
cb	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
BufferBuilder	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
size	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ChannelBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffers	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
i	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
BufferBuilder	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
simpleBuffers	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
stringBuffers	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
valueBuffers	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
size	TokenNameIdentifier
=	TokenNameEQUAL
simpleBuffers	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
stringBuffers	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
valueBuffers	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
buffers	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ChannelBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
BufferBuilder	TokenNameIdentifier
add	TokenNameIdentifier
(	TokenNameLPAREN
ChannelBuffer	TokenNameIdentifier
cb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
buffers	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
cb	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
BufferBuilder	TokenNameIdentifier
addString	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ChannelBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
=	TokenNameEQUAL
bytes	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
add	TokenNameIdentifier
(	TokenNameLPAREN
shortToCB	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
.	TokenNameDOT
readableBytes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
add	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
BufferBuilder	TokenNameIdentifier
addValue	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
bb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
add	TokenNameIdentifier
(	TokenNameLPAREN
intToCB	TokenNameIdentifier
(	TokenNameLPAREN
bb	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
bb	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
add	TokenNameIdentifier
(	TokenNameLPAREN
bb	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
EMPTY_BUFFER	TokenNameIdentifier
:	TokenNameCOLON
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
wrappedBuffer	TokenNameIdentifier
(	TokenNameLPAREN
bb	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ChannelBuffer	TokenNameIdentifier
build	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
wrappedBuffer	TokenNameIdentifier
(	TokenNameLPAREN
buffers	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
