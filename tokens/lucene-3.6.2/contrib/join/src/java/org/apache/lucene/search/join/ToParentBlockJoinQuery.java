package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
join	TokenNameIdentifier
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
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
IndexReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
IndexWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
Term	TokenNameIdentifier
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
BooleanClause	TokenNameIdentifier
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
CachingWrapperFilter	TokenNameIdentifier
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
DocIdSet	TokenNameIdentifier
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
DocIdSetIterator	TokenNameIdentifier
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
Explanation	TokenNameIdentifier
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
Filter	TokenNameIdentifier
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
search	TokenNameIdentifier
.	TokenNameDOT
Scorer	TokenNameIdentifier
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
Searcher	TokenNameIdentifier
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
Weight	TokenNameIdentifier
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
grouping	TokenNameIdentifier
.	TokenNameDOT
TopGroups	TokenNameIdentifier
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
ArrayUtil	TokenNameIdentifier
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
FixedBitSet	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ToParentBlockJoinQuery	TokenNameIdentifier
extends	TokenNameextends
Query	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
enum	TokenNameenum
ScoreMode	TokenNameIdentifier
{	TokenNameLBRACE
None	TokenNameIdentifier
,	TokenNameCOMMA
Avg	TokenNameIdentifier
,	TokenNameCOMMA
Max	TokenNameIdentifier
,	TokenNameCOMMA
Total	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Filter	TokenNameIdentifier
parentsFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Query	TokenNameIdentifier
childQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Query	TokenNameIdentifier
origChildQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ScoreMode	TokenNameIdentifier
scoreMode	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ToParentBlockJoinQuery	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
childQuery	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
parentsFilter	TokenNameIdentifier
,	TokenNameCOMMA
ScoreMode	TokenNameIdentifier
scoreMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
origChildQuery	TokenNameIdentifier
=	TokenNameEQUAL
childQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
childQuery	TokenNameIdentifier
=	TokenNameEQUAL
childQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
parentsFilter	TokenNameIdentifier
=	TokenNameEQUAL
parentsFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scoreMode	TokenNameIdentifier
=	TokenNameEQUAL
scoreMode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ToParentBlockJoinQuery	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
origChildQuery	TokenNameIdentifier
,	TokenNameCOMMA
Query	TokenNameIdentifier
childQuery	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
parentsFilter	TokenNameIdentifier
,	TokenNameCOMMA
ScoreMode	TokenNameIdentifier
scoreMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
origChildQuery	TokenNameIdentifier
=	TokenNameEQUAL
origChildQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
childQuery	TokenNameIdentifier
=	TokenNameEQUAL
childQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
parentsFilter	TokenNameIdentifier
=	TokenNameEQUAL
parentsFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scoreMode	TokenNameIdentifier
=	TokenNameEQUAL
scoreMode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Weight	TokenNameIdentifier
createWeight	TokenNameIdentifier
(	TokenNameLPAREN
Searcher	TokenNameIdentifier
searcher	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
BlockJoinWeight	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
childQuery	TokenNameIdentifier
.	TokenNameDOT
createWeight	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
parentsFilter	TokenNameIdentifier
,	TokenNameCOMMA
scoreMode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
BlockJoinWeight	TokenNameIdentifier
extends	TokenNameextends
Weight	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Query	TokenNameIdentifier
joinQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Weight	TokenNameIdentifier
childWeight	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Filter	TokenNameIdentifier
parentsFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ScoreMode	TokenNameIdentifier
scoreMode	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
BlockJoinWeight	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
joinQuery	TokenNameIdentifier
,	TokenNameCOMMA
Weight	TokenNameIdentifier
childWeight	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
parentsFilter	TokenNameIdentifier
,	TokenNameCOMMA
ScoreMode	TokenNameIdentifier
scoreMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
joinQuery	TokenNameIdentifier
=	TokenNameEQUAL
joinQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
childWeight	TokenNameIdentifier
=	TokenNameEQUAL
childWeight	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
parentsFilter	TokenNameIdentifier
=	TokenNameEQUAL
parentsFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scoreMode	TokenNameIdentifier
=	TokenNameEQUAL
scoreMode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Query	TokenNameIdentifier
getQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
joinQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
childWeight	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
sumOfSquaredWeights	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
childWeight	TokenNameIdentifier
.	TokenNameDOT
sumOfSquaredWeights	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
joinQuery	TokenNameIdentifier
.	TokenNameDOT
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
joinQuery	TokenNameIdentifier
.	TokenNameDOT
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
normalize	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
norm	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
childWeight	TokenNameIdentifier
.	TokenNameDOT
normalize	TokenNameIdentifier
(	TokenNameLPAREN
norm	TokenNameIdentifier
*	TokenNameMULTIPLY
joinQuery	TokenNameIdentifier
.	TokenNameDOT
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Scorer	TokenNameIdentifier
scorer	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
scoreDocsInOrder	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
topScorer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
Scorer	TokenNameIdentifier
childScorer	TokenNameIdentifier
=	TokenNameEQUAL
childWeight	TokenNameIdentifier
.	TokenNameDOT
scorer	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
childScorer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
firstChildDoc	TokenNameIdentifier
=	TokenNameEQUAL
childScorer	TokenNameIdentifier
.	TokenNameDOT
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
firstChildDoc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DocIdSetIterator	TokenNameIdentifier
.	TokenNameDOT
NO_MORE_DOCS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
DocIdSet	TokenNameIdentifier
parents	TokenNameIdentifier
=	TokenNameEQUAL
parentsFilter	TokenNameIdentifier
.	TokenNameDOT
getDocIdSet	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
parents	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
parents	TokenNameIdentifier
instanceof	TokenNameinstanceof
FixedBitSet	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"parentFilter must return FixedBitSet; got "	TokenNameStringLiteral
+	TokenNamePLUS
parents	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
BlockJoinScorer	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
childScorer	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
FixedBitSet	TokenNameIdentifier
)	TokenNameRPAREN
parents	TokenNameIdentifier
,	TokenNameCOMMA
firstChildDoc	TokenNameIdentifier
,	TokenNameCOMMA
scoreMode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Explanation	TokenNameIdentifier
explain	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" cannot explain match on parent document"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
scoresDocsOutOfOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
BlockJoinScorer	TokenNameIdentifier
extends	TokenNameextends
Scorer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Scorer	TokenNameIdentifier
childScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
FixedBitSet	TokenNameIdentifier
parentBits	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ScoreMode	TokenNameIdentifier
scoreMode	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
parentDoc	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
parentScore	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
nextChildDoc	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
pendingChildDocs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
pendingChildScores	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
childDocUpto	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
BlockJoinScorer	TokenNameIdentifier
(	TokenNameLPAREN
Weight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
Scorer	TokenNameIdentifier
childScorer	TokenNameIdentifier
,	TokenNameCOMMA
FixedBitSet	TokenNameIdentifier
parentBits	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
firstChildDoc	TokenNameIdentifier
,	TokenNameCOMMA
ScoreMode	TokenNameIdentifier
scoreMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
weight	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
parentBits	TokenNameIdentifier
=	TokenNameEQUAL
parentBits	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
childScorer	TokenNameIdentifier
=	TokenNameEQUAL
childScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scoreMode	TokenNameIdentifier
=	TokenNameEQUAL
scoreMode	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
scoreMode	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
ScoreMode	TokenNameIdentifier
.	TokenNameDOT
None	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pendingChildScores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
nextChildDoc	TokenNameIdentifier
=	TokenNameEQUAL
firstChildDoc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
visitSubScorers	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
parent	TokenNameIdentifier
,	TokenNameCOMMA
BooleanClause	TokenNameIdentifier
.	TokenNameDOT
Occur	TokenNameIdentifier
relationship	TokenNameIdentifier
,	TokenNameCOMMA
ScorerVisitor	TokenNameIdentifier
<	TokenNameLESS
Query	TokenNameIdentifier
,	TokenNameCOMMA
Query	TokenNameIdentifier
,	TokenNameCOMMA
Scorer	TokenNameIdentifier
>	TokenNameGREATER
visitor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
visitSubScorers	TokenNameIdentifier
(	TokenNameLPAREN
parent	TokenNameIdentifier
,	TokenNameCOMMA
relationship	TokenNameIdentifier
,	TokenNameCOMMA
visitor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
childScorer	TokenNameIdentifier
.	TokenNameDOT
visitScorers	TokenNameIdentifier
(	TokenNameLPAREN
visitor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
getChildCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
childDocUpto	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
swapChildDocs	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ret	TokenNameIdentifier
=	TokenNameEQUAL
pendingChildDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
other	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
pendingChildDocs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
pendingChildDocs	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
swapChildScores	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
scoreMode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
ScoreMode	TokenNameIdentifier
.	TokenNameDOT
None	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"ScoreMode is None; you must pass trackScores=false to ToParentBlockJoinCollector"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ret	TokenNameIdentifier
=	TokenNameEQUAL
pendingChildScores	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
other	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
pendingChildScores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
pendingChildScores	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
nextChildDoc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_MORE_DOCS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
parentDoc	TokenNameIdentifier
=	TokenNameEQUAL
NO_MORE_DOCS	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
parentDoc	TokenNameIdentifier
=	TokenNameEQUAL
parentBits	TokenNameIdentifier
.	TokenNameDOT
nextSetBit	TokenNameIdentifier
(	TokenNameLPAREN
nextChildDoc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
parentDoc	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
totalScore	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
maxScore	TokenNameIdentifier
=	TokenNameEQUAL
Float	TokenNameIdentifier
.	TokenNameDOT
NEGATIVE_INFINITY	TokenNameIdentifier
;	TokenNameSEMICOLON
childDocUpto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
do	TokenNamedo
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
pendingChildDocs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
childDocUpto	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pendingChildDocs	TokenNameIdentifier
=	TokenNameEQUAL
ArrayUtil	TokenNameIdentifier
.	TokenNameDOT
grow	TokenNameIdentifier
(	TokenNameLPAREN
pendingChildDocs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
scoreMode	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
ScoreMode	TokenNameIdentifier
.	TokenNameDOT
None	TokenNameIdentifier
&&	TokenNameAND_AND
pendingChildScores	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
childDocUpto	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pendingChildScores	TokenNameIdentifier
=	TokenNameEQUAL
ArrayUtil	TokenNameIdentifier
.	TokenNameDOT
grow	TokenNameIdentifier
(	TokenNameLPAREN
pendingChildScores	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
pendingChildDocs	TokenNameIdentifier
[	TokenNameLBRACKET
childDocUpto	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
nextChildDoc	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
scoreMode	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
ScoreMode	TokenNameIdentifier
.	TokenNameDOT
None	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
float	TokenNamefloat
childScore	TokenNameIdentifier
=	TokenNameEQUAL
childScorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pendingChildScores	TokenNameIdentifier
[	TokenNameLBRACKET
childDocUpto	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
childScore	TokenNameIdentifier
;	TokenNameSEMICOLON
maxScore	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
childScore	TokenNameIdentifier
,	TokenNameCOMMA
maxScore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
totalScore	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
childScore	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
childDocUpto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
nextChildDoc	TokenNameIdentifier
=	TokenNameEQUAL
childScorer	TokenNameIdentifier
.	TokenNameDOT
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
nextChildDoc	TokenNameIdentifier
<	TokenNameLESS
parentDoc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
nextChildDoc	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
parentDoc	TokenNameIdentifier
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
scoreMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
Avg	TokenNameIdentifier
:	TokenNameCOLON
parentScore	TokenNameIdentifier
=	TokenNameEQUAL
totalScore	TokenNameIdentifier
/	TokenNameDIVIDE
childDocUpto	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Max	TokenNameIdentifier
:	TokenNameCOLON
parentScore	TokenNameIdentifier
=	TokenNameEQUAL
maxScore	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Total	TokenNameIdentifier
:	TokenNameCOLON
parentScore	TokenNameIdentifier
=	TokenNameEQUAL
totalScore	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
None	TokenNameIdentifier
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
parentDoc	TokenNameIdentifier
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
parentDoc	TokenNameIdentifier
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
return	TokenNamereturn
parentScore	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
advance	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
parentTarget	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
parentTarget	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_MORE_DOCS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
parentDoc	TokenNameIdentifier
=	TokenNameEQUAL
NO_MORE_DOCS	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
parentTarget	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
prevParentDoc	TokenNameIdentifier
=	TokenNameEQUAL
parentBits	TokenNameIdentifier
.	TokenNameDOT
prevSetBit	TokenNameIdentifier
(	TokenNameLPAREN
parentTarget	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
prevParentDoc	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
parentDoc	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prevParentDoc	TokenNameIdentifier
>	TokenNameGREATER
nextChildDoc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nextChildDoc	TokenNameIdentifier
=	TokenNameEQUAL
childScorer	TokenNameIdentifier
.	TokenNameDOT
advance	TokenNameIdentifier
(	TokenNameLPAREN
prevParentDoc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
nextChildDoc	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
prevParentDoc	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
nd	TokenNameIdentifier
=	TokenNameEQUAL
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
nd	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
extractTerms	TokenNameIdentifier
(	TokenNameLPAREN
Set	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
terms	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
childQuery	TokenNameIdentifier
.	TokenNameDOT
extractTerms	TokenNameIdentifier
(	TokenNameLPAREN
terms	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Query	TokenNameIdentifier
rewrite	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
Query	TokenNameIdentifier
childRewrite	TokenNameIdentifier
=	TokenNameEQUAL
childQuery	TokenNameIdentifier
.	TokenNameDOT
rewrite	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
childRewrite	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
childQuery	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Query	TokenNameIdentifier
rewritten	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ToParentBlockJoinQuery	TokenNameIdentifier
(	TokenNameLPAREN
childQuery	TokenNameIdentifier
,	TokenNameCOMMA
childRewrite	TokenNameIdentifier
,	TokenNameCOMMA
parentsFilter	TokenNameIdentifier
,	TokenNameCOMMA
scoreMode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rewritten	TokenNameIdentifier
.	TokenNameDOT
setBoost	TokenNameIdentifier
(	TokenNameLPAREN
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
rewritten	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
field	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"ToParentBlockJoinQuery ("	TokenNameStringLiteral
+	TokenNamePLUS
childQuery	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
_other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_other	TokenNameIdentifier
instanceof	TokenNameinstanceof
ToParentBlockJoinQuery	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
ToParentBlockJoinQuery	TokenNameIdentifier
other	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ToParentBlockJoinQuery	TokenNameIdentifier
)	TokenNameRPAREN
_other	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
origChildQuery	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
origChildQuery	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
parentsFilter	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
parentsFilter	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
scoreMode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
scoreMode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
prime	TokenNameIdentifier
=	TokenNameEQUAL
31	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
=	TokenNameEQUAL
prime	TokenNameIdentifier
*	TokenNameMULTIPLY
hash	TokenNameIdentifier
+	TokenNamePLUS
origChildQuery	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
=	TokenNameEQUAL
prime	TokenNameIdentifier
*	TokenNameMULTIPLY
hash	TokenNameIdentifier
+	TokenNamePLUS
scoreMode	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
=	TokenNameEQUAL
prime	TokenNameIdentifier
*	TokenNameMULTIPLY
hash	TokenNameIdentifier
+	TokenNamePLUS
parentsFilter	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Object	TokenNameIdentifier
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ToParentBlockJoinQuery	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Query	TokenNameIdentifier
)	TokenNameRPAREN
origChildQuery	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
parentsFilter	TokenNameIdentifier
,	TokenNameCOMMA
scoreMode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
