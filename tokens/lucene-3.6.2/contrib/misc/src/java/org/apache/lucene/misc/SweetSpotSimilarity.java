package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
misc	TokenNameIdentifier
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
DefaultSimilarity	TokenNameIdentifier
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
FieldInvertState	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SweetSpotSimilarity	TokenNameIdentifier
extends	TokenNameextends
DefaultSimilarity	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
ln_min	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
ln_max	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
ln_steep	TokenNameIdentifier
=	TokenNameEQUAL
0.5f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Number	TokenNameIdentifier
>	TokenNameGREATER
ln_maxs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Number	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Number	TokenNameIdentifier
>	TokenNameGREATER
ln_mins	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Number	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
>	TokenNameGREATER
ln_steeps	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Boolean	TokenNameIdentifier
>	TokenNameGREATER
ln_overlaps	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
Boolean	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
tf_base	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
tf_min	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
tf_hyper_min	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
tf_hyper_max	TokenNameIdentifier
=	TokenNameEQUAL
2.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
double	TokenNamedouble
tf_hyper_base	TokenNameIdentifier
=	TokenNameEQUAL
1.3d	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
tf_hyper_xoffset	TokenNameIdentifier
=	TokenNameEQUAL
10.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
SweetSpotSimilarity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setBaselineTfFactors	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
base	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
min	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
tf_min	TokenNameIdentifier
=	TokenNameEQUAL
min	TokenNameIdentifier
;	TokenNameSEMICOLON
tf_base	TokenNameIdentifier
=	TokenNameEQUAL
base	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setHyperbolicTfFactors	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
min	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
max	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
base	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
xoffset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
tf_hyper_min	TokenNameIdentifier
=	TokenNameEQUAL
min	TokenNameIdentifier
;	TokenNameSEMICOLON
tf_hyper_max	TokenNameIdentifier
=	TokenNameEQUAL
max	TokenNameIdentifier
;	TokenNameSEMICOLON
tf_hyper_base	TokenNameIdentifier
=	TokenNameEQUAL
base	TokenNameIdentifier
;	TokenNameSEMICOLON
tf_hyper_xoffset	TokenNameIdentifier
=	TokenNameEQUAL
xoffset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLengthNormFactors	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
min	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
max	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
steepness	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
ln_min	TokenNameIdentifier
=	TokenNameEQUAL
min	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
ln_max	TokenNameIdentifier
=	TokenNameEQUAL
max	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
ln_steep	TokenNameIdentifier
=	TokenNameEQUAL
steepness	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLengthNormFactors	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
min	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
max	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
steepness	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
discountOverlaps	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ln_mins	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
min	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ln_maxs	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
max	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ln_steeps	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
Float	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
steepness	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ln_overlaps	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Boolean	TokenNameIdentifier
(	TokenNameLPAREN
discountOverlaps	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
computeNorm	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
FieldInvertState	TokenNameIdentifier
state	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
numTokens	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
overlaps	TokenNameIdentifier
=	TokenNameEQUAL
discountOverlaps	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ln_overlaps	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
overlaps	TokenNameIdentifier
=	TokenNameEQUAL
ln_overlaps	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
booleanValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
overlaps	TokenNameIdentifier
)	TokenNameRPAREN
numTokens	TokenNameIdentifier
=	TokenNameEQUAL
state	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
state	TokenNameIdentifier
.	TokenNameDOT
getNumOverlap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
numTokens	TokenNameIdentifier
=	TokenNameEQUAL
state	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
state	TokenNameIdentifier
.	TokenNameDOT
getBoost	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
computeLengthNorm	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
numTokens	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
computeLengthNorm	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numTerms	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
l	TokenNameIdentifier
=	TokenNameEQUAL
ln_min	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
h	TokenNameIdentifier
=	TokenNameEQUAL
ln_max	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
s	TokenNameIdentifier
=	TokenNameEQUAL
ln_steep	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ln_mins	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
l	TokenNameIdentifier
=	TokenNameEQUAL
ln_mins	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ln_maxs	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
h	TokenNameIdentifier
=	TokenNameEQUAL
ln_maxs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ln_steeps	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
ln_steeps	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
floatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
1.0f	TokenNameFloatingPointLiteral
/	TokenNameDIVIDE
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
s	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
numTerms	TokenNameIdentifier
-	TokenNameMINUS
l	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
numTerms	TokenNameIdentifier
-	TokenNameMINUS
h	TokenNameIdentifier
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
h	TokenNameIdentifier
-	TokenNameMINUS
l	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
1.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
float	TokenNamefloat
tf	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
freq	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
baselineTf	TokenNameIdentifier
(	TokenNameLPAREN
freq	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
baselineTf	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
freq	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
0.0f	TokenNameFloatingPointLiteral
==	TokenNameEQUAL_EQUAL
freq	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
freq	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
tf_min	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
tf_base	TokenNameIdentifier
:	TokenNameCOLON
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
freq	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
tf_base	TokenNameIdentifier
*	TokenNameMULTIPLY
tf_base	TokenNameIdentifier
)	TokenNameRPAREN
-	TokenNameMINUS
tf_min	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
hyperbolicTf	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
freq	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
0.0f	TokenNameFloatingPointLiteral
==	TokenNameEQUAL_EQUAL
freq	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
min	TokenNameIdentifier
=	TokenNameEQUAL
tf_hyper_min	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
max	TokenNameIdentifier
=	TokenNameEQUAL
tf_hyper_max	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
double	TokenNamedouble
base	TokenNameIdentifier
=	TokenNameEQUAL
tf_hyper_base	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
xoffset	TokenNameIdentifier
=	TokenNameEQUAL
tf_hyper_xoffset	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
double	TokenNamedouble
x	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
(	TokenNameLPAREN
freq	TokenNameIdentifier
-	TokenNameMINUS
xoffset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
float	TokenNamefloat
result	TokenNameIdentifier
=	TokenNameEQUAL
min	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
max	TokenNameIdentifier
-	TokenNameMINUS
min	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
2.0f	TokenNameFloatingPointLiteral
*	TokenNameMULTIPLY
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
pow	TokenNameIdentifier
(	TokenNameLPAREN
base	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
)	TokenNameRPAREN
-	TokenNameMINUS
Math	TokenNameIdentifier
.	TokenNameDOT
pow	TokenNameIdentifier
(	TokenNameLPAREN
base	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
x	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
pow	TokenNameIdentifier
(	TokenNameLPAREN
base	TokenNameIdentifier
,	TokenNameCOMMA
x	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
Math	TokenNameIdentifier
.	TokenNameDOT
pow	TokenNameIdentifier
(	TokenNameLPAREN
base	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
x	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
1.0d	TokenNameDoubleLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
Float	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
max	TokenNameIdentifier
:	TokenNameCOLON
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
