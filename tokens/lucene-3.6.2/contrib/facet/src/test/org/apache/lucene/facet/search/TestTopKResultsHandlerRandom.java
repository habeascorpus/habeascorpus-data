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
search	TokenNameIdentifier
.	TokenNameDOT
MatchAllDocsQuery	TokenNameIdentifier
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
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
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
taxonomy	TokenNameIdentifier
.	TokenNameDOT
TaxonomyReader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestTopKResultsHandlerRandom	TokenNameIdentifier
extends	TokenNameextends
BaseTestTopK	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
countFacets	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
partitionSize	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numResults	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
doComplement	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
IllegalAccessException	TokenNameIdentifier
,	TokenNameCOMMA
InstantiationException	TokenNameIdentifier
{	TokenNameLBRACE
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MatchAllDocsQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FacetSearchParams	TokenNameIdentifier
facetSearchParams	TokenNameIdentifier
=	TokenNameEQUAL
searchParamsWithRequests	TokenNameIdentifier
(	TokenNameLPAREN
numResults	TokenNameIdentifier
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
facetSearchParams	TokenNameIdentifier
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
accumulator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StandardFacetsAccumulator	TokenNameIdentifier
(	TokenNameLPAREN
facetSearchParams	TokenNameIdentifier
,	TokenNameCOMMA
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
complement	TokenNameIdentifier
=	TokenNameEQUAL
doComplement	TokenNameIdentifier
?	TokenNameQUESTION
FacetsAccumulator	TokenNameIdentifier
.	TokenNameDOT
FORCE_COMPLEMENT	TokenNameIdentifier
:	TokenNameCOLON
FacetsAccumulator	TokenNameIdentifier
.	TokenNameDOT
DISABLE_COMPLEMENT	TokenNameIdentifier
;	TokenNameSEMICOLON
accumulator	TokenNameIdentifier
.	TokenNameDOT
setComplementThreshold	TokenNameIdentifier
(	TokenNameLPAREN
complement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
accumulator	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
fc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
facetResults	TokenNameIdentifier
=	TokenNameEQUAL
fc	TokenNameIdentifier
.	TokenNameDOT
getFacetResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
facetResults	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testTopCountsOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
partitionSize	TokenNameIdentifier
:	TokenNameCOLON
partitionSizes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
initIndex	TokenNameIdentifier
(	TokenNameLPAREN
partitionSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
facetResults	TokenNameIdentifier
=	TokenNameEQUAL
countFacets	TokenNameIdentifier
(	TokenNameLPAREN
partitionSize	TokenNameIdentifier
,	TokenNameCOMMA
100000	TokenNameIntegerLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertCountsAndCardinality	TokenNameIdentifier
(	TokenNameLPAREN
facetCountsTruth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
facetResults	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
facetResults	TokenNameIdentifier
=	TokenNameEQUAL
countFacets	TokenNameIdentifier
(	TokenNameLPAREN
partitionSize	TokenNameIdentifier
,	TokenNameCOMMA
100000	TokenNameIntegerLiteral
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertCountsAndCardinality	TokenNameIdentifier
(	TokenNameLPAREN
facetCountsTruth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
facetResults	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
allFacetResults	TokenNameIdentifier
=	TokenNameEQUAL
countFacets	TokenNameIdentifier
(	TokenNameLPAREN
partitionSize	TokenNameIdentifier
,	TokenNameCOMMA
100000	TokenNameIntegerLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
all	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
maxNumNodes	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
k	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetResult	TokenNameIdentifier
fr	TokenNameIdentifier
:	TokenNameCOLON
allFacetResults	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FacetResultNode	TokenNameIdentifier
topResNode	TokenNameIdentifier
=	TokenNameEQUAL
fr	TokenNameIdentifier
.	TokenNameDOT
getFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
maxNumNodes	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
maxNumNodes	TokenNameIdentifier
,	TokenNameCOMMA
topResNode	TokenNameIdentifier
.	TokenNameDOT
getNumSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
prevCount	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetResultNode	TokenNameIdentifier
frn	TokenNameIdentifier
:	TokenNameCOLON
topResNode	TokenNameIdentifier
.	TokenNameDOT
getSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"wrong counts order: prev="	TokenNameStringLiteral
+	TokenNamePLUS
prevCount	TokenNameIdentifier
+	TokenNamePLUS
" curr="	TokenNameStringLiteral
+	TokenNamePLUS
frn	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
prevCount	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
frn	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
prevCount	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
frn	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
k	TokenNameIdentifier
+	TokenNamePLUS
"--"	TokenNameStringLiteral
+	TokenNamePLUS
frn	TokenNameIdentifier
.	TokenNameDOT
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"=="	TokenNameStringLiteral
+	TokenNamePLUS
frn	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
frn	TokenNameIdentifier
.	TokenNameDOT
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" - "	TokenNameStringLiteral
+	TokenNamePLUS
frn	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"  "	TokenNameStringLiteral
+	TokenNamePLUS
key	TokenNameIdentifier
+	TokenNamePLUS
"  "	TokenNameStringLiteral
+	TokenNamePLUS
pos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
all	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
pos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
k	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
n	TokenNameIdentifier
<	TokenNameLESS
maxNumNodes	TokenNameIdentifier
;	TokenNameSEMICOLON
n	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"-------  verify for "	TokenNameStringLiteral
+	TokenNamePLUS
n	TokenNameIdentifier
+	TokenNamePLUS
" top results"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
someResults	TokenNameIdentifier
=	TokenNameEQUAL
countFacets	TokenNameIdentifier
(	TokenNameLPAREN
partitionSize	TokenNameIdentifier
,	TokenNameCOMMA
n	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
k	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetResult	TokenNameIdentifier
fr	TokenNameIdentifier
:	TokenNameCOLON
someResults	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FacetResultNode	TokenNameIdentifier
topResNode	TokenNameIdentifier
=	TokenNameEQUAL
fr	TokenNameIdentifier
.	TokenNameDOT
getFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"too many results: n="	TokenNameStringLiteral
+	TokenNamePLUS
n	TokenNameIdentifier
+	TokenNamePLUS
" but got "	TokenNameStringLiteral
+	TokenNamePLUS
topResNode	TokenNameIdentifier
.	TokenNameDOT
getNumSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
n	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
topResNode	TokenNameIdentifier
.	TokenNameDOT
getNumSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetResultNode	TokenNameIdentifier
frn	TokenNameIdentifier
:	TokenNameCOLON
topResNode	TokenNameIdentifier
.	TokenNameDOT
getSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
k	TokenNameIdentifier
+	TokenNamePLUS
"--"	TokenNameStringLiteral
+	TokenNamePLUS
frn	TokenNameIdentifier
.	TokenNameDOT
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"=="	TokenNameStringLiteral
+	TokenNamePLUS
frn	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
frn	TokenNameIdentifier
.	TokenNameDOT
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" - "	TokenNameStringLiteral
+	TokenNamePLUS
frn	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"  "	TokenNameStringLiteral
+	TokenNamePLUS
key	TokenNameIdentifier
+	TokenNamePLUS
"  "	TokenNameStringLiteral
+	TokenNamePLUS
pos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Integer	TokenNameIdentifier
origPos	TokenNameIdentifier
=	TokenNameEQUAL
all	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"missing in all results: "	TokenNameStringLiteral
+	TokenNamePLUS
frn	TokenNameIdentifier
,	TokenNameCOMMA
origPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"wrong order of sub-results!"	TokenNameStringLiteral
,	TokenNameCOMMA
pos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
,	TokenNameCOMMA
origPos	TokenNameIdentifier
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
k	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
closeAll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
int	TokenNameint
numDocsToIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
TEST_NIGHTLY	TokenNameIdentifier
?	TokenNameQUESTION
20000	TokenNameIntegerLiteral
:	TokenNameCOLON
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
