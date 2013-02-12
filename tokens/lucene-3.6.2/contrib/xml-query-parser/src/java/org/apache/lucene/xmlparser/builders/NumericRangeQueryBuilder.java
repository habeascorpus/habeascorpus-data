package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
xmlparser	TokenNameIdentifier
.	TokenNameDOT
builders	TokenNameIdentifier
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
NumericRangeQuery	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
NumericUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
xmlparser	TokenNameIdentifier
.	TokenNameDOT
DOMUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
xmlparser	TokenNameIdentifier
.	TokenNameDOT
ParserException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
xmlparser	TokenNameIdentifier
.	TokenNameDOT
QueryBuilder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Element	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
NumericRangeQueryBuilder	TokenNameIdentifier
implements	TokenNameimplements
QueryBuilder	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Query	TokenNameIdentifier
getQuery	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParserException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
field	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getAttributeWithInheritanceOrFail	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"fieldName"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
lowerTerm	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getAttributeOrFail	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"lowerTerm"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
upperTerm	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getAttributeOrFail	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"upperTerm"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
lowerInclusive	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"includeLower"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
upperInclusive	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"includeUpper"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
precisionStep	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"precisionStep"	TokenNameStringLiteral
,	TokenNameCOMMA
NumericUtils	TokenNameIdentifier
.	TokenNameDOT
PRECISION_STEP_DEFAULT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
type	TokenNameIdentifier
=	TokenNameEQUAL
DOMUtils	TokenNameIdentifier
.	TokenNameDOT
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
"type"	TokenNameStringLiteral
,	TokenNameCOMMA
"int"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Query	TokenNameIdentifier
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
"int"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
filter	TokenNameIdentifier
=	TokenNameEQUAL
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newIntRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
lowerTerm	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
upperTerm	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
lowerInclusive	TokenNameIdentifier
,	TokenNameCOMMA
upperInclusive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
"long"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
filter	TokenNameIdentifier
=	TokenNameEQUAL
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newLongRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
Long	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
lowerTerm	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
Long	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
upperTerm	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
lowerInclusive	TokenNameIdentifier
,	TokenNameCOMMA
upperInclusive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
"double"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
filter	TokenNameIdentifier
=	TokenNameEQUAL
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newDoubleRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
lowerTerm	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
Double	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
upperTerm	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
lowerInclusive	TokenNameIdentifier
,	TokenNameCOMMA
upperInclusive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
"float"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
filter	TokenNameIdentifier
=	TokenNameEQUAL
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newFloatRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
lowerTerm	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
upperTerm	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
lowerInclusive	TokenNameIdentifier
,	TokenNameCOMMA
upperInclusive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ParserException	TokenNameIdentifier
(	TokenNameLPAREN
"type attribute must be one of: [long, int, double, float]"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NumberFormatException	TokenNameIdentifier
nfe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ParserException	TokenNameIdentifier
(	TokenNameLPAREN
"Could not parse lowerTerm or upperTerm into a number"	TokenNameStringLiteral
,	TokenNameCOMMA
nfe	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE