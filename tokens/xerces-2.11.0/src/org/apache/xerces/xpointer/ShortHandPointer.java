package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xpointer	TokenNameIdentifier
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
Constants	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
SymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
Augmentations	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
QName	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
XMLAttributes	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
XNIException	TokenNameIdentifier
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
AttributePSVI	TokenNameIdentifier
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
final	TokenNamefinal
class	TokenNameclass
ShortHandPointer	TokenNameIdentifier
implements	TokenNameimplements
XPointerPart	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
fShortHandPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
fIsFragmentResolved	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
SymbolTable	TokenNameIdentifier
fSymbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ShortHandPointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ShortHandPointer	TokenNameIdentifier
(	TokenNameLPAREN
SymbolTable	TokenNameIdentifier
symbolTable	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fSymbolTable	TokenNameIdentifier
=	TokenNameEQUAL
symbolTable	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
parseXPointer	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
part	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XNIException	TokenNameIdentifier
{	TokenNameLBRACE
fShortHandPointer	TokenNameIdentifier
=	TokenNameEQUAL
part	TokenNameIdentifier
;	TokenNameSEMICOLON
fIsFragmentResolved	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
fMatchingChildCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
resolveXPointer	TokenNameIdentifier
(	TokenNameLPAREN
QName	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
XMLAttributes	TokenNameIdentifier
attributes	TokenNameIdentifier
,	TokenNameCOMMA
Augmentations	TokenNameIdentifier
augs	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
event	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XNIException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fMatchingChildCount	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
fIsFragmentResolved	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
event	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XPointerPart	TokenNameIdentifier
.	TokenNameDOT
EVENT_ELEMENT_START	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fMatchingChildCount	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
fIsFragmentResolved	TokenNameIdentifier
=	TokenNameEQUAL
hasMatchingIdentifier	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
attributes	TokenNameIdentifier
,	TokenNameCOMMA
augs	TokenNameIdentifier
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
fIsFragmentResolved	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fMatchingChildCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
event	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XPointerPart	TokenNameIdentifier
.	TokenNameDOT
EVENT_ELEMENT_EMPTY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fMatchingChildCount	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
fIsFragmentResolved	TokenNameIdentifier
=	TokenNameEQUAL
hasMatchingIdentifier	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
attributes	TokenNameIdentifier
,	TokenNameCOMMA
augs	TokenNameIdentifier
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
fIsFragmentResolved	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fMatchingChildCount	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
fIsFragmentResolved	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
hasMatchingIdentifier	TokenNameIdentifier
(	TokenNameLPAREN
QName	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
XMLAttributes	TokenNameIdentifier
attributes	TokenNameIdentifier
,	TokenNameCOMMA
Augmentations	TokenNameIdentifier
augs	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
event	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XNIException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
normalizedValue	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
attributes	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
attributes	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
normalizedValue	TokenNameIdentifier
=	TokenNameEQUAL
getSchemaDeterminedID	TokenNameIdentifier
(	TokenNameLPAREN
attributes	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
normalizedValue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
normalizedValue	TokenNameIdentifier
=	TokenNameEQUAL
getChildrenSchemaDeterminedID	TokenNameIdentifier
(	TokenNameLPAREN
attributes	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
normalizedValue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
normalizedValue	TokenNameIdentifier
=	TokenNameEQUAL
getDTDDeterminedID	TokenNameIdentifier
(	TokenNameLPAREN
attributes	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
normalizedValue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
normalizedValue	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
normalizedValue	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
fShortHandPointer	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getDTDDeterminedID	TokenNameIdentifier
(	TokenNameLPAREN
XMLAttributes	TokenNameIdentifier
attributes	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XNIException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
attributes	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"ID"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
attributes	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getSchemaDeterminedID	TokenNameIdentifier
(	TokenNameLPAREN
XMLAttributes	TokenNameIdentifier
attributes	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XNIException	TokenNameIdentifier
{	TokenNameLBRACE
Augmentations	TokenNameIdentifier
augs	TokenNameIdentifier
=	TokenNameEQUAL
attributes	TokenNameIdentifier
.	TokenNameDOT
getAugmentations	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AttributePSVI	TokenNameIdentifier
attrPSVI	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AttributePSVI	TokenNameIdentifier
)	TokenNameRPAREN
augs	TokenNameIdentifier
.	TokenNameDOT
getItem	TokenNameIdentifier
(	TokenNameLPAREN
Constants	TokenNameIdentifier
.	TokenNameDOT
ATTRIBUTE_PSVI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
attrPSVI	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
XSTypeDefinition	TokenNameIdentifier
typeDef	TokenNameIdentifier
=	TokenNameEQUAL
attrPSVI	TokenNameIdentifier
.	TokenNameDOT
getMemberTypeDefinition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
typeDef	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
typeDef	TokenNameIdentifier
=	TokenNameEQUAL
attrPSVI	TokenNameIdentifier
.	TokenNameDOT
getTypeDefinition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
typeDef	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
(	TokenNameLPAREN
(	TokenNameLPAREN
XSSimpleType	TokenNameIdentifier
)	TokenNameRPAREN
typeDef	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
isIDType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
attrPSVI	TokenNameIdentifier
.	TokenNameDOT
getSchemaNormalizedValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getChildrenSchemaDeterminedID	TokenNameIdentifier
(	TokenNameLPAREN
XMLAttributes	TokenNameIdentifier
attributes	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XNIException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isFragmentResolved	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fIsFragmentResolved	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isChildFragmentResolved	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fIsFragmentResolved	TokenNameIdentifier
&&	TokenNameAND_AND
(	TokenNameLPAREN
fMatchingChildCount	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getSchemeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fShortHandPointer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getSchemeData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSchemeName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
schemeName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fShortHandPointer	TokenNameIdentifier
=	TokenNameEQUAL
schemeName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSchemeData	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
schemeData	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE