package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Constructor	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ReflectWrapper	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Object	TokenNameIdentifier
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ReflectWrapper	TokenNameIdentifier
(	TokenNameLPAREN
ClassLoader	TokenNameIdentifier
loader	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
clazz	TokenNameIdentifier
;	TokenNameSEMICOLON
clazz	TokenNameIdentifier
=	TokenNameEQUAL
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
loader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Constructor	TokenNameIdentifier
constructor	TokenNameIdentifier
;	TokenNameSEMICOLON
constructor	TokenNameIdentifier
=	TokenNameEQUAL
clazz	TokenNameIdentifier
.	TokenNameDOT
getConstructor	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Class	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
obj	TokenNameIdentifier
=	TokenNameEQUAL
constructor	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
t	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ReflectUtil	TokenNameIdentifier
.	TokenNameDOT
throwBuildException	TokenNameIdentifier
(	TokenNameLPAREN
t	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
ReflectWrapper	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
obj	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
obj	TokenNameIdentifier
=	TokenNameEQUAL
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getObject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
obj	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
invoke	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
methodName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ReflectUtil	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
obj	TokenNameIdentifier
,	TokenNameCOMMA
methodName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
invoke	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
methodName	TokenNameIdentifier
,	TokenNameCOMMA
Class	TokenNameIdentifier
argType	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
arg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ReflectUtil	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
obj	TokenNameIdentifier
,	TokenNameCOMMA
methodName	TokenNameIdentifier
,	TokenNameCOMMA
argType	TokenNameIdentifier
,	TokenNameCOMMA
arg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
invoke	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
methodName	TokenNameIdentifier
,	TokenNameCOMMA
Class	TokenNameIdentifier
argType1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
arg1	TokenNameIdentifier
,	TokenNameCOMMA
Class	TokenNameIdentifier
argType2	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
arg2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ReflectUtil	TokenNameIdentifier
.	TokenNameDOT
invoke	TokenNameIdentifier
(	TokenNameLPAREN
obj	TokenNameIdentifier
,	TokenNameCOMMA
methodName	TokenNameIdentifier
,	TokenNameCOMMA
argType1	TokenNameIdentifier
,	TokenNameCOMMA
arg1	TokenNameIdentifier
,	TokenNameCOMMA
argType2	TokenNameIdentifier
,	TokenNameCOMMA
arg2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE