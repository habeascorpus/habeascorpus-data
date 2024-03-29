package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
HashTable	TokenNameIdentifier
implements	TokenNameimplements
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
INITIAL_CAPACITY	TokenNameIdentifier
=	TokenNameEQUAL
11	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
table	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
count	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
HashTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
table	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
INITIAL_CAPACITY	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
HashTable	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
table	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
c	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
HashTable	TokenNameIdentifier
(	TokenNameLPAREN
HashTable	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
count	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
.	TokenNameDOT
count	TokenNameIdentifier
;	TokenNameSEMICOLON
table	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
t	TokenNameIdentifier
.	TokenNameDOT
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
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
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
.	TokenNameDOT
table	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
table	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
n	TokenNameIdentifier
;	TokenNameSEMICOLON
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
n	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
n	TokenNameIdentifier
=	TokenNameEQUAL
n	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
key	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&	TokenNameAND
0x7FFFFFFF	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
%	TokenNameREMAINDER
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
put	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
key	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&	TokenNameAND
0x7FFFFFFF	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
%	TokenNameREMAINDER
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
old	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
e	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
old	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
count	TokenNameIdentifier
++	TokenNamePLUS_PLUS
>=	TokenNameGREATER_EQUAL
(	TokenNameLPAREN
len	TokenNameIdentifier
-	TokenNameMINUS
(	TokenNameLPAREN
len	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
rehash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
index	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
%	TokenNameREMAINDER
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
(	TokenNameLPAREN
hash	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
table	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
table	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
remove	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
key	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&	TokenNameAND
0x7FFFFFFF	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
%	TokenNameREMAINDER
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
p	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
table	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
p	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
count	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
p	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
key	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
count	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
do	TokenNamedo
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
==	TokenNameEQUAL_EQUAL
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
item	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
count	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
do	TokenNamedo
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
==	TokenNameEQUAL_EQUAL
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
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
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
table	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
count	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
rehash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
oldTable	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
;	TokenNameSEMICOLON
table	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
oldTable	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
oldTable	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Entry	TokenNameIdentifier
old	TokenNameIdentifier
=	TokenNameEQUAL
oldTable	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
old	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
old	TokenNameIdentifier
;	TokenNameSEMICOLON
old	TokenNameIdentifier
=	TokenNameEQUAL
old	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
%	TokenNameREMAINDER
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
table	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
class	TokenNameclass
Entry	TokenNameIdentifier
implements	TokenNameimplements
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Object	TokenNameIdentifier
key	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Object	TokenNameIdentifier
value	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Entry	TokenNameIdentifier
next	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Entry	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
hash	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
Entry	TokenNameIdentifier
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
hash	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
key	TokenNameIdentifier
=	TokenNameEQUAL
key	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
