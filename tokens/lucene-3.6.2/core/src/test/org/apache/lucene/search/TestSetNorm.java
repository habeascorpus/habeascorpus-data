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
*	TokenNameMULTIPLY
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
index	TokenNameIdentifier
.	TokenNameDOT
IndexWriter	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
TestSetNorm	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testSetNorm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Directory	TokenNameIdentifier
store	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
store	TokenNameIdentifier
,	TokenNameCOMMA
newIndexWriterConfig	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Fieldable	TokenNameIdentifier
f1	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
"field"	TokenNameStringLiteral
,	TokenNameCOMMA
"word"	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
YES	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
ANALYZED	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Document	TokenNameIdentifier
d1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Document	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d1	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
store	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
setNorm	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
"field"	TokenNameStringLiteral
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
setNorm	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
"field"	TokenNameStringLiteral
,	TokenNameCOMMA
2.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
setNorm	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
"field"	TokenNameStringLiteral
,	TokenNameCOMMA
4.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
setNorm	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
"field"	TokenNameStringLiteral
,	TokenNameCOMMA
16.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
scores	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
IndexReader	TokenNameIdentifier
ir	TokenNameIdentifier
=	TokenNameEQUAL
IndexReader	TokenNameIdentifier
.	TokenNameDOT
open	TokenNameIdentifier
(	TokenNameLPAREN
store	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexSearcher	TokenNameIdentifier
is	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexSearcher	TokenNameIdentifier
(	TokenNameLPAREN
ir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
is	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
TermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"field"	TokenNameStringLiteral
,	TokenNameCOMMA
"word"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Collector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
base	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Scorer	TokenNameIdentifier
scorer	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setScorer	TokenNameIdentifier
(	TokenNameLPAREN
Scorer	TokenNameIdentifier
scorer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
scorer	TokenNameIdentifier
=	TokenNameEQUAL
scorer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
collect	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
scores	TokenNameIdentifier
[	TokenNameLBRACKET
doc	TokenNameIdentifier
+	TokenNamePLUS
base	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
scorer	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
setNextReader	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
docBase	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
base	TokenNameIdentifier
=	TokenNameEQUAL
docBase	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
acceptsDocsOutOfOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
is	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ir	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
lastScore	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
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
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
scores	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
>	TokenNameGREATER
lastScore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastScore	TokenNameIdentifier
=	TokenNameEQUAL
scores	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
store	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE