package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
hunspell	TokenNameIdentifier
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
List	TokenNameIdentifier
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
hunspell	TokenNameIdentifier
.	TokenNameDOT
HunspellStemmer	TokenNameIdentifier
.	TokenNameDOT
Stem	TokenNameIdentifier
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
KeywordAttribute	TokenNameIdentifier
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
HunspellStemFilter	TokenNameIdentifier
extends	TokenNameextends
TokenFilter	TokenNameIdentifier
{	TokenNameLBRACE
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
KeywordAttribute	TokenNameIdentifier
keywordAtt	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
KeywordAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
HunspellStemmer	TokenNameIdentifier
stemmer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
Stem	TokenNameIdentifier
>	TokenNameGREATER
buffer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
State	TokenNameIdentifier
savedState	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
dedup	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
HunspellStemFilter	TokenNameIdentifier
(	TokenNameLPAREN
TokenStream	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
HunspellDictionary	TokenNameIdentifier
dictionary	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
input	TokenNameIdentifier
,	TokenNameCOMMA
dictionary	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
HunspellStemFilter	TokenNameIdentifier
(	TokenNameLPAREN
TokenStream	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
HunspellDictionary	TokenNameIdentifier
dictionary	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
dedup	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
dedup	TokenNameIdentifier
=	TokenNameEQUAL
dedup	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
stemmer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HunspellStemmer	TokenNameIdentifier
(	TokenNameLPAREN
dictionary	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
buffer	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
buffer	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Stem	TokenNameIdentifier
nextStem	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
restoreState	TokenNameIdentifier
(	TokenNameLPAREN
savedState	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
posIncAtt	TokenNameIdentifier
.	TokenNameDOT
setPositionIncrement	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
copyBuffer	TokenNameIdentifier
(	TokenNameLPAREN
nextStem	TokenNameIdentifier
.	TokenNameDOT
getStem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
nextStem	TokenNameIdentifier
.	TokenNameDOT
getStemLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
nextStem	TokenNameIdentifier
.	TokenNameDOT
getStemLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
input	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
keywordAtt	TokenNameIdentifier
.	TokenNameDOT
isKeyword	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
buffer	TokenNameIdentifier
=	TokenNameEQUAL
dedup	TokenNameIdentifier
?	TokenNameQUESTION
stemmer	TokenNameIdentifier
.	TokenNameDOT
uniqueStems	TokenNameIdentifier
(	TokenNameLPAREN
termAtt	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
stemmer	TokenNameIdentifier
.	TokenNameDOT
stem	TokenNameIdentifier
(	TokenNameLPAREN
termAtt	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Stem	TokenNameIdentifier
stem	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
copyBuffer	TokenNameIdentifier
(	TokenNameLPAREN
stem	TokenNameIdentifier
.	TokenNameDOT
getStem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
stem	TokenNameIdentifier
.	TokenNameDOT
getStemLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
stem	TokenNameIdentifier
.	TokenNameDOT
getStemLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
buffer	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
savedState	TokenNameIdentifier
=	TokenNameEQUAL
captureState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
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
buffer	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
