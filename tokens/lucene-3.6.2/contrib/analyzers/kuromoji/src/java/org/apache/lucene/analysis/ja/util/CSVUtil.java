package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
ja	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
regex	TokenNameIdentifier
.	TokenNameDOT
Matcher	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
regex	TokenNameIdentifier
.	TokenNameDOT
Pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
CSVUtil	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
QUOTE	TokenNameIdentifier
=	TokenNameEQUAL
'"'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
COMMA	TokenNameIdentifier
=	TokenNameEQUAL
','	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Pattern	TokenNameIdentifier
QUOTE_REPLACE_PATTERN	TokenNameIdentifier
=	TokenNameEQUAL
Pattern	TokenNameIdentifier
.	TokenNameDOT
compile	TokenNameIdentifier
(	TokenNameLPAREN
"^"([^"]+)"$"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ESCAPED_QUOTE	TokenNameIdentifier
=	TokenNameEQUAL
""""	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
CSVUtil	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
parse	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
line	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
insideQuote	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
quoteCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
line	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
char	TokenNamechar
c	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
QUOTE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
insideQuote	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
insideQuote	TokenNameIdentifier
;	TokenNameSEMICOLON
quoteCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
COMMA	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
insideQuote	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
value	TokenNameIdentifier
=	TokenNameEQUAL
unQuoteUnEscape	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
result	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
quoteCount	TokenNameIdentifier
%	TokenNameREMAINDER
2	TokenNameIntegerLiteral
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
result	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
unQuoteUnEscape	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
original	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
original	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
'\"'	TokenNameCharacterLiteral
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
Matcher	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
QUOTE_REPLACE_PATTERN	TokenNameIdentifier
.	TokenNameDOT
matcher	TokenNameIdentifier
(	TokenNameLPAREN
original	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
matches	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
.	TokenNameDOT
group	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
ESCAPED_QUOTE	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
ESCAPED_QUOTE	TokenNameIdentifier
,	TokenNameCOMMA
"""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
quoteEscape	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
original	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
original	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
'\"'	TokenNameCharacterLiteral
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
"""	TokenNameStringLiteral
,	TokenNameCOMMA
ESCAPED_QUOTE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
COMMA	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
"""	TokenNameStringLiteral
+	TokenNamePLUS
result	TokenNameIdentifier
+	TokenNamePLUS
"""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE