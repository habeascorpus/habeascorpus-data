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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Random	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
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
obs	TokenNameIdentifier
.	TokenNameDOT
OffHeapBitSet	TokenNameIdentifier
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
obs	TokenNameIdentifier
.	TokenNameDOT
OpenBitSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
slf4j	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
slf4j	TokenNameIdentifier
.	TokenNameDOT
LoggerFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LongBitSetTest	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
LoggerFactory	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
LongBitSetTest	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Random	TokenNameIdentifier
random	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Random	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
populateRandom	TokenNameIdentifier
(	TokenNameLPAREN
OffHeapBitSet	TokenNameIdentifier
offbs	TokenNameIdentifier
,	TokenNameCOMMA
OpenBitSet	TokenNameIdentifier
obs	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
random	TokenNameIdentifier
.	TokenNameDOT
nextBoolean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
offbs	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
obs	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
compare	TokenNameIdentifier
(	TokenNameLPAREN
OffHeapBitSet	TokenNameIdentifier
offbs	TokenNameIdentifier
,	TokenNameCOMMA
OpenBitSet	TokenNameIdentifier
obs	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
offbs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
obs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
offbs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
obs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testBitSetOperations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
size_to_test	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
/	TokenNameDIVIDE
40	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
long	TokenNamelong
size_and_excess	TokenNameIdentifier
=	TokenNameEQUAL
size_to_test	TokenNameIdentifier
+	TokenNamePLUS
20	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
OffHeapBitSet	TokenNameIdentifier
offbs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OffHeapBitSet	TokenNameIdentifier
(	TokenNameLPAREN
size_and_excess	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
OpenBitSet	TokenNameIdentifier
obs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OpenBitSet	TokenNameIdentifier
(	TokenNameLPAREN
size_and_excess	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
long	TokenNamelong
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size_to_test	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
populateRandom	TokenNameIdentifier
(	TokenNameLPAREN
offbs	TokenNameIdentifier
,	TokenNameCOMMA
obs	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
long	TokenNamelong
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size_to_test	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
compare	TokenNameIdentifier
(	TokenNameLPAREN
offbs	TokenNameIdentifier
,	TokenNameCOMMA
obs	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
timeit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
size_to_test	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
/	TokenNameDIVIDE
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
long	TokenNamelong
size_and_excess	TokenNameIdentifier
=	TokenNameEQUAL
size_to_test	TokenNameIdentifier
+	TokenNamePLUS
20	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
OpenBitSet	TokenNameIdentifier
obs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OpenBitSet	TokenNameIdentifier
(	TokenNameLPAREN
size_and_excess	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
OffHeapBitSet	TokenNameIdentifier
offbs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OffHeapBitSet	TokenNameIdentifier
(	TokenNameLPAREN
size_and_excess	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"||Open BS set's|Open BS get's|Open BS clear's|Offheap BS set's|Offheap BS get's|Offheap BS clear's|"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loopOnce	TokenNameIdentifier
(	TokenNameLPAREN
obs	TokenNameIdentifier
,	TokenNameCOMMA
offbs	TokenNameIdentifier
,	TokenNameCOMMA
size_to_test	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
loopOnce	TokenNameIdentifier
(	TokenNameLPAREN
OpenBitSet	TokenNameIdentifier
obs	TokenNameIdentifier
,	TokenNameCOMMA
OffHeapBitSet	TokenNameIdentifier
offbs	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
size_to_test	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
gc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
start	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
long	TokenNamelong
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size_to_test	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
obs	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"||"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
start	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
long	TokenNamelong
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size_to_test	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
obs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"|"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
start	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
long	TokenNamelong
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size_to_test	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
obs	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"|"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
gc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
start	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
long	TokenNamelong
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size_to_test	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
offbs	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"|"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
start	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
long	TokenNamelong
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size_to_test	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
offbs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"|"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
start	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
long	TokenNamelong
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size_to_test	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
offbs	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"|"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"|"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
logger	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
loopIt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
size_to_test	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
/	TokenNameDIVIDE
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
long	TokenNamelong
size_and_excess	TokenNameIdentifier
=	TokenNameEQUAL
size_to_test	TokenNameIdentifier
+	TokenNamePLUS
20	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
OpenBitSet	TokenNameIdentifier
obs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OpenBitSet	TokenNameIdentifier
(	TokenNameLPAREN
size_and_excess	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
OffHeapBitSet	TokenNameIdentifier
offbs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OffHeapBitSet	TokenNameIdentifier
(	TokenNameLPAREN
size_and_excess	TokenNameIdentifier
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
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
loopOnce	TokenNameIdentifier
(	TokenNameLPAREN
obs	TokenNameIdentifier
,	TokenNameCOMMA
offbs	TokenNameIdentifier
,	TokenNameCOMMA
size_to_test	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
