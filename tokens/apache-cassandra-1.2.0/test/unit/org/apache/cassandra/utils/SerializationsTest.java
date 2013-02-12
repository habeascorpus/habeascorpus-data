package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
AbstractSerializationsTester	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
service	TokenNameIdentifier
.	TokenNameDOT
StorageService	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
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
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SerializationsTest	TokenNameIdentifier
extends	TokenNameextends
AbstractSerializationsTester	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
void	TokenNamevoid
testBloomFilterWrite	TokenNameIdentifier
(	TokenNameLPAREN
Type	TokenNameIdentifier
murmur	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
offheap	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
IFilter	TokenNameIdentifier
bf	TokenNameIdentifier
=	TokenNameEQUAL
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
getFilter	TokenNameIdentifier
(	TokenNameLPAREN
1000000	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.0001	TokenNameDoubleLiteral
,	TokenNameCOMMA
murmur	TokenNameIdentifier
,	TokenNameCOMMA
offheap	TokenNameIdentifier
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
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
bf	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
StorageService	TokenNameIdentifier
.	TokenNameDOT
getPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getTokenFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toByteArray	TokenNameIdentifier
(	TokenNameLPAREN
StorageService	TokenNameIdentifier
.	TokenNameDOT
getPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getRandomToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
"utils.BloomFilter.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
bf	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
murmur	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testBloomFilterReadMURMUR2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
EXECUTE_WRITES	TokenNameIdentifier
)	TokenNameRPAREN
testBloomFilterWrite	TokenNameIdentifier
(	TokenNameLPAREN
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
MURMUR2	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataInputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
getInput	TokenNameIdentifier
(	TokenNameLPAREN
"utils.BloomFilter.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
MURMUR2	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testBloomFilterReadMURMUR3	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
EXECUTE_WRITES	TokenNameIdentifier
)	TokenNameRPAREN
testBloomFilterWrite	TokenNameIdentifier
(	TokenNameLPAREN
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
MURMUR3	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataInputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
getInput	TokenNameIdentifier
(	TokenNameLPAREN
"utils.BloomFilter.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
MURMUR3	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
testLegacyBloomFilterWrite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
LegacyBloomFilter	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
LegacyBloomFilter	TokenNameIdentifier
.	TokenNameDOT
getFilter	TokenNameIdentifier
(	TokenNameLPAREN
1000000	TokenNameIntegerLiteral
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
LegacyBloomFilter	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
LegacyBloomFilter	TokenNameIdentifier
.	TokenNameDOT
getFilter	TokenNameIdentifier
(	TokenNameLPAREN
1000000	TokenNameIntegerLiteral
,	TokenNameCOMMA
0.0001	TokenNameDoubleLiteral
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
100	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
StorageService	TokenNameIdentifier
.	TokenNameDOT
getPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getTokenFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toByteArray	TokenNameIdentifier
(	TokenNameLPAREN
StorageService	TokenNameIdentifier
.	TokenNameDOT
getPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getRandomToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
a	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
b	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
DataOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
"utils.LegacyBloomFilter.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
SHA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
SHA	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testLegacyBloomFilterRead	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
DataInputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
getInput	TokenNameIdentifier
(	TokenNameLPAREN
"utils.LegacyBloomFilter.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
FilterFactory	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
.	TokenNameDOT
SHA	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
testEstimatedHistogramWrite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
EstimatedHistogram	TokenNameIdentifier
hist0	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
EstimatedHistogram	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
EstimatedHistogram	TokenNameIdentifier
hist1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
EstimatedHistogram	TokenNameIdentifier
(	TokenNameLPAREN
5000	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
offsets	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
long	TokenNamelong
[	TokenNameLBRACKET
1000	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
data	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
long	TokenNamelong
[	TokenNameLBRACKET
offsets	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
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
offsets	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
offsets	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
data	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
i	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
data	TokenNameIdentifier
[	TokenNameLBRACKET
offsets	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
100000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
EstimatedHistogram	TokenNameIdentifier
hist2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
EstimatedHistogram	TokenNameIdentifier
(	TokenNameLPAREN
offsets	TokenNameIdentifier
,	TokenNameCOMMA
data	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataOutputStream	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
"utils.EstimatedHistogram.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
EstimatedHistogram	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
hist0	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
EstimatedHistogram	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
hist1	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
EstimatedHistogram	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
hist2	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testEstimatedHistogramRead	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
EXECUTE_WRITES	TokenNameIdentifier
)	TokenNameRPAREN
testEstimatedHistogramWrite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataInputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
getInput	TokenNameIdentifier
(	TokenNameLPAREN
"utils.EstimatedHistogram.bin"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
EstimatedHistogram	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
EstimatedHistogram	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
EstimatedHistogram	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
