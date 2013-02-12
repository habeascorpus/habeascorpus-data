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
concurrent	TokenNameIdentifier
.	TokenNameDOT
ConcurrentMap	TokenNameIdentifier
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
ClientState	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
cliffc	TokenNameIdentifier
.	TokenNameDOT
high_scale_lib	TokenNameIdentifier
.	TokenNameDOT
NonBlockingHashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ServerConnection	TokenNameIdentifier
extends	TokenNameextends
Connection	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Factory	TokenNameIdentifier
FACTORY	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Factory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Connection	TokenNameIdentifier
newConnection	TokenNameIdentifier
(	TokenNameLPAREN
Connection	TokenNameIdentifier
.	TokenNameDOT
Tracker	TokenNameIdentifier
tracker	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ServerConnection	TokenNameIdentifier
(	TokenNameLPAREN
tracker	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
enum	TokenNameenum
State	TokenNameIdentifier
{	TokenNameLBRACE
UNINITIALIZED	TokenNameIdentifier
,	TokenNameCOMMA
AUTHENTICATION	TokenNameIdentifier
,	TokenNameCOMMA
READY	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
ClientState	TokenNameIdentifier
clientState	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
State	TokenNameIdentifier
state	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ConcurrentMap	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
,	TokenNameCOMMA
QueryState	TokenNameIdentifier
>	TokenNameGREATER
queryStates	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NonBlockingHashMap	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
,	TokenNameCOMMA
QueryState	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ServerConnection	TokenNameIdentifier
(	TokenNameLPAREN
Connection	TokenNameIdentifier
.	TokenNameDOT
Tracker	TokenNameIdentifier
tracker	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
tracker	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
clientState	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ClientState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
state	TokenNameIdentifier
=	TokenNameEQUAL
State	TokenNameIdentifier
.	TokenNameDOT
UNINITIALIZED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
QueryState	TokenNameIdentifier
getQueryState	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
streamId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
QueryState	TokenNameIdentifier
qState	TokenNameIdentifier
=	TokenNameEQUAL
queryStates	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
streamId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
qState	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
QueryState	TokenNameIdentifier
newState	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QueryState	TokenNameIdentifier
(	TokenNameLPAREN
clientState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
qState	TokenNameIdentifier
=	TokenNameEQUAL
queryStates	TokenNameIdentifier
.	TokenNameDOT
putIfAbsent	TokenNameIdentifier
(	TokenNameLPAREN
streamId	TokenNameIdentifier
,	TokenNameCOMMA
newState	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
qState	TokenNameIdentifier
=	TokenNameEQUAL
newState	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
qState	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
validateNewMessage	TokenNameIdentifier
(	TokenNameLPAREN
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
state	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
UNINITIALIZED	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
STARTUP	TokenNameIdentifier
&&	TokenNameAND_AND
type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
OPTIONS	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Unexpected message %s, expecting STARTUP or OPTIONS"	TokenNameStringLiteral
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
AUTHENTICATION	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
CREDENTIALS	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Unexpected message %s, needs authentication through CREDENTIALS message"	TokenNameStringLiteral
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
READY	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
STARTUP	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ProtocolException	TokenNameIdentifier
(	TokenNameLPAREN
"Unexpected message STARTUP, the connection is already initialized"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
AssertionError	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
applyStateTransition	TokenNameIdentifier
(	TokenNameLPAREN
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
requestType	TokenNameIdentifier
,	TokenNameCOMMA
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
responseType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
state	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
UNINITIALIZED	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
requestType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
STARTUP	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
responseType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
AUTHENTICATE	TokenNameIdentifier
)	TokenNameRPAREN
state	TokenNameIdentifier
=	TokenNameEQUAL
State	TokenNameIdentifier
.	TokenNameDOT
AUTHENTICATION	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
responseType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
READY	TokenNameIdentifier
)	TokenNameRPAREN
state	TokenNameIdentifier
=	TokenNameEQUAL
State	TokenNameIdentifier
.	TokenNameDOT
READY	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
AUTHENTICATION	TokenNameIdentifier
:	TokenNameCOLON
assert	TokenNameassert
requestType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
CREDENTIALS	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
responseType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Message	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
READY	TokenNameIdentifier
)	TokenNameRPAREN
state	TokenNameIdentifier
=	TokenNameEQUAL
State	TokenNameIdentifier
.	TokenNameDOT
READY	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
READY	TokenNameIdentifier
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
AssertionError	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
