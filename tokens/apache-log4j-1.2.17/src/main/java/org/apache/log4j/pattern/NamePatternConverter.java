package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
NamePatternConverter	TokenNameIdentifier
extends	TokenNameextends
LoggingEventPatternConverter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
NameAbbreviator	TokenNameIdentifier
abbreviator	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
NamePatternConverter	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
style	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
options	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
style	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
options	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
options	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
abbreviator	TokenNameIdentifier
=	TokenNameEQUAL
NameAbbreviator	TokenNameIdentifier
.	TokenNameDOT
getAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
abbreviator	TokenNameIdentifier
=	TokenNameEQUAL
NameAbbreviator	TokenNameIdentifier
.	TokenNameDOT
getDefaultAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
final	TokenNamefinal
void	TokenNamevoid
abbreviate	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
nameStart	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
abbreviator	TokenNameIdentifier
.	TokenNameDOT
abbreviate	TokenNameIdentifier
(	TokenNameLPAREN
nameStart	TokenNameIdentifier
,	TokenNameCOMMA
buf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE