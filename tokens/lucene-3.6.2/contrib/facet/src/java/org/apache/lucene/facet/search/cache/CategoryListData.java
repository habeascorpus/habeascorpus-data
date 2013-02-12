package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
cache	TokenNameIdentifier
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
facet	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
params	TokenNameIdentifier
.	TokenNameDOT
CategoryListParams	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
params	TokenNameIdentifier
.	TokenNameDOT
FacetIndexingParams	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
CategoryListIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
taxonomy	TokenNameIdentifier
.	TokenNameDOT
TaxonomyReader	TokenNameIdentifier
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
collections	TokenNameIdentifier
.	TokenNameDOT
IntArray	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CategoryListData	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
transient	TokenNametransient
volatile	TokenNamevolatile
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
docPartitionCategories	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
CategoryListData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
CategoryListData	TokenNameIdentifier
(	TokenNameLPAREN
IndexReader	TokenNameIdentifier
reader	TokenNameIdentifier
,	TokenNameCOMMA
TaxonomyReader	TokenNameIdentifier
taxo	TokenNameIdentifier
,	TokenNameCOMMA
FacetIndexingParams	TokenNameIdentifier
iparams	TokenNameIdentifier
,	TokenNameCOMMA
CategoryListParams	TokenNameIdentifier
clp	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
maxDoc	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
maxDoc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
dpf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
maxDoc	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
numPartitions	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
ceil	TokenNameIdentifier
(	TokenNameLPAREN
taxo	TokenNameIdentifier
.	TokenNameDOT
getSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
(	TokenNameLPAREN
double	TokenNamedouble
)	TokenNameRPAREN
iparams	TokenNameIdentifier
.	TokenNameDOT
getPartitionSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IntArray	TokenNameIdentifier
docCategories	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IntArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
part	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
part	TokenNameIdentifier
<	TokenNameLESS
numPartitions	TokenNameIdentifier
;	TokenNameSEMICOLON
part	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
CategoryListIterator	TokenNameIdentifier
cli	TokenNameIdentifier
=	TokenNameEQUAL
clp	TokenNameIdentifier
.	TokenNameDOT
createCategoryListIterator	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
part	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cli	TokenNameIdentifier
.	TokenNameDOT
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
doc	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
<	TokenNameLESS
maxDoc	TokenNameIdentifier
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
cli	TokenNameIdentifier
.	TokenNameDOT
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
docCategories	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dpf	TokenNameIdentifier
[	TokenNameLBRACKET
doc	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
dpf	TokenNameIdentifier
[	TokenNameLBRACKET
doc	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
numPartitions	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
long	TokenNamelong
category	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
category	TokenNameIdentifier
=	TokenNameEQUAL
cli	TokenNameIdentifier
.	TokenNameDOT
nextCategory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
docCategories	TokenNameIdentifier
.	TokenNameDOT
addToArray	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
category	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
docCategories	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dpf	TokenNameIdentifier
[	TokenNameLBRACKET
doc	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
part	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
size	TokenNameIdentifier
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
size	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
dpf	TokenNameIdentifier
[	TokenNameLBRACKET
doc	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
part	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
docCategories	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
docPartitionCategories	TokenNameIdentifier
=	TokenNameEQUAL
dpf	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CategoryListIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
partition	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
RAMCategoryListIterator	TokenNameIdentifier
(	TokenNameLPAREN
partition	TokenNameIdentifier
,	TokenNameCOMMA
docPartitionCategories	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
class	TokenNameclass
RAMCategoryListIterator	TokenNameIdentifier
implements	TokenNameimplements
CategoryListIterator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
part	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
dpc	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
currDoc	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
nextCategoryIndex	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
RAMCategoryListIterator	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
part	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
docPartitionCategories	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
part	TokenNameIdentifier
=	TokenNameEQUAL
part	TokenNameIdentifier
;	TokenNameSEMICOLON
dpc	TokenNameIdentifier
=	TokenNameEQUAL
docPartitionCategories	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
dpc	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
dpc	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
part	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
nextCategory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
nextCategoryIndex	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
dpc	TokenNameIdentifier
[	TokenNameLBRACKET
currDoc	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
part	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
1L	TokenNameLongLiteral
+	TokenNamePLUS
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
dpc	TokenNameIdentifier
[	TokenNameLBRACKET
currDoc	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
part	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
nextCategoryIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
skipTo	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
docId	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
boolean	TokenNameboolean
res	TokenNameIdentifier
=	TokenNameEQUAL
dpc	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
docId	TokenNameIdentifier
&&	TokenNameAND_AND
dpc	TokenNameIdentifier
[	TokenNameLBRACKET
docId	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
dpc	TokenNameIdentifier
[	TokenNameLBRACKET
docId	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
part	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
currDoc	TokenNameIdentifier
=	TokenNameEQUAL
docId	TokenNameIdentifier
;	TokenNameSEMICOLON
nextCategoryIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
