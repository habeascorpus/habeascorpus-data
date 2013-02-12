package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
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
LinkedList	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FloatArrayProducer	TokenNameIdentifier
extends	TokenNameextends
DefaultNumberListHandler	TokenNameIdentifier
implements	TokenNameimplements
PointsHandler	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
LinkedList	TokenNameIdentifier
as	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
a	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
index	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
count	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getFloatArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
a	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startNumberList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
as	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
11	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
index	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
numberValue	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
v	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
a	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
as	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
a	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
a	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
index	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
a	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
v	TokenNameIdentifier
;	TokenNameSEMICOLON
count	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endNumberList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
all	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
count	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
it	TokenNameIdentifier
=	TokenNameEQUAL
as	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
b	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
all	TokenNameIdentifier
,	TokenNameCOMMA
pos	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pos	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
b	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
all	TokenNameIdentifier
,	TokenNameCOMMA
pos	TokenNameIdentifier
,	TokenNameCOMMA
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
as	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
a	TokenNameIdentifier
=	TokenNameEQUAL
all	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
startNumberList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
point	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
numberValue	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
numberValue	TokenNameIdentifier
(	TokenNameLPAREN
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
endNumberList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE