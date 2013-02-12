package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
fst	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
DataInput	TokenNameIdentifier
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
DataOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
BytesRef	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
ByteSequenceOutputs	TokenNameIdentifier
extends	TokenNameextends
Outputs	TokenNameIdentifier
<	TokenNameLESS
BytesRef	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
BytesRef	TokenNameIdentifier
NO_OUTPUT	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
static	TokenNamestatic
ByteSequenceOutputs	TokenNameIdentifier
singleton	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteSequenceOutputs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
ByteSequenceOutputs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
ByteSequenceOutputs	TokenNameIdentifier
getSingleton	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
singleton	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
BytesRef	TokenNameIdentifier
common	TokenNameIdentifier
(	TokenNameLPAREN
BytesRef	TokenNameIdentifier
output1	TokenNameIdentifier
,	TokenNameCOMMA
BytesRef	TokenNameIdentifier
output2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
output1	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
output2	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
pos1	TokenNameIdentifier
=	TokenNameEQUAL
output1	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
pos2	TokenNameIdentifier
=	TokenNameEQUAL
output2	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
stopAt1	TokenNameIdentifier
=	TokenNameEQUAL
pos1	TokenNameIdentifier
+	TokenNamePLUS
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
output1	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
output2	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
pos1	TokenNameIdentifier
<	TokenNameLESS
stopAt1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
output1	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
pos1	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
output2	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
[	TokenNameLBRACKET
pos2	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
pos1	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
pos2	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
pos1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
output1	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
NO_OUTPUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
pos1	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
output1	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
+	TokenNamePLUS
output1	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
output1	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
pos2	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
output2	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
+	TokenNamePLUS
output2	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
output2	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
output1	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
output1	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
,	TokenNameCOMMA
pos1	TokenNameIdentifier
-	TokenNameMINUS
output1	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
BytesRef	TokenNameIdentifier
subtract	TokenNameIdentifier
(	TokenNameLPAREN
BytesRef	TokenNameIdentifier
output	TokenNameIdentifier
,	TokenNameCOMMA
BytesRef	TokenNameIdentifier
inc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
output	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
inc	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
inc	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_OUTPUT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
output	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
inc	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
NO_OUTPUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assert	TokenNameassert
inc	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
<	TokenNameLESS
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
:	TokenNameCOLON
"inc.length="	TokenNameStringLiteral
+	TokenNamePLUS
inc	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
+	TokenNamePLUS
" vs output.length="	TokenNameStringLiteral
+	TokenNamePLUS
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
inc	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
output	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
+	TokenNamePLUS
inc	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
inc	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
BytesRef	TokenNameIdentifier
add	TokenNameIdentifier
(	TokenNameLPAREN
BytesRef	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
BytesRef	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
prefix	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
output	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_OUTPUT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
output	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
output	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NO_OUTPUT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
assert	TokenNameassert
prefix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
assert	TokenNameassert
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
BytesRef	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
+	TokenNamePLUS
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
prefix	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
prefix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
output	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
prefix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
=	TokenNameEQUAL
prefix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
+	TokenNamePLUS
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
write	TokenNameIdentifier
(	TokenNameLPAREN
BytesRef	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
DataOutput	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
assert	TokenNameassert
prefix	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
prefix	TokenNameIdentifier
.	TokenNameDOT
offset	TokenNameIdentifier
,	TokenNameCOMMA
prefix	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
BytesRef	TokenNameIdentifier
read	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readVInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
len	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
NO_OUTPUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
final	TokenNamefinal
BytesRef	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
in	TokenNameIdentifier
.	TokenNameDOT
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
output	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
=	TokenNameEQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
output	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
BytesRef	TokenNameIdentifier
getNoOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
NO_OUTPUT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
outputToString	TokenNameIdentifier
(	TokenNameLPAREN
BytesRef	TokenNameIdentifier
output	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
output	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE