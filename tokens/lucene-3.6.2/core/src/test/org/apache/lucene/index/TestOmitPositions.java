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
analysis	TokenNameIdentifier
.	TokenNameDOT
Analyzer	TokenNameIdentifier
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
MockAnalyzer	TokenNameIdentifier
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
Field	TokenNameIdentifier
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
FieldInfo	TokenNameIdentifier
.	TokenNameDOT
IndexOptions	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
LuceneTestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestOmitPositions	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testBasic	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
RandomIndexWriter	TokenNameIdentifier
w	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RandomIndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
dir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Document	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
"this is a test test"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
w	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
w	TokenNameIdentifier
.	TokenNameDOT
getReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
w	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TermPositions	TokenNameIdentifier
tp	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
termPositions	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
tp	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
tp	TokenNameIdentifier
.	TokenNameDOT
freq	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
tp	TokenNameIdentifier
.	TokenNameDOT
nextPosition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
tp	TokenNameIdentifier
.	TokenNameDOT
nextPosition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
TermDocs	TokenNameIdentifier
te	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
termDocs	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
te	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
te	TokenNameIdentifier
.	TokenNameDOT
freq	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
reader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dir	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testPositions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
ram	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
ram	TokenNameIdentifier
,	TokenNameCOMMA
newIndexWriterConfig	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Document	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f1	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f1"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs only"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f1	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f2	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f2"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs only"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f2	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f3	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f3"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs only"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f3	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f3	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f4	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f4"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f4	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f4	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f5	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f5"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f5	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f5	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f6	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f6"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f6	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f6	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f7	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f7"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs and positions"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f7	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f7	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f8	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f8"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs and positions"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f8	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f8	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f9	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f9"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs and positions"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f9	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f9	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
forceMerge	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Document	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f1	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f1"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs only"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f1	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f4	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f4"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs only"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f4	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f4	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f7	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f7"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs only"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f7	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f7	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f2	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f2"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f2	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f5	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f5"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f5	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f5	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f8	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f8"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f8	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f8	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f3	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f3"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs and positions"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f3	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f3	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f6	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f6"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs and positions"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f6	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f6	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f9	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f9"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has docs and freqs and positions"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f9	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f9	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
forceMerge	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SegmentReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
SegmentReader	TokenNameIdentifier
.	TokenNameDOT
getOnlySegmentReader	TokenNameIdentifier
(	TokenNameLPAREN
ram	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FieldInfos	TokenNameIdentifier
fi	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
getFieldInfos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
"f1"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
"f2"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
"f3"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
"f4"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
"f5"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
"f6"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
"f7"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
"f8"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
,	TokenNameCOMMA
fi	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
"f9"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
indexOptions	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ram	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
assertNoPrx	TokenNameIdentifier
(	TokenNameLPAREN
Directory	TokenNameIdentifier
dir	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Throwable	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
files	TokenNameIdentifier
=	TokenNameEQUAL
dir	TokenNameIdentifier
.	TokenNameDOT
listAll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
files	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
files	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
".prx"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
files	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
".pos"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoPrxFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Throwable	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
ram	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
ram	TokenNameIdentifier
,	TokenNameCOMMA
newIndexWriterConfig	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setMaxBufferedDocs	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
setMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
newLogMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
LogMergePolicy	TokenNameIdentifier
lmp	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
LogMergePolicy	TokenNameIdentifier
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
getConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lmp	TokenNameIdentifier
.	TokenNameDOT
setMergeFactor	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lmp	TokenNameIdentifier
.	TokenNameDOT
setUseCompoundFile	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Document	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
f1	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f1"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has term freqs"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f1	TokenNameIdentifier
.	TokenNameDOT
setIndexOptions	TokenNameIdentifier
(	TokenNameLPAREN
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
30	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
commit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNoPrx	TokenNameIdentifier
(	TokenNameLPAREN
ram	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Document	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f1	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"f1"	TokenNameStringLiteral
,	TokenNameCOMMA
"This field has positions"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
30	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
forceMerge	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNoPrx	TokenNameIdentifier
(	TokenNameLPAREN
ram	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ram	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE