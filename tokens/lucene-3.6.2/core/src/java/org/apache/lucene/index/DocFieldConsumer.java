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
Collection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
abstract	TokenNameabstract
class	TokenNameclass
DocFieldConsumer	TokenNameIdentifier
{	TokenNameLBRACE
FieldInfos	TokenNameIdentifier
fieldInfos	TokenNameIdentifier
;	TokenNameSEMICOLON
abstract	TokenNameabstract
void	TokenNamevoid
flush	TokenNameIdentifier
(	TokenNameLPAREN
Map	TokenNameIdentifier
<	TokenNameLESS
DocFieldConsumerPerThread	TokenNameIdentifier
,	TokenNameCOMMA
Collection	TokenNameIdentifier
<	TokenNameLESS
DocFieldConsumerPerField	TokenNameIdentifier
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
DocFieldConsumerPerThread	TokenNameIdentifier
addThread	TokenNameIdentifier
(	TokenNameLPAREN
DocFieldProcessorPerThread	TokenNameIdentifier
docFieldProcessorPerThread	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
abstract	TokenNameabstract
boolean	TokenNameboolean
freeRAM	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
setFieldInfos	TokenNameIdentifier
(	TokenNameLPAREN
FieldInfos	TokenNameIdentifier
fieldInfos	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
fieldInfos	TokenNameIdentifier
=	TokenNameEQUAL
fieldInfos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE