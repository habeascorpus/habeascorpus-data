package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
gl	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
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
pt	TokenNameIdentifier
.	TokenNameDOT
RSLPStemmerBase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
GalicianStemmer	TokenNameIdentifier
extends	TokenNameextends
RSLPStemmerBase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Step	TokenNameIdentifier
plural	TokenNameIdentifier
,	TokenNameCOMMA
unification	TokenNameIdentifier
,	TokenNameCOMMA
adverb	TokenNameIdentifier
,	TokenNameCOMMA
augmentative	TokenNameIdentifier
,	TokenNameCOMMA
noun	TokenNameIdentifier
,	TokenNameCOMMA
verb	TokenNameIdentifier
,	TokenNameCOMMA
vowel	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Step	TokenNameIdentifier
>	TokenNameGREATER
steps	TokenNameIdentifier
=	TokenNameEQUAL
parse	TokenNameIdentifier
(	TokenNameLPAREN
GalicianStemmer	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
"galician.rslp"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
plural	TokenNameIdentifier
=	TokenNameEQUAL
steps	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"Plural"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
unification	TokenNameIdentifier
=	TokenNameEQUAL
steps	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"Unification"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
adverb	TokenNameIdentifier
=	TokenNameEQUAL
steps	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"Adverb"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
augmentative	TokenNameIdentifier
=	TokenNameEQUAL
steps	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"Augmentative"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
noun	TokenNameIdentifier
=	TokenNameEQUAL
steps	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"Noun"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
verb	TokenNameIdentifier
=	TokenNameEQUAL
steps	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"Verb"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vowel	TokenNameIdentifier
=	TokenNameEQUAL
steps	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"Vowel"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
assert	TokenNameassert
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
len	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
"this stemmer requires an oversized array of at least 1"	TokenNameStringLiteral
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
plural	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
unification	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
adverb	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
oldlen	TokenNameIdentifier
;	TokenNameSEMICOLON
do	TokenNamedo
{	TokenNameLBRACE
oldlen	TokenNameIdentifier
=	TokenNameEQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
augmentative	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
len	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
oldlen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
oldlen	TokenNameIdentifier
=	TokenNameEQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
noun	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
oldlen	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
len	TokenNameIdentifier
=	TokenNameEQUAL
verb	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
len	TokenNameIdentifier
=	TokenNameEQUAL
vowel	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
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
'é'	TokenNameCharacterLiteral
:	TokenNameCOLON
case	TokenNamecase
'ê'	TokenNameCharacterLiteral
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
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE