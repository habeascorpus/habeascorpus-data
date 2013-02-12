package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
renderer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Graphics2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
font	TokenNameIdentifier
.	TokenNameDOT
TextLayout	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
Point2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
AttributedCharacterIterator	TokenNameIdentifier
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
TextNode	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
ConcreteTextPainter	TokenNameIdentifier
extends	TokenNameextends
BasicTextPainter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
paint	TokenNameIdentifier
(	TokenNameLPAREN
AttributedCharacterIterator	TokenNameIdentifier
aci	TokenNameIdentifier
,	TokenNameCOMMA
Point2D	TokenNameIdentifier
location	TokenNameIdentifier
,	TokenNameCOMMA
TextNode	TokenNameIdentifier
.	TokenNameDOT
Anchor	TokenNameIdentifier
anchor	TokenNameIdentifier
,	TokenNameCOMMA
Graphics2D	TokenNameIdentifier
g2d	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TextLayout	TokenNameIdentifier
layout	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TextLayout	TokenNameIdentifier
(	TokenNameLPAREN
aci	TokenNameIdentifier
,	TokenNameCOMMA
fontRenderContext	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
advance	TokenNameIdentifier
=	TokenNameEQUAL
layout	TokenNameIdentifier
.	TokenNameDOT
getAdvance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
tx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
anchor	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
TextNode	TokenNameIdentifier
.	TokenNameDOT
Anchor	TokenNameIdentifier
.	TokenNameDOT
ANCHOR_MIDDLE	TokenNameIdentifier
:	TokenNameCOLON
tx	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
advance	TokenNameIdentifier
/	TokenNameDIVIDE
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
TextNode	TokenNameIdentifier
.	TokenNameDOT
Anchor	TokenNameIdentifier
.	TokenNameDOT
ANCHOR_END	TokenNameIdentifier
:	TokenNameCOLON
tx	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
advance	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
layout	TokenNameIdentifier
.	TokenNameDOT
draw	TokenNameIdentifier
(	TokenNameLPAREN
g2d	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
location	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
tx	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
location	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE