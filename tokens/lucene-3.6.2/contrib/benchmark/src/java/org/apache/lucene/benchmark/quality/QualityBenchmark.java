package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
quality	TokenNameIdentifier
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
PrintWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
quality	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
DocNameExtractor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
quality	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
SubmissionReport	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
ScoreDoc	TokenNameIdentifier
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
TopDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
QualityBenchmark	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
QualityQuery	TokenNameIdentifier
qualityQueries	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
protected	TokenNameprotected
QualityQueryParser	TokenNameIdentifier
qqParser	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
IndexSearcher	TokenNameIdentifier
searcher	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
docNameField	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
maxQueries	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
maxResults	TokenNameIdentifier
=	TokenNameEQUAL
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
QualityBenchmark	TokenNameIdentifier
(	TokenNameLPAREN
QualityQuery	TokenNameIdentifier
qqs	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
QualityQueryParser	TokenNameIdentifier
qqParser	TokenNameIdentifier
,	TokenNameCOMMA
IndexSearcher	TokenNameIdentifier
searcher	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
docNameField	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
qualityQueries	TokenNameIdentifier
=	TokenNameEQUAL
qqs	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
qqParser	TokenNameIdentifier
=	TokenNameEQUAL
qqParser	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
searcher	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
docNameField	TokenNameIdentifier
=	TokenNameEQUAL
docNameField	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
QualityStats	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
execute	TokenNameIdentifier
(	TokenNameLPAREN
Judge	TokenNameIdentifier
judge	TokenNameIdentifier
,	TokenNameCOMMA
SubmissionReport	TokenNameIdentifier
submitRep	TokenNameIdentifier
,	TokenNameCOMMA
PrintWriter	TokenNameIdentifier
qualityLog	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
nQueries	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
maxQueries	TokenNameIdentifier
,	TokenNameCOMMA
qualityQueries	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
QualityStats	TokenNameIdentifier
stats	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
QualityStats	TokenNameIdentifier
[	TokenNameLBRACKET
nQueries	TokenNameIdentifier
]	TokenNameRBRACKET
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
nQueries	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
QualityQuery	TokenNameIdentifier
qq	TokenNameIdentifier
=	TokenNameEQUAL
qualityQueries	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
qqParser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
qq	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
t1	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TopDocs	TokenNameIdentifier
td	TokenNameIdentifier
=	TokenNameEQUAL
searcher	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
maxResults	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
searchTime	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
t1	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
judge	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
analyzeQueryResults	TokenNameIdentifier
(	TokenNameLPAREN
qq	TokenNameIdentifier
,	TokenNameCOMMA
q	TokenNameIdentifier
,	TokenNameCOMMA
td	TokenNameIdentifier
,	TokenNameCOMMA
judge	TokenNameIdentifier
,	TokenNameCOMMA
qualityLog	TokenNameIdentifier
,	TokenNameCOMMA
searchTime	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
submitRep	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
submitRep	TokenNameIdentifier
.	TokenNameDOT
report	TokenNameIdentifier
(	TokenNameLPAREN
qq	TokenNameIdentifier
,	TokenNameCOMMA
td	TokenNameIdentifier
,	TokenNameCOMMA
docNameField	TokenNameIdentifier
,	TokenNameCOMMA
searcher	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
submitRep	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
submitRep	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
stats	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
QualityStats	TokenNameIdentifier
analyzeQueryResults	TokenNameIdentifier
(	TokenNameLPAREN
QualityQuery	TokenNameIdentifier
qq	TokenNameIdentifier
,	TokenNameCOMMA
Query	TokenNameIdentifier
q	TokenNameIdentifier
,	TokenNameCOMMA
TopDocs	TokenNameIdentifier
td	TokenNameIdentifier
,	TokenNameCOMMA
Judge	TokenNameIdentifier
judge	TokenNameIdentifier
,	TokenNameCOMMA
PrintWriter	TokenNameIdentifier
logger	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
searchTime	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
QualityStats	TokenNameIdentifier
stts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QualityStats	TokenNameIdentifier
(	TokenNameLPAREN
judge	TokenNameIdentifier
.	TokenNameDOT
maxRecall	TokenNameIdentifier
(	TokenNameLPAREN
qq	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
searchTime	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ScoreDoc	TokenNameIdentifier
sd	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
td	TokenNameIdentifier
.	TokenNameDOT
scoreDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
t1	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DocNameExtractor	TokenNameIdentifier
xt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocNameExtractor	TokenNameIdentifier
(	TokenNameLPAREN
docNameField	TokenNameIdentifier
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
sd	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
docName	TokenNameIdentifier
=	TokenNameEQUAL
xt	TokenNameIdentifier
.	TokenNameDOT
docName	TokenNameIdentifier
(	TokenNameLPAREN
searcher	TokenNameIdentifier
,	TokenNameCOMMA
sd	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
docNameExtractTime	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
t1	TokenNameIdentifier
;	TokenNameSEMICOLON
t1	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isRelevant	TokenNameIdentifier
=	TokenNameEQUAL
judge	TokenNameIdentifier
.	TokenNameDOT
isRelevant	TokenNameIdentifier
(	TokenNameLPAREN
docName	TokenNameIdentifier
,	TokenNameCOMMA
qq	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stts	TokenNameIdentifier
.	TokenNameDOT
addResult	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
isRelevant	TokenNameIdentifier
,	TokenNameCOMMA
docNameExtractTime	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
qq	TokenNameIdentifier
.	TokenNameDOT
getQueryID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"  -  "	TokenNameStringLiteral
+	TokenNamePLUS
q	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stts	TokenNameIdentifier
.	TokenNameDOT
log	TokenNameIdentifier
(	TokenNameLPAREN
qq	TokenNameIdentifier
.	TokenNameDOT
getQueryID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" Stats:"	TokenNameStringLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
logger	TokenNameIdentifier
,	TokenNameCOMMA
"  "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
stts	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getMaxQueries	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
maxQueries	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setMaxQueries	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
maxQueries	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
maxQueries	TokenNameIdentifier
=	TokenNameEQUAL
maxQueries	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getMaxResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
maxResults	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setMaxResults	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
maxResults	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
maxResults	TokenNameIdentifier
=	TokenNameEQUAL
maxResults	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
