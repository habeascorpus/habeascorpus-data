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
Collection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
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
Term	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DisjunctionMaxQuery	TokenNameIdentifier
extends	TokenNameextends
Query	TokenNameIdentifier
implements	TokenNameimplements
Iterable	TokenNameIdentifier
<	TokenNameLESS
Query	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
private	TokenNameprivate
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Query	TokenNameIdentifier
>	TokenNameGREATER
disjuncts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Query	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
tieBreakerMultiplier	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
DisjunctionMaxQuery	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
tieBreakerMultiplier	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
tieBreakerMultiplier	TokenNameIdentifier
=	TokenNameEQUAL
tieBreakerMultiplier	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DisjunctionMaxQuery	TokenNameIdentifier
(	TokenNameLPAREN
Collection	TokenNameIdentifier
<	TokenNameLESS
Query	TokenNameIdentifier
>	TokenNameGREATER
disjuncts	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
tieBreakerMultiplier	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
tieBreakerMultiplier	TokenNameIdentifier
=	TokenNameEQUAL
tieBreakerMultiplier	TokenNameIdentifier
;	TokenNameSEMICOLON
add	TokenNameIdentifier
(	TokenNameLPAREN
disjuncts	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
query	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
disjuncts	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
Collection	TokenNameIdentifier
<	TokenNameLESS
Query	TokenNameIdentifier
>	TokenNameGREATER
disjuncts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
disjuncts	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
disjuncts	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Iterator	TokenNameIdentifier
<	TokenNameLESS
Query	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
disjuncts	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
class	TokenNameclass
DisjunctionMaxWeight	TokenNameIdentifier
extends	TokenNameextends
Weight	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
Similarity	TokenNameIdentifier
similarity	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Weight	TokenNameIdentifier
>	TokenNameGREATER
weights	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Weight	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
DisjunctionMaxWeight	TokenNameIdentifier
(	TokenNameLPAREN
Searcher	TokenNameIdentifier
searcher	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
similarity	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
getSimilarity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Query	TokenNameIdentifier
disjunctQuery	TokenNameIdentifier
:	TokenNameCOLON
disjuncts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
weights	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
disjunctQuery	TokenNameIdentifier
.	TokenNameDOT
createWeight	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
DisjunctionMaxQuery	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
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
getBoost	TokenNameIdentifier
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
float	TokenNamefloat
max	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
sum	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Weight	TokenNameIdentifier
currentWeight	TokenNameIdentifier
:	TokenNameCOLON
weights	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
sub	TokenNameIdentifier
=	TokenNameEQUAL
currentWeight	TokenNameIdentifier
.	TokenNameDOT
sumOfSquaredWeights	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sum	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
sub	TokenNameIdentifier
;	TokenNameSEMICOLON
max	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
max	TokenNameIdentifier
,	TokenNameCOMMA
sub	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
boost	TokenNameIdentifier
=	TokenNameEQUAL
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
sum	TokenNameIdentifier
-	TokenNameMINUS
max	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
tieBreakerMultiplier	TokenNameIdentifier
*	TokenNameMULTIPLY
tieBreakerMultiplier	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
max	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
boost	TokenNameIdentifier
*	TokenNameMULTIPLY
boost	TokenNameIdentifier
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
norm	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Weight	TokenNameIdentifier
wt	TokenNameIdentifier
:	TokenNameCOLON
weights	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
wt	TokenNameIdentifier
.	TokenNameDOT
normalize	TokenNameIdentifier
(	TokenNameLPAREN
norm	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
Scorer	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
scorers	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Scorer	TokenNameIdentifier
[	TokenNameLBRACKET
weights	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Weight	TokenNameIdentifier
w	TokenNameIdentifier
:	TokenNameCOLON
weights	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Scorer	TokenNameIdentifier
subScorer	TokenNameIdentifier
=	TokenNameEQUAL
w	TokenNameIdentifier
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
subScorer	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
scorers	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
subScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
idx	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
DisjunctionMaxScorer	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DisjunctionMaxScorer	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
tieBreakerMultiplier	TokenNameIdentifier
,	TokenNameCOMMA
similarity	TokenNameIdentifier
,	TokenNameCOMMA
scorers	TokenNameIdentifier
,	TokenNameCOMMA
idx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
disjuncts	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
weights	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
explain	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ComplexExplanation	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ComplexExplanation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
max	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
sum	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
result	TokenNameIdentifier
.	TokenNameDOT
setDescription	TokenNameIdentifier
(	TokenNameLPAREN
tieBreakerMultiplier	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0.0f	TokenNameFloatingPointLiteral
?	TokenNameQUESTION
"max of:"	TokenNameStringLiteral
:	TokenNameCOLON
"max plus "	TokenNameStringLiteral
+	TokenNamePLUS
tieBreakerMultiplier	TokenNameIdentifier
+	TokenNamePLUS
" times others of:"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Weight	TokenNameIdentifier
wt	TokenNameIdentifier
:	TokenNameCOLON
weights	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Explanation	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
wt	TokenNameIdentifier
.	TokenNameDOT
explain	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
isMatch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
.	TokenNameDOT
setMatch	TokenNameIdentifier
(	TokenNameLPAREN
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
.	TokenNameDOT
addDetail	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sum	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
e	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
max	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
max	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
result	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
max	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
sum	TokenNameIdentifier
-	TokenNameMINUS
max	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
tieBreakerMultiplier	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
DisjunctionMaxWeight	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
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
int	TokenNameint
numDisjunctions	TokenNameIdentifier
=	TokenNameEQUAL
disjuncts	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
numDisjunctions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
Query	TokenNameIdentifier
singleton	TokenNameIdentifier
=	TokenNameEQUAL
disjuncts	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
singleton	TokenNameIdentifier
.	TokenNameDOT
rewrite	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
1.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
singleton	TokenNameIdentifier
)	TokenNameRPAREN
result	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Query	TokenNameIdentifier
)	TokenNameRPAREN
result	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
.	TokenNameDOT
setBoost	TokenNameIdentifier
(	TokenNameLPAREN
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
result	TokenNameIdentifier
.	TokenNameDOT
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
DisjunctionMaxQuery	TokenNameIdentifier
clone	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
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
numDisjunctions	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Query	TokenNameIdentifier
clause	TokenNameIdentifier
=	TokenNameEQUAL
disjuncts	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
rewrite	TokenNameIdentifier
=	TokenNameEQUAL
clause	TokenNameIdentifier
.	TokenNameDOT
rewrite	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
rewrite	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
clause	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
clone	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
clone	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DisjunctionMaxQuery	TokenNameIdentifier
)	TokenNameRPAREN
this	TokenNamethis
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
disjuncts	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
rewrite	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
clone	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
clone	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
Object	TokenNameIdentifier
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
DisjunctionMaxQuery	TokenNameIdentifier
clone	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DisjunctionMaxQuery	TokenNameIdentifier
)	TokenNameRPAREN
super	TokenNamesuper
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
disjuncts	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Query	TokenNameIdentifier
>	TokenNameGREATER
)	TokenNameRPAREN
this	TokenNamethis
.	TokenNameDOT
disjuncts	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
clone	TokenNameIdentifier
;	TokenNameSEMICOLON
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
for	TokenNamefor
(	TokenNameLPAREN
Query	TokenNameIdentifier
query	TokenNameIdentifier
:	TokenNameCOLON
disjuncts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
query	TokenNameIdentifier
.	TokenNameDOT
extractTerms	TokenNameIdentifier
(	TokenNameLPAREN
terms	TokenNameIdentifier
)	TokenNameRPAREN
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
StringBuilder	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"("	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
numDisjunctions	TokenNameIdentifier
=	TokenNameEQUAL
disjuncts	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
numDisjunctions	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Query	TokenNameIdentifier
subquery	TokenNameIdentifier
=	TokenNameEQUAL
disjuncts	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
subquery	TokenNameIdentifier
instanceof	TokenNameinstanceof
BooleanQuery	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"("	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
subquery	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
subquery	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
numDisjunctions	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" | "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tieBreakerMultiplier	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"~"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
tieBreakerMultiplier	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
1.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"^"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
buffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
o	TokenNameIdentifier
instanceof	TokenNameinstanceof
DisjunctionMaxQuery	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
DisjunctionMaxQuery	TokenNameIdentifier
other	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DisjunctionMaxQuery	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
this	TokenNamethis
.	TokenNameDOT
tieBreakerMultiplier	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
tieBreakerMultiplier	TokenNameIdentifier
&&	TokenNameAND_AND
this	TokenNamethis
.	TokenNameDOT
disjuncts	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
disjuncts	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Float	TokenNameIdentifier
.	TokenNameDOT
floatToIntBits	TokenNameIdentifier
(	TokenNameLPAREN
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
Float	TokenNameIdentifier
.	TokenNameDOT
floatToIntBits	TokenNameIdentifier
(	TokenNameLPAREN
tieBreakerMultiplier	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
disjuncts	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE