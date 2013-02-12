package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
plugin	TokenNameIdentifier
.	TokenNameDOT
version	TokenNameIdentifier
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
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
LocalRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
RemoteRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
PluginVersionResolutionException	TokenNameIdentifier
extends	TokenNameextends
Exception	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
groupId	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
baseMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
PluginVersionResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
groupId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
baseMessage	TokenNameIdentifier
,	TokenNameCOMMA
Throwable	TokenNameIdentifier
cause	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
"Error resolving version for plugin '"	TokenNameStringLiteral
+	TokenNamePLUS
groupId	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
artifactId	TokenNameIdentifier
+	TokenNamePLUS
"': "	TokenNameStringLiteral
+	TokenNamePLUS
baseMessage	TokenNameIdentifier
,	TokenNameCOMMA
cause	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
groupId	TokenNameIdentifier
=	TokenNameEQUAL
groupId	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
artifactId	TokenNameIdentifier
=	TokenNameEQUAL
artifactId	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
baseMessage	TokenNameIdentifier
=	TokenNameEQUAL
baseMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PluginVersionResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
groupId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
baseMessage	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
"Error resolving version for plugin '"	TokenNameStringLiteral
+	TokenNamePLUS
groupId	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
artifactId	TokenNameIdentifier
+	TokenNamePLUS
"': "	TokenNameStringLiteral
+	TokenNamePLUS
baseMessage	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
groupId	TokenNameIdentifier
=	TokenNameEQUAL
groupId	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
artifactId	TokenNameIdentifier
=	TokenNameEQUAL
artifactId	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
baseMessage	TokenNameIdentifier
=	TokenNameEQUAL
baseMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PluginVersionResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
groupId	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
artifactId	TokenNameIdentifier
,	TokenNameCOMMA
LocalRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
RemoteRepository	TokenNameIdentifier
>	TokenNameGREATER
remoteRepositories	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
baseMessage	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
"Error resolving version for plugin '"	TokenNameStringLiteral
+	TokenNamePLUS
groupId	TokenNameIdentifier
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
artifactId	TokenNameIdentifier
+	TokenNamePLUS
"' from the repositories "	TokenNameStringLiteral
+	TokenNamePLUS
format	TokenNameIdentifier
(	TokenNameLPAREN
localRepository	TokenNameIdentifier
,	TokenNameCOMMA
remoteRepositories	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
": "	TokenNameStringLiteral
+	TokenNamePLUS
baseMessage	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
groupId	TokenNameIdentifier
=	TokenNameEQUAL
groupId	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
artifactId	TokenNameIdentifier
=	TokenNameEQUAL
artifactId	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
baseMessage	TokenNameIdentifier
=	TokenNameEQUAL
baseMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getGroupId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
groupId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
artifactId	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getBaseMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
baseMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
format	TokenNameIdentifier
(	TokenNameLPAREN
LocalRepository	TokenNameIdentifier
localRepository	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
RemoteRepository	TokenNameIdentifier
>	TokenNameGREATER
remoteRepositories	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
repos	TokenNameIdentifier
=	TokenNameEQUAL
"["	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
localRepository	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
repos	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
localRepository	TokenNameIdentifier
.	TokenNameDOT
getId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" ("	TokenNameStringLiteral
+	TokenNamePLUS
localRepository	TokenNameIdentifier
.	TokenNameDOT
getBasedir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
remoteRepositories	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
remoteRepositories	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
RemoteRepository	TokenNameIdentifier
repository	TokenNameIdentifier
:	TokenNameCOLON
remoteRepositories	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
repos	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
", "	TokenNameStringLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
repository	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
repos	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
repository	TokenNameIdentifier
.	TokenNameDOT
getId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" ("	TokenNameStringLiteral
+	TokenNamePLUS
repository	TokenNameIdentifier
.	TokenNameDOT
getUrl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
repos	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"]"	TokenNameStringLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
repos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
