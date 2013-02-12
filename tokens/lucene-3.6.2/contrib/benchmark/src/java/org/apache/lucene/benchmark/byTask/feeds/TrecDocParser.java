package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
feeds	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
TrecDocParser	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
enum	TokenNameenum
ParsePathType	TokenNameIdentifier
{	TokenNameLBRACE
GOV2	TokenNameIdentifier
,	TokenNameCOMMA
FBIS	TokenNameIdentifier
,	TokenNameCOMMA
FT	TokenNameIdentifier
,	TokenNameCOMMA
FR94	TokenNameIdentifier
,	TokenNameCOMMA
LATIMES	TokenNameIdentifier
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
ParsePathType	TokenNameIdentifier
DEFAULT_PATH_TYPE	TokenNameIdentifier
=	TokenNameEQUAL
ParsePathType	TokenNameIdentifier
.	TokenNameDOT
GOV2	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
Map	TokenNameIdentifier
<	TokenNameLESS
ParsePathType	TokenNameIdentifier
,	TokenNameCOMMA
TrecDocParser	TokenNameIdentifier
>	TokenNameGREATER
pathType2parser	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
ParsePathType	TokenNameIdentifier
,	TokenNameCOMMA
TrecDocParser	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
pathType2parser	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ParsePathType	TokenNameIdentifier
.	TokenNameDOT
GOV2	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
TrecGov2Parser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pathType2parser	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ParsePathType	TokenNameIdentifier
.	TokenNameDOT
FBIS	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
TrecFBISParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pathType2parser	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ParsePathType	TokenNameIdentifier
.	TokenNameDOT
FR94	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
TrecFR94Parser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pathType2parser	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ParsePathType	TokenNameIdentifier
.	TokenNameDOT
FT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
TrecFTParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pathType2parser	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ParsePathType	TokenNameIdentifier
.	TokenNameDOT
LATIMES	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
TrecLATimesParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
final	TokenNamefinal
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
ParsePathType	TokenNameIdentifier
>	TokenNameGREATER
pathName2Type	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
ParsePathType	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
ParsePathType	TokenNameIdentifier
ppt	TokenNameIdentifier
:	TokenNameCOLON
ParsePathType	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
pathName2Type	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ppt	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toUpperCase	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
.	TokenNameDOT
ENGLISH	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
ppt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
MAX_PATH_LENGTH	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
ParsePathType	TokenNameIdentifier
pathType	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
f	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
pathLength	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
f	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
++	TokenNamePLUS_PLUS
pathLength	TokenNameIdentifier
<	TokenNameLESS
MAX_PATH_LENGTH	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ParsePathType	TokenNameIdentifier
ppt	TokenNameIdentifier
=	TokenNameEQUAL
pathName2Type	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toUpperCase	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
.	TokenNameDOT
ENGLISH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ppt	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ppt	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
f	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
.	TokenNameDOT
getParentFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
DEFAULT_PATH_TYPE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
DocData	TokenNameIdentifier
parse	TokenNameIdentifier
(	TokenNameLPAREN
DocData	TokenNameIdentifier
docData	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
TrecContentSource	TokenNameIdentifier
trecSrc	TokenNameIdentifier
,	TokenNameCOMMA
StringBuilder	TokenNameIdentifier
docBuf	TokenNameIdentifier
,	TokenNameCOMMA
ParsePathType	TokenNameIdentifier
pathType	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
InterruptedException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
stripTags	TokenNameIdentifier
(	TokenNameLPAREN
StringBuilder	TokenNameIdentifier
buf	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
stripTags	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
stripTags	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
buf	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
start	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
buf	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
buf	TokenNameIdentifier
.	TokenNameDOT
replaceAll	TokenNameIdentifier
(	TokenNameLPAREN
"<[^>]*>"	TokenNameStringLiteral
,	TokenNameCOMMA
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
extract	TokenNameIdentifier
(	TokenNameLPAREN
StringBuilder	TokenNameIdentifier
buf	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
startTag	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
endTag	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxPos	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
noisePrefixes	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
k1	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
startTag	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
k1	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
(	TokenNameLPAREN
maxPos	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
k1	TokenNameIdentifier
<	TokenNameLESS
maxPos	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
k1	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
startTag	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
k2	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
endTag	TokenNameIdentifier
,	TokenNameCOMMA
k1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
k2	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
(	TokenNameLPAREN
maxPos	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
k2	TokenNameIdentifier
<	TokenNameLESS
maxPos	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
noisePrefixes	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
noise	TokenNameIdentifier
:	TokenNameCOLON
noisePrefixes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
k1a	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
noise	TokenNameIdentifier
,	TokenNameCOMMA
k1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
k1a	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
k1a	TokenNameIdentifier
<	TokenNameLESS
k2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
k1	TokenNameIdentifier
=	TokenNameEQUAL
k1a	TokenNameIdentifier
+	TokenNamePLUS
noise	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
buf	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
k1	TokenNameIdentifier
,	TokenNameCOMMA
k2	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
