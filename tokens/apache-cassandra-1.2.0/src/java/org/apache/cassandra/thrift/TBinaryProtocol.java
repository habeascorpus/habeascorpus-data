package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
TException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
protocol	TokenNameIdentifier
.	TokenNameDOT
TProtocol	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
transport	TokenNameIdentifier
.	TokenNameDOT
TTransport	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TBinaryProtocol	TokenNameIdentifier
extends	TokenNameextends
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
protocol	TokenNameIdentifier
.	TokenNameDOT
TBinaryProtocol	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
TBinaryProtocol	TokenNameIdentifier
(	TokenNameLPAREN
TTransport	TokenNameIdentifier
trans	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
trans	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TBinaryProtocol	TokenNameIdentifier
(	TokenNameLPAREN
TTransport	TokenNameIdentifier
trans	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
strictRead	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
strictWrite	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
trans	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
strictRead_	TokenNameIdentifier
=	TokenNameEQUAL
strictRead	TokenNameIdentifier
;	TokenNameSEMICOLON
strictWrite_	TokenNameIdentifier
=	TokenNameEQUAL
strictWrite	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
Factory	TokenNameIdentifier
extends	TokenNameextends
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
protocol	TokenNameIdentifier
.	TokenNameDOT
TBinaryProtocol	TokenNameIdentifier
.	TokenNameDOT
Factory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Factory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Factory	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
strictRead	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
strictWrite	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
strictRead	TokenNameIdentifier
,	TokenNameCOMMA
strictWrite	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Factory	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
strictRead	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
strictWrite	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
readLength	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
strictRead	TokenNameIdentifier
,	TokenNameCOMMA
strictWrite	TokenNameIdentifier
,	TokenNameCOMMA
readLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TProtocol	TokenNameIdentifier
getProtocol	TokenNameIdentifier
(	TokenNameLPAREN
TTransport	TokenNameIdentifier
trans	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TBinaryProtocol	TokenNameIdentifier
protocol	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TBinaryProtocol	TokenNameIdentifier
(	TokenNameLPAREN
trans	TokenNameIdentifier
,	TokenNameCOMMA
strictRead_	TokenNameIdentifier
,	TokenNameCOMMA
strictWrite_	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
readLength_	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
protocol	TokenNameIdentifier
.	TokenNameDOT
setReadLength	TokenNameIdentifier
(	TokenNameLPAREN
readLength_	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
protocol	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
writeBinary	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
buffer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TException	TokenNameIdentifier
{	TokenNameLBRACE
writeI32	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
hasArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
trans_	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
array	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
buffer	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
buffer	TokenNameIdentifier
.	TokenNameDOT
arrayOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
buffer	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bytes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
buffer	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
buffer	TokenNameIdentifier
.	TokenNameDOT
limit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
trans_	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE