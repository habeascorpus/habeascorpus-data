package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
fa	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
CharStream	TokenNameIdentifier
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
CharFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
PersianCharFilter	TokenNameIdentifier
extends	TokenNameextends
CharFilter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
PersianCharFilter	TokenNameIdentifier
(	TokenNameLPAREN
CharStream	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
read	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
cbuf	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
off	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
charsRead	TokenNameIdentifier
=	TokenNameEQUAL
super	TokenNamesuper
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
cbuf	TokenNameIdentifier
,	TokenNameCOMMA
off	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
charsRead	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
end	TokenNameIdentifier
=	TokenNameEQUAL
off	TokenNameIdentifier
+	TokenNamePLUS
charsRead	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
off	TokenNameIdentifier
<	TokenNameLESS
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
cbuf	TokenNameIdentifier
[	TokenNameLBRACKET
off	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
'‌'	TokenNameCharacterLiteral
)	TokenNameRPAREN
cbuf	TokenNameIdentifier
[	TokenNameLBRACKET
off	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
' '	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
off	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
charsRead	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
