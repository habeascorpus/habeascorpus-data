package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
lib	TokenNameIdentifier
.	TokenNameDOT
sql	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ObjectArray	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
m_minArraySize	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Vector	TokenNameIdentifier
m_Arrays	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
200	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
_ObjectArray	TokenNameIdentifier
m_currentArray	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
m_nextSlot	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ObjectArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
init	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ObjectArray	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
minArraySize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
init	TokenNameIdentifier
(	TokenNameLPAREN
minArraySize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_minArraySize	TokenNameIdentifier
=	TokenNameEQUAL
size	TokenNameIdentifier
;	TokenNameSEMICOLON
m_currentArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
_ObjectArray	TokenNameIdentifier
(	TokenNameLPAREN
m_minArraySize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getAt	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
idx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
arrayIndx	TokenNameIdentifier
=	TokenNameEQUAL
idx	TokenNameIdentifier
/	TokenNameDIVIDE
m_minArraySize	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
arrayOffset	TokenNameIdentifier
=	TokenNameEQUAL
idx	TokenNameIdentifier
-	TokenNameMINUS
(	TokenNameLPAREN
arrayIndx	TokenNameIdentifier
*	TokenNameMULTIPLY
m_minArraySize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
arrayIndx	TokenNameIdentifier
<	TokenNameLESS
m_Arrays	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
_ObjectArray	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
_ObjectArray	TokenNameIdentifier
)	TokenNameRPAREN
m_Arrays	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
arrayIndx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
a	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
[	TokenNameLBRACKET
arrayOffset	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
m_currentArray	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
[	TokenNameLBRACKET
arrayOffset	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setAt	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
idx	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
arrayIndx	TokenNameIdentifier
=	TokenNameEQUAL
idx	TokenNameIdentifier
/	TokenNameDIVIDE
m_minArraySize	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
arrayOffset	TokenNameIdentifier
=	TokenNameEQUAL
idx	TokenNameIdentifier
-	TokenNameMINUS
(	TokenNameLPAREN
arrayIndx	TokenNameIdentifier
*	TokenNameMULTIPLY
m_minArraySize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
arrayIndx	TokenNameIdentifier
<	TokenNameLESS
m_Arrays	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
_ObjectArray	TokenNameIdentifier
a	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
_ObjectArray	TokenNameIdentifier
)	TokenNameRPAREN
m_Arrays	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
arrayIndx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
a	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
[	TokenNameLBRACKET
arrayOffset	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
m_currentArray	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
[	TokenNameLBRACKET
arrayOffset	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
append	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_nextSlot	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_minArraySize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_Arrays	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
m_currentArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_nextSlot	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
m_currentArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
_ObjectArray	TokenNameIdentifier
(	TokenNameLPAREN
m_minArraySize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
m_currentArray	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
[	TokenNameLBRACKET
m_nextSlot	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
o	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
m_Arrays	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
m_minArraySize	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
m_nextSlot	TokenNameIdentifier
;	TokenNameSEMICOLON
m_nextSlot	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
return	TokenNamereturn
pos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
class	TokenNameclass
_ObjectArray	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
objects	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
_ObjectArray	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
objects	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
word	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
"Zero"	TokenNameStringLiteral
,	TokenNameCOMMA
"One"	TokenNameStringLiteral
,	TokenNameCOMMA
"Two"	TokenNameStringLiteral
,	TokenNameCOMMA
"Three"	TokenNameStringLiteral
,	TokenNameCOMMA
"Four"	TokenNameStringLiteral
,	TokenNameCOMMA
"Five"	TokenNameStringLiteral
,	TokenNameCOMMA
"Six"	TokenNameStringLiteral
,	TokenNameCOMMA
"Seven"	TokenNameStringLiteral
,	TokenNameCOMMA
"Eight"	TokenNameStringLiteral
,	TokenNameCOMMA
"Nine"	TokenNameStringLiteral
,	TokenNameCOMMA
"Ten"	TokenNameStringLiteral
,	TokenNameCOMMA
"Eleven"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twelve"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirteen"	TokenNameStringLiteral
,	TokenNameCOMMA
"Fourteen"	TokenNameStringLiteral
,	TokenNameCOMMA
"Fifteen"	TokenNameStringLiteral
,	TokenNameCOMMA
"Sixteen"	TokenNameStringLiteral
,	TokenNameCOMMA
"Seventeen"	TokenNameStringLiteral
,	TokenNameCOMMA
"Eighteen"	TokenNameStringLiteral
,	TokenNameCOMMA
"Nineteen"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twenty"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twenty-One"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twenty-Two"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twenty-Three"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twenty-Four"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twenty-Five"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twenty-Six"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twenty-Seven"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twenty-Eight"	TokenNameStringLiteral
,	TokenNameCOMMA
"Twenty-Nine"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirty"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirty-One"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirty-Two"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirty-Three"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirty-Four"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirty-Five"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirty-Six"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirty-Seven"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirty-Eight"	TokenNameStringLiteral
,	TokenNameCOMMA
"Thirty-Nine"	TokenNameStringLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
ObjectArray	TokenNameIdentifier
m_ObjectArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ObjectArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
x	TokenNameIdentifier
<	TokenNameLESS
word	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
x	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
" - "	TokenNameStringLiteral
+	TokenNamePLUS
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
word	TokenNameIdentifier
[	TokenNameLBRACKET
x	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
x	TokenNameIdentifier
<	TokenNameLESS
word	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
x	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
getAt	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
getAt	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
getAt	TokenNameIdentifier
(	TokenNameLPAREN
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
getAt	TokenNameIdentifier
(	TokenNameLPAREN
20	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
getAt	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
getAt	TokenNameIdentifier
(	TokenNameLPAREN
15	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
getAt	TokenNameIdentifier
(	TokenNameLPAREN
30	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
getAt	TokenNameIdentifier
(	TokenNameLPAREN
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
getAt	TokenNameIdentifier
(	TokenNameLPAREN
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
m_ObjectArray	TokenNameIdentifier
.	TokenNameDOT
getAt	TokenNameIdentifier
(	TokenNameLPAREN
40	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE