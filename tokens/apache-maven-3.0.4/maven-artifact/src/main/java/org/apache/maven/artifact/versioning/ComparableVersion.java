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
math	TokenNameIdentifier
.	TokenNameDOT
BigInteger	TokenNameIdentifier
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
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ListIterator	TokenNameIdentifier
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
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Stack	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ComparableVersion	TokenNameIdentifier
implements	TokenNameimplements
Comparable	TokenNameIdentifier
<	TokenNameLESS
ComparableVersion	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
value	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
canonical	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
ListItem	TokenNameIdentifier
items	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
interface	TokenNameinterface
Item	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
INTEGER_ITEM	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
STRING_ITEM	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
LIST_ITEM	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
Item	TokenNameIdentifier
item	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
IntegerItem	TokenNameIdentifier
implements	TokenNameimplements
Item	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
BigInteger	TokenNameIdentifier
BigInteger_ZERO	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BigInteger	TokenNameIdentifier
(	TokenNameLPAREN
"0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
BigInteger	TokenNameIdentifier
value	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
IntegerItem	TokenNameIdentifier
ZERO	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IntegerItem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
IntegerItem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
BigInteger_ZERO	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IntegerItem	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BigInteger	TokenNameIdentifier
(	TokenNameLPAREN
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
INTEGER_ITEM	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
BigInteger_ZERO	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
Item	TokenNameIdentifier
item	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
item	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
BigInteger_ZERO	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
item	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
INTEGER_ITEM	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
value	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
IntegerItem	TokenNameIdentifier
)	TokenNameRPAREN
item	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
STRING_ITEM	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
LIST_ITEM	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"invalid item: "	TokenNameStringLiteral
+	TokenNamePLUS
item	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
value	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
StringItem	TokenNameIdentifier
implements	TokenNameimplements
Item	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
QUALIFIERS	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"alpha"	TokenNameStringLiteral
,	TokenNameCOMMA
"beta"	TokenNameStringLiteral
,	TokenNameCOMMA
"milestone"	TokenNameStringLiteral
,	TokenNameCOMMA
"rc"	TokenNameStringLiteral
,	TokenNameCOMMA
"snapshot"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
,	TokenNameCOMMA
"sp"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
_QUALIFIERS	TokenNameIdentifier
=	TokenNameEQUAL
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
QUALIFIERS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Properties	TokenNameIdentifier
ALIASES	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
ALIASES	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"ga"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ALIASES	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"final"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ALIASES	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"cr"	TokenNameStringLiteral
,	TokenNameCOMMA
"rc"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
RELEASE_VERSION_INDEX	TokenNameIdentifier
=	TokenNameEQUAL
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
_QUALIFIERS	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
value	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
StringItem	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
followedByDigit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
followedByDigit	TokenNameIdentifier
&&	TokenNameAND_AND
value	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
'a'	TokenNameCharacterLiteral
:	TokenNameCOLON
value	TokenNameIdentifier
=	TokenNameEQUAL
"alpha"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
'b'	TokenNameCharacterLiteral
:	TokenNameCOLON
value	TokenNameIdentifier
=	TokenNameEQUAL
"beta"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
'm'	TokenNameCharacterLiteral
:	TokenNameCOLON
value	TokenNameIdentifier
=	TokenNameEQUAL
"milestone"	TokenNameStringLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
ALIASES	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
STRING_ITEM	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
comparableQualifier	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
RELEASE_VERSION_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
comparableQualifier	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
qualifier	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
_QUALIFIERS	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
qualifier	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
?	TokenNameQUESTION
(	TokenNameLPAREN
_QUALIFIERS	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"-"	TokenNameStringLiteral
+	TokenNamePLUS
qualifier	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
Item	TokenNameIdentifier
item	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
item	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
comparableQualifier	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
RELEASE_VERSION_INDEX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
item	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
INTEGER_ITEM	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
STRING_ITEM	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
comparableQualifier	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
comparableQualifier	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
StringItem	TokenNameIdentifier
)	TokenNameRPAREN
item	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
value	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
LIST_ITEM	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"invalid item: "	TokenNameStringLiteral
+	TokenNamePLUS
item	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
ListItem	TokenNameIdentifier
extends	TokenNameextends
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Item	TokenNameIdentifier
>	TokenNameGREATER
implements	TokenNameimplements
Item	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
LIST_ITEM	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
normalize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
ListIterator	TokenNameIdentifier
<	TokenNameLESS
Item	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
=	TokenNameEQUAL
listIterator	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iterator	TokenNameIdentifier
.	TokenNameDOT
hasPrevious	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
Item	TokenNameIdentifier
item	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
.	TokenNameDOT
previous	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
item	TokenNameIdentifier
.	TokenNameDOT
isNull	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
iterator	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
Item	TokenNameIdentifier
item	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
item	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Item	TokenNameIdentifier
first	TokenNameIdentifier
=	TokenNameEQUAL
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
first	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
item	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
INTEGER_ITEM	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
STRING_ITEM	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
case	TokenNamecase
LIST_ITEM	TokenNameIdentifier
:	TokenNameCOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
Item	TokenNameIdentifier
>	TokenNameGREATER
left	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
Item	TokenNameIdentifier
>	TokenNameGREATER
right	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
ListItem	TokenNameIdentifier
)	TokenNameRPAREN
item	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
left	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
right	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Item	TokenNameIdentifier
l	TokenNameIdentifier
=	TokenNameEQUAL
left	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
left	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
null	TokenNamenull
;	TokenNameSEMICOLON
Item	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
right	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
right	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
result	TokenNameIdentifier
=	TokenNameEQUAL
l	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
r	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
l	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
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
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"invalid item: "	TokenNameStringLiteral
+	TokenNamePLUS
item	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
"("	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
<	TokenNameLESS
Item	TokenNameIdentifier
>	TokenNameGREATER
iter	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
','	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
')'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
buffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ComparableVersion	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
parseVersion	TokenNameIdentifier
(	TokenNameLPAREN
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
parseVersion	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
version	TokenNameIdentifier
;	TokenNameSEMICOLON
items	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ListItem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
version	TokenNameIdentifier
=	TokenNameEQUAL
version	TokenNameIdentifier
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
.	TokenNameDOT
ENGLISH	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ListItem	TokenNameIdentifier
list	TokenNameIdentifier
=	TokenNameEQUAL
items	TokenNameIdentifier
;	TokenNameSEMICOLON
Stack	TokenNameIdentifier
<	TokenNameLESS
Item	TokenNameIdentifier
>	TokenNameGREATER
stack	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Stack	TokenNameIdentifier
<	TokenNameLESS
Item	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stack	TokenNameIdentifier
.	TokenNameDOT
push	TokenNameIdentifier
(	TokenNameLPAREN
list	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isDigit	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
int	TokenNameint
startIndex	TokenNameIdentifier
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
version	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
char	TokenNamechar
c	TokenNameIdentifier
=	TokenNameEQUAL
version	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
'.'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
startIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
IntegerItem	TokenNameIdentifier
.	TokenNameDOT
ZERO	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
parseItem	TokenNameIdentifier
(	TokenNameLPAREN
isDigit	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
startIndex	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
'-'	TokenNameCharacterLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
startIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
IntegerItem	TokenNameIdentifier
.	TokenNameDOT
ZERO	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
parseItem	TokenNameIdentifier
(	TokenNameLPAREN
isDigit	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
startIndex	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isDigit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
list	TokenNameIdentifier
.	TokenNameDOT
normalize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
<	TokenNameLESS
version	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
Character	TokenNameIdentifier
.	TokenNameDOT
isDigit	TokenNameIdentifier
(	TokenNameLPAREN
version	TokenNameIdentifier
.	TokenNameDOT
charAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
list	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ListItem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stack	TokenNameIdentifier
.	TokenNameDOT
push	TokenNameIdentifier
(	TokenNameLPAREN
list	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
Character	TokenNameIdentifier
.	TokenNameDOT
isDigit	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isDigit	TokenNameIdentifier
&&	TokenNameAND_AND
i	TokenNameIdentifier
>	TokenNameGREATER
startIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringItem	TokenNameIdentifier
(	TokenNameLPAREN
version	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
startIndex	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
isDigit	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isDigit	TokenNameIdentifier
&&	TokenNameAND_AND
i	TokenNameIdentifier
>	TokenNameGREATER
startIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
parseItem	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
version	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
startIndex	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
isDigit	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
version	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
startIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
parseItem	TokenNameIdentifier
(	TokenNameLPAREN
isDigit	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
!	TokenNameNOT
stack	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
list	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ListItem	TokenNameIdentifier
)	TokenNameRPAREN
stack	TokenNameIdentifier
.	TokenNameDOT
pop	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
list	TokenNameIdentifier
.	TokenNameDOT
normalize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
canonical	TokenNameIdentifier
=	TokenNameEQUAL
items	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
Item	TokenNameIdentifier
parseItem	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
isDigit	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
buf	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
isDigit	TokenNameIdentifier
?	TokenNameQUESTION
new	TokenNamenew
IntegerItem	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
new	TokenNamenew
StringItem	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
ComparableVersion	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
items	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
o	TokenNameIdentifier
.	TokenNameDOT
items	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
o	TokenNameIdentifier
instanceof	TokenNameinstanceof
ComparableVersion	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
canonical	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
ComparableVersion	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
canonical	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
canonical	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
