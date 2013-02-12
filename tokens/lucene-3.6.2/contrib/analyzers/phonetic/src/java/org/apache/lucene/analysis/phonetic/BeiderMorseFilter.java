package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
phonetic	TokenNameIdentifier
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
regex	TokenNameIdentifier
.	TokenNameDOT
Matcher	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
regex	TokenNameIdentifier
.	TokenNameDOT
Pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
.	TokenNameDOT
language	TokenNameIdentifier
.	TokenNameDOT
bm	TokenNameIdentifier
.	TokenNameDOT
BeiderMorseEncoder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
.	TokenNameDOT
language	TokenNameIdentifier
.	TokenNameDOT
bm	TokenNameIdentifier
.	TokenNameDOT
Languages	TokenNameIdentifier
.	TokenNameDOT
LanguageSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
codec	TokenNameIdentifier
.	TokenNameDOT
language	TokenNameIdentifier
.	TokenNameDOT
bm	TokenNameIdentifier
.	TokenNameDOT
PhoneticEngine	TokenNameIdentifier
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
analysis	TokenNameIdentifier
.	TokenNameDOT
tokenattributes	TokenNameIdentifier
.	TokenNameDOT
OffsetAttribute	TokenNameIdentifier
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
PositionIncrementAttribute	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
BeiderMorseFilter	TokenNameIdentifier
extends	TokenNameextends
TokenFilter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
PhoneticEngine	TokenNameIdentifier
engine	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
LanguageSet	TokenNameIdentifier
languages	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Pattern	TokenNameIdentifier
pattern	TokenNameIdentifier
=	TokenNameEQUAL
Pattern	TokenNameIdentifier
.	TokenNameDOT
compile	TokenNameIdentifier
(	TokenNameLPAREN
"([^()|-]+)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Matcher	TokenNameIdentifier
matcher	TokenNameIdentifier
=	TokenNameEQUAL
pattern	TokenNameIdentifier
.	TokenNameDOT
matcher	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
encoded	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
startOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
endOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
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
private	TokenNameprivate
final	TokenNamefinal
PositionIncrementAttribute	TokenNameIdentifier
posIncAtt	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PositionIncrementAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
OffsetAttribute	TokenNameIdentifier
offsetAtt	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
OffsetAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
BeiderMorseFilter	TokenNameIdentifier
(	TokenNameLPAREN
TokenStream	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
PhoneticEngine	TokenNameIdentifier
engine	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
input	TokenNameIdentifier
,	TokenNameCOMMA
engine	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
BeiderMorseFilter	TokenNameIdentifier
(	TokenNameLPAREN
TokenStream	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
PhoneticEngine	TokenNameIdentifier
engine	TokenNameIdentifier
,	TokenNameCOMMA
LanguageSet	TokenNameIdentifier
languages	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
engine	TokenNameIdentifier
=	TokenNameEQUAL
engine	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
languages	TokenNameIdentifier
=	TokenNameEQUAL
languages	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
matcher	TokenNameIdentifier
.	TokenNameDOT
find	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
clearAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
setEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
encoded	TokenNameIdentifier
,	TokenNameCOMMA
matcher	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
matcher	TokenNameIdentifier
.	TokenNameDOT
end	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
posIncAtt	TokenNameIdentifier
.	TokenNameDOT
setPositionIncrement	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
startOffset	TokenNameIdentifier
,	TokenNameCOMMA
endOffset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
input	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
encoded	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
languages	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
engine	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
termAtt	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
engine	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
termAtt	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
languages	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
startOffset	TokenNameIdentifier
=	TokenNameEQUAL
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
startOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
endOffset	TokenNameIdentifier
=	TokenNameEQUAL
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
endOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
matcher	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
encoded	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
matcher	TokenNameIdentifier
.	TokenNameDOT
find	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
termAtt	TokenNameIdentifier
.	TokenNameDOT
setEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
encoded	TokenNameIdentifier
,	TokenNameCOMMA
matcher	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
matcher	TokenNameIdentifier
.	TokenNameDOT
end	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
matcher	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
