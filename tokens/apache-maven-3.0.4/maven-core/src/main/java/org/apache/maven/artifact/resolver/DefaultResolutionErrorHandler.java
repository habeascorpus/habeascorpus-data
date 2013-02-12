package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
resolver	TokenNameIdentifier
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
Collection	TokenNameIdentifier
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
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
component	TokenNameIdentifier
.	TokenNameDOT
annotations	TokenNameIdentifier
.	TokenNameDOT
Component	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
ResolutionErrorHandler	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
DefaultResolutionErrorHandler	TokenNameIdentifier
implements	TokenNameimplements
ResolutionErrorHandler	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
throwErrors	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactResolutionRequest	TokenNameIdentifier
request	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactResolutionResult	TokenNameIdentifier
result	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ArtifactResolutionException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
hasMetadataResolutionExceptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
result	TokenNameIdentifier
.	TokenNameDOT
getMetadataResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
hasCircularDependencyExceptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
result	TokenNameIdentifier
.	TokenNameDOT
getCircularDependencyException	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
hasVersionRangeViolations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
result	TokenNameIdentifier
.	TokenNameDOT
getVersionRangeViolation	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
hasErrorArtifactExceptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
result	TokenNameIdentifier
.	TokenNameDOT
getErrorArtifactExceptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
hasMissingArtifacts	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MultipleArtifactsNotFoundException	TokenNameIdentifier
(	TokenNameLPAREN
request	TokenNameIdentifier
.	TokenNameDOT
getArtifact	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
toList	TokenNameIdentifier
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
getArtifacts	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
result	TokenNameIdentifier
.	TokenNameDOT
getMissingArtifacts	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
request	TokenNameIdentifier
.	TokenNameDOT
getRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
result	TokenNameIdentifier
.	TokenNameDOT
hasExceptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ArtifactResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
"Unknown error during artifact resolution, "	TokenNameStringLiteral
+	TokenNamePLUS
request	TokenNameIdentifier
+	TokenNamePLUS
", "	TokenNameStringLiteral
+	TokenNamePLUS
result	TokenNameIdentifier
.	TokenNameDOT
getExceptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
request	TokenNameIdentifier
.	TokenNameDOT
getArtifact	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
request	TokenNameIdentifier
.	TokenNameDOT
getRemoteRepositories	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
List	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
toList	TokenNameIdentifier
(	TokenNameLPAREN
Collection	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
items	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
items	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
T	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
items	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE