package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
zip	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
zip	TokenNameIdentifier
.	TokenNameDOT
ZipException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
ZipExtraField	TokenNameIdentifier
{	TokenNameLBRACE
ZipShort	TokenNameIdentifier
getHeaderId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ZipShort	TokenNameIdentifier
getLocalFileDataLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ZipShort	TokenNameIdentifier
getCentralDirectoryLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getLocalFileDataData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getCentralDirectoryData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
parseFromLocalFileData	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
data	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ZipException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE