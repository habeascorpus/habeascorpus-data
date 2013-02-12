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
taxonomy	TokenNameIdentifier
.	TokenNameDOT
TaxonomyReader	TokenNameIdentifier
.	TokenNameDOT
ChildrenArrays	TokenNameIdentifier
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
ResultSortUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TopKFacetResultsHandler	TokenNameIdentifier
extends	TokenNameextends
FacetResultsHandler	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
TopKFacetResultsHandler	TokenNameIdentifier
(	TokenNameLPAREN
TaxonomyReader	TokenNameIdentifier
taxonomyReader	TokenNameIdentifier
,	TokenNameCOMMA
FacetRequest	TokenNameIdentifier
facetRequest	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
taxonomyReader	TokenNameIdentifier
,	TokenNameCOMMA
facetRequest	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
IntermediateFacetResult	TokenNameIdentifier
fetchPartitionResult	TokenNameIdentifier
(	TokenNameLPAREN
FacetArrays	TokenNameIdentifier
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
TopKFacetResult	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
ordinal	TokenNameIdentifier
=	TokenNameEQUAL
taxonomyReader	TokenNameIdentifier
.	TokenNameDOT
getOrdinal	TokenNameIdentifier
(	TokenNameLPAREN
facetRequest	TokenNameIdentifier
.	TokenNameDOT
getCategoryPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ordinal	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
TaxonomyReader	TokenNameIdentifier
.	TokenNameDOT
INVALID_ORDINAL	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
value	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isSelfPartition	TokenNameIdentifier
(	TokenNameLPAREN
ordinal	TokenNameIdentifier
,	TokenNameCOMMA
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
partitionSize	TokenNameIdentifier
=	TokenNameEQUAL
facetArrays	TokenNameIdentifier
.	TokenNameDOT
getArraysLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
value	TokenNameIdentifier
=	TokenNameEQUAL
facetRequest	TokenNameIdentifier
.	TokenNameDOT
getValueOf	TokenNameIdentifier
(	TokenNameLPAREN
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
ordinal	TokenNameIdentifier
%	TokenNameREMAINDER
partitionSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
MutableFacetResultNode	TokenNameIdentifier
parentResultNode	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MutableFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
ordinal	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Heap	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
heap	TokenNameIdentifier
=	TokenNameEQUAL
ResultSortUtils	TokenNameIdentifier
.	TokenNameDOT
createSuitableHeap	TokenNameIdentifier
(	TokenNameLPAREN
facetRequest	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
totalFacets	TokenNameIdentifier
=	TokenNameEQUAL
heapDescendants	TokenNameIdentifier
(	TokenNameLPAREN
ordinal	TokenNameIdentifier
,	TokenNameCOMMA
heap	TokenNameIdentifier
,	TokenNameCOMMA
parentResultNode	TokenNameIdentifier
,	TokenNameCOMMA
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TopKFacetResult	TokenNameIdentifier
(	TokenNameLPAREN
facetRequest	TokenNameIdentifier
,	TokenNameCOMMA
parentResultNode	TokenNameIdentifier
,	TokenNameCOMMA
totalFacets	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
setHeap	TokenNameIdentifier
(	TokenNameLPAREN
heap	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
IntermediateFacetResult	TokenNameIdentifier
mergeResults	TokenNameIdentifier
(	TokenNameLPAREN
IntermediateFacetResult	TokenNameIdentifier
...	TokenNameELLIPSIS
tmpResults	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
ordinal	TokenNameIdentifier
=	TokenNameEQUAL
taxonomyReader	TokenNameIdentifier
.	TokenNameDOT
getOrdinal	TokenNameIdentifier
(	TokenNameLPAREN
facetRequest	TokenNameIdentifier
.	TokenNameDOT
getCategoryPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MutableFacetResultNode	TokenNameIdentifier
resNode	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MutableFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
ordinal	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
totalFacets	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Heap	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
heap	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
IntermediateFacetResult	TokenNameIdentifier
tmpFres	TokenNameIdentifier
:	TokenNameCOLON
tmpResults	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TopKFacetResult	TokenNameIdentifier
fres	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TopKFacetResult	TokenNameIdentifier
)	TokenNameRPAREN
tmpFres	TokenNameIdentifier
;	TokenNameSEMICOLON
totalFacets	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
fres	TokenNameIdentifier
.	TokenNameDOT
getNumValidDescendants	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
resNode	TokenNameIdentifier
.	TokenNameDOT
increaseValue	TokenNameIdentifier
(	TokenNameLPAREN
fres	TokenNameIdentifier
.	TokenNameDOT
getFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Heap	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
tmpHeap	TokenNameIdentifier
=	TokenNameEQUAL
fres	TokenNameIdentifier
.	TokenNameDOT
getHeap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
heap	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
heap	TokenNameIdentifier
=	TokenNameEQUAL
tmpHeap	TokenNameIdentifier
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
tmpHeap	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
FacetResultNode	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
heap	TokenNameIdentifier
.	TokenNameDOT
insertWithOverflow	TokenNameIdentifier
(	TokenNameLPAREN
tmpHeap	TokenNameIdentifier
.	TokenNameDOT
pop	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
a	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
resNode	TokenNameIdentifier
.	TokenNameDOT
increaseResidue	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
.	TokenNameDOT
getResidue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
TopKFacetResult	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TopKFacetResult	TokenNameIdentifier
(	TokenNameLPAREN
facetRequest	TokenNameIdentifier
,	TokenNameCOMMA
resNode	TokenNameIdentifier
,	TokenNameCOMMA
totalFacets	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
setHeap	TokenNameIdentifier
(	TokenNameLPAREN
heap	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
heapDescendants	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ordinal	TokenNameIdentifier
,	TokenNameCOMMA
Heap	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
pq	TokenNameIdentifier
,	TokenNameCOMMA
MutableFacetResultNode	TokenNameIdentifier
parentResultNode	TokenNameIdentifier
,	TokenNameCOMMA
FacetArrays	TokenNameIdentifier
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
partitionSize	TokenNameIdentifier
=	TokenNameEQUAL
facetArrays	TokenNameIdentifier
.	TokenNameDOT
getArraysLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
endOffset	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
+	TokenNamePLUS
partitionSize	TokenNameIdentifier
;	TokenNameSEMICOLON
ChildrenArrays	TokenNameIdentifier
childrenArray	TokenNameIdentifier
=	TokenNameEQUAL
taxonomyReader	TokenNameIdentifier
.	TokenNameDOT
getChildrenArrays	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
youngestChild	TokenNameIdentifier
=	TokenNameEQUAL
childrenArray	TokenNameIdentifier
.	TokenNameDOT
getYoungestChildArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
olderSibling	TokenNameIdentifier
=	TokenNameEQUAL
childrenArray	TokenNameIdentifier
.	TokenNameDOT
getOlderSiblingArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FacetResultNode	TokenNameIdentifier
reusable	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
localDepth	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
depth	TokenNameIdentifier
=	TokenNameEQUAL
facetRequest	TokenNameIdentifier
.	TokenNameDOT
getDepth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ordinalStack	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
+	TokenNamePLUS
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
Short	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
depth	TokenNameIdentifier
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
childrenCounter	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
tosOrdinal	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
yc	TokenNameIdentifier
=	TokenNameEQUAL
youngestChild	TokenNameIdentifier
[	TokenNameLBRACKET
ordinal	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
yc	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
endOffset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
yc	TokenNameIdentifier
=	TokenNameEQUAL
olderSibling	TokenNameIdentifier
[	TokenNameLBRACKET
yc	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ordinalStack	TokenNameIdentifier
[	TokenNameLBRACKET
++	TokenNamePLUS_PLUS
localDepth	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
yc	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
localDepth	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
tosOrdinal	TokenNameIdentifier
=	TokenNameEQUAL
ordinalStack	TokenNameIdentifier
[	TokenNameLBRACKET
localDepth	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tosOrdinal	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
TaxonomyReader	TokenNameIdentifier
.	TokenNameDOT
INVALID_ORDINAL	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
localDepth	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
ordinalStack	TokenNameIdentifier
[	TokenNameLBRACKET
localDepth	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
olderSibling	TokenNameIdentifier
[	TokenNameLBRACKET
ordinalStack	TokenNameIdentifier
[	TokenNameLBRACKET
localDepth	TokenNameIdentifier
]	TokenNameRBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
tosOrdinal	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
offset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
relativeOrdinal	TokenNameIdentifier
=	TokenNameEQUAL
tosOrdinal	TokenNameIdentifier
%	TokenNameREMAINDER
partitionSize	TokenNameIdentifier
;	TokenNameSEMICOLON
double	TokenNamedouble
value	TokenNameIdentifier
=	TokenNameEQUAL
facetRequest	TokenNameIdentifier
.	TokenNameDOT
getValueOf	TokenNameIdentifier
(	TokenNameLPAREN
facetArrays	TokenNameIdentifier
,	TokenNameCOMMA
relativeOrdinal	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
!	TokenNameNOT
Double	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
reusable	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
reusable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MutableFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
tosOrdinal	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
(	TokenNameLPAREN
(	TokenNameLPAREN
MutableFacetResultNode	TokenNameIdentifier
)	TokenNameRPAREN
reusable	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
tosOrdinal	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
++	TokenNamePLUS_PLUS
childrenCounter	TokenNameIdentifier
;	TokenNameSEMICOLON
reusable	TokenNameIdentifier
=	TokenNameEQUAL
pq	TokenNameIdentifier
.	TokenNameDOT
insertWithOverflow	TokenNameIdentifier
(	TokenNameLPAREN
reusable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
reusable	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
parentResultNode	TokenNameIdentifier
.	TokenNameDOT
increaseResidue	TokenNameIdentifier
(	TokenNameLPAREN
reusable	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
localDepth	TokenNameIdentifier
<	TokenNameLESS
depth	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
yc	TokenNameIdentifier
=	TokenNameEQUAL
youngestChild	TokenNameIdentifier
[	TokenNameLBRACKET
tosOrdinal	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
yc	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
endOffset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
yc	TokenNameIdentifier
=	TokenNameEQUAL
olderSibling	TokenNameIdentifier
[	TokenNameLBRACKET
yc	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ordinalStack	TokenNameIdentifier
[	TokenNameLBRACKET
++	TokenNamePLUS_PLUS
localDepth	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
yc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
ordinalStack	TokenNameIdentifier
[	TokenNameLBRACKET
++	TokenNamePLUS_PLUS
localDepth	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
TaxonomyReader	TokenNameIdentifier
.	TokenNameDOT
INVALID_ORDINAL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
childrenCounter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
FacetResult	TokenNameIdentifier
renderFacetResult	TokenNameIdentifier
(	TokenNameLPAREN
IntermediateFacetResult	TokenNameIdentifier
tmpResult	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TopKFacetResult	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TopKFacetResult	TokenNameIdentifier
)	TokenNameRPAREN
tmpResult	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Heap	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
heap	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
getHeap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MutableFacetResultNode	TokenNameIdentifier
resNode	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MutableFacetResultNode	TokenNameIdentifier
)	TokenNameRPAREN
res	TokenNameIdentifier
.	TokenNameDOT
getFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
heap	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
resNode	TokenNameIdentifier
.	TokenNameDOT
insertSubResult	TokenNameIdentifier
(	TokenNameLPAREN
heap	TokenNameIdentifier
.	TokenNameDOT
pop	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
FacetResult	TokenNameIdentifier
rearrangeFacetResult	TokenNameIdentifier
(	TokenNameLPAREN
FacetResult	TokenNameIdentifier
facetResult	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TopKFacetResult	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TopKFacetResult	TokenNameIdentifier
)	TokenNameRPAREN
facetResult	TokenNameIdentifier
;	TokenNameSEMICOLON
Heap	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
heap	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
getHeap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
heap	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MutableFacetResultNode	TokenNameIdentifier
topFrn	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MutableFacetResultNode	TokenNameIdentifier
)	TokenNameRPAREN
res	TokenNameIdentifier
.	TokenNameDOT
getFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetResultNode	TokenNameIdentifier
frn	TokenNameIdentifier
:	TokenNameCOLON
topFrn	TokenNameIdentifier
.	TokenNameDOT
getSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
heap	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
frn	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
heap	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
subResults	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
heap	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
subResults	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
heap	TokenNameIdentifier
.	TokenNameDOT
pop	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
topFrn	TokenNameIdentifier
.	TokenNameDOT
setSubResults	TokenNameIdentifier
(	TokenNameLPAREN
subResults	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
labelResult	TokenNameIdentifier
(	TokenNameLPAREN
FacetResult	TokenNameIdentifier
facetResult	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
facetResult	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
FacetResultNode	TokenNameIdentifier
facetResultNode	TokenNameIdentifier
=	TokenNameEQUAL
facetResult	TokenNameIdentifier
.	TokenNameDOT
getFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
facetResultNode	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
facetResultNode	TokenNameIdentifier
.	TokenNameDOT
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
num2label	TokenNameIdentifier
=	TokenNameEQUAL
facetRequest	TokenNameIdentifier
.	TokenNameDOT
getNumLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetResultNode	TokenNameIdentifier
frn	TokenNameIdentifier
:	TokenNameCOLON
facetResultNode	TokenNameIdentifier
.	TokenNameDOT
getSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
--	TokenNameMINUS_MINUS
num2label	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
frn	TokenNameIdentifier
.	TokenNameDOT
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
TopKFacetResult	TokenNameIdentifier
extends	TokenNameextends
FacetResult	TokenNameIdentifier
implements	TokenNameimplements
IntermediateFacetResult	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Heap	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
heap	TokenNameIdentifier
;	TokenNameSEMICOLON
TopKFacetResult	TokenNameIdentifier
(	TokenNameLPAREN
FacetRequest	TokenNameIdentifier
facetRequest	TokenNameIdentifier
,	TokenNameCOMMA
MutableFacetResultNode	TokenNameIdentifier
facetResultNode	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
totalFacets	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
facetRequest	TokenNameIdentifier
,	TokenNameCOMMA
facetResultNode	TokenNameIdentifier
,	TokenNameCOMMA
totalFacets	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Heap	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
getHeap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
heap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setHeap	TokenNameIdentifier
(	TokenNameLPAREN
Heap	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
heap	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
heap	TokenNameIdentifier
=	TokenNameEQUAL
heap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
