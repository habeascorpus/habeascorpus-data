package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
.	TokenNameDOT
LoggingEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
PatternConverter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
PatternConverter	TokenNameIdentifier
next	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
min	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
max	TokenNameIdentifier
=	TokenNameEQUAL
0x7FFFFFFF	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
boolean	TokenNameboolean
leftAlign	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
protected	TokenNameprotected
PatternConverter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
PatternConverter	TokenNameIdentifier
(	TokenNameLPAREN
FormattingInfo	TokenNameIdentifier
fi	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
min	TokenNameIdentifier
=	TokenNameEQUAL
fi	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
;	TokenNameSEMICOLON
max	TokenNameIdentifier
=	TokenNameEQUAL
fi	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
;	TokenNameSEMICOLON
leftAlign	TokenNameIdentifier
=	TokenNameEQUAL
fi	TokenNameIdentifier
.	TokenNameDOT
leftAlign	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
abstract	TokenNameabstract
protected	TokenNameprotected
String	TokenNameIdentifier
convert	TokenNameIdentifier
(	TokenNameLPAREN
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
format	TokenNameIdentifier
(	TokenNameLPAREN
StringBuffer	TokenNameIdentifier
sbuf	TokenNameIdentifier
,	TokenNameCOMMA
LoggingEvent	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
convert	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
<	TokenNameLESS
min	TokenNameIdentifier
)	TokenNameRPAREN
spacePad	TokenNameIdentifier
(	TokenNameLPAREN
sbuf	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
max	TokenNameIdentifier
)	TokenNameRPAREN
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
len	TokenNameIdentifier
-	TokenNameMINUS
max	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
<	TokenNameLESS
min	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
leftAlign	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
spacePad	TokenNameIdentifier
(	TokenNameLPAREN
sbuf	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
-	TokenNameMINUS
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
spacePad	TokenNameIdentifier
(	TokenNameLPAREN
sbuf	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
-	TokenNameMINUS
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
SPACES	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
" "	TokenNameStringLiteral
,	TokenNameCOMMA
"  "	TokenNameStringLiteral
,	TokenNameCOMMA
"    "	TokenNameStringLiteral
,	TokenNameCOMMA
"        "	TokenNameStringLiteral
,	TokenNameCOMMA
"                "	TokenNameStringLiteral
,	TokenNameCOMMA
"                                "	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
spacePad	TokenNameIdentifier
(	TokenNameLPAREN
StringBuffer	TokenNameIdentifier
sbuf	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
length	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACES	TokenNameIdentifier
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
length	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
32	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
length	TokenNameIdentifier
&	TokenNameAND
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
sbuf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
SPACES	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE