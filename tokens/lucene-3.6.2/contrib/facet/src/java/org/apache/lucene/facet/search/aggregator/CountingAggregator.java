package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
aggregator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CountingAggregator	TokenNameIdentifier
implements	TokenNameimplements
Aggregator	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
counterArray	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
aggregate	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ordinal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
++	TokenNamePLUS_PLUS
counterArray	TokenNameIdentifier
[	TokenNameLBRACKET
ordinal	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setNextDoc	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
docid	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
score	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
CountingAggregator	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
counterArray	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
counterArray	TokenNameIdentifier
=	TokenNameEQUAL
counterArray	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
obj	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
obj	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
this	TokenNamethis
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
CountingAggregator	TokenNameIdentifier
that	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CountingAggregator	TokenNameIdentifier
)	TokenNameRPAREN
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
that	TokenNameIdentifier
.	TokenNameDOT
counterArray	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
this	TokenNamethis
.	TokenNameDOT
counterArray	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
hashCode	TokenNameIdentifier
=	TokenNameEQUAL
counterArray	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
counterArray	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
hashCode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
