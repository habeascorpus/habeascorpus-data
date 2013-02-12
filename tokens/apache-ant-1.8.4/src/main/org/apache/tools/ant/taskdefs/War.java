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
ZipFileSet	TokenNameIdentifier
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
zip	TokenNameIdentifier
.	TokenNameDOT
ZipOutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
War	TokenNameIdentifier
extends	TokenNameextends
Jar	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
File	TokenNameIdentifier
deploymentDescriptor	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
needxmlfile	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
private	TokenNameprivate
File	TokenNameIdentifier
addedWebXmlFile	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
FileUtils	TokenNameIdentifier
FILE_UTILS	TokenNameIdentifier
=	TokenNameEQUAL
FileUtils	TokenNameIdentifier
.	TokenNameDOT
getFileUtils	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
XML_DESCRIPTOR_PATH	TokenNameIdentifier
=	TokenNameEQUAL
"WEB-INF/web.xml"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
War	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
archiveType	TokenNameIdentifier
=	TokenNameEQUAL
"war"	TokenNameStringLiteral
;	TokenNameSEMICOLON
emptyBehavior	TokenNameIdentifier
=	TokenNameEQUAL
"create"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setWarfile	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
warFile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setDestFile	TokenNameIdentifier
(	TokenNameLPAREN
warFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setWebxml	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
descr	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
deploymentDescriptor	TokenNameIdentifier
=	TokenNameEQUAL
descr	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
deploymentDescriptor	TokenNameIdentifier
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
"Deployment descriptor: "	TokenNameStringLiteral
+	TokenNamePLUS
deploymentDescriptor	TokenNameIdentifier
+	TokenNamePLUS
" does not exist."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ZipFileSet	TokenNameIdentifier
fs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ZipFileSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
.	TokenNameDOT
setFile	TokenNameIdentifier
(	TokenNameLPAREN
deploymentDescriptor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fs	TokenNameIdentifier
.	TokenNameDOT
setFullpath	TokenNameIdentifier
(	TokenNameLPAREN
XML_DESCRIPTOR_PATH	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
addFileset	TokenNameIdentifier
(	TokenNameLPAREN
fs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setNeedxmlfile	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
needxmlfile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
needxmlfile	TokenNameIdentifier
=	TokenNameEQUAL
needxmlfile	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addLib	TokenNameIdentifier
(	TokenNameLPAREN
ZipFileSet	TokenNameIdentifier
fs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fs	TokenNameIdentifier
.	TokenNameDOT
setPrefix	TokenNameIdentifier
(	TokenNameLPAREN
"WEB-INF/lib/"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
addFileset	TokenNameIdentifier
(	TokenNameLPAREN
fs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addClasses	TokenNameIdentifier
(	TokenNameLPAREN
ZipFileSet	TokenNameIdentifier
fs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fs	TokenNameIdentifier
.	TokenNameDOT
setPrefix	TokenNameIdentifier
(	TokenNameLPAREN
"WEB-INF/classes/"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
addFileset	TokenNameIdentifier
(	TokenNameLPAREN
fs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addWebinf	TokenNameIdentifier
(	TokenNameLPAREN
ZipFileSet	TokenNameIdentifier
fs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fs	TokenNameIdentifier
.	TokenNameDOT
setPrefix	TokenNameIdentifier
(	TokenNameLPAREN
"WEB-INF/"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
addFileset	TokenNameIdentifier
(	TokenNameLPAREN
fs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
initZipOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
ZipOutputStream	TokenNameIdentifier
zOut	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
initZipOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
zOut	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
zipFile	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
file	TokenNameIdentifier
,	TokenNameCOMMA
ZipOutputStream	TokenNameIdentifier
zOut	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
vPath	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
mode	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
boolean	TokenNameboolean
addFile	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
XML_DESCRIPTOR_PATH	TokenNameIdentifier
.	TokenNameDOT
equalsIgnoreCase	TokenNameIdentifier
(	TokenNameLPAREN
vPath	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
addedWebXmlFile	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
addFile	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
fileNameEquals	TokenNameIdentifier
(	TokenNameLPAREN
addedWebXmlFile	TokenNameIdentifier
,	TokenNameCOMMA
file	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
logWhenWriting	TokenNameIdentifier
(	TokenNameLPAREN
"Warning: selected "	TokenNameStringLiteral
+	TokenNamePLUS
archiveType	TokenNameIdentifier
+	TokenNamePLUS
" files include a second "	TokenNameStringLiteral
+	TokenNamePLUS
XML_DESCRIPTOR_PATH	TokenNameIdentifier
+	TokenNamePLUS
" which will be ignored. "	TokenNameStringLiteral
+	TokenNamePLUS
"The duplicate entry is at "	TokenNameStringLiteral
+	TokenNamePLUS
file	TokenNameIdentifier
+	TokenNamePLUS
'\n'	TokenNameCharacterLiteral
+	TokenNamePLUS
"The file that will be used is "	TokenNameStringLiteral
+	TokenNamePLUS
addedWebXmlFile	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
.	TokenNameDOT
MSG_WARN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
addedWebXmlFile	TokenNameIdentifier
=	TokenNameEQUAL
file	TokenNameIdentifier
;	TokenNameSEMICOLON
addFile	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
deploymentDescriptor	TokenNameIdentifier
=	TokenNameEQUAL
file	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
addFile	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
zipFile	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
,	TokenNameCOMMA
zOut	TokenNameIdentifier
,	TokenNameCOMMA
vPath	TokenNameIdentifier
,	TokenNameCOMMA
mode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
cleanUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
addedWebXmlFile	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
deploymentDescriptor	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
needxmlfile	TokenNameIdentifier
&&	TokenNameAND_AND
!	TokenNameNOT
isInUpdateMode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
hasUpdatedFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"No WEB-INF/web.xml file was added. "	TokenNameStringLiteral
+	TokenNamePLUS
"If this is your intent, set needxmlfile='false' "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
addedWebXmlFile	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
cleanUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
