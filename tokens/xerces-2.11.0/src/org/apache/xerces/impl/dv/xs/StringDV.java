package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
dv	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
dv	TokenNameIdentifier
.	TokenNameDOT
InvalidDatatypeValueException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
dv	TokenNameIdentifier
.	TokenNameDOT
ValidationContext	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
StringDV	TokenNameIdentifier
extends	TokenNameextends
TypeValidator	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
short	TokenNameshort
getAllowedFacets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_LENGTH	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_MINLENGTH	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_MAXLENGTH	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_PATTERN	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_ENUMERATION	TokenNameIdentifier
|	TokenNameOR
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
FACET_WHITESPACE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getActualValue	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
content	TokenNameIdentifier
,	TokenNameCOMMA
ValidationContext	TokenNameIdentifier
context	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidDatatypeValueException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
content	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
