package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
Closeable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
FieldSelector	TokenNameIdentifier
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
CorruptIndexException	TokenNameIdentifier
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
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
interface	TokenNameinterface
Searchable	TokenNameIdentifier
extends	TokenNameextends
Closeable	TokenNameIdentifier
{	TokenNameLBRACE
void	TokenNamevoid
search	TokenNameIdentifier
(	TokenNameLPAREN
Weight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
Collector	TokenNameIdentifier
collector	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
docFreq	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
term	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
docFreqs	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
terms	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
TopDocs	TokenNameIdentifier
search	TokenNameIdentifier
(	TokenNameLPAREN
Weight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
n	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
doc	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
CorruptIndexException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
doc	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
n	TokenNameIdentifier
,	TokenNameCOMMA
FieldSelector	TokenNameIdentifier
fieldSelector	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
CorruptIndexException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
rewrite	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
query	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
Explanation	TokenNameIdentifier
explain	TokenNameIdentifier
(	TokenNameLPAREN
Weight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
TopFieldDocs	TokenNameIdentifier
search	TokenNameIdentifier
(	TokenNameLPAREN
Weight	TokenNameIdentifier
weight	TokenNameIdentifier
,	TokenNameCOMMA
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
n	TokenNameIdentifier
,	TokenNameCOMMA
Sort	TokenNameIdentifier
sort	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
