package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
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
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
IdentityHashMap	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
graph	TokenNameIdentifier
.	TokenNameDOT
Dependency	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
sonatype	TokenNameIdentifier
.	TokenNameDOT
aether	TokenNameIdentifier
.	TokenNameDOT
graph	TokenNameIdentifier
.	TokenNameDOT
DependencyNode	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
DefaultDependencyResolutionResult	TokenNameIdentifier
implements	TokenNameimplements
DependencyResolutionResult	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
DependencyNode	TokenNameIdentifier
root	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
>	TokenNameGREATER
dependencies	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
>	TokenNameGREATER
resolvedDependencies	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
>	TokenNameGREATER
unresolvedDependencies	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
Exception	TokenNameIdentifier
>	TokenNameGREATER
collectionErrors	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Exception	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
Map	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Exception	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
resolutionErrors	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IdentityHashMap	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Exception	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
DependencyNode	TokenNameIdentifier
getDependencyGraph	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
root	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDependencyGraph	TokenNameIdentifier
(	TokenNameLPAREN
DependencyNode	TokenNameIdentifier
root	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
root	TokenNameIdentifier
=	TokenNameEQUAL
root	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
>	TokenNameGREATER
getDependencies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
dependencies	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
>	TokenNameGREATER
getResolvedDependencies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
resolvedDependencies	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addResolvedDependency	TokenNameIdentifier
(	TokenNameLPAREN
Dependency	TokenNameIdentifier
dependency	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
dependencies	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
dependency	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
resolvedDependencies	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
dependency	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Dependency	TokenNameIdentifier
>	TokenNameGREATER
getUnresolvedDependencies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
unresolvedDependencies	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Exception	TokenNameIdentifier
>	TokenNameGREATER
getCollectionErrors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
collectionErrors	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setCollectionErrors	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
Exception	TokenNameIdentifier
>	TokenNameGREATER
exceptions	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
exceptions	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
collectionErrors	TokenNameIdentifier
=	TokenNameEQUAL
exceptions	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
collectionErrors	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
Exception	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
Exception	TokenNameIdentifier
>	TokenNameGREATER
getResolutionErrors	TokenNameIdentifier
(	TokenNameLPAREN
Dependency	TokenNameIdentifier
dependency	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
Exception	TokenNameIdentifier
>	TokenNameGREATER
errors	TokenNameIdentifier
=	TokenNameEQUAL
resolutionErrors	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
dependency	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
(	TokenNameLPAREN
errors	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
errors	TokenNameIdentifier
:	TokenNameCOLON
Collections	TokenNameIdentifier
.	TokenNameDOT
<	TokenNameLESS
Exception	TokenNameIdentifier
>	TokenNameGREATER
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setResolutionErrors	TokenNameIdentifier
(	TokenNameLPAREN
Dependency	TokenNameIdentifier
dependency	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
Exception	TokenNameIdentifier
>	TokenNameGREATER
errors	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
dependencies	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
dependency	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
unresolvedDependencies	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
dependency	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
resolutionErrors	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
dependency	TokenNameIdentifier
,	TokenNameCOMMA
errors	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
