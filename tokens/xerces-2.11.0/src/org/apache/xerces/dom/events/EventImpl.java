package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
events	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
events	TokenNameIdentifier
.	TokenNameDOT
EventTarget	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
EventImpl	TokenNameIdentifier
implements	TokenNameimplements
Event	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
String	TokenNameIdentifier
type	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
EventTarget	TokenNameIdentifier
target	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
EventTarget	TokenNameIdentifier
currentTarget	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
short	TokenNameshort
eventPhase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
initialized	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
,	TokenNameCOMMA
bubbles	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
,	TokenNameCOMMA
cancelable	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
stopPropagation	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
,	TokenNameCOMMA
preventDefault	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
protected	TokenNameprotected
long	TokenNamelong
timeStamp	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
initEvent	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
eventTypeArg	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
canBubbleArg	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
cancelableArg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
type	TokenNameIdentifier
=	TokenNameEQUAL
eventTypeArg	TokenNameIdentifier
;	TokenNameSEMICOLON
bubbles	TokenNameIdentifier
=	TokenNameEQUAL
canBubbleArg	TokenNameIdentifier
;	TokenNameSEMICOLON
cancelable	TokenNameIdentifier
=	TokenNameEQUAL
cancelableArg	TokenNameIdentifier
;	TokenNameSEMICOLON
initialized	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getBubbles	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
bubbles	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
getCancelable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
cancelable	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
EventTarget	TokenNameIdentifier
getCurrentTarget	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
currentTarget	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getEventPhase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
eventPhase	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
EventTarget	TokenNameIdentifier
getTarget	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
target	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
type	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getTimeStamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
timeStamp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
stopPropagation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
stopPropagation	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
preventDefault	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
preventDefault	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE