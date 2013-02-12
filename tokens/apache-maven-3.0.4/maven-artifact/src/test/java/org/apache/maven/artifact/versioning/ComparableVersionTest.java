package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
versioning	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
ComparableVersionTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Comparable	TokenNameIdentifier
newComparable	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ComparableVersion	TokenNameIdentifier
(	TokenNameLPAREN
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
VERSIONS_QUALIFIER	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"1-alpha2snapshot"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-alpha2"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-alpha-123"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-beta-2"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-beta123"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-m2"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-m11"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-rc"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-cr2"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-rc123"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-SNAPSHOT"	TokenNameStringLiteral
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-sp"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-sp2"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-sp123"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-abc"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-def"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-pom-1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-1-snapshot"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-2"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-123"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
VERSIONS_NUMBER	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"2.0"	TokenNameStringLiteral
,	TokenNameCOMMA
"2-1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.0.a"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.0.0.a"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.0.2"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.0.123"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.1.0"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.1-a"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.1b"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.1-c"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.1-1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.1.0.1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.2"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.123"	TokenNameStringLiteral
,	TokenNameCOMMA
"11.a2"	TokenNameStringLiteral
,	TokenNameCOMMA
"11.a11"	TokenNameStringLiteral
,	TokenNameCOMMA
"11.b2"	TokenNameStringLiteral
,	TokenNameCOMMA
"11.b11"	TokenNameStringLiteral
,	TokenNameCOMMA
"11.m2"	TokenNameStringLiteral
,	TokenNameCOMMA
"11.m11"	TokenNameStringLiteral
,	TokenNameCOMMA
"11"	TokenNameStringLiteral
,	TokenNameCOMMA
"11.a"	TokenNameStringLiteral
,	TokenNameCOMMA
"11b"	TokenNameStringLiteral
,	TokenNameCOMMA
"11c"	TokenNameStringLiteral
,	TokenNameCOMMA
"11m"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
void	TokenNamevoid
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
versions	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Comparable	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
c	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Comparable	TokenNameIdentifier
[	TokenNameLBRACKET
versions	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
]	TokenNameRBRACKET
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
versions	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
c	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
newComparable	TokenNameIdentifier
(	TokenNameLPAREN
versions	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
versions	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Comparable	TokenNameIdentifier
low	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
versions	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Comparable	TokenNameIdentifier
high	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expected "	TokenNameStringLiteral
+	TokenNamePLUS
low	TokenNameIdentifier
+	TokenNamePLUS
" < "	TokenNameStringLiteral
+	TokenNamePLUS
high	TokenNameIdentifier
,	TokenNameCOMMA
low	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
high	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expected "	TokenNameStringLiteral
+	TokenNamePLUS
high	TokenNameIdentifier
+	TokenNamePLUS
" > "	TokenNameStringLiteral
+	TokenNamePLUS
low	TokenNameIdentifier
,	TokenNameCOMMA
high	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
low	TokenNameIdentifier
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
v1	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
v2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Comparable	TokenNameIdentifier
c1	TokenNameIdentifier
=	TokenNameEQUAL
newComparable	TokenNameIdentifier
(	TokenNameLPAREN
v1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Comparable	TokenNameIdentifier
c2	TokenNameIdentifier
=	TokenNameEQUAL
newComparable	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expected "	TokenNameStringLiteral
+	TokenNamePLUS
v1	TokenNameIdentifier
+	TokenNamePLUS
" == "	TokenNameStringLiteral
+	TokenNamePLUS
v2	TokenNameIdentifier
,	TokenNameCOMMA
c1	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
c2	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expected "	TokenNameStringLiteral
+	TokenNamePLUS
v2	TokenNameIdentifier
+	TokenNamePLUS
" == "	TokenNameStringLiteral
+	TokenNamePLUS
v1	TokenNameIdentifier
,	TokenNameCOMMA
c2	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
c1	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expected same hashcode for "	TokenNameStringLiteral
+	TokenNamePLUS
v1	TokenNameIdentifier
+	TokenNamePLUS
" and "	TokenNameStringLiteral
+	TokenNamePLUS
v2	TokenNameIdentifier
,	TokenNameCOMMA
c1	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
c2	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expected "	TokenNameStringLiteral
+	TokenNamePLUS
v1	TokenNameIdentifier
+	TokenNamePLUS
".equals( "	TokenNameStringLiteral
+	TokenNamePLUS
v2	TokenNameIdentifier
+	TokenNamePLUS
" )"	TokenNameStringLiteral
,	TokenNameCOMMA
c1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
c2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expected "	TokenNameStringLiteral
+	TokenNamePLUS
v2	TokenNameIdentifier
+	TokenNamePLUS
".equals( "	TokenNameStringLiteral
+	TokenNamePLUS
v1	TokenNameIdentifier
+	TokenNamePLUS
" )"	TokenNameStringLiteral
,	TokenNameCOMMA
c2	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
c1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
v1	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
v2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Comparable	TokenNameIdentifier
c1	TokenNameIdentifier
=	TokenNameEQUAL
newComparable	TokenNameIdentifier
(	TokenNameLPAREN
v1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Comparable	TokenNameIdentifier
c2	TokenNameIdentifier
=	TokenNameEQUAL
newComparable	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expected "	TokenNameStringLiteral
+	TokenNamePLUS
v1	TokenNameIdentifier
+	TokenNamePLUS
" < "	TokenNameStringLiteral
+	TokenNamePLUS
v2	TokenNameIdentifier
,	TokenNameCOMMA
c1	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
c2	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"expected "	TokenNameStringLiteral
+	TokenNamePLUS
v2	TokenNameIdentifier
+	TokenNamePLUS
" > "	TokenNameStringLiteral
+	TokenNamePLUS
v1	TokenNameIdentifier
,	TokenNameCOMMA
c2	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
c1	TokenNameIdentifier
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testVersionsQualifier	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
VERSIONS_QUALIFIER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testVersionsNumber	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
VERSIONS_NUMBER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0.0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1.0"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0.0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1.0"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1a"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1a"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1a"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1a"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0.0-a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1.0a"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0.a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1.0.0a"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0.0.a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1x"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.x"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1x"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-x"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1x"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-x"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1x"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0.0-x"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1.0x"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0.x"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1.0.0x"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0.0.x"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1ga"	TokenNameStringLiteral
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1final"	TokenNameStringLiteral
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1cr"	TokenNameStringLiteral
,	TokenNameCOMMA
"1rc"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1a1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1alpha1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1b2"	TokenNameStringLiteral
,	TokenNameCOMMA
"1beta2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1m3"	TokenNameStringLiteral
,	TokenNameCOMMA
"1milestone3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1X"	TokenNameStringLiteral
,	TokenNameCOMMA
"1x"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1A"	TokenNameStringLiteral
,	TokenNameCOMMA
"1a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1B"	TokenNameStringLiteral
,	TokenNameCOMMA
"1b"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1M"	TokenNameStringLiteral
,	TokenNameCOMMA
"1m"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1Ga"	TokenNameStringLiteral
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1GA"	TokenNameStringLiteral
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1Final"	TokenNameStringLiteral
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1FinaL"	TokenNameStringLiteral
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1FINAL"	TokenNameStringLiteral
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1Cr"	TokenNameStringLiteral
,	TokenNameCOMMA
"1Rc"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1cR"	TokenNameStringLiteral
,	TokenNameCOMMA
"1rC"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1m3"	TokenNameStringLiteral
,	TokenNameCOMMA
"1Milestone3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1m3"	TokenNameStringLiteral
,	TokenNameCOMMA
"1MileStone3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1m3"	TokenNameStringLiteral
,	TokenNameCOMMA
"1MILESTONE3"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testVersionComparing	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.5"	TokenNameStringLiteral
,	TokenNameCOMMA
"2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.5"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0.0"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0.1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.2.0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0-alpha-1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0-alpha-1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-alpha-2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0-alpha-1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-beta-1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0-beta-1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-SNAPSHOT"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0-SNAPSHOT"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0-alpha-1-SNAPSHOT"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-alpha-1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0-1"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"1.0.0"	TokenNameStringLiteral
,	TokenNameCOMMA
"1.0-1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"2.0-1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.0.1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"2.0.1-klm"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.0.1-lmn"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"2.0.1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.0.1-xyz"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"2.0.1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.0.1-123"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsOrder	TokenNameIdentifier
(	TokenNameLPAREN
"2.0.1-xyz"	TokenNameStringLiteral
,	TokenNameCOMMA
"2.0.1-123"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testLocaleIndependent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Locale	TokenNameIdentifier
orig	TokenNameIdentifier
=	TokenNameEQUAL
Locale	TokenNameIdentifier
.	TokenNameDOT
getDefault	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Locale	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
locales	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
Locale	TokenNameIdentifier
.	TokenNameDOT
ENGLISH	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Locale	TokenNameIdentifier
(	TokenNameLPAREN
"tr"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
Locale	TokenNameIdentifier
.	TokenNameDOT
getDefault	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Locale	TokenNameIdentifier
locale	TokenNameIdentifier
:	TokenNameCOLON
locales	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Locale	TokenNameIdentifier
.	TokenNameDOT
setDefault	TokenNameIdentifier
(	TokenNameLPAREN
locale	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVersionsEqual	TokenNameIdentifier
(	TokenNameLPAREN
"1-abcdefghijklmnopqrstuvwxyz"	TokenNameStringLiteral
,	TokenNameCOMMA
"1-ABCDEFGHIJKLMNOPQRSTUVWXYZ"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
Locale	TokenNameIdentifier
.	TokenNameDOT
setDefault	TokenNameIdentifier
(	TokenNameLPAREN
orig	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testReuse	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ComparableVersion	TokenNameIdentifier
c1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ComparableVersion	TokenNameIdentifier
(	TokenNameLPAREN
"1"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c1	TokenNameIdentifier
.	TokenNameDOT
parseVersion	TokenNameIdentifier
(	TokenNameLPAREN
"2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Comparable	TokenNameIdentifier
c2	TokenNameIdentifier
=	TokenNameEQUAL
newComparable	TokenNameIdentifier
(	TokenNameLPAREN
"2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"reused instance should be equivalent to new instance"	TokenNameStringLiteral
,	TokenNameCOMMA
c1	TokenNameIdentifier
,	TokenNameCOMMA
c2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE