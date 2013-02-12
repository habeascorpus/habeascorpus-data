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
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
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
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
logging	TokenNameIdentifier
.	TokenNameDOT
Level	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
logging	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
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
IntermediateFacetResult	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
PartitionsUtils	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
ScoredDocIdsUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
StandardFacetsAccumulator	TokenNameIdentifier
extends	TokenNameextends
FacetsAccumulator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
StandardFacetsAccumulator	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
IntArrayAllocator	TokenNameIdentifier
intArrayAllocator	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
FloatArrayAllocator	TokenNameIdentifier
floatArrayAllocator	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
partitionSize	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
maxPartitions	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
isUsingComplements	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
TotalFacetCounts	TokenNameIdentifier
totalFacetCounts	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Object	TokenNameIdentifier
accumulateGuard	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
StandardFacetsAccumulator	TokenNameIdentifier
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
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
realPartitionSize	TokenNameIdentifier
=	TokenNameEQUAL
intArrayAllocator	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
floatArrayAllocator	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
PartitionsUtils	TokenNameIdentifier
.	TokenNameDOT
partitionSize	TokenNameIdentifier
(	TokenNameLPAREN
searchParams	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
intArrayAllocator	TokenNameIdentifier
=	TokenNameEQUAL
intArrayAllocator	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
intArrayAllocator	TokenNameIdentifier
:	TokenNameCOLON
new	TokenNamenew
IntArrayAllocator	TokenNameIdentifier
(	TokenNameLPAREN
realPartitionSize	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
floatArrayAllocator	TokenNameIdentifier
=	TokenNameEQUAL
floatArrayAllocator	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
floatArrayAllocator	TokenNameIdentifier
:	TokenNameCOLON
new	TokenNamenew
FloatArrayAllocator	TokenNameIdentifier
(	TokenNameLPAREN
realPartitionSize	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
isUsingComplements	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
partitionSize	TokenNameIdentifier
=	TokenNameEQUAL
PartitionsUtils	TokenNameIdentifier
.	TokenNameDOT
partitionSize	TokenNameIdentifier
(	TokenNameLPAREN
searchParams	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
maxPartitions	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
ceil	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
taxonomyReader	TokenNameIdentifier
.	TokenNameDOT
getSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
partitionSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
accumulateGuard	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
StandardFacetsAccumulator	TokenNameIdentifier
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
this	TokenNamethis
(	TokenNameLPAREN
searchParams	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
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
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
accumulateGuard	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
isUsingComplements	TokenNameIdentifier
=	TokenNameEQUAL
shouldComplement	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isUsingComplements	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
totalFacetCounts	TokenNameIdentifier
=	TokenNameEQUAL
TotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
getSingleton	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getTotalCounts	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
,	TokenNameCOMMA
searchParams	TokenNameIdentifier
.	TokenNameDOT
getFacetIndexingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
searchParams	TokenNameIdentifier
.	TokenNameDOT
getClCache	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
totalFacetCounts	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
docids	TokenNameIdentifier
=	TokenNameEQUAL
ScoredDocIdsUtils	TokenNameIdentifier
.	TokenNameDOT
getComplementSet	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
isUsingComplements	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
UnsupportedOperationException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
isLoggable	TokenNameIdentifier
(	TokenNameLPAREN
Level	TokenNameIdentifier
.	TokenNameDOT
FINEST	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
Level	TokenNameIdentifier
.	TokenNameDOT
FINEST	TokenNameIdentifier
,	TokenNameCOMMA
"IndexReader used does not support completents: "	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
isUsingComplements	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
isLoggable	TokenNameIdentifier
(	TokenNameLPAREN
Level	TokenNameIdentifier
.	TokenNameDOT
FINEST	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
Level	TokenNameIdentifier
.	TokenNameDOT
FINEST	TokenNameIdentifier
,	TokenNameCOMMA
"Failed to load/calculate total counts (complement counting disabled): "	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
isUsingComplements	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
IOException	TokenNameIdentifier
ioEx	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"PANIC: Got unexpected exception while trying to get/calculate total counts: "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ioEx	TokenNameIdentifier
.	TokenNameDOT
initCause	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
ioEx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
docids	TokenNameIdentifier
=	TokenNameEQUAL
actualDocsToAccumulate	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FacetArrays	TokenNameIdentifier
facetArrays	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FacetArrays	TokenNameIdentifier
(	TokenNameLPAREN
intArrayAllocator	TokenNameIdentifier
,	TokenNameCOMMA
floatArrayAllocator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
HashMap	TokenNameIdentifier
<	TokenNameLESS
FacetRequest	TokenNameIdentifier
,	TokenNameCOMMA
IntermediateFacetResult	TokenNameIdentifier
>	TokenNameGREATER
fr2tmpRes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
FacetRequest	TokenNameIdentifier
,	TokenNameCOMMA
IntermediateFacetResult	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
part	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
part	TokenNameIdentifier
<	TokenNameLESS
maxPartitions	TokenNameIdentifier
;	TokenNameSEMICOLON
part	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
fillArraysForPartition	TokenNameIdentifier
(	TokenNameLPAREN
docids	TokenNameIdentifier
,	TokenNameCOMMA
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
part	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
part	TokenNameIdentifier
*	TokenNameMULTIPLY
partitionSize	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetRequest	TokenNameIdentifier
fr	TokenNameIdentifier
:	TokenNameCOLON
searchParams	TokenNameIdentifier
.	TokenNameDOT
getFacetRequests	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
FacetResultsHandler	TokenNameIdentifier
frHndlr	TokenNameIdentifier
=	TokenNameEQUAL
fr	TokenNameIdentifier
.	TokenNameDOT
createFacetResultsHandler	TokenNameIdentifier
(	TokenNameLPAREN
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IntermediateFacetResult	TokenNameIdentifier
res4fr	TokenNameIdentifier
=	TokenNameEQUAL
frHndlr	TokenNameIdentifier
.	TokenNameDOT
fetchPartitionResult	TokenNameIdentifier
(	TokenNameLPAREN
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IntermediateFacetResult	TokenNameIdentifier
oldRes	TokenNameIdentifier
=	TokenNameEQUAL
fr2tmpRes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
oldRes	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
res4fr	TokenNameIdentifier
=	TokenNameEQUAL
frHndlr	TokenNameIdentifier
.	TokenNameDOT
mergeResults	TokenNameIdentifier
(	TokenNameLPAREN
oldRes	TokenNameIdentifier
,	TokenNameCOMMA
res4fr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fr2tmpRes	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
fr	TokenNameIdentifier
,	TokenNameCOMMA
res4fr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
facetArrays	TokenNameIdentifier
.	TokenNameDOT
free	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetRequest	TokenNameIdentifier
fr	TokenNameIdentifier
:	TokenNameCOLON
searchParams	TokenNameIdentifier
.	TokenNameDOT
getFacetRequests	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
FacetResultsHandler	TokenNameIdentifier
frHndlr	TokenNameIdentifier
=	TokenNameEQUAL
fr	TokenNameIdentifier
.	TokenNameDOT
createFacetResultsHandler	TokenNameIdentifier
(	TokenNameLPAREN
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IntermediateFacetResult	TokenNameIdentifier
tmpResult	TokenNameIdentifier
=	TokenNameEQUAL
fr2tmpRes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tmpResult	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
FacetResult	TokenNameIdentifier
facetRes	TokenNameIdentifier
=	TokenNameEQUAL
frHndlr	TokenNameIdentifier
.	TokenNameDOT
renderFacetResult	TokenNameIdentifier
(	TokenNameLPAREN
tmpResult	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isAllowLabeling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
frHndlr	TokenNameIdentifier
.	TokenNameDOT
labelResult	TokenNameIdentifier
(	TokenNameLPAREN
facetRes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
res	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
facetRes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
ScoredDocIDs	TokenNameIdentifier
actualDocsToAccumulate	TokenNameIdentifier
(	TokenNameLPAREN
ScoredDocIDs	TokenNameIdentifier
docids	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
docids	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
shouldComplement	TokenNameIdentifier
(	TokenNameLPAREN
ScoredDocIDs	TokenNameIdentifier
docids	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
mayComplement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
docids	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
indexReader	TokenNameIdentifier
.	TokenNameDOT
numDocs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
getComplementThreshold	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
void	TokenNamevoid
fillArraysForPartition	TokenNameIdentifier
(	TokenNameLPAREN
ScoredDocIDs	TokenNameIdentifier
docids	TokenNameIdentifier
,	TokenNameCOMMA
FacetArrays	TokenNameIdentifier
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
partition	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isUsingComplements	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
initArraysByTotalCounts	TokenNameIdentifier
(	TokenNameLPAREN
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
partition	TokenNameIdentifier
,	TokenNameCOMMA
docids	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
facetArrays	TokenNameIdentifier
.	TokenNameDOT
free	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
HashMap	TokenNameIdentifier
<	TokenNameLESS
CategoryListIterator	TokenNameIdentifier
,	TokenNameCOMMA
Aggregator	TokenNameIdentifier
>	TokenNameGREATER
categoryLists	TokenNameIdentifier
=	TokenNameEQUAL
getCategoryListMap	TokenNameIdentifier
(	TokenNameLPAREN
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
partition	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
<	TokenNameLESS
CategoryListIterator	TokenNameIdentifier
,	TokenNameCOMMA
Aggregator	TokenNameIdentifier
>	TokenNameGREATER
entry	TokenNameIdentifier
:	TokenNameCOLON
categoryLists	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
CategoryListIterator	TokenNameIdentifier
categoryList	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
categoryList	TokenNameIdentifier
.	TokenNameDOT
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Aggregator	TokenNameIdentifier
categorator	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoredDocIDsIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
=	TokenNameEQUAL
docids	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
docID	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
.	TokenNameDOT
getDocID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
categoryList	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
docID	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
categorator	TokenNameIdentifier
.	TokenNameDOT
setNextDoc	TokenNameIdentifier
(	TokenNameLPAREN
docID	TokenNameIdentifier
,	TokenNameCOMMA
iterator	TokenNameIdentifier
.	TokenNameDOT
getScore	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
ordinal	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
ordinal	TokenNameIdentifier
=	TokenNameEQUAL
categoryList	TokenNameIdentifier
.	TokenNameDOT
nextCategory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
categorator	TokenNameIdentifier
.	TokenNameDOT
aggregate	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
ordinal	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
void	TokenNamevoid
initArraysByTotalCounts	TokenNameIdentifier
(	TokenNameLPAREN
FacetArrays	TokenNameIdentifier
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
partition	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
nAccumulatedDocs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
intArray	TokenNameIdentifier
=	TokenNameEQUAL
facetArrays	TokenNameIdentifier
.	TokenNameDOT
getIntArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
totalFacetCounts	TokenNameIdentifier
.	TokenNameDOT
fillTotalCountsForPartition	TokenNameIdentifier
(	TokenNameLPAREN
intArray	TokenNameIdentifier
,	TokenNameCOMMA
partition	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
totalCountsFactor	TokenNameIdentifier
=	TokenNameEQUAL
getTotalCountsFactor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
totalCountsFactor	TokenNameIdentifier
<	TokenNameLESS
0.99999	TokenNameDoubleLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
delta	TokenNameIdentifier
=	TokenNameEQUAL
nAccumulatedDocs	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
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
intArray	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
intArray	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
*=	TokenNameMULTIPLY_EQUAL
totalCountsFactor	TokenNameIdentifier
;	TokenNameSEMICOLON
intArray	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
+=	TokenNamePLUS_EQUAL
delta	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
double	TokenNamedouble
getTotalCountsFactor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
HashMap	TokenNameIdentifier
<	TokenNameLESS
CategoryListIterator	TokenNameIdentifier
,	TokenNameCOMMA
Aggregator	TokenNameIdentifier
>	TokenNameGREATER
getCategoryListMap	TokenNameIdentifier
(	TokenNameLPAREN
FacetArrays	TokenNameIdentifier
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
partition	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
HashMap	TokenNameIdentifier
<	TokenNameLESS
CategoryListIterator	TokenNameIdentifier
,	TokenNameCOMMA
Aggregator	TokenNameIdentifier
>	TokenNameGREATER
categoryLists	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
CategoryListIterator	TokenNameIdentifier
,	TokenNameCOMMA
Aggregator	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetRequest	TokenNameIdentifier
facetRequest	TokenNameIdentifier
:	TokenNameCOLON
searchParams	TokenNameIdentifier
.	TokenNameDOT
getFacetRequests	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Aggregator	TokenNameIdentifier
categoryAggregator	TokenNameIdentifier
=	TokenNameEQUAL
facetRequest	TokenNameIdentifier
.	TokenNameDOT
createAggregator	TokenNameIdentifier
(	TokenNameLPAREN
isUsingComplements	TokenNameIdentifier
,	TokenNameCOMMA
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CategoryListIterator	TokenNameIdentifier
cli	TokenNameIdentifier
=	TokenNameEQUAL
facetRequest	TokenNameIdentifier
.	TokenNameDOT
createCategoryListIterator	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
,	TokenNameCOMMA
searchParams	TokenNameIdentifier
,	TokenNameCOMMA
partition	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Aggregator	TokenNameIdentifier
old	TokenNameIdentifier
=	TokenNameEQUAL
categoryLists	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
cli	TokenNameIdentifier
,	TokenNameCOMMA
categoryAggregator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
old	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
old	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
categoryAggregator	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"Overriding existing category list with different aggregator. THAT'S A NO NO!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
categoryLists	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE