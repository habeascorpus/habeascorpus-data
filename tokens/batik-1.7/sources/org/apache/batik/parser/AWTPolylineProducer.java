package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Shape	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
GeneralPath	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
AWTPolylineProducer	TokenNameIdentifier
implements	TokenNameimplements
PointsHandler	TokenNameIdentifier
,	TokenNameCOMMA
ShapeProducer	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
GeneralPath	TokenNameIdentifier
path	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
newPath	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
int	TokenNameint
windingRule	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
Shape	TokenNameIdentifier
createShape	TokenNameIdentifier
(	TokenNameLPAREN
Reader	TokenNameIdentifier
r	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
wr	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
PointsParser	TokenNameIdentifier
p	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PointsParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AWTPolylineProducer	TokenNameIdentifier
ph	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AWTPolylineProducer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ph	TokenNameIdentifier
.	TokenNameDOT
setWindingRule	TokenNameIdentifier
(	TokenNameLPAREN
wr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
setPointsHandler	TokenNameIdentifier
(	TokenNameLPAREN
ph	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
p	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ph	TokenNameIdentifier
.	TokenNameDOT
getShape	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setWindingRule	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
windingRule	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getWindingRule	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
windingRule	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Shape	TokenNameIdentifier
getShape	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
path	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
startPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
path	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GeneralPath	TokenNameIdentifier
(	TokenNameLPAREN
windingRule	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
newPath	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
point	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
newPath	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
newPath	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
path	TokenNameIdentifier
.	TokenNameDOT
moveTo	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
path	TokenNameIdentifier
.	TokenNameDOT
lineTo	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
endPoints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
