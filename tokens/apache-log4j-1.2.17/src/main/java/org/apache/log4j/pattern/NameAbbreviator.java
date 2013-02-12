package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
NameAbbreviator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
NameAbbreviator	TokenNameIdentifier
DEFAULT	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NOPAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
NameAbbreviator	TokenNameIdentifier
getAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
pattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
pattern	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
trimmed	TokenNameIdentifier
=	TokenNameEQUAL
pattern	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
trimmed	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
DEFAULT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
trimmed	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
trimmed	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'-'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
trimmed	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
trimmed	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
trimmed	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
'9'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
trimmed	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
elements	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
trimmed	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
elements	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
MaxElementAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
elements	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
DropElementAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
elements	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
ArrayList	TokenNameIdentifier
fragments	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
char	TokenNamechar
ellipsis	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
charCount	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
pos	TokenNameIdentifier
<	TokenNameLESS
trimmed	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
pos	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
ellipsisPos	TokenNameIdentifier
=	TokenNameEQUAL
pos	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
trimmed	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
'*'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
charCount	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
ellipsisPos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
trimmed	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
'0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
trimmed	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
'9'	TokenNameCharacterLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
charCount	TokenNameIdentifier
=	TokenNameEQUAL
trimmed	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
)	TokenNameRPAREN
-	TokenNameMINUS
'0'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
ellipsisPos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
charCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
ellipsis	TokenNameIdentifier
=	TokenNameEQUAL
'\0'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ellipsisPos	TokenNameIdentifier
<	TokenNameLESS
trimmed	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ellipsis	TokenNameIdentifier
=	TokenNameEQUAL
trimmed	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
ellipsisPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ellipsis	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
ellipsis	TokenNameIdentifier
=	TokenNameEQUAL
'\0'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
fragments	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PatternAbbreviatorFragment	TokenNameIdentifier
(	TokenNameLPAREN
charCount	TokenNameIdentifier
,	TokenNameCOMMA
ellipsis	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pos	TokenNameIdentifier
=	TokenNameEQUAL
trimmed	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
,	TokenNameCOMMA
pos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
pos	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
pos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
PatternAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
fragments	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
DEFAULT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NameAbbreviator	TokenNameIdentifier
getDefaultAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
DEFAULT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
void	TokenNamevoid
abbreviate	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
nameStart	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
NOPAbbreviator	TokenNameIdentifier
extends	TokenNameextends
NameAbbreviator	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
NOPAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
abbreviate	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
nameStart	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
MaxElementAbbreviator	TokenNameIdentifier
extends	TokenNameextends
NameAbbreviator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
count	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
MaxElementAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
count	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
count	TokenNameIdentifier
=	TokenNameEQUAL
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
abbreviate	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
nameStart	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
end	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
bufString	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
count	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
end	TokenNameIdentifier
=	TokenNameEQUAL
bufString	TokenNameIdentifier
.	TokenNameDOT
lastIndexOf	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
,	TokenNameCOMMA
end	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
end	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
end	TokenNameIdentifier
<	TokenNameLESS
nameStart	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
buf	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
nameStart	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
DropElementAbbreviator	TokenNameIdentifier
extends	TokenNameextends
NameAbbreviator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
count	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DropElementAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
count	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
count	TokenNameIdentifier
=	TokenNameEQUAL
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
abbreviate	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
nameStart	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
count	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
,	TokenNameCOMMA
nameStart	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pos	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
pos	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
,	TokenNameCOMMA
pos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
--	TokenNameMINUS_MINUS
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
buf	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
nameStart	TokenNameIdentifier
,	TokenNameCOMMA
pos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
PatternAbbreviatorFragment	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
charCount	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
char	TokenNamechar
ellipsis	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
PatternAbbreviatorFragment	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
charCount	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
char	TokenNamechar
ellipsis	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
charCount	TokenNameIdentifier
=	TokenNameEQUAL
charCount	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
ellipsis	TokenNameIdentifier
=	TokenNameEQUAL
ellipsis	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
abbreviate	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
int	TokenNameint
startPos	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
nextDot	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
,	TokenNameCOMMA
startPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextDot	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
nextDot	TokenNameIdentifier
-	TokenNameMINUS
startPos	TokenNameIdentifier
)	TokenNameRPAREN
>	TokenNameGREATER
charCount	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
buf	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
startPos	TokenNameIdentifier
+	TokenNamePLUS
charCount	TokenNameIdentifier
,	TokenNameCOMMA
nextDot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nextDot	TokenNameIdentifier
=	TokenNameEQUAL
startPos	TokenNameIdentifier
+	TokenNamePLUS
charCount	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ellipsis	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
'\0'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
buf	TokenNameIdentifier
.	TokenNameDOT
insert	TokenNameIdentifier
(	TokenNameLPAREN
nextDot	TokenNameIdentifier
,	TokenNameCOMMA
ellipsis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nextDot	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
nextDot	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
nextDot	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
PatternAbbreviator	TokenNameIdentifier
extends	TokenNameextends
NameAbbreviator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
PatternAbbreviatorFragment	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fragments	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
PatternAbbreviator	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
fragments	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fragments	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"fragments must have at least one element"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
fragments	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PatternAbbreviatorFragment	TokenNameIdentifier
[	TokenNameLBRACKET
fragments	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
fragments	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
fragments	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
abbreviate	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
nameStart	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
nameStart	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
(	TokenNameLPAREN
fragments	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
pos	TokenNameIdentifier
<	TokenNameLESS
buf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
pos	TokenNameIdentifier
=	TokenNameEQUAL
fragments	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
abbreviate	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
pos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
PatternAbbreviatorFragment	TokenNameIdentifier
terminalFragment	TokenNameIdentifier
=	TokenNameEQUAL
fragments	TokenNameIdentifier
[	TokenNameLBRACKET
fragments	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
pos	TokenNameIdentifier
<	TokenNameLESS
buf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
pos	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
pos	TokenNameIdentifier
=	TokenNameEQUAL
terminalFragment	TokenNameIdentifier
.	TokenNameDOT
abbreviate	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
pos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE