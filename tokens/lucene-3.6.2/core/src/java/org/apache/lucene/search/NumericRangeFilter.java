package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
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
NumericTokenStream	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
NumericUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
extends	TokenNameextends
Number	TokenNameIdentifier
>	TokenNameGREATER
extends	TokenNameextends
MultiTermQueryWrapperFilter	TokenNameIdentifier
<	TokenNameLESS
NumericRangeQuery	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
{	TokenNameLBRACE
private	TokenNameprivate
NumericRangeFilter	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
NumericRangeQuery	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
query	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
query	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
newLongRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
Long	TokenNameIdentifier
min	TokenNameIdentifier
,	TokenNameCOMMA
Long	TokenNameIdentifier
max	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newLongRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
,	TokenNameCOMMA
max	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
newLongRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
Long	TokenNameIdentifier
min	TokenNameIdentifier
,	TokenNameCOMMA
Long	TokenNameIdentifier
max	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Long	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newLongRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
,	TokenNameCOMMA
max	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
newIntRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
min	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
max	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newIntRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
,	TokenNameCOMMA
max	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
newIntRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
min	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
max	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newIntRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
,	TokenNameCOMMA
max	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Double	TokenNameIdentifier
>	TokenNameGREATER
newDoubleRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
min	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
max	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Double	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newDoubleRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
,	TokenNameCOMMA
max	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Double	TokenNameIdentifier
>	TokenNameGREATER
newDoubleRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
min	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
max	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Double	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newDoubleRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
,	TokenNameCOMMA
max	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Float	TokenNameIdentifier
>	TokenNameGREATER
newFloatRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
min	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
max	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Float	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newFloatRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
,	TokenNameCOMMA
max	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Float	TokenNameIdentifier
>	TokenNameGREATER
newFloatRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
min	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
max	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
NumericRangeFilter	TokenNameIdentifier
<	TokenNameLESS
Float	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
NumericRangeQuery	TokenNameIdentifier
.	TokenNameDOT
newFloatRange	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
min	TokenNameIdentifier
,	TokenNameCOMMA
max	TokenNameIdentifier
,	TokenNameCOMMA
minInclusive	TokenNameIdentifier
,	TokenNameCOMMA
maxInclusive	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getField	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
query	TokenNameIdentifier
.	TokenNameDOT
getField	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
includesMin	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
query	TokenNameIdentifier
.	TokenNameDOT
includesMin	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
includesMax	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
query	TokenNameIdentifier
.	TokenNameDOT
includesMax	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
T	TokenNameIdentifier
getMin	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
query	TokenNameIdentifier
.	TokenNameDOT
getMin	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
T	TokenNameIdentifier
getMax	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
query	TokenNameIdentifier
.	TokenNameDOT
getMax	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getPrecisionStep	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
query	TokenNameIdentifier
.	TokenNameDOT
getPrecisionStep	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
