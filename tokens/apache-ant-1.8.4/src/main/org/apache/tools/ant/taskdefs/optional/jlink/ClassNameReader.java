package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
optional	TokenNameIdentifier
.	TokenNameDOT
jlink	TokenNameIdentifier
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
DataInputStream	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
ConstantPool	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
byte	TokenNamebyte
UTF8	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
UNUSED	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
INTEGER	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
FLOAT	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
LONG	TokenNameIdentifier
=	TokenNameEQUAL
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
DOUBLE	TokenNameIdentifier
=	TokenNameEQUAL
6	TokenNameIntegerLiteral
,	TokenNameCOMMA
CLASS	TokenNameIdentifier
=	TokenNameEQUAL
7	TokenNameIntegerLiteral
,	TokenNameCOMMA
STRING	TokenNameIdentifier
=	TokenNameEQUAL
8	TokenNameIntegerLiteral
,	TokenNameCOMMA
FIELDREF	TokenNameIdentifier
=	TokenNameEQUAL
9	TokenNameIntegerLiteral
,	TokenNameCOMMA
METHODREF	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
,	TokenNameCOMMA
INTERFACEMETHODREF	TokenNameIdentifier
=	TokenNameEQUAL
11	TokenNameIntegerLiteral
,	TokenNameCOMMA
NAMEANDTYPE	TokenNameIdentifier
=	TokenNameEQUAL
12	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
types	TokenNameIdentifier
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
values	TokenNameIdentifier
;	TokenNameSEMICOLON
ConstantPool	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
data	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
data	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
types	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
count	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
values	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
count	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
count	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
byte	TokenNamebyte
type	TokenNameIdentifier
=	TokenNameEQUAL
data	TokenNameIdentifier
.	TokenNameDOT
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
types	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
UTF8	TokenNameIdentifier
:	TokenNameCOLON
values	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
data	TokenNameIdentifier
.	TokenNameDOT
readUTF	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
UNUSED	TokenNameIdentifier
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
INTEGER	TokenNameIdentifier
:	TokenNameCOLON
values	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
FLOAT	TokenNameIdentifier
:	TokenNameCOLON
values	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
Float	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
.	TokenNameDOT
readFloat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
LONG	TokenNameIdentifier
:	TokenNameCOLON
values	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
Long	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
.	TokenNameDOT
readLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
DOUBLE	TokenNameIdentifier
:	TokenNameCOLON
values	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
Double	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
.	TokenNameDOT
readDouble	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
CLASS	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
STRING	TokenNameIdentifier
:	TokenNameCOLON
values	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
FIELDREF	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
METHODREF	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
INTERFACEMETHODREF	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
NAMEANDTYPE	TokenNameIdentifier
:	TokenNameCOLON
values	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
class	TokenNameclass
ClassNameReader	TokenNameIdentifier
extends	TokenNameextends
Object	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
CLASS_MAGIC_NUMBER	TokenNameIdentifier
=	TokenNameEQUAL
0xCAFEBABE	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getClassName	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
input	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
DataInputStream	TokenNameIdentifier
data	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataInputStream	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
cookie	TokenNameIdentifier
=	TokenNameEQUAL
data	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cookie	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
CLASS_MAGIC_NUMBER	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
data	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ConstantPool	TokenNameIdentifier
constants	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ConstantPool	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
values	TokenNameIdentifier
=	TokenNameEQUAL
constants	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
;	TokenNameSEMICOLON
data	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
classIndex	TokenNameIdentifier
=	TokenNameEQUAL
data	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Integer	TokenNameIdentifier
stringIndex	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
values	TokenNameIdentifier
[	TokenNameLBRACKET
classIndex	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
String	TokenNameIdentifier
className	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
values	TokenNameIdentifier
[	TokenNameLBRACKET
stringIndex	TokenNameIdentifier
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
return	TokenNamereturn
className	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE