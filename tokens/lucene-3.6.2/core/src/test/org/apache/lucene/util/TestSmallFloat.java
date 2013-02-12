package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestSmallFloat	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
float	TokenNamefloat
orig_byteToFloat	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
b	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
int	TokenNameint
mantissa	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
&	TokenNameAND
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
exponent	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
b	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
31	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
bits	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
exponent	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
63	TokenNameIntegerLiteral
-	TokenNameMINUS
15	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
<<	TokenNameLEFT_SHIFT
24	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
(	TokenNameLPAREN
mantissa	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
21	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
Float	TokenNameIdentifier
.	TokenNameDOT
intBitsToFloat	TokenNameIdentifier
(	TokenNameLPAREN
bits	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
byte	TokenNamebyte
orig_floatToByte_v13	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
f	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
<	TokenNameLESS
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
f	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
bits	TokenNameIdentifier
=	TokenNameEQUAL
Float	TokenNameIdentifier
.	TokenNameDOT
floatToIntBits	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
mantissa	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
bits	TokenNameIdentifier
&	TokenNameAND
0xffffff	TokenNameIntegerLiteral
)	TokenNameRPAREN
>>	TokenNameRIGHT_SHIFT
21	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
exponent	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
bits	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
24	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0x7f	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
63	TokenNameIntegerLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
15	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
exponent	TokenNameIdentifier
>	TokenNameGREATER
31	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
exponent	TokenNameIdentifier
=	TokenNameEQUAL
31	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
mantissa	TokenNameIdentifier
=	TokenNameEQUAL
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
exponent	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
exponent	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
mantissa	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
exponent	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
mantissa	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
byte	TokenNamebyte
orig_floatToByte	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
f	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
<	TokenNameLESS
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
f	TokenNameIdentifier
=	TokenNameEQUAL
0.0f	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0.0f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
bits	TokenNameIdentifier
=	TokenNameEQUAL
Float	TokenNameIdentifier
.	TokenNameDOT
floatToIntBits	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
mantissa	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
bits	TokenNameIdentifier
&	TokenNameAND
0xffffff	TokenNameIntegerLiteral
)	TokenNameRPAREN
>>	TokenNameRIGHT_SHIFT
21	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
exponent	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
bits	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
24	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0x7f	TokenNameIntegerLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
63	TokenNameIntegerLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
15	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
exponent	TokenNameIdentifier
>	TokenNameGREATER
31	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
exponent	TokenNameIdentifier
=	TokenNameEQUAL
31	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
mantissa	TokenNameIdentifier
=	TokenNameEQUAL
7	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
exponent	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
exponent	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
mantissa	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
exponent	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
mantissa	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
exponent	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
mantissa	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testByteToFloat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
256	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
f1	TokenNameIdentifier
=	TokenNameEQUAL
orig_byteToFloat	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
f2	TokenNameIdentifier
=	TokenNameEQUAL
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
byteToFloat	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
15	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
f3	TokenNameIdentifier
=	TokenNameEQUAL
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
byte315ToFloat	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
,	TokenNameCOMMA
f2	TokenNameIdentifier
,	TokenNameCOMMA
0.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
f2	TokenNameIdentifier
,	TokenNameCOMMA
f3	TokenNameIdentifier
,	TokenNameCOMMA
0.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
f4	TokenNameIdentifier
=	TokenNameEQUAL
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
byteToFloat	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
f5	TokenNameIdentifier
=	TokenNameEQUAL
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
byte52ToFloat	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
f4	TokenNameIdentifier
,	TokenNameCOMMA
f5	TokenNameIdentifier
,	TokenNameCOMMA
0.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testFloatToByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
orig_floatToByte_v13	TokenNameIdentifier
(	TokenNameLPAREN
5.8123817E-10f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
orig_floatToByte	TokenNameIdentifier
(	TokenNameLPAREN
5.8123817E-10f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte315	TokenNameIdentifier
(	TokenNameLPAREN
5.8123817E-10f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte315	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte315	TokenNameIdentifier
(	TokenNameLPAREN
Float	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
255	TokenNameIntegerLiteral
,	TokenNameCOMMA
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte315	TokenNameIdentifier
(	TokenNameLPAREN
Float	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
255	TokenNameIntegerLiteral
,	TokenNameCOMMA
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte315	TokenNameIdentifier
(	TokenNameLPAREN
Float	TokenNameIdentifier
.	TokenNameDOT
POSITIVE_INFINITY	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte315	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
Float	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte315	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
Float	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte315	TokenNameIdentifier
(	TokenNameLPAREN
Float	TokenNameIdentifier
.	TokenNameDOT
NEGATIVE_INFINITY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
num	TokenNameIdentifier
=	TokenNameEQUAL
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
100000	TokenNameIntegerLiteral
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
num	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
f	TokenNameIdentifier
=	TokenNameEQUAL
Float	TokenNameIdentifier
.	TokenNameDOT
intBitsToFloat	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Float	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
byte	TokenNamebyte
b1	TokenNameIdentifier
=	TokenNameEQUAL
orig_floatToByte	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
b2	TokenNameIdentifier
=	TokenNameEQUAL
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
15	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
b3	TokenNameIdentifier
=	TokenNameEQUAL
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte315	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
b1	TokenNameIdentifier
,	TokenNameCOMMA
b2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
b2	TokenNameIdentifier
,	TokenNameCOMMA
b3	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
b4	TokenNameIdentifier
=	TokenNameEQUAL
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
b5	TokenNameIdentifier
=	TokenNameEQUAL
SmallFloat	TokenNameIdentifier
.	TokenNameDOT
floatToByte52	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
b4	TokenNameIdentifier
,	TokenNameCOMMA
b5	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE