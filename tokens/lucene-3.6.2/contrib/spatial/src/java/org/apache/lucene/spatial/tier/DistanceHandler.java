package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
spatial	TokenNameIdentifier
.	TokenNameDOT
tier	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
spatial	TokenNameIdentifier
.	TokenNameDOT
DistanceUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
class	TokenNameclass
DistanceHandler	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
enum	TokenNameenum
Precision	TokenNameIdentifier
{	TokenNameLBRACE
EXACT	TokenNameIdentifier
,	TokenNameCOMMA
TWOFEET	TokenNameIdentifier
,	TokenNameCOMMA
TWENTYFEET	TokenNameIdentifier
,	TokenNameCOMMA
TWOHUNDREDFEET	TokenNameIdentifier
}	TokenNameRBRACE
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
>	TokenNameGREATER
distances	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
>	TokenNameGREATER
distanceLookupCache	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Precision	TokenNameIdentifier
precise	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DistanceHandler	TokenNameIdentifier
(	TokenNameLPAREN
Map	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
>	TokenNameGREATER
distances	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Double	TokenNameIdentifier
>	TokenNameGREATER
distanceLookupCache	TokenNameIdentifier
,	TokenNameCOMMA
Precision	TokenNameIdentifier
precise	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
distances	TokenNameIdentifier
=	TokenNameEQUAL
distances	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
distanceLookupCache	TokenNameIdentifier
=	TokenNameEQUAL
distanceLookupCache	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
precise	TokenNameIdentifier
=	TokenNameEQUAL
precise	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
double	TokenNamedouble
getPrecision	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
x	TokenNameIdentifier
,	TokenNameCOMMA
Precision	TokenNameIdentifier
thisPrecise	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
thisPrecise	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
dif	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
thisPrecise	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
EXACT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
x	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
TWOFEET	TokenNameIdentifier
:	TokenNameCOLON
dif	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
%	TokenNameREMAINDER
0.0001	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
TWENTYFEET	TokenNameIdentifier
:	TokenNameCOLON
dif	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
%	TokenNameREMAINDER
0.001	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
TWOHUNDREDFEET	TokenNameIdentifier
:	TokenNameCOLON
dif	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
%	TokenNameREMAINDER
0.01	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
x	TokenNameIdentifier
-	TokenNameMINUS
dif	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
x	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Precision	TokenNameIdentifier
getPrecision	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
precise	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
getDistance	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
docid	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
centerLat	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
centerLng	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
lat	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
lng	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
distances	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
DistanceUtils	TokenNameIdentifier
.	TokenNameDOT
getDistanceMi	TokenNameIdentifier
(	TokenNameLPAREN
centerLat	TokenNameIdentifier
,	TokenNameCOMMA
centerLng	TokenNameIdentifier
,	TokenNameCOMMA
lat	TokenNameIdentifier
,	TokenNameCOMMA
lng	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Double	TokenNameIdentifier
docd	TokenNameIdentifier
=	TokenNameEQUAL
distances	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
docid	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
docd	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
docd	TokenNameIdentifier
.	TokenNameDOT
doubleValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
precise	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
xLat	TokenNameIdentifier
=	TokenNameEQUAL
getPrecision	TokenNameIdentifier
(	TokenNameLPAREN
lat	TokenNameIdentifier
,	TokenNameCOMMA
precise	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
xLng	TokenNameIdentifier
=	TokenNameEQUAL
getPrecision	TokenNameIdentifier
(	TokenNameLPAREN
lng	TokenNameIdentifier
,	TokenNameCOMMA
precise	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
k	TokenNameIdentifier
=	TokenNameEQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
xLat	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
","	TokenNameStringLiteral
+	TokenNamePLUS
Double	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
xLng	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Double	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
distanceLookupCache	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
k	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
d	TokenNameIdentifier
.	TokenNameDOT
doubleValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
DistanceUtils	TokenNameIdentifier
.	TokenNameDOT
getDistanceMi	TokenNameIdentifier
(	TokenNameLPAREN
centerLat	TokenNameIdentifier
,	TokenNameCOMMA
centerLng	TokenNameIdentifier
,	TokenNameCOMMA
lat	TokenNameIdentifier
,	TokenNameCOMMA
lng	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
