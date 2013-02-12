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
Arrays	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
FBUtilities	TokenNameIdentifier
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
Hex	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
BytesToken	TokenNameIdentifier
extends	TokenNameextends
Token	TokenNameIdentifier
<	TokenNameLESS
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
2630749093733680626L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
BytesToken	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
token	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
getArray	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
BytesToken	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
token	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"Token(bytes["	TokenNameStringLiteral
+	TokenNamePLUS
Hex	TokenNameIdentifier
.	TokenNameDOT
bytesToHex	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
"])"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
Token	TokenNameIdentifier
<	TokenNameLESS
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
FBUtilities	TokenNameIdentifier
.	TokenNameDOT
compareUnsigned	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
,	TokenNameCOMMA
o	TokenNameIdentifier
.	TokenNameDOT
token	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
token	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
o	TokenNameIdentifier
.	TokenNameDOT
token	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
prime	TokenNameIdentifier
=	TokenNameEQUAL
31	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
prime	TokenNameIdentifier
+	TokenNamePLUS
Arrays	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
==	TokenNameEQUAL_EQUAL
obj	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
obj	TokenNameIdentifier
instanceof	TokenNameinstanceof
BytesToken	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
BytesToken	TokenNameIdentifier
other	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
BytesToken	TokenNameIdentifier
)	TokenNameRPAREN
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
Arrays	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
,	TokenNameCOMMA
other	TokenNameIdentifier
.	TokenNameDOT
token	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE