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
util	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
HexBin	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
BASELENGTH	TokenNameIdentifier
=	TokenNameEQUAL
128	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
LOOKUPLENGTH	TokenNameIdentifier
=	TokenNameEQUAL
16	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
private	TokenNameprivate
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
hexNumberTable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
BASELENGTH	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
private	TokenNameprivate
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lookUpHexAlphabet	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
LOOKUPLENGTH	TokenNameIdentifier
]	TokenNameRBRACKET
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
BASELENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
hexNumberTable	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
'9'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
'0'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
hexNumberTable	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
i	TokenNameIdentifier
-	TokenNameMINUS
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
'F'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
'A'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
hexNumberTable	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
i	TokenNameIdentifier
-	TokenNameMINUS
'A'	TokenNameCharacterLiteral
+	TokenNamePLUS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
'f'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
'a'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
hexNumberTable	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
i	TokenNameIdentifier
-	TokenNameMINUS
'a'	TokenNameCharacterLiteral
+	TokenNamePLUS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
lookUpHexAlphabet	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
'0'	TokenNameCharacterLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
15	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
lookUpHexAlphabet	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
char	TokenNamechar
)	TokenNameRPAREN
(	TokenNameLPAREN
'A'	TokenNameCharacterLiteral
+	TokenNamePLUS
i	TokenNameIdentifier
-	TokenNameMINUS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
static	TokenNamestatic
public	TokenNamepublic
String	TokenNameIdentifier
encode	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
binaryData	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
binaryData	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
lengthData	TokenNameIdentifier
=	TokenNameEQUAL
binaryData	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
lengthEncode	TokenNameIdentifier
=	TokenNameEQUAL
lengthData	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
encodedData	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
lengthEncode	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
temp	TokenNameIdentifier
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
lengthData	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
temp	TokenNameIdentifier
=	TokenNameEQUAL
binaryData	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
temp	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
temp	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
256	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
encodedData	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
lookUpHexAlphabet	TokenNameIdentifier
[	TokenNameLBRACKET
temp	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
encodedData	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
lookUpHexAlphabet	TokenNameIdentifier
[	TokenNameLBRACKET
temp	TokenNameIdentifier
&	TokenNameAND
0xf	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
encodedData	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
public	TokenNamepublic
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
decode	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
encoded	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
encoded	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
lengthData	TokenNameIdentifier
=	TokenNameEQUAL
encoded	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lengthData	TokenNameIdentifier
%	TokenNameREMAINDER
2	TokenNameIntegerLiteral
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
binaryData	TokenNameIdentifier
=	TokenNameEQUAL
encoded	TokenNameIdentifier
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
lengthDecode	TokenNameIdentifier
=	TokenNameEQUAL
lengthData	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
decodedData	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
lengthDecode	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
byte	TokenNamebyte
temp1	TokenNameIdentifier
,	TokenNameCOMMA
temp2	TokenNameIdentifier
;	TokenNameSEMICOLON
char	TokenNamechar
tempChar	TokenNameIdentifier
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
lengthDecode	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
tempChar	TokenNameIdentifier
=	TokenNameEQUAL
binaryData	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
temp1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
tempChar	TokenNameIdentifier
<	TokenNameLESS
BASELENGTH	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
hexNumberTable	TokenNameIdentifier
[	TokenNameLBRACKET
tempChar	TokenNameIdentifier
]	TokenNameRBRACKET
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
temp1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
tempChar	TokenNameIdentifier
=	TokenNameEQUAL
binaryData	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
temp2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
tempChar	TokenNameIdentifier
<	TokenNameLESS
BASELENGTH	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
hexNumberTable	TokenNameIdentifier
[	TokenNameLBRACKET
tempChar	TokenNameIdentifier
]	TokenNameRBRACKET
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
temp2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
decodedData	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
temp1	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
temp2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
decodedData	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
