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
final	TokenNamefinal
class	TokenNameclass
TermsHashPerThread	TokenNameIdentifier
extends	TokenNameextends
InvertedDocConsumerPerThread	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
TermsHash	TokenNameIdentifier
termsHash	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
TermsHashConsumerPerThread	TokenNameIdentifier
consumer	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
TermsHashPerThread	TokenNameIdentifier
nextPerThread	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
CharBlockPool	TokenNameIdentifier
charPool	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
IntBlockPool	TokenNameIdentifier
intPool	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
ByteBlockPool	TokenNameIdentifier
bytePool	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
boolean	TokenNameboolean
primary	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
DocState	TokenNameIdentifier
docState	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
TermsHashPerThread	TokenNameIdentifier
(	TokenNameLPAREN
DocInverterPerThread	TokenNameIdentifier
docInverterPerThread	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
TermsHash	TokenNameIdentifier
termsHash	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
TermsHash	TokenNameIdentifier
nextTermsHash	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
TermsHashPerThread	TokenNameIdentifier
primaryPerThread	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
docState	TokenNameIdentifier
=	TokenNameEQUAL
docInverterPerThread	TokenNameIdentifier
.	TokenNameDOT
docState	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
termsHash	TokenNameIdentifier
=	TokenNameEQUAL
termsHash	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
consumer	TokenNameIdentifier
=	TokenNameEQUAL
termsHash	TokenNameIdentifier
.	TokenNameDOT
consumer	TokenNameIdentifier
.	TokenNameDOT
addThread	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextTermsHash	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
charPool	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CharBlockPool	TokenNameIdentifier
(	TokenNameLPAREN
termsHash	TokenNameIdentifier
.	TokenNameDOT
docWriter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
primary	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
charPool	TokenNameIdentifier
=	TokenNameEQUAL
primaryPerThread	TokenNameIdentifier
.	TokenNameDOT
charPool	TokenNameIdentifier
;	TokenNameSEMICOLON
primary	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
intPool	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IntBlockPool	TokenNameIdentifier
(	TokenNameLPAREN
termsHash	TokenNameIdentifier
.	TokenNameDOT
docWriter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bytePool	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteBlockPool	TokenNameIdentifier
(	TokenNameLPAREN
termsHash	TokenNameIdentifier
.	TokenNameDOT
docWriter	TokenNameIdentifier
.	TokenNameDOT
byteBlockAllocator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextTermsHash	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
nextPerThread	TokenNameIdentifier
=	TokenNameEQUAL
nextTermsHash	TokenNameIdentifier
.	TokenNameDOT
addThread	TokenNameIdentifier
(	TokenNameLPAREN
docInverterPerThread	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
nextPerThread	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
InvertedDocConsumerPerField	TokenNameIdentifier
addField	TokenNameIdentifier
(	TokenNameLPAREN
DocInverterPerField	TokenNameIdentifier
docInverterPerField	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
FieldInfo	TokenNameIdentifier
fieldInfo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
TermsHashPerField	TokenNameIdentifier
(	TokenNameLPAREN
docInverterPerField	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
,	TokenNameCOMMA
nextPerThread	TokenNameIdentifier
,	TokenNameCOMMA
fieldInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
synchronized	TokenNamesynchronized
public	TokenNamepublic
void	TokenNamevoid
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
reset	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
consumer	TokenNameIdentifier
.	TokenNameDOT
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
nextPerThread	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
nextPerThread	TokenNameIdentifier
.	TokenNameDOT
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
consumer	TokenNameIdentifier
.	TokenNameDOT
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextPerThread	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
nextPerThread	TokenNameIdentifier
.	TokenNameDOT
consumer	TokenNameIdentifier
.	TokenNameDOT
startDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
DocWriter	TokenNameIdentifier
finishDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
DocWriter	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
consumer	TokenNameIdentifier
.	TokenNameDOT
finishDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
DocWriter	TokenNameIdentifier
doc2	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextPerThread	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
doc2	TokenNameIdentifier
=	TokenNameEQUAL
nextPerThread	TokenNameIdentifier
.	TokenNameDOT
consumer	TokenNameIdentifier
.	TokenNameDOT
finishDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
doc2	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
doc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
doc2	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
doc	TokenNameIdentifier
.	TokenNameDOT
setNext	TokenNameIdentifier
(	TokenNameLPAREN
doc2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
recyclePostings	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
intPool	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bytePool	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
primary	TokenNameIdentifier
)	TokenNameRPAREN
charPool	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
