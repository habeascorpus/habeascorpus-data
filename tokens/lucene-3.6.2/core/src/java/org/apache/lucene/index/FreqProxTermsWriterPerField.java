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
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
document	TokenNameIdentifier
.	TokenNameDOT
Fieldable	TokenNameIdentifier
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
FieldInfo	TokenNameIdentifier
.	TokenNameDOT
IndexOptions	TokenNameIdentifier
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
RamUsageEstimator	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
FreqProxTermsWriterPerField	TokenNameIdentifier
extends	TokenNameextends
TermsHashConsumerPerField	TokenNameIdentifier
implements	TokenNameimplements
Comparable	TokenNameIdentifier
<	TokenNameLESS
FreqProxTermsWriterPerField	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
final	TokenNamefinal
FreqProxTermsWriterPerThread	TokenNameIdentifier
perThread	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
TermsHashPerField	TokenNameIdentifier
termsHashPerField	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
FieldInfo	TokenNameIdentifier
fieldInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
DocState	TokenNameIdentifier
docState	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
FieldInvertState	TokenNameIdentifier
fieldState	TokenNameIdentifier
;	TokenNameSEMICOLON
IndexOptions	TokenNameIdentifier
indexOptions	TokenNameIdentifier
;	TokenNameSEMICOLON
PayloadAttribute	TokenNameIdentifier
payloadAttribute	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FreqProxTermsWriterPerField	TokenNameIdentifier
(	TokenNameLPAREN
TermsHashPerField	TokenNameIdentifier
termsHashPerField	TokenNameIdentifier
,	TokenNameCOMMA
FreqProxTermsWriterPerThread	TokenNameIdentifier
perThread	TokenNameIdentifier
,	TokenNameCOMMA
FieldInfo	TokenNameIdentifier
fieldInfo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
termsHashPerField	TokenNameIdentifier
=	TokenNameEQUAL
termsHashPerField	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
perThread	TokenNameIdentifier
=	TokenNameEQUAL
perThread	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
=	TokenNameEQUAL
fieldInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
docState	TokenNameIdentifier
=	TokenNameEQUAL
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
docState	TokenNameIdentifier
;	TokenNameSEMICOLON
fieldState	TokenNameIdentifier
=	TokenNameEQUAL
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
fieldState	TokenNameIdentifier
;	TokenNameSEMICOLON
indexOptions	TokenNameIdentifier
=	TokenNameEQUAL
fieldInfo	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
int	TokenNameint
getStreamCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
indexOptions	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
void	TokenNamevoid
finish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
boolean	TokenNameboolean
hasPayloads	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
void	TokenNamevoid
skippingLongTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
FreqProxTermsWriterPerField	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fieldInfo	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
indexOptions	TokenNameIdentifier
=	TokenNameEQUAL
fieldInfo	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
;	TokenNameSEMICOLON
payloadAttribute	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
boolean	TokenNameboolean
start	TokenNameIdentifier
(	TokenNameLPAREN
Fieldable	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
count	TokenNameIdentifier
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
count	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
if	TokenNameif
(	TokenNameLPAREN
fields	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
isIndexed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
void	TokenNamevoid
start	TokenNameIdentifier
(	TokenNameLPAREN
Fieldable	TokenNameIdentifier
f	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fieldState	TokenNameIdentifier
.	TokenNameDOT
attributeSource	TokenNameIdentifier
.	TokenNameDOT
hasAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PayloadAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
payloadAttribute	TokenNameIdentifier
=	TokenNameEQUAL
fieldState	TokenNameIdentifier
.	TokenNameDOT
attributeSource	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
PayloadAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
payloadAttribute	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
writeProx	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
termID	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
proxCode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
Payload	TokenNameIdentifier
payload	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
payloadAttribute	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
payload	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
payload	TokenNameIdentifier
=	TokenNameEQUAL
payloadAttribute	TokenNameIdentifier
.	TokenNameDOT
getPayload	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
payload	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
payload	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
(	TokenNameLPAREN
proxCode	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
payload	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
payload	TokenNameIdentifier
.	TokenNameDOT
data	TokenNameIdentifier
,	TokenNameCOMMA
payload	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
,	TokenNameCOMMA
payload	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
hasPayloads	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
proxCode	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FreqProxPostingsArray	TokenNameIdentifier
postings	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FreqProxPostingsArray	TokenNameIdentifier
)	TokenNameRPAREN
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
postingsArray	TokenNameIdentifier
;	TokenNameSEMICOLON
postings	TokenNameIdentifier
.	TokenNameDOT
lastPositions	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
fieldState	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
void	TokenNamevoid
newTerm	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
termID	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
docState	TokenNameIdentifier
.	TokenNameDOT
testPoint	TokenNameIdentifier
(	TokenNameLPAREN
"FreqProxTermsWriterPerField.newTerm start"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FreqProxPostingsArray	TokenNameIdentifier
postings	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FreqProxPostingsArray	TokenNameIdentifier
)	TokenNameRPAREN
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
postingsArray	TokenNameIdentifier
;	TokenNameSEMICOLON
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocCodes	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocCodes	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
postings	TokenNameIdentifier
.	TokenNameDOT
docFreqs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
writeProx	TokenNameIdentifier
(	TokenNameLPAREN
termID	TokenNameIdentifier
,	TokenNameCOMMA
fieldState	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
fieldState	TokenNameIdentifier
.	TokenNameDOT
maxTermFrequency	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
fieldState	TokenNameIdentifier
.	TokenNameDOT
maxTermFrequency	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fieldState	TokenNameIdentifier
.	TokenNameDOT
uniqueTermCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
void	TokenNamevoid
addTerm	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
termID	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
docState	TokenNameIdentifier
.	TokenNameDOT
testPoint	TokenNameIdentifier
(	TokenNameLPAREN
"FreqProxTermsWriterPerField.addTerm start"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FreqProxPostingsArray	TokenNameIdentifier
postings	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FreqProxPostingsArray	TokenNameIdentifier
)	TokenNameRPAREN
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
postingsArray	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
||	TokenNameOR_OR
postings	TokenNameIdentifier
.	TokenNameDOT
docFreqs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
>	TokenNameGREATER
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocCodes	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocCodes	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
-	TokenNameMINUS
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
;	TokenNameSEMICOLON
fieldState	TokenNameIdentifier
.	TokenNameDOT
uniqueTermCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
>	TokenNameGREATER
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
postings	TokenNameIdentifier
.	TokenNameDOT
docFreqs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocCodes	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
|	TokenNameOR
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocCodes	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
postings	TokenNameIdentifier
.	TokenNameDOT
docFreqs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
postings	TokenNameIdentifier
.	TokenNameDOT
docFreqs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
fieldState	TokenNameIdentifier
.	TokenNameDOT
maxTermFrequency	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
fieldState	TokenNameIdentifier
.	TokenNameDOT
maxTermFrequency	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocCodes	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
-	TokenNameMINUS
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
docState	TokenNameIdentifier
.	TokenNameDOT
docID	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
writeProx	TokenNameIdentifier
(	TokenNameLPAREN
termID	TokenNameIdentifier
,	TokenNameCOMMA
fieldState	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fieldState	TokenNameIdentifier
.	TokenNameDOT
uniqueTermCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
fieldState	TokenNameIdentifier
.	TokenNameDOT
maxTermFrequency	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
fieldState	TokenNameIdentifier
.	TokenNameDOT
maxTermFrequency	TokenNameIdentifier
,	TokenNameCOMMA
++	TokenNamePLUS_PLUS
postings	TokenNameIdentifier
.	TokenNameDOT
docFreqs	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
writeProx	TokenNameIdentifier
(	TokenNameLPAREN
termID	TokenNameIdentifier
,	TokenNameCOMMA
fieldState	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
-	TokenNameMINUS
postings	TokenNameIdentifier
.	TokenNameDOT
lastPositions	TokenNameIdentifier
[	TokenNameLBRACKET
termID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
ParallelPostingsArray	TokenNameIdentifier
createPostingsArray	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FreqProxPostingsArray	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
FreqProxPostingsArray	TokenNameIdentifier
extends	TokenNameextends
ParallelPostingsArray	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
FreqProxPostingsArray	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docFreqs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
lastDocIDs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
lastDocCodes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
lastPositions	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
docFreqs	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
lastDocCodes	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
lastPositions	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
ParallelPostingsArray	TokenNameIdentifier
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FreqProxPostingsArray	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
void	TokenNamevoid
copyTo	TokenNameIdentifier
(	TokenNameLPAREN
ParallelPostingsArray	TokenNameIdentifier
toArray	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numToCopy	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
toArray	TokenNameIdentifier
instanceof	TokenNameinstanceof
FreqProxPostingsArray	TokenNameIdentifier
;	TokenNameSEMICOLON
FreqProxPostingsArray	TokenNameIdentifier
to	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FreqProxPostingsArray	TokenNameIdentifier
)	TokenNameRPAREN
toArray	TokenNameIdentifier
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
copyTo	TokenNameIdentifier
(	TokenNameLPAREN
toArray	TokenNameIdentifier
,	TokenNameCOMMA
numToCopy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
docFreqs	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
to	TokenNameIdentifier
.	TokenNameDOT
docFreqs	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
numToCopy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
lastDocIDs	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
to	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
numToCopy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
lastDocCodes	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
to	TokenNameIdentifier
.	TokenNameDOT
lastDocCodes	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
numToCopy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
lastPositions	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
to	TokenNameIdentifier
.	TokenNameDOT
lastPositions	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
numToCopy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
int	TokenNameint
bytesPerPosting	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ParallelPostingsArray	TokenNameIdentifier
.	TokenNameDOT
BYTES_PER_POSTING	TokenNameIdentifier
+	TokenNamePLUS
4	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_INT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
