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
Translet	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
IntegerArray	TokenNameIdentifier
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
Axis	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
MultipleNodeCounter	TokenNameIdentifier
extends	TokenNameextends
NodeCounter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
DTMAxisIterator	TokenNameIdentifier
_precSiblings	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
MultipleNodeCounter	TokenNameIdentifier
(	TokenNameLPAREN
Translet	TokenNameIdentifier
translet	TokenNameIdentifier
,	TokenNameCOMMA
DOM	TokenNameIdentifier
document	TokenNameIdentifier
,	TokenNameCOMMA
DTMAxisIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
translet	TokenNameIdentifier
,	TokenNameCOMMA
document	TokenNameIdentifier
,	TokenNameCOMMA
iterator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
NodeCounter	TokenNameIdentifier
setStartNode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
node	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_node	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
;	TokenNameSEMICOLON
_nodeType	TokenNameIdentifier
=	TokenNameEQUAL
_document	TokenNameIdentifier
.	TokenNameDOT
getExpandedTypeID	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_precSiblings	TokenNameIdentifier
=	TokenNameEQUAL
_document	TokenNameIdentifier
.	TokenNameDOT
getAxisIterator	TokenNameIdentifier
(	TokenNameLPAREN
Axis	TokenNameIdentifier
.	TokenNameDOT
PRECEDINGSIBLING	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getCounter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_value	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
"0"	TokenNameStringLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
_value	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
"NaN"	TokenNameStringLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
_value	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
Double	TokenNameIdentifier
.	TokenNameDOT
isInfinite	TokenNameIdentifier
(	TokenNameLPAREN
_value	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
"-Infinity"	TokenNameStringLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
isInfinite	TokenNameIdentifier
(	TokenNameLPAREN
_value	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
"Infinity"	TokenNameStringLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
formatNumbers	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
_value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
IntegerArray	TokenNameIdentifier
ancestors	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IntegerArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
next	TokenNameIdentifier
=	TokenNameEQUAL
_node	TokenNameIdentifier
;	TokenNameSEMICOLON
ancestors	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
next	TokenNameIdentifier
=	TokenNameEQUAL
_document	TokenNameIdentifier
.	TokenNameDOT
getParent	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
END	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
matchesFrom	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ancestors	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
nAncestors	TokenNameIdentifier
=	TokenNameEQUAL
ancestors	TokenNameIdentifier
.	TokenNameDOT
cardinality	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
counters	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
nAncestors	TokenNameIdentifier
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
nAncestors	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
counters	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
i	TokenNameIdentifier
=	TokenNameEQUAL
nAncestors	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
,	TokenNameCOMMA
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
counter	TokenNameIdentifier
=	TokenNameEQUAL
counters	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
ancestor	TokenNameIdentifier
=	TokenNameEQUAL
ancestors	TokenNameIdentifier
.	TokenNameDOT
at	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
matchesCount	TokenNameIdentifier
(	TokenNameLPAREN
ancestor	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
_precSiblings	TokenNameIdentifier
.	TokenNameDOT
setStartNode	TokenNameIdentifier
(	TokenNameLPAREN
ancestor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
next	TokenNameIdentifier
=	TokenNameEQUAL
_precSiblings	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
END	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
matchesCount	TokenNameIdentifier
(	TokenNameLPAREN
next	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
counters	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
counters	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
1	TokenNameIntegerLiteral
:	TokenNameCOLON
counters	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
counters	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
counters	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
MIN_VALUE	TokenNameIdentifier
?	TokenNameQUESTION
1	TokenNameIntegerLiteral
:	TokenNameCOLON
counters	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
formatNumbers	TokenNameIdentifier
(	TokenNameLPAREN
counters	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
NodeCounter	TokenNameIdentifier
getDefaultNodeCounter	TokenNameIdentifier
(	TokenNameLPAREN
Translet	TokenNameIdentifier
translet	TokenNameIdentifier
,	TokenNameCOMMA
DOM	TokenNameIdentifier
document	TokenNameIdentifier
,	TokenNameCOMMA
DTMAxisIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
DefaultMultipleNodeCounter	TokenNameIdentifier
(	TokenNameLPAREN
translet	TokenNameIdentifier
,	TokenNameCOMMA
document	TokenNameIdentifier
,	TokenNameCOMMA
iterator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
DefaultMultipleNodeCounter	TokenNameIdentifier
extends	TokenNameextends
MultipleNodeCounter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
DefaultMultipleNodeCounter	TokenNameIdentifier
(	TokenNameLPAREN
Translet	TokenNameIdentifier
translet	TokenNameIdentifier
,	TokenNameCOMMA
DOM	TokenNameIdentifier
document	TokenNameIdentifier
,	TokenNameCOMMA
DTMAxisIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
translet	TokenNameIdentifier
,	TokenNameCOMMA
document	TokenNameIdentifier
,	TokenNameCOMMA
iterator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
