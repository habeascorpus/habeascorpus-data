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
.	TokenNameDOT
trec	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedReader	TokenNameIdentifier
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
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
StringTokenizer	TokenNameIdentifier
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
Judge	TokenNameIdentifier
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
QualityQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TrecJudge	TokenNameIdentifier
implements	TokenNameimplements
Judge	TokenNameIdentifier
{	TokenNameLBRACE
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
QRelJudgement	TokenNameIdentifier
>	TokenNameGREATER
judgements	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
TrecJudge	TokenNameIdentifier
(	TokenNameLPAREN
BufferedReader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
judgements	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
QRelJudgement	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
QRelJudgement	TokenNameIdentifier
curr	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
String	TokenNameIdentifier
zero	TokenNameIdentifier
=	TokenNameEQUAL
"0"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
line	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
(	TokenNameLPAREN
line	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
line	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
'#'	TokenNameCharacterLiteral
==	TokenNameEQUAL_EQUAL
line	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
StringTokenizer	TokenNameIdentifier
st	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
queryID	TokenNameIdentifier
=	TokenNameEQUAL
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
docName	TokenNameIdentifier
=	TokenNameEQUAL
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
relevant	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
zero	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
!	TokenNameNOT
st	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
"wrong format: "	TokenNameStringLiteral
+	TokenNamePLUS
line	TokenNameIdentifier
+	TokenNamePLUS
"  next: "	TokenNameStringLiteral
+	TokenNamePLUS
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
relevant	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
curr	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
!	TokenNameNOT
curr	TokenNameIdentifier
.	TokenNameDOT
queryID	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
queryID	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
curr	TokenNameIdentifier
=	TokenNameEQUAL
judgements	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
queryID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
curr	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
curr	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QRelJudgement	TokenNameIdentifier
(	TokenNameLPAREN
queryID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
judgements	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
queryID	TokenNameIdentifier
,	TokenNameCOMMA
curr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
curr	TokenNameIdentifier
.	TokenNameDOT
addRelevandDoc	TokenNameIdentifier
(	TokenNameLPAREN
docName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
reader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isRelevant	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
docName	TokenNameIdentifier
,	TokenNameCOMMA
QualityQuery	TokenNameIdentifier
query	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
QRelJudgement	TokenNameIdentifier
qrj	TokenNameIdentifier
=	TokenNameEQUAL
judgements	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
.	TokenNameDOT
getQueryID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
qrj	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
qrj	TokenNameIdentifier
.	TokenNameDOT
isRelevant	TokenNameIdentifier
(	TokenNameLPAREN
docName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
QRelJudgement	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
queryID	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
relevantDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
QRelJudgement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
queryID	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
queryID	TokenNameIdentifier
=	TokenNameEQUAL
queryID	TokenNameIdentifier
;	TokenNameSEMICOLON
relevantDocs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addRelevandDoc	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
docName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
relevantDocs	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
docName	TokenNameIdentifier
,	TokenNameCOMMA
docName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
boolean	TokenNameboolean
isRelevant	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
docName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
relevantDocs	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
docName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
maxRecall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
relevantDocs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
validateData	TokenNameIdentifier
(	TokenNameLPAREN
QualityQuery	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
qq	TokenNameIdentifier
,	TokenNameCOMMA
PrintWriter	TokenNameIdentifier
logger	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
QRelJudgement	TokenNameIdentifier
>	TokenNameGREATER
missingQueries	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
QRelJudgement	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
judgements	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
missingJudgements	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
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
qq	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
id	TokenNameIdentifier
=	TokenNameEQUAL
qq	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getQueryID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
missingQueries	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
missingQueries	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
missingJudgements	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
boolean	TokenNameboolean
isValid	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
missingJudgements	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
isValid	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
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
"WARNING: "	TokenNameStringLiteral
+	TokenNamePLUS
missingJudgements	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" queries have no judgments! - "	TokenNameStringLiteral
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
missingJudgements	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"   "	TokenNameStringLiteral
+	TokenNamePLUS
missingJudgements	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
missingQueries	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
isValid	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
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
"WARNING: "	TokenNameStringLiteral
+	TokenNamePLUS
missingQueries	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" judgments match no query! - "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
id	TokenNameIdentifier
:	TokenNameCOLON
missingQueries	TokenNameIdentifier
.	TokenNameDOT
keySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"   "	TokenNameStringLiteral
+	TokenNamePLUS
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
isValid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
maxRecall	TokenNameIdentifier
(	TokenNameLPAREN
QualityQuery	TokenNameIdentifier
query	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
QRelJudgement	TokenNameIdentifier
qrj	TokenNameIdentifier
=	TokenNameEQUAL
judgements	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
.	TokenNameDOT
getQueryID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
qrj	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
qrj	TokenNameIdentifier
.	TokenNameDOT
maxRecall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
