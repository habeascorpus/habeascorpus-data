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
DatatypeException	TokenNameIdentifier
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
InvalidDatatypeFacetException	TokenNameIdentifier
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
ValidatedInfo	TokenNameIdentifier
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
XSFacets	TokenNameIdentifier
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
XSSimpleType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
StringList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSNamespaceItem	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSObject	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSObjectList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSSimpleTypeDefinition	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSTypeDefinition	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XSSimpleTypeDelegate	TokenNameIdentifier
implements	TokenNameimplements
XSSimpleType	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
final	TokenNamefinal
XSSimpleType	TokenNameIdentifier
type	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
XSSimpleTypeDelegate	TokenNameIdentifier
(	TokenNameLPAREN
XSSimpleType	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
NullPointerException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
type	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSSimpleType	TokenNameIdentifier
getWrappedXSSimpleType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSObjectList	TokenNameIdentifier
getAnnotations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getAnnotations	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getBounded	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getBounded	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getBuiltInKind	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getBuiltInKind	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getDefinedFacets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getDefinedFacets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSObjectList	TokenNameIdentifier
getFacets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getFacets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSObject	TokenNameIdentifier
getFacet	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
facetType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getFacet	TokenNameIdentifier
(	TokenNameLPAREN
facetType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getFinite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getFinite	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getFixedFacets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getFixedFacets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSSimpleTypeDefinition	TokenNameIdentifier
getItemType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getItemType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
StringList	TokenNameIdentifier
getLexicalEnumeration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getLexicalEnumeration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getLexicalFacetValue	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
facetName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getLexicalFacetValue	TokenNameIdentifier
(	TokenNameLPAREN
facetName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
StringList	TokenNameIdentifier
getLexicalPattern	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getLexicalPattern	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSObjectList	TokenNameIdentifier
getMemberTypes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getMemberTypes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSObjectList	TokenNameIdentifier
getMultiValueFacets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getMultiValueFacets	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getNumeric	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getNumeric	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getOrdered	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getOrdered	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSSimpleTypeDefinition	TokenNameIdentifier
getPrimitiveType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getPrimitiveType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getVariety	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getVariety	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isDefinedFacet	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
facetName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
isDefinedFacet	TokenNameIdentifier
(	TokenNameLPAREN
facetName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isFixedFacet	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
facetName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
isFixedFacet	TokenNameIdentifier
(	TokenNameLPAREN
facetName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
derivedFrom	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
namespace	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
derivationMethod	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
derivedFrom	TokenNameIdentifier
(	TokenNameLPAREN
namespace	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
,	TokenNameCOMMA
derivationMethod	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
derivedFromType	TokenNameIdentifier
(	TokenNameLPAREN
XSTypeDefinition	TokenNameIdentifier
ancestorType	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
derivationMethod	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
derivedFromType	TokenNameIdentifier
(	TokenNameLPAREN
ancestorType	TokenNameIdentifier
,	TokenNameCOMMA
derivationMethod	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getAnonymous	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getAnonymous	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSTypeDefinition	TokenNameIdentifier
getBaseType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getBaseType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getFinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getFinal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getTypeCategory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getTypeCategory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isFinal	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
restriction	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
isFinal	TokenNameIdentifier
(	TokenNameLPAREN
restriction	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getNamespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSNamespaceItem	TokenNameIdentifier
getNamespaceItem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getNamespaceItem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
applyFacets	TokenNameIdentifier
(	TokenNameLPAREN
XSFacets	TokenNameIdentifier
facets	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
presentFacet	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
fixedFacet	TokenNameIdentifier
,	TokenNameCOMMA
ValidationContext	TokenNameIdentifier
context	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidDatatypeFacetException	TokenNameIdentifier
{	TokenNameLBRACE
type	TokenNameIdentifier
.	TokenNameDOT
applyFacets	TokenNameIdentifier
(	TokenNameLPAREN
facets	TokenNameIdentifier
,	TokenNameCOMMA
presentFacet	TokenNameIdentifier
,	TokenNameCOMMA
fixedFacet	TokenNameIdentifier
,	TokenNameCOMMA
context	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getPrimitiveKind	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getPrimitiveKind	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getWhitespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
DatatypeException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
getWhitespace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isEqual	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
value1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
isEqual	TokenNameIdentifier
(	TokenNameLPAREN
value1	TokenNameIdentifier
,	TokenNameCOMMA
value2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isIDType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
isIDType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
validate	TokenNameIdentifier
(	TokenNameLPAREN
ValidationContext	TokenNameIdentifier
context	TokenNameIdentifier
,	TokenNameCOMMA
ValidatedInfo	TokenNameIdentifier
validatedInfo	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidDatatypeValueException	TokenNameIdentifier
{	TokenNameLBRACE
type	TokenNameIdentifier
.	TokenNameDOT
validate	TokenNameIdentifier
(	TokenNameLPAREN
context	TokenNameIdentifier
,	TokenNameCOMMA
validatedInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
validate	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
content	TokenNameIdentifier
,	TokenNameCOMMA
ValidationContext	TokenNameIdentifier
context	TokenNameIdentifier
,	TokenNameCOMMA
ValidatedInfo	TokenNameIdentifier
validatedInfo	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidDatatypeValueException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
validate	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
,	TokenNameCOMMA
context	TokenNameIdentifier
,	TokenNameCOMMA
validatedInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
validate	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
content	TokenNameIdentifier
,	TokenNameCOMMA
ValidationContext	TokenNameIdentifier
context	TokenNameIdentifier
,	TokenNameCOMMA
ValidatedInfo	TokenNameIdentifier
validatedInfo	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidDatatypeValueException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
validate	TokenNameIdentifier
(	TokenNameLPAREN
content	TokenNameIdentifier
,	TokenNameCOMMA
context	TokenNameIdentifier
,	TokenNameCOMMA
validatedInfo	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE