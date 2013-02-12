package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
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
Random	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
UUID	TokenNameIdentifier
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
ByteBufferUtil	TokenNameIdentifier
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
UUIDGen	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
UUIDTypeTest	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
UUIDTypeTest	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUIDType	TokenNameIdentifier
uuidType	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UUIDType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
UUID	TokenNameIdentifier
t1	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUID	TokenNameIdentifier
t2	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
t2	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
t1	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
t1	TokenNameIdentifier
,	TokenNameCOMMA
t2	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
t1	TokenNameIdentifier
,	TokenNameCOMMA
t1	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
t2	TokenNameIdentifier
,	TokenNameCOMMA
t2	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUID	TokenNameIdentifier
nullId	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UUID	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
nullId	TokenNameIdentifier
,	TokenNameCOMMA
t1	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
t2	TokenNameIdentifier
,	TokenNameCOMMA
nullId	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
nullId	TokenNameIdentifier
,	TokenNameCOMMA
nullId	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
test	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
test	TokenNameIdentifier
<	TokenNameLESS
32	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
test	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
UUID	TokenNameIdentifier
r1	TokenNameIdentifier
=	TokenNameEQUAL
UUID	TokenNameIdentifier
.	TokenNameDOT
randomUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUID	TokenNameIdentifier
r2	TokenNameIdentifier
=	TokenNameEQUAL
UUID	TokenNameIdentifier
.	TokenNameDOT
randomUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
r1	TokenNameIdentifier
,	TokenNameCOMMA
r2	TokenNameIdentifier
,	TokenNameCOMMA
compareUUID	TokenNameIdentifier
(	TokenNameLPAREN
r1	TokenNameIdentifier
,	TokenNameCOMMA
r2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
r1	TokenNameIdentifier
,	TokenNameCOMMA
r1	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
r2	TokenNameIdentifier
,	TokenNameCOMMA
r2	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
t1	TokenNameIdentifier
,	TokenNameCOMMA
r1	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
r2	TokenNameIdentifier
,	TokenNameCOMMA
t2	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
compareUnsigned	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
n1	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
n2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
n1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
n2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
n1	TokenNameIdentifier
<	TokenNameLESS
n2	TokenNameIdentifier
)	TokenNameRPAREN
^	TokenNameXOR
(	TokenNameLPAREN
(	TokenNameLPAREN
n1	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
(	TokenNameLPAREN
n2	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
int	TokenNameint
compareUUID	TokenNameIdentifier
(	TokenNameLPAREN
UUID	TokenNameIdentifier
u1	TokenNameIdentifier
,	TokenNameCOMMA
UUID	TokenNameIdentifier
u2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
c	TokenNameIdentifier
=	TokenNameEQUAL
compareUnsigned	TokenNameIdentifier
(	TokenNameLPAREN
u1	TokenNameIdentifier
.	TokenNameDOT
getMostSignificantBits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
u2	TokenNameIdentifier
.	TokenNameDOT
getMostSignificantBits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
compareUnsigned	TokenNameIdentifier
(	TokenNameLPAREN
u1	TokenNameIdentifier
.	TokenNameDOT
getLeastSignificantBits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
u2	TokenNameIdentifier
.	TokenNameDOT
getLeastSignificantBits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
describeCompare	TokenNameIdentifier
(	TokenNameLPAREN
UUID	TokenNameIdentifier
u1	TokenNameIdentifier
,	TokenNameCOMMA
UUID	TokenNameIdentifier
u2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
tb1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
u1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
"null"	TokenNameStringLiteral
:	TokenNameCOLON
(	TokenNameLPAREN
u1	TokenNameIdentifier
.	TokenNameDOT
version	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
"time-based "	TokenNameStringLiteral
:	TokenNameCOLON
"random "	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
tb2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
u2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
"null"	TokenNameStringLiteral
:	TokenNameCOLON
(	TokenNameLPAREN
u2	TokenNameIdentifier
.	TokenNameDOT
version	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
"time-based "	TokenNameStringLiteral
:	TokenNameCOLON
"random "	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
comp	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
c	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
" < "	TokenNameStringLiteral
:	TokenNameCOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
" = "	TokenNameStringLiteral
:	TokenNameCOLON
" > "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
tb1	TokenNameIdentifier
+	TokenNamePLUS
u1	TokenNameIdentifier
+	TokenNamePLUS
comp	TokenNameIdentifier
+	TokenNamePLUS
tb2	TokenNameIdentifier
+	TokenNamePLUS
u2	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
sign	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ByteBuffer	TokenNameIdentifier
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
UUID	TokenNameIdentifier
uuid	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
uuid	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
EMPTY_BYTE_BUFFER	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
msb	TokenNameIdentifier
=	TokenNameEQUAL
uuid	TokenNameIdentifier
.	TokenNameDOT
getMostSignificantBits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
lsb	TokenNameIdentifier
=	TokenNameEQUAL
uuid	TokenNameIdentifier
.	TokenNameDOT
getLeastSignificantBits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bytes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
16	TokenNameIntegerLiteral
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
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
msb	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
8	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
-	TokenNameMINUS
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
16	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
(	TokenNameLPAREN
lsb	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
8	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
-	TokenNameMINUS
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
bytes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
logJdkUUIDCompareToVariance	TokenNameIdentifier
(	TokenNameLPAREN
UUID	TokenNameIdentifier
u1	TokenNameIdentifier
,	TokenNameCOMMA
UUID	TokenNameIdentifier
u2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
expC	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
u1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
u2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
u1	TokenNameIdentifier
.	TokenNameDOT
version	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
u2	TokenNameIdentifier
.	TokenNameDOT
version	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
u1	TokenNameIdentifier
.	TokenNameDOT
version	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
u1	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
u2	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
expC	TokenNameIdentifier
)	TokenNameRPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"*** Note: java.util.UUID.compareTo() would have compared this differently"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCompare	TokenNameIdentifier
(	TokenNameLPAREN
UUID	TokenNameIdentifier
u1	TokenNameIdentifier
,	TokenNameCOMMA
UUID	TokenNameIdentifier
u2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
expC	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
c	TokenNameIdentifier
=	TokenNameEQUAL
sign	TokenNameIdentifier
(	TokenNameLPAREN
uuidType	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
u1	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
u2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expC	TokenNameIdentifier
=	TokenNameEQUAL
sign	TokenNameIdentifier
(	TokenNameLPAREN
expC	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Expected "	TokenNameStringLiteral
+	TokenNamePLUS
describeCompare	TokenNameIdentifier
(	TokenNameLPAREN
u1	TokenNameIdentifier
,	TokenNameCOMMA
u2	TokenNameIdentifier
,	TokenNameCOMMA
expC	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
", got "	TokenNameStringLiteral
+	TokenNamePLUS
describeCompare	TokenNameIdentifier
(	TokenNameLPAREN
u1	TokenNameIdentifier
,	TokenNameCOMMA
u2	TokenNameIdentifier
,	TokenNameCOMMA
c	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
expC	TokenNameIdentifier
,	TokenNameCOMMA
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
u1	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
u1	TokenNameIdentifier
.	TokenNameDOT
version	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
(	TokenNameLPAREN
u2	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
u2	TokenNameIdentifier
.	TokenNameDOT
version	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
,	TokenNameCOMMA
sign	TokenNameIdentifier
(	TokenNameLPAREN
TimeUUIDType	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
u1	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
u2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logJdkUUIDCompareToVariance	TokenNameIdentifier
(	TokenNameLPAREN
u1	TokenNameIdentifier
,	TokenNameCOMMA
u2	TokenNameIdentifier
,	TokenNameCOMMA
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testTimeEquality	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
UUID	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUID	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UUID	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
.	TokenNameDOT
getMostSignificantBits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
a	TokenNameIdentifier
.	TokenNameDOT
getLeastSignificantBits	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
uuidType	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testTimeSmaller	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
UUID	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUID	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUID	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
uuidType	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
uuidType	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
uuidType	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testTimeBigger	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
UUID	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUID	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UUID	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getTimeUUID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
uuidType	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
uuidType	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
uuidType	TokenNameIdentifier
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
bytebuffer	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testTimestampComparison	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Random	TokenNameIdentifier
rng	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Random	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
uuids	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteBuffer	TokenNameIdentifier
[	TokenNameLBRACKET
100	TokenNameIntegerLiteral
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
uuids	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
uuids	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
allocate	TokenNameIdentifier
(	TokenNameLPAREN
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rng	TokenNameIdentifier
.	TokenNameDOT
nextBytes	TokenNameIdentifier
(	TokenNameLPAREN
uuids	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
array	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
uuids	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
array	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
[	TokenNameLBRACKET
6	TokenNameIntegerLiteral
]	TokenNameRBRACKET
&=	TokenNameAND_EQUAL
0x0F	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
uuids	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
array	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
[	TokenNameLBRACKET
6	TokenNameIntegerLiteral
]	TokenNameRBRACKET
|=	TokenNameOR_EQUAL
0x10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Arrays	TokenNameIdentifier
.	TokenNameDOT
sort	TokenNameIdentifier
(	TokenNameLPAREN
uuids	TokenNameIdentifier
,	TokenNameCOMMA
uuidType	TokenNameIdentifier
)	TokenNameRPAREN
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
uuids	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
i0	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getUUID	TokenNameIdentifier
(	TokenNameLPAREN
uuids	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
.	TokenNameDOT
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
i1	TokenNameIdentifier
=	TokenNameEQUAL
UUIDGen	TokenNameIdentifier
.	TokenNameDOT
getUUID	TokenNameIdentifier
(	TokenNameLPAREN
uuids	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
.	TokenNameDOT
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
i0	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
i1	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE