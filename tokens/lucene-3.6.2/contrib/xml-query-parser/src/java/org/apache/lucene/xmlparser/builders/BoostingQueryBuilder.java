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
BoostingQuery	TokenNameIdentifier
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
Query	TokenNameIdentifier
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
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
xmlparser	TokenNameIdentifier
.	TokenNameDOT
QueryBuilder	TokenNameIdentifier
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
BoostingQueryBuilder	TokenNameIdentifier
implements	TokenNameimplements
QueryBuilder	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
QueryBuilder	TokenNameIdentifier
factory	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
defaultBoost	TokenNameIdentifier
=	TokenNameEQUAL
0.01f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
BoostingQueryBuilder	TokenNameIdentifier
(	TokenNameLPAREN
QueryBuilder	TokenNameIdentifier
factory	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
factory	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Query	TokenNameIdentifier
getQuery	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParserException	TokenNameIdentifier
{	TokenNameLBRACE
Element	TokenNameIdentifier
mainQueryElem	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getChildByTagOrFail	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"Query"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mainQueryElem	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getFirstChildOrFail	TokenNameIdentifier
(	TokenNameLPAREN
mainQueryElem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
mainQuery	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
getQuery	TokenNameIdentifier
(	TokenNameLPAREN
mainQueryElem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Element	TokenNameIdentifier
boostQueryElem	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getChildByTagOrFail	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"BoostQuery"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
boost	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
boostQueryElem	TokenNameIdentifier
,	TokenNameCOMMA
"boost"	TokenNameStringLiteral
,	TokenNameCOMMA
defaultBoost	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boostQueryElem	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getFirstChildOrFail	TokenNameIdentifier
(	TokenNameLPAREN
boostQueryElem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
boostQuery	TokenNameIdentifier
=	TokenNameEQUAL
factory	TokenNameIdentifier
.	TokenNameDOT
getQuery	TokenNameIdentifier
(	TokenNameLPAREN
boostQueryElem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BoostingQuery	TokenNameIdentifier
bq	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BoostingQuery	TokenNameIdentifier
(	TokenNameLPAREN
mainQuery	TokenNameIdentifier
,	TokenNameCOMMA
boostQuery	TokenNameIdentifier
,	TokenNameCOMMA
boost	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bq	TokenNameIdentifier
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
bq	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
