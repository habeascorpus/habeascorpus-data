package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
cn	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
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
CharArraySet	TokenNameIdentifier
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
TokenFilter	TokenNameIdentifier
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
TokenStream	TokenNameIdentifier
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
StopFilter	TokenNameIdentifier
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
tokenattributes	TokenNameIdentifier
.	TokenNameDOT
CharTermAttribute	TokenNameIdentifier
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
Version	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
ChineseFilter	TokenNameIdentifier
extends	TokenNameextends
TokenFilter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
STOP_WORDS	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"and"	TokenNameStringLiteral
,	TokenNameCOMMA
"are"	TokenNameStringLiteral
,	TokenNameCOMMA
"as"	TokenNameStringLiteral
,	TokenNameCOMMA
"at"	TokenNameStringLiteral
,	TokenNameCOMMA
"be"	TokenNameStringLiteral
,	TokenNameCOMMA
"but"	TokenNameStringLiteral
,	TokenNameCOMMA
"by"	TokenNameStringLiteral
,	TokenNameCOMMA
"for"	TokenNameStringLiteral
,	TokenNameCOMMA
"if"	TokenNameStringLiteral
,	TokenNameCOMMA
"in"	TokenNameStringLiteral
,	TokenNameCOMMA
"into"	TokenNameStringLiteral
,	TokenNameCOMMA
"is"	TokenNameStringLiteral
,	TokenNameCOMMA
"it"	TokenNameStringLiteral
,	TokenNameCOMMA
"no"	TokenNameStringLiteral
,	TokenNameCOMMA
"not"	TokenNameStringLiteral
,	TokenNameCOMMA
"of"	TokenNameStringLiteral
,	TokenNameCOMMA
"on"	TokenNameStringLiteral
,	TokenNameCOMMA
"or"	TokenNameStringLiteral
,	TokenNameCOMMA
"such"	TokenNameStringLiteral
,	TokenNameCOMMA
"that"	TokenNameStringLiteral
,	TokenNameCOMMA
"the"	TokenNameStringLiteral
,	TokenNameCOMMA
"their"	TokenNameStringLiteral
,	TokenNameCOMMA
"then"	TokenNameStringLiteral
,	TokenNameCOMMA
"there"	TokenNameStringLiteral
,	TokenNameCOMMA
"these"	TokenNameStringLiteral
,	TokenNameCOMMA
"they"	TokenNameStringLiteral
,	TokenNameCOMMA
"this"	TokenNameStringLiteral
,	TokenNameCOMMA
"to"	TokenNameStringLiteral
,	TokenNameCOMMA
"was"	TokenNameStringLiteral
,	TokenNameCOMMA
"will"	TokenNameStringLiteral
,	TokenNameCOMMA
"with"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
CharArraySet	TokenNameIdentifier
stopTable	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ChineseFilter	TokenNameIdentifier
(	TokenNameLPAREN
TokenStream	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stopTable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CharArraySet	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
.	TokenNameDOT
LUCENE_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
STOP_WORDS	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
input	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
char	TokenNamechar
text	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
termAtt	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
termLength	TokenNameIdentifier
=	TokenNameEQUAL
termAtt	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
stopTable	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
termLength	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
Character	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
Character	TokenNameIdentifier
.	TokenNameDOT
LOWERCASE_LETTER	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
Character	TokenNameIdentifier
.	TokenNameDOT
UPPERCASE_LETTER	TokenNameIdentifier
:	TokenNameCOLON
if	TokenNameif
(	TokenNameLPAREN
termLength	TokenNameIdentifier
>	TokenNameGREATER
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
Character	TokenNameIdentifier
.	TokenNameDOT
OTHER_LETTER	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
