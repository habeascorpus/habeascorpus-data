package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
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
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
GraphicsUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
Filter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
renderable	TokenNameIdentifier
.	TokenNameDOT
RedRable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
i18n	TokenNameIdentifier
.	TokenNameDOT
LocalizableSupport	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DefaultBrokenLinkProvider	TokenNameIdentifier
extends	TokenNameextends
BrokenLinkProvider	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
Filter	TokenNameIdentifier
brokenLinkImg	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
MESSAGE_RSRC	TokenNameIdentifier
=	TokenNameEQUAL
"resources.Messages"	TokenNameStringLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
Color	TokenNameIdentifier
BROKEN_LINK_COLOR	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Color	TokenNameIdentifier
(	TokenNameLPAREN
255	TokenNameIntegerLiteral
,	TokenNameCOMMA
255	TokenNameIntegerLiteral
,	TokenNameCOMMA
255	TokenNameIntegerLiteral
,	TokenNameCOMMA
190	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
base	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
code	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
params	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
cl	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
cl	TokenNameIdentifier
=	TokenNameEQUAL
DefaultBrokenLinkProvider	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cl	TokenNameIdentifier
=	TokenNameEQUAL
base	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SecurityException	TokenNameIdentifier
se	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
LocalizableSupport	TokenNameIdentifier
ls	TokenNameIdentifier
;	TokenNameSEMICOLON
ls	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LocalizableSupport	TokenNameIdentifier
(	TokenNameLPAREN
MESSAGE_RSRC	TokenNameIdentifier
,	TokenNameCOMMA
base	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
cl	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ls	TokenNameIdentifier
.	TokenNameDOT
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
code	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Filter	TokenNameIdentifier
getBrokenLinkImage	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
base	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
code	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
params	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
DefaultBrokenLinkProvider	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
brokenLinkImg	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
brokenLinkImg	TokenNameIdentifier
;	TokenNameSEMICOLON
BufferedImage	TokenNameIdentifier
bi	TokenNameIdentifier
;	TokenNameSEMICOLON
bi	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
100	TokenNameIntegerLiteral
,	TokenNameCOMMA
100	TokenNameIntegerLiteral
,	TokenNameCOMMA
BufferedImage	TokenNameIdentifier
.	TokenNameDOT
TYPE_INT_ARGB	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Hashtable	TokenNameIdentifier
ht	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ht	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
BROKEN_LINK_PROPERTY	TokenNameIdentifier
,	TokenNameCOMMA
formatMessage	TokenNameIdentifier
(	TokenNameLPAREN
base	TokenNameIdentifier
,	TokenNameCOMMA
code	TokenNameIdentifier
,	TokenNameCOMMA
params	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bi	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedImage	TokenNameIdentifier
(	TokenNameLPAREN
bi	TokenNameIdentifier
.	TokenNameDOT
getColorModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
bi	TokenNameIdentifier
.	TokenNameDOT
getRaster	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
bi	TokenNameIdentifier
.	TokenNameDOT
isAlphaPremultiplied	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
ht	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Graphics2D	TokenNameIdentifier
g2d	TokenNameIdentifier
=	TokenNameEQUAL
bi	TokenNameIdentifier
.	TokenNameDOT
createGraphics	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
BROKEN_LINK_COLOR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
fillRect	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
100	TokenNameIntegerLiteral
,	TokenNameCOMMA
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
setColor	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
.	TokenNameDOT
black	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
drawRect	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
96	TokenNameIntegerLiteral
,	TokenNameCOMMA
96	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
drawString	TokenNameIdentifier
(	TokenNameLPAREN
"Broken Image"	TokenNameStringLiteral
,	TokenNameCOMMA
6	TokenNameIntegerLiteral
,	TokenNameCOMMA
50	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
g2d	TokenNameIdentifier
.	TokenNameDOT
dispose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
brokenLinkImg	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RedRable	TokenNameIdentifier
(	TokenNameLPAREN
GraphicsUtil	TokenNameIdentifier
.	TokenNameDOT
wrap	TokenNameIdentifier
(	TokenNameLPAREN
bi	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
brokenLinkImg	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE