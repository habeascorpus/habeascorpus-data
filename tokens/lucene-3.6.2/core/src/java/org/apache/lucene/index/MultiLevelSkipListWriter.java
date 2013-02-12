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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
IndexOutput	TokenNameIdentifier
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
RAMOutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
abstract	TokenNameabstract
class	TokenNameclass
MultiLevelSkipListWriter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
numberOfSkipLevels	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
skipInterval	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
RAMOutputStream	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
skipBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
MultiLevelSkipListWriter	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
skipInterval	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxSkipLevels	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
df	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
skipInterval	TokenNameIdentifier
=	TokenNameEQUAL
skipInterval	TokenNameIdentifier
;	TokenNameSEMICOLON
numberOfSkipLevels	TokenNameIdentifier
=	TokenNameEQUAL
df	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
floor	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
df	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
Math	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
skipInterval	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
numberOfSkipLevels	TokenNameIdentifier
>	TokenNameGREATER
maxSkipLevels	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
numberOfSkipLevels	TokenNameIdentifier
=	TokenNameEQUAL
maxSkipLevels	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
skipBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RAMOutputStream	TokenNameIdentifier
[	TokenNameLBRACKET
numberOfSkipLevels	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
numberOfSkipLevels	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
skipBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
RAMOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
resetSkip	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
skipBuffer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
skipBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
skipBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
abstract	TokenNameabstract
void	TokenNamevoid
writeSkipData	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
level	TokenNameIdentifier
,	TokenNameCOMMA
IndexOutput	TokenNameIdentifier
skipBuffer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
void	TokenNamevoid
bufferSkip	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
df	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
numLevels	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
numLevels	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
(	TokenNameLPAREN
df	TokenNameIdentifier
%	TokenNameREMAINDER
skipInterval	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
numLevels	TokenNameIdentifier
<	TokenNameLESS
numberOfSkipLevels	TokenNameIdentifier
;	TokenNameSEMICOLON
df	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
skipInterval	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
numLevels	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
long	TokenNamelong
childPointer	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
level	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
level	TokenNameIdentifier
<	TokenNameLESS
numLevels	TokenNameIdentifier
;	TokenNameSEMICOLON
level	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
writeSkipData	TokenNameIdentifier
(	TokenNameLPAREN
level	TokenNameIdentifier
,	TokenNameCOMMA
skipBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
newChildPointer	TokenNameIdentifier
=	TokenNameEQUAL
skipBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
level	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
skipBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
writeVLong	TokenNameIdentifier
(	TokenNameLPAREN
childPointer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
childPointer	TokenNameIdentifier
=	TokenNameEQUAL
newChildPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
long	TokenNamelong
writeSkip	TokenNameIdentifier
(	TokenNameLPAREN
IndexOutput	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
long	TokenNamelong
skipPointer	TokenNameIdentifier
=	TokenNameEQUAL
output	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
skipBuffer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
skipBuffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
skipPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
level	TokenNameIdentifier
=	TokenNameEQUAL
numberOfSkipLevels	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
level	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
level	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
length	TokenNameIdentifier
=	TokenNameEQUAL
skipBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
output	TokenNameIdentifier
.	TokenNameDOT
writeVLong	TokenNameIdentifier
(	TokenNameLPAREN
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
skipBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
writeTo	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
skipBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
writeTo	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
skipPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE