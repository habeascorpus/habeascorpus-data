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
Graphics2D	TokenNameIdentifier
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
Draw	TokenNameIdentifier
extends	TokenNameextends
TransformOperation	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
int	TokenNameint
xloc	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
yloc	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setXloc	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
x	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
xloc	TokenNameIdentifier
=	TokenNameEQUAL
x	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setYloc	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
yloc	TokenNameIdentifier
=	TokenNameEQUAL
y	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addRectangle	TokenNameIdentifier
(	TokenNameLPAREN
Rectangle	TokenNameIdentifier
rect	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
instructions	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
rect	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addText	TokenNameIdentifier
(	TokenNameLPAREN
Text	TokenNameIdentifier
text	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
instructions	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addEllipse	TokenNameIdentifier
(	TokenNameLPAREN
Ellipse	TokenNameIdentifier
elip	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
instructions	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
elip	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addArc	TokenNameIdentifier
(	TokenNameLPAREN
Arc	TokenNameIdentifier
arc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
instructions	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
arc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PlanarImage	TokenNameIdentifier
executeTransformOperation	TokenNameIdentifier
(	TokenNameLPAREN
PlanarImage	TokenNameIdentifier
image	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
BufferedImage	TokenNameIdentifier
bi	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getAsBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
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
op	TokenNameIdentifier
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
log	TokenNameIdentifier
(	TokenNameLPAREN
" Drawing to x="	TokenNameStringLiteral
+	TokenNamePLUS
xloc	TokenNameIdentifier
+	TokenNamePLUS
" y="	TokenNameStringLiteral
+	TokenNamePLUS
yloc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
drawImage	TokenNameIdentifier
(	TokenNameLPAREN
op	TokenNameIdentifier
.	TokenNameDOT
getAsBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
xloc	TokenNameIdentifier
,	TokenNameCOMMA
yloc	TokenNameIdentifier
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
PlanarImage	TokenNameIdentifier
op	TokenNameIdentifier
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
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedImage	TokenNameIdentifier
child	TokenNameIdentifier
=	TokenNameEQUAL
op	TokenNameIdentifier
.	TokenNameDOT
getAsBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
log	TokenNameIdentifier
(	TokenNameLPAREN
" Drawing to x="	TokenNameStringLiteral
+	TokenNamePLUS
xloc	TokenNameIdentifier
+	TokenNamePLUS
" y="	TokenNameStringLiteral
+	TokenNamePLUS
yloc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
drawImage	TokenNameIdentifier
(	TokenNameLPAREN
child	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
xloc	TokenNameIdentifier
,	TokenNameCOMMA
yloc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PlanarImage	TokenNameIdentifier
.	TokenNameDOT
wrapRenderedImage	TokenNameIdentifier
(	TokenNameLPAREN
bi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
image	TokenNameIdentifier
=	TokenNameEQUAL
PlanarImage	TokenNameIdentifier
.	TokenNameDOT
wrapRenderedImage	TokenNameIdentifier
(	TokenNameLPAREN
bi	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
image	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE