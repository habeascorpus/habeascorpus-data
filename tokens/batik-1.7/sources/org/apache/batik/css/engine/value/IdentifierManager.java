package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
engine	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
engine	TokenNameIdentifier
.	TokenNameDOT
CSSEngine	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
sac	TokenNameIdentifier
.	TokenNameDOT
LexicalUnit	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DOMException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
CSSPrimitiveValue	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
IdentifierManager	TokenNameIdentifier
extends	TokenNameextends
AbstractValueManager	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Value	TokenNameIdentifier
createValue	TokenNameIdentifier
(	TokenNameLPAREN
LexicalUnit	TokenNameIdentifier
lu	TokenNameIdentifier
,	TokenNameCOMMA
CSSEngine	TokenNameIdentifier
engine	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
lu	TokenNameIdentifier
.	TokenNameDOT
getLexicalUnitType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_INHERIT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
ValueConstants	TokenNameIdentifier
.	TokenNameDOT
INHERIT_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
LexicalUnit	TokenNameIdentifier
.	TokenNameDOT
SAC_IDENT	TokenNameIdentifier
:	TokenNameCOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
lu	TokenNameIdentifier
.	TokenNameDOT
getStringValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intern	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
getIdentifiers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
createInvalidIdentifierDOMException	TokenNameIdentifier
(	TokenNameLPAREN
lu	TokenNameIdentifier
.	TokenNameDOT
getStringValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Value	TokenNameIdentifier
)	TokenNameRPAREN
v	TokenNameIdentifier
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
createInvalidLexicalUnitDOMException	TokenNameIdentifier
(	TokenNameLPAREN
lu	TokenNameIdentifier
.	TokenNameDOT
getLexicalUnitType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Value	TokenNameIdentifier
createStringValue	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
type	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
CSSEngine	TokenNameIdentifier
engine	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_IDENT	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
createInvalidStringTypeDOMException	TokenNameIdentifier
(	TokenNameLPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Object	TokenNameIdentifier
v	TokenNameIdentifier
=	TokenNameEQUAL
getIdentifiers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
intern	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
v	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
createInvalidIdentifierDOMException	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Value	TokenNameIdentifier
)	TokenNameRPAREN
v	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
StringMap	TokenNameIdentifier
getIdentifiers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE