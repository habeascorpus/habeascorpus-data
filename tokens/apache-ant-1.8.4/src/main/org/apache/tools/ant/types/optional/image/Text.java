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
Color	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Font	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
FontMetrics	TokenNameIdentifier
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
RenderingHints	TokenNameIdentifier
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
Text	TokenNameIdentifier
extends	TokenNameextends
ImageOperation	TokenNameIdentifier
implements	TokenNameimplements
DrawOperation	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_POINT	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
strText	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
font	TokenNameIdentifier
=	TokenNameEQUAL
"Arial"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
point	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_POINT	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
bold	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
italic	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
color	TokenNameIdentifier
=	TokenNameEQUAL
"black"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setString	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
strText	TokenNameIdentifier
=	TokenNameEQUAL
str	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setFont	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
f	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
font	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPoint	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
p	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
point	TokenNameIdentifier
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setColor	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
color	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setBold	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
state	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
bold	TokenNameIdentifier
=	TokenNameEQUAL
state	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setItalic	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
state	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
italic	TokenNameIdentifier
=	TokenNameEQUAL
state	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
PlanarImage	TokenNameIdentifier
executeDrawOperation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
" Creating Text ""	TokenNameStringLiteral
+	TokenNamePLUS
strText	TokenNameIdentifier
+	TokenNamePLUS
"""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Color	TokenNameIdentifier
couloir	TokenNameIdentifier
=	TokenNameEQUAL
ColorMapper	TokenNameIdentifier
.	TokenNameDOT
getColorByName	TokenNameIdentifier
(	TokenNameLPAREN
color	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
width	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
height	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
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
graphics	TokenNameIdentifier
.	TokenNameDOT
setRenderingHint	TokenNameIdentifier
(	TokenNameLPAREN
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
KEY_ANTIALIASING	TokenNameIdentifier
,	TokenNameCOMMA
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
VALUE_ANTIALIAS_ON	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
setRenderingHint	TokenNameIdentifier
(	TokenNameLPAREN
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
KEY_FRACTIONALMETRICS	TokenNameIdentifier
,	TokenNameCOMMA
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
VALUE_FRACTIONALMETRICS_ON	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Font	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Font	TokenNameIdentifier
(	TokenNameLPAREN
font	TokenNameIdentifier
,	TokenNameCOMMA
Font	TokenNameIdentifier
.	TokenNameDOT
PLAIN	TokenNameIdentifier
,	TokenNameCOMMA
point	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FontMetrics	TokenNameIdentifier
fmetrics	TokenNameIdentifier
=	TokenNameEQUAL
graphics	TokenNameIdentifier
.	TokenNameDOT
getFontMetrics	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
height	TokenNameIdentifier
=	TokenNameEQUAL
fmetrics	TokenNameIdentifier
.	TokenNameDOT
getMaxAscent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
fmetrics	TokenNameIdentifier
.	TokenNameDOT
getMaxDescent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
width	TokenNameIdentifier
=	TokenNameEQUAL
fmetrics	TokenNameIdentifier
.	TokenNameDOT
stringWidth	TokenNameIdentifier
(	TokenNameLPAREN
strText	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
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
graphics	TokenNameIdentifier
.	TokenNameDOT
setRenderingHint	TokenNameIdentifier
(	TokenNameLPAREN
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
KEY_ANTIALIASING	TokenNameIdentifier
,	TokenNameCOMMA
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
VALUE_ANTIALIAS_ON	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
setRenderingHint	TokenNameIdentifier
(	TokenNameLPAREN
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
KEY_FRACTIONALMETRICS	TokenNameIdentifier
,	TokenNameCOMMA
RenderingHints	TokenNameIdentifier
.	TokenNameDOT
VALUE_FRACTIONALMETRICS_ON	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
setFont	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
couloir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
graphics	TokenNameIdentifier
.	TokenNameDOT
drawString	TokenNameIdentifier
(	TokenNameLPAREN
strText	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
height	TokenNameIdentifier
-	TokenNameMINUS
fmetrics	TokenNameIdentifier
.	TokenNameDOT
getMaxDescent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PlanarImage	TokenNameIdentifier
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
