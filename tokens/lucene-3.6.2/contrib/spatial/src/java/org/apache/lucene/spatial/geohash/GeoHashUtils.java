package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
spatial	TokenNameIdentifier
.	TokenNameDOT
geohash	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
class	TokenNameclass
GeoHashUtils	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
BASE_32	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
'0'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'1'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'2'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'3'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'4'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'5'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'6'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'7'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'8'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'9'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'b'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'c'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'd'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'e'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'f'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'g'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'h'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'j'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'k'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'm'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'n'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'p'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'q'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'r'	TokenNameCharacterLiteral
,	TokenNameCOMMA
's'	TokenNameCharacterLiteral
,	TokenNameCOMMA
't'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'u'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'v'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'w'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'x'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'y'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'z'	TokenNameCharacterLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
Map	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
DECODE_MAP	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PRECISION	TokenNameIdentifier
=	TokenNameEQUAL
12	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
BITS	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
16	TokenNameIntegerLiteral
,	TokenNameCOMMA
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
static	TokenNamestatic
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
BASE_32	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
DECODE_MAP	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
Character	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
BASE_32	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
GeoHashUtils	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
encode	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
latitude	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
longitude	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
latInterval	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
-	TokenNameMINUS
90.0	TokenNameDoubleLiteral
,	TokenNameCOMMA
90.0	TokenNameDoubleLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lngInterval	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
-	TokenNameMINUS
180.0	TokenNameDoubleLiteral
,	TokenNameCOMMA
180.0	TokenNameDoubleLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
final	TokenNamefinal
StringBuilder	TokenNameIdentifier
geohash	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isEven	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
int	TokenNameint
bit	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
ch	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
geohash	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
PRECISION	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
mid	TokenNameIdentifier
=	TokenNameEQUAL
0.0	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isEven	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
mid	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
/	TokenNameDIVIDE
2D	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
longitude	TokenNameIdentifier
>	TokenNameGREATER
mid	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ch	TokenNameIdentifier
|=	TokenNameOR_EQUAL
BITS	TokenNameIdentifier
[	TokenNameLBRACKET
bit	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
mid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
mid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
mid	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
/	TokenNameDIVIDE
2D	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
latitude	TokenNameIdentifier
>	TokenNameGREATER
mid	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ch	TokenNameIdentifier
|=	TokenNameOR_EQUAL
BITS	TokenNameIdentifier
[	TokenNameLBRACKET
bit	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
mid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
mid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
isEven	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
isEven	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
bit	TokenNameIdentifier
<	TokenNameLESS
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
bit	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
geohash	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
BASE_32	TokenNameIdentifier
[	TokenNameLBRACKET
ch	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bit	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
ch	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
geohash	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
decode	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
geohash	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
latInterval	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
-	TokenNameMINUS
90.0	TokenNameDoubleLiteral
,	TokenNameCOMMA
90.0	TokenNameDoubleLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
final	TokenNamefinal
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lngInterval	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
-	TokenNameMINUS
180.0	TokenNameDoubleLiteral
,	TokenNameCOMMA
180.0	TokenNameDoubleLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isEven	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
double	TokenNamedouble
latitude	TokenNameIdentifier
;	TokenNameSEMICOLON
double	TokenNamedouble
longitude	TokenNameIdentifier
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
geohash	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
cd	TokenNameIdentifier
=	TokenNameEQUAL
DECODE_MAP	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
Character	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
geohash	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
mask	TokenNameIdentifier
:	TokenNameCOLON
BITS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isEven	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
cd	TokenNameIdentifier
&	TokenNameAND
mask	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
/	TokenNameDIVIDE
2D	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
/	TokenNameDIVIDE
2D	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
cd	TokenNameIdentifier
&	TokenNameAND
mask	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
/	TokenNameDIVIDE
2D	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
/	TokenNameDIVIDE
2D	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
isEven	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
isEven	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
latitude	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
latInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
/	TokenNameDIVIDE
2D	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
longitude	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
lngInterval	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
/	TokenNameDIVIDE
2D	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
double	TokenNamedouble
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
latitude	TokenNameIdentifier
,	TokenNameCOMMA
longitude	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE