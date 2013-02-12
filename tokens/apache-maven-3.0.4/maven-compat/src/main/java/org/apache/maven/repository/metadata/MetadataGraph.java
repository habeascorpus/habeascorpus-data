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
HashMap	TokenNameIdentifier
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
Map	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
MetadataGraph	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_VERTICES	TokenNameIdentifier
=	TokenNameEQUAL
32	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_EDGES	TokenNameIdentifier
=	TokenNameEQUAL
64	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
versionedVertices	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
scopedVertices	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
MetadataGraphVertex	TokenNameIdentifier
entry	TokenNameIdentifier
;	TokenNameSEMICOLON
TreeSet	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
>	TokenNameGREATER
vertices	TokenNameIdentifier
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
incidentEdges	TokenNameIdentifier
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
excidentEdges	TokenNameIdentifier
;	TokenNameSEMICOLON
ArtifactScopeEnum	TokenNameIdentifier
scope	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
MetadataGraph	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nVertices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
init	TokenNameIdentifier
(	TokenNameLPAREN
nVertices	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
nVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MetadataGraph	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nVertices	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
nEdges	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
init	TokenNameIdentifier
(	TokenNameLPAREN
nVertices	TokenNameIdentifier
,	TokenNameCOMMA
nEdges	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MetadataGraph	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
entry	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MetadataResolutionException	TokenNameIdentifier
{	TokenNameLBRACE
checkVertex	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVertices	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
.	TokenNameDOT
setCompareVersion	TokenNameIdentifier
(	TokenNameLPAREN
versionedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
.	TokenNameDOT
setCompareScope	TokenNameIdentifier
(	TokenNameLPAREN
scopedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vertices	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
entry	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MetadataGraph	TokenNameIdentifier
(	TokenNameLPAREN
MetadataTreeNode	TokenNameIdentifier
tree	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MetadataResolutionException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
tree	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MetadataGraph	TokenNameIdentifier
(	TokenNameLPAREN
MetadataTreeNode	TokenNameIdentifier
tree	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
versionedVertices	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
scopedVertices	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MetadataResolutionException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tree	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MetadataResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
"tree is null"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
setVersionedVertices	TokenNameIdentifier
(	TokenNameLPAREN
versionedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setScopedVertices	TokenNameIdentifier
(	TokenNameLPAREN
scopedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
versionedVertices	TokenNameIdentifier
=	TokenNameEQUAL
scopedVertices	TokenNameIdentifier
||	TokenNameOR_OR
versionedVertices	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
scopedVertices	TokenNameIdentifier
=	TokenNameEQUAL
scopedVertices	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
countNodes	TokenNameIdentifier
(	TokenNameLPAREN
tree	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
init	TokenNameIdentifier
(	TokenNameLPAREN
count	TokenNameIdentifier
,	TokenNameCOMMA
count	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
count	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
processTreeNodes	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
tree	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
processTreeNodes	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
parentVertex	TokenNameIdentifier
,	TokenNameCOMMA
MetadataTreeNode	TokenNameIdentifier
node	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
depth	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
pomOrder	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MetadataResolutionException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
node	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
MetadataGraphVertex	TokenNameIdentifier
vertex	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MetadataGraphVertex	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
.	TokenNameDOT
md	TokenNameIdentifier
,	TokenNameCOMMA
versionedVertices	TokenNameIdentifier
,	TokenNameCOMMA
scopedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
vertices	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
vertex	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
vertices	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
vertex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
parentVertex	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
ArtifactMetadata	TokenNameIdentifier
md	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getMd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MetadataGraphEdge	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MetadataGraphEdge	TokenNameIdentifier
(	TokenNameLPAREN
md	TokenNameIdentifier
.	TokenNameDOT
version	TokenNameIdentifier
,	TokenNameCOMMA
md	TokenNameIdentifier
.	TokenNameDOT
resolved	TokenNameIdentifier
,	TokenNameCOMMA
md	TokenNameIdentifier
.	TokenNameDOT
artifactScope	TokenNameIdentifier
,	TokenNameCOMMA
md	TokenNameIdentifier
.	TokenNameDOT
artifactUri	TokenNameIdentifier
,	TokenNameCOMMA
depth	TokenNameIdentifier
,	TokenNameCOMMA
pomOrder	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addEdge	TokenNameIdentifier
(	TokenNameLPAREN
parentVertex	TokenNameIdentifier
,	TokenNameCOMMA
vertex	TokenNameIdentifier
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
entry	TokenNameIdentifier
=	TokenNameEQUAL
vertex	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
MetadataTreeNode	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
kids	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
kids	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
kids	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
kids	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
MetadataTreeNode	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
kids	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
processTreeNodes	TokenNameIdentifier
(	TokenNameLPAREN
vertex	TokenNameIdentifier
,	TokenNameCOMMA
n	TokenNameIdentifier
,	TokenNameCOMMA
depth	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
MetadataGraphVertex	TokenNameIdentifier
findVertex	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactMetadata	TokenNameIdentifier
md	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
md	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
vertices	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
vertices	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
MetadataGraphVertex	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MetadataGraphVertex	TokenNameIdentifier
(	TokenNameLPAREN
md	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
setCompareVersion	TokenNameIdentifier
(	TokenNameLPAREN
versionedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
setCompareScope	TokenNameIdentifier
(	TokenNameLPAREN
scopedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
gv	TokenNameIdentifier
:	TokenNameCOLON
vertices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
gv	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
gv	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MetadataGraphVertex	TokenNameIdentifier
addVertex	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactMetadata	TokenNameIdentifier
md	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
md	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
checkVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MetadataGraphVertex	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
findVertex	TokenNameIdentifier
(	TokenNameLPAREN
md	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
v	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MetadataGraphVertex	TokenNameIdentifier
(	TokenNameLPAREN
md	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
setCompareVersion	TokenNameIdentifier
(	TokenNameLPAREN
versionedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
v	TokenNameIdentifier
.	TokenNameDOT
setCompareScope	TokenNameIdentifier
(	TokenNameLPAREN
scopedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vertices	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nVertices	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
nEdges	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
nV	TokenNameIdentifier
=	TokenNameEQUAL
nVertices	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nVertices	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
nV	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
checkVertices	TokenNameIdentifier
(	TokenNameLPAREN
nV	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
nE	TokenNameIdentifier
=	TokenNameEQUAL
nVertices	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nEdges	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
nV	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
nE	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
nE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
checkEdges	TokenNameIdentifier
(	TokenNameLPAREN
nE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
checkVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
checkVertices	TokenNameIdentifier
(	TokenNameLPAREN
DEFAULT_VERTICES	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
checkVertices	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nVertices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
vertices	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
vertices	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TreeSet	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
checkEdges	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_EDGES	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
vertices	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
count	TokenNameIdentifier
=	TokenNameEQUAL
vertices	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
vertices	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
checkEdges	TokenNameIdentifier
(	TokenNameLPAREN
count	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
checkEdges	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
nEdges	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
incidentEdges	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
incidentEdges	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
nEdges	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
excidentEdges	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
excidentEdges	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
nEdges	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
checkVertex	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
v	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MetadataResolutionException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MetadataResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
"null vertex"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
.	TokenNameDOT
getMd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MetadataResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
"vertex without metadata"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
checkEdge	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphEdge	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MetadataResolutionException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MetadataResolutionException	TokenNameIdentifier
(	TokenNameLPAREN
"badly formed edge"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
getEdgesBetween	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
vFrom	TokenNameIdentifier
,	TokenNameCOMMA
MetadataGraphVertex	TokenNameIdentifier
vTo	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
edges	TokenNameIdentifier
=	TokenNameEQUAL
getIncidentEdges	TokenNameIdentifier
(	TokenNameLPAREN
vTo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
res	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
edges	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
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
e	TokenNameIdentifier
.	TokenNameDOT
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
vFrom	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
res	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
res	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MetadataGraph	TokenNameIdentifier
addEdge	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
vFrom	TokenNameIdentifier
,	TokenNameCOMMA
MetadataGraphVertex	TokenNameIdentifier
vTo	TokenNameIdentifier
,	TokenNameCOMMA
MetadataGraphEdge	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MetadataResolutionException	TokenNameIdentifier
{	TokenNameLBRACE
checkVertex	TokenNameIdentifier
(	TokenNameLPAREN
vFrom	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVertex	TokenNameIdentifier
(	TokenNameLPAREN
vTo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkEdge	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
checkEdges	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
e	TokenNameIdentifier
.	TokenNameDOT
setSource	TokenNameIdentifier
(	TokenNameLPAREN
vFrom	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
e	TokenNameIdentifier
.	TokenNameDOT
setTarget	TokenNameIdentifier
(	TokenNameLPAREN
vTo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vFrom	TokenNameIdentifier
.	TokenNameDOT
setCompareVersion	TokenNameIdentifier
(	TokenNameLPAREN
versionedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
vFrom	TokenNameIdentifier
.	TokenNameDOT
setCompareScope	TokenNameIdentifier
(	TokenNameLPAREN
scopedVertices	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
exList	TokenNameIdentifier
=	TokenNameEQUAL
excidentEdges	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
vFrom	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
exList	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
exList	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
excidentEdges	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
vFrom	TokenNameIdentifier
,	TokenNameCOMMA
exList	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
exList	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
exList	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
inList	TokenNameIdentifier
=	TokenNameEQUAL
incidentEdges	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
vTo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
inList	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
inList	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
incidentEdges	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
vTo	TokenNameIdentifier
,	TokenNameCOMMA
inList	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
inList	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
inList	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MetadataGraph	TokenNameIdentifier
removeVertex	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
v	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
vertices	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
v	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
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
if	TokenNameif
(	TokenNameLPAREN
incidentEdges	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
incidentEdges	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
excidentEdges	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
excidentEdges	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
countNodes	TokenNameIdentifier
(	TokenNameLPAREN
MetadataTreeNode	TokenNameIdentifier
tree	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
tree	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
MetadataTreeNode	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
kids	TokenNameIdentifier
=	TokenNameEQUAL
tree	TokenNameIdentifier
.	TokenNameDOT
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
kids	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
kids	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
<	TokenNameLESS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
MetadataTreeNode	TokenNameIdentifier
n	TokenNameIdentifier
:	TokenNameCOLON
kids	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
count	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
countNodes	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
MetadataGraphVertex	TokenNameIdentifier
getEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
entry	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setEntry	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
entry	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
entry	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TreeSet	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphVertex	TokenNameIdentifier
>	TokenNameGREATER
getVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
vertices	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
getIncidentEdges	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
vertex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
checkEdges	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
incidentEdges	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
vertex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
getExcidentEdges	TokenNameIdentifier
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
vertex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
checkEdges	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
excidentEdges	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
vertex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isVersionedVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
versionedVertices	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setVersionedVertices	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
versionedVertices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
versionedVertices	TokenNameIdentifier
=	TokenNameEQUAL
versionedVertices	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isScopedVertices	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
scopedVertices	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setScopedVertices	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
scopedVertices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
scopedVertices	TokenNameIdentifier
=	TokenNameEQUAL
scopedVertices	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
scopedVertices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
versionedVertices	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ArtifactScopeEnum	TokenNameIdentifier
getScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
scope	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setScope	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactScopeEnum	TokenNameIdentifier
scope	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
scope	TokenNameIdentifier
=	TokenNameEQUAL
scope	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
entry	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
vertices	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
vertices	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isEmptyEdges	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
||	TokenNameOR_OR
incidentEdges	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
incidentEdges	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
512	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"empty"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
MetadataGraphVertex	TokenNameIdentifier
v	TokenNameIdentifier
:	TokenNameCOLON
vertices	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"Vertex:  "	TokenNameStringLiteral
+	TokenNamePLUS
v	TokenNameIdentifier
.	TokenNameDOT
getMd	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
ins	TokenNameIdentifier
=	TokenNameEQUAL
getIncidentEdges	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ins	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
MetadataGraphEdge	TokenNameIdentifier
e	TokenNameIdentifier
:	TokenNameCOLON
ins	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"       from :  "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"      no entries "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
List	TokenNameIdentifier
<	TokenNameLESS
MetadataGraphEdge	TokenNameIdentifier
>	TokenNameGREATER
outs	TokenNameIdentifier
=	TokenNameEQUAL
getExcidentEdges	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
outs	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
MetadataGraphEdge	TokenNameIdentifier
e	TokenNameIdentifier
:	TokenNameCOLON
outs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"        to :  "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"      no exit "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"------------------------------------------------- "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"============================================================= "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE