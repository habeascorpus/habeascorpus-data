package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
collections	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
FloatToObjectMap	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
implements	TokenNameimplements
Iterable	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
class	TokenNameclass
IndexIterator	TokenNameIdentifier
implements	TokenNameimplements
IntIterator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
baseHashIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
lastIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
IndexIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
baseHashIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
baseHashIndex	TokenNameIdentifier
<	TokenNameLESS
baseHash	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
baseHashIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
index	TokenNameIdentifier
=	TokenNameEQUAL
baseHash	TokenNameIdentifier
[	TokenNameLBRACKET
baseHashIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
index	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
lastIndex	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
;	TokenNameSEMICOLON
index	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
index	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
++	TokenNamePLUS_PLUS
baseHashIndex	TokenNameIdentifier
<	TokenNameLESS
baseHash	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
index	TokenNameIdentifier
=	TokenNameEQUAL
baseHash	TokenNameIdentifier
[	TokenNameLBRACKET
baseHashIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
lastIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
FloatToObjectMap	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
keys	TokenNameIdentifier
[	TokenNameLBRACKET
lastIndex	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
class	TokenNameclass
KeyIterator	TokenNameIdentifier
implements	TokenNameimplements
FloatIterator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
IntIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
KeyIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
keys	TokenNameIdentifier
[	TokenNameLBRACKET
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
iterator	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
class	TokenNameclass
ValueIterator	TokenNameIdentifier
implements	TokenNameimplements
Iterator	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
private	TokenNameprivate
IntIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ValueIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
iterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
T	TokenNameIdentifier
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
T	TokenNameIdentifier
)	TokenNameRPAREN
values	TokenNameIdentifier
[	TokenNameLBRACKET
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
iterator	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
defaultCapacity	TokenNameIdentifier
=	TokenNameEQUAL
16	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
baseHash	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
capacity	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
firstEmpty	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
hashFactor	TokenNameIdentifier
;	TokenNameSEMICOLON
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
keys	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
next	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
prev	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
size	TokenNameIdentifier
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
values	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FloatToObjectMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
defaultCapacity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FloatToObjectMap	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
capacity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
=	TokenNameEQUAL
16	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
<	TokenNameLESS
capacity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
<<=	TokenNameLEFT_SHIFT_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
arrayLength	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
values	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
arrayLength	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
keys	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
arrayLength	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
arrayLength	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
baseHashSize	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
baseHash	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
baseHashSize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
hashFactor	TokenNameIdentifier
=	TokenNameEQUAL
baseHashSize	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
size	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
prvt_put	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
key	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
hashIndex	TokenNameIdentifier
=	TokenNameEQUAL
calcBaseHashIndex	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
objectIndex	TokenNameIdentifier
=	TokenNameEQUAL
firstEmpty	TokenNameIdentifier
;	TokenNameSEMICOLON
firstEmpty	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
[	TokenNameLBRACKET
firstEmpty	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
values	TokenNameIdentifier
[	TokenNameLBRACKET
objectIndex	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
keys	TokenNameIdentifier
[	TokenNameLBRACKET
objectIndex	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
key	TokenNameIdentifier
;	TokenNameSEMICOLON
next	TokenNameIdentifier
[	TokenNameLBRACKET
objectIndex	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
baseHash	TokenNameIdentifier
[	TokenNameLBRACKET
hashIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
baseHash	TokenNameIdentifier
[	TokenNameLBRACKET
hashIndex	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
objectIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
calcBaseHashIndex	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Float	TokenNameIdentifier
.	TokenNameDOT
floatToIntBits	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
hashFactor	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Arrays	TokenNameIdentifier
.	TokenNameDOT
fill	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
baseHash	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
firstEmpty	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
next	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
next	TokenNameIdentifier
[	TokenNameLBRACKET
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
find	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
containsValue	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
T	TokenNameIdentifier
object	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
object	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
find	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
baseHashIndex	TokenNameIdentifier
=	TokenNameEQUAL
calcBaseHashIndex	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
localIndex	TokenNameIdentifier
=	TokenNameEQUAL
baseHash	TokenNameIdentifier
[	TokenNameLBRACKET
baseHashIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
localIndex	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
keys	TokenNameIdentifier
[	TokenNameLBRACKET
localIndex	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
localIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
localIndex	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
[	TokenNameLBRACKET
localIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
findForRemove	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
key	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
baseHashIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
prev	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
baseHash	TokenNameIdentifier
[	TokenNameLBRACKET
baseHashIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
index	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
keys	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
index	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
prev	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
;	TokenNameSEMICOLON
index	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
prev	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
T	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
T	TokenNameIdentifier
)	TokenNameRPAREN
values	TokenNameIdentifier
[	TokenNameLBRACKET
find	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
protected	TokenNameprotected
void	TokenNamevoid
grow	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
FloatToObjectMap	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
that	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FloatToObjectMap	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
IndexIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IndexIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
that	TokenNameIdentifier
.	TokenNameDOT
prvt_put	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
keys	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
(	TokenNameLPAREN
T	TokenNameIdentifier
)	TokenNameRPAREN
this	TokenNamethis
.	TokenNameDOT
values	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
=	TokenNameEQUAL
that	TokenNameIdentifier
.	TokenNameDOT
capacity	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
size	TokenNameIdentifier
=	TokenNameEQUAL
that	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
firstEmpty	TokenNameIdentifier
=	TokenNameEQUAL
that	TokenNameIdentifier
.	TokenNameDOT
firstEmpty	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
values	TokenNameIdentifier
=	TokenNameEQUAL
that	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
keys	TokenNameIdentifier
=	TokenNameEQUAL
that	TokenNameIdentifier
.	TokenNameDOT
keys	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
that	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
baseHash	TokenNameIdentifier
=	TokenNameEQUAL
that	TokenNameIdentifier
.	TokenNameDOT
baseHash	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
hashFactor	TokenNameIdentifier
=	TokenNameEQUAL
that	TokenNameIdentifier
.	TokenNameDOT
hashFactor	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
size	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Iterator	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ValueIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FloatIterator	TokenNameIdentifier
keyIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
KeyIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unused"	TokenNameStringLiteral
)	TokenNameRPAREN
private	TokenNameprivate
void	TokenNamevoid
printBaseHash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
this	TokenNamethis
.	TokenNameDOT
baseHash	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
". "	TokenNameStringLiteral
+	TokenNamePLUS
baseHash	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
T	TokenNameIdentifier
put	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
key	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
find	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
T	TokenNameIdentifier
old	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
T	TokenNameIdentifier
)	TokenNameRPAREN
values	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
values	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
old	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
size	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
capacity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
grow	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
prvt_put	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
T	TokenNameIdentifier
remove	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
baseHashIndex	TokenNameIdentifier
=	TokenNameEQUAL
calcBaseHashIndex	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
findForRemove	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
baseHashIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
prev	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
baseHash	TokenNameIdentifier
[	TokenNameLBRACKET
baseHashIndex	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
next	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
next	TokenNameIdentifier
[	TokenNameLBRACKET
prev	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
next	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
next	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
firstEmpty	TokenNameIdentifier
;	TokenNameSEMICOLON
firstEmpty	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
;	TokenNameSEMICOLON
--	TokenNameMINUS_MINUS
size	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
T	TokenNameIdentifier
)	TokenNameRPAREN
values	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
toArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
array	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
array	TokenNameIdentifier
[	TokenNameLBRACKET
++	TokenNamePLUS_PLUS
j	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
array	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
T	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
toArray	TokenNameIdentifier
(	TokenNameLPAREN
T	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
a	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
=	TokenNameEQUAL
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
a	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
&&	TokenNameAND_AND
iterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
j	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
a	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
j	TokenNameIdentifier
<	TokenNameLESS
a	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
a	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
a	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'{'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FloatIterator	TokenNameIdentifier
keyIterator	TokenNameIdentifier
=	TokenNameEQUAL
keyIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
keyIterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
key	TokenNameIdentifier
=	TokenNameEQUAL
keyIterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'='	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
keyIterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
','	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
' '	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
'}'	TokenNameCharacterLiteral
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
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
^	TokenNameXOR
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FloatToObjectMap	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
that	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FloatToObjectMap	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
)	TokenNameRPAREN
o	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
that	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
this	TokenNamethis
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
FloatIterator	TokenNameIdentifier
it	TokenNameIdentifier
=	TokenNameEQUAL
keyIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
key	TokenNameIdentifier
=	TokenNameEQUAL
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
that	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
T	TokenNameIdentifier
v1	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
T	TokenNameIdentifier
v2	TokenNameIdentifier
=	TokenNameEQUAL
that	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
v1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
v2	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
v1	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
v2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
!	TokenNameNOT
v1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
v2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
