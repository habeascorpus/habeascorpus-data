package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
IndexInput	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
DefaultSkipListReader	TokenNameIdentifier
extends	TokenNameextends
MultiLevelSkipListReader	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
boolean	TokenNameboolean
currentFieldStoresPayloads	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
freqPointer	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
proxPointer	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
payloadLength	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
lastFreqPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
lastProxPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
lastPayloadLength	TokenNameIdentifier
;	TokenNameSEMICOLON
DefaultSkipListReader	TokenNameIdentifier
(	TokenNameLPAREN
IndexInput	TokenNameIdentifier
skipStream	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxSkipLevels	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
skipInterval	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
skipStream	TokenNameIdentifier
,	TokenNameCOMMA
maxSkipLevels	TokenNameIdentifier
,	TokenNameCOMMA
skipInterval	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
freqPointer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
long	TokenNamelong
[	TokenNameLBRACKET
maxSkipLevels	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
proxPointer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
long	TokenNamelong
[	TokenNameLBRACKET
maxSkipLevels	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
payloadLength	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
maxSkipLevels	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
skipPointer	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
freqBasePointer	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
proxBasePointer	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
df	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
storesPayloads	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
init	TokenNameIdentifier
(	TokenNameLPAREN
skipPointer	TokenNameIdentifier
,	TokenNameCOMMA
df	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
currentFieldStoresPayloads	TokenNameIdentifier
=	TokenNameEQUAL
storesPayloads	TokenNameIdentifier
;	TokenNameSEMICOLON
lastFreqPointer	TokenNameIdentifier
=	TokenNameEQUAL
freqBasePointer	TokenNameIdentifier
;	TokenNameSEMICOLON
lastProxPointer	TokenNameIdentifier
=	TokenNameEQUAL
proxBasePointer	TokenNameIdentifier
;	TokenNameSEMICOLON
Arrays	TokenNameIdentifier
.	TokenNameDOT
fill	TokenNameIdentifier
(	TokenNameLPAREN
freqPointer	TokenNameIdentifier
,	TokenNameCOMMA
freqBasePointer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Arrays	TokenNameIdentifier
.	TokenNameDOT
fill	TokenNameIdentifier
(	TokenNameLPAREN
proxPointer	TokenNameIdentifier
,	TokenNameCOMMA
proxBasePointer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Arrays	TokenNameIdentifier
.	TokenNameDOT
fill	TokenNameIdentifier
(	TokenNameLPAREN
payloadLength	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
long	TokenNamelong
getFreqPointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
lastFreqPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
long	TokenNamelong
getProxPointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
lastProxPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
getPayloadLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
lastPayloadLength	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
void	TokenNamevoid
seekChild	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
level	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
seekChild	TokenNameIdentifier
(	TokenNameLPAREN
level	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
freqPointer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
lastFreqPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
proxPointer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
lastProxPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
payloadLength	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
lastPayloadLength	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
void	TokenNamevoid
setLastSkipData	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
level	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setLastSkipData	TokenNameIdentifier
(	TokenNameLPAREN
level	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastFreqPointer	TokenNameIdentifier
=	TokenNameEQUAL
freqPointer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
lastProxPointer	TokenNameIdentifier
=	TokenNameEQUAL
proxPointer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
lastPayloadLength	TokenNameIdentifier
=	TokenNameEQUAL
payloadLength	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
int	TokenNameint
readSkipData	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
level	TokenNameIdentifier
,	TokenNameCOMMA
IndexInput	TokenNameIdentifier
skipStream	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
delta	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
currentFieldStoresPayloads	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
delta	TokenNameIdentifier
=	TokenNameEQUAL
skipStream	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
delta	TokenNameIdentifier
&	TokenNameAND
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
payloadLength	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
skipStream	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
delta	TokenNameIdentifier
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
delta	TokenNameIdentifier
=	TokenNameEQUAL
skipStream	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
freqPointer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
+=	TokenNamePLUS_EQUAL
skipStream	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
proxPointer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
+=	TokenNamePLUS_EQUAL
skipStream	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
delta	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
