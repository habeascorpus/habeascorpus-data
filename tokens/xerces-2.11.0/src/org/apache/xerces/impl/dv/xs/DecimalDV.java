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
java	TokenNameIdentifier
.	TokenNameDOT
math	TokenNameIdentifier
.	TokenNameDOT
BigDecimal	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
math	TokenNameIdentifier
.	TokenNameDOT
BigInteger	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
datatypes	TokenNameIdentifier
.	TokenNameDOT
XSDecimal	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DecimalDV	TokenNameIdentifier
extends	TokenNameextends
TypeValidator	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
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
XDecimal	TokenNameIdentifier
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
"decimal"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
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
XDecimal	TokenNameIdentifier
)	TokenNameRPAREN
value1	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
XDecimal	TokenNameIdentifier
)	TokenNameRPAREN
value2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
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
XDecimal	TokenNameIdentifier
)	TokenNameRPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
totalDigits	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
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
XDecimal	TokenNameIdentifier
)	TokenNameRPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
fracDigits	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
XDecimal	TokenNameIdentifier
implements	TokenNameimplements
XSDecimal	TokenNameIdentifier
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
boolean	TokenNameboolean
integer	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
XDecimal	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
content	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
NumberFormatException	TokenNameIdentifier
{	TokenNameLBRACE
initD	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
XDecimal	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
content	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
integer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
NumberFormatException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
integer	TokenNameIdentifier
)	TokenNameRPAREN
initI	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
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
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fracStart	TokenNameIdentifier
=	TokenNameEQUAL
intEnd	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
fracEnd	TokenNameIdentifier
=	TokenNameEQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
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
while	TokenNamewhile
(	TokenNameLPAREN
fracEnd	TokenNameIdentifier
>	TokenNameGREATER
fracStart	TokenNameIdentifier
&&	TokenNameAND_AND
content	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
fracEnd	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
fracEnd	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
totalDigits	TokenNameIdentifier
=	TokenNameEQUAL
intDigits	TokenNameIdentifier
+	TokenNamePLUS
fracDigits	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
fracDigits	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
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
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
sign	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
initI	TokenNameIdentifier
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
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
intStart	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
intEnd	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
intDigits	TokenNameIdentifier
=	TokenNameEQUAL
intEnd	TokenNameIdentifier
-	TokenNameMINUS
actualIntStart	TokenNameIdentifier
;	TokenNameSEMICOLON
fracDigits	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
totalDigits	TokenNameIdentifier
=	TokenNameEQUAL
intDigits	TokenNameIdentifier
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
else	TokenNameelse
{	TokenNameLBRACE
sign	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
integer	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
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
XDecimal	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
XDecimal	TokenNameIdentifier
oval	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XDecimal	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
oval	TokenNameIdentifier
.	TokenNameDOT
sign	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
return	TokenNamereturn
intDigits	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
oval	TokenNameIdentifier
.	TokenNameDOT
intDigits	TokenNameIdentifier
&&	TokenNameAND_AND
fracDigits	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
oval	TokenNameIdentifier
.	TokenNameDOT
fracDigits	TokenNameIdentifier
&&	TokenNameAND_AND
ivalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
oval	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
fvalue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
oval	TokenNameIdentifier
.	TokenNameDOT
fvalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
XDecimal	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
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
1	TokenNameIntegerLiteral
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
sign	TokenNameIdentifier
*	TokenNameMULTIPLY
intComp	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
intComp	TokenNameIdentifier
(	TokenNameLPAREN
XDecimal	TokenNameIdentifier
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
1	TokenNameIntegerLiteral
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
ret	TokenNameIdentifier
=	TokenNameEQUAL
ivalue	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
.	TokenNameDOT
ivalue	TokenNameIdentifier
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
1	TokenNameIntegerLiteral
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
=	TokenNameEQUAL
fvalue	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
.	TokenNameDOT
fvalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
(	TokenNameLPAREN
ret	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
1	TokenNameIntegerLiteral
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
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
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
integer	TokenNameIdentifier
)	TokenNameRPAREN
canonical	TokenNameIdentifier
=	TokenNameEQUAL
"0"	TokenNameStringLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
canonical	TokenNameIdentifier
=	TokenNameEQUAL
"0.0"	TokenNameStringLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
integer	TokenNameIdentifier
&&	TokenNameAND_AND
sign	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
canonical	TokenNameIdentifier
=	TokenNameEQUAL
ivalue	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
StringBuffer	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
totalDigits	TokenNameIdentifier
+	TokenNamePLUS
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'-'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
intDigits	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
integer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fracDigits	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
fvalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
canonical	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
BigDecimal	TokenNameIdentifier
getBigDecimal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
BigDecimal	TokenNameIdentifier
(	TokenNameLPAREN
BigInteger	TokenNameIdentifier
.	TokenNameDOT
ZERO	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
BigDecimal	TokenNameIdentifier
(	TokenNameLPAREN
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
BigInteger	TokenNameIdentifier
getBigInteger	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
NumberFormatException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fracDigits	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
BigInteger	TokenNameIdentifier
.	TokenNameDOT
ZERO	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
BigInteger	TokenNameIdentifier
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
BigInteger	TokenNameIdentifier
(	TokenNameLPAREN
"-"	TokenNameStringLiteral
+	TokenNamePLUS
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
NumberFormatException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fracDigits	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0L	TokenNameLongLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Long	TokenNameIdentifier
.	TokenNameDOT
parseLong	TokenNameIdentifier
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
Long	TokenNameIdentifier
.	TokenNameDOT
parseLong	TokenNameIdentifier
(	TokenNameLPAREN
"-"	TokenNameStringLiteral
+	TokenNamePLUS
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
NumberFormatException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fracDigits	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
"-"	TokenNameStringLiteral
+	TokenNamePLUS
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
NumberFormatException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fracDigits	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Short	TokenNameIdentifier
.	TokenNameDOT
parseShort	TokenNameIdentifier
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
Short	TokenNameIdentifier
.	TokenNameDOT
parseShort	TokenNameIdentifier
(	TokenNameLPAREN
"-"	TokenNameStringLiteral
+	TokenNamePLUS
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
byte	TokenNamebyte
getByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
NumberFormatException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fracDigits	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
sign	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Byte	TokenNameIdentifier
.	TokenNameDOT
parseByte	TokenNameIdentifier
(	TokenNameLPAREN
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
Byte	TokenNameIdentifier
.	TokenNameDOT
parseByte	TokenNameIdentifier
(	TokenNameLPAREN
"-"	TokenNameStringLiteral
+	TokenNamePLUS
ivalue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
