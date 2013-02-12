package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
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
FieldInvertState	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
class	TokenNameclass
SimilarityDelegator	TokenNameIdentifier
extends	TokenNameextends
Similarity	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Similarity	TokenNameIdentifier
delegee	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SimilarityDelegator	TokenNameIdentifier
(	TokenNameLPAREN
Similarity	TokenNameIdentifier
delegee	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
delegee	TokenNameIdentifier
=	TokenNameEQUAL
delegee	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
FieldInvertState	TokenNameIdentifier
state	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
delegee	TokenNameIdentifier
.	TokenNameDOT
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
queryNorm	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
sumOfSquaredWeights	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
delegee	TokenNameIdentifier
.	TokenNameDOT
queryNorm	TokenNameIdentifier
(	TokenNameLPAREN
sumOfSquaredWeights	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
tf	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
freq	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
delegee	TokenNameIdentifier
.	TokenNameDOT
tf	TokenNameIdentifier
(	TokenNameLPAREN
freq	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
sloppyFreq	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
distance	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
delegee	TokenNameIdentifier
.	TokenNameDOT
sloppyFreq	TokenNameIdentifier
(	TokenNameLPAREN
distance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
idf	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
docFreq	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numDocs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
delegee	TokenNameIdentifier
.	TokenNameDOT
idf	TokenNameIdentifier
(	TokenNameLPAREN
docFreq	TokenNameIdentifier
,	TokenNameCOMMA
numDocs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
coord	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
overlap	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxOverlap	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
delegee	TokenNameIdentifier
.	TokenNameDOT
coord	TokenNameIdentifier
(	TokenNameLPAREN
overlap	TokenNameIdentifier
,	TokenNameCOMMA
maxOverlap	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
scorePayload	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
docId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
end	TokenNameIdentifier
,	TokenNameCOMMA
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
payload	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
delegee	TokenNameIdentifier
.	TokenNameDOT
scorePayload	TokenNameIdentifier
(	TokenNameLPAREN
docId	TokenNameIdentifier
,	TokenNameCOMMA
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
,	TokenNameCOMMA
payload	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
