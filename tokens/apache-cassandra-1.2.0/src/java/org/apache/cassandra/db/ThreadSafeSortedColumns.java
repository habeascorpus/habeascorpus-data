package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
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
Collection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SortedMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
SortedSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
concurrent	TokenNameIdentifier
.	TokenNameDOT
ConcurrentSkipListMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
google	TokenNameIdentifier
.	TokenNameDOT
common	TokenNameIdentifier
.	TokenNameDOT
base	TokenNameIdentifier
.	TokenNameDOT
Function	TokenNameIdentifier
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
filter	TokenNameIdentifier
.	TokenNameDOT
ColumnSlice	TokenNameIdentifier
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
index	TokenNameIdentifier
.	TokenNameDOT
SecondaryIndexManager	TokenNameIdentifier
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
marshal	TokenNameIdentifier
.	TokenNameDOT
AbstractType	TokenNameIdentifier
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
Allocator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ThreadSafeSortedColumns	TokenNameIdentifier
extends	TokenNameextends
AbstractThreadUnsafeSortedColumns	TokenNameIdentifier
implements	TokenNameimplements
ISortedColumns	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
ConcurrentSkipListMap	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
>	TokenNameGREATER
map	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
ISortedColumns	TokenNameIdentifier
.	TokenNameDOT
Factory	TokenNameIdentifier
factory	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Factory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
ISortedColumns	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
comparator	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
insertReversed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ThreadSafeSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
comparator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ISortedColumns	TokenNameIdentifier
fromSorted	TokenNameIdentifier
(	TokenNameLPAREN
SortedMap	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
>	TokenNameGREATER
sortedMap	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
insertReversed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ThreadSafeSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
sortedMap	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
ISortedColumns	TokenNameIdentifier
.	TokenNameDOT
Factory	TokenNameIdentifier
factory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
factory	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
getComparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
)	TokenNameRPAREN
map	TokenNameIdentifier
.	TokenNameDOT
comparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ThreadSafeSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
comparator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
map	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ConcurrentSkipListMap	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
comparator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ThreadSafeSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
SortedMap	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
>	TokenNameGREATER
columns	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
map	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ConcurrentSkipListMap	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
columns	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ISortedColumns	TokenNameIdentifier
.	TokenNameDOT
Factory	TokenNameIdentifier
getFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
factory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ISortedColumns	TokenNameIdentifier
cloneMe	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ThreadSafeSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
map	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isInsertReversed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
,	TokenNameCOMMA
Allocator	TokenNameIdentifier
allocator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
addColumnInternal	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
,	TokenNameCOMMA
allocator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
long	TokenNamelong
addColumnInternal	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
,	TokenNameCOMMA
Allocator	TokenNameIdentifier
allocator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
column	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
IColumn	TokenNameIdentifier
oldColumn	TokenNameIdentifier
=	TokenNameEQUAL
map	TokenNameIdentifier
.	TokenNameDOT
putIfAbsent	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
column	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
oldColumn	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
column	TokenNameIdentifier
.	TokenNameDOT
dataSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
oldColumn	TokenNameIdentifier
instanceof	TokenNameinstanceof
SuperColumn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
column	TokenNameIdentifier
instanceof	TokenNameinstanceof
SuperColumn	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
previousSize	TokenNameIdentifier
=	TokenNameEQUAL
oldColumn	TokenNameIdentifier
.	TokenNameDOT
dataSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
SuperColumn	TokenNameIdentifier
)	TokenNameRPAREN
oldColumn	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
putColumn	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
SuperColumn	TokenNameIdentifier
)	TokenNameRPAREN
column	TokenNameIdentifier
,	TokenNameCOMMA
allocator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
oldColumn	TokenNameIdentifier
.	TokenNameDOT
dataSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
previousSize	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
IColumn	TokenNameIdentifier
reconciledColumn	TokenNameIdentifier
=	TokenNameEQUAL
column	TokenNameIdentifier
.	TokenNameDOT
reconcile	TokenNameIdentifier
(	TokenNameLPAREN
oldColumn	TokenNameIdentifier
,	TokenNameCOMMA
allocator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
map	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
oldColumn	TokenNameIdentifier
,	TokenNameCOMMA
reconciledColumn	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
reconciledColumn	TokenNameIdentifier
.	TokenNameDOT
dataSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
oldColumn	TokenNameIdentifier
.	TokenNameDOT
dataSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addAll	TokenNameIdentifier
(	TokenNameLPAREN
ISortedColumns	TokenNameIdentifier
cm	TokenNameIdentifier
,	TokenNameCOMMA
Allocator	TokenNameIdentifier
allocator	TokenNameIdentifier
,	TokenNameCOMMA
Function	TokenNameIdentifier
<	TokenNameLESS
IColumn	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
>	TokenNameGREATER
transformation	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
addAllWithSizeDelta	TokenNameIdentifier
(	TokenNameLPAREN
cm	TokenNameIdentifier
,	TokenNameCOMMA
allocator	TokenNameIdentifier
,	TokenNameCOMMA
transformation	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
long	TokenNamelong
addAllWithSizeDelta	TokenNameIdentifier
(	TokenNameLPAREN
ISortedColumns	TokenNameIdentifier
cm	TokenNameIdentifier
,	TokenNameCOMMA
Allocator	TokenNameIdentifier
allocator	TokenNameIdentifier
,	TokenNameCOMMA
Function	TokenNameIdentifier
<	TokenNameLESS
IColumn	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
>	TokenNameGREATER
transformation	TokenNameIdentifier
,	TokenNameCOMMA
SecondaryIndexManager	TokenNameIdentifier
.	TokenNameDOT
Updater	TokenNameIdentifier
indexer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
delete	TokenNameIdentifier
(	TokenNameLPAREN
cm	TokenNameIdentifier
.	TokenNameDOT
getDeletionInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
sizeDelta	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
:	TokenNameCOLON
cm	TokenNameIdentifier
.	TokenNameDOT
getSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
sizeDelta	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
addColumnInternal	TokenNameIdentifier
(	TokenNameLPAREN
transformation	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
allocator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sizeDelta	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
replace	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
oldColumn	TokenNameIdentifier
,	TokenNameCOMMA
IColumn	TokenNameIdentifier
newColumn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
oldColumn	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
newColumn	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
map	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
oldColumn	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
oldColumn	TokenNameIdentifier
,	TokenNameCOMMA
newColumn	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IColumn	TokenNameIdentifier
getColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
map	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
removeColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
map	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
map	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
map	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Collection	TokenNameIdentifier
<	TokenNameLESS
IColumn	TokenNameIdentifier
>	TokenNameGREATER
getSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
map	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Collection	TokenNameIdentifier
<	TokenNameLESS
IColumn	TokenNameIdentifier
>	TokenNameGREATER
getReverseSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
map	TokenNameIdentifier
.	TokenNameDOT
descendingMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SortedSet	TokenNameIdentifier
<	TokenNameLESS
ByteBuffer	TokenNameIdentifier
>	TokenNameGREATER
getColumnNames	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
map	TokenNameIdentifier
.	TokenNameDOT
navigableKeySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Iterator	TokenNameIdentifier
<	TokenNameLESS
IColumn	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
map	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Iterator	TokenNameIdentifier
<	TokenNameLESS
IColumn	TokenNameIdentifier
>	TokenNameGREATER
iterator	TokenNameIdentifier
(	TokenNameLPAREN
ColumnSlice	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
slices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ColumnSlice	TokenNameIdentifier
.	TokenNameDOT
NavigableMapIterator	TokenNameIdentifier
(	TokenNameLPAREN
map	TokenNameIdentifier
,	TokenNameCOMMA
slices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Iterator	TokenNameIdentifier
<	TokenNameLESS
IColumn	TokenNameIdentifier
>	TokenNameGREATER
reverseIterator	TokenNameIdentifier
(	TokenNameLPAREN
ColumnSlice	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
slices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ColumnSlice	TokenNameIdentifier
.	TokenNameDOT
NavigableMapIterator	TokenNameIdentifier
(	TokenNameLPAREN
map	TokenNameIdentifier
.	TokenNameDOT
descendingMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
slices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
