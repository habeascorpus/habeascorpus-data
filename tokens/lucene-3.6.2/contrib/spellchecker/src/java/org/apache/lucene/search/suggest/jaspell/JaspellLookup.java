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
jaspell	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataOutputStream	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
OutputStream	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
spell	TokenNameIdentifier
.	TokenNameDOT
TermFreqIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
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
Lookup	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
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
UnsortedTermFreqIteratorWrapper	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
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
jaspell	TokenNameIdentifier
.	TokenNameDOT
JaspellTernarySearchTrie	TokenNameIdentifier
.	TokenNameDOT
TSTNode	TokenNameIdentifier
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
BytesRef	TokenNameIdentifier
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
CharsRef	TokenNameIdentifier
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
IOUtils	TokenNameIdentifier
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
UnicodeUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JaspellLookup	TokenNameIdentifier
extends	TokenNameextends
Lookup	TokenNameIdentifier
{	TokenNameLBRACE
JaspellTernarySearchTrie	TokenNameIdentifier
trie	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JaspellTernarySearchTrie	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
usePrefix	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
editDistance	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
build	TokenNameIdentifier
(	TokenNameLPAREN
TermFreqIterator	TokenNameIdentifier
tfit	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tfit	TokenNameIdentifier
.	TokenNameDOT
getComparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
tfit	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UnsortedTermFreqIteratorWrapper	TokenNameIdentifier
(	TokenNameLPAREN
tfit	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
trie	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JaspellTernarySearchTrie	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
trie	TokenNameIdentifier
.	TokenNameDOT
setMatchAlmostDiff	TokenNameIdentifier
(	TokenNameLPAREN
editDistance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BytesRef	TokenNameIdentifier
spare	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
CharsRef	TokenNameIdentifier
charsSpare	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CharsRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
spare	TokenNameIdentifier
=	TokenNameEQUAL
tfit	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
long	TokenNamelong
weight	TokenNameIdentifier
=	TokenNameEQUAL
tfit	TokenNameIdentifier
.	TokenNameDOT
weight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
spare	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
charsSpare	TokenNameIdentifier
.	TokenNameDOT
grow	TokenNameIdentifier
(	TokenNameLPAREN
spare	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UnicodeUtil	TokenNameIdentifier
.	TokenNameDOT
UTF8toUTF16	TokenNameIdentifier
(	TokenNameLPAREN
spare	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
spare	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
,	TokenNameCOMMA
spare	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
charsSpare	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
trie	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
charsSpare	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Long	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
add	TokenNameIdentifier
(	TokenNameLPAREN
CharSequence	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
trie	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
CharSequence	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
trie	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
LookupResult	TokenNameIdentifier
>	TokenNameGREATER
lookup	TokenNameIdentifier
(	TokenNameLPAREN
CharSequence	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
onlyMorePopular	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
num	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
LookupResult	TokenNameIdentifier
>	TokenNameGREATER
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
LookupResult	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
list	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
onlyMorePopular	TokenNameIdentifier
?	TokenNameQUESTION
num	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
:	TokenNameCOLON
num	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
usePrefix	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
list	TokenNameIdentifier
=	TokenNameEQUAL
trie	TokenNameIdentifier
.	TokenNameDOT
matchPrefix	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
count	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
list	TokenNameIdentifier
=	TokenNameEQUAL
trie	TokenNameIdentifier
.	TokenNameDOT
matchAlmost	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
count	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
list	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
list	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
maxCnt	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
num	TokenNameIdentifier
,	TokenNameCOMMA
list	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
onlyMorePopular	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LookupPriorityQueue	TokenNameIdentifier
queue	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LookupPriorityQueue	TokenNameIdentifier
(	TokenNameLPAREN
num	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
:	TokenNameCOLON
list	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
freq	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Number	TokenNameIdentifier
)	TokenNameRPAREN
trie	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
longValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
queue	TokenNameIdentifier
.	TokenNameDOT
insertWithOverflow	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
LookupResult	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
CharsRef	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
freq	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
LookupResult	TokenNameIdentifier
lr	TokenNameIdentifier
:	TokenNameCOLON
queue	TokenNameIdentifier
.	TokenNameDOT
getResults	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
lr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
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
maxCnt	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
list	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
freq	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Number	TokenNameIdentifier
)	TokenNameRPAREN
trie	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
longValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
LookupResult	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
CharsRef	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
freq	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
LO_KID	TokenNameIdentifier
=	TokenNameEQUAL
0x01	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
EQ_KID	TokenNameIdentifier
=	TokenNameEQUAL
0x02	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
HI_KID	TokenNameIdentifier
=	TokenNameEQUAL
0x04	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
HAS_VALUE	TokenNameIdentifier
=	TokenNameEQUAL
0x08	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
void	TokenNamevoid
readRecursively	TokenNameIdentifier
(	TokenNameLPAREN
DataInputStream	TokenNameIdentifier
in	TokenNameIdentifier
,	TokenNameCOMMA
TSTNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
node	TokenNameIdentifier
.	TokenNameDOT
splitchar	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readChar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
mask	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
mask	TokenNameIdentifier
&	TokenNameAND
HAS_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
node	TokenNameIdentifier
.	TokenNameDOT
data	TokenNameIdentifier
=	TokenNameEQUAL
Long	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
.	TokenNameDOT
readLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
mask	TokenNameIdentifier
&	TokenNameAND
LO_KID	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
TSTNode	TokenNameIdentifier
kid	TokenNameIdentifier
=	TokenNameEQUAL
trie	TokenNameIdentifier
.	TokenNameDOT
new	TokenNamenew
TSTNode	TokenNameIdentifier
(	TokenNameLPAREN
'\0'	TokenNameCharacterLiteral
,	TokenNameCOMMA
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
node	TokenNameIdentifier
.	TokenNameDOT
relatives	TokenNameIdentifier
[	TokenNameLBRACKET
TSTNode	TokenNameIdentifier
.	TokenNameDOT
LOKID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
kid	TokenNameIdentifier
;	TokenNameSEMICOLON
readRecursively	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
kid	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
mask	TokenNameIdentifier
&	TokenNameAND
EQ_KID	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
TSTNode	TokenNameIdentifier
kid	TokenNameIdentifier
=	TokenNameEQUAL
trie	TokenNameIdentifier
.	TokenNameDOT
new	TokenNamenew
TSTNode	TokenNameIdentifier
(	TokenNameLPAREN
'\0'	TokenNameCharacterLiteral
,	TokenNameCOMMA
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
node	TokenNameIdentifier
.	TokenNameDOT
relatives	TokenNameIdentifier
[	TokenNameLBRACKET
TSTNode	TokenNameIdentifier
.	TokenNameDOT
EQKID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
kid	TokenNameIdentifier
;	TokenNameSEMICOLON
readRecursively	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
kid	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
mask	TokenNameIdentifier
&	TokenNameAND
HI_KID	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
TSTNode	TokenNameIdentifier
kid	TokenNameIdentifier
=	TokenNameEQUAL
trie	TokenNameIdentifier
.	TokenNameDOT
new	TokenNamenew
TSTNode	TokenNameIdentifier
(	TokenNameLPAREN
'\0'	TokenNameCharacterLiteral
,	TokenNameCOMMA
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
node	TokenNameIdentifier
.	TokenNameDOT
relatives	TokenNameIdentifier
[	TokenNameLBRACKET
TSTNode	TokenNameIdentifier
.	TokenNameDOT
HIKID	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
kid	TokenNameIdentifier
;	TokenNameSEMICOLON
readRecursively	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
kid	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
writeRecursively	TokenNameIdentifier
(	TokenNameLPAREN
DataOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
,	TokenNameCOMMA
TSTNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeChar	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
splitchar	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
mask	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
relatives	TokenNameIdentifier
[	TokenNameLBRACKET
TSTNode	TokenNameIdentifier
.	TokenNameDOT
LOKID	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
mask	TokenNameIdentifier
|=	TokenNameOR_EQUAL
LO_KID	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
relatives	TokenNameIdentifier
[	TokenNameLBRACKET
TSTNode	TokenNameIdentifier
.	TokenNameDOT
EQKID	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
mask	TokenNameIdentifier
|=	TokenNameOR_EQUAL
EQ_KID	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
relatives	TokenNameIdentifier
[	TokenNameLBRACKET
TSTNode	TokenNameIdentifier
.	TokenNameDOT
HIKID	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
mask	TokenNameIdentifier
|=	TokenNameOR_EQUAL
HI_KID	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
data	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
mask	TokenNameIdentifier
|=	TokenNameOR_EQUAL
HAS_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
mask	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
data	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Number	TokenNameIdentifier
)	TokenNameRPAREN
node	TokenNameIdentifier
.	TokenNameDOT
data	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
longValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
writeRecursively	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
node	TokenNameIdentifier
.	TokenNameDOT
relatives	TokenNameIdentifier
[	TokenNameLBRACKET
TSTNode	TokenNameIdentifier
.	TokenNameDOT
LOKID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writeRecursively	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
node	TokenNameIdentifier
.	TokenNameDOT
relatives	TokenNameIdentifier
[	TokenNameLBRACKET
TSTNode	TokenNameIdentifier
.	TokenNameDOT
EQKID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writeRecursively	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
node	TokenNameIdentifier
.	TokenNameDOT
relatives	TokenNameIdentifier
[	TokenNameLBRACKET
TSTNode	TokenNameIdentifier
.	TokenNameDOT
HIKID	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
store	TokenNameIdentifier
(	TokenNameLPAREN
OutputStream	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
TSTNode	TokenNameIdentifier
root	TokenNameIdentifier
=	TokenNameEQUAL
trie	TokenNameIdentifier
.	TokenNameDOT
getRoot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
root	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
DataOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
writeRecursively	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
,	TokenNameCOMMA
root	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
IOUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
load	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
input	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
DataInputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataInputStream	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TSTNode	TokenNameIdentifier
root	TokenNameIdentifier
=	TokenNameEQUAL
trie	TokenNameIdentifier
.	TokenNameDOT
new	TokenNamenew
TSTNode	TokenNameIdentifier
(	TokenNameLPAREN
'\0'	TokenNameCharacterLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
readRecursively	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
root	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
trie	TokenNameIdentifier
.	TokenNameDOT
setRoot	TokenNameIdentifier
(	TokenNameLPAREN
root	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
IOUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE