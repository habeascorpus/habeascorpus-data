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
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
StringReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Comparator	TokenNameIdentifier
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
Analyzer	TokenNameIdentifier
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
Token	TokenNameIdentifier
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
document	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
IndexReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
TermFreqVector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
TermPositionVector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
TermVectorOffsetInfo	TokenNameIdentifier
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
ArrayUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TokenSources	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
TokenStream	TokenNameIdentifier
getAnyTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
docId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
Document	TokenNameIdentifier
doc	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
TokenStream	TokenNameIdentifier
ts	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
TermFreqVector	TokenNameIdentifier
tfv	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
getTermFreqVector	TokenNameIdentifier
(	TokenNameLPAREN
docId	TokenNameIdentifier
,	TokenNameCOMMA
field	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tfv	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tfv	TokenNameIdentifier
instanceof	TokenNameinstanceof
TermPositionVector	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ts	TokenNameIdentifier
=	TokenNameEQUAL
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
TermPositionVector	TokenNameIdentifier
)	TokenNameRPAREN
tfv	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ts	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
ts	TokenNameIdentifier
=	TokenNameEQUAL
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
,	TokenNameCOMMA
field	TokenNameIdentifier
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ts	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
TokenStream	TokenNameIdentifier
getAnyTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
docId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
TokenStream	TokenNameIdentifier
ts	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
TermFreqVector	TokenNameIdentifier
tfv	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
getTermFreqVector	TokenNameIdentifier
(	TokenNameLPAREN
docId	TokenNameIdentifier
,	TokenNameCOMMA
field	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tfv	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tfv	TokenNameIdentifier
instanceof	TokenNameinstanceof
TermPositionVector	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ts	TokenNameIdentifier
=	TokenNameEQUAL
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
TermPositionVector	TokenNameIdentifier
)	TokenNameRPAREN
tfv	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ts	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
ts	TokenNameIdentifier
=	TokenNameEQUAL
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
docId	TokenNameIdentifier
,	TokenNameCOMMA
field	TokenNameIdentifier
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ts	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
TokenStream	TokenNameIdentifier
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
TermPositionVector	TokenNameIdentifier
tpv	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
tpv	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
TokenStream	TokenNameIdentifier
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
TermPositionVector	TokenNameIdentifier
tpv	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
tokenPositionsGuaranteedContiguous	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
tokenPositionsGuaranteedContiguous	TokenNameIdentifier
&&	TokenNameAND_AND
tpv	TokenNameIdentifier
.	TokenNameDOT
getTermPositions	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
TokenStreamFromTermPositionVector	TokenNameIdentifier
(	TokenNameLPAREN
tpv	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
class	TokenNameclass
StoredTokenStream	TokenNameIdentifier
extends	TokenNameextends
TokenStream	TokenNameIdentifier
{	TokenNameLBRACE
Token	TokenNameIdentifier
tokens	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
currentToken	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
;	TokenNameSEMICOLON
OffsetAttribute	TokenNameIdentifier
offsetAtt	TokenNameIdentifier
;	TokenNameSEMICOLON
PositionIncrementAttribute	TokenNameIdentifier
posincAtt	TokenNameIdentifier
;	TokenNameSEMICOLON
StoredTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
Token	TokenNameIdentifier
tokens	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
tokens	TokenNameIdentifier
=	TokenNameEQUAL
tokens	TokenNameIdentifier
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAtt	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
OffsetAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
posincAtt	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PositionIncrementAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
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
currentToken	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
tokens	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Token	TokenNameIdentifier
token	TokenNameIdentifier
=	TokenNameEQUAL
tokens	TokenNameIdentifier
[	TokenNameLBRACKET
currentToken	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
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
token	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
.	TokenNameDOT
startOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
token	TokenNameIdentifier
.	TokenNameDOT
endOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
posincAtt	TokenNameIdentifier
.	TokenNameDOT
setPositionIncrement	TokenNameIdentifier
(	TokenNameLPAREN
currentToken	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
1	TokenNameIntegerLiteral
||	TokenNameOR_OR
tokens	TokenNameIdentifier
[	TokenNameLBRACKET
currentToken	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
startOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
tokens	TokenNameIdentifier
[	TokenNameLBRACKET
currentToken	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
startOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
1	TokenNameIntegerLiteral
:	TokenNameCOLON
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
terms	TokenNameIdentifier
=	TokenNameEQUAL
tpv	TokenNameIdentifier
.	TokenNameDOT
getTerms	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
freq	TokenNameIdentifier
=	TokenNameEQUAL
tpv	TokenNameIdentifier
.	TokenNameDOT
getTermFrequencies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
totalTokens	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
t	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
t	TokenNameIdentifier
<	TokenNameLESS
freq	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
totalTokens	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
freq	TokenNameIdentifier
[	TokenNameLBRACKET
t	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Token	TokenNameIdentifier
tokensInOriginalOrder	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
Token	TokenNameIdentifier
[	TokenNameLBRACKET
totalTokens	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>	TokenNameGREATER
unsortedTokens	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
t	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
t	TokenNameIdentifier
<	TokenNameLESS
freq	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
TermVectorOffsetInfo	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
offsets	TokenNameIdentifier
=	TokenNameEQUAL
tpv	TokenNameIdentifier
.	TokenNameDOT
getOffsets	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
offsets	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Required TermVector Offset information was not found"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
pos	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tokenPositionsGuaranteedContiguous	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pos	TokenNameIdentifier
=	TokenNameEQUAL
tpv	TokenNameIdentifier
.	TokenNameDOT
getTermPositions	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
pos	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
unsortedTokens	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
unsortedTokens	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
tp	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
tp	TokenNameIdentifier
<	TokenNameLESS
offsets	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
tp	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Token	TokenNameIdentifier
token	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Token	TokenNameIdentifier
(	TokenNameLPAREN
terms	TokenNameIdentifier
[	TokenNameLBRACKET
t	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
offsets	TokenNameIdentifier
[	TokenNameLBRACKET
tp	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getStartOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
offsets	TokenNameIdentifier
[	TokenNameLBRACKET
tp	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getEndOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
unsortedTokens	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
token	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
tp	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
tp	TokenNameIdentifier
<	TokenNameLESS
pos	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
tp	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Token	TokenNameIdentifier
token	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Token	TokenNameIdentifier
(	TokenNameLPAREN
terms	TokenNameIdentifier
[	TokenNameLBRACKET
t	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
offsets	TokenNameIdentifier
[	TokenNameLBRACKET
tp	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getStartOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
offsets	TokenNameIdentifier
[	TokenNameLBRACKET
tp	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getEndOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tokensInOriginalOrder	TokenNameIdentifier
[	TokenNameLBRACKET
pos	TokenNameIdentifier
[	TokenNameLBRACKET
tp	TokenNameIdentifier
]	TokenNameRBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
token	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
unsortedTokens	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
tokensInOriginalOrder	TokenNameIdentifier
=	TokenNameEQUAL
unsortedTokens	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Token	TokenNameIdentifier
[	TokenNameLBRACKET
unsortedTokens	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ArrayUtil	TokenNameIdentifier
.	TokenNameDOT
mergeSort	TokenNameIdentifier
(	TokenNameLPAREN
tokensInOriginalOrder	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Comparator	TokenNameIdentifier
<	TokenNameLESS
Token	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
Token	TokenNameIdentifier
t1	TokenNameIdentifier
,	TokenNameCOMMA
Token	TokenNameIdentifier
t2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
t1	TokenNameIdentifier
.	TokenNameDOT
startOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
t2	TokenNameIdentifier
.	TokenNameDOT
startOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
t1	TokenNameIdentifier
.	TokenNameDOT
endOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
t2	TokenNameIdentifier
.	TokenNameDOT
endOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
t1	TokenNameIdentifier
.	TokenNameDOT
startOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
t2	TokenNameIdentifier
.	TokenNameDOT
startOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
StoredTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
tokensInOriginalOrder	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
TokenStream	TokenNameIdentifier
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
docId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
field	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
TermFreqVector	TokenNameIdentifier
tfv	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
getTermFreqVector	TokenNameIdentifier
(	TokenNameLPAREN
docId	TokenNameIdentifier
,	TokenNameCOMMA
field	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tfv	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
+	TokenNamePLUS
" in doc #"	TokenNameStringLiteral
+	TokenNamePLUS
docId	TokenNameIdentifier
+	TokenNamePLUS
"does not have any term position data stored"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
tfv	TokenNameIdentifier
instanceof	TokenNameinstanceof
TermPositionVector	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TermPositionVector	TokenNameIdentifier
tpv	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TermPositionVector	TokenNameIdentifier
)	TokenNameRPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
getTermFreqVector	TokenNameIdentifier
(	TokenNameLPAREN
docId	TokenNameIdentifier
,	TokenNameCOMMA
field	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
tpv	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
+	TokenNamePLUS
" in doc #"	TokenNameStringLiteral
+	TokenNamePLUS
docId	TokenNameIdentifier
+	TokenNamePLUS
"does not have any term position data stored"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
TokenStream	TokenNameIdentifier
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
docId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Document	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
(	TokenNameLPAREN
docId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
,	TokenNameCOMMA
field	TokenNameIdentifier
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
TokenStream	TokenNameIdentifier
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
Document	TokenNameIdentifier
doc	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
contents	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
contents	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Field "	TokenNameStringLiteral
+	TokenNamePLUS
field	TokenNameIdentifier
+	TokenNamePLUS
" in document is not stored and cannot be analyzed"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
contents	TokenNameIdentifier
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
TokenStream	TokenNameIdentifier
getTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
contents	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
analyzer	TokenNameIdentifier
.	TokenNameDOT
reusableTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
contents	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE