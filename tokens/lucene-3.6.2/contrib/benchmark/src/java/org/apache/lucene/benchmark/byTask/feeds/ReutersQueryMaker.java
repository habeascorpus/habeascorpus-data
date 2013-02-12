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
queryParser	TokenNameIdentifier
.	TokenNameDOT
QueryParser	TokenNameIdentifier
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
WildcardQuery	TokenNameIdentifier
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
spans	TokenNameIdentifier
.	TokenNameDOT
SpanFirstQuery	TokenNameIdentifier
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
spans	TokenNameIdentifier
.	TokenNameDOT
SpanNearQuery	TokenNameIdentifier
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
spans	TokenNameIdentifier
.	TokenNameDOT
SpanQuery	TokenNameIdentifier
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
spans	TokenNameIdentifier
.	TokenNameDOT
SpanTermQuery	TokenNameIdentifier
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
byTask	TokenNameIdentifier
.	TokenNameDOT
tasks	TokenNameIdentifier
.	TokenNameDOT
NewAnalyzerTask	TokenNameIdentifier
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
Version	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ReutersQueryMaker	TokenNameIdentifier
extends	TokenNameextends
AbstractQueryMaker	TokenNameIdentifier
implements	TokenNameimplements
QueryMaker	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
STANDARD_QUERIES	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"Salomon"	TokenNameStringLiteral
,	TokenNameCOMMA
"Comex"	TokenNameStringLiteral
,	TokenNameCOMMA
"night trading"	TokenNameStringLiteral
,	TokenNameCOMMA
"Japan Sony"	TokenNameStringLiteral
,	TokenNameCOMMA
""Sony Japan""	TokenNameStringLiteral
,	TokenNameCOMMA
""food needs"~3"	TokenNameStringLiteral
,	TokenNameCOMMA
""World Bank"^2 AND Nigeria"	TokenNameStringLiteral
,	TokenNameCOMMA
""World Bank" -Nigeria"	TokenNameStringLiteral
,	TokenNameCOMMA
""Ford Credit"~5"	TokenNameStringLiteral
,	TokenNameCOMMA
"airline Europe Canada destination"	TokenNameStringLiteral
,	TokenNameCOMMA
"Long term pressure by trade "	TokenNameStringLiteral
+	TokenNamePLUS
"ministers is necessary if the current Uruguay round of talks on "	TokenNameStringLiteral
+	TokenNamePLUS
"the General Agreement on Trade and Tariffs (GATT) is to "	TokenNameStringLiteral
+	TokenNamePLUS
"succeed"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Query	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getPrebuiltQueries	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
field	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Query	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
SpanFirstQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
"ford"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
SpanNearQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SpanQuery	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
"night"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
"trading"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
SpanNearQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SpanQuery	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
SpanFirstQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
"ford"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
SpanTermQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
"credit"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
10	TokenNameIntegerLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
WildcardQuery	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
"fo*"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
Query	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
createQueries	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
qs	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
a	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
QueryParser	TokenNameIdentifier
qp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QueryParser	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
.	TokenNameDOT
LUCENE_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
DocMaker	TokenNameIdentifier
.	TokenNameDOT
BODY_FIELD	TokenNameIdentifier
,	TokenNameCOMMA
a	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
queries	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
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
qs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Object	TokenNameIdentifier
query	TokenNameIdentifier
=	TokenNameEQUAL
qs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
query	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
q	TokenNameIdentifier
=	TokenNameEQUAL
qp	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
query	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
query	TokenNameIdentifier
instanceof	TokenNameinstanceof
Query	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
q	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Query	TokenNameIdentifier
)	TokenNameRPAREN
query	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Unsupported Query Type: "	TokenNameStringLiteral
+	TokenNamePLUS
query	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
q	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
queries	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
queries	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Query	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
Query	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
prepareQueries	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Analyzer	TokenNameIdentifier
anlzr	TokenNameIdentifier
=	TokenNameEQUAL
NewAnalyzerTask	TokenNameIdentifier
.	TokenNameDOT
createAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
config	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"analyzer"	TokenNameStringLiteral
,	TokenNameCOMMA
"org.apache.lucene.analysis.standard.StandardAnalyzer"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
queryList	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
20	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
queryList	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
STANDARD_QUERIES	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
queryList	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
getPrebuiltQueries	TokenNameIdentifier
(	TokenNameLPAREN
DocMaker	TokenNameIdentifier
.	TokenNameDOT
BODY_FIELD	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
createQueries	TokenNameIdentifier
(	TokenNameLPAREN
queryList	TokenNameIdentifier
,	TokenNameCOMMA
anlzr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE