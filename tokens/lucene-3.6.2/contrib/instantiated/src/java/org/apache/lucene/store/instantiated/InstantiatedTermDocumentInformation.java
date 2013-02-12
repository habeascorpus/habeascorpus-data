package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
instantiated	TokenNameIdentifier
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
TermVectorOffsetInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Comparator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
InstantiatedTermDocumentInformation	TokenNameIdentifier
implements	TokenNameimplements
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
1l	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Comparator	TokenNameIdentifier
<	TokenNameLESS
InstantiatedTermDocumentInformation	TokenNameIdentifier
>	TokenNameGREATER
termComparator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Comparator	TokenNameIdentifier
<	TokenNameLESS
InstantiatedTermDocumentInformation	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
InstantiatedTermDocumentInformation	TokenNameIdentifier
instantiatedTermDocumentInformation	TokenNameIdentifier
,	TokenNameCOMMA
InstantiatedTermDocumentInformation	TokenNameIdentifier
instantiatedTermDocumentInformation1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
instantiatedTermDocumentInformation	TokenNameIdentifier
.	TokenNameDOT
getTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
instantiatedTermDocumentInformation1	TokenNameIdentifier
.	TokenNameDOT
getTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Comparator	TokenNameIdentifier
<	TokenNameLESS
InstantiatedTermDocumentInformation	TokenNameIdentifier
>	TokenNameGREATER
documentNumberComparator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Comparator	TokenNameIdentifier
<	TokenNameLESS
InstantiatedTermDocumentInformation	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
InstantiatedTermDocumentInformation	TokenNameIdentifier
instantiatedTermDocumentInformation	TokenNameIdentifier
,	TokenNameCOMMA
InstantiatedTermDocumentInformation	TokenNameIdentifier
instantiatedTermDocumentInformation1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
instantiatedTermDocumentInformation	TokenNameIdentifier
.	TokenNameDOT
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDocumentNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
instantiatedTermDocumentInformation1	TokenNameIdentifier
.	TokenNameDOT
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDocumentNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
{	TokenNameLBRACE
"unchecked"	TokenNameStringLiteral
,	TokenNameCOMMA
"rawtypes"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Comparator	TokenNameIdentifier
doumentNumberIntegerComparator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Comparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
o2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
InstantiatedTermDocumentInformation	TokenNameIdentifier
di	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
InstantiatedTermDocumentInformation	TokenNameIdentifier
)	TokenNameRPAREN
o1	TokenNameIdentifier
;	TokenNameSEMICOLON
Integer	TokenNameIdentifier
i	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
o2	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
di	TokenNameIdentifier
.	TokenNameDOT
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getDocumentNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
payloads	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
termPositions	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
InstantiatedTerm	TokenNameIdentifier
term	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
InstantiatedDocument	TokenNameIdentifier
document	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
TermVectorOffsetInfo	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
termOffsets	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
InstantiatedTermDocumentInformation	TokenNameIdentifier
(	TokenNameLPAREN
InstantiatedTerm	TokenNameIdentifier
term	TokenNameIdentifier
,	TokenNameCOMMA
InstantiatedDocument	TokenNameIdentifier
document	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
termPositions	TokenNameIdentifier
,	TokenNameCOMMA
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
payloads	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
term	TokenNameIdentifier
=	TokenNameEQUAL
term	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
document	TokenNameIdentifier
=	TokenNameEQUAL
document	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
termPositions	TokenNameIdentifier
=	TokenNameEQUAL
termPositions	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
payloads	TokenNameIdentifier
=	TokenNameEQUAL
payloads	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getTermPositions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termPositions	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getPayloads	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
payloads	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InstantiatedDocument	TokenNameIdentifier
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
document	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InstantiatedTerm	TokenNameIdentifier
getTerm	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
term	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setTermPositions	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
termPositions	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
termPositions	TokenNameIdentifier
=	TokenNameEQUAL
termPositions	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setTerm	TokenNameIdentifier
(	TokenNameLPAREN
InstantiatedTerm	TokenNameIdentifier
term	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
term	TokenNameIdentifier
=	TokenNameEQUAL
term	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setDocument	TokenNameIdentifier
(	TokenNameLPAREN
InstantiatedDocument	TokenNameIdentifier
document	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
document	TokenNameIdentifier
=	TokenNameEQUAL
document	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TermVectorOffsetInfo	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getTermOffsets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
termOffsets	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setTermOffsets	TokenNameIdentifier
(	TokenNameLPAREN
TermVectorOffsetInfo	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
termOffsets	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
termOffsets	TokenNameIdentifier
=	TokenNameEQUAL
termOffsets	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE