package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
highlight	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
spans	TokenNameIdentifier
.	TokenNameDOT
Spans	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SimpleSpanFragmenter	TokenNameIdentifier
implements	TokenNameimplements
Fragmenter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_FRAGMENT_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
fragmentSize	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
currentNumFrags	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
position	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
QueryScorer	TokenNameIdentifier
queryScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
waitForPos	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
textSize	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
PositionIncrementAttribute	TokenNameIdentifier
posIncAtt	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
OffsetAttribute	TokenNameIdentifier
offsetAtt	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SimpleSpanFragmenter	TokenNameIdentifier
(	TokenNameLPAREN
QueryScorer	TokenNameIdentifier
queryScorer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
queryScorer	TokenNameIdentifier
,	TokenNameCOMMA
DEFAULT_FRAGMENT_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SimpleSpanFragmenter	TokenNameIdentifier
(	TokenNameLPAREN
QueryScorer	TokenNameIdentifier
queryScorer	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
fragmentSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
fragmentSize	TokenNameIdentifier
=	TokenNameEQUAL
fragmentSize	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
queryScorer	TokenNameIdentifier
=	TokenNameEQUAL
queryScorer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isNewFragment	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
position	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
posIncAtt	TokenNameIdentifier
.	TokenNameDOT
getPositionIncrement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
waitForPos	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
position	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
waitForPos	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
waitForPos	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
WeightedSpanTerm	TokenNameIdentifier
wSpanTerm	TokenNameIdentifier
=	TokenNameEQUAL
queryScorer	TokenNameIdentifier
.	TokenNameDOT
getWeightedSpanTerm	TokenNameIdentifier
(	TokenNameLPAREN
termAtt	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
wSpanTerm	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
PositionSpan	TokenNameIdentifier
>	TokenNameGREATER
positionSpans	TokenNameIdentifier
=	TokenNameEQUAL
wSpanTerm	TokenNameIdentifier
.	TokenNameDOT
getPositionSpans	TokenNameIdentifier
(	TokenNameLPAREN
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
positionSpans	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
positionSpans	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
start	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
position	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
waitForPos	TokenNameIdentifier
=	TokenNameEQUAL
positionSpans	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
end	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
boolean	TokenNameboolean
isNewFrag	TokenNameIdentifier
=	TokenNameEQUAL
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
endOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
(	TokenNameLPAREN
fragmentSize	TokenNameIdentifier
*	TokenNameMULTIPLY
currentNumFrags	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
textSize	TokenNameIdentifier
-	TokenNameMINUS
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
endOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
(	TokenNameLPAREN
fragmentSize	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isNewFrag	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
currentNumFrags	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
isNewFrag	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
start	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
originalText	TokenNameIdentifier
,	TokenNameCOMMA
TokenStream	TokenNameIdentifier
tokenStream	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
position	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
currentNumFrags	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
textSize	TokenNameIdentifier
=	TokenNameEQUAL
originalText	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
tokenStream	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
posIncAtt	TokenNameIdentifier
=	TokenNameEQUAL
tokenStream	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PositionIncrementAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAtt	TokenNameIdentifier
=	TokenNameEQUAL
tokenStream	TokenNameIdentifier
.	TokenNameDOT
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
OffsetAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
