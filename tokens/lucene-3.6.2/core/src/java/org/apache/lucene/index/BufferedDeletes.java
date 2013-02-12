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
HashMap	TokenNameIdentifier
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
Map	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
atomic	TokenNameIdentifier
.	TokenNameDOT
AtomicInteger	TokenNameIdentifier
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
Query	TokenNameIdentifier
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
RamUsageEstimator	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
BufferedDeletes	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
BYTES_PER_DEL_TERM	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_OBJECT_REF	TokenNameIdentifier
+	TokenNamePLUS
5	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_OBJECT_HEADER	TokenNameIdentifier
+	TokenNamePLUS
6	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_INT	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
BYTES_PER_DEL_DOCID	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_OBJECT_REF	TokenNameIdentifier
+	TokenNamePLUS
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_OBJECT_HEADER	TokenNameIdentifier
+	TokenNamePLUS
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_INT	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
BYTES_PER_DEL_QUERY	TokenNameIdentifier
=	TokenNameEQUAL
5	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_OBJECT_REF	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_OBJECT_HEADER	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_INT	TokenNameIdentifier
+	TokenNamePLUS
24	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
AtomicInteger	TokenNameIdentifier
numTermDeletes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AtomicInteger	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Map	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
terms	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
Term	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Map	TokenNameIdentifier
<	TokenNameLESS
Query	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
queries	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
Query	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
docIDs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Integer	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Integer	TokenNameIdentifier
MAX_INT	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
AtomicLong	TokenNameIdentifier
bytesUsed	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AtomicLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
boolean	TokenNameboolean
VERBOSE_DELETES	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
long	TokenNamelong
gen	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
VERBOSE_DELETES	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"gen="	TokenNameStringLiteral
+	TokenNamePLUS
gen	TokenNameIdentifier
+	TokenNamePLUS
" numTerms="	TokenNameStringLiteral
+	TokenNamePLUS
numTermDeletes	TokenNameIdentifier
+	TokenNamePLUS
", terms="	TokenNameStringLiteral
+	TokenNamePLUS
terms	TokenNameIdentifier
+	TokenNamePLUS
", queries="	TokenNameStringLiteral
+	TokenNamePLUS
queries	TokenNameIdentifier
+	TokenNamePLUS
", docIDs="	TokenNameStringLiteral
+	TokenNamePLUS
docIDs	TokenNameIdentifier
+	TokenNamePLUS
", bytesUsed="	TokenNameStringLiteral
+	TokenNamePLUS
bytesUsed	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
"gen="	TokenNameStringLiteral
+	TokenNamePLUS
gen	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
numTermDeletes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" "	TokenNameStringLiteral
+	TokenNamePLUS
numTermDeletes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" deleted terms (unique count="	TokenNameStringLiteral
+	TokenNamePLUS
terms	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
queries	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" "	TokenNameStringLiteral
+	TokenNamePLUS
queries	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" deleted queries"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
docIDs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" "	TokenNameStringLiteral
+	TokenNamePLUS
docIDs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" deleted docIDs"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
" bytesUsed="	TokenNameStringLiteral
+	TokenNamePLUS
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
s	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addQuery	TokenNameIdentifier
(	TokenNameLPAREN
Query	TokenNameIdentifier
query	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
docIDUpto	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Integer	TokenNameIdentifier
current	TokenNameIdentifier
=	TokenNameEQUAL
queries	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
,	TokenNameCOMMA
docIDUpto	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
current	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
addAndGet	TokenNameIdentifier
(	TokenNameLPAREN
BYTES_PER_DEL_QUERY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addDocID	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
docID	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
docIDs	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
Integer	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
docID	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
addAndGet	TokenNameIdentifier
(	TokenNameLPAREN
BYTES_PER_DEL_DOCID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addTerm	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
term	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
docIDUpto	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Integer	TokenNameIdentifier
current	TokenNameIdentifier
=	TokenNameEQUAL
terms	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
current	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
docIDUpto	TokenNameIdentifier
<	TokenNameLESS
current	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
terms	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
docIDUpto	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
numTermDeletes	TokenNameIdentifier
.	TokenNameDOT
incrementAndGet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
current	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
addAndGet	TokenNameIdentifier
(	TokenNameLPAREN
BYTES_PER_DEL_TERM	TokenNameIdentifier
+	TokenNamePLUS
term	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
RamUsageEstimator	TokenNameIdentifier
.	TokenNameDOT
NUM_BYTES_CHAR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
terms	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
queries	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docIDs	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
numTermDeletes	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
clearDocIDs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
bytesUsed	TokenNameIdentifier
.	TokenNameDOT
addAndGet	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
docIDs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
BYTES_PER_DEL_DOCID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docIDs	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
boolean	TokenNameboolean
any	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
terms	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
docIDs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
queries	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE