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
Serializable	TokenNameIdentifier
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
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
WeakHashMap	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
FixedBitSet	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CachingWrapperFilter	TokenNameIdentifier
extends	TokenNameextends
Filter	TokenNameIdentifier
{	TokenNameLBRACE
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
enum	TokenNameenum
DeletesMode	TokenNameIdentifier
{	TokenNameLBRACE
IGNORE	TokenNameIdentifier
,	TokenNameCOMMA
RECACHE	TokenNameIdentifier
,	TokenNameCOMMA
DYNAMIC	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
FilterCache	TokenNameIdentifier
<	TokenNameLESS
DocIdSet	TokenNameIdentifier
>	TokenNameGREATER
cache	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
abstract	TokenNameabstract
class	TokenNameclass
FilterCache	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
implements	TokenNameimplements
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
transient	TokenNametransient
Map	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
>	TokenNameGREATER
cache	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
DeletesMode	TokenNameIdentifier
deletesMode	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FilterCache	TokenNameIdentifier
(	TokenNameLPAREN
DeletesMode	TokenNameIdentifier
deletesMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
deletesMode	TokenNameIdentifier
=	TokenNameEQUAL
deletesMode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
T	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
coreKey	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
delCoreKey	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
T	TokenNameIdentifier
value	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cache	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
cache	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
WeakHashMap	TokenNameIdentifier
<	TokenNameLESS
Object	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
deletesMode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DeletesMode	TokenNameIdentifier
.	TokenNameDOT
IGNORE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
value	TokenNameIdentifier
=	TokenNameEQUAL
cache	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
coreKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
deletesMode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DeletesMode	TokenNameIdentifier
.	TokenNameDOT
RECACHE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
value	TokenNameIdentifier
=	TokenNameEQUAL
cache	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
delCoreKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assert	TokenNameassert
deletesMode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DeletesMode	TokenNameIdentifier
.	TokenNameDOT
DYNAMIC	TokenNameIdentifier
;	TokenNameSEMICOLON
value	TokenNameIdentifier
=	TokenNameEQUAL
cache	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
delCoreKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
value	TokenNameIdentifier
=	TokenNameEQUAL
cache	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
coreKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
reader	TokenNameIdentifier
.	TokenNameDOT
hasDeletions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
value	TokenNameIdentifier
=	TokenNameEQUAL
mergeDeletes	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
abstract	TokenNameabstract
T	TokenNameIdentifier
mergeDeletes	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
put	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
coreKey	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
delCoreKey	TokenNameIdentifier
,	TokenNameCOMMA
T	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
deletesMode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DeletesMode	TokenNameIdentifier
.	TokenNameDOT
IGNORE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cache	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
coreKey	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
deletesMode	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DeletesMode	TokenNameIdentifier
.	TokenNameDOT
RECACHE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cache	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
delCoreKey	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
cache	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
coreKey	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cache	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
delCoreKey	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
CachingWrapperFilter	TokenNameIdentifier
(	TokenNameLPAREN
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
filter	TokenNameIdentifier
,	TokenNameCOMMA
DeletesMode	TokenNameIdentifier
.	TokenNameDOT
IGNORE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CachingWrapperFilter	TokenNameIdentifier
(	TokenNameLPAREN
Filter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
DeletesMode	TokenNameIdentifier
deletesMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
filter	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
cache	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FilterCache	TokenNameIdentifier
<	TokenNameLESS
DocIdSet	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
deletesMode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
DocIdSet	TokenNameIdentifier
mergeDeletes	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
IndexReader	TokenNameIdentifier
r	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
DocIdSet	TokenNameIdentifier
docIdSet	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FilteredDocIdSet	TokenNameIdentifier
(	TokenNameLPAREN
docIdSet	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
boolean	TokenNameboolean
match	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
docID	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
!	TokenNameNOT
r	TokenNameIdentifier
.	TokenNameDOT
isDeleted	TokenNameIdentifier
(	TokenNameLPAREN
docID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
DocIdSet	TokenNameIdentifier
docIdSetToCache	TokenNameIdentifier
(	TokenNameLPAREN
DocIdSet	TokenNameIdentifier
docIdSet	TokenNameIdentifier
,	TokenNameCOMMA
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
docIdSet	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
DocIdSet	TokenNameIdentifier
.	TokenNameDOT
EMPTY_DOCIDSET	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
docIdSet	TokenNameIdentifier
.	TokenNameDOT
isCacheable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
docIdSet	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
final	TokenNamefinal
DocIdSetIterator	TokenNameIdentifier
it	TokenNameIdentifier
=	TokenNameEQUAL
docIdSet	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
it	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
DocIdSet	TokenNameIdentifier
.	TokenNameDOT
EMPTY_DOCIDSET	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
final	TokenNamefinal
FixedBitSet	TokenNameIdentifier
bits	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FixedBitSet	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bits	TokenNameIdentifier
.	TokenNameDOT
or	TokenNameIdentifier
(	TokenNameLPAREN
it	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
bits	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
hitCount	TokenNameIdentifier
,	TokenNameCOMMA
missCount	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
DocIdSet	TokenNameIdentifier
getDocIdSet	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
Object	TokenNameIdentifier
coreKey	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
getCoreCacheKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Object	TokenNameIdentifier
delCoreKey	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
hasDeletions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
reader	TokenNameIdentifier
.	TokenNameDOT
getDeletesCacheKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
coreKey	TokenNameIdentifier
;	TokenNameSEMICOLON
DocIdSet	TokenNameIdentifier
docIdSet	TokenNameIdentifier
=	TokenNameEQUAL
cache	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
coreKey	TokenNameIdentifier
,	TokenNameCOMMA
delCoreKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
docIdSet	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
hitCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
return	TokenNamereturn
docIdSet	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
missCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
docIdSet	TokenNameIdentifier
=	TokenNameEQUAL
docIdSetToCache	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
.	TokenNameDOT
getDocIdSet	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
docIdSet	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
cache	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
coreKey	TokenNameIdentifier
,	TokenNameCOMMA
delCoreKey	TokenNameIdentifier
,	TokenNameCOMMA
docIdSet	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
docIdSet	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"CachingWrapperFilter("	TokenNameStringLiteral
+	TokenNamePLUS
filter	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
o	TokenNameIdentifier
instanceof	TokenNameinstanceof
CachingWrapperFilter	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
filter	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
CachingWrapperFilter	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
filter	TokenNameIdentifier
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
filter	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
^	TokenNameXOR
0x1117BF25	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
