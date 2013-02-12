package	TokenNamepackage
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
optional	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
media	TokenNameIdentifier
.	TokenNameDOT
jai	TokenNameIdentifier
.	TokenNameDOT
PlanarImage	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
BasicStroke	TokenNameIdentifier
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
geom	TokenNameIdentifier
.	TokenNameDOT
Ellipse2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
BufferedImage	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Ellipse	TokenNameIdentifier
extends	TokenNameextends
BasicShape	TokenNameIdentifier
implements	TokenNameimplements
DrawOperation	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
int	TokenNameint
width	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
height	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setWidth	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
width	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
width	TokenNameIdentifier
=	TokenNameEQUAL
width	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setHeight	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
height	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
height	TokenNameIdentifier
=	TokenNameEQUAL
height	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PlanarImage	TokenNameIdentifier
executeDrawOperation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
BufferedImage	TokenNameIdentifier
bi	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
width	TokenNameIdentifier
,	TokenNameCOMMA
height	TokenNameIdentifier
,	TokenNameCOMMA
BufferedImage	TokenNameIdentifier
.	TokenNameDOT
TYPE_4BYTE_ABGR_PRE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Graphics2D	TokenNameIdentifier
graphics	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Graphics2D	TokenNameIdentifier
)	TokenNameRPAREN
bi	TokenNameIdentifier
.	TokenNameDOT
getGraphics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
stroke	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"transparent"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
BasicStroke	TokenNameIdentifier
bStroke	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BasicStroke	TokenNameIdentifier
(	TokenNameLPAREN
stroke_width	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
ColorMapper	TokenNameIdentifier
.	TokenNameDOT
getColorByName	TokenNameIdentifier
(	TokenNameLPAREN
stroke	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
setStroke	TokenNameIdentifier
(	TokenNameLPAREN
bStroke	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
draw	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Ellipse2D	TokenNameIdentifier
.	TokenNameDOT
Double	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
width	TokenNameIdentifier
,	TokenNameCOMMA
height	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
fill	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"transparent"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
graphics	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
ColorMapper	TokenNameIdentifier
.	TokenNameDOT
getColorByName	TokenNameIdentifier
(	TokenNameLPAREN
fill	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
fill	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Ellipse2D	TokenNameIdentifier
.	TokenNameDOT
Double	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
width	TokenNameIdentifier
,	TokenNameCOMMA
height	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
instructions	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
size	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
ImageOperation	TokenNameIdentifier
instr	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
ImageOperation	TokenNameIdentifier
)	TokenNameRPAREN
instructions	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
instr	TokenNameIdentifier
instanceof	TokenNameinstanceof
DrawOperation	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
PlanarImage	TokenNameIdentifier
img	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
DrawOperation	TokenNameIdentifier
)	TokenNameRPAREN
instr	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
executeDrawOperation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
drawImage	TokenNameIdentifier
(	TokenNameLPAREN
img	TokenNameIdentifier
.	TokenNameDOT
getAsBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
instr	TokenNameIdentifier
instanceof	TokenNameinstanceof
TransformOperation	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
graphics	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Graphics2D	TokenNameIdentifier
)	TokenNameRPAREN
bi	TokenNameIdentifier
.	TokenNameDOT
getGraphics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PlanarImage	TokenNameIdentifier
image	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
TransformOperation	TokenNameIdentifier
)	TokenNameRPAREN
instr	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
executeTransformOperation	TokenNameIdentifier
(	TokenNameLPAREN
PlanarImage	TokenNameIdentifier
.	TokenNameDOT
wrapRenderedImage	TokenNameIdentifier
(	TokenNameLPAREN
bi	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bi	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getAsBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
PlanarImage	TokenNameIdentifier
.	TokenNameDOT
wrapRenderedImage	TokenNameIdentifier
(	TokenNameLPAREN
bi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE