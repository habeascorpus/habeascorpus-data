package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
TreeMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
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
DirectoryScanner	TokenNameIdentifier
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
resources	TokenNameIdentifier
.	TokenNameDOT
FileResource	TokenNameIdentifier
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
resources	TokenNameIdentifier
.	TokenNameDOT
FileResourceIterator	TokenNameIdentifier
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
resources	TokenNameIdentifier
.	TokenNameDOT
FileProvider	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
ArchiveScanner	TokenNameIdentifier
extends	TokenNameextends
DirectoryScanner	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
File	TokenNameIdentifier
srcFile	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Resource	TokenNameIdentifier
src	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Resource	TokenNameIdentifier
lastScannedResource	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
TreeMap	TokenNameIdentifier
fileEntries	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
TreeMap	TokenNameIdentifier
dirEntries	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
TreeMap	TokenNameIdentifier
matchFileEntries	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
TreeMap	TokenNameIdentifier
matchDirEntries	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
encoding	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
errorOnMissingArchive	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setErrorOnMissingArchive	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
errorOnMissingArchive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
errorOnMissingArchive	TokenNameIdentifier
=	TokenNameEQUAL
errorOnMissingArchive	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
scan	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
src	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
(	TokenNameLPAREN
!	TokenNameNOT
src	TokenNameIdentifier
.	TokenNameDOT
isExists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
errorOnMissingArchive	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
super	TokenNamesuper
.	TokenNameDOT
scan	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
srcFile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileResource	TokenNameIdentifier
(	TokenNameLPAREN
srcFile	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSrc	TokenNameIdentifier
(	TokenNameLPAREN
Resource	TokenNameIdentifier
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
src	TokenNameIdentifier
=	TokenNameEQUAL
src	TokenNameIdentifier
;	TokenNameSEMICOLON
FileProvider	TokenNameIdentifier
fp	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FileProvider	TokenNameIdentifier
)	TokenNameRPAREN
src	TokenNameIdentifier
.	TokenNameDOT
as	TokenNameIdentifier
(	TokenNameLPAREN
FileProvider	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fp	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
srcFile	TokenNameIdentifier
=	TokenNameEQUAL
fp	TokenNameIdentifier
.	TokenNameDOT
getFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setEncoding	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
encoding	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
encoding	TokenNameIdentifier
=	TokenNameEQUAL
encoding	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getIncludedFiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
src	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getIncludedFiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
scanme	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Set	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
matchFileEntries	TokenNameIdentifier
.	TokenNameDOT
keySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getIncludedFilesCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
src	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getIncludedFilesCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
scanme	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
matchFileEntries	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getIncludedDirectories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
src	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getIncludedDirectories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
scanme	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Set	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
matchDirEntries	TokenNameIdentifier
.	TokenNameDOT
keySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
s	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getIncludedDirsCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
src	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getIncludedDirsCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
scanme	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
matchDirEntries	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Iterator	TokenNameIdentifier
getResourceFiles	TokenNameIdentifier
(	TokenNameLPAREN
Project	TokenNameIdentifier
project	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
src	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FileResourceIterator	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
,	TokenNameCOMMA
getBasedir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
getIncludedFiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
scanme	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
matchFileEntries	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Iterator	TokenNameIdentifier
getResourceDirectories	TokenNameIdentifier
(	TokenNameLPAREN
Project	TokenNameIdentifier
project	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
src	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
FileResourceIterator	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
,	TokenNameCOMMA
getBasedir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
getIncludedDirectories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
scanme	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
matchDirEntries	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
includes	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
includes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
includes	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
"**"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
excludes	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
excludes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
match	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
path	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
vpath	TokenNameIdentifier
=	TokenNameEQUAL
path	TokenNameIdentifier
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'/'	TokenNameCharacterLiteral
,	TokenNameCOMMA
File	TokenNameIdentifier
.	TokenNameDOT
separatorChar	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
replace	TokenNameIdentifier
(	TokenNameLPAREN
'\\'	TokenNameCharacterLiteral
,	TokenNameCOMMA
File	TokenNameIdentifier
.	TokenNameDOT
separatorChar	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
isIncluded	TokenNameIdentifier
(	TokenNameLPAREN
vpath	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
isExcluded	TokenNameIdentifier
(	TokenNameLPAREN
vpath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Resource	TokenNameIdentifier
getResource	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
src	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Resource	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
Long	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
scanme	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fileEntries	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Resource	TokenNameIdentifier
)	TokenNameRPAREN
fileEntries	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
name	TokenNameIdentifier
=	TokenNameEQUAL
trimSeparator	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dirEntries	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Resource	TokenNameIdentifier
)	TokenNameRPAREN
dirEntries	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
Resource	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
abstract	TokenNameabstract
void	TokenNamevoid
fillMapsFromArchive	TokenNameIdentifier
(	TokenNameLPAREN
Resource	TokenNameIdentifier
archive	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
encoding	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
fileEntries	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
matchFileEntries	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
dirEntries	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
matchDirEntries	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
void	TokenNamevoid
scanme	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
src	TokenNameIdentifier
.	TokenNameDOT
isExists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
errorOnMissingArchive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Resource	TokenNameIdentifier
thisresource	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Resource	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
isExists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
src	TokenNameIdentifier
.	TokenNameDOT
getLastModified	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lastScannedResource	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
lastScannedResource	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
thisresource	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
lastScannedResource	TokenNameIdentifier
.	TokenNameDOT
getLastModified	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
thisresource	TokenNameIdentifier
.	TokenNameDOT
getLastModified	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fileEntries	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dirEntries	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
matchFileEntries	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
matchDirEntries	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fillMapsFromArchive	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
,	TokenNameCOMMA
encoding	TokenNameIdentifier
,	TokenNameCOMMA
fileEntries	TokenNameIdentifier
,	TokenNameCOMMA
matchFileEntries	TokenNameIdentifier
,	TokenNameCOMMA
dirEntries	TokenNameIdentifier
,	TokenNameCOMMA
matchDirEntries	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
lastScannedResource	TokenNameIdentifier
=	TokenNameEQUAL
thisresource	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
trimSeparator	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
s	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"/"	TokenNameStringLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
s	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
s	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
:	TokenNameCOLON
s	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
