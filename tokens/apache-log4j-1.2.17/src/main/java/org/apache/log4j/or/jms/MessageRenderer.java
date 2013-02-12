package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
or	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
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
or	TokenNameIdentifier
.	TokenNameDOT
ObjectRenderer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
Message	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
JMSException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
DeliveryMode	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
MessageRenderer	TokenNameIdentifier
implements	TokenNameimplements
ObjectRenderer	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
MessageRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
doRender	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
instanceof	TokenNameinstanceof
Message	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
sbuf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Message	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Message	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"DeliveryMode="	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getJMSDeliveryMode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
DeliveryMode	TokenNameIdentifier
.	TokenNameDOT
NON_PERSISTENT	TokenNameIdentifier
:	TokenNameCOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"NON_PERSISTENT"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
DeliveryMode	TokenNameIdentifier
.	TokenNameDOT
PERSISTENT	TokenNameIdentifier
:	TokenNameCOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"PERSISTENT"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"UNKNOWN"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
", CorrelationID="	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getJMSCorrelationID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
", Destination="	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getJMSDestination	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
", Expiration="	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getJMSExpiration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
", MessageID="	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getJMSMessageID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
", Priority="	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getJMSPriority	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
", Redelivered="	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getJMSRedelivered	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
", ReplyTo="	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getJMSReplyTo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
", Timestamp="	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getJMSTimestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
", Type="	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getJMSType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
JMSException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Could not parse Message."	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
sbuf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
o	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
