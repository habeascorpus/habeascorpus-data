package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
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
Column	TokenNameIdentifier
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
context	TokenNameIdentifier
.	TokenNameDOT
CounterContext	TokenNameIdentifier
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
abstract	TokenNameabstract
class	TokenNameclass
AbstractCommutativeType	TokenNameIdentifier
extends	TokenNameextends
AbstractType	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isCommutative	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Long	TokenNameIdentifier
compose	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
CounterContext	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
total	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ByteBuffer	TokenNameIdentifier
decompose	TokenNameIdentifier
(	TokenNameLPAREN
Long	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
Column	TokenNameIdentifier
createColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE