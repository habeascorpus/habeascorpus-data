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
SymbolHash	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SchemaDVFactoryImpl	TokenNameIdentifier
extends	TokenNameextends
BaseSchemaDVFactory	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
SymbolHash	TokenNameIdentifier
fBuiltInTypes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SymbolHash	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
createBuiltInTypes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
void	TokenNamevoid
createBuiltInTypes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
createBuiltInTypes	TokenNameIdentifier
(	TokenNameLPAREN
fBuiltInTypes	TokenNameIdentifier
,	TokenNameCOMMA
XSSimpleTypeDecl	TokenNameIdentifier
.	TokenNameDOT
fAnySimpleType	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSSimpleType	TokenNameIdentifier
getBuiltInType	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
XSSimpleType	TokenNameIdentifier
)	TokenNameRPAREN
fBuiltInTypes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SymbolHash	TokenNameIdentifier
getBuiltInTypes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
SymbolHash	TokenNameIdentifier
)	TokenNameRPAREN
fBuiltInTypes	TokenNameIdentifier
.	TokenNameDOT
makeClone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
