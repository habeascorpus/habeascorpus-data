package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
wml	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
wml	TokenNameIdentifier
.	TokenNameDOT
WMLPostfieldElement	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
WMLPostfieldElementImpl	TokenNameIdentifier
extends	TokenNameextends
WMLElementImpl	TokenNameIdentifier
implements	TokenNameimplements
WMLPostfieldElement	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1169432003991642980L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
WMLPostfieldElementImpl	TokenNameIdentifier
(	TokenNameLPAREN
WMLDocumentImpl	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
tagName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
owner	TokenNameIdentifier
,	TokenNameCOMMA
tagName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setValue	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"value"	TokenNameStringLiteral
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"value"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setClassName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"class"	TokenNameStringLiteral
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getClassName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"class"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setId	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"id"	TokenNameStringLiteral
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getId	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"id"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"name"	TokenNameStringLiteral
,	TokenNameCOMMA
newValue	TokenNameIdentifier
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
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"name"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
