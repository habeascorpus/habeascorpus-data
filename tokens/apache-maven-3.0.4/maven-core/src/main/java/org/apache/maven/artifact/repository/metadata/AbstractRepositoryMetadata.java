package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Writer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
Artifact	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
.	TokenNameDOT
ArtifactMetadata	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
ArtifactRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
ArtifactRepositoryPolicy	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
xpp3	TokenNameIdentifier
.	TokenNameDOT
MetadataXpp3Reader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
xpp3	TokenNameIdentifier
.	TokenNameDOT
MetadataXpp3Writer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
IOUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ReaderFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
WriterFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
pull	TokenNameIdentifier
.	TokenNameDOT
XmlPullParserException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AbstractRepositoryMetadata	TokenNameIdentifier
implements	TokenNameimplements
RepositoryMetadata	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Metadata	TokenNameIdentifier
metadata	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
AbstractRepositoryMetadata	TokenNameIdentifier
(	TokenNameLPAREN
Metadata	TokenNameIdentifier
metadata	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
metadata	TokenNameIdentifier
=	TokenNameEQUAL
metadata	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getRemoteFilename	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"maven-metadata.xml"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getLocalFilename	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactRepository	TokenNameIdentifier
repository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"maven-metadata-"	TokenNameStringLiteral
+	TokenNamePLUS
repository	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
".xml"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
storeInLocalRepository	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepository	TokenNameIdentifier
remoteRepository	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
RepositoryMetadataStoreException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
updateRepositoryMetadata	TokenNameIdentifier
(	TokenNameLPAREN
localRepository	TokenNameIdentifier
,	TokenNameCOMMA
remoteRepository	TokenNameIdentifier
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
RepositoryMetadataStoreException	TokenNameIdentifier
(	TokenNameLPAREN
"Error updating group repository metadata"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
XmlPullParserException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RepositoryMetadataStoreException	TokenNameIdentifier
(	TokenNameLPAREN
"Error updating group repository metadata"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
updateRepositoryMetadata	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactRepository	TokenNameIdentifier
remoteRepository	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
XmlPullParserException	TokenNameIdentifier
{	TokenNameLBRACE
MetadataXpp3Reader	TokenNameIdentifier
mappingReader	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MetadataXpp3Reader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Metadata	TokenNameIdentifier
metadata	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
File	TokenNameIdentifier
metadataFile	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
localRepository	TokenNameIdentifier
.	TokenNameDOT
getBasedir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
localRepository	TokenNameIdentifier
.	TokenNameDOT
pathOfLocalRepositoryMetadata	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
remoteRepository	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
metadataFile	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
metadataFile	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
metadataFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Reader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
reader	TokenNameIdentifier
=	TokenNameEQUAL
ReaderFactory	TokenNameIdentifier
.	TokenNameDOT
newXmlReader	TokenNameIdentifier
(	TokenNameLPAREN
metadataFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
metadata	TokenNameIdentifier
=	TokenNameEQUAL
mappingReader	TokenNameIdentifier
.	TokenNameDOT
read	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
IOUtil	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
boolean	TokenNameboolean
changed	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
metadata	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
metadata	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
metadata	TokenNameIdentifier
;	TokenNameSEMICOLON
changed	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
changed	TokenNameIdentifier
=	TokenNameEQUAL
metadata	TokenNameIdentifier
.	TokenNameDOT
merge	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
metadata	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
version	TokenNameIdentifier
=	TokenNameEQUAL
metadata	TokenNameIdentifier
.	TokenNameDOT
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
version	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
.	TokenNameDOT
LATEST_VERSION	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
version	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
Artifact	TokenNameIdentifier
.	TokenNameDOT
RELEASE_VERSION	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
version	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
metadata	TokenNameIdentifier
.	TokenNameDOT
setVersion	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
changed	TokenNameIdentifier
||	TokenNameOR_OR
!	TokenNameNOT
metadataFile	TokenNameIdentifier
.	TokenNameDOT
exists	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Writer	TokenNameIdentifier
writer	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
metadataFile	TokenNameIdentifier
.	TokenNameDOT
getParentFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
mkdirs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writer	TokenNameIdentifier
=	TokenNameEQUAL
WriterFactory	TokenNameIdentifier
.	TokenNameDOT
newXmlWriter	TokenNameIdentifier
(	TokenNameLPAREN
metadataFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MetadataXpp3Writer	TokenNameIdentifier
mappingWriter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MetadataXpp3Writer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mappingWriter	TokenNameIdentifier
.	TokenNameDOT
write	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
,	TokenNameCOMMA
metadata	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
IOUtil	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
metadataFile	TokenNameIdentifier
.	TokenNameDOT
setLastModified	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"repository metadata for: '"	TokenNameStringLiteral
+	TokenNamePLUS
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"'"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
Metadata	TokenNameIdentifier
createMetadata	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
,	TokenNameCOMMA
Versioning	TokenNameIdentifier
versioning	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Metadata	TokenNameIdentifier
metadata	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Metadata	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
metadata	TokenNameIdentifier
.	TokenNameDOT
setGroupId	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
.	TokenNameDOT
getGroupId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
metadata	TokenNameIdentifier
.	TokenNameDOT
setArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
.	TokenNameDOT
getArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
metadata	TokenNameIdentifier
.	TokenNameDOT
setVersion	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
.	TokenNameDOT
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
metadata	TokenNameIdentifier
.	TokenNameDOT
setVersioning	TokenNameIdentifier
(	TokenNameLPAREN
versioning	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
metadata	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
Versioning	TokenNameIdentifier
createVersioning	TokenNameIdentifier
(	TokenNameLPAREN
Snapshot	TokenNameIdentifier
snapshot	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Versioning	TokenNameIdentifier
versioning	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Versioning	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
versioning	TokenNameIdentifier
.	TokenNameDOT
setSnapshot	TokenNameIdentifier
(	TokenNameLPAREN
snapshot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
versioning	TokenNameIdentifier
.	TokenNameDOT
updateTimestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
versioning	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setMetadata	TokenNameIdentifier
(	TokenNameLPAREN
Metadata	TokenNameIdentifier
metadata	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
metadata	TokenNameIdentifier
=	TokenNameEQUAL
metadata	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Metadata	TokenNameIdentifier
getMetadata	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
metadata	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
merge	TokenNameIdentifier
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
legacy	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
.	TokenNameDOT
ArtifactMetadata	TokenNameIdentifier
metadata	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AbstractRepositoryMetadata	TokenNameIdentifier
repoMetadata	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AbstractRepositoryMetadata	TokenNameIdentifier
)	TokenNameRPAREN
metadata	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
metadata	TokenNameIdentifier
.	TokenNameDOT
merge	TokenNameIdentifier
(	TokenNameLPAREN
repoMetadata	TokenNameIdentifier
.	TokenNameDOT
getMetadata	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
merge	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactMetadata	TokenNameIdentifier
metadata	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AbstractRepositoryMetadata	TokenNameIdentifier
repoMetadata	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AbstractRepositoryMetadata	TokenNameIdentifier
)	TokenNameRPAREN
metadata	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
metadata	TokenNameIdentifier
.	TokenNameDOT
merge	TokenNameIdentifier
(	TokenNameLPAREN
repoMetadata	TokenNameIdentifier
.	TokenNameDOT
getMetadata	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
extendedToString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" Repository Metadata --------------------------"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" GroupId: "	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getGroupId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" ArtifactId: "	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" Metadata Type: "	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
buffer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getNature	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
RELEASE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ArtifactRepositoryPolicy	TokenNameIdentifier
getPolicy	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactRepository	TokenNameIdentifier
repository	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
nature	TokenNameIdentifier
=	TokenNameEQUAL
getNature	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
nature	TokenNameIdentifier
&	TokenNameAND
RepositoryMetadata	TokenNameIdentifier
.	TokenNameDOT
RELEASE_OR_SNAPSHOT	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
RepositoryMetadata	TokenNameIdentifier
.	TokenNameDOT
RELEASE_OR_SNAPSHOT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ArtifactRepositoryPolicy	TokenNameIdentifier
policy	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArtifactRepositoryPolicy	TokenNameIdentifier
(	TokenNameLPAREN
repository	TokenNameIdentifier
.	TokenNameDOT
getReleases	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
policy	TokenNameIdentifier
.	TokenNameDOT
merge	TokenNameIdentifier
(	TokenNameLPAREN
repository	TokenNameIdentifier
.	TokenNameDOT
getSnapshots	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
policy	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
nature	TokenNameIdentifier
&	TokenNameAND
RepositoryMetadata	TokenNameIdentifier
.	TokenNameDOT
SNAPSHOT	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
repository	TokenNameIdentifier
.	TokenNameDOT
getSnapshots	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
repository	TokenNameIdentifier
.	TokenNameDOT
getReleases	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
