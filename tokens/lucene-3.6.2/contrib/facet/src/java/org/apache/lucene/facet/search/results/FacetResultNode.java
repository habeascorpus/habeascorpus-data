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
results	TokenNameIdentifier
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
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
FacetResultsHandler	TokenNameIdentifier
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
sampling	TokenNameIdentifier
.	TokenNameDOT
SampleFixer	TokenNameIdentifier
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
interface	TokenNameinterface
FacetResultNode	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getOrdinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
CategoryPath	TokenNameIdentifier
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
CategoryPath	TokenNameIdentifier
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
TaxonomyReader	TokenNameIdentifier
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
double	TokenNamedouble
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
double	TokenNamedouble
getResidue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
Iterable	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
getSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
getNumSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setValue	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
