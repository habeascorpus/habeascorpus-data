package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
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
Collections	TokenNameIdentifier
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
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
TreeSet	TokenNameIdentifier
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
LuceneTestCase	TokenNameIdentifier
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
_TestUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestPrefixCodedTerms	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrefixCodedTerms	TokenNameIdentifier
pb	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
.	TokenNameDOT
finish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
pb	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testOne	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Term	TokenNameIdentifier
term	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
"bogus"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
b	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrefixCodedTerms	TokenNameIdentifier
pb	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
.	TokenNameDOT
finish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
=	TokenNameEQUAL
pb	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
iterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
,	TokenNameCOMMA
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testRandom	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Set	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
terms	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeSet	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
nterms	TokenNameIdentifier
=	TokenNameEQUAL
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
10000	TokenNameIntegerLiteral
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
nterms	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Term	TokenNameIdentifier
term	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
randomUnicodeString	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
randomUnicodeString	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
terms	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Term	TokenNameIdentifier
ref	TokenNameIdentifier
:	TokenNameCOLON
terms	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
b	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
ref	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
PrefixCodedTerms	TokenNameIdentifier
pb	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
.	TokenNameDOT
finish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
expected	TokenNameIdentifier
=	TokenNameEQUAL
terms	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Term	TokenNameIdentifier
t	TokenNameIdentifier
:	TokenNameCOLON
pb	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMergeEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
subs	TokenNameIdentifier
=	TokenNameEQUAL
Collections	TokenNameIdentifier
.	TokenNameDOT
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
CoalescedDeletes	TokenNameIdentifier
.	TokenNameDOT
mergedIterator	TokenNameIdentifier
(	TokenNameLPAREN
subs	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
subs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
subs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
finish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
subs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
finish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
merged	TokenNameIdentifier
=	TokenNameEQUAL
CoalescedDeletes	TokenNameIdentifier
.	TokenNameDOT
mergedIterator	TokenNameIdentifier
(	TokenNameLPAREN
subs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
merged	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMergeOne	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Term	TokenNameIdentifier
t1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
b1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
b1	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
t1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrefixCodedTerms	TokenNameIdentifier
pb1	TokenNameIdentifier
=	TokenNameEQUAL
b1	TokenNameIdentifier
.	TokenNameDOT
finish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Term	TokenNameIdentifier
t2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
"b"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
b2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
b2	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
t2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrefixCodedTerms	TokenNameIdentifier
pb2	TokenNameIdentifier
=	TokenNameEQUAL
b2	TokenNameIdentifier
.	TokenNameDOT
finish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
subs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
subs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
pb1	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
subs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
pb2	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
merged	TokenNameIdentifier
=	TokenNameEQUAL
CoalescedDeletes	TokenNameIdentifier
.	TokenNameDOT
mergedIterator	TokenNameIdentifier
(	TokenNameLPAREN
subs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
merged	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
t1	TokenNameIdentifier
,	TokenNameCOMMA
merged	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
merged	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
t2	TokenNameIdentifier
,	TokenNameCOMMA
merged	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testMergeRandom	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
PrefixCodedTerms	TokenNameIdentifier
pb	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
PrefixCodedTerms	TokenNameIdentifier
[	TokenNameLBRACKET
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Set	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
superSet	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeSet	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
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
pb	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Set	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
terms	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeSet	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
nterms	TokenNameIdentifier
=	TokenNameEQUAL
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
10000	TokenNameIntegerLiteral
)	TokenNameRPAREN
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
nterms	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Term	TokenNameIdentifier
term	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
randomUnicodeString	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
randomUnicodeString	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
terms	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
superSet	TokenNameIdentifier
.	TokenNameDOT
addAll	TokenNameIdentifier
(	TokenNameLPAREN
terms	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrefixCodedTerms	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Term	TokenNameIdentifier
ref	TokenNameIdentifier
:	TokenNameCOLON
terms	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
b	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
ref	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
pb	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
b	TokenNameIdentifier
.	TokenNameDOT
finish	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
subs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
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
pb	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
subs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
pb	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
expected	TokenNameIdentifier
=	TokenNameEQUAL
superSet	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
>	TokenNameGREATER
actual	TokenNameIdentifier
=	TokenNameEQUAL
CoalescedDeletes	TokenNameIdentifier
.	TokenNameDOT
mergedIterator	TokenNameIdentifier
(	TokenNameLPAREN
subs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
actual	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
actual	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertFalse	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
