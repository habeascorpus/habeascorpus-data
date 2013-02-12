package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
cn	TokenNameIdentifier
.	TokenNameDOT
smart	TokenNameIdentifier
.	TokenNameDOT
hhmm	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
SegTokenPair	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
charArray	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
from	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
to	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
double	TokenNamedouble
weight	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SegTokenPair	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
idArray	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
from	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
to	TokenNameIdentifier
,	TokenNameCOMMA
double	TokenNamedouble
weight	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
charArray	TokenNameIdentifier
=	TokenNameEQUAL
idArray	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
from	TokenNameIdentifier
=	TokenNameEQUAL
from	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
to	TokenNameIdentifier
=	TokenNameEQUAL
to	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
weight	TokenNameIdentifier
=	TokenNameEQUAL
weight	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
prime	TokenNameIdentifier
=	TokenNameEQUAL
31	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
result	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
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
charArray	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
prime	TokenNameIdentifier
*	TokenNameMULTIPLY
result	TokenNameIdentifier
+	TokenNamePLUS
charArray	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
prime	TokenNameIdentifier
*	TokenNameMULTIPLY
result	TokenNameIdentifier
+	TokenNamePLUS
from	TokenNameIdentifier
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
prime	TokenNameIdentifier
*	TokenNameMULTIPLY
result	TokenNameIdentifier
+	TokenNamePLUS
to	TokenNameIdentifier
;	TokenNameSEMICOLON
long	TokenNamelong
temp	TokenNameIdentifier
;	TokenNameSEMICOLON
temp	TokenNameIdentifier
=	TokenNameEQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
prime	TokenNameIdentifier
*	TokenNameMULTIPLY
result	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
temp	TokenNameIdentifier
^	TokenNameXOR
(	TokenNameLPAREN
temp	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
==	TokenNameEQUAL_EQUAL
obj	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
obj	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
obj	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
SegTokenPair	TokenNameIdentifier
other	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SegTokenPair	TokenNameIdentifier
)	TokenNameRPAREN
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
Arrays	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
charArray	TokenNameIdentifier
,	TokenNameCOMMA
other	TokenNameIdentifier
.	TokenNameDOT
charArray	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
from	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
from	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
to	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
other	TokenNameIdentifier
.	TokenNameDOT
to	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
weight	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
weight	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE