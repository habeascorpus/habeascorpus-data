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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Fieldable	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
DocFieldProcessorPerField	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
DocFieldConsumerPerField	TokenNameIdentifier
consumer	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
FieldInfo	TokenNameIdentifier
fieldInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
DocFieldProcessorPerField	TokenNameIdentifier
next	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
lastGen	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
fieldCount	TokenNameIdentifier
;	TokenNameSEMICOLON
Fieldable	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Fieldable	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
public	TokenNamepublic
DocFieldProcessorPerField	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
DocFieldProcessorPerThread	TokenNameIdentifier
perThread	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
FieldInfo	TokenNameIdentifier
fieldInfo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
consumer	TokenNameIdentifier
=	TokenNameEQUAL
perThread	TokenNameIdentifier
.	TokenNameDOT
consumer	TokenNameIdentifier
.	TokenNameDOT
addField	TokenNameIdentifier
(	TokenNameLPAREN
fieldInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
=	TokenNameEQUAL
fieldInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
consumer	TokenNameIdentifier
.	TokenNameDOT
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
