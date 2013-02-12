package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
taxonomy	TokenNameIdentifier
.	TokenNameDOT
writercache	TokenNameIdentifier
.	TokenNameDOT
cl2o	TokenNameIdentifier
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
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
NoSuchElementException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
taxonomy	TokenNameIdentifier
.	TokenNameDOT
CategoryPath	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CollisionMap	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
capacity	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
float	TokenNamefloat
loadFactor	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
size	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
threshold	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
class	TokenNameclass
Entry	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
cid	TokenNameIdentifier
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
next	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
cid	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
h	TokenNameIdentifier
,	TokenNameCOMMA
Entry	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
offset	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
cid	TokenNameIdentifier
=	TokenNameEQUAL
cid	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
hash	TokenNameIdentifier
=	TokenNameEQUAL
h	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
CharBlockArray	TokenNameIdentifier
labelRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
entries	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
CollisionMap	TokenNameIdentifier
(	TokenNameLPAREN
CharBlockArray	TokenNameIdentifier
labelRepository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
16	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
1024	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.75f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
labelRepository	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CollisionMap	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
initialCapacity	TokenNameIdentifier
,	TokenNameCOMMA
CharBlockArray	TokenNameIdentifier
labelRepository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
initialCapacity	TokenNameIdentifier
,	TokenNameCOMMA
0.75f	TokenNameFloatingPointLiteral
,	TokenNameCOMMA
labelRepository	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
CollisionMap	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
initialCapacity	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
loadFactor	TokenNameIdentifier
,	TokenNameCOMMA
CharBlockArray	TokenNameIdentifier
labelRepository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
labelRepository	TokenNameIdentifier
=	TokenNameEQUAL
labelRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
loadFactor	TokenNameIdentifier
=	TokenNameEQUAL
loadFactor	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
=	TokenNameEQUAL
CompactLabelToOrdinal	TokenNameIdentifier
.	TokenNameDOT
determineCapacity	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
initialCapacity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
threshold	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
*	TokenNameMULTIPLY
this	TokenNamethis
.	TokenNameDOT
loadFactor	TokenNameIdentifier
)	TokenNameRPAREN
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
int	TokenNameint
capacity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
grow	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
newCapacity	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newEntries	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
newCapacity	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
src	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
src	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
src	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
do	TokenNamedo
{	TokenNameLBRACE
Entry	TokenNameIdentifier
next	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
indexFor	TokenNameIdentifier
(	TokenNameLPAREN
hash	TokenNameIdentifier
,	TokenNameCOMMA
newCapacity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
newEntries	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
newEntries	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
e	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
=	TokenNameEQUAL
newCapacity	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
=	TokenNameEQUAL
newEntries	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
threshold	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
*	TokenNameMULTIPLY
this	TokenNamethis
.	TokenNameDOT
loadFactor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
get	TokenNameIdentifier
(	TokenNameLPAREN
CategoryPath	TokenNameIdentifier
label	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
hash	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
bucketIndex	TokenNameIdentifier
=	TokenNameEQUAL
indexFor	TokenNameIdentifier
(	TokenNameLPAREN
hash	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
[	TokenNameLBRACKET
bucketIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
(	TokenNameLPAREN
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
&&	TokenNameAND_AND
label	TokenNameIdentifier
.	TokenNameDOT
equalsToSerialized	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
labelRepository	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
LabelToOrdinal	TokenNameIdentifier
.	TokenNameDOT
InvalidOrdinal	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
e	TokenNameIdentifier
.	TokenNameDOT
cid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
get	TokenNameIdentifier
(	TokenNameLPAREN
CategoryPath	TokenNameIdentifier
label	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
prefixLen	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
hash	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
bucketIndex	TokenNameIdentifier
=	TokenNameEQUAL
indexFor	TokenNameIdentifier
(	TokenNameLPAREN
hash	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
[	TokenNameLBRACKET
bucketIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
(	TokenNameLPAREN
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
&&	TokenNameAND_AND
label	TokenNameIdentifier
.	TokenNameDOT
equalsToSerialized	TokenNameIdentifier
(	TokenNameLPAREN
prefixLen	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
labelRepository	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
LabelToOrdinal	TokenNameIdentifier
.	TokenNameDOT
InvalidOrdinal	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
e	TokenNameIdentifier
.	TokenNameDOT
cid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
addLabel	TokenNameIdentifier
(	TokenNameLPAREN
CategoryPath	TokenNameIdentifier
label	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
hash	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
cid	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
bucketIndex	TokenNameIdentifier
=	TokenNameEQUAL
indexFor	TokenNameIdentifier
(	TokenNameLPAREN
hash	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
[	TokenNameLBRACKET
bucketIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
&&	TokenNameAND_AND
label	TokenNameIdentifier
.	TokenNameDOT
equalsToSerialized	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
labelRepository	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
.	TokenNameDOT
cid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
labelRepository	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
label	TokenNameIdentifier
.	TokenNameDOT
serializeAppendTo	TokenNameIdentifier
(	TokenNameLPAREN
labelRepository	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
addEntry	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
,	TokenNameCOMMA
cid	TokenNameIdentifier
,	TokenNameCOMMA
hash	TokenNameIdentifier
,	TokenNameCOMMA
bucketIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
cid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
addLabel	TokenNameIdentifier
(	TokenNameLPAREN
CategoryPath	TokenNameIdentifier
label	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
prefixLen	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
hash	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
cid	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
bucketIndex	TokenNameIdentifier
=	TokenNameEQUAL
indexFor	TokenNameIdentifier
(	TokenNameLPAREN
hash	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
[	TokenNameLBRACKET
bucketIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
&&	TokenNameAND_AND
label	TokenNameIdentifier
.	TokenNameDOT
equalsToSerialized	TokenNameIdentifier
(	TokenNameLPAREN
prefixLen	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
labelRepository	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
.	TokenNameDOT
cid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
labelRepository	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
label	TokenNameIdentifier
.	TokenNameDOT
serializeAppendTo	TokenNameIdentifier
(	TokenNameLPAREN
prefixLen	TokenNameIdentifier
,	TokenNameCOMMA
labelRepository	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
addEntry	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
,	TokenNameCOMMA
cid	TokenNameIdentifier
,	TokenNameCOMMA
hash	TokenNameIdentifier
,	TokenNameCOMMA
bucketIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
cid	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addLabelOffset	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
hash	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
cid	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
bucketIndex	TokenNameIdentifier
=	TokenNameEQUAL
indexFor	TokenNameIdentifier
(	TokenNameLPAREN
hash	TokenNameIdentifier
,	TokenNameCOMMA
this	TokenNamethis
.	TokenNameDOT
capacity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addEntry	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
,	TokenNameCOMMA
cid	TokenNameIdentifier
,	TokenNameCOMMA
hash	TokenNameIdentifier
,	TokenNameCOMMA
bucketIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
addEntry	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
cid	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
hash	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
bucketIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
[	TokenNameLBRACKET
bucketIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
[	TokenNameLBRACKET
bucketIndex	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
,	TokenNameCOMMA
cid	TokenNameIdentifier
,	TokenNameCOMMA
hash	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
size	TokenNameIdentifier
++	TokenNamePLUS_PLUS
>=	TokenNameGREATER_EQUAL
this	TokenNamethis
.	TokenNameDOT
threshold	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
grow	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
Iterator	TokenNameIdentifier
<	TokenNameLESS
CollisionMap	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
>	TokenNameGREATER
entryIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
EntryIterator	TokenNameIdentifier
(	TokenNameLPAREN
entries	TokenNameIdentifier
,	TokenNameCOMMA
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
int	TokenNameint
indexFor	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
h	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
h	TokenNameIdentifier
&	TokenNameAND
(	TokenNameLPAREN
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
getMemoryUsage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
memoryUsage	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
e	TokenNameIdentifier
:	TokenNameCOLON
this	TokenNamethis
.	TokenNameDOT
entries	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
memoryUsage	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
(	TokenNameLPAREN
4	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
ee	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
ee	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
ee	TokenNameIdentifier
=	TokenNameEQUAL
ee	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
memoryUsage	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
(	TokenNameLPAREN
4	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
memoryUsage	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
class	TokenNameclass
EntryIterator	TokenNameIdentifier
implements	TokenNameimplements
Iterator	TokenNameIdentifier
<	TokenNameLESS
Entry	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
Entry	TokenNameIdentifier
next	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ents	TokenNameIdentifier
;	TokenNameSEMICOLON
EntryIterator	TokenNameIdentifier
(	TokenNameLPAREN
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
entries	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
ents	TokenNameIdentifier
=	TokenNameEQUAL
entries	TokenNameIdentifier
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
t	TokenNameIdentifier
=	TokenNameEQUAL
entries	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
size	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
i	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
(	TokenNameLPAREN
n	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
[	TokenNameLBRACKET
--	TokenNameMINUS_MINUS
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
index	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
next	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Entry	TokenNameIdentifier
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
NoSuchElementException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
t	TokenNameIdentifier
=	TokenNameEQUAL
ents	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
index	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
n	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
i	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
n	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
[	TokenNameLBRACKET
--	TokenNameMINUS_MINUS
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
index	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE