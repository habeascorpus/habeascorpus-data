package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Field	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteOrder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
security	TokenNameIdentifier
.	TokenNameDOT
AccessController	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
security	TokenNameIdentifier
.	TokenNameDOT
PrivilegedAction	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
sun	TokenNameIdentifier
.	TokenNameDOT
misc	TokenNameIdentifier
.	TokenNameDOT
Unsafe	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
google	TokenNameIdentifier
.	TokenNameDOT
common	TokenNameIdentifier
.	TokenNameDOT
primitives	TokenNameIdentifier
.	TokenNameDOT
Longs	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
google	TokenNameIdentifier
.	TokenNameDOT
common	TokenNameIdentifier
.	TokenNameDOT
primitives	TokenNameIdentifier
.	TokenNameDOT
UnsignedBytes	TokenNameIdentifier
;	TokenNameSEMICOLON
abstract	TokenNameabstract
class	TokenNameclass
FastByteComparisons	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
b1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
s1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
l1	TokenNameIdentifier
,	TokenNameCOMMA
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
b2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
s2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
l2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
LexicographicalComparerHolder	TokenNameIdentifier
.	TokenNameDOT
BEST_COMPARER	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
b1	TokenNameIdentifier
,	TokenNameCOMMA
s1	TokenNameIdentifier
,	TokenNameCOMMA
l1	TokenNameIdentifier
,	TokenNameCOMMA
b2	TokenNameIdentifier
,	TokenNameCOMMA
s2	TokenNameIdentifier
,	TokenNameCOMMA
l2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
interface	TokenNameinterface
Comparer	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
abstract	TokenNameabstract
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
T	TokenNameIdentifier
buffer1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length1	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
buffer2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
Comparer	TokenNameIdentifier
<	TokenNameLESS
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
lexicographicalComparerJavaImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
LexicographicalComparerHolder	TokenNameIdentifier
.	TokenNameDOT
PureJavaComparer	TokenNameIdentifier
.	TokenNameDOT
INSTANCE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
LexicographicalComparerHolder	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
UNSAFE_COMPARER_NAME	TokenNameIdentifier
=	TokenNameEQUAL
LexicographicalComparerHolder	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"$UnsafeComparer"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
Comparer	TokenNameIdentifier
<	TokenNameLESS
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
BEST_COMPARER	TokenNameIdentifier
=	TokenNameEQUAL
getBestComparer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
Comparer	TokenNameIdentifier
<	TokenNameLESS
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
getBestComparer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
theClass	TokenNameIdentifier
=	TokenNameEQUAL
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
UNSAFE_COMPARER_NAME	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
Comparer	TokenNameIdentifier
<	TokenNameLESS
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
comparer	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Comparer	TokenNameIdentifier
<	TokenNameLESS
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
)	TokenNameRPAREN
theClass	TokenNameIdentifier
.	TokenNameDOT
getEnumConstants	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
return	TokenNamereturn
comparer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
lexicographicalComparerJavaImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
enum	TokenNameenum
PureJavaComparer	TokenNameIdentifier
implements	TokenNameimplements
Comparer	TokenNameIdentifier
<	TokenNameLESS
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
{	TokenNameLBRACE
INSTANCE	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length1	TokenNameIdentifier
,	TokenNameCOMMA
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
buffer1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
buffer2	TokenNameIdentifier
&&	TokenNameAND_AND
offset1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
offset2	TokenNameIdentifier
&&	TokenNameAND_AND
length1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
length2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
end1	TokenNameIdentifier
=	TokenNameEQUAL
offset1	TokenNameIdentifier
+	TokenNamePLUS
length1	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
end2	TokenNameIdentifier
=	TokenNameEQUAL
offset2	TokenNameIdentifier
+	TokenNamePLUS
length2	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
offset1	TokenNameIdentifier
,	TokenNameCOMMA
j	TokenNameIdentifier
=	TokenNameEQUAL
offset2	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
end1	TokenNameIdentifier
&&	TokenNameAND_AND
j	TokenNameIdentifier
<	TokenNameLESS
end2	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
,	TokenNameCOMMA
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
a	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
buffer1	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
b	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
buffer2	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
a	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
a	TokenNameIdentifier
-	TokenNameMINUS
b	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
length1	TokenNameIdentifier
-	TokenNameMINUS
length2	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unused"	TokenNameStringLiteral
)	TokenNameRPAREN
private	TokenNameprivate
enum	TokenNameenum
UnsafeComparer	TokenNameIdentifier
implements	TokenNameimplements
Comparer	TokenNameIdentifier
<	TokenNameLESS
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
>	TokenNameGREATER
{	TokenNameLBRACE
INSTANCE	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
Unsafe	TokenNameIdentifier
theUnsafe	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
BYTE_ARRAY_BASE_OFFSET	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
theUnsafe	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Unsafe	TokenNameIdentifier
)	TokenNameRPAREN
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrivilegedAction	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Object	TokenNameIdentifier
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Field	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
Unsafe	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getDeclaredField	TokenNameIdentifier
(	TokenNameLPAREN
"theUnsafe"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
f	TokenNameIdentifier
.	TokenNameDOT
setAccessible	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
f	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoSuchFieldException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
Error	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalAccessException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
Error	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BYTE_ARRAY_BASE_OFFSET	TokenNameIdentifier
=	TokenNameEQUAL
theUnsafe	TokenNameIdentifier
.	TokenNameDOT
arrayBaseOffset	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
theUnsafe	TokenNameIdentifier
.	TokenNameDOT
arrayIndexScale	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
AssertionError	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
littleEndian	TokenNameIdentifier
=	TokenNameEQUAL
ByteOrder	TokenNameIdentifier
.	TokenNameDOT
nativeOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ByteOrder	TokenNameIdentifier
.	TokenNameDOT
LITTLE_ENDIAN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
boolean	TokenNameboolean
lessThanUnsigned	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
x1	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
x2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
x1	TokenNameIdentifier
+	TokenNamePLUS
Long	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
(	TokenNameLPAREN
x2	TokenNameIdentifier
+	TokenNamePLUS
Long	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length1	TokenNameIdentifier
,	TokenNameCOMMA
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
buffer1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
buffer2	TokenNameIdentifier
&&	TokenNameAND_AND
offset1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
offset2	TokenNameIdentifier
&&	TokenNameAND_AND
length1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
length2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
minLength	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
length1	TokenNameIdentifier
,	TokenNameCOMMA
length2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
minWords	TokenNameIdentifier
=	TokenNameEQUAL
minLength	TokenNameIdentifier
/	TokenNameDIVIDE
Longs	TokenNameIdentifier
.	TokenNameDOT
BYTES	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
offset1Adj	TokenNameIdentifier
=	TokenNameEQUAL
offset1	TokenNameIdentifier
+	TokenNamePLUS
BYTE_ARRAY_BASE_OFFSET	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
offset2Adj	TokenNameIdentifier
=	TokenNameEQUAL
offset2	TokenNameIdentifier
+	TokenNamePLUS
BYTE_ARRAY_BASE_OFFSET	TokenNameIdentifier
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
minWords	TokenNameIdentifier
*	TokenNameMULTIPLY
Longs	TokenNameIdentifier
.	TokenNameDOT
BYTES	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
Longs	TokenNameIdentifier
.	TokenNameDOT
BYTES	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
lw	TokenNameIdentifier
=	TokenNameEQUAL
theUnsafe	TokenNameIdentifier
.	TokenNameDOT
getLong	TokenNameIdentifier
(	TokenNameLPAREN
buffer1	TokenNameIdentifier
,	TokenNameCOMMA
offset1Adj	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
long	TokenNamelong
)	TokenNameRPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
rw	TokenNameIdentifier
=	TokenNameEQUAL
theUnsafe	TokenNameIdentifier
.	TokenNameDOT
getLong	TokenNameIdentifier
(	TokenNameLPAREN
buffer2	TokenNameIdentifier
,	TokenNameCOMMA
offset2Adj	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
long	TokenNamelong
)	TokenNameRPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
diff	TokenNameIdentifier
=	TokenNameEQUAL
lw	TokenNameIdentifier
^	TokenNameXOR
rw	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
diff	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
littleEndian	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
lessThanUnsigned	TokenNameIdentifier
(	TokenNameLPAREN
lw	TokenNameIdentifier
,	TokenNameCOMMA
rw	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
y	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
x	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
diff	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
x	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
x	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
diff	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
n	TokenNameIdentifier
=	TokenNameEQUAL
32	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
y	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
16	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
y	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
n	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
16	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
x	TokenNameIdentifier
=	TokenNameEQUAL
y	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
y	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
y	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
n	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
lw	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
n	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
0xFFL	TokenNameLongLiteral
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
(	TokenNameLPAREN
rw	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
n	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
0xFFL	TokenNameLongLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
minWords	TokenNameIdentifier
*	TokenNameMULTIPLY
Longs	TokenNameIdentifier
.	TokenNameDOT
BYTES	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
minLength	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
result	TokenNameIdentifier
=	TokenNameEQUAL
UnsignedBytes	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
buffer1	TokenNameIdentifier
[	TokenNameLBRACKET
offset1	TokenNameIdentifier
+	TokenNamePLUS
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
buffer2	TokenNameIdentifier
[	TokenNameLBRACKET
offset2	TokenNameIdentifier
+	TokenNamePLUS
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
length1	TokenNameIdentifier
-	TokenNameMINUS
length2	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE