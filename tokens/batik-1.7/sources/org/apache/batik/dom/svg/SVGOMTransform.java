package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DOMException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
svg	TokenNameIdentifier
.	TokenNameDOT
SVGMatrix	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SVGOMTransform	TokenNameIdentifier
extends	TokenNameextends
AbstractSVGTransform	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
SVGOMTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
affineTransform	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
AffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
SVGMatrix	TokenNameIdentifier
createMatrix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
AbstractSVGMatrix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
protected	TokenNameprotected
AffineTransform	TokenNameIdentifier
getAffineTransform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
SVGOMTransform	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
.	TokenNameDOT
affineTransform	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setA	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
a	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
SVGOMTransform	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
SVG_TRANSFORM_MATRIX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
setA	TokenNameIdentifier
(	TokenNameLPAREN
a	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setB	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
b	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
SVGOMTransform	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
SVG_TRANSFORM_MATRIX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
setB	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setC	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
c	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
SVGOMTransform	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
SVG_TRANSFORM_MATRIX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
setC	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setD	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
d	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
SVGOMTransform	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
SVG_TRANSFORM_MATRIX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
setD	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setE	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
e	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
SVGOMTransform	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
SVG_TRANSFORM_MATRIX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
setE	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setF	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
f	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
DOMException	TokenNameIdentifier
{	TokenNameLBRACE
SVGOMTransform	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
.	TokenNameDOT
setType	TokenNameIdentifier
(	TokenNameLPAREN
SVG_TRANSFORM_MATRIX	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
setF	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
