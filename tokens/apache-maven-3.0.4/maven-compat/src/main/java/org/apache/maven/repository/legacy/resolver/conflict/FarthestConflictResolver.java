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
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
resolver	TokenNameIdentifier
.	TokenNameDOT
ResolutionNode	TokenNameIdentifier
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
ConflictResolver	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
hint	TokenNameIdentifier
=	TokenNameEQUAL
"farthest"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
FarthestConflictResolver	TokenNameIdentifier
implements	TokenNameimplements
ConflictResolver	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
ResolutionNode	TokenNameIdentifier
resolveConflict	TokenNameIdentifier
(	TokenNameLPAREN
ResolutionNode	TokenNameIdentifier
node1	TokenNameIdentifier
,	TokenNameCOMMA
ResolutionNode	TokenNameIdentifier
node2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
node1	TokenNameIdentifier
.	TokenNameDOT
getDepth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
node2	TokenNameIdentifier
.	TokenNameDOT
getDepth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
node1	TokenNameIdentifier
:	TokenNameCOLON
node2	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE