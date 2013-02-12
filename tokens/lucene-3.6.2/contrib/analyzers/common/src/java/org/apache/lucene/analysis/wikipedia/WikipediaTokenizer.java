package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
wikipedia	TokenNameIdentifier
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
FlagsAttribute	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
WikipediaTokenizer	TokenNameIdentifier
extends	TokenNameextends
Tokenizer	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
INTERNAL_LINK	TokenNameIdentifier
=	TokenNameEQUAL
"il"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
EXTERNAL_LINK	TokenNameIdentifier
=	TokenNameEQUAL
"el"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
EXTERNAL_LINK_URL	TokenNameIdentifier
=	TokenNameEQUAL
"elu"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
CITATION	TokenNameIdentifier
=	TokenNameEQUAL
"ci"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
CATEGORY	TokenNameIdentifier
=	TokenNameEQUAL
"c"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
BOLD	TokenNameIdentifier
=	TokenNameEQUAL
"b"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ITALICS	TokenNameIdentifier
=	TokenNameEQUAL
"i"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
BOLD_ITALICS	TokenNameIdentifier
=	TokenNameEQUAL
"bi"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
HEADING	TokenNameIdentifier
=	TokenNameEQUAL
"h"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
SUB_HEADING	TokenNameIdentifier
=	TokenNameEQUAL
"sh"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
ALPHANUM_ID	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
APOSTROPHE_ID	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
ACRONYM_ID	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
COMPANY_ID	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
EMAIL_ID	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
HOST_ID	TokenNameIdentifier
=	TokenNameEQUAL
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
NUM_ID	TokenNameIdentifier
=	TokenNameEQUAL
6	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
CJ_ID	TokenNameIdentifier
=	TokenNameEQUAL
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
INTERNAL_LINK_ID	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
EXTERNAL_LINK_ID	TokenNameIdentifier
=	TokenNameEQUAL
9	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
CITATION_ID	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
CATEGORY_ID	TokenNameIdentifier
=	TokenNameEQUAL
11	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
BOLD_ID	TokenNameIdentifier
=	TokenNameEQUAL
12	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
ITALICS_ID	TokenNameIdentifier
=	TokenNameEQUAL
13	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
BOLD_ITALICS_ID	TokenNameIdentifier
=	TokenNameEQUAL
14	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
HEADING_ID	TokenNameIdentifier
=	TokenNameEQUAL
15	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
SUB_HEADING_ID	TokenNameIdentifier
=	TokenNameEQUAL
16	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
EXTERNAL_LINK_URL_ID	TokenNameIdentifier
=	TokenNameEQUAL
17	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
TOKEN_TYPES	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
"<ALPHANUM>"	TokenNameStringLiteral
,	TokenNameCOMMA
"<APOSTROPHE>"	TokenNameStringLiteral
,	TokenNameCOMMA
"<ACRONYM>"	TokenNameStringLiteral
,	TokenNameCOMMA
"<COMPANY>"	TokenNameStringLiteral
,	TokenNameCOMMA
"<EMAIL>"	TokenNameStringLiteral
,	TokenNameCOMMA
"<HOST>"	TokenNameStringLiteral
,	TokenNameCOMMA
"<NUM>"	TokenNameStringLiteral
,	TokenNameCOMMA
"<CJ>"	TokenNameStringLiteral
,	TokenNameCOMMA
INTERNAL_LINK	TokenNameIdentifier
,	TokenNameCOMMA
EXTERNAL_LINK	TokenNameIdentifier
,	TokenNameCOMMA
CITATION	TokenNameIdentifier
,	TokenNameCOMMA
CATEGORY	TokenNameIdentifier
,	TokenNameCOMMA
BOLD	TokenNameIdentifier
,	TokenNameCOMMA
ITALICS	TokenNameIdentifier
,	TokenNameCOMMA
BOLD_ITALICS	TokenNameIdentifier
,	TokenNameCOMMA
HEADING	TokenNameIdentifier
,	TokenNameCOMMA
SUB_HEADING	TokenNameIdentifier
,	TokenNameCOMMA
EXTERNAL_LINK_URL	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TOKENS_ONLY	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
UNTOKENIZED_ONLY	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
BOTH	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
WikipediaTokenizerImpl	TokenNameIdentifier
scanner	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
tokenOutput	TokenNameIdentifier
=	TokenNameEQUAL
TOKENS_ONLY	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
untokenizedTypes	TokenNameIdentifier
=	TokenNameEQUAL
Collections	TokenNameIdentifier
.	TokenNameDOT
emptySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Iterator	TokenNameIdentifier
<	TokenNameLESS
AttributeSource	TokenNameIdentifier
.	TokenNameDOT
State	TokenNameIdentifier
>	TokenNameGREATER
tokens	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
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
private	TokenNameprivate
final	TokenNamefinal
PositionIncrementAttribute	TokenNameIdentifier
posIncrAtt	TokenNameIdentifier
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
FlagsAttribute	TokenNameIdentifier
flagsAtt	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
FlagsAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
first	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
WikipediaTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
Reader	TokenNameIdentifier
input	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
input	TokenNameIdentifier
,	TokenNameCOMMA
TOKENS_ONLY	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
emptySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
WikipediaTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
Reader	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
tokenOutput	TokenNameIdentifier
,	TokenNameCOMMA
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
untokenizedTypes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scanner	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
WikipediaTokenizerImpl	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
init	TokenNameIdentifier
(	TokenNameLPAREN
tokenOutput	TokenNameIdentifier
,	TokenNameCOMMA
untokenizedTypes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
WikipediaTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
AttributeFactory	TokenNameIdentifier
factory	TokenNameIdentifier
,	TokenNameCOMMA
Reader	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
tokenOutput	TokenNameIdentifier
,	TokenNameCOMMA
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
untokenizedTypes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
factory	TokenNameIdentifier
,	TokenNameCOMMA
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scanner	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
WikipediaTokenizerImpl	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
init	TokenNameIdentifier
(	TokenNameLPAREN
tokenOutput	TokenNameIdentifier
,	TokenNameCOMMA
untokenizedTypes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
WikipediaTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
AttributeSource	TokenNameIdentifier
source	TokenNameIdentifier
,	TokenNameCOMMA
Reader	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
tokenOutput	TokenNameIdentifier
,	TokenNameCOMMA
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
untokenizedTypes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
source	TokenNameIdentifier
,	TokenNameCOMMA
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scanner	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
WikipediaTokenizerImpl	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
init	TokenNameIdentifier
(	TokenNameLPAREN
tokenOutput	TokenNameIdentifier
,	TokenNameCOMMA
untokenizedTypes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
tokenOutput	TokenNameIdentifier
,	TokenNameCOMMA
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
untokenizedTypes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tokenOutput	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
TOKENS_ONLY	TokenNameIdentifier
&&	TokenNameAND_AND
tokenOutput	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
UNTOKENIZED_ONLY	TokenNameIdentifier
&&	TokenNameAND_AND
tokenOutput	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
BOTH	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"tokenOutput must be TOKENS_ONLY, UNTOKENIZED_ONLY or BOTH"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
tokenOutput	TokenNameIdentifier
=	TokenNameEQUAL
tokenOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
untokenizedTypes	TokenNameIdentifier
=	TokenNameEQUAL
untokenizedTypes	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
final	TokenNamefinal
boolean	TokenNameboolean
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tokens	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
tokens	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
AttributeSource	TokenNameIdentifier
.	TokenNameDOT
State	TokenNameIdentifier
state	TokenNameIdentifier
=	TokenNameEQUAL
tokens	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
restoreState	TokenNameIdentifier
(	TokenNameLPAREN
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
clearAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
tokenType	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
getNextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tokenType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
WikipediaTokenizerImpl	TokenNameIdentifier
.	TokenNameDOT
YYEOF	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
type	TokenNameIdentifier
=	TokenNameEQUAL
WikipediaTokenizerImpl	TokenNameIdentifier
.	TokenNameDOT
TOKEN_TYPES	TokenNameIdentifier
[	TokenNameLBRACKET
tokenType	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tokenOutput	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
TOKENS_ONLY	TokenNameIdentifier
||	TokenNameOR_OR
untokenizedTypes	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
false	TokenNamefalse
)	TokenNameRPAREN
{	TokenNameLBRACE
setupToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
tokenOutput	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
UNTOKENIZED_ONLY	TokenNameIdentifier
&&	TokenNameAND_AND
untokenizedTypes	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
collapseTokens	TokenNameIdentifier
(	TokenNameLPAREN
tokenType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
tokenOutput	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
BOTH	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
collapseAndSaveTokens	TokenNameIdentifier
(	TokenNameLPAREN
tokenType	TokenNameIdentifier
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
posinc	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
getPositionIncrement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
first	TokenNameIdentifier
&&	TokenNameAND_AND
posinc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
posinc	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
posIncrAtt	TokenNameIdentifier
.	TokenNameDOT
setPositionIncrement	TokenNameIdentifier
(	TokenNameLPAREN
posinc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
typeAtt	TokenNameIdentifier
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
first	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
collapseAndSaveTokens	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
tokenType	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
numAdded	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
setText	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
theStart	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
yychar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
lastPos	TokenNameIdentifier
=	TokenNameEQUAL
theStart	TokenNameIdentifier
+	TokenNamePLUS
numAdded	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
tmpTokType	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
numSeen	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
AttributeSource	TokenNameIdentifier
.	TokenNameDOT
State	TokenNameIdentifier
>	TokenNameGREATER
tmp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
AttributeSource	TokenNameIdentifier
.	TokenNameDOT
State	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setupSavedToken	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
captureState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
tmpTokType	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
getNextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
WikipediaTokenizerImpl	TokenNameIdentifier
.	TokenNameDOT
YYEOF	TokenNameIdentifier
&&	TokenNameAND_AND
tmpTokType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
tokenType	TokenNameIdentifier
&&	TokenNameAND_AND
scanner	TokenNameIdentifier
.	TokenNameDOT
getNumWikiTokensSeen	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
numSeen	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
currPos	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
yychar	TokenNameIdentifier
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
(	TokenNameLPAREN
currPos	TokenNameIdentifier
-	TokenNameMINUS
lastPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
' '	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
numAdded	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
setText	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setupSavedToken	TokenNameIdentifier
(	TokenNameLPAREN
scanner	TokenNameIdentifier
.	TokenNameDOT
getPositionIncrement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmp	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
captureState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
numSeen	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
lastPos	TokenNameIdentifier
=	TokenNameEQUAL
currPos	TokenNameIdentifier
+	TokenNamePLUS
numAdded	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
trim	TokenNameIdentifier
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
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
correctOffset	TokenNameIdentifier
(	TokenNameLPAREN
theStart	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
correctOffset	TokenNameIdentifier
(	TokenNameLPAREN
theStart	TokenNameIdentifier
+	TokenNamePLUS
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
flagsAtt	TokenNameIdentifier
.	TokenNameDOT
setFlags	TokenNameIdentifier
(	TokenNameLPAREN
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tmpTokType	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
WikipediaTokenizerImpl	TokenNameIdentifier
.	TokenNameDOT
YYEOF	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
scanner	TokenNameIdentifier
.	TokenNameDOT
yypushback	TokenNameIdentifier
(	TokenNameLPAREN
scanner	TokenNameIdentifier
.	TokenNameDOT
yylength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
tokens	TokenNameIdentifier
=	TokenNameEQUAL
tmp	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
setupSavedToken	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
positionInc	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setupToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
posIncrAtt	TokenNameIdentifier
.	TokenNameDOT
setPositionIncrement	TokenNameIdentifier
(	TokenNameLPAREN
positionInc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
typeAtt	TokenNameIdentifier
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
collapseTokens	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
tokenType	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
numAdded	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
setText	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
theStart	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
yychar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
lastPos	TokenNameIdentifier
=	TokenNameEQUAL
theStart	TokenNameIdentifier
+	TokenNamePLUS
numAdded	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
tmpTokType	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
numSeen	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
tmpTokType	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
getNextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
WikipediaTokenizerImpl	TokenNameIdentifier
.	TokenNameDOT
YYEOF	TokenNameIdentifier
&&	TokenNameAND_AND
tmpTokType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
tokenType	TokenNameIdentifier
&&	TokenNameAND_AND
scanner	TokenNameIdentifier
.	TokenNameDOT
getNumWikiTokensSeen	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
numSeen	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
currPos	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
yychar	TokenNameIdentifier
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
(	TokenNameLPAREN
currPos	TokenNameIdentifier
-	TokenNameMINUS
lastPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
' '	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
numAdded	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
setText	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
numSeen	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
lastPos	TokenNameIdentifier
=	TokenNameEQUAL
currPos	TokenNameIdentifier
+	TokenNamePLUS
numAdded	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
trim	TokenNameIdentifier
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
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
correctOffset	TokenNameIdentifier
(	TokenNameLPAREN
theStart	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
correctOffset	TokenNameIdentifier
(	TokenNameLPAREN
theStart	TokenNameIdentifier
+	TokenNamePLUS
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
flagsAtt	TokenNameIdentifier
.	TokenNameDOT
setFlags	TokenNameIdentifier
(	TokenNameLPAREN
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tmpTokType	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
WikipediaTokenizerImpl	TokenNameIdentifier
.	TokenNameDOT
YYEOF	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
scanner	TokenNameIdentifier
.	TokenNameDOT
yypushback	TokenNameIdentifier
(	TokenNameLPAREN
scanner	TokenNameIdentifier
.	TokenNameDOT
yylength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
tokens	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
setupToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
scanner	TokenNameIdentifier
.	TokenNameDOT
getText	TokenNameIdentifier
(	TokenNameLPAREN
termAtt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
start	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
yychar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offsetAtt	TokenNameIdentifier
.	TokenNameDOT
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
correctOffset	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
correctOffset	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
+	TokenNamePLUS
termAtt	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
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
tokens	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
scanner	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
first	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
scanner	TokenNameIdentifier
.	TokenNameDOT
yyreset	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
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
scanner	TokenNameIdentifier
.	TokenNameDOT
yychar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
scanner	TokenNameIdentifier
.	TokenNameDOT
yylength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
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
