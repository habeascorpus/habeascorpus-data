package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
CollationKey	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
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
DTM	TokenNameIdentifier
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
DTMIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
XPathContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
.	TokenNameDOT
XNodeSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
.	TokenNameDOT
XObject	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
NodeSorter	TokenNameIdentifier
{	TokenNameLBRACE
XPathContext	TokenNameIdentifier
m_execContext	TokenNameIdentifier
;	TokenNameSEMICOLON
Vector	TokenNameIdentifier
m_keys	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
NodeSorter	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
p	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_execContext	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
sort	TokenNameIdentifier
(	TokenNameLPAREN
DTMIterator	TokenNameIdentifier
v	TokenNameIdentifier
,	TokenNameCOMMA
Vector	TokenNameIdentifier
keys	TokenNameIdentifier
,	TokenNameCOMMA
XPathContext	TokenNameIdentifier
support	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
m_keys	TokenNameIdentifier
=	TokenNameEQUAL
keys	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
n	TokenNameIdentifier
=	TokenNameEQUAL
v	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Vector	TokenNameIdentifier
nodes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
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
n	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
NodeCompareElem	TokenNameIdentifier
elem	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NodeCompareElem	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nodes	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
elem	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Vector	TokenNameIdentifier
scratchVector	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mergesort	TokenNameIdentifier
(	TokenNameLPAREN
nodes	TokenNameIdentifier
,	TokenNameCOMMA
scratchVector	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
n	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
support	TokenNameIdentifier
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
n	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
v	TokenNameIdentifier
.	TokenNameDOT
setItem	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
NodeCompareElem	TokenNameIdentifier
)	TokenNameRPAREN
nodes	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
m_node	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
v	TokenNameIdentifier
.	TokenNameDOT
setCurrentPos	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
compare	TokenNameIdentifier
(	TokenNameLPAREN
NodeCompareElem	TokenNameIdentifier
n1	TokenNameIdentifier
,	TokenNameCOMMA
NodeCompareElem	TokenNameIdentifier
n2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
kIndex	TokenNameIdentifier
,	TokenNameCOMMA
XPathContext	TokenNameIdentifier
support	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
result	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
NodeSortKey	TokenNameIdentifier
k	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
NodeSortKey	TokenNameIdentifier
)	TokenNameRPAREN
m_keys	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
kIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
k	TokenNameIdentifier
.	TokenNameDOT
m_treatAsNumbers	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
n1Num	TokenNameIdentifier
,	TokenNameCOMMA
n2Num	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
kIndex	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
n1Num	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Double	TokenNameIdentifier
)	TokenNameRPAREN
n1	TokenNameIdentifier
.	TokenNameDOT
m_key1Value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doubleValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
n2Num	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Double	TokenNameIdentifier
)	TokenNameRPAREN
n2	TokenNameIdentifier
.	TokenNameDOT
m_key1Value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doubleValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
kIndex	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
n1Num	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Double	TokenNameIdentifier
)	TokenNameRPAREN
n1	TokenNameIdentifier
.	TokenNameDOT
m_key2Value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doubleValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
n2Num	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Double	TokenNameIdentifier
)	TokenNameRPAREN
n2	TokenNameIdentifier
.	TokenNameDOT
m_key2Value	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
doubleValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
XObject	TokenNameIdentifier
r1	TokenNameIdentifier
=	TokenNameEQUAL
k	TokenNameIdentifier
.	TokenNameDOT
m_selectPat	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
m_execContext	TokenNameIdentifier
,	TokenNameCOMMA
n1	TokenNameIdentifier
.	TokenNameDOT
m_node	TokenNameIdentifier
,	TokenNameCOMMA
k	TokenNameIdentifier
.	TokenNameDOT
m_namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XObject	TokenNameIdentifier
r2	TokenNameIdentifier
=	TokenNameEQUAL
k	TokenNameIdentifier
.	TokenNameDOT
m_selectPat	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
m_execContext	TokenNameIdentifier
,	TokenNameCOMMA
n2	TokenNameIdentifier
.	TokenNameDOT
m_node	TokenNameIdentifier
,	TokenNameCOMMA
k	TokenNameIdentifier
.	TokenNameDOT
m_namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
n1Num	TokenNameIdentifier
=	TokenNameEQUAL
r1	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
n2Num	TokenNameIdentifier
=	TokenNameEQUAL
r2	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
n1Num	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
n2Num	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
(	TokenNameLPAREN
kIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
<	TokenNameLESS
m_keys	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
compare	TokenNameIdentifier
(	TokenNameLPAREN
n1	TokenNameIdentifier
,	TokenNameCOMMA
n2	TokenNameIdentifier
,	TokenNameCOMMA
kIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
support	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
double	TokenNamedouble
diff	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
n1Num	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
n2Num	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
diff	TokenNameIdentifier
=	TokenNameEQUAL
0.0	TokenNameDoubleLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
diff	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
n2Num	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
diff	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
diff	TokenNameIdentifier
=	TokenNameEQUAL
n1Num	TokenNameIdentifier
-	TokenNameMINUS
n2Num	TokenNameIdentifier
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
diff	TokenNameIdentifier
<	TokenNameLESS
0.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
(	TokenNameLPAREN
k	TokenNameIdentifier
.	TokenNameDOT
m_descending	TokenNameIdentifier
?	TokenNameQUESTION
1	TokenNameIntegerLiteral
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
:	TokenNameCOLON
(	TokenNameLPAREN
diff	TokenNameIdentifier
>	TokenNameGREATER
0.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
(	TokenNameLPAREN
k	TokenNameIdentifier
.	TokenNameDOT
m_descending	TokenNameIdentifier
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
:	TokenNameCOLON
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
CollationKey	TokenNameIdentifier
n1String	TokenNameIdentifier
,	TokenNameCOMMA
n2String	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
kIndex	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
n1String	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CollationKey	TokenNameIdentifier
)	TokenNameRPAREN
n1	TokenNameIdentifier
.	TokenNameDOT
m_key1Value	TokenNameIdentifier
;	TokenNameSEMICOLON
n2String	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CollationKey	TokenNameIdentifier
)	TokenNameRPAREN
n2	TokenNameIdentifier
.	TokenNameDOT
m_key1Value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
kIndex	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
n1String	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CollationKey	TokenNameIdentifier
)	TokenNameRPAREN
n1	TokenNameIdentifier
.	TokenNameDOT
m_key2Value	TokenNameIdentifier
;	TokenNameSEMICOLON
n2String	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CollationKey	TokenNameIdentifier
)	TokenNameRPAREN
n2	TokenNameIdentifier
.	TokenNameDOT
m_key2Value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
XObject	TokenNameIdentifier
r1	TokenNameIdentifier
=	TokenNameEQUAL
k	TokenNameIdentifier
.	TokenNameDOT
m_selectPat	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
m_execContext	TokenNameIdentifier
,	TokenNameCOMMA
n1	TokenNameIdentifier
.	TokenNameDOT
m_node	TokenNameIdentifier
,	TokenNameCOMMA
k	TokenNameIdentifier
.	TokenNameDOT
m_namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XObject	TokenNameIdentifier
r2	TokenNameIdentifier
=	TokenNameEQUAL
k	TokenNameIdentifier
.	TokenNameDOT
m_selectPat	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
m_execContext	TokenNameIdentifier
,	TokenNameCOMMA
n2	TokenNameIdentifier
.	TokenNameDOT
m_node	TokenNameIdentifier
,	TokenNameCOMMA
k	TokenNameIdentifier
.	TokenNameDOT
m_namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
n1String	TokenNameIdentifier
=	TokenNameEQUAL
k	TokenNameIdentifier
.	TokenNameDOT
m_col	TokenNameIdentifier
.	TokenNameDOT
getCollationKey	TokenNameIdentifier
(	TokenNameLPAREN
r1	TokenNameIdentifier
.	TokenNameDOT
str	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
n2String	TokenNameIdentifier
=	TokenNameEQUAL
k	TokenNameIdentifier
.	TokenNameDOT
m_col	TokenNameIdentifier
.	TokenNameDOT
getCollationKey	TokenNameIdentifier
(	TokenNameLPAREN
r2	TokenNameIdentifier
.	TokenNameDOT
str	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
n1String	TokenNameIdentifier
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
n2String	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
k	TokenNameIdentifier
.	TokenNameDOT
m_caseOrderUpper	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
tempN1	TokenNameIdentifier
=	TokenNameEQUAL
n1String	TokenNameIdentifier
.	TokenNameDOT
getSourceString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
tempN2	TokenNameIdentifier
=	TokenNameEQUAL
n2String	TokenNameIdentifier
.	TokenNameDOT
getSourceString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
tempN1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
tempN2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
result	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
-	TokenNameMINUS
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
k	TokenNameIdentifier
.	TokenNameDOT
m_descending	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
result	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
kIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
<	TokenNameLESS
m_keys	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
compare	TokenNameIdentifier
(	TokenNameLPAREN
n1	TokenNameIdentifier
,	TokenNameCOMMA
n2	TokenNameIdentifier
,	TokenNameCOMMA
kIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
support	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
==	TokenNameEQUAL_EQUAL
result	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DTM	TokenNameIdentifier
dtm	TokenNameIdentifier
=	TokenNameEQUAL
support	TokenNameIdentifier
.	TokenNameDOT
getDTM	TokenNameIdentifier
(	TokenNameLPAREN
n1	TokenNameIdentifier
.	TokenNameDOT
m_node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
dtm	TokenNameIdentifier
.	TokenNameDOT
isNodeAfter	TokenNameIdentifier
(	TokenNameLPAREN
n1	TokenNameIdentifier
.	TokenNameDOT
m_node	TokenNameIdentifier
,	TokenNameCOMMA
n2	TokenNameIdentifier
.	TokenNameDOT
m_node	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
mergesort	TokenNameIdentifier
(	TokenNameLPAREN
Vector	TokenNameIdentifier
a	TokenNameIdentifier
,	TokenNameCOMMA
Vector	TokenNameIdentifier
b	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
l	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
r	TokenNameIdentifier
,	TokenNameCOMMA
XPathContext	TokenNameIdentifier
support	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
r	TokenNameIdentifier
-	TokenNameMINUS
l	TokenNameIdentifier
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
m	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
r	TokenNameIdentifier
+	TokenNamePLUS
l	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
mergesort	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
,	TokenNameCOMMA
l	TokenNameIdentifier
,	TokenNameCOMMA
m	TokenNameIdentifier
,	TokenNameCOMMA
support	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mergesort	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
,	TokenNameCOMMA
m	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
r	TokenNameIdentifier
,	TokenNameCOMMA
support	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
,	TokenNameCOMMA
j	TokenNameIdentifier
,	TokenNameCOMMA
k	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
i	TokenNameIdentifier
=	TokenNameEQUAL
m	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
l	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
b	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
b	TokenNameIdentifier
.	TokenNameDOT
insertElementAt	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
b	TokenNameIdentifier
.	TokenNameDOT
setElementAt	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
i	TokenNameIdentifier
=	TokenNameEQUAL
l	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
j	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
m	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
+	TokenNamePLUS
m	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
-	TokenNameMINUS
j	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
b	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
b	TokenNameIdentifier
.	TokenNameDOT
insertElementAt	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
j	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
r	TokenNameIdentifier
+	TokenNamePLUS
m	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
-	TokenNameMINUS
j	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
b	TokenNameIdentifier
.	TokenNameDOT
setElementAt	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
j	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
r	TokenNameIdentifier
+	TokenNamePLUS
m	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
-	TokenNameMINUS
j	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
j	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
compVal	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
k	TokenNameIdentifier
=	TokenNameEQUAL
l	TokenNameIdentifier
;	TokenNameSEMICOLON
k	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
k	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
j	TokenNameIdentifier
)	TokenNameRPAREN
compVal	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
compVal	TokenNameIdentifier
=	TokenNameEQUAL
compare	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
NodeCompareElem	TokenNameIdentifier
)	TokenNameRPAREN
b	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
NodeCompareElem	TokenNameIdentifier
)	TokenNameRPAREN
b	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
j	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
support	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
compVal	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
a	TokenNameIdentifier
.	TokenNameDOT
setElementAt	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
k	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
compVal	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
a	TokenNameIdentifier
.	TokenNameDOT
setElementAt	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
j	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
k	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
j	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
class	TokenNameclass
NodeCompareElem	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
m_node	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
maxkey	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
m_key1Value	TokenNameIdentifier
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
m_key2Value	TokenNameIdentifier
;	TokenNameSEMICOLON
NodeCompareElem	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
node	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
m_node	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
m_keys	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
NodeSortKey	TokenNameIdentifier
k1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
NodeSortKey	TokenNameIdentifier
)	TokenNameRPAREN
m_keys	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XObject	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
k1	TokenNameIdentifier
.	TokenNameDOT
m_selectPat	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
m_execContext	TokenNameIdentifier
,	TokenNameCOMMA
node	TokenNameIdentifier
,	TokenNameCOMMA
k1	TokenNameIdentifier
.	TokenNameDOT
m_namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
d	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
k1	TokenNameIdentifier
.	TokenNameDOT
m_treatAsNumbers	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
d	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_key1Value	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Double	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
m_key1Value	TokenNameIdentifier
=	TokenNameEQUAL
k1	TokenNameIdentifier
.	TokenNameDOT
m_col	TokenNameIdentifier
.	TokenNameDOT
getCollationKey	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
.	TokenNameDOT
str	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
XObject	TokenNameIdentifier
.	TokenNameDOT
CLASS_NODESET	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DTMIterator	TokenNameIdentifier
ni	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
XNodeSet	TokenNameIdentifier
)	TokenNameRPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
iterRaw	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
current	TokenNameIdentifier
=	TokenNameEQUAL
ni	TokenNameIdentifier
.	TokenNameDOT
getCurrentNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
DTM	TokenNameIdentifier
.	TokenNameDOT
NULL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
current	TokenNameIdentifier
)	TokenNameRPAREN
current	TokenNameIdentifier
=	TokenNameEQUAL
ni	TokenNameIdentifier
.	TokenNameDOT
nextNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
m_keys	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
NodeSortKey	TokenNameIdentifier
k2	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
NodeSortKey	TokenNameIdentifier
)	TokenNameRPAREN
m_keys	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XObject	TokenNameIdentifier
r2	TokenNameIdentifier
=	TokenNameEQUAL
k2	TokenNameIdentifier
.	TokenNameDOT
m_selectPat	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
m_execContext	TokenNameIdentifier
,	TokenNameCOMMA
node	TokenNameIdentifier
,	TokenNameCOMMA
k2	TokenNameIdentifier
.	TokenNameDOT
m_namespaceContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
k2	TokenNameIdentifier
.	TokenNameDOT
m_treatAsNumbers	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
d	TokenNameIdentifier
=	TokenNameEQUAL
r2	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_key2Value	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Double	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
m_key2Value	TokenNameIdentifier
=	TokenNameEQUAL
k2	TokenNameIdentifier
.	TokenNameDOT
m_col	TokenNameIdentifier
.	TokenNameDOT
getCollationKey	TokenNameIdentifier
(	TokenNameLPAREN
r2	TokenNameIdentifier
.	TokenNameDOT
str	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE