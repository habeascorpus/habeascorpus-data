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
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
DTDDVFactory	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_FACTORY_CLASS	TokenNameIdentifier
=	TokenNameEQUAL
"org.apache.xerces.impl.dv.dtd.DTDDVFactoryImpl"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
DTDDVFactory	TokenNameIdentifier
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
DVFactoryException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
DEFAULT_FACTORY_CLASS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
DTDDVFactory	TokenNameIdentifier
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
factoryClass	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DVFactoryException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
DTDDVFactory	TokenNameIdentifier
)	TokenNameRPAREN
(	TokenNameLPAREN
ObjectFactory	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
factoryClass	TokenNameIdentifier
,	TokenNameCOMMA
ObjectFactory	TokenNameIdentifier
.	TokenNameDOT
findClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassCastException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
DVFactoryException	TokenNameIdentifier
(	TokenNameLPAREN
"DTD factory class "	TokenNameStringLiteral
+	TokenNamePLUS
factoryClass	TokenNameIdentifier
+	TokenNamePLUS
" does not extend from DTDDVFactory."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
DTDDVFactory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
DatatypeValidator	TokenNameIdentifier
getBuiltInDV	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
Hashtable	TokenNameIdentifier
getBuiltInTypes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
