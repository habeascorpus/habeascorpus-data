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
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
CategoryListIterator	TokenNameIdentifier
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
FacetArrays	TokenNameIdentifier
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
aggregator	TokenNameIdentifier
.	TokenNameDOT
Aggregator	TokenNameIdentifier
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
FacetRequest	TokenNameIdentifier
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
search	TokenNameIdentifier
.	TokenNameDOT
results	TokenNameIdentifier
.	TokenNameDOT
FacetResultNode	TokenNameIdentifier
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
MutableFacetResultNode	TokenNameIdentifier
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
Sampler	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
final	TokenNamefinal
SamplingParams	TokenNameIdentifier
samplingParams	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Sampler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
new	TokenNamenew
SamplingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Sampler	TokenNameIdentifier
(	TokenNameLPAREN
SamplingParams	TokenNameIdentifier
params	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IllegalArgumentException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
params	TokenNameIdentifier
.	TokenNameDOT
validate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"The provided SamplingParams are not valid!!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
samplingParams	TokenNameIdentifier
=	TokenNameEQUAL
params	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
shouldSample	TokenNameIdentifier
(	TokenNameLPAREN
ScoredDocIDs	TokenNameIdentifier
docIds	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
docIds	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
samplingParams	TokenNameIdentifier
.	TokenNameDOT
getSamplingThreshold	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SampleResult	TokenNameIdentifier
getSampleSet	TokenNameIdentifier
(	TokenNameLPAREN
ScoredDocIDs	TokenNameIdentifier
docids	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
shouldSample	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
SampleResult	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
,	TokenNameCOMMA
1d	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
actualSize	TokenNameIdentifier
=	TokenNameEQUAL
docids	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
sampleSetSize	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
actualSize	TokenNameIdentifier
*	TokenNameMULTIPLY
samplingParams	TokenNameIdentifier
.	TokenNameDOT
getSampleRatio	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sampleSetSize	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
sampleSetSize	TokenNameIdentifier
,	TokenNameCOMMA
samplingParams	TokenNameIdentifier
.	TokenNameDOT
getMinSampleSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sampleSetSize	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
sampleSetSize	TokenNameIdentifier
,	TokenNameCOMMA
samplingParams	TokenNameIdentifier
.	TokenNameDOT
getMaxSampleSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
createSample	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
,	TokenNameCOMMA
actualSize	TokenNameIdentifier
,	TokenNameCOMMA
sampleSetSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
abstract	TokenNameabstract
SampleResult	TokenNameIdentifier
createSample	TokenNameIdentifier
(	TokenNameLPAREN
ScoredDocIDs	TokenNameIdentifier
docids	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
actualSize	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
sampleSetSize	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SampleFixer	TokenNameIdentifier
getSampleFixer	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
TaxonomyReader	TokenNameIdentifier
taxonomyReader	TokenNameIdentifier
,	TokenNameCOMMA
FacetSearchParams	TokenNameIdentifier
searchParams	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
TakmiSampleFixer	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
,	TokenNameCOMMA
searchParams	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
class	TokenNameclass
SampleResult	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
ScoredDocIDs	TokenNameIdentifier
docids	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
double	TokenNamedouble
actualSampleRatio	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
SampleResult	TokenNameIdentifier
(	TokenNameLPAREN
ScoredDocIDs	TokenNameIdentifier
docids	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
actualSampleRatio	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
docids	TokenNameIdentifier
=	TokenNameEQUAL
docids	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
actualSampleRatio	TokenNameIdentifier
=	TokenNameEQUAL
actualSampleRatio	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
SamplingParams	TokenNameIdentifier
getSamplingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
samplingParams	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FacetResult	TokenNameIdentifier
trimResult	TokenNameIdentifier
(	TokenNameLPAREN
FacetResult	TokenNameIdentifier
facetResult	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IllegalArgumentException	TokenNameIdentifier
{	TokenNameLBRACE
double	TokenNamedouble
overSampleFactor	TokenNameIdentifier
=	TokenNameEQUAL
getSamplingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getOversampleFactor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
overSampleFactor	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
facetResult	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
OverSampledFacetRequest	TokenNameIdentifier
sampledFreq	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
sampledFreq	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
OverSampledFacetRequest	TokenNameIdentifier
)	TokenNameRPAREN
facetResult	TokenNameIdentifier
.	TokenNameDOT
getFacetRequest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassCastException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"It is only valid to call this method with result obtained for a"	TokenNameStringLiteral
+	TokenNamePLUS
"facet request created through sampler.overSamlpingSearchParams()"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
FacetRequest	TokenNameIdentifier
origFrq	TokenNameIdentifier
=	TokenNameEQUAL
sampledFreq	TokenNameIdentifier
.	TokenNameDOT
orig	TokenNameIdentifier
;	TokenNameSEMICOLON
MutableFacetResultNode	TokenNameIdentifier
trimmedRootNode	TokenNameIdentifier
=	TokenNameEQUAL
MutableFacetResultNode	TokenNameIdentifier
.	TokenNameDOT
toImpl	TokenNameIdentifier
(	TokenNameLPAREN
facetResult	TokenNameIdentifier
.	TokenNameDOT
getFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
trimmedRootNode	TokenNameIdentifier
.	TokenNameDOT
trimSubResults	TokenNameIdentifier
(	TokenNameLPAREN
origFrq	TokenNameIdentifier
.	TokenNameDOT
getNumResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FacetResult	TokenNameIdentifier
(	TokenNameLPAREN
origFrq	TokenNameIdentifier
,	TokenNameCOMMA
trimmedRootNode	TokenNameIdentifier
,	TokenNameCOMMA
facetResult	TokenNameIdentifier
.	TokenNameDOT
getNumValidDescendants	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FacetSearchParams	TokenNameIdentifier
overSampledSearchParams	TokenNameIdentifier
(	TokenNameLPAREN
FacetSearchParams	TokenNameIdentifier
original	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FacetSearchParams	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
original	TokenNameIdentifier
;	TokenNameSEMICOLON
double	TokenNamedouble
overSampleFactor	TokenNameIdentifier
=	TokenNameEQUAL
getSamplingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getOversampleFactor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
overSampleFactor	TokenNameIdentifier
>	TokenNameGREATER
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FacetSearchParams	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
.	TokenNameDOT
getFacetIndexingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetRequest	TokenNameIdentifier
frq	TokenNameIdentifier
:	TokenNameCOLON
original	TokenNameIdentifier
.	TokenNameDOT
getFacetRequests	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
overSampledNumResults	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
ceil	TokenNameIdentifier
(	TokenNameLPAREN
frq	TokenNameIdentifier
.	TokenNameDOT
getNumResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
overSampleFactor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
addFacetRequest	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
OverSampledFacetRequest	TokenNameIdentifier
(	TokenNameLPAREN
frq	TokenNameIdentifier
,	TokenNameCOMMA
overSampledNumResults	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
OverSampledFacetRequest	TokenNameIdentifier
extends	TokenNameextends
FacetRequest	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
FacetRequest	TokenNameIdentifier
orig	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
OverSampledFacetRequest	TokenNameIdentifier
(	TokenNameLPAREN
FacetRequest	TokenNameIdentifier
orig	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
num	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
orig	TokenNameIdentifier
.	TokenNameDOT
getCategoryPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
num	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
orig	TokenNameIdentifier
=	TokenNameEQUAL
orig	TokenNameIdentifier
;	TokenNameSEMICOLON
setDepth	TokenNameIdentifier
(	TokenNameLPAREN
orig	TokenNameIdentifier
.	TokenNameDOT
getDepth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setNumLabel	TokenNameIdentifier
(	TokenNameLPAREN
orig	TokenNameIdentifier
.	TokenNameDOT
getNumLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setResultMode	TokenNameIdentifier
(	TokenNameLPAREN
orig	TokenNameIdentifier
.	TokenNameDOT
getResultMode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setSortBy	TokenNameIdentifier
(	TokenNameLPAREN
orig	TokenNameIdentifier
.	TokenNameDOT
getSortBy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setSortOrder	TokenNameIdentifier
(	TokenNameLPAREN
orig	TokenNameIdentifier
.	TokenNameDOT
getSortOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
CategoryListIterator	TokenNameIdentifier
createCategoryListIterator	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
TaxonomyReader	TokenNameIdentifier
taxo	TokenNameIdentifier
,	TokenNameCOMMA
FacetSearchParams	TokenNameIdentifier
sParams	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
partition	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
orig	TokenNameIdentifier
.	TokenNameDOT
createCategoryListIterator	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
taxo	TokenNameIdentifier
,	TokenNameCOMMA
sParams	TokenNameIdentifier
,	TokenNameCOMMA
partition	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Aggregator	TokenNameIdentifier
createAggregator	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
useComplements	TokenNameIdentifier
,	TokenNameCOMMA
FacetArrays	TokenNameIdentifier
arrays	TokenNameIdentifier
,	TokenNameCOMMA
IndexReader	TokenNameIdentifier
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
TaxonomyReader	TokenNameIdentifier
taxonomy	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
orig	TokenNameIdentifier
.	TokenNameDOT
createAggregator	TokenNameIdentifier
(	TokenNameLPAREN
useComplements	TokenNameIdentifier
,	TokenNameCOMMA
arrays	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxonomy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
double	TokenNamedouble
getValueOf	TokenNameIdentifier
(	TokenNameLPAREN
FacetArrays	TokenNameIdentifier
arrays	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
idx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
orig	TokenNameIdentifier
.	TokenNameDOT
getValueOf	TokenNameIdentifier
(	TokenNameLPAREN
arrays	TokenNameIdentifier
,	TokenNameCOMMA
idx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
requireDocumentScore	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
orig	TokenNameIdentifier
.	TokenNameDOT
requireDocumentScore	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
supportsComplements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
orig	TokenNameIdentifier
.	TokenNameDOT
supportsComplements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE