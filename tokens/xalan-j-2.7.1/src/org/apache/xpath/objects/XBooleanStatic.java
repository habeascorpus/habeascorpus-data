package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XBooleanStatic	TokenNameIdentifier
extends	TokenNameextends
XBoolean	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
8064147275772687409L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
m_val	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
XBooleanStatic	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_val	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
XObject	TokenNameIdentifier
obj2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
m_val	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
obj2	TokenNameIdentifier
.	TokenNameDOT
bool	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
te	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
te	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
