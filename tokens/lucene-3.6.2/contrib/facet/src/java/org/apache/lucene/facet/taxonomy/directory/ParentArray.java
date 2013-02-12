package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
taxonomy	TokenNameIdentifier
.	TokenNameDOT
directory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
CorruptIndexException	TokenNameIdentifier
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
IndexReader	TokenNameIdentifier
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
Term	TokenNameIdentifier
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
TermPositions	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
taxonomy	TokenNameIdentifier
.	TokenNameDOT
TaxonomyReader	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
ParentArray	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
volatile	TokenNamevolatile
int	TokenNameint
prefetchParentOrdinal	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
prefetchParentOrdinal	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
refresh	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
indexReader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
first	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
num	TokenNameIdentifier
=	TokenNameEQUAL
indexReader	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prefetchParentOrdinal	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
prefetchParentOrdinal	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
num	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
num	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
prefetchParentOrdinal	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
TaxonomyReader	TokenNameIdentifier
.	TokenNameDOT
INVALID_ORDINAL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
first	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
first	TokenNameIdentifier
=	TokenNameEQUAL
prefetchParentOrdinal	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
first	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
num	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newarray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
num	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
prefetchParentOrdinal	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
newarray	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
prefetchParentOrdinal	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
prefetchParentOrdinal	TokenNameIdentifier
=	TokenNameEQUAL
newarray	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
TermPositions	TokenNameIdentifier
positions	TokenNameIdentifier
=	TokenNameEQUAL
indexReader	TokenNameIdentifier
.	TokenNameDOT
termPositions	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
Consts	TokenNameIdentifier
.	TokenNameDOT
FIELD_PAYLOADS	TokenNameIdentifier
,	TokenNameCOMMA
Consts	TokenNameIdentifier
.	TokenNameDOT
PAYLOAD_PARENT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
positions	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
first	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
first	TokenNameIdentifier
<	TokenNameLESS
num	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
CorruptIndexException	TokenNameIdentifier
(	TokenNameLPAREN
"Missing parent data for category "	TokenNameStringLiteral
+	TokenNamePLUS
first	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
first	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
num	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
positions	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
positions	TokenNameIdentifier
.	TokenNameDOT
freq	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
CorruptIndexException	TokenNameIdentifier
(	TokenNameLPAREN
"Missing parent data for category "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
prefetchParentOrdinal	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
positions	TokenNameIdentifier
.	TokenNameDOT
nextPosition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
positions	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
<	TokenNameLESS
num	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
CorruptIndexException	TokenNameIdentifier
(	TokenNameLPAREN
"Missing parent data for category "	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
CorruptIndexException	TokenNameIdentifier
(	TokenNameLPAREN
"Missing parent data for category "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
positions	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ordinal	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
parentOrdinal	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ordinal	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
prefetchParentOrdinal	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newarray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
ordinal	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
prefetchParentOrdinal	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
newarray	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
prefetchParentOrdinal	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
prefetchParentOrdinal	TokenNameIdentifier
=	TokenNameEQUAL
newarray	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
prefetchParentOrdinal	TokenNameIdentifier
[	TokenNameLBRACKET
ordinal	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
parentOrdinal	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
