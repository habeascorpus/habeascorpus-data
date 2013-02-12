package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
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
MavenSession	TokenNameIdentifier
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
lifecycle	TokenNameIdentifier
.	TokenNameDOT
LifecycleNotFoundException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
LifecyclePhaseNotFoundException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
.	TokenNameDOT
stub	TokenNameIdentifier
.	TokenNameDOT
ProjectDependencyGraphStub	TokenNameIdentifier
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
InvalidPluginDescriptorException	TokenNameIdentifier
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
MojoNotFoundException	TokenNameIdentifier
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
PluginDescriptorParsingException	TokenNameIdentifier
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
PluginNotFoundException	TokenNameIdentifier
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
PluginResolutionException	TokenNameIdentifier
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
prefix	TokenNameIdentifier
.	TokenNameDOT
NoPluginFoundForPrefixException	TokenNameIdentifier
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
version	TokenNameIdentifier
.	TokenNameDOT
PluginVersionResolutionException	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
static	TokenNamestatic
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
.	TokenNameDOT
stub	TokenNameIdentifier
.	TokenNameDOT
ProjectDependencyGraphStub	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ConcurrencyDependencyGraphTest	TokenNameIdentifier
extends	TokenNameextends
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testConcurrencyGraphPrimaryVersion	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidPluginDescriptorException	TokenNameIdentifier
,	TokenNameCOMMA
PluginVersionResolutionException	TokenNameIdentifier
,	TokenNameCOMMA
PluginDescriptorParsingException	TokenNameIdentifier
,	TokenNameCOMMA
NoPluginFoundForPrefixException	TokenNameIdentifier
,	TokenNameCOMMA
MojoNotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
PluginNotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
PluginResolutionException	TokenNameIdentifier
,	TokenNameCOMMA
LifecyclePhaseNotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
LifecycleNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
ProjectDependencyGraph	TokenNameIdentifier
dependencyGraph	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ProjectDependencyGraphStub	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
=	TokenNameEQUAL
ProjectDependencyGraphStub	TokenNameIdentifier
.	TokenNameDOT
getMavenSession	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ConcurrencyDependencyGraph	TokenNameIdentifier
graph	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ConcurrencyDependencyGraph	TokenNameIdentifier
(	TokenNameLPAREN
getProjectBuildList	TokenNameIdentifier
(	TokenNameLPAREN
session	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
dependencyGraph	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
projectBuilds	TokenNameIdentifier
=	TokenNameEQUAL
graph	TokenNameIdentifier
.	TokenNameDOT
getRootSchedulableBuilds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
projectBuilds	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
A	TokenNameIdentifier
,	TokenNameCOMMA
projectBuilds	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
subsequent	TokenNameIdentifier
=	TokenNameEQUAL
graph	TokenNameIdentifier
.	TokenNameDOT
markAsFinished	TokenNameIdentifier
(	TokenNameLPAREN
A	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
subsequent	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
ProjectDependencyGraphStub	TokenNameIdentifier
.	TokenNameDOT
B	TokenNameIdentifier
,	TokenNameCOMMA
subsequent	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
C	TokenNameIdentifier
,	TokenNameCOMMA
subsequent	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
bDescendants	TokenNameIdentifier
=	TokenNameEQUAL
graph	TokenNameIdentifier
.	TokenNameDOT
markAsFinished	TokenNameIdentifier
(	TokenNameLPAREN
B	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
bDescendants	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
Y	TokenNameIdentifier
,	TokenNameCOMMA
bDescendants	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
cDescendants	TokenNameIdentifier
=	TokenNameEQUAL
graph	TokenNameIdentifier
.	TokenNameDOT
markAsFinished	TokenNameIdentifier
(	TokenNameLPAREN
C	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
cDescendants	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
X	TokenNameIdentifier
,	TokenNameCOMMA
cDescendants	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
Z	TokenNameIdentifier
,	TokenNameCOMMA
cDescendants	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testConcurrencyGraphDifferentCompletionOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidPluginDescriptorException	TokenNameIdentifier
,	TokenNameCOMMA
PluginVersionResolutionException	TokenNameIdentifier
,	TokenNameCOMMA
PluginDescriptorParsingException	TokenNameIdentifier
,	TokenNameCOMMA
NoPluginFoundForPrefixException	TokenNameIdentifier
,	TokenNameCOMMA
MojoNotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
PluginNotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
PluginResolutionException	TokenNameIdentifier
,	TokenNameCOMMA
LifecyclePhaseNotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
LifecycleNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
ProjectDependencyGraph	TokenNameIdentifier
dependencyGraph	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ProjectDependencyGraphStub	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
MavenSession	TokenNameIdentifier
session	TokenNameIdentifier
=	TokenNameEQUAL
ProjectDependencyGraphStub	TokenNameIdentifier
.	TokenNameDOT
getMavenSession	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ConcurrencyDependencyGraph	TokenNameIdentifier
graph	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ConcurrencyDependencyGraph	TokenNameIdentifier
(	TokenNameLPAREN
getProjectBuildList	TokenNameIdentifier
(	TokenNameLPAREN
session	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
dependencyGraph	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graph	TokenNameIdentifier
.	TokenNameDOT
markAsFinished	TokenNameIdentifier
(	TokenNameLPAREN
A	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
cDescendants	TokenNameIdentifier
=	TokenNameEQUAL
graph	TokenNameIdentifier
.	TokenNameDOT
markAsFinished	TokenNameIdentifier
(	TokenNameLPAREN
C	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
cDescendants	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
Z	TokenNameIdentifier
,	TokenNameCOMMA
cDescendants	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
List	TokenNameIdentifier
<	TokenNameLESS
MavenProject	TokenNameIdentifier
>	TokenNameGREATER
bDescendants	TokenNameIdentifier
=	TokenNameEQUAL
graph	TokenNameIdentifier
.	TokenNameDOT
markAsFinished	TokenNameIdentifier
(	TokenNameLPAREN
B	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
bDescendants	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
X	TokenNameIdentifier
,	TokenNameCOMMA
bDescendants	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
Y	TokenNameIdentifier
,	TokenNameCOMMA
bDescendants	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE