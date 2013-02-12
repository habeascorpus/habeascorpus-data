package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
spatial	TokenNameIdentifier
.	TokenNameDOT
geohash	TokenNameIdentifier
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
IndexReader	TokenNameIdentifier
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
FieldCache	TokenNameIdentifier
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
Filter	TokenNameIdentifier
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
DocIdSet	TokenNameIdentifier
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
FilteredDocIdSet	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
spatial	TokenNameIdentifier
.	TokenNameDOT
tier	TokenNameIdentifier
.	TokenNameDOT
DistanceFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
class	TokenNameclass
GeoHashDistanceFilter	TokenNameIdentifier
extends	TokenNameextends
DistanceFilter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
1L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
lat	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
lng	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
geoHashField	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
GeoHashDistanceFilter	TokenNameIdentifier
(	TokenNameLPAREN
Filter	TokenNameIdentifier
startingFilter	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
lat	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
lng	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
miles	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
geoHashField	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
startingFilter	TokenNameIdentifier
,	TokenNameCOMMA
miles	TokenNameIdentifier
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
this	TokenNamethis
.	TokenNameDOT
geoHashField	TokenNameIdentifier
=	TokenNameEQUAL
geoHashField	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
DocIdSet	TokenNameIdentifier
getDocIdSet	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
geoHashValues	TokenNameIdentifier
=	TokenNameEQUAL
FieldCache	TokenNameIdentifier
.	TokenNameDOT
DEFAULT	TokenNameIdentifier
.	TokenNameDOT
getStrings	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
geoHashField	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
docBase	TokenNameIdentifier
=	TokenNameEQUAL
nextDocBase	TokenNameIdentifier
;	TokenNameSEMICOLON
nextDocBase	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
FilteredDocIdSet	TokenNameIdentifier
(	TokenNameLPAREN
startingFilter	TokenNameIdentifier
.	TokenNameDOT
getDocIdSet	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
match	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
doc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
geoHash	TokenNameIdentifier
=	TokenNameEQUAL
geoHashValues	TokenNameIdentifier
[	TokenNameLBRACKET
doc	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
coords	TokenNameIdentifier
=	TokenNameEQUAL
GeoHashUtils	TokenNameIdentifier
.	TokenNameDOT
decode	TokenNameIdentifier
(	TokenNameLPAREN
geoHash	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
x	TokenNameIdentifier
=	TokenNameEQUAL
coords	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
double	TokenNamedouble
y	TokenNameIdentifier
=	TokenNameEQUAL
coords	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Double	TokenNameIdentifier
cachedDistance	TokenNameIdentifier
=	TokenNameEQUAL
distanceLookupCache	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
geoHash	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
d	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cachedDistance	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
d	TokenNameIdentifier
=	TokenNameEQUAL
cachedDistance	TokenNameIdentifier
.	TokenNameDOT
doubleValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
d	TokenNameIdentifier
=	TokenNameEQUAL
DistanceUtils	TokenNameIdentifier
.	TokenNameDOT
getDistanceMi	TokenNameIdentifier
(	TokenNameLPAREN
lat	TokenNameIdentifier
,	TokenNameCOMMA
lng	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
distanceLookupCache	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
geoHash	TokenNameIdentifier
,	TokenNameCOMMA
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
d	TokenNameIdentifier
<	TokenNameLESS
distance	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
distances	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
+	TokenNamePLUS
docBase	TokenNameIdentifier
,	TokenNameCOMMA
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
==	TokenNameEQUAL_EQUAL
o	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
o	TokenNameIdentifier
instanceof	TokenNameinstanceof
GeoHashDistanceFilter	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
GeoHashDistanceFilter	TokenNameIdentifier
other	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
GeoHashDistanceFilter	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
this	TokenNamethis
.	TokenNameDOT
startingFilter	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
startingFilter	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
this	TokenNamethis
.	TokenNameDOT
distance	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
distance	TokenNameIdentifier
||	TokenNameOR_OR
this	TokenNamethis
.	TokenNameDOT
lat	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
lat	TokenNameIdentifier
||	TokenNameOR_OR
this	TokenNamethis
.	TokenNameDOT
lng	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
lng	TokenNameIdentifier
||	TokenNameOR_OR
!	TokenNameNOT
this	TokenNamethis
.	TokenNameDOT
geoHashField	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
geoHashField	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
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
h	TokenNameIdentifier
=	TokenNameEQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
distance	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
h	TokenNameIdentifier
^=	TokenNameXOR_EQUAL
startingFilter	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
h	TokenNameIdentifier
^=	TokenNameXOR_EQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
lat	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
h	TokenNameIdentifier
^=	TokenNameXOR_EQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
lng	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
h	TokenNameIdentifier
^=	TokenNameXOR_EQUAL
geoHashField	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
h	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
