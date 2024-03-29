package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
es	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SpanishLightStemmer	TokenNameIdentifier
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
5	TokenNameIntegerLiteral
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
'à'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'á'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'â'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ä'	TokenNameCharacterLiteral
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
'ò'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ó'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ô'	TokenNameCharacterLiteral
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
'è'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'é'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ê'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ë'	TokenNameCharacterLiteral
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
'ù'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ú'	TokenNameCharacterLiteral
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
case	TokenNamecase
'ì'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'í'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'î'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ï'	TokenNameCharacterLiteral
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
}	TokenNameRBRACE
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
'o'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'a'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'e'	TokenNameCharacterLiteral
:	TokenNameCOLON
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
's'	TokenNameCharacterLiteral
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
'e'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
's'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'e'	TokenNameCharacterLiteral
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
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'e'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'c'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
'z'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'o'	TokenNameCharacterLiteral
||	TokenNameOR_OR
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'a'	TokenNameCharacterLiteral
||	TokenNameOR_OR
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'e'	TokenNameCharacterLiteral
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
