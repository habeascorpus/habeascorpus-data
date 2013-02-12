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
PrintWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
NumberFormat	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
QualityStats	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
MAX_POINTS	TokenNameIdentifier
=	TokenNameEQUAL
20	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
maxGoodPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
recall	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
pAt	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
pReleventSum	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
numPoints	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
numGoodPoints	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
mrr	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
searchTime	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
docNamesExtractTime	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
RecallPoint	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
rank	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
recall	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
RecallPoint	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
rank	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
recall	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
rank	TokenNameIdentifier
=	TokenNameEQUAL
rank	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
recall	TokenNameIdentifier
=	TokenNameEQUAL
recall	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getRank	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
rank	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getRecall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
recall	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
ArrayList	TokenNameIdentifier
<	TokenNameLESS
RecallPoint	TokenNameIdentifier
>	TokenNameGREATER
recallPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
QualityStats	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
maxGoodPoints	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
searchTime	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
maxGoodPoints	TokenNameIdentifier
=	TokenNameEQUAL
maxGoodPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
searchTime	TokenNameIdentifier
=	TokenNameEQUAL
searchTime	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
recallPoints	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
RecallPoint	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pAt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
MAX_POINTS	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addResult	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
n	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isRelevant	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
docNameExtractTime	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
numPoints	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
-	TokenNameMINUS
n	TokenNameIdentifier
)	TokenNameRPAREN
>	TokenNameGREATER
1E-6	TokenNameDoubleLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"point "	TokenNameStringLiteral
+	TokenNamePLUS
n	TokenNameIdentifier
+	TokenNamePLUS
" illegal after "	TokenNameStringLiteral
+	TokenNamePLUS
numPoints	TokenNameIdentifier
+	TokenNamePLUS
" points!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
isRelevant	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
numGoodPoints	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
recallPoints	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
RecallPoint	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
,	TokenNameCOMMA
numGoodPoints	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
recallPoints	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
&&	TokenNameAND_AND
n	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
mrr	TokenNameIdentifier
=	TokenNameEQUAL
1.0	TokenNameDoubleLiteral
/	TokenNameDIVIDE
n	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
numPoints	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
;	TokenNameSEMICOLON
double	TokenNamedouble
p	TokenNameIdentifier
=	TokenNameEQUAL
numGoodPoints	TokenNameIdentifier
/	TokenNameDIVIDE
numPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isRelevant	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pReleventSum	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
p	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
<	TokenNameLESS
pAt	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pAt	TokenNameIdentifier
[	TokenNameLBRACKET
n	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
p	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
recall	TokenNameIdentifier
=	TokenNameEQUAL
maxGoodPoints	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
p	TokenNameIdentifier
:	TokenNameCOLON
numGoodPoints	TokenNameIdentifier
/	TokenNameDIVIDE
maxGoodPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
docNamesExtractTime	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
docNameExtractTime	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getPrecisionAt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
||	TokenNameOR_OR
n	TokenNameIdentifier
>	TokenNameGREATER
MAX_POINTS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"n="	TokenNameStringLiteral
+	TokenNamePLUS
n	TokenNameIdentifier
+	TokenNamePLUS
" - but it must be in [1,"	TokenNameStringLiteral
+	TokenNamePLUS
MAX_POINTS	TokenNameIdentifier
+	TokenNamePLUS
"] range!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
>	TokenNameGREATER
numPoints	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
numPoints	TokenNameIdentifier
*	TokenNameMULTIPLY
pAt	TokenNameIdentifier
[	TokenNameLBRACKET
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
numPoints	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
/	TokenNameDIVIDE
n	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
pAt	TokenNameIdentifier
[	TokenNameLBRACKET
n	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getAvp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
maxGoodPoints	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
pReleventSum	TokenNameIdentifier
/	TokenNameDIVIDE
maxGoodPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getRecall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
recall	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
log	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
title	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
paddLines	TokenNameIdentifier
,	TokenNameCOMMA
PrintWriter	TokenNameIdentifier
logger	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
prefix	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
paddLines	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
title	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
title	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
title	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
prefix	TokenNameIdentifier
=	TokenNameEQUAL
prefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
NumberFormat	TokenNameIdentifier
nf	TokenNameIdentifier
=	TokenNameEQUAL
NumberFormat	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nf	TokenNameIdentifier
.	TokenNameDOT
setMaximumFractionDigits	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nf	TokenNameIdentifier
.	TokenNameDOT
setMinimumFractionDigits	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nf	TokenNameIdentifier
.	TokenNameDOT
setGroupingUsed	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
M	TokenNameIdentifier
=	TokenNameEQUAL
19	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
"Search Seconds: "	TokenNameStringLiteral
,	TokenNameCOMMA
M	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
fracFormat	TokenNameIdentifier
(	TokenNameLPAREN
nf	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
searchTime	TokenNameIdentifier
/	TokenNameDIVIDE
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
"DocName Seconds: "	TokenNameStringLiteral
,	TokenNameCOMMA
M	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
fracFormat	TokenNameIdentifier
(	TokenNameLPAREN
nf	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
docNamesExtractTime	TokenNameIdentifier
/	TokenNameDIVIDE
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
"Num Points: "	TokenNameStringLiteral
,	TokenNameCOMMA
M	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
fracFormat	TokenNameIdentifier
(	TokenNameLPAREN
nf	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
numPoints	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
"Num Good Points: "	TokenNameStringLiteral
,	TokenNameCOMMA
M	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
fracFormat	TokenNameIdentifier
(	TokenNameLPAREN
nf	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
numGoodPoints	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
"Max Good Points: "	TokenNameStringLiteral
,	TokenNameCOMMA
M	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
fracFormat	TokenNameIdentifier
(	TokenNameLPAREN
nf	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
maxGoodPoints	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
"Average Precision: "	TokenNameStringLiteral
,	TokenNameCOMMA
M	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
fracFormat	TokenNameIdentifier
(	TokenNameLPAREN
nf	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
getAvp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
"MRR: "	TokenNameStringLiteral
,	TokenNameCOMMA
M	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
fracFormat	TokenNameIdentifier
(	TokenNameLPAREN
nf	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
getMRR	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
"Recall: "	TokenNameStringLiteral
,	TokenNameCOMMA
M	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
fracFormat	TokenNameIdentifier
(	TokenNameLPAREN
nf	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
getRecall	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
numPoints	TokenNameIdentifier
&&	TokenNameAND_AND
i	TokenNameIdentifier
<	TokenNameLESS
pAt	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
"Precision At "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
+	TokenNamePLUS
": "	TokenNameStringLiteral
,	TokenNameCOMMA
M	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
fracFormat	TokenNameIdentifier
(	TokenNameLPAREN
nf	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
getPrecisionAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
paddLines	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
logger	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
padd	TokenNameIdentifier
=	TokenNameEQUAL
"                                    "	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
format	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
minLen	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
s	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
minLen	TokenNameIdentifier
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
s	TokenNameIdentifier
+	TokenNamePLUS
padd	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
fracFormat	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
frac	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
k	TokenNameIdentifier
=	TokenNameEQUAL
frac	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s1	TokenNameIdentifier
=	TokenNameEQUAL
padd	TokenNameIdentifier
+	TokenNamePLUS
frac	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
k	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
k	TokenNameIdentifier
,	TokenNameCOMMA
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s1	TokenNameIdentifier
=	TokenNameEQUAL
s1	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
s1	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
s1	TokenNameIdentifier
+	TokenNamePLUS
frac	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
k	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
QualityStats	TokenNameIdentifier
average	TokenNameIdentifier
(	TokenNameLPAREN
QualityStats	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
stats	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
QualityStats	TokenNameIdentifier
avg	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QualityStats	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
stats	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
avg	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
m	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
stats	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
avg	TokenNameIdentifier
.	TokenNameDOT
searchTime	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
searchTime	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
docNamesExtractTime	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
docNamesExtractTime	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
maxGoodPoints	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
m	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
numGoodPoints	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
numGoodPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
numPoints	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
numPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
pReleventSum	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getAvp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
recall	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
recall	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
mrr	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getMRR	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
maxGoodPoints	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
maxGoodPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
avg	TokenNameIdentifier
.	TokenNameDOT
pAt	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
avg	TokenNameIdentifier
.	TokenNameDOT
pAt	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
+=	TokenNamePLUS_EQUAL
stats	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getPrecisionAt	TokenNameIdentifier
(	TokenNameLPAREN
j	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
assert	TokenNameassert
m	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
:	TokenNameCOLON
"Fishy: no "good" queries!"	TokenNameStringLiteral
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
searchTime	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
stats	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
docNamesExtractTime	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
stats	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
numGoodPoints	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
m	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
numPoints	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
m	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
recall	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
m	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
mrr	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
m	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
maxGoodPoints	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
m	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
avg	TokenNameIdentifier
.	TokenNameDOT
pAt	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
avg	TokenNameIdentifier
.	TokenNameDOT
pAt	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
/=	TokenNameDIVIDE_EQUAL
m	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
avg	TokenNameIdentifier
.	TokenNameDOT
pReleventSum	TokenNameIdentifier
/=	TokenNameDIVIDE_EQUAL
m	TokenNameIdentifier
;	TokenNameSEMICOLON
avg	TokenNameIdentifier
.	TokenNameDOT
pReleventSum	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
avg	TokenNameIdentifier
.	TokenNameDOT
maxGoodPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
avg	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getDocNamesExtractTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
docNamesExtractTime	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getMaxGoodPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
maxGoodPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getNumGoodPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
numGoodPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getNumPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
numPoints	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RecallPoint	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getRecallPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
recallPoints	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
RecallPoint	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getMRR	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
mrr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getSearchTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
searchTime	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
