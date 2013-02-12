package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
suggest	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
Average	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
double	TokenNamedouble
avg	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
double	TokenNamedouble
stddev	TokenNameIdentifier
;	TokenNameSEMICOLON
Average	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
avg	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
stddev	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
avg	TokenNameIdentifier
=	TokenNameEQUAL
avg	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
stddev	TokenNameIdentifier
=	TokenNameEQUAL
stddev	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
.	TokenNameDOT
ENGLISH	TokenNameIdentifier
,	TokenNameCOMMA
"%.0f [+- %.2f]"	TokenNameStringLiteral
,	TokenNameCOMMA
avg	TokenNameIdentifier
,	TokenNameCOMMA
stddev	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
Average	TokenNameIdentifier
from	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Double	TokenNameIdentifier
>	TokenNameGREATER
values	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
sum	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
double	TokenNamedouble
sumSquares	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
double	TokenNamedouble
l	TokenNameIdentifier
:	TokenNameCOLON
values	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sum	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
l	TokenNameIdentifier
;	TokenNameSEMICOLON
sumSquares	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
l	TokenNameIdentifier
*	TokenNameMULTIPLY
l	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
double	TokenNamedouble
avg	TokenNameIdentifier
=	TokenNameEQUAL
sum	TokenNameIdentifier
/	TokenNameDIVIDE
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
values	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
Average	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
sum	TokenNameIdentifier
/	TokenNameDIVIDE
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
values	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Math	TokenNameIdentifier
.	TokenNameDOT
sqrt	TokenNameIdentifier
(	TokenNameLPAREN
sumSquares	TokenNameIdentifier
/	TokenNameDIVIDE
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
values	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
avg	TokenNameIdentifier
*	TokenNameMULTIPLY
avg	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
