package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
encoding	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
EightFlagsIntEncoder	TokenNameIdentifier
extends	TokenNameextends
ChunksIntEncoder	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
encodeTable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0x1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x2	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x4	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x8	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x10	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x20	TokenNameIntegerLiteral
,	TokenNameCOMMA
0x40	TokenNameIntegerLiteral
,	TokenNameCOMMA
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
0x80	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
EightFlagsIntEncoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
encode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
data	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
data	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
indicator	TokenNameIdentifier
|=	TokenNameOR_EQUAL
encodeTable	TokenNameIdentifier
[	TokenNameLBRACKET
ordinal	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
encodeQueue	TokenNameIdentifier
[	TokenNameLBRACKET
encodeQueueSize	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
data	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
++	TokenNamePLUS_PLUS
ordinal	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
ordinal	TokenNameIdentifier
&	TokenNameAND
0x7	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
encodeChunk	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
IntDecoder	TokenNameIdentifier
createMatchingDecoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
EightFlagsIntDecoder	TokenNameIdentifier
(	TokenNameLPAREN
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
"EightFlags ("	TokenNameStringLiteral
+	TokenNamePLUS
encoder	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
