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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Random	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
MockAnalyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Field	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
IndexReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
IndexWriterConfig	TokenNameIdentifier
.	TokenNameDOT
OpenMode	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
RandomIndexWriter	TokenNameIdentifier
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
Directory	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
AfterClass	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
BeforeClass	TokenNameIdentifier
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
BaseTestRangeFilter	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
F	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
boolean	TokenNameboolean
T	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
static	TokenNamestatic
class	TokenNameclass
TestIndex	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
maxR	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
minR	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
allowNegativeRandomInts	TokenNameIdentifier
;	TokenNameSEMICOLON
Directory	TokenNameIdentifier
index	TokenNameIdentifier
;	TokenNameSEMICOLON
TestIndex	TokenNameIdentifier
(	TokenNameLPAREN
Random	TokenNameIdentifier
random	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
minR	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
maxR	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
allowNegativeRandomInts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
minR	TokenNameIdentifier
=	TokenNameEQUAL
minR	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
maxR	TokenNameIdentifier
=	TokenNameEQUAL
maxR	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
allowNegativeRandomInts	TokenNameIdentifier
=	TokenNameEQUAL
allowNegativeRandomInts	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
index	TokenNameIdentifier
=	TokenNameEQUAL
newDirectory	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
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
}	TokenNameRBRACE
static	TokenNamestatic
IndexReader	TokenNameIdentifier
signedIndexReader	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
IndexReader	TokenNameIdentifier
unsignedIndexReader	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
TestIndex	TokenNameIdentifier
signedIndexDir	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
TestIndex	TokenNameIdentifier
unsignedIndexDir	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
int	TokenNameint
minId	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
int	TokenNameint
maxId	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
intLength	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
pad	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
40	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
"0"	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
p	TokenNameIdentifier
=	TokenNameEQUAL
"-"	TokenNameStringLiteral
;	TokenNameSEMICOLON
n	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
+	TokenNamePLUS
n	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
b	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
intLength	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
b	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"0"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
b	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
b	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
BeforeClass	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
beforeClassBaseTestRangeFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
maxId	TokenNameIdentifier
=	TokenNameEQUAL
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
signedIndexDir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TestIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
unsignedIndexDir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TestIndex	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
signedIndexReader	TokenNameIdentifier
=	TokenNameEQUAL
build	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
signedIndexDir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
unsignedIndexReader	TokenNameIdentifier
=	TokenNameEQUAL
build	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
unsignedIndexDir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
AfterClass	TokenNameIdentifier
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
afterClassBaseTestRangeFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
signedIndexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
unsignedIndexReader	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
signedIndexDir	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
unsignedIndexDir	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
signedIndexReader	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
unsignedIndexReader	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
signedIndexDir	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
unsignedIndexDir	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
IndexReader	TokenNameIdentifier
build	TokenNameIdentifier
(	TokenNameLPAREN
Random	TokenNameIdentifier
random	TokenNameIdentifier
,	TokenNameCOMMA
TestIndex	TokenNameIdentifier
index	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Document	TokenNameIdentifier
doc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Document	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
idField	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
"id"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
YES	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
NOT_ANALYZED_NO_NORMS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
randField	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
"rand"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
YES	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
NOT_ANALYZED_NO_NORMS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Field	TokenNameIdentifier
bodyField	TokenNameIdentifier
=	TokenNameEQUAL
newField	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
"body"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Store	TokenNameIdentifier
.	TokenNameDOT
NO	TokenNameIdentifier
,	TokenNameCOMMA
Field	TokenNameIdentifier
.	TokenNameDOT
Index	TokenNameIdentifier
.	TokenNameDOT
NOT_ANALYZED_NO_NORMS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
idField	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
randField	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
bodyField	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
RandomIndexWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RandomIndexWriter	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
index	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
,	TokenNameCOMMA
newIndexWriterConfig	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
TEST_VERSION_CURRENT	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
MockAnalyzer	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setOpenMode	TokenNameIdentifier
(	TokenNameLPAREN
OpenMode	TokenNameIdentifier
.	TokenNameDOT
CREATE	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setMaxBufferedDocs	TokenNameIdentifier
(	TokenNameLPAREN
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
50	TokenNameIntegerLiteral
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
newLogMergePolicy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
reduceOpenFiles	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
.	TokenNameDOT
w	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
minCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
maxCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
d	TokenNameIdentifier
=	TokenNameEQUAL
minId	TokenNameIdentifier
;	TokenNameSEMICOLON
d	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
maxId	TokenNameIdentifier
;	TokenNameSEMICOLON
d	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
idField	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
pad	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
r	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
.	TokenNameDOT
allowNegativeRandomInts	TokenNameIdentifier
?	TokenNameQUESTION
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
random	TokenNameIdentifier
.	TokenNameDOT
nextInt	TokenNameIdentifier
(	TokenNameLPAREN
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
.	TokenNameDOT
maxR	TokenNameIdentifier
<	TokenNameLESS
r	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
index	TokenNameIdentifier
.	TokenNameDOT
maxR	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
maxCount	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
.	TokenNameDOT
maxR	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
r	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
maxCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
<	TokenNameLESS
index	TokenNameIdentifier
.	TokenNameDOT
minR	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
index	TokenNameIdentifier
.	TokenNameDOT
minR	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
minCount	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
index	TokenNameIdentifier
.	TokenNameDOT
minR	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
minCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
randField	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
pad	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bodyField	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"body"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
minCount	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
&&	TokenNameAND_AND
maxCount	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
IndexReader	TokenNameIdentifier
ir	TokenNameIdentifier
=	TokenNameEQUAL
writer	TokenNameIdentifier
.	TokenNameDOT
getReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ir	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
writer	TokenNameIdentifier
.	TokenNameDOT
deleteAll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testPad	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
tests	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
-	TokenNameMINUS
9999999	TokenNameIntegerLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
99560	TokenNameIntegerLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
100	TokenNameIntegerLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
-	TokenNameMINUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
9	TokenNameIntegerLiteral
,	TokenNameCOMMA
10	TokenNameIntegerLiteral
,	TokenNameCOMMA
1000	TokenNameIntegerLiteral
,	TokenNameCOMMA
999999999	TokenNameIntegerLiteral
}	TokenNameRBRACE
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
tests	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
a	TokenNameIdentifier
=	TokenNameEQUAL
tests	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
b	TokenNameIdentifier
=	TokenNameEQUAL
tests	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
String	TokenNameIdentifier
aa	TokenNameIdentifier
=	TokenNameEQUAL
pad	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
bb	TokenNameIdentifier
=	TokenNameEQUAL
pad	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
label	TokenNameIdentifier
=	TokenNameEQUAL
a	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
aa	TokenNameIdentifier
+	TokenNamePLUS
" vs "	TokenNameStringLiteral
+	TokenNamePLUS
b	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
bb	TokenNameIdentifier
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"length of "	TokenNameStringLiteral
+	TokenNamePLUS
label	TokenNameIdentifier
,	TokenNameCOMMA
aa	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
bb	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"compare less than "	TokenNameStringLiteral
+	TokenNamePLUS
label	TokenNameIdentifier
,	TokenNameCOMMA
aa	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
bb	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
