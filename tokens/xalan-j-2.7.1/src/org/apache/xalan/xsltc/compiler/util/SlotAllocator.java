package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
compiler	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
bcel	TokenNameIdentifier
.	TokenNameDOT
generic	TokenNameIdentifier
.	TokenNameDOT
LocalVariableGen	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
bcel	TokenNameIdentifier
.	TokenNameDOT
generic	TokenNameIdentifier
.	TokenNameDOT
Type	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
SlotAllocator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
_firstAvailableSlot	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_size	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
_free	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
_slotsTaken	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
_size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
initialize	TokenNameIdentifier
(	TokenNameLPAREN
LocalVariableGen	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
vars	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
vars	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
slot	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
size	TokenNameIdentifier
,	TokenNameCOMMA
index	TokenNameIdentifier
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
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
size	TokenNameIdentifier
=	TokenNameEQUAL
vars	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
index	TokenNameIdentifier
=	TokenNameEQUAL
vars	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
slot	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
slot	TokenNameIdentifier
,	TokenNameCOMMA
index	TokenNameIdentifier
+	TokenNamePLUS
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_firstAvailableSlot	TokenNameIdentifier
=	TokenNameEQUAL
slot	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
allocateSlot	TokenNameIdentifier
(	TokenNameLPAREN
Type	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
.	TokenNameDOT
getSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
limit	TokenNameIdentifier
=	TokenNameEQUAL
_free	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
slot	TokenNameIdentifier
=	TokenNameEQUAL
_firstAvailableSlot	TokenNameIdentifier
,	TokenNameCOMMA
where	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
_free	TokenNameIdentifier
+	TokenNamePLUS
size	TokenNameIdentifier
>	TokenNameGREATER
_size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
array	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
_size	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
limit	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
array	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
_slotsTaken	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
_slotsTaken	TokenNameIdentifier
=	TokenNameEQUAL
array	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
where	TokenNameIdentifier
<	TokenNameLESS
limit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
slot	TokenNameIdentifier
+	TokenNamePLUS
size	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
_slotsTaken	TokenNameIdentifier
[	TokenNameLBRACKET
where	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
limit	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
where	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
_slotsTaken	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
+	TokenNamePLUS
size	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
_slotsTaken	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
slot	TokenNameIdentifier
=	TokenNameEQUAL
_slotsTaken	TokenNameIdentifier
[	TokenNameLBRACKET
where	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
size	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
_slotsTaken	TokenNameIdentifier
[	TokenNameLBRACKET
where	TokenNameIdentifier
+	TokenNamePLUS
j	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
slot	TokenNameIdentifier
+	TokenNamePLUS
j	TokenNameIdentifier
;	TokenNameSEMICOLON
_free	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
size	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
slot	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
releaseSlot	TokenNameIdentifier
(	TokenNameLPAREN
LocalVariableGen	TokenNameIdentifier
lvg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
lvg	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
slot	TokenNameIdentifier
=	TokenNameEQUAL
lvg	TokenNameIdentifier
.	TokenNameDOT
getIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
limit	TokenNameIdentifier
=	TokenNameEQUAL
_free	TokenNameIdentifier
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
limit	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_slotsTaken	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
slot	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
+	TokenNamePLUS
size	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
j	TokenNameIdentifier
<	TokenNameLESS
limit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_slotsTaken	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
_slotsTaken	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
_free	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
size	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
String	TokenNameIdentifier
state	TokenNameIdentifier
=	TokenNameEQUAL
"Variable slot allocation error"	TokenNameStringLiteral
+	TokenNamePLUS
"(size="	TokenNameStringLiteral
+	TokenNamePLUS
size	TokenNameIdentifier
+	TokenNamePLUS
", slot="	TokenNameStringLiteral
+	TokenNamePLUS
slot	TokenNameIdentifier
+	TokenNamePLUS
", limit="	TokenNameStringLiteral
+	TokenNamePLUS
limit	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
ErrorMsg	TokenNameIdentifier
err	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ErrorMsg	TokenNameIdentifier
(	TokenNameLPAREN
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
INTERNAL_ERR	TokenNameIdentifier
,	TokenNameCOMMA
state	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
Error	TokenNameIdentifier
(	TokenNameLPAREN
err	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
