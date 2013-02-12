package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
DecimalFormat	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
DecimalFormatSymbols	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
.	TokenNameDOT
AnimationTarget	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AnimatableValue	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
static	TokenNamestatic
DecimalFormat	TokenNameIdentifier
decimalFormat	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DecimalFormat	TokenNameIdentifier
(	TokenNameLPAREN
"0.0###########################################################"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
DecimalFormatSymbols	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
.	TokenNameDOT
ENGLISH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
protected	TokenNameprotected
AnimatableValue	TokenNameIdentifier
(	TokenNameLPAREN
AnimationTarget	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
target	TokenNameIdentifier
=	TokenNameEQUAL
target	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
formatNumber	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
f	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
decimalFormat	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
AnimatableValue	TokenNameIdentifier
interpolate	TokenNameIdentifier
(	TokenNameLPAREN
AnimatableValue	TokenNameIdentifier
result	TokenNameIdentifier
,	TokenNameCOMMA
AnimatableValue	TokenNameIdentifier
to	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
interpolation	TokenNameIdentifier
,	TokenNameCOMMA
AnimatableValue	TokenNameIdentifier
accumulation	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
multiplier	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
boolean	TokenNameboolean
canPace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
float	TokenNamefloat
distanceTo	TokenNameIdentifier
(	TokenNameLPAREN
AnimatableValue	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
AnimatableValue	TokenNameIdentifier
getZeroValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasChanged	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
ret	TokenNameIdentifier
=	TokenNameEQUAL
hasChanged	TokenNameIdentifier
;	TokenNameSEMICOLON
hasChanged	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toStringRep	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"["	TokenNameStringLiteral
+	TokenNamePLUS
toStringRep	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"]"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE