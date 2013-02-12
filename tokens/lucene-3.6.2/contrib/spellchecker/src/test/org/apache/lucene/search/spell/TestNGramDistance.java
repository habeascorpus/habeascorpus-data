package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
spell	TokenNameIdentifier
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
TestNGramDistance	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testGetDistance1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringDistance	TokenNameIdentifier
nsd	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NGramDistance	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"al"	TokenNameStringLiteral
,	TokenNameCOMMA
"al"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"b"	TokenNameStringLiteral
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"martha"	TokenNameStringLiteral
,	TokenNameCOMMA
"marhta"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.6666	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"jones"	TokenNameStringLiteral
,	TokenNameCOMMA
"johnson"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.4285	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"natural"	TokenNameStringLiteral
,	TokenNameCOMMA
"contrary"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.25	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"abcvwxyz"	TokenNameStringLiteral
,	TokenNameCOMMA
"cabvwxyz"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.75	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"dwayne"	TokenNameStringLiteral
,	TokenNameCOMMA
"duane"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.666	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"dixon"	TokenNameStringLiteral
,	TokenNameCOMMA
"dicksonx"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.5	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"six"	TokenNameStringLiteral
,	TokenNameCOMMA
"ten"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
d1	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"zac ephron"	TokenNameStringLiteral
,	TokenNameCOMMA
"zac efron"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
d2	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"zac ephron"	TokenNameStringLiteral
,	TokenNameCOMMA
"kai ephron"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
,	TokenNameCOMMA
d2	TokenNameIdentifier
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d1	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"brittney spears"	TokenNameStringLiteral
,	TokenNameCOMMA
"britney spears"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d2	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"brittney spears"	TokenNameStringLiteral
,	TokenNameCOMMA
"brittney startzman"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
>	TokenNameGREATER
d2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d1	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"12345678"	TokenNameStringLiteral
,	TokenNameCOMMA
"12890678"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d2	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"12345678"	TokenNameStringLiteral
,	TokenNameCOMMA
"72385698"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
,	TokenNameCOMMA
d2	TokenNameIdentifier
,	TokenNameCOMMA
001	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testGetDistance2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringDistance	TokenNameIdentifier
sd	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NGramDistance	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"al"	TokenNameStringLiteral
,	TokenNameCOMMA
"al"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"b"	TokenNameStringLiteral
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"aa"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.5f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"martha"	TokenNameStringLiteral
,	TokenNameCOMMA
"marhta"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.6666	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"jones"	TokenNameStringLiteral
,	TokenNameCOMMA
"johnson"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.4285	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"natural"	TokenNameStringLiteral
,	TokenNameCOMMA
"contrary"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.25	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"abcvwxyz"	TokenNameStringLiteral
,	TokenNameCOMMA
"cabvwxyz"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.625	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"dwayne"	TokenNameStringLiteral
,	TokenNameCOMMA
"duane"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.5833	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"dixon"	TokenNameStringLiteral
,	TokenNameCOMMA
"dicksonx"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.5	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"six"	TokenNameStringLiteral
,	TokenNameCOMMA
"ten"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
d1	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"zac ephron"	TokenNameStringLiteral
,	TokenNameCOMMA
"zac efron"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
d2	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"zac ephron"	TokenNameStringLiteral
,	TokenNameCOMMA
"kai ephron"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
>	TokenNameGREATER
d2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d1	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"brittney spears"	TokenNameStringLiteral
,	TokenNameCOMMA
"britney spears"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d2	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"brittney spears"	TokenNameStringLiteral
,	TokenNameCOMMA
"brittney startzman"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
>	TokenNameGREATER
d2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d1	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"0012345678"	TokenNameStringLiteral
,	TokenNameCOMMA
"0012890678"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d2	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"0012345678"	TokenNameStringLiteral
,	TokenNameCOMMA
"0072385698"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
,	TokenNameCOMMA
d2	TokenNameIdentifier
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testGetDistance3	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringDistance	TokenNameIdentifier
sd	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NGramDistance	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"al"	TokenNameStringLiteral
,	TokenNameCOMMA
"al"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"b"	TokenNameStringLiteral
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"martha"	TokenNameStringLiteral
,	TokenNameCOMMA
"marhta"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.7222	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"jones"	TokenNameStringLiteral
,	TokenNameCOMMA
"johnson"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.4762	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"natural"	TokenNameStringLiteral
,	TokenNameCOMMA
"contrary"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.2083	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"abcvwxyz"	TokenNameStringLiteral
,	TokenNameCOMMA
"cabvwxyz"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.5625	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"dwayne"	TokenNameStringLiteral
,	TokenNameCOMMA
"duane"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.5277	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"dixon"	TokenNameStringLiteral
,	TokenNameCOMMA
"dicksonx"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.4583	TokenNameDoubleLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"six"	TokenNameStringLiteral
,	TokenNameCOMMA
"ten"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
d1	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"zac ephron"	TokenNameStringLiteral
,	TokenNameCOMMA
"zac efron"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
d2	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"zac ephron"	TokenNameStringLiteral
,	TokenNameCOMMA
"kai ephron"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
>	TokenNameGREATER
d2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d1	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"brittney spears"	TokenNameStringLiteral
,	TokenNameCOMMA
"britney spears"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d2	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"brittney spears"	TokenNameStringLiteral
,	TokenNameCOMMA
"brittney startzman"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
>	TokenNameGREATER
d2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d1	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"0012345678"	TokenNameStringLiteral
,	TokenNameCOMMA
"0012890678"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
d2	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
"0012345678"	TokenNameStringLiteral
,	TokenNameCOMMA
"0072385698"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
d1	TokenNameIdentifier
<	TokenNameLESS
d2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
StringDistance	TokenNameIdentifier
nsd	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NGramDistance	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
d	TokenNameIdentifier
=	TokenNameEQUAL
nsd	TokenNameIdentifier
.	TokenNameDOT
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
,	TokenNameCOMMA
"al"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
,	TokenNameCOMMA
0.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
0.001	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE