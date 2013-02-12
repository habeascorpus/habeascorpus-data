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
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedInputStream	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
zip	TokenNameIdentifier
.	TokenNameDOT
GZIPInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
BuildException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Project	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
EnumeratedAttribute	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
Resource	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
FileNameMapper	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
FileUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
bzip2	TokenNameIdentifier
.	TokenNameDOT
CBZip2InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
tar	TokenNameIdentifier
.	TokenNameDOT
TarEntry	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
tar	TokenNameIdentifier
.	TokenNameDOT
TarInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Untar	TokenNameIdentifier
extends	TokenNameextends
Expand	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
UntarCompressionMethod	TokenNameIdentifier
compression	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UntarCompressionMethod	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setCompression	TokenNameIdentifier
(	TokenNameLPAREN
UntarCompressionMethod	TokenNameIdentifier
method	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
compression	TokenNameIdentifier
=	TokenNameEQUAL
method	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setEncoding	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
encoding	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"The "	TokenNameStringLiteral
+	TokenNamePLUS
getTaskName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" task doesn't support the encoding"	TokenNameStringLiteral
+	TokenNamePLUS
" attribute"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setScanForUnicodeExtraFields	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"The "	TokenNameStringLiteral
+	TokenNamePLUS
getTaskName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" task doesn't support the encoding"	TokenNameStringLiteral
+	TokenNamePLUS
" attribute"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
expandFile	TokenNameIdentifier
(	TokenNameLPAREN
FileUtils	TokenNameIdentifier
fileUtils	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
srcF	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
dir	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FileInputStream	TokenNameIdentifier
fis	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
srcF	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Unable to untar "	TokenNameStringLiteral
+	TokenNamePLUS
srcF	TokenNameIdentifier
+	TokenNamePLUS
" as the file does not exist"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
fis	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FileInputStream	TokenNameIdentifier
(	TokenNameLPAREN
srcF	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expandStream	TokenNameIdentifier
(	TokenNameLPAREN
srcF	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
fis	TokenNameIdentifier
,	TokenNameCOMMA
dir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Error while expanding "	TokenNameStringLiteral
+	TokenNamePLUS
srcF	TokenNameIdentifier
.	TokenNameDOT
getPath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
ioe	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ioe	TokenNameIdentifier
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
fis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
expandResource	TokenNameIdentifier
(	TokenNameLPAREN
Resource	TokenNameIdentifier
srcR	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
dir	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
srcR	TokenNameIdentifier
.	TokenNameDOT
isExists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Unable to untar "	TokenNameStringLiteral
+	TokenNamePLUS
srcR	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" as the it does not exist"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
InputStream	TokenNameIdentifier
i	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
i	TokenNameIdentifier
=	TokenNameEQUAL
srcR	TokenNameIdentifier
.	TokenNameDOT
getInputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
expandStream	TokenNameIdentifier
(	TokenNameLPAREN
srcR	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
i	TokenNameIdentifier
,	TokenNameCOMMA
dir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Error while expanding "	TokenNameStringLiteral
+	TokenNamePLUS
srcR	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ioe	TokenNameIdentifier
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
expandStream	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
InputStream	TokenNameIdentifier
stream	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
dir	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
TarInputStream	TokenNameIdentifier
tis	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
tis	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TarInputStream	TokenNameIdentifier
(	TokenNameLPAREN
compression	TokenNameIdentifier
.	TokenNameDOT
decompress	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
BufferedInputStream	TokenNameIdentifier
(	TokenNameLPAREN
stream	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
"Expanding: "	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
+	TokenNamePLUS
" into "	TokenNameStringLiteral
+	TokenNamePLUS
dir	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_INFO	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TarEntry	TokenNameIdentifier
te	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
boolean	TokenNameboolean
empty	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
FileNameMapper	TokenNameIdentifier
mapper	TokenNameIdentifier
=	TokenNameEQUAL
getMapper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
te	TokenNameIdentifier
=	TokenNameEQUAL
tis	TokenNameIdentifier
.	TokenNameDOT
getNextEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
empty	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
extractFile	TokenNameIdentifier
(	TokenNameLPAREN
FileUtils	TokenNameIdentifier
.	TokenNameDOT
getFileUtils	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
dir	TokenNameIdentifier
,	TokenNameCOMMA
tis	TokenNameIdentifier
,	TokenNameCOMMA
te	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
te	TokenNameIdentifier
.	TokenNameDOT
getModTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
te	TokenNameIdentifier
.	TokenNameDOT
isDirectory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
mapper	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
empty	TokenNameIdentifier
&&	TokenNameAND_AND
getFailOnEmptyArchive	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"archive '"	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
+	TokenNamePLUS
"' is empty"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"expand complete"	TokenNameStringLiteral
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_VERBOSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
tis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
UntarCompressionMethod	TokenNameIdentifier
extends	TokenNameextends
EnumeratedAttribute	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
NONE	TokenNameIdentifier
=	TokenNameEQUAL
"none"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
GZIP	TokenNameIdentifier
=	TokenNameEQUAL
"gzip"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
BZIP2	TokenNameIdentifier
=	TokenNameEQUAL
"bzip2"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
UntarCompressionMethod	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setValue	TokenNameIdentifier
(	TokenNameLPAREN
NONE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getValues	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
NONE	TokenNameIdentifier
,	TokenNameCOMMA
GZIP	TokenNameIdentifier
,	TokenNameCOMMA
BZIP2	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
InputStream	TokenNameIdentifier
decompress	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
InputStream	TokenNameIdentifier
istream	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
GZIP	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
GZIPInputStream	TokenNameIdentifier
(	TokenNameLPAREN
istream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
BZIP2	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
magic	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
'B'	TokenNameCharacterLiteral
,	TokenNameCOMMA
'Z'	TokenNameCharacterLiteral
}	TokenNameRBRACE
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
magic	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
istream	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
magic	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid bz2 file."	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
CBZip2InputStream	TokenNameIdentifier
(	TokenNameLPAREN
istream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
istream	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
