package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
font	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
AttributedCharacterIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
UnresolvedFontFamily	TokenNameIdentifier
implements	TokenNameimplements
GVTFontFamily	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
GVTFontFace	TokenNameIdentifier
fontFace	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
UnresolvedFontFamily	TokenNameIdentifier
(	TokenNameLPAREN
GVTFontFace	TokenNameIdentifier
fontFace	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
fontFace	TokenNameIdentifier
=	TokenNameEQUAL
fontFace	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
UnresolvedFontFamily	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
familyName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
new	TokenNamenew
GVTFontFace	TokenNameIdentifier
(	TokenNameLPAREN
familyName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
GVTFontFace	TokenNameIdentifier
getFontFace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fontFace	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getFamilyName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fontFace	TokenNameIdentifier
.	TokenNameDOT
getFamilyName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
GVTFont	TokenNameIdentifier
deriveFont	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
size	TokenNameIdentifier
,	TokenNameCOMMA
AttributedCharacterIterator	TokenNameIdentifier
aci	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
GVTFont	TokenNameIdentifier
deriveFont	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
size	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
attrs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
