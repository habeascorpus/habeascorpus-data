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
concurrent	TokenNameIdentifier
.	TokenNameDOT
atomic	TokenNameIdentifier
.	TokenNameDOT
AtomicLong	TokenNameIdentifier
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
ByteBlockPool	TokenNameIdentifier
.	TokenNameDOT
Allocator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
RecyclingByteBlockAllocator	TokenNameIdentifier
extends	TokenNameextends
ByteBlockPool	TokenNameIdentifier
.	TokenNameDOT
Allocator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
freeByteBlocks	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
maxBufferedBlocks	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
freeBlocks	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
AtomicLong	TokenNameIdentifier
bytesUsed	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_BUFFERED_BLOCKS	TokenNameIdentifier
=	TokenNameEQUAL
64	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
RecyclingByteBlockAllocator	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
blockSize	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxBufferedBlocks	TokenNameIdentifier
,	TokenNameCOMMA
AtomicLong	TokenNameIdentifier
bytesUsed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
blockSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
freeByteBlocks	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
,	TokenNameCOMMA
maxBufferedBlocks	TokenNameIdentifier
)	TokenNameRPAREN
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
maxBufferedBlocks	TokenNameIdentifier
=	TokenNameEQUAL
maxBufferedBlocks	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
bytesUsed	TokenNameIdentifier
=	TokenNameEQUAL
bytesUsed	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RecyclingByteBlockAllocator	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
blockSize	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxBufferedBlocks	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
blockSize	TokenNameIdentifier
,	TokenNameCOMMA
maxBufferedBlocks	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
AtomicLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RecyclingByteBlockAllocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
ByteBlockPool	TokenNameIdentifier
.	TokenNameDOT
BYTE_BLOCK_SIZE	TokenNameIdentifier
,	TokenNameCOMMA
64	TokenNameIntegerLiteral
,	TokenNameCOMMA
new	TokenNamenew
AtomicLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
synchronized	TokenNamesynchronized
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getByteBlock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
freeBlocks	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
addAndGet	TokenNameIdentifier
(	TokenNameLPAREN
blockSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
blockSize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
b	TokenNameIdentifier
=	TokenNameEQUAL
freeByteBlocks	TokenNameIdentifier
[	TokenNameLBRACKET
--	TokenNameMINUS_MINUS
freeBlocks	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
freeByteBlocks	TokenNameIdentifier
[	TokenNameLBRACKET
freeBlocks	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
return	TokenNamereturn
b	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
recycleByteBlocks	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
blocks	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
end	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
numBlocks	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
maxBufferedBlocks	TokenNameIdentifier
-	TokenNameMINUS
freeBlocks	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
freeBlocks	TokenNameIdentifier
+	TokenNamePLUS
numBlocks	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
size	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
freeByteBlocks	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newBlocks	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
ArrayUtil	TokenNameIdentifier
.	TokenNameDOT
oversize	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
,	TokenNameCOMMA
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_OBJECT_REF	TokenNameIdentifier
)	TokenNameRPAREN
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
freeByteBlocks	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
newBlocks	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
freeBlocks	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
freeByteBlocks	TokenNameIdentifier
=	TokenNameEQUAL
newBlocks	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
stop	TokenNameIdentifier
=	TokenNameEQUAL
start	TokenNameIdentifier
+	TokenNamePLUS
numBlocks	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
start	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
stop	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
freeByteBlocks	TokenNameIdentifier
[	TokenNameLBRACKET
freeBlocks	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
blocks	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
blocks	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
stop	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
end	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
blocks	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
addAndGet	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
end	TokenNameIdentifier
-	TokenNameMINUS
stop	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
blockSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
int	TokenNameint
numBufferedBlocks	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
freeBlocks	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
bytesUsed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
maxBufferedBlocks	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
maxBufferedBlocks	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
int	TokenNameint
freeBlocks	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
num	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
num	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
stop	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
count	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
num	TokenNameIdentifier
>	TokenNameGREATER
freeBlocks	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
stop	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
freeBlocks	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
stop	TokenNameIdentifier
=	TokenNameEQUAL
freeBlocks	TokenNameIdentifier
-	TokenNameMINUS
num	TokenNameIdentifier
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
num	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
freeBlocks	TokenNameIdentifier
>	TokenNameGREATER
stop	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
freeByteBlocks	TokenNameIdentifier
[	TokenNameLBRACKET
--	TokenNameMINUS_MINUS
freeBlocks	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
addAndGet	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
count	TokenNameIdentifier
*	TokenNameMULTIPLY
blockSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE