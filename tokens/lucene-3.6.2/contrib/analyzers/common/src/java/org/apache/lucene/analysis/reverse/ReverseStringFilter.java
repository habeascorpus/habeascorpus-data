package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
reverse	TokenNameIdentifier
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
TokenFilter	TokenNameIdentifier
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
TokenStream	TokenNameIdentifier
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
tokenattributes	TokenNameIdentifier
.	TokenNameDOT
CharTermAttribute	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Version	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
ReverseStringFilter	TokenNameIdentifier
extends	TokenNameextends
TokenFilter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
CharTermAttribute	TokenNameIdentifier
termAtt	TokenNameIdentifier
=	TokenNameEQUAL
addAttribute	TokenNameIdentifier
(	TokenNameLPAREN
CharTermAttribute	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
char	TokenNamechar
marker	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
NOMARKER	TokenNameIdentifier
=	TokenNameEQUAL
'￿'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
START_OF_HEADING_MARKER	TokenNameIdentifier
=	TokenNameEQUAL
''	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
INFORMATION_SEPARATOR_MARKER	TokenNameIdentifier
=	TokenNameEQUAL
''	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
PUA_EC00_MARKER	TokenNameIdentifier
=	TokenNameEQUAL
''	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
RTL_DIRECTION_MARKER	TokenNameIdentifier
=	TokenNameEQUAL
'‏'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
ReverseStringFilter	TokenNameIdentifier
(	TokenNameLPAREN
TokenStream	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
NOMARKER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
ReverseStringFilter	TokenNameIdentifier
(	TokenNameLPAREN
TokenStream	TokenNameIdentifier
in	TokenNameIdentifier
,	TokenNameCOMMA
char	TokenNamechar
marker	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
Version	TokenNameIdentifier
.	TokenNameDOT
LUCENE_30	TokenNameIdentifier
,	TokenNameCOMMA
in	TokenNameIdentifier
,	TokenNameCOMMA
marker	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ReverseStringFilter	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
TokenStream	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
in	TokenNameIdentifier
,	TokenNameCOMMA
NOMARKER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ReverseStringFilter	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
TokenStream	TokenNameIdentifier
in	TokenNameIdentifier
,	TokenNameCOMMA
char	TokenNamechar
marker	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
matchVersion	TokenNameIdentifier
=	TokenNameEQUAL
matchVersion	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
marker	TokenNameIdentifier
=	TokenNameEQUAL
marker	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
input	TokenNameIdentifier
.	TokenNameDOT
incrementToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
termAtt	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
marker	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
NOMARKER	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
len	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
resizeBuffer	TokenNameIdentifier
(	TokenNameLPAREN
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
[	TokenNameLBRACKET
len	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
marker	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
reverse	TokenNameIdentifier
(	TokenNameLPAREN
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
termAtt	TokenNameIdentifier
.	TokenNameDOT
buffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
termAtt	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
reverse	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
input	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
reverse	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
.	TokenNameDOT
LUCENE_30	TokenNameIdentifier
,	TokenNameCOMMA
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
reverse	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
input	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
charInput	TokenNameIdentifier
=	TokenNameEQUAL
input	TokenNameIdentifier
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reverse	TokenNameIdentifier
(	TokenNameLPAREN
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
charInput	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
charInput	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
charInput	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
reverse	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reverse	TokenNameIdentifier
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
static	TokenNamestatic
void	TokenNamevoid
reverse	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reverse	TokenNameIdentifier
(	TokenNameLPAREN
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
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
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
reverse	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reverse	TokenNameIdentifier
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
void	TokenNamevoid
reverse	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reverse	TokenNameIdentifier
(	TokenNameLPAREN
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
buffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
reverse	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
reverseUnicode3	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Deprecated	TokenNameIdentifier
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
reverseUnicode3	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
int	TokenNameint
num	TokenNameIdentifier
=	TokenNameEQUAL
len	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
start	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
(	TokenNameLPAREN
start	TokenNameIdentifier
+	TokenNamePLUS
num	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
char	TokenNamechar
c	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
start	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
+	TokenNamePLUS
len	TokenNameIdentifier
-	TokenNameMINUS
i	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
start	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
+	TokenNamePLUS
len	TokenNameIdentifier
-	TokenNameMINUS
i	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
c	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
reverse	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
matchVersion	TokenNameIdentifier
.	TokenNameDOT
onOrAfter	TokenNameIdentifier
(	TokenNameLPAREN
Version	TokenNameIdentifier
.	TokenNameDOT
LUCENE_31	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
reverseUnicode3	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
<	TokenNameLESS
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
int	TokenNameint
end	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
start	TokenNameIdentifier
+	TokenNamePLUS
len	TokenNameIdentifier
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
char	TokenNamechar
frontHigh	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
start	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
char	TokenNamechar
endLow	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
end	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
boolean	TokenNameboolean
allowFrontSur	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
,	TokenNameCOMMA
allowEndSur	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
mid	TokenNameIdentifier
=	TokenNameEQUAL
start	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
len	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
start	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
mid	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
,	TokenNameCOMMA
--	TokenNameMINUS_MINUS
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
char	TokenNamechar
frontLow	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
final	TokenNamefinal
char	TokenNamechar
endHigh	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
end	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
final	TokenNamefinal
boolean	TokenNameboolean
surAtFront	TokenNameIdentifier
=	TokenNameEQUAL
allowFrontSur	TokenNameIdentifier
&&	TokenNameAND_AND
Character	TokenNameIdentifier
.	TokenNameDOT
isSurrogatePair	TokenNameIdentifier
(	TokenNameLPAREN
frontHigh	TokenNameIdentifier
,	TokenNameCOMMA
frontLow	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
surAtFront	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
len	TokenNameIdentifier
<	TokenNameLESS
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
boolean	TokenNameboolean
surAtEnd	TokenNameIdentifier
=	TokenNameEQUAL
allowEndSur	TokenNameIdentifier
&&	TokenNameAND_AND
Character	TokenNameIdentifier
.	TokenNameDOT
isSurrogatePair	TokenNameIdentifier
(	TokenNameLPAREN
endHigh	TokenNameIdentifier
,	TokenNameCOMMA
endLow	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
allowFrontSur	TokenNameIdentifier
=	TokenNameEQUAL
allowEndSur	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
surAtFront	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
surAtEnd	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
surAtFront	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
end	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
frontLow	TokenNameIdentifier
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
--	TokenNameMINUS_MINUS
end	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
frontHigh	TokenNameIdentifier
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
endHigh	TokenNameIdentifier
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
endLow	TokenNameIdentifier
;	TokenNameSEMICOLON
frontHigh	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
endLow	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
end	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
end	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
frontHigh	TokenNameIdentifier
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
endLow	TokenNameIdentifier
;	TokenNameSEMICOLON
frontHigh	TokenNameIdentifier
=	TokenNameEQUAL
frontLow	TokenNameIdentifier
;	TokenNameSEMICOLON
endLow	TokenNameIdentifier
=	TokenNameEQUAL
endHigh	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
surAtFront	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
end	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
frontLow	TokenNameIdentifier
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
endLow	TokenNameIdentifier
;	TokenNameSEMICOLON
endLow	TokenNameIdentifier
=	TokenNameEQUAL
endHigh	TokenNameIdentifier
;	TokenNameSEMICOLON
allowFrontSur	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
end	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
frontHigh	TokenNameIdentifier
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
endHigh	TokenNameIdentifier
;	TokenNameSEMICOLON
frontHigh	TokenNameIdentifier
=	TokenNameEQUAL
frontLow	TokenNameIdentifier
;	TokenNameSEMICOLON
allowEndSur	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
len	TokenNameIdentifier
&	TokenNameAND
0x01	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
&&	TokenNameAND_AND
!	TokenNameNOT
(	TokenNameLPAREN
allowFrontSur	TokenNameIdentifier
&&	TokenNameAND_AND
allowEndSur	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
end	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
allowFrontSur	TokenNameIdentifier
?	TokenNameQUESTION
endLow	TokenNameIdentifier
:	TokenNameCOLON
frontHigh	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE