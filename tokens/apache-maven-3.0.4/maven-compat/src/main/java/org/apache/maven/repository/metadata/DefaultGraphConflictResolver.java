package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
metadata	TokenNameIdentifier
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
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
TreeSet	TokenNameIdentifier
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
ArtifactScopeEnum	TokenNameIdentifier
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
@	TokenNameAT
Component	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
GraphConflictResolver	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
DefaultGraphConflictResolver	TokenNameIdentifier
implements	TokenNameimplements
GraphConflictResolver	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Requirement	TokenNameIdentifier
(	TokenNameLPAREN
role	TokenNameIdentifier
=	TokenNameEQUAL
GraphConflictResolutionPolicy	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
protected	TokenNameprotected
GraphConflictResolutionPolicy	TokenNameIdentifier
policy	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
MetadataGraph	TokenNameIdentifier
resolveConflicts	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraph	TokenNameIdentifier
graph	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactScopeEnum	TokenNameIdentifier
scope	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
GraphConflictResolutionException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
policy	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
GraphConflictResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
"no GraphConflictResolutionPolicy injected"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
graph	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
MetadataGraphVertex	TokenNameIdentifier
entry	TokenNameIdentifier
=	TokenNameEQUAL
graph	TokenNameIdentifier
.	TokenNameDOT
getEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
entry	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
graph	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
GraphConflictResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
"graph with an entry, but not vertices do not exist"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
graph	TokenNameIdentifier
.	TokenNameDOT
isEmptyEdges	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
TreeSet	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
>	TokenNameGREATER
vertices	TokenNameIdentifier
=	TokenNameEQUAL
graph	TokenNameIdentifier
.	TokenNameDOT
getVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
vertices	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
MetadataGraph	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
ArtifactScopeEnum	TokenNameIdentifier
requestedScope	TokenNameIdentifier
=	TokenNameEQUAL
ArtifactScopeEnum	TokenNameIdentifier
.	TokenNameDOT
checkScope	TokenNameIdentifier
(	TokenNameLPAREN
scope	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MetadataGraph	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MetadataGraph	TokenNameIdentifier
(	TokenNameLPAREN
vertices	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
setVersionedVertices	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
setScopedVertices	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MetadataGraphVertex	TokenNameIdentifier
resEntry	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
addVertex	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getMd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
setEntry	TokenNameIdentifier
(	TokenNameLPAREN
resEntry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
setScope	TokenNameIdentifier
(	TokenNameLPAREN
requestedScope	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
v	TokenNameIdentifier
:	TokenNameCOLON
vertices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
ins	TokenNameIdentifier
=	TokenNameEQUAL
graph	TokenNameIdentifier
.	TokenNameDOT
getIncidentEdges	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
MetadataGraphEdge	TokenNameIdentifier
edge	TokenNameIdentifier
=	TokenNameEQUAL
cleanEdges	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
,	TokenNameCOMMA
ins	TokenNameIdentifier
,	TokenNameCOMMA
requestedScope	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
edge	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
getEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setWhy	TokenNameIdentifier
(	TokenNameLPAREN
"This is a graph entry point. No links."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
ArtifactMetadata	TokenNameIdentifier
md	TokenNameIdentifier
=	TokenNameEQUAL
v	TokenNameIdentifier
.	TokenNameDOT
getMd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ArtifactMetadata	TokenNameIdentifier
newMd	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArtifactMetadata	TokenNameIdentifier
(	TokenNameLPAREN
md	TokenNameIdentifier
.	TokenNameDOT
getGroupId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
md	TokenNameIdentifier
.	TokenNameDOT
getArtifactId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
edge	TokenNameIdentifier
.	TokenNameDOT
getVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
md	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
md	TokenNameIdentifier
.	TokenNameDOT
getScopeAsEnum	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
md	TokenNameIdentifier
.	TokenNameDOT
getClassifier	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
edge	TokenNameIdentifier
.	TokenNameDOT
getArtifactUri	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
edge	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
""	TokenNameStringLiteral
:	TokenNameCOLON
edge	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
edge	TokenNameIdentifier
.	TokenNameDOT
isResolved	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
edge	TokenNameIdentifier
.	TokenNameDOT
getTarget	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
null	TokenNamenull
:	TokenNameCOLON
edge	TokenNameIdentifier
.	TokenNameDOT
getTarget	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getError	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MetadataGraphVertex	TokenNameIdentifier
newV	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
addVertex	TokenNameIdentifier
(	TokenNameLPAREN
newMd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MetadataGraphVertex	TokenNameIdentifier
sourceV	TokenNameIdentifier
=	TokenNameEQUAL
res	TokenNameIdentifier
.	TokenNameDOT
addVertex	TokenNameIdentifier
(	TokenNameLPAREN
edge	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getMd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
res	TokenNameIdentifier
.	TokenNameDOT
addEdge	TokenNameIdentifier
(	TokenNameLPAREN
sourceV	TokenNameIdentifier
,	TokenNameCOMMA
newV	TokenNameIdentifier
,	TokenNameCOMMA
edge	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
MetadataGraph	TokenNameIdentifier
linkedRes	TokenNameIdentifier
=	TokenNameEQUAL
findLinkedSubgraph	TokenNameIdentifier
(	TokenNameLPAREN
res	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
linkedRes	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
MetadataResolutionException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
GraphConflictResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
MetadataGraph	TokenNameIdentifier
findLinkedSubgraph	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraph	TokenNameIdentifier
g	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
g	TokenNameIdentifier
.	TokenNameDOT
getVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
g	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
>	TokenNameGREATER
visited	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
g	TokenNameIdentifier
.	TokenNameDOT
getVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
visit	TokenNameIdentifier
(	TokenNameLPAREN
g	TokenNameIdentifier
.	TokenNameDOT
getEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
visited	TokenNameIdentifier
,	TokenNameCOMMA
g	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
>	TokenNameGREATER
dropList	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
g	TokenNameIdentifier
.	TokenNameDOT
getVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
v	TokenNameIdentifier
:	TokenNameCOLON
g	TokenNameIdentifier
.	TokenNameDOT
getVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
visited	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
dropList	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
dropList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
g	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
TreeSet	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
>	TokenNameGREATER
vertices	TokenNameIdentifier
=	TokenNameEQUAL
g	TokenNameIdentifier
.	TokenNameDOT
getVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
v	TokenNameIdentifier
:	TokenNameCOLON
dropList	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
vertices	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
g	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
visit	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
from	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
>	TokenNameGREATER
visited	TokenNameIdentifier
,	TokenNameCOMMA
MetadataGraph	TokenNameIdentifier
graph	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
visited	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
from	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
visited	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
from	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
exitList	TokenNameIdentifier
=	TokenNameEQUAL
graph	TokenNameIdentifier
.	TokenNameDOT
getExcidentEdges	TokenNameIdentifier
(	TokenNameLPAREN
from	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
exitList	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
exitList	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
MetadataGraphEdge	TokenNameIdentifier
e	TokenNameIdentifier
:	TokenNameCOLON
graph	TokenNameIdentifier
.	TokenNameDOT
getExcidentEdges	TokenNameIdentifier
(	TokenNameLPAREN
from	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
visit	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getTarget	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
visited	TokenNameIdentifier
,	TokenNameCOMMA
graph	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
MetadataGraphEdge	TokenNameIdentifier
cleanEdges	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
v	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
edges	TokenNameIdentifier
,	TokenNameCOMMA
ArtifactScopeEnum	TokenNameIdentifier
scope	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
edges	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
edges	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
edges	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
MetadataGraphEdge	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
edges	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
scope	TokenNameIdentifier
.	TokenNameDOT
encloses	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
MetadataGraphEdge	TokenNameIdentifier
res	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
MetadataGraphEdge	TokenNameIdentifier
e	TokenNameIdentifier
:	TokenNameCOLON
edges	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
scope	TokenNameIdentifier
.	TokenNameDOT
encloses	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
res	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
res	TokenNameIdentifier
=	TokenNameEQUAL
policy	TokenNameIdentifier
.	TokenNameDOT
apply	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
,	TokenNameCOMMA
res	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
