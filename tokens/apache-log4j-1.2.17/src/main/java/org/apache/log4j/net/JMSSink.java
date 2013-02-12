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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
PropertyConfigurator	TokenNameIdentifier
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
xml	TokenNameIdentifier
.	TokenNameDOT
DOMConfigurator	TokenNameIdentifier
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
ObjectMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
Session	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
Topic	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
TopicConnection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
TopicConnectionFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
TopicSession	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
TopicSubscriber	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
naming	TokenNameIdentifier
.	TokenNameDOT
Context	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
naming	TokenNameIdentifier
.	TokenNameDOT
InitialContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
naming	TokenNameIdentifier
.	TokenNameDOT
NameNotFoundException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
naming	TokenNameIdentifier
.	TokenNameDOT
NamingException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStreamReader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JMSSink	TokenNameIdentifier
implements	TokenNameimplements
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
MessageListener	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
JMSSink	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
public	TokenNamepublic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
usage	TokenNameIdentifier
(	TokenNameLPAREN
"Wrong number of arguments."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
tcfBindingName	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
String	TokenNameIdentifier
topicBindingName	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
String	TokenNameIdentifier
username	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
String	TokenNameIdentifier
password	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
String	TokenNameIdentifier
configFile	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
configFile	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
".xml"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
DOMConfigurator	TokenNameIdentifier
.	TokenNameDOT
configure	TokenNameIdentifier
(	TokenNameLPAREN
configFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
PropertyConfigurator	TokenNameIdentifier
.	TokenNameDOT
configure	TokenNameIdentifier
(	TokenNameLPAREN
configFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
new	TokenNamenew
JMSSink	TokenNameIdentifier
(	TokenNameLPAREN
tcfBindingName	TokenNameIdentifier
,	TokenNameCOMMA
topicBindingName	TokenNameIdentifier
,	TokenNameCOMMA
username	TokenNameIdentifier
,	TokenNameCOMMA
password	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedReader	TokenNameIdentifier
stdin	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedReader	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
in	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Type "exit" to quit JMSSink."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
stdin	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
"exit"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Exiting. Kill the application if it does not exit "	TokenNameStringLiteral
+	TokenNamePLUS
"due to daemon threads."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
JMSSink	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
tcfBindingName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
topicBindingName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
username	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
password	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Context	TokenNameIdentifier
ctx	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
InitialContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TopicConnectionFactory	TokenNameIdentifier
topicConnectionFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
topicConnectionFactory	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TopicConnectionFactory	TokenNameIdentifier
)	TokenNameRPAREN
lookup	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
,	TokenNameCOMMA
tcfBindingName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TopicConnection	TokenNameIdentifier
topicConnection	TokenNameIdentifier
=	TokenNameEQUAL
topicConnectionFactory	TokenNameIdentifier
.	TokenNameDOT
createTopicConnection	TokenNameIdentifier
(	TokenNameLPAREN
username	TokenNameIdentifier
,	TokenNameCOMMA
password	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
topicConnection	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TopicSession	TokenNameIdentifier
topicSession	TokenNameIdentifier
=	TokenNameEQUAL
topicConnection	TokenNameIdentifier
.	TokenNameDOT
createTopicSession	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
Session	TokenNameIdentifier
.	TokenNameDOT
AUTO_ACKNOWLEDGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Topic	TokenNameIdentifier
topic	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Topic	TokenNameIdentifier
)	TokenNameRPAREN
ctx	TokenNameIdentifier
.	TokenNameDOT
lookup	TokenNameIdentifier
(	TokenNameLPAREN
topicBindingName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TopicSubscriber	TokenNameIdentifier
topicSubscriber	TokenNameIdentifier
=	TokenNameEQUAL
topicSession	TokenNameIdentifier
.	TokenNameDOT
createSubscriber	TokenNameIdentifier
(	TokenNameLPAREN
topic	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
topicSubscriber	TokenNameIdentifier
.	TokenNameDOT
setMessageListener	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
JMSException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Could not read JMS message."	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NamingException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Could not read JMS message."	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
RuntimeException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Could not read JMS message."	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
onMessage	TokenNameIdentifier
(	TokenNameLPAREN
javax	TokenNameIdentifier
.	TokenNameDOT
jms	TokenNameIdentifier
.	TokenNameDOT
Message	TokenNameIdentifier
message	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
;	TokenNameSEMICOLON
Logger	TokenNameIdentifier
remoteLogger	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
message	TokenNameIdentifier
instanceof	TokenNameinstanceof
ObjectMessage	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ObjectMessage	TokenNameIdentifier
objectMessage	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ObjectMessage	TokenNameIdentifier
)	TokenNameRPAREN
message	TokenNameIdentifier
;	TokenNameSEMICOLON
event	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
LoggingEvent	TokenNameIdentifier
)	TokenNameRPAREN
objectMessage	TokenNameIdentifier
.	TokenNameDOT
getObject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
remoteLogger	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
.	TokenNameDOT
getLoggerName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
remoteLogger	TokenNameIdentifier
.	TokenNameDOT
callAppenders	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"Received message is of type "	TokenNameStringLiteral
+	TokenNamePLUS
message	TokenNameIdentifier
.	TokenNameDOT
getJMSType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
", was expecting ObjectMessage."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
JMSException	TokenNameIdentifier
jmse	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Exception thrown while processing incoming message."	TokenNameStringLiteral
,	TokenNameCOMMA
jmse	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
Object	TokenNameIdentifier
lookup	TokenNameIdentifier
(	TokenNameLPAREN
Context	TokenNameIdentifier
ctx	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
NamingException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
ctx	TokenNameIdentifier
.	TokenNameDOT
lookup	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NameNotFoundException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Could not find name ["	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
+	TokenNamePLUS
"]."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
void	TokenNamevoid
usage	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
msg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Usage: java "	TokenNameStringLiteral
+	TokenNamePLUS
JMSSink	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" TopicConnectionFactoryBindingName TopicBindingName username password configFile"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
exit	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
