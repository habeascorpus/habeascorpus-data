package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
grouping	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SentinelIntSet	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
keys	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
count	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
emptyVal	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
rehashCount	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SentinelIntSet	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
size	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
emptyVal	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
emptyVal	TokenNameIdentifier
=	TokenNameEQUAL
emptyVal	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
tsize	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
max	TokenNameIdentifier
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
BitUtil	TokenNameIdentifier
.	TokenNameDOT
nextHighestPowerOfTwo	TokenNameIdentifier
(	TokenNameLPAREN
size	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rehashCount	TokenNameIdentifier
=	TokenNameEQUAL
tsize	TokenNameIdentifier
-	TokenNameMINUS
(	TokenNameLPAREN
tsize	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
size	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
rehashCount	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
tsize	TokenNameIdentifier
<<=	TokenNameLEFT_SHIFT_EQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
rehashCount	TokenNameIdentifier
=	TokenNameEQUAL
tsize	TokenNameIdentifier
-	TokenNameMINUS
(	TokenNameLPAREN
tsize	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
keys	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
tsize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
emptyVal	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Arrays	TokenNameIdentifier
.	TokenNameDOT
fill	TokenNameIdentifier
(	TokenNameLPAREN
keys	TokenNameIdentifier
,	TokenNameCOMMA
emptyVal	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
hash	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
key	TokenNameIdentifier
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
int	TokenNameint
getSlot	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
key	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
emptyVal	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
h	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
s	TokenNameIdentifier
=	TokenNameEQUAL
h	TokenNameIdentifier
&	TokenNameAND
(	TokenNameLPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
keys	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
key	TokenNameIdentifier
||	TokenNameOR_OR
keys	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
emptyVal	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
s	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
increment	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
h	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
do	TokenNamedo
{	TokenNameLBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
s	TokenNameIdentifier
+	TokenNamePLUS
increment	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
(	TokenNameLPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
keys	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
key	TokenNameIdentifier
&&	TokenNameAND_AND
keys	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
emptyVal	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
s	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
find	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
key	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
emptyVal	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
h	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
s	TokenNameIdentifier
=	TokenNameEQUAL
h	TokenNameIdentifier
&	TokenNameAND
(	TokenNameLPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
keys	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
key	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
s	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
keys	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
emptyVal	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
-	TokenNameMINUS
s	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
increment	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
h	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
;	TokenNameSEMICOLON
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
s	TokenNameIdentifier
+	TokenNamePLUS
increment	TokenNameIdentifier
)	TokenNameRPAREN
&	TokenNameAND
(	TokenNameLPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
keys	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
key	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
s	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
keys	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
emptyVal	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
-	TokenNameMINUS
s	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
exists	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
find	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
put	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
key	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
s	TokenNameIdentifier
=	TokenNameEQUAL
find	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
count	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
count	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
rehashCount	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
rehash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
getSlot	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
s	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
keys	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
key	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
s	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
rehash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
newSize	TokenNameIdentifier
=	TokenNameEQUAL
keys	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
oldKeys	TokenNameIdentifier
=	TokenNameEQUAL
keys	TokenNameIdentifier
;	TokenNameSEMICOLON
keys	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
newSize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
emptyVal	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
Arrays	TokenNameIdentifier
.	TokenNameDOT
fill	TokenNameIdentifier
(	TokenNameLPAREN
keys	TokenNameIdentifier
,	TokenNameCOMMA
emptyVal	TokenNameIdentifier
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
oldKeys	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
key	TokenNameIdentifier
=	TokenNameEQUAL
oldKeys	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
key	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
emptyVal	TokenNameIdentifier
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
int	TokenNameint
newSlot	TokenNameIdentifier
=	TokenNameEQUAL
getSlot	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
keys	TokenNameIdentifier
[	TokenNameLBRACKET
newSlot	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
key	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
rehashCount	TokenNameIdentifier
=	TokenNameEQUAL
newSize	TokenNameIdentifier
-	TokenNameMINUS
(	TokenNameLPAREN
newSize	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
