package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
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
NoSuchElementException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DoublyIndexedTable	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
int	TokenNameint
initialCapacity	TokenNameIdentifier
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
DoublyIndexedTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DoublyIndexedTable	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
initialCapacity	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
;	TokenNameSEMICOLON
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
DoublyIndexedTable	TokenNameIdentifier
(	TokenNameLPAREN
DoublyIndexedTable	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
initialCapacity	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
initialCapacity	TokenNameIdentifier
;	TokenNameSEMICOLON
table	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
other	TokenNameIdentifier
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
other	TokenNameIdentifier
.	TokenNameDOT
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Entry	TokenNameIdentifier
newE	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
Entry	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
table	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
newE	TokenNameIdentifier
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
key1	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
key2	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
,	TokenNameCOMMA
newE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
table	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
newE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
count	TokenNameIdentifier
=	TokenNameEQUAL
other	TokenNameIdentifier
.	TokenNameDOT
count	TokenNameIdentifier
;	TokenNameSEMICOLON
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
put	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
o2	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
o1	TokenNameIdentifier
,	TokenNameCOMMA
o2	TokenNameIdentifier
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
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
e	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
o1	TokenNameIdentifier
,	TokenNameCOMMA
o2	TokenNameIdentifier
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
o1	TokenNameIdentifier
,	TokenNameCOMMA
o2	TokenNameIdentifier
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
get	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
o2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
o1	TokenNameIdentifier
,	TokenNameCOMMA
o2	TokenNameIdentifier
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
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
e	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
o1	TokenNameIdentifier
,	TokenNameCOMMA
o2	TokenNameIdentifier
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
remove	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
o2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
o1	TokenNameIdentifier
,	TokenNameCOMMA
o2	TokenNameIdentifier
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
e	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hash	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
hash	TokenNameIdentifier
&&	TokenNameAND_AND
e	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
o1	TokenNameIdentifier
,	TokenNameCOMMA
o2	TokenNameIdentifier
)	TokenNameRPAREN
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
count	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
return	TokenNamereturn
e	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Entry	TokenNameIdentifier
prev	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
e	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
e	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
prev	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
,	TokenNameCOMMA
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
e	TokenNameIdentifier
.	TokenNameDOT
match	TokenNameIdentifier
(	TokenNameLPAREN
o1	TokenNameIdentifier
,	TokenNameCOMMA
o2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
prev	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
count	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
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
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getValuesArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
values	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
count	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
index	TokenNameIdentifier
<	TokenNameLESS
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
index	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
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
values	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
e	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
values	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
table	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Entry	TokenNameIdentifier
[	TokenNameLBRACKET
initialCapacity	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Iterator	TokenNameIdentifier
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
TableIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
o2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
result	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
o1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
o1	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
^	TokenNameXOR
(	TokenNameLPAREN
(	TokenNameLPAREN
o2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
o2	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
Entry	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
int	TokenNameint
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Object	TokenNameIdentifier
key1	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Object	TokenNameIdentifier
key2	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Object	TokenNameIdentifier
value	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
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
key1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
key2	TokenNameIdentifier
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
key1	TokenNameIdentifier
=	TokenNameEQUAL
key1	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
key2	TokenNameIdentifier
=	TokenNameEQUAL
key2	TokenNameIdentifier
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
public	TokenNamepublic
Object	TokenNameIdentifier
getKey1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
key1	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getKey2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
key2	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
match	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
o2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
key1	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
key1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
o1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
o1	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
key2	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
key2	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
o2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
o2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
class	TokenNameclass
TableIterator	TokenNameIdentifier
implements	TokenNameimplements
Iterator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
int	TokenNameint
nextIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Entry	TokenNameIdentifier
nextEntry	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
finished	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
TableIterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
nextIndex	TokenNameIdentifier
<	TokenNameLESS
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nextEntry	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
[	TokenNameLBRACKET
nextIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextEntry	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
nextIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finished	TokenNameIdentifier
=	TokenNameEQUAL
nextEntry	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
!	TokenNameNOT
finished	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
finished	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NoSuchElementException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Entry	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
nextEntry	TokenNameIdentifier
;	TokenNameSEMICOLON
findNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
findNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
nextEntry	TokenNameIdentifier
=	TokenNameEQUAL
nextEntry	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextEntry	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
nextIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
nextIndex	TokenNameIdentifier
<	TokenNameLESS
table	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nextEntry	TokenNameIdentifier
=	TokenNameEQUAL
table	TokenNameIdentifier
[	TokenNameLBRACKET
nextIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextEntry	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
nextIndex	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
finished	TokenNameIdentifier
=	TokenNameEQUAL
nextEntry	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
remove	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
