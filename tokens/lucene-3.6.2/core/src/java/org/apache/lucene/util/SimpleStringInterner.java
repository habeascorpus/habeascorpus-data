package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SimpleStringInterner	TokenNameIdentifier
extends	TokenNameextends
StringInterner	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
Entry	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
private	TokenNameprivate
String	TokenNameIdentifier
str	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
private	TokenNameprivate
int	TokenNameint
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Entry	TokenNameIdentifier
next	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Entry	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
hash	TokenNameIdentifier
,	TokenNameCOMMA
Entry	TokenNameIdentifier
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
str	TokenNameIdentifier
=	TokenNameEQUAL
str	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
hash	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
cache	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
maxChainLength	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SimpleStringInterner	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
tableSize	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxChainLength	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cache	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
BitUtil	TokenNameIdentifier
.	TokenNameDOT
nextHighestPowerOfTwo	TokenNameIdentifier
(	TokenNameLPAREN
tableSize	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
maxChainLength	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
maxChainLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
intern	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
h	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
slot	TokenNameIdentifier
=	TokenNameEQUAL
h	TokenNameIdentifier
&	TokenNameAND
(	TokenNameLPAREN
cache	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
first	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
cache	TokenNameIdentifier
[	TokenNameLBRACKET
slot	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
nextToLast	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
chainLength	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
first	TokenNameIdentifier
;	TokenNameSEMICOLON
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
h	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
str	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
s	TokenNameIdentifier
||	TokenNameOR_OR
e	TokenNameIdentifier
.	TokenNameDOT
str	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
.	TokenNameDOT
str	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
chainLength	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
nextToLast	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
intern	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
cache	TokenNameIdentifier
[	TokenNameLBRACKET
slot	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
h	TokenNameIdentifier
,	TokenNameCOMMA
first	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
chainLength	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
maxChainLength	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nextToLast	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
s	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
