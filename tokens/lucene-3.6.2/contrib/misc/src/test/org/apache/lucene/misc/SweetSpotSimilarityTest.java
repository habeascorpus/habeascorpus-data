package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
misc	TokenNameIdentifier
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
DefaultSimilarity	TokenNameIdentifier
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
Similarity	TokenNameIdentifier
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
index	TokenNameIdentifier
.	TokenNameDOT
FieldInvertState	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SweetSpotSimilarityTest	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testSweetSpotComputeNorm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SweetSpotSimilarity	TokenNameIdentifier
ss	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SweetSpotSimilarity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ss	TokenNameIdentifier
.	TokenNameDOT
setLengthNormFactors	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.5f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Similarity	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultSimilarity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Similarity	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
FieldInvertState	TokenNameIdentifier
invertState	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldInvertState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
invertState	TokenNameIdentifier
.	TokenNameDOT
setBoost	TokenNameIdentifier
(	TokenNameLPAREN
1.0f	TokenNameFloatingPointLiteral
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
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"base case: i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
d	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ss	TokenNameIdentifier
.	TokenNameDOT
setLengthNormFactors	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
10	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.5f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"3,10: spot i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
-	TokenNameMINUS
9	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
normD	TokenNameIdentifier
=	TokenNameEQUAL
d	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
normS	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"3,10: 10<x : i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
normD	TokenNameIdentifier
,	TokenNameCOMMA
normS	TokenNameIdentifier
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ss	TokenNameIdentifier
.	TokenNameDOT
setLengthNormFactors	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
13	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.5f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ss	TokenNameIdentifier
.	TokenNameDOT
setLengthNormFactors	TokenNameIdentifier
(	TokenNameLPAREN
"yak"	TokenNameStringLiteral
,	TokenNameCOMMA
6	TokenNameIntegerLiteral
,	TokenNameCOMMA
9	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.5f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"f: 3,10: spot i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
-	TokenNameMINUS
9	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
normD	TokenNameIdentifier
=	TokenNameEQUAL
d	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
normS	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"f: 3,10: 10<x : i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
normD	TokenNameIdentifier
,	TokenNameCOMMA
normS	TokenNameIdentifier
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
13	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"f: 8,13: spot i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
6	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
9	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"f: 6,9: spot i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"yak"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
13	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
-	TokenNameMINUS
12	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
normD	TokenNameIdentifier
=	TokenNameEQUAL
d	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
normS	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"f: 8,13: 13<x : i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
normD	TokenNameIdentifier
,	TokenNameCOMMA
normS	TokenNameIdentifier
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
9	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
-	TokenNameMINUS
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
normD	TokenNameIdentifier
=	TokenNameEQUAL
d	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
normS	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"yak"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"f: 6,9: 9<x : i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
normD	TokenNameIdentifier
,	TokenNameCOMMA
normS	TokenNameIdentifier
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ss	TokenNameIdentifier
.	TokenNameDOT
setLengthNormFactors	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.5f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ss	TokenNameIdentifier
.	TokenNameDOT
setLengthNormFactors	TokenNameIdentifier
(	TokenNameLPAREN
"b"	TokenNameStringLiteral
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.1f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
9	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
invertState	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
normSS	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
normS	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
"b"	TokenNameStringLiteral
,	TokenNameCOMMA
invertState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"s: i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
+	TokenNamePLUS
" : a="	TokenNameStringLiteral
+	TokenNamePLUS
normSS	TokenNameIdentifier
+	TokenNamePLUS
" < b="	TokenNameStringLiteral
+	TokenNamePLUS
normS	TokenNameIdentifier
,	TokenNameCOMMA
normSS	TokenNameIdentifier
<	TokenNameLESS
normS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSweetSpotTf	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SweetSpotSimilarity	TokenNameIdentifier
ss	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SweetSpotSimilarity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Similarity	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultSimilarity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Similarity	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
;	TokenNameSEMICOLON
ss	TokenNameIdentifier
.	TokenNameDOT
setBaselineTfFactors	TokenNameIdentifier
(	TokenNameLPAREN
0.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
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
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"tf: i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
d	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ss	TokenNameIdentifier
.	TokenNameDOT
setBaselineTfFactors	TokenNameIdentifier
(	TokenNameLPAREN
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
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
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"tf: i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
+	TokenNamePLUS
" : d="	TokenNameStringLiteral
+	TokenNamePLUS
d	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" < s="	TokenNameStringLiteral
+	TokenNamePLUS
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
d	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ss	TokenNameIdentifier
.	TokenNameDOT
setBaselineTfFactors	TokenNameIdentifier
(	TokenNameLPAREN
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
6.0f	TokenNameFloatingPointLiteral
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
<=	TokenNameLESS_EQUAL
6	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"tf flat1: i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ss	TokenNameIdentifier
.	TokenNameDOT
setBaselineTfFactors	TokenNameIdentifier
(	TokenNameLPAREN
2.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
6.0f	TokenNameFloatingPointLiteral
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
<=	TokenNameLESS_EQUAL
6	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"tf flat2: i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
2.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
6	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"tf: i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
+	TokenNamePLUS
" : s="	TokenNameStringLiteral
+	TokenNamePLUS
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" < d="	TokenNameStringLiteral
+	TokenNamePLUS
d	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
d	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"tf zero"	TokenNameStringLiteral
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testHyperbolicSweetSpot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
SweetSpotSimilarity	TokenNameIdentifier
ss	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SweetSpotSimilarity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
tf	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
freq	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
hyperbolicTf	TokenNameIdentifier
(	TokenNameLPAREN
freq	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
ss	TokenNameIdentifier
.	TokenNameDOT
setHyperbolicTfFactors	TokenNameIdentifier
(	TokenNameLPAREN
3.3f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
7.7f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
Math	TokenNameIdentifier
.	TokenNameDOT
E	TokenNameIdentifier
,	TokenNameCOMMA
5.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Similarity	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
ss	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
1000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"MIN tf: i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
+	TokenNamePLUS
" : s="	TokenNameStringLiteral
+	TokenNamePLUS
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
3.3f	TokenNameFloatingPointLiteral
<=	TokenNameLESS_EQUAL
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"MAX tf: i="	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
+	TokenNamePLUS
" : s="	TokenNameStringLiteral
+	TokenNamePLUS
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
7.7f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"MID tf"	TokenNameStringLiteral
,	TokenNameCOMMA
3.3f	TokenNameFloatingPointLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
7.7f	TokenNameFloatingPointLiteral
-	TokenNameMINUS
3.3f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
/	TokenNameDIVIDE
2.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
0.00001f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"tf zero"	TokenNameStringLiteral
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE