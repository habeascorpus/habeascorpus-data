package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
fi	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
StemmerUtil	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FinnishLightStemmer	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
stem	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
s	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
<	TokenNameLESS
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
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
len	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
switch	TokenNameswitch
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
'ä'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'å'	TokenNameCharacterLiteral
:	TokenNameCOLON
s	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
'a'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
'ö'	TokenNameCharacterLiteral
:	TokenNameCOLON
s	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
'o'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
len	TokenNameIdentifier
=	TokenNameEQUAL
step1	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
step2	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
step3	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
norm1	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
norm2	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
step1	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
s	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"kin"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
step1	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ko"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
step1	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
11	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"dellinen"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"dellisuus"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
9	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
step2	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
s	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"lla"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"tse"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"sti"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ni"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"aa"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
step3	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
s	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"nnen"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
's'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ntena"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
's'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"tten"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"eiden"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"neen"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"niin"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"seen"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"teen"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"inen"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'h'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
isVowel	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'n'	TokenNameCharacterLiteral
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"den"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
's'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ksen"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
's'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ssa"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"sta"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"lla"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"lta"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"tta"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ksi"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"lle"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"na"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ne"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"nei"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ja"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ta"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'a'	TokenNameCharacterLiteral
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'n'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
isVowel	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'n'	TokenNameCharacterLiteral
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
norm1	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
s	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
5	TokenNameIntegerLiteral
&&	TokenNameAND_AND
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"hde"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
'k'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
's'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
'i'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ei"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"at"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
switch	TokenNameswitch
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
't'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
's'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'j'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'e'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'a'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'i'	TokenNameCharacterLiteral
:	TokenNameCOLON
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
norm2	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
s	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'e'	TokenNameCharacterLiteral
||	TokenNameOR_OR
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'o'	TokenNameCharacterLiteral
||	TokenNameOR_OR
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'u'	TokenNameCharacterLiteral
)	TokenNameRPAREN
len	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'i'	TokenNameCharacterLiteral
)	TokenNameRPAREN
len	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
char	TokenNamechar
ch	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
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
len	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
ch	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
ch	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
'k'	TokenNameCharacterLiteral
||	TokenNameOR_OR
ch	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
'p'	TokenNameCharacterLiteral
||	TokenNameOR_OR
ch	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
't'	TokenNameCharacterLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
len	TokenNameIdentifier
=	TokenNameEQUAL
delete	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
ch	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
isVowel	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
ch	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
'a'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'e'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'i'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'o'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'u'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'y'	TokenNameCharacterLiteral
:	TokenNameCOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE