package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
standard	TokenNameIdentifier
.	TokenNameDOT
builders	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
QueryNodeException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
builders	TokenNameIdentifier
.	TokenNameDOT
QueryTreeBuilder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
nodes	TokenNameIdentifier
.	TokenNameDOT
BoostQueryNode	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
nodes	TokenNameIdentifier
.	TokenNameDOT
QueryNode	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
BoostQueryNodeBuilder	TokenNameIdentifier
implements	TokenNameimplements
StandardQueryBuilder	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
BoostQueryNodeBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Query	TokenNameIdentifier
build	TokenNameIdentifier
(	TokenNameLPAREN
QueryNode	TokenNameIdentifier
queryNode	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
QueryNodeException	TokenNameIdentifier
{	TokenNameLBRACE
BoostQueryNode	TokenNameIdentifier
boostNode	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
BoostQueryNode	TokenNameIdentifier
)	TokenNameRPAREN
queryNode	TokenNameIdentifier
;	TokenNameSEMICOLON
QueryNode	TokenNameIdentifier
child	TokenNameIdentifier
=	TokenNameEQUAL
boostNode	TokenNameIdentifier
.	TokenNameDOT
getChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
child	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Query	TokenNameIdentifier
query	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Query	TokenNameIdentifier
)	TokenNameRPAREN
child	TokenNameIdentifier
.	TokenNameDOT
getTag	TokenNameIdentifier
(	TokenNameLPAREN
QueryTreeBuilder	TokenNameIdentifier
.	TokenNameDOT
QUERY_TREE_BUILDER_TAGID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
query	TokenNameIdentifier
.	TokenNameDOT
setBoost	TokenNameIdentifier
(	TokenNameLPAREN
boostNode	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
query	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
