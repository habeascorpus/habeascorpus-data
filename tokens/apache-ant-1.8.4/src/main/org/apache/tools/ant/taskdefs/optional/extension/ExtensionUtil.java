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
extension	TokenNameIdentifier
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
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
jar	TokenNameIdentifier
.	TokenNameDOT
JarFile	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
jar	TokenNameIdentifier
.	TokenNameDOT
Manifest	TokenNameIdentifier
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
FileSet	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
ExtensionUtil	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
ExtensionUtil	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
static	TokenNamestatic
ArrayList	TokenNameIdentifier
toExtensions	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
List	TokenNameIdentifier
adapters	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
ArrayList	TokenNameIdentifier
results	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
adapters	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
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
size	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
ExtensionAdapter	TokenNameIdentifier
adapter	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ExtensionAdapter	TokenNameIdentifier
)	TokenNameRPAREN
adapters	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Extension	TokenNameIdentifier
extension	TokenNameIdentifier
=	TokenNameEQUAL
adapter	TokenNameIdentifier
.	TokenNameDOT
toExtension	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
extension	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
results	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
void	TokenNamevoid
extractExtensions	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Project	TokenNameIdentifier
project	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
List	TokenNameIdentifier
libraries	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
List	TokenNameIdentifier
fileset	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
fileset	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
Extension	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
extensions	TokenNameIdentifier
=	TokenNameEQUAL
getExtensions	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
,	TokenNameCOMMA
fileset	TokenNameIdentifier
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
extensions	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
libraries	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
extensions	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
Extension	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getExtensions	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Project	TokenNameIdentifier
project	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
List	TokenNameIdentifier
libraries	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
ArrayList	TokenNameIdentifier
extensions	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Iterator	TokenNameIdentifier
iterator	TokenNameIdentifier
=	TokenNameEQUAL
libraries	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
iterator	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
FileSet	TokenNameIdentifier
fileSet	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FileSet	TokenNameIdentifier
)	TokenNameRPAREN
iterator	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
includeImpl	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
boolean	TokenNameboolean
includeURL	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fileSet	TokenNameIdentifier
instanceof	TokenNameinstanceof
LibFileSet	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LibFileSet	TokenNameIdentifier
libFileSet	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
LibFileSet	TokenNameIdentifier
)	TokenNameRPAREN
fileSet	TokenNameIdentifier
;	TokenNameSEMICOLON
includeImpl	TokenNameIdentifier
=	TokenNameEQUAL
libFileSet	TokenNameIdentifier
.	TokenNameDOT
isIncludeImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
includeURL	TokenNameIdentifier
=	TokenNameEQUAL
libFileSet	TokenNameIdentifier
.	TokenNameDOT
isIncludeURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
DirectoryScanner	TokenNameIdentifier
scanner	TokenNameIdentifier
=	TokenNameEQUAL
fileSet	TokenNameIdentifier
.	TokenNameDOT
getDirectoryScanner	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
File	TokenNameIdentifier
basedir	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
getBasedir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
files	TokenNameIdentifier
=	TokenNameEQUAL
scanner	TokenNameIdentifier
.	TokenNameDOT
getIncludedFiles	TokenNameIdentifier
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
files	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
File	TokenNameIdentifier
file	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
,	TokenNameCOMMA
files	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
loadExtensions	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
,	TokenNameCOMMA
extensions	TokenNameIdentifier
,	TokenNameCOMMA
includeImpl	TokenNameIdentifier
,	TokenNameCOMMA
includeURL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Extension	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
extensions	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Extension	TokenNameIdentifier
[	TokenNameLBRACKET
extensions	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
loadExtensions	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
File	TokenNameIdentifier
file	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
List	TokenNameIdentifier
extensionList	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
includeImpl	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
includeURL	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
final	TokenNamefinal
JarFile	TokenNameIdentifier
jarFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JarFile	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
Extension	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
extensions	TokenNameIdentifier
=	TokenNameEQUAL
Extension	TokenNameIdentifier
.	TokenNameDOT
getAvailable	TokenNameIdentifier
(	TokenNameLPAREN
jarFile	TokenNameIdentifier
.	TokenNameDOT
getManifest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
extensions	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
Extension	TokenNameIdentifier
extension	TokenNameIdentifier
=	TokenNameEQUAL
extensions	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
addExtension	TokenNameIdentifier
(	TokenNameLPAREN
extensionList	TokenNameIdentifier
,	TokenNameCOMMA
extension	TokenNameIdentifier
,	TokenNameCOMMA
includeImpl	TokenNameIdentifier
,	TokenNameCOMMA
includeURL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
final	TokenNamefinal
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
addExtension	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
List	TokenNameIdentifier
extensionList	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Extension	TokenNameIdentifier
originalExtension	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
includeImpl	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
boolean	TokenNameboolean
includeURL	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Extension	TokenNameIdentifier
extension	TokenNameIdentifier
=	TokenNameEQUAL
originalExtension	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
includeURL	TokenNameIdentifier
&&	TokenNameAND_AND
null	TokenNamenull
!=	TokenNameNOT_EQUAL
extension	TokenNameIdentifier
.	TokenNameDOT
getImplementationURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
extension	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Extension	TokenNameIdentifier
(	TokenNameLPAREN
extension	TokenNameIdentifier
.	TokenNameDOT
getExtensionName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
extension	TokenNameIdentifier
.	TokenNameDOT
getSpecificationVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
extension	TokenNameIdentifier
.	TokenNameDOT
getSpecificationVendor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
extension	TokenNameIdentifier
.	TokenNameDOT
getImplementationVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
extension	TokenNameIdentifier
.	TokenNameDOT
getImplementationVendor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
extension	TokenNameIdentifier
.	TokenNameDOT
getImplementationVendorID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
boolean	TokenNameboolean
hasImplAttributes	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
!=	TokenNameNOT_EQUAL
extension	TokenNameIdentifier
.	TokenNameDOT
getImplementationURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
null	TokenNamenull
!=	TokenNameNOT_EQUAL
extension	TokenNameIdentifier
.	TokenNameDOT
getImplementationVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
null	TokenNamenull
!=	TokenNameNOT_EQUAL
extension	TokenNameIdentifier
.	TokenNameDOT
getImplementationVendorID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
null	TokenNamenull
!=	TokenNameNOT_EQUAL
extension	TokenNameIdentifier
.	TokenNameDOT
getImplementationVendor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
includeImpl	TokenNameIdentifier
&&	TokenNameAND_AND
hasImplAttributes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
extension	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Extension	TokenNameIdentifier
(	TokenNameLPAREN
extension	TokenNameIdentifier
.	TokenNameDOT
getExtensionName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
extension	TokenNameIdentifier
.	TokenNameDOT
getSpecificationVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
extension	TokenNameIdentifier
.	TokenNameDOT
getSpecificationVendor	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
extension	TokenNameIdentifier
.	TokenNameDOT
getImplementationURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
extensionList	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
extension	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
Manifest	TokenNameIdentifier
getManifest	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
File	TokenNameIdentifier
file	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
final	TokenNamefinal
JarFile	TokenNameIdentifier
jarFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JarFile	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Manifest	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
jarFile	TokenNameIdentifier
.	TokenNameDOT
getManifest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
+	TokenNamePLUS
" doesn't have a MANIFEST"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
m	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
final	TokenNamefinal
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
ioe	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ioe	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
