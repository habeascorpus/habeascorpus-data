package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
suggest	TokenNameIdentifier
.	TokenNameDOT
fst	TokenNameIdentifier
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
*	TokenNameMULTIPLY
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
*	TokenNameMULTIPLY
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
fst	TokenNameIdentifier
.	TokenNameDOT
FST	TokenNameIdentifier
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
fst	TokenNameIdentifier
.	TokenNameDOT
FST	TokenNameIdentifier
.	TokenNameDOT
Arc	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FSTCompletion	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
Completion	TokenNameIdentifier
implements	TokenNameimplements
Comparable	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
BytesRef	TokenNameIdentifier
utf8	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
bucket	TokenNameIdentifier
;	TokenNameSEMICOLON
Completion	TokenNameIdentifier
(	TokenNameLPAREN
BytesRef	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
bucket	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
utf8	TokenNameIdentifier
=	TokenNameEQUAL
BytesRef	TokenNameIdentifier
.	TokenNameDOT
deepCopyOf	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
bucket	TokenNameIdentifier
=	TokenNameEQUAL
bucket	TokenNameIdentifier
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
utf8	TokenNameIdentifier
.	TokenNameDOT
utf8ToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"/"	TokenNameStringLiteral
+	TokenNamePLUS
bucket	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
Completion	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
utf8	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
o	TokenNameIdentifier
.	TokenNameDOT
utf8	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_BUCKETS	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
EMPTY_RESULT	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
FST	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
automaton	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
[	TokenNameLBRACKET
]	TokenNameRBRACKET
rootArcs	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
exactFirst	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
higherWeightsFirst	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"unchecked"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
FSTCompletion	TokenNameIdentifier
(	TokenNameLPAREN
FST	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
automaton	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
higherWeightsFirst	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
exactFirst	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
automaton	TokenNameIdentifier
=	TokenNameEQUAL
automaton	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
automaton	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
rootArcs	TokenNameIdentifier
=	TokenNameEQUAL
cacheRootArcs	TokenNameIdentifier
(	TokenNameLPAREN
automaton	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
rootArcs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Arc	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
higherWeightsFirst	TokenNameIdentifier
=	TokenNameEQUAL
higherWeightsFirst	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
exactFirst	TokenNameIdentifier
=	TokenNameEQUAL
exactFirst	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FSTCompletion	TokenNameIdentifier
(	TokenNameLPAREN
FST	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
automaton	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
automaton	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
{	TokenNameLBRACE
"all"	TokenNameStringLiteral
}	TokenNameRBRACE
)	TokenNameRPAREN
private	TokenNameprivate
static	TokenNamestatic
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
[	TokenNameLBRACKET
]	TokenNameRBRACKET
cacheRootArcs	TokenNameIdentifier
(	TokenNameLPAREN
FST	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
automaton	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
rootArcs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
arc	TokenNameIdentifier
=	TokenNameEQUAL
automaton	TokenNameIdentifier
.	TokenNameDOT
getFirstArc	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
automaton	TokenNameIdentifier
.	TokenNameDOT
readFirstTargetArc	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
,	TokenNameCOMMA
arc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
rootArcs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
copyFrom	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
arc	TokenNameIdentifier
.	TokenNameDOT
isLast	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
automaton	TokenNameIdentifier
.	TokenNameDOT
readNextArc	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Collections	TokenNameIdentifier
.	TokenNameDOT
reverse	TokenNameIdentifier
(	TokenNameLPAREN
rootArcs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
rootArcs	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Arc	TokenNameIdentifier
[	TokenNameLBRACKET
rootArcs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
getExactMatchStartingFromRootArc	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
rootArcIndex	TokenNameIdentifier
,	TokenNameCOMMA
BytesRef	TokenNameIdentifier
utf8	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
final	TokenNamefinal
FST	TokenNameIdentifier
.	TokenNameDOT
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
scratch	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FST	TokenNameIdentifier
.	TokenNameDOT
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
rootArcIndex	TokenNameIdentifier
<	TokenNameLESS
rootArcs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
rootArcIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
FST	TokenNameIdentifier
.	TokenNameDOT
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
rootArc	TokenNameIdentifier
=	TokenNameEQUAL
rootArcs	TokenNameIdentifier
[	TokenNameLBRACKET
rootArcIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
final	TokenNamefinal
FST	TokenNameIdentifier
.	TokenNameDOT
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
arc	TokenNameIdentifier
=	TokenNameEQUAL
scratch	TokenNameIdentifier
.	TokenNameDOT
copyFrom	TokenNameIdentifier
(	TokenNameLPAREN
rootArc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
descendWithPrefix	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
,	TokenNameCOMMA
utf8	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
automaton	TokenNameIdentifier
.	TokenNameDOT
readFirstTargetArc	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
,	TokenNameCOMMA
arc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
arc	TokenNameIdentifier
.	TokenNameDOT
label	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
FST	TokenNameIdentifier
.	TokenNameDOT
END_LABEL	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
rootArc	TokenNameIdentifier
.	TokenNameDOT
label	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
lookup	TokenNameIdentifier
(	TokenNameLPAREN
CharSequence	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
num	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
key	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
automaton	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
EMPTY_RESULT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
BytesRef	TokenNameIdentifier
keyUtf8	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
higherWeightsFirst	TokenNameIdentifier
&&	TokenNameAND_AND
rootArcs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
lookupSortedAlphabetically	TokenNameIdentifier
(	TokenNameLPAREN
keyUtf8	TokenNameIdentifier
,	TokenNameCOMMA
num	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
lookupSortedByWeight	TokenNameIdentifier
(	TokenNameLPAREN
keyUtf8	TokenNameIdentifier
,	TokenNameCOMMA
num	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
lookupSortedAlphabetically	TokenNameIdentifier
(	TokenNameLPAREN
BytesRef	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
num	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
res	TokenNameIdentifier
=	TokenNameEQUAL
lookupSortedByWeight	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
num	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Collections	TokenNameIdentifier
.	TokenNameDOT
sort	TokenNameIdentifier
(	TokenNameLPAREN
res	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
num	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
subList	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
num	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
lookupSortedByWeight	TokenNameIdentifier
(	TokenNameLPAREN
BytesRef	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
num	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
collectAll	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
,	TokenNameCOMMA
num	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
BytesRef	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
BytesRef	TokenNameIdentifier
.	TokenNameDOT
deepCopyOf	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
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
rootArcs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
FST	TokenNameIdentifier
.	TokenNameDOT
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
rootArc	TokenNameIdentifier
=	TokenNameEQUAL
rootArcs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
final	TokenNamefinal
FST	TokenNameIdentifier
.	TokenNameDOT
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
arc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FST	TokenNameIdentifier
.	TokenNameDOT
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
copyFrom	TokenNameIdentifier
(	TokenNameLPAREN
rootArc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
descendWithPrefix	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
=	TokenNameEQUAL
key	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
collect	TokenNameIdentifier
(	TokenNameLPAREN
res	TokenNameIdentifier
,	TokenNameCOMMA
num	TokenNameIdentifier
,	TokenNameCOMMA
rootArc	TokenNameIdentifier
.	TokenNameDOT
label	TokenNameIdentifier
,	TokenNameCOMMA
output	TokenNameIdentifier
,	TokenNameCOMMA
arc	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
collectAll	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
exactFirst	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
checkExistingAndReorder	TokenNameIdentifier
(	TokenNameLPAREN
res	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
exactMatchBucket	TokenNameIdentifier
=	TokenNameEQUAL
getExactMatchStartingFromRootArc	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
exactMatchBucket	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
num	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
res	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
new	TokenNamenew
Completion	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
exactMatchBucket	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
checkExistingAndReorder	TokenNameIdentifier
(	TokenNameLPAREN
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
list	TokenNameIdentifier
,	TokenNameCOMMA
BytesRef	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
list	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
--	TokenNameMINUS_MINUS
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
key	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
list	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
utf8	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
list	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
descendWithPrefix	TokenNameIdentifier
(	TokenNameLPAREN
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
arc	TokenNameIdentifier
,	TokenNameCOMMA
BytesRef	TokenNameIdentifier
utf8	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
max	TokenNameIdentifier
=	TokenNameEQUAL
utf8	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
+	TokenNamePLUS
utf8	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
FST	TokenNameIdentifier
.	TokenNameDOT
BytesReader	TokenNameIdentifier
fstReader	TokenNameIdentifier
=	TokenNameEQUAL
automaton	TokenNameIdentifier
.	TokenNameDOT
getBytesReader	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
utf8	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
max	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
automaton	TokenNameIdentifier
.	TokenNameDOT
findTargetArc	TokenNameIdentifier
(	TokenNameLPAREN
utf8	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
,	TokenNameCOMMA
arc	TokenNameIdentifier
,	TokenNameCOMMA
arc	TokenNameIdentifier
,	TokenNameCOMMA
fstReader	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
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
private	TokenNameprivate
boolean	TokenNameboolean
collect	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Completion	TokenNameIdentifier
>	TokenNameGREATER
res	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
num	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
bucket	TokenNameIdentifier
,	TokenNameCOMMA
BytesRef	TokenNameIdentifier
output	TokenNameIdentifier
,	TokenNameCOMMA
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
arc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
output	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
output	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
=	TokenNameEQUAL
ArrayUtil	TokenNameIdentifier
.	TokenNameDOT
grow	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
output	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
output	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
arc	TokenNameIdentifier
.	TokenNameDOT
label	TokenNameIdentifier
;	TokenNameSEMICOLON
automaton	TokenNameIdentifier
.	TokenNameDOT
readFirstTargetArc	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
,	TokenNameCOMMA
arc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
arc	TokenNameIdentifier
.	TokenNameDOT
label	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
FST	TokenNameIdentifier
.	TokenNameDOT
END_LABEL	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Completion	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
,	TokenNameCOMMA
bucket	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
num	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
save	TokenNameIdentifier
=	TokenNameEQUAL
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
collect	TokenNameIdentifier
(	TokenNameLPAREN
res	TokenNameIdentifier
,	TokenNameCOMMA
num	TokenNameIdentifier
,	TokenNameCOMMA
bucket	TokenNameIdentifier
,	TokenNameCOMMA
output	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Arc	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
copyFrom	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
=	TokenNameEQUAL
save	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
arc	TokenNameIdentifier
.	TokenNameDOT
isLast	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
automaton	TokenNameIdentifier
.	TokenNameDOT
readNextArc	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getBucketCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
rootArcs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getBucket	TokenNameIdentifier
(	TokenNameLPAREN
CharSequence	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getExactMatchStartingFromRootArc	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FST	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
>	TokenNameGREATER
getFST	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
automaton	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE