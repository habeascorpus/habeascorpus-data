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
condition	TokenNameIdentifier
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
ProjectComponent	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
IsSet	TokenNameIdentifier
extends	TokenNameextends
ProjectComponent	TokenNameIdentifier
implements	TokenNameimplements
Condition	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
property	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
p	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
property	TokenNameIdentifier
=	TokenNameEQUAL
p	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
eval	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
property	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"No property specified for isset "	TokenNameStringLiteral
+	TokenNamePLUS
"condition"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
property	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE