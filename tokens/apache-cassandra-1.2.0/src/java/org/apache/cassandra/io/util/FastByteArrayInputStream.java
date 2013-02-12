package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ByteArrayInputStream	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
FastByteArrayInputStream	TokenNameIdentifier
extends	TokenNameextends
InputStream	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buf	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
pos	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
mark	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
count	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FastByteArrayInputStream	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
buf	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
mark	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
buf	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
count	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FastByteArrayInputStream	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
buf	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
buf	TokenNameIdentifier
=	TokenNameEQUAL
buf	TokenNameIdentifier
;	TokenNameSEMICOLON
pos	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
mark	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
count	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
+	TokenNamePLUS
length	TokenNameIdentifier
>	TokenNameGREATER
buf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
?	TokenNameQUESTION
buf	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
:	TokenNameCOLON
offset	TokenNameIdentifier
+	TokenNamePLUS
length	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
available	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
count	TokenNameIdentifier
-	TokenNameMINUS
pos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
mark	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
readlimit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
mark	TokenNameIdentifier
=	TokenNameEQUAL
pos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
markSupported	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
pos	TokenNameIdentifier
<	TokenNameLESS
count	TokenNameIdentifier
?	TokenNameQUESTION
buf	TokenNameIdentifier
[	TokenNameLBRACKET
pos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
&	TokenNameAND
0xFF	TokenNameIntegerLiteral
:	TokenNameCOLON
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
read	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
b	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
b	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NullPointerException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
offset	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
offset	TokenNameIdentifier
>	TokenNameGREATER
b	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
||	TokenNameOR_OR
length	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
length	TokenNameIdentifier
>	TokenNameGREATER
b	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
offset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IndexOutOfBoundsException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
pos	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
this	TokenNamethis
.	TokenNameDOT
count	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
copylen	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
count	TokenNameIdentifier
-	TokenNameMINUS
pos	TokenNameIdentifier
<	TokenNameLESS
length	TokenNameIdentifier
?	TokenNameQUESTION
this	TokenNamethis
.	TokenNameDOT
count	TokenNameIdentifier
-	TokenNameMINUS
pos	TokenNameIdentifier
:	TokenNameCOLON
length	TokenNameIdentifier
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
pos	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
copylen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pos	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
copylen	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
copylen	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
pos	TokenNameIdentifier
=	TokenNameEQUAL
mark	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
long	TokenNamelong
skip	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
n	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
n	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
temp	TokenNameIdentifier
=	TokenNameEQUAL
pos	TokenNameIdentifier
;	TokenNameSEMICOLON
pos	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
count	TokenNameIdentifier
-	TokenNameMINUS
pos	TokenNameIdentifier
<	TokenNameLESS
n	TokenNameIdentifier
?	TokenNameQUESTION
this	TokenNamethis
.	TokenNameDOT
count	TokenNameIdentifier
:	TokenNameCOLON
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
pos	TokenNameIdentifier
+	TokenNamePLUS
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
pos	TokenNameIdentifier
-	TokenNameMINUS
temp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE