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
javax	TokenNameIdentifier
.	TokenNameDOT
media	TokenNameIdentifier
.	TokenNameDOT
jai	TokenNameIdentifier
.	TokenNameDOT
InterpolationNearest	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
media	TokenNameIdentifier
.	TokenNameDOT
jai	TokenNameIdentifier
.	TokenNameDOT
JAI	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
ParameterBlock	TokenNameIdentifier
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
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Graphics2D	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Rotate	TokenNameIdentifier
extends	TokenNameextends
TransformOperation	TokenNameIdentifier
implements	TokenNameimplements
DrawOperation	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
float	TokenNamefloat
HALF_CIRCLE	TokenNameIdentifier
=	TokenNameEQUAL
180.0F	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
float	TokenNamefloat
angle	TokenNameIdentifier
=	TokenNameEQUAL
0.0F	TokenNameFloatingPointLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setAngle	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
ang	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
angle	TokenNameIdentifier
=	TokenNameEQUAL
Float	TokenNameIdentifier
.	TokenNameDOT
parseFloat	TokenNameIdentifier
(	TokenNameLPAREN
ang	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PlanarImage	TokenNameIdentifier
performRotate	TokenNameIdentifier
(	TokenNameLPAREN
PlanarImage	TokenNameIdentifier
image	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
tAngle	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
(	TokenNameLPAREN
angle	TokenNameIdentifier
*	TokenNameMULTIPLY
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
PI	TokenNameIdentifier
/	TokenNameDIVIDE
HALF_CIRCLE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ParameterBlock	TokenNameIdentifier
pb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ParameterBlock	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pb	TokenNameIdentifier
.	TokenNameDOT
addSource	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pb	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
0.0F	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pb	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
0.0F	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pb	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
tAngle	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pb	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
InterpolationNearest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
JAI	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
"Rotate"	TokenNameStringLiteral
,	TokenNameCOMMA
pb	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
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
null	TokenNamenull
;	TokenNameSEMICOLON
Graphics2D	TokenNameIdentifier
graphics	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
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
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Execing Draws"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
image	TokenNameIdentifier
=	TokenNameEQUAL
performRotate	TokenNameIdentifier
(	TokenNameLPAREN
op	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
image	TokenNameIdentifier
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
bi	TokenNameIdentifier
=	TokenNameEQUAL
image	TokenNameIdentifier
.	TokenNameDOT
getAsBufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Execing Transforms"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Execing as TransformOperation"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
image	TokenNameIdentifier
=	TokenNameEQUAL
performRotate	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
image	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
image	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PlanarImage	TokenNameIdentifier
executeDrawOperation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
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
op	TokenNameIdentifier
=	TokenNameEQUAL
performRotate	TokenNameIdentifier
(	TokenNameLPAREN
op	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
op	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE