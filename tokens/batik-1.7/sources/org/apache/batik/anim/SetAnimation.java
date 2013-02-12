package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
.	TokenNameDOT
values	TokenNameIdentifier
.	TokenNameDOT
AnimatableValue	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
.	TokenNameDOT
timing	TokenNameIdentifier
.	TokenNameDOT
TimedElement	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
.	TokenNameDOT
AnimatableElement	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SetAnimation	TokenNameIdentifier
extends	TokenNameextends
AbstractAnimation	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
AnimatableValue	TokenNameIdentifier
to	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SetAnimation	TokenNameIdentifier
(	TokenNameLPAREN
TimedElement	TokenNameIdentifier
timedElement	TokenNameIdentifier
,	TokenNameCOMMA
AnimatableElement	TokenNameIdentifier
animatableElement	TokenNameIdentifier
,	TokenNameCOMMA
AnimatableValue	TokenNameIdentifier
to	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
timedElement	TokenNameIdentifier
,	TokenNameCOMMA
animatableElement	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
to	TokenNameIdentifier
=	TokenNameEQUAL
to	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
sampledAt	TokenNameIdentifier
(	TokenNameLPAREN
float	TokenNamefloat
simpleTime	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
simpleDur	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
repeatIteration	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
value	TokenNameIdentifier
=	TokenNameEQUAL
to	TokenNameIdentifier
;	TokenNameSEMICOLON
markDirty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
sampledLastValue	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
repeatIteration	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
value	TokenNameIdentifier
=	TokenNameEQUAL
to	TokenNameIdentifier
;	TokenNameSEMICOLON
markDirty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE