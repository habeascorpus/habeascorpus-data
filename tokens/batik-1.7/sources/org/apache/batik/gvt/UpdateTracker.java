package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
gvt	TokenNameIdentifier
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
Rectangle	TokenNameIdentifier
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
Rectangle2D	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
.	TokenNameDOT
WeakReference	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
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
LinkedList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Set	TokenNameIdentifier
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
event	TokenNameIdentifier
.	TokenNameDOT
GraphicsNodeChangeAdapter	TokenNameIdentifier
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
event	TokenNameIdentifier
.	TokenNameDOT
GraphicsNodeChangeEvent	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
UpdateTracker	TokenNameIdentifier
extends	TokenNameextends
GraphicsNodeChangeAdapter	TokenNameIdentifier
{	TokenNameLBRACE
Map	TokenNameIdentifier
dirtyNodes	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
fromBounds	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
Rectangle2D	TokenNameIdentifier
NULL_RECT	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Rectangle	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
UpdateTracker	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasChanged	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
dirtyNodes	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
getDirtyAreas	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
dirtyNodes	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
List	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinkedList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Set	TokenNameIdentifier
keys	TokenNameIdentifier
=	TokenNameEQUAL
dirtyNodes	TokenNameIdentifier
.	TokenNameDOT
keySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
i	TokenNameIdentifier
=	TokenNameEQUAL
keys	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
i	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
WeakReference	TokenNameIdentifier
gnWRef	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
WeakReference	TokenNameIdentifier
)	TokenNameRPAREN
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
GraphicsNode	TokenNameIdentifier
gn	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
GraphicsNode	TokenNameIdentifier
)	TokenNameRPAREN
gnWRef	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
gn	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
oat	TokenNameIdentifier
;	TokenNameSEMICOLON
oat	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AffineTransform	TokenNameIdentifier
)	TokenNameRPAREN
dirtyNodes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
gnWRef	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
oat	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
oat	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
oat	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Rectangle2D	TokenNameIdentifier
srcORgn	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Rectangle2D	TokenNameIdentifier
)	TokenNameRPAREN
fromBounds	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
gnWRef	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
srcNRgn	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
nat	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
srcORgn	TokenNameIdentifier
instanceof	TokenNameinstanceof
ChngSrcRect	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
srcNRgn	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nat	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nat	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
nat	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
nat	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
do	TokenNamedo
{	TokenNameLBRACE
gn	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
gn	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
Filter	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
srcNRgn	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nat	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
AffineTransform	TokenNameIdentifier
at	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
gnWRef	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getWeakReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
poat	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AffineTransform	TokenNameIdentifier
)	TokenNameRPAREN
dirtyNodes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
gnWRef	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
poat	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
poat	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
poat	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
oat	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
oat	TokenNameIdentifier
.	TokenNameDOT
preConcatenate	TokenNameIdentifier
(	TokenNameLPAREN
poat	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
oat	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
poat	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
at	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
nat	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
nat	TokenNameIdentifier
.	TokenNameDOT
preConcatenate	TokenNameIdentifier
(	TokenNameLPAREN
at	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
nat	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
at	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
while	TokenNamewhile
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
gn	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Shape	TokenNameIdentifier
oRgn	TokenNameIdentifier
=	TokenNameEQUAL
srcORgn	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
oRgn	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
oRgn	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
NULL_RECT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
oat	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
oRgn	TokenNameIdentifier
=	TokenNameEQUAL
oat	TokenNameIdentifier
.	TokenNameDOT
createTransformedShape	TokenNameIdentifier
(	TokenNameLPAREN
srcORgn	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
oRgn	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
srcNRgn	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Shape	TokenNameIdentifier
nRgn	TokenNameIdentifier
=	TokenNameEQUAL
srcNRgn	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nat	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
nRgn	TokenNameIdentifier
=	TokenNameEQUAL
nat	TokenNameIdentifier
.	TokenNameDOT
createTransformedShape	TokenNameIdentifier
(	TokenNameLPAREN
srcNRgn	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nRgn	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
ret	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
nRgn	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
fromBounds	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dirtyNodes	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Rectangle2D	TokenNameIdentifier
getNodeDirtyRegion	TokenNameIdentifier
(	TokenNameLPAREN
GraphicsNode	TokenNameIdentifier
gn	TokenNameIdentifier
,	TokenNameCOMMA
AffineTransform	TokenNameIdentifier
at	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
WeakReference	TokenNameIdentifier
gnWRef	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getWeakReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AffineTransform	TokenNameIdentifier
nat	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AffineTransform	TokenNameIdentifier
)	TokenNameRPAREN
dirtyNodes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
gnWRef	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nat	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
nat	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
nat	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
at	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
at	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
at	TokenNameIdentifier
.	TokenNameDOT
concatenate	TokenNameIdentifier
(	TokenNameLPAREN
nat	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Filter	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
gn	TokenNameIdentifier
instanceof	TokenNameinstanceof
CompositeGraphicsNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CompositeGraphicsNode	TokenNameIdentifier
cgn	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CompositeGraphicsNode	TokenNameIdentifier
)	TokenNameRPAREN
gn	TokenNameIdentifier
;	TokenNameSEMICOLON
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
cgn	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
GraphicsNode	TokenNameIdentifier
childGN	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
GraphicsNode	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
r2d	TokenNameIdentifier
=	TokenNameEQUAL
getNodeDirtyRegion	TokenNameIdentifier
(	TokenNameLPAREN
childGN	TokenNameIdentifier
,	TokenNameCOMMA
at	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
r2d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Shape	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
.	TokenNameDOT
createTransformedShape	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NULL_RECT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
r2d	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
ret	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
r2d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
ret	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Rectangle2D	TokenNameIdentifier
)	TokenNameRPAREN
fromBounds	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
gnWRef	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
ret	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NULL_RECT	TokenNameIdentifier
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ret	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
ret	TokenNameIdentifier
=	TokenNameEQUAL
at	TokenNameIdentifier
.	TokenNameDOT
createTransformedShape	TokenNameIdentifier
(	TokenNameLPAREN
ret	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getBounds2D	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Rectangle2D	TokenNameIdentifier
getNodeDirtyRegion	TokenNameIdentifier
(	TokenNameLPAREN
GraphicsNode	TokenNameIdentifier
gn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getNodeDirtyRegion	TokenNameIdentifier
(	TokenNameLPAREN
gn	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
changeStarted	TokenNameIdentifier
(	TokenNameLPAREN
GraphicsNodeChangeEvent	TokenNameIdentifier
gnce	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
GraphicsNode	TokenNameIdentifier
gn	TokenNameIdentifier
=	TokenNameEQUAL
gnce	TokenNameIdentifier
.	TokenNameDOT
getGraphicsNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
WeakReference	TokenNameIdentifier
gnWRef	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getWeakReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
doPut	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dirtyNodes	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
dirtyNodes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doPut	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
dirtyNodes	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
gnWRef	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
doPut	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
doPut	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
AffineTransform	TokenNameIdentifier
at	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
at	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
at	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AffineTransform	TokenNameIdentifier
)	TokenNameRPAREN
at	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
at	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dirtyNodes	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
gnWRef	TokenNameIdentifier
,	TokenNameCOMMA
at	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
GraphicsNode	TokenNameIdentifier
chngSrc	TokenNameIdentifier
=	TokenNameEQUAL
gnce	TokenNameIdentifier
.	TokenNameDOT
getChangeSrc	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Rectangle2D	TokenNameIdentifier
rgn	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
chngSrc	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
Rectangle2D	TokenNameIdentifier
drgn	TokenNameIdentifier
=	TokenNameEQUAL
getNodeDirtyRegion	TokenNameIdentifier
(	TokenNameLPAREN
chngSrc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
drgn	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
rgn	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ChngSrcRect	TokenNameIdentifier
(	TokenNameLPAREN
drgn	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
rgn	TokenNameIdentifier
=	TokenNameEQUAL
gn	TokenNameIdentifier
.	TokenNameDOT
getBounds	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Rectangle2D	TokenNameIdentifier
r2d	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Rectangle2D	TokenNameIdentifier
)	TokenNameRPAREN
fromBounds	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
gnWRef	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
rgn	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
r2d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
r2d	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
NULL_RECT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
r2d	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
rgn	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
r2d	TokenNameIdentifier
=	TokenNameEQUAL
rgn	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
r2d	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
r2d	TokenNameIdentifier
=	TokenNameEQUAL
NULL_RECT	TokenNameIdentifier
;	TokenNameSEMICOLON
fromBounds	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
gnWRef	TokenNameIdentifier
,	TokenNameCOMMA
r2d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
class	TokenNameclass
ChngSrcRect	TokenNameIdentifier
extends	TokenNameextends
Rectangle2D	TokenNameIdentifier
.	TokenNameDOT
Float	TokenNameIdentifier
{	TokenNameLBRACE
ChngSrcRect	TokenNameIdentifier
(	TokenNameLPAREN
Rectangle2D	TokenNameIdentifier
r2d	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
r2d	TokenNameIdentifier
.	TokenNameDOT
getX	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
r2d	TokenNameIdentifier
.	TokenNameDOT
getY	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
r2d	TokenNameIdentifier
.	TokenNameDOT
getWidth	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
(	TokenNameLPAREN
float	TokenNamefloat
)	TokenNameRPAREN
r2d	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
dirtyNodes	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
