package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
LCount	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
lCounts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
captures	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
bubbles	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
defaults	TokenNameIdentifier
,	TokenNameCOMMA
total	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
LCount	TokenNameIdentifier
lookup	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
evtName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LCount	TokenNameIdentifier
lc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
LCount	TokenNameIdentifier
)	TokenNameRPAREN
lCounts	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
evtName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
lCounts	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
evtName	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
lc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
lc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE