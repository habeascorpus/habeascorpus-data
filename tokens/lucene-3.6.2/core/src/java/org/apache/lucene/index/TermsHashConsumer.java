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
TermsHashConsumer	TokenNameIdentifier
{	TokenNameLBRACE
abstract	TokenNameabstract
TermsHashConsumerPerThread	TokenNameIdentifier
addThread	TokenNameIdentifier
(	TokenNameLPAREN
TermsHashPerThread	TokenNameIdentifier
perThread	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
abstract	TokenNameabstract
void	TokenNamevoid
flush	TokenNameIdentifier
(	TokenNameLPAREN
Map	TokenNameIdentifier
<	TokenNameLESS
TermsHashConsumerPerThread	TokenNameIdentifier
,	TokenNameCOMMA
Collection	TokenNameIdentifier
<	TokenNameLESS
TermsHashConsumerPerField	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
threadsAndFields	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
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
FieldInfos	TokenNameIdentifier
fieldInfos	TokenNameIdentifier
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
