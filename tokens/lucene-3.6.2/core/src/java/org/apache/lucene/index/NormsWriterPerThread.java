package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
NormsWriterPerThread	TokenNameIdentifier
extends	TokenNameextends
InvertedDocEndConsumerPerThread	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
NormsWriter	TokenNameIdentifier
normsWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
DocState	TokenNameIdentifier
docState	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
NormsWriterPerThread	TokenNameIdentifier
(	TokenNameLPAREN
DocInverterPerThread	TokenNameIdentifier
docInverterPerThread	TokenNameIdentifier
,	TokenNameCOMMA
NormsWriter	TokenNameIdentifier
normsWriter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
normsWriter	TokenNameIdentifier
=	TokenNameEQUAL
normsWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
docState	TokenNameIdentifier
=	TokenNameEQUAL
docInverterPerThread	TokenNameIdentifier
.	TokenNameDOT
docState	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
InvertedDocEndConsumerPerField	TokenNameIdentifier
addField	TokenNameIdentifier
(	TokenNameLPAREN
DocInverterPerField	TokenNameIdentifier
docInverterPerField	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
FieldInfo	TokenNameIdentifier
fieldInfo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
NormsWriterPerField	TokenNameIdentifier
(	TokenNameLPAREN
docInverterPerField	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
,	TokenNameCOMMA
fieldInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
void	TokenNamevoid
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
void	TokenNamevoid
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
void	TokenNamevoid
finishDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
boolean	TokenNameboolean
freeRAM	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE