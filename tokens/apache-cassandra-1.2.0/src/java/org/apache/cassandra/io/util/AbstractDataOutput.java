package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataOutput	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
OutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
UTFDataFormatException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AbstractDataOutput	TokenNameIdentifier
extends	TokenNameextends
OutputStream	TokenNameIdentifier
implements	TokenNameimplements
DataOutput	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
write	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
write	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
buffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
void	TokenNamevoid
write	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
count	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
void	TokenNamevoid
write	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
oneByte	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
writeBoolean	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
val	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
write	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
?	TokenNameQUESTION
1	TokenNameIntegerLiteral
:	TokenNameCOLON
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
val	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
write	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
byte	TokenNamebyte
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
index	TokenNameIdentifier
<	TokenNameLESS
str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
index	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
str	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
write	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
writeChar	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
val	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
val	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
val	TokenNameIdentifier
;	TokenNameSEMICOLON
write	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
buffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
writeChars	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
byte	TokenNamebyte
newBytes	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
index	TokenNameIdentifier
<	TokenNameLESS
str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
index	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
newIndex	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
index	TokenNameIdentifier
:	TokenNameCOLON
index	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
newBytes	TokenNameIdentifier
[	TokenNameLBRACKET
newIndex	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
str	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
>>	TokenNameRIGHT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
newBytes	TokenNameIdentifier
[	TokenNameLBRACKET
newIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
str	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
write	TokenNameIdentifier
(	TokenNameLPAREN
newBytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
writeDouble	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
val	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
writeFloat	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
val	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
Float	TokenNameIdentifier
.	TokenNameDOT
floatToIntBits	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
val	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
val	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
24	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
val	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
val	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
val	TokenNameIdentifier
;	TokenNameSEMICOLON
write	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
buffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
val	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
8	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
t	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
val	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
t	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
24	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
t	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
t	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
t	TokenNameIdentifier
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
val	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
24	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
val	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
6	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
val	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
7	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
val	TokenNameIdentifier
;	TokenNameSEMICOLON
write	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
buffer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
writeShort	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
val	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
writeChar	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
writeUTF	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
utfCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
length	TokenNameIdentifier
=	TokenNameEQUAL
str	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
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
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
charValue	TokenNameIdentifier
=	TokenNameEQUAL
str	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
charValue	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
charValue	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
127	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
utfCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
charValue	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
2047	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
utfCount	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
utfCount	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
utfCount	TokenNameIdentifier
>	TokenNameGREATER
65535	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UTFDataFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
byte	TokenNamebyte
utfBytes	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
utfCount	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
utfIndex	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
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
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
charValue	TokenNameIdentifier
=	TokenNameEQUAL
str	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
charValue	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
charValue	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
127	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
utfBytes	TokenNameIdentifier
[	TokenNameLBRACKET
utfIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
charValue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
charValue	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
2047	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
utfBytes	TokenNameIdentifier
[	TokenNameLBRACKET
utfIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
0xc0	TokenNameIntegerLiteral
|	TokenNameOR
(	TokenNameLPAREN
0x1f	TokenNameIntegerLiteral
&	TokenNameAND
(	TokenNameLPAREN
charValue	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
utfBytes	TokenNameIdentifier
[	TokenNameLBRACKET
utfIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
0x80	TokenNameIntegerLiteral
|	TokenNameOR
(	TokenNameLPAREN
0x3f	TokenNameIntegerLiteral
&	TokenNameAND
charValue	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
utfBytes	TokenNameIdentifier
[	TokenNameLBRACKET
utfIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
0xe0	TokenNameIntegerLiteral
|	TokenNameOR
(	TokenNameLPAREN
0x0f	TokenNameIntegerLiteral
&	TokenNameAND
(	TokenNameLPAREN
charValue	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
12	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
utfBytes	TokenNameIdentifier
[	TokenNameLBRACKET
utfIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
0x80	TokenNameIntegerLiteral
|	TokenNameOR
(	TokenNameLPAREN
0x3f	TokenNameIntegerLiteral
&	TokenNameAND
(	TokenNameLPAREN
charValue	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
utfBytes	TokenNameIdentifier
[	TokenNameLBRACKET
utfIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
0x80	TokenNameIntegerLiteral
|	TokenNameOR
(	TokenNameLPAREN
0x3f	TokenNameIntegerLiteral
&	TokenNameAND
charValue	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
utfBytes	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
utfCount	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
utfBytes	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
utfCount	TokenNameIdentifier
;	TokenNameSEMICOLON
write	TokenNameIdentifier
(	TokenNameLPAREN
utfBytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE