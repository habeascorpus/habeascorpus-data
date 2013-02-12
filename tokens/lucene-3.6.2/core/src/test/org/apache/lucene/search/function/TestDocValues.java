package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
function	TokenNameIdentifier
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
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestDocValues	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testGetMinValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
2.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
100.0f	TokenNameFloatingPointLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
DocValuesTestImpl	TokenNameIdentifier
docValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"-1.0f is the min value in the source array"	TokenNameStringLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
docValues	TokenNameIdentifier
.	TokenNameDOT
getMinValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
docValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"max is NaN - no values in inner array"	TokenNameStringLiteral
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
docValues	TokenNameIdentifier
.	TokenNameDOT
getMinValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testGetMaxValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
2.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
10.0f	TokenNameFloatingPointLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
DocValuesTestImpl	TokenNameIdentifier
docValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"10.0f is the max value in the source array"	TokenNameStringLiteral
,	TokenNameCOMMA
10.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
docValues	TokenNameIdentifier
.	TokenNameDOT
getMaxValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
-	TokenNameMINUS
3.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
100.0f	TokenNameFloatingPointLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
docValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"-1.0f is the max value in the source array"	TokenNameStringLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
docValues	TokenNameIdentifier
.	TokenNameDOT
getMaxValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
-	TokenNameMINUS
3.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
100.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
docValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
Float	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
+	TokenNamePLUS
" is the max value in the source array"	TokenNameStringLiteral
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
docValues	TokenNameIdentifier
.	TokenNameDOT
getMaxValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
docValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"max is NaN - no values in inner array"	TokenNameStringLiteral
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
docValues	TokenNameIdentifier
.	TokenNameDOT
getMaxValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testGetAverageValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
DocValuesTestImpl	TokenNameIdentifier
docValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"the average is 1.0f"	TokenNameStringLiteral
,	TokenNameCOMMA
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
docValues	TokenNameIdentifier
.	TokenNameDOT
getAverageValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
2.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
3.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
4.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
5.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
6.0f	TokenNameFloatingPointLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
docValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"the average is 3.5f"	TokenNameStringLiteral
,	TokenNameCOMMA
3.5f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
docValues	TokenNameIdentifier
.	TokenNameDOT
getAverageValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
-	TokenNameMINUS
1.0f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
2.0f	TokenNameFloatingPointLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
docValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"the average is 0.5f"	TokenNameStringLiteral
,	TokenNameCOMMA
0.5f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
docValues	TokenNameIdentifier
.	TokenNameDOT
getAverageValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
docValues	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"the average is NaN - no values in inner array"	TokenNameStringLiteral
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
docValues	TokenNameIdentifier
.	TokenNameDOT
getAverageValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
DocValuesTestImpl	TokenNameIdentifier
extends	TokenNameextends
DocValues	TokenNameIdentifier
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
innerArray	TokenNameIdentifier
;	TokenNameSEMICOLON
DocValuesTestImpl	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
innerArray	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
innerArray	TokenNameIdentifier
=	TokenNameEQUAL
innerArray	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
floatVal	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
innerArray	TokenNameIdentifier
[	TokenNameLBRACKET
doc	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE