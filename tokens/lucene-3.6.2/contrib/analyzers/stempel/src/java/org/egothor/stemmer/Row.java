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
io	TokenNameIdentifier
.	TokenNameDOT
DataInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
TreeMap	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Row	TokenNameIdentifier
{	TokenNameLBRACE
TreeMap	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
,	TokenNameCOMMA
Cell	TokenNameIdentifier
>	TokenNameGREATER
cells	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeMap	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
,	TokenNameCOMMA
Cell	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
uniformCnt	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
uniformSkip	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
Row	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
is	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
is	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
char	TokenNamechar
ch	TokenNameIdentifier
=	TokenNameEQUAL
is	TokenNameIdentifier
.	TokenNameDOT
readChar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Cell	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Cell	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
=	TokenNameEQUAL
is	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
.	TokenNameDOT
cnt	TokenNameIdentifier
=	TokenNameEQUAL
is	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
=	TokenNameEQUAL
is	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
.	TokenNameDOT
skip	TokenNameIdentifier
=	TokenNameEQUAL
is	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cells	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
,	TokenNameCOMMA
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Row	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Row	TokenNameIdentifier
(	TokenNameLPAREN
Row	TokenNameIdentifier
old	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
cells	TokenNameIdentifier
=	TokenNameEQUAL
old	TokenNameIdentifier
.	TokenNameDOT
cells	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setCmd	TokenNameIdentifier
(	TokenNameLPAREN
Character	TokenNameIdentifier
way	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
cmd	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Cell	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
(	TokenNameLPAREN
way	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
c	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Cell	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
=	TokenNameEQUAL
cmd	TokenNameIdentifier
;	TokenNameSEMICOLON
cells	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
way	TokenNameIdentifier
,	TokenNameCOMMA
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
c	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
=	TokenNameEQUAL
cmd	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
c	TokenNameIdentifier
.	TokenNameDOT
cnt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
cmd	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
1	TokenNameIntegerLiteral
:	TokenNameCOLON
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setRef	TokenNameIdentifier
(	TokenNameLPAREN
Character	TokenNameIdentifier
way	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
ref	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Cell	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
(	TokenNameLPAREN
way	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
c	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Cell	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
c	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
=	TokenNameEQUAL
ref	TokenNameIdentifier
;	TokenNameSEMICOLON
cells	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
way	TokenNameIdentifier
,	TokenNameCOMMA
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
c	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
=	TokenNameEQUAL
ref	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getCells	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Iterator	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
>	TokenNameGREATER
i	TokenNameIdentifier
=	TokenNameEQUAL
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
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
c	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Cell	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
e	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
size	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getCellsPnt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Iterator	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
>	TokenNameGREATER
i	TokenNameIdentifier
=	TokenNameEQUAL
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
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
c	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Cell	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
size	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getCellsVal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Iterator	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
>	TokenNameGREATER
i	TokenNameIdentifier
=	TokenNameEQUAL
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
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
c	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Cell	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
size	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getCmd	TokenNameIdentifier
(	TokenNameLPAREN
Character	TokenNameIdentifier
way	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Cell	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
(	TokenNameLPAREN
way	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
c	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getCnt	TokenNameIdentifier
(	TokenNameLPAREN
Character	TokenNameIdentifier
way	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Cell	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
(	TokenNameLPAREN
way	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
c	TokenNameIdentifier
.	TokenNameDOT
cnt	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getRef	TokenNameIdentifier
(	TokenNameLPAREN
Character	TokenNameIdentifier
way	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Cell	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
(	TokenNameLPAREN
way	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
c	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
store	TokenNameIdentifier
(	TokenNameLPAREN
DataOutput	TokenNameIdentifier
os	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
os	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
cells	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
>	TokenNameGREATER
i	TokenNameIdentifier
=	TokenNameEQUAL
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
c	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Cell	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
e	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
os	TokenNameIdentifier
.	TokenNameDOT
writeChar	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
charValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
os	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
os	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
cnt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
os	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
os	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
skip	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
uniformCmd	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
eqSkip	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Iterator	TokenNameIdentifier
<	TokenNameLESS
Cell	TokenNameIdentifier
>	TokenNameGREATER
i	TokenNameIdentifier
=	TokenNameEQUAL
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
int	TokenNameint
ret	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
uniformCnt	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
uniformSkip	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
ret	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
;	TokenNameSEMICOLON
uniformSkip	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
skip	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
c	TokenNameIdentifier
.	TokenNameDOT
cmd	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
eqSkip	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
uniformSkip	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
c	TokenNameIdentifier
.	TokenNameDOT
skip	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
uniformCnt	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
uniformCnt	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
print	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
>	TokenNameGREATER
i	TokenNameIdentifier
=	TokenNameEQUAL
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
at	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
"["	TokenNameStringLiteral
+	TokenNamePLUS
ch	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
c	TokenNameIdentifier
+	TokenNamePLUS
"]"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Cell	TokenNameIdentifier
at	TokenNameIdentifier
(	TokenNameLPAREN
Character	TokenNameIdentifier
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
cells	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
