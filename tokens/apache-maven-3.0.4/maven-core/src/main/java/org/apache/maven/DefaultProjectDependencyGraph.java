package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashSet	TokenNameIdentifier
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
execution	TokenNameIdentifier
.	TokenNameDOT
ProjectDependencyGraph	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
.	TokenNameDOT
MavenProject	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
.	TokenNameDOT
ProjectSorter	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
DefaultProjectDependencyGraph	TokenNameIdentifier
implements	TokenNameimplements
ProjectDependencyGraph	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
ProjectSorter	TokenNameIdentifier
sorter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DefaultProjectDependencyGraph	TokenNameIdentifier
(	TokenNameLPAREN
ProjectSorter	TokenNameIdentifier
sorter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
sorter	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"project sorter missing"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
sorter	TokenNameIdentifier
=	TokenNameEQUAL
sorter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
getSortedProjects	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
sorter	TokenNameIdentifier
.	TokenNameDOT
getSortedProjects	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
getDownstreamProjects	TokenNameIdentifier
(	TokenNameLPAREN
MavenProject	TokenNameIdentifier
project	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
transitive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
project	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"project missing"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Collection	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
projectIds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashSet	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getDownstreamProjects	TokenNameIdentifier
(	TokenNameLPAREN
ProjectSorter	TokenNameIdentifier
.	TokenNameDOT
getId	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
projectIds	TokenNameIdentifier
,	TokenNameCOMMA
transitive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
getProjects	TokenNameIdentifier
(	TokenNameLPAREN
projectIds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
getDownstreamProjects	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
projectId	TokenNameIdentifier
,	TokenNameCOMMA
Collection	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
projectIds	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
transitive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
:	TokenNameCOLON
sorter	TokenNameIdentifier
.	TokenNameDOT
getDependents	TokenNameIdentifier
(	TokenNameLPAREN
projectId	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
projectIds	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
transitive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
getDownstreamProjects	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
,	TokenNameCOMMA
projectIds	TokenNameIdentifier
,	TokenNameCOMMA
transitive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
getUpstreamProjects	TokenNameIdentifier
(	TokenNameLPAREN
MavenProject	TokenNameIdentifier
project	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
transitive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
project	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"project missing"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Collection	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
projectIds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashSet	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
getUpstreamProjects	TokenNameIdentifier
(	TokenNameLPAREN
ProjectSorter	TokenNameIdentifier
.	TokenNameDOT
getId	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
projectIds	TokenNameIdentifier
,	TokenNameCOMMA
transitive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
getProjects	TokenNameIdentifier
(	TokenNameLPAREN
projectIds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
getUpstreamProjects	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
projectId	TokenNameIdentifier
,	TokenNameCOMMA
Collection	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
projectIds	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
transitive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
:	TokenNameCOLON
sorter	TokenNameIdentifier
.	TokenNameDOT
getDependencies	TokenNameIdentifier
(	TokenNameLPAREN
projectId	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
projectIds	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
transitive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
getUpstreamProjects	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
,	TokenNameCOMMA
projectIds	TokenNameIdentifier
,	TokenNameCOMMA
transitive	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
getProjects	TokenNameIdentifier
(	TokenNameLPAREN
Collection	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
projectIds	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
projects	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
MavenProject	TokenNameIdentifier
p	TokenNameIdentifier
:	TokenNameCOLON
sorter	TokenNameIdentifier
.	TokenNameDOT
getSortedProjects	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
projectIds	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
ProjectSorter	TokenNameIdentifier
.	TokenNameDOT
getId	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
projects	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
projects	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
sorter	TokenNameIdentifier
.	TokenNameDOT
getSortedProjects	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE