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
.	TokenNameDOT
filter	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
InversionArtifactFilter	TokenNameIdentifier
implements	TokenNameimplements
ArtifactFilter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
ArtifactFilter	TokenNameIdentifier
toInvert	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
InversionArtifactFilter	TokenNameIdentifier
(	TokenNameLPAREN
ArtifactFilter	TokenNameIdentifier
toInvert	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
toInvert	TokenNameIdentifier
=	TokenNameEQUAL
toInvert	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
include	TokenNameIdentifier
(	TokenNameLPAREN
Artifact	TokenNameIdentifier
artifact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
!	TokenNameNOT
toInvert	TokenNameIdentifier
.	TokenNameDOT
include	TokenNameIdentifier
(	TokenNameLPAREN
artifact	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
hash	TokenNameIdentifier
=	TokenNameEQUAL
17	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
hash	TokenNameIdentifier
=	TokenNameEQUAL
hash	TokenNameIdentifier
*	TokenNameMULTIPLY
31	TokenNameIntegerLiteral
+	TokenNamePLUS
toInvert	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
hash	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
==	TokenNameEQUAL_EQUAL
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
obj	TokenNameIdentifier
instanceof	TokenNameinstanceof
InversionArtifactFilter	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
InversionArtifactFilter	TokenNameIdentifier
other	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
InversionArtifactFilter	TokenNameIdentifier
)	TokenNameRPAREN
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
toInvert	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
other	TokenNameIdentifier
.	TokenNameDOT
toInvert	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
