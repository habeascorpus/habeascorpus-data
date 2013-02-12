package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
spatial	TokenNameIdentifier
.	TokenNameDOT
geometry	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
class	TokenNameclass
FloatLatLng	TokenNameIdentifier
extends	TokenNameextends
LatLng	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
double	TokenNamedouble
lat	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
lng	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
normalized	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FloatLatLng	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
lat	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
lng	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
lat	TokenNameIdentifier
>	TokenNameGREATER
90.0	TokenNameDoubleLiteral
||	TokenNameOR_OR
lat	TokenNameIdentifier
<	TokenNameLESS
-	TokenNameMINUS
90.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Illegal latitude value "	TokenNameStringLiteral
+	TokenNamePLUS
lat	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
lat	TokenNameIdentifier
=	TokenNameEQUAL
lat	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
lng	TokenNameIdentifier
=	TokenNameEQUAL
lng	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FloatLatLng	TokenNameIdentifier
(	TokenNameLPAREN
LatLng	TokenNameIdentifier
ll	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
lat	TokenNameIdentifier
=	TokenNameEQUAL
ll	TokenNameIdentifier
.	TokenNameDOT
getLat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
lng	TokenNameIdentifier
=	TokenNameEQUAL
ll	TokenNameIdentifier
.	TokenNameDOT
getLng	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
LatLng	TokenNameIdentifier
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FloatLatLng	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
getFixedLat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
FixedLatLng	TokenNameIdentifier
.	TokenNameDOT
doubleToFixed	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
lat	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
getFixedLng	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
FixedLatLng	TokenNameIdentifier
.	TokenNameDOT
doubleToFixed	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
lng	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
double	TokenNamedouble
getLat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
lat	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
double	TokenNamedouble
getLng	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
lng	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
isFixedPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
FixedLatLng	TokenNameIdentifier
toFixed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FixedLatLng	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
FloatLatLng	TokenNameIdentifier
toFloat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
isNormalized	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
normalized	TokenNameIdentifier
||	TokenNameOR_OR
(	TokenNameLPAREN
(	TokenNameLPAREN
lng	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
-	TokenNameMINUS
180	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
lng	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
180	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
LatLng	TokenNameIdentifier
normalize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isNormalized	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
double	TokenNamedouble
delta	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lng	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
delta	TokenNameIdentifier
=	TokenNameEQUAL
360	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lng	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
delta	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
360	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
double	TokenNamedouble
newLng	TokenNameIdentifier
=	TokenNameEQUAL
lng	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
newLng	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
-	TokenNameMINUS
180	TokenNameIntegerLiteral
||	TokenNameOR_OR
newLng	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
180	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
newLng	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
delta	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
FloatLatLng	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FloatLatLng	TokenNameIdentifier
(	TokenNameLPAREN
lat	TokenNameIdentifier
,	TokenNameCOMMA
newLng	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
.	TokenNameDOT
normalized	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
LatLng	TokenNameIdentifier
calculateMidpoint	TokenNameIdentifier
(	TokenNameLPAREN
LatLng	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FloatLatLng	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
lat	TokenNameIdentifier
+	TokenNamePLUS
other	TokenNameIdentifier
.	TokenNameDOT
getLat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
2.0	TokenNameDoubleLiteral
,	TokenNameCOMMA
(	TokenNameLPAREN
lng	TokenNameIdentifier
+	TokenNamePLUS
other	TokenNameIdentifier
.	TokenNameDOT
getLng	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
2.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
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
final	TokenNamefinal
int	TokenNameint
prime	TokenNameIdentifier
=	TokenNameEQUAL
31	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
long	TokenNamelong
temp	TokenNameIdentifier
;	TokenNameSEMICOLON
temp	TokenNameIdentifier
=	TokenNameEQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
lat	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
result	TokenNameIdentifier
=	TokenNameEQUAL
prime	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
temp	TokenNameIdentifier
^	TokenNameXOR
(	TokenNameLPAREN
temp	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
temp	TokenNameIdentifier
=	TokenNameEQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
lng	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
prime	TokenNameIdentifier
*	TokenNameMULTIPLY
result	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
temp	TokenNameIdentifier
^	TokenNameXOR
(	TokenNameLPAREN
temp	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
prime	TokenNameIdentifier
*	TokenNameMULTIPLY
result	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
normalized	TokenNameIdentifier
?	TokenNameQUESTION
1231	TokenNameIntegerLiteral
:	TokenNameCOLON
1237	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
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
this	TokenNamethis
==	TokenNameEQUAL_EQUAL
obj	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
obj	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
FloatLatLng	TokenNameIdentifier
other	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FloatLatLng	TokenNameIdentifier
)	TokenNameRPAREN
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
lat	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
lat	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
lng	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
lng	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
normalized	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
normalized	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
