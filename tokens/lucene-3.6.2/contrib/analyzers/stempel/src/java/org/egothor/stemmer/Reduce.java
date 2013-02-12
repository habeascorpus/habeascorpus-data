package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
egothor	TokenNameIdentifier
.	TokenNameDOT
stemmer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Reduce	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Reduce	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Trie	TokenNameIdentifier
optimize	TokenNameIdentifier
(	TokenNameLPAREN
Trie	TokenNameIdentifier
orig	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
CharSequence	TokenNameIdentifier
>	TokenNameGREATER
cmds	TokenNameIdentifier
=	TokenNameEQUAL
orig	TokenNameIdentifier
.	TokenNameDOT
cmds	TokenNameIdentifier
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
rows	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
orows	TokenNameIdentifier
=	TokenNameEQUAL
orig	TokenNameIdentifier
.	TokenNameDOT
rows	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
remap	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
orows	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Arrays	TokenNameIdentifier
.	TokenNameDOT
fill	TokenNameIdentifier
(	TokenNameLPAREN
remap	TokenNameIdentifier
,	TokenNameCOMMA
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rows	TokenNameIdentifier
=	TokenNameEQUAL
removeGaps	TokenNameIdentifier
(	TokenNameLPAREN
orig	TokenNameIdentifier
.	TokenNameDOT
root	TokenNameIdentifier
,	TokenNameCOMMA
rows	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
remap	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
Trie	TokenNameIdentifier
(	TokenNameLPAREN
orig	TokenNameIdentifier
.	TokenNameDOT
forward	TokenNameIdentifier
,	TokenNameCOMMA
remap	TokenNameIdentifier
[	TokenNameLBRACKET
orig	TokenNameIdentifier
.	TokenNameDOT
root	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
cmds	TokenNameIdentifier
,	TokenNameCOMMA
rows	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
removeGaps	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ind	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
old	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Row	TokenNameIdentifier
>	TokenNameGREATER
to	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
remap	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
remap	TokenNameIdentifier
[	TokenNameLBRACKET
ind	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
to	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Row	TokenNameIdentifier
now	TokenNameIdentifier
=	TokenNameEQUAL
old	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
ind	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
to	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
Cell	TokenNameIdentifier
>	TokenNameGREATER
i	TokenNameIdentifier
=	TokenNameEQUAL
now	TokenNameIdentifier
.	TokenNameDOT
cells	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
Cell	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
remap	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
]	TokenNameRBRACKET
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
removeGaps	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
,	TokenNameCOMMA
old	TokenNameIdentifier
,	TokenNameCOMMA
to	TokenNameIdentifier
,	TokenNameCOMMA
remap	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
to	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
remap	TokenNameIdentifier
[	TokenNameLBRACKET
ind	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
new	TokenNamenew
Remap	TokenNameIdentifier
(	TokenNameLPAREN
now	TokenNameIdentifier
,	TokenNameCOMMA
remap	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
to	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
class	TokenNameclass
Remap	TokenNameIdentifier
extends	TokenNameextends
Row	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Remap	TokenNameIdentifier
(	TokenNameLPAREN
Row	TokenNameIdentifier
old	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
remap	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
>	TokenNameGREATER
i	TokenNameIdentifier
=	TokenNameEQUAL
old	TokenNameIdentifier
.	TokenNameDOT
cells	TokenNameIdentifier
.	TokenNameDOT
keySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
Character	TokenNameIdentifier
ch	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Cell	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
old	TokenNameIdentifier
.	TokenNameDOT
at	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Cell	TokenNameIdentifier
nc	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
nc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Cell	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nc	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
=	TokenNameEQUAL
remap	TokenNameIdentifier
[	TokenNameLBRACKET
nc	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
nc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Cell	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
cells	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
nc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE