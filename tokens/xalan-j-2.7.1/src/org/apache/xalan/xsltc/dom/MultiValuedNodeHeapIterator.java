package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
DOM	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
runtime	TokenNameIdentifier
.	TokenNameDOT
BasisLibrary	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
DTMAxisIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
.	TokenNameDOT
DTMAxisIteratorBase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
MultiValuedNodeHeapIterator	TokenNameIdentifier
extends	TokenNameextends
DTMAxisIteratorBase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
HeapNode	TokenNameIdentifier
implements	TokenNameimplements
Cloneable	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
int	TokenNameint
_node	TokenNameIdentifier
,	TokenNameCOMMA
_markedNode	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
_isStartSet	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
int	TokenNameint
step	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
HeapNode	TokenNameIdentifier
cloneHeapNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
HeapNode	TokenNameIdentifier
clone	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
clone	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
HeapNode	TokenNameIdentifier
)	TokenNameRPAREN
super	TokenNamesuper
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
CloneNotSupportedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
runTimeError	TokenNameIdentifier
(	TokenNameLPAREN
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
ITERATOR_CLONE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
clone	TokenNameIdentifier
.	TokenNameDOT
_node	TokenNameIdentifier
=	TokenNameEQUAL
_node	TokenNameIdentifier
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
_markedNode	TokenNameIdentifier
=	TokenNameEQUAL
_node	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
clone	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setMark	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
_markedNode	TokenNameIdentifier
=	TokenNameEQUAL
_node	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
gotoMark	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
_node	TokenNameIdentifier
=	TokenNameEQUAL
_markedNode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
boolean	TokenNameboolean
isLessThan	TokenNameIdentifier
(	TokenNameLPAREN
HeapNode	TokenNameIdentifier
heapNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
HeapNode	TokenNameIdentifier
setStartNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
HeapNode	TokenNameIdentifier
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
InitSize	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_heapSize	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_size	TokenNameIdentifier
=	TokenNameEQUAL
InitSize	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
HeapNode	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
_heap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HeapNode	TokenNameIdentifier
[	TokenNameLBRACKET
InitSize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_free	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_returnedLast	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_cachedReturnedLast	TokenNameIdentifier
=	TokenNameEQUAL
END	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_cachedHeapSize	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DTMAxisIterator	TokenNameIdentifier
cloneIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
_isRestartable	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
final	TokenNamefinal
HeapNode	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
heapCopy	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HeapNode	TokenNameIdentifier
[	TokenNameLBRACKET
_heap	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
MultiValuedNodeHeapIterator	TokenNameIdentifier
clone	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MultiValuedNodeHeapIterator	TokenNameIdentifier
)	TokenNameRPAREN
super	TokenNamesuper
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
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
_free	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
heapCopy	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
cloneHeapNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
clone	TokenNameIdentifier
.	TokenNameDOT
setRestartable	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
_heap	TokenNameIdentifier
=	TokenNameEQUAL
heapCopy	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
clone	TokenNameIdentifier
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
CloneNotSupportedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
runTimeError	TokenNameIdentifier
(	TokenNameLPAREN
BasisLibrary	TokenNameIdentifier
.	TokenNameDOT
ITERATOR_CLONE_ERR	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
addHeapNode	TokenNameIdentifier
(	TokenNameLPAREN
HeapNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_free	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
_size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
HeapNode	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HeapNode	TokenNameIdentifier
[	TokenNameLBRACKET
_size	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
_heap	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
newArray	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
_free	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_heap	TokenNameIdentifier
=	TokenNameEQUAL
newArray	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_heapSize	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
_free	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
node	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
_heapSize	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
smallest	TokenNameIdentifier
=	TokenNameEQUAL
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
_node	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
smallest	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
END	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_heapSize	TokenNameIdentifier
>	TokenNameGREATER
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
HeapNode	TokenNameIdentifier
temp	TokenNameIdentifier
=	TokenNameEQUAL
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
--	TokenNameMINUS_MINUS
_heapSize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
_heapSize	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
temp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
END	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
smallest	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
_returnedLast	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
step	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
step	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
heapify	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
returnNode	TokenNameIdentifier
(	TokenNameLPAREN
_returnedLast	TokenNameIdentifier
=	TokenNameEQUAL
smallest	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
heapify	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
END	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DTMAxisIterator	TokenNameIdentifier
setStartNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
node	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_isRestartable	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_startNode	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
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
_free	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
_isStartSet	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
setStartNode	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
step	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
_isStartSet	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
_heapSize	TokenNameIdentifier
=	TokenNameEQUAL
_free	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
heapify	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_returnedLast	TokenNameIdentifier
=	TokenNameEQUAL
END	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
resetPosition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
_free	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_heapSize	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
_free	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
heapify	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
r	TokenNameIdentifier
,	TokenNameCOMMA
l	TokenNameIdentifier
,	TokenNameCOMMA
smallest	TokenNameIdentifier
;	TokenNameSEMICOLON
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
r	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
l	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
smallest	TokenNameIdentifier
=	TokenNameEQUAL
l	TokenNameIdentifier
<	TokenNameLESS
_heapSize	TokenNameIdentifier
&&	TokenNameAND_AND
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
l	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
isLessThan	TokenNameIdentifier
(	TokenNameLPAREN
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
?	TokenNameQUESTION
l	TokenNameIdentifier
:	TokenNameCOLON
i	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
<	TokenNameLESS
_heapSize	TokenNameIdentifier
&&	TokenNameAND_AND
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
r	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
isLessThan	TokenNameIdentifier
(	TokenNameLPAREN
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
smallest	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
smallest	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
smallest	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
HeapNode	TokenNameIdentifier
temp	TokenNameIdentifier
=	TokenNameEQUAL
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
smallest	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
smallest	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
temp	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
=	TokenNameEQUAL
smallest	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setMark	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
_free	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
setMark	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_cachedReturnedLast	TokenNameIdentifier
=	TokenNameEQUAL
_returnedLast	TokenNameIdentifier
;	TokenNameSEMICOLON
_cachedHeapSize	TokenNameIdentifier
=	TokenNameEQUAL
_heapSize	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
gotoMark	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
_free	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
gotoMark	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
_heapSize	TokenNameIdentifier
=	TokenNameEQUAL
_cachedHeapSize	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
heapify	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_returnedLast	TokenNameIdentifier
=	TokenNameEQUAL
_cachedReturnedLast	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DTMAxisIterator	TokenNameIdentifier
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
_free	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_heap	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
step	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
_heapSize	TokenNameIdentifier
=	TokenNameEQUAL
_free	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
heapify	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_returnedLast	TokenNameIdentifier
=	TokenNameEQUAL
END	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
resetPosition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
