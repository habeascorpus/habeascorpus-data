package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
LinkedList	TokenNameIdentifier
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
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
IMutation	TokenNameIdentifier
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
exceptions	TokenNameIdentifier
.	TokenNameDOT
InvalidRequestException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
UnauthorizedException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
ThriftClientState	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
BatchStatement	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
AbstractModification	TokenNameIdentifier
>	TokenNameGREATER
statements	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
ConsistencyLevel	TokenNameIdentifier
consistency	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
Long	TokenNameIdentifier
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
int	TokenNameint
timeToLive	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
BatchStatement	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
AbstractModification	TokenNameIdentifier
>	TokenNameGREATER
statements	TokenNameIdentifier
,	TokenNameCOMMA
Attributes	TokenNameIdentifier
attrs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
statements	TokenNameIdentifier
=	TokenNameEQUAL
statements	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
consistency	TokenNameIdentifier
=	TokenNameEQUAL
attrs	TokenNameIdentifier
.	TokenNameDOT
getConsistencyLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
timestamp	TokenNameIdentifier
=	TokenNameEQUAL
attrs	TokenNameIdentifier
.	TokenNameDOT
getTimestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
timeToLive	TokenNameIdentifier
=	TokenNameEQUAL
attrs	TokenNameIdentifier
.	TokenNameDOT
getTimeToLive	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
AbstractModification	TokenNameIdentifier
>	TokenNameGREATER
getStatements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
statements	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ConsistencyLevel	TokenNameIdentifier
getConsistencyLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
consistency	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getTimeToLive	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
timeToLive	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
IMutation	TokenNameIdentifier
>	TokenNameGREATER
getMutations	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
keyspace	TokenNameIdentifier
,	TokenNameCOMMA
ThriftClientState	TokenNameIdentifier
clientState	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
>	TokenNameGREATER
variables	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
,	TokenNameCOMMA
UnauthorizedException	TokenNameIdentifier
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
IMutation	TokenNameIdentifier
>	TokenNameGREATER
batch	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedList	TokenNameIdentifier
<	TokenNameLESS
IMutation	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
AbstractModification	TokenNameIdentifier
statement	TokenNameIdentifier
:	TokenNameCOLON
statements	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
batch	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
statement	TokenNameIdentifier
.	TokenNameDOT
prepareRowMutations	TokenNameIdentifier
(	TokenNameLPAREN
keyspace	TokenNameIdentifier
,	TokenNameCOMMA
clientState	TokenNameIdentifier
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
variables	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
batch	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isSetTimestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
timestamp	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"BatchStatement(statements=%s, consistency=%s)"	TokenNameStringLiteral
,	TokenNameCOMMA
statements	TokenNameIdentifier
,	TokenNameCOMMA
consistency	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE