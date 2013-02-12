package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
enhancements	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
TokenStream	TokenNameIdentifier
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
enhancements	TokenNameIdentifier
.	TokenNameDOT
params	TokenNameIdentifier
.	TokenNameDOT
EnhancementsIndexingParams	TokenNameIdentifier
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
CategoryDocumentBuilder	TokenNameIdentifier
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
attributes	TokenNameIdentifier
.	TokenNameDOT
CategoryProperty	TokenNameIdentifier
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
streaming	TokenNameIdentifier
.	TokenNameDOT
CategoryAttributesStream	TokenNameIdentifier
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
streaming	TokenNameIdentifier
.	TokenNameDOT
CategoryListTokenizer	TokenNameIdentifier
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
streaming	TokenNameIdentifier
.	TokenNameDOT
CategoryParentsStream	TokenNameIdentifier
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
streaming	TokenNameIdentifier
.	TokenNameDOT
CategoryTokenizer	TokenNameIdentifier
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
TaxonomyWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
EnhancementsDocumentBuilder	TokenNameIdentifier
extends	TokenNameextends
CategoryDocumentBuilder	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
EnhancementsDocumentBuilder	TokenNameIdentifier
(	TokenNameLPAREN
TaxonomyWriter	TokenNameIdentifier
taxonomyWriter	TokenNameIdentifier
,	TokenNameCOMMA
EnhancementsIndexingParams	TokenNameIdentifier
params	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
taxonomyWriter	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
TokenStream	TokenNameIdentifier
getParentsStream	TokenNameIdentifier
(	TokenNameLPAREN
CategoryAttributesStream	TokenNameIdentifier
categoryAttributesStream	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Class	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
CategoryProperty	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
toRetainList	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
EnhancementsIndexingParams	TokenNameIdentifier
)	TokenNameRPAREN
indexingParams	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getRetainableProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
toRetainList	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
CategoryParentsStream	TokenNameIdentifier
categoryParentsStream	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CategoryParentsStream	TokenNameIdentifier
(	TokenNameLPAREN
categoryAttributesStream	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyWriter	TokenNameIdentifier
,	TokenNameCOMMA
indexingParams	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Class	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
CategoryProperty	TokenNameIdentifier
>	TokenNameGREATER
toRetain	TokenNameIdentifier
:	TokenNameCOLON
toRetainList	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
categoryParentsStream	TokenNameIdentifier
.	TokenNameDOT
addRetainableProperty	TokenNameIdentifier
(	TokenNameLPAREN
toRetain	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
categoryParentsStream	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getParentsStream	TokenNameIdentifier
(	TokenNameLPAREN
categoryAttributesStream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
CategoryListTokenizer	TokenNameIdentifier
getCategoryListTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
TokenStream	TokenNameIdentifier
categoryStream	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CategoryListTokenizer	TokenNameIdentifier
tokenizer	TokenNameIdentifier
=	TokenNameEQUAL
super	TokenNamesuper
.	TokenNameDOT
getCategoryListTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
categoryStream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
CategoryEnhancement	TokenNameIdentifier
enhancement	TokenNameIdentifier
:	TokenNameCOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
EnhancementsIndexingParams	TokenNameIdentifier
)	TokenNameRPAREN
indexingParams	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getCategoryEnhancements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
enhancement	TokenNameIdentifier
.	TokenNameDOT
generatesCategoryList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
tokenizer	TokenNameIdentifier
=	TokenNameEQUAL
enhancement	TokenNameIdentifier
.	TokenNameDOT
getCategoryListTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
tokenizer	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
EnhancementsIndexingParams	TokenNameIdentifier
)	TokenNameRPAREN
indexingParams	TokenNameIdentifier
,	TokenNameCOMMA
taxonomyWriter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
tokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
CategoryTokenizer	TokenNameIdentifier
getCategoryTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
TokenStream	TokenNameIdentifier
categoryStream	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
EnhancementsCategoryTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
categoryStream	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
EnhancementsIndexingParams	TokenNameIdentifier
)	TokenNameRPAREN
indexingParams	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
