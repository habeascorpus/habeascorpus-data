package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
sampling	TokenNameIdentifier
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
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Random	TokenNameIdentifier
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
TermQuery	TokenNameIdentifier
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
MultiCollector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
BaseTestTopK	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
FacetsAccumulator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
FacetsCollector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
ScoredDocIDs	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
ScoredDocIdCollector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
params	TokenNameIdentifier
.	TokenNameDOT
FacetSearchParams	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
results	TokenNameIdentifier
.	TokenNameDOT
FacetResult	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
taxonomy	TokenNameIdentifier
.	TokenNameDOT
TaxonomyReader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
BaseSampleTestTopK	TokenNameIdentifier
extends	TokenNameextends
BaseTestTopK	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
K	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
RETRIES	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
abstract	TokenNameabstract
FacetsAccumulator	TokenNameIdentifier
getSamplingAccumulator	TokenNameIdentifier
(	TokenNameLPAREN
Sampler	TokenNameIdentifier
sampler	TokenNameIdentifier
,	TokenNameCOMMA
TaxonomyReader	TokenNameIdentifier
taxoReader	TokenNameIdentifier
,	TokenNameCOMMA
IndexReader	TokenNameIdentifier
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
FacetSearchParams	TokenNameIdentifier
searchParams	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
testCountUsingSamping	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
boolean	TokenNameboolean
useRandomSampler	TokenNameIdentifier
=	TokenNameEQUAL
random	TokenNameIdentifier
.	TokenNameDOT
nextBoolean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
partitionSize	TokenNameIdentifier
:	TokenNameCOLON
partitionSizes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
partitionSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
CONTENT_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
BETA	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoredDocIdCollector	TokenNameIdentifier
docCollector	TokenNameIdentifier
=	TokenNameEQUAL
ScoredDocIdCollector	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FacetSearchParams	TokenNameIdentifier
expectedSearchParams	TokenNameIdentifier
=	TokenNameEQUAL
searchParamsWithRequests	TokenNameIdentifier
(	TokenNameLPAREN
K	TokenNameIdentifier
,	TokenNameCOMMA
partitionSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FacetsCollector	TokenNameIdentifier
fc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FacetsCollector	TokenNameIdentifier
(	TokenNameLPAREN
expectedSearchParams	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxoReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
MultiCollector	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
docCollector	TokenNameIdentifier
,	TokenNameCOMMA
fc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
expectedResults	TokenNameIdentifier
=	TokenNameEQUAL
fc	TokenNameIdentifier
.	TokenNameDOT
getFacetResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FacetSearchParams	TokenNameIdentifier
samplingSearchParams	TokenNameIdentifier
=	TokenNameEQUAL
searchParamsWithRequests	TokenNameIdentifier
(	TokenNameLPAREN
K	TokenNameIdentifier
,	TokenNameCOMMA
partitionSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
nTrial	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
nTrial	TokenNameIdentifier
<	TokenNameLESS
RETRIES	TokenNameIdentifier
;	TokenNameSEMICOLON
nTrial	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
final	TokenNamefinal
Sampler	TokenNameIdentifier
sampler	TokenNameIdentifier
=	TokenNameEQUAL
createSampler	TokenNameIdentifier
(	TokenNameLPAREN
nTrial	TokenNameIdentifier
,	TokenNameCOMMA
docCollector	TokenNameIdentifier
.	TokenNameDOT
getScoredDocIDs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
useRandomSampler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertSampling	TokenNameIdentifier
(	TokenNameLPAREN
expectedResults	TokenNameIdentifier
,	TokenNameCOMMA
q	TokenNameIdentifier
,	TokenNameCOMMA
sampler	TokenNameIdentifier
,	TokenNameCOMMA
samplingSearchParams	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertSampling	TokenNameIdentifier
(	TokenNameLPAREN
expectedResults	TokenNameIdentifier
,	TokenNameCOMMA
q	TokenNameIdentifier
,	TokenNameCOMMA
sampler	TokenNameIdentifier
,	TokenNameCOMMA
samplingSearchParams	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NotSameResultError	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
nTrial	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
RETRIES	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
closeAll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertSampling	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
expected	TokenNameIdentifier
,	TokenNameCOMMA
Query	TokenNameIdentifier
q	TokenNameIdentifier
,	TokenNameCOMMA
Sampler	TokenNameIdentifier
sampler	TokenNameIdentifier
,	TokenNameCOMMA
FacetSearchParams	TokenNameIdentifier
params	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
complement	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
FacetsCollector	TokenNameIdentifier
samplingFC	TokenNameIdentifier
=	TokenNameEQUAL
samplingCollector	TokenNameIdentifier
(	TokenNameLPAREN
complement	TokenNameIdentifier
,	TokenNameCOMMA
sampler	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
samplingFC	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
sampledResults	TokenNameIdentifier
=	TokenNameEQUAL
samplingFC	TokenNameIdentifier
.	TokenNameDOT
getFacetResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertSameResults	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
,	TokenNameCOMMA
sampledResults	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
FacetsCollector	TokenNameIdentifier
samplingCollector	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
boolean	TokenNameboolean
complement	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Sampler	TokenNameIdentifier
sampler	TokenNameIdentifier
,	TokenNameCOMMA
FacetSearchParams	TokenNameIdentifier
samplingSearchParams	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FacetsCollector	TokenNameIdentifier
samplingFC	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FacetsCollector	TokenNameIdentifier
(	TokenNameLPAREN
samplingSearchParams	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxoReader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
FacetsAccumulator	TokenNameIdentifier
initFacetsAccumulator	TokenNameIdentifier
(	TokenNameLPAREN
FacetSearchParams	TokenNameIdentifier
facetSearchParams	TokenNameIdentifier
,	TokenNameCOMMA
IndexReader	TokenNameIdentifier
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
TaxonomyReader	TokenNameIdentifier
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FacetsAccumulator	TokenNameIdentifier
acc	TokenNameIdentifier
=	TokenNameEQUAL
getSamplingAccumulator	TokenNameIdentifier
(	TokenNameLPAREN
sampler	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
facetSearchParams	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
acc	TokenNameIdentifier
.	TokenNameDOT
setComplementThreshold	TokenNameIdentifier
(	TokenNameLPAREN
complement	TokenNameIdentifier
?	TokenNameQUESTION
FacetsAccumulator	TokenNameIdentifier
.	TokenNameDOT
FORCE_COMPLEMENT	TokenNameIdentifier
:	TokenNameCOLON
FacetsAccumulator	TokenNameIdentifier
.	TokenNameDOT
DISABLE_COMPLEMENT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
acc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
return	TokenNamereturn
samplingFC	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Sampler	TokenNameIdentifier
createSampler	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nTrial	TokenNameIdentifier
,	TokenNameCOMMA
ScoredDocIDs	TokenNameIdentifier
scoredDocIDs	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
useRandomSampler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SamplingParams	TokenNameIdentifier
samplingParams	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SamplingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
double	TokenNamedouble
retryFactor	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
pow	TokenNameIdentifier
(	TokenNameLPAREN
1.01	TokenNameDoubleLiteral
,	TokenNameCOMMA
nTrial	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
samplingParams	TokenNameIdentifier
.	TokenNameDOT
setSampleRatio	TokenNameIdentifier
(	TokenNameLPAREN
0.8	TokenNameDoubleLiteral
*	TokenNameMULTIPLY
retryFactor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
samplingParams	TokenNameIdentifier
.	TokenNameDOT
setMinSampleSize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
100	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
retryFactor	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
samplingParams	TokenNameIdentifier
.	TokenNameDOT
setMaxSampleSize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
10000	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
retryFactor	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
samplingParams	TokenNameIdentifier
.	TokenNameDOT
setOversampleFactor	TokenNameIdentifier
(	TokenNameLPAREN
5.0	TokenNameDoubleLiteral
*	TokenNameMULTIPLY
retryFactor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
samplingParams	TokenNameIdentifier
.	TokenNameDOT
setSampingThreshold	TokenNameIdentifier
(	TokenNameLPAREN
11000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Sampler	TokenNameIdentifier
sampler	TokenNameIdentifier
=	TokenNameEQUAL
useRandomSampler	TokenNameIdentifier
?	TokenNameQUESTION
new	TokenNamenew
RandomSampler	TokenNameIdentifier
(	TokenNameLPAREN
samplingParams	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Random	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
new	TokenNamenew
RepeatableSampler	TokenNameIdentifier
(	TokenNameLPAREN
samplingParams	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"must enable sampling for this test!"	TokenNameStringLiteral
,	TokenNameCOMMA
sampler	TokenNameIdentifier
.	TokenNameDOT
shouldSample	TokenNameIdentifier
(	TokenNameLPAREN
scoredDocIDs	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sampler	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
