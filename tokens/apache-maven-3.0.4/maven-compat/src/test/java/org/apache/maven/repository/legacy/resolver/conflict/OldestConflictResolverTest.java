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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
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
.	TokenNameDOT
OldestConflictResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
OldestConflictResolverTest	TokenNameIdentifier
extends	TokenNameextends
AbstractConflictResolverTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
OldestConflictResolverTest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
"oldest"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testDepth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ResolutionNode	TokenNameIdentifier
a1n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResolutionNode	TokenNameIdentifier
(	TokenNameLPAREN
a1	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ResolutionNode	TokenNameIdentifier
b1n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResolutionNode	TokenNameIdentifier
(	TokenNameLPAREN
b1	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ResolutionNode	TokenNameIdentifier
a2n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResolutionNode	TokenNameIdentifier
(	TokenNameLPAREN
a2	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
,	TokenNameCOMMA
b1n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResolveConflict	TokenNameIdentifier
(	TokenNameLPAREN
a1n	TokenNameIdentifier
,	TokenNameCOMMA
a1n	TokenNameIdentifier
,	TokenNameCOMMA
a2n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testDepthReversed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ResolutionNode	TokenNameIdentifier
b1n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResolutionNode	TokenNameIdentifier
(	TokenNameLPAREN
b1	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ResolutionNode	TokenNameIdentifier
a2n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResolutionNode	TokenNameIdentifier
(	TokenNameLPAREN
a2	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
,	TokenNameCOMMA
b1n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ResolutionNode	TokenNameIdentifier
a1n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResolutionNode	TokenNameIdentifier
(	TokenNameLPAREN
a1	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResolveConflict	TokenNameIdentifier
(	TokenNameLPAREN
a1n	TokenNameIdentifier
,	TokenNameCOMMA
a2n	TokenNameIdentifier
,	TokenNameCOMMA
a1n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testEqual	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ResolutionNode	TokenNameIdentifier
a1n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResolutionNode	TokenNameIdentifier
(	TokenNameLPAREN
a1	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ResolutionNode	TokenNameIdentifier
a2n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResolutionNode	TokenNameIdentifier
(	TokenNameLPAREN
a2	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResolveConflict	TokenNameIdentifier
(	TokenNameLPAREN
a1n	TokenNameIdentifier
,	TokenNameCOMMA
a1n	TokenNameIdentifier
,	TokenNameCOMMA
a2n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testEqualReversed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ResolutionNode	TokenNameIdentifier
a2n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResolutionNode	TokenNameIdentifier
(	TokenNameLPAREN
a2	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ResolutionNode	TokenNameIdentifier
a1n	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResolutionNode	TokenNameIdentifier
(	TokenNameLPAREN
a1	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertResolveConflict	TokenNameIdentifier
(	TokenNameLPAREN
a1n	TokenNameIdentifier
,	TokenNameCOMMA
a2n	TokenNameIdentifier
,	TokenNameCOMMA
a1n	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
