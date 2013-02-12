package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
search	TokenNameIdentifier
.	TokenNameDOT
NumericRangeQuery	TokenNameIdentifier
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
NumericRangeFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
NumericUtils	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
NumericUtils	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PRECISION_STEP_DEFAULT	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
SHIFT_START_LONG	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
0x20	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
BUF_SIZE_LONG	TokenNameIdentifier
=	TokenNameEQUAL
63	TokenNameIntegerLiteral
/	TokenNameDIVIDE
7	TokenNameIntegerLiteral
+	TokenNamePLUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
SHIFT_START_INT	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
0x60	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
BUF_SIZE_INT	TokenNameIdentifier
=	TokenNameEQUAL
31	TokenNameIntegerLiteral
/	TokenNameDIVIDE
7	TokenNameIntegerLiteral
+	TokenNamePLUS
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
longToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
long	TokenNamelong
val	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
shift	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
shift	TokenNameIdentifier
>	TokenNameGREATER
63	TokenNameIntegerLiteral
||	TokenNameOR_OR
shift	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Illegal shift value, must be 0..63"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
nChars	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
63	TokenNameIntegerLiteral
-	TokenNameMINUS
shift	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
7	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
=	TokenNameEQUAL
nChars	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
SHIFT_START_LONG	TokenNameIdentifier
+	TokenNamePLUS
shift	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
sortableBits	TokenNameIdentifier
=	TokenNameEQUAL
val	TokenNameIdentifier
^	TokenNameXOR
0x8000000000000000L	TokenNameLongLiteral
;	TokenNameSEMICOLON
sortableBits	TokenNameIdentifier
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL
shift	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
nChars	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
nChars	TokenNameIdentifier
--	TokenNameMINUS_MINUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
sortableBits	TokenNameIdentifier
&	TokenNameAND
0x7f	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sortableBits	TokenNameIdentifier
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
longToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
long	TokenNamelong
val	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
shift	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
BUF_SIZE_LONG	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
longToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
,	TokenNameCOMMA
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
longToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
long	TokenNamelong
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
longToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
intToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
val	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
shift	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
shift	TokenNameIdentifier
>	TokenNameGREATER
31	TokenNameIntegerLiteral
||	TokenNameOR_OR
shift	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Illegal shift value, must be 0..31"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
nChars	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
31	TokenNameIntegerLiteral
-	TokenNameMINUS
shift	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
7	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
=	TokenNameEQUAL
nChars	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
SHIFT_START_INT	TokenNameIdentifier
+	TokenNamePLUS
shift	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
sortableBits	TokenNameIdentifier
=	TokenNameEQUAL
val	TokenNameIdentifier
^	TokenNameXOR
0x80000000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
sortableBits	TokenNameIdentifier
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL
shift	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
nChars	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
nChars	TokenNameIdentifier
--	TokenNameMINUS_MINUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
sortableBits	TokenNameIdentifier
&	TokenNameAND
0x7f	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sortableBits	TokenNameIdentifier
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
intToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
val	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
shift	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
BUF_SIZE_INT	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
intToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
,	TokenNameCOMMA
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
intToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
intToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
long	TokenNamelong
prefixCodedToLong	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
prefixCoded	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
shift	TokenNameIdentifier
=	TokenNameEQUAL
prefixCoded	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
SHIFT_START_LONG	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
shift	TokenNameIdentifier
>	TokenNameGREATER
63	TokenNameIntegerLiteral
||	TokenNameOR_OR
shift	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid shift value in prefixCoded string (is encoded value really a LONG?)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
sortableBits	TokenNameIdentifier
=	TokenNameEQUAL
0L	TokenNameLongLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
=	TokenNameEQUAL
prefixCoded	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
sortableBits	TokenNameIdentifier
<<=	TokenNameLEFT_SHIFT_EQUAL
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
char	TokenNamechar
ch	TokenNameIdentifier
=	TokenNameEQUAL
prefixCoded	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ch	TokenNameIdentifier
>	TokenNameGREATER
0x7f	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid prefixCoded numerical value representation (char "	TokenNameStringLiteral
+	TokenNamePLUS
Integer	TokenNameIdentifier
.	TokenNameDOT
toHexString	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" at position "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
+	TokenNamePLUS
" is invalid)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sortableBits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
ch	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
sortableBits	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
shift	TokenNameIdentifier
)	TokenNameRPAREN
^	TokenNameXOR
0x8000000000000000L	TokenNameLongLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
prefixCodedToInt	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
prefixCoded	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
shift	TokenNameIdentifier
=	TokenNameEQUAL
prefixCoded	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
SHIFT_START_INT	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
shift	TokenNameIdentifier
>	TokenNameGREATER
31	TokenNameIntegerLiteral
||	TokenNameOR_OR
shift	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid shift value in prefixCoded string (is encoded value really an INT?)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
sortableBits	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
=	TokenNameEQUAL
prefixCoded	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
sortableBits	TokenNameIdentifier
<<=	TokenNameLEFT_SHIFT_EQUAL
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
char	TokenNamechar
ch	TokenNameIdentifier
=	TokenNameEQUAL
prefixCoded	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ch	TokenNameIdentifier
>	TokenNameGREATER
0x7f	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid prefixCoded numerical value representation (char "	TokenNameStringLiteral
+	TokenNamePLUS
Integer	TokenNameIdentifier
.	TokenNameDOT
toHexString	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" at position "	TokenNameStringLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
+	TokenNamePLUS
" is invalid)"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sortableBits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
ch	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
sortableBits	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
shift	TokenNameIdentifier
)	TokenNameRPAREN
^	TokenNameXOR
0x80000000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
long	TokenNamelong
doubleToSortableLong	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
f	TokenNameIdentifier
=	TokenNameEQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
f	TokenNameIdentifier
^=	TokenNameXOR_EQUAL
0x7fffffffffffffffL	TokenNameLongLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
f	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
doubleToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
longToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
doubleToSortableLong	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
double	TokenNamedouble
sortableLongToDouble	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
val	TokenNameIdentifier
^=	TokenNameXOR_EQUAL
0x7fffffffffffffffL	TokenNameLongLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
Double	TokenNameIdentifier
.	TokenNameDOT
longBitsToDouble	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
double	TokenNamedouble
prefixCodedToDouble	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
sortableLongToDouble	TokenNameIdentifier
(	TokenNameLPAREN
prefixCodedToLong	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
floatToSortableInt	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
f	TokenNameIdentifier
=	TokenNameEQUAL
Float	TokenNameIdentifier
.	TokenNameDOT
floatToIntBits	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
f	TokenNameIdentifier
^=	TokenNameXOR_EQUAL
0x7fffffff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
f	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
floatToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
intToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
floatToSortableInt	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
float	TokenNamefloat
sortableIntToFloat	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
val	TokenNameIdentifier
^=	TokenNameXOR_EQUAL
0x7fffffff	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
Float	TokenNameIdentifier
.	TokenNameDOT
intBitsToFloat	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
float	TokenNamefloat
prefixCodedToFloat	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
sortableIntToFloat	TokenNameIdentifier
(	TokenNameLPAREN
prefixCodedToInt	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
splitLongRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
LongRangeBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
long	TokenNamelong
minBound	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
long	TokenNamelong
maxBound	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
splitRange	TokenNameIdentifier
(	TokenNameLPAREN
builder	TokenNameIdentifier
,	TokenNameCOMMA
64	TokenNameIntegerLiteral
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
minBound	TokenNameIdentifier
,	TokenNameCOMMA
maxBound	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
splitIntRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
IntRangeBuilder	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
minBound	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
maxBound	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
splitRange	TokenNameIdentifier
(	TokenNameLPAREN
builder	TokenNameIdentifier
,	TokenNameCOMMA
32	TokenNameIntegerLiteral
,	TokenNameCOMMA
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
minBound	TokenNameIdentifier
,	TokenNameCOMMA
maxBound	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
splitRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Object	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
valSize	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
precisionStep	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
minBound	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
maxBound	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
precisionStep	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"precisionStep must be >=1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
minBound	TokenNameIdentifier
>	TokenNameGREATER
maxBound	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
shift	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
;	TokenNameSEMICOLON
shift	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
precisionStep	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
long	TokenNamelong
diff	TokenNameIdentifier
=	TokenNameEQUAL
1L	TokenNameLongLiteral
<<	TokenNameLEFT_SHIFT
(	TokenNameLPAREN
shift	TokenNameIdentifier
+	TokenNamePLUS
precisionStep	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
mask	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
1L	TokenNameLongLiteral
<<	TokenNameLEFT_SHIFT
precisionStep	TokenNameIdentifier
)	TokenNameRPAREN
-	TokenNameMINUS
1L	TokenNameLongLiteral
)	TokenNameRPAREN
<<	TokenNameLEFT_SHIFT
shift	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
boolean	TokenNameboolean
hasLower	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
minBound	TokenNameIdentifier
&	TokenNameAND
mask	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0L	TokenNameLongLiteral
,	TokenNameCOMMA
hasUpper	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
maxBound	TokenNameIdentifier
&	TokenNameAND
mask	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
mask	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
long	TokenNamelong
nextMinBound	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
hasLower	TokenNameIdentifier
?	TokenNameQUESTION
(	TokenNameLPAREN
minBound	TokenNameIdentifier
+	TokenNamePLUS
diff	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
minBound	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
~	TokenNameTWIDDLE
mask	TokenNameIdentifier
,	TokenNameCOMMA
nextMaxBound	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
hasUpper	TokenNameIdentifier
?	TokenNameQUESTION
(	TokenNameLPAREN
maxBound	TokenNameIdentifier
-	TokenNameMINUS
diff	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
maxBound	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
~	TokenNameTWIDDLE
mask	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
boolean	TokenNameboolean
lowerWrapped	TokenNameIdentifier
=	TokenNameEQUAL
nextMinBound	TokenNameIdentifier
<	TokenNameLESS
minBound	TokenNameIdentifier
,	TokenNameCOMMA
upperWrapped	TokenNameIdentifier
=	TokenNameEQUAL
nextMaxBound	TokenNameIdentifier
>	TokenNameGREATER
maxBound	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
shift	TokenNameIdentifier
+	TokenNamePLUS
precisionStep	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
valSize	TokenNameIdentifier
||	TokenNameOR_OR
nextMinBound	TokenNameIdentifier
>	TokenNameGREATER
nextMaxBound	TokenNameIdentifier
||	TokenNameOR_OR
lowerWrapped	TokenNameIdentifier
||	TokenNameOR_OR
upperWrapped	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
addRange	TokenNameIdentifier
(	TokenNameLPAREN
builder	TokenNameIdentifier
,	TokenNameCOMMA
valSize	TokenNameIdentifier
,	TokenNameCOMMA
minBound	TokenNameIdentifier
,	TokenNameCOMMA
maxBound	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
hasLower	TokenNameIdentifier
)	TokenNameRPAREN
addRange	TokenNameIdentifier
(	TokenNameLPAREN
builder	TokenNameIdentifier
,	TokenNameCOMMA
valSize	TokenNameIdentifier
,	TokenNameCOMMA
minBound	TokenNameIdentifier
,	TokenNameCOMMA
minBound	TokenNameIdentifier
|	TokenNameOR
mask	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hasUpper	TokenNameIdentifier
)	TokenNameRPAREN
addRange	TokenNameIdentifier
(	TokenNameLPAREN
builder	TokenNameIdentifier
,	TokenNameCOMMA
valSize	TokenNameIdentifier
,	TokenNameCOMMA
maxBound	TokenNameIdentifier
&	TokenNameAND
~	TokenNameTWIDDLE
mask	TokenNameIdentifier
,	TokenNameCOMMA
maxBound	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
minBound	TokenNameIdentifier
=	TokenNameEQUAL
nextMinBound	TokenNameIdentifier
;	TokenNameSEMICOLON
maxBound	TokenNameIdentifier
=	TokenNameEQUAL
nextMaxBound	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
addRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Object	TokenNameIdentifier
builder	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
valSize	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
minBound	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
maxBound	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
shift	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
maxBound	TokenNameIdentifier
|=	TokenNameOR_EQUAL
(	TokenNameLPAREN
1L	TokenNameLongLiteral
<<	TokenNameLEFT_SHIFT
shift	TokenNameIdentifier
)	TokenNameRPAREN
-	TokenNameMINUS
1L	TokenNameLongLiteral
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
valSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
64	TokenNameIntegerLiteral
:	TokenNameCOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
LongRangeBuilder	TokenNameIdentifier
)	TokenNameRPAREN
builder	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
addRange	TokenNameIdentifier
(	TokenNameLPAREN
minBound	TokenNameIdentifier
,	TokenNameCOMMA
maxBound	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
32	TokenNameIntegerLiteral
:	TokenNameCOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
IntRangeBuilder	TokenNameIdentifier
)	TokenNameRPAREN
builder	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
addRange	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
minBound	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
maxBound	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"valSize must be 32 or 64."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
abstract	TokenNameabstract
class	TokenNameclass
LongRangeBuilder	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
addRange	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
minPrefixCoded	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
maxPrefixCoded	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
long	TokenNamelong
min	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
long	TokenNamelong
max	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
shift	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
addRange	TokenNameIdentifier
(	TokenNameLPAREN
longToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
min	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
longToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
max	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
abstract	TokenNameabstract
class	TokenNameclass
IntRangeBuilder	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
addRange	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
minPrefixCoded	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
maxPrefixCoded	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addRange	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
min	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
max	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
shift	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
addRange	TokenNameIdentifier
(	TokenNameLPAREN
intToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
min	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
intToPrefixCoded	TokenNameIdentifier
(	TokenNameLPAREN
max	TokenNameIdentifier
,	TokenNameCOMMA
shift	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE