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
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
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
cn	TokenNameIdentifier
.	TokenNameDOT
smart	TokenNameIdentifier
.	TokenNameDOT
hhmm	TokenNameIdentifier
.	TokenNameDOT
HHMMSegmenter	TokenNameIdentifier
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
cn	TokenNameIdentifier
.	TokenNameDOT
smart	TokenNameIdentifier
.	TokenNameDOT
hhmm	TokenNameIdentifier
.	TokenNameDOT
SegToken	TokenNameIdentifier
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
cn	TokenNameIdentifier
.	TokenNameDOT
smart	TokenNameIdentifier
.	TokenNameDOT
hhmm	TokenNameIdentifier
.	TokenNameDOT
SegTokenFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
WordSegmenter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
HHMMSegmenter	TokenNameIdentifier
hhmmSegmenter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HHMMSegmenter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
SegTokenFilter	TokenNameIdentifier
tokenFilter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SegTokenFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
SegToken	TokenNameIdentifier
>	TokenNameGREATER
segmentSentence	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
sentence	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
startOffset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
SegToken	TokenNameIdentifier
>	TokenNameGREATER
segTokenList	TokenNameIdentifier
=	TokenNameEQUAL
hhmmSegmenter	TokenNameIdentifier
.	TokenNameDOT
process	TokenNameIdentifier
(	TokenNameLPAREN
sentence	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
SegToken	TokenNameIdentifier
>	TokenNameGREATER
result	TokenNameIdentifier
=	TokenNameEQUAL
Collections	TokenNameIdentifier
.	TokenNameDOT
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
segTokenList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
result	TokenNameIdentifier
=	TokenNameEQUAL
segTokenList	TokenNameIdentifier
.	TokenNameDOT
subList	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
segTokenList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
SegToken	TokenNameIdentifier
st	TokenNameIdentifier
:	TokenNameCOLON
result	TokenNameIdentifier
)	TokenNameRPAREN
convertSegToken	TokenNameIdentifier
(	TokenNameLPAREN
st	TokenNameIdentifier
,	TokenNameCOMMA
sentence	TokenNameIdentifier
,	TokenNameCOMMA
startOffset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SegToken	TokenNameIdentifier
convertSegToken	TokenNameIdentifier
(	TokenNameLPAREN
SegToken	TokenNameIdentifier
st	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
sentence	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
sentenceStartOffset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
wordType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
WordType	TokenNameIdentifier
.	TokenNameDOT
STRING	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
WordType	TokenNameIdentifier
.	TokenNameDOT
NUMBER	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
WordType	TokenNameIdentifier
.	TokenNameDOT
FULLWIDTH_NUMBER	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
WordType	TokenNameIdentifier
.	TokenNameDOT
FULLWIDTH_STRING	TokenNameIdentifier
:	TokenNameCOLON
st	TokenNameIdentifier
.	TokenNameDOT
charArray	TokenNameIdentifier
=	TokenNameEQUAL
sentence	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
startOffset	TokenNameIdentifier
,	TokenNameCOMMA
st	TokenNameIdentifier
.	TokenNameDOT
endOffset	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
st	TokenNameIdentifier
=	TokenNameEQUAL
tokenFilter	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
(	TokenNameLPAREN
st	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
st	TokenNameIdentifier
.	TokenNameDOT
startOffset	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
sentenceStartOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
st	TokenNameIdentifier
.	TokenNameDOT
endOffset	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
sentenceStartOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
st	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE