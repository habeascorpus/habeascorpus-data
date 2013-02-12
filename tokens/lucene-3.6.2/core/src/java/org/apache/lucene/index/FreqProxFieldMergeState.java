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
index	TokenNameIdentifier
.	TokenNameDOT
FreqProxTermsWriterPerField	TokenNameIdentifier
.	TokenNameDOT
FreqProxPostingsArray	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
FreqProxFieldMergeState	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
FreqProxTermsWriterPerField	TokenNameIdentifier
field	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
numPostings	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
CharBlockPool	TokenNameIdentifier
charPool	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
termIDs	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
FreqProxPostingsArray	TokenNameIdentifier
postings	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
currentTermID	TokenNameIdentifier
;	TokenNameSEMICOLON
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
text	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
textOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
postingUpto	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
ByteSliceReader	TokenNameIdentifier
freq	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteSliceReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
ByteSliceReader	TokenNameIdentifier
prox	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteSliceReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
docID	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
termFreq	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FreqProxFieldMergeState	TokenNameIdentifier
(	TokenNameLPAREN
FreqProxTermsWriterPerField	TokenNameIdentifier
field	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
field	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
charPool	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
perThread	TokenNameIdentifier
.	TokenNameDOT
termsHashPerThread	TokenNameIdentifier
.	TokenNameDOT
charPool	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
numPostings	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
numPostings	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
termIDs	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
sortPostings	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
postings	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FreqProxPostingsArray	TokenNameIdentifier
)	TokenNameRPAREN
field	TokenNameIdentifier
.	TokenNameDOT
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
postingsArray	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
boolean	TokenNameboolean
nextTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
postingUpto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
postingUpto	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
numPostings	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
currentTermID	TokenNameIdentifier
=	TokenNameEQUAL
termIDs	TokenNameIdentifier
[	TokenNameLBRACKET
postingUpto	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
docID	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
textStart	TokenNameIdentifier
=	TokenNameEQUAL
postings	TokenNameIdentifier
.	TokenNameDOT
textStarts	TokenNameIdentifier
[	TokenNameLBRACKET
currentTermID	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
text	TokenNameIdentifier
=	TokenNameEQUAL
charPool	TokenNameIdentifier
.	TokenNameDOT
buffers	TokenNameIdentifier
[	TokenNameLBRACKET
textStart	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
CHAR_BLOCK_SHIFT	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
textOffset	TokenNameIdentifier
=	TokenNameEQUAL
textStart	TokenNameIdentifier
&	TokenNameAND
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
CHAR_BLOCK_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
field	TokenNameIdentifier
.	TokenNameDOT
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
initReader	TokenNameIdentifier
(	TokenNameLPAREN
freq	TokenNameIdentifier
,	TokenNameCOMMA
currentTermID	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier
)	TokenNameRPAREN
field	TokenNameIdentifier
.	TokenNameDOT
termsHashPerField	TokenNameIdentifier
.	TokenNameDOT
initReader	TokenNameIdentifier
(	TokenNameLPAREN
prox	TokenNameIdentifier
,	TokenNameCOMMA
currentTermID	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
result	TokenNameIdentifier
=	TokenNameEQUAL
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
result	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
termText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
upto	TokenNameIdentifier
=	TokenNameEQUAL
textOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
text	TokenNameIdentifier
[	TokenNameLBRACKET
upto	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
0xffff	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
upto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
,	TokenNameCOMMA
textOffset	TokenNameIdentifier
,	TokenNameCOMMA
upto	TokenNameIdentifier
-	TokenNameMINUS
textOffset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
nextDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
freq	TokenNameIdentifier
.	TokenNameDOT
eof	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocCodes	TokenNameIdentifier
[	TokenNameLBRACKET
currentTermID	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
docID	TokenNameIdentifier
=	TokenNameEQUAL
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
currentTermID	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
termFreq	TokenNameIdentifier
=	TokenNameEQUAL
postings	TokenNameIdentifier
.	TokenNameDOT
docFreqs	TokenNameIdentifier
[	TokenNameLBRACKET
currentTermID	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocCodes	TokenNameIdentifier
[	TokenNameLBRACKET
currentTermID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
code	TokenNameIdentifier
=	TokenNameEQUAL
freq	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
indexOptions	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
IndexOptions	TokenNameIdentifier
.	TokenNameDOT
DOCS_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
docID	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
code	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
docID	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
code	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
code	TokenNameIdentifier
&	TokenNameAND
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
termFreq	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
termFreq	TokenNameIdentifier
=	TokenNameEQUAL
freq	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
docID	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
postings	TokenNameIdentifier
.	TokenNameDOT
lastDocIDs	TokenNameIdentifier
[	TokenNameLBRACKET
currentTermID	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
