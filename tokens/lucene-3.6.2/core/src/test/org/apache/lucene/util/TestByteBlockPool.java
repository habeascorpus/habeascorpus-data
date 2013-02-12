package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
EOFException	TokenNameIdentifier
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
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
RAMDirectory	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestByteBlockPool	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testCopyRefAndWrite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
list	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
maxLength	TokenNameIdentifier
=	TokenNameEQUAL
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
500	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBlockPool	TokenNameIdentifier
pool	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ByteBlockPool	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ByteBlockPool	TokenNameIdentifier
.	TokenNameDOT
DirectAllocator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pool	TokenNameIdentifier
.	TokenNameDOT
nextBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
numValues	TokenNameIdentifier
=	TokenNameEQUAL
atLeast	TokenNameIdentifier
(	TokenNameLPAREN
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BytesRef	TokenNameIdentifier
ref	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
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
numValues	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
randomRealisticUnicodeString	TokenNameIdentifier
(	TokenNameLPAREN
random	TokenNameIdentifier
,	TokenNameCOMMA
maxLength	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
list	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ref	TokenNameIdentifier
.	TokenNameDOT
copyChars	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pool	TokenNameIdentifier
.	TokenNameDOT
copy	TokenNameIdentifier
(	TokenNameLPAREN
ref	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
RAMDirectory	TokenNameIdentifier
dir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RAMDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexOutput	TokenNameIdentifier
stream	TokenNameIdentifier
=	TokenNameEQUAL
dir	TokenNameIdentifier
.	TokenNameDOT
createOutput	TokenNameIdentifier
(	TokenNameLPAREN
"foo.txt"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pool	TokenNameIdentifier
.	TokenNameDOT
writePool	TokenNameIdentifier
(	TokenNameLPAREN
stream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stream	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
stream	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexInput	TokenNameIdentifier
input	TokenNameIdentifier
=	TokenNameEQUAL
dir	TokenNameIdentifier
.	TokenNameDOT
openInput	TokenNameIdentifier
(	TokenNameLPAREN
"foo.txt"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
pool	TokenNameIdentifier
.	TokenNameDOT
byteOffset	TokenNameIdentifier
+	TokenNamePLUS
pool	TokenNameIdentifier
.	TokenNameDOT
byteUpto	TokenNameIdentifier
,	TokenNameCOMMA
stream	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BytesRef	TokenNameIdentifier
expected	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BytesRef	TokenNameIdentifier
actual	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BytesRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
string	TokenNameIdentifier
:	TokenNameCOLON
list	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
expected	TokenNameIdentifier
.	TokenNameDOT
copyChars	TokenNameIdentifier
(	TokenNameLPAREN
string	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
actual	TokenNameIdentifier
.	TokenNameDOT
grow	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
actual	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
=	TokenNameEQUAL
expected	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
input	TokenNameIdentifier
.	TokenNameDOT
readBytes	TokenNameIdentifier
(	TokenNameLPAREN
actual	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
actual	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
,	TokenNameCOMMA
actual	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
input	TokenNameIdentifier
.	TokenNameDOT
readByte	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"must be EOF"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
EOFException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
dir	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
