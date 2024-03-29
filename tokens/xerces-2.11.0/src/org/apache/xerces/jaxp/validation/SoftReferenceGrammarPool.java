package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
jaxp	TokenNameIdentifier
.	TokenNameDOT
validation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
.	TokenNameDOT
Reference	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
.	TokenNameDOT
ReferenceQueue	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
.	TokenNameDOT
SoftReference	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
grammars	TokenNameIdentifier
.	TokenNameDOT
Grammar	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
grammars	TokenNameIdentifier
.	TokenNameDOT
XMLGrammarDescription	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
grammars	TokenNameIdentifier
.	TokenNameDOT
XMLGrammarPool	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
grammars	TokenNameIdentifier
.	TokenNameDOT
XMLSchemaDescription	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
SoftReferenceGrammarPool	TokenNameIdentifier
implements	TokenNameimplements
XMLGrammarPool	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TABLE_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
11	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
Grammar	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ZERO_LENGTH_GRAMMAR_ARRAY	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Grammar	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
protected	TokenNameprotected
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fGrammars	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
fPoolIsLocked	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
fGrammarCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
ReferenceQueue	TokenNameIdentifier
fReferenceQueue	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ReferenceQueue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
SoftReferenceGrammarPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammars	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
TABLE_SIZE	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
fPoolIsLocked	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SoftReferenceGrammarPool	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
initialCapacity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammars	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
initialCapacity	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
fPoolIsLocked	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Grammar	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
retrieveInitialGrammarSet	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
grammarType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammars	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
clean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ZERO_LENGTH_GRAMMAR_ARRAY	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
cacheGrammars	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
grammarType	TokenNameIdentifier
,	TokenNameCOMMA
Grammar	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
grammars	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
fPoolIsLocked	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
grammars	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
grammars	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Grammar	TokenNameIdentifier
retrieveGrammar	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getGrammar	TokenNameIdentifier
(	TokenNameLPAREN
desc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
putGrammar	TokenNameIdentifier
(	TokenNameLPAREN
Grammar	TokenNameIdentifier
grammar	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
fPoolIsLocked	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammars	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
clean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
=	TokenNameEQUAL
grammar	TokenNameIdentifier
.	TokenNameDOT
getGrammarDescription	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
desc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
hash	TokenNameIdentifier
&	TokenNameAND
0x7FFFFFFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
%	TokenNameREMAINDER
fGrammars	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
entry	TokenNameIdentifier
=	TokenNameEQUAL
fGrammars	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
&&	TokenNameAND_AND
equals	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
desc	TokenNameIdentifier
,	TokenNameCOMMA
desc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
grammar	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
grammar	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
entry	TokenNameIdentifier
.	TokenNameDOT
grammar	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SoftGrammarReference	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
,	TokenNameCOMMA
grammar	TokenNameIdentifier
,	TokenNameCOMMA
fReferenceQueue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
Entry	TokenNameIdentifier
entry	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
(	TokenNameLPAREN
hash	TokenNameIdentifier
,	TokenNameCOMMA
index	TokenNameIdentifier
,	TokenNameCOMMA
desc	TokenNameIdentifier
,	TokenNameCOMMA
grammar	TokenNameIdentifier
,	TokenNameCOMMA
fGrammars	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
fReferenceQueue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fGrammars	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
entry	TokenNameIdentifier
;	TokenNameSEMICOLON
fGrammarCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Grammar	TokenNameIdentifier
getGrammar	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammars	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
clean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
desc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
hash	TokenNameIdentifier
&	TokenNameAND
0x7FFFFFFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
%	TokenNameREMAINDER
fGrammars	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
entry	TokenNameIdentifier
=	TokenNameEQUAL
fGrammars	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Grammar	TokenNameIdentifier
tempGrammar	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Grammar	TokenNameIdentifier
)	TokenNameRPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
grammar	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tempGrammar	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
removeEntry	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
equals	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
desc	TokenNameIdentifier
,	TokenNameCOMMA
desc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
tempGrammar	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Grammar	TokenNameIdentifier
removeGrammar	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammars	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
clean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
desc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
hash	TokenNameIdentifier
&	TokenNameAND
0x7FFFFFFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
%	TokenNameREMAINDER
fGrammars	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
entry	TokenNameIdentifier
=	TokenNameEQUAL
fGrammars	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
equals	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
desc	TokenNameIdentifier
,	TokenNameCOMMA
desc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
removeEntry	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
containsGrammar	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
fGrammars	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
clean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
desc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
hash	TokenNameIdentifier
&	TokenNameAND
0x7FFFFFFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
%	TokenNameREMAINDER
fGrammars	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
entry	TokenNameIdentifier
=	TokenNameEQUAL
fGrammars	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Grammar	TokenNameIdentifier
tempGrammar	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Grammar	TokenNameIdentifier
)	TokenNameRPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
grammar	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tempGrammar	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
removeEntry	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
equals	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
desc	TokenNameIdentifier
,	TokenNameCOMMA
desc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
lockPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fPoolIsLocked	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
unlockPool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fPoolIsLocked	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
fGrammars	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fGrammars	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
fGrammars	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fGrammars	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
fGrammarCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
desc1	TokenNameIdentifier
,	TokenNameCOMMA
XMLGrammarDescription	TokenNameIdentifier
desc2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
desc1	TokenNameIdentifier
instanceof	TokenNameinstanceof
XMLSchemaDescription	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
desc2	TokenNameIdentifier
instanceof	TokenNameinstanceof
XMLSchemaDescription	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
XMLSchemaDescription	TokenNameIdentifier
sd1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XMLSchemaDescription	TokenNameIdentifier
)	TokenNameRPAREN
desc1	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
XMLSchemaDescription	TokenNameIdentifier
sd2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XMLSchemaDescription	TokenNameIdentifier
)	TokenNameRPAREN
desc2	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
targetNamespace	TokenNameIdentifier
=	TokenNameEQUAL
sd1	TokenNameIdentifier
.	TokenNameDOT
getTargetNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
targetNamespace	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
targetNamespace	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
sd2	TokenNameIdentifier
.	TokenNameDOT
getTargetNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
sd2	TokenNameIdentifier
.	TokenNameDOT
getTargetNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
String	TokenNameIdentifier
expandedSystemId	TokenNameIdentifier
=	TokenNameEQUAL
sd1	TokenNameIdentifier
.	TokenNameDOT
getExpandedSystemId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
expandedSystemId	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
expandedSystemId	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
sd2	TokenNameIdentifier
.	TokenNameDOT
getExpandedSystemId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
sd2	TokenNameIdentifier
.	TokenNameDOT
getExpandedSystemId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
desc1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
desc2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
desc	TokenNameIdentifier
instanceof	TokenNameinstanceof
XMLSchemaDescription	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
XMLSchemaDescription	TokenNameIdentifier
sd	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XMLSchemaDescription	TokenNameIdentifier
)	TokenNameRPAREN
desc	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
targetNamespace	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getTargetNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
expandedSystemId	TokenNameIdentifier
=	TokenNameEQUAL
sd	TokenNameIdentifier
.	TokenNameDOT
getExpandedSystemId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
targetNamespace	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
targetNamespace	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
^=	TokenNameXOR_EQUAL
(	TokenNameLPAREN
expandedSystemId	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
expandedSystemId	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
desc	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Grammar	TokenNameIdentifier
removeEntry	TokenNameIdentifier
(	TokenNameLPAREN
Entry	TokenNameIdentifier
entry	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
prev	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
entry	TokenNameIdentifier
.	TokenNameDOT
prev	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
fGrammars	TokenNameIdentifier
[	TokenNameLBRACKET
entry	TokenNameIdentifier
.	TokenNameDOT
bucket	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
entry	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
.	TokenNameDOT
prev	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
prev	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
--	TokenNameMINUS_MINUS
fGrammarCount	TokenNameIdentifier
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
.	TokenNameDOT
grammar	TokenNameIdentifier
.	TokenNameDOT
entry	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
Grammar	TokenNameIdentifier
)	TokenNameRPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
grammar	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
clean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Reference	TokenNameIdentifier
ref	TokenNameIdentifier
=	TokenNameEQUAL
fReferenceQueue	TokenNameIdentifier
.	TokenNameDOT
poll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
ref	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Entry	TokenNameIdentifier
entry	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
SoftGrammarReference	TokenNameIdentifier
)	TokenNameRPAREN
ref	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
entry	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
entry	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
removeEntry	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ref	TokenNameIdentifier
=	TokenNameEQUAL
fReferenceQueue	TokenNameIdentifier
.	TokenNameDOT
poll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
Entry	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
bucket	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Entry	TokenNameIdentifier
prev	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Entry	TokenNameIdentifier
next	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SoftGrammarReference	TokenNameIdentifier
grammar	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Entry	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
hash	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
bucket	TokenNameIdentifier
,	TokenNameCOMMA
XMLGrammarDescription	TokenNameIdentifier
desc	TokenNameIdentifier
,	TokenNameCOMMA
Grammar	TokenNameIdentifier
grammar	TokenNameIdentifier
,	TokenNameCOMMA
Entry	TokenNameIdentifier
next	TokenNameIdentifier
,	TokenNameCOMMA
ReferenceQueue	TokenNameIdentifier
queue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
hash	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
bucket	TokenNameIdentifier
=	TokenNameEQUAL
bucket	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
prev	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
next	TokenNameIdentifier
.	TokenNameDOT
prev	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
desc	TokenNameIdentifier
=	TokenNameEQUAL
desc	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
grammar	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SoftGrammarReference	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
grammar	TokenNameIdentifier
,	TokenNameCOMMA
queue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
desc	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
grammar	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
next	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
next	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
SoftGrammarReference	TokenNameIdentifier
extends	TokenNameextends
SoftReference	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Entry	TokenNameIdentifier
entry	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
SoftGrammarReference	TokenNameIdentifier
(	TokenNameLPAREN
Entry	TokenNameIdentifier
entry	TokenNameIdentifier
,	TokenNameCOMMA
Grammar	TokenNameIdentifier
grammar	TokenNameIdentifier
,	TokenNameCOMMA
ReferenceQueue	TokenNameIdentifier
queue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
grammar	TokenNameIdentifier
,	TokenNameCOMMA
queue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
entry	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
