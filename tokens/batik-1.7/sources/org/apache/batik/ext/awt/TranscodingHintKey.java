package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
RenderingHints	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
TranscodingHintKey	TokenNameIdentifier
extends	TokenNameextends
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
Key	TokenNameIdentifier
{	TokenNameLBRACE
TranscodingHintKey	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
number	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
number	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isCompatibleValue	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
isCompatible	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
val	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
isCompatible	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
isCompatible	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE