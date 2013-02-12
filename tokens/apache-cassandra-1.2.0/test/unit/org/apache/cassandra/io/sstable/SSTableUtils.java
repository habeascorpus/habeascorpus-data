package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
sstable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
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
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
Column	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
ColumnFamily	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
DecoratedKey	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
DeletionInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
IColumn	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
columniterator	TokenNameIdentifier
.	TokenNameDOT
OnDiskAtomIterator	TokenNameIdentifier
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
Util	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
SSTableUtils	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
TABLENAME	TokenNameIdentifier
=	TokenNameEQUAL
"Keyspace1"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
CFNAME	TokenNameIdentifier
=	TokenNameEQUAL
"Standard1"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
ColumnFamily	TokenNameIdentifier
createCF	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
mfda	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
ldt	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
...	TokenNameELLIPSIS
cols	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
=	TokenNameEQUAL
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
TABLENAME	TokenNameIdentifier
,	TokenNameCOMMA
CFNAME	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
DeletionInfo	TokenNameIdentifier
(	TokenNameLPAREN
mfda	TokenNameIdentifier
,	TokenNameCOMMA
ldt	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
col	TokenNameIdentifier
:	TokenNameCOLON
cols	TokenNameIdentifier
)	TokenNameRPAREN
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
col	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
cf	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
File	TokenNameIdentifier
tempSSTableFile	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
tablename	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
cfname	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
tempSSTableFile	TokenNameIdentifier
(	TokenNameLPAREN
tablename	TokenNameIdentifier
,	TokenNameCOMMA
cfname	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
File	TokenNameIdentifier
tempSSTableFile	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
tablename	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
cfname	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
generation	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
tempdir	TokenNameIdentifier
=	TokenNameEQUAL
File	TokenNameIdentifier
.	TokenNameDOT
createTempFile	TokenNameIdentifier
(	TokenNameLPAREN
tablename	TokenNameIdentifier
,	TokenNameCOMMA
cfname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
tempdir	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
!	TokenNameNOT
tempdir	TokenNameIdentifier
.	TokenNameDOT
mkdir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"Temporary directory creation failed."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tempdir	TokenNameIdentifier
.	TokenNameDOT
deleteOnExit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
tabledir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
tempdir	TokenNameIdentifier
,	TokenNameCOMMA
tablename	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tabledir	TokenNameIdentifier
.	TokenNameDOT
mkdir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tabledir	TokenNameIdentifier
.	TokenNameDOT
deleteOnExit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
datafile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Descriptor	TokenNameIdentifier
(	TokenNameLPAREN
tabledir	TokenNameIdentifier
,	TokenNameCOMMA
tablename	TokenNameIdentifier
,	TokenNameCOMMA
cfname	TokenNameIdentifier
,	TokenNameCOMMA
generation	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
.	TokenNameDOT
filenameFor	TokenNameIdentifier
(	TokenNameLPAREN
"Data.db"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
datafile	TokenNameIdentifier
.	TokenNameDOT
createNewFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IOException	TokenNameIdentifier
(	TokenNameLPAREN
"unable to create file "	TokenNameStringLiteral
+	TokenNamePLUS
datafile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
datafile	TokenNameIdentifier
.	TokenNameDOT
deleteOnExit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
datafile	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
assertContentEquals	TokenNameIdentifier
(	TokenNameLPAREN
SSTableReader	TokenNameIdentifier
lhs	TokenNameIdentifier
,	TokenNameCOMMA
SSTableReader	TokenNameIdentifier
rhs	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
SSTableScanner	TokenNameIdentifier
slhs	TokenNameIdentifier
=	TokenNameEQUAL
lhs	TokenNameIdentifier
.	TokenNameDOT
getDirectScanner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SSTableScanner	TokenNameIdentifier
srhs	TokenNameIdentifier
=	TokenNameEQUAL
rhs	TokenNameIdentifier
.	TokenNameDOT
getDirectScanner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
slhs	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
OnDiskAtomIterator	TokenNameIdentifier
ilhs	TokenNameIdentifier
=	TokenNameEQUAL
slhs	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
srhs	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
"LHS contained more rows than RHS"	TokenNameStringLiteral
;	TokenNameSEMICOLON
OnDiskAtomIterator	TokenNameIdentifier
irhs	TokenNameIdentifier
=	TokenNameEQUAL
srhs	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertContentEquals	TokenNameIdentifier
(	TokenNameLPAREN
ilhs	TokenNameIdentifier
,	TokenNameCOMMA
irhs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
!	TokenNameNOT
srhs	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
"RHS contained more rows than LHS"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
assertContentEquals	TokenNameIdentifier
(	TokenNameLPAREN
OnDiskAtomIterator	TokenNameIdentifier
lhs	TokenNameIdentifier
,	TokenNameCOMMA
OnDiskAtomIterator	TokenNameIdentifier
rhs	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
lhs	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rhs	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnFamily	TokenNameIdentifier
lcf	TokenNameIdentifier
=	TokenNameEQUAL
lhs	TokenNameIdentifier
.	TokenNameDOT
getColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnFamily	TokenNameIdentifier
rcf	TokenNameIdentifier
=	TokenNameEQUAL
rhs	TokenNameIdentifier
.	TokenNameDOT
getColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lcf	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
rcf	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
AssertionError	TokenNameIdentifier
(	TokenNameLPAREN
"LHS had no content for "	TokenNameStringLiteral
+	TokenNamePLUS
rhs	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
rcf	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
AssertionError	TokenNameIdentifier
(	TokenNameLPAREN
"RHS had no content for "	TokenNameStringLiteral
+	TokenNamePLUS
lhs	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
lcf	TokenNameIdentifier
.	TokenNameDOT
deletionInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rcf	TokenNameIdentifier
.	TokenNameDOT
deletionInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
lhs	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
IColumn	TokenNameIdentifier
clhs	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
)	TokenNameRPAREN
lhs	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
rhs	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
"LHS contained more columns than RHS for "	TokenNameStringLiteral
+	TokenNamePLUS
lhs	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IColumn	TokenNameIdentifier
crhs	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
)	TokenNameRPAREN
rhs	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Mismatched columns for "	TokenNameStringLiteral
+	TokenNamePLUS
lhs	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
clhs	TokenNameIdentifier
,	TokenNameCOMMA
crhs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assert	TokenNameassert
!	TokenNameNOT
rhs	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
"RHS contained more columns than LHS for "	TokenNameStringLiteral
+	TokenNamePLUS
lhs	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Context	TokenNameIdentifier
prepare	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Context	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
Context	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
ksname	TokenNameIdentifier
=	TokenNameEQUAL
TABLENAME	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
cfname	TokenNameIdentifier
=	TokenNameEQUAL
CFNAME	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Descriptor	TokenNameIdentifier
dest	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
cleanup	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
generation	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Context	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Context	TokenNameIdentifier
ks	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
ksname	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
ksname	TokenNameIdentifier
=	TokenNameEQUAL
ksname	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Context	TokenNameIdentifier
cf	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
cfname	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
cfname	TokenNameIdentifier
=	TokenNameEQUAL
cfname	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Context	TokenNameIdentifier
dest	TokenNameIdentifier
(	TokenNameLPAREN
Descriptor	TokenNameIdentifier
dest	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
dest	TokenNameIdentifier
=	TokenNameEQUAL
dest	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
cleanup	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Context	TokenNameIdentifier
generation	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
generation	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
generation	TokenNameIdentifier
=	TokenNameEQUAL
generation	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SSTableReader	TokenNameIdentifier
write	TokenNameIdentifier
(	TokenNameLPAREN
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
keys	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamily	TokenNameIdentifier
>	TokenNameGREATER
map	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamily	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
key	TokenNameIdentifier
:	TokenNameCOLON
keys	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
=	TokenNameEQUAL
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ksname	TokenNameIdentifier
,	TokenNameCOMMA
cfname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cf	TokenNameIdentifier
.	TokenNameDOT
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
map	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
cf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
write	TokenNameIdentifier
(	TokenNameLPAREN
map	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SSTableReader	TokenNameIdentifier
write	TokenNameIdentifier
(	TokenNameLPAREN
SortedMap	TokenNameIdentifier
<	TokenNameLESS
DecoratedKey	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamily	TokenNameIdentifier
>	TokenNameGREATER
sorted	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
Iterator	TokenNameIdentifier
<	TokenNameLESS
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
DecoratedKey	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamily	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
iter	TokenNameIdentifier
=	TokenNameEQUAL
sorted	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
write	TokenNameIdentifier
(	TokenNameLPAREN
sorted	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
Appender	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
append	TokenNameIdentifier
(	TokenNameLPAREN
SSTableWriter	TokenNameIdentifier
writer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
DecoratedKey	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamily	TokenNameIdentifier
>	TokenNameGREATER
entry	TokenNameIdentifier
=	TokenNameEQUAL
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
entry	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SSTableReader	TokenNameIdentifier
write	TokenNameIdentifier
(	TokenNameLPAREN
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamily	TokenNameIdentifier
>	TokenNameGREATER
entries	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
SortedMap	TokenNameIdentifier
<	TokenNameLESS
DecoratedKey	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamily	TokenNameIdentifier
>	TokenNameGREATER
sorted	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeMap	TokenNameIdentifier
<	TokenNameLESS
DecoratedKey	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamily	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
ColumnFamily	TokenNameIdentifier
>	TokenNameGREATER
entry	TokenNameIdentifier
:	TokenNameCOLON
entries	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
sorted	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
Util	TokenNameIdentifier
.	TokenNameDOT
dk	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
entry	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
write	TokenNameIdentifier
(	TokenNameLPAREN
sorted	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SSTableReader	TokenNameIdentifier
write	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
expectedSize	TokenNameIdentifier
,	TokenNameCOMMA
Appender	TokenNameIdentifier
appender	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
datafile	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
dest	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
tempSSTableFile	TokenNameIdentifier
(	TokenNameLPAREN
ksname	TokenNameIdentifier
,	TokenNameCOMMA
cfname	TokenNameIdentifier
,	TokenNameCOMMA
generation	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
dest	TokenNameIdentifier
.	TokenNameDOT
filenameFor	TokenNameIdentifier
(	TokenNameLPAREN
Component	TokenNameIdentifier
.	TokenNameDOT
DATA	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SSTableWriter	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SSTableWriter	TokenNameIdentifier
(	TokenNameLPAREN
datafile	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
expectedSize	TokenNameIdentifier
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
while	TokenNamewhile
(	TokenNameLPAREN
appender	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
SSTableReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
writer	TokenNameIdentifier
.	TokenNameDOT
closeAndOpenReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cleanup	TokenNameIdentifier
)	TokenNameRPAREN
for	TokenNamefor
(	TokenNameLPAREN
Component	TokenNameIdentifier
component	TokenNameIdentifier
:	TokenNameCOLON
reader	TokenNameIdentifier
.	TokenNameDOT
components	TokenNameIdentifier
)	TokenNameRPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
.	TokenNameDOT
descriptor	TokenNameIdentifier
.	TokenNameDOT
filenameFor	TokenNameIdentifier
(	TokenNameLPAREN
component	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
deleteOnExit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
reader	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
abstract	TokenNameabstract
class	TokenNameclass
Appender	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
abstract	TokenNameabstract
boolean	TokenNameboolean
append	TokenNameIdentifier
(	TokenNameLPAREN
SSTableWriter	TokenNameIdentifier
writer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE