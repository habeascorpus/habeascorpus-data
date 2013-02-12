package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
MutableAttrListImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
QueuedEvents	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
int	TokenNameint
m_eventCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
m_docPending	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
m_docEnded	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
m_elemIsPending	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
m_elemIsEnded	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
protected	TokenNameprotected
MutableAttrListImpl	TokenNameIdentifier
m_attributes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MutableAttrListImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
m_nsDeclsHaveBeenAdded	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
m_name	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
m_url	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
m_localName	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Vector	TokenNameIdentifier
m_namespaces	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
void	TokenNamevoid
reInitEvents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
pushDocumentEvent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reInitEvents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
pushDocumentEvent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
m_docPending	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
m_eventCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
popEvent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
m_elemIsPending	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
m_attributes	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_nsDeclsHaveBeenAdded	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
m_name	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
m_url	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
m_localName	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
m_namespaces	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
m_eventCount	TokenNameIdentifier
--	TokenNameMINUS_MINUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
Serializer	TokenNameIdentifier
m_serializer	TokenNameIdentifier
;	TokenNameSEMICOLON
void	TokenNamevoid
setSerializer	TokenNameIdentifier
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
Serializer	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_serializer	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
Serializer	TokenNameIdentifier
getSerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_serializer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
