package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
join	TokenNameIdentifier
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
IndexSearcher	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
JoinUtil	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
JoinUtil	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Query	TokenNameIdentifier
createJoinQuery	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fromField	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
toField	TokenNameIdentifier
,	TokenNameCOMMA
Query	TokenNameIdentifier
fromQuery	TokenNameIdentifier
,	TokenNameCOMMA
IndexSearcher	TokenNameIdentifier
fromSearcher	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
TermsCollector	TokenNameIdentifier
termsCollector	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermsCollector	TokenNameIdentifier
(	TokenNameLPAREN
fromField	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fromSearcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
fromQuery	TokenNameIdentifier
,	TokenNameCOMMA
termsCollector	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
TermsQuery	TokenNameIdentifier
(	TokenNameLPAREN
toField	TokenNameIdentifier
,	TokenNameCOMMA
termsCollector	TokenNameIdentifier
.	TokenNameDOT
getCollectorTerms	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE