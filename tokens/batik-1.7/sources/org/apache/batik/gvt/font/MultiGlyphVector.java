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
Graphics2D	TokenNameIdentifier
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
font	TokenNameIdentifier
.	TokenNameDOT
FontRenderContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
font	TokenNameIdentifier
.	TokenNameDOT
GlyphJustificationInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
AffineTransform	TokenNameIdentifier
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
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
Point2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
geom	TokenNameIdentifier
.	TokenNameDOT
Rectangle2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
AttributedCharacterIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
text	TokenNameIdentifier
.	TokenNameDOT
AttributedCharacterSpanIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
MultiGlyphVector	TokenNameIdentifier
implements	TokenNameimplements
GVTGlyphVector	TokenNameIdentifier
{	TokenNameLBRACE
GVTGlyphVector	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
gvs	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
nGlyphs	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
off	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
nGlyph	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
MultiGlyphVector	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
gvs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
nSlots	TokenNameIdentifier
=	TokenNameEQUAL
gvs	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
gvs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GVTGlyphVector	TokenNameIdentifier
[	TokenNameLBRACKET
nSlots	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
nGlyphs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
nSlots	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
off	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
nSlots	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
gvs	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
off	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
nGlyph	TokenNameIdentifier
;	TokenNameSEMICOLON
GVTGlyphVector	TokenNameIdentifier
gv	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
GVTGlyphVector	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
gv	TokenNameIdentifier
;	TokenNameSEMICOLON
nGlyphs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
gv	TokenNameIdentifier
.	TokenNameDOT
getNumGlyphs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nGlyph	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
nGlyphs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
nGlyphs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getNumGlyphs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
nGlyph	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIdx	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
glyphIdx	TokenNameIdentifier
>	TokenNameGREATER
nGlyph	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
glyphIdx	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
nGlyph	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
gvs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
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
nGlyphs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
if	TokenNameif
(	TokenNameLPAREN
glyphIdx	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
<	TokenNameLESS
nGlyphs	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
return	TokenNamereturn
i	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
GVTFont	TokenNameIdentifier
getFont	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"Can't be correctly Implemented"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
FontRenderContext	TokenNameIdentifier
getFontRenderContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
getFontRenderContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getGlyphCode	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getGlyphCode	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
GlyphJustificationInfo	TokenNameIdentifier
getGlyphJustificationInfo	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getGlyphJustificationInfo	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Shape	TokenNameIdentifier
getGlyphLogicalBounds	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getGlyphLogicalBounds	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
GVTGlyphMetrics	TokenNameIdentifier
getGlyphMetrics	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getGlyphMetrics	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Shape	TokenNameIdentifier
getGlyphOutline	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getGlyphOutline	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Rectangle2D	TokenNameIdentifier
getGlyphCellBounds	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getGlyphLogicalBounds	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Point2D	TokenNameIdentifier
getGlyphPosition	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getGlyphPosition	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
AffineTransform	TokenNameIdentifier
getGlyphTransform	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getGlyphTransform	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Shape	TokenNameIdentifier
getGlyphVisualBounds	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getGlyphVisualBounds	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setGlyphPosition	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
,	TokenNameCOMMA
Point2D	TokenNameIdentifier
newPos	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
setGlyphPosition	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
newPos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setGlyphTransform	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
,	TokenNameCOMMA
AffineTransform	TokenNameIdentifier
newTX	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
setGlyphTransform	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
newTX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setGlyphVisible	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
visible	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
setGlyphVisible	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
visible	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isGlyphVisible	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
isGlyphVisible	TokenNameIdentifier
(	TokenNameLPAREN
glyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getGlyphCodes	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
beginGlyphIndex	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numEntries	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
codeReturn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ret	TokenNameIdentifier
=	TokenNameEQUAL
codeReturn	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
numEntries	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
tmp	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
gvIdx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
beginGlyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
gi	TokenNameIdentifier
=	TokenNameEQUAL
beginGlyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
gvIdx	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
GVTGlyphVector	TokenNameIdentifier
gv	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
numEntries	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
numEntries	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
gi	TokenNameIdentifier
+	TokenNamePLUS
len	TokenNameIdentifier
>	TokenNameGREATER
nGlyphs	TokenNameIdentifier
[	TokenNameLBRACKET
gvIdx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
len	TokenNameIdentifier
=	TokenNameEQUAL
nGlyphs	TokenNameIdentifier
[	TokenNameLBRACKET
gvIdx	TokenNameIdentifier
]	TokenNameRBRACKET
-	TokenNameMINUS
gi	TokenNameIdentifier
;	TokenNameSEMICOLON
gv	TokenNameIdentifier
=	TokenNameEQUAL
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
gvIdx	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
gv	TokenNameIdentifier
.	TokenNameDOT
getGlyphCodes	TokenNameIdentifier
(	TokenNameLPAREN
gi	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
ret	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
tmp	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
tmp	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
tmp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
len	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
gv	TokenNameIdentifier
.	TokenNameDOT
getGlyphCodes	TokenNameIdentifier
(	TokenNameLPAREN
gi	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
tmp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
ret	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
gi	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
gvIdx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
numEntries	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getGlyphPositions	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
beginGlyphIndex	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numEntries	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
positionReturn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ret	TokenNameIdentifier
=	TokenNameEQUAL
positionReturn	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
numEntries	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
tmp	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
gvIdx	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
beginGlyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
gi	TokenNameIdentifier
=	TokenNameEQUAL
beginGlyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
gvIdx	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
GVTGlyphVector	TokenNameIdentifier
gv	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
numEntries	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
numEntries	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
gi	TokenNameIdentifier
+	TokenNamePLUS
len	TokenNameIdentifier
>	TokenNameGREATER
nGlyphs	TokenNameIdentifier
[	TokenNameLBRACKET
gvIdx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
len	TokenNameIdentifier
=	TokenNameEQUAL
nGlyphs	TokenNameIdentifier
[	TokenNameLBRACKET
gvIdx	TokenNameIdentifier
]	TokenNameRBRACKET
-	TokenNameMINUS
gi	TokenNameIdentifier
;	TokenNameSEMICOLON
gv	TokenNameIdentifier
=	TokenNameEQUAL
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
gvIdx	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
i	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
gv	TokenNameIdentifier
.	TokenNameDOT
getGlyphPositions	TokenNameIdentifier
(	TokenNameLPAREN
gi	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
ret	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
tmp	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
tmp	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
tmp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
float	TokenNamefloat
[	TokenNameLBRACKET
len	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
gv	TokenNameIdentifier
.	TokenNameDOT
getGlyphPositions	TokenNameIdentifier
(	TokenNameLPAREN
gi	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
tmp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
tmp	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
ret	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
gi	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
gvIdx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
numEntries	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
len	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
len	TokenNameIdentifier
*	TokenNameMULTIPLY
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Rectangle2D	TokenNameIdentifier
getLogicalBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
<	TokenNameLESS
gvs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getLogicalBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
ret	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Shape	TokenNameIdentifier
getOutline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
GeneralPath	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
<	TokenNameLESS
gvs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Shape	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getOutline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GeneralPath	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
ret	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Shape	TokenNameIdentifier
getOutline	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
x	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
y	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Shape	TokenNameIdentifier
outline	TokenNameIdentifier
=	TokenNameEQUAL
getOutline	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
tr	TokenNameIdentifier
=	TokenNameEQUAL
AffineTransform	TokenNameIdentifier
.	TokenNameDOT
getTranslateInstance	TokenNameIdentifier
(	TokenNameLPAREN
x	TokenNameIdentifier
,	TokenNameCOMMA
y	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outline	TokenNameIdentifier
=	TokenNameEQUAL
tr	TokenNameIdentifier
.	TokenNameDOT
createTransformedShape	TokenNameIdentifier
(	TokenNameLPAREN
outline	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
outline	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Rectangle2D	TokenNameIdentifier
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
AttributedCharacterIterator	TokenNameIdentifier
aci	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
begin	TokenNameIdentifier
=	TokenNameEQUAL
aci	TokenNameIdentifier
.	TokenNameDOT
getBeginIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
<	TokenNameLESS
gvs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
GVTGlyphVector	TokenNameIdentifier
gv	TokenNameIdentifier
=	TokenNameEQUAL
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
end	TokenNameIdentifier
=	TokenNameEQUAL
gv	TokenNameIdentifier
.	TokenNameDOT
getCharacterCount	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
gv	TokenNameIdentifier
.	TokenNameDOT
getNumGlyphs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
AttributedCharacterSpanIterator	TokenNameIdentifier
(	TokenNameLPAREN
aci	TokenNameIdentifier
,	TokenNameCOMMA
begin	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
ret	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
begin	TokenNameIdentifier
=	TokenNameEQUAL
end	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Rectangle2D	TokenNameIdentifier
getGeometricBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
<	TokenNameLESS
gvs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
b	TokenNameIdentifier
=	TokenNameEQUAL
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getGeometricBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
b	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
ret	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
performDefaultLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
<	TokenNameLESS
gvs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
performDefaultLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getCharacterCount	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
startGlyphIndex	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
endGlyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
idx1	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
startGlyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
idx2	TokenNameIdentifier
=	TokenNameEQUAL
getGVIdx	TokenNameIdentifier
(	TokenNameLPAREN
endGlyphIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
ret	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
idx1	TokenNameIdentifier
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
idx2	TokenNameIdentifier
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
gi1	TokenNameIdentifier
=	TokenNameEQUAL
startGlyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
gi2	TokenNameIdentifier
=	TokenNameEQUAL
endGlyphIndex	TokenNameIdentifier
-	TokenNameMINUS
off	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
gi2	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
nGlyphs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
gi2	TokenNameIdentifier
=	TokenNameEQUAL
nGlyphs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ret	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getCharacterCount	TokenNameIdentifier
(	TokenNameLPAREN
gi1	TokenNameIdentifier
,	TokenNameCOMMA
gi2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
startGlyphIndex	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
(	TokenNameLPAREN
gi2	TokenNameIdentifier
-	TokenNameMINUS
gi1	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
draw	TokenNameIdentifier
(	TokenNameLPAREN
Graphics2D	TokenNameIdentifier
g2d	TokenNameIdentifier
,	TokenNameCOMMA
AttributedCharacterIterator	TokenNameIdentifier
aci	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
begin	TokenNameIdentifier
=	TokenNameEQUAL
aci	TokenNameIdentifier
.	TokenNameDOT
getBeginIndex	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
idx	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
<	TokenNameLESS
gvs	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
idx	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
GVTGlyphVector	TokenNameIdentifier
gv	TokenNameIdentifier
=	TokenNameEQUAL
gvs	TokenNameIdentifier
[	TokenNameLBRACKET
idx	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
end	TokenNameIdentifier
=	TokenNameEQUAL
gv	TokenNameIdentifier
.	TokenNameDOT
getCharacterCount	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
gv	TokenNameIdentifier
.	TokenNameDOT
getNumGlyphs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
gv	TokenNameIdentifier
.	TokenNameDOT
draw	TokenNameIdentifier
(	TokenNameLPAREN
g2d	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
AttributedCharacterSpanIterator	TokenNameIdentifier
(	TokenNameLPAREN
aci	TokenNameIdentifier
,	TokenNameCOMMA
begin	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
begin	TokenNameIdentifier
=	TokenNameEQUAL
end	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
