package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
fr	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FrenchMinimalStemmer	TokenNameIdentifier
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
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
len	TokenNameIdentifier
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
'x'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'a'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'u'	TokenNameCharacterLiteral
)	TokenNameRPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
'l'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
's'	TokenNameCharacterLiteral
)	TokenNameRPAREN
len	TokenNameIdentifier
--	TokenNameMINUS_MINUS
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
'r'	TokenNameCharacterLiteral
)	TokenNameRPAREN
len	TokenNameIdentifier
--	TokenNameMINUS_MINUS
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
'e'	TokenNameCharacterLiteral
)	TokenNameRPAREN
len	TokenNameIdentifier
--	TokenNameMINUS_MINUS
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
'é'	TokenNameCharacterLiteral
)	TokenNameRPAREN
len	TokenNameIdentifier
--	TokenNameMINUS_MINUS
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
s	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
len	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE