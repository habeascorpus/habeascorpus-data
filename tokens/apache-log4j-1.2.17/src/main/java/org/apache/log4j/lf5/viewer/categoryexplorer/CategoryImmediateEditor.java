package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
lf5	TokenNameIdentifier
.	TokenNameDOT
viewer	TokenNameIdentifier
.	TokenNameDOT
categoryexplorer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Dimension	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Rectangle	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
EventObject	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
Icon	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
JTree	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
tree	TokenNameIdentifier
.	TokenNameDOT
DefaultTreeCellEditor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
tree	TokenNameIdentifier
.	TokenNameDOT
TreePath	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CategoryImmediateEditor	TokenNameIdentifier
extends	TokenNameextends
DefaultTreeCellEditor	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
CategoryNodeRenderer	TokenNameIdentifier
renderer	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Icon	TokenNameIdentifier
editingIcon	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
CategoryImmediateEditor	TokenNameIdentifier
(	TokenNameLPAREN
JTree	TokenNameIdentifier
tree	TokenNameIdentifier
,	TokenNameCOMMA
CategoryNodeRenderer	TokenNameIdentifier
renderer	TokenNameIdentifier
,	TokenNameCOMMA
CategoryNodeEditor	TokenNameIdentifier
editor	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
tree	TokenNameIdentifier
,	TokenNameCOMMA
renderer	TokenNameIdentifier
,	TokenNameCOMMA
editor	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
renderer	TokenNameIdentifier
=	TokenNameEQUAL
renderer	TokenNameIdentifier
;	TokenNameSEMICOLON
renderer	TokenNameIdentifier
.	TokenNameDOT
setIcon	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
renderer	TokenNameIdentifier
.	TokenNameDOT
setLeafIcon	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
renderer	TokenNameIdentifier
.	TokenNameDOT
setOpenIcon	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
renderer	TokenNameIdentifier
.	TokenNameDOT
setClosedIcon	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
editingIcon	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
shouldSelectCell	TokenNameIdentifier
(	TokenNameLPAREN
EventObject	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
rv	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
instanceof	TokenNameinstanceof
MouseEvent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
MouseEvent	TokenNameIdentifier
me	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MouseEvent	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
;	TokenNameSEMICOLON
TreePath	TokenNameIdentifier
path	TokenNameIdentifier
=	TokenNameEQUAL
tree	TokenNameIdentifier
.	TokenNameDOT
getPathForLocation	TokenNameIdentifier
(	TokenNameLPAREN
me	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
me	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CategoryNode	TokenNameIdentifier
node	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CategoryNode	TokenNameIdentifier
)	TokenNameRPAREN
path	TokenNameIdentifier
.	TokenNameDOT
getLastPathComponent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rv	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
.	TokenNameDOT
isLeaf	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
rv	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
inCheckBoxHitRegion	TokenNameIdentifier
(	TokenNameLPAREN
MouseEvent	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TreePath	TokenNameIdentifier
path	TokenNameIdentifier
=	TokenNameEQUAL
tree	TokenNameIdentifier
.	TokenNameDOT
getPathForLocation	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
path	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
CategoryNode	TokenNameIdentifier
node	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CategoryNode	TokenNameIdentifier
)	TokenNameRPAREN
path	TokenNameIdentifier
.	TokenNameDOT
getLastPathComponent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
rv	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle	TokenNameIdentifier
bounds	TokenNameIdentifier
=	TokenNameEQUAL
tree	TokenNameIdentifier
.	TokenNameDOT
getRowBounds	TokenNameIdentifier
(	TokenNameLPAREN
lastRow	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Dimension	TokenNameIdentifier
checkBoxOffset	TokenNameIdentifier
=	TokenNameEQUAL
renderer	TokenNameIdentifier
.	TokenNameDOT
getCheckBoxOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bounds	TokenNameIdentifier
.	TokenNameDOT
translate	TokenNameIdentifier
(	TokenNameLPAREN
offset	TokenNameIdentifier
+	TokenNamePLUS
checkBoxOffset	TokenNameIdentifier
.	TokenNameDOT
width	TokenNameIdentifier
,	TokenNameCOMMA
checkBoxOffset	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rv	TokenNameIdentifier
=	TokenNameEQUAL
bounds	TokenNameIdentifier
.	TokenNameDOT
contains	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
getPoint	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
canEditImmediately	TokenNameIdentifier
(	TokenNameLPAREN
EventObject	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
rv	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
e	TokenNameIdentifier
instanceof	TokenNameinstanceof
MouseEvent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
MouseEvent	TokenNameIdentifier
me	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
MouseEvent	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
;	TokenNameSEMICOLON
rv	TokenNameIdentifier
=	TokenNameEQUAL
inCheckBoxHitRegion	TokenNameIdentifier
(	TokenNameLPAREN
me	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
rv	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
determineOffset	TokenNameIdentifier
(	TokenNameLPAREN
JTree	TokenNameIdentifier
tree	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isSelected	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
expanded	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
leaf	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
row	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
offset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE