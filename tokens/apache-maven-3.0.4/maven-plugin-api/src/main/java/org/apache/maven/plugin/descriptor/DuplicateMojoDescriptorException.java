package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
plugin	TokenNameIdentifier
.	TokenNameDOT
descriptor	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DuplicateMojoDescriptorException	TokenNameIdentifier
extends	TokenNameextends
InvalidPluginDescriptorException	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
DuplicateMojoDescriptorException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
goalPrefix	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
goal	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
existingImplementation	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
newImplementation	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
"Goal: "	TokenNameStringLiteral
+	TokenNamePLUS
goal	TokenNameIdentifier
+	TokenNamePLUS
" already exists in the plugin descriptor for prefix: "	TokenNameStringLiteral
+	TokenNamePLUS
goalPrefix	TokenNameIdentifier
+	TokenNamePLUS
" Existing implementation is: "	TokenNameStringLiteral
+	TokenNamePLUS
existingImplementation	TokenNameIdentifier
+	TokenNamePLUS
" Conflicting implementation is: "	TokenNameStringLiteral
+	TokenNamePLUS
newImplementation	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE