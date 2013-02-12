package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
DatagramSocket	TokenNameIdentifier
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
DatagramPacket	TokenNameIdentifier
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
net	TokenNameIdentifier
.	TokenNameDOT
SocketException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
OptionConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
AppenderSkeleton	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
.	TokenNameDOT
LoggingEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Category	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Priority	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Layout	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
SingleLineTracerPrintWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
LogLog	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
QuietWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DatagramStringAppender	TokenNameIdentifier
extends	TokenNameextends
AppenderSkeleton	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DATAGRAM_HOST_OPTION	TokenNameIdentifier
=	TokenNameEQUAL
"DatagramHost"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DATAGRAM_PORT_OPTION	TokenNameIdentifier
=	TokenNameEQUAL
"DatagramPort"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DATAGRAM_ENCODING_OPTION	TokenNameIdentifier
=	TokenNameEQUAL
"DatagramEncoding"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_HOST	TokenNameIdentifier
=	TokenNameEQUAL
"localhost"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_PORT	TokenNameIdentifier
=	TokenNameEQUAL
8200	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_ENCODING	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
String	TokenNameIdentifier
host	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_HOST	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
port	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_PORT	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
encoding	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_ENCODING	TokenNameIdentifier
;	TokenNameSEMICOLON
SingleLineTracerPrintWriter	TokenNameIdentifier
stp	TokenNameIdentifier
;	TokenNameSEMICOLON
QuietWriter	TokenNameIdentifier
qw	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DatagramStringAppender	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
setDestination	TokenNameIdentifier
(	TokenNameLPAREN
DEFAULT_HOST	TokenNameIdentifier
,	TokenNameCOMMA
DEFAULT_PORT	TokenNameIdentifier
,	TokenNameCOMMA
DEFAULT_ENCODING	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DatagramStringAppender	TokenNameIdentifier
(	TokenNameLPAREN
Layout	TokenNameIdentifier
layout	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
setLayout	TokenNameIdentifier
(	TokenNameLPAREN
layout	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
setDestination	TokenNameIdentifier
(	TokenNameLPAREN
DEFAULT_HOST	TokenNameIdentifier
,	TokenNameCOMMA
DEFAULT_PORT	TokenNameIdentifier
,	TokenNameCOMMA
DEFAULT_ENCODING	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DatagramStringAppender	TokenNameIdentifier
(	TokenNameLPAREN
Layout	TokenNameIdentifier
layout	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
host	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
port	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
setLayout	TokenNameIdentifier
(	TokenNameLPAREN
layout	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
setDestination	TokenNameIdentifier
(	TokenNameLPAREN
host	TokenNameIdentifier
,	TokenNameCOMMA
port	TokenNameIdentifier
,	TokenNameCOMMA
DEFAULT_ENCODING	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DatagramStringAppender	TokenNameIdentifier
(	TokenNameLPAREN
Layout	TokenNameIdentifier
layout	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
host	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
port	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
encoding	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
setLayout	TokenNameIdentifier
(	TokenNameLPAREN
layout	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
setDestination	TokenNameIdentifier
(	TokenNameLPAREN
host	TokenNameIdentifier
,	TokenNameCOMMA
port	TokenNameIdentifier
,	TokenNameCOMMA
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
closed	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
qw	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
stp	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
append	TokenNameIdentifier
(	TokenNameLPAREN
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isAsSevereAsThreshold	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
.	TokenNameDOT
priority	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
qw	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
errorHandler	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"No host is set for DatagramStringAppender named ""	TokenNameStringLiteral
+	TokenNamePLUS
this	TokenNamethis
.	TokenNameDOT
name	TokenNameIdentifier
+	TokenNamePLUS
""."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
layout	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
qw	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
event	TokenNameIdentifier
.	TokenNameDOT
throwable	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
event	TokenNameIdentifier
.	TokenNameDOT
throwable	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
stp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
event	TokenNameIdentifier
.	TokenNameDOT
throwableInformation	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
qw	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
.	TokenNameDOT
throwableInformation	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
activateOptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
setDestination	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
host	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
port	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getOptionStrings	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
OptionConverter	TokenNameIdentifier
.	TokenNameDOT
concatanateArrays	TokenNameIdentifier
(	TokenNameLPAREN
super	TokenNamesuper
.	TokenNameDOT
getOptionStrings	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
DATAGRAM_HOST_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
DATAGRAM_PORT_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
DATAGRAM_ENCODING_OPTION	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
requiresLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOption	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
option	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
setOption	TokenNameIdentifier
(	TokenNameLPAREN
option	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
option	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
DATAGRAM_HOST_OPTION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
host	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
option	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
DATAGRAM_PORT_OPTION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
port	TokenNameIdentifier
=	TokenNameEQUAL
OptionConverter	TokenNameIdentifier
.	TokenNameDOT
toInt	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
,	TokenNameCOMMA
DEFAULT_PORT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
option	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
DATAGRAM_ENCODING_OPTION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
encoding	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDestination	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
host	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
port	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
encoding	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
host	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"setDestination: host is null"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
host	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_HOST	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
host	TokenNameIdentifier
=	TokenNameEQUAL
host	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
port	TokenNameIdentifier
=	TokenNameEQUAL
port	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
encoding	TokenNameIdentifier
=	TokenNameEQUAL
encoding	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
qw	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QuietWriter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DatagramStringWriter	TokenNameIdentifier
(	TokenNameLPAREN
host	TokenNameIdentifier
,	TokenNameCOMMA
port	TokenNameIdentifier
,	TokenNameCOMMA
encoding	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
errorHandler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
stp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SingleLineTracerPrintWriter	TokenNameIdentifier
(	TokenNameLPAREN
qw	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLayout	TokenNameIdentifier
(	TokenNameLPAREN
Layout	TokenNameIdentifier
layout	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
layout	TokenNameIdentifier
=	TokenNameEQUAL
layout	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE