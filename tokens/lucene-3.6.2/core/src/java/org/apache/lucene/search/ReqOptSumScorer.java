package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
ReqOptSumScorer	TokenNameIdentifier
extends	TokenNameextends
Scorer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Scorer	TokenNameIdentifier
reqScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Scorer	TokenNameIdentifier
optScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ReqOptSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
Scorer	TokenNameIdentifier
reqScorer	TokenNameIdentifier
,	TokenNameCOMMA
Scorer	TokenNameIdentifier
optScorer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
reqScorer	TokenNameIdentifier
.	TokenNameDOT
weight	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
reqScorer	TokenNameIdentifier
=	TokenNameEQUAL
reqScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
optScorer	TokenNameIdentifier
=	TokenNameEQUAL
optScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
reqScorer	TokenNameIdentifier
.	TokenNameDOT
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
advance	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
target	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
reqScorer	TokenNameIdentifier
.	TokenNameDOT
advance	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
reqScorer	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
curDoc	TokenNameIdentifier
=	TokenNameEQUAL
reqScorer	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
reqScore	TokenNameIdentifier
=	TokenNameEQUAL
reqScorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
optScorer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
reqScore	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
optScorerDoc	TokenNameIdentifier
=	TokenNameEQUAL
optScorer	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
optScorerDoc	TokenNameIdentifier
<	TokenNameLESS
curDoc	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
optScorerDoc	TokenNameIdentifier
=	TokenNameEQUAL
optScorer	TokenNameIdentifier
.	TokenNameDOT
advance	TokenNameIdentifier
(	TokenNameLPAREN
curDoc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
NO_MORE_DOCS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
optScorer	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
return	TokenNamereturn
reqScore	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
optScorerDoc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
curDoc	TokenNameIdentifier
?	TokenNameQUESTION
reqScore	TokenNameIdentifier
+	TokenNamePLUS
optScorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
reqScore	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
freq	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
optScorer	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
optScorer	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
reqScorer	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
2	TokenNameIntegerLiteral
:	TokenNameCOLON
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
