package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
standard	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
Analyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
ParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
BooleanClause	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
BooleanQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
Query	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
class	TokenNameclass
MultiFieldQueryParserWrapper	TokenNameIdentifier
extends	TokenNameextends
QueryParserWrapper	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
MultiFieldQueryParserWrapper	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
>	TokenNameGREATER
boosts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
fields	TokenNameIdentifier
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StandardQueryParser	TokenNameIdentifier
qpHelper	TokenNameIdentifier
=	TokenNameEQUAL
getQueryParserHelper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
qpHelper	TokenNameIdentifier
.	TokenNameDOT
setMultiFields	TokenNameIdentifier
(	TokenNameLPAREN
fields	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
qpHelper	TokenNameIdentifier
.	TokenNameDOT
setFieldsBoost	TokenNameIdentifier
(	TokenNameLPAREN
boosts	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MultiFieldQueryParserWrapper	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StandardQueryParser	TokenNameIdentifier
qpHelper	TokenNameIdentifier
=	TokenNameEQUAL
getQueryParserHelper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
qpHelper	TokenNameIdentifier
.	TokenNameDOT
setAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
qpHelper	TokenNameIdentifier
.	TokenNameDOT
setMultiFields	TokenNameIdentifier
(	TokenNameLPAREN
fields	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Query	TokenNameIdentifier
parse	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
queries	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
queries	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
fields	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"queries.length != fields.length"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BooleanQuery	TokenNameIdentifier
bQuery	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BooleanQuery	TokenNameIdentifier
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
fields	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
QueryParserWrapper	TokenNameIdentifier
qp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QueryParserWrapper	TokenNameIdentifier
(	TokenNameLPAREN
fields	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
qp	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
queries	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
q	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
q	TokenNameIdentifier
instanceof	TokenNameinstanceof
BooleanQuery	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
(	TokenNameLPAREN
BooleanQuery	TokenNameIdentifier
)	TokenNameRPAREN
q	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getClauses	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
bQuery	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
BooleanClause	TokenNameIdentifier
.	TokenNameDOT
Occur	TokenNameIdentifier
.	TokenNameDOT
SHOULD	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
bQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Query	TokenNameIdentifier
parse	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
query	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
,	TokenNameCOMMA
BooleanClause	TokenNameIdentifier
.	TokenNameDOT
Occur	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
flags	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fields	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
flags	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"fields.length != flags.length"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BooleanQuery	TokenNameIdentifier
bQuery	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BooleanQuery	TokenNameIdentifier
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
fields	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
QueryParserWrapper	TokenNameIdentifier
qp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QueryParserWrapper	TokenNameIdentifier
(	TokenNameLPAREN
fields	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
qp	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
q	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
q	TokenNameIdentifier
instanceof	TokenNameinstanceof
BooleanQuery	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
(	TokenNameLPAREN
BooleanQuery	TokenNameIdentifier
)	TokenNameRPAREN
q	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getClauses	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
bQuery	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
flags	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
bQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Query	TokenNameIdentifier
parse	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
queries	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
,	TokenNameCOMMA
BooleanClause	TokenNameIdentifier
.	TokenNameDOT
Occur	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
flags	TokenNameIdentifier
,	TokenNameCOMMA
Analyzer	TokenNameIdentifier
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
queries	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
fields	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
&&	TokenNameAND_AND
queries	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
flags	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"queries, fields, and flags array have have different length"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BooleanQuery	TokenNameIdentifier
bQuery	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BooleanQuery	TokenNameIdentifier
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
fields	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
QueryParserWrapper	TokenNameIdentifier
qp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QueryParserWrapper	TokenNameIdentifier
(	TokenNameLPAREN
fields	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
analyzer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Query	TokenNameIdentifier
q	TokenNameIdentifier
=	TokenNameEQUAL
qp	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
queries	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
q	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
q	TokenNameIdentifier
instanceof	TokenNameinstanceof
BooleanQuery	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
(	TokenNameLPAREN
BooleanQuery	TokenNameIdentifier
)	TokenNameRPAREN
q	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getClauses	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
bQuery	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
q	TokenNameIdentifier
,	TokenNameCOMMA
flags	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
bQuery	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE