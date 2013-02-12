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
io	TokenNameIdentifier
.	TokenNameDOT
Closeable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
DoubleBarrelLRUCache	TokenNameIdentifier
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
CloseableThreadLocal	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
TermInfosReader	TokenNameIdentifier
implements	TokenNameimplements
Closeable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Directory	TokenNameIdentifier
directory	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
segment	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
FieldInfos	TokenNameIdentifier
fieldInfos	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
CloseableThreadLocal	TokenNameIdentifier
<	TokenNameLESS
ThreadResources	TokenNameIdentifier
>	TokenNameGREATER
threadResources	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CloseableThreadLocal	TokenNameIdentifier
<	TokenNameLESS
ThreadResources	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
SegmentTermEnum	TokenNameIdentifier
origEnum	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
long	TokenNamelong
size	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
TermInfosReaderIndex	TokenNameIdentifier
index	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
indexLength	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
totalIndexInterval	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
DEFAULT_CACHE_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
1024	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
class	TokenNameclass
TermInfoAndOrd	TokenNameIdentifier
extends	TokenNameextends
TermInfo	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
long	TokenNamelong
termOrd	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
TermInfoAndOrd	TokenNameIdentifier
(	TokenNameLPAREN
TermInfo	TokenNameIdentifier
ti	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
termOrd	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
ti	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
termOrd	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
termOrd	TokenNameIdentifier
=	TokenNameEQUAL
termOrd	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
CloneableTerm	TokenNameIdentifier
extends	TokenNameextends
DoubleBarrelLRUCache	TokenNameIdentifier
.	TokenNameDOT
CloneableKey	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Term	TokenNameIdentifier
term	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
CloneableTerm	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
term	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Term	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
.	TokenNameDOT
field	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
t	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
Object	TokenNameIdentifier
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
CloneableTerm	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
_other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CloneableTerm	TokenNameIdentifier
other	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CloneableTerm	TokenNameIdentifier
)	TokenNameRPAREN
_other	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
term	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
term	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
DoubleBarrelLRUCache	TokenNameIdentifier
<	TokenNameLESS
CloneableTerm	TokenNameIdentifier
,	TokenNameCOMMA
TermInfoAndOrd	TokenNameIdentifier
>	TokenNameGREATER
termsCache	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DoubleBarrelLRUCache	TokenNameIdentifier
<	TokenNameLESS
CloneableTerm	TokenNameIdentifier
,	TokenNameCOMMA
TermInfoAndOrd	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
DEFAULT_CACHE_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
ThreadResources	TokenNameIdentifier
{	TokenNameLBRACE
SegmentTermEnum	TokenNameIdentifier
termEnum	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
TermInfosReader	TokenNameIdentifier
(	TokenNameLPAREN
Directory	TokenNameIdentifier
dir	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
seg	TokenNameIdentifier
,	TokenNameCOMMA
FieldInfos	TokenNameIdentifier
fis	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
readBufferSize	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
indexDivisor	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
CorruptIndexException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
boolean	TokenNameboolean
success	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
indexDivisor	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
&&	TokenNameAND_AND
indexDivisor	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"indexDivisor must be -1 (don't load terms index) or greater than 0: got "	TokenNameStringLiteral
+	TokenNamePLUS
indexDivisor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
directory	TokenNameIdentifier
=	TokenNameEQUAL
dir	TokenNameIdentifier
;	TokenNameSEMICOLON
segment	TokenNameIdentifier
=	TokenNameEQUAL
seg	TokenNameIdentifier
;	TokenNameSEMICOLON
fieldInfos	TokenNameIdentifier
=	TokenNameEQUAL
fis	TokenNameIdentifier
;	TokenNameSEMICOLON
origEnum	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SegmentTermEnum	TokenNameIdentifier
(	TokenNameLPAREN
directory	TokenNameIdentifier
.	TokenNameDOT
openInput	TokenNameIdentifier
(	TokenNameLPAREN
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
segmentFileName	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
,	TokenNameCOMMA
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
TERMS_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
readBufferSize	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
fieldInfos	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
=	TokenNameEQUAL
origEnum	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
indexDivisor	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
totalIndexInterval	TokenNameIdentifier
=	TokenNameEQUAL
origEnum	TokenNameIdentifier
.	TokenNameDOT
indexInterval	TokenNameIdentifier
*	TokenNameMULTIPLY
indexDivisor	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
indexFileName	TokenNameIdentifier
=	TokenNameEQUAL
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
segmentFileName	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
,	TokenNameCOMMA
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
TERMS_INDEX_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
SegmentTermEnum	TokenNameIdentifier
indexEnum	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SegmentTermEnum	TokenNameIdentifier
(	TokenNameLPAREN
directory	TokenNameIdentifier
.	TokenNameDOT
openInput	TokenNameIdentifier
(	TokenNameLPAREN
indexFileName	TokenNameIdentifier
,	TokenNameCOMMA
readBufferSize	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
fieldInfos	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
index	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TermInfosReaderIndex	TokenNameIdentifier
(	TokenNameLPAREN
indexEnum	TokenNameIdentifier
,	TokenNameCOMMA
indexDivisor	TokenNameIdentifier
,	TokenNameCOMMA
dir	TokenNameIdentifier
.	TokenNameDOT
fileLength	TokenNameIdentifier
(	TokenNameLPAREN
indexFileName	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
totalIndexInterval	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
indexLength	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
indexEnum	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
totalIndexInterval	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
index	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
indexLength	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
success	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
success	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getSkipInterval	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
origEnum	TokenNameIdentifier
.	TokenNameDOT
skipInterval	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getMaxSkipLevels	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
origEnum	TokenNameIdentifier
.	TokenNameDOT
maxSkipLevels	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
origEnum	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
origEnum	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
threadResources	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
long	TokenNamelong
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ThreadResources	TokenNameIdentifier
getThreadResources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ThreadResources	TokenNameIdentifier
resources	TokenNameIdentifier
=	TokenNameEQUAL
threadResources	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
resources	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
resources	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ThreadResources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
resources	TokenNameIdentifier
.	TokenNameDOT
termEnum	TokenNameIdentifier
=	TokenNameEQUAL
terms	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
threadResources	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
resources	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
resources	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
TermInfo	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
term	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
BytesRef	TokenNameIdentifier
termBytesRef	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
get	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
termBytesRef	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
TermInfo	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
term	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
mustSeekEnum	TokenNameIdentifier
,	TokenNameCOMMA
BytesRef	TokenNameIdentifier
termBytesRef	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
size	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
ensureIndexIsRead	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
CloneableTerm	TokenNameIdentifier
cacheKey	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CloneableTerm	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TermInfoAndOrd	TokenNameIdentifier
tiOrd	TokenNameIdentifier
=	TokenNameEQUAL
termsCache	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
cacheKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ThreadResources	TokenNameIdentifier
resources	TokenNameIdentifier
=	TokenNameEQUAL
getThreadResources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
mustSeekEnum	TokenNameIdentifier
&&	TokenNameAND_AND
tiOrd	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
tiOrd	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
SegmentTermEnum	TokenNameIdentifier
enumerator	TokenNameIdentifier
=	TokenNameEQUAL
resources	TokenNameIdentifier
.	TokenNameDOT
termEnum	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
(	TokenNameLPAREN
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
prev	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
term	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
prev	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
term	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
enumOffset	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
/	TokenNameDIVIDE
totalIndexInterval	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
indexLength	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
enumOffset	TokenNameIdentifier
||	TokenNameOR_OR
index	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
,	TokenNameCOMMA
termBytesRef	TokenNameIdentifier
,	TokenNameCOMMA
enumOffset	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
TermInfo	TokenNameIdentifier
ti	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
numScans	TokenNameIdentifier
=	TokenNameEQUAL
enumerator	TokenNameIdentifier
.	TokenNameDOT
scanTo	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
term	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
ti	TokenNameIdentifier
=	TokenNameEQUAL
enumerator	TokenNameIdentifier
.	TokenNameDOT
termInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
numScans	TokenNameIdentifier
>	TokenNameGREATER
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tiOrd	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
termsCache	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
cacheKey	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
TermInfoAndOrd	TokenNameIdentifier
(	TokenNameLPAREN
ti	TokenNameIdentifier
,	TokenNameCOMMA
enumerator	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assert	TokenNameassert
sameTermInfo	TokenNameIdentifier
(	TokenNameLPAREN
ti	TokenNameIdentifier
,	TokenNameCOMMA
tiOrd	TokenNameIdentifier
,	TokenNameCOMMA
enumerator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
tiOrd	TokenNameIdentifier
.	TokenNameDOT
termOrd	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
ti	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ti	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
indexPos	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tiOrd	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
indexPos	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
tiOrd	TokenNameIdentifier
.	TokenNameDOT
termOrd	TokenNameIdentifier
/	TokenNameDIVIDE
totalIndexInterval	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
indexPos	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
.	TokenNameDOT
getIndexOffset	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
,	TokenNameCOMMA
termBytesRef	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
index	TokenNameIdentifier
.	TokenNameDOT
seekEnum	TokenNameIdentifier
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
,	TokenNameCOMMA
indexPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
enumerator	TokenNameIdentifier
.	TokenNameDOT
scanTo	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
TermInfo	TokenNameIdentifier
ti	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
term	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
ti	TokenNameIdentifier
=	TokenNameEQUAL
enumerator	TokenNameIdentifier
.	TokenNameDOT
termInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tiOrd	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
termsCache	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
cacheKey	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
TermInfoAndOrd	TokenNameIdentifier
(	TokenNameLPAREN
ti	TokenNameIdentifier
,	TokenNameCOMMA
enumerator	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assert	TokenNameassert
sameTermInfo	TokenNameIdentifier
(	TokenNameLPAREN
ti	TokenNameIdentifier
,	TokenNameCOMMA
tiOrd	TokenNameIdentifier
,	TokenNameCOMMA
enumerator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
enumerator	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
tiOrd	TokenNameIdentifier
.	TokenNameDOT
termOrd	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
ti	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ti	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
sameTermInfo	TokenNameIdentifier
(	TokenNameLPAREN
TermInfo	TokenNameIdentifier
ti1	TokenNameIdentifier
,	TokenNameCOMMA
TermInfo	TokenNameIdentifier
ti2	TokenNameIdentifier
,	TokenNameCOMMA
SegmentTermEnum	TokenNameIdentifier
enumerator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ti1	TokenNameIdentifier
.	TokenNameDOT
docFreq	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
ti2	TokenNameIdentifier
.	TokenNameDOT
docFreq	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ti1	TokenNameIdentifier
.	TokenNameDOT
freqPointer	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
ti2	TokenNameIdentifier
.	TokenNameDOT
freqPointer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ti1	TokenNameIdentifier
.	TokenNameDOT
proxPointer	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
ti2	TokenNameIdentifier
.	TokenNameDOT
proxPointer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ti1	TokenNameIdentifier
.	TokenNameDOT
docFreq	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
enumerator	TokenNameIdentifier
.	TokenNameDOT
skipInterval	TokenNameIdentifier
&&	TokenNameAND_AND
ti1	TokenNameIdentifier
.	TokenNameDOT
skipOffset	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
ti2	TokenNameIdentifier
.	TokenNameDOT
skipOffset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
ensureIndexIsRead	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"terms index was not loaded when this reader was created"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
final	TokenNamefinal
long	TokenNamelong
getPosition	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
term	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
size	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
ensureIndexIsRead	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BytesRef	TokenNameIdentifier
termBytesRef	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
indexOffset	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
.	TokenNameDOT
getIndexOffset	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
,	TokenNameCOMMA
termBytesRef	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SegmentTermEnum	TokenNameIdentifier
enumerator	TokenNameIdentifier
=	TokenNameEQUAL
getThreadResources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
termEnum	TokenNameIdentifier
;	TokenNameSEMICOLON
index	TokenNameIdentifier
.	TokenNameDOT
seekEnum	TokenNameIdentifier
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
,	TokenNameCOMMA
indexOffset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
term	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
enumerator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
term	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
enumerator	TokenNameIdentifier
.	TokenNameDOT
term	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
enumerator	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SegmentTermEnum	TokenNameIdentifier
terms	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
SegmentTermEnum	TokenNameIdentifier
)	TokenNameRPAREN
origEnum	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SegmentTermEnum	TokenNameIdentifier
terms	TokenNameIdentifier
(	TokenNameLPAREN
Term	TokenNameIdentifier
term	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
BytesRef	TokenNameIdentifier
termBytesRef	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
get	TokenNameIdentifier
(	TokenNameLPAREN
term	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
termBytesRef	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
SegmentTermEnum	TokenNameIdentifier
)	TokenNameRPAREN
getThreadResources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
termEnum	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE