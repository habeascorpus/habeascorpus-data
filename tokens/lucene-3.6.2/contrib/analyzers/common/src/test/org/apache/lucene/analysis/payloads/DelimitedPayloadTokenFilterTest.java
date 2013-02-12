package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
payloads	TokenNameIdentifier
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
MockTokenizer	TokenNameIdentifier
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
PayloadAttribute	TokenNameIdentifier
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
Payload	TokenNameIdentifier
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
LuceneTestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
StringReader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DelimitedPayloadTokenFilterTest	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testPayloads	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
test	TokenNameIdentifier
=	TokenNameEQUAL
"The quick|JJ red|JJ fox|NN jumped|VB over the lazy|JJ brown|JJ dogs|NN"	TokenNameStringLiteral
;	TokenNameSEMICOLON
DelimitedPayloadTokenFilter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DelimitedPayloadTokenFilter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MockTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
WHITESPACE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
,	TokenNameCOMMA
DelimitedPayloadTokenFilter	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_DELIMITER	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
IdentityEncoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PayloadAttribute	TokenNameIdentifier
payAtt	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PayloadAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"The"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"quick"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
"JJ"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"red"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
"JJ"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"fox"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
"NN"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"jumped"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
"VB"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"over"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"the"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"lazy"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
"JJ"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"brown"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
"JJ"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"dogs"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
"NN"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
test	TokenNameIdentifier
=	TokenNameEQUAL
"The quick|JJ red|JJ fox|NN jumped|VB over the lazy|JJ brown|JJ dogs|NN"	TokenNameStringLiteral
;	TokenNameSEMICOLON
DelimitedPayloadTokenFilter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DelimitedPayloadTokenFilter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MockTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
WHITESPACE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
,	TokenNameCOMMA
DelimitedPayloadTokenFilter	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_DELIMITER	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
IdentityEncoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"The"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"quick"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
"JJ"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"red"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
"JJ"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"fox"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
"NN"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"jumped"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
"VB"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"over"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"the"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"lazy"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
"JJ"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"brown"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
"JJ"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"dogs"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
"NN"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-8"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFloatEncoding	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
test	TokenNameIdentifier
=	TokenNameEQUAL
"The quick|1.0 red|2.0 fox|3.5 jumped|0.5 over the lazy|5 brown|99.3 dogs|83.7"	TokenNameStringLiteral
;	TokenNameSEMICOLON
DelimitedPayloadTokenFilter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DelimitedPayloadTokenFilter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MockTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
WHITESPACE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
,	TokenNameCOMMA
'|'	TokenNameCharacterLiteral
,	TokenNameCOMMA
new	TokenNamenew
FloatEncoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PayloadAttribute	TokenNameIdentifier
payAtt	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PayloadAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"The"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"quick"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeFloat	TokenNameIdentifier
(	TokenNameLPAREN
1.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"red"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeFloat	TokenNameIdentifier
(	TokenNameLPAREN
2.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"fox"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeFloat	TokenNameIdentifier
(	TokenNameLPAREN
3.5f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"jumped"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeFloat	TokenNameIdentifier
(	TokenNameLPAREN
0.5f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"over"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"the"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"lazy"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeFloat	TokenNameIdentifier
(	TokenNameLPAREN
5.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"brown"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeFloat	TokenNameIdentifier
(	TokenNameLPAREN
99.3f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"dogs"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeFloat	TokenNameIdentifier
(	TokenNameLPAREN
83.7f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testIntEncoding	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
test	TokenNameIdentifier
=	TokenNameEQUAL
"The quick|1 red|2 fox|3 jumped over the lazy|5 brown|99 dogs|83"	TokenNameStringLiteral
;	TokenNameSEMICOLON
DelimitedPayloadTokenFilter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DelimitedPayloadTokenFilter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MockTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
test	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
WHITESPACE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
,	TokenNameCOMMA
'|'	TokenNameCharacterLiteral
,	TokenNameCOMMA
new	TokenNamenew
IntegerEncoder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PayloadAttribute	TokenNameIdentifier
payAtt	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PayloadAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"The"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"quick"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeInt	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"red"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeInt	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"fox"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeInt	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"jumped"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"over"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"the"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"lazy"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeInt	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"brown"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeInt	TokenNameIdentifier
(	TokenNameLPAREN
99	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"dogs"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadHelper	TokenNameIdentifier
.	TokenNameDOT
encodeInt	TokenNameIdentifier
(	TokenNameLPAREN
83	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
expected	TokenNameIdentifier
,	TokenNameCOMMA
TokenStream	TokenNameIdentifier
stream	TokenNameIdentifier
,	TokenNameCOMMA
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectPay	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
stream	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PayloadAttribute	TokenNameIdentifier
payloadAtt	TokenNameIdentifier
=	TokenNameEQUAL
stream	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PayloadAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stream	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
stream	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Payload	TokenNameIdentifier
payload	TokenNameIdentifier
=	TokenNameEQUAL
payloadAtt	TokenNameIdentifier
.	TokenNameDOT
getPayload	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
payload	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
payload	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" does not equal: "	TokenNameStringLiteral
+	TokenNamePLUS
expectPay	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
payload	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
expectPay	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
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
expectPay	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
expectPay	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
" does not equal: "	TokenNameStringLiteral
+	TokenNamePLUS
payload	TokenNameIdentifier
.	TokenNameDOT
byteAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
expectPay	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
payload	TokenNameIdentifier
.	TokenNameDOT
byteAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expectPay is not null and it should be"	TokenNameStringLiteral
,	TokenNameCOMMA
expectPay	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
expected	TokenNameIdentifier
,	TokenNameCOMMA
TokenStream	TokenNameIdentifier
stream	TokenNameIdentifier
,	TokenNameCOMMA
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
,	TokenNameCOMMA
PayloadAttribute	TokenNameIdentifier
payAtt	TokenNameIdentifier
,	TokenNameCOMMA
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectPay	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
stream	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
stream	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Payload	TokenNameIdentifier
payload	TokenNameIdentifier
=	TokenNameEQUAL
payAtt	TokenNameIdentifier
.	TokenNameDOT
getPayload	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
payload	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
payload	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" does not equal: "	TokenNameStringLiteral
+	TokenNamePLUS
expectPay	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
payload	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
expectPay	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
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
expectPay	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
expectPay	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
" does not equal: "	TokenNameStringLiteral
+	TokenNamePLUS
payload	TokenNameIdentifier
.	TokenNameDOT
byteAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
expectPay	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
payload	TokenNameIdentifier
.	TokenNameDOT
byteAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expectPay is not null and it should be"	TokenNameStringLiteral
,	TokenNameCOMMA
expectPay	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE