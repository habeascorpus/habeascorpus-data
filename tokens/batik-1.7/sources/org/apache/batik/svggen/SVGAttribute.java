package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
svggen	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SVGAttribute	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
name	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Set	TokenNameIdentifier
applicabilitySet	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
isSetInclusive	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SVGAttribute	TokenNameIdentifier
(	TokenNameLPAREN
Set	TokenNameIdentifier
applicabilitySet	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isSetInclusive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
applicabilitySet	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
applicabilitySet	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
applicabilitySet	TokenNameIdentifier
=	TokenNameEQUAL
applicabilitySet	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
isSetInclusive	TokenNameIdentifier
=	TokenNameEQUAL
isSetInclusive	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
appliesTo	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
tag	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
tagInMap	TokenNameIdentifier
=	TokenNameEQUAL
applicabilitySet	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
tag	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isSetInclusive	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
tagInMap	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
!	TokenNameNOT
tagInMap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
