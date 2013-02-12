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
document	TokenNameIdentifier
.	TokenNameDOT
NumericField	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
MessageImpl	TokenNameIdentifier
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
core	TokenNameIdentifier
.	TokenNameDOT
QueryNodeException	TokenNameIdentifier
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
core	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
QueryParserMessages	TokenNameIdentifier
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
core	TokenNameIdentifier
.	TokenNameDOT
nodes	TokenNameIdentifier
.	TokenNameDOT
QueryNode	TokenNameIdentifier
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
core	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
StringUtils	TokenNameIdentifier
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
standard	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
NumericConfig	TokenNameIdentifier
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
standard	TokenNameIdentifier
.	TokenNameDOT
nodes	TokenNameIdentifier
.	TokenNameDOT
NumericQueryNode	TokenNameIdentifier
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
standard	TokenNameIdentifier
.	TokenNameDOT
nodes	TokenNameIdentifier
.	TokenNameDOT
NumericRangeQueryNode	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
NumericRangeQueryNodeBuilder	TokenNameIdentifier
implements	TokenNameimplements
StandardQueryBuilder	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
NumericRangeQueryNodeBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
NumericRangeQuery	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
Number	TokenNameIdentifier
>	TokenNameGREATER
build	TokenNameIdentifier
(	TokenNameLPAREN
QueryNode	TokenNameIdentifier
queryNode	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
QueryNodeException	TokenNameIdentifier
{	TokenNameLBRACE
NumericRangeQueryNode	TokenNameIdentifier
numericRangeNode	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
NumericRangeQueryNode	TokenNameIdentifier
)	TokenNameRPAREN
queryNode	TokenNameIdentifier
;	TokenNameSEMICOLON
NumericQueryNode	TokenNameIdentifier
lowerNumericNode	TokenNameIdentifier
=	TokenNameEQUAL
numericRangeNode	TokenNameIdentifier
.	TokenNameDOT
getLowerBound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
NumericQueryNode	TokenNameIdentifier
upperNumericNode	TokenNameIdentifier
=	TokenNameEQUAL
numericRangeNode	TokenNameIdentifier
.	TokenNameDOT
getUpperBound	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Number	TokenNameIdentifier
lowerNumber	TokenNameIdentifier
,	TokenNameCOMMA
upperNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lowerNumericNode	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
lowerNumber	TokenNameIdentifier
=	TokenNameEQUAL
lowerNumericNode	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
lowerNumber	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
upperNumericNode	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
upperNumber	TokenNameIdentifier
=	TokenNameEQUAL
upperNumericNode	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
upperNumber	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
NumericConfig	TokenNameIdentifier
numericConfig	TokenNameIdentifier
=	TokenNameEQUAL
numericRangeNode	TokenNameIdentifier
.	TokenNameDOT
getNumericConfig	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
NumericField	TokenNameIdentifier
.	TokenNameDOT
DataType	TokenNameIdentifier
numberType	TokenNameIdentifier
=	TokenNameEQUAL
numericConfig	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
field	TokenNameIdentifier
=	TokenNameEQUAL
StringUtils	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
numericRangeNode	TokenNameIdentifier
.	TokenNameDOT
getField	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
minInclusive	TokenNameIdentifier
=	TokenNameEQUAL
numericRangeNode	TokenNameIdentifier
.	TokenNameDOT
isLowerInclusive	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
maxInclusive	TokenNameIdentifier
=	TokenNameEQUAL
numericRangeNode	TokenNameIdentifier
.	TokenNameDOT
isUpperInclusive	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
precisionStep	TokenNameIdentifier
=	TokenNameEQUAL
numericConfig	TokenNameIdentifier
.	TokenNameDOT
getPrecisionStep	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
numberType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
LONG	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newLongRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
lowerNumber	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Long	TokenNameIdentifier
)	TokenNameRPAREN
upperNumber	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newIntRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
lowerNumber	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
upperNumber	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
FLOAT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newFloatRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Float	TokenNameIdentifier
)	TokenNameRPAREN
lowerNumber	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Float	TokenNameIdentifier
)	TokenNameRPAREN
upperNumber	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
DOUBLE	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newDoubleRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Double	TokenNameIdentifier
)	TokenNameRPAREN
lowerNumber	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Double	TokenNameIdentifier
)	TokenNameRPAREN
upperNumber	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
QueryNodeException	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MessageImpl	TokenNameIdentifier
(	TokenNameLPAREN
QueryParserMessages	TokenNameIdentifier
.	TokenNameDOT
UNSUPPORTED_NUMERIC_DATA_TYPE	TokenNameIdentifier
,	TokenNameCOMMA
numberType	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE