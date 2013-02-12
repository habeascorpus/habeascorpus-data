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
renderable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
image	TokenNameIdentifier
.	TokenNameDOT
RenderedImage	TokenNameIdentifier
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
RenderContext	TokenNameIdentifier
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
ComponentTransferFunction	TokenNameIdentifier
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
DiscreteTransfer	TokenNameIdentifier
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
GammaTransfer	TokenNameIdentifier
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
IdentityTransfer	TokenNameIdentifier
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
LinearTransfer	TokenNameIdentifier
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
TableTransfer	TokenNameIdentifier
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
TransferFunction	TokenNameIdentifier
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
rendered	TokenNameIdentifier
.	TokenNameDOT
ComponentTransferRed	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ComponentTransferRable8Bit	TokenNameIdentifier
extends	TokenNameextends
AbstractColorInterpolationRable	TokenNameIdentifier
implements	TokenNameimplements
ComponentTransferRable	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
ALPHA	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
RED	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
GREEN	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
BLUE	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
ComponentTransferFunction	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
functions	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ComponentTransferFunction	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
TransferFunction	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
txfFunc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TransferFunction	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
public	TokenNamepublic
ComponentTransferRable8Bit	TokenNameIdentifier
(	TokenNameLPAREN
Filter	TokenNameIdentifier
src	TokenNameIdentifier
,	TokenNameCOMMA
ComponentTransferFunction	TokenNameIdentifier
alphaFunction	TokenNameIdentifier
,	TokenNameCOMMA
ComponentTransferFunction	TokenNameIdentifier
redFunction	TokenNameIdentifier
,	TokenNameCOMMA
ComponentTransferFunction	TokenNameIdentifier
greenFunction	TokenNameIdentifier
,	TokenNameCOMMA
ComponentTransferFunction	TokenNameIdentifier
blueFunction	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
src	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setAlphaFunction	TokenNameIdentifier
(	TokenNameLPAREN
alphaFunction	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setRedFunction	TokenNameIdentifier
(	TokenNameLPAREN
redFunction	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setGreenFunction	TokenNameIdentifier
(	TokenNameLPAREN
greenFunction	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setBlueFunction	TokenNameIdentifier
(	TokenNameLPAREN
blueFunction	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setSource	TokenNameIdentifier
(	TokenNameLPAREN
Filter	TokenNameIdentifier
src	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
init	TokenNameIdentifier
(	TokenNameLPAREN
src	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Filter	TokenNameIdentifier
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Filter	TokenNameIdentifier
)	TokenNameRPAREN
getSources	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ComponentTransferFunction	TokenNameIdentifier
getAlphaFunction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
functions	TokenNameIdentifier
[	TokenNameLBRACKET
ALPHA	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setAlphaFunction	TokenNameIdentifier
(	TokenNameLPAREN
ComponentTransferFunction	TokenNameIdentifier
alphaFunction	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
touch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
functions	TokenNameIdentifier
[	TokenNameLBRACKET
ALPHA	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
alphaFunction	TokenNameIdentifier
;	TokenNameSEMICOLON
txfFunc	TokenNameIdentifier
[	TokenNameLBRACKET
ALPHA	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ComponentTransferFunction	TokenNameIdentifier
getRedFunction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
functions	TokenNameIdentifier
[	TokenNameLBRACKET
RED	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setRedFunction	TokenNameIdentifier
(	TokenNameLPAREN
ComponentTransferFunction	TokenNameIdentifier
redFunction	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
touch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
functions	TokenNameIdentifier
[	TokenNameLBRACKET
RED	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
redFunction	TokenNameIdentifier
;	TokenNameSEMICOLON
txfFunc	TokenNameIdentifier
[	TokenNameLBRACKET
RED	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ComponentTransferFunction	TokenNameIdentifier
getGreenFunction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
functions	TokenNameIdentifier
[	TokenNameLBRACKET
GREEN	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setGreenFunction	TokenNameIdentifier
(	TokenNameLPAREN
ComponentTransferFunction	TokenNameIdentifier
greenFunction	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
touch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
functions	TokenNameIdentifier
[	TokenNameLBRACKET
GREEN	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
greenFunction	TokenNameIdentifier
;	TokenNameSEMICOLON
txfFunc	TokenNameIdentifier
[	TokenNameLBRACKET
GREEN	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ComponentTransferFunction	TokenNameIdentifier
getBlueFunction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
functions	TokenNameIdentifier
[	TokenNameLBRACKET
BLUE	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setBlueFunction	TokenNameIdentifier
(	TokenNameLPAREN
ComponentTransferFunction	TokenNameIdentifier
blueFunction	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
touch	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
functions	TokenNameIdentifier
[	TokenNameLBRACKET
BLUE	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
blueFunction	TokenNameIdentifier
;	TokenNameSEMICOLON
txfFunc	TokenNameIdentifier
[	TokenNameLBRACKET
BLUE	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RenderedImage	TokenNameIdentifier
createRendering	TokenNameIdentifier
(	TokenNameLPAREN
RenderContext	TokenNameIdentifier
rc	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
RenderedImage	TokenNameIdentifier
srcRI	TokenNameIdentifier
=	TokenNameEQUAL
getSource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
createRendering	TokenNameIdentifier
(	TokenNameLPAREN
rc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
srcRI	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
ComponentTransferRed	TokenNameIdentifier
(	TokenNameLPAREN
convertSourceCS	TokenNameIdentifier
(	TokenNameLPAREN
srcRI	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
getTransferFunctions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
rc	TokenNameIdentifier
.	TokenNameDOT
getRenderingHints	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
TransferFunction	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getTransferFunctions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
TransferFunction	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
txfFunc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TransferFunction	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
txfFunc	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
txfFunc	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ComponentTransferFunction	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
functions	TokenNameIdentifier
;	TokenNameSEMICOLON
functions	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ComponentTransferFunction	TokenNameIdentifier
[	TokenNameLBRACKET
4	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
functions	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
functions	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
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
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
txfFunc	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
txfFunc	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
getTransferFunction	TokenNameIdentifier
(	TokenNameLPAREN
functions	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
functions	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
functions	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
functions	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
txfFunc	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
txfFunc	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
txfFunc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
TransferFunction	TokenNameIdentifier
getTransferFunction	TokenNameIdentifier
(	TokenNameLPAREN
ComponentTransferFunction	TokenNameIdentifier
function	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TransferFunction	TokenNameIdentifier
txfFunc	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
function	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
txfFunc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IdentityTransfer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
function	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
ComponentTransferFunction	TokenNameIdentifier
.	TokenNameDOT
IDENTITY	TokenNameIdentifier
:	TokenNameCOLON
txfFunc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IdentityTransfer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
ComponentTransferFunction	TokenNameIdentifier
.	TokenNameDOT
TABLE	TokenNameIdentifier
:	TokenNameCOLON
txfFunc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TableTransfer	TokenNameIdentifier
(	TokenNameLPAREN
tableFloatToInt	TokenNameIdentifier
(	TokenNameLPAREN
function	TokenNameIdentifier
.	TokenNameDOT
getTableValues	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
ComponentTransferFunction	TokenNameIdentifier
.	TokenNameDOT
DISCRETE	TokenNameIdentifier
:	TokenNameCOLON
txfFunc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DiscreteTransfer	TokenNameIdentifier
(	TokenNameLPAREN
tableFloatToInt	TokenNameIdentifier
(	TokenNameLPAREN
function	TokenNameIdentifier
.	TokenNameDOT
getTableValues	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
ComponentTransferFunction	TokenNameIdentifier
.	TokenNameDOT
LINEAR	TokenNameIdentifier
:	TokenNameCOLON
txfFunc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LinearTransfer	TokenNameIdentifier
(	TokenNameLPAREN
function	TokenNameIdentifier
.	TokenNameDOT
getSlope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
function	TokenNameIdentifier
.	TokenNameDOT
getIntercept	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
ComponentTransferFunction	TokenNameIdentifier
.	TokenNameDOT
GAMMA	TokenNameIdentifier
:	TokenNameCOLON
txfFunc	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GammaTransfer	TokenNameIdentifier
(	TokenNameLPAREN
function	TokenNameIdentifier
.	TokenNameDOT
getAmplitude	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
function	TokenNameIdentifier
.	TokenNameDOT
getExponent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
function	TokenNameIdentifier
.	TokenNameDOT
getOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
Error	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
txfFunc	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
tableFloatToInt	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
[	TokenNameLBRACKET
]	TokenNameRBRACKET
tableValues	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
values	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
tableValues	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
]	TokenNameRBRACKET
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
tableValues	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
values	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
tableValues	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
*	TokenNameMULTIPLY
255f	TokenNameFloatingPointLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
values	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE