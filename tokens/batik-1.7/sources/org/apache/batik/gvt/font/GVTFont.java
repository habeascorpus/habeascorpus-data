package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
.	TokenNameDOT
font	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
font	TokenNameIdentifier
.	TokenNameDOT
FontRenderContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
CharacterIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
GVTFont	TokenNameIdentifier
{	TokenNameLBRACE
boolean	TokenNameboolean
canDisplay	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
canDisplayUpTo	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
text	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
limit	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
canDisplayUpTo	TokenNameIdentifier
(	TokenNameLPAREN
CharacterIterator	TokenNameIdentifier
iter	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
start	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
limit	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
canDisplayUpTo	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GVTGlyphVector	TokenNameIdentifier
createGlyphVector	TokenNameIdentifier
(	TokenNameLPAREN
FontRenderContext	TokenNameIdentifier
frc	TokenNameIdentifier
,	TokenNameCOMMA
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chars	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GVTGlyphVector	TokenNameIdentifier
createGlyphVector	TokenNameIdentifier
(	TokenNameLPAREN
FontRenderContext	TokenNameIdentifier
frc	TokenNameIdentifier
,	TokenNameCOMMA
CharacterIterator	TokenNameIdentifier
ci	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GVTGlyphVector	TokenNameIdentifier
createGlyphVector	TokenNameIdentifier
(	TokenNameLPAREN
FontRenderContext	TokenNameIdentifier
frc	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
glyphCodes	TokenNameIdentifier
,	TokenNameCOMMA
CharacterIterator	TokenNameIdentifier
ci	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GVTGlyphVector	TokenNameIdentifier
createGlyphVector	TokenNameIdentifier
(	TokenNameLPAREN
FontRenderContext	TokenNameIdentifier
frc	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
str	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GVTFont	TokenNameIdentifier
deriveFont	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
getFamilyName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GVTLineMetrics	TokenNameIdentifier
getLineMetrics	TokenNameIdentifier
(	TokenNameLPAREN
char	TokenNamechar
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chars	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
beginIndex	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
limit	TokenNameIdentifier
,	TokenNameCOMMA
FontRenderContext	TokenNameIdentifier
frc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GVTLineMetrics	TokenNameIdentifier
getLineMetrics	TokenNameIdentifier
(	TokenNameLPAREN
CharacterIterator	TokenNameIdentifier
ci	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
beginIndex	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
limit	TokenNameIdentifier
,	TokenNameCOMMA
FontRenderContext	TokenNameIdentifier
frc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GVTLineMetrics	TokenNameIdentifier
getLineMetrics	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
,	TokenNameCOMMA
FontRenderContext	TokenNameIdentifier
frc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GVTLineMetrics	TokenNameIdentifier
getLineMetrics	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
str	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
beginIndex	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
limit	TokenNameIdentifier
,	TokenNameCOMMA
FontRenderContext	TokenNameIdentifier
frc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
getSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
getVKern	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphCode1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
glyphCode2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
float	TokenNamefloat
getHKern	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphCode1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
glyphCode2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
