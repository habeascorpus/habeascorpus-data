package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
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
UTF16Decoder	TokenNameIdentifier
extends	TokenNameextends
AbstractCharDecoder	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
bigEndian	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
UTF16Decoder	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
b1	TokenNameIdentifier
=	TokenNameEQUAL
is	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
b1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
endOfStreamError	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-16"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
b2	TokenNameIdentifier
=	TokenNameEQUAL
is	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
b2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
endOfStreamError	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-16"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
m	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
b1	TokenNameIdentifier
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
<<	TokenNameLEFT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
(	TokenNameLPAREN
b2	TokenNameIdentifier
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
m	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
0xfeff	TokenNameIntegerLiteral
:	TokenNameCOLON
bigEndian	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
0xfffe	TokenNameIntegerLiteral
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
charError	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-16"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
UTF16Decoder	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
be	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bigEndian	TokenNameIdentifier
=	TokenNameEQUAL
be	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
readChar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
position	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
count	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fillBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
count	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
END_OF_STREAM	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
byte	TokenNamebyte
b1	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
position	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
position	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
count	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fillBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
count	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
endOfStreamError	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-16"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
byte	TokenNamebyte
b2	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
position	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
c	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
bigEndian	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
b1	TokenNameIdentifier
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
<<	TokenNameLEFT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
(	TokenNameLPAREN
b2	TokenNameIdentifier
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
b2	TokenNameIdentifier
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
<<	TokenNameLEFT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
|	TokenNameOR
(	TokenNameLPAREN
b1	TokenNameIdentifier
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0xfffe	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
charError	TokenNameIdentifier
(	TokenNameLPAREN
"UTF-16"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
c	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE