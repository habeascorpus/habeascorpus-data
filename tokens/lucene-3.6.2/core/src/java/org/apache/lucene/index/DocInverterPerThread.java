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
util	TokenNameIdentifier
.	TokenNameDOT
AttributeSource	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
tokenattributes	TokenNameIdentifier
.	TokenNameDOT
OffsetAttribute	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
tokenattributes	TokenNameIdentifier
.	TokenNameDOT
CharTermAttribute	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
DocInverterPerThread	TokenNameIdentifier
extends	TokenNameextends
DocFieldConsumerPerThread	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
DocInverter	TokenNameIdentifier
docInverter	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
InvertedDocConsumerPerThread	TokenNameIdentifier
consumer	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
InvertedDocEndConsumerPerThread	TokenNameIdentifier
endConsumer	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
SingleTokenAttributeSource	TokenNameIdentifier
singleToken	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SingleTokenAttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
class	TokenNameclass
SingleTokenAttributeSource	TokenNameIdentifier
extends	TokenNameextends
AttributeSource	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
CharTermAttribute	TokenNameIdentifier
termAttribute	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
OffsetAttribute	TokenNameIdentifier
offsetAttribute	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
SingleTokenAttributeSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
termAttribute	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAttribute	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
OffsetAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
reinit	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
stringValue	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
startOffset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
endOffset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
termAttribute	TokenNameIdentifier
.	TokenNameDOT
setEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
stringValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAttribute	TokenNameIdentifier
.	TokenNameDOT
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
startOffset	TokenNameIdentifier
,	TokenNameCOMMA
endOffset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
final	TokenNamefinal
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
DocState	TokenNameIdentifier
docState	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
FieldInvertState	TokenNameIdentifier
fieldState	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldInvertState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
ReusableStringReader	TokenNameIdentifier
stringReader	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ReusableStringReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
DocInverterPerThread	TokenNameIdentifier
(	TokenNameLPAREN
DocFieldProcessorPerThread	TokenNameIdentifier
docFieldProcessorPerThread	TokenNameIdentifier
,	TokenNameCOMMA
DocInverter	TokenNameIdentifier
docInverter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
docInverter	TokenNameIdentifier
=	TokenNameEQUAL
docInverter	TokenNameIdentifier
;	TokenNameSEMICOLON
docState	TokenNameIdentifier
=	TokenNameEQUAL
docFieldProcessorPerThread	TokenNameIdentifier
.	TokenNameDOT
docState	TokenNameIdentifier
;	TokenNameSEMICOLON
consumer	TokenNameIdentifier
=	TokenNameEQUAL
docInverter	TokenNameIdentifier
.	TokenNameDOT
consumer	TokenNameIdentifier
.	TokenNameDOT
addThread	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
endConsumer	TokenNameIdentifier
=	TokenNameEQUAL
docInverter	TokenNameIdentifier
.	TokenNameDOT
endConsumer	TokenNameIdentifier
.	TokenNameDOT
addThread	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
consumer	TokenNameIdentifier
.	TokenNameDOT
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
endConsumer	TokenNameIdentifier
.	TokenNameDOT
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
DocWriter	TokenNameIdentifier
finishDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
endConsumer	TokenNameIdentifier
.	TokenNameDOT
finishDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
consumer	TokenNameIdentifier
.	TokenNameDOT
finishDocument	TokenNameIdentifier
(	TokenNameLPAREN
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
try	TokenNametry
{	TokenNameLBRACE
consumer	TokenNameIdentifier
.	TokenNameDOT
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
endConsumer	TokenNameIdentifier
.	TokenNameDOT
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
DocFieldConsumerPerField	TokenNameIdentifier
addField	TokenNameIdentifier
(	TokenNameLPAREN
FieldInfo	TokenNameIdentifier
fi	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
DocInverterPerField	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
fi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
