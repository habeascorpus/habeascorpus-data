package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
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
Condition	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DefaultAndCondition	TokenNameIdentifier
extends	TokenNameextends
AbstractCombinatorCondition	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
DefaultAndCondition	TokenNameIdentifier
(	TokenNameLPAREN
Condition	TokenNameIdentifier
c1	TokenNameIdentifier
,	TokenNameCOMMA
Condition	TokenNameIdentifier
c2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
c1	TokenNameIdentifier
,	TokenNameCOMMA
c2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getConditionType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
SAC_AND_CONDITION	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
getFirstCondition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
getSecondCondition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
