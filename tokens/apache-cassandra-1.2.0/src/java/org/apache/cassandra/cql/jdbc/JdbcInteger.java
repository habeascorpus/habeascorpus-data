package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql	TokenNameIdentifier
.	TokenNameDOT
jdbc	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
math	TokenNameIdentifier
.	TokenNameDOT
BigInteger	TokenNameIdentifier
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
sql	TokenNameIdentifier
.	TokenNameDOT
Types	TokenNameIdentifier
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
JdbcInteger	TokenNameIdentifier
extends	TokenNameextends
AbstractJdbcType	TokenNameIdentifier
<	TokenNameLESS
BigInteger	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
JdbcInteger	TokenNameIdentifier
instance	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JdbcInteger	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
JdbcInteger	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isCaseSensitive	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getScale	TokenNameIdentifier
(	TokenNameLPAREN
BigInteger	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getPrecision	TokenNameIdentifier
(	TokenNameLPAREN
BigInteger	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
obj	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isCurrency	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isSigned	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
BigInteger	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
obj	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
needsQuotes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getString	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
bytes	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
"null"	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
bytes	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
"empty"	TokenNameStringLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
BigInteger	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
getArray	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Class	TokenNameIdentifier
<	TokenNameLESS
BigInteger	TokenNameIdentifier
>	TokenNameGREATER
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
BigInteger	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getJdbcType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Types	TokenNameIdentifier
.	TokenNameDOT
BIGINT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
BigInteger	TokenNameIdentifier
compose	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
bytes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
BigInteger	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
getArray	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ByteBuffer	TokenNameIdentifier
decompose	TokenNameIdentifier
(	TokenNameLPAREN
BigInteger	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
toByteArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
