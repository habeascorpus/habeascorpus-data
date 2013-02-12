package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
zip	TokenNameIdentifier
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
InputStream	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
Enumeration	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
zip	TokenNameIdentifier
.	TokenNameDOT
CRC32	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
UTF8ZipFilesTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
UTF_8	TokenNameIdentifier
=	TokenNameEQUAL
"utf-8"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
CP437	TokenNameIdentifier
=	TokenNameEQUAL
"cp437"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
US_ASCII	TokenNameIdentifier
=	TokenNameEQUAL
"US-ASCII"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ASCII_TXT	TokenNameIdentifier
=	TokenNameEQUAL
"ascii.txt"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
EURO_FOR_DOLLAR_TXT	TokenNameIdentifier
=	TokenNameEQUAL
"€_for_Dollar.txt"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
OIL_BARREL_TXT	TokenNameIdentifier
=	TokenNameEQUAL
"Ölfässer.txt"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
testUtf8FileRoundtripExplicitUnicodeExtra	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
testFileRoundtrip	TokenNameIdentifier
(	TokenNameLPAREN
UTF_8	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testUtf8FileRoundtripNoEFSExplicitUnicodeExtra	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
testFileRoundtrip	TokenNameIdentifier
(	TokenNameLPAREN
UTF_8	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCP437FileRoundtripExplicitUnicodeExtra	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
testFileRoundtrip	TokenNameIdentifier
(	TokenNameLPAREN
CP437	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testASCIIFileRoundtripExplicitUnicodeExtra	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
testFileRoundtrip	TokenNameIdentifier
(	TokenNameLPAREN
US_ASCII	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testUtf8FileRoundtripImplicitUnicodeExtra	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
testFileRoundtrip	TokenNameIdentifier
(	TokenNameLPAREN
UTF_8	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testUtf8FileRoundtripNoEFSImplicitUnicodeExtra	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
testFileRoundtrip	TokenNameIdentifier
(	TokenNameLPAREN
UTF_8	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testCP437FileRoundtripImplicitUnicodeExtra	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
testFileRoundtrip	TokenNameIdentifier
(	TokenNameLPAREN
CP437	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testASCIIFileRoundtripImplicitUnicodeExtra	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
testFileRoundtrip	TokenNameIdentifier
(	TokenNameLPAREN
US_ASCII	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testZipFileReadsUnicodeFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
file	TokenNameIdentifier
=	TokenNameEQUAL
File	TokenNameIdentifier
.	TokenNameDOT
createTempFile	TokenNameIdentifier
(	TokenNameLPAREN
"unicode-test"	TokenNameStringLiteral
,	TokenNameCOMMA
".zip"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ZipFile	TokenNameIdentifier
zf	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
createTestFile	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
,	TokenNameCOMMA
US_ASCII	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ZipFile	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
,	TokenNameCOMMA
US_ASCII	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertCanRead	TokenNameIdentifier
(	TokenNameLPAREN
zf	TokenNameIdentifier
,	TokenNameCOMMA
ASCII_TXT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertCanRead	TokenNameIdentifier
(	TokenNameLPAREN
zf	TokenNameIdentifier
,	TokenNameCOMMA
EURO_FOR_DOLLAR_TXT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertCanRead	TokenNameIdentifier
(	TokenNameLPAREN
zf	TokenNameIdentifier
,	TokenNameCOMMA
OIL_BARREL_TXT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
ZipFile	TokenNameIdentifier
.	TokenNameDOT
closeQuietly	TokenNameIdentifier
(	TokenNameLPAREN
zf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
file	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
file	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
testFileRoundtrip	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
encoding	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
withEFS	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
withExplicitUnicodeExtra	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
File	TokenNameIdentifier
file	TokenNameIdentifier
=	TokenNameEQUAL
File	TokenNameIdentifier
.	TokenNameDOT
createTempFile	TokenNameIdentifier
(	TokenNameLPAREN
encoding	TokenNameIdentifier
+	TokenNamePLUS
"-test"	TokenNameStringLiteral
,	TokenNameCOMMA
".zip"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
createTestFile	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
,	TokenNameCOMMA
encoding	TokenNameIdentifier
,	TokenNameCOMMA
withEFS	TokenNameIdentifier
,	TokenNameCOMMA
withExplicitUnicodeExtra	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testFile	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
,	TokenNameCOMMA
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
file	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
file	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
createTestFile	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
file	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
encoding	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
withEFS	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
withExplicitUnicodeExtra	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
UnsupportedEncodingException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
ZipEncoding	TokenNameIdentifier
zipEncoding	TokenNameIdentifier
=	TokenNameEQUAL
ZipEncodingHelper	TokenNameIdentifier
.	TokenNameDOT
getZipEncoding	TokenNameIdentifier
(	TokenNameLPAREN
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ZipOutputStream	TokenNameIdentifier
zos	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
zos	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ZipOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zos	TokenNameIdentifier
.	TokenNameDOT
setEncoding	TokenNameIdentifier
(	TokenNameLPAREN
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zos	TokenNameIdentifier
.	TokenNameDOT
setUseLanguageEncodingFlag	TokenNameIdentifier
(	TokenNameLPAREN
withEFS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zos	TokenNameIdentifier
.	TokenNameDOT
setCreateUnicodeExtraFields	TokenNameIdentifier
(	TokenNameLPAREN
withExplicitUnicodeExtra	TokenNameIdentifier
?	TokenNameQUESTION
ZipOutputStream	TokenNameIdentifier
.	TokenNameDOT
UnicodeExtraFieldPolicy	TokenNameIdentifier
.	TokenNameDOT
NEVER	TokenNameIdentifier
:	TokenNameCOLON
ZipOutputStream	TokenNameIdentifier
.	TokenNameDOT
UnicodeExtraFieldPolicy	TokenNameIdentifier
.	TokenNameDOT
ALWAYS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ZipEntry	TokenNameIdentifier
ze	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ZipEntry	TokenNameIdentifier
(	TokenNameLPAREN
OIL_BARREL_TXT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
withExplicitUnicodeExtra	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
zipEncoding	TokenNameIdentifier
.	TokenNameDOT
canEncode	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ByteBuffer	TokenNameIdentifier
en	TokenNameIdentifier
=	TokenNameEQUAL
zipEncoding	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ze	TokenNameIdentifier
.	TokenNameDOT
addExtraField	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
UnicodePathExtraField	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
en	TokenNameIdentifier
.	TokenNameDOT
array	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
en	TokenNameIdentifier
.	TokenNameDOT
arrayOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
en	TokenNameIdentifier
.	TokenNameDOT
limit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
zos	TokenNameIdentifier
.	TokenNameDOT
putNextEntry	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zos	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
"Hello, world!"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"US-ASCII"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zos	TokenNameIdentifier
.	TokenNameDOT
closeEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ze	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ZipEntry	TokenNameIdentifier
(	TokenNameLPAREN
EURO_FOR_DOLLAR_TXT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
withExplicitUnicodeExtra	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
zipEncoding	TokenNameIdentifier
.	TokenNameDOT
canEncode	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ByteBuffer	TokenNameIdentifier
en	TokenNameIdentifier
=	TokenNameEQUAL
zipEncoding	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ze	TokenNameIdentifier
.	TokenNameDOT
addExtraField	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
UnicodePathExtraField	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
en	TokenNameIdentifier
.	TokenNameDOT
array	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
en	TokenNameIdentifier
.	TokenNameDOT
arrayOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
en	TokenNameIdentifier
.	TokenNameDOT
limit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
zos	TokenNameIdentifier
.	TokenNameDOT
putNextEntry	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zos	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
"Give me your money!"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"US-ASCII"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zos	TokenNameIdentifier
.	TokenNameDOT
closeEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ze	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ZipEntry	TokenNameIdentifier
(	TokenNameLPAREN
ASCII_TXT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
withExplicitUnicodeExtra	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
zipEncoding	TokenNameIdentifier
.	TokenNameDOT
canEncode	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ByteBuffer	TokenNameIdentifier
en	TokenNameIdentifier
=	TokenNameEQUAL
zipEncoding	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ze	TokenNameIdentifier
.	TokenNameDOT
addExtraField	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
UnicodePathExtraField	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
en	TokenNameIdentifier
.	TokenNameDOT
array	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
en	TokenNameIdentifier
.	TokenNameDOT
arrayOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
en	TokenNameIdentifier
.	TokenNameDOT
limit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
zos	TokenNameIdentifier
.	TokenNameDOT
putNextEntry	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zos	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
"ascii"	TokenNameStringLiteral
.	TokenNameDOT
getBytes	TokenNameIdentifier
(	TokenNameLPAREN
"US-ASCII"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
zos	TokenNameIdentifier
.	TokenNameDOT
closeEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
zos	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
zos	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
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
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
testFile	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
file	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
encoding	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
ZipFile	TokenNameIdentifier
zf	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
zf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ZipFile	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
,	TokenNameCOMMA
encoding	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Enumeration	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
zf	TokenNameIdentifier
.	TokenNameDOT
getEntries	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ZipEntry	TokenNameIdentifier
ze	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ZipEntry	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"sser.txt"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertUnicodeName	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
,	TokenNameCOMMA
OIL_BARREL_TXT	TokenNameIdentifier
,	TokenNameCOMMA
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"_for_Dollar.txt"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
assertUnicodeName	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
,	TokenNameCOMMA
EURO_FOR_DOLLAR_TXT	TokenNameIdentifier
,	TokenNameCOMMA
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ASCII_TXT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
AssertionError	TokenNameIdentifier
(	TokenNameLPAREN
"Urecognized ZIP entry with name ["	TokenNameStringLiteral
+	TokenNamePLUS
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"] found."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
ZipFile	TokenNameIdentifier
.	TokenNameDOT
closeQuietly	TokenNameIdentifier
(	TokenNameLPAREN
zf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
UnicodePathExtraField	TokenNameIdentifier
findUniCodePath	TokenNameIdentifier
(	TokenNameLPAREN
ZipEntry	TokenNameIdentifier
ze	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
UnicodePathExtraField	TokenNameIdentifier
)	TokenNameRPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getExtraField	TokenNameIdentifier
(	TokenNameLPAREN
UnicodePathExtraField	TokenNameIdentifier
.	TokenNameDOT
UPATH_ID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
assertUnicodeName	TokenNameIdentifier
(	TokenNameLPAREN
ZipEntry	TokenNameIdentifier
ze	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
expectedName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
encoding	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
expectedName	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
UnicodePathExtraField	TokenNameIdentifier
ucpf	TokenNameIdentifier
=	TokenNameEQUAL
findUniCodePath	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
ucpf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ZipEncoding	TokenNameIdentifier
enc	TokenNameIdentifier
=	TokenNameEQUAL
ZipEncodingHelper	TokenNameIdentifier
.	TokenNameDOT
getZipEncoding	TokenNameIdentifier
(	TokenNameLPAREN
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
ne	TokenNameIdentifier
=	TokenNameEQUAL
enc	TokenNameIdentifier
.	TokenNameDOT
encode	TokenNameIdentifier
(	TokenNameLPAREN
ze	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CRC32	TokenNameIdentifier
crc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CRC32	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
crc	TokenNameIdentifier
.	TokenNameDOT
update	TokenNameIdentifier
(	TokenNameLPAREN
ne	TokenNameIdentifier
.	TokenNameDOT
array	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ne	TokenNameIdentifier
.	TokenNameDOT
arrayOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ne	TokenNameIdentifier
.	TokenNameDOT
limit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
crc	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ucpf	TokenNameIdentifier
.	TokenNameDOT
getNameCRC32	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expectedName	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
String	TokenNameIdentifier
(	TokenNameLPAREN
ucpf	TokenNameIdentifier
.	TokenNameDOT
getUnicodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
UTF_8	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
assertCanRead	TokenNameIdentifier
(	TokenNameLPAREN
ZipFile	TokenNameIdentifier
zf	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
fileName	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
ZipEntry	TokenNameIdentifier
entry	TokenNameIdentifier
=	TokenNameEQUAL
zf	TokenNameIdentifier
.	TokenNameDOT
getEntry	TokenNameIdentifier
(	TokenNameLPAREN
fileName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"Entry "	TokenNameStringLiteral
+	TokenNamePLUS
fileName	TokenNameIdentifier
+	TokenNamePLUS
" doesn't exist"	TokenNameStringLiteral
,	TokenNameCOMMA
entry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
=	TokenNameEQUAL
zf	TokenNameIdentifier
.	TokenNameDOT
getInputStream	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertNotNull	TokenNameIdentifier
(	TokenNameLPAREN
"InputStream is null"	TokenNameStringLiteral
,	TokenNameCOMMA
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
is	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
is	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
