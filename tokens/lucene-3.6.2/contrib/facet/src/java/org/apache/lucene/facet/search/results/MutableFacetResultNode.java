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
results	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
CategoryPath	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
MutableFacetResultNode	TokenNameIdentifier
implements	TokenNameimplements
FacetResultNode	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
EMPTY_SUB_RESULTS	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
ordinal	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
CategoryPath	TokenNameIdentifier
label	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
value	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
residue	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
subResults	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
MutableFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ordinal	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
ordinal	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ordinal	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
ordinal	TokenNameIdentifier
=	TokenNameEQUAL
ordinal	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
subResults	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
subResults	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
label	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
residue	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MutableFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ordinal	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
value	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
residue	TokenNameIdentifier
,	TokenNameCOMMA
CategoryPath	TokenNameIdentifier
label	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
subResults	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
ordinal	TokenNameIdentifier
=	TokenNameEQUAL
ordinal	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
residue	TokenNameIdentifier
=	TokenNameEQUAL
residue	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
label	TokenNameIdentifier
=	TokenNameEQUAL
label	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
subResults	TokenNameIdentifier
=	TokenNameEQUAL
subResults	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MutableFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
FacetResultNode	TokenNameIdentifier
other	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
takeSubResults	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
getOrdinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
other	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
other	TokenNameIdentifier
.	TokenNameDOT
getResidue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
other	TokenNameIdentifier
.	TokenNameDOT
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
takeSubResults	TokenNameIdentifier
?	TokenNameQUESTION
resultsToList	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
getSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
List	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
resultsToList	TokenNameIdentifier
(	TokenNameLPAREN
Iterable	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
subResults	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
subResults	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetResultNode	TokenNameIdentifier
r	TokenNameIdentifier
:	TokenNameCOLON
subResults	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
toString	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
numSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
subResults	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
subResults	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"Facet Result Node with "	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
numSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" sub result nodes. "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"Name: "	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"Value: "	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"Residue: "	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
residue	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
subResults	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
FacetResultNode	TokenNameIdentifier
subRes	TokenNameIdentifier
:	TokenNameCOLON
subResults	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"Subresult #"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
subRes	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
getOrdinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ordinal	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CategoryPath	TokenNameIdentifier
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
label	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLabel	TokenNameIdentifier
(	TokenNameLPAREN
CategoryPath	TokenNameIdentifier
label	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
label	TokenNameIdentifier
=	TokenNameEQUAL
label	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
double	TokenNamedouble
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setValue	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
increaseValue	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
addedValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
addedValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
double	TokenNamedouble
getResidue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
residue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setResidue	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
residue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
residue	TokenNameIdentifier
=	TokenNameEQUAL
residue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
increaseResidue	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
addedResidue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
residue	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
addedResidue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
Iterable	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
extends	TokenNameextends
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
getSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
subResults	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
subResults	TokenNameIdentifier
:	TokenNameCOLON
EMPTY_SUB_RESULTS	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
trimSubResults	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
subResults	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
subResults	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
trimmed	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
size	TokenNameIdentifier
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
subResults	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
i	TokenNameIdentifier
<	TokenNameLESS
size	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
MutableFacetResultNode	TokenNameIdentifier
trimmedNode	TokenNameIdentifier
=	TokenNameEQUAL
toImpl	TokenNameIdentifier
(	TokenNameLPAREN
subResults	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
trimmedNode	TokenNameIdentifier
.	TokenNameDOT
trimSubResults	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
trimmed	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
trimmedNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
size	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
subResults	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
increaseResidue	TokenNameIdentifier
(	TokenNameLPAREN
subResults	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
subResults	TokenNameIdentifier
=	TokenNameEQUAL
trimmed	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSubResults	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
subResults	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
subResults	TokenNameIdentifier
=	TokenNameEQUAL
subResults	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
appendSubResult	TokenNameIdentifier
(	TokenNameLPAREN
FacetResultNode	TokenNameIdentifier
subRes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
subResults	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
subResults	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
subResults	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
subRes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
insertSubResult	TokenNameIdentifier
(	TokenNameLPAREN
FacetResultNode	TokenNameIdentifier
subRes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
subResults	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
subResults	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
FacetResultNode	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
subResults	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
subRes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
CategoryPath	TokenNameIdentifier
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
TaxonomyReader	TokenNameIdentifier
taxonomyReader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
label	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
label	TokenNameIdentifier
=	TokenNameEQUAL
taxonomyReader	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
ordinal	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
label	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
getNumSubResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
subResults	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
subResults	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
MutableFacetResultNode	TokenNameIdentifier
toImpl	TokenNameIdentifier
(	TokenNameLPAREN
FacetResultNode	TokenNameIdentifier
frn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
frn	TokenNameIdentifier
instanceof	TokenNameinstanceof
MutableFacetResultNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
MutableFacetResultNode	TokenNameIdentifier
)	TokenNameRPAREN
frn	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
MutableFacetResultNode	TokenNameIdentifier
(	TokenNameLPAREN
frn	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
