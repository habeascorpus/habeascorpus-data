package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
optional	TokenNameIdentifier
.	TokenNameDOT
extension	TokenNameIdentifier
.	TokenNameDOT
resolvers	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
BuildException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Project	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
optional	TokenNameIdentifier
.	TokenNameDOT
extension	TokenNameIdentifier
.	TokenNameDOT
Extension	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
optional	TokenNameIdentifier
.	TokenNameDOT
extension	TokenNameIdentifier
.	TokenNameDOT
ExtensionResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LocationResolver	TokenNameIdentifier
implements	TokenNameimplements
ExtensionResolver	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
location	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setLocation	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
location	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
location	TokenNameIdentifier
=	TokenNameEQUAL
location	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
File	TokenNameIdentifier
resolve	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Extension	TokenNameIdentifier
extension	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Project	TokenNameIdentifier
project	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
location	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
message	TokenNameIdentifier
=	TokenNameEQUAL
"No location specified for resolver"	TokenNameStringLiteral
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
project	TokenNameIdentifier
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
location	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"Location["	TokenNameStringLiteral
+	TokenNamePLUS
location	TokenNameIdentifier
+	TokenNamePLUS
"]"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
