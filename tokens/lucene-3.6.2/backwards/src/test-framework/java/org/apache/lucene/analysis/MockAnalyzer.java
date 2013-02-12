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
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Random	TokenNameIdentifier
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
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
MockAnalyzer	TokenNameIdentifier
extends	TokenNameextends
Analyzer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
lowerCase	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
CharArraySet	TokenNameIdentifier
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
enablePositionIncrements	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
positionIncrementGap	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Random	TokenNameIdentifier
random	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
previousMappings	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
enableChecks	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
public	TokenNamepublic
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
Random	TokenNameIdentifier
random	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
pattern	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
lowerCase	TokenNameIdentifier
,	TokenNameCOMMA
CharArraySet	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
enablePositionIncrements	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
random	TokenNameIdentifier
=	TokenNameEQUAL
random	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
pattern	TokenNameIdentifier
=	TokenNameEQUAL
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
lowerCase	TokenNameIdentifier
=	TokenNameEQUAL
lowerCase	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
filter	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
enablePositionIncrements	TokenNameIdentifier
=	TokenNameEQUAL
enablePositionIncrements	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
Random	TokenNameIdentifier
random	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
pattern	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
lowerCase	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
pattern	TokenNameIdentifier
,	TokenNameCOMMA
lowerCase	TokenNameIdentifier
,	TokenNameCOMMA
CharArraySet	TokenNameIdentifier
.	TokenNameDOT
EMPTY_SET	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
Random	TokenNameIdentifier
random	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
MockTokenizer	TokenNameIdentifier
.	TokenNameDOT
WHITESPACE	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
TokenStream	TokenNameIdentifier
tokenStream	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
MockTokenizer	TokenNameIdentifier
tokenizer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
pattern	TokenNameIdentifier
,	TokenNameCOMMA
lowerCase	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tokenizer	TokenNameIdentifier
.	TokenNameDOT
setEnableChecks	TokenNameIdentifier
(	TokenNameLPAREN
enableChecks	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StopFilter	TokenNameIdentifier
filt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StopFilter	TokenNameIdentifier
(	TokenNameLPAREN
LuceneTestCase	TokenNameIdentifier
.	TokenNameDOT
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
tokenizer	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filt	TokenNameIdentifier
.	TokenNameDOT
setEnablePositionIncrements	TokenNameIdentifier
(	TokenNameLPAREN
enablePositionIncrements	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
maybePayload	TokenNameIdentifier
(	TokenNameLPAREN
filt	TokenNameIdentifier
,	TokenNameCOMMA
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
class	TokenNameclass
SavedStreams	TokenNameIdentifier
{	TokenNameLBRACE
MockTokenizer	TokenNameIdentifier
tokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
TokenFilter	TokenNameIdentifier
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
TokenStream	TokenNameIdentifier
reusableTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
SavedStreams	TokenNameIdentifier
>	TokenNameGREATER
map	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Map	TokenNameIdentifier
)	TokenNameRPAREN
getPreviousTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
map	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
map	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
SavedStreams	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setPreviousTokenStream	TokenNameIdentifier
(	TokenNameLPAREN
map	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
SavedStreams	TokenNameIdentifier
saved	TokenNameIdentifier
=	TokenNameEQUAL
map	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
saved	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
saved	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SavedStreams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
saved	TokenNameIdentifier
.	TokenNameDOT
tokenizer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MockTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
pattern	TokenNameIdentifier
,	TokenNameCOMMA
lowerCase	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
saved	TokenNameIdentifier
.	TokenNameDOT
tokenizer	TokenNameIdentifier
.	TokenNameDOT
setEnableChecks	TokenNameIdentifier
(	TokenNameLPAREN
enableChecks	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StopFilter	TokenNameIdentifier
filt	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StopFilter	TokenNameIdentifier
(	TokenNameLPAREN
LuceneTestCase	TokenNameIdentifier
.	TokenNameDOT
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
saved	TokenNameIdentifier
.	TokenNameDOT
tokenizer	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filt	TokenNameIdentifier
.	TokenNameDOT
setEnablePositionIncrements	TokenNameIdentifier
(	TokenNameLPAREN
enablePositionIncrements	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
saved	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
=	TokenNameEQUAL
filt	TokenNameIdentifier
;	TokenNameSEMICOLON
saved	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
=	TokenNameEQUAL
maybePayload	TokenNameIdentifier
(	TokenNameLPAREN
saved	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
,	TokenNameCOMMA
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
map	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
saved	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
saved	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
saved	TokenNameIdentifier
.	TokenNameDOT
tokenizer	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
saved	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
synchronized	TokenNamesynchronized
TokenFilter	TokenNameIdentifier
maybePayload	TokenNameIdentifier
(	TokenNameLPAREN
TokenFilter	TokenNameIdentifier
stream	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Integer	TokenNameIdentifier
val	TokenNameIdentifier
=	TokenNameEQUAL
previousMappings	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
val	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
LuceneTestCase	TokenNameIdentifier
.	TokenNameDOT
rarely	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
0	TokenNameIntegerLiteral
:	TokenNameCOLON
val	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
1	TokenNameIntegerLiteral
:	TokenNameCOLON
val	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
2	TokenNameIntegerLiteral
:	TokenNameCOLON
val	TokenNameIdentifier
=	TokenNameEQUAL
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
12	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
previousMappings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
stream	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
MockVariableLengthPayloadFilter	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
stream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
new	TokenNamenew
MockFixedLengthPayloadFilter	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
stream	TokenNameIdentifier
,	TokenNameCOMMA
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPositionIncrementGap	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
positionIncrementGap	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
positionIncrementGap	TokenNameIdentifier
=	TokenNameEQUAL
positionIncrementGap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
getPositionIncrementGap	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
positionIncrementGap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setEnableChecks	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
enableChecks	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
enableChecks	TokenNameIdentifier
=	TokenNameEQUAL
enableChecks	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
