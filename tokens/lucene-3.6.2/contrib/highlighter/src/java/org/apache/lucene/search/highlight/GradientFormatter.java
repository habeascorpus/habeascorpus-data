package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
highlight	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
GradientFormatter	TokenNameIdentifier
implements	TokenNameimplements
Formatter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
float	TokenNamefloat
maxScore	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
fgRMin	TokenNameIdentifier
,	TokenNameCOMMA
fgGMin	TokenNameIdentifier
,	TokenNameCOMMA
fgBMin	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
fgRMax	TokenNameIdentifier
,	TokenNameCOMMA
fgGMax	TokenNameIdentifier
,	TokenNameCOMMA
fgBMax	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
highlightForeground	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
bgRMin	TokenNameIdentifier
,	TokenNameCOMMA
bgGMin	TokenNameIdentifier
,	TokenNameCOMMA
bgBMin	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
bgRMax	TokenNameIdentifier
,	TokenNameCOMMA
bgGMax	TokenNameIdentifier
,	TokenNameCOMMA
bgBMax	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
highlightBackground	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
GradientFormatter	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
maxScore	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
minForegroundColor	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
maxForegroundColor	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
minBackgroundColor	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
maxBackgroundColor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
highlightForeground	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
minForegroundColor	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
maxForegroundColor	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
highlightForeground	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
minForegroundColor	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"minForegroundColor is not 7 bytes long eg a hex "	TokenNameStringLiteral
+	TokenNamePLUS
"RGB value such as #FFFFFF"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
maxForegroundColor	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"minForegroundColor is not 7 bytes long eg a hex "	TokenNameStringLiteral
+	TokenNamePLUS
"RGB value such as #FFFFFF"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fgRMin	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
minForegroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fgGMin	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
minForegroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fgBMin	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
minForegroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fgRMax	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
maxForegroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fgGMax	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
maxForegroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fgBMax	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
maxForegroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
highlightBackground	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
minBackgroundColor	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
maxBackgroundColor	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
highlightBackground	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
minBackgroundColor	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"minBackgroundColor is not 7 bytes long eg a hex "	TokenNameStringLiteral
+	TokenNamePLUS
"RGB value such as #FFFFFF"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
maxBackgroundColor	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"minBackgroundColor is not 7 bytes long eg a hex "	TokenNameStringLiteral
+	TokenNamePLUS
"RGB value such as #FFFFFF"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
bgRMin	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
minBackgroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bgGMin	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
minBackgroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bgBMin	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
minBackgroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bgRMax	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
maxBackgroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bgGMax	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
maxBackgroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bgBMax	TokenNameIdentifier
=	TokenNameEQUAL
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
maxBackgroundColor	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
maxScore	TokenNameIdentifier
=	TokenNameEQUAL
maxScore	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
highlightTerm	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
originalText	TokenNameIdentifier
,	TokenNameCOMMA
TokenGroup	TokenNameIdentifier
tokenGroup	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tokenGroup	TokenNameIdentifier
.	TokenNameDOT
getTotalScore	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
originalText	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
score	TokenNameIdentifier
=	TokenNameEQUAL
tokenGroup	TokenNameIdentifier
.	TokenNameDOT
getTotalScore	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
score	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
originalText	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"<font "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
highlightForeground	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"color=""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getForegroundColorString	TokenNameIdentifier
(	TokenNameLPAREN
score	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
highlightBackground	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"bgcolor=""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getBackgroundColorString	TokenNameIdentifier
(	TokenNameLPAREN
score	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
">"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
originalText	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"</font>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
getForegroundColorString	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
score	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
rVal	TokenNameIdentifier
=	TokenNameEQUAL
getColorVal	TokenNameIdentifier
(	TokenNameLPAREN
fgRMin	TokenNameIdentifier
,	TokenNameCOMMA
fgRMax	TokenNameIdentifier
,	TokenNameCOMMA
score	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
gVal	TokenNameIdentifier
=	TokenNameEQUAL
getColorVal	TokenNameIdentifier
(	TokenNameLPAREN
fgGMin	TokenNameIdentifier
,	TokenNameCOMMA
fgGMax	TokenNameIdentifier
,	TokenNameCOMMA
score	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
bVal	TokenNameIdentifier
=	TokenNameEQUAL
getColorVal	TokenNameIdentifier
(	TokenNameLPAREN
fgBMin	TokenNameIdentifier
,	TokenNameCOMMA
fgBMax	TokenNameIdentifier
,	TokenNameCOMMA
score	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"#"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
intToHex	TokenNameIdentifier
(	TokenNameLPAREN
rVal	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
intToHex	TokenNameIdentifier
(	TokenNameLPAREN
gVal	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
intToHex	TokenNameIdentifier
(	TokenNameLPAREN
bVal	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
getBackgroundColorString	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
score	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
rVal	TokenNameIdentifier
=	TokenNameEQUAL
getColorVal	TokenNameIdentifier
(	TokenNameLPAREN
bgRMin	TokenNameIdentifier
,	TokenNameCOMMA
bgRMax	TokenNameIdentifier
,	TokenNameCOMMA
score	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
gVal	TokenNameIdentifier
=	TokenNameEQUAL
getColorVal	TokenNameIdentifier
(	TokenNameLPAREN
bgGMin	TokenNameIdentifier
,	TokenNameCOMMA
bgGMax	TokenNameIdentifier
,	TokenNameCOMMA
score	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
bVal	TokenNameIdentifier
=	TokenNameEQUAL
getColorVal	TokenNameIdentifier
(	TokenNameLPAREN
bgBMin	TokenNameIdentifier
,	TokenNameCOMMA
bgBMax	TokenNameIdentifier
,	TokenNameCOMMA
score	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"#"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
intToHex	TokenNameIdentifier
(	TokenNameLPAREN
rVal	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
intToHex	TokenNameIdentifier
(	TokenNameLPAREN
gVal	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
intToHex	TokenNameIdentifier
(	TokenNameLPAREN
bVal	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
getColorVal	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
colorMin	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
colorMax	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
score	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
colorMin	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
colorMax	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
colorMin	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
float	TokenNamefloat
scale	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
abs	TokenNameIdentifier
(	TokenNameLPAREN
colorMin	TokenNameIdentifier
-	TokenNameMINUS
colorMax	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
relScorePercent	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
maxScore	TokenNameIdentifier
,	TokenNameCOMMA
score	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
maxScore	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
colScore	TokenNameIdentifier
=	TokenNameEQUAL
scale	TokenNameIdentifier
*	TokenNameMULTIPLY
relScorePercent	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
colorMin	TokenNameIdentifier
,	TokenNameCOMMA
colorMax	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
colScore	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
char	TokenNamechar
hexDigits	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
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
'A'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'B'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'C'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'D'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'E'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'F'	TokenNameCharacterLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
intToHex	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
""	TokenNameStringLiteral
+	TokenNamePLUS
hexDigits	TokenNameIdentifier
[	TokenNameLBRACKET
(	TokenNameLPAREN
i	TokenNameIdentifier
&	TokenNameAND
0xF0	TokenNameIntegerLiteral
)	TokenNameRPAREN
>>	TokenNameRIGHT_SHIFT
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
+	TokenNamePLUS
hexDigits	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
&	TokenNameAND
0x0F	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
hexToInt	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
hex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
hex	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
l	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
len	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
l	TokenNameIdentifier
<<=	TokenNameLEFT_SHIFT_EQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
c	TokenNameIdentifier
=	TokenNameEQUAL
Character	TokenNameIdentifier
.	TokenNameDOT
digit	TokenNameIdentifier
(	TokenNameLPAREN
hex	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NumberFormatException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
l	TokenNameIdentifier
|=	TokenNameOR_EQUAL
c	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
l	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE