package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
anim	TokenNameIdentifier
.	TokenNameDOT
timing	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
events	TokenNameIdentifier
.	TokenNameDOT
Event	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
EventLikeTimingSpecifier	TokenNameIdentifier
extends	TokenNameextends
OffsetTimingSpecifier	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
EventLikeTimingSpecifier	TokenNameIdentifier
(	TokenNameLPAREN
TimedElement	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isBegin	TokenNameIdentifier
,	TokenNameCOMMA
float	TokenNamefloat
offset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
owner	TokenNameIdentifier
,	TokenNameCOMMA
isBegin	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isEventCondition	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
abstract	TokenNameabstract
void	TokenNamevoid
resolve	TokenNameIdentifier
(	TokenNameLPAREN
Event	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
