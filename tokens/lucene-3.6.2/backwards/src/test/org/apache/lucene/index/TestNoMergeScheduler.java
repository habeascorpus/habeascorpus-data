package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Constructor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Method	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Modifier	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestNoMergeScheduler	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testNoMergeScheduler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
MergeScheduler	TokenNameIdentifier
ms	TokenNameIdentifier
=	TokenNameEQUAL
NoMergeScheduler	TokenNameIdentifier
.	TokenNameDOT
INSTANCE	TokenNameIdentifier
;	TokenNameSEMICOLON
ms	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ms	TokenNameIdentifier
.	TokenNameDOT
merge	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testFinalSingleton	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
Modifier	TokenNameIdentifier
.	TokenNameDOT
isFinal	TokenNameIdentifier
(	TokenNameLPAREN
NoMergeScheduler	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getModifiers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Constructor	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ctors	TokenNameIdentifier
=	TokenNameEQUAL
NoMergeScheduler	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getDeclaredConstructors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"expected 1 private ctor only: "	TokenNameStringLiteral
+	TokenNamePLUS
Arrays	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
ctors	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
ctors	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"that 1 should be private: "	TokenNameStringLiteral
+	TokenNamePLUS
ctors	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
Modifier	TokenNameIdentifier
.	TokenNameDOT
isPrivate	TokenNameIdentifier
(	TokenNameLPAREN
ctors	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
getModifiers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testMethodsOverridden	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Method	TokenNameIdentifier
m	TokenNameIdentifier
:	TokenNameCOLON
NoMergeScheduler	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getMethods	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getDeclaringClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
Object	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
+	TokenNamePLUS
" is not overridden !"	TokenNameStringLiteral
,	TokenNameCOMMA
m	TokenNameIdentifier
.	TokenNameDOT
getDeclaringClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
NoMergeScheduler	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
