package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
BitVector	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
AllTermDocs	TokenNameIdentifier
extends	TokenNameextends
AbstractAllTermDocs	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
BitVector	TokenNameIdentifier
deletedDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AllTermDocs	TokenNameIdentifier
(	TokenNameLPAREN
SegmentReader	TokenNameIdentifier
parent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
parent	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
parent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
deletedDocs	TokenNameIdentifier
=	TokenNameEQUAL
parent	TokenNameIdentifier
.	TokenNameDOT
deletedDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
isDeleted	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
deletedDocs	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
deletedDocs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
