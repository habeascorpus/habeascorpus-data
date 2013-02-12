package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
profiles	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
Profile	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
profiles	TokenNameIdentifier
.	TokenNameDOT
activation	TokenNameIdentifier
.	TokenNameDOT
ProfileActivationException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
interface	TokenNameinterface
ProfileManager	TokenNameIdentifier
{	TokenNameLBRACE
void	TokenNamevoid
addProfile	TokenNameIdentifier
(	TokenNameLPAREN
Profile	TokenNameIdentifier
profile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
explicitlyActivate	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
profileId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
explicitlyActivate	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
profileIds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
explicitlyDeactivate	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
profileId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
explicitlyDeactivate	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
profileIds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
getActiveProfiles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ProfileActivationException	TokenNameIdentifier
;	TokenNameSEMICOLON
void	TokenNamevoid
addProfiles	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
profiles	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
getProfilesById	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
getExplicitlyActivatedIds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
getExplicitlyDeactivatedIds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
getIdsActivatedByDefault	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Properties	TokenNameIdentifier
getRequestProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
