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
BooleanQuery	TokenNameIdentifier
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
facet	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
params	TokenNameIdentifier
.	TokenNameDOT
CategoryListParams	TokenNameIdentifier
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
index	TokenNameIdentifier
.	TokenNameDOT
params	TokenNameIdentifier
.	TokenNameDOT
FacetIndexingParams	TokenNameIdentifier
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
taxonomy	TokenNameIdentifier
.	TokenNameDOT
CategoryPath	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
DrillDown	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Term	TokenNameIdentifier
term	TokenNameIdentifier
(	TokenNameLPAREN
FacetSearchParams	TokenNameIdentifier
sParams	TokenNameIdentifier
,	TokenNameCOMMA
CategoryPath	TokenNameIdentifier
path	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
term	TokenNameIdentifier
(	TokenNameLPAREN
sParams	TokenNameIdentifier
.	TokenNameDOT
getFacetIndexingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
path	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Term	TokenNameIdentifier
term	TokenNameIdentifier
(	TokenNameLPAREN
FacetIndexingParams	TokenNameIdentifier
iParams	TokenNameIdentifier
,	TokenNameCOMMA
CategoryPath	TokenNameIdentifier
path	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CategoryListParams	TokenNameIdentifier
clp	TokenNameIdentifier
=	TokenNameEQUAL
iParams	TokenNameIdentifier
.	TokenNameDOT
getCategoryListParams	TokenNameIdentifier
(	TokenNameLPAREN
path	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
path	TokenNameIdentifier
.	TokenNameDOT
charsNeededForFullPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
iParams	TokenNameIdentifier
.	TokenNameDOT
drillDownTermText	TokenNameIdentifier
(	TokenNameLPAREN
path	TokenNameIdentifier
,	TokenNameCOMMA
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
clp	TokenNameIdentifier
.	TokenNameDOT
getTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createTerm	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Query	TokenNameIdentifier
query	TokenNameIdentifier
(	TokenNameLPAREN
FacetIndexingParams	TokenNameIdentifier
iParams	TokenNameIdentifier
,	TokenNameCOMMA
CategoryPath	TokenNameIdentifier
...	TokenNameELLIPSIS
paths	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
paths	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
paths	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Empty category path not allowed for drill down query!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
paths	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
paths	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
BooleanQuery	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BooleanQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
CategoryPath	TokenNameIdentifier
cp	TokenNameIdentifier
:	TokenNameCOLON
paths	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
cp	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Occur	TokenNameIdentifier
.	TokenNameDOT
MUST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Query	TokenNameIdentifier
query	TokenNameIdentifier
(	TokenNameLPAREN
FacetSearchParams	TokenNameIdentifier
sParams	TokenNameIdentifier
,	TokenNameCOMMA
CategoryPath	TokenNameIdentifier
...	TokenNameELLIPSIS
paths	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
query	TokenNameIdentifier
(	TokenNameLPAREN
sParams	TokenNameIdentifier
.	TokenNameDOT
getFacetIndexingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
paths	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Query	TokenNameIdentifier
query	TokenNameIdentifier
(	TokenNameLPAREN
FacetIndexingParams	TokenNameIdentifier
iParams	TokenNameIdentifier
,	TokenNameCOMMA
Query	TokenNameIdentifier
baseQuery	TokenNameIdentifier
,	TokenNameCOMMA
CategoryPath	TokenNameIdentifier
...	TokenNameELLIPSIS
paths	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
BooleanQuery	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BooleanQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
baseQuery	TokenNameIdentifier
,	TokenNameCOMMA
Occur	TokenNameIdentifier
.	TokenNameDOT
MUST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
paths	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
Occur	TokenNameIdentifier
.	TokenNameDOT
MUST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Query	TokenNameIdentifier
query	TokenNameIdentifier
(	TokenNameLPAREN
FacetSearchParams	TokenNameIdentifier
sParams	TokenNameIdentifier
,	TokenNameCOMMA
Query	TokenNameIdentifier
baseQuery	TokenNameIdentifier
,	TokenNameCOMMA
CategoryPath	TokenNameIdentifier
...	TokenNameELLIPSIS
paths	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
query	TokenNameIdentifier
(	TokenNameLPAREN
sParams	TokenNameIdentifier
.	TokenNameDOT
getFacetIndexingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
baseQuery	TokenNameIdentifier
,	TokenNameCOMMA
paths	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Query	TokenNameIdentifier
query	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
baseQuery	TokenNameIdentifier
,	TokenNameCOMMA
CategoryPath	TokenNameIdentifier
...	TokenNameELLIPSIS
paths	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
query	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FacetSearchParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
baseQuery	TokenNameIdentifier
,	TokenNameCOMMA
paths	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
