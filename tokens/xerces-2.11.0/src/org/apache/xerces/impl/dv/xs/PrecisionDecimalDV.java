package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
dv	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
dv	TokenNameIdentifier
.	TokenNameDOT
InvalidDatatypeValueException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
dv	TokenNameIdentifier
.	TokenNameDOT
ValidationContext	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
PrecisionDecimalDV	TokenNameIdentifier
extends	TokenNameextends
TypeValidator	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
class	TokenNameclass
XPrecisionDecimal	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
sign	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
totalDigits	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
intDigits	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
fracDigits	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
ivalue	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
fvalue	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
int	TokenNameint
pvalue	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
XPrecisionDecimal	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
content	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
NumberFormatException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"NaN"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ivalue	TokenNameIdentifier
=	TokenNameEQUAL
content	TokenNameIdentifier
;	TokenNameSEMICOLON
sign	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"+INF"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
content	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"INF"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
content	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"-INF"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ivalue	TokenNameIdentifier
=	TokenNameEQUAL
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'+'	TokenNameCharacterLiteral
?	TokenNameQUESTION
content	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
:	TokenNameCOLON
content	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
initD	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
initD	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
content	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
NumberFormatException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
content	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
intStart	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
intEnd	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
fracStart	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
fracEnd	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'+'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
intStart	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'-'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
intStart	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
sign	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
actualIntStart	TokenNameIdentifier
=	TokenNameEQUAL
intStart	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
actualIntStart	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
&&	TokenNameAND_AND
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
actualIntStart	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
actualIntStart	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
intEnd	TokenNameIdentifier
=	TokenNameEQUAL
actualIntStart	TokenNameIdentifier
;	TokenNameSEMICOLON
intEnd	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
&&	TokenNameAND_AND
TypeValidator	TokenNameIdentifier
.	TokenNameDOT
isDigit	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
intEnd	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
intEnd	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
intEnd	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
intEnd	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'.'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
intEnd	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'E'	TokenNameCharacterLiteral
&&	TokenNameAND_AND
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
intEnd	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
'e'	TokenNameCharacterLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
intEnd	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
fracStart	TokenNameIdentifier
=	TokenNameEQUAL
intEnd	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
fracEnd	TokenNameIdentifier
=	TokenNameEQUAL
fracStart	TokenNameIdentifier
;	TokenNameSEMICOLON
fracEnd	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
&&	TokenNameAND_AND
TypeValidator	TokenNameIdentifier
.	TokenNameDOT
isDigit	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
fracEnd	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fracEnd	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
pvalue	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
intEnd	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
intStart	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
intEnd	TokenNameIdentifier
&&	TokenNameAND_AND
fracStart	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
fracEnd	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
fracPos	TokenNameIdentifier
=	TokenNameEQUAL
fracStart	TokenNameIdentifier
;	TokenNameSEMICOLON
fracPos	TokenNameIdentifier
<	TokenNameLESS
fracEnd	TokenNameIdentifier
;	TokenNameSEMICOLON
fracPos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
TypeValidator	TokenNameIdentifier
.	TokenNameDOT
isDigit	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
fracPos	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
intDigits	TokenNameIdentifier
=	TokenNameEQUAL
intEnd	TokenNameIdentifier
-	TokenNameMINUS
actualIntStart	TokenNameIdentifier
;	TokenNameSEMICOLON
fracDigits	TokenNameIdentifier
=	TokenNameEQUAL
fracEnd	TokenNameIdentifier
-	TokenNameMINUS
fracStart	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
intDigits	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
ivalue	TokenNameIdentifier
=	TokenNameEQUAL
content	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
actualIntStart	TokenNameIdentifier
,	TokenNameCOMMA
intEnd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
fracDigits	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
fvalue	TokenNameIdentifier
=	TokenNameEQUAL
content	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
fracStart	TokenNameIdentifier
,	TokenNameCOMMA
fracEnd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fracEnd	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pvalue	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
fracEnd	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
totalDigits	TokenNameIdentifier
=	TokenNameEQUAL
intDigits	TokenNameIdentifier
+	TokenNamePLUS
fracDigits	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
this	TokenNamethis
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
XPrecisionDecimal	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
XPrecisionDecimal	TokenNameIdentifier
oval	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
oval	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
EQUAL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
compareFractionalPart	TokenNameIdentifier
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
oval	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fvalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
oval	TokenNameIdentifier
.	TokenNameDOT
fvalue	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
EQUAL	TokenNameIdentifier
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
temp1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
fvalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
temp2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
oval	TokenNameIdentifier
.	TokenNameDOT
fvalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
truncateTrailingZeros	TokenNameIdentifier
(	TokenNameLPAREN
temp1	TokenNameIdentifier
,	TokenNameCOMMA
temp2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
temp1	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
temp2	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
truncateTrailingZeros	TokenNameIdentifier
(	TokenNameLPAREN
StringBuffer	TokenNameIdentifier
fValue	TokenNameIdentifier
,	TokenNameCOMMA
StringBuffer	TokenNameIdentifier
otherFValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
fValue	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
if	TokenNameif
(	TokenNameLPAREN
fValue	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
fValue	TokenNameIdentifier
.	TokenNameDOT
deleteCharAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
break	TokenNamebreak
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
otherFValue	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
if	TokenNameif
(	TokenNameLPAREN
otherFValue	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
otherFValue	TokenNameIdentifier
.	TokenNameDOT
deleteCharAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
INDETERMINATE	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"INF"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
val	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"INF"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
EQUAL	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"INF"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
GREATER_THAN	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
LESS_THAN	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"-INF"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
val	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"-INF"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
EQUAL	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"-INF"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
LESS_THAN	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
GREATER_THAN	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
val	TokenNameIdentifier
.	TokenNameDOT
sign	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
sign	TokenNameIdentifier
>	TokenNameGREATER
val	TokenNameIdentifier
.	TokenNameDOT
sign	TokenNameIdentifier
?	TokenNameQUESTION
GREATER_THAN	TokenNameIdentifier
:	TokenNameCOLON
LESS_THAN	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
sign	TokenNameIdentifier
*	TokenNameMULTIPLY
compare	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
pvalue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
val	TokenNameIdentifier
.	TokenNameDOT
pvalue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
pvalue	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
val	TokenNameIdentifier
.	TokenNameDOT
pvalue	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
intComp	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
intDigits	TokenNameIdentifier
+	TokenNamePLUS
pvalue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
val	TokenNameIdentifier
.	TokenNameDOT
intDigits	TokenNameIdentifier
+	TokenNamePLUS
val	TokenNameIdentifier
.	TokenNameDOT
pvalue	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
intDigits	TokenNameIdentifier
+	TokenNamePLUS
pvalue	TokenNameIdentifier
>	TokenNameGREATER
val	TokenNameIdentifier
.	TokenNameDOT
intDigits	TokenNameIdentifier
+	TokenNamePLUS
val	TokenNameIdentifier
.	TokenNameDOT
pvalue	TokenNameIdentifier
?	TokenNameQUESTION
GREATER_THAN	TokenNameIdentifier
:	TokenNameCOLON
LESS_THAN	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
pvalue	TokenNameIdentifier
>	TokenNameGREATER
val	TokenNameIdentifier
.	TokenNameDOT
pvalue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
expDiff	TokenNameIdentifier
=	TokenNameEQUAL
pvalue	TokenNameIdentifier
-	TokenNameMINUS
val	TokenNameIdentifier
.	TokenNameDOT
pvalue	TokenNameIdentifier
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
fbuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
fvalue	TokenNameIdentifier
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
expDiff	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
fracDigits	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
fvalue	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fbuffer	TokenNameIdentifier
.	TokenNameDOT
deleteCharAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
compareDecimal	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
val	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
,	TokenNameCOMMA
fbuffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
val	TokenNameIdentifier
.	TokenNameDOT
fvalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
expDiff	TokenNameIdentifier
=	TokenNameEQUAL
val	TokenNameIdentifier
.	TokenNameDOT
pvalue	TokenNameIdentifier
-	TokenNameMINUS
pvalue	TokenNameIdentifier
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
fbuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
.	TokenNameDOT
fvalue	TokenNameIdentifier
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
expDiff	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
val	TokenNameIdentifier
.	TokenNameDOT
fracDigits	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
.	TokenNameDOT
fvalue	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fbuffer	TokenNameIdentifier
.	TokenNameDOT
deleteCharAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
compareDecimal	TokenNameIdentifier
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
,	TokenNameCOMMA
buffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
fvalue	TokenNameIdentifier
,	TokenNameCOMMA
fbuffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
intComp	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
intComp	TokenNameIdentifier
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
intDigits	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
val	TokenNameIdentifier
.	TokenNameDOT
intDigits	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
intDigits	TokenNameIdentifier
>	TokenNameGREATER
val	TokenNameIdentifier
.	TokenNameDOT
intDigits	TokenNameIdentifier
?	TokenNameQUESTION
GREATER_THAN	TokenNameIdentifier
:	TokenNameCOLON
LESS_THAN	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
compareDecimal	TokenNameIdentifier
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
,	TokenNameCOMMA
val	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
,	TokenNameCOMMA
fvalue	TokenNameIdentifier
,	TokenNameCOMMA
val	TokenNameIdentifier
.	TokenNameDOT
fvalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
compareDecimal	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
iValue	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
fValue	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
otherIValue	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
otherFValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
ret	TokenNameIdentifier
=	TokenNameEQUAL
iValue	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
otherIValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
ret	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
GREATER_THAN	TokenNameIdentifier
:	TokenNameCOLON
LESS_THAN	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fValue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
otherFValue	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
EQUAL	TokenNameIdentifier
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
temp1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
fValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuffer	TokenNameIdentifier
temp2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
otherFValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
truncateTrailingZeros	TokenNameIdentifier
(	TokenNameLPAREN
temp1	TokenNameIdentifier
,	TokenNameCOMMA
temp2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
=	TokenNameEQUAL
temp1	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
temp2	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
EQUAL	TokenNameIdentifier
:	TokenNameCOLON
(	TokenNameLPAREN
ret	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
GREATER_THAN	TokenNameIdentifier
:	TokenNameCOLON
LESS_THAN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
canonical	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
synchronized	TokenNamesynchronized
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
canonical	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
makeCanonical	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
canonical	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
makeCanonical	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
canonical	TokenNameIdentifier
=	TokenNameEQUAL
"TBD by Working Group"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isIdentical	TokenNameIdentifier
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
decimal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
decimal	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"INF"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"-INF"	TokenNameStringLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"NaN"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
decimal	TokenNameIdentifier
.	TokenNameDOT
sign	TokenNameIdentifier
&&	TokenNameAND_AND
intDigits	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
decimal	TokenNameIdentifier
.	TokenNameDOT
intDigits	TokenNameIdentifier
&&	TokenNameAND_AND
fracDigits	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
decimal	TokenNameIdentifier
.	TokenNameDOT
fracDigits	TokenNameIdentifier
&&	TokenNameAND_AND
pvalue	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
decimal	TokenNameIdentifier
.	TokenNameDOT
pvalue	TokenNameIdentifier
&&	TokenNameAND_AND
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
decimal	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
fvalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
decimal	TokenNameIdentifier
.	TokenNameDOT
fvalue	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getAllowedFacets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_PATTERN	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_WHITESPACE	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_ENUMERATION	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_MAXINCLUSIVE	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_MININCLUSIVE	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_MAXEXCLUSIVE	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_MINEXCLUSIVE	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_TOTALDIGITS	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_FRACTIONDIGITS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getActualValue	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
content	TokenNameIdentifier
,	TokenNameCOMMA
ValidationContext	TokenNameIdentifier
context	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidDatatypeValueException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
XPrecisionDecimal	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
)	TokenNameRPAREN
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
InvalidDatatypeValueException	TokenNameIdentifier
(	TokenNameLPAREN
"cvc-datatype-valid.1.2.1"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
content	TokenNameIdentifier
,	TokenNameCOMMA
"precisionDecimal"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
value1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
)	TokenNameRPAREN
value1	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
)	TokenNameRPAREN
value2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getFractionDigits	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
)	TokenNameRPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
fracDigits	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getTotalDigits	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
)	TokenNameRPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
totalDigits	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isIdentical	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
value1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
value2	TokenNameIdentifier
instanceof	TokenNameinstanceof
XPrecisionDecimal	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
!	TokenNameNOT
(	TokenNameLPAREN
value1	TokenNameIdentifier
instanceof	TokenNameinstanceof
XPrecisionDecimal	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
)	TokenNameRPAREN
value1	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
isIdentical	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
XPrecisionDecimal	TokenNameIdentifier
)	TokenNameRPAREN
value2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
