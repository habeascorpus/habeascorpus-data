package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
StringReader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestISOLatin1AccentFilter	TokenNameIdentifier
extends	TokenNameextends
BaseTokenStreamTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testU	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
TokenStream	TokenNameIdentifier
stream	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
WhitespaceTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
"Des mot clés À LA CHAÎNE À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ĳ Ð Ñ Ò Ó Ô Õ Ö Ø Œ Þ Ù Ú Û Ü Ý Ÿ à á â ã ä å æ ç è é ê ë ì í î ï ĳ ð ñ ò ó ô õ ö ø œ ß þ ù ú û ü ý ÿ ﬁ ﬂ"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ISOLatin1AccentFilter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ISOLatin1AccentFilter	TokenNameIdentifier
(	TokenNameLPAREN
stream	TokenNameIdentifier
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
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Des"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"mot"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"cles"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"A"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"LA"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"CHAINE"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"A"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"A"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"A"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"A"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"A"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"A"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"AE"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"C"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"E"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"E"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"E"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"E"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"I"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"I"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"I"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"I"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"IJ"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"D"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"N"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"O"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"O"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"O"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"O"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"O"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"O"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"OE"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TH"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"U"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"U"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"U"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"U"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Y"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Y"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"ae"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"c"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"e"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"e"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"e"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"e"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"i"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"i"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"i"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"i"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"ij"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"d"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"n"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"o"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"o"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"o"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"o"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"o"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"o"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"oe"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"ss"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"th"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"u"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"u"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"u"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"u"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"y"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"y"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"fi"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTermEquals	TokenNameIdentifier
(	TokenNameLPAREN
"fl"	TokenNameStringLiteral
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
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
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
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
}	TokenNameRBRACE
}	TokenNameRBRACE