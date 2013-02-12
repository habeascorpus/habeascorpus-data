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
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
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
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SliceQueryPager	TokenNameIdentifier
implements	TokenNameimplements
Iterator	TokenNameIdentifier
<	TokenNameLESS
ColumnFamily	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_PAGE_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
10000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
DecoratedKey	TokenNameIdentifier
key	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
ColumnSlice	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
slices	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
exhausted	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SliceQueryPager	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
,	TokenNameCOMMA
DecoratedKey	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
ColumnSlice	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
slices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
cfs	TokenNameIdentifier
=	TokenNameEQUAL
cfs	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
key	TokenNameIdentifier
=	TokenNameEQUAL
key	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
slices	TokenNameIdentifier
=	TokenNameEQUAL
slices	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
!	TokenNameNOT
exhausted	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ColumnFamily	TokenNameIdentifier
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
exhausted	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
QueryPath	TokenNameIdentifier
path	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
cfs	TokenNameIdentifier
.	TokenNameDOT
getColumnFamilyName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SliceQueryFilter	TokenNameIdentifier
sliceFilter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SliceQueryFilter	TokenNameIdentifier
(	TokenNameLPAREN
slices	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
DEFAULT_PAGE_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
QueryFilter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QueryFilter	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
path	TokenNameIdentifier
,	TokenNameCOMMA
sliceFilter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ColumnFamily	TokenNameIdentifier
cf	TokenNameIdentifier
=	TokenNameEQUAL
cfs	TokenNameIdentifier
.	TokenNameDOT
getColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cf	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
sliceFilter	TokenNameIdentifier
.	TokenNameDOT
getLiveCount	TokenNameIdentifier
(	TokenNameLPAREN
cf	TokenNameIdentifier
)	TokenNameRPAREN
<	TokenNameLESS
DEFAULT_PAGE_SIZE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
exhausted	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
Iterator	TokenNameIdentifier
<	TokenNameLESS
IColumn	TokenNameIdentifier
>	TokenNameGREATER
iter	TokenNameIdentifier
=	TokenNameEQUAL
cf	TokenNameIdentifier
.	TokenNameDOT
getReverseSortedColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IColumn	TokenNameIdentifier
lastColumn	TokenNameIdentifier
=	TokenNameEQUAL
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
lastColumn	TokenNameIdentifier
.	TokenNameDOT
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
lastColumn	TokenNameIdentifier
=	TokenNameEQUAL
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
slices	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ColumnSlice	TokenNameIdentifier
current	TokenNameIdentifier
=	TokenNameEQUAL
slices	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cfs	TokenNameIdentifier
.	TokenNameDOT
getComparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
compare	TokenNameIdentifier
(	TokenNameLPAREN
lastColumn	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
current	TokenNameIdentifier
.	TokenNameDOT
finish	TokenNameIdentifier
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
slices	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
exhausted	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
else	TokenNameelse
slices	TokenNameIdentifier
=	TokenNameEQUAL
Arrays	TokenNameIdentifier
.	TokenNameDOT
copyOfRange	TokenNameIdentifier
(	TokenNameLPAREN
slices	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
,	TokenNameCOMMA
slices	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
cf	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
cfs	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
cf	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
