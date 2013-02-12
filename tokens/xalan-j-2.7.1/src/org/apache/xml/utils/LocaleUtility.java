package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LocaleUtility	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
char	TokenNamechar
IETF_SEPARATOR	TokenNameIdentifier
=	TokenNameEQUAL
'-'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
String	TokenNameIdentifier
EMPTY_STRING	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
Locale	TokenNameIdentifier
langToLocale	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
lang	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
lang	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
lang	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
EMPTY_STRING	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Locale	TokenNameIdentifier
.	TokenNameDOT
getDefault	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
language	TokenNameIdentifier
=	TokenNameEQUAL
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
country	TokenNameIdentifier
=	TokenNameEQUAL
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
variant	TokenNameIdentifier
=	TokenNameEQUAL
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
i1	TokenNameIdentifier
=	TokenNameEQUAL
lang	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
IETF_SEPARATOR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
i1	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
language	TokenNameIdentifier
=	TokenNameEQUAL
lang	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
language	TokenNameIdentifier
=	TokenNameEQUAL
lang	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
i1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i1	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
i2	TokenNameIdentifier
=	TokenNameEQUAL
lang	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
IETF_SEPARATOR	TokenNameIdentifier
,	TokenNameCOMMA
i1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
i2	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
country	TokenNameIdentifier
=	TokenNameEQUAL
lang	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
i1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
country	TokenNameIdentifier
=	TokenNameEQUAL
lang	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
i1	TokenNameIdentifier
,	TokenNameCOMMA
i2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
variant	TokenNameIdentifier
=	TokenNameEQUAL
lang	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
i2	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
language	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
language	TokenNameIdentifier
=	TokenNameEQUAL
language	TokenNameIdentifier
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
language	TokenNameIdentifier
=	TokenNameEQUAL
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
country	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
country	TokenNameIdentifier
=	TokenNameEQUAL
country	TokenNameIdentifier
.	TokenNameDOT
toUpperCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
country	TokenNameIdentifier
=	TokenNameEQUAL
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
variant	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
(	TokenNameLPAREN
language	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
country	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
variant	TokenNameIdentifier
=	TokenNameEQUAL
variant	TokenNameIdentifier
.	TokenNameDOT
toUpperCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
variant	TokenNameIdentifier
=	TokenNameEQUAL
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
Locale	TokenNameIdentifier
(	TokenNameLPAREN
language	TokenNameIdentifier
,	TokenNameCOMMA
country	TokenNameIdentifier
,	TokenNameCOMMA
variant	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE