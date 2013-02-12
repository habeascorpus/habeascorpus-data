package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
compound	TokenNameIdentifier
.	TokenNameDOT
hyphenation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Hyphen	TokenNameIdentifier
implements	TokenNameimplements
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
String	TokenNameIdentifier
preBreak	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
noBreak	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
postBreak	TokenNameIdentifier
;	TokenNameSEMICOLON
Hyphen	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
pre	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
no	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
post	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
preBreak	TokenNameIdentifier
=	TokenNameEQUAL
pre	TokenNameIdentifier
;	TokenNameSEMICOLON
noBreak	TokenNameIdentifier
=	TokenNameEQUAL
no	TokenNameIdentifier
;	TokenNameSEMICOLON
postBreak	TokenNameIdentifier
=	TokenNameEQUAL
post	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Hyphen	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
pre	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
preBreak	TokenNameIdentifier
=	TokenNameEQUAL
pre	TokenNameIdentifier
;	TokenNameSEMICOLON
noBreak	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
postBreak	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
noBreak	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
postBreak	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
preBreak	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
preBreak	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"-"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
StringBuilder	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
"{"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
preBreak	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"}{"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
postBreak	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"}{"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
noBreak	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'}'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
res	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
