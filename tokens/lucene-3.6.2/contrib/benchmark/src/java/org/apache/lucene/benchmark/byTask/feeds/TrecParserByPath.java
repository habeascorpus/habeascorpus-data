package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
feeds	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TrecParserByPath	TokenNameIdentifier
extends	TokenNameextends
TrecDocParser	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
DocData	TokenNameIdentifier
parse	TokenNameIdentifier
(	TokenNameLPAREN
DocData	TokenNameIdentifier
docData	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
TrecContentSource	TokenNameIdentifier
trecSrc	TokenNameIdentifier
,	TokenNameCOMMA
StringBuilder	TokenNameIdentifier
docBuf	TokenNameIdentifier
,	TokenNameCOMMA
ParsePathType	TokenNameIdentifier
pathType	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
InterruptedException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
pathType2parser	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
pathType	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
docData	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
,	TokenNameCOMMA
trecSrc	TokenNameIdentifier
,	TokenNameCOMMA
docBuf	TokenNameIdentifier
,	TokenNameCOMMA
pathType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
