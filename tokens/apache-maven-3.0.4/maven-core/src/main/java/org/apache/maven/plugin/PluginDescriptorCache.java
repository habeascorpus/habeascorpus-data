package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
plugin	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
Plugin	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
plugin	TokenNameIdentifier
.	TokenNameDOT
descriptor	TokenNameIdentifier
.	TokenNameDOT
PluginDescriptor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
RepositorySystemSession	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
repository	TokenNameIdentifier
.	TokenNameDOT
RemoteRepository	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
PluginDescriptorCache	TokenNameIdentifier
{	TokenNameLBRACE
interface	TokenNameinterface
Key	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
Key	TokenNameIdentifier
createKey	TokenNameIdentifier
(	TokenNameLPAREN
Plugin	TokenNameIdentifier
plugin	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
RemoteRepository	TokenNameIdentifier
>	TokenNameGREATER
repositories	TokenNameIdentifier
,	TokenNameCOMMA
RepositorySystemSession	TokenNameIdentifier
session	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
put	TokenNameIdentifier
(	TokenNameLPAREN
Key	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
PluginDescriptor	TokenNameIdentifier
pluginDescriptor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PluginDescriptor	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
Key	TokenNameIdentifier
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
