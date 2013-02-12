package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
example	TokenNameIdentifier
.	TokenNameDOT
simple	TokenNameIdentifier
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
store	TokenNameIdentifier
.	TokenNameDOT
Directory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
RAMDirectory	TokenNameIdentifier
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
example	TokenNameIdentifier
.	TokenNameDOT
ExampleResult	TokenNameIdentifier
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
example	TokenNameIdentifier
.	TokenNameDOT
ExampleUtils	TokenNameIdentifier
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
directory	TokenNameIdentifier
.	TokenNameDOT
DirectoryTaxonomyReader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SimpleMain	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
new	TokenNamenew
SimpleMain	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
runSimple	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
new	TokenNamenew
SimpleMain	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
runDrillDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getFacetResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ExampleUtils	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
"DONE"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ExampleResult	TokenNameIdentifier
runSimple	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
indexDir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RAMDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Directory	TokenNameIdentifier
taxoDir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RAMDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ExampleUtils	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
"index the sample documents..."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SimpleIndexer	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
(	TokenNameLPAREN
indexDir	TokenNameIdentifier
,	TokenNameCOMMA
taxoDir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TaxonomyReader	TokenNameIdentifier
taxo	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DirectoryTaxonomyReader	TokenNameIdentifier
(	TokenNameLPAREN
taxoDir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
indexReader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
indexDir	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ExampleUtils	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
"search the sample documents..."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
facetRes	TokenNameIdentifier
=	TokenNameEQUAL
SimpleSearcher	TokenNameIdentifier
.	TokenNameDOT
searchWithFacets	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
taxo	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
indexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ExampleResult	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ExampleResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
setFacetResults	TokenNameIdentifier
(	TokenNameLPAREN
facetRes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ExampleResult	TokenNameIdentifier
runDrillDown	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
indexDir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RAMDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Directory	TokenNameIdentifier
taxoDir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RAMDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ExampleUtils	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
"index the sample documents..."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SimpleIndexer	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
(	TokenNameLPAREN
indexDir	TokenNameIdentifier
,	TokenNameCOMMA
taxoDir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TaxonomyReader	TokenNameIdentifier
taxo	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DirectoryTaxonomyReader	TokenNameIdentifier
(	TokenNameLPAREN
taxoDir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
indexReader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
indexDir	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ExampleUtils	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
"search the sample documents..."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
FacetResult	TokenNameIdentifier
>	TokenNameGREATER
facetRes	TokenNameIdentifier
=	TokenNameEQUAL
SimpleSearcher	TokenNameIdentifier
.	TokenNameDOT
searchWithDrillDown	TokenNameIdentifier
(	TokenNameLPAREN
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
taxo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
taxo	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
indexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ExampleResult	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ExampleResult	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
setFacetResults	TokenNameIdentifier
(	TokenNameLPAREN
facetRes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
