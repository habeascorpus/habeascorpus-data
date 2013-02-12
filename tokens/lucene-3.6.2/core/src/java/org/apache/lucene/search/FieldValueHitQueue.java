package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
PriorityQueue	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
FieldValueHitQueue	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
extends	TokenNameextends
FieldValueHitQueue	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
>	TokenNameGREATER
extends	TokenNameextends
PriorityQueue	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
Entry	TokenNameIdentifier
extends	TokenNameextends
ScoreDoc	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
slot	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Entry	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
slot	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
doc	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
score	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
doc	TokenNameIdentifier
,	TokenNameCOMMA
score	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
slot	TokenNameIdentifier
=	TokenNameEQUAL
slot	TokenNameIdentifier
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
return	TokenNamereturn
"slot:"	TokenNameStringLiteral
+	TokenNamePLUS
slot	TokenNameIdentifier
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
super	TokenNamesuper
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
OneComparatorFieldValueHitQueue	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
extends	TokenNameextends
FieldValueHitQueue	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
>	TokenNameGREATER
extends	TokenNameextends
FieldValueHitQueue	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
FieldComparator	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
comparator	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
oneReverseMul	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
OneComparatorFieldValueHitQueue	TokenNameIdentifier
(	TokenNameLPAREN
SortField	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
fields	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SortField	TokenNameIdentifier
field	TokenNameIdentifier
=	TokenNameEQUAL
fields	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
comparator	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
getComparator	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
oneReverseMul	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
reverse	TokenNameIdentifier
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
comparators	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
comparator	TokenNameIdentifier
;	TokenNameSEMICOLON
reverseMul	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
oneReverseMul	TokenNameIdentifier
;	TokenNameSEMICOLON
initialize	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
boolean	TokenNameboolean
lessThan	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Entry	TokenNameIdentifier
hitA	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Entry	TokenNameIdentifier
hitB	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
hitA	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
hitB	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
hitA	TokenNameIdentifier
.	TokenNameDOT
slot	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
hitB	TokenNameIdentifier
.	TokenNameDOT
slot	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
c	TokenNameIdentifier
=	TokenNameEQUAL
oneReverseMul	TokenNameIdentifier
*	TokenNameMULTIPLY
comparator	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
hitA	TokenNameIdentifier
.	TokenNameDOT
slot	TokenNameIdentifier
,	TokenNameCOMMA
hitB	TokenNameIdentifier
.	TokenNameDOT
slot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
c	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
hitA	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
>	TokenNameGREATER
hitB	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
MultiComparatorsFieldValueHitQueue	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
extends	TokenNameextends
FieldValueHitQueue	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
>	TokenNameGREATER
extends	TokenNameextends
FieldValueHitQueue	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
MultiComparatorsFieldValueHitQueue	TokenNameIdentifier
(	TokenNameLPAREN
SortField	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
fields	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
numComparators	TokenNameIdentifier
=	TokenNameEQUAL
comparators	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
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
numComparators	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
SortField	TokenNameIdentifier
field	TokenNameIdentifier
=	TokenNameEQUAL
fields	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
reverseMul	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
reverse	TokenNameIdentifier
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
comparators	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
getComparator	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
initialize	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
boolean	TokenNameboolean
lessThan	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Entry	TokenNameIdentifier
hitA	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Entry	TokenNameIdentifier
hitB	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
hitA	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
hitB	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
hitA	TokenNameIdentifier
.	TokenNameDOT
slot	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
hitB	TokenNameIdentifier
.	TokenNameDOT
slot	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
numComparators	TokenNameIdentifier
=	TokenNameEQUAL
comparators	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
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
numComparators	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
c	TokenNameIdentifier
=	TokenNameEQUAL
reverseMul	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
*	TokenNameMULTIPLY
comparators	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
hitA	TokenNameIdentifier
.	TokenNameDOT
slot	TokenNameIdentifier
,	TokenNameCOMMA
hitB	TokenNameIdentifier
.	TokenNameDOT
slot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
c	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
hitA	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
>	TokenNameGREATER
hitB	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
{	TokenNameLBRACE
"unchecked"	TokenNameStringLiteral
,	TokenNameCOMMA
"rawtypes"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
private	TokenNameprivate
FieldValueHitQueue	TokenNameIdentifier
(	TokenNameLPAREN
SortField	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
fields	TokenNameIdentifier
=	TokenNameEQUAL
fields	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
numComparators	TokenNameIdentifier
=	TokenNameEQUAL
fields	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
comparators	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FieldComparator	TokenNameIdentifier
[	TokenNameLBRACKET
numComparators	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
reverseMul	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
numComparators	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
<	TokenNameLESS
T	TokenNameIdentifier
extends	TokenNameextends
FieldValueHitQueue	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
>	TokenNameGREATER
FieldValueHitQueue	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
create	TokenNameIdentifier
(	TokenNameLPAREN
SortField	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fields	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Sort must contain at least one field"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
fields	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
OneComparatorFieldValueHitQueue	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
fields	TokenNameIdentifier
,	TokenNameCOMMA
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
MultiComparatorsFieldValueHitQueue	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
fields	TokenNameIdentifier
,	TokenNameCOMMA
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
FieldComparator	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getComparators	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
comparators	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getReverseMul	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
reverseMul	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
final	TokenNamefinal
SortField	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
FieldComparator	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
[	TokenNameLBRACKET
]	TokenNameRBRACKET
comparators	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
reverseMul	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
abstract	TokenNameabstract
boolean	TokenNameboolean
lessThan	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Entry	TokenNameIdentifier
a	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Entry	TokenNameIdentifier
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FieldDoc	TokenNameIdentifier
fillFields	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Entry	TokenNameIdentifier
entry	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
comparators	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
fields	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
n	TokenNameIdentifier
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
n	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fields	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
comparators	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
value	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
slot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
FieldDoc	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
doc	TokenNameIdentifier
,	TokenNameCOMMA
entry	TokenNameIdentifier
.	TokenNameDOT
score	TokenNameIdentifier
,	TokenNameCOMMA
fields	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
SortField	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fields	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
