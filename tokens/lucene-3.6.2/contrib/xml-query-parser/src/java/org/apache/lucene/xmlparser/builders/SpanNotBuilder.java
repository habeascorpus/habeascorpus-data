package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
xmlparser	TokenNameIdentifier
.	TokenNameDOT
builders	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
spans	TokenNameIdentifier
.	TokenNameDOT
SpanNotQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
spans	TokenNameIdentifier
.	TokenNameDOT
SpanQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
xmlparser	TokenNameIdentifier
.	TokenNameDOT
DOMUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
xmlparser	TokenNameIdentifier
.	TokenNameDOT
ParserException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Element	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SpanNotBuilder	TokenNameIdentifier
extends	TokenNameextends
SpanBuilderBase	TokenNameIdentifier
{	TokenNameLBRACE
SpanQueryBuilder	TokenNameIdentifier
factory	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SpanNotBuilder	TokenNameIdentifier
(	TokenNameLPAREN
SpanQueryBuilder	TokenNameIdentifier
factory	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
factory	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SpanQuery	TokenNameIdentifier
getSpanQuery	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParserException	TokenNameIdentifier
{	TokenNameLBRACE
Element	TokenNameIdentifier
includeElem	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getChildByTagOrFail	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"Include"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
includeElem	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getFirstChildOrFail	TokenNameIdentifier
(	TokenNameLPAREN
includeElem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Element	TokenNameIdentifier
excludeElem	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getChildByTagOrFail	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"Exclude"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
excludeElem	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getFirstChildOrFail	TokenNameIdentifier
(	TokenNameLPAREN
excludeElem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SpanQuery	TokenNameIdentifier
include	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
getSpanQuery	TokenNameIdentifier
(	TokenNameLPAREN
includeElem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SpanQuery	TokenNameIdentifier
exclude	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
getSpanQuery	TokenNameIdentifier
(	TokenNameLPAREN
excludeElem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SpanNotQuery	TokenNameIdentifier
snq	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SpanNotQuery	TokenNameIdentifier
(	TokenNameLPAREN
include	TokenNameIdentifier
,	TokenNameCOMMA
exclude	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
snq	TokenNameIdentifier
.	TokenNameDOT
setBoost	TokenNameIdentifier
(	TokenNameLPAREN
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"boost"	TokenNameStringLiteral
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
snq	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE