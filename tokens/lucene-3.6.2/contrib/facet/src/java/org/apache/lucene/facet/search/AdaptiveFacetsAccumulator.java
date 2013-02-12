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
sampling	TokenNameIdentifier
.	TokenNameDOT
RandomSampler	TokenNameIdentifier
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
sampling	TokenNameIdentifier
.	TokenNameDOT
RepeatableSampler	TokenNameIdentifier
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
sampling	TokenNameIdentifier
.	TokenNameDOT
Sampler	TokenNameIdentifier
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
sampling	TokenNameIdentifier
.	TokenNameDOT
SamplingAccumulator	TokenNameIdentifier
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
final	TokenNamefinal
class	TokenNameclass
AdaptiveFacetsAccumulator	TokenNameIdentifier
extends	TokenNameextends
StandardFacetsAccumulator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Sampler	TokenNameIdentifier
sampler	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RandomSampler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
AdaptiveFacetsAccumulator	TokenNameIdentifier
(	TokenNameLPAREN
FacetSearchParams	TokenNameIdentifier
searchParams	TokenNameIdentifier
,	TokenNameCOMMA
IndexReader	TokenNameIdentifier
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
TaxonomyReader	TokenNameIdentifier
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
searchParams	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AdaptiveFacetsAccumulator	TokenNameIdentifier
(	TokenNameLPAREN
FacetSearchParams	TokenNameIdentifier
searchParams	TokenNameIdentifier
,	TokenNameCOMMA
IndexReader	TokenNameIdentifier
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
TaxonomyReader	TokenNameIdentifier
taxonomyReader	TokenNameIdentifier
,	TokenNameCOMMA
IntArrayAllocator	TokenNameIdentifier
intArrayAllocator	TokenNameIdentifier
,	TokenNameCOMMA
FloatArrayAllocator	TokenNameIdentifier
floatArrayAllocator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
searchParams	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
,	TokenNameCOMMA
intArrayAllocator	TokenNameIdentifier
,	TokenNameCOMMA
floatArrayAllocator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSampler	TokenNameIdentifier
(	TokenNameLPAREN
Sampler	TokenNameIdentifier
sampler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
sampler	TokenNameIdentifier
=	TokenNameEQUAL
sampler	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
accumulate	TokenNameIdentifier
(	TokenNameLPAREN
ScoredDocIDs	TokenNameIdentifier
docids	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
FacetsAccumulator	TokenNameIdentifier
delegee	TokenNameIdentifier
=	TokenNameEQUAL
appropriateFacetCountingAccumulator	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
delegee	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
this	TokenNamethis
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
accumulate	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
delegee	TokenNameIdentifier
.	TokenNameDOT
accumulate	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
FacetsAccumulator	TokenNameIdentifier
appropriateFacetCountingAccumulator	TokenNameIdentifier
(	TokenNameLPAREN
ScoredDocIDs	TokenNameIdentifier
docids	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
mayComplement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sampler	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
!	TokenNameNOT
sampler	TokenNameIdentifier
.	TokenNameDOT
shouldSample	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
SamplingAccumulator	TokenNameIdentifier
samplingAccumulator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SamplingAccumulator	TokenNameIdentifier
(	TokenNameLPAREN
sampler	TokenNameIdentifier
,	TokenNameCOMMA
searchParams	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
samplingAccumulator	TokenNameIdentifier
.	TokenNameDOT
setComplementThreshold	TokenNameIdentifier
(	TokenNameLPAREN
getComplementThreshold	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
samplingAccumulator	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
Sampler	TokenNameIdentifier
getSampler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
sampler	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
