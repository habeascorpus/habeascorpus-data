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
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileNotFoundException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileOutputStream	TokenNameIdentifier
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
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ObjectInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ObjectOutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
RandomAccessFile	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
UnsupportedEncodingException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteOrder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
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
AnalyzerProfile	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
BigramDictionary	TokenNameIdentifier
extends	TokenNameextends
AbstractDictionary	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
BigramDictionary	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
WORD_SEGMENT_CHAR	TokenNameIdentifier
=	TokenNameEQUAL
'@'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
BigramDictionary	TokenNameIdentifier
singleInstance	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
=	TokenNameEQUAL
402137	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
bigramHashTable	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
frequencyTable	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
max	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
repeat	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
synchronized	TokenNamesynchronized
static	TokenNamestatic
BigramDictionary	TokenNameIdentifier
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
singleInstance	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
singleInstance	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BigramDictionary	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
singleInstance	TokenNameIdentifier
.	TokenNameDOT
load	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
dictRoot	TokenNameIdentifier
=	TokenNameEQUAL
AnalyzerProfile	TokenNameIdentifier
.	TokenNameDOT
ANALYSIS_DATA_DIR	TokenNameIdentifier
;	TokenNameSEMICOLON
singleInstance	TokenNameIdentifier
.	TokenNameDOT
load	TokenNameIdentifier
(	TokenNameLPAREN
dictRoot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
singleInstance	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
loadFromObj	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
serialObj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
loadFromInputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileInputStream	TokenNameIdentifier
(	TokenNameLPAREN
serialObj	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
FileNotFoundException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
loadFromInputStream	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
serialObjectInputStream	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ClassNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
ObjectInputStream	TokenNameIdentifier
input	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ObjectInputStream	TokenNameIdentifier
(	TokenNameLPAREN
serialObjectInputStream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bigramHashTable	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
long	TokenNamelong
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
input	TokenNameIdentifier
.	TokenNameDOT
readObject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
frequencyTable	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
input	TokenNameIdentifier
.	TokenNameDOT
readObject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
input	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
saveToObj	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
serialObj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
ObjectOutputStream	TokenNameIdentifier
output	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ObjectOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
serialObj	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
output	TokenNameIdentifier
.	TokenNameDOT
writeObject	TokenNameIdentifier
(	TokenNameLPAREN
bigramHashTable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
output	TokenNameIdentifier
.	TokenNameDOT
writeObject	TokenNameIdentifier
(	TokenNameLPAREN
frequencyTable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
output	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
load	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ClassNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
InputStream	TokenNameIdentifier
input	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
"bigramdict.mem"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loadFromInputStream	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
load	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
dictRoot	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
bigramDictPath	TokenNameIdentifier
=	TokenNameEQUAL
dictRoot	TokenNameIdentifier
+	TokenNamePLUS
"/bigramdict.dct"	TokenNameStringLiteral
;	TokenNameSEMICOLON
File	TokenNameIdentifier
serialObj	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
dictRoot	TokenNameIdentifier
+	TokenNamePLUS
"/bigramdict.mem"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
serialObj	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
loadFromObj	TokenNameIdentifier
(	TokenNameLPAREN
serialObj	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
bigramHashTable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
long	TokenNamelong
[	TokenNameLBRACKET
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
frequencyTable	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
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
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
bigramHashTable	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
frequencyTable	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
loadFromFile	TokenNameIdentifier
(	TokenNameLPAREN
bigramDictPath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
saveToObj	TokenNameIdentifier
(	TokenNameLPAREN
serialObj	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
loadFromFile	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
dctFilePath	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
FileNotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
,	TokenNameCOMMA
UnsupportedEncodingException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
i	TokenNameIdentifier
,	TokenNameCOMMA
cnt	TokenNameIdentifier
,	TokenNameCOMMA
length	TokenNameIdentifier
,	TokenNameCOMMA
total	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
intBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
String	TokenNameIdentifier
tmpword	TokenNameIdentifier
;	TokenNameSEMICOLON
RandomAccessFile	TokenNameIdentifier
dctFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RandomAccessFile	TokenNameIdentifier
(	TokenNameLPAREN
dctFilePath	TokenNameIdentifier
,	TokenNameCOMMA
"r"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
i	TokenNameIdentifier
=	TokenNameEQUAL
GB2312_FIRST_CHAR	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
GB2312_FIRST_CHAR	TokenNameIdentifier
+	TokenNamePLUS
CHAR_NUM_IN_FILE	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
currentStr	TokenNameIdentifier
=	TokenNameEQUAL
getCCByGB2312Id	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dctFile	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
intBuffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cnt	TokenNameIdentifier
=	TokenNameEQUAL
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
intBuffer	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
order	TokenNameIdentifier
(	TokenNameLPAREN
ByteOrder	TokenNameIdentifier
.	TokenNameDOT
LITTLE_ENDIAN	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cnt	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
total	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
cnt	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
j	TokenNameIdentifier
<	TokenNameLESS
cnt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
dctFile	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
intBuffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
intBuffer	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
order	TokenNameIdentifier
(	TokenNameLPAREN
ByteOrder	TokenNameIdentifier
.	TokenNameDOT
LITTLE_ENDIAN	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dctFile	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
intBuffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
ByteBuffer	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
intBuffer	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
order	TokenNameIdentifier
(	TokenNameLPAREN
ByteOrder	TokenNameIdentifier
.	TokenNameDOT
LITTLE_ENDIAN	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dctFile	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
intBuffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
length	TokenNameIdentifier
=	TokenNameEQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lchBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
byte	TokenNamebyte
[	TokenNameLBRACKET
length	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
dctFile	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
lchBuffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmpword	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
lchBuffer	TokenNameIdentifier
,	TokenNameCOMMA
"GB2312"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
3755	TokenNameIntegerLiteral
+	TokenNamePLUS
GB2312_FIRST_CHAR	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
tmpword	TokenNameIdentifier
=	TokenNameEQUAL
currentStr	TokenNameIdentifier
+	TokenNamePLUS
tmpword	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
char	TokenNamechar
carray	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
tmpword	TokenNameIdentifier
.	TokenNameDOT
toCharArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
hashId	TokenNameIdentifier
=	TokenNameEQUAL
hash1	TokenNameIdentifier
(	TokenNameLPAREN
carray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
getAvaliableIndex	TokenNameIdentifier
(	TokenNameLPAREN
hashId	TokenNameIdentifier
,	TokenNameCOMMA
carray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
bigramHashTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
bigramHashTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
hashId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
frequencyTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
+=	TokenNamePLUS_EQUAL
buffer	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
dctFile	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
getAvaliableIndex	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
hashId	TokenNameIdentifier
,	TokenNameCOMMA
char	TokenNamechar
carray	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
hash1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
hashId	TokenNameIdentifier
%	TokenNameREMAINDER
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
hash2	TokenNameIdentifier
=	TokenNameEQUAL
hash2	TokenNameIdentifier
(	TokenNameLPAREN
carray	TokenNameIdentifier
)	TokenNameRPAREN
%	TokenNameREMAINDER
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hash1	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
hash1	TokenNameIdentifier
=	TokenNameEQUAL
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
+	TokenNamePLUS
hash1	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hash2	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
hash2	TokenNameIdentifier
=	TokenNameEQUAL
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
+	TokenNamePLUS
hash2	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
hash1	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
bigramHashTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
bigramHashTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
hashId	TokenNameIdentifier
&&	TokenNameAND_AND
i	TokenNameIdentifier
<	TokenNameLESS
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
index	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
hash1	TokenNameIdentifier
+	TokenNamePLUS
i	TokenNameIdentifier
*	TokenNameMULTIPLY
hash2	TokenNameIdentifier
)	TokenNameRPAREN
%	TokenNameREMAINDER
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
bigramHashTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
bigramHashTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
hashId	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
index	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
getBigramItemIndex	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
carray	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
long	TokenNamelong
hashId	TokenNameIdentifier
=	TokenNameEQUAL
hash1	TokenNameIdentifier
(	TokenNameLPAREN
carray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
hash1	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
hashId	TokenNameIdentifier
%	TokenNameREMAINDER
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
hash2	TokenNameIdentifier
=	TokenNameEQUAL
hash2	TokenNameIdentifier
(	TokenNameLPAREN
carray	TokenNameIdentifier
)	TokenNameRPAREN
%	TokenNameREMAINDER
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hash1	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
hash1	TokenNameIdentifier
=	TokenNameEQUAL
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
+	TokenNamePLUS
hash1	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
hash2	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
hash2	TokenNameIdentifier
=	TokenNameEQUAL
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
+	TokenNamePLUS
hash2	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
hash1	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
repeat	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
bigramHashTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
bigramHashTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
hashId	TokenNameIdentifier
&&	TokenNameAND_AND
i	TokenNameIdentifier
<	TokenNameLESS
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
index	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
hash1	TokenNameIdentifier
+	TokenNamePLUS
i	TokenNameIdentifier
*	TokenNameMULTIPLY
hash2	TokenNameIdentifier
)	TokenNameRPAREN
%	TokenNameREMAINDER
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
repeat	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
>	TokenNameGREATER
max	TokenNameIdentifier
)	TokenNameRPAREN
max	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
PRIME_BIGRAM_LENGTH	TokenNameIdentifier
&&	TokenNameAND_AND
bigramHashTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
hashId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
index	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getFrequency	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
carray	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
getBigramItemIndex	TokenNameIdentifier
(	TokenNameLPAREN
carray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
frequencyTable	TokenNameIdentifier
[	TokenNameLBRACKET
index	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
