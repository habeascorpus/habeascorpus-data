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
.	TokenNameDOT
smart	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
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
Tokenizer	TokenNameIdentifier
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
TypeAttribute	TokenNameIdentifier
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
AttributeSource	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
SentenceTokenizer	TokenNameIdentifier
extends	TokenNameextends
Tokenizer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
PUNCTION	TokenNameIdentifier
=	TokenNameEQUAL
"。，！？；,!?;"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
StringBuilder	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
tokenStart	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
tokenEnd	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
private	TokenNameprivate
final	TokenNamefinal
TypeAttribute	TokenNameIdentifier
typeAtt	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
TypeAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
SentenceTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SentenceTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
AttributeSource	TokenNameIdentifier
source	TokenNameIdentifier
,	TokenNameCOMMA
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
source	TokenNameIdentifier
,	TokenNameCOMMA
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SentenceTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
AttributeFactory	TokenNameIdentifier
factory	TokenNameIdentifier
,	TokenNameCOMMA
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
factory	TokenNameIdentifier
,	TokenNameCOMMA
reader	TokenNameIdentifier
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
clearAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
ci	TokenNameIdentifier
;	TokenNameSEMICOLON
char	TokenNamechar
ch	TokenNameIdentifier
,	TokenNameCOMMA
pch	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
atBegin	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
tokenStart	TokenNameIdentifier
=	TokenNameEQUAL
tokenEnd	TokenNameIdentifier
;	TokenNameSEMICOLON
ci	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ch	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
ci	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ci	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
PUNCTION	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tokenEnd	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
atBegin	TokenNameIdentifier
&&	TokenNameAND_AND
Utility	TokenNameIdentifier
.	TokenNameDOT
SPACES	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
tokenStart	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
tokenEnd	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
ci	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ch	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
ci	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
atBegin	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
tokenEnd	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
pch	TokenNameIdentifier
=	TokenNameEQUAL
ch	TokenNameIdentifier
;	TokenNameSEMICOLON
ci	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ch	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
ci	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Utility	TokenNameIdentifier
.	TokenNameDOT
SPACES	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
&&	TokenNameAND_AND
Utility	TokenNameIdentifier
.	TokenNameDOT
SPACES	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
pch	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
tokenEnd	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
termAtt	TokenNameIdentifier
.	TokenNameDOT
setEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
correctOffset	TokenNameIdentifier
(	TokenNameLPAREN
tokenStart	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
correctOffset	TokenNameIdentifier
(	TokenNameLPAREN
tokenEnd	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
typeAtt	TokenNameIdentifier
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
"sentence"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
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
tokenStart	TokenNameIdentifier
=	TokenNameEQUAL
tokenEnd	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
Reader	TokenNameIdentifier
input	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
end	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
finalOffset	TokenNameIdentifier
=	TokenNameEQUAL
correctOffset	TokenNameIdentifier
(	TokenNameLPAREN
tokenEnd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
finalOffset	TokenNameIdentifier
,	TokenNameCOMMA
finalOffset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE