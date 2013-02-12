package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
DataInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
DataOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestPagedBytes	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testDataInputOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
iter	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
<	TokenNameLESS
5	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RANDOM_MULTIPLIER	TokenNameIdentifier
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
blockBits	TokenNameIdentifier
=	TokenNameEQUAL
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
20	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
blockSize	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
blockBits	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
PagedBytes	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PagedBytes	TokenNameIdentifier
(	TokenNameLPAREN
blockBits	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
DataOutput	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
getDataOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
numBytes	TokenNameIdentifier
=	TokenNameEQUAL
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
10000000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
answer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
numBytes	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
random	TokenNameIdentifier
.	TokenNameDOT
nextBytes	TokenNameIdentifier
(	TokenNameLPAREN
answer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
written	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
written	TokenNameIdentifier
<	TokenNameLESS
numBytes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
answer	TokenNameIdentifier
[	TokenNameLBRACKET
written	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
chunk	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
numBytes	TokenNameIdentifier
-	TokenNameMINUS
written	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
answer	TokenNameIdentifier
,	TokenNameCOMMA
written	TokenNameIdentifier
,	TokenNameCOMMA
chunk	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
written	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
chunk	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
final	TokenNamefinal
PagedBytes	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
freeze	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextBoolean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
DataInput	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
getDataInput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
verify	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
numBytes	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
read	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
read	TokenNameIdentifier
<	TokenNameLESS
numBytes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
verify	TokenNameIdentifier
[	TokenNameLBRACKET
read	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
chunk	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
numBytes	TokenNameIdentifier
-	TokenNameMINUS
read	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
verify	TokenNameIdentifier
,	TokenNameCOMMA
read	TokenNameIdentifier
,	TokenNameCOMMA
chunk	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
read	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
chunk	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
Arrays	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
answer	TokenNameIdentifier
,	TokenNameCOMMA
verify	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
BytesRef	TokenNameIdentifier
slice	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
iter2	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
iter2	TokenNameIdentifier
<	TokenNameLESS
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
iter2	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
numBytes	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
blockSize	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
numBytes	TokenNameIdentifier
-	TokenNameMINUS
pos	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
fillSlice	TokenNameIdentifier
(	TokenNameLPAREN
slice	TokenNameIdentifier
,	TokenNameCOMMA
pos	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
byteUpto	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
byteUpto	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
;	TokenNameSEMICOLON
byteUpto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
answer	TokenNameIdentifier
[	TokenNameLBRACKET
pos	TokenNameIdentifier
+	TokenNamePLUS
byteUpto	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
slice	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
slice	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
+	TokenNamePLUS
byteUpto	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testLengthPrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
iter	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
<	TokenNameLESS
5	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RANDOM_MULTIPLIER	TokenNameIdentifier
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
blockBits	TokenNameIdentifier
=	TokenNameEQUAL
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
20	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
blockSize	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
blockBits	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
PagedBytes	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PagedBytes	TokenNameIdentifier
(	TokenNameLPAREN
blockBits	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
addresses	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
BytesRef	TokenNameIdentifier
>	TokenNameGREATER
answers	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
BytesRef	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
totBytes	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
totBytes	TokenNameIdentifier
<	TokenNameLESS
10000000	TokenNameIntegerLiteral
&&	TokenNameAND_AND
answers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
100000	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
blockSize	TokenNameIdentifier
-	TokenNameMINUS
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
32768	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
BytesRef	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
b	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
len	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
b	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
=	TokenNameEQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
b	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
random	TokenNameIdentifier
.	TokenNameDOT
nextBytes	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
answers	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addresses	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
p	TokenNameIdentifier
.	TokenNameDOT
copyUsingLengthPrefix	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
totBytes	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
PagedBytes	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
freeze	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextBoolean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
BytesRef	TokenNameIdentifier
slice	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
<	TokenNameLESS
answers	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
reader	TokenNameIdentifier
.	TokenNameDOT
fillSliceWithPrefix	TokenNameIdentifier
(	TokenNameLPAREN
slice	TokenNameIdentifier
,	TokenNameCOMMA
addresses	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
idx	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
answers	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
idx	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
slice	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testLengthPrefixAcrossTwoBlocks	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
PagedBytes	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PagedBytes	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
DataOutput	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
getDataOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bytes1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
1000	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
random	TokenNameIdentifier
.	TokenNameDOT
nextBytes	TokenNameIdentifier
(	TokenNameLPAREN
bytes1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
bytes1	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
bytes1	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
40	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bytes2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
40	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
random	TokenNameIdentifier
.	TokenNameDOT
nextBytes	TokenNameIdentifier
(	TokenNameLPAREN
bytes2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
bytes2	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
bytes2	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
PagedBytes	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
.	TokenNameDOT
freeze	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextBoolean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BytesRef	TokenNameIdentifier
answer	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
fillSliceWithPrefix	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
40	TokenNameIntegerLiteral
,	TokenNameCOMMA
answer	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
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
40	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
bytes2	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
answer	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
answer	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
+	TokenNamePLUS
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
