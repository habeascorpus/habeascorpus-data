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
multiCL	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
MultiCLMain	TokenNameIdentifier
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
MultiCLMain	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
runSample	TokenNameIdentifier
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
runSample	TokenNameIdentifier
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
MultiCLIndexer	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
(	TokenNameLPAREN
indexDir	TokenNameIdentifier
,	TokenNameCOMMA
taxoDir	TokenNameIdentifier
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
MultiCLSearcher	TokenNameIdentifier
.	TokenNameDOT
searchWithFacets	TokenNameIdentifier
(	TokenNameLPAREN
indexDir	TokenNameIdentifier
,	TokenNameCOMMA
taxoDir	TokenNameIdentifier
,	TokenNameCOMMA
MultiCLIndexer	TokenNameIdentifier
.	TokenNameDOT
MULTI_IPARAMS	TokenNameIdentifier
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
