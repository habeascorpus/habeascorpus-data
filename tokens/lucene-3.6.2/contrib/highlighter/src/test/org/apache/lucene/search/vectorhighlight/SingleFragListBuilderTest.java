package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
vectorhighlight	TokenNameIdentifier
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
Query	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SingleFragListBuilderTest	TokenNameIdentifier
extends	TokenNameextends
AbstractTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testNullFieldFragList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SingleFragListBuilder	TokenNameIdentifier
sflb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SingleFragListBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FieldFragList	TokenNameIdentifier
ffl	TokenNameIdentifier
=	TokenNameEQUAL
sflb	TokenNameIdentifier
.	TokenNameDOT
createFieldFragList	TokenNameIdentifier
(	TokenNameLPAREN
fpl	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"b c d"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
ffl	TokenNameIdentifier
.	TokenNameDOT
getFragInfos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testShortFieldFragList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SingleFragListBuilder	TokenNameIdentifier
sflb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SingleFragListBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FieldFragList	TokenNameIdentifier
ffl	TokenNameIdentifier
=	TokenNameEQUAL
sflb	TokenNameIdentifier
.	TokenNameDOT
createFieldFragList	TokenNameIdentifier
(	TokenNameLPAREN
fpl	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"a b c d"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
ffl	TokenNameIdentifier
.	TokenNameDOT
getFragInfos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"subInfos=(a((0,1)))/1.0(0,2147483647)"	TokenNameStringLiteral
,	TokenNameCOMMA
ffl	TokenNameIdentifier
.	TokenNameDOT
getFragInfos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testLongFieldFragList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
SingleFragListBuilder	TokenNameIdentifier
sflb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SingleFragListBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FieldFragList	TokenNameIdentifier
ffl	TokenNameIdentifier
=	TokenNameEQUAL
sflb	TokenNameIdentifier
.	TokenNameDOT
createFieldFragList	TokenNameIdentifier
(	TokenNameLPAREN
fpl	TokenNameIdentifier
(	TokenNameLPAREN
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"a b c d"	TokenNameStringLiteral
,	TokenNameCOMMA
"a b c d e f g h i"	TokenNameStringLiteral
,	TokenNameCOMMA
"j k l m n o p q r s t u v w x y z a b c"	TokenNameStringLiteral
,	TokenNameCOMMA
"d e f g"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
ffl	TokenNameIdentifier
.	TokenNameDOT
getFragInfos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"subInfos=(a((0,1))a((8,9))a((60,61)))/3.0(0,2147483647)"	TokenNameStringLiteral
,	TokenNameCOMMA
ffl	TokenNameIdentifier
.	TokenNameDOT
getFragInfos	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
FieldPhraseList	TokenNameIdentifier
fpl	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
queryValue	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
indexValues	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
make1dmfIndex	TokenNameIdentifier
(	TokenNameLPAREN
indexValues	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
query	TokenNameIdentifier
=	TokenNameEQUAL
paW	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
queryValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FieldQuery	TokenNameIdentifier
fq	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldQuery	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FieldTermStack	TokenNameIdentifier
stack	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldTermStack	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
F	TokenNameIdentifier
,	TokenNameCOMMA
fq	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FieldPhraseList	TokenNameIdentifier
(	TokenNameLPAREN
stack	TokenNameIdentifier
,	TokenNameCOMMA
fq	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
