package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
collation	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
IndexableBinaryStringTools	TokenNameIdentifier
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
text	TokenNameIdentifier
.	TokenNameDOT
Collator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
CollationKeyFilter	TokenNameIdentifier
extends	TokenNameextends
TokenFilter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Collator	TokenNameIdentifier
collator	TokenNameIdentifier
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
public	TokenNamepublic
CollationKeyFilter	TokenNameIdentifier
(	TokenNameLPAREN
TokenStream	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
Collator	TokenNameIdentifier
collator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
collator	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Collator	TokenNameIdentifier
)	TokenNameRPAREN
collator	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
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
input	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
collationKey	TokenNameIdentifier
=	TokenNameEQUAL
collator	TokenNameIdentifier
.	TokenNameDOT
getCollationKey	TokenNameIdentifier
(	TokenNameLPAREN
termAtt	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toByteArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
encodedLength	TokenNameIdentifier
=	TokenNameEQUAL
IndexableBinaryStringTools	TokenNameIdentifier
.	TokenNameDOT
getEncodedLength	TokenNameIdentifier
(	TokenNameLPAREN
collationKey	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
collationKey	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
resizeBuffer	TokenNameIdentifier
(	TokenNameLPAREN
encodedLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
encodedLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexableBinaryStringTools	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
collationKey	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
collationKey	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
encodedLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
}	TokenNameRBRACE