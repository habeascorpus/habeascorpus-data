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
util	TokenNameIdentifier
.	TokenNameDOT
EnumSet	TokenNameIdentifier
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
channel	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
jboss	TokenNameIdentifier
.	TokenNameDOT
netty	TokenNameIdentifier
.	TokenNameDOT
handler	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
.	TokenNameDOT
oneone	TokenNameIdentifier
.	TokenNameDOT
OneToOneDecoder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
jboss	TokenNameIdentifier
.	TokenNameDOT
netty	TokenNameIdentifier
.	TokenNameDOT
handler	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
.	TokenNameDOT
oneone	TokenNameIdentifier
.	TokenNameDOT
OneToOneEncoder	TokenNameIdentifier
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
transport	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
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
QueryState	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
Message	TokenNameIdentifier
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
Message	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
Codec	TokenNameIdentifier
<	TokenNameLESS
M	TokenNameIdentifier
extends	TokenNameextends
Message	TokenNameIdentifier
>	TokenNameGREATER
extends	TokenNameextends
CBCodec	TokenNameIdentifier
<	TokenNameLESS
M	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
enum	TokenNameenum
Direction	TokenNameIdentifier
{	TokenNameLBRACE
REQUEST	TokenNameIdentifier
,	TokenNameCOMMA
RESPONSE	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
Direction	TokenNameIdentifier
extractFromVersion	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
versionWithDirection	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
versionWithDirection	TokenNameIdentifier
&	TokenNameAND
0x80	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
REQUEST	TokenNameIdentifier
:	TokenNameCOLON
RESPONSE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
addToVersion	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
rawVersion	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
==	TokenNameEQUAL_EQUAL
REQUEST	TokenNameIdentifier
?	TokenNameQUESTION
(	TokenNameLPAREN
rawVersion	TokenNameIdentifier
&	TokenNameAND
0x7F	TokenNameIntegerLiteral
)	TokenNameRPAREN
:	TokenNameCOLON
(	TokenNameLPAREN
rawVersion	TokenNameIdentifier
|	TokenNameOR
0x80	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
enum	TokenNameenum
Type	TokenNameIdentifier
{	TokenNameLBRACE
ERROR	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
RESPONSE	TokenNameIdentifier
,	TokenNameCOMMA
ErrorMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
STARTUP	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
REQUEST	TokenNameIdentifier
,	TokenNameCOMMA
StartupMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
READY	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
RESPONSE	TokenNameIdentifier
,	TokenNameCOMMA
ReadyMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
AUTHENTICATE	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
RESPONSE	TokenNameIdentifier
,	TokenNameCOMMA
AuthenticateMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
CREDENTIALS	TokenNameIdentifier
(	TokenNameLPAREN
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
REQUEST	TokenNameIdentifier
,	TokenNameCOMMA
CredentialsMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
OPTIONS	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
REQUEST	TokenNameIdentifier
,	TokenNameCOMMA
OptionsMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
SUPPORTED	TokenNameIdentifier
(	TokenNameLPAREN
6	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
RESPONSE	TokenNameIdentifier
,	TokenNameCOMMA
SupportedMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
QUERY	TokenNameIdentifier
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
REQUEST	TokenNameIdentifier
,	TokenNameCOMMA
QueryMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
RESULT	TokenNameIdentifier
(	TokenNameLPAREN
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
RESPONSE	TokenNameIdentifier
,	TokenNameCOMMA
ResultMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
PREPARE	TokenNameIdentifier
(	TokenNameLPAREN
9	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
REQUEST	TokenNameIdentifier
,	TokenNameCOMMA
PrepareMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
EXECUTE	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
REQUEST	TokenNameIdentifier
,	TokenNameCOMMA
ExecuteMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
REGISTER	TokenNameIdentifier
(	TokenNameLPAREN
11	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
REQUEST	TokenNameIdentifier
,	TokenNameCOMMA
RegisterMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
EVENT	TokenNameIdentifier
(	TokenNameLPAREN
12	TokenNameIntegerLiteral
,	TokenNameCOMMA
Direction	TokenNameIdentifier
.	TokenNameDOT
RESPONSE	TokenNameIdentifier
,	TokenNameCOMMA
EventMessage	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
opcode	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Direction	TokenNameIdentifier
direction	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Codec	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
codec	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Type	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
opcodeIdx	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
int	TokenNameint
maxOpcode	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Type	TokenNameIdentifier
type	TokenNameIdentifier
:	TokenNameCOLON
Type	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
maxOpcode	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
maxOpcode	TokenNameIdentifier
,	TokenNameCOMMA
type	TokenNameIdentifier
.	TokenNameDOT
opcode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
opcodeIdx	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Type	TokenNameIdentifier
[	TokenNameLBRACKET
maxOpcode	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Type	TokenNameIdentifier
type	TokenNameIdentifier
:	TokenNameCOLON
Type	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
opcodeIdx	TokenNameIdentifier
[	TokenNameLBRACKET
type	TokenNameIdentifier
.	TokenNameDOT
opcode	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"Duplicate opcode"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
opcodeIdx	TokenNameIdentifier
[	TokenNameLBRACKET
type	TokenNameIdentifier
.	TokenNameDOT
opcode	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
Type	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
opcode	TokenNameIdentifier
,	TokenNameCOMMA
Direction	TokenNameIdentifier
direction	TokenNameIdentifier
,	TokenNameCOMMA
Codec	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
codec	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
opcode	TokenNameIdentifier
=	TokenNameEQUAL
opcode	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
direction	TokenNameIdentifier
=	TokenNameEQUAL
direction	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
codec	TokenNameIdentifier
=	TokenNameEQUAL
codec	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Type	TokenNameIdentifier
fromOpcode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
opcode	TokenNameIdentifier
,	TokenNameCOMMA
Direction	TokenNameIdentifier
direction	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Type	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
opcodeIdx	TokenNameIdentifier
[	TokenNameLBRACKET
opcode	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
t	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Unknown opcode %d"	TokenNameStringLiteral
,	TokenNameCOMMA
opcode	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
t	TokenNameIdentifier
.	TokenNameDOT
direction	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
direction	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Wrong protocol direction (expected %s, got %s) for opcode %d (%s)"	TokenNameStringLiteral
,	TokenNameCOMMA
t	TokenNameIdentifier
.	TokenNameDOT
direction	TokenNameIdentifier
,	TokenNameCOMMA
direction	TokenNameIdentifier
,	TokenNameCOMMA
opcode	TokenNameIdentifier
,	TokenNameCOMMA
t	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
t	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
Type	TokenNameIdentifier
type	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
volatile	TokenNamevolatile
Connection	TokenNameIdentifier
connection	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
int	TokenNameint
streamId	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Message	TokenNameIdentifier
(	TokenNameLPAREN
Type	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
type	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
attach	TokenNameIdentifier
(	TokenNameLPAREN
Connection	TokenNameIdentifier
connection	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
connection	TokenNameIdentifier
=	TokenNameEQUAL
connection	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Connection	TokenNameIdentifier
connection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
connection	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Message	TokenNameIdentifier
setStreamId	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
streamId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
streamId	TokenNameIdentifier
=	TokenNameEQUAL
streamId	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getStreamId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
streamId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
ChannelBuffer	TokenNameIdentifier
encode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
abstract	TokenNameabstract
class	TokenNameclass
Request	TokenNameIdentifier
extends	TokenNameextends
Message	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
tracingRequested	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Request	TokenNameIdentifier
(	TokenNameLPAREN
Type	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
.	TokenNameDOT
direction	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
Direction	TokenNameIdentifier
.	TokenNameDOT
REQUEST	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
Response	TokenNameIdentifier
execute	TokenNameIdentifier
(	TokenNameLPAREN
QueryState	TokenNameIdentifier
queryState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setTracingRequested	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
tracingRequested	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isTracingRequested	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
tracingRequested	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
abstract	TokenNameabstract
class	TokenNameclass
Response	TokenNameIdentifier
extends	TokenNameextends
Message	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
UUID	TokenNameIdentifier
tracingId	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Response	TokenNameIdentifier
(	TokenNameLPAREN
Type	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
.	TokenNameDOT
direction	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
Direction	TokenNameIdentifier
.	TokenNameDOT
RESPONSE	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Message	TokenNameIdentifier
setTracingId	TokenNameIdentifier
(	TokenNameLPAREN
UUID	TokenNameIdentifier
tracingId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
tracingId	TokenNameIdentifier
=	TokenNameEQUAL
tracingId	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
UUID	TokenNameIdentifier
getTracingId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
tracingId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
ProtocolDecoder	TokenNameIdentifier
extends	TokenNameextends
OneToOneDecoder	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
decode	TokenNameIdentifier
(	TokenNameLPAREN
ChannelHandlerContext	TokenNameIdentifier
ctx	TokenNameIdentifier
,	TokenNameCOMMA
Channel	TokenNameIdentifier
channel	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
msg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
msg	TokenNameIdentifier
instanceof	TokenNameinstanceof
Frame	TokenNameIdentifier
:	TokenNameCOLON
"Expecting frame, got "	TokenNameStringLiteral
+	TokenNamePLUS
msg	TokenNameIdentifier
;	TokenNameSEMICOLON
Frame	TokenNameIdentifier
frame	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Frame	TokenNameIdentifier
)	TokenNameRPAREN
msg	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isRequest	TokenNameIdentifier
=	TokenNameEQUAL
frame	TokenNameIdentifier
.	TokenNameDOT
header	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
.	TokenNameDOT
direction	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Direction	TokenNameIdentifier
.	TokenNameDOT
REQUEST	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isTracing	TokenNameIdentifier
=	TokenNameEQUAL
frame	TokenNameIdentifier
.	TokenNameDOT
header	TokenNameIdentifier
.	TokenNameDOT
flags	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
Frame	TokenNameIdentifier
.	TokenNameDOT
Header	TokenNameIdentifier
.	TokenNameDOT
Flag	TokenNameIdentifier
.	TokenNameDOT
TRACING	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUID	TokenNameIdentifier
tracingId	TokenNameIdentifier
=	TokenNameEQUAL
isRequest	TokenNameIdentifier
||	TokenNameOR_OR
!	TokenNameNOT
isTracing	TokenNameIdentifier
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
CBUtil	TokenNameIdentifier
.	TokenNameDOT
readUuid	TokenNameIdentifier
(	TokenNameLPAREN
frame	TokenNameIdentifier
.	TokenNameDOT
body	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Message	TokenNameIdentifier
message	TokenNameIdentifier
=	TokenNameEQUAL
frame	TokenNameIdentifier
.	TokenNameDOT
header	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
.	TokenNameDOT
decode	TokenNameIdentifier
(	TokenNameLPAREN
frame	TokenNameIdentifier
.	TokenNameDOT
body	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
message	TokenNameIdentifier
.	TokenNameDOT
setStreamId	TokenNameIdentifier
(	TokenNameLPAREN
frame	TokenNameIdentifier
.	TokenNameDOT
header	TokenNameIdentifier
.	TokenNameDOT
streamId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isRequest	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
message	TokenNameIdentifier
instanceof	TokenNameinstanceof
Request	TokenNameIdentifier
;	TokenNameSEMICOLON
Request	TokenNameIdentifier
req	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Request	TokenNameIdentifier
)	TokenNameRPAREN
message	TokenNameIdentifier
;	TokenNameSEMICOLON
req	TokenNameIdentifier
.	TokenNameDOT
attach	TokenNameIdentifier
(	TokenNameLPAREN
frame	TokenNameIdentifier
.	TokenNameDOT
connection	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isTracing	TokenNameIdentifier
)	TokenNameRPAREN
req	TokenNameIdentifier
.	TokenNameDOT
setTracingRequested	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assert	TokenNameassert
message	TokenNameIdentifier
instanceof	TokenNameinstanceof
Response	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isTracing	TokenNameIdentifier
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Response	TokenNameIdentifier
)	TokenNameRPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setTracingId	TokenNameIdentifier
(	TokenNameLPAREN
tracingId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
message	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
ProtocolEncoder	TokenNameIdentifier
extends	TokenNameextends
OneToOneEncoder	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
encode	TokenNameIdentifier
(	TokenNameLPAREN
ChannelHandlerContext	TokenNameIdentifier
ctx	TokenNameIdentifier
,	TokenNameCOMMA
Channel	TokenNameIdentifier
channel	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
msg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
msg	TokenNameIdentifier
instanceof	TokenNameinstanceof
Message	TokenNameIdentifier
:	TokenNameCOLON
"Expecting message, got "	TokenNameStringLiteral
+	TokenNamePLUS
msg	TokenNameIdentifier
;	TokenNameSEMICOLON
Message	TokenNameIdentifier
message	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Message	TokenNameIdentifier
)	TokenNameRPAREN
msg	TokenNameIdentifier
;	TokenNameSEMICOLON
ChannelBuffer	TokenNameIdentifier
body	TokenNameIdentifier
=	TokenNameEQUAL
message	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
EnumSet	TokenNameIdentifier
<	TokenNameLESS
Frame	TokenNameIdentifier
.	TokenNameDOT
Header	TokenNameIdentifier
.	TokenNameDOT
Flag	TokenNameIdentifier
>	TokenNameGREATER
flags	TokenNameIdentifier
=	TokenNameEQUAL
EnumSet	TokenNameIdentifier
.	TokenNameDOT
noneOf	TokenNameIdentifier
(	TokenNameLPAREN
Frame	TokenNameIdentifier
.	TokenNameDOT
Header	TokenNameIdentifier
.	TokenNameDOT
Flag	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
message	TokenNameIdentifier
instanceof	TokenNameinstanceof
Response	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
UUID	TokenNameIdentifier
tracingId	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Response	TokenNameIdentifier
)	TokenNameRPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getTracingId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tracingId	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
body	TokenNameIdentifier
=	TokenNameEQUAL
ChannelBuffers	TokenNameIdentifier
.	TokenNameDOT
wrappedBuffer	TokenNameIdentifier
(	TokenNameLPAREN
CBUtil	TokenNameIdentifier
.	TokenNameDOT
uuidToCB	TokenNameIdentifier
(	TokenNameLPAREN
tracingId	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
body	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
flags	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
Frame	TokenNameIdentifier
.	TokenNameDOT
Header	TokenNameIdentifier
.	TokenNameDOT
Flag	TokenNameIdentifier
.	TokenNameDOT
TRACING	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assert	TokenNameassert
message	TokenNameIdentifier
instanceof	TokenNameinstanceof
Request	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Request	TokenNameIdentifier
)	TokenNameRPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
isTracingRequested	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
flags	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
Frame	TokenNameIdentifier
.	TokenNameDOT
Header	TokenNameIdentifier
.	TokenNameDOT
Flag	TokenNameIdentifier
.	TokenNameDOT
TRACING	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
Frame	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
,	TokenNameCOMMA
message	TokenNameIdentifier
.	TokenNameDOT
getStreamId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
flags	TokenNameIdentifier
,	TokenNameCOMMA
body	TokenNameIdentifier
,	TokenNameCOMMA
message	TokenNameIdentifier
.	TokenNameDOT
connection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
Dispatcher	TokenNameIdentifier
extends	TokenNameextends
SimpleChannelUpstreamHandler	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
messageReceived	TokenNameIdentifier
(	TokenNameLPAREN
ChannelHandlerContext	TokenNameIdentifier
ctx	TokenNameIdentifier
,	TokenNameCOMMA
MessageEvent	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
Message	TokenNameIdentifier
:	TokenNameCOLON
"Expecting message, got "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
Response	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid response message received, expecting requests"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Request	TokenNameIdentifier
request	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Request	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
assert	TokenNameassert
request	TokenNameIdentifier
.	TokenNameDOT
connection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
ServerConnection	TokenNameIdentifier
;	TokenNameSEMICOLON
ServerConnection	TokenNameIdentifier
connection	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ServerConnection	TokenNameIdentifier
)	TokenNameRPAREN
request	TokenNameIdentifier
.	TokenNameDOT
connection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
connection	TokenNameIdentifier
.	TokenNameDOT
validateNewMessage	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Received: "	TokenNameStringLiteral
+	TokenNamePLUS
request	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Response	TokenNameIdentifier
response	TokenNameIdentifier
=	TokenNameEQUAL
request	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
connection	TokenNameIdentifier
.	TokenNameDOT
getQueryState	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getStreamId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
response	TokenNameIdentifier
.	TokenNameDOT
setStreamId	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getStreamId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
response	TokenNameIdentifier
.	TokenNameDOT
attach	TokenNameIdentifier
(	TokenNameLPAREN
connection	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
connection	TokenNameIdentifier
.	TokenNameDOT
applyStateTransition	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
,	TokenNameCOMMA
response	TokenNameIdentifier
.	TokenNameDOT
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Responding: "	TokenNameStringLiteral
+	TokenNamePLUS
response	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ctx	TokenNameIdentifier
.	TokenNameDOT
getChannel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
response	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ctx	TokenNameIdentifier
.	TokenNameDOT
getChannel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
ErrorMessage	TokenNameIdentifier
.	TokenNameDOT
fromException	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setStreamId	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getStreamId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
exceptionCaught	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
ChannelHandlerContext	TokenNameIdentifier
ctx	TokenNameIdentifier
,	TokenNameCOMMA
ExceptionEvent	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ctx	TokenNameIdentifier
.	TokenNameDOT
getChannel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isOpen	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ChannelFuture	TokenNameIdentifier
future	TokenNameIdentifier
=	TokenNameEQUAL
ctx	TokenNameIdentifier
.	TokenNameDOT
getChannel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
ErrorMessage	TokenNameIdentifier
.	TokenNameDOT
fromException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getCause	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getCause	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
ProtocolException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
future	TokenNameIdentifier
.	TokenNameDOT
addListener	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ChannelFutureListener	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
operationComplete	TokenNameIdentifier
(	TokenNameLPAREN
ChannelFuture	TokenNameIdentifier
future	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ctx	TokenNameIdentifier
.	TokenNameDOT
getChannel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
