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
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
.	TokenNameDOT
Occur	TokenNameIdentifier
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
BooleanQuery	TokenNameIdentifier
.	TokenNameDOT
BooleanWeight	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
BooleanScorer2	TokenNameIdentifier
extends	TokenNameextends
Scorer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
Scorer	TokenNameIdentifier
>	TokenNameGREATER
requiredScorers	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
Scorer	TokenNameIdentifier
>	TokenNameGREATER
optionalScorers	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
Scorer	TokenNameIdentifier
>	TokenNameGREATER
prohibitedScorers	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
class	TokenNameclass
Coordinator	TokenNameIdentifier
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
coordFactors	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
maxCoord	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
nrMatchers	TokenNameIdentifier
;	TokenNameSEMICOLON
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
BooleanWeight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
disableCoord	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
coordFactors	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
optionalScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
requiredScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
coordFactors	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
coordFactors	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
disableCoord	TokenNameIdentifier
?	TokenNameQUESTION
1.0f	TokenNameFloatingPointLiteral
:	TokenNameCOLON
weight	TokenNameIdentifier
.	TokenNameDOT
coord	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
maxCoord	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
Coordinator	TokenNameIdentifier
coordinator	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Scorer	TokenNameIdentifier
countingSumScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
minNrShouldMatch	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
doc	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
BooleanScorer2	TokenNameIdentifier
(	TokenNameLPAREN
BooleanWeight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
Similarity	TokenNameIdentifier
similarity	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
minNrShouldMatch	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Scorer	TokenNameIdentifier
>	TokenNameGREATER
required	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Scorer	TokenNameIdentifier
>	TokenNameGREATER
prohibited	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Scorer	TokenNameIdentifier
>	TokenNameGREATER
optional	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxCoord	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
weight	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
minNrShouldMatch	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Minimum number of optional scorers should not be negative"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
coordinator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Coordinator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
minNrShouldMatch	TokenNameIdentifier
=	TokenNameEQUAL
minNrShouldMatch	TokenNameIdentifier
;	TokenNameSEMICOLON
coordinator	TokenNameIdentifier
.	TokenNameDOT
maxCoord	TokenNameIdentifier
=	TokenNameEQUAL
maxCoord	TokenNameIdentifier
;	TokenNameSEMICOLON
optionalScorers	TokenNameIdentifier
=	TokenNameEQUAL
optional	TokenNameIdentifier
;	TokenNameSEMICOLON
requiredScorers	TokenNameIdentifier
=	TokenNameEQUAL
required	TokenNameIdentifier
;	TokenNameSEMICOLON
prohibitedScorers	TokenNameIdentifier
=	TokenNameEQUAL
prohibited	TokenNameIdentifier
;	TokenNameSEMICOLON
coordinator	TokenNameIdentifier
.	TokenNameDOT
init	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
,	TokenNameCOMMA
disableCoord	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
countingSumScorer	TokenNameIdentifier
=	TokenNameEQUAL
makeCountingSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
similarity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
class	TokenNameclass
SingleMatchScorer	TokenNameIdentifier
extends	TokenNameextends
Scorer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Scorer	TokenNameIdentifier
scorer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
lastScoredDoc	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
lastDocScore	TokenNameIdentifier
=	TokenNameEQUAL
Float	TokenNameIdentifier
.	TokenNameDOT
NaN	TokenNameIdentifier
;	TokenNameSEMICOLON
SingleMatchScorer	TokenNameIdentifier
(	TokenNameLPAREN
Scorer	TokenNameIdentifier
scorer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
scorer	TokenNameIdentifier
.	TokenNameDOT
weight	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scorer	TokenNameIdentifier
=	TokenNameEQUAL
scorer	TokenNameIdentifier
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
doc	TokenNameIdentifier
=	TokenNameEQUAL
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
doc	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
lastScoredDoc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
doc	TokenNameIdentifier
>	TokenNameGREATER
lastScoredDoc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
lastDocScore	TokenNameIdentifier
=	TokenNameEQUAL
scorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastScoredDoc	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
coordinator	TokenNameIdentifier
.	TokenNameDOT
nrMatchers	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
lastDocScore	TokenNameIdentifier
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
return	TokenNamereturn
1	TokenNameIntegerLiteral
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
scorer	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
scorer	TokenNameIdentifier
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
scorer	TokenNameIdentifier
.	TokenNameDOT
advance	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
Scorer	TokenNameIdentifier
countingDisjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
Scorer	TokenNameIdentifier
>	TokenNameGREATER
scorers	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
minNrShouldMatch	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
DisjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
,	TokenNameCOMMA
scorers	TokenNameIdentifier
,	TokenNameCOMMA
minNrShouldMatch	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
lastScoredDoc	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
lastDocScore	TokenNameIdentifier
=	TokenNameEQUAL
Float	TokenNameIdentifier
.	TokenNameDOT
NaN	TokenNameIdentifier
;	TokenNameSEMICOLON
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
doc	TokenNameIdentifier
=	TokenNameEQUAL
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
doc	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
lastScoredDoc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
doc	TokenNameIdentifier
>	TokenNameGREATER
lastScoredDoc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
lastDocScore	TokenNameIdentifier
=	TokenNameEQUAL
super	TokenNamesuper
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastScoredDoc	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
coordinator	TokenNameIdentifier
.	TokenNameDOT
nrMatchers	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
super	TokenNamesuper
.	TokenNameDOT
nrMatchers	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
lastDocScore	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Scorer	TokenNameIdentifier
countingConjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
Similarity	TokenNameIdentifier
similarity	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Scorer	TokenNameIdentifier
>	TokenNameGREATER
requiredScorers	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
requiredNrMatchers	TokenNameIdentifier
=	TokenNameEQUAL
requiredScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
ConjunctionScorer	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
,	TokenNameCOMMA
requiredScorers	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
lastScoredDoc	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
lastDocScore	TokenNameIdentifier
=	TokenNameEQUAL
Float	TokenNameIdentifier
.	TokenNameDOT
NaN	TokenNameIdentifier
;	TokenNameSEMICOLON
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
doc	TokenNameIdentifier
=	TokenNameEQUAL
docID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
doc	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
lastScoredDoc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
doc	TokenNameIdentifier
>	TokenNameGREATER
lastScoredDoc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
lastDocScore	TokenNameIdentifier
=	TokenNameEQUAL
super	TokenNamesuper
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastScoredDoc	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
coordinator	TokenNameIdentifier
.	TokenNameDOT
nrMatchers	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
requiredNrMatchers	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
lastDocScore	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Scorer	TokenNameIdentifier
dualConjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
Similarity	TokenNameIdentifier
similarity	TokenNameIdentifier
,	TokenNameCOMMA
Scorer	TokenNameIdentifier
req1	TokenNameIdentifier
,	TokenNameCOMMA
Scorer	TokenNameIdentifier
req2	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ConjunctionScorer	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
,	TokenNameCOMMA
req1	TokenNameIdentifier
,	TokenNameCOMMA
req2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Scorer	TokenNameIdentifier
makeCountingSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
Similarity	TokenNameIdentifier
similarity	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
requiredScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
makeCountingSumScorerNoReq	TokenNameIdentifier
(	TokenNameLPAREN
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
similarity	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
makeCountingSumScorerSomeReq	TokenNameIdentifier
(	TokenNameLPAREN
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
similarity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Scorer	TokenNameIdentifier
makeCountingSumScorerNoReq	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
Similarity	TokenNameIdentifier
similarity	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
nrOptRequired	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
minNrShouldMatch	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
1	TokenNameIntegerLiteral
:	TokenNameCOLON
minNrShouldMatch	TokenNameIdentifier
;	TokenNameSEMICOLON
Scorer	TokenNameIdentifier
requiredCountingSumScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
optionalScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
nrOptRequired	TokenNameIdentifier
)	TokenNameRPAREN
requiredCountingSumScorer	TokenNameIdentifier
=	TokenNameEQUAL
countingDisjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
optionalScorers	TokenNameIdentifier
,	TokenNameCOMMA
nrOptRequired	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
optionalScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
requiredCountingSumScorer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SingleMatchScorer	TokenNameIdentifier
(	TokenNameLPAREN
optionalScorers	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
requiredCountingSumScorer	TokenNameIdentifier
=	TokenNameEQUAL
countingConjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
similarity	TokenNameIdentifier
,	TokenNameCOMMA
optionalScorers	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
addProhibitedScorers	TokenNameIdentifier
(	TokenNameLPAREN
requiredCountingSumScorer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Scorer	TokenNameIdentifier
makeCountingSumScorerSomeReq	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
Similarity	TokenNameIdentifier
similarity	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
optionalScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
minNrShouldMatch	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Scorer	TokenNameIdentifier
>	TokenNameGREATER
allReq	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Scorer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
requiredScorers	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
allReq	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
optionalScorers	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
addProhibitedScorers	TokenNameIdentifier
(	TokenNameLPAREN
countingConjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
similarity	TokenNameIdentifier
,	TokenNameCOMMA
allReq	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
Scorer	TokenNameIdentifier
requiredCountingSumScorer	TokenNameIdentifier
=	TokenNameEQUAL
requiredScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
?	TokenNameQUESTION
new	TokenNamenew
SingleMatchScorer	TokenNameIdentifier
(	TokenNameLPAREN
requiredScorers	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
countingConjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
similarity	TokenNameIdentifier
,	TokenNameCOMMA
requiredScorers	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
minNrShouldMatch	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
addProhibitedScorers	TokenNameIdentifier
(	TokenNameLPAREN
dualConjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
disableCoord	TokenNameIdentifier
,	TokenNameCOMMA
similarity	TokenNameIdentifier
,	TokenNameCOMMA
requiredCountingSumScorer	TokenNameIdentifier
,	TokenNameCOMMA
countingDisjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
optionalScorers	TokenNameIdentifier
,	TokenNameCOMMA
minNrShouldMatch	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ReqOptSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
addProhibitedScorers	TokenNameIdentifier
(	TokenNameLPAREN
requiredCountingSumScorer	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
optionalScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
?	TokenNameQUESTION
new	TokenNamenew
SingleMatchScorer	TokenNameIdentifier
(	TokenNameLPAREN
optionalScorers	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
countingDisjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
optionalScorers	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
Scorer	TokenNameIdentifier
addProhibitedScorers	TokenNameIdentifier
(	TokenNameLPAREN
Scorer	TokenNameIdentifier
requiredCountingSumScorer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
prohibitedScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
requiredCountingSumScorer	TokenNameIdentifier
:	TokenNameCOLON
new	TokenNamenew
ReqExclScorer	TokenNameIdentifier
(	TokenNameLPAREN
requiredCountingSumScorer	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
(	TokenNameLPAREN
prohibitedScorers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
prohibitedScorers	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
:	TokenNameCOLON
new	TokenNamenew
DisjunctionSumScorer	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
,	TokenNameCOMMA
prohibitedScorers	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
score	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
collector	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
collector	TokenNameIdentifier
.	TokenNameDOT
setScorer	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
doc	TokenNameIdentifier
=	TokenNameEQUAL
countingSumScorer	TokenNameIdentifier
.	TokenNameDOT
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
NO_MORE_DOCS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
collector	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
boolean	TokenNameboolean
score	TokenNameIdentifier
(	TokenNameLPAREN
Collector	TokenNameIdentifier
collector	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
max	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
firstDocID	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
doc	TokenNameIdentifier
=	TokenNameEQUAL
firstDocID	TokenNameIdentifier
;	TokenNameSEMICOLON
collector	TokenNameIdentifier
.	TokenNameDOT
setScorer	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
doc	TokenNameIdentifier
<	TokenNameLESS
max	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
collector	TokenNameIdentifier
.	TokenNameDOT
collect	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
=	TokenNameEQUAL
countingSumScorer	TokenNameIdentifier
.	TokenNameDOT
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
doc	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
NO_MORE_DOCS	TokenNameIdentifier
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
doc	TokenNameIdentifier
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
doc	TokenNameIdentifier
=	TokenNameEQUAL
countingSumScorer	TokenNameIdentifier
.	TokenNameDOT
nextDoc	TokenNameIdentifier
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
coordinator	TokenNameIdentifier
.	TokenNameDOT
nrMatchers	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
float	TokenNamefloat
sum	TokenNameIdentifier
=	TokenNameEQUAL
countingSumScorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sum	TokenNameIdentifier
*	TokenNameMULTIPLY
coordinator	TokenNameIdentifier
.	TokenNameDOT
coordFactors	TokenNameIdentifier
[	TokenNameLBRACKET
coordinator	TokenNameIdentifier
.	TokenNameDOT
nrMatchers	TokenNameIdentifier
]	TokenNameRBRACKET
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
return	TokenNamereturn
countingSumScorer	TokenNameIdentifier
.	TokenNameDOT
freq	TokenNameIdentifier
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
doc	TokenNameIdentifier
=	TokenNameEQUAL
countingSumScorer	TokenNameIdentifier
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
void	TokenNamevoid
visitSubScorers	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
parent	TokenNameIdentifier
,	TokenNameCOMMA
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
final	TokenNamefinal
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
weight	TokenNameIdentifier
.	TokenNameDOT
getQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Scorer	TokenNameIdentifier
s	TokenNameIdentifier
:	TokenNameCOLON
optionalScorers	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
visitSubScorers	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
Occur	TokenNameIdentifier
.	TokenNameDOT
SHOULD	TokenNameIdentifier
,	TokenNameCOMMA
visitor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
Scorer	TokenNameIdentifier
s	TokenNameIdentifier
:	TokenNameCOLON
prohibitedScorers	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
visitSubScorers	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
Occur	TokenNameIdentifier
.	TokenNameDOT
MUST_NOT	TokenNameIdentifier
,	TokenNameCOMMA
visitor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
Scorer	TokenNameIdentifier
s	TokenNameIdentifier
:	TokenNameCOLON
requiredScorers	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
visitSubScorers	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
Occur	TokenNameIdentifier
.	TokenNameDOT
MUST	TokenNameIdentifier
,	TokenNameCOMMA
visitor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
