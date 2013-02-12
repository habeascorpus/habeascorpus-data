package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
event	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
event	TokenNameIdentifier
.	TokenNameDOT
InputEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
event	TokenNameIdentifier
.	TokenNameDOT
KeyEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
event	TokenNameIdentifier
.	TokenNameDOT
MouseEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
GraphicsNode	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
AWTEventDispatcher	TokenNameIdentifier
extends	TokenNameextends
AbstractAWTEventDispatcher	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
void	TokenNamevoid
dispatchKeyEvent	TokenNameIdentifier
(	TokenNameLPAREN
KeyEvent	TokenNameIdentifier
evt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
currentKeyEventTarget	TokenNameIdentifier
=	TokenNameEQUAL
lastHit	TokenNameIdentifier
;	TokenNameSEMICOLON
GraphicsNode	TokenNameIdentifier
target	TokenNameIdentifier
=	TokenNameEQUAL
currentKeyEventTarget	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
root	TokenNameIdentifier
:	TokenNameCOLON
currentKeyEventTarget	TokenNameIdentifier
;	TokenNameSEMICOLON
processKeyEvent	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
GraphicsNodeKeyEvent	TokenNameIdentifier
(	TokenNameLPAREN
target	TokenNameIdentifier
,	TokenNameCOMMA
evt	TokenNameIdentifier
.	TokenNameDOT
getID	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
evt	TokenNameIdentifier
.	TokenNameDOT
getWhen	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
evt	TokenNameIdentifier
.	TokenNameDOT
getModifiers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
getCurrentLockState	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
evt	TokenNameIdentifier
.	TokenNameDOT
getKeyCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
evt	TokenNameIdentifier
.	TokenNameDOT
getKeyChar	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
getModifiers	TokenNameIdentifier
(	TokenNameLPAREN
InputEvent	TokenNameIdentifier
evt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
evt	TokenNameIdentifier
.	TokenNameDOT
getModifiers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
getButton	TokenNameIdentifier
(	TokenNameLPAREN
MouseEvent	TokenNameIdentifier
evt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
evt	TokenNameIdentifier
.	TokenNameDOT
getModifiers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&	TokenNameAND
InputEvent	TokenNameIdentifier
.	TokenNameDOT
BUTTON1_MASK	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
evt	TokenNameIdentifier
.	TokenNameDOT
getModifiers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&	TokenNameAND
InputEvent	TokenNameIdentifier
.	TokenNameDOT
BUTTON2_MASK	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
evt	TokenNameIdentifier
.	TokenNameDOT
getModifiers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
&	TokenNameAND
InputEvent	TokenNameIdentifier
.	TokenNameDOT
BUTTON3_MASK	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
static	TokenNamestatic
boolean	TokenNameboolean
isMetaDown	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
modifiers	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
modifiers	TokenNameIdentifier
&	TokenNameAND
GraphicsNodeInputEvent	TokenNameIdentifier
.	TokenNameDOT
META_MASK	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE