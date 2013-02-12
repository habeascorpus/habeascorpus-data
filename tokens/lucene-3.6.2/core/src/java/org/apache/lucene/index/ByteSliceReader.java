package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
IndexInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
IndexOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
ByteSliceReader	TokenNameIdentifier
extends	TokenNameextends
IndexInput	TokenNameIdentifier
{	TokenNameLBRACE
ByteBlockPool	TokenNameIdentifier
pool	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
bufferUpto	TokenNameIdentifier
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
upto	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
limit	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
level	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
bufferOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
int	TokenNameint
endIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
ByteBlockPool	TokenNameIdentifier
pool	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
startIndex	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
endIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
endIndex	TokenNameIdentifier
-	TokenNameMINUS
startIndex	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
startIndex	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
endIndex	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
pool	TokenNameIdentifier
=	TokenNameEQUAL
pool	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
endIndex	TokenNameIdentifier
=	TokenNameEQUAL
endIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
level	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
bufferUpto	TokenNameIdentifier
=	TokenNameEQUAL
startIndex	TokenNameIdentifier
/	TokenNameDIVIDE
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
BYTE_BLOCK_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
bufferOffset	TokenNameIdentifier
=	TokenNameEQUAL
bufferUpto	TokenNameIdentifier
*	TokenNameMULTIPLY
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
BYTE_BLOCK_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
=	TokenNameEQUAL
pool	TokenNameIdentifier
.	TokenNameDOT
buffers	TokenNameIdentifier
[	TokenNameLBRACKET
bufferUpto	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
upto	TokenNameIdentifier
=	TokenNameEQUAL
startIndex	TokenNameIdentifier
&	TokenNameAND
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
BYTE_BLOCK_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
firstSize	TokenNameIdentifier
=	TokenNameEQUAL
ByteBlockPool	TokenNameIdentifier
.	TokenNameDOT
levelSizeArray	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
+	TokenNamePLUS
firstSize	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
endIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
limit	TokenNameIdentifier
=	TokenNameEQUAL
endIndex	TokenNameIdentifier
&	TokenNameAND
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
BYTE_BLOCK_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
limit	TokenNameIdentifier
=	TokenNameEQUAL
upto	TokenNameIdentifier
+	TokenNamePLUS
firstSize	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
eof	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
upto	TokenNameIdentifier
+	TokenNamePLUS
bufferOffset	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
endIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
upto	TokenNameIdentifier
+	TokenNamePLUS
bufferOffset	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
endIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
byte	TokenNamebyte
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
!	TokenNameNOT
eof	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
upto	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
limit	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
upto	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
limit	TokenNameIdentifier
)	TokenNameRPAREN
nextSlice	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
upto	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
writeTo	TokenNameIdentifier
(	TokenNameLPAREN
IndexOutput	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
long	TokenNamelong
size	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
limit	TokenNameIdentifier
+	TokenNamePLUS
bufferOffset	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
endIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
endIndex	TokenNameIdentifier
-	TokenNameMINUS
bufferOffset	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
upto	TokenNameIdentifier
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
upto	TokenNameIdentifier
,	TokenNameCOMMA
limit	TokenNameIdentifier
-	TokenNameMINUS
upto	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
limit	TokenNameIdentifier
-	TokenNameMINUS
upto	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
upto	TokenNameIdentifier
,	TokenNameCOMMA
limit	TokenNameIdentifier
-	TokenNameMINUS
upto	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
limit	TokenNameIdentifier
-	TokenNameMINUS
upto	TokenNameIdentifier
;	TokenNameSEMICOLON
nextSlice	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
nextSlice	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
nextIndex	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
limit	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
<<	TokenNameLEFT_SHIFT
24	TokenNameIntegerLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
(	TokenNameLPAREN
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
+	TokenNamePLUS
limit	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
<<	TokenNameLEFT_SHIFT
16	TokenNameIntegerLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
(	TokenNameLPAREN
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
+	TokenNamePLUS
limit	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
<<	TokenNameLEFT_SHIFT
8	TokenNameIntegerLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
(	TokenNameLPAREN
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
+	TokenNamePLUS
limit	TokenNameIdentifier
]	TokenNameRBRACKET
&	TokenNameAND
0xff	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
level	TokenNameIdentifier
=	TokenNameEQUAL
ByteBlockPool	TokenNameIdentifier
.	TokenNameDOT
nextLevelArray	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
newSize	TokenNameIdentifier
=	TokenNameEQUAL
ByteBlockPool	TokenNameIdentifier
.	TokenNameDOT
levelSizeArray	TokenNameIdentifier
[	TokenNameLBRACKET
level	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
bufferUpto	TokenNameIdentifier
=	TokenNameEQUAL
nextIndex	TokenNameIdentifier
/	TokenNameDIVIDE
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
BYTE_BLOCK_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
bufferOffset	TokenNameIdentifier
=	TokenNameEQUAL
bufferUpto	TokenNameIdentifier
*	TokenNameMULTIPLY
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
BYTE_BLOCK_SIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
=	TokenNameEQUAL
pool	TokenNameIdentifier
.	TokenNameDOT
buffers	TokenNameIdentifier
[	TokenNameLBRACKET
bufferUpto	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
upto	TokenNameIdentifier
=	TokenNameEQUAL
nextIndex	TokenNameIdentifier
&	TokenNameAND
DocumentsWriter	TokenNameIdentifier
.	TokenNameDOT
BYTE_BLOCK_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nextIndex	TokenNameIdentifier
+	TokenNamePLUS
newSize	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
endIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
endIndex	TokenNameIdentifier
-	TokenNameMINUS
nextIndex	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
limit	TokenNameIdentifier
=	TokenNameEQUAL
endIndex	TokenNameIdentifier
-	TokenNameMINUS
bufferOffset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
limit	TokenNameIdentifier
=	TokenNameEQUAL
upto	TokenNameIdentifier
+	TokenNamePLUS
newSize	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
b	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
len	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
numLeft	TokenNameIdentifier
=	TokenNameEQUAL
limit	TokenNameIdentifier
-	TokenNameMINUS
upto	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
numLeft	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
upto	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
numLeft	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
numLeft	TokenNameIdentifier
;	TokenNameSEMICOLON
len	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
numLeft	TokenNameIdentifier
;	TokenNameSEMICOLON
nextSlice	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
,	TokenNameCOMMA
upto	TokenNameIdentifier
,	TokenNameCOMMA
b	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
upto	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
long	TokenNamelong
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"not implemented"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
long	TokenNamelong
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"not implemented"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
seek	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
pos	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"not implemented"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"not implemented"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE