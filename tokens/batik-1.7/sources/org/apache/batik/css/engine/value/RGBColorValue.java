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
class	TokenNameclass
RGBColorValue	TokenNameIdentifier
extends	TokenNameextends
AbstractValue	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
Value	TokenNameIdentifier
red	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Value	TokenNameIdentifier
green	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Value	TokenNameIdentifier
blue	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
RGBColorValue	TokenNameIdentifier
(	TokenNameLPAREN
Value	TokenNameIdentifier
r	TokenNameIdentifier
,	TokenNameCOMMA
Value	TokenNameIdentifier
g	TokenNameIdentifier
,	TokenNameCOMMA
Value	TokenNameIdentifier
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
red	TokenNameIdentifier
=	TokenNameEQUAL
r	TokenNameIdentifier
;	TokenNameSEMICOLON
green	TokenNameIdentifier
=	TokenNameEQUAL
g	TokenNameIdentifier
;	TokenNameSEMICOLON
blue	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getPrimitiveType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
CSSPrimitiveValue	TokenNameIdentifier
.	TokenNameDOT
CSS_RGBCOLOR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"rgb("	TokenNameStringLiteral
+	TokenNamePLUS
red	TokenNameIdentifier
.	TokenNameDOT
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
", "	TokenNameStringLiteral
+	TokenNamePLUS
green	TokenNameIdentifier
.	TokenNameDOT
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
", "	TokenNameStringLiteral
+	TokenNamePLUS
blue	TokenNameIdentifier
.	TokenNameDOT
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
')'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Value	TokenNameIdentifier
getRed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
red	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Value	TokenNameIdentifier
getGreen	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
green	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Value	TokenNameIdentifier
getBlue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
blue	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getCssText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE