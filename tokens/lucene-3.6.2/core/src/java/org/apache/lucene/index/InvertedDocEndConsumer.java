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
util	TokenNameIdentifier
.	TokenNameDOT
Collection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
abstract	TokenNameabstract
class	TokenNameclass
InvertedDocEndConsumer	TokenNameIdentifier
{	TokenNameLBRACE
abstract	TokenNameabstract
InvertedDocEndConsumerPerThread	TokenNameIdentifier
addThread	TokenNameIdentifier
(	TokenNameLPAREN
DocInverterPerThread	TokenNameIdentifier
docInverterPerThread	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
abstract	TokenNameabstract
void	TokenNamevoid
flush	TokenNameIdentifier
(	TokenNameLPAREN
Map	TokenNameIdentifier
<	TokenNameLESS
InvertedDocEndConsumerPerThread	TokenNameIdentifier
,	TokenNameCOMMA
Collection	TokenNameIdentifier
<	TokenNameLESS
InvertedDocEndConsumerPerField	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
threadsAndFields	TokenNameIdentifier
,	TokenNameCOMMA
SegmentWriteState	TokenNameIdentifier
state	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
abstract	TokenNameabstract
void	TokenNamevoid
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
abstract	TokenNameabstract
void	TokenNamevoid
setFieldInfos	TokenNameIdentifier
(	TokenNameLPAREN
FieldInfos	TokenNameIdentifier
fieldInfos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
