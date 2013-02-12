package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SetBasedFieldSelector	TokenNameIdentifier
implements	TokenNameimplements
FieldSelector	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
fieldsToLoad	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
lazyFieldsToLoad	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SetBasedFieldSelector	TokenNameIdentifier
(	TokenNameLPAREN
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
fieldsToLoad	TokenNameIdentifier
,	TokenNameCOMMA
Set	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
lazyFieldsToLoad	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
fieldsToLoad	TokenNameIdentifier
=	TokenNameEQUAL
fieldsToLoad	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
lazyFieldsToLoad	TokenNameIdentifier
=	TokenNameEQUAL
lazyFieldsToLoad	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FieldSelectorResult	TokenNameIdentifier
accept	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
FieldSelectorResult	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
FieldSelectorResult	TokenNameIdentifier
.	TokenNameDOT
NO_LOAD	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fieldsToLoad	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
FieldSelectorResult	TokenNameIdentifier
.	TokenNameDOT
LOAD	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
lazyFieldsToLoad	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
FieldSelectorResult	TokenNameIdentifier
.	TokenNameDOT
LAZY_LOAD	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
