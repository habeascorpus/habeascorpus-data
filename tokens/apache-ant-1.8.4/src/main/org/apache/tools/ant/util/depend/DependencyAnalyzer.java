package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
depend	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Enumeration	TokenNameIdentifier
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
types	TokenNameIdentifier
.	TokenNameDOT
Path	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
DependencyAnalyzer	TokenNameIdentifier
{	TokenNameLBRACE
void	TokenNamevoid
addSourcePath	TokenNameIdentifier
(	TokenNameLPAREN
Path	TokenNameIdentifier
sourcePath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
addClassPath	TokenNameIdentifier
(	TokenNameLPAREN
Path	TokenNameIdentifier
classpath	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
addRootClass	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
classname	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Enumeration	TokenNameIdentifier
getFileDependencies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Enumeration	TokenNameIdentifier
getClassDependencies	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
config	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
info	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
setClosure	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
closure	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
getClassContainer	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
classname	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
File	TokenNameIdentifier
getSourceContainer	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
classname	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
