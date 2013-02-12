package	TokenNamepackage
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
resolver	TokenNameIdentifier
.	TokenNameDOT
conflict	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
PlexusConstants	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
PlexusContainer	TokenNameIdentifier
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
Requirement	TokenNameIdentifier
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
repository	TokenNameIdentifier
.	TokenNameDOT
exception	TokenNameIdentifier
.	TokenNameDOT
ComponentLookupException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
context	TokenNameIdentifier
.	TokenNameDOT
Context	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
context	TokenNameIdentifier
.	TokenNameDOT
ContextException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
personality	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
phase	TokenNameIdentifier
.	TokenNameDOT
Contextualizable	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
ConflictResolverFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
DefaultConflictResolverFactory	TokenNameIdentifier
implements	TokenNameimplements
ConflictResolverFactory	TokenNameIdentifier
,	TokenNameCOMMA
Contextualizable	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Requirement	TokenNameIdentifier
private	TokenNameprivate
PlexusContainer	TokenNameIdentifier
container	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ConflictResolver	TokenNameIdentifier
getConflictResolver	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ConflictResolverNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
ConflictResolver	TokenNameIdentifier
)	TokenNameRPAREN
container	TokenNameIdentifier
.	TokenNameDOT
lookup	TokenNameIdentifier
(	TokenNameLPAREN
ConflictResolver	TokenNameIdentifier
.	TokenNameDOT
ROLE	TokenNameIdentifier
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ComponentLookupException	TokenNameIdentifier
exception	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
ConflictResolverNotFoundException	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot find conflict resolver of type: "	TokenNameStringLiteral
+	TokenNamePLUS
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
contextualize	TokenNameIdentifier
(	TokenNameLPAREN
Context	TokenNameIdentifier
context	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ContextException	TokenNameIdentifier
{	TokenNameLBRACE
container	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
PlexusContainer	TokenNameIdentifier
)	TokenNameRPAREN
context	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
PlexusConstants	TokenNameIdentifier
.	TokenNameDOT
PLEXUS_KEY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE