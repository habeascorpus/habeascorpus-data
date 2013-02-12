package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
svggen	TokenNameIdentifier
.	TokenNameDOT
font	TokenNameIdentifier
.	TokenNameDOT
table	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
RandomAccessFile	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ClassDefFormat2	TokenNameIdentifier
extends	TokenNameextends
ClassDef	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
classRangeCount	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
RangeRecord	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
classRangeRecords	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ClassDefFormat2	TokenNameIdentifier
(	TokenNameLPAREN
RandomAccessFile	TokenNameIdentifier
raf	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
classRangeCount	TokenNameIdentifier
=	TokenNameEQUAL
raf	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
classRangeRecords	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RangeRecord	TokenNameIdentifier
[	TokenNameLBRACKET
classRangeCount	TokenNameIdentifier
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
classRangeCount	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
classRangeRecords	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
RangeRecord	TokenNameIdentifier
(	TokenNameLPAREN
raf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getFormat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE