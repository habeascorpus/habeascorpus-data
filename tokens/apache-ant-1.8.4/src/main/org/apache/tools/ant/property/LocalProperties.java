package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
property	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
PropertyHelper	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Project	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
MagicNames	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LocalProperties	TokenNameIdentifier
extends	TokenNameextends
InheritableThreadLocal	TokenNameIdentifier
implements	TokenNameimplements
PropertyHelper	TokenNameIdentifier
.	TokenNameDOT
PropertyEvaluator	TokenNameIdentifier
,	TokenNameCOMMA
PropertyHelper	TokenNameIdentifier
.	TokenNameDOT
PropertySetter	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
synchronized	TokenNamesynchronized
LocalProperties	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
Project	TokenNameIdentifier
project	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LocalProperties	TokenNameIdentifier
l	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
LocalProperties	TokenNameIdentifier
)	TokenNameRPAREN
project	TokenNameIdentifier
.	TokenNameDOT
getReference	TokenNameIdentifier
(	TokenNameLPAREN
MagicNames	TokenNameIdentifier
.	TokenNameDOT
REFID_LOCAL_PROPERTIES	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
l	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
l	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LocalProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
addReference	TokenNameIdentifier
(	TokenNameLPAREN
MagicNames	TokenNameIdentifier
.	TokenNameDOT
REFID_LOCAL_PROPERTIES	TokenNameIdentifier
,	TokenNameCOMMA
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PropertyHelper	TokenNameIdentifier
.	TokenNameDOT
getPropertyHelper	TokenNameIdentifier
(	TokenNameLPAREN
project	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
l	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
l	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
LocalProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
synchronized	TokenNamesynchronized
Object	TokenNameIdentifier
initialValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
LocalPropertyStack	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
LocalPropertyStack	TokenNameIdentifier
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
LocalPropertyStack	TokenNameIdentifier
)	TokenNameRPAREN
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addLocal	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
property	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
addLocal	TokenNameIdentifier
(	TokenNameLPAREN
property	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
enterScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
enterScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
exitScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
exitScope	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
set	TokenNameIdentifier
(	TokenNameLPAREN
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
evaluate	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
property	TokenNameIdentifier
,	TokenNameCOMMA
PropertyHelper	TokenNameIdentifier
helper	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
evaluate	TokenNameIdentifier
(	TokenNameLPAREN
property	TokenNameIdentifier
,	TokenNameCOMMA
helper	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
setNew	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
property	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
PropertyHelper	TokenNameIdentifier
propertyHelper	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setNew	TokenNameIdentifier
(	TokenNameLPAREN
property	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
propertyHelper	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
set	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
property	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
PropertyHelper	TokenNameIdentifier
propertyHelper	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
current	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
property	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
propertyHelper	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE