package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
gui	TokenNameIdentifier
.	TokenNameDOT
resource	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Color	TokenNameIdentifier
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
Graphics	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
JComponent	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JToolbarSeparator	TokenNameIdentifier
extends	TokenNameextends
JComponent	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
JToolbarSeparator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
setMaximumSize	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Dimension	TokenNameIdentifier
(	TokenNameLPAREN
15	TokenNameIntegerLiteral
,	TokenNameCOMMA
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
paintComponent	TokenNameIdentifier
(	TokenNameLPAREN
Graphics	TokenNameIdentifier
g	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
paintComponent	TokenNameIdentifier
(	TokenNameLPAREN
g	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Dimension	TokenNameIdentifier
size	TokenNameIdentifier
=	TokenNameEQUAL
getSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
size	TokenNameIdentifier
.	TokenNameDOT
width	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
.	TokenNameDOT
gray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
drawLine	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
pos	TokenNameIdentifier
,	TokenNameCOMMA
size	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
-	TokenNameMINUS
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
drawLine	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
pos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
.	TokenNameDOT
white	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
drawLine	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
pos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
size	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
-	TokenNameMINUS
5	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g	TokenNameIdentifier
.	TokenNameDOT
drawLine	TokenNameIdentifier
(	TokenNameLPAREN
pos	TokenNameIdentifier
,	TokenNameCOMMA
size	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
,	TokenNameCOMMA
pos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
size	TokenNameIdentifier
.	TokenNameDOT
height	TokenNameIdentifier
-	TokenNameMINUS
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE