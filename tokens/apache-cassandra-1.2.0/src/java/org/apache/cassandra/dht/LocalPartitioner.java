package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
dht	TokenNameIdentifier
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
Collections	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
DecoratedKey	TokenNameIdentifier
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
marshal	TokenNameIdentifier
.	TokenNameDOT
AbstractType	TokenNameIdentifier
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
ByteBufferUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LocalPartitioner	TokenNameIdentifier
extends	TokenNameextends
AbstractPartitioner	TokenNameIdentifier
<	TokenNameLESS
LocalToken	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
comparator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
LocalPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
comparator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
comparator	TokenNameIdentifier
=	TokenNameEQUAL
comparator	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DecoratedKey	TokenNameIdentifier
convertFromDiskFormat	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
decorateKey	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DecoratedKey	TokenNameIdentifier
decorateKey	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
DecoratedKey	TokenNameIdentifier
(	TokenNameLPAREN
getToken	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Token	TokenNameIdentifier
midpoint	TokenNameIdentifier
(	TokenNameLPAREN
Token	TokenNameIdentifier
left	TokenNameIdentifier
,	TokenNameCOMMA
Token	TokenNameIdentifier
right	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
LocalToken	TokenNameIdentifier
getMinimumToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
LocalToken	TokenNameIdentifier
(	TokenNameLPAREN
comparator	TokenNameIdentifier
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
EMPTY_BYTE_BUFFER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
LocalToken	TokenNameIdentifier
getToken	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
LocalToken	TokenNameIdentifier
(	TokenNameLPAREN
comparator	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
LocalToken	TokenNameIdentifier
getRandomToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Token	TokenNameIdentifier
.	TokenNameDOT
TokenFactory	TokenNameIdentifier
getTokenFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
preservesOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Map	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
>	TokenNameGREATER
describeOwnership	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>	TokenNameGREATER
sortedTokens	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collections	TokenNameIdentifier
.	TokenNameDOT
singletonMap	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Token	TokenNameIdentifier
)	TokenNameRPAREN
getMinimumToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Float	TokenNameIdentifier
(	TokenNameLPAREN
1.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
