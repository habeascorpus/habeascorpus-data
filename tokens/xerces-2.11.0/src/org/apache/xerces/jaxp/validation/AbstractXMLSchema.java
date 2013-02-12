package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
jaxp	TokenNameIdentifier
.	TokenNameDOT
validation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
validation	TokenNameIdentifier
.	TokenNameDOT
Schema	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
validation	TokenNameIdentifier
.	TokenNameDOT
Validator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
validation	TokenNameIdentifier
.	TokenNameDOT
ValidatorHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
abstract	TokenNameabstract
class	TokenNameclass
AbstractXMLSchema	TokenNameIdentifier
extends	TokenNameextends
Schema	TokenNameIdentifier
implements	TokenNameimplements
XSGrammarPoolContainer	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
HashMap	TokenNameIdentifier
fFeatures	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
AbstractXMLSchema	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fFeatures	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
Validator	TokenNameIdentifier
newValidator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ValidatorImpl	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
ValidatorHandler	TokenNameIdentifier
newValidatorHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ValidatorHandlerImpl	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
Boolean	TokenNameIdentifier
getFeature	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
featureId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
fFeatures	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
featureId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
void	TokenNamevoid
setFeature	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
featureId	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
state	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fFeatures	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
featureId	TokenNameIdentifier
,	TokenNameCOMMA
state	TokenNameIdentifier
?	TokenNameQUESTION
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
:	TokenNameCOLON
Boolean	TokenNameIdentifier
.	TokenNameDOT
FALSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
