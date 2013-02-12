package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
hu	TokenNameIdentifier
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
HungarianLightStemmer	TokenNameIdentifier
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
'á'	TokenNameCharacterLiteral
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
'ë'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'é'	TokenNameCharacterLiteral
:	TokenNameCOLON
s	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
'e'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
'í'	TokenNameCharacterLiteral
:	TokenNameCOLON
s	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
'i'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
'ó'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ő'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'õ'	TokenNameCharacterLiteral
:	TokenNameCOLON
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
case	TokenNamecase
'ú'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ű'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ũ'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'û'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ü'	TokenNameCharacterLiteral
:	TokenNameCOLON
s	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
'u'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
len	TokenNameIdentifier
=	TokenNameEQUAL
removeCase	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
removePossessive	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
removePlural	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
normalize	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
removeCase	TokenNameIdentifier
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
6	TokenNameIntegerLiteral
&&	TokenNameAND_AND
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"kent"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
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
"nak"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"nek"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"val"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"vel"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ert"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"rol"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ban"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ben"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"bol"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"nal"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"nel"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"hoz"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"hez"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"tol"	TokenNameStringLiteral
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
"al"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"el"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isVowel	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
"at"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"et"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ot"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"va"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ve"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ra"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"re"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ba"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"be"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ul"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ig"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"on"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"en"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
isVowel	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
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
'n'	TokenNameCharacterLiteral
:	TokenNameCOLON
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
'a'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'e'	TokenNameCharacterLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&&	TokenNameAND_AND
!	TokenNameNOT
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
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
removePossessive	TokenNameIdentifier
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
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isVowel	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"atok"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"otok"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"etek"	TokenNameStringLiteral
)	TokenNameRPAREN
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
"itek"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"itok"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
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
!	TokenNameNOT
isVowel	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"unk"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"tok"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"tek"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isVowel	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"juk"	TokenNameStringLiteral
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
"ink"	TokenNameStringLiteral
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
!	TokenNameNOT
isVowel	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"am"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"em"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"om"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ad"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ed"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"od"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"uk"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isVowel	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"nk"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
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
"je"	TokenNameStringLiteral
)	TokenNameRPAREN
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
"im"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"id"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
"ik"	TokenNameStringLiteral
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
'a'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'e'	TokenNameCharacterLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
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
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
'm'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'd'	TokenNameCharacterLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
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
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
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
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"fallthrough"	TokenNameStringLiteral
)	TokenNameRPAREN
private	TokenNameprivate
int	TokenNameint
removePlural	TokenNameIdentifier
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
3	TokenNameIntegerLiteral
&&	TokenNameAND_AND
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'k'	TokenNameCharacterLiteral
)	TokenNameRPAREN
switch	TokenNameswitch
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
'a'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'o'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'e'	TokenNameCharacterLiteral
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
default	TokenNamedefault
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
normalize	TokenNameIdentifier
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
