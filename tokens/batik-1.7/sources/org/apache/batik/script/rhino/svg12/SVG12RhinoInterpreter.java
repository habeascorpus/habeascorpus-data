package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
script	TokenNameIdentifier
.	TokenNameDOT
rhino	TokenNameIdentifier
.	TokenNameDOT
svg12	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
script	TokenNameIdentifier
.	TokenNameDOT
rhino	TokenNameIdentifier
.	TokenNameDOT
RhinoInterpreter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
mozilla	TokenNameIdentifier
.	TokenNameDOT
javascript	TokenNameIdentifier
.	TokenNameDOT
Context	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
mozilla	TokenNameIdentifier
.	TokenNameDOT
javascript	TokenNameIdentifier
.	TokenNameDOT
Scriptable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
mozilla	TokenNameIdentifier
.	TokenNameDOT
javascript	TokenNameIdentifier
.	TokenNameDOT
ScriptableObject	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SVG12RhinoInterpreter	TokenNameIdentifier
extends	TokenNameextends
RhinoInterpreter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
SVG12RhinoInterpreter	TokenNameIdentifier
(	TokenNameLPAREN
URL	TokenNameIdentifier
documentURL	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
documentURL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
defineGlobalWrapperClass	TokenNameIdentifier
(	TokenNameLPAREN
Scriptable	TokenNameIdentifier
global	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
ScriptableObject	TokenNameIdentifier
.	TokenNameDOT
defineClass	TokenNameIdentifier
(	TokenNameLPAREN
global	TokenNameIdentifier
,	TokenNameCOMMA
GlobalWrapper	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
ScriptableObject	TokenNameIdentifier
createGlobalObject	TokenNameIdentifier
(	TokenNameLPAREN
Context	TokenNameIdentifier
ctx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
GlobalWrapper	TokenNameIdentifier
(	TokenNameLPAREN
ctx	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
