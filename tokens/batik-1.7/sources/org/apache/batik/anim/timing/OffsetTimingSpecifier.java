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
public	TokenNamepublic
class	TokenNameclass
OffsetTimingSpecifier	TokenNameIdentifier
extends	TokenNameextends
TimingSpecifier	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
float	TokenNamefloat
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
OffsetTimingSpecifier	TokenNameIdentifier
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
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
offset	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
offset	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
"+"	TokenNameStringLiteral
:	TokenNameCOLON
""	TokenNameStringLiteral
)	TokenNameRPAREN
+	TokenNamePLUS
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
initialize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
InstanceTime	TokenNameIdentifier
instance	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
InstanceTime	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
owner	TokenNameIdentifier
.	TokenNameDOT
addInstanceTime	TokenNameIdentifier
(	TokenNameLPAREN
instance	TokenNameIdentifier
,	TokenNameCOMMA
isBegin	TokenNameIdentifier
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
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
