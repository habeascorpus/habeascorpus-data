package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
extension	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
AbstractDocument	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
DOMUtilities	TokenNameIdentifier
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
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
PrefixableStylableExtensionElement	TokenNameIdentifier
extends	TokenNameextends
StylableExtensionElement	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
String	TokenNameIdentifier
prefix	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
PrefixableStylableExtensionElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
PrefixableStylableExtensionElement	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
,	TokenNameCOMMA
AbstractDocument	TokenNameIdentifier
owner	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
owner	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setPrefix	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
prefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
prefix	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
prefix	TokenNameIdentifier
+	TokenNamePLUS
':'	TokenNameCharacterLiteral
+	TokenNamePLUS
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPrefix	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isReadonly	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"readonly.node"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
prefix	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
!	TokenNameNOT
DOMUtilities	TokenNameIdentifier
.	TokenNameDOT
isValidName	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
createDOMException	TokenNameIdentifier
(	TokenNameLPAREN
DOMException	TokenNameIdentifier
.	TokenNameDOT
INVALID_CHARACTER_ERR	TokenNameIdentifier
,	TokenNameCOMMA
"prefix"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
getNodeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
getNodeName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
prefix	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
prefix	TokenNameIdentifier
=	TokenNameEQUAL
prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
